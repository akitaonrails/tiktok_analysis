package com.facebook.fresco.animation.drawable;

import X.C08HP;
import X.C08HQ;
import X.C08HS;
import X.C0I9J;
import X.C0I9P;
import X.C1328130kfL;
import X.C1328570kg3;
import X.C1328580kg4;
import X.C1330000kiM;
import X.C1330480kj8;
import X.C1330930kjr;
import X.C1330940kjs;
import X.C1330970kjv;
import X.C1330980kjw;
import X.C386801es;
import X.InterfaceC1316680kMs;
import X.InterfaceC1329690khr;
import X.InterfaceC1330960kju;
import X.InterfaceC1330990kjx;
import X.InterfaceC1331000kjy;
import X.InterfaceC1331030kk1;
import Y.ARunnableS120S0100000_20;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes21.dex */
public class AnimatedDrawable2 extends Drawable implements Animatable, InterfaceC1316680kMs {
    public static final Class<?> LLJJJJ = AnimatedDrawable2.class;
    public static final C0I9J LLJJJJJIL = new C0I9J();
    public static InterfaceC1331030kk1 LLJJJJLIIL;
    public int LL;
    public boolean LLILLJJLI;
    public InterfaceC1330960kju LLILLL;
    public InterfaceC1330990kjx LLILZ;
    public final InterfaceC1329690khr LLILZIL;
    public final C1330000kiM LLILZLL;
    public final Object LLIZ;
    public volatile boolean LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public int LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public volatile boolean LLJJI;
    public final long LLJJIII;
    public int LLJJIJI;
    public volatile InterfaceC1331000kjy LLJJIJIIJIL;
    public volatile C0I9P LLJJIJIL;
    public C1330970kjv LLJJJ;
    public final ARunnableS120S0100000_20 LLJJJIL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.InterfaceC1316680kMs
    public final void LIZ() {
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        if (interfaceC1330960kju != null) {
            interfaceC1330960kju.clear();
        }
    }

    public final int LIZJ() {
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        if (interfaceC1330960kju == null) {
            return 0;
        }
        return interfaceC1330960kju.getFrameCount();
    }

    public final long LIZLLL() {
        if (this.LLILLL == null) {
            return 0L;
        }
        InterfaceC1330990kjx interfaceC1330990kjx = this.LLILZ;
        if (interfaceC1330990kjx != null) {
            return interfaceC1330990kjx.LIZLLL();
        }
        int iLJ = 0;
        for (int i = 0; i < this.LLILLL.getFrameCount(); i++) {
            iLJ += this.LLILLL.LJ(i);
        }
        return iLJ;
    }

    public void LJFF() {
        if (this.LLJJI || !this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = false;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LLJILJILJ = jUptimeMillis - this.LLJ;
        this.LLJILLL = jUptimeMillis - this.LLJI;
        this.LLJJ = this.LLJILJIL;
        this.LLJJI = true;
        unscheduleSelf(this.LLJJJIL);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        return interfaceC1330960kju == null ? super.getIntrinsicHeight() : interfaceC1330960kju.LJII();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        return interfaceC1330960kju == null ? super.getIntrinsicWidth() : interfaceC1330960kju.LJFF();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            this.LLJ = 0L;
            this.LLJIJIL = 0L;
            this.LLJI = -1L;
            this.LLJILJIL = -1;
            this.LLJJI = false;
            InterfaceC1330990kjx interfaceC1330990kjx = this.LLILZ;
            if (interfaceC1330990kjx instanceof C1330980kjw) {
                ((C1330980kjw) interfaceC1330990kjx).LJI = true;
            }
            unscheduleSelf(this.LLJJJIL);
            this.LLJJIJIIJIL.LIZJ(this);
        }
    }

