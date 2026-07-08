package com.ss.android.ugc.aweme.input;

import X.C019F;
import X.C01GW;
import X.C1110404Vy;
import X.C1353510lKH;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C418440Gaw;
import X.C449460Hjs;
import X.C449480Hju;
import X.C451440Hn4;
import X.C451450Hn5;
import X.C452501pT;
import X.C460030I2f;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuEmojiKeyboardAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C449460Hjs LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public ViewGroup LLJI;
    public Integer LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuEmojiKeyboardAssem.class, "inputVM", "getInputVM()Lcom/ss/android/ugc/aweme/input/DanmakuInputVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DanmakuEmojiKeyboardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuInputVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 610), AFwS259S0000000_21.get$arr$(170), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 609));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C449460Hjs c449460Hjs = this.LLIZLLLIL;
        if (c449460Hjs != null) {
            C2296808zG.LIZJ(c449460Hjs.LLIZLLLIL, null);
        }
    }

    public final void Go(Integer num) {
        ViewGroup.LayoutParams layoutParams;
        if (num != null) {
            num.intValue();
            ViewGroup viewGroup = this.LLJI;
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = num.intValue();
            }
            ViewGroup viewGroup2 = this.LLJI;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ff0);
        C460030I2f c460030I2f = new C460030I2f((C1353510lKH) view.findViewById(R.id.gsw));
        C451450Hn5.LIZ();
        C449460Hjs c449460HjsLIZ = C449480Hju.LIZ(c460030I2f, viewGroup, C451440Hn4.LIZ(2));
        viewGroup.addView(c449460HjsLIZ.LL);
        this.LLIZLLLIL = c449460HjsLIZ;
        this.LLJI = viewGroup;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int iLIZJ = C1110404Vy.LIZ().LIZJ(((Boolean) this.LLJILJIL.getValue()).booleanValue());
        if (((Boolean) this.LLJILJIL.getValue()).booleanValue()) {
            numValueOf = Integer.valueOf(iLIZJ);
        } else {
            numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(290)));
        }
        this.LLJIJIL = numValueOf;
        layoutParams.height = iLIZJ;
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lMM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1354820lMO) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 143), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0lML
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1354820lMO) obj).LLILLJJLI);
            }
        }, null, new AwS635S0100000_21(this, 144), 6);
    }
}
