package com.ss.android.ugc.aweme.mix.createmix;

import X.C01D1;
import X.C1167880gUs;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C21688219uK;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1163850gON;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedOrderAssem extends UIContentAssem implements InterfaceC1163850gON {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public C21688219uK LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedOrderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = 8;
    }

    public MixFeedOrderAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixCreateViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 448), AFwS256S0000000_18.get$arr$(144), null, true);
    }

    @Override // X.InterfaceC1163850gON, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final MixCreateViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (MixCreateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.oi2);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gNk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(viewOnAttachStateChangeListenerC20604515jv, 46), 6);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(MixFeedOrderCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.setHasFixedSize(true);
        viewOnAttachStateChangeListenerC20604515jv.LJ(0, C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dnt, null, false));
        C21688219uK c21688219uK = new C21688219uK(new C1167880gUs(viewOnAttachStateChangeListenerC20604515jv, Go(), true));
        this.LLIZLLLIL = c21688219uK;
        c21688219uK.LJ(viewOnAttachStateChangeListenerC20604515jv);
    }

    @Override // X.InterfaceC1163850gON
    public void z1(PowerCell<?> powerCell) {
        if (powerCell != null) {
            C21688219uK c21688219uK = this.LLIZLLLIL;
            if (c21688219uK == null) {
                c21688219uK = null;
            }
            c21688219uK.LJIILLIIL(powerCell);
        }
    }
}
