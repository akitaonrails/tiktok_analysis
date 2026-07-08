package kotlin.jvm.internal;

import X.C09AY;
import X.C0TU5;
import X.C1423920n9q;
import X.C1624320sN4;
import X.C1624330sN5;
import X.C1624340sN6;
import X.C1626480sQY;
import X.C1626680sQs;
import X.C1628850sUN;
import X.C1637060shc;
import X.C1655810tBr;
import X.C1655860tBw;
import X.C1655870tBx;
import X.C19670811xi;
import X.C2173271A3p;
import X.EnumC1641420soe;
import android.content.Context;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.trill.feedback.CSPFragment;
import com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS147S0201000_25 extends C09AY implements Function0 {
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS147S0201000_25 awS147S0201000_25) {
        CSPComposeViewModel cSPComposeViewModel = (CSPComposeViewModel) awS147S0201000_25.l0;
        Context context = (Context) awS147S0201000_25.l1;
        cSPComposeViewModel.getClass();
        cSPComposeViewModel.withState(new AwS604S0100000_25(context, 944));
        C0TU5 c0tu5 = C0TU5.LIZ;
        int i = awS147S0201000_25.i2;
        c0tu5.getClass();
        C0TU5.LIZIZ(i);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS147S0201000_25 awS147S0201000_25) {
        ((C1423920n9q) awS147S0201000_25.l0).LIZIZ.invoke((TemplateSearchTrendingItem) awS147S0201000_25.l1, Integer.valueOf(awS147S0201000_25.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS147S0201000_25 awS147S0201000_25) {
        int i;
        C1624330sN5 value = ((C1624340sN6) awS147S0201000_25.l0).LIZIZ.getValue();
        if (value != null) {
            i = value.LIZIZ;
        } else {
            i = -1;
        }
        if (i != awS147S0201000_25.i2) {
            ((C1624340sN6) awS147S0201000_25.l0).LIZ.setValue((Effect) awS147S0201000_25.l1);
            C1624330sN5 value2 = ((C1624340sN6) awS147S0201000_25.l0).LIZIZ.getValue();
            if (value2 == null) {
                value2 = new C1624330sN5(0);
            }
            C1624330sN5 c1624330sN5 = new C1624330sN5((Effect) awS147S0201000_25.l1, awS147S0201000_25.i2);
            ((C1624340sN6) awS147S0201000_25.l0).LIZIZ.setValue(c1624330sN5);
            ((C1624340sN6) awS147S0201000_25.l0).LIZLLL.setValue(new C1624320sN4(value2, c1624330sN5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS147S0201000_25 awS147S0201000_25) {
        ((Function2) awS147S0201000_25.l0).invoke((EffectCategoryModel) awS147S0201000_25.l1, Integer.valueOf(awS147S0201000_25.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS147S0201000_25 awS147S0201000_25) {
        ((C1423920n9q) awS147S0201000_25.l0).LIZ.invoke((TemplateSearchTrendingItem) awS147S0201000_25.l1, Integer.valueOf(awS147S0201000_25.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS147S0201000_25 awS147S0201000_25) {
        ((Function1) awS147S0201000_25.l0).invoke(1);
        ((C2173271A3p) awS147S0201000_25.l1).LJIIJJI(awS147S0201000_25.i2, false);
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AwS147S0201000_25 awS147S0201000_25) {
        ((Function0) awS147S0201000_25.l0).invoke();
        ((C2173271A3p) awS147S0201000_25.l1).LJIIJJI(awS147S0201000_25.i2, false);
        return Boolean.TRUE;
    }

    public static final Object invoke$5(AwS147S0201000_25 awS147S0201000_25) {
        ((Function1) awS147S0201000_25.l0).invoke(1);
        ((C2173271A3p) awS147S0201000_25.l1).LJIIJJI(awS147S0201000_25.i2, false);
        return Boolean.TRUE;
    }

    public static final Object invoke$6(AwS147S0201000_25 awS147S0201000_25) {
        ((Function0) awS147S0201000_25.l0).invoke();
        ((C2173271A3p) awS147S0201000_25.l1).LJIIJJI(awS147S0201000_25.i2, false);
        return Boolean.TRUE;
    }

    public static final Object invoke$7(AwS147S0201000_25 awS147S0201000_25) {
        C1637060shc c1637060shc = ((C1628850sUN) awS147S0201000_25.l0).LLJILLL;
        if (c1637060shc != null) {
            int i = awS147S0201000_25.i2;
            C19670811xi c19670811xi = c1637060shc.LJI;
            if (c19670811xi == null) {
                c19670811xi = null;
            }
            c19670811xi.setProgress(i);
        }
        ((C1628850sUN) awS147S0201000_25.l0).m3((Effect) awS147S0201000_25.l1, EnumC1641420soe.DOWNLOADING, Integer.valueOf(awS147S0201000_25.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS147S0201000_25 awS147S0201000_25) {
        C1626680sQs c1626680sQs = (C1626680sQs) awS147S0201000_25.l0;
        Effect effect = (Effect) awS147S0201000_25.l1;
        int i = awS147S0201000_25.i2;
        if (effect != null) {
            C1626480sQY c1626480sQY = c1626680sQs.LL;
            c1626480sQY.w2(effect, new AwS62S0301000_25(c1626480sQY, effect, effect, i, 17));
        } else {
            c1626680sQs.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS147S0201000_25 awS147S0201000_25) {
        CSPComposeViewModel cSPComposeViewModel = (CSPComposeViewModel) awS147S0201000_25.l0;
        Context contextRequireContext = ((CSPFragment) awS147S0201000_25.l1).requireContext();
        cSPComposeViewModel.getClass();
        cSPComposeViewModel.withState(new AwS604S0100000_25(contextRequireContext, 944));
        C0TU5 c0tu5 = C0TU5.LIZ;
        int i = awS147S0201000_25.i2;
        c0tu5.getClass();
        C0TU5.LIZIZ(i);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(int i, Context context, CSPComposeViewModel cSPComposeViewModel, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = cSPComposeViewModel;
        this.l1 = context;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(int i, CSPFragment cSPFragment, CSPComposeViewModel cSPComposeViewModel, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = cSPComposeViewModel;
        this.l1 = cSPFragment;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1423920n9q c1423920n9q, TemplateSearchTrendingItem templateSearchTrendingItem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1423920n9q;
        this.l1 = templateSearchTrendingItem;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1624340sN6 c1624340sN6, int i, Effect effect, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1624340sN6;
        this.i2 = i;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1626680sQs c1626680sQs, Effect effect, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1626680sQs;
        this.l1 = effect;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1628850sUN c1628850sUN, int i, Effect effect, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1628850sUN;
        this.i2 = i;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1655810tBr c1655810tBr, C2173271A3p c2173271A3p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1655810tBr;
        this.l1 = c2173271A3p;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1655860tBw c1655860tBw, C2173271A3p c2173271A3p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1655860tBw;
        this.l1 = c2173271A3p;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS147S0201000_25(C1655870tBx c1655870tBx, C2173271A3p c2173271A3p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1655870tBx;
        this.l1 = c2173271A3p;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS147S0201000_25(Function2 function2, Function2<? super EffectCategoryModel, ? super Integer, Unit> function22, EffectCategoryModel effectCategoryModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = function2;
        this.l1 = function22;
        this.i2 = effectCategoryModel;
    }
}
