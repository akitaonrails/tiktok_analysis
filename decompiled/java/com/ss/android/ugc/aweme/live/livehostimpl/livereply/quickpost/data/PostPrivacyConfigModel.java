package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1813540xIG;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostPrivacyConfigModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PostPrivacyConfigModel implements Parcelable {
    public final int currentType;
    public final String enterMethod;
    public final boolean forceDarkMode;
    public static final Parcelable.Creator<PostPrivacyConfigModel> CREATOR = new Parcelable.Creator<PostPrivacyConfigModel>() { // from class: X.0xIf
        @Override // android.os.Parcelable.Creator
        public final PostPrivacyConfigModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PostPrivacyConfigModel(i, string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final PostPrivacyConfigModel[] newArray(int i) {
            return new PostPrivacyConfigModel[i];
        }
    };
    public static final int $stable = 8;

    public final PostPrivacyConfigModel copy(int i, String str, boolean z) {
        return new PostPrivacyConfigModel(i, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPrivacyConfigModel)) {
            return false;
        }
        PostPrivacyConfigModel postPrivacyConfigModel = (PostPrivacyConfigModel) obj;
        return this.currentType == postPrivacyConfigModel.currentType && Intrinsics.LJFF(this.enterMethod, postPrivacyConfigModel.enterMethod) && this.forceDarkMode == postPrivacyConfigModel.forceDarkMode;
    }

    public int hashCode() {
        return (((this.currentType * 31) + this.enterMethod.hashCode()) * 31) + C786410Ut5.Z2(this.forceDarkMode);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPrivacyConfigModel(currentType=");
        sbLIZ.append(this.currentType);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", forceDarkMode=");
        sbLIZ.append(this.forceDarkMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentType);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.forceDarkMode ? 1 : 0);
    }

    public PostPrivacyConfigModel() {
        this(EnumC1813540xIG.PUBLIC.getValue(), "", false);
    }

    public final int getCurrentType() {
        return this.currentType;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final boolean getForceDarkMode() {
        return this.forceDarkMode;
    }

    public PostPrivacyConfigModel(int i, String str, boolean z) {
        this.currentType = i;
        this.enterMethod = str;
        this.forceDarkMode = z;
    }
}