    public AnimatedDrawable2() {
        this.LL = C386801es.DEFAULT;
        C1330000kiM c1330000kiM = C1330000kiM.LIZJ;
        this.LLILZLL = c1330000kiM;
        this.LLJJIII = 8L;
        this.LLJJIJIIJIL = LLJJJJJIL;
        this.LLJJJIL = new ARunnableS120S0100000_20(this, 39);
        this.LLILLL = null;
        this.LLILZ = LIZIZ(0, null, c1330000kiM, null);
        this.LLIZ = null;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        InterfaceC1330960kju interfaceC1330960kju;
        C08HQ.LIZ();
        Field field = C08HQ.LIZJ;
        if (field != null) {
            try {
                final Runnable runnable = (Runnable) field.get(this);
                if (runnable != null && !(runnable instanceof C08HP)) {
                    C08HQ.LIZ();
                    Field field2 = C08HQ.LIZJ;
                    if (field2 != null) {
                        final C08HS c08hs = new C08HS(this);
                        field2.set(this, new Runnable(c08hs, runnable) { // from class: X.08HP
                            public final C08HR LL;
                            public final Runnable LLILLJJLI;

                            public final void LIZ() {
                                Runnable runnable2;
                                C08HR c08hr = this.LL;
                                if (c08hr != null) {
                                    C08HS c08hs2 = (C08HS) c08hr;
                                    c08hs2.getClass();
                                    if (C2090408Gw.LIZIZ.booleanValue()) {
                                        long j = C08HQ.LIZIZ;
                                        long j2 = C2090208Gu.LIZIZ;
                                        if (j == j2) {
                                            C2090208Gu.LIZJ = true;
                                        }
                                        C08HQ.LIZIZ = j2;
                                        if (!C2090208Gu.LIZJ) {
                                            try {
                                                ArrayMap<Integer, WeakReference<Runnable>> arrayMap = C08HQ.LIZ;
                                                if (!arrayMap.containsKey(Integer.valueOf(c08hs2.LIZ.hashCode())) || (runnable2 = arrayMap.get(Integer.valueOf(c08hs2.LIZ.hashCode())).get()) == null) {
                                                    arrayMap.put(Integer.valueOf(c08hs2.LIZ.hashCode()), new WeakReference<>(C08HQ.LIZJ.get(c08hs2.LIZ)));
                                                    runnable2 = arrayMap.get(Integer.valueOf(c08hs2.LIZ.hashCode())).get();
                                                }
                                                ((Drawable) c08hs2.LIZ).scheduleSelf(runnable2, SystemClock.uptimeMillis() + 16);
                                                return;
                                            } catch (IllegalAccessException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    }
                                }
                                Runnable runnable3 = this.LLILLJJLI;
                                if (runnable3 != null) {
                                    runnable3.run();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("IProxyInvalidateRunnable$WrapRunanle@403b.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("IProxyInvalidateRunnable$WrapRunanle@403b.run");
                            }

                            {
                                this.LL = c08hs;
                                this.LLILLJJLI = runnable;
                            }
                        });
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if ((!this.LLIZLLLIL || this.LLJJI) && (interfaceC1330960kju = this.LLILLL) != null && interfaceC1330960kju.getFrameCount() > 1) {
            this.LLIZLLLIL = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.LLJ = jUptimeMillis;
            this.LLJIJIL = jUptimeMillis;
            this.LLJI = -1L;
            this.LLJILJIL = -1;
            if (this.LLJJI) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                long j = jUptimeMillis2 - this.LLJILJILJ;
                this.LLJ = j;
                this.LLJIJIL = j;
                this.LLJI = jUptimeMillis2 - this.LLJILLL;
                this.LLJILJIL = this.LLJJ;
                this.LLJJI = false;
            }
            invalidateSelf();
            this.LLJJIJIIJIL.LIZ(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.LLIZLLLIL;
    }

    public final void LJ(int i) {
        InterfaceC1330990kjx interfaceC1330990kjx;
        if (this.LLILLL != null && (interfaceC1330990kjx = this.LLILZ) != null) {
            this.LLJI = interfaceC1330990kjx.LIZIZ(i);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJI;
            this.LLJ = jUptimeMillis;
            this.LLJIJIL = jUptimeMillis;
            invalidateSelf();
        }
    }

    public final void LJI(C1330930kjr c1330930kjr) {
        this.LLILLL = c1330930kjr;
        this.LLILZ = new C1330480kj8(c1330930kjr, 0);
        c1330930kjr.LJIIIIZZ(getBounds());
        C1330970kjv c1330970kjv = this.LLJJJ;
        if (c1330970kjv != null) {
            c1330970kjv.LIZ(this);
        }
        this.LLILZ = LIZIZ(0, this.LLILLL, this.LLILZLL, null);
        stop();
    }

    public final void LJII(InterfaceC1331000kjy interfaceC1331000kjy) {
        if (interfaceC1331000kjy == null) {
            interfaceC1331000kjy = LLJJJJJIL;
        }
        this.LLJJIJIIJIL = interfaceC1331000kjy;
    }

    public final void LJIIIIZZ(InterfaceC1331030kk1 interfaceC1331030kk1) {
        InterfaceC1330990kjx interfaceC1330990kjxLIZ;
        if (C1328580kg4.LIZIZ(this.LLILZLL)) {
            return;
        }
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        Object obj = this.LLIZ;
        if (interfaceC1330960kju != null && (interfaceC1330990kjxLIZ = interfaceC1331030kk1.LIZ(interfaceC1330960kju, obj)) != null) {
            this.LLILZ = interfaceC1330990kjxLIZ;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long jMax;
        if (this.LLILLL != null && this.LLILZ != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.LLIZLLLIL) {
                jMax = (jUptimeMillis - this.LLJ) + 0;
            } else {
                jMax = Math.max(this.LLJI, 0L);
            }
            int iLIZJ = this.LLILZ.LIZJ(jMax, this.LLJI);
            if (iLIZJ == -1) {
                iLIZJ = this.LLILLL.getFrameCount() - 1;
                this.LLJJIJIIJIL.LIZJ(this);
                this.LLIZLLLIL = false;
            } else if (iLIZJ == 0 && this.LLJILJIL != -1 && jUptimeMillis >= this.LLJIJIL) {
                this.LLJJIJIIJIL.LIZIZ(this);
            }
            if (this.LLILLL.LIZIZ(iLIZJ, canvas, this)) {
                this.LLJJIJIIJIL.LIZLLL(this, iLIZJ);
                this.LLJILJIL = iLIZJ;
            } else {
                this.LLJJIJI++;
                if (C1328570kg3.LJIIJ(2)) {
                    C1328570kg3.LJIIJJI(LLJJJJ, "Dropped a frame. Count: %s", Integer.valueOf(this.LLJJIJI));
                }
            }
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            if (this.LLIZLLLIL) {
                this.LLILZ.LJJLIIIJLJLI();
                long jLIZ = this.LLILZ.LIZ(jUptimeMillis2 - this.LLJ);
                if (jLIZ != -1) {
                    long j = this.LLJ + this.LLJJIII + jLIZ;
                    this.LLJIJIL = j;
                    scheduleSelf(this.LLJJJIL, j);
                } else {
                    this.LLJJIJIIJIL.LIZJ(this);
                    this.LLIZLLLIL = false;
                }
            }
            C0I9P c0i9p = this.LLJJIJIL;
            if (c0i9p != null) {
                c0i9p.LIZ(this.LLILZ, iLIZJ);
            }
            this.LLJI = jMax;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        if (interfaceC1330960kju != null) {
            interfaceC1330960kju.LJIIIIZZ(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.LLIZLLLIL) {
            return false;
        }
        long j = i;
        if (this.LLJI == j) {
            return false;
        }
        this.LLJI = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LLJJJ == null) {
            this.LLJJJ = new C1330970kjv();
        }
        this.LLJJJ.LIZ = i;
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        if (interfaceC1330960kju != null) {
            interfaceC1330960kju.LIZJ(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.LLJJJ == null) {
            this.LLJJJ = new C1330970kjv();
        }
        C1330970kjv c1330970kjv = this.LLJJJ;
        c1330970kjv.LIZJ = colorFilter;
        c1330970kjv.LIZIZ = true;
        InterfaceC1330960kju interfaceC1330960kju = this.LLILLL;
        if (interfaceC1330960kju != null) {
            interfaceC1330960kju.LIZLLL(colorFilter);
        }
    }

    public void setPrivateFrameScheduler(InterfaceC1330990kjx interfaceC1330990kjx) {
        if (!C1328580kg4.LIZIZ(this.LLILZLL) && interfaceC1330990kjx != null) {
            this.LLILZ = interfaceC1330990kjx;
        }
    }

    public static InterfaceC1330990kjx LIZIZ(int i, InterfaceC1330960kju interfaceC1330960kju, C1330000kiM c1330000kiM, Object obj) {
        InterfaceC1330990kjx interfaceC1330990kjxLIZ;
        if (interfaceC1330960kju == null) {
            return null;
        }
        if (C1328580kg4.LIZIZ(c1330000kiM) && !C1328130kfL.LJIILIIL().LJJI() && !C1328130kfL.LJIILIIL().LJJIFFI()) {
            return new C1330980kjw(interfaceC1330960kju, i);
        }
        InterfaceC1331030kk1 interfaceC1331030kk1 = LLJJJJLIIL;
        if (interfaceC1331030kk1 != null && (interfaceC1330990kjxLIZ = interfaceC1331030kk1.LIZ(interfaceC1330960kju, obj)) != null) {
            return interfaceC1330990kjxLIZ;
        }
        if (C1328580kg4.LIZIZ(c1330000kiM) && (C1328130kfL.LJIILIIL().LJJI() || C1328130kfL.LJIILIIL().LJJIFFI())) {
            return new C1330980kjw(interfaceC1330960kju, i);
        }
        return new C1330480kj8(interfaceC1330960kju, i);
    }

    public AnimatedDrawable2(C1330940kjs c1330940kjs, Object obj, InterfaceC1329690khr interfaceC1329690khr, int i, C1330000kiM c1330000kiM) {
        this.LL = C386801es.DEFAULT;
        this.LLILZLL = C1330000kiM.LIZJ;
        this.LLJJIII = 8L;
        this.LLJJIJIIJIL = LLJJJJJIL;
        this.LLJJJIL = new ARunnableS120S0100000_20(this, 39);
        this.LLILLL = c1330940kjs;
        this.LLILZLL = c1330000kiM;
        this.LLILZ = LIZIZ(i, c1330940kjs, c1330000kiM, obj);
        this.LLILZIL = interfaceC1329690khr;
        this.LLIZ = obj;
    }
}
