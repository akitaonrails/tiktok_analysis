package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateMusicInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<TemplateMusicInfo> CREATOR = new Creator();

    @C09CT("backup_music_url")
    public final String backup_music_url;

    public static final class Creator implements Parcelable.Creator<TemplateMusicInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateMusicInfo createFromParcel(Parcel parcel) {
            return new TemplateMusicInfo(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateMusicInfo[] newArray(int i) {
            return new TemplateMusicInfo[i];
        }
    }

    public final TemplateMusicInfo copy(String str) {
        return new TemplateMusicInfo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemplateMusicInfo) && Intrinsics.LJFF(this.backup_music_url, ((TemplateMusicInfo) obj).backup_music_url);
    }

    public int hashCode() {
        String str = this.backup_music_url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateMusicInfo(backup_music_url=");
        sbLIZ.append(this.backup_music_url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.backup_music_url);
    }

    public final String getBackup_music_url() {
        return this.backup_music_url;
    }

    public TemplateMusicInfo(String str) {
        this.backup_music_url = str;
    }
}
