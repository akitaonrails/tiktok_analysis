package kotlin.jvm.internal;

import X.C09AY;
import X.C1092360eX4;
import X.C1136400fg6;
import X.C1136410fg7;
import X.C1136560fgM;
import X.C2188811AlT;
import X.InterfaceC1135600feo;
import X.InterfaceC1136020ffU;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS44S0301000_17 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS44S0301000_17 awS44S0301000_17, Object obj) {
        ((C1136560fgM) awS44S0301000_17.l0).LIZJ().LJ(true, ((Boolean) obj).booleanValue(), false);
        C1136410fg7 c1136410fg7 = (C1136410fg7) awS44S0301000_17.l1;
        int i = awS44S0301000_17.i3;
        GiftMessage giftMessage = (GiftMessage) awS44S0301000_17.l2;
        C1136560fgM c1136560fgM = (C1136560fgM) awS44S0301000_17.l0;
        if (c1136410fg7.LJIIIIZZ(i)) {
            c1136410fg7.LJIIL(i, giftMessage);
        } else {
            c1136560fgM.LJIJ = 1002;
            c1136560fgM.LJIJI = "";
            InterfaceC1135600feo interfaceC1135600feo = c1136410fg7.LJ;
            if (interfaceC1135600feo != null) {
                interfaceC1135600feo.LIZJ(giftMessage, c1136560fgM, null);
            }
            c1136410fg7.LIZJ = false;
            c1136410fg7.LJIIIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S0301000_17 awS44S0301000_17, Object obj) {
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        ((C1136560fgM) awS44S0301000_17.l0).LIZJ().LJ(false, false, false);
        C1136410fg7 c1136410fg7 = (C1136410fg7) awS44S0301000_17.l1;
        int i = awS44S0301000_17.i3;
        GiftMessage giftMessage = (GiftMessage) awS44S0301000_17.l2;
        C1136560fgM c1136560fgM = (C1136560fgM) awS44S0301000_17.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadFacialAlgorithmModel onFailure by ");
        sbLIZ.append(message);
        c1136410fg7.LJIILIIL(i, giftMessage, c1136560fgM, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S0301000_17 awS44S0301000_17, Object obj) {
        C1092360eX4 c1092360eX4 = (C1092360eX4) awS44S0301000_17.l0;
        if (!c1092360eX4.LIZ) {
            c1092360eX4.LIZ = true;
            ((RecyclableWidgetManager) awS44S0301000_17.l1).load(awS44S0301000_17.i3, (Class) ((Pair) awS44S0301000_17.l2).getSecond());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S0301000_17 awS44S0301000_17, Object obj) {
        ((C1136560fgM) awS44S0301000_17.l0).LIZJ().LJ(true, ((Boolean) obj).booleanValue(), false);
        ((C1136400fg6) awS44S0301000_17.l1).LJIIZILJ(awS44S0301000_17.i3, (InterfaceC1136020ffU) awS44S0301000_17.l2, (C1136560fgM) awS44S0301000_17.l0, "dequeue_download");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS44S0301000_17 awS44S0301000_17, Object obj) {
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        ((C1136560fgM) awS44S0301000_17.l0).LIZJ().LJ(false, false, false);
        C1136400fg6 c1136400fg6 = (C1136400fg6) awS44S0301000_17.l1;
        int i = awS44S0301000_17.i3;
        InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) awS44S0301000_17.l2;
        C1136560fgM c1136560fgM = (C1136560fgM) awS44S0301000_17.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadFacialAlgorithmModel onFailure by ");
        sbLIZ.append(message);
        c1136400fg6.LJIILLIIL(i, interfaceC1136020ffU, c1136560fgM, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0301000_17(C1092360eX4 c1092360eX4, RecyclableWidgetManager recyclableWidgetManager, Pair pair, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1092360eX4;
        this.l1 = recyclableWidgetManager;
        this.i3 = R.id.wish_list_container;
        this.l2 = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0301000_17(int i, C1136400fg6 c1136400fg6, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1136560fgM;
        this.l1 = c1136400fg6;
        this.i3 = i;
        this.l2 = interfaceC1136020ffU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0301000_17(int i, C1136410fg7 c1136410fg7, GiftMessage giftMessage, C1136560fgM c1136560fgM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1136560fgM;
        this.l1 = c1136410fg7;
        this.i3 = i;
        this.l2 = giftMessage;
    }
}
