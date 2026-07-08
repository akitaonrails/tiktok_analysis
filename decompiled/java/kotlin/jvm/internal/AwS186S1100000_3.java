package kotlin.jvm.internal;

import X.C09AY;
import X.C09I6;
import X.C0VSJ;
import X.C113E;
import X.C1749280vcc;
import X.C2475309mx;
import X.C786410Ut5;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AwS186S1100000_3 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS186S1100000_3(C113E c113e, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c113e;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS186S1100000_3 awS186S1100000_3, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (obj != C09I6.COMPLETE) {
            ((Function1) awS186S1100000_3.l1).invoke(Boolean.FALSE);
        }
        boolean zLJFF = C2475309mx.LJFF(100, Bitmap.CompressFormat.JPEG, bitmap, new C0VSJ(awS186S1100000_3.s0));
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        ((Function1) awS186S1100000_3.l1).invoke(Boolean.valueOf(zLJFF));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS186S1100000_3 awS186S1100000_3, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        ((C113E) awS186S1100000_3.l1).LJIJI(iIntValue, awS186S1100000_3.s0, (List) obj, false);
        C1749280vcc c1749280vcc = ((C113E) awS186S1100000_3.l1).LLJJJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS186S1100000_3(String str, Function1 function1, int i) {
        super(2);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }
}
