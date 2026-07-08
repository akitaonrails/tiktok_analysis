package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0H7N;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import irm.AkS78S0100000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceAlbumHeaderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 507));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceAlbumHeaderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceAlbumHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 506), AFwS236S0000000_6.get$arr$(246), null, true);
    }

    public final C0H7N Go() {
        return (C0H7N) this.LLIZLLLIL.getValue();
    }

    public final LocalServiceAlbumVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        TuxTextView tuxTextView = Go().LLILZ;
        Ho();
        Context context = getContext();
        if (context == null || (string = context.getString(2131846614)) == null) {
            string = "";
        }
        tuxTextView.setText(string);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0H8S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0H8W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZIL;
            }
        }, null, new AwS655S0100000_6(this, 15), 12);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0H8U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLJI;
            }
        }, null, new AwS620S0100000_6(this, 176), 6);
        C786410Ut5.I7(new AkS78S0100000_6(this, 28), Go().LLILZIL);
        C786410Ut5.I7(new AkS78S0100000_6(this, 30), Go().LLILLL);
    }
}
