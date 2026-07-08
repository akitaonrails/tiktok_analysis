package com.ss.android.ugc.aweme.relation.ffp;

import X.C1070040dx4;
import X.C1261050iv9;
import X.C2097608Jq;
import X.C2258571Dah;
import X.EnumC1070050dx5;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IFfpSearchApi;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class FfpSearchApiImpl implements IFfpSearchApi {
    public final C2258571Dah LIZ = C2258571Dah.LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // com.ss.android.ugc.aweme.relation.api.IFfpSearchApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends X.InterfaceC1891350zJl>>> r20) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.FfpSearchApiImpl.LIZ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    public static C1261050iv9 LIZIZ(User user, String str, String str2, Map map) {
        EnumC1070050dx5 enumC1070050dx5LIZ = C1070040dx4.LIZ(user);
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("search_id", str);
        pairArr[1] = new Pair("search_keyword", str2);
        String uid = user.getUid();
        String str3 = "";
        if (uid == null) {
            uid = "";
        }
        pairArr[2] = new Pair("search_result_id", uid);
        pairArr[3] = new Pair("section_type", enumC1070050dx5LIZ.getTrackName());
        pairArr[4] = new Pair("token_type", "person");
        String uniqueId = user.getUniqueId();
        if (uniqueId != null) {
            str3 = uniqueId;
        }
        pairArr[5] = new Pair("user_name", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        return new C1261050iv9(user, mapLJIIJ, enumC1070050dx5LIZ);
    }
}
