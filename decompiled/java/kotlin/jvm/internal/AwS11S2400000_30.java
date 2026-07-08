package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C201996141y;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public class AwS11S2400000_30 extends C09AY implements Function2 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS11S2400000_30 awS11S2400000_30, Object obj, Object obj2) throws JSONException {
        C201996141y c201996141y = C201996141y.LIZ;
        u2 u2Var = (u2) awS11S2400000_30.l2;
        IMessageAbility iMessageAbility = (IMessageAbility) awS11S2400000_30.l3;
        c201996141y.getClass();
        C201996141y.LJIIIIZZ(true, u2Var, iMessageAbility);
        ((C013C) awS11S2400000_30.l4).element = true;
        C201996141y.LJFF("turn_memory_on", (TakoEnterParams) awS11S2400000_30.l5, awS11S2400000_30.s0, awS11S2400000_30.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S2400000_30 awS11S2400000_30, Object obj, Object obj2) throws JSONException {
        C201996141y c201996141y = C201996141y.LIZ;
        u2 u2Var = (u2) awS11S2400000_30.l2;
        IMessageAbility iMessageAbility = (IMessageAbility) awS11S2400000_30.l3;
        c201996141y.getClass();
        C201996141y.LJIIIIZZ(false, u2Var, iMessageAbility);
        ((C013C) awS11S2400000_30.l4).element = true;
        C201996141y.LJFF("click_not_now", (TakoEnterParams) awS11S2400000_30.l5, awS11S2400000_30.s0, awS11S2400000_30.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S2400000_30(u2 u2Var, IMessageAbility iMessageAbility, C013C c013c, TakoEnterParams takoEnterParams, String str, String str2, int i) {
        super(2);
        this.$t = i;
        this.l2 = u2Var;
        this.l3 = iMessageAbility;
        this.l4 = c013c;
        this.l5 = takoEnterParams;
        this.s0 = str;
        this.s1 = str2;
    }
}
