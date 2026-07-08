package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicAndTimeModel implements Parcelable {
    public static final Parcelable.Creator<MusicAndTimeModel> CREATOR = new Parcelable.Creator<MusicAndTimeModel>() { // from class: X.0nXS
        @Override // android.os.Parcelable.Creator
        public final MusicAndTimeModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MusicAndTimeModel(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicAndTimeModel[] newArray(int i) {
            return new MusicAndTimeModel[i];
        }
    };

    @C09CT("musicID")
    public final String musicID;

    @C09CT("slow_motion_applied")
    public boolean slowMotionApplied;

    @C09CT("timeStamp")
    public final String timeStamp;

    public MusicAndTimeModel() {
        this(null, "", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAndTimeModel)) {
            return false;
        }
        MusicAndTimeModel musicAndTimeModel = (MusicAndTimeModel) obj;
        return Intrinsics.LJFF(this.musicID, musicAndTimeModel.musicID) && Intrinsics.LJFF(this.timeStamp, musicAndTimeModel.timeStamp) && this.slowMotionApplied == musicAndTimeModel.slowMotionApplied;
    }

    public final int hashCode() {
        String str = this.musicID;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.timeStamp.hashCode()) * 31) + C786410Ut5.Z2(this.slowMotionApplied);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicAndTimeModel(musicID=");
        sbLIZ.append(this.musicID);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.timeStamp);
        sbLIZ.append(", slowMotionApplied=");
        sbLIZ.append(this.slowMotionApplied);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicID);
        parcel.writeString(this.timeStamp);
        parcel.writeInt(this.slowMotionApplied ? 1 : 0);
    }

    public MusicAndTimeModel(String str, String str2, boolean z) {
        this.musicID = str;
        this.timeStamp = str2;
        this.slowMotionApplied = z;
    }
}
