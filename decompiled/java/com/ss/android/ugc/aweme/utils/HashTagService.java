package com.ss.android.ugc.aweme.utils;

import X.C04TD;
import X.C2188811AlT;
import X.C858540Xm8;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.port.internal.publish.IHashTagService;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class HashTagService implements IHashTagService {
    public static IHashTagService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IHashTagService.class, false);
        if (objLIZ != null) {
            return (IHashTagService) objLIZ;
        }
        if (C04TD.U5 == null) {
            synchronized (IHashTagService.class) {
                if (C04TD.U5 == null) {
                    C04TD.U5 = new HashTagService();
                }
            }
        }
        return C04TD.U5;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.publish.IHashTagService
    public final Pair<String, List<AVTextExtraStruct>> LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C858540Xm8 c858540Xm8 = new C858540Xm8(0, strLIZIZ.length());
        c858540Xm8.LJIIJ = str;
        c858540Xm8.LJIILIIL(CardStruct.IStatusCode.DEFAULT);
        String strLJIILL = c858540Xm8.LJIILL(strLIZIZ);
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 1;
        aVTextExtraStruct.hashTagName = str;
        aVTextExtraStruct.setTagId(CardStruct.IStatusCode.DEFAULT);
        return new Pair<>(strLJIILL, Collections.singletonList(aVTextExtraStruct));
    }
}
