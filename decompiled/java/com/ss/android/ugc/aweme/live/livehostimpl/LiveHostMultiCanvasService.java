package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0CHQ;
import X.C1445850njD;
import X.C196991125l;
import X.C500260Jjc;
import X.EnumC20228014Cw;
import X.InterfaceC397701gd;
import X.InterfaceC971680bOQ;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveHostMultiCanvasService implements IHostMultiCanvas {
    public C196991125l LL;

    @Override // com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas
    public final InterfaceC971680bOQ Eu1() {
        if (this.LL == null) {
            this.LL = new C196991125l();
        }
        C196991125l c196991125l = this.LL;
        return c196991125l != null ? c196991125l : new C196991125l();
    }

    @Override // com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas
    public final InterfaceC397701gd yn2() {
        return new InterfaceC397701gd() { // from class: X.125r
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(470));

            @Override // X.InterfaceC397701gd
            public final Gson getGson() {
                return C2346409Hi.LIZ;
            }

            @Override // X.InterfaceC397701gd
            public final void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener) {
                InterfaceC1635390sev interfaceC1635390sev;
                if (effect != null && (interfaceC1635390sev = (InterfaceC1635390sev) this.LIZ.getValue()) != null) {
                    interfaceC1635390sev.LJIIL(effect, iFetchEffectListener);
                }
            }

            @Override // X.InterfaceC397701gd
            public final void LJIILIIL(List list, Map map, C396901gV c396901gV) {
                InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) this.LIZ.getValue();
                if (interfaceC1635390sev != null) {
                    interfaceC1635390sev.LJIIJ(list, map, c396901gV);
                }
            }

            @Override // X.InterfaceC397701gd
            public final void LJIILJJIL(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
                InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) this.LIZ.getValue();
                if (interfaceC1635390sev != null) {
                    interfaceC1635390sev.LJI(str, z, iFetchEffectChannelListener);
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas
    public final View VY0(Context context, Function0<Unit> function0) {
        LiveIconView liveIconView = new LiveIconView(context, null);
        liveIconView.setIcon(R.drawable.c5j);
        C500260Jjc.LJLIIIL(2000L, liveIconView, new AwS608S0100000_29(function0, (Function0<Unit>) 135));
        return liveIconView;
    }

    @Override // com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas
    public final File fM2(String str, boolean z) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJJI(C1445850njD.LIZ, EnumC20228014Cw.NOTICE_BOARD_CACHE, str, z);
    }
}
