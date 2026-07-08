package kotlin.jvm.internal;

import X.C09AY;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1954807lC;
import X.C491001vg;
import X.C491101vh;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.NoPaymentSeriesPanelSquareAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoBotCenterFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS301S0300000_24 extends C09AY implements Function2 {
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

    public static final Object invoke$0(AwS301S0300000_24 awS301S0300000_24, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((NoPaymentSeriesPanelSquareAssem) awS301S0300000_24.l0).No().setLoading(false);
        if (zBooleanValue) {
            ((NoPaymentSeriesPanelSquareAssem) awS301S0300000_24.l0).No().setButtonStartIconDrawable((TuxIconDrawable) awS301S0300000_24.l1);
            ((NoPaymentSeriesPanelSquareAssem) awS301S0300000_24.l0).No().setText(2131847438);
        } else {
            ((NoPaymentSeriesPanelSquareAssem) awS301S0300000_24.l0).No().setButtonStartIconDrawable((TuxIconDrawable) awS301S0300000_24.l2);
            ((NoPaymentSeriesPanelSquareAssem) awS301S0300000_24.l0).No().setText(2131847440);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS301S0300000_24 awS301S0300000_24, Object obj, Object obj2) {
        if (obj2 instanceof C1623606Xi) {
            C786410Ut5.LJLLLLLL(8, (View) awS301S0300000_24.l0);
        } else if (obj2 instanceof C491001vg) {
            C786410Ut5.LJLLLLLL(0, (View) awS301S0300000_24.l0);
            C1749280vcc c1749280vcc = (C1749280vcc) awS301S0300000_24.l1;
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS568S0100000_24((TakoBotCenterFragment) awS301S0300000_24.l2, 1810));
            c1749280vcc.setStatus(c1722300uv6);
        } else if ((obj2 instanceof C1623706Xj) || Intrinsics.LJFF(obj2, C491101vh.LIZ)) {
            C786410Ut5.LJLLLLLL(0, (View) awS301S0300000_24.l0);
            ((C1749280vcc) awS301S0300000_24.l1).LJ();
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS301S0300000_24(View view, C1749280vcc c1749280vcc, TakoBotCenterFragment takoBotCenterFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c1749280vcc;
        this.l2 = takoBotCenterFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS301S0300000_24(NoPaymentSeriesPanelSquareAssem noPaymentSeriesPanelSquareAssem, TuxIconDrawable tuxIconDrawable, TuxIconDrawable tuxIconDrawable2, int i) {
        super(2);
        this.$t = i;
        this.l0 = noPaymentSeriesPanelSquareAssem;
        this.l1 = tuxIconDrawable;
        this.l2 = tuxIconDrawable2;
    }
}
