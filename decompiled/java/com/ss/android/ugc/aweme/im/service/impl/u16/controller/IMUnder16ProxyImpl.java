package com.ss.android.ugc.aweme.im.service.impl.u16.controller;

import X.C0I0B;
import X.C10EU;
import X.C11RO;
import X.C11S5;
import X.C1239300iM4;
import X.C1400340mXo;
import X.C1477305qN;
import X.C1701940uOG;
import X.C21511719Gp;
import X.C287690BPj;
import X.C461720I8s;
import X.InterfaceC21511819Gq;
import X.InterfaceC21512019Gs;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16InitTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class IMUnder16ProxyImpl implements IIMUnder16Proxy {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final boolean LIZJ() {
        return C21511719Gp.LIZIZ(C21511719Gp.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LIZLLL() {
        C21511719Gp.LIZ.getClass();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        if (!C287690BPj.LIZ()) {
            repo.storeBoolean(C21511719Gp.LIZ(), false);
        }
        C21511719Gp.LIZIZ = false;
        C21511719Gp.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LJ() {
        C21511719Gp c21511719Gp = C21511719Gp.LIZ;
        C11RO c11roLIZ = C11S5.LIZ();
        C11RO c11roLIZIZ = C1701940uOG.LIZIZ();
        InterfaceC21511819Gq.LIZ.getClass();
        InterfaceC21511819Gq interfaceC21511819Gq = (InterfaceC21511819Gq) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1477305qN.LIZIZ).build().retrofit.LIZ(InterfaceC21511819Gq.class);
        c21511719Gp.getClass();
        boolean zIsLogin = ((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        if (Intrinsics.LJFF(Boolean.valueOf(C10EU.LJIIIIZZ()), Boolean.TRUE) || !zIsLogin) {
            return;
        }
        C1239300iM4.LIZLLL(interfaceC21511819Gq.LIZ().LJJIJIIJI(c11roLIZ).LJJ(c11roLIZIZ), AFwS278S0000000_32.get$arr$(170), new AwS118S0110000_32(repo, zIsLogin, 17));
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final IMUnder16InitTask LJFF() {
        return new IMUnder16InitTask();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LJI() {
        C21511719Gp.LIZ.getClass();
        C21511719Gp.LIZJ(Keva.getRepo("disable_im_under_sixteen_repo"), ((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LJII(Function0<Unit> function0) {
        C21511719Gp.LIZ.getClass();
        C21511719Gp.LIZLLL.add(function0);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LIZ(String str, InterfaceC21512019Gs interfaceC21512019Gs) {
        C21511719Gp.LIZ.getClass();
        CopyOnWriteArrayList<InterfaceC21512019Gs> copyOnWriteArrayList = C21511719Gp.LJ.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(interfaceC21512019Gs);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy
    public final void LIZIZ(String str, InterfaceC21512019Gs interfaceC21512019Gs) {
        C21511719Gp.LIZ.getClass();
        ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC21512019Gs>> concurrentHashMap = C21511719Gp.LJ;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<InterfaceC21512019Gs> copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(interfaceC21512019Gs);
        }
        if (Intrinsics.LJFF(C461720I8s.LIZIZ(), str) && C21511719Gp.LIZIZ) {
            interfaceC21512019Gs.LIZ();
        }
    }
}
