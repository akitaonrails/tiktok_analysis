package com.ss.android.ugc.feed.platform.cell.component.stickermanager;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C0B8G;
import X.C0OD3;
import X.C0R60;
import X.C0R99;
import X.C0R9A;
import X.C0R9B;
import X.C0R9C;
import X.C0R9D;
import X.C0R9F;
import X.C0R9G;
import X.C0R9H;
import X.C0R9I;
import X.C0RAX;
import X.C0RF0;
import X.C0RF5;
import X.C0RF6;
import X.C0RF7;
import X.C0RF8;
import X.C0RFA;
import X.C0RFB;
import X.C0RFC;
import X.C0RFE;
import X.C0RFF;
import X.C0RFL;
import X.C0RFT;
import X.C10EU;
import X.C1388190mED;
import X.C13LE;
import X.C1483410ohn;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1591220rVg;
import X.C1866270yfJ;
import X.C19591211ks;
import X.C19592311l3;
import X.C19597311lr;
import X.C19603011mm;
import X.C19607711nX;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C360660ECa;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C694890RNn;
import X.C705920RmY;
import X.C705930RmZ;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.EnumC19589411ka;
import X.EnumC19597411ls;
import X.InterfaceC1554640qYg;
import X.InterfaceC19578611iq;
import X.InterfaceC19597711lv;
import X.InterfaceC386401eo;
import X.InterfaceC494301wD;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS54S0010000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CellStickerManagerComponent extends BaseCellContentComponent<CellStickerManagerComponent> implements C0R9I, InterfaceC386401eo, CellStickerComponentAbility, InterfaceC1554640qYg {
    public boolean LLJJL;
    public FrameLayout LLJLLL;
    public C0RFT LLJZ;
    public FrameLayout LLJZIJLIL;
    public C705930RmZ LLLF;
    public boolean LLLIIII;
    public long LLLIIIIL;
    public boolean LLLIIIL;
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new C0RAX(this));
    public final C0RF6 LLJJLIIIJLLLLLLLZ = new C360660ECa() { // from class: X.0RF6
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            if (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_story_video") && i == 1) {
                this.LL.mp().dismissStoryInnerSocialStickerBubble();
            }
        }
    };
    public final C0RF5 LLJL = new AbstractC712240Rwk() { // from class: X.0RF5
        @Override // X.AbstractC712240Rwk
        public final void onPageScrollStateChanged(int i) {
            if (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_story_video") && i == 1) {
                this.LL.mp().dismissStoryInnerSocialStickerBubble();
            }
        }
    };
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C0R9G(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C0R9F(this));
    public final C01GW LLJLL = C452501pT.LIZIZ(new C0R9H());
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C0RFB());
    public List<InteractStickerStruct> LLL = new ArrayList();
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(255));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new C0RFA(this));
    public final C01GW LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0RFC());
    public final MutableLiveData<Boolean> LLLI = new MutableLiveData<>(Boolean.FALSE);
    public final MutableLiveData<Integer> LLLII = new MutableLiveData<>(0);

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RFG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, null, new C0R99(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RF9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLIZLLLIL;
            }
        }, null, new C0R9B(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RFH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, null, new C0R9A(), 6);
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q5()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0R9f
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, new C0R9C(), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RFI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, new C0R9D(), 6);
        }
        if (Intrinsics.LJFF(jm().LIZ(), "cell_story_video")) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0R9e
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJIJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(202), 4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void p(int i) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -972069985) {
            return null;
        }
        return this;
    }

    public final void hp() {
        Fragment fragment;
        UserFeedViewPagerAbility userFeedViewPagerAbility;
        if (this.LLJJL) {
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLJJJJLIIL.getValue();
            if (iViewPagerAbility != null) {
                iViewPagerAbility.By1(this.LLJJLIIIJLLLLLLLZ);
            }
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null && (fragment = c0rf0.LIZJ) != null && (userFeedViewPagerAbility = (UserFeedViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserFeedViewPagerAbility.class, null)) != null) {
                userFeedViewPagerAbility.vE1(this.LLJL);
            }
            this.LLJJL = false;
        }
    }

    public final C705920RmY lp() {
        return (C705920RmY) this.LLJLIL.getValue();
    }

    public final IToolsBusinessService mp() {
        return (IToolsBusinessService) this.LLLFF.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void BT() {
        FrameLayout frameLayout;
        if (Intrinsics.LJFF("cell_story", jm().LIZ()) || (frameLayout = this.LLJZIJLIL) == null) {
            return;
        }
        HandlerHook.viewPost(frameLayout, new Runnable() { // from class: X.0RF4
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CellStickerManagerComponent@f041.notifyAfterStickerRootResize$1");
                try {
                    FrameLayout frameLayout2 = this.LL.LLJZIJLIL;
                    if (frameLayout2 != null && frameLayout2.getParent() != null) {
                        CellStickerManagerComponent cellStickerManagerComponent = this.LL;
                        cellStickerManagerComponent.sp(((VideoItemParams) C631370Opb.LIZ(cellStickerManagerComponent)).getAweme());
                        this.LL.LLLIIII = true;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CellStickerManagerComponent@f041.notifyAfterStickerRootResize$1");
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        if (Intrinsics.LJFF(jm().LIZ(), "cell_story_video")) {
            mp().dismissStoryInnerSocialStickerBubble();
        }
        C705920RmY c705920RmYLp = lp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        c705920RmYLp.LJIIIIZZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        this.LLLIIIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        C705920RmY c705920RmYLp = lp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        c705920RmYLp.LJIIJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        lp().LIZLLL();
    }

    @Override // X.InterfaceC386401eo
    public final long LLL() {
        return C1483410ohn.LJLJJI().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void PQ() {
        AbsInteractStickerWidget absInteractStickerWidget = lp().LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
    }

    @Override // X.C0R9I
    public final AbsInteractStickerWidget c6() {
        InteractStickerWidget interactStickerWidgetLIZ = ((IStickerService) ServiceManager.get().getService(IStickerService.class)).LIZ();
        String str = Intrinsics.LJFF(jm().LIZ(), "cell_story_video") ? "STORY" : "FEED";
        interactStickerWidgetLIZ.LLJIJIL = this;
        interactStickerWidgetLIZ.LLJJJIL = str;
        C0RF0 c0rf0 = jm().LIZLLL;
        WidgetManager.SR(LJJIJL(), c0rf0 != null ? c0rf0.LIZJ : null).PR(R.id.kvf, interactStickerWidgetLIZ);
        interactStickerWidgetLIZ.LJJIFFI(C1558520qew.LJIIL(this));
        return interactStickerWidgetLIZ;
    }

    public final void ep() {
        BaseFeedPageParams baseFeedPageParams;
        if (Intrinsics.LJFF("cell_story", jm().LIZ()) || (baseFeedPageParams = jm().LJ) == null || baseFeedPageParams.isPlayListCleanMode()) {
            return;
        }
        C705920RmY c705920RmYLp = lp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        c705920RmYLp.LJIIJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        lp().LJFF = C1483410ohn.LJLJJI();
        lp().getClass();
        lp().LIZJ();
    }

    public final void ip() {
        Fragment fragment;
        if (!Intrinsics.LJFF(jm().LIZ(), "cell_story_video") || this.LLJJL) {
            return;
        }
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLJJJJLIIL.getValue();
        C0RF0 c0rf0 = jm().LIZLLL;
        UserFeedViewPagerAbility userFeedViewPagerAbility = null;
        if (c0rf0 != null && (fragment = c0rf0.LIZJ) != null) {
            userFeedViewPagerAbility = (UserFeedViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserFeedViewPagerAbility.class, null);
        }
        if (iViewPagerAbility != null) {
            iViewPagerAbility.LLJJI(this.LLJJLIIIJLLLLLLLZ);
            if (userFeedViewPagerAbility != null) {
            }
            this.LLJJL = true;
        } else if (userFeedViewPagerAbility == null) {
            return;
        }
        userFeedViewPagerAbility.yR(this.LLJL);
        this.LLJJL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        hp();
        AbsInteractStickerWidget absInteractStickerWidget = lp().LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.onDestroyView();
        }
        if (C1591220rVg.LIZLLL()) {
            C0RFT c0rft = this.LLJZ;
            if (c0rft != null) {
                c0rft.destroy();
            }
            this.LLJZ = null;
            this.LLLF = null;
            ((ArrayList) this.LLL).clear();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        hp();
        C0RFT c0rft = this.LLJZ;
        if (c0rft != null) {
            c0rft.destroy();
        }
        this.LLJZ = null;
        this.LLLF = null;
        this.LLL.clear();
        this.LLLIIII = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void Es(boolean z) {
        InteractStickerViewModel interactStickerViewModel;
        C705920RmY c705920RmYLp = lp();
        if (c705920RmYLp.LJIIJJI != null && (interactStickerViewModel = c705920RmYLp.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(Boolean.valueOf(z), "interact_text_translate_status");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q5()) {
            this.LLLII.setValue(2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void LLLLIL(Aweme aweme) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q5()) {
            this.LLLII.setValue(1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final boolean mZ1(long j) {
        Iterator<InteractStickerStruct> it2 = this.LLL.iterator();
        while (it2.hasNext()) {
            List<NormalTrackTimeStamp> trackTimeStampCache = it2.next().getTrackTimeStampCache();
            if (trackTimeStampCache != null) {
                for (NormalTrackTimeStamp normalTrackTimeStamp : trackTimeStampCache) {
                    if (normalTrackTimeStamp.timeIsValid()) {
                        float f = j;
                        if (f >= normalTrackTimeStamp.getStartTime() && f <= normalTrackTimeStamp.getEndTime()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLL = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.kvf);
        if (Intrinsics.LJFF(jm().LIZ(), "cell_story_video")) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 73));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void op(Aweme aweme) {
        String str;
        String str2;
        String str3;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        Long lValueOf;
        String str4;
        String str5;
        long jLongValue;
        long j;
        String str6;
        String str7;
        C0R60 c0r604;
        C0R60 c0r605;
        Long expiredTime;
        C0R60 c0r606;
        C0R60 c0r607;
        for (InteractStickerStruct interactStickerStruct : (ArrayList) this.LLL) {
            int type = interactStickerStruct.getType();
            int scenario = 0;
            ?? LJFF = 0;
            String userId = null;
            User user = null;
            if (type != 8 && type != 9) {
                if (type != 25) {
                    if (type == 88) {
                        C0OD3 c0od3 = C0OD3.LIZ;
                        AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
                        C705930RmZ c705930RmZ = this.LLLF;
                        c0od3.getClass();
                        C0OD3.LIZIZ(addYoursStickerStruct, aweme, c705930RmZ);
                    }
                } else {
                    C0RFE c0rfe = new Object() { // from class: X.0RFE
                    };
                    C705930RmZ c705930RmZ2 = this.LLLF;
                    c0rfe.getClass();
                    ?? c2344009Gk = new C2344009Gk();
                    CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                    if (countDownStickerStruct != null) {
                        lValueOf = Long.valueOf(countDownStickerStruct.getEventId());
                    } else {
                        lValueOf = null;
                    }
                    c2344009Gk.LJ(lValueOf, "live_event_id");
                    if (c705930RmZ2 != null && (c0r607 = c705930RmZ2.LJIIZILJ) != null) {
                        str4 = c0r607.LIZJ;
                    } else {
                        str4 = null;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", str4);
                    if (c705930RmZ2 != null && (c0r606 = c705930RmZ2.LJIIZILJ) != null) {
                        str5 = c0r606.LIZJ;
                    } else {
                        str5 = null;
                    }
                    c2344009Gk.LJIIIIZZ("anchor_id", str5);
                    c2344009Gk.LIZJ(1, "is_free");
                    CountDownStickerStruct countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
                    if (countDownStickerStruct2 != null) {
                        LJFF = Intrinsics.LJFF(countDownStickerStruct2.getSubscribe(), Boolean.TRUE);
                    }
                    c2344009Gk.LIZJ(LJFF, "has_registered");
                    CountDownStickerStruct countDownStickerStruct3 = interactStickerStruct.getCountDownStickerStruct();
                    if (countDownStickerStruct3 != null && (expiredTime = countDownStickerStruct3.getExpiredTime()) != null) {
                        jLongValue = expiredTime.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    if (jCurrentTimeMillis > jLongValue) {
                        j = -1;
                    } else {
                        j = jLongValue - jCurrentTimeMillis;
                    }
                    c2344009Gk.LIZLLL(j, "countdown_time");
                    if (c705930RmZ2 != null && (c0r605 = c705930RmZ2.LJIIZILJ) != null) {
                        str6 = c0r605.LIZ;
                    } else {
                        str6 = null;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str6);
                    if (c705930RmZ2 != null && (c0r604 = c705930RmZ2.LJIIZILJ) != null) {
                        str7 = c0r604.LIZLLL;
                    } else {
                        str7 = null;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", str7);
                    if (c705930RmZ2 != null) {
                        user = c705930RmZ2.LIZJ;
                    }
                    c2344009Gk.LIZJ(C10EU.LJIILLIIL(user) ? 1 : 0, "is_author");
                    C20684815ws.LJIILLIIL("livesdk_live_event_sticker_show", c2344009Gk.LIZ);
                }
            } else {
                C0RFF c0rff = new Object() { // from class: X.0RFF
                };
                C705930RmZ c705930RmZ3 = this.LLLF;
                c0rff.getClass();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                if (c705930RmZ3 != null && (c0r603 = c705930RmZ3.LJIIZILJ) != null) {
                    str = c0r603.LIZ;
                } else {
                    str = null;
                }
                c2344009Gk2.LJIIIIZZ("enter_from", str);
                if (c705930RmZ3 != null && (c0r602 = c705930RmZ3.LJIIZILJ) != null) {
                    str2 = c0r602.LIZJ;
                } else {
                    str2 = null;
                }
                c2344009Gk2.LJIIIIZZ("author_id", str2);
                if (c705930RmZ3 != null && (c0r60 = c705930RmZ3.LJIIZILJ) != null) {
                    str3 = c0r60.LIZLLL;
                } else {
                    str3 = null;
                }
                c2344009Gk2.LJIIIIZZ("group_id", str3);
                MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
                if (mentionInfo != null) {
                    userId = mentionInfo.getUserId();
                }
                c2344009Gk2.LJIIIIZZ("to_user_id", userId);
                C19597311lr c19597311lr = EnumC19597411ls.Companion;
                MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
                if (mentionInfo2 != null) {
                    scenario = mentionInfo2.getScenario();
                }
                c19597311lr.getClass();
                c2344009Gk2.LJIIIIZZ("mention_type", C19597311lr.LIZ(scenario));
                C20684815ws.LJIILLIIL("at_prop_show", c2344009Gk2.LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARN: Type inference failed for: r5v19, types: [X.0SgA] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r21) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent.up(java.lang.Object):void");
    }

    public final void sp(Aweme aweme) {
        C705930RmZ c705930RmZ;
        Context context;
        C19EG c19egLIZIZ;
        Object obj;
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout == null || (c705930RmZ = this.LLLF) == null || (context = getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || AwemeExtKt.isPhotoMode(aweme) || this.LLJZ != null) {
            return;
        }
        boolean zLJIILLIIL = C10EU.LJIILLIIL(c705930RmZ.LIZJ);
        C19607711nX c19607711nXLJIJI = StickerContainerService.LIZ().LJIJI();
        this.LLJZ = c19607711nXLJIJI;
        if (c19607711nXLJIJI != null) {
            EnumC19589411ka enumC19589411ka = EnumC19589411ka.INTERACT;
            C19592311l3 c19592311l3 = new C19592311l3(frameLayout.getWidth(), frameLayout.getHeight(), 28);
            C1866270yfJ c1866270yfJ = new C1866270yfJ(null, new C19603011mm(this, c19egLIZIZ, zLJIILLIIL, c19607711nXLJIJI), new AwS54S0010000_11(zLJIILLIIL, 0), null, new C0RF7(zLJIILLIIL), false, 41);
            boolean zLJIILLIIL2 = C10EU.LJIILLIIL(c705930RmZ.LIZJ);
            LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(LJJIJL(), (C19EG) null);
            if (lifecycleOwnerFindSAFExpLifecycleOwner == null) {
                lifecycleOwnerFindSAFExpLifecycleOwner = c19egLIZIZ;
            }
            c19607711nXLJIJI.LIZJ(new C19591211ks(enumC19589411ka, frameLayout, c19592311l3, c19egLIZIZ, c1866270yfJ, c705930RmZ, new C0RF8(this), null, new C694890RNn(), null, zLJIILLIIL2, lifecycleOwnerFindSAFExpLifecycleOwner, this.LLLII, this.LLLI, 640));
        }
        C0RFT c0rft = this.LLJZ;
        if (c0rft == null) {
            return;
        }
        ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
        if (iCommonFeedCustomLogic != null) {
            iCommonFeedCustomLogic.LJI();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(88);
        if (!((Boolean) C0B8G.LIZ.getValue()).booleanValue()) {
            arrayList.add(42);
        }
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(25);
        arrayList.add(106);
        arrayList.add(114);
        arrayList.add(103);
        arrayList.add(108);
        arrayList.add(109);
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null && iSocialAvatarStoryPostService.enable()) {
            arrayList.add(112);
        }
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q5()) {
            arrayList.add(107);
        }
        arrayList.add(111);
        arrayList.add(113);
        arrayList.add(115);
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (arrayList.contains(Integer.valueOf(interactStickerStruct.getType()))) {
                    arrayList2.add(interactStickerStruct);
                }
            }
            C0OD3.LIZ.getClass();
            List<? extends InteractStickerStruct> listLIZJ = C0OD3.LIZJ(arrayList2);
            this.LLL = new ArrayList(listLIZJ);
            if (this.LLLIIIL && (true ^ ((ArrayList) listLIZJ).isEmpty())) {
                op(aweme);
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c0rft.LIZLLL(listLIZJ, null, null, ((VideoItemParams) obj).getAweme());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void tP(float f) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null && (viewPropertyAnimatorAnimate = frameLayout.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(150L)) != null) {
            duration.start();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void td(HashMap<String, String> map) {
        InteractStickerViewModel interactStickerViewModel;
        C705920RmY c705920RmYLp = lp();
        if (c705920RmYLp.LJIIJJI != null && (interactStickerViewModel = c705920RmYLp.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(map, "interact_text_translate_data");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        C705920RmY c705920RmYLp = lp();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c705920RmYLp.LJII(aid);
        this.LLLIIIL = ((ArrayList) this.LLL).isEmpty();
        op(aweme);
    }

    public final InterfaceC19578611iq kp(C19EG c19eg, Aweme aweme) {
        return mp().produceSocialStickerClickListener(getContext(), this.LLLF, aweme, c19eg, AFwS292S0000000_9.get$arr$(72), new InterfaceC19597711lv() { // from class: X.0SCp
            @Override // X.InterfaceC19597711lv
            public final String LIZ() {
                return C1D0F.LIZ.LIZ();
            }

            @Override // X.InterfaceC19597711lv
            public final String LIZIZ() {
                return C1D0F.LIZ.LIZIZ();
            }

            @Override // X.InterfaceC19597711lv
            public final String LIZJ() {
                return C1D0F.LIZ.LIZJ();
            }

            @Override // X.InterfaceC19597711lv
            public final boolean isConnected() {
                return C1D0F.LIZ.isConnected();
            }
        }, Intrinsics.LJFF(jm().LIZ(), "cell_story_video"));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void UG(float f, float f2, int i) {
        lp().LJI(f, f2, i);
    }
}
