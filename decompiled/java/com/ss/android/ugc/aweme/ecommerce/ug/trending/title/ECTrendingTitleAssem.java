package com.ss.android.ugc.aweme.ecommerce.ug.trending.title;

import X.C013C;
import X.C019F;
import X.C0PEM;
import X.C13LE;
import X.C1637806bA;
import X.C1743140vSi;
import X.C1753840vjy;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import Y.AObserverS30S0500000_12;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingTitleAssem extends UIContentAssem implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1753840vjy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECTrendingTitleAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECTrendingTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 421), AFwS268S0000000_26.get$arr$(311), null, true);
    }

    public final TrendingListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (TrendingListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_cart_refresh", this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        super.onViewCreated(view);
        this.LLJIJIL = (C1753840vjy) view.findViewById(R.id.yka);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ykb);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS160S0100000_26(view, 34));
        }
        View viewFindViewById2 = null;
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0vSh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1742800vSA) obj).LLJ;
            }
        }, null, new AwS461S0200000_26(view, this, 5), 6);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        View viewFindViewById3 = null;
        if (c19egLIZ != null) {
            viewFindViewById = c19egLIZ.findViewById(R.id.yk5);
        } else {
            viewFindViewById = null;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            viewFindViewById2 = c19egLIZ2.findViewById(R.id.ykr);
        }
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null) {
            viewFindViewById3 = c19egLIZ3.findViewById(R.id.ykd);
        }
        C013C c013c = new C013C();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0vSg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1742800vSA) obj).LLJI;
            }
        }, null, new AwS461S0200000_26(c013c, this, 6), 6);
        MutableLiveData<Integer> mutableLiveData = Go().LLILZ;
        getActualLifecycleOwner();
        mutableLiveData.observe(this, new AObserverS30S0500000_12(c013c, this, viewFindViewById2, viewFindViewById3, viewFindViewById, 0));
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_cart_refresh", this);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1743140vSi(str, this, str2, null), 3);
    }
}
