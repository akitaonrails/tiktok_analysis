package com.ss.android.ugc.aweme.commercialize.live.service;

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
public final class ILiveParasiticModuleLaunchServiceCommercializeImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        InterfaceC756790TmP interfaceC756790TmPJ6;
        InterfaceC756790TmP interfaceC756790TmPJ62;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC756790TmPJ62 = iLiveOuterService.j6()) != null) {
            interfaceC756790TmPJ62.registerSlot(new InterfaceC1123960fM2() { // from class: X.0TmM
                @Override // X.InterfaceC1123960fM2
                public final String LIZ() {
                    return "commercialize_live_business_links";
                }

                @Override // X.InterfaceC1123960fM2
                public final List<EnumC756810TmR> LIZIZ() {
                    return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
                }

                @Override // X.InterfaceC1123960fM2
                public final List<EnumC1124020fM8> LIZJ() {
                    return C1697810uHb.LJIILJJIL(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP);
                }

                @Override // X.InterfaceC1123960fM2
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1123960fM2
                public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
                    if (enumC756810TmR != null) {
                        int i = C756770TmN.LIZIZ[enumC756810TmR.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    return new C757220Tn6();
                                }
                                return null;
                            }
                            return new C756260TlY();
                        }
                        return new C756230TlV();
                    }
                    return null;
                }

                @Override // X.InterfaceC1123960fM2
                public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
                    if (enumC1124020fM8 != null && C756770TmN.LIZ[enumC1124020fM8.ordinal()] == 1) {
                        return new C757270TnB();
                    }
                    return null;
                }
            });
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 == null || (interfaceC756790TmPJ6 = iLiveOuterService2.j6()) == null) {
            return;
        }
        interfaceC756790TmPJ6.registerSlot(new InterfaceC1123960fM2() { // from class: X.0Tm9
            @Override // X.InterfaceC1123960fM2
            public final String LIZ() {
                return "commercialize_live_ba_leads_gen";
            }

            @Override // X.InterfaceC1123960fM2
            public final List<EnumC756810TmR> LIZIZ() {
                return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
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
                if (enumC756810TmR != null) {
                    int i = C756640TmA.LIZ[enumC756810TmR.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new C756560Tm2();
                            }
                            return null;
                        }
                        return new C756400Tlm();
                    }
                    return new C756110TlJ();
                }
                return null;
            }
        });
    }
}
