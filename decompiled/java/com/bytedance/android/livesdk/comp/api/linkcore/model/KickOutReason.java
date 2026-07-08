package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes18.dex */
public final class KickOutReason {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final boolean isKickoutException(int i) {
            return i == 1 || i == 3 || i == 4;
        }

        public final int toExceptionType(int i) {
            if (i == 1) {
                return 400;
            }
            if (i != 3) {
                return i != 4 ? 499 : 402;
            }
            return 401;
        }

        public final String stateToString(int i) {
            switch (i) {
                case 1:
                    return "first_frame_timeout";
                case 2:
                    return "reason_by_host";
                case 3:
                    return "rtc_lost_connection";
                case 4:
                    return "kick_out_reason_by_punish";
                case 5:
                    return "kick_out_reason_by_admin";
                case 6:
                    return "kick_out_reason_host_remove_all_guests";
                case 7:
                    return "kick_out_reason_enigma_expire";
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown: ");
                    sbLIZ.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
