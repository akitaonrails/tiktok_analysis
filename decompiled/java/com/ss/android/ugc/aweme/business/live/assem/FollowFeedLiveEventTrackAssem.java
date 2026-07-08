package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C0JAM;
import X.C0JAU;
import X.C0ZP4;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1572230r13;
import X.C1591220rVg;
import X.C1596560reI;
import X.C1597740rgC;
import X.C1620910sHZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C5183020f;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS9S0000000_24;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowFeedLiveEventTrackAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 128));
    public final AssemVMLazy LLILLL;
    public final C736950SvV LLILZ;
    public final C01GW LLILZIL;
    public final C630740Ooa LLILZLL;
    public final C1620910sHZ LLIZ;
    public final C1620910sHZ LLIZLLLIL;
    public final C630740Ooa LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowFeedLiveEventTrackAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public FollowFeedLiveEventTrackAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 125);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(40), null, true);
        this.LLILZ = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 130), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(41), new AwS568S0100000_24((AbstractC738140SxQ) this, 129), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(81));
        this.LLILZLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 126));
        this.LLIZ = new C1620910sHZ(this, 2);
        this.LLIZLLLIL = new C1620910sHZ(this, 1);
        this.LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 127));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final FeedSkylightContainerViewModel m164do() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
    }

    public final HomeTabAbility fo() {
        return (HomeTabAbility) this.LLILZLL.getValue();
    }

    public final void ho() {
        if (this.LLJI && this.LLJIJIL) {
            this.LLJI = false;
            this.LLJIJIL = false;
            C20684815ws.LJIILLIIL("livesdk_follow_tab_empty", C2097608Jq.LJIIJ(new Pair("enter_from", C1596560reI.LIZIZ(((Number) this.LLILLJJLI.getValue()).intValue()))));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbilityFo = fo();
        if (homeTabAbilityFo != null) {
            homeTabAbilityFo.ao(this.LLIZ);
        }
        HomeTabAbility homeTabAbilityFo2 = fo();
        if (homeTabAbilityFo2 != null) {
            homeTabAbilityFo2.UC1(this.LLIZLLLIL);
        }
        ((List) this.LLILZIL.getValue()).add(AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILZ.getValue(), new C2217381BqS() { // from class: X.0r0x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, this, null, new AwS603S0100000_24(this, 592), null, new AwS603S0100000_24(this, 593), 20, null));
        if (C1591220rVg.LIZLLL()) {
            ((List) this.LLILZIL.getValue()).add(AssemViewModel.selectSubscribe$default(m164do(), new C2217381BqS() { // from class: X.0rbN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1575830r6r) obj).LLILZLL;
                }
            }, null, this, null, new C5183020f((Function1) new AwS603S0100000_24(this, 590), (Function1<? super Long, Object>) 218), 10, null));
        } else {
            AssemViewModel.selectSubscribe$default(m164do(), new C2217381BqS() { // from class: X.0rbN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1575830r6r) obj).LLILZLL;
                }
            }, null, null, null, new C5183020f((Function1) new AwS603S0100000_24(this, 591), (Function1<? super Long, Object>) 218), 10, null);
        }
        C0ZP4 c0zp4YQ2 = m164do().yQ2(C1591220rVg.LIZLLL() ? this : null, new AwS603S0100000_24(this, 594));
        if (C1591220rVg.LIZLLL()) {
            ((List) this.LLILZIL.getValue()).add(c0zp4YQ2);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        C0JAU.LIZLLL().LIZIZ();
        super.onDestroy();
        HomeTabAbility homeTabAbilityFo = fo();
        if (homeTabAbilityFo != null) {
            homeTabAbilityFo.tx0(this.LLIZ);
        }
        HomeTabAbility homeTabAbilityFo2 = fo();
        if (homeTabAbilityFo2 != null) {
            homeTabAbilityFo2.Ik0(this.LLIZLLLIL);
        }
        C1572230r13.LIZ((List) this.LLILZIL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C0JAU.LIZLLL().LJFF();
        C0JAU.LIZLLL().LJII(0L);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ISkylightListAbility iSkylightListAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        super.onResume();
        if (this.LLJILJILJ || (iSkylightListAbility = (ISkylightListAbility) this.LLJ.getValue()) == null || (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jvWl.addOnScrollListener(new AsS9S0000000_24(1));
        this.LLJILJILJ = true;
    }

    public final void bo(String str, Function1<? super String, Boolean> function1) {
        if (!m164do().wQ2() || function1.invoke(str).booleanValue()) {
            return;
        }
        C0JAU.LIZLLL().LIZIZ();
    }

    public static void ko(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        LogPbBean logPbBean;
        String str;
        String strValueOf = String.valueOf(list.size());
        C0JAU.LIZLLL().LJI();
        C0JAM c0jamLIZLLL = C0JAU.LIZLLL();
        if (!c0jamLIZLLL.LIZLLL) {
            HashMap<String, String> map = new HashMap<>();
            if (!list.isEmpty()) {
                map.put("room_cnt", strValueOf);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    FollowingInterestUser followingInterestUser = (FollowingInterestUser) it2.next();
                    if (followingInterestUser.getUser().getUid() != null && followingInterestUser.getUser().isLive()) {
                        arrayList.add(String.valueOf(followingInterestUser.getUser().roomId));
                        arrayList2.add(followingInterestUser.getUser().getUid());
                    }
                }
                map.put("room_id_list", arrayList.toString());
                map.put("anchor_id_list", arrayList2.toString());
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_prefetch_data", str);
            }
            c0jamLIZLLL.LJIIJ(null, null, null, map, z);
        }
        if (z3) {
            C1597740rgC.LIZ.getClass();
            C1597740rgC.LIZLLL = System.currentTimeMillis();
        }
        if (z4) {
            C1597740rgC.LIZ.getClass();
            C1597740rgC.LJ = System.currentTimeMillis();
            C1597740rgC.LIZLLL = System.currentTimeMillis();
        }
        if (z2) {
            FollowingInterestUser followingInterestUser2 = (FollowingInterestUser) C13LP.LJJJLL(list);
            if (followingInterestUser2 != null && (logPbBean = followingInterestUser2.getLogPbBean()) != null) {
                C1597740rgC c1597740rgC = C1597740rgC.LIZ;
                String imprId = logPbBean.getImprId();
                c1597740rgC.getClass();
                if (imprId == null) {
                    imprId = "";
                }
                C1597740rgC.LJIIJJI = imprId;
            }
            C1597740rgC.LIZ.getClass();
            C1597740rgC.LJ = System.currentTimeMillis();
            C1597740rgC.LIZLLL = System.currentTimeMillis();
        }
    }
}
