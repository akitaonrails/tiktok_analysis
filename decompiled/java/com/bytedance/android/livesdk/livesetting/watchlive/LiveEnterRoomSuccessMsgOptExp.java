package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_enter_room_success_msg_opt_enable")
public final class LiveEnterRoomSuccessMsgOptExp {
    public static final LiveEnterRoomSuccessMsgOptExp INSTANCE = new LiveEnterRoomSuccessMsgOptExp();
    public static final LiveEnterRoomSuccessMsgOptConfig DEFAULT = new LiveEnterRoomSuccessMsgOptConfig(false, false, false, false, false, false, 0.05f, 0.02f, false, false, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(100));

    public static final boolean enableFirstFrameMsgOptForClickV2() {
        return INSTANCE.getValue().getEnableFirstFrameMsgForClickV2();
    }

    private final LiveEnterRoomSuccessMsgOptConfig getValue() {
        return (LiveEnterRoomSuccessMsgOptConfig) value$delegate.getValue();
    }

    public final boolean disableOptForPreviewEnterRoom() {
        return getValue().getDisableOptForPreviewEnterRoom();
    }

    public final boolean enableCoreMsgSentNotify() {
        return getValue().getEnableCoreMsgSentNotify();
    }

    public final boolean enableCoreMsgSentSkipLoadScatter() {
        return getValue().getEnableCoreMsgSentSkipLoadScatter();
    }

    public final boolean enableCoreMsgSentSkipUnloadScatter() {
        return getValue().getEnableCoreMsgSentSkipUnloadScatter();
    }

    public final boolean enableDirectFirstFrameMsgOnAttachConditional() {
        return getValue().getEnableFlushDirectFirstFrameMsgOnAttachConditional();
    }

    public final boolean enableEarlyEnterRoomForDraw() {
        return getValue().getEnableEarlyEnterRoomForDraw();
    }

    public final boolean enableEnterRoomMsgOptForClick() {
        return getValue().getEnableEnterRoomMsgForClick();
    }

    public final boolean enableFrameViewDoFrameCheck() {
        return getValue().getEnableFrameViewDoFrameCheck();
    }

    public final float prePullStreamScrollThreshold() {
        return getValue().getPrePullStreamScrollThreshold();
    }

    public final float scrollEnterRoomStartThreshold() {
        return getValue().getScrollEnterRoomStartThreshold();
    }

    public static final class LiveEnterRoomSuccessMsgOptConfig {
        public static final TypeAdapter ADAPTER = new LiveEnterRoomSuccessMsgOptExp_LiveEnterRoomSuccessMsgOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("disable_opt_for_preview_enter_room")
        public boolean disableOptForPreviewEnterRoom;

        @C09CT("enable_core_msg_sent_notify")
        public boolean enableCoreMsgSentNotify;

        @C09CT("enable_core_msg_sent_skip_load_scatter")
        public boolean enableCoreMsgSentSkipLoadScatter;

        @C09CT("enable_core_msg_sent_skip_unload_scatter")
        public boolean enableCoreMsgSentSkipUnloadScatter;

        @C09CT("enable_early_enter_room_for_draw")
        public boolean enableEarlyEnterRoomForDraw;

        @C09CT("enable_enter_room_msg_for_click")
        public boolean enableEnterRoomMsgForClick;

        @C09CT("enable_first_frame_msg_for_click_v2")
        public boolean enableFirstFrameMsgForClickV2;

        @C09CT("enable_flush_direct_first_frame_msg_on_attach_conditional")
        public boolean enableFlushDirectFirstFrameMsgOnAttachConditional;

        @C09CT("enable_frame_view_do_frame_check")
        public boolean enableFrameViewDoFrameCheck;

        @C09CT("pre_pull_stream_scroll_threshold")
        public float prePullStreamScrollThreshold;

        @C09CT("scroll_enter_room_start_threshold")
        public float scrollEnterRoomStartThreshold;

        public LiveEnterRoomSuccessMsgOptConfig() {
            this(false, false, false, false, false, false, 0.05f, 0.02f, false, false, false);
        }

