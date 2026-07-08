package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem;

import X.C019F;
import X.C055Z;
import X.C0DXR;
import X.C127G;
import X.C13LE;
import X.C1621206Wk;
import X.C1621306Wl;
import X.C1621406Wm;
import X.C1637806bA;
import X.C1808010x9L;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem.PcsIndustrySelectListAssem;
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
public final class PcsIndustrySelectListAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public final C1808010x9L LLJJIJIIJIL;
    public C127G LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsIndustrySelectListAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/industry/viewmodel/PcsIndustrySelectVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsIndustrySelectListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsIndustrySelectVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055Z(c19719912DlLIZ), new C1621306Wl(), null, true);
        this.LLJJIJIIJIL = new C1808010x9L(new C1621206Wk(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f905fyo;
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
        C127G c127g = this.LLJJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsIndustrySelectVM.class, new Function0(this) { // from class: X.0whn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsIndustrySelectListAssem.LLJJJ;
                            C480460Ism.LIZ().getClass();
                            return new PcsIndustrySelectVM(new C1785290wYh((PcsIndustryApi) C480460Ism.LIZLLL(PcsIndustryApi.class)));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (TextView) view.findViewById(R.id.tv_page_title);
        this.LLJJIJI = (TextView) view.findViewById(R.id.tv_page_subtitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.klj);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.06Wi
                public final int LL = 12;

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2) % 2;
                    int i2 = (int) (this.LL * view2.getContext().getResources().getDisplayMetrics().density);
                    int i3 = i2 / 2;
                    if (childAdapterPosition == 0) {
                        i = 0;
                    } else {
                        i = i3;
                        i3 = 0;
                    }
                    if (recyclerView2.getLayoutDirection() == 1) {
                        rect.left = i3;
                        rect.right = i;
                    } else {
                        rect.left = i;
                        rect.right = i3;
                    }
                    rect.bottom = i2;
                }
            });
            recyclerView.setAdapter(this.LLJJIJIIJIL);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        AssemViewModel value = assemVMLazy.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C1621406Wm(this));
    }
}
