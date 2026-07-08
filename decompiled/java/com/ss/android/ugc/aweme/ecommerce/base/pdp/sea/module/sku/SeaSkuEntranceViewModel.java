package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.sku;

import X.C004I;
import X.C01GW;
import X.C034S;
import X.C04DB;
import X.C054G;
import X.C1066190dqr;
import X.C1120604Zw;
import X.C13LP;
import X.C1AQS;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuEntranceViewModel extends JediViewModel<SkuEntranceState> {
    public final SeaPdpViewModel LLILZIL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new SkuEntranceState(null, new Object());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public SeaSkuEntranceViewModel(SeaPdpViewModel seaPdpViewModel) {
        this.LLILZIL = seaPdpViewModel;
    }

    public final void hR2(ImageSelectData imageSelectData) {
        IECommerceHostService iECommerceHostService;
        String str;
        String uri;
        List<String> thumbUrls;
        boolean z;
        String name;
        if (imageSelectData.from == C04DB.SKU_ENTRANCE) {
            C01GW c01gw = C1066190dqr.LIZ;
            C054G c054g = this.LLILZIL.LLLLZLL;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Application application = ((IApplicationDependencyService) iECommerceHostService).getApplication();
            String productId = this.LLILZIL.getProductId();
            Image image = imageSelectData.image;
            if (image == null || (thumbUrls = image.getThumbUrls()) == null || (str = (String) C13LP.LJJJLL(thumbUrls)) == null) {
                str = "";
            }
            Image image2 = imageSelectData.image;
            if (image2 == null || (uri = image2.getUri()) == null) {
                uri = "";
            }
            C1066190dqr.LJ(c054g, application, productId, str, uri, true, false, null, false);
        }
        setState(new AwS580S0100000_1(imageSelectData, 239));
    }
}
