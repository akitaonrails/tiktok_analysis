package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftIconGuideInfo {

    @C09CT("click_action")
    public int clickAction;

    @C09CT("clickable")
    public boolean clickable;

    @C09CT("locate_gift_id")
    public long locateGiftId;

    @C09CT("switch_page_type")
    public int switchPageType;

    @C09CT("guide_id")
    public String guideId = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("text")
    public String text = "";

    @C09CT("open_page_url")
    public String openPageUrl = "";

    @C09CT("open_client_page_url")
    public String openClientPageUrl = "";
}
