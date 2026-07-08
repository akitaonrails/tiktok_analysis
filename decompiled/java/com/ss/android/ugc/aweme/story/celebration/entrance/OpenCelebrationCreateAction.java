package com.ss.android.ugc.aweme.story.celebration.entrance;

import X.AbstractC1387200mCc;
import X.AnonymousClass0956;
import X.C018G;
import X.C036E;
import X.C064K;
import X.C098200Yq;
import X.C0CNO;
import X.C0PEM;
import X.C11NJ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1618440sDa;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C20271514Tp;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnDismissListenerC1767806w8;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS142S0101000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenCelebrationCreateAction implements IRouteAction {
    public DialogC1389620mGW LL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final C11NJ LLILLL = new C11NJ();
    public AnonymousClass0956 LLILZ;

    public final void LIZ(Context context) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(2131829824);
        dialogC1389620mGW.setCancelable(false);
        dialogC1389620mGW.setOnDismissListener(new DialogInterfaceOnDismissListenerC1767806w8(this, 4));
        C786410Ut5.J4(dialogC1389620mGW);
        this.LL = dialogC1389620mGW;
        C786410Ut5.LJLIIL(10000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(this, 38));
    }

    public final void LIZJ(int i) {
        View viewLJI;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (viewLJI = abstractC1387200mCcLJ.LJI()) != null) {
            C0CNO.LIZLLL(0L, new AwS142S0101000_2(i, viewLJI, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Integer] */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Object obj;
        if (context == null) {
            return Boolean.FALSE;
        }
        C259800zU c259800zU = new C259800zU();
        try {
            Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(C018G.LIZIZ(str, "celebration_type")));
            C189200o6.m2constructorimpl(numValueOf);
            obj = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Fragment fragmentLIZLLL = null;
        T t = obj;
        if (zM7isFailureimpl) {
            t = 0;
        }
        c259800zU.element = t;
        boolean zLIZIZ = false;
        if (t == 0) {
            c259800zU.element = 0;
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!zLIZIZ) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(R.string.m25);
                c1389890mGx.LJIIJJI();
            } else {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null) {
                    fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL();
                }
                if (fragmentLIZLLL != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLIZLLL);
                    c1389890mGx2.LJIIIZ(R.string.m25);
                    c1389890mGx2.LJIIJJI();
                }
            }
            return Boolean.FALSE;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C064K(this, c259800zU, str, context, bundle, null), 3);
        return Boolean.TRUE;
    }

    public static void LIZIZ(int i, Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        C1618440sDa.LIZIZ.LJIJJLI().LJIL(new C20271514Tp(context, null, "", null, str, null, i, 0, null, false, null, null, false, false, str3, str4, str5, str6, 65386), str2);
    }
}
