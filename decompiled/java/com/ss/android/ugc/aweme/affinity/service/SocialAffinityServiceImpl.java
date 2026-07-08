package com.ss.android.ugc.aweme.affinity.service;

import X.C15438062q;
import X.C2097908Jt;
import X.C2204508kN;
import X.C2204808kQ;
import X.C2206608ki;
import X.InterfaceC2204408kM;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.affinity.model.SingleSiteAffinity;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialAffinityServiceImpl implements ISocialAffinityService {
    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final boolean isReady() {
        ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
        return C2204808kQ.LIZ().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final void LIZ(InterfaceC2204408kM interfaceC2204408kM) {
        ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
        C2204508kN c2204508kNLIZ = C2204808kQ.LIZ();
        if (c2204508kNLIZ.LIZJ == null) {
            c2204508kNLIZ.LIZJ = new CopyOnWriteArrayList<>();
        }
        CopyOnWriteArrayList<InterfaceC2204408kM> copyOnWriteArrayList = c2204508kNLIZ.LIZJ;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(interfaceC2204408kM);
        }
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final Map<String, SocialAffinityItem> LIZIZ(String str) {
        int i;
        SingleSiteAffinity next;
        List<SocialAffinityItem> list;
        ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
        C2204508kN c2204508kNLIZ = C2204808kQ.LIZ();
        String str2 = (String) ((Map) C2206608ki.LIZJ.getValue()).get(str);
        if (str2 != null) {
            i = CastIntegerProtector.parseInt(str2);
        } else {
            i = 2002019;
        }
        List<SingleSiteAffinity> list2 = c2204508kNLIZ.LIZLLL;
        LinkedHashMap linkedHashMap = null;
        if (list2 != null) {
            Iterator<SingleSiteAffinity> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.site == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SingleSiteAffinity singleSiteAffinity = next;
            if (singleSiteAffinity != null && (list = singleSiteAffinity.items) != null) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (SocialAffinityItem socialAffinityItem : list) {
                    linkedHashMap.put(socialAffinityItem.toUserId, socialAffinityItem);
                }
            }
        }
        return linkedHashMap;
    }
}
