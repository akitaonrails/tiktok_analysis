package kotlin.jvm.internal;

import X.AbstractC1748750vbl;
import X.C04CK;
import X.C09AY;
import X.C1708220uYO;
import X.C1709880ub4;
import X.C1720070urV;
import X.C1720760usc;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C20248814Kw;
import X.C770702zh;
import X.C893803eS;
import X.InterfaceC1708270uYT;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import eha.a0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS28S1400000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S1400000_26 awS28S1400000_26, Object obj) {
        C1708220uYO c1708220uYO = (C1708220uYO) awS28S1400000_26.l1;
        Context context = (Context) awS28S1400000_26.l2;
        String str = awS28S1400000_26.s0;
        InterfaceC1708270uYT interfaceC1708270uYT = (InterfaceC1708270uYT) awS28S1400000_26.l3;
        Function1 function1 = (Function1) awS28S1400000_26.l4;
        c1708220uYO.getClass();
        C1708220uYO.LIZIZ(context, str, interfaceC1708270uYT, function1, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S1400000_26 awS28S1400000_26, Object obj) {
        Object obj2;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        String str2 = ((C1745680vWo) awS28S1400000_26.l1).LIZ.key;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        laneParams.plusAssign("input_box_name", str2);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        laneParams.plusAssign("stay_time", CardStruct.IStatusCode.DEFAULT);
        if (!Intrinsics.LJFF(((C1745680vWo) awS28S1400000_26.l1).LIZ.key, "address_searchbar")) {
            Integer num = ((C1745680vWo) awS28S1400000_26.l2).LJIIL;
            if (num != null && num.intValue() == 1) {
                str3 = "paste_fill";
            }
            laneParams.plusAssign("input_method", str3);
            laneParams.plusAssign("has_normal_input", C893803eS.LIZ(((a0) awS28S1400000_26.l3).LLJ));
            laneParams.plusAssign("has_auto_input", "1");
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            String str5 = ((C1745680vWo) awS28S1400000_26.l2).LIZ.key;
            c1746460vY4.getClass();
            laneParams.plusAssign("has_sug_input", C893803eS.LIZ(C1746460vY4.LIZJ(str5)));
            if (C1745310vWD.LIZ((C1745340vWG) awS28S1400000_26.l4)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("is_valid", obj2);
            AddressPageStarter.AddressEditEnterParams addressEditEnterParams = ((a0) awS28S1400000_26.l3).LLILLL.LLJJJIL;
            if (addressEditEnterParams != null && addressEditEnterParams.address != null) {
                str = "edit";
            } else {
                str = "add";
            }
            laneParams.plusAssign("fill_type", str);
            if (C770702zh.LIZIZ(((a0) awS28S1400000_26.l3).LLILLL.LLLI) && Intrinsics.LJFF(awS28S1400000_26.s0, ((a0) awS28S1400000_26.l3).LLILLL.LLLI)) {
                str4 = "1";
            }
            laneParams.plusAssign("is_same_auto", str4);
            Map<String, ? extends Object> mapLIZLLL = C1746460vY4.LIZLLL(((C1745680vWo) awS28S1400000_26.l2).LIZ.key);
            if (mapLIZLLL != null) {
                laneParams.withNotCheckParams(mapLIZLLL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S1400000_26 awS28S1400000_26, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS427S0200000_26((BaseWidgetDO) awS28S1400000_26.l1, (CardDO) awS28S1400000_26.l2, 69);
        C20248814Kw.LIZJ(c20248814Kw, true, true, 0.1f, 1, null, null, null, 112);
        C1720760usc c1720760usc = (C1720760usc) awS28S1400000_26.l3;
        CardDO cardDO = (CardDO) awS28S1400000_26.l2;
        c20248814Kw.LIZIZ(new C1720070urV((Fragment) awS28S1400000_26.l4, (BaseWidgetDO) awS28S1400000_26.l1, cardDO, c1720760usc, awS28S1400000_26.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS28S1400000_26 awS28S1400000_26, Object obj) {
        View view = (View) awS28S1400000_26.l1;
        ((AbstractC1748750vbl) awS28S1400000_26.l2).LJ(view, (Function1) awS28S1400000_26.l4, awS28S1400000_26.s0, (PageFinder) awS28S1400000_26.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1400000_26(C1708220uYO c1708220uYO, Context context, String str, C1709880ub4 c1709880ub4, AwS605S0100000_26 awS605S0100000_26, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1708220uYO;
        this.l2 = context;
        this.s0 = str;
        this.l3 = c1709880ub4;
        this.l4 = awS605S0100000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1400000_26(C1745680vWo c1745680vWo, C1745680vWo c1745680vWo2, a0 a0Var, C1745340vWG c1745340vWG, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1745680vWo;
        this.l2 = c1745680vWo2;
        this.l3 = a0Var;
        this.l4 = c1745340vWG;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1400000_26(View view, C04CK c04ck, String str, PageFinder pageFinder, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.l2 = c04ck;
        this.s0 = str;
        this.l3 = pageFinder;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1400000_26(Fragment fragment, BaseWidgetDO baseWidgetDO, CardDO cardDO, C1720760usc c1720760usc, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseWidgetDO;
        this.l2 = cardDO;
        this.l3 = c1720760usc;
        this.s0 = str;
        this.l4 = fragment;
    }
}
