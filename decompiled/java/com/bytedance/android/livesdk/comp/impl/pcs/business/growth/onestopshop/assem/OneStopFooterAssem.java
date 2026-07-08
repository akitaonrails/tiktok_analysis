package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C055N;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C1820670xTl;
import X.C1820700xTo;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopFooterAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class OneStopFooterAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public View LLJJI;
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OneStopFooterAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public OneStopFooterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055N(c19719912DlLIZ), new C1820700xTo(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyu;
    }

    public final OneStopPageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = view;
        C16FS c16fs = (C16FS) view.findViewById(R.id.pmm);
        if (c16fs != null) {
            c16fs.setIcon(R.raw.icon_video_fill);
            c16fs.setIconAutoMirrored(true);
            c16fs.setText(c16fs.getContext().getString(2131855999));
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xTk
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        OneStopFooterAssem oneStopFooterAssem = this.LLILZ;
                        oneStopFooterAssem.getClass();
                        C1820640xTi.LIZJ(oneStopFooterAssem.hp().getState().LL.LIZ(), "click", oneStopFooterAssem.hp().LLILZIL.LIZ, C2097608Jq.LJ());
                        this.LLILZ.hp().wQ2();
                        this.LLILZ.hp().yQ2(0, 0);
                    }
                }
            }, c16fs);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0xTn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1820790xTx) obj).LLILLJJLI);
            }
        }, null, new C1820670xTl(this), 6);
    }
}
