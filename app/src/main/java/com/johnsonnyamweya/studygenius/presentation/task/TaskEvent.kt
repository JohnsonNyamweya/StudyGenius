package com.johnsonnyamweya.studygenius.presentation.task

import com.johnsonnyamweya.studygenius.domain.model.Subject
import com.johnsonnyamweya.studygenius.util.Priority

sealed class TaskEvent {
    data class OnTitleChange(val title: String): TaskEvent()
    data class OnDescriptionChange(val description: String): TaskEvent()
    data class OnDateChange(val millis: Long?): TaskEvent()
    data class OnPriorityChange(val priority: Priority): TaskEvent()
    data class OnRelatedSubjectSelect(val subject: Subject): TaskEvent()
    data object OnIsCompleteChange: TaskEvent()
    data object SaveTask: TaskEvent()
    data object DeleteTask: TaskEvent()
}