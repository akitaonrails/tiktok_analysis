package com.bytedance.android.livesdk.broadcast;

import X.C1324600kZe;
import X.C1324720kZq;
import X.C20355014km;
import X.C500980Jkm;
import X.C786410Ut5;
import X.EnumC20429014wi;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SingleToolItemSelectorTestDialog extends LiveDialogFragment {
    public static C20355014km LL = null;
    public static C20355014km LLILLJJLI = null;
    public static C20355014km LLILLL = null;
    public static C20355014km LLILZ = null;
    public static C20355014km LLILZIL = null;
    public static C20355014km LLILZLL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswHELIOSKTY4Zxw6JiIgLBs8JykFPSo+GyAgLCwnJzcYLDwnDCwtJSA0";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hml);
        c500980Jkm.LIZJ = R.style.ajd;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR((C1324720kZq) view.findViewById(R.id.v39), LL, EnumC20429014wi.SHARED_BACKGROUND_EFFECT, AFwS221S0000000_31.get$arr$(79), AFwS276S0000000_31.get$arr$(31));
        MR((C1324720kZq) view.findViewById(R.id.bo5), LLILLJJLI, EnumC20429014wi.BACKGROUND_EFFECT, AFwS221S0000000_31.get$arr$(80), AFwS276S0000000_31.get$arr$(32));
        MR((C1324720kZq) view.findViewById(R.id.ovk), LLILLL, EnumC20429014wi.MUSIC, AFwS221S0000000_31.get$arr$(81), AFwS276S0000000_31.get$arr$(33));
        MR((C1324720kZq) view.findViewById(R.id.voice_effect_icon), LLILZ, EnumC20429014wi.VOICE_EFFECT, AFwS221S0000000_31.get$arr$(82), AFwS276S0000000_31.get$arr$(34));
        MR((C1324720kZq) view.findViewById(R.id.se5), LLILZIL, EnumC20429014wi.PROPS, AFwS221S0000000_31.get$arr$(83), AFwS276S0000000_31.get$arr$(29));
        MR((C1324720kZq) view.findViewById(R.id.w5q), LLILZLL, EnumC20429014wi.STICKER_EFFECT, AFwS221S0000000_31.get$arr$(78), AFwS276S0000000_31.get$arr$(30));
    }

    public final void MR(final C1324720kZq c1324720kZq, C20355014km c20355014km, final EnumC20429014wi enumC20429014wi, final Function0<String> function0, final Function1<? super C20355014km, Unit> function1) {
        if (c20355014km != null && c20355014km.LIZIZ != null) {
            new C1324600kZe(c20355014km.LIZIZ).LIZ(c1324720kZq);
        } else {
            c1324720kZq.setImageResource(R.drawable.etw);
        }
        C786410Ut5.e8(c1324720kZq, new View.OnClickListener() { // from class: X.14vy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentManager fragmentManager;
                IEffectService iEffectServiceLJI = C781270Ukn.LJI();
                DataChannel dataChannel = this.LL.dataChannel;
                if (dataChannel != null) {
                    fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                } else {
                    fragmentManager = null;
                }
                String strInvoke = function0.invoke();
                EnumC20429014wi enumC20429014wi2 = enumC20429014wi;
                final Function1<C20355014km, Unit> function12 = function1;
                final C1324720kZq c1324720kZq2 = c1324720kZq;
                iEffectServiceLJI.openSingleToolSelectorDialog(fragmentManager, new C0UA2(strInvoke, enumC20429014wi2, new InterfaceC761540Tu4() { // from class: X.14vz
                    @Override // X.InterfaceC761540Tu4
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC761540Tu4
                    public final void LIZJ(C20355014km c20355014km2) {
                        function12.invoke(c20355014km2);
                        if (c20355014km2 == null) {
                            c1324720kZq2.setImageResource(R.drawable.etw);
                        } else {
                            new C1324600kZe(c20355014km2.LIZIZ).LIZ(c1324720kZq2);
                        }
                    }
                }));
            }
        });
    }
}
