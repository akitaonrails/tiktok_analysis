package kotlin.jvm.internal;

import X.C09AY;
import X.C0W0P;
import X.C1567150qsr;
import X.C1611610s2Z;
import X.C786410Ut5;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailVideoListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS175S0400000_24 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS175S0400000_24 awS175S0400000_24, Object obj, Object obj2) {
        String str;
        if (((Boolean) obj).booleanValue()) {
            obj2 = null;
            str = "auto_login";
        } else {
            C0W0P c0w0p = (C0W0P) awS175S0400000_24.l0;
            Context context = (Context) awS175S0400000_24.l1;
            String str2 = ((C1567150qsr) awS175S0400000_24.l2).LIZIZ;
            c0w0p.getClass();
            C0W0P.LIZ(context, str2);
            str = "auto_login_failed_fallback";
        }
        ((Function2) awS175S0400000_24.l3).invoke(str, obj2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS175S0400000_24 awS175S0400000_24, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C1611610s2Z c1611610s2Z = (C1611610s2Z) obj2;
        if (c1611610s2Z.LIZ && !c1611610s2Z.LIZIZ) {
            ((TuxTextView) awS175S0400000_24.l0).setText(uIAssem.LJJIJL().getContext().getString(2131858243));
            ((TuxIconView) awS175S0400000_24.l1).setIconRes(R.raw.icon_chevron_down_fill);
            C786410Ut5.I7(new ACListenerS158S0100000_24((SeriesDetailVideoListAssem) awS175S0400000_24.l3, 46), (View) awS175S0400000_24.l2);
            ((SeriesDetailVideoListAssem) awS175S0400000_24.l3).Go().LIZLLL((View) awS175S0400000_24.l2);
        } else {
            ((SeriesDetailVideoListAssem) awS175S0400000_24.l3).Go().LJIL((View) awS175S0400000_24.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S0400000_24(C0W0P c0w0p, Context context, C1567150qsr c1567150qsr, AwS638S0100000_24 awS638S0100000_24, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0w0p;
        this.l1 = context;
        this.l2 = c1567150qsr;
        this.l3 = awS638S0100000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S0400000_24(TuxTextView tuxTextView, TuxIconView tuxIconView, View view, SeriesDetailVideoListAssem seriesDetailVideoListAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = tuxIconView;
        this.l2 = view;
        this.l3 = seriesDetailVideoListAssem;
    }
}
