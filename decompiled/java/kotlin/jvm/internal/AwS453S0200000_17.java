package kotlin.jvm.internal;

import X.AbstractC1110800f0o;
import X.AbstractC1113530f5D;
import X.C09AY;
import X.C1111000f18;
import X.C1111050f1D;
import X.C1111150f1N;
import X.C1113490f59;
import X.C1151400g4I;
import X.C1796560wqs;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS453S0200000_17 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS453S0200000_17(C1111050f1D c1111050f1D, C1111050f1D<MODEL> c1111050f1D2, MODEL model) {
        super(2);
        this.$t = model;
        this.l0 = c1111050f1D;
        this.l1 = c1111050f1D2;
    }

    public static final Object invoke$0(AwS453S0200000_17 awS453S0200000_17, Object obj, Object obj2) {
        ((RechargeBtnViewModel) awS453S0200000_17.l0).setState(new AwS383S0200000_17((C1151400g4I) awS453S0200000_17.l1, (C1796560wqs) obj2, 99));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS453S0200000_17 awS453S0200000_17, Object obj, Object obj2) {
        Function1 function1;
        if (!((Boolean) obj2).booleanValue() && (function1 = (Function1) awS453S0200000_17.l0) != null) {
            function1.invoke((SpannableStringBuilder) awS453S0200000_17.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS453S0200000_17 awS453S0200000_17, Object obj, Object obj2) {
        C1113490f59 c1113490f59;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = (List) obj;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2 = (List) obj2;
        AbstractC1113530f5D abstractC1113530f5D = ((C1111150f1N) awS453S0200000_17.l0).LLILZ;
        if ((abstractC1113530f5D instanceof C1113490f59) && (c1113490f59 = (C1113490f59) abstractC1113530f5D) != null) {
            c1113490f59.LJIIL((C1111000f18) awS453S0200000_17.l1, list, list2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS453S0200000_17 awS453S0200000_17, Object obj, Object obj2) {
        C1113490f59 c1113490f59;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = (List) obj;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2 = (List) obj2;
        AbstractC1113530f5D abstractC1113530f5D = ((C1111050f1D) awS453S0200000_17.l0).LLILZ;
        if ((abstractC1113530f5D instanceof C1113490f59) && (c1113490f59 = (C1113490f59) abstractC1113530f5D) != null) {
            c1113490f59.LJIIL((AbstractC1110800f0o) awS453S0200000_17.l1, list, list2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS453S0200000_17(C1111150f1N c1111150f1N, C1111000f18 c1111000f18, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1111150f1N;
        this.l1 = c1111000f18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS453S0200000_17(RechargeBtnViewModel rechargeBtnViewModel, C1151400g4I c1151400g4I, int i) {
        super(2);
        this.$t = i;
        this.l0 = rechargeBtnViewModel;
        this.l1 = c1151400g4I;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS453S0200000_17(Function1 function1, Function1<? super SpannableStringBuilder, Unit> function12, SpannableStringBuilder spannableStringBuilder) {
        super(2);
        this.$t = spannableStringBuilder;
        this.l0 = function1;
        this.l1 = function12;
    }
}
