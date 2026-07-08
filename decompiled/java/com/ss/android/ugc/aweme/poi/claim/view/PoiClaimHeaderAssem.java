package com.ss.android.ugc.aweme.poi.claim.view;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiClaimHeaderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiClaimHeaderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/claim/vm/PoiClaimViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiClaimHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiClaimViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 729), AFwS229S0000000_2.get$arr$(453), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLIZLLLIL = (TuxIconView) LJJIJL().findViewById(R.id.lrg);
        this.LLJ = (TuxTextView) LJJIJL().findViewById(R.id.tv_poi_claim_title);
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 63), tuxIconView);
        }
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gMM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155690gBD) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 273), 6);
    }
}
