package com.ss.android.ugc.aweme.inbox.bulletin.assem.create;

import X.C019F;
import X.C01GW;
import X.C0OKU;
import X.C1389890mGx;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardCreateLoadingAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public C1389890mGx LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinBoardCreateLoadingAssem.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinBoardEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinBoardCreateLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 367), AFwS240S0000000_9.get$arr$(216), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 365));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1389890mGx c1389890mGx = this.LLJI;
        if (c1389890mGx != null) {
            c1389890mGx.LIZ.LIZ.LJI = false;
            c1389890mGx.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0OKU.LIZ.getClass();
        C0OKU.LIZIZ();
        if (C0OKU.LIZJ) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS109S0100000_9(this, 130));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OKb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618380ONg) obj).LLILLJJLI;
            }
        }, this, null, new AwS588S0100000_9(this, 138), new AwS553S0100000_9(this, 366), new AwS588S0100000_9(this, 139), 4, null);
    }
}
