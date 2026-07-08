package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCreateRequest {

    @C09CT("extra")
    public final String extra;

    @C09CT("image_infos")
    public final List<SocialAvatarImageInfo> imageInfo;

    @C09CT("is_first_generation")
    public final Boolean isFirstGeneration;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public SocialAvatarCreateRequest(List<SocialAvatarImageInfo> list, Boolean bool, String str, Integer num) {
        this.imageInfo = list;
        this.isFirstGeneration = bool;
        this.extra = str;
        this.scene = num;
    }
}
