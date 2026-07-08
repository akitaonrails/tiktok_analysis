package com.ss.android.ugc.aweme.hangout.component.tab;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1117360fBO;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C477830IoX;
import X.C477860Ioa;
import X.C477870Iob;
import X.C478090Iox;
import X.C478550Iph;
import X.C478900IqG;
import X.C478920IqI;
import X.C478930IqJ;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC479370Ir1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC479190Iqj;
import X.InterfaceC479210Iql;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentDismissEvent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLivePlayTabAssem extends LiveHangoutV2SelectableSlotAssem implements InterfaceC479190Iqj, InterfaceC479210Iql {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTopLivePlayTabAssem.class, "playTabVM", "getPlayTabVM()Lcom/ss/android/ugc/aweme/hangout/component/tab/MultiTopLivePlayTabVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MultiTopLivePlayTabAssem.class, "playCardFeedVM", "getPlayCardFeedVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/MultiTopLivePlayFeedListViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MultiTopLivePlayTabAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLivePlayTabVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ, 278), AFwS237S0000000_7.get$arr$(97), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiTopLivePlayFeedListViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ2, 279), AFwS237S0000000_7.get$arr$(98), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 276));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 277));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 275));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 280));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.diw;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        this.LLJJIJIIJIL = false;
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LIZLLL();
        }
        this.LLJJJIL = false;
        super.onStop();
    }

    @Override // X.InterfaceC479190Iqj
    public final void rg() {
        this.LLJJIJIIJIL = false;
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LIZLLL();
        }
        this.LLJJJIL = false;
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C20441214yg.LIZIZ("MultiTopLivePlayTabAssem", "onUnSelected");
        this.LLJJIJIIJIL = false;
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LIZLLL();
        }
        this.LLJJJIL = false;
    }

    public final C1117360fBO hp() {
        return (C1117360fBO) this.LLJJJJJIL.getValue();
    }

    public final C478090Iox ip() {
        return (C478090Iox) this.LLJJJ.getValue();
    }

    public final MultiTopLivePlayTabVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (MultiTopLivePlayTabVM) assemVMLazy.getValue();
    }

    public final C477830IoX lp() {
        return (C477830IoX) this.LLJJJJLIIL.getValue();
    }

    public final void op() {
        if (this.LLJJJIL || !this.LLJJIJIIJIL || hp().LL.isEmpty()) {
            return;
        }
        this.LLJJJIL = true;
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LJ(4000L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        lp().setAdapter(null);
        lp().clearOnScrollListeners();
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LIZLLL();
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC479190Iqj
    public final void b7(boolean z) {
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = false;
        this.LLJJJIL = false;
        mp("MultiTopLivePlayTabAssem#onViewResumed");
        op();
    }

    public final void mp(String str) {
        LinearLayoutManager linearLayoutManager;
        C478900IqG c478900IqG;
        if (hp().LL.isEmpty()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = lp().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                while (iFindFirstVisibleItemPosition < hp().LL.size()) {
                    Object obj = ListProtector.get(hp().LL, iFindFirstVisibleItemPosition);
                    if ((obj instanceof C478900IqG) && (c478900IqG = (C478900IqG) obj) != null) {
                        String strLJJIFFI = u.LJJIFFI(c478900IqG.LIZ.name, "hangout_live_cell_", "", false);
                        C477860Ioa.LJIIJ(new C477870Iob("play_module", "playlabel_tab", strLJJIFFI, null, null, null, null, null, null, strLJJIFFI, strLJJIFFI, null, Integer.valueOf(iFindFirstVisibleItemPosition + 1), str, null, 16384), null);
                    }
                    if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                        iFindFirstVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C20441214yg.LIZIZ("MultiTopLivePlayTabAssem", "MultiTopLivePlayTabAssem onViewCreated start");
        super.onViewCreated(view);
        lp().setAdapter(hp());
        C477830IoX c477830IoXLp = lp();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        c477830IoXLp.setLayoutManager(linearLayoutManager);
        C478090Iox c478090IoxIp = ip();
        if (c478090IoxIp != null) {
            c478090IoxIp.LIZ(lp());
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0IqF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478830Iq9) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 30), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0IqE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C478830Iq9) obj).LLILLL);
            }
        }, null, new AwS621S0100000_7(this, 31), 6);
        C478920IqI.LIZ.getClass();
        C478930IqJ c478930IqJLJFF = C478920IqI.LJFF("initPlayTabAssemWithCache");
        if (c478930IqJLJFF != null) {
            C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModule initPlayTabAssemWithCache: use cached data");
            kp().vQ2(c478930IqJLJFF.LIZ.tabModule, EnumC479370Ir1.INIT);
        } else {
            kp().vQ2(C478550Iph.LJ, EnumC479370Ir1.INIT);
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentDismissEvent.class, new AwS586S0100000_7(this, 234));
    }

    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected, hasInitTopTab: ");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("MultiTopLivePlayTabAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = z2;
        this.LLJJJIL = false;
        mp("MultiTopLivePlayTabAssem#onViewResumed");
        op();
    }
}
