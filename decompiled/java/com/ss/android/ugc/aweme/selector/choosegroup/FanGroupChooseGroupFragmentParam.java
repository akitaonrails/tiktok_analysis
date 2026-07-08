package com.ss.android.ugc.aweme.selector.choosegroup;

import X.C1228580i4m;
import X.C2095008Iq;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupChooseGroupFragmentParam implements Parcelable {
    public final List<Integer> accessCriteriaCollectionIds;
    public final String action;
    public final String businessType;
    public final int createChatLandingPage;
    public final String creatorUid;
    public final String ctaText;
    public final String defaultGroupName;
    public final boolean disableBackgroundMask;
    public final String enterFrom;
    public final String enterMethod;
    public final String groupCategory;
    public final String groupType;
    public final boolean hideTitleText;
    public final String inviteTargetUserSuccessToastContent;
    public final boolean isFullScreen;
    public final String nextButtonContent;
    public final Float panelHeightRatio;
    public final int quickChatViewType;
    public final String scene;
    public final String targetUserId;
    public final String tracingUuid;
    public final String trafficType;
    public static final C1228580i4m Companion = new Object() { // from class: X.0i4m
    };
    public static final Parcelable.Creator<FanGroupChooseGroupFragmentParam> CREATOR = new Parcelable.Creator<FanGroupChooseGroupFragmentParam>() { // from class: X.0i4a
        @Override // android.os.Parcelable.Creator
        public final FanGroupChooseGroupFragmentParam createFromParcel(Parcel parcel) {
            boolean z;
            Float fValueOf;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string14 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new FanGroupChooseGroupFragmentParam(string, string2, string3, string4, string5, string6, string7, arrayList, string8, string9, string10, string11, string12, string13, z, fValueOf, z2, string14, i3, i4, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FanGroupChooseGroupFragmentParam[] newArray(int i) {
            return new FanGroupChooseGroupFragmentParam[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FanGroupChooseGroupFragmentParam)) {
            return false;
        }
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = (FanGroupChooseGroupFragmentParam) obj;
        return Intrinsics.LJFF(this.action, fanGroupChooseGroupFragmentParam.action) && Intrinsics.LJFF(this.targetUserId, fanGroupChooseGroupFragmentParam.targetUserId) && Intrinsics.LJFF(this.inviteTargetUserSuccessToastContent, fanGroupChooseGroupFragmentParam.inviteTargetUserSuccessToastContent) && Intrinsics.LJFF(this.nextButtonContent, fanGroupChooseGroupFragmentParam.nextButtonContent) && Intrinsics.LJFF(this.enterFrom, fanGroupChooseGroupFragmentParam.enterFrom) && Intrinsics.LJFF(this.enterMethod, fanGroupChooseGroupFragmentParam.enterMethod) && Intrinsics.LJFF(this.tracingUuid, fanGroupChooseGroupFragmentParam.tracingUuid) && Intrinsics.LJFF(this.accessCriteriaCollectionIds, fanGroupChooseGroupFragmentParam.accessCriteriaCollectionIds) && Intrinsics.LJFF(this.groupType, fanGroupChooseGroupFragmentParam.groupType) && Intrinsics.LJFF(this.groupCategory, fanGroupChooseGroupFragmentParam.groupCategory) && Intrinsics.LJFF(this.businessType, fanGroupChooseGroupFragmentParam.businessType) && Intrinsics.LJFF(this.creatorUid, fanGroupChooseGroupFragmentParam.creatorUid) && Intrinsics.LJFF(this.defaultGroupName, fanGroupChooseGroupFragmentParam.defaultGroupName) && Intrinsics.LJFF(this.scene, fanGroupChooseGroupFragmentParam.scene) && this.isFullScreen == fanGroupChooseGroupFragmentParam.isFullScreen && Intrinsics.LJFF(this.panelHeightRatio, fanGroupChooseGroupFragmentParam.panelHeightRatio) && this.disableBackgroundMask == fanGroupChooseGroupFragmentParam.disableBackgroundMask && Intrinsics.LJFF(this.trafficType, fanGroupChooseGroupFragmentParam.trafficType) && this.createChatLandingPage == fanGroupChooseGroupFragmentParam.createChatLandingPage && this.quickChatViewType == fanGroupChooseGroupFragmentParam.quickChatViewType && this.hideTitleText == fanGroupChooseGroupFragmentParam.hideTitleText && Intrinsics.LJFF(this.ctaText, fanGroupChooseGroupFragmentParam.ctaText);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.action.hashCode() * 31) + this.targetUserId.hashCode()) * 31) + this.inviteTargetUserSuccessToastContent.hashCode()) * 31) + this.nextButtonContent.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.tracingUuid.hashCode()) * 31) + this.accessCriteriaCollectionIds.hashCode()) * 31) + this.groupType.hashCode()) * 31) + this.groupCategory.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.creatorUid.hashCode()) * 31) + this.defaultGroupName.hashCode()) * 31) + this.scene.hashCode()) * 31) + C786410Ut5.Z2(this.isFullScreen)) * 31;
        Float f = this.panelHeightRatio;
        int iHashCode2 = (((((((((((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.disableBackgroundMask)) * 31) + this.trafficType.hashCode()) * 31) + this.createChatLandingPage) * 31) + this.quickChatViewType) * 31) + C786410Ut5.Z2(this.hideTitleText)) * 31;
        String str = this.ctaText;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FanGroupChooseGroupFragmentParam(action=" + this.action + ", targetUserId=" + this.targetUserId + ", inviteTargetUserSuccessToastContent=" + this.inviteTargetUserSuccessToastContent + ", nextButtonContent=" + this.nextButtonContent + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", tracingUuid=" + this.tracingUuid + ", accessCriteriaCollectionIds=" + this.accessCriteriaCollectionIds + ", groupType=" + this.groupType + ", groupCategory=" + this.groupCategory + ", businessType=" + this.businessType + ", creatorUid=" + this.creatorUid + ", defaultGroupName=" + this.defaultGroupName + ", scene=" + this.scene + ", isFullScreen=" + this.isFullScreen + ", panelHeightRatio=" + this.panelHeightRatio + ", disableBackgroundMask=" + this.disableBackgroundMask + ", trafficType=" + this.trafficType + ", createChatLandingPage=" + this.createChatLandingPage + ", quickChatViewType=" + this.quickChatViewType + ", hideTitleText=" + this.hideTitleText + ", ctaText=" + this.ctaText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.action);
        parcel.writeString(this.targetUserId);
        parcel.writeString(this.inviteTargetUserSuccessToastContent);
        parcel.writeString(this.nextButtonContent);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.tracingUuid);
        List<Integer> list = this.accessCriteriaCollectionIds;
        parcel.writeInt(list.size());
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.groupType);
        parcel.writeString(this.groupCategory);
        parcel.writeString(this.businessType);
        parcel.writeString(this.creatorUid);
        parcel.writeString(this.defaultGroupName);
        parcel.writeString(this.scene);
        parcel.writeInt(this.isFullScreen ? 1 : 0);
        Float f = this.panelHeightRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.disableBackgroundMask ? 1 : 0);
        parcel.writeString(this.trafficType);
        parcel.writeInt(this.createChatLandingPage);
        parcel.writeInt(this.quickChatViewType);
        parcel.writeInt(this.hideTitleText ? 1 : 0);
        parcel.writeString(this.ctaText);
    }

    public final long LIZ() {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.creatorUid);
        if (lLJIILIIL != null) {
            return lLJIILIIL.longValue();
        }
        return 0L;
    }

    public FanGroupChooseGroupFragmentParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Integer> list, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, Float f, boolean z2, String str14, int i, int i2, boolean z3, String str15) {
        this.action = str;
        this.targetUserId = str2;
        this.inviteTargetUserSuccessToastContent = str3;
        this.nextButtonContent = str4;
        this.enterFrom = str5;
        this.enterMethod = str6;
        this.tracingUuid = str7;
        this.accessCriteriaCollectionIds = list;
        this.groupType = str8;
        this.groupCategory = str9;
        this.businessType = str10;
        this.creatorUid = str11;
        this.defaultGroupName = str12;
        this.scene = str13;
        this.isFullScreen = z;
        this.panelHeightRatio = f;
        this.disableBackgroundMask = z2;
        this.trafficType = str14;
        this.createChatLandingPage = i;
        this.quickChatViewType = i2;
        this.hideTitleText = z3;
        this.ctaText = str15;
    }
}
