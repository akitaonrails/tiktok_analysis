package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtraEffectFrameItem implements Serializable, Parcelable {
    public static final Parcelable.Creator<ExtraEffectFrameItem> CREATOR = new Creator();

    @C09CT("height")
    public int height;

    @C09CT("mime_type")
    public int mimeType;

    @C09CT("path")
    public String path;

    @C09CT("width")
    public int width;

    public static final class Creator implements Parcelable.Creator<ExtraEffectFrameItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraEffectFrameItem createFromParcel(Parcel parcel) {
            return new ExtraEffectFrameItem(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraEffectFrameItem[] newArray(int i) {
            return new ExtraEffectFrameItem[i];
        }
    }

    public ExtraEffectFrameItem() {
        this(null, 0, 0, 0);
    }

    public final ExtraEffectFrameItem copy(String str, int i, int i2, int i3) {
        return new ExtraEffectFrameItem(str, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraEffectFrameItem)) {
            return false;
        }
        ExtraEffectFrameItem extraEffectFrameItem = (ExtraEffectFrameItem) obj;
        return Intrinsics.LJFF(this.path, extraEffectFrameItem.path) && this.width == extraEffectFrameItem.width && this.height == extraEffectFrameItem.height && this.mimeType == extraEffectFrameItem.mimeType;
    }

    public int hashCode() {
        String str = this.path;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.mimeType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraEffectFrameItem(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.mimeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.mimeType);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMimeType() {
        return this.mimeType;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMimeType(int i) {
        this.mimeType = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ExtraEffectFrameItem(String str, int i, int i2, int i3) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.mimeType = i3;
    }
}
