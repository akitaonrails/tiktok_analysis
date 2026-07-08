package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C19262710Xp;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePCSUnifyAction extends AbstractC1950107kR<Unit> {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // X.AbstractC1950207kS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> LIZLLL(java.lang.String r13, java.util.HashMap<java.lang.String, java.lang.Object> r14, X.C1950707kX r15) {
        /*
            r12 = this;
            java.lang.String r0 = "biz_destination_page"
            java.lang.Object r5 = r14.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            r11 = 0
            if (r0 == 0) goto L65
            java.lang.String r5 = (java.lang.String) r5
        Ld:
            java.lang.String r4 = ""
            if (r5 != 0) goto L12
            r5 = r4
        L12:
            java.lang.String r0 = ".."
            r7 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r5, r0, r7)
            if (r0 != 0) goto L63
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r6 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r10 = 14
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L35
            X.0cRz r0 = r0.F4()
            if (r0 == 0) goto L35
            java.lang.String[] r0 = r0.LJI()
            if (r0 != 0) goto L41
        L35:
            java.lang.String r3 = "privilege_page"
            java.lang.String r2 = "settings"
            java.lang.String r1 = "allinone"
            java.lang.String r0 = "smb_optin"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
        L41:
            int r0 = X.C13LQ.LJJIJIIJI(r5, r0)
            if (r0 < 0) goto L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sslocal://webcast_pcs/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L57:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto L67
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r14)
            return r0
        L63:
            r1 = r4
            goto L57
        L65:
            r5 = r11
            goto Ld
        L67:
            kotlin.Pair r4 = new kotlin.Pair
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.util.Set r0 = r14.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r3.appendQueryParameter(r1, r0)
            goto L79
        L97:
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.LivePCSUnifyAction.LIZLLL(java.lang.String, java.util.HashMap, X.07kX):kotlin.Pair");
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (!C19262710Xp.LIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
