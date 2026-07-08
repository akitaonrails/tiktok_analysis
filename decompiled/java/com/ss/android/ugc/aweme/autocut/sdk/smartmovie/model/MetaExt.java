package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class MetaExt {
    public long createTime;
    public long duration;
    public String fileUriPath;
    public long frameTimeStamp;
    public boolean hasAudio;
    public int height;
    public List<String> includes;
    public boolean isVideo;
    public String name;
    public String path;
    public int rotation;
    public int width;

    public MetaExt() {
        this(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
    }

    public final MetaExt copy(int i, List<String> list, String str, String str2, String str3, int i2, long j, long j2, int i3, boolean z, long j3, boolean z2) {
        return new MetaExt(i, list, str, str2, str3, i2, j, j2, i3, z, j3, z2);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFileUriPath(String str) {
        this.fileUriPath = str;
    }

    public final void setFrameTimeStamp(long j) {
        this.frameTimeStamp = j;
    }

    public final void setHasAudio(boolean z) {
        this.hasAudio = z;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setIncludes(List<String> list) {
        this.includes = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public MetaExt(int i, List<String> list, String str, String str2, String str3, int i2, long j, long j2, int i3, boolean z, long j3, boolean z2) {
        this.height = i;
        this.includes = list;
        this.name = str;
        this.path = str2;
        this.fileUriPath = str3;
        this.rotation = i2;
        this.frameTimeStamp = j;
        this.createTime = j2;
        this.width = i3;
        this.isVideo = z;
        this.duration = j3;
        this.hasAudio = z2;
    }

    public MetaExt(int i, List list, String str, String str2, String str3, int i2, long j, long j2, int i3, boolean z, long j3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? C13BV.INSTANCE : list, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) == 0 ? str3 : "", (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? 0L : j2, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? false : z, (i4 & 1024) == 0 ? j3 : 0L, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2);
    }
}
