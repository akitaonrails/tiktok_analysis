package com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0I06;
import X.C1220000hqw;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C449650HkB;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457770HxH;
import X.C457930HxX;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC449720HkI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC453710Hqj;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinPublishPanelKeyboardAssem extends BasePanelContainerAssem implements C0I06 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJIII;
    public final C736950SvV LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPublishPanelKeyboardAssem.class, "bulletinPublishEditVM", "getBulletinPublishEditVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public BulletinPublishPanelKeyboardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 621), AFwS236S0000000_6.get$arr$(193), null, true);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 420);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(194), new AwS546S0100000_2((AbstractC738140SxQ) this, 622), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final BulletinPublishPanelViewModel bp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (BulletinPublishPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
    public final void Fr() {
        bp().setState(new AwS17S0010000_2(true, 17));
    }

    @Override // com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C449650HkB c449650HkB = new C449650HkB(Collections.singletonList(EnumC449720HkI.SYSTEM_EMOJI), R.attr.uk, R.attr.uk, null, null, String.valueOf(hashCode()), false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -104, 255);
        C457770HxH c457770HxH = InterfaceC453710Hqj.LIZ;
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        LifecycleOwnerKt.getLifecycleScope(this);
        AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(this, c449650HkB, 24);
        c457770HxH.getClass();
        C457770HxH.LIZ(viewGroup, awS407S0200000_6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457930HxX(this, null), 3);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0HxY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 110), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0HxZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 111), 6);
        C736680Sv4.LJIIIIZZ(this, bp(), new C2217381BqS() { // from class: X.06JU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588106Jr) obj).LLILZLL;
            }
        }, null, new AwS620S0100000_6(this, 138), 6);
    }
}
