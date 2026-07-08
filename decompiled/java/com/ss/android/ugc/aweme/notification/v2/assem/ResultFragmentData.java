package com.ss.android.ugc.aweme.notification.v2.assem;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.NotificationResultFragment;
import com.ss.android.ugc.aweme.notification.v2.assem.ResultFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ResultFragmentData extends PowerViewPagerFragmentItem<NotificationResultFragment> {
    public final Integer collapsedListType;
    public final GroupFilterStruct groupFilter;
    public final boolean isAllTab;
    public final boolean isCreator;
    public final NoticeTabModel tabInfo;
    public static final Parcelable.Creator<ResultFragmentData> CREATOR = new Parcelable.Creator<ResultFragmentData>() { // from class: X.0zYl
        @Override // android.os.Parcelable.Creator
        public final ResultFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            NoticeTabModel noticeTabModelCreateFromParcel;
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                noticeTabModelCreateFromParcel = null;
            } else {
                noticeTabModelCreateFromParcel = NoticeTabModel.CREATOR.createFromParcel(parcel);
            }
            NoticeTabModel noticeTabModel = noticeTabModelCreateFromParcel;
            GroupFilterStruct groupFilterStruct = (GroupFilterStruct) parcel.readParcelable(ResultFragmentData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ResultFragmentData(z, z2, noticeTabModel, groupFilterStruct, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultFragmentData[] newArray(int i) {
            return new ResultFragmentData[i];
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
        if (!(obj instanceof ResultFragmentData)) {
            return false;
        }
        ResultFragmentData resultFragmentData = (ResultFragmentData) obj;
        return this.isCreator == resultFragmentData.isCreator && this.isAllTab == resultFragmentData.isAllTab && Intrinsics.LJFF(this.tabInfo, resultFragmentData.tabInfo) && Intrinsics.LJFF(this.groupFilter, resultFragmentData.groupFilter) && Intrinsics.LJFF(this.collapsedListType, resultFragmentData.collapsedListType);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isCreator) * 31) + C786410Ut5.Z2(this.isAllTab)) * 31;
        NoticeTabModel noticeTabModel = this.tabInfo;
        int iHashCode = (iZ2 + (noticeTabModel == null ? 0 : noticeTabModel.hashCode())) * 31;
        GroupFilterStruct groupFilterStruct = this.groupFilter;
        int iHashCode2 = (iHashCode + (groupFilterStruct == null ? 0 : groupFilterStruct.hashCode())) * 31;
        Integer num = this.collapsedListType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResultFragmentData(isCreator=");
        sbLIZ.append(this.isCreator);
        sbLIZ.append(", isAllTab=");
        sbLIZ.append(this.isAllTab);
        sbLIZ.append(", tabInfo=");
        sbLIZ.append(this.tabInfo);
        sbLIZ.append(", groupFilter=");
        sbLIZ.append(this.groupFilter);
        sbLIZ.append(", collapsedListType=");
        sbLIZ.append(this.collapsedListType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isCreator ? 1 : 0);
        parcel.writeInt(this.isAllTab ? 1 : 0);
        NoticeTabModel noticeTabModel = this.tabInfo;
        if (noticeTabModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noticeTabModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.groupFilter, i);
        Integer num = this.collapsedListType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public ResultFragmentData(boolean z, boolean z2, NoticeTabModel noticeTabModel, GroupFilterStruct groupFilterStruct, Integer num) {
        this.isCreator = z;
        this.isAllTab = z2;
        this.tabInfo = noticeTabModel;
        this.groupFilter = groupFilterStruct;
        this.collapsedListType = num;
    }

    public /* synthetic */ ResultFragmentData(boolean z, boolean z2, NoticeTabModel noticeTabModel, GroupFilterStruct groupFilterStruct, Integer num, int i) {
        this(z, z2, (i & 4) != 0 ? null : noticeTabModel, (i & 8) != 0 ? null : groupFilterStruct, (i & 16) == 0 ? num : null);
    }
}
