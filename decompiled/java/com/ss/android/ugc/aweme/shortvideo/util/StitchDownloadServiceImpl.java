package com.ss.android.ugc.aweme.shortvideo.util;

import X.C0XF1;
import X.C15O7;
import X.C15OF;
import X.C15OK;
import X.C830060WhI;
import X.InterfaceC2385309Wh;
import Y.ACallableS75S1100000_31;
import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.tools.IStitchDownloadService;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public final class StitchDownloadServiceImpl implements IStitchDownloadService {
    @Override // com.ss.android.ugc.aweme.tools.IStitchDownloadService
    public final void LIZ(final Activity activity, DuetAndStitchRouterConfig duetAndStitchRouterConfig) {
        final C15OF c15of = new C15OF();
        c15of.LJIIZILJ = u.LJIJI(duetAndStitchRouterConfig.type, "use_stitch", false);
        c15of.LJIJ = u.LJIJI(duetAndStitchRouterConfig.enterMethod, "duet_and_stitch_jsb", false);
        c15of.LJIILLIIL = duetAndStitchRouterConfig.copy(duetAndStitchRouterConfig.type, duetAndStitchRouterConfig.awemeId, duetAndStitchRouterConfig.anchors, duetAndStitchRouterConfig.enterFrom, "", duetAndStitchRouterConfig.isEcommerce);
        String str = duetAndStitchRouterConfig.awemeId;
        final String str2 = duetAndStitchRouterConfig.enterFrom;
        if (str2 == null) {
            str2 = "";
        }
        c15of.LJIJJLI = System.currentTimeMillis();
        c15of.LIZ = activity;
        c15of.LIZIZ = str2;
        c15of.LIZJ = "";
        if (C830060WhI.LIZ(str)) {
            c15of.LJII(2131848928, C15OK.AWEME_ID_UNAVAILABLE);
            return;
        }
        if (!C0XF1.LIZLLL(activity)) {
            c15of.LJII(2131837963, C15OK.NO_INTERNET);
        } else {
            if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(c15of.LIZ)) {
                c15of.LJII(2131832497, C15OK.DUAL_MODE);
                return;
            }
            c15of.LJI();
            c15of.LJIJJ = System.currentTimeMillis();
            C15O7.LIZJ(new ACallableS75S1100000_31(c15of, str, 0)).LJ(new InterfaceC2385309Wh() { // from class: X.15OL
                public final /* synthetic */ String LIZLLL = "";

                /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
                @Override // X.InterfaceC2385309Wh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C15O7 r11) {
                    /*
                        r10 = this;
                        java.lang.String r3 = "StitchWithMovieHelper@c4b6.goStitchWithMovie$2"
                        X.C1C7U.LIZ(r3)
                        java.lang.Object r5 = r11.LJIIL()
                        com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
                        if (r5 != 0) goto L22
                        X.15OF r2 = r2
                        r1 = 2131848928(0x7f116ee0, float:1.9331376E38)
                        X.15OK r0 = X.C15OK.AWEME_ID_UNAVAILABLE
                        r2.LJII(r1, r0)
                        X.15OF r0 = r2
                        r0.LIZ()
                    L1c:
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        X.C1C7U.LIZIZ(r3)
                        return r0
                    L22:
                        com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r5)
                        java.lang.String r1 = "Required value was null."
                        if (r0 == 0) goto L46
                        com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r5)
                        if (r0 == 0) goto L75
                        boolean r0 = r0.isPrivate()
                        if (r0 == 0) goto L46
                        X.15OF r2 = r2
                        r1 = 2131835667(0x7f113b13, float:1.930448E38)
                        X.15OK r0 = X.C15OK.PRIVATE_STATUS
                        r2.LJII(r1, r0)
                        X.15OF r0 = r2
                        r0.LIZ()
                        goto L1c
                    L46:
                        com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r5)
                        if (r0 == 0) goto L68
                        com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r5)
                        if (r0 == 0) goto L7e
                        boolean r0 = r0.isDelete()
                        if (r0 == 0) goto L68
                        X.15OF r2 = r2
                        r1 = 2131835666(0x7f113b12, float:1.9304477E38)
                        X.15OK r0 = X.C15OK.VIDEO_IS_NOT_EXIT
                        r2.LJII(r1, r0)
                        X.15OF r0 = r2
                        r0.LIZ()
                        goto L1c
                    L68:
                        X.15OF r4 = r2
                        android.app.Activity r6 = r3
                        java.lang.String r7 = r4
                        java.lang.String r8 = r10.LIZLLL
                        r9 = 0
                        r4.LIZJ(r5, r6, r7, r8, r9)
                        goto L1c
                    L75:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        r1.toString()
                        r0.<init>(r1)
                        throw r0
                    L7e:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        r1.toString()
                        r0.<init>(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C15OL.then(X.15O7):java.lang.Object");
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }
}
