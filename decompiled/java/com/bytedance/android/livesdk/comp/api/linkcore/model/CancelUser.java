package com.bytedance.android.livesdk.comp.api.linkcore.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public final class CancelUser {
    public static final Companion Companion = new Companion();
    public Long actionId;
    public Long channelId;
    public int playType;
    public final long roomId;
    public final long userId;

    public static final class Builder {
        public Long actionId;
        public Long channelId;
        public int playType;
        public long roomId;
        public long userId;

        public final CancelUser build() {
            return new CancelUser(this);
        }

        public final Long getActionId() {
            return this.actionId;
        }

        public final Long getChannelId() {
            return this.channelId;
        }

        public final int getPlayType() {
            return this.playType;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setActionId(Long l) {
            this.actionId = l;
        }

        public final void setChannelId(Long l) {
            this.channelId = l;
        }

        public final void setPlayType(int i) {
            this.playType = i;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    public static final class Companion {
        public final CancelUser build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public CancelUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getPlayType(), builder.getChannelId(), builder.getActionId());
    }

    public final void setActionId(Long l) {
        this.actionId = l;
    }

    public final void setChannelId(Long l) {
        this.channelId = l;
    }

    public final void setPlayType(int i) {
        this.playType = i;
    }

    public CancelUser(long j, long j2, int i, Long l, Long l2) {
        this.roomId = j;
        this.userId = j2;
        this.playType = i;
        this.channelId = l;
        this.actionId = l2;
    }
}
