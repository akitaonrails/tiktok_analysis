package com.ss.android.ugc.aweme.explore;

import X.C786410Ut5;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreLynxParams implements Parcelable, InterfaceC111300bX {
    public static final Parcelable.Creator<ExploreLynxParams> CREATOR = new Parcelable.Creator<ExploreLynxParams>() { // from class: X.0wRg
        @Override // android.os.Parcelable.Creator
        public final ExploreLynxParams createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new ExploreLynxParams(lValueOf, string, arrayListCreateStringArrayList, z, string2, string3, string4, string5, string6, z2, string7, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreLynxParams[] newArray(int i) {
            return new ExploreLynxParams[i];
        }
    };
    public final String backUrl;
    public final String enterMethod;
    public final String groupId;
    public final boolean lynxIsPinTopic;
    public final List<String> lynxJumpAwemeIds;
    public final Long lynxJumpInterestId;
    public final String lynxJumpInterestName;
    public final boolean needBackFyp;
    public final String requestId;
    public final boolean showBackButton;
    public final String specialShapedCardTriggerType;
    public final String subEnterMethod;

    public ExploreLynxParams() {
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
        if (!(obj instanceof ExploreLynxParams)) {
            return false;
        }
        ExploreLynxParams exploreLynxParams = (ExploreLynxParams) obj;
        return Intrinsics.LJFF(this.lynxJumpInterestId, exploreLynxParams.lynxJumpInterestId) && Intrinsics.LJFF(this.lynxJumpInterestName, exploreLynxParams.lynxJumpInterestName) && Intrinsics.LJFF(this.lynxJumpAwemeIds, exploreLynxParams.lynxJumpAwemeIds) && this.lynxIsPinTopic == exploreLynxParams.lynxIsPinTopic && Intrinsics.LJFF(this.enterMethod, exploreLynxParams.enterMethod) && Intrinsics.LJFF(this.groupId, exploreLynxParams.groupId) && Intrinsics.LJFF(this.requestId, exploreLynxParams.requestId) && Intrinsics.LJFF(this.subEnterMethod, exploreLynxParams.subEnterMethod) && Intrinsics.LJFF(this.specialShapedCardTriggerType, exploreLynxParams.specialShapedCardTriggerType) && this.showBackButton == exploreLynxParams.showBackButton && Intrinsics.LJFF(this.backUrl, exploreLynxParams.backUrl) && this.needBackFyp == exploreLynxParams.needBackFyp;
    }

    public final int hashCode() {
        Long l = this.lynxJumpInterestId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.lynxJumpInterestName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.lynxJumpAwemeIds;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.lynxIsPinTopic)) * 31;
        String str2 = this.enterMethod;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subEnterMethod;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.specialShapedCardTriggerType;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.showBackButton)) * 31;
        String str7 = this.backUrl;
        return ((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needBackFyp);
    }

    public final String toString() {
        return "ExploreLynxParams(lynxJumpInterestId=" + this.lynxJumpInterestId + ", lynxJumpInterestName=" + this.lynxJumpInterestName + ", lynxJumpAwemeIds=" + this.lynxJumpAwemeIds + ", lynxIsPinTopic=" + this.lynxIsPinTopic + ", enterMethod=" + this.enterMethod + ", groupId=" + this.groupId + ", requestId=" + this.requestId + ", subEnterMethod=" + this.subEnterMethod + ", specialShapedCardTriggerType=" + this.specialShapedCardTriggerType + ", showBackButton=" + this.showBackButton + ", backUrl=" + this.backUrl + ", needBackFyp=" + this.needBackFyp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.lynxJumpInterestId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.lynxJumpInterestName);
        parcel.writeStringList(this.lynxJumpAwemeIds);
        parcel.writeInt(this.lynxIsPinTopic ? 1 : 0);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.groupId);
        parcel.writeString(this.requestId);
        parcel.writeString(this.subEnterMethod);
        parcel.writeString(this.specialShapedCardTriggerType);
        parcel.writeInt(this.showBackButton ? 1 : 0);
        parcel.writeString(this.backUrl);
        parcel.writeInt(this.needBackFyp ? 1 : 0);
    }

    public /* synthetic */ ExploreLynxParams(int i) {
        this(null, null, null, false, null, null, null, null, null, false, null, false);
    }

    public ExploreLynxParams(Long l, String str, List<String> list, boolean z, String str2, String str3, String str4, String str5, String str6, boolean z2, String str7, boolean z3) {
        this.lynxJumpInterestId = l;
        this.lynxJumpInterestName = str;
        this.lynxJumpAwemeIds = list;
        this.lynxIsPinTopic = z;
        this.enterMethod = str2;
        this.groupId = str3;
        this.requestId = str4;
        this.subEnterMethod = str5;
        this.specialShapedCardTriggerType = str6;
        this.showBackButton = z2;
        this.backUrl = str7;
        this.needBackFyp = z3;
    }
}
