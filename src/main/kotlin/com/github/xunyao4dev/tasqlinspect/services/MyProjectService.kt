package com.github.xunyao4dev.tasqlinspect.services

import com.intellij.openapi.project.Project
import com.github.xunyao4dev.tasqlinspect.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
