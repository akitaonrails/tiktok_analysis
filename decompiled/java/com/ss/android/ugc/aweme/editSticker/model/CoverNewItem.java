package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CoverNewItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverNewItem> CREATOR = new Parcelable.Creator<CoverNewItem>() { // from class: X.0MHI
        @Override // android.os.Parcelable.Creator
        public final CoverNewItem createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            Float fValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new CoverNewItem(i, string, i2, string2, j, boolValueOf, fValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CoverNewItem[] newArray(int i) {
            return new CoverNewItem[i];
        }
    };

    @C09CT("cover_path")
    @C0MY0
    public final String coverPath;

    @C09CT("cover_type")
    public final int coverType;

    @C09CT("extra")
    public final String extra;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("item_save_time")
    public final long timeStamp;

    @C09CT("unsafe_item")
    public final Boolean unsafeItem;

    @C09CT("videoCover_start_tm")
    public Float videoCoverStartTm;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CoverNewItem() {
        int i = 0;
        this(i, null, i, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final CoverNewItem copy(int i, String str, int i2, String str2, long j, Boolean bool, Float f) {
        return new CoverNewItem(i, str, i2, str2, j, bool, f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverNewItem)) {
            return false;
        }
        CoverNewItem coverNewItem = (CoverNewItem) obj;
        return this.scene == coverNewItem.scene && Intrinsics.LJFF(this.coverPath, coverNewItem.coverPath) && this.coverType == coverNewItem.coverType && Intrinsics.LJFF(this.extra, coverNewItem.extra) && this.timeStamp == coverNewItem.timeStamp && Intrinsics.LJFF(this.unsafeItem, coverNewItem.unsafeItem) && Intrinsics.LJFF(this.videoCoverStartTm, coverNewItem.videoCoverStartTm);
    }

    public int hashCode() {
        int i = this.scene * 31;
        String str = this.coverPath;
        int iHashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.coverType) * 31) + this.extra.hashCode()) * 31) + C786410Ut5.Y2(this.timeStamp)) * 31;
        Boolean bool = this.unsafeItem;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.videoCoverStartTm;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverNewItem(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.coverPath);
        sbLIZ.append(", coverType=");
        sbLIZ.append(this.coverType);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.timeStamp);
        sbLIZ.append(", unsafeItem=");
        sbLIZ.append(this.unsafeItem);
        sbLIZ.append(", videoCoverStartTm=");
        sbLIZ.append(this.videoCoverStartTm);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.scene);
        parcel.writeString(this.coverPath);
        parcel.writeInt(this.coverType);
        parcel.writeString(this.extra);
        parcel.writeLong(this.timeStamp);
        Boolean bool = this.unsafeItem;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f = this.videoCoverStartTm;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final int getCoverType() {
        return this.coverType;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getScene() {
        return this.scene;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final Boolean getUnsafeItem() {
        return this.unsafeItem;
    }

    public final Float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final void setVideoCoverStartTm(Float f) {
        this.videoCoverStartTm = f;
    }

    public CoverNewItem(int i, String str, int i2, String str2, long j, Boolean bool, Float f) {
        this.scene = i;
        this.coverPath = str;
        this.coverType = i2;
        this.extra = str2;
        this.timeStamp = j;
        this.unsafeItem = bool;
        this.videoCoverStartTm = f;
    }

    public /* synthetic */ CoverNewItem(int i, String str, int i2, String str2, long j, Boolean bool, Float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) == 0 ? i2 : -1, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? System.currentTimeMillis() : j, (i3 & 32) != 0 ? Boolean.FALSE : bool, (i3 & 64) == 0 ? f : null);
    }
}
