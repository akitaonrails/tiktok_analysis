package kotlin.jvm.internal;

import X.C09AY;
import X.C1186970gzf;
import X.C1382705b7;
import X.EnumC1382405b4;
import X.InterfaceC1677030tk5;
import X.InterfaceC1690500u5o;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS27S0310000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS27S0310000_2 awS27S0310000_2, Object obj) {
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) awS27S0310000_2.l0;
        C1382705b7 c1382705b7 = new C1382705b7((EnumC1382405b4) obj, (InterfaceC1677030tk5) awS27S0310000_2.l1, awS27S0310000_2.z3, (Function1) awS27S0310000_2.l2);
        c1382705b7.LIZLLL = interfaceC1690500u5o;
        return c1382705b7;
    }

    public static final Object invoke$1(AwS27S0310000_2 awS27S0310000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiBaseBottomButtonsComponent) awS27S0310000_2.l0, new AwS57S0210000_2((PoiShopBookingInfo) awS27S0310000_2.l1, (C1186970gzf) awS27S0310000_2.l2, awS27S0310000_2.z3, 3));
        assembler.RQ2((PoiBaseBottomButtonsComponent) awS27S0310000_2.l0, AFwS229S0000000_2.get$arr$(455));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0310000_2(InterfaceC1677030tk5 interfaceC1677030tk5, InterfaceC1690500u5o interfaceC1690500u5o, Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1690500u5o;
        this.l1 = interfaceC1677030tk5;
        this.l2 = function1;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0310000_2(PoiBaseBottomButtonsComponent poiBaseBottomButtonsComponent, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiBaseBottomButtonsComponent;
        this.l1 = poiShopBookingInfo;
        this.l2 = c1186970gzf;
        this.z3 = z;
    }
}
