package kotlin.jvm.internal;

import X.AnonymousClass1087;
import X.C09AY;
import X.C108G;
import X.C10LG;
import X.C1261860iwS;
import X.C1385130m9H;
import X.C431260Gvc;
import X.C444940Hca;
import X.C786410Ut5;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS65S0310000_28 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS65S0310000_28 awS65S0310000_28, Object obj, Object obj2) {
        String str = (String) obj;
        Integer num = (Integer) obj2;
        if (str != null && str.length() != 0) {
            C108G c108g = C108G.LIZ;
            View view = (View) awS65S0310000_28.l0;
            TuxTextView tuxTextView = (TuxTextView) awS65S0310000_28.l1;
            View view2 = (View) awS65S0310000_28.l2;
            c108g.getClass();
            Context context = tuxTextView.getContext();
            if (context != null) {
                String string = context.getString(2131825254);
                C444940Hca c444940Hca = new C444940Hca();
                c444940Hca.LIZJ = context.getString(2131825255);
                c444940Hca.LIZLLL(0);
                c444940Hca.LIZIZ = false;
                c444940Hca.LIZIZ(52);
                c444940Hca.LJIIIIZZ = new AwS141S1200000_26(context, str, num, 8);
                tuxTextView.setText(new SpannableStringBuilder(string).append((CharSequence) "\n").append(c444940Hca.LIZ(context)));
                tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                C786410Ut5.I7(new ACListenerS160S0100000_26(view, 51), view2);
                C786410Ut5.LJLLLLLL(0, view);
                C108G.LIZIZ(num);
            }
        } else if (awS65S0310000_28.z3) {
            AnonymousClass1087 anonymousClass1087 = AnonymousClass1087.LIZ;
            View view3 = (View) awS65S0310000_28.l0;
            TuxTextView tuxTextView2 = (TuxTextView) awS65S0310000_28.l1;
            View view4 = (View) awS65S0310000_28.l2;
            anonymousClass1087.getClass();
            AnonymousClass1087.LIZJ(view3, view4, tuxTextView2);
        } else {
            C786410Ut5.LJLLLLLL(8, (View) awS65S0310000_28.l0);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS65S0310000_28 awS65S0310000_28, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            C1385130m9H videoCover = ((C10LG) awS65S0310000_28.l0).getVideoCover();
            final C10LG c10lg = (C10LG) awS65S0310000_28.l0;
            final boolean z = awS65S0310000_28.z3;
            final Aweme aweme = (Aweme) awS65S0310000_28.l1;
            final C1261860iwS c1261860iwS = (C1261860iwS) awS65S0310000_28.l2;
            C786410Ut5.oa(videoCover, new View.OnClickListener() { // from class: X.10LI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    PerformanceUserCardViewModel performanceUserCardViewModel = c10lg.LLJJJJ;
                    if (performanceUserCardViewModel != null) {
                        performanceUserCardViewModel.vQ2(EnumC19228810Ko.CLICK_COVER);
                    }
                    if (z) {
                        C10LJ.LJ(aweme, c1261860iwS, c10lg.getContext());
                        return;
                    }
                    Aweme aweme2 = aweme;
                    C1261860iwS c1261860iwS2 = c1261860iwS;
                    Context context = c10lg.getContext();
                    PerformanceUserCardViewModel performanceUserCardViewModel2 = c10lg.LLJJJJ;
                    if (performanceUserCardViewModel2 != null) {
                        str = performanceUserCardViewModel2.LLJIJIL;
                    } else {
                        str = null;
                    }
                    C10LJ.LIZLLL(aweme2, c1261860iwS2, context, str);
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0310000_28(C10LG c10lg, boolean z, Aweme aweme, C1261860iwS c1261860iwS, int i) {
        super(2);
        this.$t = i;
        this.l0 = c10lg;
        this.z3 = z;
        this.l1 = aweme;
        this.l2 = c1261860iwS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0310000_28(View view, View view2, TuxTextView tuxTextView, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = tuxTextView;
        this.l2 = view2;
        this.z3 = z;
    }
}
