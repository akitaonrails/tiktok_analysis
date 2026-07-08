package com.ss.android.ugc.aweme.live.slot;

import X.InterfaceC756730TmJ;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBusinessParasiticModule implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().registerAggregateSlot(new InterfaceC756730TmJ() { // from class: X.0TmG
            @Override // X.InterfaceC756730TmJ
            public final String LIZ() {
                return "aggregate_live_business";
            }

            @Override // X.InterfaceC756730TmJ
            public final List<EnumC756810TmR> LIZIZ() {
                return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR);
            }

            @Override // X.InterfaceC756730TmJ
            public final InterfaceC756750TmL<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LIZJ(EnumC756810TmR enumC756810TmR) {
                if (enumC756810TmR != null) {
                    int i = C756690TmF.LIZ[enumC756810TmR.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            return new C756830TmT(EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR);
                        }
                        return null;
                    }
                    return new C756830TmT(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR);
                }
                return null;
            }
        });
    }
}
