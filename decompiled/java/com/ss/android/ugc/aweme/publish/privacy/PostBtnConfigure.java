package com.ss.android.ugc.aweme.publish.privacy;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PostBtnConfigure implements Parcelable, Serializable {
    public final String btnText;
    public final boolean enable;
    public static final Parcelable.Creator<PostBtnConfigure> CREATOR = new Parcelable.Creator<PostBtnConfigure>() { // from class: X.0nh1
        @Override // android.os.Parcelable.Creator
        public final PostBtnConfigure createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PostBtnConfigure(z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostBtnConfigure[] newArray(int i) {
            return new PostBtnConfigure[i];
        }
    };
    public static final int $stable = 8;

    public PostBtnConfigure() {
        this(true, "");
    }

    public final PostBtnConfigure copy(boolean z, String str) {
        return new PostBtnConfigure(z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostBtnConfigure)) {
            return false;
        }
        PostBtnConfigure postBtnConfigure = (PostBtnConfigure) obj;
        return this.enable == postBtnConfigure.enable && Intrinsics.LJFF(this.btnText, postBtnConfigure.btnText);
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.btnText.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostBtnConfigure(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", btnText=");
        sbLIZ.append(this.btnText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeString(this.btnText);
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public PostBtnConfigure(boolean z, String str) {
        this.enable = z;
        this.btnText = str;
    }
}
