package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class KickOutData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final LiveRoomUser guest;
    public final int kickOutReason;

    public static final class Builder {
        public Map<String, String> customData;
        public final LiveRoomUser guest;
        public int kickOutReason;

        public final KickOutData build() {
            return new KickOutData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final LiveRoomUser getGuest() {
            return this.guest;
        }

        public final int getKickOutReason() {
            return this.kickOutReason;
        }

        public Builder(LiveRoomUser liveRoomUser) {
            this.guest = liveRoomUser;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setKickOutReason(int i) {
            this.kickOutReason = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KickOutData(kickOutReason=");
        sbLIZ.append(this.kickOutReason);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", guest=");
        sbLIZ.append(this.guest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KickOutData(Builder builder) {
        this(builder.getKickOutReason(), builder.getCustomData(), builder.getGuest());
    }

    public static final class Companion {
        public final KickOutData build(LiveRoomUser liveRoomUser, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public KickOutData(int i, Map<String, String> map, LiveRoomUser liveRoomUser) {
        this.kickOutReason = i;
        this.customData = map;
        this.guest = liveRoomUser;
    }
}
