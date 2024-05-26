package com.johnsonnyamweya.studygenius.presentation.dashboard

import androidx.lifecycle.ViewModel
import com.johnsonnyamweya.studygenius.domain.repository.SubjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val subjectRepository: SubjectRepository
): ViewModel() {

}