        public final boolean getDisableOptForPreviewEnterRoom() {
            return this.disableOptForPreviewEnterRoom;
        }

        public final boolean getEnableCoreMsgSentNotify() {
            return this.enableCoreMsgSentNotify;
        }

        public final boolean getEnableCoreMsgSentSkipLoadScatter() {
            return this.enableCoreMsgSentSkipLoadScatter;
        }

        public final boolean getEnableCoreMsgSentSkipUnloadScatter() {
            return this.enableCoreMsgSentSkipUnloadScatter;
        }

        public final boolean getEnableEarlyEnterRoomForDraw() {
            return this.enableEarlyEnterRoomForDraw;
        }

        public final boolean getEnableEnterRoomMsgForClick() {
            return this.enableEnterRoomMsgForClick;
        }

        public final boolean getEnableFirstFrameMsgForClickV2() {
            return this.enableFirstFrameMsgForClickV2;
        }

        public final boolean getEnableFlushDirectFirstFrameMsgOnAttachConditional() {
            return this.enableFlushDirectFirstFrameMsgOnAttachConditional;
        }

        public final boolean getEnableFrameViewDoFrameCheck() {
            return this.enableFrameViewDoFrameCheck;
        }

        public final float getPrePullStreamScrollThreshold() {
            return this.prePullStreamScrollThreshold;
        }

        public final float getScrollEnterRoomStartThreshold() {
            return this.scrollEnterRoomStartThreshold;
        }

        public final void setDisableOptForPreviewEnterRoom(boolean z) {
            this.disableOptForPreviewEnterRoom = z;
        }

        public final void setEnableCoreMsgSentNotify(boolean z) {
            this.enableCoreMsgSentNotify = z;
        }

        public final void setEnableCoreMsgSentSkipLoadScatter(boolean z) {
            this.enableCoreMsgSentSkipLoadScatter = z;
        }

        public final void setEnableCoreMsgSentSkipUnloadScatter(boolean z) {
            this.enableCoreMsgSentSkipUnloadScatter = z;
        }

        public final void setEnableEarlyEnterRoomForDraw(boolean z) {
            this.enableEarlyEnterRoomForDraw = z;
        }

        public final void setEnableEnterRoomMsgForClick(boolean z) {
            this.enableEnterRoomMsgForClick = z;
        }

        public final void setEnableFirstFrameMsgForClickV2(boolean z) {
            this.enableFirstFrameMsgForClickV2 = z;
        }

        public final void setEnableFlushDirectFirstFrameMsgOnAttachConditional(boolean z) {
            this.enableFlushDirectFirstFrameMsgOnAttachConditional = z;
        }

        public final void setEnableFrameViewDoFrameCheck(boolean z) {
            this.enableFrameViewDoFrameCheck = z;
        }

        public final void setPrePullStreamScrollThreshold(float f) {
            this.prePullStreamScrollThreshold = f;
        }

        public final void setScrollEnterRoomStartThreshold(float f) {
            this.scrollEnterRoomStartThreshold = f;
        }

        public LiveEnterRoomSuccessMsgOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, float f, float f2, boolean z7, boolean z8, boolean z9) {
            this.enableEnterRoomMsgForClick = z;
            this.enableEarlyEnterRoomForDraw = z2;
            this.disableOptForPreviewEnterRoom = z3;
            this.enableFirstFrameMsgForClickV2 = z4;
            this.enableFrameViewDoFrameCheck = z5;
            this.enableFlushDirectFirstFrameMsgOnAttachConditional = z6;
            this.prePullStreamScrollThreshold = f;
            this.scrollEnterRoomStartThreshold = f2;
            this.enableCoreMsgSentNotify = z7;
            this.enableCoreMsgSentSkipLoadScatter = z8;
            this.enableCoreMsgSentSkipUnloadScatter = z9;
        }
    }

    public final LiveEnterRoomSuccessMsgOptConfig getDEFAULT() {
        return DEFAULT;
    }
}
