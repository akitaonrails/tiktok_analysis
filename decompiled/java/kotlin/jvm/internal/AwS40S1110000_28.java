package kotlin.jvm.internal;

import X.C09AY;
import X.C10BM;
import X.C1397620mTQ;
import X.C2097908Jt;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseItemExtra;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS40S1110000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S1110000_28 awS40S1110000_28, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (awS40S1110000_28.z2) {
            i = R.string.fte;
        } else {
            i = 2131830797;
        }
        c1397620mTQ.LJFF(i, new AwS142S1100000_28(awS40S1110000_28.s0, (String) awS40S1110000_28.l1, (Function0<Unit>) 2));
        c1397620mTQ.LJII(2131830798, new AwS78S1000000_28(awS40S1110000_28.s0, 3));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S1110000_28 awS40S1110000_28, Object obj) {
        String str;
        String str2;
        int iIntValue = ((Number) obj).intValue();
        if (awS40S1110000_28.z2) {
            str = "video_type1";
        } else {
            str = "video_type2";
        }
        String str3 = awS40S1110000_28.s0;
        if (iIntValue == 1) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C10BM.LIZLLL(str, str3, str2, C2097908Jt.LIZJ(new Pair("inconsistent_num", String.valueOf(((ContentReuseItemExtra) awS40S1110000_28.l1).inconsistentCount))));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S1110000_28(String str, Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S1110000_28(boolean z, String str, ContentReuseItemExtra contentReuseItemExtra, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = contentReuseItemExtra;
    }
}
