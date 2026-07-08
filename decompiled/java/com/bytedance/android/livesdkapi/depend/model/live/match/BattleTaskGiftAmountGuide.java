package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTaskGiftAmountGuide {

    @C09CT("disappear_duration")
    public int disappearDuration = 5;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("guide_content")
    public Text guideContent;

    @C09CT("guide_prompt")
    public BattlePrompt guidePrompt;

    @C09CT("icon_image")
    public ImageModel iconImage;

    @C09CT("prompt_type")
    public int promptType;

    @C09CT("recommend_gift_count")
    public int recommendGiftCount;

    @C09CT("recommend_gift_id")
    public long recommendGiftId;
}
