package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import X.C1477305qN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstructMessageContentPbApi implements IConstructMessageContentPbApi {
    public static final ConstructMessageContentPbApi LIZIZ = new ConstructMessageContentPbApi();
    public final /* synthetic */ IConstructMessageContentPbApi LIZ = (IConstructMessageContentPbApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1477305qN.LIZJ).build().retrofit.LIZ(IConstructMessageContentPbApi.class);

    @Override // com.ss.android.ugc.aweme.im.sdk.common.data.service.IConstructMessageContentPbApi
    @InterfaceC1501160pAQ("im/construct_message_content_pb")
    public Object constructMessageContentPb(@InterfaceC1501070pAH("message_type") int i, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str, @InterfaceC1501070pAH("business_id") String str2, @InterfaceC1501070pAH("im_params") String str3, InterfaceC1364105Vn<? super ConstructMessageContentPbResponse> interfaceC1364105Vn) {
        return this.LIZ.constructMessageContentPb(i, str, str2, str3, interfaceC1364105Vn);
    }
}
