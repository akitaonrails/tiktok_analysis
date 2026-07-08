package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.C1208504o7;
import X.C1499810p8F;
import X.C1515820pY4;
import X.C15O7;
import X.C674790QdR;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchShopResultPreload implements InterfaceC727570SgN<EcSearchApi.RealApi, C15O7<C1515820pY4<n>>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
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
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d6 A[PHI: r0 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46 r61 r62
      0x01d6: PHI (r0v7 long) = (r0v6 long), (r0v12 long) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r36v2 int) = (r36v1 int), (r36v6 int) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r37v2 java.lang.String) = (r37v1 java.lang.String), (r37v6 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r38v3 java.lang.String) = (r38v2 java.lang.String), (r38v7 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r39v3 java.lang.String) = (r39v2 java.lang.String), (r39v7 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r40v4 java.lang.String) = (r40v3 java.lang.String), (r40v8 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r41v4 int) = (r41v3 int), (r41v8 int) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r42v4 int) = (r42v3 int), (r42v8 int) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r43v4 java.lang.String) = (r43v3 java.lang.String), (r43v8 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r44v5 java.lang.String) = (r44v4 java.lang.String), (r44v9 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r45v5 java.lang.String) = (r45v4 java.lang.String), (r45v9 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r46v6 java.lang.String) = (r46v5 java.lang.String), (r46v10 java.lang.String) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r61v1 int) = (r61v0 int), (r61v5 int) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r62v1 int) = (r62v0 int), (r62v5 int) binds: [B:100:0x01d2, B:38:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc A[PHI: r0 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
      0x01dc: PHI (r0v15 long) = (r0v5 long), (r0v16 long) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r37v9 java.lang.String) = (r37v0 java.lang.String), (r37v10 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r38v10 java.lang.String) = (r38v1 java.lang.String), (r38v11 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r39v10 java.lang.String) = (r39v1 java.lang.String), (r39v11 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r40v11 java.lang.String) = (r40v2 java.lang.String), (r40v12 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r41v11 int) = (r41v2 int), (r41v12 int) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r42v11 int) = (r42v2 int), (r42v12 int) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r43v11 java.lang.String) = (r43v2 java.lang.String), (r43v12 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r44v12 java.lang.String) = (r44v3 java.lang.String), (r44v13 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r45v12 java.lang.String) = (r45v3 java.lang.String), (r45v13 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01dc: PHI (r46v13 java.lang.String) = (r46v4 java.lang.String), (r46v14 java.lang.String) binds: [B:30:0x0050, B:28:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee A[PHI: r45 r46
      0x01ee: PHI (r45v0 java.lang.String) = (r45v17 java.lang.String), (r45v18 java.lang.String) binds: [B:17:0x0030, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r46v1 java.lang.String) = (r46v18 java.lang.String), (r46v19 java.lang.String) binds: [B:17:0x0030, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f8 A[PHI: r0 r44 r45 r46
      0x01f8: PHI (r0v3 long) = (r0v2 long), (r0v19 long) binds: [B:111:0x01f4, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r44v1 java.lang.String) = (r44v0 java.lang.String), (r44v16 java.lang.String) binds: [B:111:0x01f4, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r45v1 java.lang.String) = (r45v0 java.lang.String), (r45v16 java.lang.String) binds: [B:111:0x01f4, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r46v2 java.lang.String) = (r46v1 java.lang.String), (r46v17 java.lang.String) binds: [B:111:0x01f4, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020c A[PHI: r0 r40 r41 r42 r43 r44 r45 r46
      0x020c: PHI (r0v4 long) = (r0v3 long), (r0v18 long) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r40v1 java.lang.String) = (r40v0 java.lang.String), (r40v14 java.lang.String) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r41v1 int) = (r41v0 int), (r41v14 int) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r42v1 int) = (r42v0 int), (r42v14 int) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r43v1 java.lang.String) = (r43v0 java.lang.String), (r43v14 java.lang.String) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r44v2 java.lang.String) = (r44v1 java.lang.String), (r44v15 java.lang.String) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r45v2 java.lang.String) = (r45v1 java.lang.String), (r45v15 java.lang.String) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r46v3 java.lang.String) = (r46v2 java.lang.String), (r46v16 java.lang.String) binds: [B:114:0x0208, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r46
      0x0028: PHI (r46v19 java.lang.String) = (r46v0 java.lang.String), (r46v20 java.lang.String) binds: [B:13:0x0026, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[PHI: r46
      0x002e: PHI (r46v18 java.lang.String) = (r46v0 java.lang.String), (r46v19 java.lang.String) binds: [B:13:0x0026, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[PHI: r0 r38 r39 r40 r41 r42 r43 r44 r45 r46
      0x0048: PHI (r0v16 long) = (r0v4 long), (r0v17 long) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r38v11 java.lang.String) = (r38v0 java.lang.String), (r38v12 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r39v11 java.lang.String) = (r39v0 java.lang.String), (r39v12 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r40v12 java.lang.String) = (r40v1 java.lang.String), (r40v13 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r41v12 int) = (r41v1 int), (r41v13 int) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r42v12 int) = (r42v1 int), (r42v13 int) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r43v12 java.lang.String) = (r43v1 java.lang.String), (r43v13 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r44v13 java.lang.String) = (r44v2 java.lang.String), (r44v14 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r45v13 java.lang.String) = (r45v2 java.lang.String), (r45v14 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r46v14 java.lang.String) = (r46v3 java.lang.String), (r46v15 java.lang.String) binds: [B:117:0x0214, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e A[PHI: r0 r38 r39 r40 r41 r42 r43 r44 r45 r46
      0x004e: PHI (r0v5 long) = (r0v16 long), (r0v17 long) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r38v1 java.lang.String) = (r38v11 java.lang.String), (r38v12 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r39v1 java.lang.String) = (r39v11 java.lang.String), (r39v12 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r40v2 java.lang.String) = (r40v12 java.lang.String), (r40v13 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r41v2 int) = (r41v12 int), (r41v13 int) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r42v2 int) = (r42v12 int), (r42v13 int) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r43v2 java.lang.String) = (r43v12 java.lang.String), (r43v13 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r44v3 java.lang.String) = (r44v13 java.lang.String), (r44v14 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r45v3 java.lang.String) = (r45v13 java.lang.String), (r45v14 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r46v4 java.lang.String) = (r46v14 java.lang.String), (r46v15 java.lang.String) binds: [B:28:0x004c, B:26:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072 A[PHI: r0 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46 r61 r62 r63
      0x0072: PHI (r0v8 long) = (r0v7 long), (r0v11 long), (r0v11 long) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r36v3 int) = (r36v2 int), (r36v5 int), (r36v5 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r37v3 java.lang.String) = (r37v2 java.lang.String), (r37v5 java.lang.String), (r37v5 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r38v4 java.lang.String) = (r38v3 java.lang.String), (r38v6 java.lang.String), (r38v6 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r39v4 java.lang.String) = (r39v3 java.lang.String), (r39v6 java.lang.String), (r39v6 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r40v5 java.lang.String) = (r40v4 java.lang.String), (r40v7 java.lang.String), (r40v7 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r41v5 int) = (r41v4 int), (r41v7 int), (r41v7 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r42v5 int) = (r42v4 int), (r42v7 int), (r42v7 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r43v5 java.lang.String) = (r43v4 java.lang.String), (r43v7 java.lang.String), (r43v7 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r44v6 java.lang.String) = (r44v5 java.lang.String), (r44v8 java.lang.String), (r44v8 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r45v6 java.lang.String) = (r45v5 java.lang.String), (r45v8 java.lang.String), (r45v8 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r46v7 java.lang.String) = (r46v6 java.lang.String), (r46v9 java.lang.String), (r46v9 java.lang.String) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r61v2 int) = (r61v1 int), (r61v4 int), (r61v4 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r62v2 int) = (r62v1 int), (r62v4 int), (r62v4 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r63v1 int) = (r63v0 int), (r63v3 int), (r63v3 int) binds: [B:103:0x01d8, B:41:0x006a, B:43:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083 A[PHI: r35
      0x0083: PHI (r35v16 java.lang.String) = (r35v0 java.lang.String), (r35v17 java.lang.String) binds: [B:49:0x0081, B:47:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089 A[PHI: r35
      0x0089: PHI (r35v15 java.lang.String) = (r35v0 java.lang.String), (r35v16 java.lang.String) binds: [B:49:0x0081, B:51:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d A[PHI: r34 r35
      0x008d: PHI (r34v0 java.lang.String) = (r34v14 java.lang.String), (r34v15 java.lang.String) binds: [B:53:0x008b, B:51:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r35v1 java.lang.String) = (r35v15 java.lang.String), (r35v16 java.lang.String) binds: [B:53:0x008b, B:51:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093 A[PHI: r34 r35
      0x0093: PHI (r34v13 java.lang.String) = (r34v0 java.lang.String), (r34v14 java.lang.String) binds: [B:55:0x0091, B:53:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r35v14 java.lang.String) = (r35v1 java.lang.String), (r35v15 java.lang.String) binds: [B:55:0x0091, B:53:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097 A[PHI: r33 r34 r35
      0x0097: PHI (r33v12 java.lang.String) = (r33v0 java.lang.String), (r33v13 java.lang.String) binds: [B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r34v12 java.lang.String) = (r34v0 java.lang.String), (r34v13 java.lang.String) binds: [B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r35v13 java.lang.String) = (r35v1 java.lang.String), (r35v14 java.lang.String) binds: [B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d A[PHI: r33 r34 r35
      0x009d: PHI (r33v1 java.lang.String) = (r33v12 java.lang.String), (r33v13 java.lang.String) binds: [B:59:0x009b, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r34v1 java.lang.String) = (r34v12 java.lang.String), (r34v13 java.lang.String) binds: [B:59:0x009b, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r35v2 java.lang.String) = (r35v13 java.lang.String), (r35v14 java.lang.String) binds: [B:59:0x009b, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1 A[PHI: r32 r33 r34 r35
      0x00a1: PHI (r32v10 java.lang.String) = (r32v0 java.lang.String), (r32v11 java.lang.String) binds: [B:61:0x009f, B:59:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r33v11 java.lang.String) = (r33v1 java.lang.String), (r33v12 java.lang.String) binds: [B:61:0x009f, B:59:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r34v11 java.lang.String) = (r34v1 java.lang.String), (r34v12 java.lang.String) binds: [B:61:0x009f, B:59:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r35v12 java.lang.String) = (r35v2 java.lang.String), (r35v13 java.lang.String) binds: [B:61:0x009f, B:59:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7 A[PHI: r32 r33 r34 r35
      0x00a7: PHI (r32v9 java.lang.String) = (r32v0 java.lang.String), (r32v10 java.lang.String) binds: [B:61:0x009f, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r33v10 java.lang.String) = (r33v1 java.lang.String), (r33v11 java.lang.String) binds: [B:61:0x009f, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r34v10 java.lang.String) = (r34v1 java.lang.String), (r34v11 java.lang.String) binds: [B:61:0x009f, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r35v11 java.lang.String) = (r35v2 java.lang.String), (r35v12 java.lang.String) binds: [B:61:0x009f, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[PHI: r31 r32 r33 r34 r35
      0x00ab: PHI (r31v0 java.lang.String) = (r31v8 java.lang.String), (r31v9 java.lang.String) binds: [B:65:0x00a9, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r32v1 java.lang.String) = (r32v9 java.lang.String), (r32v10 java.lang.String) binds: [B:65:0x00a9, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r33v2 java.lang.String) = (r33v10 java.lang.String), (r33v11 java.lang.String) binds: [B:65:0x00a9, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r34v2 java.lang.String) = (r34v10 java.lang.String), (r34v11 java.lang.String) binds: [B:65:0x00a9, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r35v3 java.lang.String) = (r35v11 java.lang.String), (r35v12 java.lang.String) binds: [B:65:0x00a9, B:63:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1 A[PHI: r31 r32 r33 r34 r35
      0x00b1: PHI (r31v7 java.lang.String) = (r31v0 java.lang.String), (r31v8 java.lang.String) binds: [B:67:0x00af, B:65:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r32v8 java.lang.String) = (r32v1 java.lang.String), (r32v9 java.lang.String) binds: [B:67:0x00af, B:65:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r33v9 java.lang.String) = (r33v2 java.lang.String), (r33v10 java.lang.String) binds: [B:67:0x00af, B:65:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r34v9 java.lang.String) = (r34v2 java.lang.String), (r34v10 java.lang.String) binds: [B:67:0x00af, B:65:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r35v10 java.lang.String) = (r35v3 java.lang.String), (r35v11 java.lang.String) binds: [B:67:0x00af, B:65:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5 A[PHI: r30 r31 r32 r33 r34 r35
      0x00b5: PHI (r30v6 java.lang.String) = (r30v0 java.lang.String), (r30v7 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r31v6 java.lang.String) = (r31v0 java.lang.String), (r31v7 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r32v7 java.lang.String) = (r32v1 java.lang.String), (r32v8 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r33v8 java.lang.String) = (r33v2 java.lang.String), (r33v9 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r34v8 java.lang.String) = (r34v2 java.lang.String), (r34v9 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r35v9 java.lang.String) = (r35v3 java.lang.String), (r35v10 java.lang.String) binds: [B:67:0x00af, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb A[PHI: r30 r31 r32 r33 r34 r35
      0x00bb: PHI (r30v1 java.lang.String) = (r30v6 java.lang.String), (r30v7 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r31v1 java.lang.String) = (r31v6 java.lang.String), (r31v7 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r32v2 java.lang.String) = (r32v7 java.lang.String), (r32v8 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r33v3 java.lang.String) = (r33v8 java.lang.String), (r33v9 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r34v3 java.lang.String) = (r34v8 java.lang.String), (r34v9 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r35v4 java.lang.String) = (r35v9 java.lang.String), (r35v10 java.lang.String) binds: [B:71:0x00b9, B:69:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bf A[PHI: r29 r30 r31 r32 r33 r34 r35
      0x00bf: PHI (r29v4 java.lang.String) = (r29v0 java.lang.String), (r29v5 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r30v5 java.lang.String) = (r30v1 java.lang.String), (r30v6 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r31v5 java.lang.String) = (r31v1 java.lang.String), (r31v6 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r32v6 java.lang.String) = (r32v2 java.lang.String), (r32v7 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r33v7 java.lang.String) = (r33v3 java.lang.String), (r33v8 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r34v7 java.lang.String) = (r34v3 java.lang.String), (r34v8 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r35v8 java.lang.String) = (r35v4 java.lang.String), (r35v9 java.lang.String) binds: [B:73:0x00bd, B:71:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5 A[PHI: r29 r30 r31 r32 r33 r34 r35
      0x00c5: PHI (r29v3 java.lang.String) = (r29v0 java.lang.String), (r29v4 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r30v4 java.lang.String) = (r30v1 java.lang.String), (r30v5 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r31v4 java.lang.String) = (r31v1 java.lang.String), (r31v5 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r32v5 java.lang.String) = (r32v2 java.lang.String), (r32v6 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r33v6 java.lang.String) = (r33v3 java.lang.String), (r33v7 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r34v6 java.lang.String) = (r34v3 java.lang.String), (r34v7 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r35v7 java.lang.String) = (r35v4 java.lang.String), (r35v8 java.lang.String) binds: [B:73:0x00bd, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4 A[PHI: r28 r29 r30 r31 r32 r33 r34 r35
      0x01a4: PHI (r28v0 java.lang.String) = (r28v2 java.lang.String), (r28v3 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r29v1 java.lang.String) = (r29v3 java.lang.String), (r29v4 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r30v2 java.lang.String) = (r30v4 java.lang.String), (r30v5 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r31v2 java.lang.String) = (r31v4 java.lang.String), (r31v5 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r32v3 java.lang.String) = (r32v5 java.lang.String), (r32v6 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r33v4 java.lang.String) = (r33v6 java.lang.String), (r33v7 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r34v4 java.lang.String) = (r34v6 java.lang.String), (r34v7 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r35v5 java.lang.String) = (r35v7 java.lang.String), (r35v8 java.lang.String) binds: [B:77:0x00c7, B:75:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0 A[PHI: r0 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46 r61
      0x01d0: PHI (r0v6 long) = (r0v13 long), (r0v14 long) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r36v1 int) = (r36v7 int), (r36v8 int) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r37v1 java.lang.String) = (r37v7 java.lang.String), (r37v8 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r38v2 java.lang.String) = (r38v8 java.lang.String), (r38v9 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r39v2 java.lang.String) = (r39v8 java.lang.String), (r39v9 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r40v3 java.lang.String) = (r40v9 java.lang.String), (r40v10 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r41v3 int) = (r41v9 int), (r41v10 int) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r42v3 int) = (r42v9 int), (r42v10 int) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r43v3 java.lang.String) = (r43v9 java.lang.String), (r43v10 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r44v4 java.lang.String) = (r44v10 java.lang.String), (r44v11 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r45v4 java.lang.String) = (r45v10 java.lang.String), (r45v11 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r46v5 java.lang.String) = (r46v11 java.lang.String), (r46v12 java.lang.String) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r61v0 int) = (r61v6 int), (r61v7 int) binds: [B:35:0x005a, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C15O7<X.C1515820pY4<com.google.gson.n>> preload2(android.os.Bundle r105, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi.RealApi>, ? extends com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi.RealApi> r106) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchShopResultPreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.15O7");
    }
}
