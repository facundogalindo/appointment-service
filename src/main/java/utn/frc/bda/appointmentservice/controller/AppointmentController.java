package utn.frc.bda.appointmentservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import utn.frc.bda.appointmentservice.model.Appointment;
import utn.frc.bda.appointmentservice.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping("/test")
    public List<Appointment> getAppointments(@RequestHeader("X-User-Email") String email) {
        return appointmentService.getAppointmentsByUser(email);
    }

    // (opcional) Test rápido para validar comunicación
    @PostMapping("/test")
    public String test(@RequestHeader(value = "X-User-Email", required = false) String email) {
        return email != null ? "✅ Turno creado para " + email : "❌ Header faltante";
    }
}
