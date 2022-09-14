package com.example.ej7crudcors.application;



import com.example.ej7crudcors.dto.input.AsignaturaInputDTO;
import com.example.ej7crudcors.dto.output.AsignaturaOutputDTO;
import com.example.ej7crudcors.entity.Asignatura;

import java.util.List;

public interface AsignaturaService {
    public AsignaturaOutputDTO insertarAsignatura(AsignaturaInputDTO asignaturaDTO);
    public  AsignaturaOutputDTO editarAsignatura(String id, Asignatura asignatura);
    public void eliminarAsignatura(String id);
    public Asignatura buscarAsignaturaPorId(String id);
//    public List<AsignaturaOutputDTO> buscarAsignaturasPorName(String name);
    public List<Asignatura> dameAllAsignaturas() throws Exception;

    public void asociarAsignatura(String id_asignatura, String id_estudiante);
}
