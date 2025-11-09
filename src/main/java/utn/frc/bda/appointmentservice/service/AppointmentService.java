package utn.frc.bda.appointmentservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utn.frc.bda.appointmentservice.model.Appointment;
import utn.frc.bda.appointmentservice.repository.AppointmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public List<Appointment> getAppointmentsByUser(String email) {
        return appointmentRepository.findByUserEmail(email);
    }
}
