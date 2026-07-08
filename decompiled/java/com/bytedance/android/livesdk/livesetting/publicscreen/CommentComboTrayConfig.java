package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CommentComboTrayConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("comment_tray_dismiss_duration")
    public long commentComboTrayDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new CommentComboTrayConfig_OptTypeAdapter();
    }

    public CommentComboTrayConfig() {
        this(2000L);
    }

    public CommentComboTrayConfig(long j) {
        this.commentComboTrayDuration = j;
    }
}
