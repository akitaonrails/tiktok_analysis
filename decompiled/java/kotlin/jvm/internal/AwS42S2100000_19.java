package kotlin.jvm.internal;

import X.C09AY;
import X.C1228470i4b;
import X.C1228570i4l;
import X.C1228650i4t;
import X.C1238100iK8;
import X.C1263960izq;
import X.C1397620mTQ;
import X.C1440005kM;
import X.C19EG;
import X.C459080HzO;
import X.C913630Zsn;
import X.InterfaceC1230510i7t;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS42S2100000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        ((InterfaceC1230510i7t) obj).LIZIZ((C19EG) awS42S2100000_19.l2, awS42S2100000_19.s0, awS42S2100000_19.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS42S2100000_19.s0, new AwS598S0100000_19((SystemShareActivityViewModel) awS42S2100000_19.l2, 14));
        c1397620mTQ.LIZJ(1, awS42S2100000_19.s1, new AwS598S0100000_19((SystemShareActivityViewModel) awS42S2100000_19.l2, 15));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS42S2100000_19.s0, new AwS598S0100000_19((SystemShareActivity) awS42S2100000_19.l2, 16));
        c1397620mTQ.LIZJ(1, awS42S2100000_19.s1, new AwS598S0100000_19((SystemShareActivity) awS42S2100000_19.l2, 17));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS42S2100000_19.s0, new AwS598S0100000_19((C1238100iK8) awS42S2100000_19.l2, 54));
        c1397620mTQ.LIZJ(1, awS42S2100000_19.s1, new AwS598S0100000_19((C1238100iK8) awS42S2100000_19.l2, 568));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = awS42S2100000_19.s0;
        }
        ((TuxTextView) awS42S2100000_19.l2).setText(str);
        C1263960izq.LIZIZ.put(awS42S2100000_19.s1, str);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS42S2100000_19 awS42S2100000_19, Object obj) {
        C1440005kM.LIZ(C1228570i4l.LIZ);
        C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, awS42S2100000_19.s0, awS42S2100000_19.s1).LJFF(C459080HzO.LJ(), new C1228470i4b(C1228650i4t.LIZ(((C1228470i4b) awS42S2100000_19.l2).LIZ, "group_setting", "click", null, null, 0, null, false, null, null, false, null, false, false, 0, 0, false, false, false, null, null, false, false, null, -4, 1), ((C1228470i4b) awS42S2100000_19.l2).LIZIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(C1228470i4b c1228470i4b, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1228470i4b;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(C19EG c19eg, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c19eg;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(TuxTextView tuxTextView, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = tuxTextView;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(String str, String str2, C1238100iK8 c1238100iK8, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1238100iK8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(String str, String str2, SystemShareActivity systemShareActivity, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = systemShareActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S2100000_19(String str, String str2, SystemShareActivityViewModel systemShareActivityViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = systemShareActivityViewModel;
    }
}
