package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelApplyData {
    public static final Companion Companion = new Companion();
    public final BizCancelApplyParams bizCancelApplyParams;
    public final String reason;
    public final LiveRoomUser targetUser;

    public static final class Builder {
        public BizCancelApplyParams bizCancelApplyParams;
        public String reason;
        public LiveRoomUser targetUser;

        public final CancelApplyData build() {
            return new CancelApplyData(this);
        }

        public final BizCancelApplyParams getBizCancelApplyParams() {
            return this.bizCancelApplyParams;
        }

        public final String getReason() {
            return this.reason;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final void setBizCancelApplyParams(BizCancelApplyParams bizCancelApplyParams) {
            this.bizCancelApplyParams = bizCancelApplyParams;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelApplyData(reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", targetUser=");
        sbLIZ.append(this.targetUser);
        sbLIZ.append(", bizCancelApplyParams=");
        sbLIZ.append(this.bizCancelApplyParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final CancelApplyData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public CancelApplyData(Builder builder) {
        this(builder.getReason(), builder.getTargetUser(), builder.getBizCancelApplyParams());
    }

    public CancelApplyData(String str, LiveRoomUser liveRoomUser, BizCancelApplyParams bizCancelApplyParams) {
        this.reason = str;
        this.targetUser = liveRoomUser;
        this.bizCancelApplyParams = bizCancelApplyParams;
    }
}
