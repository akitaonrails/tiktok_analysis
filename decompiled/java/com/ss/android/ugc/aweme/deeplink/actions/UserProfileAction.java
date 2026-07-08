package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C0W75;
import X.C123100dR;
import X.C1593950ra5;
import X.C1950707kX;
import X.C2095008Iq;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class UserProfileAction extends AbstractC1950107kR<Unit> {
    public String LIZLLL = "";

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[PHI: r1
      0x0036: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:16:0x0034, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[PHI: r1
      0x0051: PHI (r1v8 java.lang.String) = (r1v1 java.lang.String), (r1v9 java.lang.String) binds: [B:9:0x0021, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1951007ka, com.bytedance.router.OpenResultCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.LIZLLL
            java.lang.String r1 = "scan_external"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L50
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r0 = "previous_page"
            r4.LJIIIIZZ(r0, r1)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L20
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L51
        L20:
            r1 = r2
            if (r3 != 0) goto L51
            r0 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJ(r0, r1)
            if (r3 == 0) goto L33
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L36
        L33:
            r1 = r2
            if (r3 == 0) goto L3d
        L36:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L3d
            r2 = r0
        L3d:
            r4.LJIIIIZZ(r1, r2)
            java.lang.String r2 = "profile_entrance_id"
            long r0 = java.lang.System.currentTimeMillis()
            r4.LIZLLL(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L50:
            return
        L51:
            boolean r0 = r3.isConnected()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction.onSuccess(android.content.Intent):void");
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String string;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String string2;
        String str2;
        Object obj;
        IProfileRecommendationService iProfileRecommendationService;
        C1593950ra5 c1593950ra5;
        Uri uri = UriProtector.parse(str);
        Object obj2 = map.get(FollowStatusChangeMethod.PARAM_UID);
        if (obj2 == null) {
            obj2 = map.get("uid");
        }
        Object obj3 = map.get("unique_id");
        if (obj2 != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_uid");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            C0W75.LIZ().LJI(string, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        C0W75 c0w75LIZ = C0W75.LIZ();
        Object obj4 = "";
        if (uri == null || (string2 = uri.toString()) == null) {
            string2 = "";
        }
        c0w75LIZ.getClass();
        C0W75.LIZLLL(string2, string, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        Object obj5 = map.get("invitation_id");
        if (Intrinsics.LJFF(map.get("tt_from"), "scan_code")) {
            this.LIZLLL = "scan_external";
        } else {
            Object obj6 = map.get("convert_url");
            if ((obj6 instanceof String) && (str2 = (String) obj6) != null && u.LJJIIJZLJL(str2, "https://www.tiktok.com/@", false)) {
                this.LIZLLL = "share_profile_link";
            }
        }
        HashMap map2 = new HashMap();
        if (obj2 == null) {
            obj2 = "";
        }
        map2.put("uid", obj2);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        map2.put("sec_user_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        if (obj3 == null) {
            obj = "";
        } else {
            obj = obj3;
        }
        map2.put("unique_id", obj);
        if (obj5 == null) {
            obj5 = "";
        }
        map2.put("invitation_id", obj5);
        map2.put("extra_from_pre_page", this.LIZLLL);
        if (map.get("extra_from_social_avatar_download_page") != null) {
            map2.put("extra_from_social_avatar_download_page", Boolean.TRUE);
        }
        Object obj7 = map.get("source_btm_token");
        if (obj7 != null) {
            map2.put("source_btm_token", obj7);
        }
        Object obj8 = map.get("in_friend_exp");
        if (obj8 != null) {
            obj4 = obj8;
        }
        if ((obj4 instanceof String) && Intrinsics.LJFF(obj4, "1") && (obj3 instanceof String)) {
            String str3 = (String) obj3;
            if (C123100dR.LIZ(str3) && (iProfileRecommendationService = (IProfileRecommendationService) PluggableExtentionKt.pluggableSpi$default(IProfileRecommendationService.class, false, false, false, 14, null)) != null && iProfileRecommendationService.LIZIZ()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
                if (lLJIILIIL != null) {
                    lLJIILIIL.longValue();
                    c1593950ra5 = new C1593950ra5(str3, null, 14);
                } else {
                    c1593950ra5 = new C1593950ra5(null, str3, 13);
                }
                map2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                IProfileRecommendationService iProfileRecommendationService2 = (IProfileRecommendationService) PluggableExtentionKt.pluggableSpi$default(IProfileRecommendationService.class, false, false, false, 14, null);
                if (iProfileRecommendationService2 != null) {
                    iProfileRecommendationService2.LJ(c1593950ra5);
                }
                return new Pair<>("aweme://main", map2);
            }
        }
        return new Pair<>("//user/profile", map2);
    }
}
