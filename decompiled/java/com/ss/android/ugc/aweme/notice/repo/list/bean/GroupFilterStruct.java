package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupFilterStruct implements InterfaceC1891350zJl, Parcelable {
    public static final Parcelable.Creator<GroupFilterStruct> CREATOR = new Parcelable.Creator<GroupFilterStruct>() { // from class: X.0iXo
        @Override // android.os.Parcelable.Creator
        public final GroupFilterStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            NoticeChannelInfo noticeChannelInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            int i6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                noticeChannelInfoCreateFromParcel = NoticeChannelInfo.CREATOR.createFromParcel(parcel);
            }
            return new GroupFilterStruct(i, i2, i3, i4, i5, numValueOf, i6, noticeChannelInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupFilterStruct[] newArray(int i) {
            return new GroupFilterStruct[i];
        }
    };
    public final NoticeChannelInfo channelInfo;
    public final int descId;
    public int filterType;
    public final int groupIconId;
    public int noticeGroup;
    public final Integer placeHolderResId;
    public final int titleId;
    public final int titleResId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupFilterStruct)) {
            return false;
        }
        GroupFilterStruct groupFilterStruct = (GroupFilterStruct) obj;
        return this.noticeGroup == groupFilterStruct.noticeGroup && this.titleResId == groupFilterStruct.titleResId && this.groupIconId == groupFilterStruct.groupIconId && this.titleId == groupFilterStruct.titleId && this.descId == groupFilterStruct.descId && Intrinsics.LJFF(this.placeHolderResId, groupFilterStruct.placeHolderResId) && this.filterType == groupFilterStruct.filterType && Intrinsics.LJFF(this.channelInfo, groupFilterStruct.channelInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = ((((((((this.noticeGroup * 31) + this.titleResId) * 31) + this.groupIconId) * 31) + this.titleId) * 31) + this.descId) * 31;
        Integer num = this.placeHolderResId;
        int iHashCode = (((i + (num == null ? 0 : num.hashCode())) * 31) + this.filterType) * 31;
        NoticeChannelInfo noticeChannelInfo = this.channelInfo;
        return iHashCode + (noticeChannelInfo != null ? noticeChannelInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupFilterStruct(noticeGroup=");
        sbLIZ.append(this.noticeGroup);
        sbLIZ.append(", titleResId=");
        sbLIZ.append(this.titleResId);
        sbLIZ.append(", groupIconId=");
        sbLIZ.append(this.groupIconId);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.titleId);
        sbLIZ.append(", descId=");
        sbLIZ.append(this.descId);
        sbLIZ.append(", placeHolderResId=");
        sbLIZ.append(this.placeHolderResId);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", channelInfo=");
        sbLIZ.append(this.channelInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.noticeGroup);
        parcel.writeInt(this.titleResId);
        parcel.writeInt(this.groupIconId);
        parcel.writeInt(this.titleId);
        parcel.writeInt(this.descId);
        Integer num = this.placeHolderResId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.filterType);
        if (this.channelInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GroupFilterStruct(int i, int i2, int i3, int i4, int i5, Integer num) {
        this(i, i2, i3, i4, i5, num, Integer.MIN_VALUE, null);
    }

    public GroupFilterStruct(int i, int i2, int i3, int i4, int i5, Integer num, int i6, NoticeChannelInfo noticeChannelInfo) {
        this.noticeGroup = i;
        this.titleResId = i2;
        this.groupIconId = i3;
        this.titleId = i4;
        this.descId = i5;
        this.placeHolderResId = num;
        this.filterType = i6;
        this.channelInfo = noticeChannelInfo;
    }
}
