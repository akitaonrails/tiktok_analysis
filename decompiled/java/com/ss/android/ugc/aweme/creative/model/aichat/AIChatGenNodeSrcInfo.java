package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AIChatGenNodeSrcInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIChatGenNodeSrcInfo> CREATOR = new Parcelable.Creator<AIChatGenNodeSrcInfo>() { // from class: X.0nNc
        @Override // android.os.Parcelable.Creator
        public final AIChatGenNodeSrcInfo createFromParcel(Parcel parcel) {
            return new AIChatGenNodeSrcInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenNodeSrcInfo[] newArray(int i) {
            return new AIChatGenNodeSrcInfo[i];
        }
    };

    @C09CT("height")
    public final int height;

    @C09CT("path")
    @C0MY0
    public final String path;

    @C09CT("width")
    public final int width;

    public final AIChatGenNodeSrcInfo copy(String str, int i, int i2) {
        return new AIChatGenNodeSrcInfo(str, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenNodeSrcInfo)) {
            return false;
        }
        AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo = (AIChatGenNodeSrcInfo) obj;
        return Intrinsics.LJFF(this.path, aIChatGenNodeSrcInfo.path) && this.width == aIChatGenNodeSrcInfo.width && this.height == aIChatGenNodeSrcInfo.height;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenNodeSrcInfo(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public AIChatGenNodeSrcInfo() {
        this("", 0, 0);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public AIChatGenNodeSrcInfo(String str, int i, int i2) {
        this.path = str;
        this.width = i;
        this.height = i2;
    }
}
