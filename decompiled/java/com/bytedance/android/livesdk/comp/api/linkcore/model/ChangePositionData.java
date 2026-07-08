package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public final class ChangePositionData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final OnLineMicInfo positionData;
    public final LiveRoomUser targetUser;

    public static final class Builder {
        public Map<String, String> customData;
        public OnLineMicInfo positionData;
        public LiveRoomUser targetUser;

        public final ChangePositionData build() {
            return new ChangePositionData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final OnLineMicInfo getPositionData() {
            return this.positionData;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setPositionData(OnLineMicInfo onLineMicInfo) {
            this.positionData = onLineMicInfo;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }
    }

    public static final class Companion {
        public final ChangePositionData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public ChangePositionData(Builder builder) {
        this(builder.getTargetUser(), builder.getPositionData(), builder.getCustomData());
    }

    public ChangePositionData(LiveRoomUser liveRoomUser, OnLineMicInfo onLineMicInfo, Map<String, String> map) {
        this.targetUser = liveRoomUser;
        this.positionData = onLineMicInfo;
        this.customData = map;
    }
}
