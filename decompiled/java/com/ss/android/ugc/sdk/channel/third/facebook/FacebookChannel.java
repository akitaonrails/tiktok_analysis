package com.ss.android.ugc.sdk.channel.third.facebook;

import X.C01GW;
import X.C0M7Y;
import X.C0WZX;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1374810lsd;
import X.C1375540lto;
import X.C1376440lvG;
import X.C15438062q;
import X.C2204961BRm;
import X.C452501pT;
import X.C516560KNq;
import X.C839020Wvk;
import X.EnumC1376430lvF;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class FacebookChannel extends IWrapChannel {
    public final C01GW LL = C452501pT.LIZIZ(new C1376440lvG());

    @Override // X.AbstractC1376390lvB, X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final boolean LJIIZILJ(Context context) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJJL() {
        return "facebook";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJZ() {
        return "com.facebook.katana";
    }

    public final Intent LJJLIIIJLLLLLLLZ(Context context, Intent intent) throws Throwable {
        List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2s9dykwbuumbZrCkiaOMUufoH4d4lX7UWOEJK6g+EKyodiA6ROekcsdAQ==", null));
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
        Iterator it2 = listLJJJJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResolveInfo) it2.next()).activityInfo.name);
        }
        for (String str : arrayList) {
            if (a0.LJJIIZI(str, "ImplicitShareIntentHandler", false)) {
                intent.setClassName("com.facebook.katana", str);
                return intent;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[PHI: r2
      0x0062: PHI (r2v2 android.content.Intent) = 
      (r2v0 android.content.Intent)
      (r2v1 android.content.Intent)
      (r2v3 android.content.Intent)
      (r2v4 android.content.Intent)
     binds: [B:19:0x003e, B:14:0x002d, B:21:0x0041, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[PHI: r0
      0x0018: PHI (r0v9 android.content.Intent) = (r0v4 android.content.Intent), (r0v5 android.content.Intent), (r0v17 android.content.Intent) binds: [B:19:0x003e, B:14:0x002d, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIJ(android.app.Activity r4, X.AbstractC1375550ltp r5) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = r5 instanceof X.C1371420lnA
            if (r0 == 0) goto L1f
            java.lang.String r0 = "com.facebook.katana"
            boolean r0 = X.C516560KNq.LIZ(r4, r0)
            if (r0 == 0) goto L41
            X.0lnA r5 = (X.C1371420lnA) r5
            android.content.Intent r0 = r3.LJFF(r4, r5)
            android.content.Intent r2 = r3.LJJLIIIJLLLLLLLZ(r4, r0)
            if (r2 != 0) goto L62
        L18:
            if (r0 == 0) goto L64
        L1a:
            boolean r0 = r3.LJ(r4, r0)
            return r0
        L1f:
            boolean r0 = r5 instanceof X.C1375540lto
            if (r0 == 0) goto L30
            X.0lto r5 = (X.C1375540lto) r5
            android.content.Intent r0 = r3.LJJ(r4, r5)
            android.content.Intent r2 = r3.LJJLIIIJLLLLLLLZ(r4, r0)
            if (r2 != 0) goto L62
            goto L18
        L30:
            boolean r0 = r5 instanceof X.C1374270lrl
            if (r0 == 0) goto L64
            X.0lrl r5 = (X.C1374270lrl) r5
            android.content.Intent r0 = r3.LJJIIZ(r4, r5)
            android.content.Intent r2 = r3.LJJLIIIJLLLLLLLZ(r4, r0)
            if (r2 != 0) goto L62
            goto L18
        L41:
            android.content.Intent r2 = new android.content.Intent
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "https://www.facebook.com/sharer/sharer.php?u="
            r1.append(r0)
            X.0lnA r5 = (X.C1371420lnA) r5
            java.lang.String r0 = X.AbstractC1376120luk.LIZ(r5)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            r2.<init>(r0, r1)
        L62:
            r0 = r2
            goto L1a
        L64:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.sdk.channel.third.facebook.FacebookChannel.LJJLIIJ(android.app.Activity, X.0ltp):boolean");
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y) {
        int iIntValue = ((Number) this.LL.getValue()).intValue();
        if (iIntValue == EnumC1376430lvF.SYSTEM_SHARE.getNum()) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
            if (interfaceC1369790lkXLIZ != null) {
                return interfaceC1369790lkXLIZ.LJJJIL(c1375540lto, activity, c0m7y);
            }
            return false;
        }
        if (iIntValue == EnumC1376430lvF.INTENT_SHARE.getNum()) {
            return LJJLIIJ(activity, c1375540lto);
        }
        return LJJLIIJ(activity, c1375540lto);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y) {
        boolean zLJJLIIJ = false;
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207959558, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            int iIntValue = ((Number) this.LL.getValue()).intValue();
            if (iIntValue == EnumC1376430lvF.SYSTEM_SHARE.getNum()) {
                if (!C516560KNq.LIZ(activity, "com.facebook.katana")) {
                    zLJJLIIJ = LJJLIIJ(activity, c1371420lnA);
                } else {
                    InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
                    if (interfaceC1369790lkXLIZ != null) {
                        zLJJLIIJ = interfaceC1369790lkXLIZ.LJIIL(c1371420lnA, activity, c0m7y);
                    }
                }
            } else if (iIntValue == EnumC1376430lvF.INTENT_SHARE.getNum()) {
                zLJJLIIJ = LJJLIIJ(activity, c1371420lnA);
            } else {
                zLJJLIIJ = LJJLIIJ(activity, c1371420lnA);
            }
            AutoDFIDManager.LIZIZ();
            return zLJJLIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y) {
        int iIntValue = ((Number) this.LL.getValue()).intValue();
        if (iIntValue == EnumC1376430lvF.SYSTEM_SHARE.getNum()) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
            if (interfaceC1369790lkXLIZ != null) {
                return interfaceC1369790lkXLIZ.LJIJ(c1374270lrl, activity, c0m7y);
            }
            return false;
        }
        if (iIntValue == EnumC1376430lvF.INTENT_SHARE.getNum()) {
            return LJJLIIJ(activity, c1374270lrl);
        }
        return LJJLIIJ(activity, c1374270lrl);
    }
}
