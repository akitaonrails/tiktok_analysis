package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19513911Wf;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicPlayFullSongButtonAssem extends DynamicAssem {
    public static final C19513911Wf LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 163));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 166));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 164));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 165));
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicPlayFullSongButtonAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = new C19513911Wf();
    }

    public MusicPlayFullSongButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS573S0100000_29(c19719912DlLIZ, 167), AFwS273S0000000_29.get$arr$(93), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dr4;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        C197039127h c197039127h = (C197039127h) view;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.11XI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS238S0300000_29(this, view, c197039127h, 6), 14, null);
    }
}
