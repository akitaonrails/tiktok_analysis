package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAssetsResponse;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDynamicSettingResult;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult;

/* JADX INFO: loaded from: classes7.dex */
public interface SocialAvatarCreationApi {
    @InterfaceC1501170pAR("/tiktok/v1/social_avatar/like/commit")
    Object commitSocialAvatarLikeAction(@InterfaceC1485405rg SocialAvatarLikeRequest socialAvatarLikeRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/social_avatar/generate")
    Object createSocialAvatar(@InterfaceC1485405rg SocialAvatarCreateRequest socialAvatarCreateRequest, InterfaceC1364105Vn<? super SocialAvatarCreateResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/social_avatar/sticker_animation_tasks/create")
    Object createStickerAnimationTask(@InterfaceC1485405rg StickerAnimationCreateRequest stickerAnimationCreateRequest, InterfaceC1364105Vn<? super StickerAnimationCreateResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/entrances/status")
    Object getSocialAvatarDynamicEntranceStatus(InterfaceC1364105Vn<? super SocialAvatarDynamicSettingResult> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/assets")
    Object getSocialAvatarEffectAssets(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, InterfaceC1364105Vn<? super SocialAvatarAssetsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/like/status")
    Object getSocialAvatarLikeStatus(@InterfaceC1501070pAH("to_avatar_id") Long l, InterfaceC1364105Vn<? super SocialAvatarLikeStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/queue/stats")
    Object getSocialAvatarQueueStatus(InterfaceC1364105Vn<? super SocialAvatarQueueStatusResult> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/progress")
    Object getSocialAvatarTaskProgress(@InterfaceC1501070pAH("task_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, InterfaceC1364105Vn<? super SocialAvatarTaskProgressResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/status")
    Object getSocialAvatarTaskStatus(@InterfaceC1501070pAH("task_id") String str, InterfaceC1364105Vn<? super SocialAvatarTaskStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/sticker_animation_tasks")
    Object listStickerAnimationTasks(InterfaceC1364105Vn<? super StickerAnimationTasksListResponse> interfaceC1364105Vn);
}
