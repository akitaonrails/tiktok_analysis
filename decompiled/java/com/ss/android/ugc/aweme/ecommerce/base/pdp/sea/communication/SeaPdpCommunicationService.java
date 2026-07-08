package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication;

import X.C00BL;
import X.C04FR;
import X.C0PEM;
import X.C12846050y;
import X.C1487890op1;
import X.C1487910op3;
import X.C1487920op4;
import X.C1487950op7;
import X.C1502490pCZ;
import X.C1757320vpa;
import X.C1757350vpd;
import X.C19719512Dh;
import X.C1DFH;
import X.C2107308Nj;
import X.C599190Nen;
import X.C599200Neo;
import X.C599310Nez;
import X.InterfaceC1487900op2;
import X.InterfaceC1502430pCT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1756930vox;
import X.InterfaceC599180Nem;
import X.InterfaceC599480NfG;
import X.InterfaceC634840OvC;
import X.InterfaceC665370Q7z;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.ISeaPdpPageService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.SeaPdpMynaService;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS672S0100000_23;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpCommunicationService implements ISeaPdpCommunicationService, InterfaceC1487900op2 {
    public final InterfaceC665370Q7z LL;
    public final WeakReference<Context> LLILLJJLI;
    public final InterfaceC599480NfG LLILLL;
    public final TrackParamsContext LLILZ;
    public final PageStateContext LLILZIL;
    public final CommonParamsContext LLILZLL;
    public final ISeaPdpPageService LLIZ;
    public final C1487910op3 LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void jb(Object obj) {
        this.LLILLL.jb(obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void H6(Object obj, String str) {
        this.LLILLL.H6(obj, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void Q(InterfaceC634840OvC interfaceC634840OvC, String str) {
        this.LLILLL.Q(interfaceC634840OvC, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void U0(Object obj, String str) {
        this.LLILLL.U0(obj, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final boolean EQ1(String str, Map<String, ? extends Object> map, C1757320vpa c1757320vpa) {
        WeakReference<InterfaceC1756930vox> weakReference;
        InterfaceC1756930vox interfaceC1756930vox;
        C04FR c04frLJ;
        WeakReference<C04FR> weakReference2 = c1757320vpa.LIZ;
        if ((weakReference2 == null || (c04frLJ = weakReference2.get()) == null) && ((weakReference = c1757320vpa.LJFF) == null || (interfaceC1756930vox = weakReference.get()) == null || (c04frLJ = interfaceC1756930vox.LJ()) == null)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item_data", C12846050y.LIZ(c04frLJ.LJ()));
        return gV1(str, map, linkedHashMap, null, c1757320vpa, null, new C1757350vpd(c04frLJ.LJFF()));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void Pd(Object obj, String str, Function0<? extends InterfaceC1502430pCT> function0) {
        InterfaceC599480NfG interfaceC599480NfG = this.LLILLL;
        C1DFH c1dfh = C0PEM.LIZ;
        interfaceC599480NfG.LIZJ(obj, str, C2107308Nj.LIZ.LLIILII(), Long.MAX_VALUE, true, new C1502490pCZ(this, function0, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void sx(Object obj, String str, InterfaceC1631630sYr<? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super C1757320vpa, Unit> interfaceC1631630sYr) {
        this.LLILLL.LIZ(str, new C599310Nez(interfaceC1631630sYr, str, null), obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void hc1(String str, Map map, C1757320vpa c1757320vpa, final InterfaceC1631620sYq interfaceC1631620sYq) {
        LinkedHashMap linkedHashMap = null;
        if (c1757320vpa != null) {
            c1757320vpa.LIZLLL = new WeakReference<>(this);
            C19719512Dh.LJII(null);
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("__sea_pdp_communication_context", c1757320vpa);
        }
        this.LLILLL.LIZLLL(str, map, linkedHashMap, new InterfaceC599180Nem() { // from class: X.05pB
            @Override // X.InterfaceC599180Nem
            public final void LIZ(C1470005pC c1470005pC) {
                int i = c1470005pC.LIZ;
                if (i == -1) {
                    i = -10001;
                }
                InterfaceC1631620sYq<Integer, String, Map<String, ? extends Object>, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Integer.valueOf(i), c1470005pC.LIZIZ, c1470005pC.LIZJ);
                }
            }

            @Override // X.InterfaceC599180Nem
            public final void LIZIZ(C1470305pF c1470305pF) {
                InterfaceC1631620sYq<Integer, String, Map<String, ? extends Object>, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Integer.valueOf(EnumC1502480pCY.SUCCESS.getValue()), "success", c1470305pF.LIZ);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void q2(int i, String str, String str2, Map map) {
        this.LLILLL.q2(i, str, str2, map);
    }

    @Override // X.InterfaceC1487900op2
    public final void LIZ(String str, Map map, Object obj, C1487890op1 c1487890op1, C1487920op4 c1487920op4) {
        boolean z = obj instanceof C1757320vpa;
        C1757320vpa c1757320vpa = null;
        if (z) {
            C1757320vpa c1757320vpa2 = (C1757320vpa) obj;
            if (c1757320vpa2 != null) {
                c1757320vpa2.LJ = c1487890op1;
            }
            if (z) {
                c1757320vpa = (C1757320vpa) obj;
            }
        }
        hc1(str, map, c1757320vpa, new AwS672S0100000_23(c1487920op4, 6));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    public final void kC2(Object obj, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, C1757320vpa c1757320vpa) {
        LinkedHashMap linkedHashMap;
        c1757320vpa.LIZLLL = new WeakReference<>(this);
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap(map2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("__sea_pdp_communication_context", c1757320vpa);
        this.LLILLL.LIZIZ(obj, new C599200Neo(str, map, linkedHashMap, null, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean gV1(java.lang.String r18, java.util.Map<java.lang.String, ? extends java.lang.Object> r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20, java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto>> r21, X.C1757320vpa r22, X.C1487890op1 r23, X.C1757350vpd r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService.gV1(java.lang.String, java.util.Map, java.util.Map, java.util.Map, X.0vpa, X.0op1, X.0vpd):boolean");
    }

    public SeaPdpCommunicationService(InterfaceC665370Q7z interfaceC665370Q7z, WeakReference weakReference, C599190Nen c599190Nen, TrackParamsContext trackParamsContext, PageStateContext pageStateContext, CommonParamsContext commonParamsContext, SeaPdpMynaService seaPdpMynaService, Lifecycle lifecycle) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = weakReference;
        this.LLILLL = c599190Nen;
        this.LLILZ = trackParamsContext;
        this.LLILZIL = pageStateContext;
        this.LLILZLL = commonParamsContext;
        this.LLIZ = seaPdpMynaService;
        this.LLIZLLLIL = new C1487910op3(new C1487950op7(C00BL.SEA_PDP.getValue()), this, lifecycle);
    }
}
