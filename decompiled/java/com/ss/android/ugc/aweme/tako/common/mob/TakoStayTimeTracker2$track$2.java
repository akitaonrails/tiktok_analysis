package com.ss.android.ugc.aweme.tako.common.mob;

import X.C1701530uNb;
import X.C1860520yW2;
import X.C1862690yZX;
import X.C1862910yZt;
import X.C20235014Fo;
import X.C356901a3;
import X.C597050NbL;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoStayTimeTracker2$track$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1862690yZX LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public TakoStayTimeTracker2$track$2(C1862690yZX c1862690yZX) {
        this.LL = c1862690yZX;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) throws JSONException {
        String str;
        long j;
        String str2;
        String str3;
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIIJ() != null) {
            C1862690yZX c1862690yZX = this.LL;
            C1862910yZt c1862910yZtLJIIJ = C1860520yW2.LJIIJ();
            if (c1862910yZtLJIIJ == null || (str = c1862910yZtLJIIJ.LIZIZ) == null) {
                str = "";
            }
            C1862910yZt c1862910yZtLJIIJ2 = C1860520yW2.LJIIJ();
            if (c1862910yZtLJIIJ2 != null) {
                j = c1862910yZtLJIIJ2.LIZ;
            } else {
                j = 0;
            }
            C1862910yZt c1862910yZtLJIIJ3 = C1860520yW2.LJIIJ();
            if (c1862910yZtLJIIJ3 != null) {
                str2 = c1862910yZtLJIIJ3.LIZJ;
            } else {
                str2 = null;
            }
            C1862910yZt c1862910yZtLJIIJ4 = C1860520yW2.LJIIJ();
            if (c1862910yZtLJIIJ4 != null) {
                str3 = c1862910yZtLJIIJ4.LIZLLL;
            } else {
                str3 = null;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862690yZX.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", str);
            jSONObject.put("tako_session_id", str2);
            jSONObject.put("tako_chat_id", str3);
            jSONObject.put("chat_stay_duration", j);
            c20235014FoLIZ.LIZIZ("tikbot_exit_chat", jSONObject);
            C1860520yW2.LJJIJ(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1862690yZX c1862690yZX = this.LL;
        if (c1862690yZX.LJII && !c1862690yZX.LJIIIIZZ) {
            if (c1862690yZX.LJIIJ == null) {
                c1862690yZX.LJIIJ = lifecycleOwner;
            }
            c1862690yZX.LIZIZ();
        }
        C1862690yZX c1862690yZX2 = this.LL;
        c1862690yZX2.LJII = false;
        c1862690yZX2.LJIIIIZZ = false;
        c1862690yZX2.LJIIJ = null;
        c1862690yZX2.LJIIIZ = 0L;
        String strLIZLLL = c1862690yZX2.LIZLLL();
        synchronized (C1701530uNb.LJ) {
            try {
                C1701530uNb.LIZ.remove(strLIZLLL);
                C1701530uNb.LIZIZ.remove(strLIZLLL);
                C1701530uNb.LIZJ.remove(strLIZLLL);
                C1701530uNb.LIZLLL.remove(strLIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C1862690yZX c1862690yZX = this.LL;
        long j = 0;
        if (c1862690yZX.LJI <= 0) {
            return;
        }
        c1862690yZX.LJIIJ = lifecycleOwner;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1862690yZX c1862690yZX2 = this.LL;
        long j2 = jCurrentTimeMillis - c1862690yZX2.LJI;
        if (j2 >= 0) {
            j = j2;
        }
        c1862690yZX.LJIIIZ = j;
        c1862690yZX2.LJII = true;
        c1862690yZX2.LJIIIIZZ = false;
        c1862690yZX2.LJIIJJI = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C1862690yZX c1862690yZX = this.LL;
        c1862690yZX.LJII = false;
        c1862690yZX.LJIIIIZZ = false;
        c1862690yZX.LJIIJJI = false;
        c1862690yZX.LJIIJ = null;
        c1862690yZX.LJIIIZ = 0L;
        c1862690yZX.LJI = System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C1862690yZX c1862690yZX = this.LL;
        if (c1862690yZX.LJII && !c1862690yZX.LJIIIIZZ) {
            c1862690yZX.LIZIZ();
        }
    }
}
