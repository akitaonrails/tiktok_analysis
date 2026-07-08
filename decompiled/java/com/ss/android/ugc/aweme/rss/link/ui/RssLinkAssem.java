package com.ss.android.ugc.aweme.rss.link.ui;

import X.C019F;
import X.C01GW;
import X.C0CX1;
import X.C0I7D;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1748470vbJ;
import X.C1864790ycv;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C703302op;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1779050wOd;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS76S0200000_7;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class RssLinkAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1748470vbJ LLJJI;
    public FrameLayout LLJJIII;
    public C197039127h LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, RssLinkParam.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RssLinkAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/rss/link/viewmodel/RssLinkViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RssLinkAssem() {
        C019F c019f = C019F.LIZ;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 619);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RssLinkViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 571), AFwS269S0000000_27.get$arr$(143), awS571S0100000_27, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 570));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.emd;
    }

    public final C197039127h hp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tty) : null;
            this.LLJJIJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1748470vbJ ip() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ttz) : null;
            this.LLJJI = (C1748470vbJ) viewFindViewById;
        }
        return (C1748470vbJ) viewFindViewById;
    }

    public final RssLinkViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (RssLinkViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        C0I7D c0i7d;
        C1748470vbJ c1748470vbJIp = ip();
        if (c1748470vbJIp == null || (c0i7d = (C0I7D) c1748470vbJIp.findViewById(R.id.grz)) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0i7d, new ARunnableS76S0200000_7(c0i7d, this, 32), 200L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1779050wOd enumC1779050wOd;
        RssLinkViewModel rssLinkViewModelKp = kp();
        if (C703302op.LIZ(((RssLinkParam) this.LLJJIJIIJIL.getValue()).getRssFeedUrl())) {
            enumC1779050wOd = EnumC1779050wOd.EDIT;
        } else {
            enumC1779050wOd = EnumC1779050wOd.NEW;
        }
        rssLinkViewModelKp.setState(new AwS606S0100000_27(enumC1779050wOd, 330));
        C1748470vbJ c1748470vbJIp = ip();
        if (c1748470vbJIp != null) {
            c1748470vbJIp.LJFF(false);
            c1748470vbJIp.LJIIIZ(1);
            TextView textView = (TextView) c1748470vbJIp.findViewById(R.id.grz);
            if (textView != null) {
                textView.setSingleLine(true);
            }
            View viewFindViewById = this.LLJJIII;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.h5b);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJIII = (FrameLayout) viewFindViewById;
            }
            ((LinearLayout.LayoutParams) viewFindViewById.getLayoutParams()).gravity = 8388693;
            C0CX1.LIZ.getClass();
            if (C0CX1.LIZ()) {
                lp();
            }
            c1748470vbJIp.LIZIZ(new C1864790ycv(this, 2));
        }
        C197039127h c197039127hHp = hp();
        if (c197039127hHp != null) {
            C786410Ut5.U8(c197039127hHp, new ACListenerS161S0100000_27(this, 106));
        }
        AssemViewModel.asyncSubscribe$default(kp(), new C2217381BqS() { // from class: X.0y89
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LLILZLL;
            }
        }, null, new AwS597S0100000_18(this, 649), new AwS571S0100000_27(this, 1036), new AwS597S0100000_18(this, 650), 2, null);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0y86
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1845670y85) obj).LLILLJJLI);
            }
        }, null, AFwS285S0000000_2.get$arr$(34), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0y8A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 71), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0y82
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LLILLL;
            }
        }, null, new AwS641S0100000_27(this, 84), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0y87
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LLILZ;
            }
        }, null, new AwS626S0100000_12(this, 37), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0y88
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 48), 6);
    }

    public final void t4(boolean z) {
        TextView textView;
        TextView textView2;
        if (z) {
            C197039127h c197039127hHp = hp();
            if (c197039127hHp != null) {
                c197039127hHp.setLoading(true);
            }
            C1748470vbJ c1748470vbJIp = ip();
            if (c1748470vbJIp != null && (textView2 = (TextView) c1748470vbJIp.findViewById(R.id.grz)) != null) {
                textView2.setEnabled(false);
            }
            C786410Ut5.a9((TuxIconView) this.LLJJJ.getValue(), new View.OnClickListener() { // from class: X.0y8B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            return;
        }
        C197039127h c197039127hHp2 = hp();
        if (c197039127hHp2 != null) {
            c197039127hHp2.setLoading(false);
        }
        C1748470vbJ c1748470vbJIp2 = ip();
        if (c1748470vbJIp2 != null && (textView = (TextView) c1748470vbJIp2.findViewById(R.id.grz)) != null) {
            textView.setEnabled(true);
        }
        C786410Ut5.a9((TuxIconView) this.LLJJJ.getValue(), new ACListenerS161S0100000_27(this, 55));
    }
}
