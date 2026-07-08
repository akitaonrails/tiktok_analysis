package kotlin.jvm.internal;

import X.C09AY;
import X.C1558520qew;
import X.C1857420yR2;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C19EG;
import X.C419910GdJ;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS0S2410000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public boolean z6;

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

    public static final Object invoke$0(AwS0S2410000_27 awS0S2410000_27, Object obj) {
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS0S2410000_27.l2, TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            takoCardAbility.MI0((Message) awS0S2410000_27.l3, awS0S2410000_27.s0, true);
        }
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19eg = (C19EG) awS0S2410000_27.l4;
        View view = (View) awS0S2410000_27.l5;
        String str = awS0S2410000_27.s0;
        Message message = (Message) awS0S2410000_27.l3;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS0S2410000_27.l2;
        C1857420yR2.LJIL(c19eg, view, str, message, interfaceC665370Q7z, awS0S2410000_27.s1, awS0S2410000_27.z6, new AwS110S1200000_27(interfaceC665370Q7z, message, str, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2410000_27 awS0S2410000_27, Object obj) {
        int i;
        int i2;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.SAVE_IMAGE;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = 2131849898;
        } else {
            i = 2131849625;
        }
        c19723912Ez.LIZJ = Integer.valueOf(i);
        if (C1919007fQ.LIZLLL()) {
            i2 = R.attr.a1i;
        } else {
            i2 = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS0S2410000_27((InterfaceC665370Q7z) awS0S2410000_27.l2, (Message) awS0S2410000_27.l3, awS0S2410000_27.s0, (C19EG) awS0S2410000_27.l4, (View) awS0S2410000_27.l5, awS0S2410000_27.s1, awS0S2410000_27.z6, 0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2410000_27(InterfaceC665370Q7z interfaceC665370Q7z, Message message, String str, C19EG c19eg, View view, String str2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l2 = interfaceC665370Q7z;
        this.l3 = message;
        this.s0 = str;
        this.l4 = c19eg;
        this.l5 = view;
        this.s1 = str2;
        this.z6 = z;
    }
}
