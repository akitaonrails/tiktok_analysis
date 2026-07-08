package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IConstructMessageContentPbApi {
    @InterfaceC1501160pAQ("im/construct_message_content_pb")
    Object constructMessageContentPb(@InterfaceC1501070pAH("message_type") int i, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str, @InterfaceC1501070pAH("business_id") String str2, @InterfaceC1501070pAH("im_params") String str3, InterfaceC1364105Vn<? super ConstructMessageContentPbResponse> interfaceC1364105Vn);
}
