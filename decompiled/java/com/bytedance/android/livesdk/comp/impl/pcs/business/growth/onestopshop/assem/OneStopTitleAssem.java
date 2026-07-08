package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem;

import X.C019F;
import X.C1217730hnH;
import X.C13LE;
import X.C1567640qte;
import X.C1637806bA;
import X.C1820680xTm;
import X.C1820770xTv;
import X.C1820780xTw;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopTitleAssem extends UISlotAssem {
    public static final C1820780xTw LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public View LLJJIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xTw] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStopTitleAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.0xTw
        };
        LLJJIJIL = 52;
    }

    public OneStopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217730hnH(c19719912DlLIZ), new C1820770xTv(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyy;
    }

    public final OneStopPageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1820790xTx) obj).LL;
            }
        }, null, new C1567640qte(), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1820790xTx) obj).LLILZ);
            }
        }, null, new C1820680xTm(this), 6);
        View viewFindViewById = view.findViewById(R.id.gd0);
        this.LLJJIII = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exw, getContext()));
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xTp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.hp().yQ2(0, 1);
                this.LL.hp().setState(new C1820720xTq());
            }
        }, view.findViewById(R.id.bn2));
    }
}
