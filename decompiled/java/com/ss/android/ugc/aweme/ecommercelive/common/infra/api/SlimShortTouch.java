package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CT;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;

/* JADX INFO: loaded from: classes.dex */
public final class SlimShortTouch {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("anime_type")
    public int animeType;

    @C09CT("icon_skin")
    public String iconSkin;

    @C09CT("name")
    public final String name;

    @C09CT("preview_setting")
    public final ShortTouchPreviewSetting previewSetting;

    @C09CT("schema")
    public final String schema;

    public SlimShortTouch() {
        this(-1, null, null, null, null, null);
    }

    public SlimShortTouch(int i, String str, String str2, ShortTouchPreviewSetting shortTouchPreviewSetting, String str3, String str4) {
        this.animeType = i;
        this.name = str;
        this.schema = str2;
        this.previewSetting = shortTouchPreviewSetting;
        this.iconSkin = str3;
        this.activityId = str4;
    }
}
