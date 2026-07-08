package com.ss.android.ugc.aweme.search.entry.searchbox.ui;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C04VZ;
import X.C06RN;
import X.C07BG;
import X.C0QSJ;
import X.C0SUS;
import X.C0T2X;
import X.C0T2Y;
import X.C1017070cZd;
import X.C13011057h;
import X.C1386360mBG;
import X.C13LE;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1594330rah;
import X.C1594340rai;
import X.C1620830sHR;
import X.C1637806bA;
import X.C1906580ziK;
import X.C1908480zlO;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C20656615sK;
import X.C2217381BqS;
import X.C299750Boz;
import X.C337180DJs;
import X.C452501pT;
import X.C622680Oba;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C740390T2n;
import X.C740400T2o;
import X.C740740T3w;
import X.C786410Ut5;
import X.EnumC1594380ram;
import X.EnumC1594410rap;
import X.EnumC452301pR;
import X.EnumC682820QqO;
import X.InterfaceC1146704e9;
import X.InterfaceC1565950qqv;
import X.InterfaceC1594350raj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC671160QUg;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceProviderImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.entry.searchbox.communication.SearchBoxComponentScope;
import com.ss.android.ugc.aweme.search.entry.searchbox.repo.SearchBoxTimeData;
import com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SearchBoxContainerAssem extends BasePanelUIComponent implements C0T2Y, C06RN, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final SearchBoxContainerAssem LLJIJIL = this;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C1594330rah LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public C0T2X LLJJIJI;
    public InterfaceC1594350raj LLJJIJIIJIL;
    public InterfaceC1594350raj LLJJIJIL;
    public boolean LLJJJ;
    public final C1620830sHR LLJJJIL;
    public final C1594340rai LLJJJJ;
    public C06RN LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchBoxContainerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/entry/searchbox/viewmodel/SearchBoxFYPViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0rai] */
    public SearchBoxContainerAssem() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 889), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 10));
        }
        this.LLJILJIL = c01gwLIZIZ;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 890));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchBoxFYPViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 888), AFwS264S0000000_24.get$arr$(273), null, true);
        this.LLJJJIL = new C1620830sHR(this, 5);
        this.LLJJJJ = new C0SUS() { // from class: X.0rai
            @Override // X.C0SUS
            public final void LIZ(int i) {
                SearchBoxFYPViewModel searchBoxFYPViewModelGo = this.LIZ.Go();
                if (i != 0) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594380ram.HIDE_TOP_TAB, null, false);
                }
            }

            @Override // X.C0SUS
            public final void LIZIZ(float f) {
                SearchBoxFYPViewModel searchBoxFYPViewModelGo = this.LIZ.Go();
                if (f == 0.0f) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594380ram.HIDE_TOP_TAB_ALPHA, null, false);
                }
            }
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C06RN.class) {
            this.LLJJJJJIL = (C06RN) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchBoxComponentScope.class, SearchBoxComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C06RN.class) {
            return this.LLJJJJJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchBoxComponentScope.class);
        arrayList.add(SearchBoxComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchBoxComponentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C06RN.class) {
            this.LLJJJJJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final SearchBoxFYPViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SearchBoxFYPViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJJ) {
            return;
        }
        Go().JM2(EnumC1594380ram.DESTROY, null, false);
        Oa(true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C1906580ziK.LJI()) {
            return;
        }
        Go().JM2(EnumC1594380ram.CHANGE_NEXT_PAGE, null, false);
    }

    @Override // X.C06RN
    public final void Oa(boolean z) {
        AbstractC738140SxQ abstractC738140SxQ;
        ViewGroup viewGroup;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJILJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLJJJIL);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Boolean boolValueOf = null;
        if (c19egLIZ != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                SearchBoxFYPViewModel searchBoxFYPViewModelGo = Go();
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                Hox.LLJILJIL.LIZ(c19egLIZ).OQ2(searchBoxFYPViewModelGo.LLILZLL);
                searchBoxFYPViewModelGo.LLILLL.LIZIZ(null);
                C622680Oba.LIZLLL(searchBoxFYPViewModelGo);
                IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
                if (iAutoAScrollAbilityLIZIZ != null) {
                    iAutoAScrollAbilityLIZIZ.mb1((Function1) searchBoxFYPViewModelGo.LLILZIL.getValue());
                }
                IPausePanelAbility iPausePanelAbility = (IPausePanelAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPausePanelAbility.class, null);
                if (iPausePanelAbility != null) {
                    iPausePanelAbility.WI1(searchBoxFYPViewModelGo.LLIZ);
                }
                FeedSkylightServiceProviderImpl.LJIIIIZZ().LJ().LJJIZ(fragmentLJI, searchBoxFYPViewModelGo.LLIZLLLIL);
                C1908480zlO.LIZIZ.LJI(searchBoxFYPViewModelGo.LLJ);
            }
            C0T2X c0t2x = this.LLJJIJI;
            if (c0t2x != null) {
                C740740T3w.LJIIIZ(c19egLIZ, c0t2x);
            }
        }
        C337180DJs.LIZ(LJJIJL());
        InterfaceC1594350raj interfaceC1594350raj = this.LLJJIJIIJIL;
        if (interfaceC1594350raj != null) {
            interfaceC1594350raj.LIZ(this.LLJJJJ);
        }
        InterfaceC1594350raj interfaceC1594350raj2 = this.LLJJIJIL;
        if (interfaceC1594350raj2 != null) {
            interfaceC1594350raj2.LIZ(this.LLJJJJ);
        }
        C1594330rah c1594330rah = this.LLJJ;
        if (c1594330rah != null) {
            if (c1594330rah.LLILZIL) {
                C20656615sK c20656615sK = c1594330rah.LLILZ;
                if (c20656615sK != null) {
                    c20656615sK.LIZ();
                }
            } else {
                c1594330rah.LLILZLL = false;
            }
        }
        this.LLJJ = null;
        C723850SaN.LJII(this, C13LE.LIZ(SearchBoxSlotAssem.class), null);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        if (z) {
            return;
        }
        this.LLJJJ = true;
        if (((Boolean) C07BG.LIZ.getValue()).booleanValue() && getLifecycle().getCurrentState() == Lifecycle.State.INITIALIZED) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C13011057h(this, null));
            return;
        }
        LifecycleOwner parent = getParent();
        if ((parent instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) parent) != null) {
            boolValueOf = Boolean.valueOf(C723850SaN.LJII(abstractC738140SxQ, C13LE.LIZ(SearchBoxContainerAssem.class), null));
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1AF0.LIZJ("search box release failed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0QUf] */
    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        C19EG c19egLIZ;
        FeedPanelStateViewModel feedPanelStateViewModel;
        boolean z;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            SearchBoxFYPViewModel searchBoxFYPViewModelGo = Go();
            searchBoxFYPViewModelGo.LL = aweme;
            SearchBoxFYPViewModel.LLJIJIL.getClass();
            if (SearchBoxFYPViewModel.LLJILJILJ != EnumC682820QqO.HIDDEN && SearchBoxFYPViewModel.LLJILJILJ == EnumC682820QqO.NOT_SHOWED) {
                if (C1017070cZd.LLIZLLLIL(aweme)) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594410rap.FULL_SCREEN_AD, null, false);
                } else if (aweme.isAd()) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594410rap.NORMAL_AD, null, false);
                } else if (AwemeSaaSExtKt.isLive(aweme)) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594410rap.SCREEN_LIVE, null, false);
                } else if (AwemeExtKt.isPhotoMode(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1) {
                    searchBoxFYPViewModelGo.JM2(EnumC1594410rap.MULTI_PHOTO, null, false);
                } else {
                    try {
                        feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(c19egLIZ).get(FeedPanelStateViewModel.class);
                        boolean z2 = C740400T2o.LIZ;
                        C740390T2n.LIZ();
                        z = !z2;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (Intrinsics.LJFF(feedPanelStateViewModel.LLILLJJLI.getValue(), Boolean.TRUE) || z) {
                        searchBoxFYPViewModelGo.JM2(EnumC1594410rap.NEW_USER_GUIDANCE, null, false);
                    } else {
                        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
                        if (pnSDigitalWellbeingSDKService != null && pnSDigitalWellbeingSDKService.LJIIL()) {
                            searchBoxFYPViewModelGo.JM2(EnumC1594410rap.SCREEN_TIME, null, false);
                        } else {
                            Context context = getContext();
                            if (context == null) {
                                return;
                            }
                            C1594330rah c1594330rah = new C1594330rah(context, this, new InterfaceC671160QUg() { // from class: X.0QUf
                                @Override // X.InterfaceC671160QUg
                                public final void LIZ() {
                                    Long l;
                                    SearchBoxFYPViewModel searchBoxFYPViewModelGo2 = this.LIZ.Go();
                                    SearchBoxFYPViewModel.LLJIJIL.getClass();
                                    if (SearchBoxFYPViewModel.LLJILJILJ != EnumC682820QqO.HIDDEN) {
                                        int i = C04SL.LIZ;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        SearchBoxTimeData searchBoxTimeDataLIZ = C0QFI.LIZ();
                                        List<Long> list = searchBoxTimeDataLIZ.showedTime;
                                        int i2 = C04SL.LIZ;
                                        List listLLD = C13LP.LLD(i2, list);
                                        Pair pair = new Pair(Boolean.valueOf(i2 < 1 || jCurrentTimeMillis - ((listLLD.size() < i2 || (l = (Long) C13LP.LJJLL(listLLD)) == null) ? 0L : l.longValue()) < C19990113Jj.LJIIIZ(C19990313Jl.LJII(24, EnumC19990213Jk.HOURS))), Boolean.valueOf(jCurrentTimeMillis - searchBoxTimeDataLIZ.clickedTime < C19990113Jj.LJIIIZ(C19990313Jl.LJII(24, EnumC19990213Jk.HOURS))));
                                        if (((Number) C04VY.LIZ.getValue()).intValue() == 0) {
                                            if (((Boolean) pair.getFirst()).booleanValue()) {
                                                searchBoxFYPViewModelGo2.JM2(EnumC1594410rap.SHOW_THRESHOLD_REACHED, null, false);
                                                return;
                                            } else if (((Boolean) pair.getSecond()).booleanValue()) {
                                                searchBoxFYPViewModelGo2.JM2(EnumC1594410rap.CLICK_THRESHOLD_REACHED, null, false);
                                                return;
                                            }
                                        }
                                        this.LIZ.Go().wQ2(false);
                                    }
                                }
                            });
                            this.LLJJ = c1594330rah;
                            PopupManager.LJIJI(c1594330rah, true);
                            return;
                        }
                    }
                }
            }
            if (((Boolean) C04VZ.LIZ.getValue()).booleanValue()) {
                this.LLJJIII = false;
                return;
            }
            return;
        }
        Go().vQ2(aweme, 0, false);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchBoxComponentScope.class}).unbindAbility(this.LLJIJIL, C06RN.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxContainerAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchBoxComponentScope.class}).bindAbility(this.LLJIJIL, C06RN.class);
    }
}
