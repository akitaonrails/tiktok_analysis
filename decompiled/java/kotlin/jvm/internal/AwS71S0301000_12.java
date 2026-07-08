package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0TQL;
import X.C0TQM;
import X.C0TQR;
import X.C0UV0;
import X.C0UV4;
import X.C11PQ;
import X.C127A;
import X.C20656615sK;
import X.C20684815ws;
import X.C2344009Gk;
import X.C781510UlB;
import X.C925090aBH;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import defpackage.AdvertiserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS71S0301000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS71S0301000_12 awS71S0301000_12) {
        int i;
        Integer num;
        if (awS71S0301000_12.i3 != 1) {
            ((Function0) awS71S0301000_12.l0).invoke();
            C20656615sK c20656615sK = (C20656615sK) awS71S0301000_12.l1;
            if (c20656615sK != null) {
                c20656615sK.LIZ();
            }
        } else {
            ComplianceServiceProvider.LJIILIIL().LJJIJL((Context) awS71S0301000_12.l2, "payment_success_page");
            ((Function0) awS71S0301000_12.l0).invoke();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "prompt_type");
            AdFreeSubscription adFreeSubscription = SubscriptionNotificationPrompt.LLJ;
            if (adFreeSubscription != null && (num = adFreeSubscription.subscriptionStatus) != null && num.intValue() == 2) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "content_type");
            c2344009Gk.LIZJ(1, "click_value");
            C20684815ws.LJIILLIIL("click_tt_plus_coldstart_reminder", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS71S0301000_12 awS71S0301000_12) {
        Activity activity = (Activity) awS71S0301000_12.l0;
        C0UV0.LiveResource.checkInstall(activity, "interact", new C0UV4(activity, awS71S0301000_12.i3, (Function1) awS71S0301000_12.l1, (Function0) awS71S0301000_12.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS71S0301000_12 awS71S0301000_12) {
        ((C013C) awS71S0301000_12.l0).element = true;
        int i = awS71S0301000_12.i3;
        if (i != 1) {
            if (i == 2) {
                ((C11PQ) awS71S0301000_12.l1).onNext(Unit.LIZ);
            }
        } else {
            ((C11PQ) awS71S0301000_12.l2).onNext(Unit.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$3(AwS71S0301000_12 awS71S0301000_12) {
        int i;
        if (!((C0TQM) awS71S0301000_12.l0).LLLIIIIL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(((C127A) awS71S0301000_12.l1).LJIILIIL() ? 1 : 0, "is_toggleable");
            C20684815ws.LJIILLIIL("toggle_choice", c2344009Gk.LIZ);
            ((C127A) awS71S0301000_12.l1).LJIILJJIL(!r1.LJIILIIL());
            AdvertiserModel advertiserModel = (AdvertiserModel) awS71S0301000_12.l2;
            if (((C127A) awS71S0301000_12.l1).LJIILIIL()) {
                i = 1;
            } else {
                i = 2;
            }
            advertiserModel.setAdvStatus(i);
            C0TQR<DATA> c0tqr = ((C0TQM) awS71S0301000_12.l0).LLILLL;
            if (c0tqr != 0) {
                c0tqr.LJJIFFI(awS71S0301000_12.i3, (AdvertiserModel) awS71S0301000_12.l2);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$4(AwS71S0301000_12 awS71S0301000_12) {
        int i;
        if (!((C0TQL) awS71S0301000_12.l0).LLLIIIIL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(((C127A) awS71S0301000_12.l1).LJIILIIL() ? 1 : 0, "is_toggleable");
            C20684815ws.LJIILLIIL("toggle_choice_disconnect", c2344009Gk.LIZ);
            ((C127A) awS71S0301000_12.l1).LJIILJJIL(!r1.LJIILIIL());
            AdvertiserModel advertiserModel = (AdvertiserModel) awS71S0301000_12.l2;
            if (((C127A) awS71S0301000_12.l1).LJIILIIL()) {
                i = 1;
            } else {
                i = 2;
            }
            advertiserModel.setAdvStatus(i);
            C0TQR<DATA> c0tqr = ((C0TQL) awS71S0301000_12.l0).LLILLL;
            if (c0tqr != 0) {
                c0tqr.LJJIFFI(awS71S0301000_12.i3, (AdvertiserModel) awS71S0301000_12.l2);
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$5(AwS71S0301000_12 awS71S0301000_12) {
        boolean z = C925090aBH.LIZ;
        Activity activity = (Activity) awS71S0301000_12.l0;
        int i = awS71S0301000_12.i3;
        Function1 function1 = (Function1) awS71S0301000_12.l1;
        C0UV0.LiveResource.checkInstall(activity, "interact", new C781510UlB(i, (Function0) awS71S0301000_12.l2, function1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0301000_12(int i, int i2, Function0<Unit> function0, C20656615sK c20656615sK, Context context) {
        super(0);
        this.$t = context;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = function0;
        this.l2 = c20656615sK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0301000_12(C013C c013c, C013C c013c2, int i, C11PQ<Unit> c11pq, C11PQ<Unit> c11pq2) {
        super(0);
        this.$t = c11pq2;
        this.l0 = c013c;
        this.i3 = c013c2;
        this.l1 = i;
        this.l2 = c11pq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0301000_12(C0TQL c0tql, C127A c127a, AdvertiserModel advertiserModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0tql;
        this.l1 = c127a;
        this.l2 = advertiserModel;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0301000_12(C0TQM c0tqm, C127A c127a, AdvertiserModel advertiserModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0tqm;
        this.l1 = c127a;
        this.l2 = advertiserModel;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0301000_12(Activity activity, Activity activity2, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = activity;
        this.i3 = activity2;
        this.l1 = i;
        this.l2 = function1;
    }
}
