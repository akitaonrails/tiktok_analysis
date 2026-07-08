package com.ss.android.ugc.aweme.inbox.bulletin.assem.create;

import X.C019F;
import X.C01GW;
import X.C0OP5;
import X.C0OSB;
import X.C0P4L;
import X.C0P4M;
import X.C127A;
import X.C127K;
import X.C13LE;
import X.C1618770sE7;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardCreateAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public int LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinBoardCreateAssem.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinBoardEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinBoardCreateAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 364), AFwS240S0000000_9.get$arr$(215), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 363));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 362));
    }

    public final BulletinBoardEditViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (BulletinBoardEditViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0ONh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618380ONg) obj).LLILLJJLI;
            }
        }, this, null, new AwS588S0100000_9(this, 136), null, new AwS588S0100000_9(this, 137), 20, null);
        C786410Ut5.I7(new AbS691S0100000_9(this, 41, 42), (View) this.LLJIJIL.getValue());
        C197039127h c197039127h = (C197039127h) this.LLJIJIL.getValue();
        if (c197039127h.isAttachedToWindow()) {
            C0OP5.LJI.LJIIJ();
        } else {
            c197039127h.addOnAttachStateChangeListener(new C0P4L(c197039127h, 1));
        }
        ((C127K) this.LLJI.getValue()).setTitle(C1618770sE7.LIZJ(2131828032));
        C127K c127k = (C127K) this.LLJI.getValue();
        C127A c127a = new C127A(((View) this.LLJI.getValue()).getContext());
        c127a.LJIILJJIL(true);
        Go().LLJILJIL = true;
        c127a.LJIILLIIL(new C0P4M(this, 4));
        c127k.setAccessory(c127a);
        View viewFindViewById = ((View) this.LLJI.getValue()).findViewById(R.id.dlh);
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            C0OSB.LIZLLL(viewFindViewById, 8, 8, 8, 8);
        }
    }
}
