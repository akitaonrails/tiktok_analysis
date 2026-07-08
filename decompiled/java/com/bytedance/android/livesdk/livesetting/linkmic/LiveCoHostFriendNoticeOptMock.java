package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_friend_notice_mock")
public final class LiveCoHostFriendNoticeOptMock {
    public static final LiveCoHostFriendNoticeOptMock INSTANCE = new LiveCoHostFriendNoticeOptMock();
    public static final MockParams DEFAULT = new MockParams(0, 60, 1);

    private final MockParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MockParams mockParams = DEFAULT;
        MockParams mockParams2 = (MockParams) settingsManager.getValueSafely("live_cohost_friend_notice_mock", mockParams);
        return mockParams2 != null ? mockParams2 : mockParams;
    }

    public final boolean enable() {
        return getValue().enable > 0;
    }

    public final int nextExecutionDelay() {
        return getValue().nextExecutionDelay;
    }

    public final int shouldRequestForTheNotice() {
        return getValue().shouldRequestForTheNotice;
    }

    public static final class MockParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("enable")
        public int enable;

        @C09CT("next_execution_delay")
        public int nextExecutionDelay;

        @C09CT("should_request_for_the_notice")
        public int shouldRequestForTheNotice;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter();
        }

        public MockParams() {
            this(0, 60, 1);
        }

        public MockParams(int i, int i2, int i3) {
            this.enable = i;
            this.nextExecutionDelay = i2;
            this.shouldRequestForTheNotice = i3;
        }
    }
}
