package kotlin.jvm.internal;

import X.C09AY;
import X.C19208510Ct;
import X.C903320ZcA;
import X.EnumC19301010fA;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS79S0210000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS79S0210000_28 awS79S0210000_28, Object obj) {
        if (awS79S0210000_28.z2) {
            C19208510Ct c19208510Ct = (C19208510Ct) awS79S0210000_28.l0;
            Context context = (Context) awS79S0210000_28.l1;
            c19208510Ct.getClass();
            C19208510Ct.LIZJ(context);
        } else {
            IIMErrorUtils.LIZ.getClass();
            IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
            if (iIMErrorUtilsLIZ != null) {
                iIMErrorUtilsLIZ.LIZIZ((Context) awS79S0210000_28.l1);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS79S0210000_28 awS79S0210000_28, Object obj) {
        if (awS79S0210000_28.z2) {
            ((AgeGateFragment) awS79S0210000_28.l0).ZR(null, null);
        }
        ((Function1) awS79S0210000_28.l1).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS79S0210000_28 awS79S0210000_28, Object obj) {
        if (awS79S0210000_28.z2) {
            AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment = (AgeGateCelebrationSettingFragment) awS79S0210000_28.l0;
            String str = AgeGateCelebrationSettingFragment._pnsPageId;
            ageGateCelebrationSettingFragment.iS(null, null);
        }
        ((Function1) awS79S0210000_28.l1).invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0210000_28(boolean z, C19208510Ct c19208510Ct, Context context, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c19208510Ct;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS79S0210000_28(boolean z, boolean z2, AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = ageGateCelebrationSettingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS79S0210000_28(boolean z, boolean z2, AgeGateFragment ageGateFragment, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = ageGateFragment;
    }
}
