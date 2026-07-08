package com.ss.android.ugc.aweme.compliance.privacy.settings.video.api;

import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes.dex */
public final class RemoveTemplateApi {
    public static final RemoveTemplateApi LIZ = new RemoveTemplateApi();
    public static final RemoveTemplateDataApi LIZIZ = (RemoveTemplateDataApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(RemoveTemplateDataApi.class);

    public interface RemoveTemplateDataApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/templates/del/template")
        C11NZ<BaseResponse> postTemplateRemove(@InterfaceC1501050pAF("aid") String str, @InterfaceC1501050pAF("video_id") String str2, @InterfaceC1501050pAF("template_id") String str3, @InterfaceC1501050pAF("type") int i);
    }
}
