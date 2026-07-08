package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SoundEffect implements Parcelable {
    public static final Parcelable.Creator<SoundEffect> CREATOR = new Parcelable.Creator<SoundEffect>() { // from class: X.0EVH
        @Override // android.os.Parcelable.Creator
        public final SoundEffect createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            long j = parcel.readLong();
            String string = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new SoundEffect(j, string, urlModel, i, i2, z, i3, i4, z2, string2, j2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final SoundEffect[] newArray(int i) {
            return new SoundEffect[i];
        }
    };

    @C09CT("audition_duration")
    public final int auditionDuration;

    @C09CT("collect_stat")
    public final int collectStatus;

    @C09CT("duration")
    public final int duration;

    @C09CT("file_duration")
    public long fileDuration;

    @InterfaceC2270908v5
    @C09CT("file_local_path")
    public String fileLocalPath;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("is_commerce_music")
    public final boolean isCommerceMusic;

    @C040H
    public boolean isLocalFileExist;

    @C09CT("title")
    public final String musicName;

    @C09CT("is_audio_url_with_cookie")
    public final boolean needSetCookie;

    @C09CT("play_url")
    public final UrlModel playUrl;

    @C09CT("shoot_duration")
    public final int shootDuration;

    public SoundEffect() {
        this(0L, null, null, 0, 0, false, 0, 0, false, "", 0L, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoundEffect)) {
            return false;
        }
        SoundEffect soundEffect = (SoundEffect) obj;
        return this.id == soundEffect.id && Intrinsics.LJFF(this.musicName, soundEffect.musicName) && Intrinsics.LJFF(this.playUrl, soundEffect.playUrl) && this.duration == soundEffect.duration && this.collectStatus == soundEffect.collectStatus && this.isCommerceMusic == soundEffect.isCommerceMusic && this.shootDuration == soundEffect.shootDuration && this.auditionDuration == soundEffect.auditionDuration && this.needSetCookie == soundEffect.needSetCookie && Intrinsics.LJFF(this.fileLocalPath, soundEffect.fileLocalPath) && this.fileDuration == soundEffect.fileDuration && this.isLocalFileExist == soundEffect.isLocalFileExist;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.id) * 31;
        String str = this.musicName;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.playUrl;
        return ((((((((((((((((((iHashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + this.duration) * 31) + this.collectStatus) * 31) + C786410Ut5.Z2(this.isCommerceMusic)) * 31) + this.shootDuration) * 31) + this.auditionDuration) * 31) + C786410Ut5.Z2(this.needSetCookie)) * 31) + this.fileLocalPath.hashCode()) * 31) + C786410Ut5.Y2(this.fileDuration)) * 31) + C786410Ut5.Z2(this.isLocalFileExist);
    }

    public final String toString() {
        return "SoundEffect(id=" + this.id + ", musicName=" + this.musicName + ", playUrl=" + this.playUrl + ", duration=" + this.duration + ", collectStatus=" + this.collectStatus + ", isCommerceMusic=" + this.isCommerceMusic + ", shootDuration=" + this.shootDuration + ", auditionDuration=" + this.auditionDuration + ", needSetCookie=" + this.needSetCookie + ", fileLocalPath=" + this.fileLocalPath + ", fileDuration=" + this.fileDuration + ", isLocalFileExist=" + this.isLocalFileExist + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.musicName);
        parcel.writeSerializable(this.playUrl);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.collectStatus);
        parcel.writeInt(this.isCommerceMusic ? 1 : 0);
        parcel.writeInt(this.shootDuration);
        parcel.writeInt(this.auditionDuration);
        parcel.writeInt(this.needSetCookie ? 1 : 0);
        parcel.writeString(this.fileLocalPath);
        parcel.writeLong(this.fileDuration);
        parcel.writeInt(this.isLocalFileExist ? 1 : 0);
    }

    public static SoundEffect LIZ(SoundEffect soundEffect) {
        long j = soundEffect.id;
        String str = soundEffect.musicName;
        UrlModel urlModel = soundEffect.playUrl;
        int i = soundEffect.duration;
        int i2 = soundEffect.collectStatus;
        boolean z = soundEffect.isCommerceMusic;
        int i3 = soundEffect.shootDuration;
        int i4 = soundEffect.auditionDuration;
        boolean z2 = soundEffect.needSetCookie;
        String str2 = soundEffect.fileLocalPath;
        long j2 = soundEffect.fileDuration;
        boolean z3 = soundEffect.isLocalFileExist;
        soundEffect.getClass();
        return new SoundEffect(j, str, urlModel, i, i2, z, i3, i4, z2, str2, j2, z3);
    }

    public SoundEffect(long j, String str, UrlModel urlModel, int i, int i2, boolean z, int i3, int i4, boolean z2, String str2, long j2, boolean z3) {
        this.id = j;
        this.musicName = str;
        this.playUrl = urlModel;
        this.duration = i;
        this.collectStatus = i2;
        this.isCommerceMusic = z;
        this.shootDuration = i3;
        this.auditionDuration = i4;
        this.needSetCookie = z2;
        this.fileLocalPath = str2;
        this.fileDuration = j2;
        this.isLocalFileExist = z3;
    }
}
