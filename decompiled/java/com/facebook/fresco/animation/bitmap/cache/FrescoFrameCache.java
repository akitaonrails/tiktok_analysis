package com.facebook.fresco.animation.bitmap.cache;

import X.AbstractC1327750kej;
import X.C1323050kX9;
import X.C1324690kZn;
import X.C1324700kZo;
import X.C1324930kaB;
import X.C1325020kaK;
import X.C1325080kaQ;
import X.C1325120kaU;
import X.C1328060kfE;
import X.C1328570kg3;
import X.C1328580kg4;
import X.C1330000kiM;
import X.InterfaceC1324680kZm;
import X.InterfaceC1325100kaS;
import X.InterfaceC1329690khr;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoFrameCache implements InterfaceC1329690khr {
    public static final Class<?> LJ = FrescoFrameCache.class;
    public final C1324930kaB LIZ;
    public C1323050kX9<AbstractC1327750kej> LIZJ;
    public final C1325020kaK mAnimatedFrameCache;
    public final boolean mEnableBitmapReusing;
    public int LIZLLL = -1;
    public final SparseArray<C1323050kX9<AbstractC1327750kej>> LIZIZ = new SparseArray<>();

    @Override // X.InterfaceC1329690khr
    public final synchronized C1323050kX9 LIZIZ() {
        return LJII(C1323050kX9.LJFF(this.LIZJ));
    }

    public static C1323050kX9<Bitmap> LJII(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1325120kaU c1325120kaU;
        try {
            if (C1323050kX9.LJIJJ(c1323050kX9) && (c1323050kX9.get() instanceof C1325120kaU) && (c1325120kaU = (C1325120kaU) c1323050kX9.get()) != null) {
                C1323050kX9<Bitmap> c1323050kX9CloneUnderlyingBitmapReference = c1325120kaU.cloneUnderlyingBitmapReference();
                C1323050kX9.LJII(c1323050kX9);
                return c1323050kX9CloneUnderlyingBitmapReference;
            }
            C1323050kX9.LJII(c1323050kX9);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9);
            throw th;
        }
    }

    public static C1323050kX9<AbstractC1327750kej> LJIIIIZZ(C1323050kX9<Bitmap> c1323050kX9) {
        return C1323050kX9.LJIJJLI(new C1325120kaU(c1323050kX9, C1328060kfE.LIZLLL, 0));
    }

    public final synchronized void LJIIIZ(int i) {
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LIZIZ.get(i);
        if (c1323050kX9 != null) {
            this.LIZIZ.delete(i);
            C1323050kX9.LJII(c1323050kX9);
            C1328570kg3.LJIIL(LJ, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.LIZIZ);
        }
    }

    @Override // X.InterfaceC1329690khr
    public final synchronized void LIZ(C1330000kiM c1330000kiM, boolean z) {
        boolean z2;
        if (C1328580kg4.LIZIZ(c1330000kiM) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1323050kX9.LJII(this.LIZJ);
        if (z2) {
            C1324930kaB c1324930kaB = this.LIZ;
            C1325080kaQ<InterfaceC1324680kZm, Bitmap> c1325080kaQ = c1324930kaB.LIZIZ;
            final InterfaceC1324680kZm interfaceC1324680kZm = c1324930kaB.LIZ;
            c1325080kaQ.getClass();
            if (interfaceC1324680kZm != null && !interfaceC1324680kZm.LIZ().isEmpty()) {
                c1325080kaQ.LIZIZ((InterfaceC1325100kaS<InterfaceC1324680kZm>) new InterfaceC1325100kaS<Object>() { // from class: X.0kaM
                    @Override // X.InterfaceC1325100kaS
                    public final boolean apply(Object obj) {
                        return obj.toString().contains(interfaceC1324680kZm.LIZ());
                    }
                });
            }
        } else {
            this.mAnimatedFrameCache.LIZIZ(this.LIZLLL);
        }
        this.LIZJ = null;
        this.LIZLLL = -1;
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            C1323050kX9<AbstractC1327750kej> c1323050kX9ValueAt = this.LIZIZ.valueAt(i);
            if (c1323050kX9ValueAt != null) {
                C1323050kX9.LJII(c1323050kX9ValueAt);
                if (!z2) {
                    this.mAnimatedFrameCache.LIZIZ(this.LIZIZ.keyAt(i));
                }
            }
        }
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC1329690khr
    public final synchronized C1323050kX9 LJI(C1330000kiM c1330000kiM, boolean z) {
        if (C1328580kg4.LIZIZ(c1330000kiM) && z) {
            return null;
        }
        if (!this.mEnableBitmapReusing) {
            return null;
        }
        return LJII(this.mAnimatedFrameCache.LIZLLL());
    }

    public FrescoFrameCache(C1325020kaK c1325020kaK, C1324930kaB c1324930kaB, boolean z) {
        this.mAnimatedFrameCache = c1325020kaK;
        this.LIZ = c1324930kaB;
        this.mEnableBitmapReusing = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:11:0x0027, B:9:0x001f), top: B:21:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // X.InterfaceC1329690khr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZJ(int r4, X.C1330000kiM r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = X.C1328580kg4.LIZIZ(r5)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1f
            if (r6 == 0) goto L1f
            X.0kaB r0 = r3.LIZ     // Catch: java.lang.Throwable -> L35
            X.0kaQ<X.0kZm, android.graphics.Bitmap> r2 = r0.LIZIZ     // Catch: java.lang.Throwable -> L35
            X.0kZn r1 = new X.0kZn     // Catch: java.lang.Throwable -> L35
            X.0kZm r0 = r0.LIZ     // Catch: java.lang.Throwable -> L35
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L35
            X.0kX9 r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L35
            boolean r0 = X.C1323050kX9.LJIJJ(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L27
            goto L30
        L1f:
            X.0kaK r0 = r3.mAnimatedFrameCache     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.LIZJ(r4)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L30
        L27:
            android.util.SparseArray<X.0kX9<X.0kej>> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            monitor-exit(r3)
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache.LIZJ(int, X.0kiM, boolean):boolean");
    }

    @Override // X.InterfaceC1329690khr
    public final synchronized C1323050kX9<Bitmap> LIZLLL(int i, C1330000kiM c1330000kiM, boolean z) {
        if (C1328580kg4.LIZIZ(c1330000kiM) && z) {
            C1324930kaB c1324930kaB = this.LIZ;
            return c1324930kaB.LIZIZ.get(new C1324690kZn(c1324930kaB.LIZ, i));
        }
        if (this.mAnimatedFrameCache.LIZJ(i)) {
            C1325020kaK c1325020kaK = this.mAnimatedFrameCache;
            return LJII(c1325020kaK.LIZIZ.get(new C1324700kZo(c1325020kaK.LIZ, i)));
        }
        return LJII(C1323050kX9.LJFF(this.LIZIZ.get(i)));
    }

    @Override // X.InterfaceC1329690khr
    public final synchronized void LJ(int i, C1323050kX9 c1323050kX9, C1330000kiM c1330000kiM, boolean z) {
        C1323050kX9 c1323050kX9LJFF;
        c1323050kX9.getClass();
        LJIIIZ(i);
        C1323050kX9<AbstractC1327750kej> c1323050kX9LJIIIIZZ = null;
        try {
            C1323050kX9.LJII(this.LIZJ);
            if (c1330000kiM != null && C1328580kg4.LIZIZ(c1330000kiM) && z) {
                C1324930kaB c1324930kaB = this.LIZ;
                c1324930kaB.getClass();
                if (C1323050kX9.LJIJJ(c1323050kX9)) {
                    c1323050kX9LJFF = C1323050kX9.LJFF(c1323050kX9);
                    c1324930kaB.LIZIZ.LJ(new C1324690kZn(c1324930kaB.LIZ, i), c1323050kX9LJFF);
                } else {
                    c1323050kX9LJFF = null;
                }
                this.LIZJ = LJIIIIZZ(c1323050kX9LJFF);
            } else {
                c1323050kX9LJIIIIZZ = LJIIIIZZ(c1323050kX9);
                if (c1323050kX9LJIIIIZZ != null) {
                    this.LIZJ = this.mAnimatedFrameCache.LIZ(c1323050kX9LJIIIIZZ, i);
                }
            }
            this.LIZLLL = i;
            C1323050kX9.LJII(c1323050kX9LJIIIIZZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJIIIIZZ);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:5:0x0007, B:8:0x000f, B:10:0x001a, B:11:0x002a, B:19:0x0042, B:21:0x0048, B:22:0x0053, B:23:0x0066, B:13:0x0031, B:18:0x003c), top: B:35:0x0007, outer: #0 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1329690khr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJFF(int r7, X.C1323050kX9 r8, X.C1330000kiM r9, boolean r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            r8.getClass()
            r4 = 0
            if (r9 == 0) goto L31
            boolean r0 = X.C1328580kg4.LIZIZ(r9)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L31
            if (r10 == 0) goto L31
            X.0kaB r5 = r6.LIZ     // Catch: java.lang.Throwable -> L7b
            r5.getClass()     // Catch: java.lang.Throwable -> L7b
            boolean r0 = X.C1323050kX9.LJIJJ(r8)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L2f
            X.0kX9 r3 = X.C1323050kX9.LJFF(r8)     // Catch: java.lang.Throwable -> L7b
            X.0kaQ<X.0kZm, android.graphics.Bitmap> r2 = r5.LIZIZ     // Catch: java.lang.Throwable -> L7b
            X.0kZn r1 = new X.0kZn     // Catch: java.lang.Throwable -> L7b
            X.0kZm r0 = r5.LIZ     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L7b
            r2.LJ(r1, r3)     // Catch: java.lang.Throwable -> L7b
        L2a:
            X.0kX9 r1 = LJIIIIZZ(r3)     // Catch: java.lang.Throwable -> L7b
            goto L42
        L2f:
            r3 = r4
            goto L2a
        L31:
            X.0kX9 r4 = LJIIIIZZ(r8)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L3c
            X.C1323050kX9.LJII(r4)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)
            return
        L3c:
            X.0kaK r0 = r6.mAnimatedFrameCache     // Catch: java.lang.Throwable -> L7b
            X.0kX9 r1 = r0.LIZ(r4, r7)     // Catch: java.lang.Throwable -> L7b
        L42:
            boolean r0 = X.C1323050kX9.LJIJJ(r1)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L66
            android.util.SparseArray<X.0kX9<X.0kej>> r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L7b
            X.0kX9 r0 = (X.C1323050kX9) r0     // Catch: java.lang.Throwable -> L7b
            X.C1323050kX9.LJII(r0)     // Catch: java.lang.Throwable -> L7b
        L53:
            android.util.SparseArray<X.0kX9<X.0kej>> r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7b
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<?> r3 = com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache.LJ     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L7b
            android.util.SparseArray<X.0kX9<X.0kej>> r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7b
            X.C1328570kg3.LJIIL(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L7b
            goto L76
        L66:
            X.0kX9 r1 = r4.clone()     // Catch: java.lang.Throwable -> L7b
            android.util.SparseArray<X.0kX9<X.0kej>> r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L7b
            X.0kX9 r0 = (X.C1323050kX9) r0     // Catch: java.lang.Throwable -> L7b
            X.C1323050kX9.LJII(r0)     // Catch: java.lang.Throwable -> L7b
            goto L53
        L76:
            X.C1323050kX9.LJII(r4)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)
            return
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7b
            X.C1323050kX9.LJII(r4)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache.LJFF(int, X.0kX9, X.0kiM, boolean):void");
    }
}
