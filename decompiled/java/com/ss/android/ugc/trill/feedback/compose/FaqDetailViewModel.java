package com.ss.android.ugc.trill.feedback.compose;

import X.AbstractC1686530tzP;
import X.C1557610qdT;
import X.C1689100u3Y;
import X.C1689120u3a;
import X.C23250099c;
import X.C592600NMc;
import X.C592620NMe;
import X.C592650NMh;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import com.ss.android.ugc.trill.feedback.api.FaqGeneralItem;
import com.ss.android.ugc.trill.feedback.api.FaqInfoMap;
import com.ss.android.ugc.trill.feedback.api.FaqResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class FaqDetailViewModel extends AssemViewModel<C1557610qdT> {
    public final Map<String, String> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1557610qdT(0);
    }

    public final void vQ2() {
        setState(AFwS266S0000000_25.get$arr$(338));
    }

    public final void xQ2(FaqResponse faqResponse) {
        Integer num = faqResponse.code;
        if (num != null && num.intValue() == 0) {
            FaqInfoMap faqInfoMap = faqResponse.faqInfoMap;
            if (faqInfoMap == null) {
                setState(AFwS266S0000000_25.get$arr$(341));
                return;
            }
            List<FaqGeneralItem> list = faqInfoMap.general;
            if (list != null && !list.isEmpty()) {
                try {
                    setState(new AwS604S0100000_25((List) list, (List<? extends AbstractC1686530tzP>) 505));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            setState(AFwS266S0000000_25.get$arr$(342));
            return;
        }
        setState(AFwS266S0000000_25.get$arr$(340));
    }

    public final void wQ2(String str, String str2, List<String> list) {
        boolean z;
        setState(AFwS266S0000000_25.get$arr$(339));
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && str2.length() > 0) {
            C23250099c.LIZLLL((InterfaceC497601wk) C592650NMh.LIZJ.getValue(), null, null, new C592620NMe(str2, new AwS604S0100000_25(this, 501), new AwS604S0100000_25(this, 502), null), 3);
            return;
        }
        CSPPageApi.FaqRequestBody.Factory.getClass();
        Map<String, String> mapLIZ = C1689120u3a.LIZ(C1689100u3Y.LIZ());
        mapLIZ.put("faq_id", str);
        mapLIZ.put("entrance", str2);
        C23250099c.LIZLLL((InterfaceC497601wk) C592650NMh.LIZJ.getValue(), null, null, new C592600NMc(mapLIZ, list, new AwS604S0100000_25(this, 503), new AwS604S0100000_25(this, 504), null), 3);
    }
}
