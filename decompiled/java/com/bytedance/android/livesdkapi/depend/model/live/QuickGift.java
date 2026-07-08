package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class QuickGift {

    @C09CT("diamond_count")
    public long diamondCount;

    @C09CT("grey_image")
    public ImageModel greyImage;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_box_gift")
    public boolean isBoxGift;

    @C09CT("is_broadcast_gift")
    public boolean isBroadcastGift;

    @C09CT("is_effect_befview")
    public boolean isEffectBefview;

    @C09CT("name")
    public String name = "";

    @C09CT("primary_effect_id")
    public long primaryEffectId;

    @C09CT("type")
    public long type;
}
