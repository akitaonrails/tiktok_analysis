package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit;

import X.C019F;
import X.C01GW;
import X.C0I7D;
import X.C13LE;
import X.C1527205yQ;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1856690yPr;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339360DSc;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionEditAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1527205yQ.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public C1856690yPr LLJJJJLIIL;
    public boolean LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InstructionEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/instruction/edit/InstructionEditVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InstructionEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InstructionEditVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 274), AFwS229S0000000_2.get$arr$(224), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 277));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 276));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 269));
        this.LLJJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 270));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 271));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 272));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 275));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cep;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0I7D hp() {
        return (C0I7D) this.LLJJJ.getValue();
    }

    public final InstructionEditVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (InstructionEditVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1856690yPr c1856690yPr = this.LLJJJJLIIL;
        if (c1856690yPr != null) {
            c1856690yPr.LJIIJ();
        }
        this.LLJJJJLIIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        final C0I7D c0i7dHp;
        super.onResume();
        if (this.LLJJL || (c0i7dHp = hp()) == null) {
            return;
        }
        this.LLJJL = true;
        if (c0i7dHp.getParent() != null) {
            final View rootView = c0i7dHp.getRootView();
            if (rootView.hasWindowFocus()) {
                C339360DSc.LIZIZ(c0i7dHp);
            } else {
                rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.06IU
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z) {
                        if (!z) {
                            return;
                        }
                        rootView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                        if (c0i7dHp.getParent() == null) {
                            return;
                        }
                        C339360DSc.LIZIZ(c0i7dHp);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditAssem.onViewCreated(android.view.View):void");
    }

    public final void kp(C197039127h c197039127h, boolean z) {
        Context context = c197039127h.getContext();
        if (context == null) {
            return;
        }
        if (z) {
            c197039127h.setText("");
            C1856690yPr c1856690yPr = new C1856690yPr(context, R.raw.icon_spinner_normal);
            this.LLJJJJLIIL = c1856690yPr;
            c197039127h.setButtonStartIconDrawable(c1856690yPr);
            C1856690yPr c1856690yPr2 = this.LLJJJJLIIL;
            if (c1856690yPr2 != null) {
                c1856690yPr2.LJIIIZ();
                return;
            }
            return;
        }
        C1856690yPr c1856690yPr3 = this.LLJJJJLIIL;
        if (c1856690yPr3 != null) {
            c1856690yPr3.LJIIJ();
        }
        this.LLJJJJLIIL = null;
        c197039127h.setButtonStartIconDrawable(null);
        c197039127h.setText(c197039127h.getContext().getString(2131846268));
    }
}
