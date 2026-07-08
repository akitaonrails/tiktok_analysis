package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishFailMsg implements Parcelable {
    public static final Parcelable.Creator<PublishFailMsg> CREATOR = new Parcelable.Creator<PublishFailMsg>() { // from class: X.0nZJ
        @Override // android.os.Parcelable.Creator
        public final PublishFailMsg createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new PublishFailMsg(string, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishFailMsg[] newArray(int i) {
            return new PublishFailMsg[i];
        }
    };
    public final boolean ccNotAllowDirectPost;
    public final boolean isDirectPublishByCC;
    public final String publishFailedString;

    public PublishFailMsg() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishFailMsg)) {
            return false;
        }
        PublishFailMsg publishFailMsg = (PublishFailMsg) obj;
        return Intrinsics.LJFF(this.publishFailedString, publishFailMsg.publishFailedString) && this.isDirectPublishByCC == publishFailMsg.isDirectPublishByCC && this.ccNotAllowDirectPost == publishFailMsg.ccNotAllowDirectPost;
    }

    public final int hashCode() {
        return (((this.publishFailedString.hashCode() * 31) + C786410Ut5.Z2(this.isDirectPublishByCC)) * 31) + C786410Ut5.Z2(this.ccNotAllowDirectPost);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishFailMsg(publishFailedString=");
        sbLIZ.append(this.publishFailedString);
        sbLIZ.append(", isDirectPublishByCC=");
        sbLIZ.append(this.isDirectPublishByCC);
        sbLIZ.append(", ccNotAllowDirectPost=");
        sbLIZ.append(this.ccNotAllowDirectPost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.publishFailedString);
        parcel.writeInt(this.isDirectPublishByCC ? 1 : 0);
        parcel.writeInt(this.ccNotAllowDirectPost ? 1 : 0);
    }

    public /* synthetic */ PublishFailMsg(int i) {
        this("", false, false);
    }

    public PublishFailMsg(String str, boolean z, boolean z2) {
        this.publishFailedString = str;
        this.isDirectPublishByCC = z;
        this.ccNotAllowDirectPost = z2;
    }
}
