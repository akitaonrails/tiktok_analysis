package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request;

import X.AbstractC19484711Kz;
import X.C0CQT;
import X.C568020MPo;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.CelebrationMaterialResponse;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.RecentCelebrationResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationRequestApi implements ICelebrationRequestApi {
    public static final CelebrationRequestApi LIZIZ = new CelebrationRequestApi();
    public final /* synthetic */ ICelebrationRequestApi LIZ = (ICelebrationRequestApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(ICelebrationRequestApi.class);

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.ICelebrationRequestApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/story/celebration/report/v1")
    public Object reportCelebrationEvent(@InterfaceC1501050pAF("celebration_type") int i, @InterfaceC1501050pAF("behavior") int i2, InterfaceC1364105Vn<? super C568020MPo> interfaceC1364105Vn) {
        return this.LIZ.reportCelebrationEvent(i, i2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.ICelebrationRequestApi
    @InterfaceC1501160pAQ("/tiktok/v1/story/user/celebration_materials")
    public AbstractC19484711Kz<CelebrationMaterialResponse> requestCelebrationMaterial(@InterfaceC1501070pAH("celebration_material_scene") int i, @InterfaceC1501070pAH("celebration_type") int i2, @InterfaceC1501070pAH("use_aweme_cache") Boolean bool, @InterfaceC1501070pAH("aweme_caches") String str) {
        return this.LIZ.requestCelebrationMaterial(i, i2, bool, str);
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.ICelebrationRequestApi
    @InterfaceC1501160pAQ("/tiktok/v1/story/user/recent_celebrations")
    public AbstractC19484711Kz<RecentCelebrationResponse> requestRecentCelebration(@InterfaceC1501070pAH("scenario") int i) {
        return this.LIZ.requestRecentCelebration(i);
    }
}
