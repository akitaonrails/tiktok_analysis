package com.ss.android.ugc.aweme.tako.botpage.actionbar;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1856210yP5;
import X.C1856430yPR;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS126S0200000_24;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoFloatingSugAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public C1856430yPR LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoFloatingSugAssem.class, "fragmentViewModel", "getFragmentViewModel()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoFloatingSugAssem.class, "speechViewModel", "getSpeechViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoSpeechViewModel;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoFloatingSugAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1217), AFwS264S0000000_24.get$arr$(417), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1219));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoSpeechViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1218), AFwS264S0000000_24.get$arr$(418), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fkn;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zm8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jve);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.lh_);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.zm9);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0r0C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLJ;
            }
        }, new C2217381BqS() { // from class: X.0r0B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLJI;
            }
        }, null, new C1856210yP5(this, tuxTextView2, smartImageView, tuxTextView), 12);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_arrow_right_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.d5);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, view, 21), view);
        ((TakoFragmentViewModel) this.LLJJI.getValue()).wQ2(new AwS603S0100000_24(this, 487));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0yMr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1855260yNY) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 157), 6);
    }
}
