package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1266004xO;
import X.C1270520jAQ;
import X.C1283340jV6;
import X.C1306250k63;
import X.C1326240kcI;
import X.C189200o6;
import X.C1AF0;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C588110N4v;
import X.EnumC1324400kZK;
import X.InterfaceC1270540jAS;
import X.InterfaceC1270560jAU;
import X.SurfaceHolderCallbackC1324390kZJ;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class AwS169S1100000_20 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS169S1100000_20 awS169S1100000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Container ");
        sbLIZ.append(((C1306250k63) awS169S1100000_20.l1).LIZIZ);
        sbLIZ.append(" , isStrategyLoaded:");
        sbLIZ.append(awS169S1100000_20.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS169S1100000_20 awS169S1100000_20) {
        Object c098200Yq;
        float fMeasureText;
        SurfaceHolderCallbackC1324390kZJ surfaceHolderCallbackC1324390kZJ = (SurfaceHolderCallbackC1324390kZJ) awS169S1100000_20.l1;
        surfaceHolderCallbackC1324390kZJ.LLILLJJLI = awS169S1100000_20.s0;
        if (surfaceHolderCallbackC1324390kZJ.LLILLL != EnumC1324400kZK.INIT || ((SurfaceHolderCallbackC1324390kZJ) awS169S1100000_20.l1).LLILLL != EnumC1324400kZK.DESTROYED) {
            SurfaceHolderCallbackC1324390kZJ surfaceHolderCallbackC1324390kZJ2 = (SurfaceHolderCallbackC1324390kZJ) awS169S1100000_20.l1;
            String str = awS169S1100000_20.s0;
            synchronized (surfaceHolderCallbackC1324390kZJ2) {
                try {
                    Canvas canvasLockCanvas = surfaceHolderCallbackC1324390kZJ2.getHolder().lockCanvas();
                    if (canvasLockCanvas != null) {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("drawText: ");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LIZ(strLIZIZ);
                        canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        float measuredWidth = surfaceHolderCallbackC1324390kZJ2.getMeasuredWidth() / 2.0f;
                        float measuredHeight = surfaceHolderCallbackC1324390kZJ2.getMeasuredHeight() / 2.0f;
                        Rect rect = new Rect();
                        TextPaint textPaint = surfaceHolderCallbackC1324390kZJ2.LL;
                        if (textPaint != null) {
                            textPaint.getTextBounds(str, 0, str.length(), rect);
                        }
                        float fHeight = rect.height();
                        TextPaint textPaint2 = surfaceHolderCallbackC1324390kZJ2.LL;
                        if (textPaint2 != null) {
                            fMeasureText = textPaint2.measureText(str);
                        } else {
                            fMeasureText = 0.0f;
                        }
                        float f = measuredWidth - (fMeasureText / 2.0f);
                        float f2 = measuredHeight + (fHeight / 2.0f);
                        TextPaint textPaint3 = surfaceHolderCallbackC1324390kZJ2.LL;
                        if (textPaint3 != null) {
                            canvasLockCanvas.drawText(str, f, f2, textPaint3);
                        }
                        surfaceHolderCallbackC1324390kZJ2.LLILZ = true;
                        surfaceHolderCallbackC1324390kZJ2.getHolder().unlockCanvasAndPost(canvasLockCanvas);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1AF0.LJ(thM5exceptionOrNullimpl);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS169S1100000_20 awS169S1100000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS169S1100000_20.s0);
        sbLIZ.append(" total=");
        C1326240kcI c1326240kcI = (C1326240kcI) awS169S1100000_20.l1;
        sbLIZ.append(c1326240kcI.LIZIZ.LIZ.size() + c1326240kcI.LIZJ.LIZ.size());
        sbLIZ.append(" normal=");
        sbLIZ.append(((C1326240kcI) awS169S1100000_20.l1).LIZIZ.LIZ.size());
        sbLIZ.append(" inline=");
        sbLIZ.append(((C1326240kcI) awS169S1100000_20.l1).LIZJ.LIZ.size());
        sbLIZ.append(" mainThread=");
        sbLIZ.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS169S1100000_20 awS169S1100000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processEvent ");
        sbLIZ.append(awS169S1100000_20.s0);
        sbLIZ.append(" result:");
        sbLIZ.append((C588110N4v) awS169S1100000_20.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS169S1100000_20 awS169S1100000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerRule ");
        sbLIZ.append(awS169S1100000_20.s0);
        sbLIZ.append(" result:");
        sbLIZ.append((C588110N4v) awS169S1100000_20.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS169S1100000_20 awS169S1100000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processEvent ");
        sbLIZ.append(awS169S1100000_20.s0);
        sbLIZ.append(" result:");
        sbLIZ.append((C1266004xO) awS169S1100000_20.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS169S1100000_20 awS169S1100000_20) {
        C20441214yg.LIZIZ("LiveRecord", "recorderManager start");
        final C1283340jV6 c1283340jV6 = (C1283340jV6) awS169S1100000_20.l1;
        InterfaceC1270540jAS interfaceC1270540jAS = c1283340jV6.LIZIZ;
        String str = awS169S1100000_20.s0;
        InterfaceC1270560jAU interfaceC1270560jAU = new InterfaceC1270560jAU() { // from class: X.0jV7
            @Override // X.InterfaceC1270560jAU
            public final void LIZ() {
                C20441214yg.LIZIZ("LiveRecord", "internal onRecorderStarted");
                InterfaceC1283360jV8 interfaceC1283360jV8 = c1283340jV6.LIZLLL;
                if (interfaceC1283360jV8 != null) {
                    interfaceC1283360jV8.LIZ();
                }
            }

            @Override // X.InterfaceC1270560jAU
            public final void LIZJ(String str2) {
                C20441214yg.LIZIZ("LiveRecord", "internal onRecorderStoped");
                InterfaceC1283360jV8 interfaceC1283360jV8 = c1283340jV6.LIZLLL;
                if (interfaceC1283360jV8 != null) {
                    interfaceC1283360jV8.LIZLLL(str2);
                }
            }

            @Override // X.InterfaceC1270560jAU
            public final void LIZIZ(int i, Exception exc) {
                Boolean boolValueOf;
                C11JF c11jf;
                C20441214yg.LIZIZ("LiveRecord", "internal onRecorderError");
                InterfaceC1283360jV8 interfaceC1283360jV8 = c1283340jV6.LIZLLL;
                if (interfaceC1283360jV8 != null) {
                    interfaceC1283360jV8.LIZIZ(i, exc);
                }
                C11JF c11jf2 = c1283340jV6.LJ;
                if (c11jf2 != null) {
                    boolValueOf = Boolean.valueOf(c11jf2.isDisposed());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIFFI(boolValueOf) && (c11jf = c1283340jV6.LJ) != null) {
                    c11jf.dispose();
                }
                C800550Van c800550Van = c1283340jV6.LJFF;
                if (c800550Van != null) {
                    c800550Van.LIZ();
                }
                c1283340jV6.LJFF = null;
            }
        };
        DisplayMetrics displayMetricsLJIILIIL = C497740JfY.LJIILIIL(C500260Jjc.LJ(c1283340jV6.LIZ));
        C1270520jAQ config = c1283340jV6.LIZJ;
        if (config == null) {
            config = c1283340jV6.LIZIZ.getConfig();
            config.LIZ = true;
            config.LJI = true;
            config.LJFF = true;
            config.LIZIZ = 576;
            config.LIZJ = (int) (576 * (displayMetricsLJIILIIL.heightPixels / displayMetricsLJIILIIL.widthPixels));
            config.LJ = 25;
            config.LIZLLL = 2000000L;
            c1283340jV6.LIZJ = config;
        }
        interfaceC1270540jAS.LIZ(str, interfaceC1270560jAU, config, 1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(C1326240kcI c1326240kcI, int i) {
        super(0);
        this.$t = i;
        this.s0 = "aggregator";
        this.l1 = c1326240kcI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(C1283340jV6 c1283340jV6, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1283340jV6;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(C1306250k63 c1306250k63, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1306250k63;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(SurfaceHolderCallbackC1324390kZJ surfaceHolderCallbackC1324390kZJ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = surfaceHolderCallbackC1324390kZJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(String str, C1266004xO c1266004xO, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1266004xO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S1100000_20(String str, C588110N4v c588110N4v, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c588110N4v;
    }
}
