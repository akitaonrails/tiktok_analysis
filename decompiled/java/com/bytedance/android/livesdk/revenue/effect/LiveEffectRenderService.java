package com.bytedance.android.livesdk.revenue.effect;

import X.C1091160eV8;
import X.C243600ws;
import X.C255500yn;
import X.InterfaceC1091030eUv;
import X.InterfaceC1091200eVC;
import android.content.Context;
import android.os.Message;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.revenue.level.api.effect.ILiveEffectRenderService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
public class LiveEffectRenderService implements ILiveEffectRenderService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eV8] */
    @Override // com.bytedance.android.livesdk.revenue.level.api.effect.ILiveEffectRenderService
    public final C1091160eV8 TG(final DataChannel dataChannel, final InterfaceC1091200eVC interfaceC1091200eVC, final FrameLayout frameLayout, final Context context) {
        return new InterfaceC1091030eUv(dataChannel, interfaceC1091200eVC, frameLayout, context) { // from class: X.0eV8
            public final DataChannel LL;
            public final InterfaceC1091200eVC LLILLJJLI;
            public final FrameLayout LLILLL;
            public final Context LLILZ;
            public C1091180eVA LLILZIL;
            public C1091150eV7 LLILZLL;

            @Override // X.InterfaceC1091030eUv
            public final void release() {
                C1091180eVA c1091180eVA = this.LLILZIL;
                if (c1091180eVA != null) {
                    c1091180eVA.release();
                }
                this.LLILZIL = null;
            }

            @Override // X.InterfaceC1091030eUv
            public final void LIZ(C1091150eV7 c1091150eV7) {
                EnumC1091130eV5 enumC1091130eV5;
                C1091180eVA c1091180eVA = this.LLILZIL;
                if (c1091180eVA != null) {
                    EnumC1091130eV5 enumC1091130eV52 = c1091150eV7.LIZIZ;
                    C1091150eV7 c1091150eV72 = this.LLILZLL;
                    if (c1091150eV72 != null) {
                        enumC1091130eV5 = c1091150eV72.LIZIZ;
                    } else {
                        enumC1091130eV5 = null;
                    }
                    if (enumC1091130eV52 != enumC1091130eV5) {
                        c1091180eVA.release();
                    }
                }
                if (this.LLILZIL == null) {
                    int i = C1091140eV6.LIZ[c1091150eV7.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            final DataChannel dataChannel2 = this.LL;
                            final InterfaceC1091200eVC interfaceC1091200eVC2 = this.LLILLJJLI;
                            final FrameLayout frameLayout2 = this.LLILLL;
                            final Context context2 = this.LLILZ;
                            this.LLILZIL = new C1091180eVA(dataChannel2, interfaceC1091200eVC2, frameLayout2, context2) { // from class: X.0eV9
                                public final ILiveGiftDelegatePlayerService LLILZLL = (ILiveGiftDelegatePlayerService) C1161920gLG.LIZJ(ILiveGiftDelegatePlayerService.class);
                                public Object LLIZ;

                                @Override // X.C1091180eVA, X.InterfaceC1091030eUv
                                public final void release() {
                                    this.LLILZIL.removeMessages(1002);
                                    this.LLILZIL.removeMessages(1003);
                                    ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LLILZLL;
                                    if (iLiveGiftDelegatePlayerService != null) {
                                        iLiveGiftDelegatePlayerService.releasePlayer(this.LLIZ, null, this.LLILLL);
                                    }
                                    this.LLIZ = null;
                                }

                                @Override // X.C1091180eVA, X.InterfaceC1091030eUv
                                public final void LIZ(C1091150eV7 c1091150eV73) {
                                    InterfaceC1091200eVC interfaceC1091200eVC3 = this.LLILLJJLI;
                                    if (interfaceC1091200eVC3 != null) {
                                        interfaceC1091200eVC3.LIZIZ();
                                    }
                                }

                                @Override // android.os.Handler.Callback
                                public final boolean handleMessage(Message message) {
                                    int i2 = message.what;
                                    if (i2 != 1002) {
                                        if (i2 == 1003) {
                                            release();
                                            return false;
                                        }
                                        return false;
                                    }
                                    ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.LLILZLL;
                                    if (iLiveGiftDelegatePlayerService != null) {
                                        iLiveGiftDelegatePlayerService.tryCancel(this.LLIZ);
                                    }
                                    ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = this.LLILZLL;
                                    if (iLiveGiftDelegatePlayerService2 == null) {
                                        return false;
                                    }
                                    iLiveGiftDelegatePlayerService2.clearMasks(this.LLIZ);
                                    return false;
                                }
                            };
                        }
                    } else {
                        this.LLILZIL = new C1091210eVD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
                    }
                }
                C1091180eVA c1091180eVA2 = this.LLILZIL;
                if (c1091180eVA2 != null) {
                    this.LLILZLL = c1091150eV7;
                    c1091180eVA2.LIZ(c1091150eV7);
                }
            }

            {
                this.LL = dataChannel;
                this.LLILLJJLI = interfaceC1091200eVC;
                this.LLILLL = frameLayout;
                this.LLILZ = context;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.effect.ILiveEffectRenderService
    public final void u91(DataChannel dataChannel, boolean z, boolean z2, String str) {
        String str2;
        String strLIZ = C243600ws.LIZ(str);
        if (z) {
            str2 = "low_device";
        } else {
            str2 = "gecko_channel_unready";
        }
        C255500yn.LIZIZ(10001, dataChannel, str, strLIZ, str2, z2);
    }
}
