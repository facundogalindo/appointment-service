package utn.frc.bda.appointmentservice.service;

import org.springframework.stereotype.Service;
import utn.frc.bda.appointmentservice.model.Appointment;
import utn.frc.bda.appointmentservice.repository.AppointmentRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public List<Appointment> getAppointmentsByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public Optional<Appointment> getAppointment(Long id) {
        return repository.findById(id);
    }

    public Appointment create(Appointment appointment) {
        return repository.save(appointment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
