package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.edittool.color;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1839160xxa;
import X.C1839190xxd;
import X.C1839200xxe;
import X.C1839210xxf;
import X.C1839220xxg;
import X.C1839230xxh;
import X.C1839240xxi;
import X.C1839280xxm;
import X.C1839290xxn;
import X.C1839300xxo;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C433530GzH;
import X.C452501pT;
import X.C469900Ibk;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TextSelectColorStyleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final List<C1839190xxd> LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextSelectColorStyleAssem.class, "boardTextDynamicStyleViewModel", "getBoardTextDynamicStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/font/viewmodel/BoardTextDynamicStyleViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TextSelectColorStyleAssem.class, "boardTextSelectColorStyleViewModel", "getBoardTextSelectColorStyleViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/edittool/color/BoardTextSelectColorStyleViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TextSelectColorStyleAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TextSelectColorStyleAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BoardTextDynamicStyleViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new C1839200xxe(c19719912DlLIZ), new C1839280xxm(), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BoardTextSelectColorStyleViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1839210xxf(c19719912DlLIZ2), new C1839290xxn(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1839220xxg(c19719912DlLIZ3), new C1839300xxo(), null, true);
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(24.0d)));
        this.LLJJJ = C452501pT.LIZIZ(new C1839240xxi(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C1839230xxh(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxr;
    }

    public final void hp() {
        for (C1839190xxd c1839190xxd : (ArrayList) this.LLJJIJIIJIL) {
            if (c1839190xxd.LLILLJJLI) {
                kp(c1839190xxd, false);
                c1839190xxd.setSelection(false);
            }
        }
    }

    public final BoardTextSelectColorStyleViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (BoardTextSelectColorStyleViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((View) this.LLJJJ.getValue()).setHorizontalScrollBarEnabled(false);
        C500260Jjc.LLFFF(LJJIJL());
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0JE6
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C469920Ibm) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C469920Ibm) obj).LLILLJJLI = (List) obj2;
            }
        }, null, new C1839160xxa(this), 6);
        Context context = getContext();
        if (context != null) {
            BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel = (BoardTextDynamicStyleViewModel) this.LLJJI.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(boardTextDynamicStyleViewModel), null, null, new C469900Ibk(boardTextDynamicStyleViewModel, context, null), 3);
        }
    }

    public static void kp(View view, boolean z) {
        float f;
        if (z) {
            f = 1.16f;
        } else {
            f = 1.0f;
        }
        C433530GzH.LIZ(f, 200L, view);
    }
}
