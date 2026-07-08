package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0M7Y;
import X.C1365310ldJ;
import X.C1365320ldK;
import X.C1371600lnS;
import X.C1372760lpK;
import X.C1372770lpL;
import X.C1373450lqR;
import X.C621180OYa;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowPostIncentiveSharePackage extends PhotoSharePackage {
    public final C1365310ldJ imShareHook;
    public final C1372770lpL incentiveShareParams;
    public final C1365320ldK sharePanelListener;
    public static final C1372760lpK Companion = new C1372760lpK();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final void LJJ(C1371600lnS c1371600lnS) {
        c1371600lnS.LJJJJI = true;
        c1371600lnS.LJJIIJZLJL = true;
        c1371600lnS.LJJI = R.string.tba;
        c1371600lnS.LJJIII = R.string.f1_;
        c1371600lnS.LJJIZ = this.imShareHook;
        c1371600lnS.LJJIL = this.sharePanelListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[PHI: r6
      0x0061: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:25:0x005f, B:23:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133 A[PHI: r15
      0x0133: PHI (r15v1 java.util.List<java.lang.String>) = (r15v0 java.util.List<java.lang.String>), (r15v4 java.util.List<java.lang.String>) binds: [B:75:0x0130, B:64:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f A[PHI: r17
      0x013f: PHI (r17v1 java.util.List<java.lang.String>) = (r17v0 java.util.List<java.lang.String>), (r17v4 java.util.List<java.lang.String>) binds: [B:79:0x013b, B:56:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c A[PHI: r18
      0x014c: PHI (r18v1 java.util.List<java.lang.String>) = (r18v0 java.util.List<java.lang.String>), (r18v4 java.util.List<java.lang.String>) binds: [B:83:0x0148, B:48:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159 A[PHI: r19
      0x0159: PHI (r19v1 java.util.List<java.lang.String>) = (r19v0 java.util.List<java.lang.String>), (r19v4 java.util.List<java.lang.String>) binds: [B:87:0x0155, B:40:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167 A[PHI: r6
      0x0167: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:25:0x005f, B:27:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0ldJ] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0ldK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowPostIncentiveSharePackage(final android.app.Activity r43, X.C1372770lpL r44) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowPostIncentiveSharePackage.<init>(android.app.Activity, X.0lpL):void");
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        List listLIZLLL;
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        if (!(interfaceC1369790lkX instanceof CopyLinkChannel) && (listLIZLLL = C1373450lqR.LIZLLL()) != null && !listLIZLLL.isEmpty()) {
            Iterator it2 = C1373450lqR.LIZLLL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SharePlatform sharePlatform = (SharePlatform) it2.next();
                if (Intrinsics.LJFF(sharePlatform.platformId, interfaceC1369790lkX.key())) {
                    int i = sharePlatform.nowShareMode;
                    if (i == 4 || i == 5) {
                        function1.invoke(Boolean.valueOf(LJJII(interfaceC1369790lkX, context, null, i, false)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final boolean LJJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, Aweme aweme, int i, boolean z) {
        new Object() { // from class: X.0lpv
        }.getClass();
        return true;
    }
}
