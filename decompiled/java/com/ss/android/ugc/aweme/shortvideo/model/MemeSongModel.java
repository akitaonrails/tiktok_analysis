package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class MemeSongModel implements Serializable {

    @C09CT("bg_image_url")
    public String bgImageUrl;

    @C09CT("has_consumed")
    public boolean hasConsumed;

    @C09CT("is_selected")
    public boolean isSelected;

    @C09CT("local_song_path")
    public String localSongPath;

    @C09CT("lyrics")
    public final List<String> lyrics;

    @C09CT("song_duration")
    public int songDuration;

    @C09CT("style")
    public final String style;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("timestamp_secs")
    public final List<List<Double>> timestampSecs;

    @C09CT("uri")
    public final String uri;

    public MemeSongModel() {
        this(null, null, null, null, null, null, null, false, false, 0, 1023, null);
    }

    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    public final boolean getHasConsumed() {
        return this.hasConsumed;
    }

    public final String getLocalSongPath() {
        return this.localSongPath;
    }

    public final List<String> getLyrics() {
        return this.lyrics;
    }

    public final int getSongDuration() {
        return this.songDuration;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final List<List<Double>> getTimestampSecs() {
        return this.timestampSecs;
    }

    public final String getUri() {
        return this.uri;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setBgImageUrl(String str) {
        this.bgImageUrl = str;
    }

    public final void setHasConsumed(boolean z) {
        this.hasConsumed = z;
    }

    public final void setLocalSongPath(String str) {
        this.localSongPath = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSongDuration(int i) {
        this.songDuration = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MemeSongModel(String str, String str2, String str3, List<String> list, List<? extends List<Double>> list2, String str4, String str5, boolean z, boolean z2, int i) {
        this.uri = str;
        this.style = str2;
        this.templateId = str3;
        this.lyrics = list;
        this.timestampSecs = list2;
        this.localSongPath = str4;
        this.bgImageUrl = str5;
        this.isSelected = z;
        this.hasConsumed = z2;
        this.songDuration = i;
    }

    public MemeSongModel(String str, String str2, String str3, List list, List list2, String str4, String str5, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? C13BV.INSTANCE : list2, (i2 & 32) != 0 ? null : str4, (i2 & 64) == 0 ? str5 : null, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) == 0 ? i : 0);
    }
}
