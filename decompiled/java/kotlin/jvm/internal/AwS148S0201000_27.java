package kotlin.jvm.internal;

import X.C09AY;
import X.C0P0T;
import X.C1002170cBb;
import X.C1022620cia;
import X.C1836680xta;
import X.C1844030y5R;
import X.C1850450yFn;
import X.C23250099c;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.SortItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS148S0201000_27 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S0201000_27 awS148S0201000_27) {
        ((AdFastScrollServiceImpl) awS148S0201000_27.l0).LJIIJ(awS148S0201000_27.i2, (Aweme) awS148S0201000_27.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS148S0201000_27 awS148S0201000_27) {
        if (awS148S0201000_27.i2 != ((ReviewViewModel) awS148S0201000_27.l0).LLILLJJLI.getSecond().intValue()) {
            ReviewViewModel reviewViewModel = (ReviewViewModel) awS148S0201000_27.l0;
            reviewViewModel.LLILLJJLI = Pair.copy$default(reviewViewModel.LLILLJJLI, null, Integer.valueOf(awS148S0201000_27.i2), 1, null);
            ReviewViewModel reviewViewModel2 = (ReviewViewModel) awS148S0201000_27.l0;
            int orderType = ((SortItem) awS148S0201000_27.l1).getOrderType();
            reviewViewModel2.getClass();
            C1022620cia.LIZ("ReviewVM", "loadReviews: start");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(reviewViewModel2), null, null, new C1844030y5R(reviewViewModel2, orderType, null), 3);
            C1002170cBb c1002170cBbXQ2 = ((ReviewViewModel) awS148S0201000_27.l0).xQ2();
            if (c1002170cBbXQ2 != null) {
                c1002170cBbXQ2.logAd(C1850450yFn.LIZ);
            }
        } else {
            C0P0T first = ((ReviewViewModel) awS148S0201000_27.l0).LLILLJJLI.getFirst();
            if (first != null) {
                first.dismiss();
            }
        }
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS148S0201000_27 awS148S0201000_27) {
        C786410Ut5.LJLLLLLL(8, (View) awS148S0201000_27.l0);
        C1836680xta c1836680xta = (C1836680xta) awS148S0201000_27.l1;
        c1836680xta.LLIZ = false;
        c1836680xta.LLILZ = awS148S0201000_27.i2;
        c1836680xta.LLILZLL = 0;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0201000_27(int i, ReviewViewModel reviewViewModel, SortItem sortItem, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = reviewViewModel;
        this.l1 = sortItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0201000_27(View view, C1836680xta c1836680xta, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.l1 = c1836680xta;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0201000_27(AdFastScrollServiceImpl adFastScrollServiceImpl, int i, Aweme aweme, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = adFastScrollServiceImpl;
        this.i2 = i;
        this.l1 = aweme;
    }
}
