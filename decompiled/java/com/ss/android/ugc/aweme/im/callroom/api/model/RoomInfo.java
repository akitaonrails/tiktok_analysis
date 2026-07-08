package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C006M;
import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class RoomInfo implements Serializable {
    public static final C006M Companion = new Object() { // from class: X.006M
    };

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("from_user_id")
    public final String fromUserId;

    @C09CT("from_user_name")
    public final String fromUserName;

    @C09CT("room_id")
    public final String roomId;

    public RoomInfo() {
        this("", null, null, null);
    }

    public final RoomInfo copy(String str, String str2, String str3, String str4) {
        return new RoomInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) obj;
        return Intrinsics.LJFF(this.roomId, roomInfo.roomId) && Intrinsics.LJFF(this.fromUserId, roomInfo.fromUserId) && Intrinsics.LJFF(this.fromUserName, roomInfo.fromUserName) && Intrinsics.LJFF(this.conversationId, roomInfo.conversationId);
    }

    public int hashCode() {
        int iHashCode = this.roomId.hashCode() * 31;
        String str = this.fromUserId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fromUserName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.conversationId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomInfo(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", fromUserId=");
        sbLIZ.append(this.fromUserId);
        sbLIZ.append(", fromUserName=");
        sbLIZ.append(this.fromUserName);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEmpty() {
        return a0.LJJJIL(this.roomId);
    }

    public RoomInfo(String str, String str2, String str3, String str4) {
        this.roomId = str;
        this.fromUserId = str2;
        this.fromUserName = str3;
        this.conversationId = str4;
    }
}
