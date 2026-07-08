package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C1396605dM;
import X.C678430QjJ;
import X.C679690QlL;
import X.EnumC677800QiI;
import X.InterfaceC1587906Jp;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MixLoadingFooterAssem extends MixReusedUIAssem<MixLoadingFooterAssem, C678430QjJ> {
    public C679690QlL LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.boe;
    }

    public final void sp() {
        int value;
        C679690QlL c679690QlL;
        Integer value2 = op().LLJ.getValue();
        if (value2 != null) {
            value = value2.intValue();
        } else {
            C1396605dM c1396605dM = op().LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            value = (c1396605dM.LIZLLL.LIZJ > 0 ? EnumC677800QiI.LOADING : EnumC677800QiI.NO_MORE).getValue();
        }
        if (value == EnumC677800QiI.LOADING.getValue()) {
            C679690QlL c679690QlL2 = this.LLJLIL;
            if (c679690QlL2 != null) {
                c679690QlL2.LIZIZ();
                return;
            }
            return;
        }
        if (value == EnumC677800QiI.NO_MORE.getValue()) {
            C679690QlL c679690QlL3 = this.LLJLIL;
            if (c679690QlL3 != null) {
                c679690QlL3.LIZJ(false);
                return;
            }
            return;
        }
        if (value != EnumC677800QiI.ERROR.getValue() || (c679690QlL = this.LLJLIL) == null) {
            return;
        }
        c679690QlL.LIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        view.setMinimumHeight(5);
        C679690QlL c679690QlL = new C679690QlL(view.getContext());
        this.LLJLIL = c679690QlL;
        c679690QlL.setEmptyText(view.getContext().getString(2131836755));
        C679690QlL c679690QlL2 = this.LLJLIL;
        if (c679690QlL2 != null) {
            c679690QlL2.setErrorText(view.getContext().getString(2131845625));
        }
        C679690QlL c679690QlL3 = this.LLJLIL;
        if (c679690QlL3 != null) {
            c679690QlL3.setErrorOnClickListener(new ACListenerS145S0100000_10(this, 8));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(this.LLJLIL, layoutParams);
        }
        op().LLJ.observe(this, new AObserverS214S0100000_10(this, 9));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        sp();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        sp();
    }
}
