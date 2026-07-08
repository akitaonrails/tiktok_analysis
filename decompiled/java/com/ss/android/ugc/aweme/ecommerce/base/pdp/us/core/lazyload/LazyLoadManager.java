package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C054G;
import X.C09A1;
import X.C09IC;
import X.C0PEM;
import X.C0QSJ;
import X.C1326490kch;
import X.C13LE;
import X.C1455705mt;
import X.C1455805mu;
import X.C1456005mw;
import X.C1457105n7;
import X.C1457305n9;
import X.C1457405nA;
import X.C1BNE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1385805bc;
import X.InterfaceC1456405n0;
import X.InterfaceC1755040vlu;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.LazyLoadContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.LazyLoadTrigger;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class LazyLoadManager extends LogicAssem implements InterfaceC1755040vlu, InterfaceC1385805bc, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final LazyLoadManager LL = this;
    public final C054G LLILLJJLI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<String, LazyLoadContext> LLILLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1456005mw> LLILZ = new ConcurrentHashMap<>();
    public final Set<String> LLILZIL = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile InterfaceC1456405n0 LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LazyLoadManager.class, "moduleStayTracker", "getModuleStayTracker()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/lazyload/IModuleStayTracker;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    @Override // X.InterfaceC1755040vlu
    public final void Gd() {
        for (Map.Entry<String, LazyLoadContext> entry : this.LLILLL.entrySet()) {
            entry.getKey();
            LazyLoadContext value = entry.getValue();
            if (value.trigger.lazyLoadTriggerType == 0) {
                C1326490kch.LIZ.getClass();
                C1326490kch.LIZ("onFirstScreenRendered, triggering fetch");
                C1456005mw c1456005mw = this.LLILZ.get(value.responseSubscriptionId);
                if (c1456005mw != null) {
                    m182do(c1456005mw);
                }
            }
        }
    }

    @Override // X.InterfaceC1755040vlu
    public final void LJIJJ() {
        for (Map.Entry<String, LazyLoadContext> entry : this.LLILLL.entrySet()) {
            entry.getKey();
            LazyLoadContext value = entry.getValue();
            if (value.trigger.lazyLoadTriggerType == 1) {
                C1326490kch.LIZ.getClass();
                C1326490kch.LIZ("onFirstScreenRendered, triggering fetch");
                C1456005mw c1456005mw = this.LLILZ.get(value.responseSubscriptionId);
                if (c1456005mw != null) {
                    m182do(c1456005mw);
                }
            }
        }
    }

    public final InterfaceC1456405n0 bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLIZLLLIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLIZLLLIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1456405n0 interfaceC1456405n0 = (InterfaceC1456405n0) c0qsjLIZLLL.getAbility(InterfaceC1456405n0.class);
        C687700QyG.LJ(interfaceC1456405n0, InterfaceC1456405n0.class);
        return interfaceC1456405n0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC1456405n0 interfaceC1456405n0Bo = this.LLILZLL;
        if (interfaceC1456405n0Bo == null) {
            synchronized (this) {
                interfaceC1456405n0Bo = this.LLILZLL;
                if (interfaceC1456405n0Bo == null) {
                    interfaceC1456405n0Bo = bo();
                    this.LLILZLL = interfaceC1456405n0Bo;
                }
            }
        }
        interfaceC1456405n0Bo.M0(this);
        C1326490kch.LIZ.getClass();
        C1326490kch.LIZ("LazyLoadManagerLogicAssem subscribe time countdown tracker");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1456405n0 interfaceC1456405n0Bo = this.LLILZLL;
        if (interfaceC1456405n0Bo == null) {
            synchronized (this) {
                interfaceC1456405n0Bo = this.LLILZLL;
                if (interfaceC1456405n0Bo == null) {
                    interfaceC1456405n0Bo = bo();
                    this.LLILZLL = interfaceC1456405n0Bo;
                }
            }
        }
        interfaceC1456405n0Bo.c0(this);
        for (C1456005mw c1456005mw : this.LLILZ.values()) {
            AnonymousClass0956 anonymousClass0956 = c1456005mw.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1456005mw.LIZIZ.LJ = true;
        }
        this.LLILZ.clear();
        this.LLILLL.clear();
        this.LLILZIL.clear();
        C2296808zG.LIZJ(this.LLILLJJLI, null);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, InterfaceC1755040vlu.class);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m182do(C1456005mw c1456005mw) {
        String str = c1456005mw.LIZ.dedupId;
        if (str != null && !this.LLILZIL.add(str)) {
            return;
        }
        Object value = c1456005mw.LIZIZ.LIZLLL.getValue();
        if (!(value instanceof C1457405nA) && !(value instanceof C1457105n7)) {
            c1456005mw.LIZJ = C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1455805mu(c1456005mw, null), 3);
        }
    }

    @Override // X.InterfaceC1755040vlu
    public final AnonymousClass0951 fa(String str) {
        AnonymousClass0951 anonymousClass0951;
        C1456005mw c1456005mw = this.LLILZ.get(str);
        if (c1456005mw == null || (anonymousClass0951 = c1456005mw.LIZIZ.LIZLLL) == null) {
            return C09IC.LIZIZ(C1BNE.LIZ(C1457305n9.LIZ));
        }
        return anonymousClass0951;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, InterfaceC1755040vlu.class);
    }

    @Override // X.InterfaceC1755040vlu
    public final void J8(String str, LazyLoadContext lazyLoadContext) {
        boolean z;
        Long l;
        if (this.LLILLL.containsKey(str)) {
            return;
        }
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lazyLoadManager node register: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        this.LLILLL.put(str, lazyLoadContext);
        C1456005mw c1456005mw = new C1456005mw(lazyLoadContext);
        String str2 = lazyLoadContext.responseSubscriptionId;
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LLILZ.put(str2, c1456005mw);
        }
        LazyLoadTrigger lazyLoadTrigger = lazyLoadContext.trigger;
        if (lazyLoadTrigger.lazyLoadTriggerType == 2 && (l = lazyLoadTrigger.delayTimeSec) != null) {
            c1456005mw.LIZJ = C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1455705mt(l.longValue(), this, c1456005mw, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // X.InterfaceC1385805bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c9(int r16, java.util.Map r17, java.util.Map r18) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.LazyLoadManager.c9(int, java.util.Map, java.util.Map):void");
    }
}
