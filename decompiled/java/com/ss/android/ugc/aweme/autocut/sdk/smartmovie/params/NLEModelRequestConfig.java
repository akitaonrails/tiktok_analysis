package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.params;

import X.C09CT;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ImageInfoList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NLEModelRequestConfig {

    @C09CT("cache_effect_list")
    public List<String> cacheEffectList;

    @C09CT("image_info_list")
    public List<ImageInfoList> imageInfoList;

    @C09CT("is_first_music")
    public boolean isFirstMusic;

    @C09CT("music_id")
    public String musicId;

    @C09CT("return_movie_config")
    public boolean returnMovieConfig;

    @C09CT("return_nle_config")
    public boolean returnNleConfig;

    @C09CT("task_id")
    public String taskId;

    @C09CT("use_resourceid")
    public boolean useResourceId;

    public NLEModelRequestConfig() {
        this("", "", new ArrayList(), new ArrayList(), true, true, false, false);
    }

    public final boolean isFirstMusic() {
        return this.isFirstMusic;
    }

    public final void setCacheEffectList(List<String> list) {
        this.cacheEffectList = list;
    }

    public final void setFirstMusic(boolean z) {
        this.isFirstMusic = z;
    }

    public final void setImageInfoList(List<ImageInfoList> list) {
        this.imageInfoList = list;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setReturnMovieConfig(boolean z) {
        this.returnMovieConfig = z;
    }

    public final void setReturnNleConfig(boolean z) {
        this.returnNleConfig = z;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public final void setUseResourceId(boolean z) {
        this.useResourceId = z;
    }

    public NLEModelRequestConfig(String str, String str2, List<ImageInfoList> list, List<String> list2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.taskId = str;
        this.musicId = str2;
        this.imageInfoList = list;
        this.cacheEffectList = list2;
        this.returnNleConfig = z;
        this.returnMovieConfig = z2;
        this.isFirstMusic = z3;
        this.useResourceId = z4;
    }
}
