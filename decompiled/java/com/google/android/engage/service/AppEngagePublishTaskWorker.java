package com.google.android.engage.service;

import X.AbstractC199488133m;
import X.AbstractC2380809Uo;
import X.AbstractC795160VHe;
import X.AbstractC835450Wpz;
import X.AnonymousClass1348;
import X.AnonymousClass1349;
import X.C134C;
import X.C134L;
import X.C199503134b;
import X.C812840Vuc;
import X.EnumC2272608vM;
import X.InterfaceC19882712qn;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AppEngagePublishTaskWorker extends ListenableWorker {
    public abstract AbstractC835450Wpz<Void> LJII();

    public abstract AbstractC795160VHe LJIIIIZZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.134Z] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.133m, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.134E] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.09Uo, X.133m, X.134C, java.lang.Runnable] */
    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<AbstractC795160VHe> LJFF() {
        final AbstractC835450Wpz<Void> abstractC835450WpzLJII = LJII();
        final ?? LIZ = C199503134b.LIZ(new C134L() { // from class: X.134K
            @Override // X.C134L
            public final Object LIZ(final C199502134a c199502134a) {
                return abstractC835450WpzLJII.LIZIZ(new InterfaceC834580Woa() { // from class: X.134c
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                        C199502134a c199502134a2 = c199502134a;
                        if (abstractC835450Wpz.LJIIL()) {
                            c199502134a2.LIZLLL = true;
                            C134Z<T> c134z = c199502134a2.LIZIZ;
                            if (c134z != 0 && c134z.LLILLJJLI.cancel(true)) {
                                c199502134a2.LIZ = null;
                                c199502134a2.LIZIZ = null;
                                c199502134a2.LIZJ = null;
                                return;
                            }
                            return;
                        }
                        if (abstractC835450Wpz.LJIILJJIL()) {
                            c199502134a2.LIZ(abstractC835450Wpz.LJIIJ());
                            return;
                        }
                        Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                        if (excLJIIIZ != null) {
                            c199502134a2.LIZIZ(excLJIIIZ);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                });
            }
        });
        int i = AbstractC2380809Uo.LLILZIL;
        ?? r2 = LIZ instanceof AbstractC2380809Uo ? (AbstractC199488133m) LIZ : new AbstractC2380809Uo<V>(LIZ) { // from class: X.133r
            public final ListenableFuture<V> LLILZLL;

            @Override // X.AbstractC199488133m, java.util.concurrent.Future
            public final V get() {
                return this.LLILZLL.get();
            }

            @Override // X.AbstractC199488133m, java.util.concurrent.Future
            public final boolean isCancelled() {
                return this.LLILZLL.isCancelled();
            }

            @Override // X.AbstractC199488133m, java.util.concurrent.Future
            public final boolean isDone() {
                return this.LLILZLL.isDone();
            }

            @Override // X.AbstractC199488133m
            public final String toString() {
                return this.LLILZLL.toString();
            }

            {
                this.LLILZLL = LIZ;
            }

            @Override // X.AbstractC199488133m, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                return this.LLILZLL.cancel(z);
            }

            @Override // X.AbstractC199488133m, com.google.common.util.concurrent.ListenableFuture
            public final void LJIIJJI(Runnable runnable, Executor executor) {
                this.LLILZLL.LJIIJJI(runnable, executor);
            }

            @Override // X.AbstractC199488133m, java.util.concurrent.Future
            public final V get(long j, TimeUnit timeUnit) {
                return this.LLILZLL.get(j, timeUnit);
            }
        };
        InterfaceC19882712qn interfaceC19882712qn = new InterfaceC19882712qn() { // from class: X.0YW0
            @Override // X.InterfaceC19882712qn
            public final Object apply(Object obj) {
                return new C795180VHg();
            }
        };
        int i2 = AnonymousClass1349.LLIZLLLIL;
        final ?? c134c = new C134C(r2, interfaceC19882712qn);
        EnumC2272608vM enumC2272608vM = EnumC2272608vM.LL;
        r2.LJIIJJI(c134c, enumC2272608vM);
        final ?? r22 = new InterfaceC19882712qn() { // from class: X.134E
            @Override // X.InterfaceC19882712qn
            public final Object apply(Object obj) {
                return this.LL.LJIIIIZZ();
            }
        };
        final Class<C812840Vuc> cls = C812840Vuc.class;
        AnonymousClass1348 anonymousClass1348 = new AnonymousClass1348<V, X, InterfaceC19882712qn<? super X, ? extends V>, V>(c134c, cls, r22) { // from class: X.134B
            @Override // X.AnonymousClass1348
            public final void LJIL(V v) {
                LJIIZILJ(v);
            }

            @Override // X.AnonymousClass1348
            public final Object LJIJJLI(Object obj, Throwable th) {
                return ((InterfaceC19882712qn) obj).apply(th);
            }
        };
        c134c.LJIIJJI(anonymousClass1348, enumC2272608vM);
        return anonymousClass1348;
    }

    public AppEngagePublishTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
