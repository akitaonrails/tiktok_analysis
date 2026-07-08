package com.ss.android.ugc.aweme.lemon.postmode.model;

import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeDetailParams implements Parcelable {
    public static final Parcelable.Creator<PostModeDetailParams> CREATOR = new Parcelable.Creator<PostModeDetailParams>() { // from class: X.0lON
        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PostModeDetailParams(string, string2, string3, i, string4, i2, string5, string6, z, parcel.readBundle(PostModeDetailParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams[] newArray(int i) {
            return new PostModeDetailParams[i];
        }
    };
    public Bundle animationBundle;
    public String awemeId;
    public boolean enableGestureExit;
    public String enterMethod;
    public String eventType;
    public String feedParamFrom;
    public int pageType;
    public int position;
    public String previousPage;
    public String shareUrl;
    public String tabName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PostModeDetailParams() {
        String str = null;
        this(str, str, str, str, 0, str, str, 0 == true ? 1 : 0, str, 2047);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeDetailParams)) {
            return false;
        }
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) obj;
        return Intrinsics.LJFF(this.eventType, postModeDetailParams.eventType) && Intrinsics.LJFF(this.tabName, postModeDetailParams.tabName) && Intrinsics.LJFF(this.awemeId, postModeDetailParams.awemeId) && this.position == postModeDetailParams.position && Intrinsics.LJFF(this.previousPage, postModeDetailParams.previousPage) && this.pageType == postModeDetailParams.pageType && Intrinsics.LJFF(this.feedParamFrom, postModeDetailParams.feedParamFrom) && Intrinsics.LJFF(this.enterMethod, postModeDetailParams.enterMethod) && this.enableGestureExit == postModeDetailParams.enableGestureExit && Intrinsics.LJFF(this.animationBundle, postModeDetailParams.animationBundle) && Intrinsics.LJFF(this.shareUrl, postModeDetailParams.shareUrl);
    }

    public final int hashCode() {
        String str = this.eventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.position) * 31;
        String str4 = this.previousPage;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.pageType) * 31;
        String str5 = this.feedParamFrom;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterMethod;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.enableGestureExit)) * 31;
        Bundle bundle = this.animationBundle;
        int iHashCode7 = (iHashCode6 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str7 = this.shareUrl;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "PostModeDetailParams(eventType=" + this.eventType + ", tabName=" + this.tabName + ", awemeId=" + this.awemeId + ", position=" + this.position + ", previousPage=" + this.previousPage + ", pageType=" + this.pageType + ", feedParamFrom=" + this.feedParamFrom + ", enterMethod=" + this.enterMethod + ", enableGestureExit=" + this.enableGestureExit + ", animationBundle=" + this.animationBundle + ", shareUrl=" + this.shareUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.eventType);
        parcel.writeString(this.tabName);
        parcel.writeString(this.awemeId);
        parcel.writeInt(this.position);
        parcel.writeString(this.previousPage);
        parcel.writeInt(this.pageType);
        parcel.writeString(this.feedParamFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.enableGestureExit ? 1 : 0);
        parcel.writeBundle(this.animationBundle);
        parcel.writeString(this.shareUrl);
    }

    public /* synthetic */ PostModeDetailParams(String str, String str2, String str3, String str4, int i, String str5, String str6, boolean z, String str7, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, 0, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? true : z, null, (i2 & 1024) != 0 ? null : str7);
    }

    public PostModeDetailParams(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, boolean z, Bundle bundle, String str7) {
        this.eventType = str;
        this.tabName = str2;
        this.awemeId = str3;
        this.position = i;
        this.previousPage = str4;
        this.pageType = i2;
        this.feedParamFrom = str5;
        this.enterMethod = str6;
        this.enableGestureExit = z;
        this.animationBundle = bundle;
        this.shareUrl = str7;
    }
}
