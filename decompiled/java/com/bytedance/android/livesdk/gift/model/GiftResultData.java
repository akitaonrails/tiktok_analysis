package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class GiftResultData {

    @C09CT("asset_bundle")
    public AssetBundle assetBundle;

    @C09CT("combo_count")
    public int comboCount;

    @C09CT("describe")
    public String describe;

    @C09CT("display_duration_ms")
    public long displayDurationMs;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("display_text_for_anchor")
    public Text displayTextForAnchor;

    @C09CT("display_text_for_audience")
    public Text displayTextForAudience;

    @C09CT("display_text_for_sender")
    public Text displayTextForSender;

    @C09CT("gift_asset")
    public AssetsModel giftAsset;

    @C09CT("gift_effect")
    public GiftEffect giftEffect;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gifts_in_box")
    public GiftsBoxInfo giftsInBox;

    @C09CT("group_count")
    public int groupCount;

    @C09CT("is_asset_bundle_gift")
    public boolean isAssetBundleGift;

    @C09CT("gift")
    public Gift mGift;

    @C09CT("tray_info")
    public GiftTrayInfo mTrayInfo;

    @C09CT("msg_id")
    public long msgId;

    @C09CT("repeat_count")
    public int repeatCount;

    @C09CT("tray_display_text")
    public Text trayDisplayText;
}
