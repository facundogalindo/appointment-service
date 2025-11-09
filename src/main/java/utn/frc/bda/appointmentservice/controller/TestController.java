package utn.frc.bda.appointmentservice.controller;

import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/appointments/prueba/")
public class TestController {

    @PostMapping("/test")
    public String createTestAppointment(HttpServletRequest request) {
        String email = request.getHeader("X-User-Email");
        if (email == null) {
            return "❌ No se recibió el email del usuario (no pasó por el Gateway)";
        }
        return "✅ Turno creado para " + email;
    }
}