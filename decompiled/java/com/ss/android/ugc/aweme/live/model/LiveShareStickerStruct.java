package com.ss.android.ugc.aweme.live.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.model.LiveShareStickerStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveShareStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<LiveShareStickerStruct> CREATOR = new Parcelable.Creator<LiveShareStickerStruct>() { // from class: X.02mE
        @Override // android.os.Parcelable.Creator
        public final LiveShareStickerStruct createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new LiveShareStickerStruct(lValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveShareStickerStruct[] newArray(int i) {
            return new LiveShareStickerStruct[i];
        }
    };

    @C09CT("live_owner_name")
    public String liveOwnerName;

    @C09CT("room_id")
    public Long roomId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.roomId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.liveOwnerName);
    }

    public LiveShareStickerStruct() {
        this(0L, "");
    }

    public final String getLiveOwnerName() {
        return this.liveOwnerName;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final void setLiveOwnerName(String str) {
        this.liveOwnerName = str;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public LiveShareStickerStruct(Long l, String str) {
        this.roomId = l;
        this.liveOwnerName = str;
    }
}
