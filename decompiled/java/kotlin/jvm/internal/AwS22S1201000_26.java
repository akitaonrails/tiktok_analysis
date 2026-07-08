package kotlin.jvm.internal;

import X.C09AY;
import X.C1732020vAm;
import X.C1732390vBN;
import X.InterfaceC1731950vAf;
import X.InterfaceC1732650vBn;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS22S1201000_26 extends C09AY implements Function1 {
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
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S1201000_26 awS22S1201000_26, Object obj) {
        Object obj2;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> map = ((AddressEditViewModel) awS22S1201000_26.l1).LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("is_fullscreen", Integer.valueOf(((AddressEditViewModel) awS22S1201000_26.l1).LLLLLIL ? 1 : 0));
        laneParams.plusAssign("fill_type", ((AddressEditViewModel) awS22S1201000_26.l1).LLLLL.type());
        laneParams.plusAssign("page_name", ((AddressEditViewModel) awS22S1201000_26.l1).getPageName());
        HashMap<String, Object> map2 = ((AddressEditViewModel) awS22S1201000_26.l1).LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        String str2 = awS22S1201000_26.s0;
        if (str2 == null) {
            str2 = "";
        }
        laneParams.plusAssign("drop_down_list_name", str2);
        laneParams.plusAssign("item_num", Integer.valueOf(awS22S1201000_26.i3));
        if (Intrinsics.LJFF(awS22S1201000_26.s0, "address") && (str = ((CandInputDataOptions) awS22S1201000_26.l2).report) != null) {
            laneParams.plusAssign("sever_data_report", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S1201000_26 awS22S1201000_26, Object obj) {
        C1732390vBN c1732390vBN = C1732390vBN.LIZ;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS22S1201000_26.l1;
        String str = awS22S1201000_26.s0;
        int i = awS22S1201000_26.i3;
        c1732390vBN.getClass();
        C1732390vBN.LJIILL(interfaceC497601wk, str, i, null, false);
        ((InterfaceC1732650vBn) awS22S1201000_26.l2).LIZ("cancel effect fail");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S1201000_26 awS22S1201000_26, Object obj) {
        C1732020vAm c1732020vAm = C1732020vAm.LIZ;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS22S1201000_26.l1;
        String str = awS22S1201000_26.s0;
        int i = awS22S1201000_26.i3;
        c1732020vAm.getClass();
        C1732020vAm.LJIILLIIL(interfaceC497601wk, str, i, null, false);
        ((InterfaceC1731950vAf) awS22S1201000_26.l2).LIZ("cancel effect fail");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1201000_26(InterfaceC497601wk interfaceC497601wk, String str, int i, InterfaceC1731950vAf interfaceC1731950vAf, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC497601wk;
        this.s0 = str;
        this.i3 = i;
        this.l2 = interfaceC1731950vAf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1201000_26(InterfaceC497601wk interfaceC497601wk, String str, int i, InterfaceC1732650vBn interfaceC1732650vBn, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC497601wk;
        this.s0 = str;
        this.i3 = i;
        this.l2 = interfaceC1732650vBn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1201000_26(AddressEditViewModel addressEditViewModel, String str, int i, CandInputDataOptions candInputDataOptions, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = addressEditViewModel;
        this.s0 = str;
        this.i3 = i;
        this.l2 = candInputDataOptions;
    }
}
