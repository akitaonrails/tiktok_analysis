package com.ss.android.ugc.aweme.nxreword.manager;

import X.C09AY;
import X.C0W82;
import X.C1C7U;
import X.C786410Ut5;
import X.C818130W7n;
import X.C818140W7o;
import X.C818150W7p;
import X.C818160W7q;
import X.C818170W7r;
import X.C818180W7s;
import X.C818200W7u;
import X.C818230W7x;
import X.C818240W7y;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager$init$1;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class NxRewordManager$init$1 extends C09AY implements Function1<C818160W7q, Unit> {
    public final /* synthetic */ C818150W7p LL;
    public final /* synthetic */ NxRewordManager LLILLJJLI;
    public final /* synthetic */ Function1<Context, Unit> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NxRewordManager$init$1(C818150W7p c818150W7p, NxRewordManager nxRewordManager, Function1<? super Context, Unit> function1, Context context) {
        super(1);
        this.LL = c818150W7p;
        this.LLILLJJLI = nxRewordManager;
        this.LLILLL = function1;
        this.LLILZ = context;
    }

    /* JADX INFO: renamed from: lambda$semisugar$invoke$lambda-0$0, reason: not valid java name */
    public static /* synthetic */ void m297lambda$semisugar$invoke$lambda0$0(C818160W7q c818160W7q, Context context, Function1 function1, C818150W7p c818150W7p, String str) {
        C1C7U.LIZ("NxRewordManager$init$1@7d31.invoke$1L");
        m296invoke$lambda0(c818160W7q, context, function1, c818150W7p, str);
        C1C7U.LIZIZ("NxRewordManager$init$1@7d31.invoke$1L");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C818160W7q c818160W7q) {
        final C818160W7q c818160W7q2 = c818160W7q;
        C818150W7p c818150W7p = this.LL;
        NxRewordManager.LJIIZILJ = c818150W7p.LIZLLL;
        NxRewordManager nxRewordManager = this.LLILLJJLI;
        Locale locale = c818150W7p.LIZ;
        nxRewordManager.getClass();
        NxRewordManager.LIZIZ = locale;
        NxRewordManager.LJIIJJI = C786410Ut5.h4();
        NxRewordManager nxRewordManager2 = this.LLILLJJLI;
        Function1<Context, Unit> function1 = this.LLILLL;
        nxRewordManager2.getClass();
        NxRewordManager.LJIILJJIL = function1;
        this.LLILLJJLI.getClass();
        final String strLJJIFFI = u.LJJIFFI(NxRewordManager.LIZIZ().toString(), "_", "-", false);
        ExecutorService executorService = null;
        try {
            Context context = this.LLILZ;
            if (context instanceof Activity) {
                NxRewordManager nxRewordManager3 = this.LLILLJJLI;
                Context contextL3 = C786410Ut5.L3((Activity) context);
                nxRewordManager3.getClass();
                NxRewordManager.LJ = contextL3;
            } else {
                this.LLILLJJLI.getClass();
                NxRewordManager.LJ = context;
            }
            NxRewordManager nxRewordManager4 = this.LLILLJJLI;
            C818150W7p c818150W7p2 = this.LL;
            C0W82 c0w82 = c818150W7p2.LJIIIZ;
            ExecutorService executorService2 = NxRewordManager.LJIIJJI;
            if (executorService2 == null) {
                executorService2 = null;
            }
            C818200W7u c818200W7u = c818150W7p2.LJIIJ;
            if (c818200W7u == null) {
                c818200W7u = new C818200W7u(0);
            }
            C818230W7x c818230W7x = new C818230W7x(c0w82, executorService2, c818200W7u);
            nxRewordManager4.getClass();
            NxRewordManager.LJI = c818230W7x;
            NxRewordManager nxRewordManager5 = this.LLILLJJLI;
            boolean z = this.LL.LIZJ;
            nxRewordManager5.getClass();
            NxRewordManager.LIZLLL = z;
            NxRewordManager nxRewordManager6 = this.LLILLJJLI;
            String str = this.LL.LIZIZ;
            nxRewordManager6.getClass();
            NxRewordManager.LJFF = str;
            C818150W7p c818150W7p3 = this.LL;
            Function1<Locale, String> function12 = c818150W7p3.LJIIIIZZ;
            if (function12 != null) {
                C818240W7y.LIZ = function12;
            }
            C818240W7y.LIZIZ = c818150W7p3.LJII;
            C818240W7y.LIZJ = c818150W7p3.LJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Intrinsics.LJIIJJI(th, "nxreword init error: ");
            c818160W7q2.LJIIIIZZ = 1;
            c818160W7q2.LIZJ = Intrinsics.LJIIJJI(th.getMessage(), c818160W7q2.LIZJ);
        }
        ExecutorService executorService3 = NxRewordManager.LJIIJJI;
        if (executorService3 != null) {
            executorService = executorService3;
        }
        final Context context2 = this.LLILZ;
        final Function1<Context, Unit> function13 = this.LLILLL;
        final C818150W7p c818150W7p4 = this.LL;
        executorService.execute(new Runnable() { // from class: X.0W7z
            @Override // java.lang.Runnable
            @C1BCF(distinctId = 8, scene = "boot", taskPriority = EnumC21352718hJ.P0)
            public final void run() {
                NxRewordManager$init$1.m297lambda$semisugar$invoke$lambda0$0(c818160W7q2, context2, function13, c818150W7p4, strLJJIFFI);
            }
        });
        return Unit.LIZ;
    }

    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m296invoke$lambda0(C818160W7q c818160W7q, Context context, Function1 function1, C818150W7p c818150W7p, String str) {
        try {
            C818140W7o c818140W7o = new C818140W7o(context, function1, c818150W7p, str);
            c818160W7q.getClass();
            c818160W7q.LJ = SystemClock.elapsedRealtimeNanos();
            c818140W7o.invoke(c818160W7q);
            c818160W7q.LJFF = SystemClock.elapsedRealtimeNanos();
            SharedPreferences sharedPreferences = C818130W7n.LIZ;
            Locale localeLIZIZ = NxRewordManager.LIZIZ();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            C818170W7r c818170W7r = new C818170W7r(localeLIZIZ);
            c818170W7r.LIZIZ = jElapsedRealtimeNanos;
            c818170W7r.LJ = "init";
            C818180W7s c818180W7s = new C818180W7s(context);
            c818170W7r.LIZIZ = SystemClock.elapsedRealtimeNanos();
            c818180W7s.invoke(c818170W7r);
            c818170W7r.LIZJ = SystemClock.elapsedRealtimeNanos();
            c818160W7q.LJIIIIZZ = ((int) NxResourceUtils.INSTANCE.nativeGetNativeResourceManagerCode(NxRewordManager.LIZJ)) | (c818160W7q.LJIIIIZZ << 28);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c818160W7q.LIZJ = Intrinsics.LJIIJJI(th.getMessage(), c818160W7q.LIZJ);
        }
        c818160W7q.LIZJ();
    }
}
