package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeTabModel implements Parcelable {

    @C09CT("filter_options")
    public final List<NoticeFilterModel> filterOptionList;

    @C09CT("filter_type")
    public final int filterType;

    @C09CT("group")
    public final int group;
    public int index;

    @C09CT("is_all_tab")
    public final boolean isAllTab;

    @C09CT("is_default_landing")
    public final boolean isDefaultLanding;

    @C09CT("is_follower_tab")
    public final Boolean isFollowerTab;

    @C09CT("last_read_time")
    public final int lastReadTime;

    @C09CT("need_janus")
    public final boolean needCombineExtraData;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("sort_options")
    public final List<NoticeSortModel> sortOptionList;

    @C09CT("tab_id")
    public final int tabId;

    @C09CT("tab_text")
    public final String tabName;

    @C09CT("tracking_text")
    public final String trackingName;

    @C09CT("unread_count")
    public int unReadCount;

    @C09CT("wall_time")
    public final int wallTime;
    public static final Parcelable.Creator<NoticeTabModel> CREATOR = new Parcelable.Creator<NoticeTabModel>() { // from class: X.0zZC
        @Override // android.os.Parcelable.Creator
        public final NoticeTabModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z3;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList.add(NoticeFilterModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(NoticeSortModel.CREATOR.createFromParcel(parcel));
                }
            }
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            return new NoticeTabModel(i, i2, string, i3, z, z2, arrayList, arrayList2, i8, i9, string2, i10, z3, boolValueOf, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeTabModel[] newArray(int i) {
            return new NoticeTabModel[i];
        }
    };
    public static final int $stable = 8;

    public final NoticeTabModel copy(int i, int i2, String str, int i3, boolean z, boolean z2, List<NoticeFilterModel> list, List<NoticeSortModel> list2, int i4, int i5, String str2, int i6, boolean z3, Boolean bool, String str3, int i7) {
        return new NoticeTabModel(i, i2, str, i3, z, z2, list, list2, i4, i5, str2, i6, z3, bool, str3, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeTabModel)) {
            return false;
        }
        NoticeTabModel noticeTabModel = (NoticeTabModel) obj;
        return this.tabId == noticeTabModel.tabId && this.group == noticeTabModel.group && Intrinsics.LJFF(this.tabName, noticeTabModel.tabName) && this.unReadCount == noticeTabModel.unReadCount && this.isAllTab == noticeTabModel.isAllTab && this.isDefaultLanding == noticeTabModel.isDefaultLanding && Intrinsics.LJFF(this.filterOptionList, noticeTabModel.filterOptionList) && Intrinsics.LJFF(this.sortOptionList, noticeTabModel.sortOptionList) && this.lastReadTime == noticeTabModel.lastReadTime && this.wallTime == noticeTabModel.wallTime && Intrinsics.LJFF(this.trackingName, noticeTabModel.trackingName) && this.filterType == noticeTabModel.filterType && this.needCombineExtraData == noticeTabModel.needCombineExtraData && Intrinsics.LJFF(this.isFollowerTab, noticeTabModel.isFollowerTab) && Intrinsics.LJFF(this.schemaUrl, noticeTabModel.schemaUrl) && this.index == noticeTabModel.index;
    }

    public int hashCode() {
        int i = ((this.tabId * 31) + this.group) * 31;
        String str = this.tabName;
        int iHashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.unReadCount) * 31) + C786410Ut5.Z2(this.isAllTab)) * 31) + C786410Ut5.Z2(this.isDefaultLanding)) * 31;
        List<NoticeFilterModel> list = this.filterOptionList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<NoticeSortModel> list2 = this.sortOptionList;
        int iHashCode3 = (((((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.lastReadTime) * 31) + this.wallTime) * 31;
        String str2 = this.trackingName;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.filterType) * 31) + C786410Ut5.Z2(this.needCombineExtraData)) * 31;
        Boolean bool = this.isFollowerTab;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.schemaUrl;
        return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.index;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tabId);
        parcel.writeInt(this.group);
        parcel.writeString(this.tabName);
        parcel.writeInt(this.unReadCount);
        parcel.writeInt(this.isAllTab ? 1 : 0);
        parcel.writeInt(this.isDefaultLanding ? 1 : 0);
        List<NoticeFilterModel> list = this.filterOptionList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NoticeFilterModel> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<NoticeSortModel> list2 = this.sortOptionList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<NoticeSortModel> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.lastReadTime);
        parcel.writeInt(this.wallTime);
        parcel.writeString(this.trackingName);
        parcel.writeInt(this.filterType);
        parcel.writeInt(this.needCombineExtraData ? 1 : 0);
        Boolean bool = this.isFollowerTab;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.schemaUrl);
        parcel.writeInt(this.index);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{tabId = ");
        sbLIZ.append(this.tabId);
        sbLIZ.append("},{tabName = ");
        sbLIZ.append(this.tabName);
        sbLIZ.append("},{unReadCount = ");
        sbLIZ.append(this.unReadCount);
        sbLIZ.append("},{lastReadTime = ");
        sbLIZ.append(this.lastReadTime);
        sbLIZ.append("},{wallTime = ");
        sbLIZ.append(this.wallTime);
        sbLIZ.append("}.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<NoticeFilterModel> getFilterOptionList() {
        return this.filterOptionList;
    }

    public final int getFilterType() {
        return this.filterType;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLastReadTime() {
        return this.lastReadTime;
    }

    public final boolean getNeedCombineExtraData() {
        return this.needCombineExtraData;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final List<NoticeSortModel> getSortOptionList() {
        return this.sortOptionList;
    }

    public final int getTabId() {
        return this.tabId;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getTrackingName() {
        return this.trackingName;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final int getWallTime() {
        return this.wallTime;
    }

    public final boolean isAllTab() {
        return this.isAllTab;
    }

    public final boolean isDefaultLanding() {
        return this.isDefaultLanding;
    }

    public final Boolean isFollowerTab() {
        return this.isFollowerTab;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public NoticeTabModel(int i, int i2, String str, int i3, boolean z, boolean z2, List<NoticeFilterModel> list, List<NoticeSortModel> list2, int i4, int i5, String str2, int i6, boolean z3, Boolean bool, String str3, int i7) {
        this.tabId = i;
        this.group = i2;
        this.tabName = str;
        this.unReadCount = i3;
        this.isAllTab = z;
        this.isDefaultLanding = z2;
        this.filterOptionList = list;
        this.sortOptionList = list2;
        this.lastReadTime = i4;
        this.wallTime = i5;
        this.trackingName = str2;
        this.filterType = i6;
        this.needCombineExtraData = z3;
        this.isFollowerTab = bool;
        this.schemaUrl = str3;
        this.index = i7;
    }
}
