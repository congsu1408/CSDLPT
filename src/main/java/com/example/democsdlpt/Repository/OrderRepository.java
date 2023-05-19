package com.example.democsdlpt.Repository;
import com.example.democsdlpt.Model.tblOrder;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderRepository extends JpaRepository<tblOrder, Long> {

    }
