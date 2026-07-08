package com.ss.android.ugc.aweme.tako.otherpage.share.ui;

import X.C019F;
import X.C0DSB;
import X.C1308910kAL;
import X.C13LE;
import X.C14FR;
import X.C1637806bA;
import X.C1852920yJm;
import X.C1857750yRZ;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS164S0100000_30;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ShareButtonAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareButtonAssem.class, "takoShareVM", "getTakoShareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/share/vm/TakoShareVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ShareButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoShareVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1355), AFwS274S0000000_30.get$arr$(174), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fr2;
    }

    public final TakoShareVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (TakoShareVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0DSB.LIZIZ(view);
        AssemViewModel.asyncSubscribe$default(hp(), new C2217371BqR() { // from class: X.0yXz
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158910gGP) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1158910gGP) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, null, new AwS609S0100000_30(view, 112), null, new AwS606S0100000_27(view, 267), 10, null);
        hp().vQ2(new AwS574S0100000_30(view, 261));
        hp().wQ2(new AwS574S0100000_30(view, 262));
        C0DSB.LIZIZ(view.findViewById(R.id.cgn));
        View viewFindViewById = view.findViewById(R.id.kqv);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(C1308910kAL.LJ(R.attr.zm, view.getContext()));
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d6g);
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (C14FR.LIZ.LJIILIIL()) {
            C0DSB.LIZIZ(textView);
            c197039127h.setText(C1857750yRZ.LJII(2131849787));
        } else {
            TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
            if (Intrinsics.LJFF(C1852920yJm.LIZ.enable, Boolean.TRUE)) {
                C0DSB.LIZJ(textView);
                textView.setText(C1857750yRZ.LJII(2131849789));
                c197039127h.setText(C1857750yRZ.LJII(2131849788));
            } else {
                C0DSB.LIZIZ(textView);
                c197039127h.setText(C1857750yRZ.LJII(2131849787));
            }
        }
        C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 20));
    }
}
