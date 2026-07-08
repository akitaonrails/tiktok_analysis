package kotlin.jvm.internal;

import X.C09AY;
import X.C0DF0;
import X.C1391190mJ3;
import X.C343950De5;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AwS39S2200000_16 extends C09AY implements Function2 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS39S2200000_16 awS39S2200000_16, Object obj, Object obj2) {
        String str = (String) obj;
        View view = (View) obj2;
        String str2 = awS39S2200000_16.s0;
        if (!Intrinsics.LJFF(str2, "feed_sku_checkout") && Intrinsics.LJFF(str2, "iab_ai_pdp") && view != null) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(view, new C343950De5());
        }
        C0DF0.LIZ((Context) awS39S2200000_16.l2, (Aweme) awS39S2200000_16.l3, str, awS39S2200000_16.s1, "sku_checkout");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S2200000_16 awS39S2200000_16, Object obj, Object obj2) {
        String str = (String) obj;
        View view = (View) obj2;
        String str2 = awS39S2200000_16.s0;
        if (!Intrinsics.LJFF(str2, "feed_sku_checkout") && Intrinsics.LJFF(str2, "iab_ai_pdp") && view != null) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(view, new C343950De5());
        }
        C0DF0.LIZ((Context) awS39S2200000_16.l2, (Aweme) awS39S2200000_16.l3, str, awS39S2200000_16.s1, "sku_checkout");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S2200000_16(Context context, Aweme aweme, String str, String str2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l2 = context;
        this.s1 = str2;
        this.l3 = aweme;
    }
}
