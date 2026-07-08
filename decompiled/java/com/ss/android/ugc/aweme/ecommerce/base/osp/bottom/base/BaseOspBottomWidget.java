package com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base;

import X.C01D1;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C948003nC;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class BaseOspBottomWidget extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public long LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseOspBottomWidget.class, "ospVM", "getOspVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseOspBottomWidget.class, "bottomVM", "getBottomVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BaseOspBottomWidget() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ, 112), AFwS228S0000000_1.get$arr$(63), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspBottomViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ2, 113), AFwS228S0000000_1.get$arr$(64), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.aku;
    }

    public final OspBottomViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (OspBottomViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        hp().AQ2(ip());
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_trigger_place_order_check", hp());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_trigger_place_order_check", hp());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        ModuleManager moduleManager;
        this.LLJJIJI = System.currentTimeMillis();
        super.xo();
        OspBottomViewModel ospBottomViewModelHp = hp();
        long j = this.LLJJIJI;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = ospBottomViewModelHp.LLILLL;
        if (orderSubmitAssemViewModel == null || (moduleManager = orderSubmitAssemViewModel.LLZIL) == null) {
            return;
        }
        moduleManager.LJIIJJI(System.currentTimeMillis() - j, "bottom_module");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C948003nC<Boolean> c948003nC = ip().getState().LLJLIL;
        if (c948003nC != null && c948003nC.LIZ.booleanValue() && !hp().LLILZLL) {
            hp().xQ2();
            hp().LLILZ = false;
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.03lk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJLIL;
            }
        }, null, new AwS615S0100000_1(this, 15), 6);
        C736680Sv4.LJIIIZ(this, ip(), new C2217371BqR() { // from class: X.03lg
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, new C2217381BqS() { // from class: X.03lh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLLLLL;
            }
        }, null, new AwS650S0100000_1(this, 1), 12);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.03li
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJLILLLLZIIL;
            }
        }, C736820SvI.LIZLLL(), new AwS615S0100000_1(this, 16), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.03lj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLZLL;
            }
        }, null, new AwS615S0100000_1(this, 17), 6);
    }
}
