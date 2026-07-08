package com.ss.android.ugc.aweme.inbox.bulletin.assem.profile;

import X.AbstractC738140SxQ;
import X.C0DTR;
import X.C0OLV;
import X.C0OPQ;
import X.C0OSB;
import X.C1220000hqw;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1618770sE7;
import X.C1CRB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C617220OIu;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardProfileEntranceAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public C1CRB LLJI;
    public TuxTextView LLJIJIL;
    public C1CRB LLJILJIL;
    public TuxTextView LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C617220OIu LLJJI;

    public final BulletinProfileViewModel Ho() {
        return (BulletinProfileViewModel) this.LLJ.getValue();
    }

    public BulletinBoardProfileEntranceAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 469);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(266), new AwS553S0100000_9((AbstractC738140SxQ) this, 470), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public static void Jo(C1CRB c1crb) {
        if (c1crb != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c1crb.setBackground(c384050F3z.LIZ(c1crb.getContext()));
            C0OSB.LIZLLL(c1crb, 12, 12, 12, 12);
        }
    }

    public final void Go(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LLJIJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(C1618770sE7.LIZJ(2131828154));
            }
            C1CRB c1crb = this.LLJI;
            if (c1crb != null) {
                C786410Ut5.o9(c1crb, new ACListenerS144S0100000_9(this, 47));
            }
            C1CRB c1crb2 = this.LLJI;
            if (c1crb2 != null) {
                C12ES.LJIILL(0, c1crb2);
            }
            C1CRB c1crb3 = this.LLJILJIL;
            if (c1crb3 != null) {
                C0DTR.LIZIZ(c1crb3);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJILJILJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C1618770sE7.LIZJ(2131828155));
        }
        C1CRB c1crb4 = this.LLJILJIL;
        if (c1crb4 != null) {
            C786410Ut5.o9(c1crb4, new ACListenerS144S0100000_9(this, 48));
        }
        C1CRB c1crb5 = this.LLJILJIL;
        if (c1crb5 != null) {
            C12ES.LJIILL(0, c1crb5);
        }
        C1CRB c1crb6 = this.LLJI;
        if (c1crb6 == null) {
            return;
        }
        C0DTR.LIZIZ(c1crb6);
    }

    public final void Lo(boolean z) {
        String str;
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(Ho().LLILLJJLI);
        if (z) {
            str = "subscribe";
        } else {
            str = "unsubscribe";
        }
        C0OPQ.LJIIIIZZ(c0opq, strValueOf, str, 0, 0, null, 24);
    }

    public final void No(String str) {
        C0OPQ.LJJJJI(C0OPQ.LIZ, "click", str, String.valueOf(Ho().LLILLJJLI), 1);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (C1CRB) view.findViewById(R.id.d3o);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.d3n);
        this.LLJILJIL = (C1CRB) view.findViewById(R.id.d3u);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.d3t);
        Jo(this.LLJI);
        Jo(this.LLJILJIL);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0OKs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLIZLLLIL;
            }
        }, null, new AwS623S0100000_9(this, 59), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0OKo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJILLL;
            }
        }, null, AFwS292S0000000_9.get$arr$(14), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0OKn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJ;
            }
        }, null, new AwS623S0100000_9(this, 60), 6);
    }
}
