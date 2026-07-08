package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils;

import X.C09R3;
import X.C0NJ1;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1053404Aa;
import X.InterfaceC1146704e9;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AiTryOnAssem extends LogicAssem implements IAiTryOnAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AiTryOnAssem LL = this;
    public volatile InterfaceC1053404Aa LLILLJJLI;
    public volatile C0NJ1 LLILLL;
    public volatile InterfaceC1761670vwb LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiTryOnAssem.class, "pdpBtmManager", "getPdpBtmManager()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/event/btm/IBtmManager;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AiTryOnAssem.class, "pageStateAbility", "getPageStateAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/state/ability/IPDPUnifiedStateAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AiTryOnAssem.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
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

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLILZLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLILZIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLILZLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C0NJ1 m178do() {
        C0NJ1 c0nj1;
        C0NJ1 c0nj12 = this.LLILLL;
        if (c0nj12 == null) {
            synchronized (this) {
                c0nj12 = this.LLILLL;
                if (c0nj12 == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        c0nj1 = (C0NJ1) c0qsjBo.getAbility(C0NJ1.class);
                        C687700QyG.LJ(c0nj1, C0NJ1.class);
                    } else {
                        c0nj1 = null;
                    }
                    this.LLILLL = c0nj1;
                    return c0nj1;
                }
            }
        }
        return c0nj12;
    }

    public final InterfaceC1761670vwb fo() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLILZ;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLILZ;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjBo.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLILZ = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, IAiTryOnAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, IAiTryOnAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String ho(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.AiTryOnAssem r68, int r69) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.AiTryOnAssem.ho(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.AiTryOnAssem, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.IAiTryOnAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nC(X.InterfaceC1748810vbr r18, android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.AiTryOnAssem.nC(X.0vbr, android.content.Context, java.lang.String, java.lang.String):void");
    }
}
