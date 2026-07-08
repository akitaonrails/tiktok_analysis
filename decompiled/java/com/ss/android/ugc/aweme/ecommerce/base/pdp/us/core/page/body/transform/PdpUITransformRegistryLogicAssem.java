package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform;

import X.C0NJ1;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1457505nB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PdpUITransformRegistryLogicAssem extends LogicAssem implements InterfaceC1457505nB, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final PdpUITransformRegistryLogicAssem LL = this;
    public final Map<Class<?>, Object> LLILLJJLI = new LinkedHashMap();
    public volatile C0NJ1 LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpUITransformRegistryLogicAssem.class, "pageStateAbility", "getPageStateAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/state/ability/IPDPUnifiedStateAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final C0NJ1 bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLILZIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C0NJ1 c0nj1 = (C0NJ1) c0qsjLIZLLL.getAbility(C0NJ1.class);
        C687700QyG.LJ(c0nj1, C0NJ1.class);
        return c0nj1;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0NJ1 c0nj1Bo = this.LLILLL;
        if (c0nj1Bo == null) {
            synchronized (this) {
                c0nj1Bo = this.LLILLL;
                if (c0nj1Bo == null) {
                    c0nj1Bo = bo();
                    this.LLILLL = c0nj1Bo;
                }
            }
        }
        sd(C0NJ1.class, c0nj1Bo);
    }

    @Override // X.InterfaceC1457505nB
    public final Map<Class<?>, Object> p4() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, InterfaceC1457505nB.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, InterfaceC1457505nB.class);
    }

    @Override // X.InterfaceC1457505nB
    public final <T> void sd(Class<T> cls, T t) {
        this.LLILLJJLI.put(cls, t);
    }
}
