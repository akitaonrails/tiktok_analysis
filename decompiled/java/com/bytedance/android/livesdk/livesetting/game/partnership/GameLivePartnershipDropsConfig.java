package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLivePartnershipDropsConfig {
    public static final TypeAdapter ADAPTER = new GameLivePartnershipDropsConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("drops_card")
    public String dropsCard;

    @C09CT("drops_preview_show_cnt")
    public int dropsPreviewShowCnt;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_permanent_drops_share_item")
    public boolean enablePermanentDropsShareItem;

    @C09CT("preview_card")
    public String previewCard;

    public GameLivePartnershipDropsConfig() {
        this(false, "", "", 1, true);
    }

    public GameLivePartnershipDropsConfig(boolean z, String str, String str2, int i, boolean z2) {
        this.enable = z;
        this.dropsCard = str;
        this.previewCard = str2;
        this.dropsPreviewShowCnt = i;
        this.enablePermanentDropsShareItem = z2;
    }
}
