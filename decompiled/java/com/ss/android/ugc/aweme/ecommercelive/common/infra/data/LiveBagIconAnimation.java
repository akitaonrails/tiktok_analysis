package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveBagIconAnimation {

    @C09CT("animation_img_list")
    public final List<AnimImage> animationImgList;

    @C09CT("animation_item_list")
    public final List<LiveBagIconAnimationItem> animationItemList;

    @C09CT("animation_text_list")
    public final List<String> animationTextList;

    @C09CT("animation_type")
    public final Integer animationType;

    public LiveBagIconAnimation(Integer num, List<AnimImage> list, List<String> list2, List<LiveBagIconAnimationItem> list3) {
        this.animationType = num;
        this.animationImgList = list;
        this.animationTextList = list2;
        this.animationItemList = list3;
    }
}
