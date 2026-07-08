package com.bytedance.android.monitorV2.webview.blank;

import X.C1521720pha;
import X.C1521730phb;
import X.C1521860pho;
import X.C1522050pi7;
import X.C1523120pjq;
import X.C2187451AjH;
import X.InterfaceC1521760phe;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class WebBlankDetectorDefault implements InterfaceC1521760phe {
    public final String TAG = "BlankDetectWebViewUtils";
    public final C1521860pho blankBitmapDetector = new C1521860pho();
    public final C1522050pi7 rgbVarChecker = new Object() { // from class: X.0pi7
    };

    private final boolean checkViewValid(View view, C1521720pha c1521720pha) {
        if (view != null) {
            return true;
        }
        c1521720pha.LIZJ = 1;
        c1521720pha.LIZLLL = "view is null.";
        c1521720pha.LIZ = 3;
        return false;
    }

    private final C1521720pha detectInternal(View view, Function1<? super C1521720pha, Unit> function1) {
        C1521720pha c1521720pha = new C1521720pha();
        if (!checkViewValid(view, c1521720pha)) {
            return c1521720pha;
        }
        if (view.getContext().getResources() == null) {
            c1521720pha.LIZJ = 4;
            c1521720pha.LIZLLL = "context or context.getResources is null";
            c1521720pha.LIZ = 3;
            return c1521720pha;
        }
        if (!checkBoundingValid(view.getWidth(), view.getHeight(), c1521720pha)) {
            return c1521720pha;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c1521720pha.LIZJ = 2;
            c1521720pha.LIZLLL = "current thread is not main thread.";
            c1521720pha.LIZ = 3;
            return c1521720pha;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            function1.invoke(c1521720pha);
            return c1521720pha;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZJ(this.TAG, "isViewPureColor", th);
            c1521720pha.LIZJ = 4;
            c1521720pha.LIZLLL = th.getMessage();
            c1521720pha.LIZ = 3;
            c1521720pha.LIZIZ = System.currentTimeMillis() - jCurrentTimeMillis;
            return c1521720pha;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void checkBlank(android.graphics.Bitmap r37, X.C1521720pha r38) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault.checkBlank(android.graphics.Bitmap, X.0pha):void");
    }

    private final boolean checkBoundingValid(int i, int i2, C1521720pha c1521720pha) {
        if (i > 0 && i2 > 0) {
            return true;
        }
        int i3 = C2187451AjH.LIZ;
        C1521730phb.LJI(this.TAG, "width and height must be > 0");
        c1521720pha.LIZJ = 4;
        c1521720pha.LIZLLL = "width and height must be > 0";
        c1521720pha.LIZ = 3;
        return false;
    }

    @Override // X.InterfaceC1521760phe
    public C1521720pha detect(View view, float f, Bitmap.Config config) {
        return detectInternal(view, new C1523120pjq(view, f, config, this));
    }
}
