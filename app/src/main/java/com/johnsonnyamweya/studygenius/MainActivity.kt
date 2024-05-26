package com.johnsonnyamweya.studygenius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.johnsonnyamweya.studygenius.domain.model.Session
import com.johnsonnyamweya.studygenius.domain.model.Subject
import com.johnsonnyamweya.studygenius.domain.model.Task
import com.johnsonnyamweya.studygenius.presentation.NavGraphs
import com.johnsonnyamweya.studygenius.ui.theme.StudyGeniusTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyGeniusTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}


val subjects = listOf(
    Subject(name = "Maths", goalHours = 10f, colors = Subject.subjectCardColors[0].map { it.toArgb() }, subjectId = 0),
    Subject(name = "English", goalHours = 10f, colors = Subject.subjectCardColors[1].map { it.toArgb() }, subjectId = 0),
    Subject(name = "Kiswahili", goalHours = 10f, colors = Subject.subjectCardColors[2].map { it.toArgb() }, subjectId = 0),
    Subject(name = "Physics", goalHours = 10f, colors = Subject.subjectCardColors[3].map { it.toArgb() }, subjectId = 0),
    Subject(name = "Computer", goalHours = 10f, colors = Subject.subjectCardColors[4].map { it.toArgb() }, subjectId = 0)
)
val tasks = listOf(
    Task(
        title = "Read communication skills books.",
        description = "",
        dueDate = 0L,
        priority = 0,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Do Touch typing.",
        description = "",
        dueDate = 0L,
        priority = 1,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Go exercise.",
        description = "",
        dueDate = 0L,
        priority = 1,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Learn Data Structures and Algorithms.",
        description = "",
        dueDate = 0L,
        priority = 2,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Write Kotlin code.",
        description = "",
        dueDate = 0L,
        priority = 2,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    )
)
val sessions = listOf(
    Session(
        sessionSubjectId = 0,
        relatedToSubject = "English",
        date = 0L,
        duration = 2,
        sessionId = 0
    ),
    Session(
        sessionSubjectId = 0,
        relatedToSubject = "Physics",
        date = 0L,
        duration = 2,
        sessionId = 0
    ), Session(
        sessionSubjectId = 0,
        relatedToSubject = "Computer",
        date = 0L,
        duration = 2,
        sessionId = 0
    ), Session(
        sessionSubjectId = 0,
        relatedToSubject = "Maths",
        date = 0L,
        duration = 2,
        sessionId = 0
    )
)
