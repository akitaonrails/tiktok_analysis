package com.ss.android.ugc.aweme.music.assem;

import X.C019F;
import X.C1252710ihh;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C631230OpN;
import X.C631640Oq2;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634000Otq;
import Y.ACListenerS113S0200000_9;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicHeaderAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public LinearLayout LLJJIII;
    public View LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public C127G LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicHeaderAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 693), AFwS240S0000000_9.get$arr$(415), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.egl;
    }

    public final OriginMusicListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    public final void ip() {
        if (this.LLJJJ && this.LLJJIJIL) {
            this.LLJJJ = false;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
            c2344009Gk.LJIIIIZZ("user_id", c631640Oq2 != null ? c631640Oq2.LIZ : null);
            C20684815ws.LJIILLIIL("homepage_music_search_show", c2344009Gk.LIZ);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 2)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.owy);
        this.LLJJIJI = view.findViewById(R.id.ox0);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.ufd);
        C631230OpN.LIZIZ(this.LLJJIII, Float.valueOf(C418440Gaw.LIZIZ(8)));
        LinearLayout linearLayout = this.LLJJIII;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS113S0200000_9(this, context, 12));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OrN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZ(c632540OrU);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 87), 4);
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0OrG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631640Oq2) obj).LJII;
            }
        }, new AwS588S0100000_9(this, 253));
        C723850SaN.LIZLLL(this, new AwS588S0100000_9(this, 254));
    }
}
