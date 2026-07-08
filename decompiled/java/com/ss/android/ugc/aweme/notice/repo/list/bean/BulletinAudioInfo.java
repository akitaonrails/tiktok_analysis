package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BulletinAudioInfo {

    @C09CT("backup_url")
    public final String backupUrl;

    @C09CT("bitrate")
    public final long bitrate;

    @C09CT("duration")
    public final long duration;

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("format")
    public final String format;

    @C09CT("main_url")
    public final String mainUrl;

    @C09CT("vid")
    public final String vid;

    @C09CT("waveform")
    public final List<Float> waveform;

    public BulletinAudioInfo() {
        this("", "", "", 0L, "", 0L, 0L, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinAudioInfo)) {
            return false;
        }
        BulletinAudioInfo bulletinAudioInfo = (BulletinAudioInfo) obj;
        return Intrinsics.LJFF(this.vid, bulletinAudioInfo.vid) && Intrinsics.LJFF(this.mainUrl, bulletinAudioInfo.mainUrl) && Intrinsics.LJFF(this.backupUrl, bulletinAudioInfo.backupUrl) && this.expireTime == bulletinAudioInfo.expireTime && Intrinsics.LJFF(this.format, bulletinAudioInfo.format) && this.duration == bulletinAudioInfo.duration && this.bitrate == bulletinAudioInfo.bitrate && Intrinsics.LJFF(this.waveform, bulletinAudioInfo.waveform);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.vid.hashCode() * 31) + this.mainUrl.hashCode()) * 31) + this.backupUrl.hashCode()) * 31) + C786410Ut5.Y2(this.expireTime)) * 31) + this.format.hashCode()) * 31) + C786410Ut5.Y2(this.duration)) * 31) + C786410Ut5.Y2(this.bitrate)) * 31;
        List<Float> list = this.waveform;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinAudioInfo(vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", mainUrl=");
        sbLIZ.append(this.mainUrl);
        sbLIZ.append(", backupUrl=");
        sbLIZ.append(this.backupUrl);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", waveform=");
        sbLIZ.append(this.waveform);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinAudioInfo(String str, String str2, String str3, long j, String str4, long j2, long j3, List<Float> list) {
        this.vid = str;
        this.mainUrl = str2;
        this.backupUrl = str3;
        this.expireTime = j;
        this.format = str4;
        this.duration = j2;
        this.bitrate = j3;
        this.waveform = list;
    }
}
