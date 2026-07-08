package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request;

import X.AbstractC19484711Kz;
import X.C568020MPo;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.CelebrationMaterialResponse;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.RecentCelebrationResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface ICelebrationRequestApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/story/celebration/report/v1")
    Object reportCelebrationEvent(@InterfaceC1501050pAF("celebration_type") int i, @InterfaceC1501050pAF("behavior") int i2, InterfaceC1364105Vn<? super C568020MPo> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/story/user/celebration_materials")
    AbstractC19484711Kz<CelebrationMaterialResponse> requestCelebrationMaterial(@InterfaceC1501070pAH("celebration_material_scene") int i, @InterfaceC1501070pAH("celebration_type") int i2, @InterfaceC1501070pAH("use_aweme_cache") Boolean bool, @InterfaceC1501070pAH("aweme_caches") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/story/user/recent_celebrations")
    AbstractC19484711Kz<RecentCelebrationResponse> requestRecentCelebration(@InterfaceC1501070pAH("scenario") int i);
}
