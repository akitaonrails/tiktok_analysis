package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyInviteData {
    public static final Companion Companion = new Companion();
    public final BizReplyParams bizReplyParams;
    public final Map<String, Object> coHostData;
    public final long inviteOperatorUid;
    public final LiveRoomUser inviter;
    public final int replyStatus;

    public static final class Builder {
        public BizReplyParams bizReplyParams;
        public Map<String, ? extends Object> coHostData;
        public long inviteOperatorUid;
        public final LiveRoomUser inviter;
        public int replyStatus;

        public final ReplyInviteData build() {
            return new ReplyInviteData(this);
        }

        public final BizReplyParams getBizReplyParams() {
            return this.bizReplyParams;
        }

        public final Map<String, Object> getCoHostData() {
            return this.coHostData;
        }

        public final long getInviteOperatorUid() {
            return this.inviteOperatorUid;
        }

        public final LiveRoomUser getInviter() {
            return this.inviter;
        }

        public final int getReplyStatus() {
            return this.replyStatus;
        }

        public Builder(LiveRoomUser liveRoomUser) {
            this.inviter = liveRoomUser;
        }

        public final void setBizReplyParams(BizReplyParams bizReplyParams) {
            this.bizReplyParams = bizReplyParams;
        }

        public final void setCoHostData(Map<String, ? extends Object> map) {
            this.coHostData = map;
        }

        public final void setInviteOperatorUid(long j) {
            this.inviteOperatorUid = j;
        }

        public final void setReplyStatus(int i) {
            this.replyStatus = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyInviteData(replyStatus=");
        sbLIZ.append(this.replyStatus);
        sbLIZ.append(", bizReplyParams=");
        sbLIZ.append(this.bizReplyParams);
        sbLIZ.append(", coHostData=");
        sbLIZ.append(this.coHostData);
        sbLIZ.append(", inviter=");
        sbLIZ.append(this.inviter);
        sbLIZ.append(", inviteOperatorUid=");
        sbLIZ.append(this.inviteOperatorUid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReplyInviteData(Builder builder) {
        this(builder.getReplyStatus(), builder.getBizReplyParams(), builder.getCoHostData(), builder.getInviter(), builder.getInviteOperatorUid());
    }

    public static final class Companion {
        public final ReplyInviteData build(LiveRoomUser liveRoomUser, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public ReplyInviteData(int i, BizReplyParams bizReplyParams, Map<String, ? extends Object> map, LiveRoomUser liveRoomUser, long j) {
        this.replyStatus = i;
        this.bizReplyParams = bizReplyParams;
        this.coHostData = map;
        this.inviter = liveRoomUser;
        this.inviteOperatorUid = j;
    }
}
