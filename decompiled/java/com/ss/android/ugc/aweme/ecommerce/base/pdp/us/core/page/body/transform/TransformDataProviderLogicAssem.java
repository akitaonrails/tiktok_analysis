package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform;

import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1457505nB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransformDataProviderLogicAssem<T> extends LogicAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final Class<T> LL;
    public volatile InterfaceC1457505nB LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TransformDataProviderLogicAssem.class, "registry", "getRegistry()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/transform/IPdpUITransformRegistry;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    /* JADX INFO: renamed from: do */
    public abstract T mo179do();

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    private InterfaceC1457505nB bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILLL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILLL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLILZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1457505nB interfaceC1457505nB = (InterfaceC1457505nB) c0qsjLIZLLL.getAbility(InterfaceC1457505nB.class);
        C687700QyG.LJ(interfaceC1457505nB, InterfaceC1457505nB.class);
        return interfaceC1457505nB;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC1457505nB interfaceC1457505nBBo = this.LLILLJJLI;
        if (interfaceC1457505nBBo == null) {
            synchronized (this) {
                interfaceC1457505nBBo = this.LLILLJJLI;
                if (interfaceC1457505nBBo == null) {
                    interfaceC1457505nBBo = bo();
                    this.LLILLJJLI = interfaceC1457505nBBo;
                }
            }
        }
        interfaceC1457505nBBo.sd(this.LL, mo179do());
    }

    public TransformDataProviderLogicAssem(Class<T> cls) {
        this.LL = cls;
    }
}
