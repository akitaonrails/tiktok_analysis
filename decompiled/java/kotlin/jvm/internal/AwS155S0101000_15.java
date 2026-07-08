package kotlin.jvm.internal;

import X.C09AY;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915980Zwa;
import X.C917510Zz3;
import X.C946690ak7;
import X.C948720anO;
import X.C953610avH;
import X.C953620avI;
import X.C986720bmg;
import X.InterfaceC491601vm;
import X.ViewOnClickListenerC986770bml;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS155S0101000_15 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS155S0101000_15 awS155S0101000_15) {
        ((MultiLiveSettingDialog) awS155S0101000_15.l0).hS(awS155S0101000_15.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS155S0101000_15 awS155S0101000_15) {
        if (awS155S0101000_15.i1 == 0) {
            C915980Zwa.LJII().LJIJJ().size();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS155S0101000_15 awS155S0101000_15) {
        ((MultiMatchAnchorWidget) awS155S0101000_15.l0).O1(awS155S0101000_15.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS155S0101000_15 awS155S0101000_15) {
        ((C986720bmg) awS155S0101000_15.l0).n0(awS155S0101000_15.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS155S0101000_15 awS155S0101000_15) {
        if (awS155S0101000_15.i1 >= 2) {
            C946690ak7 c946690ak7 = (C946690ak7) awS155S0101000_15.l0;
            if (!c946690ak7.LJIIIZ) {
                c946690ak7.LJI();
            }
        } else {
            C946690ak7 c946690ak72 = (C946690ak7) awS155S0101000_15.l0;
            if (c946690ak72.LJIIIZ) {
                c946690ak72.LJ();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS155S0101000_15 awS155S0101000_15) {
        if (((C948720anO) awS155S0101000_15.l0).LLILZ.getMeasuredHeight() > 0) {
            ViewGroup.LayoutParams layoutParams = ((C948720anO) awS155S0101000_15.l0).LJJI().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = awS155S0101000_15.i1 - iLIZIZ;
                if (i < 0) {
                    i = 0;
                }
                marginLayoutParams.topMargin = i;
                marginLayoutParams.height = iLIZIZ;
                C786410Ut5.a6(((C948720anO) awS155S0101000_15.l0).LJJI(), layoutParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS155S0101000_15 awS155S0101000_15) {
        C953620avI.LJIILIIL(awS155S0101000_15.i1, ((C953610avH) awS155S0101000_15.l0).LJIILL);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS155S0101000_15 awS155S0101000_15) {
        ((InterfaceC491601vm) awS155S0101000_15.l0).LJIJJLI(awS155S0101000_15.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS155S0101000_15 awS155S0101000_15) {
        C917510Zz3.LIZIZ();
        ((MultiLiveAsAnchorListDialogV2) awS155S0101000_15.l0).LLII(awS155S0101000_15.i1);
        ((MultiLiveAsAnchorListDialogV2) awS155S0101000_15.l0).r = true;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(int i, C946690ak7 c946690ak7, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c946690ak7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(int i, ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = viewOnClickListenerC986770bml;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(int i, MultiLiveSettingDialog multiLiveSettingDialog, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiLiveSettingDialog;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(int i, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiLiveAsAnchorListDialogV2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(InterfaceC491601vm interfaceC491601vm, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC491601vm;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(C948720anO c948720anO, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c948720anO;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(C953610avH c953610avH, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c953610avH;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(C986720bmg c986720bmg, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c986720bmg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0101000_15(MultiMatchAnchorWidget multiMatchAnchorWidget, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiMatchAnchorWidget;
        this.i1 = i;
    }
}
