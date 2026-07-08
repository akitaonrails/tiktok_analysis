package kotlin.jvm.internal;

import X.AbstractC1313500kHk;
import X.C09AY;
import X.C1310660kDA;
import X.C1313670kI1;
import X.C1313860kIK;
import X.C1315470kKv;
import X.C1317080kNW;
import X.C1317790kOf;
import android.graphics.Rect;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public class AwS298S0300000_20 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS298S0300000_20 awS298S0300000_20, Object obj, Object obj2) {
        LynxView lynxView = (LynxView) obj;
        Rect rect = (Rect) obj2;
        int i = rect.left;
        Rect rect2 = (Rect) awS298S0300000_20.l0;
        int i2 = i - rect2.left;
        int i3 = rect.top - rect2.top;
        C1315470kKv c1315470kKv = (C1315470kKv) awS298S0300000_20.l1;
        C1317790kOf c1317790kOf = (C1317790kOf) awS298S0300000_20.l2;
        UIGroup<C1310660kDA> lynxUIRoot = lynxView.getLynxUIRoot();
        int width = lynxView.getWidth() + i2;
        int height = i3 + lynxView.getHeight();
        c1315470kKv.getClass();
        C1315470kKv.LIZIZ(c1317790kOf, lynxUIRoot, 0, 0, i2, i3, width, height);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS298S0300000_20 awS298S0300000_20, Object obj, Object obj2) {
        C1317080kNW c1317080kNW = (C1317080kNW) obj;
        Rect rect = (Rect) obj2;
        int i = rect.left;
        Rect rect2 = (Rect) awS298S0300000_20.l0;
        int i2 = i - rect2.left;
        int i3 = rect.top - rect2.top;
        C1313860kIK c1313860kIK = (C1313860kIK) awS298S0300000_20.l1;
        C1317790kOf c1317790kOf = (C1317790kOf) awS298S0300000_20.l2;
        AbstractC1313500kHk<C1313670kI1> sDUIUIRoot = c1317080kNW.getSDUIUIRoot();
        int width = c1317080kNW.getWidth() + i2;
        int height = i3 + c1317080kNW.getHeight();
        c1313860kIK.getClass();
        C1313860kIK.LIZ(c1317790kOf, sDUIUIRoot, 0, 0, i2, i3, width, height);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS298S0300000_20(Rect rect, C1313860kIK c1313860kIK, C1317790kOf c1317790kOf, int i) {
        super(2);
        this.$t = i;
        this.l0 = rect;
        this.l1 = c1313860kIK;
        this.l2 = c1317790kOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS298S0300000_20(Rect rect, C1315470kKv c1315470kKv, C1317790kOf c1317790kOf, int i) {
        super(2);
        this.$t = i;
        this.l0 = rect;
        this.l1 = c1315470kKv;
        this.l2 = c1317790kOf;
    }
}
