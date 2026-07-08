package com.ss.android.ugc.aweme.mix.editplaylist;

import X.C01D1;
import X.C01GW;
import X.C0OM1;
import X.C1167550gUL;
import X.C1208620hYa;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlaylistRemoveFeedsFragmentAssem extends UIListContentAssem<EditPlaylistViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public C197039127h LLJIJIL;
    public C1749280vcc LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditPlaylistRemoveFeedsFragmentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editplaylist/EditPlaylistViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditPlaylistRemoveFeedsFragmentAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlaylistViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 538), AFwS256S0000000_18.get$arr$(155), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 537));
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1167550gUL.class, "edit_playlist_hierarchy_data_key"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LIZ = 0;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final EditPlaylistViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (EditPlaylistViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Fragment fragmentLJI;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        onBackPressedDispatcher.LIZ(fragmentLJI, new C1208620hYa(this, 1));
    }

    public final void Lo(boolean z) {
        FragmentManager supportFragmentManager;
        EditPlaylistViewModel editPlaylistViewModelJo = Jo();
        editPlaylistViewModelJo.LLIZ = false;
        if (z) {
            editPlaylistViewModelJo.withState(new AwS597S0100000_18(editPlaylistViewModelJo, 150));
        } else {
            editPlaylistViewModelJo.setState(AFwS256S0000000_18.get$arr$(1050));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJLLILLLL();
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.t5w);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.w28);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2755));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131837031);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(true);
        }
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 66, 42), c197039127h);
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gUH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1167470gUD) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 321), 4);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZLLL(c1167470gUD);
            }
        }, this, null, new AwS597S0100000_18(this, 1115), new AwS562S0100000_18(this, 2752), new AwS597S0100000_18(this, 1119), 4, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gUP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1167470gUD c1167470gUD = (C1167470gUD) obj;
                c1167470gUD.getClass();
                return C627260Oiy.LIZJ(c1167470gUD);
            }
        }, this, null, new AwS597S0100000_18(this, 1120), null, new AwS597S0100000_18(this, 1121), 20, null);
    }
}
