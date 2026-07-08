package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload;

import X.C054G;
import X.C09A1;
import X.C0PEM;
import X.C1326490kch;
import X.C1385705bb;
import X.C1455905mv;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1385805bc;
import X.InterfaceC1456405n0;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ModuleStayTimeTracker extends LogicAssem implements InterfaceC1456405n0, InterfaceC737790Swr, InterfaceC1146704e9 {
    public volatile int LLILLL;
    public volatile boolean LLILZ;
    public volatile boolean LLILZIL;
    public final C054G LLIZLLLIL;
    public final ModuleStayTimeTracker LL = this;
    public volatile Map<String, C1455905mv> LLILLJJLI = C2097608Jq.LJ();
    public final ConcurrentHashMap<String, Long> LLILZLL = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<InterfaceC1385805bc> LLIZ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1456405n0
    public final void pause() {
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC1456405n0
    public final void resume() {
        this.LLILZIL = false;
    }

    @Override // X.InterfaceC1456405n0
    public final void start() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        C1326490kch.LIZ.getClass();
        C1326490kch.LIZ("ModuleStayTimeTracker started");
        C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1385705bb(this, null), 3);
    }

    public ModuleStayTimeTracker() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
        this.LLILZLL.clear();
        this.LLIZ.clear();
    }

    @Override // X.InterfaceC1456405n0
    public final void M0(InterfaceC1385805bc interfaceC1385805bc) {
        this.LLIZ.addIfAbsent(interfaceC1385805bc);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, InterfaceC1456405n0.class);
    }

    @Override // X.InterfaceC1456405n0
    public final void c0(InterfaceC1385805bc interfaceC1385805bc) {
        this.LLIZ.remove(interfaceC1385805bc);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, InterfaceC1456405n0.class);
    }

    @Override // X.InterfaceC1456405n0
    public final void Fb(int i, Map map) {
        this.LLILLJJLI = map;
        this.LLILLL = i;
    }
}
