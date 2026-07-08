package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Background implements Serializable {

    @C09CT("background_type")
    public Integer backgroundType;

    @C09CT("music_info")
    public MusicInfo musicInfo;

    @C09CT("pic_url")
    public String picUrl;

    @C09CT("shader_view")
    public ShaderViewInfo shaderViewInfo;

    public Background() {
        this(null, null, "", null);
    }

    public final Integer getBackgroundType() {
        return this.backgroundType;
    }

    public final MusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public final ShaderViewInfo getShaderViewInfo() {
        return this.shaderViewInfo;
    }

    public final void setBackgroundType(Integer num) {
        this.backgroundType = num;
    }

    public final void setMusicInfo(MusicInfo musicInfo) {
        this.musicInfo = musicInfo;
    }

    public final void setPicUrl(String str) {
        this.picUrl = str;
    }

    public final void setShaderViewInfo(ShaderViewInfo shaderViewInfo) {
        this.shaderViewInfo = shaderViewInfo;
    }

    public Background(Integer num, MusicInfo musicInfo, String str, ShaderViewInfo shaderViewInfo) {
        this.backgroundType = num;
        this.musicInfo = musicInfo;
        this.picUrl = str;
        this.shaderViewInfo = shaderViewInfo;
    }
}
