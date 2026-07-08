package com.ss.android.ugc.aweme.framework.service;

import X.C757070Tmr;
import X.InterfaceC1123960fM2;
import X.InterfaceC756790TmP;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class ILiveParasiticModuleLaunchServiceMonetizationImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        ILiveOuterService iLiveOuterService;
        InterfaceC756790TmP interfaceC756790TmPJ6;
        if (C757070Tmr.LIZ() || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (interfaceC756790TmPJ6 = iLiveOuterService.j6()) == null) {
            return;
        }
        interfaceC756790TmPJ6.registerSlot(new InterfaceC1123960fM2() { // from class: X.0Tmq
            @Override // X.InterfaceC1123960fM2
            public final String LIZ() {
                return "live_paid_series";
            }

            @Override // X.InterfaceC1123960fM2
            public final List<EnumC756810TmR> LIZIZ() {
                return C1697810uHb.LJIILJJIL(EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR);
            }

            @Override // X.InterfaceC1123960fM2
            public final List<EnumC1124020fM8> LIZJ() {
                return C1697810uHb.LJIILJJIL(EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE, EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR);
            }

            @Override // X.InterfaceC1123960fM2
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1123960fM2
            public final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LJ(Context context, EnumC756810TmR enumC756810TmR) {
                if (enumC756810TmR != null) {
                    int i = C757050Tmp.LIZ[enumC756810TmR.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new C757100Tmu();
                            }
                            return null;
                        }
                        return new C757180Tn2();
                    }
                    return new C438601nE();
                }
                return null;
            }

            @Override // X.InterfaceC1123960fM2
            public final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> LJFF(Context context, EnumC1124020fM8 enumC1124020fM8) {
                if (enumC1124020fM8 != null) {
                    int i = C757050Tmp.LIZIZ[enumC1124020fM8.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            return new AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8>() { // from class: X.0iHA
                                public final C1236240iH8 LLILLL = new C1236240iH8(false);

                                @Override // X.InterfaceC1124060fMC
                                public final String LIZ() {
                                    this.LLILLL.getClass();
                                    return "live_paid_series";
                                }

                                @Override // X.InterfaceC1124060fMC
                                public final Object LLILZLL() {
                                    return this.LLILLL.LJJ();
                                }

                                @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                                public final List<Integer> getMessageType() {
                                    return this.LLILLL.getMessageType();
                                }

                                @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                                public final void onDestroy() {
                                    this.LLILLL.onDestroy();
                                }

                                @Override // X.InterfaceC1124060fMC
                                public final Enum LLJ() {
                                    return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
                                }

                                @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                                public final void onMessage(IMessage iMessage) {
                                    this.LLILLL.onMessage(iMessage);
                                }

                                @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                                public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
                                    this.LLILLL.LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
                                }

                                @Override // X.InterfaceC1124060fMC
                                public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
                                    this.LLILLL.prepareToShow(map, interfaceC756140TlM);
                                }
                            };
                        }
                        return null;
                    }
                    return new AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8>() { // from class: X.0iH9
                        public final C1236240iH8 LLILLL = new C1236240iH8(true);

                        @Override // X.InterfaceC1124060fMC
                        public final String LIZ() {
                            this.LLILLL.getClass();
                            return "live_paid_series";
                        }

                        @Override // X.InterfaceC1124060fMC
                        public final Object LLILZLL() {
                            return this.LLILLL.LJJ();
                        }

                        @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                        public final List<Integer> getMessageType() {
                            return this.LLILLL.getMessageType();
                        }

                        @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                        public final void onDestroy() {
                            this.LLILLL.onDestroy();
                        }

                        @Override // X.InterfaceC1124060fMC
                        public final Enum LLJ() {
                            return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
                        }

                        @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                        public final void onMessage(IMessage iMessage) {
                            this.LLILLL.onMessage(iMessage);
                        }

                        @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
                        public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
                            this.LLILLL.LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
                        }

                        @Override // X.InterfaceC1124060fMC
                        public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
                            this.LLILLL.prepareToShow(map, interfaceC756140TlM);
                        }
                    };
                }
                return null;
            }
        });
    }
}
