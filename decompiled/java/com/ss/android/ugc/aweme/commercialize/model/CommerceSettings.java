package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public class CommerceSettings extends BaseResponse {

    @C09CT("avatar_decoration_enabled")
    public boolean avatarDecorationEnable;

    @C09CT("avatar_decoration_url")
    public String avatarDecorationUrl;

    @C09CT("aweme_post_ad")
    public NonstandardAdStruct awemePostAd;

    @C09CT("douplus_native_scene_period")
    public int douplusNativeScenePeriod;

    @C09CT("douplus_native_scene_switch")
    public boolean douplusNativeSceneSwitch;

    @C09CT("douplus_toast")
    public DouplusToastStruct douplusToast;

    @C09CT("music_list_ads")
    public MusicListAdStruct[] musicListAd;
}
