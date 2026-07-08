package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class C2PAInfo implements Serializable {

    @C09CT("aigc_src")
    public String aigcSrc;

    @C09CT("c2pa_extra_data")
    public String c2paExtraData;

    @C09CT("dedup_err")
    public String dedupErr;

    @C09CT("dedup_src")
    public String dedupSrc;

    @C09CT("first_aigc_src")
    public String firstAigcSrc;

    @C09CT("first_src")
    public String firstSrc;

    @C09CT("is_capcut")
    public boolean isCapcut;

    @C09CT("is_tiktok")
    public boolean isTiktok;

    @C09CT("last_aigc_src")
    public String lastAigcSrc;

    @C09CT("last_src")
    public String lastSrc;

    @C09CT("total_audio")
    public long totalAudio;

    @C09CT("total_err")
    public long totalErr;

    @C09CT("total_img")
    public long totalImg;

    @C09CT("total_src")
    public long totalSrc;

    @C09CT("total_vid")
    public long totalVid;

    @C09CT("upload_dur")
    public double uploadDur;

    public C2PAInfo() {
        this(null, null, null, null, null, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0.0d, null);
    }

    public final boolean isCapcut() {
        return this.isCapcut;
    }

    public final boolean isTiktok() {
        return this.isTiktok;
    }

    public C2PAInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, double d, String str8) {
        this.firstSrc = str;
        this.lastSrc = str2;
        this.dedupSrc = str3;
        this.firstAigcSrc = str4;
        this.lastAigcSrc = str5;
        this.dedupErr = str6;
        this.aigcSrc = str7;
        this.isTiktok = z;
        this.isCapcut = z2;
        this.totalSrc = j;
        this.totalErr = j2;
        this.totalImg = j3;
        this.totalVid = j4;
        this.totalAudio = j5;
        this.uploadDur = d;
        this.c2paExtraData = str8;
    }
}
