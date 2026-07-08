package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDualDeviceSignalData extends BaseDownlinkData {

    @C09CT("content")
    public final String content;

    @C09CT("from_did")
    public final String fromDid;

    @C09CT("message_type")
    public final int messageType;

    @C09CT("send_timestamp_millsec")
    public final long sendTime;

    @C09CT("target_did")
    public final String targetDid;

    public final GameDualDeviceSignalData copy(int i, String str, String str2, long j, String str3) {
        return new GameDualDeviceSignalData(i, str, str2, j, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDualDeviceSignalData)) {
            return false;
        }
        GameDualDeviceSignalData gameDualDeviceSignalData = (GameDualDeviceSignalData) obj;
        return this.messageType == gameDualDeviceSignalData.messageType && Intrinsics.LJFF(this.targetDid, gameDualDeviceSignalData.targetDid) && Intrinsics.LJFF(this.fromDid, gameDualDeviceSignalData.fromDid) && this.sendTime == gameDualDeviceSignalData.sendTime && Intrinsics.LJFF(this.content, gameDualDeviceSignalData.content);
    }

    public int hashCode() {
        return (((((((this.messageType * 31) + this.targetDid.hashCode()) * 31) + this.fromDid.hashCode()) * 31) + C786410Ut5.Y2(this.sendTime)) * 31) + this.content.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameDualDeviceSignalData(messageType=");
        sbLIZ.append(this.messageType);
        sbLIZ.append(", targetDid=");
        sbLIZ.append(this.targetDid);
        sbLIZ.append(", fromDid=");
        sbLIZ.append(this.fromDid);
        sbLIZ.append(", sendTime=");
        sbLIZ.append(this.sendTime);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getFromDid() {
        return this.fromDid;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final long getSendTime() {
        return this.sendTime;
    }

    public final String getTargetDid() {
        return this.targetDid;
    }

    public GameDualDeviceSignalData(int i, String str, String str2, long j, String str3) {
        this.messageType = i;
        this.targetDid = str;
        this.fromDid = str2;
        this.sendTime = j;
        this.content = str3;
    }
}
