package com.lynx.tasm.behavior;

import X.C0WZX;
import X.C1289430jev;
import X.C1299180jue;
import X.C1310660kDA;
import X.C1311380kEK;
import X.C1311720kEs;
import X.C1311770kEx;
import X.C1312920kGo;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC1299430jv3;
import X.EnumC665490Q8l;
import X.InterfaceC1299150jub;
import X.InterfaceC1309730kBf;
import X.InterfaceC1310280kCY;
import X.InterfaceC1310560kD0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.NativeFacade;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.render.NativePaintingContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIRenderer implements InterfaceC1309730kBf {
    public static final Object LJIILJJIL = new Object();
    public static HandlerThread LJIILL = null;
    public WeakReference<s> LIZ;
    public C1311720kEs LIZIZ;
    public C1311380kEK LIZJ;
    public C1311770kEx LIZLLL;
    public InterfaceC1310280kCY LJ;
    public long LJFF;
    public EnumC1299430jv3 LJI;
    public boolean LJII;
    public String LJIIIIZZ = "50px";
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public static native long nativeCreateUIDelegate(long j, long j2);

    public static native void nativeDestroyUIDelegate(long j);

    public final void LIZ() {
        C1311720kEs c1311720kEs = this.LIZIZ;
        if (c1311720kEs == null || this.LIZJ != null) {
            return;
        }
        C1311380kEK c1311380kEK = new C1311380kEK(c1311720kEs);
        this.LIZJ = c1311380kEK;
        C1311720kEs c1311720kEs2 = this.LIZIZ;
        c1311380kEK.LJIL = c1311380kEK.LJIL || c1311720kEs2.LJIJI;
        if (this.LJII) {
            this.LJII = false;
            s sVar = c1311720kEs2.LIZJ;
            if (sVar != null) {
                sVar.LLIZLLLIL = c1311380kEK;
                String str = this.LJIIIIZZ;
                if (str != null && !str.equals("50px")) {
                    this.LIZJ.LJIILJJIL = C1312920kGo.LJ(str, 0.0f, sVar.LLJJJ);
                }
                C1311380kEK c1311380kEK2 = this.LIZJ;
                c1311380kEK2.LJIL = c1311380kEK2.LJIL || this.LJIIJ;
                c1311380kEK2.LJJIFFI = this.LJIIIZ;
                c1311380kEK2.LJJ = this.LJIIL;
                if (this.LJIIJJI && (!C1299180jue.LIZ.booleanValue())) {
                    this.LIZJ.LJIIJ = this.LIZIZ.LJIILJJIL;
                }
            }
        }
    }

    public final long LIZLLL() {
        if (this.LJFF == 0) {
            InterfaceC1310280kCY interfaceC1310280kCY = this.LJ;
            long jLIZ = interfaceC1310280kCY != null ? interfaceC1310280kCY.LIZ() : 0L;
            C1311770kEx c1311770kEx = this.LIZLLL;
            long j = c1311770kEx != null ? c1311770kEx.LIZJ : 0L;
            if (jLIZ != 0 && j != 0) {
                this.LJFF = nativeCreateUIDelegate(jLIZ, j);
            }
        }
        return this.LJFF;
    }

    public final void LJFF() {
        C1311770kEx c1311770kEx = this.LIZLLL;
        if (c1311770kEx != null) {
            c1311770kEx.LIZIZ = true;
            this.LIZLLL = null;
        }
        InterfaceC1310280kCY interfaceC1310280kCY = this.LJ;
        if (interfaceC1310280kCY != null) {
            interfaceC1310280kCY.destroy();
            this.LJ = null;
        }
        long j = this.LJFF;
        if (j != 0) {
            nativeDestroyUIDelegate(j);
            this.LJFF = 0L;
        }
    }

    public final void LJII() {
        NativeFacade nativeFacade;
        InterfaceC1299150jub interfaceC1299150jub;
        C1311380kEK c1311380kEK = this.LIZJ;
        if (c1311380kEK != null) {
            c1311380kEK.getClass();
        }
        C1311720kEs c1311720kEs = this.LIZIZ;
        if (c1311720kEs != null) {
            c1311720kEs.LJIIJ = true;
            c1311720kEs.LIZ = -1;
            HashMap<Integer, LynxBaseUI> map = c1311720kEs.LJI;
            if (map != null) {
                Iterator<LynxBaseUI> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
                c1311720kEs.LJI.clear();
                c1311720kEs.LJ.clear();
            }
            UIBody uIBody = c1311720kEs.LIZIZ;
            if (uIBody != null) {
                uIBody.removeAll();
            }
            HashMap<String, Integer> map2 = c1311720kEs.LJIIIIZZ;
            if (map2 != null) {
                map2.clear();
            }
            WeakReference<NativeFacade> weakReference = c1311720kEs.LJIILIIL;
            if (weakReference == null || (nativeFacade = weakReference.get()) == null || (interfaceC1299150jub = nativeFacade.LIZ) == null) {
                return;
            }
            interfaceC1299150jub.LJIJJ();
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.0kCe] */
    public final void LIZJ(View view, Canvas canvas) {
        int i;
        try {
            if (LynxEnv.inst().isPixelCopyEnabled() && (i = Build.VERSION.SDK_INT) >= 26) {
                int[] iArr = new int[2];
                if (i >= 29) {
                    view.getLocationInSurface(iArr);
                } else {
                    view.getLocationInWindow(iArr);
                }
                Field declaredField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mSurface");
                if (view.getRootView().getParent() == null) {
                    view.draw(canvas);
                    return;
                }
                Surface surface = (Surface) declaredField.get(view.getRootView().getParent());
                DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(view.getContext());
                int i2 = displayMetricsLIZ.widthPixels;
                int i3 = displayMetricsLIZ.heightPixels;
                Rect rect = new Rect(Math.max(0, iArr[0]), Math.max(0, iArr[1]), Math.min(iArr[0] + view.getWidth(), i2), Math.min(iArr[1] + view.getHeight(), i3));
                int iMax = Math.max(0, rect.width());
                int iMax2 = Math.max(0, rect.height());
                if (iMax > 0 && iMax2 > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    Object obj = LJIILJJIL;
                    synchronized (obj) {
                        try {
                            C2204961BRm.LLILLIZIL(surface, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0kCe
                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                public final void onPixelCopyFinished(int i4) {
                                    Object obj2 = LynxUIRenderer.LJIILJJIL;
                                    synchronized (obj2) {
                                        try {
                                            obj2.notify();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                            }, new BPEAHandler(C786410Ut5.W2(LJIILL)), new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezjwUCopqpodH/DGTM0FQ==", null));
                            try {
                                obj.wait(10000L);
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                                LynxLog.e("DevTool Screenshot", e.toString());
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    canvas.drawBitmap(bitmapCreateBitmap, r6 - iArr[0], r5 - iArr[1], (Paint) null);
                    C786410Ut5.LJJJJ(bitmapCreateBitmap);
                    return;
                }
                canvas.drawColor(0);
                return;
            }
            view.draw(canvas);
        } catch (Throwable th) {
        }
    }

    public final void LIZIZ(C1310660kDA c1310660kDA, s sVar, Context context) {
        int scaledTouchSlop;
        if (sVar != null) {
            this.LIZ = new WeakReference<>(sVar);
            sVar.LLJJ = new WeakReference<>(this.LIZIZ);
            sVar.LLJILJILJ = this.LIZIZ.LIZIZ;
            sVar.setBaseContext(context);
            sVar.LJJIIJ(c1310660kDA);
            C1311380kEK c1311380kEK = this.LIZJ;
            if (c1311380kEK != null) {
                GestureRecognizer gestureRecognizer = c1311380kEK.LIZIZ;
                if (gestureRecognizer != null) {
                    if (context == null) {
                        scaledTouchSlop = ViewConfiguration.getTouchSlop();
                    } else {
                        scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                    }
                    gestureRecognizer.LIZ = scaledTouchSlop * scaledTouchSlop;
                }
                sVar.LLIZLLLIL = this.LIZJ;
            }
        }
        C1311720kEs c1311720kEs = this.LIZIZ;
        if (c1311720kEs != null) {
            if (sVar != null) {
                c1311720kEs.LIZJ = sVar;
            }
            c1311720kEs.LIZIZ(c1310660kDA);
        }
    }

    public final void LJ(s sVar, EnumC665490Q8l enumC665490Q8l, C1289430jev c1289430jev, InterfaceC1310560kD0 interfaceC1310560kD0) {
        InterfaceC1310280kCY paintingContext;
        if (this.LIZIZ == null) {
            return;
        }
        if (this.LJ == null) {
            if (sVar.LJIJJ()) {
                paintingContext = new NativePaintingContext(c1289430jev, sVar, this.LIZIZ.LIZIZ.LL);
            } else {
                paintingContext = new PaintingContext(this.LIZIZ, enumC665490Q8l.id());
            }
            this.LJ = paintingContext;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new C1311770kEx(sVar, c1289430jev, interfaceC1310560kD0);
        }
        C1311770kEx c1311770kEx = this.LIZLLL;
        sVar.getClass();
        sVar.LLJJIJIL = new WeakReference<>(c1311770kEx);
    }

    public final void LJI(s sVar, C1289430jev c1289430jev, C1310660kDA c1310660kDA, EnumC1299430jv3 enumC1299430jv3) {
        if (!this.LJIILIIL) {
            this.LIZIZ = new C1311720kEs(c1289430jev, sVar, c1310660kDA);
        } else {
            C1311720kEs c1311720kEs = this.LIZIZ;
            if (sVar != null) {
                c1311720kEs.LIZJ = sVar;
            } else {
                c1311720kEs.getClass();
            }
            this.LIZIZ.LIZIZ(c1310660kDA);
        }
        if (c1310660kDA == null) {
            this.LIZIZ.LJIIL = true;
        }
        C1311720kEs c1311720kEs2 = this.LIZIZ;
        sVar.getClass();
        sVar.LLJJ = new WeakReference<>(c1311720kEs2);
        sVar.LLJILJILJ = this.LIZIZ.LIZIZ;
        sVar.LJJIIJ(c1310660kDA);
        this.LIZ = new WeakReference<>(sVar);
        this.LJI = enumC1299430jv3;
        synchronized (LynxUIRenderer.class) {
            if (LJIILL == null && LynxEnv.inst().isLynxDebugEnabled()) {
                HandlerThread handlerThread = new HandlerThread("PixelCopier");
                LJIILL = handlerThread;
                handlerThread.start();
            }
        }
        this.LJIILIIL = true;
    }
}
