package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1623706Xj;
import X.C1713300uga;
import X.C1755690vmx;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS34S0102000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS34S0102000_26 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS34S0102000_26.invoke$0(kotlin.jvm.internal.AwS34S0102000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS34S0102000_26 awS34S0102000_26, Object obj) {
        String str;
        C1755690vmx c1755690vmx = (C1755690vmx) obj;
        List list = (List) awS34S0102000_26.l0;
        if (list != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        return C1755690vmx.LIZ(c1755690vmx, str, null, awS34S0102000_26.i1, 0, awS34S0102000_26.i2, false, 42);
    }

    public static final Object invoke$2(AwS34S0102000_26 awS34S0102000_26, Object obj) {
        C1713300uga c1713300uga = (C1713300uga) obj;
        if (Math.max(awS34S0102000_26.i1 - 5, 0) == awS34S0102000_26.i2 && !(c1713300uga.LLILZ instanceof C1623706Xj) && c1713300uga.LL != null) {
            RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) awS34S0102000_26.l0;
            recSwipeViewModel.a22(recSwipeViewModel.getEventType(), null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0102000_26(int i, int i2, RecSwipeViewModel recSwipeViewModel, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = recSwipeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0102000_26(int i, PdpHeadNavBarWidget pdpHeadNavBarWidget, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.l0 = pdpHeadNavBarWidget;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS34S0102000_26(List list, List<String> list2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.i1 = list2;
        this.i2 = i;
    }
}
