package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1935107i1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C325610Cpb;
import X.C452501pT;
import X.C627260Oiy;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.SearchResultListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchResultListAssem extends InvitableListAssem<SearchResultListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public C1749280vcc LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1287));
    public final AssemVMLazy LLJILJIL;
    public final String LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchResultListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/SearchResultListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchResultListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchResultListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 676), AFwS276S0000000_31.get$arr$(248), null, true);
        this.LLJILJILJ = "addyours_invite_search";
        this.LLJILLL = C1935107i1.LIZ(new AwS556S0100000_12(this, 675));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean So() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C1722300uv6 No() {
        return (C1722300uv6) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C1749280vcc Vo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ueo) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final SearchResultListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (SearchResultListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean Zo() {
        C325610Cpb c325610Cpb = (C325610Cpb) ip().getState();
        c325610Cpb.getClass();
        List listLIZ = C627260Oiy.LIZ(c325610Cpb);
        return listLIZ == null || listLIZ.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean ap() {
        C325610Cpb c325610Cpb = (C325610Cpb) ip().getState();
        c325610Cpb.getClass();
        return C627260Oiy.LIZLLL(c325610Cpb) instanceof C1623606Xi;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final String Oo() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15kn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325610Cpb c325610Cpb = (C325610Cpb) obj;
                c325610Cpb.getClass();
                return C627260Oiy.LIZLLL(c325610Cpb);
            }
        }, null, new AwS610S0100000_31(this, 271), new AwS575S0100000_31(this, 1288), new AwS610S0100000_31(this, 272), 2, null);
    }
}
