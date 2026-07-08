package kotlin.jvm.internal;

import X.C09AY;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1741890vQh;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C842803Ra;
import X.C842903Rb;
import X.C911703hL;
import X.C921103ir;
import Y.ARunnableS1S2200000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsCashierEnableSeCodeSettings;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS2S3100000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        Context context = ((OrderSubmitFragment) awS2S3100000_1.l3).getContext();
        if (context == null) {
            return null;
        }
        String str = awS2S3100000_1.s0;
        String str2 = awS2S3100000_1.s1;
        String strLIZIZ = awS2S3100000_1.s2;
        OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) awS2S3100000_1.l3;
        if (C911703hL.LIZ(str)) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showPaymentErrorDialogAndClear useErrorCodeSdk: ");
            sbLIZ.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            C921103ir c921103ir = C921103ir.LIZ;
            if (str == null) {
                str = "";
            }
            c921103ir.getClass();
            C921103ir.LJFF(context, str, null);
        } else {
            if (PipoTtsCashierEnableSeCodeSettings.LIZ() && str2 != null) {
                String str3 = C842903Rb.LIZ().get(str2);
                if (str3 == null) {
                    if (strLIZIZ == null) {
                        C842803Ra.LIZ.getClass();
                        strLIZIZ = C842803Ra.LIZIZ(str2);
                    }
                } else {
                    strLIZIZ = str3;
                }
            } else if (strLIZIZ == null) {
                C842803Ra.LIZ.getClass();
                strLIZIZ = C842803Ra.LIZIZ(str2);
            }
            View view = orderSubmitFragment.getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS1S2200000_1(context, strLIZIZ, str2, orderSubmitFragment, 0));
            }
        }
        orderSubmitFragment.ZR().XQ2();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.putAll((LinkedHashMap) awS2S3100000_1.l3);
        map.put("page_name", awS2S3100000_1.s0);
        String str = awS2S3100000_1.s1;
        if (str != null) {
            map.put("previous_page", str);
        }
        String str2 = awS2S3100000_1.s2;
        if (str2 != null) {
            map.put("btm", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", awS2S3100000_1.s0);
        laneParams.plusAssign("action_type", awS2S3100000_1.s1);
        laneParams.withParamsGroup(((C1054004Ag) awS2S3100000_1.l3).LIZIZ);
        C1010603xI.LIZJ(laneParams, awS2S3100000_1.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS2S3100000_1.l3).LIZIZ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1010603xI.LIZ(awS2S3100000_1.s0);
        if (linkedHashMap.get("module_type") == null && (str2 = awS2S3100000_1.s1) != null) {
            laneParams.plusAssign("module_type", str2);
        }
        if (linkedHashMap.get("module_name") == null && (str = awS2S3100000_1.s2) != null) {
            laneParams.plusAssign("module_name", str);
        }
        C1010603xI.LIZJ(laneParams, awS2S3100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS2S3100000_1.l3).LIZIZ);
        laneParams.plusAssign("button_name", awS2S3100000_1.s0);
        laneParams.plusAssign("module_type", awS2S3100000_1.s1);
        String str = awS2S3100000_1.s2;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            Object obj2 = mapLJIIJ.get("module_type");
            if (obj2 != null) {
                laneParams.plusAssign("module_type", obj2);
            }
            Object obj3 = mapLJIIJ.get("button_name");
            if (obj3 != null) {
                laneParams.plusAssign("button_name", obj3);
            }
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS2S3100000_1 awS2S3100000_1, Object obj) {
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS2S3100000_1.l3).LIZIZ);
        laneParams.plusAssign("button_name", awS2S3100000_1.s0);
        laneParams.plusAssign("module_type", awS2S3100000_1.s1);
        laneParams.plusAssign("actionsheet_name", "algo_voucher");
        String str = awS2S3100000_1.s2;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            Object obj2 = mapLJIIJ.get("module_type");
            if (obj2 != null) {
                laneParams.plusAssign("module_type", obj2);
            }
            Object obj3 = mapLJIIJ.get("button_name");
            if (obj3 != null) {
                laneParams.plusAssign("button_name", obj3);
            }
            Object obj4 = mapLJIIJ.get("actionsheet_name");
            if (obj4 != null) {
                laneParams.plusAssign("actionsheet_name", obj4);
            }
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3100000_1(LinkedHashMap linkedHashMap, String str, int i) {
        super(1);
        this.$t = i;
        this.l3 = linkedHashMap;
        this.s0 = "order_submit";
        this.s1 = str;
        this.s2 = "a2270.b2768";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S3100000_1(X.C1054004Ag r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 2 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l3 = r3
            r1.s0 = r4
            r1.s1 = r5
            r1.s2 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.s0 = r4
            r1.s1 = r5
            r1.l3 = r3
            r1.s2 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S3100000_1.<init>(X.04Ag, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3100000_1(OrderSubmitFragment orderSubmitFragment, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = orderSubmitFragment;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
