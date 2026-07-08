package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C09JN;
import X.C0CN5;
import X.C0DMM;
import X.C0J4Y;
import X.C0PLT;
import X.C0S4U;
import X.C0SR4;
import X.C1389300mG0;
import X.C13BV;
import X.C13LP;
import X.C1559690qgp;
import X.C1564360qoM;
import X.C1564640qoo;
import X.C1566140qrE;
import X.C1568210quZ;
import X.C1568230qub;
import X.C1568240quc;
import X.C1568260que;
import X.C1602310rnZ;
import X.C1602410rnj;
import X.C1602450rnn;
import X.C1602460rno;
import X.C1602470rnp;
import X.C1602480rnq;
import X.C1602530rnv;
import X.C1602610ro3;
import X.C1602660ro8;
import X.C1906580ziK;
import X.C19EG;
import X.C2189821An6;
import X.C290020BYi;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C691710RBh;
import X.C724240Sb0;
import X.EnumC1602400rni;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1564100qnw;
import X.InterfaceC1565950qqv;
import X.InterfaceC1602300rnY;
import X.InterfaceC1616070s9l;
import X.InterfaceC481880Iv4;
import X.InterfaceC494301wD;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS24S0210000_24;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ab.FeedRegisterFrontierConfig;
import com.ss.android.ugc.aweme.ab.GapFixConfig;
import com.ss.android.ugc.aweme.ab.LiveRegisterWhenFeedResumedConfig;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedLiveStatusManagerComponent extends BasePanelComponent implements IFeedDataChangeAbility, FeedLiveStatusAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJLIL = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL = true;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C630740Ooa LLJI;
    public long LLJIJIL;
    public final C01GW LLJILJIL;
    public final C630740Ooa LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public long LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -843579490 || iHashCode == 1151031449) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusAbility
    public final void Cn1() {
        C691710RBh.LIZ(this, "event_on_live_first_frame", null);
    }

    public final int LJLLJ() {
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLJI.getValue();
        if (iViewPagerAbility != null) {
            return iViewPagerAbility.LJIL();
        }
        return 0;
    }

    public final C1602310rnZ fo() {
        return (C1602310rnZ) this.LLJJJJJIL.getValue();
    }

    public final List<Aweme> getAwemeList() {
        C0SR4 c0sr4Zv0;
        List<Aweme> listFg;
        List<Aweme> items;
        if (((Boolean) this.LLJJ.getValue()).booleanValue()) {
            DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLJ.getValue();
            return (dataLayerAbility == null || (items = dataLayerAbility.getItems()) == null) ? C13BV.INSTANCE : items;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLIZLLLIL.getValue();
        return (iFeedPanelPlatformAbility == null || (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) == null || (listFg = c0sr4Zv0.Fg()) == null) ? C13BV.INSTANCE : listFg;
    }

    public final InterfaceC1602300rnY ho() {
        return (InterfaceC1602300rnY) this.LLJILJIL.getValue();
    }

    public final boolean mo() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    public final boolean oo() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    public FeedLiveStatusManagerComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1542), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559690qgp(false, this));
        }
        this.LLIZLLLIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1543), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 27));
        }
        this.LLJ = c01gwLIZIZ2;
        this.LLJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 1544));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(411));
        this.LLJILJILJ = C628500Oky.LIZ(new C1564640qoo(this));
        this.LLJILLL = C452501pT.LIZIZ(new C290020BYi());
        this.LLJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(412));
        this.LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(414));
        this.LLJJIII = C452501pT.LIZIZ(new C1602460rno());
        this.LLJJIJI = C452501pT.LIZIZ(new C1602470rnp());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(413));
        this.LLJJIJIL = C452501pT.LIZIZ(new C1568240quc(this));
        this.LLJJJJ = C452501pT.LIZIZ(new C1602450rnn(this));
        this.LLJJJJJIL = C452501pT.LIZIZ(new C1602410rnj(this));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C1568230qub(this));
        this.LLJL = C452501pT.LIZIZ(new C1568210quZ(this));
    }

    public final boolean bo() {
        return C1389300mG0.LJIIIIZZ(getPanelContext()) && ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final String ko() {
        String eventType;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null && (eventType = c2189821An6.getEventType()) != null) {
            return eventType;
        }
        String str = getPanelContext().LIZ;
        int iHashCode = str.hashCode();
        return iHashCode != -1525083535 ? iHashCode != 984907784 ? (iHashCode == 1064558965 && str.equals("Friends")) ? "homepage_friends" : "" : str.equals("For You") ? "homepage_hot" : "" : str.equals("Following") ? "homepage_follow" : "";
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C1389300mG0.LJIL(getPanelContext()) && ((Boolean) this.LLJILLL.getValue()).booleanValue() && ((Boolean) this.LLJJIII.getValue()).booleanValue()) {
            ((InterfaceC1564100qnw) this.LLJJJJ.getValue()).release();
        }
        ho().LJIILLIIL(ko());
        if (bo()) {
            ho().LJIILJJIL((InterfaceC481880Iv4) this.LLJL.getValue(), "following_live_head");
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        IViewPagerComponentAbility iViewPagerComponentAbility2;
        super.onParentViewCreated();
        if (C1389300mG0.LJIL(getPanelContext())) {
            this.LLJJJ = true;
            if (((GapFixConfig) C1602660ro8.LIZIZ.getValue()).clearSession) {
                C1564360qoM.LIZ.getClass();
                C1564360qoM.LIZ();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).F5().LIZ();
            }
        }
        if (C1389300mG0.LJIL(getPanelContext()) && ((Boolean) this.LLJILLL.getValue()).booleanValue() && ((Boolean) this.LLJJIII.getValue()).booleanValue()) {
            C0CN5.LIZ(false, true, 20000L, new ARunnableS124S0100000_24(this, 81));
        }
        if (C1389300mG0.LJIL(getPanelContext()) && ((FeedRegisterFrontierConfig) C1602610ro3.LIZIZ.getValue()).enable) {
            C01GW c01gw = C1602610ro3.LIZIZ;
            final int i = ((FeedRegisterFrontierConfig) c01gw.getValue()).startIndex;
            final int i2 = ((FeedRegisterFrontierConfig) c01gw.getValue()).endIndex;
            final boolean z = C1602530rnv.LIZ().mainEnable;
            boolean z2 = ((LiveRegisterWhenFeedResumedConfig.ResumedConfig) LiveRegisterWhenFeedResumedConfig.LIZIZ.getValue()).frontierHotUpdate;
            if (!oo() && (iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LLJI.getValue()) != null) {
                iViewPagerComponentAbility2.Bv0(new InterfaceC1616070s9l() { // from class: X.0rnw
                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onBeforePageChange() {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i3) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrolled(int i3, float f, int i4) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageSelected(int i3) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageSelected(int i3, boolean z3) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageUnSelected(C0SZ8 c0sz8) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i3) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i3, boolean z3) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageScrolledEnd(int i3, float f, int i4) {
                        this.LL.so(i, i2, z);
                    }
                });
            }
            C1906580ziK.LIZJ().LIZ().LJLLLL(getLifecycle(), new C09JN() { // from class: X.0rnl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("FeedLiveStatusManagerComponent@e134.addRoomStateChangeListener$1");
                    C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
                    if (c606810Nr5 != null && c606810Nr5.LIZIZ) {
                        this.LL.LLILZLL = false;
                    }
                    C1C7U.LIZIZ("FeedLiveStatusManagerComponent@e134.addRoomStateChangeListener$1");
                }
            });
            this.LLJJJJLIIL = z;
            this.LLJJL = z2;
            ho().LJIILIIL((InterfaceC481880Iv4) this.LLJJLIIIJLLLLLLLZ.getValue(), ko());
            FeedRegisterFrontierConfig feedRegisterFrontierConfig = (FeedRegisterFrontierConfig) c01gw.getValue();
            C0CN5.LIZ(false, true, feedRegisterFrontierConfig.maxDelayTime, new ARunnableS24S0210000_24(feedRegisterFrontierConfig, z, this, 1));
        } else if (bo()) {
            final int i3 = C1568260que.LIZ().startIndex;
            final int i4 = C1568260que.LIZ().endIndex;
            if (!oo() && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJI.getValue()) != null) {
                iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0rny
                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onBeforePageChange() {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i5) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrolled(int i5, float f, int i6) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageSelected(int i5) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageSelected(int i5, boolean z3) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageUnSelected(C0SZ8 c0sz8) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i5) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i5, boolean z3) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageScrolledEnd(int i5, float f, int i6) {
                        this.LL.so(i3, i4, false);
                    }
                });
            }
            ho().LIZLLL((InterfaceC481880Iv4) this.LLJL.getValue(), "following_live_head");
        }
        C0CN5.LIZ(false, true, 2500L, new ARunnableS124S0100000_24(this, 82));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLILLL = true;
        this.LLILZ = System.currentTimeMillis();
        if (C1389300mG0.LJIL(getPanelContext())) {
            fo().LJIIIZ = true;
            Hox hox = (Hox) this.LLJILJILJ.getValue();
            if (hox != null && hox.KQ2("For You") && mo()) {
                this.LLJJJ = false;
                this.LLJJJIL = SystemClock.uptimeMillis();
                uo("timed_trigger_rule_end", new JSONObject());
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Hox hox;
        C19EG activity;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        super.onResume();
        if (this.LLILLL) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (Intrinsics.LJFF((fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) ? null : homeTabAbilityLIZ.tK0(), C724240Sb0.LJI(this))) {
                EnumC1602400rni enumC1602400rni = this.LLILZLL ? EnumC1602400rni.SWITCH_PAGE : EnumC1602400rni.BACKGROUND;
                long jMax = Math.max(System.currentTimeMillis() - this.LLILZ, 0L);
                if (C1389300mG0.LJIL(getPanelContext())) {
                    fo().LJIIZILJ(enumC1602400rni, jMax / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                if (C1389300mG0.LJIL(getPanelContext()) && (hox = (Hox) this.LLJILJILJ.getValue()) != null && hox.KQ2("For You")) {
                    vo();
                }
            }
        }
        this.LLILLL = false;
        this.LLILZ = 0L;
        this.LLILZLL = true;
    }

    public final void vo() {
        if (mo()) {
            uo("timed_trigger_rule_start", new JSONObject());
            if (!this.LLJJJ && (SystemClock.uptimeMillis() - this.LLJJJIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > C1602480rnq.LIZ().selectedGap) {
                uo("will_appear_trigger_event", new JSONObject());
            }
            this.LLJJJ = true;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.IFeedDataChangeAbility
    public final void kh1(List<? extends FollowFeed> list) {
        String uid;
        String uid2;
        if (bo()) {
            int i = -1;
            if (C1568260que.LIZ().followingHeadEnable) {
                i = (-1) + C1568260que.LIZ().followingRegisterIndex;
            }
            int i2 = 0;
            if (i >= 0) {
                int iLJLLJ = LJLLJ();
                if (iLJLLJ > i) {
                    i2 = iLJLLJ - i;
                }
                List<Aweme> awemeList = getAwemeList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = awemeList.size();
                while (i2 < size) {
                    Aweme aweme = (Aweme) ListProtector.get(awemeList, i2);
                    if (C0J4Y.LIZ(aweme)) {
                        User author = aweme.getAuthor();
                        if (author != null) {
                            uid2 = author.getUid();
                        } else {
                            uid2 = null;
                        }
                        linkedHashSet.add(String.valueOf(uid2));
                    }
                    i2++;
                }
                ho().LJIJ(5, "following_live_head", linkedHashSet, oo());
                return;
            }
            if (list != null && (!((CopyOnWriteArrayList) list).isEmpty())) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                int size2 = copyOnWriteArrayList.size();
                while (i2 < size2) {
                    Aweme aweme2 = ((C0PLT) ListProtector.get(copyOnWriteArrayList, i2)).getAweme();
                    if (C0J4Y.LIZ(aweme2)) {
                        User author2 = aweme2.getAuthor();
                        if (author2 != null) {
                            uid = author2.getUid();
                        } else {
                            uid = null;
                        }
                        linkedHashSet2.add(String.valueOf(uid));
                    }
                    i2++;
                }
                ho().LJIJ(5, "following_live_head", linkedHashSet2, oo());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        Hox hox;
        super.onPagePause(i);
        this.LLILLJJLI = true;
        this.LLILZIL = System.currentTimeMillis();
        if (C1389300mG0.LJIL(getPanelContext())) {
            fo().LJIIIZ = true;
        }
        if (C1389300mG0.LJIL(getPanelContext()) && (hox = (Hox) this.LLJILJILJ.getValue()) != null && hox.KQ2("For You") && mo()) {
            this.LLJJJ = false;
            this.LLJJJIL = SystemClock.uptimeMillis();
            uo("timed_trigger_rule_end", new JSONObject());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        Hox hox;
        super.onPageResume(i);
        if (this.LLILLJJLI) {
            long jMax = Math.max(System.currentTimeMillis() - this.LLILZIL, 0L);
            if (C1389300mG0.LJIL(getPanelContext())) {
                fo().LJIIZILJ(EnumC1602400rni.SWITCH_TAB, jMax / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (C1389300mG0.LJIL(getPanelContext()) && (hox = (Hox) this.LLJILJILJ.getValue()) != null && hox.KQ2("For You")) {
                vo();
            }
        }
        this.LLILLJJLI = false;
        this.LLILZIL = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /* JADX WARN: Type inference failed for: r0v92, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v93, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v94, types: [T, java.util.ArrayList] */
    @Override // com.ss.android.ugc.feed.platform.panel.live.IFeedDataChangeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tD1(final com.ss.android.ugc.aweme.feed.model.FeedItemList r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent.tD1(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    public final void wo(Set<String> set) {
        if (!set.isEmpty()) {
            ho().LJIJ(5, "fyp_preview_card", set, oo());
            this.LL = false;
        } else {
            if (!this.LL) {
                ho().LJIJ(5, "fyp_preview_card", set, oo());
            }
            this.LL = true;
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m339do(List<? extends Aweme> list, boolean z) {
        String uid;
        LiveRoomStruct liveRoomStructLJI;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            if (z && C0J4Y.LJIIIIZZ(aweme) && (liveRoomStructLJI = C0J4Y.LJI(aweme)) != null) {
                linkedHashSet2.add(String.valueOf(liveRoomStructLJI.ownerUserId));
            }
            if (C0J4Y.LIZ(aweme)) {
                User author = aweme.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                linkedHashSet.add(String.valueOf(uid));
            }
        }
        ho().LJIJI(5, "homepage_hot", linkedHashSet, oo());
        wo(linkedHashSet2);
    }

    public final long lo(long j, boolean z) {
        if (z) {
            this.LLJIJIL = j;
            return j;
        }
        long j2 = this.LLJIJIL;
        if (j2 == 0) {
            Aweme aweme = (Aweme) C13LP.LJJLIIIJL(getAwemeList());
            if (aweme != null) {
                return AwemeBizExtKt.getClientAcceptanceTime(aweme);
            }
            return 0L;
        }
        return j2;
    }

    public final boolean uo(String str, JSONObject jSONObject) {
        return ((InterfaceC1564100qnw) this.LLJJJJ.getValue()).onEvent(str, jSONObject);
    }

    public final void so(int i, int i2, boolean z) {
        C0SR4 c0sr4Zv0;
        String str;
        Aweme item;
        String uid;
        User author;
        LiveRoomStruct liveRoomStructLJI;
        int iLJLLJ = LJLLJ();
        C1602310rnZ c1602310rnZFo = fo();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLIZLLLIL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0();
        } else {
            c0sr4Zv0 = null;
        }
        int i3 = iLJLLJ - c1602310rnZFo.LJI;
        if (i3 >= i) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int i4 = c1602310rnZFo.LJI;
            int i5 = i4 + i2;
            while (i4 < i5) {
                if (c0sr4Zv0 != null) {
                    item = c0sr4Zv0.getItem(i4);
                } else {
                    item = null;
                }
                if (z && C0J4Y.LJIIIIZZ(item) && (liveRoomStructLJI = C0J4Y.LJI(item)) != null) {
                    linkedHashSet2.add(String.valueOf(liveRoomStructLJI.ownerUserId));
                }
                if (C0J4Y.LIZ(item)) {
                    if (item == null || (author = item.getAuthor()) == null || (uid = author.getUid()) == null) {
                        uid = "";
                    }
                    linkedHashSet.add(uid);
                }
                i4++;
            }
            if (Intrinsics.LJFF(c1602310rnZFo.LIZIZ, "homepage_follow")) {
                str = "following_live_head";
            } else {
                str = "homepage_hot";
            }
            c1602310rnZFo.LJ().LJIJI(6, str, linkedHashSet, false);
            if (!linkedHashSet2.isEmpty()) {
                c1602310rnZFo.LJ().LJIJ(6, "fyp_preview_card", linkedHashSet2, false);
            }
            c1602310rnZFo.LJI += i2;
            return;
        }
        if (i3 <= 0) {
            int i6 = iLJLLJ - i2;
            if (i6 > 0) {
                c1602310rnZFo.LJI = i6;
            } else {
                c1602310rnZFo.LJI = 0;
            }
        }
    }
}
