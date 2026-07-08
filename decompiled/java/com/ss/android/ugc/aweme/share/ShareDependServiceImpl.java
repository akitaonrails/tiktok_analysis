package com.ss.android.ugc.aweme.share;

import X.AbstractC1370760lm6;
import X.C04TD;
import X.C1375500ltk;
import X.C21560119Zf;
import X.C21560219Zg;
import X.C2413209cw;
import X.C666390QBx;
import X.C735690StT;
import X.C786410Ut5;
import X.DialogInterfaceC21560019Ze;
import X.DialogInterfaceOnClickListenerC1401900maK;
import X.InterfaceC1369790lkX;
import X.InterfaceC1377740lxM;
import X.InterfaceC1381470m3N;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.gif.IGifShareService;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareDependServiceImpl extends AbstractC1370760lm6 {
    public static ShareDependService LJJJJI() {
        Object objLIZ = C04TD.LIZ(ShareDependService.class, false);
        if (objLIZ != null) {
            return (ShareDependService) objLIZ;
        }
        if (C04TD.Z4 == null) {
            synchronized (ShareDependService.class) {
                if (C04TD.Z4 == null) {
                    C04TD.Z4 = new ShareDependServiceImpl();
                }
            }
        }
        return C04TD.Z4;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final InterfaceC1377740lxM LJIILIIL() {
        IGifShareService iGifShareService = (IGifShareService) PluggableExtentionKt.pluggableSpi$default(IGifShareService.class, false, false, false, 14, null);
        if (iGifShareService != null) {
            return iGifShareService.LIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LIZJ(Aweme aweme) {
        C2413209cw.LIZ.getClass();
        IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
        if (iWallpaperServiceApiLIZ != null) {
            return iWallpaperServiceApiLIZ.LIZJ(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIILJJIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        ((Keva) C735690StT.LIZ.getValue()).storeLong(interfaceC1369790lkX.key(), System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIJJI(Aweme aweme, String str) {
        C2413209cw.LIZ.getClass();
        IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
        if (iWallpaperServiceApiLIZ != null) {
            iWallpaperServiceApiLIZ.LIZLLL(aweme, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIILL(Context context, String str) {
        ComplianceServiceProvider.LJJ().LIZIZ(C1375500ltk.LJII(context), new Uri.Builder().appendQueryParameter("report_type", "music").appendQueryParameter("object_id", str));
        ComplianceServiceProvider.LJJ().LIZ("play_full_song", "music", "", str, "", "click_resso_song_player");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJJI(Activity activity, final Function1 function1) {
        InterfaceC1381470m3N interfaceC1381470m3N;
        if (function1 != null) {
            interfaceC1381470m3N = new InterfaceC1381470m3N() { // from class: X.0m3M
                @Override // X.InterfaceC1381470m3N
                public final /* synthetic */ void LIZ(boolean z) {
                    function1.invoke(Boolean.valueOf(z));
                }
            };
        } else {
            interfaceC1381470m3N = null;
        }
        C21560119Zf c21560119Zf = new C21560119Zf(activity, R.style.sf);
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LIZLLL = c21560219Zg.LIZ.getText(2131838183);
        C21560219Zg c21560219Zg2 = c21560119Zf.LIZ;
        c21560219Zg2.LJFF = c21560219Zg2.LIZ.getText(2131838182);
        c21560119Zf.LIZIZ(R.string.f1_, new DialogInterfaceOnClickListenerC1401900maK(interfaceC1381470m3N, activity, 2));
        c21560119Zf.LIZJ(R.string.fte, new DialogInterfaceOnClickListenerC1401900maK(interfaceC1381470m3N, activity, 1));
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        try {
            dialogInterfaceC21560019ZeLIZ.setCancelable(false);
            dialogInterfaceC21560019ZeLIZ.setCanceledOnTouchOutside(false);
            C786410Ut5.D4(dialogInterfaceC21560019ZeLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJJ(Context context, Aweme aweme, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C666390QBx.LIZ = aweme;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting//privacy");
        smartRouteBuildRoute.withParam("tab_name", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("enter_method", str3);
        smartRouteBuildRoute.withParam("is_from_long_press_panel", z);
        smartRouteBuildRoute.withParam("impr_id", str4);
        smartRouteBuildRoute.withParam("extra_is_from_friends_v3_water_fall", z2);
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a9, code lost:
    
        if (r37.equals("general_search") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b3, code lost:
    
        if (r37.equals("search_result") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b7, code lost:
    
        r16 = X.C0SUC.LIZ(r35);
        r4 = X.C1ER1.LIZIZ;
        r4.LLIIII(r33);
        r8 = r4.fetchSearchParams(r37, r16.getPreviousPageWithPlaylistScene());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ce, code lost:
    
        if ((!r8.isEmpty()) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d0, code lost:
    
        r16 = r4.LLIZ(r37, "", "", java.lang.String.valueOf(com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getRank(r33)), r8).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f2, code lost:
    
        if (r16.hasNext() == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f4, code lost:
    
        r4 = (java.util.Map.Entry) r16.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0304, code lost:
    
        if (X.C123100dR.LIZ((java.lang.String) r4.getValue()) == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0306, code lost:
    
        r1.put((java.lang.String) r4.getKey(), r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0314, code lost:
    
        r4 = r16.getFromGroupId();
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031a, code lost:
    
        r4 = r8.get("last_from_group_id");
        r8 = r8.get("search_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0322, code lost:
    
        X.C1ER1.LIZIZ.LLLF(r33, r37, r1);
        r2 = r33.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032b, code lost:
    
        if (r2 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032d, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032f, code lost:
    
        r1.put("group_id", r2);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x0224. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ac A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:177:0x03af, B:179:0x03c1, B:181:0x03c7, B:183:0x03cd, B:192:0x03e5, B:194:0x03f0, B:195:0x03f8, B:197:0x03fe, B:174:0x03a7, B:176:0x03ac), top: B:265:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c1 A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:177:0x03af, B:179:0x03c1, B:181:0x03c7, B:183:0x03cd, B:192:0x03e5, B:194:0x03f0, B:195:0x03f8, B:197:0x03fe, B:174:0x03a7, B:176:0x03ac), top: B:265:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f0 A[Catch: JSONException -> 0x0412, TryCatch #0 {JSONException -> 0x0412, blocks: (B:177:0x03af, B:179:0x03c1, B:181:0x03c7, B:183:0x03cd, B:192:0x03e5, B:194:0x03f0, B:195:0x03f8, B:197:0x03fe, B:174:0x03a7, B:176:0x03ac), top: B:265:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c0  */
    /* JADX WARN: Type inference failed for: r1v47, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [long] */
    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme r33, java.lang.String r34, android.content.Context r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, kotlin.jvm.functions.Function2<? super android.net.Uri.Builder, ? super com.google.gson.n, kotlin.Unit> r41, java.lang.String r42) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareDependServiceImpl.LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function2, java.lang.String):void");
    }
}
