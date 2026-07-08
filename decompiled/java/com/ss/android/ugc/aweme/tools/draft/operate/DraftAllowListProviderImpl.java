package com.ss.android.ugc.aweme.tools.draft.operate;

import X.C0CHQ;
import X.C0FAO;
import X.C0FAP;
import X.C0M4J;
import X.C0MAY;
import X.C13BV;
import X.C13LP;
import X.C1954807lC;
import X.C201955140j;
import X.C366720EZi;
import X.C554970Lpf;
import X.InterfaceC365900EWe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.DraftAllowListResult;
import com.ss.android.ugc.aweme.services.effect.IDraftAllowListProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftAllowListProviderImpl implements IDraftAllowListProvider {
    @Override // com.ss.android.ugc.aweme.services.effect.IDraftAllowListProvider
    public final DraftAllowListResult collectAllowLists() {
        try {
            List<AwemeDraft> listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, null, null, null, 126));
            if (listQueryDraftList != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                List listLIZ = C366720EZi.LIZ(new C554970Lpf(new WeakReference(C0CHQ.LIZ), null, null, new AwemeDraft(), new AwemeDraft(), null));
                for (AwemeDraft awemeDraft : listQueryDraftList) {
                    Iterator it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        try {
                            Map<C0FAO, List<String>> mapLJ = ((InterfaceC365900EWe) it2.next()).LJ(awemeDraft);
                            if (mapLJ.isEmpty()) {
                                continue;
                            } else {
                                for (Map.Entry<C0FAO, List<String>> entry : mapLJ.entrySet()) {
                                    C0FAO key = entry.getKey();
                                    List<String> value = entry.getValue();
                                    int i = C0FAP.LIZ[key.ordinal()];
                                    if (i == 1) {
                                        arrayList.addAll(value);
                                    } else if (i == 2) {
                                        arrayList3.addAll(value);
                                    } else if (i == 3) {
                                        arrayList4.addAll(value);
                                    } else if (i == 4) {
                                        arrayList5.addAll(value);
                                    } else {
                                        if (i != 5) {
                                            throw new C1954807lC();
                                        }
                                        arrayList2.addAll(value);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                return new DraftAllowListResult(C13LP.LJJJJI(arrayList), C13LP.LJJJJI(arrayList2), C13LP.LJJJJI(arrayList3), C13LP.LJJJJI(arrayList4), C13LP.LJJJJI(arrayList5));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftAllowListProviderImpl.collectAllowLists error", e2);
        }
        C13BV c13bv = C13BV.INSTANCE;
        return new DraftAllowListResult(c13bv, c13bv, c13bv, c13bv, c13bv);
    }
}
