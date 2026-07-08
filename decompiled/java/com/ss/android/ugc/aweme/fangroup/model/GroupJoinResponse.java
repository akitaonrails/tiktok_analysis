package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinCheckResult;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupJoinResponse extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<GroupJoinResponse> CREATOR = new Parcelable.Creator<GroupJoinResponse>() { // from class: X.0i8z
        @Override // android.os.Parcelable.Creator
        public final GroupJoinResponse createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(GroupJoinCheckResult.CREATOR.createFromParcel(parcel));
            }
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new GroupJoinResponse(arrayList, lValueOf, string, string2, string3, string4, numValueOf, string5, numValueOf2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupJoinResponse[] newArray(int i) {
            return new GroupJoinResponse[i];
        }
    };

    @C09CT("action_scheme")
    public final String actionScheme;

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("btn_status")
    public final Integer btnStatus;

    @C09CT("btn_text")
    public final String btnText;

    @C09CT("creator_id")
    public final Long creatorId;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("panel_avatar_url")
    public final String panelAvatar;

    @C09CT("panel_des")
    public final String panelDes;

    @C09CT("panel_title")
    public final String panelTitle;

    @C09CT("results")
    public final List<GroupJoinCheckResult> result;

    public GroupJoinResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinResponse)) {
            return false;
        }
        GroupJoinResponse groupJoinResponse = (GroupJoinResponse) obj;
        return Intrinsics.LJFF(this.result, groupJoinResponse.result) && Intrinsics.LJFF(this.creatorId, groupJoinResponse.creatorId) && Intrinsics.LJFF(this.panelAvatar, groupJoinResponse.panelAvatar) && Intrinsics.LJFF(this.panelTitle, groupJoinResponse.panelTitle) && Intrinsics.LJFF(this.panelDes, groupJoinResponse.panelDes) && Intrinsics.LJFF(this.btnText, groupJoinResponse.btnText) && Intrinsics.LJFF(this.actionType, groupJoinResponse.actionType) && Intrinsics.LJFF(this.actionScheme, groupJoinResponse.actionScheme) && Intrinsics.LJFF(this.btnStatus, groupJoinResponse.btnStatus) && Intrinsics.LJFF(this.eventTracking, groupJoinResponse.eventTracking);
    }

    public final int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        Long l = this.creatorId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.panelAvatar;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.panelTitle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.panelDes;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btnText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.actionType;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.actionScheme;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.btnStatus;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.eventTracking;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupJoinResponse(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.creatorId);
        sbLIZ.append(", panelAvatar=");
        sbLIZ.append(this.panelAvatar);
        sbLIZ.append(", panelTitle=");
        sbLIZ.append(this.panelTitle);
        sbLIZ.append(", panelDes=");
        sbLIZ.append(this.panelDes);
        sbLIZ.append(", btnText=");
        sbLIZ.append(this.btnText);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", actionScheme=");
        sbLIZ.append(this.actionScheme);
        sbLIZ.append(", btnStatus=");
        sbLIZ.append(this.btnStatus);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupJoinCheckResult> list = this.result;
        parcel.writeInt(list.size());
        Iterator<GroupJoinCheckResult> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        Long l = this.creatorId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.panelAvatar);
        parcel.writeString(this.panelTitle);
        parcel.writeString(this.panelDes);
        parcel.writeString(this.btnText);
        Integer num = this.actionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.actionScheme);
        Integer num2 = this.btnStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Map<String, String> map = this.eventTracking;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public GroupJoinResponse(List<GroupJoinCheckResult> list, Long l, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Map<String, String> map) {
        this.result = list;
        this.creatorId = l;
        this.panelAvatar = str;
        this.panelTitle = str2;
        this.panelDes = str3;
        this.btnText = str4;
        this.actionType = num;
        this.actionScheme = str5;
        this.btnStatus = num2;
        this.eventTracking = map;
    }

    public GroupJoinResponse(List list, Long l, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : num2, (i & 512) == 0 ? map : null);
    }
}
