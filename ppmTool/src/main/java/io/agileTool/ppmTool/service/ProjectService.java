package io.agileTool.ppmTool.service;

import io.agileTool.ppmTool.repositories.ProjectRepository;
import io.agileTool.ppmTool.Domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project) {
        //Logic to save
        return projectRepository.save(project);
    }


}
