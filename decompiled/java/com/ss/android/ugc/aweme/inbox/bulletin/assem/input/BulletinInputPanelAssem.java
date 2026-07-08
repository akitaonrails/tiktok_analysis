package com.ss.android.ugc.aweme.inbox.bulletin.assem.input;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0I06;
import X.C0OLV;
import X.C0OWL;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C449650HkB;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457770HxH;
import X.C458130Hxr;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC453710Hqj;
import X.ViewTreeObserverOnWindowFocusChangeListenerC621440OZa;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinInputPanelAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputPanelAssem extends BasePanelContainerAssem implements C0I06 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL;
    public final C736950SvV LLJJJ;
    public final C736950SvV LLJJJIL;
    public final boolean LLJJJJ;
    public View LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final ViewTreeObserverOnWindowFocusChangeListenerC621440OZa LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputPanelAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0I06
    public final void Dg(int i) {
    }

    @Override // X.C0I06
    public final Integer Ga() {
        return null;
    }

    @Override // X.C0I06
    public final void c8(long j) {
    }

    @Override // X.C0I06
    public final int fJ() {
        return 0;
    }

    @Override // X.C0I06
    public final long hN() {
        return 0L;
    }

    @Override // X.C0I06
    public final void la(int i) {
    }

    @Override // X.C0I06
    public final void z4(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0OZa] */
    public BulletinInputPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 388), AFwS240S0000000_9.get$arr$(224), null, true);
        this.LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        this.LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
        this.LLJJIJIL = new C1559260qg8(new C723580SZw(this, C449650HkB.class, null), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 387);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(225);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 389);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJ = new C736950SvV(c19719912DlLIZ2, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 391);
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(226), new AwS553S0100000_9((AbstractC738140SxQ) this, 390), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJJ = true;
        this.LLJJL = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0OZa
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (!z) {
                    BulletinInputPanelAssem bulletinInputPanelAssem = this.LL;
                    bulletinInputPanelAssem.LLJJJJLIIL = true;
                    bulletinInputPanelAssem.rq0(true);
                } else {
                    this.LL.rq0(false);
                    this.LL.LLJJJJLIIL = false;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
        if (this.LLJJJJLIIL) {
            return;
        }
        bp().yQ2(true);
    }

    public final BulletinEditViewModel bp() {
        return (BulletinEditViewModel) this.LLJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LLJJJJJIL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.LLJJL);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final boolean Ho() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJJJIL = view;
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.LLJJL);
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        this.LLJJIJIL.getValue();
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 419);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, awS550S0100000_6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0Hxt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 50), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJIL.getValue(), new C2217381BqS() { // from class: X.0Hxs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 51), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458130Hxr(this, null), 3);
    }
}
