package utn.frc.bda.appointmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.frc.bda.appointmentservice.model.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByUserEmail(String userEmail);
}
