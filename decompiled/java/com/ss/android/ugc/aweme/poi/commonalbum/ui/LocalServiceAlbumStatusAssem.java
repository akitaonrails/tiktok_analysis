package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0IE5;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceAlbumStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 509));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceAlbumStatusAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceAlbumStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 508), AFwS236S0000000_6.get$arr$(247), null, true);
    }

    public final LocalServiceAlbumVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        selectSubscribe(Go(), new C2217381BqS() { // from class: X.0HVY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0HVZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0HVb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), null, new C0IE5(this, 1));
    }
}
