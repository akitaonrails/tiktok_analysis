package com.bytedance.touchpoint.core;

import X.AbstractC1549150qPp;
import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C09WE;
import X.C1057730ddD;
import X.C1065840dqI;
import X.C1323690kYB;
import X.C1619720sFe;
import X.C1697810uHb;
import X.C1713140ugK;
import X.C1793340wlg;
import X.C1800320www;
import X.C1838870xx7;
import X.C1849810yEl;
import X.C1873010yqB;
import X.C1873130yqN;
import X.C1873960yri;
import X.C1874360ysM;
import X.C1874400ysQ;
import X.C1875730yuZ;
import X.C1877160yws;
import X.C1877540yxU;
import X.C1877830yxx;
import X.C1887700zDs;
import X.C1893370zN1;
import X.C1893440zN8;
import X.C1893450zN9;
import X.C1893670zNV;
import X.C1894700zPA;
import X.C1896100zRQ;
import X.C1902610zbv;
import X.C2178808gE;
import X.C259800zU;
import X.C262100zr;
import X.C601050Nhn;
import X.InterfaceC1904907d9;
import android.content.Context;
import com.bytedance.touchpoint.api.ITouchPointService;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.shortdrama.ShortDramaTimerPendantManager;
import com.bytedance.touchpoint.data.interceptor.DiversionOtherAppInstalledInfo;
import com.bytedance.touchpoint.data.interceptor.VPNInterceptor;
import java.util.List;
import kotlin.jvm.internal.AwS31S1201000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TouchPointServiceImpl implements ITouchPointService {
    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final List<InterfaceC1904907d9> LJFF() {
        return C1697810uHb.LJIILJJIL(new DiversionOtherAppInstalledInfo());
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final InterfaceC1904907d9 LIZLLL() {
        return new VPNInterceptor();
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIIIIZZ() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJI;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIILJJIL = C1697810uHb.LJIILJJIL(C601050Nhn.class, C1877540yxU.class, C1877160yws.class, C1065840dqI.class, C1800320www.class, C1873960yri.class, C1838870xx7.class, C1057730ddD.class, C1849810yEl.class, C1873010yqB.class, C1873130yqN.class, C09WE.class, C1877830yxx.class, C1874360ysM.class, C1896100zRQ.class, C1874400ysQ.class, C1902610zbv.class, C1793340wlg.class, C1875730yuZ.class, C1713140ugK.class, C1887700zDs.class);
        C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
        if (c1893370zN1 != null && (listLJI = c1893370zN1.LJI()) != null) {
            listLJIILJJIL.addAll(listLJI);
        }
        return listLJIILJJIL;
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final boolean LJIIIZ() {
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        if (C1893440zN8.LIZ().LLJJL) {
            return true;
        }
        C01GW<ShortDramaTimerPendantManager> c01gw2 = ShortDramaTimerPendantManager.LLJJJJ;
        return C1893450zN9.LIZ().LLJILLL;
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final long LJIIJJI() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJIIZILJ();
        }
        return 0L;
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final boolean isLogin() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJJIJIL();
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final void LJI(Object obj) {
        Context contextLJIIJJI;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null) {
            C1323690kYB.LIZ(contextLJIIJJI).LIZIZ(obj, "", "appsflyer_deep_link");
        }
    }

    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final void LJII(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "referral_all_rewards_claimed")) {
            C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
            C1893440zN8.LIZ().LJLIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.touchpoint.api.ITouchPointService
    public final C1893670zNV LJIIJ(String str) {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        c1894700zPALIZ.getClass();
        C259800zU c259800zU = new C259800zU();
        C01U6.LIZIZ(new AwS31S1201000_28(str, c1894700zPALIZ, c259800zU, 0));
        return (C1893670zNV) c259800zU.element;
    }
}
