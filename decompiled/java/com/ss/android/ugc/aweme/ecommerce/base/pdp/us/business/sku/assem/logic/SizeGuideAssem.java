package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.logic;

import X.C0QSJ;
import X.C13LE;
import X.C1748800vbq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C687700QyG;
import X.C814703Gf;
import X.C919503ib;
import X.C960603pE;
import X.InterfaceC1146704e9;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC7870035o;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.assem.LogicAssem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class SizeGuideAssem extends LogicAssem implements InterfaceC7870035o, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final SizeGuideAssem LL = this;
    public volatile InterfaceC1761670vwb LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SizeGuideAssem.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final InterfaceC1761670vwb bo() throws IllegalAccessException {
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
        InterfaceC1761670vwb interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjLIZLLL.getAbility(InterfaceC1761670vwb.class);
        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
        return interfaceC1761670vwb;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LL, InterfaceC7870035o.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LL, InterfaceC7870035o.class);
    }

    @Override // X.InterfaceC7870035o
    public final void gb(ECBaseFragment eCBaseFragment, SizeGuide sizeGuide, String str) {
        Map<String, Object> map;
        if (sizeGuide == null) {
            return;
        }
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InterfaceC1761670vwb interfaceC1761670vwbBo = this.LLILLJJLI;
            if (interfaceC1761670vwbBo == null) {
                synchronized (this) {
                    interfaceC1761670vwbBo = this.LLILLJJLI;
                    if (interfaceC1761670vwbBo == null) {
                        interfaceC1761670vwbBo = bo();
                        this.LLILLJJLI = interfaceC1761670vwbBo;
                    }
                }
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = interfaceC1761670vwbBo.lX().LLJI;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                linkedHashMap.putAll(map);
            }
            for (Map.Entry<String, Object> entry : C1748800vbq.LIZ(eCBaseFragment).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
            linkedHashMap.put("previous_page", "product_detail");
            Context context = eCBaseFragment.getContext();
            if (context != null) {
                C919503ib.LIZIZ(context, str, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)), false).open();
                return;
            }
            return;
        }
        String strLJ = C960603pE.LJ(eCBaseFragment);
        FragmentManager fragmentManager = eCBaseFragment.getFragmentManager();
        if (fragmentManager != null) {
            C814703Gf.LIZ(fragmentManager, strLJ, sizeGuide);
        }
    }
}
