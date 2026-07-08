package com.ss.android.ugc.aweme.rss.feed.ui;

import X.AbstractC738140SxQ;
import X.C0OM1;
import X.C1164840gPy;
import X.C1164860gQ0;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C437101mz;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RssFeedAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxNavBar LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public C197039127h LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723590SZx(this, RssFeedParam.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJ;
    public C197039127h LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RssFeedAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/rss/feed/viewmodel/RssFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ema;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1749280vcc hp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ttw) : null;
            this.LLJJIJIIJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final RssFeedViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (RssFeedViewModel) assemVMLazy.getValue();
    }

    public RssFeedAssem() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2212);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RssFeedViewModel.class);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ, 2211);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(742);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS562S0100000_182, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS562S0100000_18, aFwS256S0000000_18, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJJ = assemVMLazy;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C197039127h c197039127h = this.LLJJJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        ip().setState(AFwS256S0000000_18.get$arr$(14));
    }

    public final void kp(Throwable th) {
        if (th instanceof C1164860gQ0) {
            C437101mz.LIZ(this, ((C1164860gQ0) th).getErrMsgId(), true);
            return;
        }
        if (th instanceof C1164840gPy) {
            C1164840gPy c1164840gPy = (C1164840gPy) th;
            if (c1164840gPy.getApiMsg() != null) {
                String apiMsg = c1164840gPy.getApiMsg();
                if (getContext() == null) {
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
                c1389890mGx.LJIIJ(apiMsg);
                c1389890mGx.LJIIJJI();
                return;
            }
            C437101mz.LIZ(this, 2131826675, false);
            return;
        }
        C437101mz.LIZ(this, 2131826664, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = this.LLJJIII;
        C197039127h c197039127h = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ttt);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(RssEntryViewHolder.class);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        }
        Context context = getContext();
        if (context != null) {
            View viewFindViewById2 = this.LLJJI;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ttu);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJI = (TuxNavBar) viewFindViewById2;
            }
            TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById2;
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                c1251150ifB.LIZJ(new AwS556S0100000_12(context, 15));
                c0om1.LJ(c1251150ifB);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = context.getString(2131826662);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZIZ = "editButton";
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_pen;
                c1251150ifB2.LIZJ(new AwS419S0200000_18(this, context, 0));
                c0om1.LIZIZ(c1251150ifB2);
                tuxNavBar.setNavActions(c0om1);
            }
        }
        View viewFindViewById3 = this.LLJJIJI;
        if (viewFindViewById3 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById3 = viewLJJIJL3.findViewById(R.id.ttv);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJIJI = (C197039127h) viewFindViewById3;
        }
        C197039127h c197039127h2 = (C197039127h) viewFindViewById3;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS153S0100000_18(this, 0));
            c197039127h = c197039127h2;
        }
        this.LLJJJIL = c197039127h;
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0gMn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158890gGN) obj).LL;
            }
        }, null, new AwS597S0100000_18(this, 548), new AwS548S0100000_4(this, 198), new AwS597S0100000_18(this, 549), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gPu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158890gGN) obj).LLILZIL;
            }
        }, null, AFwS287S0000000_4.get$arr$(11), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gMl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158890gGN) obj).LLILLL;
            }
        }, null, new AwS618S0100000_4(this, 22), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0gMm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158890gGN) obj).LLILLJJLI;
            }
        }, null, new AwS597S0100000_18(this, 546), new AwS562S0100000_18(this, 2210), new AwS597S0100000_18(this, 547), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gPt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1158890gGN) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 190), 4);
        RssFeedViewModel rssFeedViewModelIp = ip();
        rssFeedViewModelIp.withState(new AwS597S0100000_18(rssFeedViewModelIp, 32));
    }
}
