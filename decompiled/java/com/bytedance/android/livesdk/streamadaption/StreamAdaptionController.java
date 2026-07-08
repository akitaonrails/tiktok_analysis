package com.bytedance.android.livesdk.streamadaption;

import X.C0KBR;
import X.C1103204Te;
import X.C1126504at;
import X.C14EU;
import X.C1548820qPI;
import X.C1766006vq;
import X.C1871910yoP;
import X.EnumC1105670esX;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService;
import com.bytedance.android.livesdk.streamadaption.StreamAdaptionController;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamAdaptionController implements LifecycleEventObserver {
    public final DataChannel LL;
    public final EventBus LLILLJJLI;
    public final ILiveStreamAdaptConfigService LLILLL;
    public final C1766006vq LLILZ;

    public static EnumC1105670esX LIZ(InterfaceC1107590evd interfaceC1107590evd) {
        String strLJFF;
        EnumC1105670esX enumC1105670esX = null;
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "panel_business", "");
        } else {
            strLJFF = null;
        }
        Iterator<EnumC1105670esX> it2 = EnumC1105670esX.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            EnumC1105670esX next = it2.next();
            if (u.LJIJI(next.name(), strLJFF, true)) {
                enumC1105670esX = next;
                break;
            }
        }
        EnumC1105670esX enumC1105670esX2 = enumC1105670esX;
        if (enumC1105670esX2 == null) {
            return EnumC1105670esX.EC;
        }
        return enumC1105670esX2;
    }

    public final String LIZIZ(InterfaceC1107590evd interfaceC1107590evd) {
        String strLJFF;
        String string;
        String str = "";
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "panel_id", "")) != null && (string = a0.LJLIIIL(strLJFF).toString()) != null) {
            str = string;
        }
        if (str.length() == 0 || str.length() <= 0 || !this.LLILLL.LIZ().contains(str)) {
            return null;
        }
        return str;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onECPanelStateEvent(C1126504at c1126504at) {
        String string;
        String str = c1126504at.LIZ;
        if (str.length() > 0 && this.LLILLL.LIZ().contains(str)) {
            String str2 = c1126504at.LIZ;
            boolean z = c1126504at.LIZIZ;
            String str3 = c1126504at.LIZJ;
            EnumC1105670esX enumC1105670esX = null;
            if (str3 == null || (string = a0.LJLIIIL(str3).toString()) == null) {
                string = "";
            }
            Iterator<EnumC1105670esX> it2 = EnumC1105670esX.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EnumC1105670esX next = it2.next();
                if (u.LJIJI(next.name(), string, true)) {
                    enumC1105670esX = next;
                    break;
                }
            }
            EnumC1105670esX enumC1105670esX2 = enumC1105670esX;
            if (enumC1105670esX2 == null) {
                enumC1105670esX2 = EnumC1105670esX.EC;
            }
            this.LL.LC0(PanelStateEvent.class, new C0KBR(c1126504at.LIZLLL, c1126504at.LJ, enumC1105670esX2, str2, z));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.06vq, X.0foN] */
    public StreamAdaptionController(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = dataChannel;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        this.LLILLJJLI = eventBusLIZLLL;
        ILiveStreamAdaptConfigService.LIZ.getClass();
        this.LLILLL = C1103204Te.LIZ();
        ?? r1 = new InterfaceC1141530foN() { // from class: X.06vq
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                int iLIZJ;
                boolean zLIZIZ;
                int iIntValue;
                boolean z;
                if (!Intrinsics.LJFF(c262100zr.LIZ, "ttkec_panel_adaptation_event")) {
                    return;
                }
                try {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    String strLIZIZ = this.LL.LIZIZ(interfaceC1107590evd);
                    if (strLIZIZ == null) {
                        return;
                    }
                    this.LL.getClass();
                    EnumC1105670esX enumC1105670esXLIZ = StreamAdaptionController.LIZ(interfaceC1107590evd);
                    if (interfaceC1107590evd != null) {
                        iLIZJ = (int) C1871910yoP.LIZJ(interfaceC1107590evd, "height", 0.0d);
                        if (iLIZJ < 0) {
                            iLIZJ = 0;
                        }
                    } else {
                        iLIZJ = 0;
                    }
                    if (interfaceC1107590evd != null) {
                        if (iLIZJ > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "visible", z);
                        Integer numValueOf = Integer.valueOf((int) C1871910yoP.LIZJ(interfaceC1107590evd, "mode", 0.0d));
                        int iIntValue2 = numValueOf.intValue();
                        if (iIntValue2 == 0 || iIntValue2 == 1) {
                            iIntValue = numValueOf.intValue();
                        }
                        this.LL.LL.LC0(PanelStateEvent.class, new C0KBR(iLIZJ, iIntValue, enumC1105670esXLIZ, strLIZIZ, zLIZIZ));
                    }
                    if (iLIZJ > 0) {
                        zLIZIZ = true;
                    } else {
                        zLIZIZ = false;
                    }
                    iIntValue = 0;
                    this.LL.LL.LC0(PanelStateEvent.class, new C0KBR(iLIZJ, iIntValue, enumC1105670esXLIZ, strLIZIZ, zLIZIZ));
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (UnsupportedOperationException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        };
        this.LLILZ = r1;
        lifecycleOwner.getLifecycle().addObserver(this);
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        C1548820qPI.LIZLLL("ttkec_panel_adaptation_event", r1);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        try {
            C1548820qPI.LJIIIIZZ("ttkec_panel_adaptation_event", this.LLILZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILLJJLI.LJIIJ(this)) {
            this.LLILLJJLI.LJJI(this);
        }
    }
}
