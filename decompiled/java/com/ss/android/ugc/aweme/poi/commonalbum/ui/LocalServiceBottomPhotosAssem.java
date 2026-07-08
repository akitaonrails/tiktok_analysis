package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0H7D;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C423520Gj8;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceBottomPhotosAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 511));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceBottomPhotosAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceBottomPhotosAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 510), AFwS236S0000000_6.get$arr$(248), null, true);
    }

    public final C0H7D Go() {
        return (C0H7D) this.LLIZLLLIL.getValue();
    }

    public final LocalServiceAlbumVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Go().LLILLL;
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILLL = 250L;
        c423520Gj8.LLILZ = 250L;
        c423520Gj8.LLILZIL = 250L;
        c423520Gj8.LLILZLL = 250L;
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(c423520Gj8);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(LocalServiceHorizontalPhotoCell.class);
        TuxTextView tuxTextView = Go().LLILLJJLI;
        Context context = tuxTextView.getContext();
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            tuxTextView.setBackground(c384050F3z.LIZ(context));
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0H8Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLIZLLLIL;
            }
        }, null, new AwS620S0100000_6(this, 174), 6);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0HVJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0HVM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS331S0000000_6.get$arr$(4), 8);
        TuxTextView tuxTextView2 = Go().LLILLJJLI;
        C786410Ut5.I7(new AkS52S0200000_6(tuxTextView2, this, 16), tuxTextView2);
    }
}
