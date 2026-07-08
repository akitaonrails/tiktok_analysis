package com.facebook.fresco.animation.factory;

import X.AbstractC1301670jyf;
import X.AbstractC1327750kej;
import X.C1325080kaQ;
import X.C1329310khF;
import X.C1329330khH;
import X.C1329390khN;
import X.C1331210kkJ;
import X.C1334380kpQ;
import X.C822690WPb;
import X.InterfaceC1320070kSL;
import X.InterfaceC1320130kSR;
import X.InterfaceC1322960kX0;
import X.InterfaceC1324680kZm;
import X.InterfaceC1328030kfB;
import X.InterfaceC1330200kig;
import X.InterfaceC1330360kiw;
import X.InterfaceC1331330kkV;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.LinkedBlockingQueue;
import so6.g;

/* JADX INFO: loaded from: classes21.dex */
public class AnimatedFactoryV2Impl implements InterfaceC1322960kX0 {
    public static int sAnimationCachingStrategy = 1;
    public InterfaceC1330360kiw mAnimatedDrawableBackendProvider;
    public InterfaceC1320130kSR mAnimatedDrawableFactory;
    public C1331210kkJ mAnimatedDrawableUtil;
    public final C1325080kaQ<InterfaceC1324680kZm, Bitmap> mAnimatedHeifBackingCache;
    public InterfaceC1331330kkV mAnimatedImageFactory;
    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> mBackingCache;
    public final InterfaceC1328030kfB mExecutorSupplier;
    public final AbstractC1301670jyf mPlatformBitmapFactory;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0khf] */
    private InterfaceC1331330kkV buildAnimatedImageFactory() {
        return new C1329390khN(new InterfaceC1330360kiw() { // from class: X.0khf
            @Override // X.InterfaceC1330360kiw
            public final C1329590khh LIZ(C1329440khS c1329440khS, Rect rect) {
                return new C1329590khh(this.LIZ.getAnimatedDrawableUtil(), c1329440khS, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0kiF] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0khd] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0khu] */
    private C1329330khH createDrawableFactory() {
        ?? r8 = new InterfaceC1320070kSL<Integer>() { // from class: X.0khd
            @Override // X.InterfaceC1320070kSL
            public final Integer get() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }
        };
        return new C1329330khH(getAnimatedDrawableBackendProvider(), C822690WPb.LIZ(), new C1334380kpQ(this.mExecutorSupplier.LIZLLL()) { // from class: X.0kiF
            {
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            }

            @Override // X.C1334380kpQ, java.util.concurrent.Executor
            public final synchronized void execute(Runnable runnable) {
                super.execute(runnable);
            }
        }, RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, this.mAnimatedHeifBackingCache, r8, new InterfaceC1320070kSL<Integer>() { // from class: X.0khu
            @Override // X.InterfaceC1320070kSL
            public final Integer get() {
                return 3;
            }
        });
    }

    private InterfaceC1330360kiw getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new InterfaceC1330360kiw() { // from class: X.0khg
                @Override // X.InterfaceC1330360kiw
                public final C1329590khh LIZ(C1329440khS c1329440khS, Rect rect) {
                    return new C1329590khh(this.LIZ.getAnimatedDrawableUtil(), c1329440khS, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public C1331210kkJ getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new C1331210kkJ();
        }
        return this.mAnimatedDrawableUtil;
    }

    public InterfaceC1331330kkV getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    public AbstractC1301670jyf getPlatformBitmapFactory() {
        return this.mPlatformBitmapFactory;
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    @Override // X.InterfaceC1322960kX0
    public InterfaceC1320130kSR getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    @Override // X.InterfaceC1322960kX0
    public InterfaceC1330200kig getGifDecoder(final Bitmap.Config config) {
        return new InterfaceC1330200kig(config) { // from class: X.0khQ
            @Override // X.InterfaceC1330200kig
            public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
                InterfaceC1329600khi interfaceC1329600khiDecode;
                C1329390khN c1329390khN = (C1329390khN) this.LIZ.getAnimatedImageFactory();
                c1329390khN.getClass();
                InterfaceC1330350kiv interfaceC1330350kiv = C1329390khN.LIZJ;
                if (interfaceC1330350kiv != null) {
                    C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu.LJFF();
                    c1323050kX9LJFF.getClass();
                    try {
                        InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9LJFF.get();
                        if (interfaceC1327060kdc.getByteBuffer() != null) {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getByteBuffer());
                        } else {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getNativePtr(), interfaceC1327060kdc.size());
                        }
                        c1328480kfu.LJIJJLI();
                        AbstractC1327750kej abstractC1327750kejLJ = c1329390khN.LJ(c1329360khK, interfaceC1329600khiDecode, c1328480kfu.LLILLL);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        return abstractC1327750kejLJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        throw th;
                    }
                }
                throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
            }
        };
    }

    @Override // X.InterfaceC1322960kX0
    public InterfaceC1330200kig getHeifDecoder(final Bitmap.Config config) {
        return new InterfaceC1330200kig(config) { // from class: X.0khP
            @Override // X.InterfaceC1330200kig
            public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
                InterfaceC1329600khi interfaceC1329600khiDecode;
                C1329390khN c1329390khN = (C1329390khN) this.LIZ.getAnimatedImageFactory();
                c1329390khN.getClass();
                InterfaceC1330350kiv interfaceC1330350kiv = C1329390khN.LJ;
                if (interfaceC1330350kiv != null) {
                    C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu.LJFF();
                    c1323050kX9LJFF.getClass();
                    try {
                        InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9LJFF.get();
                        if (interfaceC1327060kdc.getByteBuffer() != null) {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getByteBuffer());
                        } else {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getNativePtr(), interfaceC1327060kdc.size());
                        }
                        if (interfaceC1329600khiDecode instanceof g) {
                            ((g) interfaceC1329600khiDecode).mDecodeStatus = c1328480kfu.LLJILJIL;
                        }
                        c1328480kfu.LJIJJLI();
                        AbstractC1327750kej abstractC1327750kejLJ = c1329390khN.LJ(c1329360khK, interfaceC1329600khiDecode, c1328480kfu.LLILLL);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        return abstractC1327750kejLJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        throw th;
                    }
                }
                throw new UnsupportedOperationException("To encode animated heif please add the dependency to the animated-heif module");
            }
        };
    }

    @Override // X.InterfaceC1322960kX0
    public InterfaceC1330200kig getWebPDecoder(final Bitmap.Config config) {
        return new InterfaceC1330200kig(config) { // from class: X.0khO
            @Override // X.InterfaceC1330200kig
            public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
                InterfaceC1329600khi interfaceC1329600khiDecode;
                C1329390khN c1329390khN = (C1329390khN) this.LIZ.getAnimatedImageFactory();
                c1329390khN.getClass();
                InterfaceC1330350kiv interfaceC1330350kiv = C1329390khN.LIZLLL;
                if (interfaceC1330350kiv != null) {
                    C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu.LJFF();
                    c1323050kX9LJFF.getClass();
                    try {
                        InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9LJFF.get();
                        if (interfaceC1327060kdc.getByteBuffer() != null) {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getByteBuffer());
                        } else {
                            interfaceC1329600khiDecode = interfaceC1330350kiv.decode(interfaceC1327060kdc.getNativePtr(), interfaceC1327060kdc.size());
                        }
                        if (interfaceC1329600khiDecode instanceof g) {
                            ((g) interfaceC1329600khiDecode).mDecodeStatus = c1328480kfu.LLJILJIL;
                        }
                        c1328480kfu.LJIJJLI();
                        AbstractC1327750kej abstractC1327750kejLJ = c1329390khN.LJ(c1329360khK, interfaceC1329600khiDecode, c1328480kfu.LLILLL);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        return abstractC1327750kejLJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        throw th;
                    }
                }
                throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
            }
        };
    }

    public AnimatedFactoryV2Impl(AbstractC1301670jyf abstractC1301670jyf, InterfaceC1328030kfB interfaceC1328030kfB, C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF, C1325080kaQ<InterfaceC1324680kZm, Bitmap> c1325080kaQ) {
        this.mPlatformBitmapFactory = abstractC1301670jyf;
        this.mExecutorSupplier = interfaceC1328030kfB;
        this.mBackingCache = c1329310khF;
        this.mAnimatedHeifBackingCache = c1325080kaQ;
    }
}
