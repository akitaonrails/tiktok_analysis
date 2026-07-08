package com.ss.android.ugc.aweme.inbox.bulletin.comment.assem;

import X.AbstractC738140SxQ;
import X.C0I06;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C449650HkB;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457770HxH;
import X.C458030Hxh;
import X.C687700QyG;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC449720HkI;
import X.InterfaceC1146704e9;
import X.InterfaceC453710Hqj;
import X.InterfaceC665370Q7z;
import Y.AObjectS381S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinCommentKeyboardPanelAssem extends BasePanelContainerAssem implements C0I06, InterfaceC1146704e9 {
    public final boolean LLJJIII = true;
    public final C736950SvV LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public C127G LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

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

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.C0I06
    public final int fJ() {
        return 0;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
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

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
        ((AssemViewModel) this.LLJJIJI.getValue()).setState(new AwS21S0010000_6(true, 23));
    }

    public BulletinCommentKeyboardPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinCommentActionViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(195);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((AbstractC738140SxQ) this, 421);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJI = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, awS550S0100000_6, c451610HnL, c723700Sa8);
        AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(this, 423);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_62, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(196), new AwS550S0100000_6((AbstractC738140SxQ) this, 422), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentActionViewModel.class, new AObjectS381S0100000_6(this, 6)}, defaultViewModelProviderFactory);
                    this.LLJJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem
    public final boolean Ho() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C449650HkB c449650HkB = new C449650HkB(Collections.singletonList(EnumC449720HkI.SYSTEM_EMOJI), R.attr.uk, R.attr.uk, null, null, String.valueOf(hashCode()), false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -104, 255);
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(this, c449650HkB, 84);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, awS407S0200000_6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458030Hxh(this, null), 3);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0Hxi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 143), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0Hxa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Hxj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLILZIL;
            }
        }, null, new AwS620S0100000_6(this, 145), 6);
    }
}
