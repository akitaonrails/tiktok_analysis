package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveRoomUser {
    public static final Companion Companion = new Companion();
    public String linkMicId;
    public final long roomId;
    public final long userId;

    public static final class Builder {
        public long roomId = -1;
        public long userId = -1;
        public String linkMicId = "";

        public final LiveRoomUser build() {
            return new LiveRoomUser(this);
        }

        public final String getLinkMicId() {
            return this.linkMicId;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setLinkMicId(String str) {
            this.linkMicId = str;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRoomUser(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.linkMicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final LiveRoomUser build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public LiveRoomUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getLinkMicId());
    }

    public final void setLinkMicId(String str) {
        this.linkMicId = str;
    }

    public LiveRoomUser(long j, long j2, String str) {
        this.roomId = j;
        this.userId = j2;
        this.linkMicId = str;
    }
}
