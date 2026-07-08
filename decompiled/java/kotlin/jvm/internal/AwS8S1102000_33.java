package kotlin.jvm.internal;

import X.C09AY;
import X.C197039127h;
import X.C786410Ut5;
import Y.ACListenerS167S0100000_33;
import com.bytedance.tux.container.TuxWebViewContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS8S1102000_33 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS8S1102000_33 awS8S1102000_33, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        String str = awS8S1102000_33.s0;
        if (str == null) {
            str = "";
        }
        c197039127h.setText(str);
        c197039127h.setButtonVariant(awS8S1102000_33.i2);
        C786410Ut5.U8(c197039127h, new ACListenerS167S0100000_33((TuxWebViewContainer) awS8S1102000_33.l1, 21));
        c197039127h.setButtonSize(awS8S1102000_33.i3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS8S1102000_33 awS8S1102000_33, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        String str = awS8S1102000_33.s0;
        if (str == null) {
            str = "";
        }
        c197039127h.setText(str);
        c197039127h.setButtonVariant(awS8S1102000_33.i2);
        C786410Ut5.U8(c197039127h, new ACListenerS167S0100000_33((TuxWebViewContainer) awS8S1102000_33.l1, 22));
        c197039127h.setButtonSize(awS8S1102000_33.i3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS8S1102000_33 awS8S1102000_33, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        String str = awS8S1102000_33.s0;
        if (str == null) {
            str = "";
        }
        c197039127h.setText(str);
        c197039127h.setButtonVariant(awS8S1102000_33.i2);
        C786410Ut5.U8(c197039127h, new ACListenerS167S0100000_33((TuxWebViewContainer) awS8S1102000_33.l1, 23));
        c197039127h.setButtonSize(awS8S1102000_33.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1102000_33(String str, int i, int i2, TuxWebViewContainer tuxWebViewContainer, int i3) {
        super(1);
        this.$t = i3;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = tuxWebViewContainer;
    }
}
