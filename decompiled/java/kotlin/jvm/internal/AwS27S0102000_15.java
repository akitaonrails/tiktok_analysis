package kotlin.jvm.internal;

import X.C09AY;
import X.C931740aM0;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS27S0102000_15 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS27S0102000_15 awS27S0102000_15, Object obj) {
        ((LayoutSettingContract) awS27S0102000_15.l0).simpleLayoutDataSourceForV3.LJIIIIZZ();
        C931740aM0.LJII(awS27S0102000_15.i1, awS27S0102000_15.i2, "normal", "click", "change", ((LayoutSettingContract) awS27S0102000_15.l0).LJJIL());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0102000_15 awS27S0102000_15, Object obj) {
        ((LayoutSettingContract) awS27S0102000_15.l0).simpleLayoutDataSourceForV3.LJIIIIZZ();
        C931740aM0.LJII(awS27S0102000_15.i1, awS27S0102000_15.i2, "abnormal", "click", "change", ((LayoutSettingContract) awS27S0102000_15.l0).LJJIL());
        ((LayoutSettingContract) awS27S0102000_15.l0).LJJJJLI();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0102000_15(int i, int i2, LayoutSettingContract layoutSettingContract, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = layoutSettingContract;
        this.i1 = i;
        this.i2 = i2;
    }
}
