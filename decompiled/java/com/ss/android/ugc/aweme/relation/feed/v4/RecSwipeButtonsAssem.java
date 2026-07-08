package com.ss.android.ugc.aweme.relation.feed.v4;

import X.C01D1;
import X.C1389340mG4;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C1A5L;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS162S0100000_28;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RecSwipeButtonsAssem extends ReusedUIContentAssem<RecSwipeButtonsAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJJJ;
    public boolean LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public RelationButton LLJJL;
    public RelationButton LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecSwipeButtonsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/v4/RecSwipeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecSwipeButtonsAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecSwipeViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 856), AFwS271S0000000_28.get$arr$(201), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C197039127h c197039127h = this.LLJJJJLIIL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, null);
        RelationButton relationButton = this.LLJJL;
        if (relationButton == null) {
            relationButton = null;
        }
        relationButton.LIZ();
        RelationButton relationButton2 = this.LLJJLIIIJLLLLLLLZ;
        (relationButton2 != null ? relationButton2 : null).LIZ();
    }

    public final RecSwipeViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (RecSwipeViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.bzs);
        c197039127h.setTag(R.id.ekt, Boolean.TRUE);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0uge
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1713300uga) obj).LLILZIL);
            }
        }, null, AFwS315S0000000_28.get$arr$(39), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.10Kk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILLL;
            }
        }, null, new AwS642S0100000_28(c197039127h, 72), 6);
        C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(this, 103));
        this.LLJJJJLIIL = c197039127h;
        RelationButton relationButton = (RelationButton) view.findViewById(R.id.bzr);
        relationButton.setFollowClickListener(new AwS642S0100000_28(this, 71));
        relationButton.setDataChangeListener(new AwS394S0200000_28(this, relationButton, 61));
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.10Kj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILLL;
            }
        }, null, new AwS463S0200000_28(this, relationButton, 7), 6);
        this.LLJJL = relationButton;
        RelationButton relationButton2 = (RelationButton) view.findViewById(R.id.bzv);
        relationButton2.setFollowClickListener(new AwS463S0200000_28(this, relationButton2, 8));
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.10Kl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILLL;
            }
        }, null, new AwS463S0200000_28(this, relationButton2, 9), 6);
        this.LLJJLIIIJLLLLLLLZ = relationButton2;
        C197039127h c197039127h2 = this.LLJJJJLIIL;
        RelationButton relationButton3 = null;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C2271391DvN.LIZ(c197039127h2, (C1A5L) C2271381DvM.LLILLL.getValue());
        RelationButton relationButton4 = this.LLJJL;
        if (relationButton4 == null) {
            relationButton4 = null;
        }
        C2271391DvN.LIZ(relationButton4, (C1A5L) C2271381DvM.LLILLJJLI.getValue());
        RelationButton relationButton5 = this.LLJJLIIIJLLLLLLLZ;
        if (relationButton5 == null) {
            relationButton5 = null;
        }
        C2271391DvN.LIZ(relationButton5, (C1A5L) C2271381DvM.LLILZ.getValue());
        if (C1389340mG4.LIZJ(C724240Sb0.LIZ(this), null).LIZIZ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
            C197039127h c197039127h3 = this.LLJJJJLIIL;
            if (c197039127h3 == null) {
                c197039127h3 = null;
            }
            c197039127h3.setButtonSize(2);
            RelationButton relationButton6 = this.LLJJL;
            if (relationButton6 == null) {
                relationButton6 = null;
            }
            relationButton6.setButtonSize(2);
            RelationButton relationButton7 = this.LLJJLIIIJLLLLLLLZ;
            if (relationButton7 != null) {
                relationButton3 = relationButton7;
            }
            relationButton3.setButtonSize(2);
        }
    }
}
