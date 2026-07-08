package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupShotDataModel implements Parcelable {
    public static final Parcelable.Creator<GroupShotDataModel> CREATOR = new Parcelable.Creator<GroupShotDataModel>() { // from class: X.0mcd
        @Override // android.os.Parcelable.Creator
        public final GroupShotDataModel createFromParcel(Parcel parcel) {
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
            return new GroupShotDataModel(arrayListCreateStringArrayList, z, string, string2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupShotDataModel[] newArray(int i) {
            return new GroupShotDataModel[i];
        }
    };

    @C09CT("group_shot_task_id")
    public final String groupShotTaskId;

    @C09CT("group_shot_template_id")
    public final String groupShotTemplateId;

    @C09CT("reference_message_id")
    public final Long refMessageId;

    @C09CT("group_shot_session_ids")
    public final List<String> sessionIds;

    @C09CT("should_display_invite_toast")
    public final boolean shouldDisplayInviteToast;

    public GroupShotDataModel() {
        this(null, false, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupShotDataModel)) {
            return false;
        }
        GroupShotDataModel groupShotDataModel = (GroupShotDataModel) obj;
        return Intrinsics.LJFF(this.sessionIds, groupShotDataModel.sessionIds) && this.shouldDisplayInviteToast == groupShotDataModel.shouldDisplayInviteToast && Intrinsics.LJFF(this.groupShotTemplateId, groupShotDataModel.groupShotTemplateId) && Intrinsics.LJFF(this.groupShotTaskId, groupShotDataModel.groupShotTaskId) && Intrinsics.LJFF(this.refMessageId, groupShotDataModel.refMessageId);
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
        sbLIZ.append("GroupShotDataModel(sessionIds=");
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

    public GroupShotDataModel(List<String> list, boolean z, String str, String str2, Long l) {
        this.sessionIds = list;
        this.shouldDisplayInviteToast = z;
        this.groupShotTemplateId = str;
        this.groupShotTaskId = str2;
        this.refMessageId = l;
    }

    public GroupShotDataModel(List list, boolean z, String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? l : null);
    }
}
