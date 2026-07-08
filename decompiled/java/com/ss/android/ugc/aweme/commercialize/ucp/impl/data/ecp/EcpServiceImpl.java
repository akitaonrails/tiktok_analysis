package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ecp;

import X.AbstractC19484711Kz;
import X.AbstractC335880DEs;
import X.C0D8E;
import X.C0DAV;
import X.C0DCU;
import X.C0DF6;
import X.C0DFN;
import X.C0DFO;
import X.C0DFR;
import X.C0PEM;
import X.C1388190mED;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C336000DFe;
import X.C336130DFr;
import X.InterfaceC1036270d4b;
import X.InterfaceC334930DBb;
import android.content.Context;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService;
import com.ss.android.ugc.aweme.ad.ecp.IEcpService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class EcpServiceImpl implements IEcpService, IEcpRuntimeService {
    public final C336130DFr LIZ = new C336130DFr();

    @Override // com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService
    public final AbstractC19484711Kz<AbstractC335880DEs> LIZ(C0DF6 c0df6) {
        C0DFR c0dfr;
        String str = c0df6.LIZLLL;
        if (str != null && (c0dfr = (C0DFR) ((Map) C336000DFe.LIZIZ.getValue()).get(str)) != null) {
            return c0dfr.LIZ(c0df6);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.ecp.IEcpService
    public final void LIZIZ(final C0DCU c0dcu, final InterfaceC334930DBb interfaceC334930DBb) {
        String str = c0dcu.LIZIZ;
        if (str == null) {
            str = "";
        }
        InterfaceC1036270d4b interfaceC1036270d4b = new InterfaceC1036270d4b() { // from class: X.0DF8
            @Override // X.InterfaceC1036270d4b
            public final void Gn(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLFFI(TuxSheet tuxSheet, float f) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void V() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Yc() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str2, String str3) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                String containerID = interfaceC1034470d1h.getContainerID();
                boolean z = false;
                if (containerID != null && !a0.LJJJIL(containerID)) {
                    C0DF9.LIZ.remove(containerID);
                    InterfaceC335280DCk interfaceC335280DCkRemove = C335370DCt.LIZ.remove(containerID);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unregister: containerId=");
                    sbLIZ.append(containerID);
                    sbLIZ.append(", removed=");
                    if (interfaceC335280DCkRemove != null) {
                        z = true;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", reason=");
                    sbLIZ.append("hybrid_fragment_destroy");
                    C2188811AlT.LIZIZ(sbLIZ);
                    C0DF5.LIZ.remove(containerID);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
            @Override // X.InterfaceC1036270d4b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void s8(com.bytedance.tux.sheet.sheet.TuxSheet r5, X.InterfaceC1034470d1h r6, java.lang.String r7) {
                /*
                    r4 = this;
                    java.lang.String r2 = r6.getContainerID()
                    X.0DCU r0 = r1
                    java.lang.Object r3 = r0.LIZLLL
                    boolean r0 = r3 instanceof X.InterfaceC335280DCk
                    if (r0 != 0) goto Ld
                    r3 = 0
                Ld:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "hybrid onShow: containerId="
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r0 = ", hasCallback="
                    r1.append(r0)
                    X.0DBb r0 = r2
                    if (r0 == 0) goto L70
                    r0 = 1
                L23:
                    r1.append(r0)
                    java.lang.String r0 = ", hasBridge="
                    r1.append(r0)
                    if (r3 == 0) goto L6e
                    r0 = 1
                L2e:
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    if (r2 == 0) goto L54
                    boolean r0 = kotlin.text.a0.LJJJIL(r2)
                    if (r0 != 0) goto L47
                    X.0DBb r1 = r2
                    if (r1 == 0) goto L45
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0DBb> r0 = X.C0DF9.LIZ
                    r0.put(r2, r1)
                L45:
                    if (r2 == 0) goto L54
                L47:
                    boolean r0 = kotlin.text.a0.LJJJIL(r2)
                    if (r0 != 0) goto L54
                    if (r3 == 0) goto L54
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0DCk> r0 = X.C335370DCt.LIZ
                    r0.put(r2, r3)
                L54:
                    X.0DCU r0 = r1
                    java.lang.String r1 = r0.LJ
                    if (r2 == 0) goto L6d
                    boolean r0 = kotlin.text.a0.LJJJIL(r2)
                    if (r0 != 0) goto L6d
                    if (r1 == 0) goto L6d
                    boolean r0 = kotlin.text.a0.LJJJIL(r1)
                    if (r0 != 0) goto L6d
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = X.C0DF5.LIZ
                    r0.put(r2, r1)
                L6d:
                    return
                L6e:
                    r0 = 0
                    goto L2e
                L70:
                    r0 = 0
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0DF8.s8(com.bytedance.tux.sheet.sheet.TuxSheet, X.0d1h, java.lang.String):void");
            }
        };
        Context context = c0dcu.LIZ;
        Aweme aweme = c0dcu.LIZJ;
        C0D8E c0d8e = new C0D8E(context, aweme, str);
        C336130DFr c336130DFr = this.LIZ;
        AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(interfaceC334930DBb, 48);
        c336130DFr.getClass();
        if (a0.LJJJIL(str)) {
            C0DAV.LIZ("FallbackHandler", "Continue URL is blank, aborting fallback", null);
            awS583S0100000_4.invoke(new C0DFN("Continue URL is empty."));
            return;
        }
        if (aweme == null) {
            C0DAV.LIZ("FallbackHandler", "Aweme is null, aborting fallback", null);
            awS583S0100000_4.invoke(new C0DFN("Aweme is null."));
            return;
        }
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            C0DAV.LIZ("FallbackHandler", "Aweme is not ad traffic, aborting fallback", null);
            awS583S0100000_4.invoke(new C0DFN("Aweme is not ad traffic."));
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            C0DAV.LIZ("FallbackHandler", "Aweme raw ad is null, aborting fallback", null);
            awS583S0100000_4.invoke(new C0DFN("Aweme raw ad is null."));
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            C0DAV.LIZ("FallbackHandler", "FragmentActivity is unavailable, aborting fallback", null);
            awS583S0100000_4.invoke(new C0DFN("FragmentActivity is unavailable."));
        } else {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DFO(c336130DFr, c0d8e, c19egLIZIZ, aweme, awemeRawAd, interfaceC1036270d4b, awS583S0100000_4, null), 2);
        }
    }
}
