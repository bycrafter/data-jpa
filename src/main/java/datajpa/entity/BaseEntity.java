package datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

public class BaseEntity {
    @Id
    @Column(name = "id")
    @UuidGenerator
    private String id;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String createUserId;
    private String updateUserId;
}
