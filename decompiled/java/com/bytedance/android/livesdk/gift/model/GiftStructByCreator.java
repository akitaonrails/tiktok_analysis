package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftStructByCreator {

    @C09CT("diamond_count")
    public int diamondCount;

    @C09CT("gift_label_icon")
    public ImageModel giftLabelIcon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_box_gift")
    public boolean isBoxGift;

    @C09CT("preview_image")
    public ImageModel previewImage;

    @C09CT("scheme_info")
    public GiftStructByCreatorSchemeInfo schemeInfo;

    @C09CT("type")
    public int type;

    @C09CT("name")
    public String name = "";

    @C09CT("gift_panel_cardlets")
    public List<GiftPanelCardletByCreator> giftPanelCardlets = new ArrayList();

    @C09CT("coins_text")
    public String coinsText = "";
}
