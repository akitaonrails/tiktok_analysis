package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupShotParam implements Parcelable {
    public static final Parcelable.Creator<GroupShotParam> CREATOR = new Parcelable.Creator<GroupShotParam>() { // from class: X.0mce
        @Override // android.os.Parcelable.Creator
        public final GroupShotParam createFromParcel(Parcel parcel) {
            boolean z;
            Long lValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new GroupShotParam(arrayListCreateStringArrayList, z, string, string2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupShotParam[] newArray(int i) {
            return new GroupShotParam[i];
        }
    };
    public final String groupShotTaskId;
    public final String groupShotTemplateId;
    public final Long refMessageId;
    public final List<String> sessionIds;
    public final boolean shouldDisplayInviteToast;

    public GroupShotParam() {
        this(null, null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupShotParam)) {
            return false;
        }
        GroupShotParam groupShotParam = (GroupShotParam) obj;
        return Intrinsics.LJFF(this.sessionIds, groupShotParam.sessionIds) && this.shouldDisplayInviteToast == groupShotParam.shouldDisplayInviteToast && Intrinsics.LJFF(this.groupShotTemplateId, groupShotParam.groupShotTemplateId) && Intrinsics.LJFF(this.groupShotTaskId, groupShotParam.groupShotTaskId) && Intrinsics.LJFF(this.refMessageId, groupShotParam.refMessageId);
    }

    public final int hashCode() {
        int iHashCode = ((((this.sessionIds.hashCode() * 31) + C786410Ut5.Z2(this.shouldDisplayInviteToast)) * 31) + this.groupShotTemplateId.hashCode()) * 31;
        String str = this.groupShotTaskId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.refMessageId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupShotParam(sessionIds=");
        sbLIZ.append(this.sessionIds);
        sbLIZ.append(", shouldDisplayInviteToast=");
        sbLIZ.append(this.shouldDisplayInviteToast);
        sbLIZ.append(", groupShotTemplateId=");
        sbLIZ.append(this.groupShotTemplateId);
        sbLIZ.append(", groupShotTaskId=");
        sbLIZ.append(this.groupShotTaskId);
        sbLIZ.append(", refMessageId=");
        sbLIZ.append(this.refMessageId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.sessionIds);
        parcel.writeInt(this.shouldDisplayInviteToast ? 1 : 0);
        parcel.writeString(this.groupShotTemplateId);
        parcel.writeString(this.groupShotTaskId);
        Long l = this.refMessageId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public GroupShotParam(List list, String str, int i) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, false, (i & 4) != 0 ? "" : str, null, null);
    }

    public GroupShotParam(List<String> list, boolean z, String str, String str2, Long l) {
        this.sessionIds = list;
        this.shouldDisplayInviteToast = z;
        this.groupShotTemplateId = str;
        this.groupShotTaskId = str2;
        this.refMessageId = l;
    }
}
