package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1674230tfZ;
import X.C19EG;
import X.C20656615sK;
import X.C259800zU;
import X.C341440Da2;
import X.C745860TNo;
import X.EnumC745880TNq;
import X.InterfaceC1680500tpg;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS0S0701000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

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

    public static final Object invoke$0(AwS0S0701000_12 awS0S0701000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1674230tfZ) awS0S0701000_12.l0).LIZJ((Context) awS0S0701000_12.l1, (AdFreeTrialPageInfo) awS0S0701000_12.l2, (EnumC745880TNq) awS0S0701000_12.l3, (C20656615sK) awS0S0701000_12.l4, (Function0) awS0S0701000_12.l5, (Function0) awS0S0701000_12.l6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0701000_12.i7 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0701000_12 awS0S0701000_12, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            SubscriptionNotificationPrompt.LLILZLL.LIZJ((Activity) awS0S0701000_12.l0, (AdFreeTrialPageInfo) awS0S0701000_12.l1, (EnumC745880TNq) awS0S0701000_12.l2, (C20656615sK) awS0S0701000_12.l3, new AwS556S0100000_12((C259800zU) awS0S0701000_12.l4, (C259800zU<TuxSheet>) 351), new C745860TNo((Activity) awS0S0701000_12.l0, (ProductInfo) awS0S0701000_12.l5, (EnumC745880TNq) awS0S0701000_12.l2, awS0S0701000_12.i7, (C259800zU) awS0S0701000_12.l4, (C20656615sK) awS0S0701000_12.l3, (C013C) awS0S0701000_12.l6), interfaceC1680500tpg, 1572864);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0701000_12(C1674230tfZ c1674230tfZ, C1674230tfZ c1674230tfZ2, Context context, AdFreeTrialPageInfo adFreeTrialPageInfo, EnumC745880TNq enumC745880TNq, C20656615sK c20656615sK, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1674230tfZ;
        this.l1 = c1674230tfZ2;
        this.l2 = context;
        this.l3 = adFreeTrialPageInfo;
        this.l4 = enumC745880TNq;
        this.l5 = c20656615sK;
        this.l6 = function0;
        this.i7 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0701000_12(C19EG c19eg, AdFreeTrialPageInfo adFreeTrialPageInfo, EnumC745880TNq enumC745880TNq, C20656615sK c20656615sK, C259800zU c259800zU, ProductInfo productInfo, int i, C013C c013c, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c19eg;
        this.l1 = adFreeTrialPageInfo;
        this.l2 = enumC745880TNq;
        this.l3 = c20656615sK;
        this.l4 = c259800zU;
        this.l5 = productInfo;
        this.i7 = i;
        this.l6 = c013c;
    }
}
