package com.ss.android.ugc.aweme.userservice.jedi.model;

import X.C11NZ;
import X.C1908140zkq;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes29.dex */
public interface JediFollowApi {
    public static final C1908140zkq LIZ = C1908140zkq.LIZ;

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/aweme/v1/commit/follow/user/")
    C11NZ<FollowStatus> followWithRetrofitPost(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("sec_user_id") String str2, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("channel_id") int i2, @InterfaceC1501050pAF("from") Integer num, @InterfaceC1501050pAF("item_id") String str3, @InterfaceC1501050pAF("from_pre") Integer num2, @InterfaceC1501050pAF("rec_type") String str4, @InterfaceC1501050pAF("video_link_id") String str5, @InterfaceC1501050pAF("video_link_item_id") String str6, @InterfaceC1501050pAF("link_sharer") Integer num3);
}
