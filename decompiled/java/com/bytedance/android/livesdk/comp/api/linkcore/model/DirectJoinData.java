package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class DirectJoinData {
    public static final Companion Companion = new Companion();
    public final BizJoinDirectParams bizJoinDirectParams;
    public final long channelId;
    public final LiveRoomUser self;

    public static final class Builder {
        public BizJoinDirectParams bizJoinDirectParams;
        public long channelId;
        public final LiveRoomUser self;

        public final DirectJoinData build() {
            return new DirectJoinData(this);
        }

        public final BizJoinDirectParams getBizJoinDirectParams() {
            return this.bizJoinDirectParams;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final LiveRoomUser getSelf() {
            return this.self;
        }

        public Builder(LiveRoomUser liveRoomUser) {
            this.self = liveRoomUser;
        }

        public final void setBizJoinDirectParams(BizJoinDirectParams bizJoinDirectParams) {
            this.bizJoinDirectParams = bizJoinDirectParams;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectJoinData(channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", self=");
        sbLIZ.append(this.self);
        sbLIZ.append(", bizJoinDirectParams=");
        sbLIZ.append(this.bizJoinDirectParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DirectJoinData(Builder builder) {
        this(builder.getChannelId(), builder.getSelf(), builder.getBizJoinDirectParams());
    }

    public static final class Companion {
        public final DirectJoinData build(LiveRoomUser liveRoomUser, Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder(liveRoomUser);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public DirectJoinData(long j, LiveRoomUser liveRoomUser, BizJoinDirectParams bizJoinDirectParams) {
        this.channelId = j;
        this.self = liveRoomUser;
        this.bizJoinDirectParams = bizJoinDirectParams;
    }
}
