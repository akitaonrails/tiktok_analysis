package com.ss.android.ugc.aweme.live.assem;

import X.C1150504el;
import X.C19EG;
import X.C2188811AlT;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowWidgetAssem extends BaseMainContainerAssem {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() throws UnsupportedEncodingException {
        Intent intent;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"FollowWidgetAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
            m251do(intent);
            if (Intrinsics.LJFF(bo(intent, "from_sub_sku_email"), "1")) {
                String strBo = bo(intent, "user_id");
                String uid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid();
                uid.toString();
                if (Intrinsics.LJFF(strBo, uid)) {
                    String userSubscribeDetail = LiveSubscribeLynxUrl.INSTANCE.getValue().getUserSubscribeDetail();
                    String strBo2 = bo(intent, "from_id");
                    String strBo3 = bo(intent, "display_id");
                    if (strBo3 == null) {
                        strBo3 = "";
                    }
                    bo(intent, "anchor_id");
                    String strBo4 = bo(intent, "sec_anchor_id");
                    if (strBo4 == null) {
                        strBo4 = "";
                    }
                    String strBo5 = bo(intent, "user_id");
                    if (strBo5 == null) {
                        strBo5 = "";
                    }
                    String strBo6 = bo(intent, "sec_user_id");
                    String str = strBo6 != null ? strBo6 : "";
                    String strEncode = URLEncoder.encode(C786410Ut5.j4("https://www.tiktok.com/@%s/live", Arrays.copyOf(new Object[]{strBo3}, 1)), "UTF-8");
                    if (strBo2 == null || strBo2.length() == 0) {
                        strBo2 = "sub_change_price_email";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(userSubscribeDetail);
                    sbLIZ.append("&from_id=");
                    sbLIZ.append(strBo2);
                    sbLIZ.append("&display_id=");
                    sbLIZ.append(strBo3);
                    sbLIZ.append("&sec_anchor_id=");
                    sbLIZ.append(strBo4);
                    sbLIZ.append("&anchor_id=");
                    sbLIZ.append(strBo4);
                    sbLIZ.append("&user_id=");
                    sbLIZ.append(strBo5);
                    sbLIZ.append("&sec_user_id=");
                    sbLIZ.append(str);
                    sbLIZ.append("&dl=");
                    sbLIZ.append(strEncode);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (strLIZIZ != null && SmartRouter.canOpen(strLIZIZ)) {
                        SmartRouter.buildRoute(C724240Sb0.LIZ(this), strLIZIZ).open();
                    }
                }
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m251do(Intent intent) {
        C19EG c19egLIZ;
        if (intent != null && Intrinsics.LJFF("follow_widget", bo(intent, "follow_widget_enter_from_merge")) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(new Bundle(), "Following", false);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIIZILJ(c19egLIZ, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r6) {
        /*
            r5 = this;
            super.onNewIntent(r6)
            r5.m251do(r6)
            java.lang.String r0 = "extra_schema_to_highlight_page"
            java.lang.String r2 = bo(r6, r0)
            java.lang.String r0 = "shoot_way"
            java.lang.String r4 = bo(r6, r0)
            if (r2 == 0) goto L61
            boolean r0 = com.bytedance.router.SmartRouter.canOpen(r2)
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r1
            if (r1 == 0) goto L35
            r5.getContext()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            java.lang.String r3 = r1.a4(r0)
            if (r3 != 0) goto L37
        L35:
            java.lang.String r3 = ""
        L37:
            com.bytedance.hybrid.spark.SparkContext r2 = new com.bytedance.hybrid.spark.SparkContext
            r2.<init>()
            r2.LJJLIIJ(r3)
            X.0sFa r0 = new X.0sFa
            r0.<init>()
            r2.LJJLIIIJJI(r0)
            X.19EG r1 = X.C724240Sb0.LIZ(r5)
            if (r1 == 0) goto L60
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L60
            X.0q7g r0 = X.C1541950qED.LIZJ
            r0.getClass()
            X.0qED r0 = new X.0qED
            r0.<init>(r1, r2)
            r0.LIZIZ()
        L60:
            return
        L61:
            java.lang.String r0 = "replay_clip"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L60
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r5.LL
            X.05rV r0 = new java.lang.Runnable() { // from class: X.05rV
                static {
                    /*
                        X.05rV r0 = new X.05rV
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.05rV) X.05rV.LL X.05rV
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1484305rV.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1484305rV.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.String r2 = "FollowWidgetAssem@ac28.jumpToLiveHighlight$2"
                        X.C1C7U.LIZ(r2)
                        android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()     // Catch: java.lang.Throwable -> L1a
                        if (r0 == 0) goto L25
                        X.0mGx r1 = new X.0mGx     // Catch: java.lang.Throwable -> L1a
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
                        r0 = 2131843967(0x7f115b7f, float:1.9321313E38)
                        r1.LJIIIZ(r0)     // Catch: java.lang.Throwable -> L1a
                        r1.LJIIJJI()     // Catch: java.lang.Throwable -> L1a
                        goto L25
                    L1a:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        boolean r0 = X.C2179971ATj.LIZ(r1)
                        if (r0 != 0) goto L25
                        throw r1
                    L25:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1484305rV.run():void");
                }
            }
            X.C786410Ut5.LJJZZIII(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.assem.FollowWidgetAssem.onNewIntent(android.content.Intent):void");
    }

    public static String bo(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
