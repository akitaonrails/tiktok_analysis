package kotlin.jvm.internal;

import X.C09AY;
import X.C0LHA;
import X.C1688680u2s;
import X.C19712912At;
import X.C201955140j;
import X.C2188811AlT;
import X.C564020MAe;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class AwS1S0230000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS1S0230000_8 awS1S0230000_8) {
        Context context = (Context) awS1S0230000_8.l0;
        Intent intent = (Intent) awS1S0230000_8.l1;
        boolean z = awS1S0230000_8.z4;
        boolean z2 = awS1S0230000_8.z2;
        boolean z3 = awS1S0230000_8.z3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        sbLIZ.append(z);
        sbLIZ.append(",clearOld:");
        sbLIZ.append(z2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        boolean zLIZ = C0LHA.LIZ(intent).LIZ(context, C1688680u2s.LIZIZ(intent));
        if (o.LJI() && z && zLIZ) {
            C1688680u2s.LJIIZILJ(context, intent);
            if (!z2 || !C1688680u2s.LJIJI(context, intent)) {
            }
            return Unit.LIZ;
        }
        if (C564020MAe.LIZIZ(intent, true, zLIZ)) {
            intent.setClass(context, VideoRecordPermissionActivity.class);
        } else {
            C1688680u2s.LJIIZILJ(context, intent);
        }
        C1688680u2s.LIZ(context, intent);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS1S0230000_8 awS1S0230000_8) {
        Activity activity = (Activity) awS1S0230000_8.l0;
        Intent intent = (Intent) awS1S0230000_8.l1;
        boolean z = awS1S0230000_8.z4;
        boolean z2 = awS1S0230000_8.z2;
        boolean z3 = awS1S0230000_8.z3;
        if (C1688680u2s.LJIILJJIL(intent)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unable to start activity,isAppBackground ");
            sbLIZ.append(C19712912At.LIZ.LIZJ());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
            sbLIZ2.append(z);
            sbLIZ2.append(",clearOld:");
            sbLIZ2.append(z2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            intent.putExtra("recreate_record_activity_support", z);
            intent.putExtra("recreate_record_and_clear", z2);
            intent.putExtra("navigate_back_to_main", z3);
            boolean zLIZ = C0LHA.LIZ(intent).LIZ(activity, C1688680u2s.LIZIZ(intent));
            if (o.LJI() && z && zLIZ) {
                C1688680u2s.LJIIZILJ(activity, intent);
                if (!z2 || !C1688680u2s.LJIJI(activity, intent)) {
                }
            } else if (C564020MAe.LIZIZ(intent, true, zLIZ)) {
                intent.setClass(activity, VideoRecordPermissionActivity.class);
            } else {
                C1688680u2s.LJIIZILJ(activity, intent);
            }
            C1688680u2s.LJIJJLI(activity, intent);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0230000_8(Activity activity, Intent intent, boolean z, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.l1 = intent;
        this.z4 = z;
        this.z2 = z2;
        this.z3 = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0230000_8(Context context, Intent intent, boolean z, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = intent;
        this.z4 = z;
        this.z2 = z2;
        this.z3 = z3;
    }
}
