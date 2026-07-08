package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public final class LinkCoreError {
    public final int errorCode;
    public final String errorMsg;
    public final Long subCode;
    public static final Companion Companion = new Companion();
    public static final LinkCoreError SUCCESS = new LinkCoreError(0, 0L, "success");
    public static final LinkCoreError COMMON_UNKNOWN = new LinkCoreError(-10001, 0L, "unknown");
    public static final LinkCoreError COMMON_RESPONSE_INVALID = new LinkCoreError(-10002, 0L, "The response is null or invalid.");
    public static final LinkCoreError CHANNEL_ID_INVALID = new LinkCoreError(-20001, 0L, "The channel id is invalid.");
    public static final LinkCoreError CHANNEL_ID_INCONSISTENCY = new LinkCoreError(-30001, 0L, "The channel id is not inconsistency with the link.");
    public static final LinkCoreError APPLY_IN_WAITING_STATE = new LinkCoreError(-30002, 0L, "Can not apply in waiting state, the apply request is sent or invite message has received.");
    public static final LinkCoreError INVITE_WITH_INVALID_UID = new LinkCoreError(-40001, 0L, "Can not invite user, because the user id is invalid.");
    public static final LinkCoreError INVITE_SENT_TARGET_USER = new LinkCoreError(-40002, 0L, "Invite sent to target user.");
    public static final LinkCoreError CANCEL_INVITE_BUT_NOT_INVITED = new LinkCoreError(-40003, 0L, "Users not invited but got canceled.");
    public static final LinkCoreError CANCEL_APPLY_BUT_NOT_APPLIED = new LinkCoreError(-40004, 0L, "Users not applied but got canceled.");
    public static final LinkCoreError REPLY_INVITE_BUT_NO_INVITE_MESSAGE = new LinkCoreError(-40005, 0L, "Users not invited but got replied.");
    public static final LinkCoreError PERMIT_APPLY_BUT_NO_APPLY_MESSAGE = new LinkCoreError(-40006, 0L, "Users not applied but got permitted");
    public static final LinkCoreError CHANNEL_ALREADY_ALLOCATED = new LinkCoreError(-50001, 0L, "Linker should only bind one channel Id.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_STATE_ERROR = new LinkCoreError(-70001, 0L, "Can not join rtc channel in this state.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_INVALID = new LinkCoreError(-70002, 0L, "Current user can not join rtc because the rtc extra info or the linkmicid is not required.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_INIT_ERROR = new LinkCoreError(-70003, 0L, "RTC turn on error cause invalid param.");
    public static final LinkCoreError RTC_INITIALIZED_BY_ONE_CHANNEL = new LinkCoreError(-80001, 0L, "RTC is already initialized by one channel.");
    public static final LinkCoreError RTC_TURN_ON_ERROR = new LinkCoreError(-80002, 0L, "RTC turn on error cause invalid param.");
    public static final LinkCoreError RTC_INIT_BACKGROUND = new LinkCoreError(-80003, 0L, "RTC turn on error cause init in background.");
    public static final LinkCoreError RTC_INIT_ENGINE_ERROR = new LinkCoreError(-80004, 0L, "RTC turn on error cause create engine error.");
    public static final LinkCoreError RTC_REINIT_ERROR = new LinkCoreError(-80005, 0L, "RTC turn on error cause create engine error.");
    public static final LinkCoreError RTC_URL_DISPATCH_ERROR = new LinkCoreError(-80006, 0L, "RTC turn on error cause url dispatch.");
    public static final LinkCoreError RTC_HAS_INITIALIZED = new LinkCoreError(-80007, 0L, "RTC has been initialized, don't repeat the initialization.");
    public static final LinkCoreError BLOCK_BY_BIZ_SIDE = new LinkCoreError(-90001, 0L, "Block by biz side");
    public static final LinkCoreError BLOCK_BY_RUST_ERROR = new LinkCoreError(-90011, 0L, "Block by rust init error");

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkCoreError(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.subCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final LinkCoreError getAPPLY_IN_WAITING_STATE() {
            return LinkCoreError.APPLY_IN_WAITING_STATE;
        }

        public final LinkCoreError getBLOCK_BY_BIZ_SIDE() {
            return LinkCoreError.BLOCK_BY_BIZ_SIDE;
        }

        public final LinkCoreError getBLOCK_BY_RUST_ERROR() {
            return LinkCoreError.BLOCK_BY_RUST_ERROR;
        }

        public final LinkCoreError getCANCEL_APPLY_BUT_NOT_APPLIED() {
            return LinkCoreError.CANCEL_APPLY_BUT_NOT_APPLIED;
        }

        public final LinkCoreError getCANCEL_INVITE_BUT_NOT_INVITED() {
            return LinkCoreError.CANCEL_INVITE_BUT_NOT_INVITED;
        }

        public final LinkCoreError getCHANNEL_ALREADY_ALLOCATED() {
            return LinkCoreError.CHANNEL_ALREADY_ALLOCATED;
        }

        public final LinkCoreError getCHANNEL_ID_INCONSISTENCY() {
            return LinkCoreError.CHANNEL_ID_INCONSISTENCY;
        }

        public final LinkCoreError getCHANNEL_ID_INVALID() {
            return LinkCoreError.CHANNEL_ID_INVALID;
        }

        public final LinkCoreError getCOMMON_RESPONSE_INVALID() {
            return LinkCoreError.COMMON_RESPONSE_INVALID;
        }

        public final LinkCoreError getCOMMON_UNKNOWN() {
            return LinkCoreError.COMMON_UNKNOWN;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_INIT_ERROR() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_INIT_ERROR;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_INVALID() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_INVALID;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_STATE_ERROR() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_STATE_ERROR;
        }

        public final LinkCoreError getINVITE_SENT_TARGET_USER() {
            return LinkCoreError.INVITE_SENT_TARGET_USER;
        }

        public final LinkCoreError getINVITE_WITH_INVALID_UID() {
            return LinkCoreError.INVITE_WITH_INVALID_UID;
        }

        public final LinkCoreError getPERMIT_APPLY_BUT_NO_APPLY_MESSAGE() {
            return LinkCoreError.PERMIT_APPLY_BUT_NO_APPLY_MESSAGE;
        }

        public final LinkCoreError getREPLY_INVITE_BUT_NO_INVITE_MESSAGE() {
            return LinkCoreError.REPLY_INVITE_BUT_NO_INVITE_MESSAGE;
        }

        public final LinkCoreError getRTC_HAS_INITIALIZED() {
            return LinkCoreError.RTC_HAS_INITIALIZED;
        }

        public final LinkCoreError getRTC_INITIALIZED_BY_ONE_CHANNEL() {
            return LinkCoreError.RTC_INITIALIZED_BY_ONE_CHANNEL;
        }

        public final LinkCoreError getRTC_INIT_BACKGROUND() {
            return LinkCoreError.RTC_INIT_BACKGROUND;
        }

        public final LinkCoreError getRTC_INIT_ENGINE_ERROR() {
            return LinkCoreError.RTC_INIT_ENGINE_ERROR;
        }

        public final LinkCoreError getRTC_REINIT_ERROR() {
            return LinkCoreError.RTC_REINIT_ERROR;
        }

        public final LinkCoreError getRTC_TURN_ON_ERROR() {
            return LinkCoreError.RTC_TURN_ON_ERROR;
        }

        public final LinkCoreError getRTC_URL_DISPATCH_ERROR() {
            return LinkCoreError.RTC_URL_DISPATCH_ERROR;
        }

        public final LinkCoreError getSUCCESS() {
            return LinkCoreError.SUCCESS;
        }
    }

    public LinkCoreError(int i, Long l, String str) {
        this.errorCode = i;
        this.subCode = l;
        this.errorMsg = str;
    }
}
