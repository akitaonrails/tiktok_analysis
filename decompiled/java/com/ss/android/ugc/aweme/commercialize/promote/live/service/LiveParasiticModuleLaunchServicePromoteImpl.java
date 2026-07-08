package com.ss.android.ugc.aweme.commercialize.promote.live.service;

import X.C1913140zsu;
import X.InterfaceC1123960fM2;
import X.InterfaceC756790TmP;
import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveParasiticModuleLaunchServicePromoteImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public void launch() {
        InterfaceC756790TmP interfaceC756790TmPJ6;
        InterfaceC756790TmP interfaceC756790TmPJ62;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC756790TmPJ62 = iLiveOuterService.j6()) != null) {
            interfaceC756790TmPJ62.registerSlot(new InterfaceC1123960fM2() { // from class: X.0Tmg
                @Override // X.InterfaceC1123960fM2
                public final String LIZ() {
                    return "PromoteLiveSlotProvider";
                }

                @Override // X.InterfaceC1123960fM2
                public final List<EnumC756810TmR> LIZIZ() {
                    return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_PROMOTE);
                }

                @Override // X.InterfaceC1123960fM2
                public final List<EnumC1124020fM8> LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC1123960fM2
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1123960fM2
                public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
                    return null;
                }

                @Override // X.InterfaceC1123960fM2
                public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
                    return new C1913110zsr(context);
                }
            });
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 == null || (interfaceC756790TmPJ6 = iLiveOuterService2.j6()) == null) {
            return;
        }
        interfaceC756790TmPJ6.registerSlot(new C1913140zsu());
    }
}
