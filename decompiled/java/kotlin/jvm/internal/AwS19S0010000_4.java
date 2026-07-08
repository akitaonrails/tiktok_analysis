package kotlin.jvm.internal;

import X.C09AY;
import X.C1623706Xj;
import X.C1834780xqW;
import X.C291001Au;
import X.C321700CjI;
import X.C322510Ckb;
import X.C329680CwA;
import X.C337920DMo;
import X.C346160Dhe;
import X.C627660Ojc;
import X.EnumC337930DMp;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS19S0010000_4 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0010000_4(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        EnumC337930DMp enumC337930DMp;
        C337920DMo c337920DMo = (C337920DMo) obj;
        if (awS19S0010000_4.z0) {
            enumC337930DMp = EnumC337930DMp.SUCCESS_EDIT_PREVENT_REFRESH;
        } else {
            enumC337930DMp = EnumC337930DMp.SUCCEED_EDIT;
        }
        return C337920DMo.LIZ(c337920DMo, null, null, false, null, null, null, null, new C291001Au(enumC337930DMp), null, 1535);
    }

    public static final Object invoke$1(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        return C329680CwA.LIZ((C329680CwA) obj, null, null, null, null, awS19S0010000_4.z0, null, null, false, 239);
    }

    public static final Object invoke$2(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        C346160Dhe c346160Dhe = (C346160Dhe) obj;
        if (awS19S0010000_4.z0) {
            return C346160Dhe.LIZ(c346160Dhe, false, true, null, null, C627660Ojc.LIZ(c346160Dhe.LLILZIL, new C1623706Xj(), null, null, null, 14), 8);
        }
        return C346160Dhe.LIZ(c346160Dhe, false, false, null, null, C627660Ojc.LIZ(c346160Dhe.LLILZIL, new C1623706Xj(), null, null, null, 14), 13);
    }

    public static final Object invoke$3(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        C346160Dhe c346160Dhe = (C346160Dhe) obj;
        if (awS19S0010000_4.z0) {
            return C346160Dhe.LIZ(c346160Dhe, true, false, null, null, C627660Ojc.LIZ(c346160Dhe.LLILZIL, new C1623706Xj(), null, null, null, 14), 8);
        }
        return C346160Dhe.LIZ(c346160Dhe, false, false, null, null, C627660Ojc.LIZ(c346160Dhe.LLILZIL, new C1623706Xj(), null, null, null, 14), 14);
    }

    public static final Object invoke$4(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        return C321700CjI.LIZ((C321700CjI) obj, null, !awS19S0010000_4.z0, false, null, false, false, null, false, 2045);
    }

    public static final Object invoke$5(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Boolean.valueOf(awS19S0010000_4.z0)), null, null, null, 491519);
    }

    public static final Object invoke$6(AwS19S0010000_4 awS19S0010000_4, Object obj) {
        return new C322510Ckb(!awS19S0010000_4.z0, ((C322510Ckb) obj).LLILLJJLI);
    }
}
