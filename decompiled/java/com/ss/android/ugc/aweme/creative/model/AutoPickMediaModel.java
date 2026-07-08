package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C525010KiR;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoPickMediaModel implements Parcelable {

    @C09CT("autopick_media_duration")
    public long duration;

    @C09CT("autopick_media_path")
    @C0MY0(blockCreative = false)
    @InterfaceC2270808v4
    public String filePath;

    @C040H
    public final String fileUriPath;

    @C09CT("autopick_media_height")
    public int height;

    @C09CT("autopick_media_is_video_type")
    public final boolean isVideoType;

    @C09CT("res_id")
    public String resId;

    @C09CT("autopick_media_width")
    public int width;
    public static final C525010KiR Companion = new C525010KiR();
    public static final Parcelable.Creator<AutoPickMediaModel> CREATOR = new Parcelable.Creator<AutoPickMediaModel>() { // from class: X.0Kj9
        @Override // android.os.Parcelable.Creator
        public final AutoPickMediaModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AutoPickMediaModel(string, i, i2, z, parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoPickMediaModel[] newArray(int i) {
            return new AutoPickMediaModel[i];
        }
    };

    public AutoPickMediaModel() {
        this("", 0, 0, false, 0L, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.isVideoType ? 1 : 0);
        parcel.writeLong(this.duration);
        parcel.writeString(this.fileUriPath);
        parcel.writeString(this.resId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickMediaModel(filePath=");
        sbLIZ.append(this.filePath);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", isVideoType=");
        sbLIZ.append(this.isVideoType);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(")resId=");
        sbLIZ.append(this.resId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoPickMediaModel(String str, int i, int i2, boolean z, long j, String str2, String str3) {
        this.filePath = str;
        this.width = i;
        this.height = i2;
        this.isVideoType = z;
        this.duration = j;
        this.fileUriPath = str2;
        this.resId = str3;
    }
}
