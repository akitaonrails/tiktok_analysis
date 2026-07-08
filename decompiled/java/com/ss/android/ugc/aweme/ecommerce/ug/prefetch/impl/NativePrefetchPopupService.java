package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.impl;

import X.C0CNO;
import X.C15O7;
import X.C1740040vNi;
import X.C2539909xN;
import X.C2540009xO;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.popup.libra.NativePrefetchPopUpExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes27.dex */
public final class NativePrefetchPopupService implements INativePrefetchPopupService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final int LIZJ() {
        C2539909xN.LIZ.getClass();
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIILLIIL(Integer.valueOf(C2539909xN.LIZIZ)) != 0 ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final boolean LIZLLL() {
        C1740040vNi.LIZ.getClass();
        return C1740040vNi.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final boolean LJ() {
        C1740040vNi.LIZ.getClass();
        C2540009xO.LIZ.getClass();
        if (((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIILLIIL(Integer.valueOf(C2540009xO.LIZIZ)) != 0) {
            return C1740040vNi.LIZIZ.enablePopUpNativePrefetch;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final int LIZIZ() {
        return NativePrefetchPopUpExperiment.LIZ().enablePopUpTemplatePreDecode ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final List<String> LJFF() {
        return NativePrefetchPopUpExperiment.LIZ().readGlobalContextList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final String LJI() {
        return NativePrefetchPopUpExperiment.LIZ().popupRequestApi;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService
    public final void LIZ(Map map, DiversionTargetRes diversionTargetRes, AwS588S0100000_9 awS588S0100000_9, AwS570S0100000_26 awS570S0100000_26) {
        C1740040vNi.LIZ.getClass();
        C0CNO.LIZ(C15O7.LJI, new AwS154S0400000_26(map, diversionTargetRes, awS588S0100000_9, awS570S0100000_26, 18));
    }
}
