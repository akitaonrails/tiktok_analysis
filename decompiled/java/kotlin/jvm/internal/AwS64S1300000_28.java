package kotlin.jvm.internal;

import X.C09AY;
import X.C1892160zL4;
import X.C197039127h;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS64S1300000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS64S1300000_28 awS64S1300000_28, Object obj) {
        String str;
        FypCtaButton fypCtaButton = (FypCtaButton) obj;
        C1892160zL4 c1892160zL4 = C1892160zL4.LIZ;
        Context context = ((C197039127h) awS64S1300000_28.l1).getContext();
        Long l = (Long) awS64S1300000_28.l2;
        if (fypCtaButton != null) {
            str = fypCtaButton.linkUrl;
        } else {
            str = null;
        }
        String str2 = awS64S1300000_28.s0;
        Map<String, Object> map = ((EcProductAddButtonViewModel) awS64S1300000_28.l3).LLJ;
        c1892160zL4.getClass();
        C1892160zL4.LIZLLL(context, l, str, str2, map);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S1300000_28 awS64S1300000_28, Object obj) {
        String str;
        FypCtaButton fypCtaButton = (FypCtaButton) obj;
        C1892160zL4 c1892160zL4 = C1892160zL4.LIZ;
        Context context = ((C197039127h) awS64S1300000_28.l1).getContext();
        Long l = (Long) awS64S1300000_28.l2;
        if (fypCtaButton != null) {
            str = fypCtaButton.linkUrl;
        } else {
            str = null;
        }
        String str2 = awS64S1300000_28.s0;
        Map<String, Object> map = ((EcProductAddButtonViewModel) awS64S1300000_28.l3).LLJ;
        c1892160zL4.getClass();
        C1892160zL4.LIZLLL(context, l, str, str2, map);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S1300000_28(C197039127h c197039127h, EcProductAddButtonViewModel ecProductAddButtonViewModel, Long l, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c197039127h;
        this.l2 = l;
        this.s0 = str;
        this.l3 = ecProductAddButtonViewModel;
    }
}
