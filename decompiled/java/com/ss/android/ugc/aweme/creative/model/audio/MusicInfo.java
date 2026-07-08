package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes15.dex */
public final class MusicInfo implements Parcelable {
    public static final Parcelable.Creator<MusicInfo> CREATOR = new Parcelable.Creator<MusicInfo>() { // from class: X.0XkC
        @Override // android.os.Parcelable.Creator
        public final MusicInfo createFromParcel(Parcel parcel) {
            return new MusicInfo(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicInfo[] newArray(int i) {
            return new MusicInfo[i];
        }
    };

    @C040H
    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C040H
    @C09CT("name")
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
    }

    public MusicInfo() {
        this(0L, "");
    }

    public MusicInfo(long j, String str) {
        this.id = j;
        this.name = str;
    }
}
