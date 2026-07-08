package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestNoticeboardEditorConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_width")
    public int canvasWidth;

    @C09CT("history_expire_time")
    public int historyExpireTime;

    @C09CT("history_max_count")
    public int historyMaxCount;

    @C09CT("template_max_count")
    public int templateMaxCount;

    @C09CT("template_preload_count")
    public int templatePreloadCount;

    @C09CT("template_quick_select_max_count")
    public int templateQuickSelectMaxCount;

    @C09CT("text_input_max_count")
    public int textInputMaxCount;

    @C09CT("text_sticker_count_limited")
    public int textStickerCountLimited;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestNoticeboardEditorConfig_OptTypeAdapter();
    }

    public MultiGuestNoticeboardEditorConfig() {
        this(60, 30, 30, 20, 720, 1280, 6, 20, 100);
    }

    public MultiGuestNoticeboardEditorConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.textInputMaxCount = i;
        this.historyMaxCount = i2;
        this.historyExpireTime = i3;
        this.textStickerCountLimited = i4;
        this.canvasWidth = i5;
        this.canvasHeight = i6;
        this.templatePreloadCount = i7;
        this.templateQuickSelectMaxCount = i8;
        this.templateMaxCount = i9;
    }
}
