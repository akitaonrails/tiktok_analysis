package com.ss.android.ugc.aweme.inbox.bulletin.assem.profile;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C0OM1;
import X.C0OPQ;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389910mGz;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1618770sE7;
import X.C19EG;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C345280DgE;
import X.C451610HnL;
import X.C452070Ho5;
import X.C620050OTr;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import Y.ACListenerS117S0200000_14;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardProfileNavBarAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public TuxNavBar LLJI;
    public boolean LLJIJIL;
    public BulletinShareModel LLJILJIL;

    public final BulletinProfileViewModel Go() {
        return (BulletinProfileViewModel) this.LLJ.getValue();
    }

    public BulletinBoardProfileNavBarAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 473);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(268), new AwS553S0100000_9((AbstractC738140SxQ) this, 474), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        C0OLV c0olv;
        String str;
        Object obj;
        String str2;
        String strLIZ;
        if (Intrinsics.LJFF("bulletin_board_detail_page", c1365870leD.LJ) && (c0olv = (C0OLV) this.LLIZLLLIL.getValue()) != null && (str = c0olv.LL) != null) {
            C620050OTr c620050OTr = C620050OTr.LIZ;
            String str3 = "chat_merge";
            if (c1365870leD.LIZJ) {
                obj = "chat_merge";
            } else {
                obj = "chat_head";
            }
            C620050OTr.LIZIZ(c620050OTr, str, "channel_share", C2097908Jt.LIZJ(new Pair("platform", obj)));
            C0OPQ c0opq = C0OPQ.LIZ;
            if (c1365870leD.LIZJ) {
                str2 = "chat_merge";
            } else {
                str2 = "chat_head";
            }
            boolean zTo = Go().To();
            int iQF = Go().qF();
            c0opq.getClass();
            C0OPQ.LJJIJL(str, zTo ? 1 : 0, iQF, str2, "share_panel", "bulletin_board_detail_page", "share_button");
            if (!c1365870leD.LIZJ) {
                str3 = "chat_head";
            }
            C0OPQ.LJJIJLIJ(str, str3, "share_panel", "bulletin_board_detail_page", Go().To() ? 1 : 0, Go().qF(), 1, "share_button");
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    strLIZ = C345280DgE.LIZ(c19egLIZ, c1365870leD);
                } else {
                    strLIZ = null;
                }
                C1389910mGz c1389910mGz = new C1389910mGz(fragmentLJI);
                c1389910mGz.LJIIJ(strLIZ);
                c1389910mGz.LJ(3000L);
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LIZIZ = 0;
                c1360890lWB.LIZLLL = 0;
                c1360890lWB.LJIIIIZZ = new ACListenerS117S0200000_14(c1365870leD, this, 13);
                c1389910mGz.LJIIJJI();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (TuxNavBar) LJJIJL().findViewById(R.id.d3m);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1741));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = true;
        TuxNavBar tuxNavBar = this.LLJI;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = this.LLJI;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(C1618770sE7.LIZ(R.attr.zp));
        }
        String str = null;
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0OME
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILLJJLI;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 514), 28, null);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OLf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 193), 6);
        C0OLV c0olv = (C0OLV) this.LLIZLLLIL.getValue();
        String str2 = null;
        if (c0olv != null) {
            str = c0olv.LLIZLLLIL;
        }
        if (!Intrinsics.LJFF(str, "Share")) {
            C0OLV c0olv2 = (C0OLV) this.LLIZLLLIL.getValue();
            if (c0olv2 != null) {
                str2 = c0olv2.LLJJIII;
            }
            if (!Intrinsics.LJFF(str2, "open_share_page")) {
                return;
            }
        }
        this.LLJIJIL = true;
    }
}
