package com.ss.android.ugc.aweme.social.creation.mediapicker.navigation;

import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C417001jk;
import X.C817503Hh;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.router.route.IRouteAction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryCameraRecordAction implements IRouteAction {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[PHI: r8
      0x0034: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:17:0x0032, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[PHI: r8
      0x009d: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v7 java.lang.String) binds: [B:36:0x009b, B:34:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void realOpenRecord(android.content.Context r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraRecordAction.realOpenRecord(android.content.Context, android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: open, reason: collision with other method in class */
    public void m320open(Context context, String str, Bundle bundle) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            realOpenRecord(context, bundle);
            return;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C417001jk(this, context, bundle, null), 2);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public /* bridge */ /* synthetic */ Object open(Context context, String str, Bundle bundle) {
        m320open(context, str, bundle);
        return Unit.LIZ;
    }
}
