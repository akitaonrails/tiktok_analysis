package com.ss.android.ugc.aweme.serviceplugin;

import X.C0PEM;
import X.C1227904rF;
import X.C1232860iBg;
import X.C1383240m6E;
import X.C1383270m6H;
import X.C1383280m6I;
import X.C1387310mCn;
import X.C2296808zG;
import X.C23250099c;
import X.C639060P4u;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.minis.api.IMinisShareService;
import com.ss.android.ugc.aweme.minis.model.CheckEligibilityResponse;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisShareService implements IMinisShareService {
    @Override // com.ss.android.ugc.aweme.minis.api.IMinisShareService
    public final Object LIZ(List<? extends IMContact> list, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return C1383240m6E.LIZ.LIZIZ(list, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisShareService
    public final void LIZIZ(String str, List<? extends IMContact> list) {
        Map map;
        Map map2;
        Map map3;
        C1383240m6E.LIZ.getClass();
        ArrayList<IMContact> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty() && C1383240m6E.LIZIZ == null) {
            C1383280m6I.LIZ.getClass();
            Map map4 = null;
            if (C1387310mCn.LJ(C1383280m6I.LIZ().getLong("store_time", 0L))) {
                String string = C1383280m6I.LIZ().getString(C1383280m6I.LIZIZ("uid_region_eligibility"), null);
                if (string != null) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Type type = C1383280m6I.LIZJ;
                    c1227904rF.getClass();
                    map = (Map) C1227904rF.LIZJ(string, type);
                } else {
                    map = null;
                }
                String string2 = C1383280m6I.LIZ().getString(C1383280m6I.LIZIZ("uid_age_eligibility"), null);
                if (string2 != null) {
                    C1227904rF c1227904rF2 = C1227904rF.LIZ;
                    Type type2 = C1383280m6I.LIZJ;
                    c1227904rF2.getClass();
                    map2 = (Map) C1227904rF.LIZJ(string2, type2);
                } else {
                    map2 = null;
                }
                String string3 = C1383280m6I.LIZ().getString(C1383280m6I.LIZIZ("gid_region_eligibility"), null);
                if (string3 != null) {
                    C1227904rF c1227904rF3 = C1227904rF.LIZ;
                    Type type3 = C1383280m6I.LIZJ;
                    c1227904rF3.getClass();
                    map3 = (Map) C1227904rF.LIZJ(string3, type3);
                } else {
                    map3 = null;
                }
                String string4 = C1383280m6I.LIZ().getString(C1383280m6I.LIZIZ("gid_age_eligibility"), null);
                if (string4 != null) {
                    C1227904rF c1227904rF4 = C1227904rF.LIZ;
                    Type type4 = C1383280m6I.LIZJ;
                    c1227904rF4.getClass();
                    map4 = (Map) C1227904rF.LIZJ(string4, type4);
                }
                C1383240m6E.LIZIZ = new CheckEligibilityResponse(map, map2, map3, map4);
                return;
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (IMContact iMContact : arrayList) {
                    if (iMContact instanceof IMUser) {
                        String uid = iMContact.getUid();
                        if (uid != null) {
                            arrayList2.add(uid);
                        }
                    } else if (iMContact instanceof IMConversation) {
                        arrayList3.add(String.valueOf(((IMConversation) iMContact).getConversationId()));
                    }
                }
                IMetaServiceApi.LIZ.getClass();
                C1383240m6E.LIZJ = C1232860iBg.LIZ().checkConversationEligibility(str, arrayList2, arrayList3);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 10))), null, null, new C1383270m6H(null), 3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
