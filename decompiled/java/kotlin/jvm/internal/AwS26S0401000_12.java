package kotlin.jvm.internal;

import X.C09AY;
import X.C1667860tVI;
import X.C20656615sK;
import X.C259800zU;
import X.C341440Da2;
import X.DialogC1389620mGW;
import X.InterfaceC1680500tpg;
import android.app.Activity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS26S0401000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
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

    public static final Object invoke$0(AwS26S0401000_12 awS26S0401000_12, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            SubscriptionNotificationPrompt.LLILZLL.LIZLLL((Activity) awS26S0401000_12.l0, (AdFreeTrialPageInfo) awS26S0401000_12.l1, awS26S0401000_12.i4, (C20656615sK) awS26S0401000_12.l2, new AwS556S0100000_12((C259800zU) awS26S0401000_12.l3, (C259800zU<TuxSheet>) 352), interfaceC1680500tpg, 196608);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0401000_12 awS26S0401000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667860tVI.LIZJ((DialogC1389620mGW) awS26S0401000_12.l0, (Function0) awS26S0401000_12.l1, (Function0) awS26S0401000_12.l2, (ManagePageViewModel) awS26S0401000_12.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS26S0401000_12.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0401000_12(DialogC1389620mGW dialogC1389620mGW, DialogC1389620mGW dialogC1389620mGW2, Function0<Unit> function0, Function0<Unit> function02, ManagePageViewModel managePageViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = dialogC1389620mGW;
        this.l1 = dialogC1389620mGW2;
        this.l2 = function0;
        this.l3 = function02;
        this.i4 = managePageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0401000_12(Activity activity, Activity activity2, AdFreeTrialPageInfo adFreeTrialPageInfo, int i, C20656615sK c20656615sK, C259800zU<TuxSheet> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = activity;
        this.l1 = activity2;
        this.i4 = adFreeTrialPageInfo;
        this.l2 = i;
        this.l3 = c20656615sK;
    }
}
