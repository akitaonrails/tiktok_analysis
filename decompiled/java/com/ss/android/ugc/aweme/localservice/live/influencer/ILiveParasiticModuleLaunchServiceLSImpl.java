package com.ss.android.ugc.aweme.localservice.live.influencer;

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
public final class ILiveParasiticModuleLaunchServiceLSImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        InterfaceC756790TmP interfaceC756790TmPJ6;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC756790TmPJ6 = iLiveOuterService.j6()) == null) {
            return;
        }
        interfaceC756790TmPJ6.registerSlot(new InterfaceC1123960fM2() { // from class: X.0Tmo
            @Override // X.InterfaceC1123960fM2
            public final String LIZ() {
                return "local_service_live_influencer";
            }

            @Override // X.InterfaceC1123960fM2
            public final List<EnumC756810TmR> LIZIZ() {
                return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR);
            }

            @Override // X.InterfaceC1123960fM2
            public final List<EnumC1124020fM8> LIZJ() {
                return C1697810uHb.LJIILJJIL(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR);
            }

            @Override // X.InterfaceC1123960fM2
            public final /* bridge */ /* synthetic */ void LIZLLL() {
            }

            @Override // X.InterfaceC1123960fM2
            public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
                if (enumC756810TmR != null) {
                    int i = C757030Tmn.LIZ[enumC756810TmR.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            return new C1892420zLU();
                        }
                        return null;
                    }
                    return new C1892390zLR();
                }
                return null;
            }

            @Override // X.InterfaceC1123960fM2
            public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
                if (C757030Tmn.LIZIZ[enumC1124020fM8.ordinal()] == 1) {
                    return new C1892540zLg();
                }
                return null;
            }
        });
    }
}
