package kotlin.jvm.internal;

import X.C09AY;
import X.C0IRK;
import X.C1095930ecp;
import X.C1095940ecq;
import X.C1123170fKl;
import X.C1123190fKn;
import X.C1133910fc5;
import X.C1135810ff9;
import X.C1135920ffK;
import X.C118300cf;
import X.C2188811AlT;
import X.C780690Ujr;
import X.C786410Ut5;
import X.C938200aWQ;
import X.InterfaceC1103130eoR;
import X.InterfaceC1136020ffU;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftTrayWidgetV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveWelcomePackShortcutMaxClickTimes;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class AwS98S0210000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS98S0210000_17 awS98S0210000_17) {
        ((C1135920ffK) awS98S0210000_17.l0).LJJIIJZLJL((InterfaceC1136020ffU) awS98S0210000_17.l1, awS98S0210000_17.z2, false, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS98S0210000_17 awS98S0210000_17) {
        return ((C1135920ffK) awS98S0210000_17.l0).LIZJ((List) awS98S0210000_17.l1, awS98S0210000_17.z2);
    }

    public static final Object invoke$2(AwS98S0210000_17 awS98S0210000_17) throws JSONException {
        ((C1135920ffK) awS98S0210000_17.l0).LJFF((InterfaceC1136020ffU) awS98S0210000_17.l1, awS98S0210000_17.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS98S0210000_17 awS98S0210000_17) {
        Boolean bool;
        ViewParent parent;
        ViewGroup viewGroup;
        InterfaceC1103130eoR interfaceC1103130eoR = ((C1123190fKn) awS98S0210000_17.l0).LLILLJJLI;
        if (interfaceC1103130eoR != null) {
            interfaceC1103130eoR.LJI(true);
        }
        InterfaceC1103130eoR interfaceC1103130eoR2 = ((C1123190fKn) awS98S0210000_17.l0).LLILLJJLI;
        boolean zBooleanValue = false;
        if (interfaceC1103130eoR2 != null) {
            interfaceC1103130eoR2.setVisibility(0);
        }
        if (awS98S0210000_17.z2 && ((C118300cf) awS98S0210000_17.l1).element < LiveWelcomePackShortcutMaxClickTimes.getValue()) {
            C1123190fKn c1123190fKn = (C1123190fKn) awS98S0210000_17.l0;
            InterfaceC1103130eoR interfaceC1103130eoR3 = c1123190fKn.LLILLJJLI;
            DataChannel dataChannel = c1123190fKn.LLILLL;
            if (!c1123190fKn.LLJ) {
                c1123190fKn.LLJ = true;
                c1123190fKn.LLIZ = true;
                C1123170fKl c1123170fKl = (C1123170fKl) C0IRK.LIZIZ().LIZ(C1123190fKn.LIZ(dataChannel), C1123170fKl.class);
                c1123190fKn.LLILZIL = c1123170fKl;
                if (c1123170fKl == null) {
                    c1123190fKn.LLILZIL = new C1123170fKl(dataChannel, c1123190fKn.LL);
                } else {
                    c1123170fKl.LL = dataChannel;
                    if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    c1123170fKl.LLILZ = zBooleanValue;
                    c1123170fKl.LIZIZ();
                }
                C1123170fKl c1123170fKl2 = c1123190fKn.LLILZIL;
                ViewParent parent2 = null;
                if (c1123170fKl2 != null) {
                    parent = c1123170fKl2.getParent();
                } else {
                    parent = null;
                }
                if (parent instanceof ViewGroup) {
                    C1123170fKl c1123170fKl3 = c1123190fKn.LLILZIL;
                    if (c1123170fKl3 != null) {
                        parent2 = c1123170fKl3.getParent();
                    }
                    if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                        C786410Ut5.LJJJLZIJ(c1123190fKn.LLILZIL, viewGroup);
                    }
                }
                if (interfaceC1103130eoR3 != null) {
                    interfaceC1103130eoR3.addView(c1123190fKn.LLILZIL);
                    interfaceC1103130eoR3.LIZIZ();
                }
            }
        } else {
            C1123190fKn c1123190fKn2 = (C1123190fKn) awS98S0210000_17.l0;
            if (c1123190fKn2.LLIZLLLIL) {
                c1123190fKn2.LIZLLL(c1123190fKn2.LLILLL);
            }
            C1123190fKn c1123190fKn3 = (C1123190fKn) awS98S0210000_17.l0;
            if (c1123190fKn3.LLIZ) {
                c1123190fKn3.LJ(c1123190fKn3.LLILLL);
            }
            C1123190fKn c1123190fKn4 = (C1123190fKn) awS98S0210000_17.l0;
            c1123190fKn4.LIZIZ(c1123190fKn4.LLILLJJLI, c1123190fKn4.LLILLL, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS98S0210000_17 awS98S0210000_17) {
        if (!awS98S0210000_17.z2 || ((C938200aWQ) awS98S0210000_17.l0).LIZIZ != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post GiftTrayPositionChangeEvent scene = ");
            sbLIZ.append(((C938200aWQ) awS98S0210000_17.l0).LIZIZ);
            C1133910fc5.LJI("live_host_change", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = ((LiveGiftTrayWidgetV2) awS98S0210000_17.l1).dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(GiftTrayPositionChangeEvent.class, Boolean.valueOf(awS98S0210000_17.z2));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS98S0210000_17 awS98S0210000_17) {
        LinearLayout linearLayout = ((C1095940ecq) awS98S0210000_17.l0).LJIIL;
        int i = 0;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        ImageView imageView = (ImageView) awS98S0210000_17.l1;
        if (!awS98S0210000_17.z2) {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS98S0210000_17 awS98S0210000_17) {
        LinearLayout linearLayout = ((C1095930ecp) awS98S0210000_17.l0).LJJIJIIJIL;
        int i = 0;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        ImageView imageView = (ImageView) awS98S0210000_17.l1;
        if (!awS98S0210000_17.z2) {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(C1135920ffK c1135920ffK, InterfaceC1136020ffU interfaceC1136020ffU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1135920ffK;
        this.l1 = interfaceC1136020ffU;
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(C1095930ecp c1095930ecp, ImageView imageView, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1095930ecp;
        this.l1 = imageView;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(C1095940ecq c1095940ecq, ImageView imageView, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1095940ecq;
        this.l1 = imageView;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(C1123190fKn c1123190fKn, boolean z, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1123190fKn;
        this.z2 = z;
        this.l1 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(C1135920ffK c1135920ffK, InterfaceC1136020ffU interfaceC1136020ffU, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1135920ffK;
        this.l1 = interfaceC1136020ffU;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S0210000_17(C1135920ffK c1135920ffK, C1135920ffK c1135920ffK2, boolean z, List<C1135810ff9> list) {
        super(0);
        this.$t = list;
        this.l0 = c1135920ffK;
        this.z2 = c1135920ffK2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0210000_17(boolean z, C938200aWQ c938200aWQ, LiveGiftTrayWidgetV2 liveGiftTrayWidgetV2, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c938200aWQ;
        this.l1 = liveGiftTrayWidgetV2;
    }
}
