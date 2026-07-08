package com.ss.android.ugc.aweme.commercialize.log;

import X.AbstractC1019470cdV;
import X.C1019400cdO;
import X.C1019450cdT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceSessionPositionManagerServiceImpl implements ICommerceSessionPositionManagerService {
    @Override // com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService
    public final void r3(Aweme aweme) {
        C1019400cdO.LJII(aweme, "home_series");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService
    public final void s3(String str) {
        if (str != null && Intrinsics.LJFF("inner_series", "inner_series")) {
            C1019400cdO.LJFF.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService
    public final void v3(List list) {
        C1019400cdO.LJFF("home_series", list);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService
    public final void t3(Aweme aweme, String str) {
        AbstractC1019470cdV abstractC1019470cdV;
        if (str != null && Intrinsics.LJFF("inner_series", "inner_series") && (abstractC1019470cdV = (AbstractC1019470cdV) ((LinkedHashMap) C1019400cdO.LJFF).get(str)) != null) {
            abstractC1019470cdV.LJFF(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService
    public final void u3(String str, List list) {
        if (str != null && Intrinsics.LJFF("inner_series", "inner_series")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C1019400cdO.LJFF;
            Object c1019450cdT = linkedHashMap.get(str);
            if (c1019450cdT == null) {
                c1019450cdT = new C1019450cdT();
                linkedHashMap.put(str, c1019450cdT);
            }
            ((AbstractC1019470cdV) c1019450cdT).LIZLLL(list);
        }
    }
}
