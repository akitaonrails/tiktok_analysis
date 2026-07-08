package kotlin.jvm.internal;

import X.C09AY;
import X.C927570aFH;
import X.EnumC930180aJU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS20S1201000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AwS20S1201000_15 awS20S1201000_15, Object obj) {
        MultiLiveSettingDialogContract$AbsView multiLiveSettingDialogContract$AbsView = (MultiLiveSettingDialogContract$AbsView) ((C927570aFH) awS20S1201000_15.l1).LL;
        if (multiLiveSettingDialogContract$AbsView != null) {
            multiLiveSettingDialogContract$AbsView.PR(awS20S1201000_15.s0, awS20S1201000_15.i3, (EnumC930180aJU) awS20S1201000_15.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S1201000_15 awS20S1201000_15, Object obj) {
        MultiLiveSettingDialogContract$AbsView multiLiveSettingDialogContract$AbsView = (MultiLiveSettingDialogContract$AbsView) ((C927570aFH) awS20S1201000_15.l1).LL;
        if (multiLiveSettingDialogContract$AbsView != null) {
            multiLiveSettingDialogContract$AbsView.PR(awS20S1201000_15.s0, awS20S1201000_15.i3, (EnumC930180aJU) awS20S1201000_15.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1201000_15(C927570aFH c927570aFH, String str, int i, EnumC930180aJU enumC930180aJU, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c927570aFH;
        this.s0 = str;
        this.i3 = i;
        this.l2 = enumC930180aJU;
    }
}
