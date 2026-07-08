package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0HUI;
import X.C0HVI;
import X.C0HVQ;
import X.C0HVW;
import X.C1203204nG;
import X.C1272304yP;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceMainBodyAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 515));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceMainBodyAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceMainBodyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 514), AFwS236S0000000_6.get$arr$(250), null, true);
    }

    public final C0HUI Go() {
        return (C0HUI) this.LLIZLLLIL.getValue();
    }

    public final LocalServiceAlbumVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    public final void Jo() {
        if (C1203204nG.LIZ() && Ho().LLJILJIL) {
            Ho().wQ2(getContext(), new AwS585S0100000_6(this, 136));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Go().LLILLJJLI;
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(LocalServicePhotoCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(LocalServiceTakePhotoCell.class);
        Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
        if (context != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(context, 3));
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0H8Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 177), 4);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0HVK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0HVN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS655S0100000_6(this, 18), 8);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0HVO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HVL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS655S0100000_6(this, 19), 8);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0H8T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0H8X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILZIL;
            }
        }, null, new AwS655S0100000_6(this, 17), 12);
    }

    public final void Lo(C0HVI c0hvi, C0HVW c0hvw) {
        if (c0hvi != null && c0hvw != null) {
            ArrayList arrayList = new ArrayList();
            if (c0hvw == C0HVW.TAKE_PHOTO_PERMISSION) {
                C1272304yP c1272304yP = new C1272304yP(true, 1);
                arrayList.add(c1272304yP);
                Ho().LLIZ = c1272304yP;
            } else if (c0hvw == C0HVW.NO_TAKE_PHOTO_PERMISSION && !C1697810uHb.LJIIJJI(C0HVI.ALBUM_NO_PERMISSION, C0HVI.NOT_NEED_ALBUM_PERMISSION).contains(c0hvi)) {
                C1272304yP c1272304yP2 = new C1272304yP(false, 1);
                arrayList.add(c1272304yP2);
                Ho().LLIZ = c1272304yP2;
            }
            if (c0hvi != C0HVI.ALBUM_ALL_PERMISSION && c0hvi != C0HVI.ALBUM_PARTIAL_PERMISSION) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Go().LLILLJJLI;
                if (!arrayList.isEmpty()) {
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
                    Ho().setState(new AwS585S0100000_6(C0HVQ.PHOTO_SHOW, 461));
                } else {
                    C786410Ut5.LLF(4, viewOnAttachStateChangeListenerC20604515jv);
                }
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
                return;
            }
            Context context = getContext();
            if (context == null) {
                return;
            }
            C786410Ut5.LLF(0, Go().LLILLJJLI);
            LocalServiceAlbumVM localServiceAlbumVMHo = Ho();
            localServiceAlbumVMHo.LLILZLL.clear();
            localServiceAlbumVMHo.LLILZIL.clear();
            Ho().LLJIJIL = 0;
            Ho().LLJILJIL = false;
            Ho().wQ2(context, new AwS372S0200000_6((List) arrayList, (List<InterfaceC1891350zJl>) this, (LocalServiceMainBodyAssem) 14));
        }
    }
}
