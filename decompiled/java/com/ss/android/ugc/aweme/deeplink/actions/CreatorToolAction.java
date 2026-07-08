package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class CreatorToolAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    @Override // X.AbstractC1951007ka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r8, java.lang.String r9, java.util.HashMap<java.lang.String, java.lang.Object> r10, java.util.ArrayList<java.lang.Integer> r11) {
        /*
            r7 = this;
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r9)     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5 = 0
        La:
            r3 = 0
            if (r5 != 0) goto Le
            return r3
        Le:
            java.lang.String r4 = "scene"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r5, r4)
            if (r2 == 0) goto L51
            int r1 = r2.hashCode()
            r0 = 163771570(0x9c2f4b2, float:4.693391E-33)
            if (r1 == r0) goto L46
            r0 = 1196165383(0x474c0907, float:52233.027)
            if (r1 == r0) goto L3b
            r0 = 1756617736(0x68b3dc08, float:6.7948997E24)
            if (r1 != r0) goto L51
            java.lang.String r0 = "creator_tools"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r1 = "aweme://lynxview?surl=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_creator_center_inapp_lynx%2Fhome%2Ftemplate.js&use_spark=1&enable_prefetch=1&use_forest=1&bdhm_bid=creator_center_fe_inapp_lynx&preload_storage_keys=%5Binspiration_3_0_main%2Cinspiration_3_0_persist%5D"
        L33:
            int r0 = r1.length()
            r6 = 1
            if (r0 != 0) goto L54
            return r3
        L3b:
            java.lang.String r0 = "view_all"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r1 = "aweme://lynxview?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_creator_monetization_center_lynx%2FallProgram%2Ftemplate.js&hide_nav_bar=1&should_full_screen=1&use_spark=1&use_forest=1"
            goto L33
        L46:
            java.lang.String r0 = "work_with_artist"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r1 = "aweme://lynxview/?bundle=pages/campaign-wall/template.js&use_spark=1&group=music_promotion_wwa&thread_strategy=2&disable_swipe=1&status_font_mode=light&surl=https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource/music_promotion_wwa_entrance/pages/campaign-wall/template.js&channel=music_promotion_wwa_entrance&hide_nav_bar=1&use_forest=1&dynamic=1&trans_status_bar=1&bdhm_bid=music_promotion_wwa&force_theme_style=light&source_name=unmanaged&source_platform_channel=app_entrance&red_dot=0&open_timestamp=1708985781940"
            goto L33
        L51:
            java.lang.String r1 = ""
            goto L33
        L54:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r5)
            if (r0 == 0) goto L80
            java.util.Iterator r2 = r0.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 != 0) goto L66
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r5, r1)
            r3.appendQueryParameter(r1, r0)
            goto L66
        L80:
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L90
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r8, r0)     // Catch: java.lang.Throwable -> L90
            r0.open()     // Catch: java.lang.Throwable -> L90
            return r6
        L90:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.CreatorToolAction.LIZ(android.content.Context, java.lang.String, java.util.HashMap, java.util.ArrayList):boolean");
    }
}
