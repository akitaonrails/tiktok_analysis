package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_middle_and_long_touch_size_setting")
public final class LiveMiddleAndLongTouchSizeSetting {
    public static final SizeParams DEFAULT;
    public static final LiveMiddleAndLongTouchSizeSetting INSTANCE = new LiveMiddleAndLongTouchSizeSetting();
    public static final SizeParams value;

    public static final class SizeParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("long_height")
        public int longHeight;

        @C09CT("long_width")
        public int longWidth;

        @C09CT("middle_height")
        public int middleHeight;

        @C09CT("middle_width")
        public int middleWidth;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveMiddleAndLongTouchSizeSetting_SizeParams_OptTypeAdapter();
        }

        public SizeParams() {
            this(24, 96, 24, 106);
        }

        public SizeParams(int i, int i2, int i3, int i4) {
            this.middleHeight = i;
            this.middleWidth = i2;
            this.longHeight = i3;
            this.longWidth = i4;
        }
    }

    static {
        SizeParams sizeParams = new SizeParams(24, 96, 24, 106);
        DEFAULT = sizeParams;
        value = (SizeParams) SettingsManager.INSTANCE.getValueSafely("live_middle_and_long_touch_size_setting", sizeParams);
    }

    public final int longHeight() {
        SizeParams sizeParams = value;
        if (sizeParams != null) {
            return sizeParams.longHeight;
        }
        return -1;
    }

    public final int longWidth() {
        SizeParams sizeParams = value;
        if (sizeParams != null) {
            return sizeParams.longWidth;
        }
        return -1;
    }

    public final int middleHeight() {
        SizeParams sizeParams = value;
        if (sizeParams != null) {
            return sizeParams.middleHeight;
        }
        return -1;
    }

    public final int middleWidth() {
        SizeParams sizeParams = value;
        if (sizeParams != null) {
            return sizeParams.middleWidth;
        }
        return -1;
    }
}
