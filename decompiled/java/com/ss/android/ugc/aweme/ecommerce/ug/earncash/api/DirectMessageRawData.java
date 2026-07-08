package com.ss.android.ugc.aweme.ecommerce.ug.earncash.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.ug.earncash.LatamInviteRequestExtraData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DirectMessageRawData {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("dm_type")
    public final Integer dmType;

    @C09CT("extra_data")
    public final LatamInviteRequestExtraData extraData;

    @C09CT("game_type")
    public final Integer gameType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public DirectMessageRawData() {
        this(null, 7, 1, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectMessageRawData)) {
            return false;
        }
        DirectMessageRawData directMessageRawData = (DirectMessageRawData) obj;
        return Intrinsics.LJFF(this.id, directMessageRawData.id) && Intrinsics.LJFF(this.gameType, directMessageRawData.gameType) && Intrinsics.LJFF(this.dmType, directMessageRawData.dmType) && Intrinsics.LJFF(this.activityId, directMessageRawData.activityId) && Intrinsics.LJFF(this.extraData, directMessageRawData.extraData);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.gameType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dmType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.activityId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LatamInviteRequestExtraData latamInviteRequestExtraData = this.extraData;
        return iHashCode4 + (latamInviteRequestExtraData != null ? latamInviteRequestExtraData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectMessageRawData(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", gameType=");
        sbLIZ.append(this.gameType);
        sbLIZ.append(", dmType=");
        sbLIZ.append(this.dmType);
        sbLIZ.append(", activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.extraData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DirectMessageRawData(String str, Integer num, Integer num2, String str2, LatamInviteRequestExtraData latamInviteRequestExtraData) {
        this.id = str;
        this.gameType = num;
        this.dmType = num2;
        this.activityId = str2;
        this.extraData = latamInviteRequestExtraData;
    }
}
