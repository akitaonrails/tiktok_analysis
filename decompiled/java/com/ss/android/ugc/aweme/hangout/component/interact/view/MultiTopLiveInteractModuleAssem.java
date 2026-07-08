package com.ss.android.ugc.aweme.hangout.component.interact.view;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DXR;
import X.C0J1N;
import X.C1117360fBO;
import X.C11JF;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C13LE;
import X.C15438062q;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C410901il;
import X.C452501pT;
import X.C477500Io0;
import X.C477860Ioa;
import X.C477870Iob;
import X.C478090Iox;
import X.C478550Iph;
import X.C478580Ipk;
import X.C478590Ipl;
import X.C478750Iq1;
import X.C478800Iq6;
import X.C478810Iq7;
import X.C478850IqB;
import X.C478920IqI;
import X.C478930IqJ;
import X.C479040IqU;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C500260Jjc;
import X.C515701zf;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC479370Ir1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC479000IqQ;
import X.InterfaceC479190Iqj;
import X.InterfaceC479210Iql;
import X.InterfaceC479240Iqo;
import X.RunnableC781530UlD;
import Y.ARunnableS12S1100000_7;
import Y.AfS43S1100000_7;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLivePreloadConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRoomMatchConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentDismissEvent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import com.ss.android.ugc.aweme.hangout.component.tab.MultiTopLivePlayTabVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS26S0000100_7;
import kotlin.jvm.internal.AwS44S0100100_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.text.u;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveInteractModuleAssem extends LiveHangoutV2SelectableSlotAssem implements InterfaceC479190Iqj, InterfaceC479210Iql, InterfaceC479240Iqo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTopLiveInteractModuleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveInteractModuleVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MultiTopLiveInteractModuleAssem.class, "playTabVM", "getPlayTabVM()Lcom/ss/android/ugc/aweme/hangout/component/tab/MultiTopLivePlayTabVM;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MultiTopLiveInteractModuleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveInteractModuleVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ, 198), AFwS237S0000000_7.get$arr$(73), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiTopLivePlayTabVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ2, 199), AFwS237S0000000_7.get$arr$(74), null, true);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 195));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 196));
        this.LLJJL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 194));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 197));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dif;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC479240Iqo
    public final void LJJLIIIIJ() {
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "onConfigurationChanged");
        RunnableC781530UlD runnableC781530UlDLp = lp();
        C1117360fBO c1117360fBOIp = ip();
        if (runnableC781530UlDLp == null || c1117360fBOIp == null) {
            return;
        }
        HandlerHook.viewPost(runnableC781530UlDLp, new ARunnableS12S1100000_7(runnableC781530UlDLp, "MultiTopLiveInteractAssem", 18));
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "onUnSelected");
        this.LLJJJ = false;
        C478090Iox c478090IoxKp = kp();
        if (c478090IoxKp != null) {
            c478090IoxKp.LIZLLL();
        }
        this.LLJJJJJIL = false;
        this.LLJJJIL = false;
        C478580Ipk.LIZ("TopModule#onUnSelected");
    }

    public final C1117360fBO ip() {
        return (C1117360fBO) this.LLJJL.getValue();
    }

    public final C478090Iox kp() {
        return (C478090Iox) this.LLJJJJ.getValue();
    }

    public final RunnableC781530UlD lp() {
        return (RunnableC781530UlD) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InterfaceC479000IqQ mp() {
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            return null;
        }
        Object obj = getConfig().LLILZ.get("top_live_link_trace_owner");
        if (obj instanceof InterfaceC479000IqQ) {
            return (InterfaceC479000IqQ) obj;
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C478920IqI.LIZ.getClass();
        C478920IqI.LIZLLL("clearAllCachedData");
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", "TopModuleTimerManager Cleared all cached data");
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem Cleared all timers and cached data in onStop");
        super.onStop();
    }

    public final MultiTopLiveInteractModuleVM op() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (MultiTopLiveInteractModuleVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC479190Iqj
    public final void rg() {
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem onViewHidden");
        C478090Iox c478090IoxKp = kp();
        if (c478090IoxKp != null) {
            c478090IoxKp.LIZLLL();
        }
        this.LLJJJJJIL = false;
        C478580Ipk.LIZ("TopModule#onViewHidden");
    }

    public final void tp() {
        if (this.LLJJJJJIL || !this.LLJJJ || ip().LL.isEmpty()) {
            return;
        }
        this.LLJJJJJIL = true;
        C478090Iox c478090IoxKp = kp();
        if (c478090IoxKp != null) {
            c478090IoxKp.LJ(4000L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        lp().setAdapter(null);
        lp().clearOnScrollListeners();
        C478090Iox c478090IoxKp = kp();
        if (c478090IoxKp != null) {
            c478090IoxKp.LIZLLL();
        }
        C11JF c11jf = ((C479040IqU) this.LLJJJJLIIL.getValue()).LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C478580Ipk.LIZ("InteractModuleViewBinder#onDestroy");
        C478920IqI c478920IqI = C478920IqI.LIZ;
        c478920IqI.getClass();
        C478920IqI.LIZLLL("clearAllCachedData");
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", "TopModuleTimerManager Cleared all cached data");
        C478580Ipk.LIZ("TopModule#onDestroy");
        c478920IqI.getClass();
        C478920IqI.LIZLLL("clearAllCachedData");
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", "TopModuleTimerManager Cleared all cached data");
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem Cleared all timers and cached data in onDestroy");
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem onPause");
    }

    @Override // X.InterfaceC479190Iqj
    public final void b7(boolean z) {
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem onViewResumed");
        this.LLJJIJIL = false;
        if (z) {
            C478920IqI.LIZ.getClass();
            C478930IqJ c478930IqJLJFF = C478920IqI.LJFF("MultiTopLiveInteractModuleAssem#checkDataIfExpired");
            if (c478930IqJLJFF != null) {
                if (c478930IqJLJFF.LIZJ) {
                    C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem first enter, checkDataIfExpired: cache is expired, so request refresh all topModule data");
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C478800Iq6(this, null), 3);
                    InterfaceC479000IqQ interfaceC479000IqQMp = mp();
                    if (interfaceC479000IqQMp != null) {
                        interfaceC479000IqQMp.Jp();
                    }
                } else {
                    InterfaceC479000IqQ interfaceC479000IqQMp2 = mp();
                    if (interfaceC479000IqQMp2 != null) {
                        interfaceC479000IqQMp2.Jp();
                    }
                }
            }
        }
        yp("onViewResumed");
        sp("MultiTopLiveInteractModuleAssem#onViewResumed");
    }

    public final void hp(MGModuleInteraction mGModuleInteraction) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topModuleAssem enterRoomByRealtimeData: ");
        sbLIZ.append(mGModuleInteraction);
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C478550Iph.LIZIZ(mGModuleInteraction.name, mGModuleInteraction.innerFeedMgAggId, new AwS44S0100100_7(jCurrentTimeMillis, this, mGModuleInteraction, 0), new AwS26S0000100_7(jCurrentTimeMillis, 0));
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C479450Ir9 c479450Ir9;
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem onViewCreated start");
        super.onViewCreated(view);
        lp().setAdapter(ip());
        lp().setLayoutManager(new GridLayoutManager(getContext(), 2));
        if (TiktokLiveHangoutPerformanceOptSetting.isInteractModuleRecyclerViewReuseOpt()) {
            lp().setHasFixedSize(true);
        }
        lp().addItemDecoration(new C0DXR() { // from class: X.0DXE
            public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                int i = childAdapterPosition % 2;
                if (C497740JfY.LJJ()) {
                    int i2 = LL;
                    rect.right = (i * i2) / 2;
                    rect.left = i2 - (((i + 1) * i2) / 2);
                } else {
                    int i3 = LL;
                    rect.left = (i * i3) / 2;
                    rect.right = i3 - (((i + 1) * i3) / 2);
                }
                if (childAdapterPosition >= 2) {
                    rect.top = LL;
                }
            }
        });
        C478090Iox c478090IoxKp = kp();
        if (c478090IoxKp != null) {
            c478090IoxKp.LIZ(lp());
        }
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0IqN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478850IqB) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 26), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0IqM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478850IqB) obj).LLILZ;
            }
        }, null, new AwS621S0100000_7(this, 27), 6);
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVMOp = op();
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            TabMGTopLive tabMGTopLive = C478590Ipl.LJIIIZ;
            if (tabMGTopLive == null) {
                C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", "cachedTopModuleData == null, refreshViewFromServer");
                multiTopLiveInteractModuleVMOp.xQ2("MultiTopLiveInteractModuleAssem#onViewCreated", "top_module_ui_landing");
            } else {
                C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", "cachedTopModuleData != null, use cached");
                C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
                if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZ) != null) {
                    c479450Ir9.LJII = "cached";
                }
                MultiTopLiveInteractModuleVM.wQ2(multiTopLiveInteractModuleVMOp, tabMGTopLive.interactionModule, tabMGTopLive.tabModule, EnumC479370Ir1.INIT, "MultiTopLiveInteractModuleAssem#onViewCreated", 16);
            }
        } else {
            C478920IqI.LIZ.getClass();
            C478930IqJ c478930IqJLJFF = C478920IqI.LJFF("initTopModuleAssemWithCache");
            if (c478930IqJLJFF != null) {
                if (!c478930IqJLJFF.LIZJ) {
                    C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem initTopModuleAssemWithCache: use cached data");
                    MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVMOp2 = op();
                    TabMGTopLive tabMGTopLive2 = c478930IqJLJFF.LIZ;
                    MultiTopLiveInteractModuleVM.wQ2(multiTopLiveInteractModuleVMOp2, tabMGTopLive2.interactionModule, tabMGTopLive2.tabModule, EnumC479370Ir1.INIT, "TopModuleAssem#initTopModuleAssemWithCache: cachedTopModuleData != null", 16);
                    InterfaceC479000IqQ interfaceC479000IqQMp = mp();
                    if (interfaceC479000IqQMp != null) {
                        interfaceC479000IqQMp.Jp();
                    }
                } else {
                    C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem initTopModuleAssemWithCache: cached data is expired, refresh from server");
                    MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVMOp3 = op();
                    TabMGTopLive tabMGTopLive3 = c478930IqJLJFF.LIZ;
                    multiTopLiveInteractModuleVMOp3.vQ2(EnumC479370Ir1.INIT, "TopModuleAssem#initTopModuleAssemWithCache: cachedTopModuleData == null", tabMGTopLive3.interactionModule, tabMGTopLive3.tabModule, true);
                    InterfaceC479000IqQ interfaceC479000IqQMp2 = mp();
                    if (interfaceC479000IqQMp2 != null) {
                        interfaceC479000IqQMp2.Jp();
                    }
                }
            } else {
                List<MGModuleInteraction> list = C478550Iph.LIZLLL;
                if (C500260Jjc.LJJIJIIJI(list)) {
                    MultiTopLiveInteractModuleVM.wQ2(op(), list, C478550Iph.LJ, EnumC479370Ir1.INIT, "TopModuleAssem#initTopModuleAssem", 16);
                } else {
                    C20441214yg.LIZIZ("MultiTopLiveInteractAssem", "topModuleAssem initTopModuleAssemWithCache: no cached data, fetch from server");
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C478810Iq7(this, null), 3);
                }
            }
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentDismissEvent.class, new AwS586S0100000_7(this, 212));
    }

    public final void sp(String str) {
        LinearLayoutManager linearLayoutManager;
        MGModuleInteraction mGModuleInteraction;
        if (!ip().LL.isEmpty()) {
            if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt() && this.LLJJJIL) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = lp().getLayoutManager();
            if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (iFindFirstVisibleItemPosition < ip().LL.size()) {
                Object obj = ListProtector.get(ip().LL, iFindFirstVisibleItemPosition);
                if ((obj instanceof MGModuleInteraction) && (mGModuleInteraction = (MGModuleInteraction) obj) != null) {
                    String strLJJIFFI = u.LJJIFFI(mGModuleInteraction.name, "hangout_mg_agg_playlabel_", "", false);
                    C477860Ioa.LJIIJ(new C477870Iob("interact_module", "playlabel", strLJJIFFI, null, Integer.valueOf((int) mGModuleInteraction.count), null, null, null, null, strLJJIFFI, strLJJIFFI, mGModuleInteraction.title, Integer.valueOf(iFindFirstVisibleItemPosition + 1), str, null, 16384), null);
                    this.LLJJJIL = true;
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    return;
                } else {
                    iFindFirstVisibleItemPosition++;
                }
            }
        }
    }

    public final void yp(String str) {
        if (MultiTopLiveRoomMatchConfigSetting.isEnableRandomMatch()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do not startTimersForAllModules, cause random match is enabled, source: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("MultiTopLiveInteractAssem", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        List<?> list = ip().LL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof MGModuleInteraction) {
                C478920IqI c478920IqI = C478920IqI.LIZ;
                String str2 = ((MGModuleInteraction) obj).name;
                c478920IqI.getClass();
                if (MultiGuestTopLivePreloadConfigSetting.getValue().topModulePreloadNameList.contains(str2)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("topModuleAssem No modules require timer restarting, source: ");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ("MultiTopLiveInteractAssem", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int i = MultiGuestTopLivePreloadConfigSetting.getValue().topModulePreloadRoomDataInterval;
        if (i <= 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TopModuleTimerManager Invalid interval: ");
            sbLIZ3.append(i);
            sbLIZ3.append(", source: ");
            sbLIZ3.append(str);
            C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        InterfaceC420801kM interfaceC420801kM = C478580Ipk.LIZ;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            InterfaceC420801kM interfaceC420801kM2 = C478580Ipk.LIZ;
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("TopModuleTimerManager Disposing existing RxJava timer, source: ");
            sbLIZ4.append(str);
            C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("TopModuleTimerManager Starting unified RxJava timer, source: ");
        sbLIZ5.append(str);
        sbLIZ5.append(", with interval: ");
        sbLIZ5.append(i);
        sbLIZ5.append("s for ");
        sbLIZ5.append(arrayList2.size());
        sbLIZ5.append(" modules");
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ5));
        C478580Ipk.LIZ = ((C0J1N) C11NZ.LJJJJJL(0L, i, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZJ(C11RD.LJ(this))).LIZ(new AfS43S1100000_7(arrayList2, str, 2), new C515701zf(str, 6));
    }

    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected, hasInitTopTab: ");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIL = z2;
        this.LLJJJ = true;
        this.LLJJJJJIL = false;
        MultiTopLiveInteractModuleVM multiTopLiveInteractModuleVMOp = op();
        C20441214yg.LIZIZ("MultiTopLiveTopModuleVM", "MultiTopLiveTopModuleVM updateRandomChatAnim");
        multiTopLiveInteractModuleVMOp.setState(AFwS237S0000000_7.get$arr$(257));
        yp("onSelected");
        sp("MultiTopLiveInteractModuleAssem#onSelected");
        tp();
    }

    public final void up(C478850IqB c478850IqB, EnumC479370Ir1 enumC479370Ir1) {
        C1117360fBO c1117360fBOIp = ip();
        C410901il c410901il = new C410901il();
        c410901il.clear();
        c410901il.addAll(c478850IqB.LL);
        c1117360fBOIp.LLLII(c410901il);
        ip().notifyDataSetChanged();
        C477500Io0.LIZ.getClass();
        C477500Io0.LJIILLIIL("MultiTopLiveInteractAssem", "topModuleAssem refreshed all view", null);
        if ((enumC479370Ir1 == EnumC479370Ir1.INIT || enumC479370Ir1 == EnumC479370Ir1.PRELOAD) && C500260Jjc.LJJIJIIJI(c478850IqB.LLILLJJLI)) {
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
            ((MultiTopLivePlayTabVM) assemVMLazy.getValue()).vQ2(c478850IqB.LLILLJJLI, enumC479370Ir1);
        }
    }
}
