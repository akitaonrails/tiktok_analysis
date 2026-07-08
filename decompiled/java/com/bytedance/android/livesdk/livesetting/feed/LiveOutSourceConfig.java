package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveOutSourceConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new LiveOutSourceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fix_delete_card")
    public boolean fixDeleteCard;

    @C09CT("fix_item_position")
    public boolean fixGetItemPos;

    @C09CT("fix_preview_stream")
    public boolean fixPreviewStream;

    public LiveOutSourceConfig() {
        this(true, true, true);
    }

    public final boolean getFixDeleteCard() {
        return this.fixDeleteCard;
    }

    public final boolean getFixGetItemPos() {
        return this.fixGetItemPos;
    }

    public final boolean getFixPreviewStream() {
        return this.fixPreviewStream;
    }

    public final void setFixDeleteCard(boolean z) {
        this.fixDeleteCard = z;
    }

    public final void setFixGetItemPos(boolean z) {
        this.fixGetItemPos = z;
    }

    public final void setFixPreviewStream(boolean z) {
        this.fixPreviewStream = z;
    }

    public LiveOutSourceConfig(boolean z, boolean z2, boolean z3) {
        this.fixDeleteCard = z;
        this.fixGetItemPos = z2;
        this.fixPreviewStream = z3;
    }
}
