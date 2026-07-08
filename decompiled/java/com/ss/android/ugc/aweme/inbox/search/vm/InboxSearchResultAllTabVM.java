package com.ss.android.ugc.aweme.inbox.search.vm;

import X.C09AE;
import X.C0PEM;
import X.C1241240iPC;
import X.C1241480iPa;
import X.C1241700iPw;
import X.C1241870iQD;
import X.C1241880iQE;
import X.C1241920iQI;
import X.C1242050iQV;
import X.C13BV;
import X.C13DA;
import X.C1720106oR;
import X.C1DEV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2286608xc;
import X.C23250099c;
import X.EnumC1241490iPb;
import X.EnumC1241910iQH;
import X.InterfaceC0148002o;
import X.InterfaceC1240590iO9;
import X.InterfaceC1241780iQ4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResultAllTabVM extends AssemViewModel<C1241700iPw> implements InterfaceC1241780iQ4 {
    public C1241480iPa LLILLJJLI;
    public int LLJ;
    public String LL = "";
    public final List<InboxSearchPowerChunkProtocol> LLILLL = new ArrayList();
    public final List<InboxSearchPowerChunkProtocol> LLILZ = new ArrayList();
    public final List<InboxSearchPowerChunkProtocol> LLILZIL = new ArrayList();
    public final Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> LLILZLL = new LinkedHashMap();
    public final List<C09AE> LLIZ = new ArrayList();
    public final C1DEV LLIZLLLIL = C2191201ApK.LIZ();

    @Override // X.InterfaceC1241780iQ4
    public final void clearData() {
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZLL).entrySet()) {
            this.LLILZLL.put((EnumC1241910iQH) entry.getKey(), C13BV.INSTANCE);
        }
        setState(AFwS257S0000000_19.get$arr$(202));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1241700iPw(C13BV.INSTANCE, EnumC1241490iPb.REFRESH);
    }

    @Override // X.InterfaceC1241780iQ4
    public final void refresh() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchResultAllTabVM", "clearLastLoadData()");
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) this.LLIZ).clear();
        Iterator it3 = ((ArrayList) this.LLILZIL).iterator();
        while (it3.hasNext()) {
            ((InboxSearchPowerChunkProtocol) it3.next()).LLILZ = null;
        }
        C13DA c13da = new C13DA();
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZLL).entrySet()) {
            c13da.put(entry.getKey(), entry.getValue());
        }
        setState(new AwS385S0200000_19(this, (InboxSearchResultAllTabVM) c13da.build(), (Map<EnumC1241910iQH, ? extends List<? extends InterfaceC1240590iO9>>) 84));
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh() - nowKeyWord = ");
        sbLIZ.append(this.LL);
        C1720106oR.LJI("InboxSearchResultAllTabVM", C2188811AlT.LIZIZ(sbLIZ));
        C1241480iPa c1241480iPa = this.LLILLJJLI;
        if (c1241480iPa != null) {
            String str = this.LL;
            if (str.length() > 0) {
                c1241480iPa.LIZIZ++;
                c1241480iPa.LIZLLL = str;
            }
        }
        if (this.LL.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1242050iQV c1242050iQV = new C1242050iQV(0);
        ((ArrayList) this.LLIZ).add(C23250099c.LIZLLL(getLifecycleScope(), C0PEM.LIZJ, null, new C1241880iQE(this, c1242050iQV, linkedHashMap, null), 2));
        Iterator it4 = ((ArrayList) this.LLILZIL).iterator();
        while (it4.hasNext()) {
            ((ArrayList) this.LLIZ).add(C23250099c.LIZLLL(getLifecycleScope(), C0PEM.LIZJ, null, new C1241870iQD((InboxSearchPowerChunkProtocol) it4.next(), this, c1242050iQV, linkedHashMap, null), 2));
        }
    }

    @Override // X.InterfaceC1241780iQ4
    public final void oH0(String str) {
        this.LL = str;
    }

    public final EnumC1241490iPb wQ2(C1242050iQV c1242050iQV) {
        if (c1242050iQV.LIZ == ((ArrayList) this.LLILLL).size()) {
            if (c1242050iQV.LIZIZ > 0) {
                return EnumC1241490iPb.ERROR;
            }
            if (c1242050iQV.LIZLLL == 0) {
                return EnumC1241490iPb.NO_RESULT;
            }
            return EnumC1241490iPb.SUCCESS;
        }
        if (c1242050iQV.LIZJ == this.LLJ) {
            return EnumC1241490iPb.LOADING;
        }
        return EnumC1241490iPb.REFRESH;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> vQ2(java.util.Map<X.EnumC1241910iQH, ? extends java.util.List<? extends X.InterfaceC1240590iO9>> r13, X.C1242050iQV r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM.vQ2(java.util.Map, X.0iQV, boolean):java.util.List");
    }

    public static Unit xQ2(Map map, EnumC1241910iQH enumC1241910iQH, C1241920iQI c1241920iQI, C1242050iQV c1242050iQV) {
        c1242050iQV.LIZ++;
        map.put(enumC1241910iQH, c1241920iQI.LIZJ);
        int i = C1241240iPC.LIZ[c1241920iQI.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = c1242050iQV.LIZIZ;
                c1242050iQV.LIZIZ = i2 + 1;
                C2286608xc.LJ(i2);
            }
        } else {
            int i3 = c1242050iQV.LIZLLL;
            c1242050iQV.LIZLLL = i3 + 1;
            C2286608xc.LJ(i3);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1241780iQ4
    public final void YL(String str, String str2, UrlModel urlModel, boolean z) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("InboxSearchResultAllTabVM", "updateUserFilter all tab error");
    }
}
