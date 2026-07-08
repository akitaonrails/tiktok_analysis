package com.ss.android.ugc.profile.business.profile.background;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes20.dex */
public interface ProfileBgApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commit/user/")
    Object commitProfileBackground(@InterfaceC1501050pAF("profile_bg_type") int i, @InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("image_uri") String str2, @InterfaceC1501050pAF("offset_y_ratio") Float f, InterfaceC1364105Vn<? super CommitUserBgResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/aweme/post/")
    Object fetchUserPublicVideos(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("max_cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i2, @InterfaceC1501070pAH("filter_private") int i3, @InterfaceC1501070pAH("sec_user_id") String str2, InterfaceC1364105Vn<? super FeedItemList> interfaceC1364105Vn);
}
