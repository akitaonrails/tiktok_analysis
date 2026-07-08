package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C630990Ooz;
import X.C723580SZw;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ArtistProfileTuxSheetAssem extends UIListContentAssem<ArtistProfileTuxSheetViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C630990Ooz.class, "hierarchy_data_key"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 694));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArtistProfileTuxSheetAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/ui/artistprofile/ArtistProfileTuxSheetViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public ArtistProfileTuxSheetAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArtistProfileTuxSheetViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 695);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(420);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((AbstractC738140SxQ) this, 696), aFwS229S0000000_2, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJI = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(ArtistProfileMusicOwnerCell.class, ArtistProfileUncertMusicOwnerCell.class, ArtistProfileMusicTitleCell.class);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jvGo.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        C630990Ooz c630990Ooz = (C630990Ooz) this.LLIZLLLIL.getValue();
        if (c630990Ooz != null && c630990Ooz.LLJ) {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
                C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jvGo, marginLayoutParams);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jvGo, marginLayoutParams);
        }
        super.onViewCreated(view);
    }
}
