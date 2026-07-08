package com.ss.android.ugc.aweme.share.api;

import X.C0CQT;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C516601zo;
import X.C516801zq;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class RemoveTemplateApi {
    public static final RemoveTemplateApi LIZ = new RemoveTemplateApi();
    public static final RemoveTemplateDataApi LIZIZ = (RemoveTemplateDataApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(RemoveTemplateDataApi.class);

    public interface RemoveTemplateDataApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/templates/del/template")
        C11NZ<BaseResponse> postTemplateRemove(@InterfaceC1501050pAF("aid") String str, @InterfaceC1501050pAF("video_id") String str2, @InterfaceC1501050pAF("template_id") String str3, @InterfaceC1501050pAF("type") int i);
    }

    public static void LIZ(RemoveTemplateApi removeTemplateApi, Context context, String str, String str2, String str3, String str4, Function0 function0, int i) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        removeTemplateApi.getClass();
        LIZIZ.postTemplateRemove(str, str2, str3, 0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516601zo(function0, str4, context, 4), new C516801zq(context, str3, 8));
    }
}
