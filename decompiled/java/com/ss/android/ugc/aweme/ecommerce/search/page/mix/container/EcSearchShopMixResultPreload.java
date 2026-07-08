package com.ss.android.ugc.aweme.ecommerce.search.page.mix.container;

import X.C1208504o7;
import X.C1499810p8F;
import X.C1515820pY4;
import X.C15O7;
import X.C674790QdR;
import X.C675000Qdm;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchShopMixResultPreload implements InterfaceC727570SgN<EcSearchMixApi.RealApi, C15O7<C1515820pY4<n>>> {
    public static final int $stable = 0;
    public static final C675000Qdm Companion = new Object() { // from class: X.0Qdm
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final PreloadExtraInfo getPreloadExtraInfo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key_preload_hash");
        return new PreloadExtraInfo(-1, "search_result", "search_result", "/aweme/v1/search/stream/bff/ecom/", arrayList);
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        C674790QdR.LIZ.getClass();
        return new C1499810p8F(false, EcSearchApi.LIZIZ, null, C1208504o7.LIZ, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0264 A[PHI: r32 r33 r34 r35 r36 r37 r38 r39
      0x0264: PHI (r32v0 java.lang.String) = (r32v4 java.lang.String), (r32v5 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r33v1 java.lang.String) = (r33v5 java.lang.String), (r33v6 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r34v2 java.lang.String) = (r34v6 java.lang.String), (r34v7 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r35v2 java.lang.String) = (r35v6 java.lang.String), (r35v7 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r36v3 java.lang.String) = (r36v7 java.lang.String), (r36v8 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r37v4 java.lang.String) = (r37v8 java.lang.String), (r37v9 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r38v4 java.lang.String) = (r38v8 java.lang.String), (r38v9 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r39v5 java.lang.String) = (r39v9 java.lang.String), (r39v10 java.lang.String) binds: [B:98:0x015b, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0290 A[PHI: r5 r40 r41 r42 r43 r44 r45 r46 r47 r48 r49 r50 r65
      0x0290: PHI (r5v4 long) = (r5v10 long), (r5v11 long) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r40v1 int) = (r40v7 int), (r40v8 int) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r41v1 java.lang.String) = (r41v7 java.lang.String), (r41v8 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r42v2 java.lang.String) = (r42v8 java.lang.String), (r42v9 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r43v2 java.lang.String) = (r43v8 java.lang.String), (r43v9 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r44v3 java.lang.String) = (r44v9 java.lang.String), (r44v10 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r45v3 int) = (r45v9 int), (r45v10 int) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r46v3 int) = (r46v9 int), (r46v10 int) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r47v3 java.lang.String) = (r47v9 java.lang.String), (r47v10 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r48v4 java.lang.String) = (r48v10 java.lang.String), (r48v11 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r49v4 java.lang.String) = (r49v10 java.lang.String), (r49v11 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r50v5 java.lang.String) = (r50v11 java.lang.String), (r50v12 java.lang.String) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r65v0 int) = (r65v6 int), (r65v7 int) binds: [B:56:0x00ee, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296 A[PHI: r5 r40 r41 r42 r43 r44 r45 r46 r47 r48 r49 r50 r65 r66
      0x0296: PHI (r5v5 long) = (r5v4 long), (r5v9 long) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r40v2 int) = (r40v1 int), (r40v6 int) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r41v2 java.lang.String) = (r41v1 java.lang.String), (r41v6 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r42v3 java.lang.String) = (r42v2 java.lang.String), (r42v7 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r43v3 java.lang.String) = (r43v2 java.lang.String), (r43v7 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r44v4 java.lang.String) = (r44v3 java.lang.String), (r44v8 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r45v4 int) = (r45v3 int), (r45v8 int) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r46v4 int) = (r46v3 int), (r46v8 int) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r47v4 java.lang.String) = (r47v3 java.lang.String), (r47v8 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r48v5 java.lang.String) = (r48v4 java.lang.String), (r48v9 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r49v5 java.lang.String) = (r49v4 java.lang.String), (r49v9 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r50v6 java.lang.String) = (r50v5 java.lang.String), (r50v10 java.lang.String) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r65v1 int) = (r65v0 int), (r65v5 int) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r66v1 int) = (r66v0 int), (r66v5 int) binds: [B:127:0x0292, B:59:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029c A[PHI: r5 r41 r42 r43 r44 r45 r46 r47 r48 r49 r50
      0x029c: PHI (r5v12 long) = (r5v3 long), (r5v13 long) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r41v9 java.lang.String) = (r41v0 java.lang.String), (r41v10 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r42v10 java.lang.String) = (r42v1 java.lang.String), (r42v11 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r43v10 java.lang.String) = (r43v1 java.lang.String), (r43v11 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r44v11 java.lang.String) = (r44v2 java.lang.String), (r44v12 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r45v11 int) = (r45v2 int), (r45v12 int) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r46v11 int) = (r46v2 int), (r46v12 int) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r47v11 java.lang.String) = (r47v2 java.lang.String), (r47v12 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r48v12 java.lang.String) = (r48v3 java.lang.String), (r48v13 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r49v12 java.lang.String) = (r49v3 java.lang.String), (r49v13 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r50v13 java.lang.String) = (r50v4 java.lang.String), (r50v14 java.lang.String) binds: [B:51:0x00e4, B:49:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae A[PHI: r49 r50
      0x02ae: PHI (r49v0 java.lang.String) = (r49v17 java.lang.String), (r49v18 java.lang.String) binds: [B:38:0x00c4, B:36:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r50v1 java.lang.String) = (r50v18 java.lang.String), (r50v19 java.lang.String) binds: [B:38:0x00c4, B:36:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b8 A[PHI: r5 r48 r49 r50
      0x02b8: PHI (r5v1 long) = (r5v0 long), (r5v16 long) binds: [B:138:0x02b4, B:41:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r48v1 java.lang.String) = (r48v0 java.lang.String), (r48v16 java.lang.String) binds: [B:138:0x02b4, B:41:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r49v1 java.lang.String) = (r49v0 java.lang.String), (r49v16 java.lang.String) binds: [B:138:0x02b4, B:41:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r50v2 java.lang.String) = (r50v1 java.lang.String), (r50v17 java.lang.String) binds: [B:138:0x02b4, B:41:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cc A[PHI: r5 r44 r45 r46 r47 r48 r49 r50
      0x02cc: PHI (r5v2 long) = (r5v1 long), (r5v15 long) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r44v1 java.lang.String) = (r44v0 java.lang.String), (r44v14 java.lang.String) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r45v1 int) = (r45v0 int), (r45v14 int) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r46v1 int) = (r46v0 int), (r46v14 int) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r47v1 java.lang.String) = (r47v0 java.lang.String), (r47v14 java.lang.String) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r48v2 java.lang.String) = (r48v1 java.lang.String), (r48v15 java.lang.String) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r49v2 java.lang.String) = (r49v1 java.lang.String), (r49v15 java.lang.String) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r50v3 java.lang.String) = (r50v2 java.lang.String), (r50v16 java.lang.String) binds: [B:141:0x02c8, B:44:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[PHI: r50
      0x00bc: PHI (r50v19 java.lang.String) = (r50v0 java.lang.String), (r50v20 java.lang.String) binds: [B:34:0x00ba, B:32:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[PHI: r50
      0x00c2: PHI (r50v18 java.lang.String) = (r50v0 java.lang.String), (r50v19 java.lang.String) binds: [B:34:0x00ba, B:36:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[PHI: r5 r42 r43 r44 r45 r46 r47 r48 r49 r50
      0x00dc: PHI (r5v13 long) = (r5v2 long), (r5v14 long) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r42v11 java.lang.String) = (r42v0 java.lang.String), (r42v12 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r43v11 java.lang.String) = (r43v0 java.lang.String), (r43v12 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r44v12 java.lang.String) = (r44v1 java.lang.String), (r44v13 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r45v12 int) = (r45v1 int), (r45v13 int) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r46v12 int) = (r46v1 int), (r46v13 int) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r47v12 java.lang.String) = (r47v1 java.lang.String), (r47v13 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r48v13 java.lang.String) = (r48v2 java.lang.String), (r48v14 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r49v13 java.lang.String) = (r49v2 java.lang.String), (r49v14 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r50v14 java.lang.String) = (r50v3 java.lang.String), (r50v15 java.lang.String) binds: [B:144:0x02d4, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[PHI: r5 r42 r43 r44 r45 r46 r47 r48 r49 r50
      0x00e2: PHI (r5v3 long) = (r5v13 long), (r5v14 long) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r42v1 java.lang.String) = (r42v11 java.lang.String), (r42v12 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r43v1 java.lang.String) = (r43v11 java.lang.String), (r43v12 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r44v2 java.lang.String) = (r44v12 java.lang.String), (r44v13 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r45v2 int) = (r45v12 int), (r45v13 int) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r46v2 int) = (r46v12 int), (r46v13 int) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r47v2 java.lang.String) = (r47v12 java.lang.String), (r47v13 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r48v3 java.lang.String) = (r48v13 java.lang.String), (r48v14 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r49v3 java.lang.String) = (r49v13 java.lang.String), (r49v14 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r50v4 java.lang.String) = (r50v14 java.lang.String), (r50v15 java.lang.String) binds: [B:49:0x00e0, B:47:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106 A[PHI: r5 r40 r41 r42 r43 r44 r45 r46 r47 r48 r49 r50 r65 r66 r67
      0x0106: PHI (r5v6 long) = (r5v5 long), (r5v8 long), (r5v8 long) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r40v3 int) = (r40v2 int), (r40v5 int), (r40v5 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r41v3 java.lang.String) = (r41v2 java.lang.String), (r41v5 java.lang.String), (r41v5 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r42v4 java.lang.String) = (r42v3 java.lang.String), (r42v6 java.lang.String), (r42v6 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r43v4 java.lang.String) = (r43v3 java.lang.String), (r43v6 java.lang.String), (r43v6 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r44v5 java.lang.String) = (r44v4 java.lang.String), (r44v7 java.lang.String), (r44v7 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r45v5 int) = (r45v4 int), (r45v7 int), (r45v7 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r46v5 int) = (r46v4 int), (r46v7 int), (r46v7 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r47v5 java.lang.String) = (r47v4 java.lang.String), (r47v7 java.lang.String), (r47v7 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r48v6 java.lang.String) = (r48v5 java.lang.String), (r48v8 java.lang.String), (r48v8 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r49v6 java.lang.String) = (r49v5 java.lang.String), (r49v8 java.lang.String), (r49v8 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r50v7 java.lang.String) = (r50v6 java.lang.String), (r50v9 java.lang.String), (r50v9 java.lang.String) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r65v2 int) = (r65v1 int), (r65v4 int), (r65v4 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r66v2 int) = (r66v1 int), (r66v4 int), (r66v4 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r67v1 int) = (r67v0 int), (r67v3 int), (r67v3 int) binds: [B:130:0x0298, B:62:0x00fe, B:64:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117 A[PHI: r39
      0x0117: PHI (r39v18 java.lang.String) = (r39v0 java.lang.String), (r39v19 java.lang.String) binds: [B:70:0x0115, B:68:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d A[PHI: r39
      0x011d: PHI (r39v17 java.lang.String) = (r39v0 java.lang.String), (r39v18 java.lang.String) binds: [B:70:0x0115, B:72:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121 A[PHI: r38 r39
      0x0121: PHI (r38v0 java.lang.String) = (r38v16 java.lang.String), (r38v17 java.lang.String) binds: [B:74:0x011f, B:72:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r39v1 java.lang.String) = (r39v17 java.lang.String), (r39v18 java.lang.String) binds: [B:74:0x011f, B:72:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127 A[PHI: r38 r39
      0x0127: PHI (r38v15 java.lang.String) = (r38v0 java.lang.String), (r38v16 java.lang.String) binds: [B:76:0x0125, B:74:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r39v16 java.lang.String) = (r39v1 java.lang.String), (r39v17 java.lang.String) binds: [B:76:0x0125, B:74:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b A[PHI: r37 r38 r39
      0x012b: PHI (r37v14 java.lang.String) = (r37v0 java.lang.String), (r37v15 java.lang.String) binds: [B:76:0x0125, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r38v14 java.lang.String) = (r38v0 java.lang.String), (r38v15 java.lang.String) binds: [B:76:0x0125, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r39v15 java.lang.String) = (r39v1 java.lang.String), (r39v16 java.lang.String) binds: [B:76:0x0125, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131 A[PHI: r37 r38 r39
      0x0131: PHI (r37v1 java.lang.String) = (r37v14 java.lang.String), (r37v15 java.lang.String) binds: [B:80:0x012f, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r38v1 java.lang.String) = (r38v14 java.lang.String), (r38v15 java.lang.String) binds: [B:80:0x012f, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r39v2 java.lang.String) = (r39v15 java.lang.String), (r39v16 java.lang.String) binds: [B:80:0x012f, B:78:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135 A[PHI: r36 r37 r38 r39
      0x0135: PHI (r36v12 java.lang.String) = (r36v0 java.lang.String), (r36v13 java.lang.String) binds: [B:82:0x0133, B:80:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r37v13 java.lang.String) = (r37v1 java.lang.String), (r37v14 java.lang.String) binds: [B:82:0x0133, B:80:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r38v13 java.lang.String) = (r38v1 java.lang.String), (r38v14 java.lang.String) binds: [B:82:0x0133, B:80:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r39v14 java.lang.String) = (r39v2 java.lang.String), (r39v15 java.lang.String) binds: [B:82:0x0133, B:80:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b A[PHI: r36 r37 r38 r39
      0x013b: PHI (r36v11 java.lang.String) = (r36v0 java.lang.String), (r36v12 java.lang.String) binds: [B:82:0x0133, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r37v12 java.lang.String) = (r37v1 java.lang.String), (r37v13 java.lang.String) binds: [B:82:0x0133, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r38v12 java.lang.String) = (r38v1 java.lang.String), (r38v13 java.lang.String) binds: [B:82:0x0133, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r39v13 java.lang.String) = (r39v2 java.lang.String), (r39v14 java.lang.String) binds: [B:82:0x0133, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f A[PHI: r35 r36 r37 r38 r39
      0x013f: PHI (r35v0 java.lang.String) = (r35v10 java.lang.String), (r35v11 java.lang.String) binds: [B:86:0x013d, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r36v1 java.lang.String) = (r36v11 java.lang.String), (r36v12 java.lang.String) binds: [B:86:0x013d, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r37v2 java.lang.String) = (r37v12 java.lang.String), (r37v13 java.lang.String) binds: [B:86:0x013d, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r38v2 java.lang.String) = (r38v12 java.lang.String), (r38v13 java.lang.String) binds: [B:86:0x013d, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r39v3 java.lang.String) = (r39v13 java.lang.String), (r39v14 java.lang.String) binds: [B:86:0x013d, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145 A[PHI: r35 r36 r37 r38 r39
      0x0145: PHI (r35v9 java.lang.String) = (r35v0 java.lang.String), (r35v10 java.lang.String) binds: [B:88:0x0143, B:86:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r36v10 java.lang.String) = (r36v1 java.lang.String), (r36v11 java.lang.String) binds: [B:88:0x0143, B:86:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r37v11 java.lang.String) = (r37v2 java.lang.String), (r37v12 java.lang.String) binds: [B:88:0x0143, B:86:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r38v11 java.lang.String) = (r38v2 java.lang.String), (r38v12 java.lang.String) binds: [B:88:0x0143, B:86:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r39v12 java.lang.String) = (r39v3 java.lang.String), (r39v13 java.lang.String) binds: [B:88:0x0143, B:86:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149 A[PHI: r34 r35 r36 r37 r38 r39
      0x0149: PHI (r34v8 java.lang.String) = (r34v0 java.lang.String), (r34v9 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r35v8 java.lang.String) = (r35v0 java.lang.String), (r35v9 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r36v9 java.lang.String) = (r36v1 java.lang.String), (r36v10 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r37v10 java.lang.String) = (r37v2 java.lang.String), (r37v11 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r38v10 java.lang.String) = (r38v2 java.lang.String), (r38v11 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r39v11 java.lang.String) = (r39v3 java.lang.String), (r39v12 java.lang.String) binds: [B:88:0x0143, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f A[PHI: r34 r35 r36 r37 r38 r39
      0x014f: PHI (r34v1 java.lang.String) = (r34v8 java.lang.String), (r34v9 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r35v1 java.lang.String) = (r35v8 java.lang.String), (r35v9 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r36v2 java.lang.String) = (r36v9 java.lang.String), (r36v10 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r37v3 java.lang.String) = (r37v10 java.lang.String), (r37v11 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r38v3 java.lang.String) = (r38v10 java.lang.String), (r38v11 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r39v4 java.lang.String) = (r39v11 java.lang.String), (r39v12 java.lang.String) binds: [B:92:0x014d, B:90:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153 A[PHI: r33 r34 r35 r36 r37 r38 r39
      0x0153: PHI (r33v6 java.lang.String) = (r33v0 java.lang.String), (r33v7 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r34v7 java.lang.String) = (r34v1 java.lang.String), (r34v8 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r35v7 java.lang.String) = (r35v1 java.lang.String), (r35v8 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r36v8 java.lang.String) = (r36v2 java.lang.String), (r36v9 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r37v9 java.lang.String) = (r37v3 java.lang.String), (r37v10 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r38v9 java.lang.String) = (r38v3 java.lang.String), (r38v10 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r39v10 java.lang.String) = (r39v4 java.lang.String), (r39v11 java.lang.String) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159 A[PHI: r33 r34 r35 r36 r37 r38 r39
      0x0159: PHI (r33v5 java.lang.String) = (r33v0 java.lang.String), (r33v6 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r34v6 java.lang.String) = (r34v1 java.lang.String), (r34v7 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r35v6 java.lang.String) = (r35v1 java.lang.String), (r35v7 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r36v7 java.lang.String) = (r36v2 java.lang.String), (r36v8 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r37v8 java.lang.String) = (r37v3 java.lang.String), (r37v9 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r38v8 java.lang.String) = (r38v3 java.lang.String), (r38v9 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r39v9 java.lang.String) = (r39v4 java.lang.String), (r39v10 java.lang.String) binds: [B:94:0x0151, B:96:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C15O7<X.C1515820pY4<com.google.gson.n>> preload2(android.os.Bundle r114, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi.RealApi>, ? extends com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi.RealApi> r115) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.EcSearchShopMixResultPreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.15O7");
    }
}
