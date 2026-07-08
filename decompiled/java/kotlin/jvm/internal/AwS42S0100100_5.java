package kotlin.jvm.internal;

import X.C09AY;
import X.C0EDV;
import X.C373940ElM;
import X.C374140Elg;
import X.C374400Em6;
import X.C374770Emh;
import X.C376300EpA;
import X.C380820EwS;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS42S0100100_5 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS42S0100100_5 awS42S0100100_5, Object obj) {
        return C374140Elg.LIZ((C374140Elg) obj, null, null, null, false, null, awS42S0100100_5.j1, (PointF) awS42S0100100_5.l0, false, 159);
    }

    public static final Object invoke$1(AwS42S0100100_5 awS42S0100100_5, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C373940ElM c373940ElM = (C373940ElM) awS42S0100100_5.l0;
            long j = awS42S0100100_5.j1;
            C374400Em6 c374400Em6 = c373940ElM.LLJZ;
            if (c374400Em6 != null) {
                Long lValueOf = Long.valueOf(j);
                c374400Em6.LLJZ = new AwS549S0100000_5(c373940ElM, 559);
                FrameLayout frameLayout = c374400Em6.LLJLLL;
                if (frameLayout != null) {
                    layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = bitmap.getWidth();
                    }
                } else {
                    layoutParams = null;
                }
                FrameLayout frameLayout2 = c374400Em6.LLJLLL;
                if (frameLayout2 != null) {
                    C786410Ut5.a6(frameLayout2, layoutParams);
                }
                C374770Emh c374770Emh = c374400Em6.LLJLLIL;
                if (c374770Emh != null) {
                    FrameLayout frameLayout3 = c374400Em6.LLJLLL;
                    Bitmap bitmap2 = c374770Emh.LLILZIL;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    }
                    c374770Emh.LLILZIL = bitmap;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = c374770Emh.LL.getLayoutParams();
                    layoutParams2.width = width;
                    layoutParams2.height = height;
                    C786410Ut5.W5(c374770Emh.LL, layoutParams2);
                    c374770Emh.LLILZ = frameLayout3;
                }
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    C374770Emh c374770Emh2 = c374400Em6.LLJLLIL;
                    if (c374770Emh2 != null) {
                        c374770Emh2.setInitialColor$tools_camera_edit_release(jLongValue);
                    }
                }
                C374770Emh c374770Emh3 = c374400Em6.LLJLLIL;
                if (c374770Emh3 != null) {
                    c374770Emh3.setOnColorPickedListener(new AwS619S0100000_5(c374400Em6, 14));
                }
                C374770Emh c374770Emh4 = c374400Em6.LLJLLIL;
                if (c374770Emh4 != null) {
                    c374770Emh4.setOnColorReleasedListener(new AwS549S0100000_5(c374400Em6, 555));
                }
                C374770Emh c374770Emh5 = c374400Em6.LLJLLIL;
                if (c374770Emh5 != null) {
                    c374770Emh5.setOnBitmapRefreshRequestListener(new AwS584S0100000_5(c374400Em6, 465));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS42S0100100_5 awS42S0100100_5, Object obj) {
        String message;
        C0EDV c0edv = (C0EDV) obj;
        if (((C380820EwS) awS42S0100100_5.l0).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            long jCurrentTimeMillis = System.currentTimeMillis() - awS42S0100100_5.j1;
            String strValueOf = String.valueOf(c0edv.LIZIZ);
            Exception exc = c0edv.LIZ;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = null;
            }
            C376300EpA.LIZIZ("load_cutout_stroke_panel", null, strValueOf, message, false, jCurrentTimeMillis, 1);
            ((C380820EwS) awS42S0100100_5.l0).i3(AFwS234S0000000_5.get$arr$(245));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0100100_5(long j, C380820EwS c380820EwS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c380820EwS;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0100100_5(long j, PointF pointF, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = pointF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0100100_5(C373940ElM c373940ElM, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c373940ElM;
        this.j1 = j;
    }
}
