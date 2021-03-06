package com.silverlotus.kmvvm.room.dao

import android.arch.paging.DataSource
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.silverlotus.kmvvm.room.entity.MangaEntity

/**
 * Created by Gian Patrick Quintana on 2/21/2018.
 */
@Dao
interface MangaDao {

    @Query("SELECT * FROM manga_list LIMIT :max")
    fun getMangaList(max: Int): DataSource.Factory<Int, MangaEntity>

    @Insert(onConflict = REPLACE)
    fun insertManga(mangaEntity: MangaEntity)

    @Insert(onConflict = REPLACE)
    fun updateMangaList(list: List<MangaEntity>)

    @Update(onConflict = REPLACE)
    fun updateManga(mangaEntity: MangaEntity)
}