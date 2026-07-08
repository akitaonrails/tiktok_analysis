package kotlin.jvm.internal;

import X.AbstractC842530X3j;
import X.C09AY;
import X.C09JN;
import X.C0X0P;
import X.C11NZ;
import X.C12GJ;
import X.C12GK;
import X.C12TH;
import X.C13LP;
import X.C19354410nm;
import X.C19400410vC;
import X.C19564111gV;
import X.C2225551C8r;
import X.C786410Ut5;
import X.C842540X3k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.libcore.network.IExploreApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class AwS167S0101000_29 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS167S0101000_29 awS167S0101000_29) {
        C11NZ<String> c11nzReportSampled;
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("Content-Type, application/json"), C786410Ut5.J3(new JSONObject().put("explore_type", awS167S0101000_29.i1)));
        ((C19354410nm) awS167S0101000_29.l0).getClass();
        IExploreApi iExploreApi = (IExploreApi) C19354410nm.LIZ.getValue();
        if (iExploreApi != null && (c11nzReportSampled = iExploreApi.reportSampled(c842540X3kLIZJ, C2225551C8r.LIZLLL.invoke())) != null) {
            c11nzReportSampled.LJJLL(new C09JN<String>() { // from class: X.0uML
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(String str) {
                    C1C7U.LIZ("IExploreApi$Companion@8074.reportSampled$1$dispose$1");
                    C1C7U.LIZIZ("IExploreApi$Companion@8074.reportSampled$1$dispose$1");
                }
            }, new C09JN<Throwable>() { // from class: X.0uMM
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Throwable th) {
                    C1C7U.LIZ("IExploreApi$Companion@8074.reportSampled$1$dispose$2");
                    C1C7U.LIZIZ("IExploreApi$Companion@8074.reportSampled$1$dispose$2");
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS167S0101000_29 awS167S0101000_29) {
        ((C12GK) awS167S0101000_29.l0).LLLIL(awS167S0101000_29.i1, true, true, true);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS167S0101000_29 awS167S0101000_29) {
        ((Function1) awS167S0101000_29.l0).invoke(Integer.valueOf(awS167S0101000_29.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS167S0101000_29 awS167S0101000_29) {
        ((Function1) awS167S0101000_29.l0).invoke(Integer.valueOf(awS167S0101000_29.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS167S0101000_29 awS167S0101000_29) {
        ((TuxTextView) awS167S0101000_29.l0).getLayoutParams().width = awS167S0101000_29.i1;
        ((TuxTextView) awS167S0101000_29.l0).requestLayout();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS167S0101000_29 awS167S0101000_29) {
        ((TuxTextView) awS167S0101000_29.l0).getLayoutParams().width = awS167S0101000_29.i1;
        C786410Ut5.LLLLZLL((TuxTextView) awS167S0101000_29.l0, 0);
        ((TuxTextView) awS167S0101000_29.l0).requestLayout();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS167S0101000_29 awS167S0101000_29) {
        return C13LP.LJJJLZIJ(awS167S0101000_29.i1, ((C19564111gV) awS167S0101000_29.l0).LLIZLLLIL);
    }

    public static final Object invoke$2(AwS167S0101000_29 awS167S0101000_29) {
        ((C12GK) awS167S0101000_29.l0).LLLIL(awS167S0101000_29.i1, true, true, false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS167S0101000_29 awS167S0101000_29) {
        ((C12GK) awS167S0101000_29.l0).LLLIL(awS167S0101000_29.i1, true, true, true);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS167S0101000_29 awS167S0101000_29) {
        int size = View.MeasureSpec.getSize(awS167S0101000_29.i1);
        C12TH c12th = (C12TH) awS167S0101000_29.l0;
        if (size == 0) {
            size = c12th.getScreenWidth();
        }
        return Integer.valueOf(size);
    }

    public static final Object invoke$5(AwS167S0101000_29 awS167S0101000_29) {
        C19400410vC c19400410vC = (C19400410vC) awS167S0101000_29.l0;
        ListProtector.remove(c19400410vC.LLILLL, awS167S0101000_29.i1);
        c19400410vC.notifyDataSetChanged();
        c19400410vC.LLILLJJLI.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS167S0101000_29 awS167S0101000_29) {
        ((TuxTextView) awS167S0101000_29.l0).getLayoutParams().width = awS167S0101000_29.i1;
        ((TuxTextView) awS167S0101000_29.l0).requestLayout();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS167S0101000_29 awS167S0101000_29) {
        ((TuxTextView) awS167S0101000_29.l0).getLayoutParams().width = awS167S0101000_29.i1;
        C786410Ut5.LLLLZLL((TuxTextView) awS167S0101000_29.l0, 0);
        ((TuxTextView) awS167S0101000_29.l0).requestLayout();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS167S0101000_29 awS167S0101000_29) {
        ((Function1) awS167S0101000_29.l0).invoke(Integer.valueOf(awS167S0101000_29.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS167S0101000_29 awS167S0101000_29) {
        ((Function1) awS167S0101000_29.l0).invoke(Integer.valueOf(awS167S0101000_29.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(C19354410nm c19354410nm, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19354410nm;
        this.i1 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(int i, C12GJ c12gj, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c12gj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(int i, C12GK c12gk, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c12gk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(int i, C12TH c12th, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c12th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(int i, Function1 function1, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(C19400410vC c19400410vC, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c19400410vC;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S0101000_29(C19564111gV c19564111gV, C19564111gV<RecyclerView.ViewHolder> c19564111gV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19564111gV;
        this.i1 = c19564111gV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S0101000_29(TuxTextView tuxTextView, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tuxTextView;
        this.i1 = i;
    }
}
