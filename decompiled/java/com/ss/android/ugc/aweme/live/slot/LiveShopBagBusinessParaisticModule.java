package com.ss.android.ugc.aweme.live.slot;

import X.InterfaceC756730TmJ;
import X.InterfaceC756790TmP;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.slot.LiveShopBagBusinessSlotWidget;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveShopBagBusinessParaisticModule implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        InterfaceC756790TmP interfaceC756790TmPJ6;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC756790TmPJ6 = iLiveOuterService.j6()) == null) {
            return;
        }
        interfaceC756790TmPJ6.registerAggregateSlot(new InterfaceC756730TmJ() { // from class: X.0TmH
            @Override // X.InterfaceC756730TmJ
            public final String LIZ() {
                return "aggregate_live_shop_bag_business";
            }

            @Override // X.InterfaceC756730TmJ
            public final List<EnumC756810TmR> LIZIZ() {
                return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
            }

            @Override // X.InterfaceC756730TmJ
            public final InterfaceC756750TmL<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LIZJ(EnumC756810TmR enumC756810TmR) {
                if (enumC756810TmR != null && C756720TmI.LIZ[enumC756810TmR.ordinal()] == 1) {
                    return new LiveShopBagBusinessSlotWidget();
                }
                return null;
            }
        });
    }
}
