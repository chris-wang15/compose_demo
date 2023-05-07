package com.tools.practicecompose.feature.domain.use_case

import com.tools.practicecompose.feature.domain.model.NoteLevel
import com.tools.practicecompose.feature.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetLevelColorUseCase(
    private val repository: NoteRepository
) {
    fun invoke(): Flow<Map<Int, NoteLevel>> {
        return repository.getLevelColorMap()
    }
}