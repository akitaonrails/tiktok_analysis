package kotlin.jvm.internal;

import X.C09AY;
import X.C0DQF;
import X.C1388240mEI;
import X.C1388250mEJ;
import X.C1845390y7d;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS3S1600000_21 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS3S1600000_21 awS3S1600000_21, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS3S1600000_21.l1);
        if (zBooleanValue) {
            C0DQF.LJ((View) awS3S1600000_21.l2, ((Activity) awS3S1600000_21.l3).getResources().getString(2131822518), null, null, true, 12);
            C1845390y7d.LIZIZ((Map) awS3S1600000_21.l4, awS3S1600000_21.s0, "download");
            C1388240mEI c1388240mEILIZ = C1388250mEJ.LIZ((BaseSharePackage) awS3S1600000_21.l5);
            if (c1388240mEILIZ != null) {
                c1388240mEILIZ.LIZ();
            }
            C1388250mEJ.LIZIZ((BaseSharePackage) awS3S1600000_21.l5);
            TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS3S1600000_21.l6;
            if (takoMultipleSelectVM != null) {
                takoMultipleSelectVM.AQ2();
            }
        } else {
            C0DQF.LJ((View) awS3S1600000_21.l2, ((Activity) awS3S1600000_21.l3).getResources().getString(2131822517), null, null, false, 28);
            C1845390y7d.LIZIZ((Map) awS3S1600000_21.l4, awS3S1600000_21.s0, "failure_process");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS3S1600000_21 awS3S1600000_21, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS3S1600000_21.l1);
        if (zBooleanValue) {
            C0DQF.LJ((View) awS3S1600000_21.l2, ((Activity) awS3S1600000_21.l3).getResources().getString(2131822518), null, null, true, 12);
            C1845390y7d.LIZIZ((Map) awS3S1600000_21.l4, awS3S1600000_21.s0, "download");
            C1388240mEI c1388240mEILIZ = C1388250mEJ.LIZ((BaseSharePackage) awS3S1600000_21.l5);
            if (c1388240mEILIZ != null) {
                c1388240mEILIZ.LIZ();
            }
            C1388250mEJ.LIZIZ((BaseSharePackage) awS3S1600000_21.l5);
            TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS3S1600000_21.l6;
            if (takoMultipleSelectVM != null) {
                takoMultipleSelectVM.AQ2();
            }
        } else {
            C0DQF.LJ((View) awS3S1600000_21.l2, ((Activity) awS3S1600000_21.l3).getResources().getString(2131822517), null, null, false, 28);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S1600000_21(DialogC1389620mGW dialogC1389620mGW, DialogC1389620mGW dialogC1389620mGW2, View view, Activity activity, Map<String, String> map, String str, BaseSharePackage baseSharePackage, TakoMultipleSelectVM takoMultipleSelectVM) {
        super(2);
        this.$t = takoMultipleSelectVM;
        this.l1 = dialogC1389620mGW;
        this.l2 = dialogC1389620mGW2;
        this.l3 = view;
        this.l4 = activity;
        this.s0 = map;
        this.l5 = str;
        this.l6 = baseSharePackage;
    }
}
