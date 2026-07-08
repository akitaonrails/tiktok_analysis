package kotlin.jvm.internal;

import X.AbstractC1368600lic;
import X.AbstractC1368630lif;
import X.C09AY;
import X.C0P0T;
import X.C1341920l1a;
import X.C1368580lia;
import X.C1391600mJi;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC1340660kzY;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS32S0202000_21 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0202000_21 awS32S0202000_21) {
        InterfaceC1631620sYq<Integer, Integer, View, Unit> interfaceC1631620sYqLLLIILIL = ((AbstractC1368630lif) awS32S0202000_21.l0).LLLIILIL();
        if (interfaceC1631620sYqLLLIILIL != null) {
            interfaceC1631620sYqLLLIILIL.invoke(Integer.valueOf(awS32S0202000_21.i2), Integer.valueOf(awS32S0202000_21.i3), (View) awS32S0202000_21.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0202000_21 awS32S0202000_21) {
        ((PollCell) awS32S0202000_21.l0).N5((C1341920l1a) awS32S0202000_21.l1, awS32S0202000_21.i2, awS32S0202000_21.i3, false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S0202000_21 awS32S0202000_21) {
        C450720Hlu c450720Hlu = new C450720Hlu((Activity) awS32S0202000_21.l0);
        c450720Hlu.LIZ(awS32S0202000_21.i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), awS32S0202000_21.i3 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.END;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJIILLIIL = (View) awS32S0202000_21.l1;
        c1391600mJi.LJII = 3000L;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0kzg
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJIILL();
            }
        });
        c0p0tLIZIZ.show();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS32S0202000_21 awS32S0202000_21) {
        AwS670S0100000_21 awS670S0100000_21 = ((C1368580lia) ((AbstractC1368600lic) awS32S0202000_21.l0)).LLJJIJIIJIL;
        if (awS670S0100000_21 != null) {
            awS670S0100000_21.invoke(Integer.valueOf(awS32S0202000_21.i2), Integer.valueOf(awS32S0202000_21.i3), (View) awS32S0202000_21.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0202000_21(int i, int i2, Activity activity, View view, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = activity;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S0202000_21(AbstractC1368600lic abstractC1368600lic, AbstractC1368600lic<Object> abstractC1368600lic2, int i, int i2, View view) {
        super(0);
        this.$t = view;
        this.l0 = abstractC1368600lic;
        this.i2 = abstractC1368600lic2;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S0202000_21(AbstractC1368630lif abstractC1368630lif, AbstractC1368630lif<Object> abstractC1368630lif2, int i, int i2, View view) {
        super(0);
        this.$t = view;
        this.l0 = abstractC1368630lif;
        this.i2 = abstractC1368630lif2;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0202000_21(PollCell pollCell, C1341920l1a c1341920l1a, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = pollCell;
        this.l1 = c1341920l1a;
        this.i2 = i;
        this.i3 = i2;
    }
}
