package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem;

import X.C019F;
import X.C06M0;
import X.C127G;
import X.C12952055a;
import X.C13LE;
import X.C1594006Ly;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem.PcsIndustrySelectBottomAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.repository.PcsIndustryApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.scope.PcsIndustrySelectScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class PcsIndustrySelectBottomAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C197039127h LLJJIII;
    public ViewGroup LLJJIJI;
    public C127G LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsIndustrySelectBottomAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/industry/viewmodel/PcsIndustrySelectVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsIndustrySelectBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsIndustrySelectVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12952055a(c19719912DlLIZ), new C1594006Ly(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fym;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PcsIndustrySelectScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsIndustrySelectScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsIndustrySelectVM.class, new Function0(this) { // from class: X.0whm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsIndustrySelectBottomAssem.LLJJIJIL;
                            C480460Ism.LIZ().getClass();
                            return new PcsIndustrySelectVM(new C1785290wYh((PcsIndustryApi) C480460Ism.LIZLLL(PcsIndustryApi.class)));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.csc);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.cse);
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.06M1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AssemVMLazy assemVMLazy = this.LL.LLJJI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsIndustrySelectBottomAssem.LLJJIJIL;
                    PcsIndustrySelectVM pcsIndustrySelectVM = (PcsIndustrySelectVM) assemVMLazy.getValue();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsIndustrySelectVM), null, null, new C06M4(pcsIndustrySelectVM, null), 3);
                    C1784660wXg state = pcsIndustrySelectVM.getState();
                    if (state.LLJJIJIL && !state.LLJJIJIIJIL) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsIndustrySelectVM), null, null, new C06M3(pcsIndustrySelectVM, state, null), 3);
                    } else if (pcsIndustrySelectVM.LLIZ) {
                        pcsIndustrySelectVM.wQ2();
                    } else {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsIndustrySelectVM), null, null, new C06M5(pcsIndustrySelectVM, null), 3);
                    }
                }
            });
        }
        ((TextView) view.findViewById(R.id.zpi)).setText(C497740JfY.LJIIL(2131755984, 90, 90));
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        AssemViewModel value = assemVMLazy.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C06M0(this));
    }
}
