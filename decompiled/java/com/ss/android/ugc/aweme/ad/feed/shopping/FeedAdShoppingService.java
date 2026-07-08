package com.ss.android.ugc.aweme.ad.feed.shopping;

import X.C01GW;
import X.C0X9S;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1484105rT;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdShoppingService implements IFeedAdShoppingService {
    public static final C01GW<HashSet<String>> LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(171));
    public static final C01GW<HashSet<String>> LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(170));
    public static final C01GW<HashMap<String, Long>> LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(169));
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public String LIZJ;
    public String LIZLLL;

    /* JADX INFO: loaded from: classes3.dex */
    public interface ShoppingCouponRequestApi {
        public static final C1484105rT LIZ = C1484105rT.LIZ;

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/ad/qcpx_incentive/claim/")
        C0X9S<BaseResponse> getShoppingCoupon(@InterfaceC1501050pAF("origin_req_id") String str, @InterfaceC1501050pAF("incentive_info") String str2, @InterfaceC1501050pAF("trigger_boost") Integer num);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    public final long LIZLLL(Aweme aweme) {
        Long creativeId;
        if (C1017070cZd.LJJIJLIJ(aweme) == null) {
            return System.currentTimeMillis();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getRequestId());
        sbLIZ.append('_');
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ != null) {
            creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
        } else {
            creativeId = null;
        }
        sbLIZ.append(creativeId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW<HashMap<String, Long>> c01gw = LJI;
        Long lValueOf = c01gw.getValue().get(strLIZIZ);
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
            c01gw.getValue().put(strLIZIZ, lValueOf);
        }
        return lValueOf.longValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    public final void LIZ(Aweme aweme, AFwS232S0000000_4 aFwS232S0000000_4) throws JSONException {
        LIZJ(aweme, aFwS232S0000000_4, null);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    public final void getShoppingCoupon(Aweme aweme, Function1<Object, Unit> function1) throws JSONException {
        LIZJ(aweme, function1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String handleECAnchorSchemaIfNeeded(java.lang.String r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) throws org.json.JSONException {
        /*
            r7 = this;
            r2 = 0
            if (r9 == 0) goto Ld
            boolean r1 = r9.isAd()
            r0 = 1
            if (r1 != r0) goto Ld
        La:
            if (r0 != 0) goto Lf
            return r8
        Ld:
            r0 = 0
            goto La
        Lf:
            X.01GW r0 = X.C0A6Q.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1e
            return r8
        L1e:
            X.0cSO r0 = com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService.LIZ
            r0.getClass()
            java.lang.String r0 = "aweme://ec/sku?"
            boolean r4 = kotlin.text.u.LJJIIJZLJL(r8, r0, r2)
            java.lang.String r0 = "aweme://ec/order_submit_v2?"
            boolean r3 = kotlin.text.u.LJJIIJZLJL(r8, r0, r2)
            if (r4 != 0) goto L34
            if (r3 != 0) goto L34
            return r8
        L34:
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            X.0cSN r0 = X.C1012570cSN.LIZ
            java.lang.String r2 = "trackParams"
            r0.getClass()
            r6 = 0
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r5, r2)     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r6
        L4a:
            if (r0 != 0) goto L4d
            return r8
        L4d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L56
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L56
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L56
            goto L62
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L62:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L69
            r6 = r1
        L69:
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            if (r6 != 0) goto L6e
            return r8
        L6e:
            X.0cSN r0 = X.C1012570cSN.LIZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start_click_time"
            X.C1012570cSN.LIZIZ(r6, r0, r1)
            java.lang.String r1 = "previous_page"
            java.lang.String r0 = "homepage_hot"
            X.C1012570cSN.LIZIZ(r6, r1, r0)
            java.lang.String r0 = X.C786410Ut5.J3(r6)
            android.net.Uri r0 = X.C1012570cSN.LIZJ(r5, r2, r0)
            android.net.Uri r0 = X.C1012570cSN.LIZ(r9, r0, r4, r3)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService.handleECAnchorSchemaIfNeeded(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r20, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r21, java.lang.Number r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, kotlin.jvm.functions.Function1, java.lang.Number):void");
    }

    public static void LJ(int i, int i2, Aweme aweme, String str) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "ad_coupon_toast_show", awemeRawAdLJJIJLIJ);
            c1022820ciuLIZLLL.LIZJ("shop_anchor", "refer");
            if (str == null) {
                str = "";
            }
            c1022820ciuLIZLLL.LIZIZ(str, "message");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "path");
            c1022820ciuLIZLLL.LJII();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0156, code lost:
    
        if (r0 == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8 A[Catch: Exception -> 0x0116, TryCatch #2 {Exception -> 0x0116, blocks: (B:49:0x00c7, B:54:0x00dc, B:60:0x00e8, B:62:0x00f3, B:66:0x00fc, B:68:0x0106, B:52:0x00d6, B:50:0x00d0), top: B:158:0x00c7, inners: #0 }] */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, java.util.Map r14, boolean r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.util.Map, boolean):java.lang.String");
    }
}
