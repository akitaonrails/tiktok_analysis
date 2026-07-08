package kotlin.jvm.internal;

import X.C09AY;
import X.C978750bZp;
import X.EnumC930180aJU;
import X.InterfaceC963450bB9;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS4S0420000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AwS4S0420000_15 awS4S0420000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            if (awS4S0420000_15.z4) {
                Function0 function0 = (Function0) awS4S0420000_15.l0;
                if (function0 != null) {
                    function0.invoke();
                }
                LayoutSettingContract.LJJJJJL((LayoutSettingContract) awS4S0420000_15.l1, (EnumC930180aJU) awS4S0420000_15.l2);
            } else {
                ((LayoutSettingContract) awS4S0420000_15.l1).LJJIJIL(awS4S0420000_15.z5, (EnumC930180aJU) awS4S0420000_15.l2, (Function0) awS4S0420000_15.l0, (Context) awS4S0420000_15.l3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0420000_15 awS4S0420000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            if (awS4S0420000_15.z4) {
                Function0 function0 = (Function0) awS4S0420000_15.l0;
                if (function0 != null) {
                    function0.invoke();
                }
                LayoutSettingContract.LJJJJJL((LayoutSettingContract) awS4S0420000_15.l1, (EnumC930180aJU) awS4S0420000_15.l2);
            } else {
                ((LayoutSettingContract) awS4S0420000_15.l1).LJJIJIL(awS4S0420000_15.z5, (EnumC930180aJU) awS4S0420000_15.l2, (Function0) awS4S0420000_15.l0, (Context) awS4S0420000_15.l3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S0420000_15 awS4S0420000_15, Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS4S0420000_15.l0;
        DataChannel dataChannel = (DataChannel) awS4S0420000_15.l1;
        boolean z = awS4S0420000_15.z4;
        boolean z2 = awS4S0420000_15.z5;
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(179);
        AFwS203S0000000_15 aFwS203S0000000_152 = AFwS203S0000000_15.get$arr$(180);
        InterfaceC963450bB9 interfaceC963450bB9 = (InterfaceC963450bB9) awS4S0420000_15.l2;
        return new UpRightIconViewModel(lifecycleOwner, dataChannel, z, z2, aFwS203S0000000_15, aFwS203S0000000_152, interfaceC963450bB9, null, false, new AwS97S0210000_15((C978750bZp) awS4S0420000_15.l3, z, interfaceC963450bB9, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0420000_15(LifecycleOwner lifecycleOwner, InterfaceC963450bB9 interfaceC963450bB9, C978750bZp c978750bZp, DataChannel dataChannel, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = dataChannel;
        this.z4 = z;
        this.z5 = z2;
        this.l2 = interfaceC963450bB9;
        this.l3 = c978750bZp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0420000_15(boolean z, boolean z2, Function0<Unit> function0, LayoutSettingContract layoutSettingContract, EnumC930180aJU enumC930180aJU, boolean z3, Context context) {
        super(1);
        this.$t = context;
        this.z4 = z;
        this.l0 = z2;
        this.l1 = function0;
        this.l2 = layoutSettingContract;
        this.z5 = enumC930180aJU;
        this.l3 = z3;
    }
}
