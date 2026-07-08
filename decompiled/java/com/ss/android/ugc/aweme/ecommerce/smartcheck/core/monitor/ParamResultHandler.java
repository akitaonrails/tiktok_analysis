package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor;

import X.C01CU;
import X.C13EQ;
import X.C21186817ve;
import X.C21186917vf;
import X.C21187017vg;
import X.C21187217vi;
import X.C21187517vl;
import X.C21187617vm;
import X.C21187917vp;
import X.C2188811AlT;
import X.EnumC21186417va;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS6S3300000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ParamResultHandler implements IResultHandler {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final List<Class<? extends C21186817ve>> LIZ() {
        return Collections.singletonList(C21186917vf.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final void LIZIZ(String str, String str2, long j, String str3, List<? extends C21186817ve> list, long j2, String str4, String str5, C01CU c01cu) {
        C21187917vp c21187917vp = C21187917vp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParamResultHandler: ");
        sbLIZ.append(((ArrayList) list).size());
        C2188811AlT.LIZIZ(sbLIZ);
        C21187917vp.LIZ(c21187917vp, null, 6);
        if (!r2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C21186917vf c21186917vf : (ArrayList) C13EQ.LJJIJL(list, C21186917vf.class)) {
                arrayList.add(c21186917vf);
                String str6 = c21186917vf.LIZLLL;
                String str7 = c21186917vf.LJ;
                List<C21187017vg> list2 = c21186917vf.LIZJ;
                ArrayList<C21187017vg> arrayList2 = new ArrayList();
                for (C21187017vg c21187017vg : list2) {
                    if (c21187017vg.LIZIZ != EnumC21186417va.REDUNDANT) {
                        arrayList2.add(c21187017vg);
                    }
                }
                for (C21187017vg c21187017vg2 : arrayList2) {
                    C21187517vl c21187517vl = new C21187517vl(str);
                    c21187517vl.LJIIIIZZ(new C21187217vi(str2, c21187517vl, str3, c21187017vg2, str6, str7, c21187017vg2.LIZLLL, str4));
                    c21187517vl.LIZJ(false);
                }
            }
            C21187617vm c21187617vm = new C21187617vm(str, j);
            c21187617vm.LJIIIIZZ(new AwS6S3300000_32(str2, (String) c21187617vm, (C21187617vm) str3, (String) arrayList, (List<C21186917vf>) c01cu, (C01CU) str4, (String) 1));
            c21187617vm.LIZJ(false);
        }
    }
}
