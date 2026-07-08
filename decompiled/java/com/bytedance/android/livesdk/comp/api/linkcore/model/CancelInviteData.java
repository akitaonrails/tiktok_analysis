package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelInviteData {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;
    public final Map<String, String> customData;
    public final LiveRoomUser invitee;
    public final String reason;
    public final long timeOutInterval;

    public static final class Builder {
        public Map<String, ? extends Object> custom;
        public Map<String, String> customData;
        public final LiveRoomUser invitee;
        public String reason;
        public final long timeOutInterval;

        public final CancelInviteData build() {
            return new CancelInviteData(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final LiveRoomUser getInvitee() {
            return this.invitee;
        }

        public final String getReason() {
            return this.reason;
        }

        public final long getTimeOutInterval() {
            return this.timeOutInterval;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public Builder(LiveRoomUser liveRoomUser, long j) {
            this.invitee = liveRoomUser;
            this.timeOutInterval = j;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelInviteData(customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", invitee=");
        sbLIZ.append(this.invitee);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.custom);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", timeOutInterval=");
        sbLIZ.append(this.timeOutInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CancelInviteData(Builder builder) {
        this(builder.getCustomData(), builder.getInvitee(), builder.getCustom(), builder.getReason(), builder.getTimeOutInterval());
    }

    public static final class Companion {
        public final CancelInviteData build(LiveRoomUser liveRoomUser, long j, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser, j);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public CancelInviteData(Map<String, String> map, LiveRoomUser liveRoomUser, Map<String, ? extends Object> map2, String str, long j) {
        this.customData = map;
        this.invitee = liveRoomUser;
        this.custom = map2;
        this.reason = str;
        this.timeOutInterval = j;
    }
}
