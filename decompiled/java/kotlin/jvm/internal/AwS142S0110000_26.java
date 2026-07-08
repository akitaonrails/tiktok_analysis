package kotlin.jvm.internal;

import X.C05XL;
import X.C09AY;
import X.C1716310ulR;
import X.C1753490vjP;
import X.C1754020vkG;
import X.C1771720wCo;
import X.C2188811AlT;
import X.EnumC1771290wC7;
import Y.ARunnableS40S0110000_21;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS142S0110000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS142S0110000_26 awS142S0110000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRELOAD_SWITCH source=");
        sbLIZ.append(((EnumC1771290wC7) awS142S0110000_26.l0).getValue());
        sbLIZ.append(" enable=");
        sbLIZ.append(awS142S0110000_26.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS142S0110000_26 awS142S0110000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PREREAD_SKIP_REQUEST reason=reuse_deferred usePreRead=");
        sbLIZ.append(awS142S0110000_26.z1);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode((C05XL) awS142S0110000_26.l0));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS142S0110000_26 awS142S0110000_26) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: (isPreload: ");
        sbLIZ.append(awS142S0110000_26.z1);
        sbLIZ.append("), (hasInit: ");
        if (((C1771720wCo) awS142S0110000_26.l0).LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS142S0110000_26 awS142S0110000_26) {
        if (awS142S0110000_26.z1) {
            C1753490vjP c1753490vjP = (C1753490vjP) awS142S0110000_26.l0;
            CardView cardView = c1753490vjP.LJIIIIZZ;
            if (cardView == null) {
                return c1753490vjP.LJII;
            }
            return cardView;
        }
        return null;
    }

    public static final Object invoke$4(AwS142S0110000_26 awS142S0110000_26) {
        String str;
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapZR = ((QrCodeFragment) awS142S0110000_26.l0).ZR();
        boolean z = awS142S0110000_26.z1;
        QrCodeFragment qrCodeFragment = (QrCodeFragment) awS142S0110000_26.l0;
        if (z) {
            str = "save";
        } else {
            str = "share";
        }
        mapZR.put("obj_id", str);
        mapZR.put("click_cost", String.valueOf(System.currentTimeMillis() - qrCodeFragment.LLJZ));
        mapZR.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_object_click", mapZR);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS142S0110000_26 awS142S0110000_26) {
        String str;
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapZR = ((QrCodeFragment) awS142S0110000_26.l0).ZR();
        boolean z = awS142S0110000_26.z1;
        QrCodeFragment qrCodeFragment = (QrCodeFragment) awS142S0110000_26.l0;
        if (z) {
            str = "save";
        } else {
            str = "share";
        }
        mapZR.put("obj_id", str);
        mapZR.put("click_cost", String.valueOf(System.currentTimeMillis() - qrCodeFragment.LLJZ));
        mapZR.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_object_click", mapZR);
        QrCodeFragment qrCodeFragment2 = (QrCodeFragment) awS142S0110000_26.l0;
        View view = qrCodeFragment2.LLJL;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS40S0110000_21(qrCodeFragment2, awS142S0110000_26.z1, 1), 300L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS142S0110000_26 awS142S0110000_26) {
        if (awS142S0110000_26.z1) {
            C1754020vkG c1754020vkG = (C1754020vkG) awS142S0110000_26.l0;
            CardView cardView = c1754020vkG.LJIIJ;
            if (cardView == null) {
                return c1754020vkG.LJIIIIZZ;
            }
            return cardView;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(C1771720wCo c1771720wCo, int i) {
        super(0);
        this.$t = i;
        this.z1 = false;
        this.l0 = c1771720wCo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(C05XL c05xl, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c05xl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(EnumC1771290wC7 enumC1771290wC7, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC1771290wC7;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(QrCodeFragment qrCodeFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = qrCodeFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(boolean z, C1753490vjP c1753490vjP, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1753490vjP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0110000_26(boolean z, C1754020vkG c1754020vkG, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1754020vkG;
    }
}
