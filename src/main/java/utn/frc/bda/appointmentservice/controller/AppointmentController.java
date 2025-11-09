package utn.frc.bda.appointmentservice.controller;

import org.springframework.web.bind.annotation.*;
import utn.frc.bda.appointmentservice.model.Appointment;
import utn.frc.bda.appointmentservice.service.AppointmentService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Appointment> getAll() {
        return service.getAllAppointments();
    }

    @GetMapping("/user/{userId}")
    public List<Appointment> getByUser(@PathVariable Long userId) {
        return service.getAppointmentsByUser(userId);
    }

    @GetMapping("/{id}")
    public Optional<Appointment> getById(@PathVariable Long id) {
        return service.getAppointment(id);
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment) {
        return service.create(appointment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
