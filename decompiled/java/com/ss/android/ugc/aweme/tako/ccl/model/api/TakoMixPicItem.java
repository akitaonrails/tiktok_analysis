package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixPicItem {

    @C09CT("tako_brand_pic")
    public final TakoMixBrandPic brandPic;

    @C09CT("image_action")
    public final ImageAction imageAction;

    @C09CT("insite_pic_text")
    public final TakoMixInsitePic insitePic;

    @C09CT("insite_keyframe")
    public final TakoMixKeyFramePic keyFramePic;

    @C09CT("lemon8_pic_text")
    public final TakoMixLemon8Pic lemon8Pic;

    @C09CT("op_push_pic")
    public final TakoMixOpPushPic opPushPic;

    @C09CT("outsite_pic")
    public final TakoMixOutsitePic outsitePic;

    @C09CT("pic_type")
    public final int type;

    public TakoMixPicItem() {
        this(-1, null, null, null, null, null, null, null);
    }

    public TakoMixPicItem(int i, TakoMixInsitePic takoMixInsitePic, TakoMixLemon8Pic takoMixLemon8Pic, TakoMixKeyFramePic takoMixKeyFramePic, TakoMixOutsitePic takoMixOutsitePic, TakoMixOpPushPic takoMixOpPushPic, TakoMixBrandPic takoMixBrandPic, ImageAction imageAction) {
        this.type = i;
        this.insitePic = takoMixInsitePic;
        this.lemon8Pic = takoMixLemon8Pic;
        this.keyFramePic = takoMixKeyFramePic;
        this.outsitePic = takoMixOutsitePic;
        this.opPushPic = takoMixOpPushPic;
        this.brandPic = takoMixBrandPic;
        this.imageAction = imageAction;
    }
}
