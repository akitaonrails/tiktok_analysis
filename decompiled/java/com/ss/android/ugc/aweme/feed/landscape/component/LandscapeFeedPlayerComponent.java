package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0N0Y;
import X.C0SZ8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1299020juO;
import X.C1389300mG0;
import X.C13LE;
import X.C1483410ohn;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20692815yA;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2531509w1;
import X.C2549509yv;
import X.C302540BtU;
import X.C452501pT;
import X.C586390MzF;
import X.C692480REg;
import X.C724750Sbp;
import X.C726340SeO;
import X.C726540Sei;
import X.C726680Sew;
import X.C735610StL;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503119Dh;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC739770T0d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListSelectViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS660S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedPlayerComponent extends BasePanelComponent implements LandscapeFeedPlayerAbility, InterfaceC724530SbT, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 419));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 414));
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public long LLILZLL;
    public final C01GW LLIZ;
    public final C726340SeO LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeFeedPlayerComponent.class, "selectedVM", "getSelectedVM()Lcom/ss/android/ugc/aweme/feed/landscape/component/profile/LandscapeProfileListSelectViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0SeO] */
    public LandscapeFeedPlayerComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeProfileListSelectViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 418), AFwS243S0000000_11.get$arr$(207), null, true);
        this.LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 415));
        this.LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 417));
        this.LLILZLL = System.currentTimeMillis();
        this.LLIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 416));
        this.LLIZLLLIL = new InterfaceC21503119Dh() { // from class: X.0SeO
            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
                C1473990oSb c1473990oSb;
                C0SZ8 c0sz8LJLIL;
                InterfaceC583650Mup interfaceC583650MupX3;
                if (C288410BSd.LIZ) {
                    LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do = this.LL.m197do();
                    View videoView = null;
                    if (landscapeFeedViewPagerAbilityM197do != null && (c0sz8LJLIL = landscapeFeedViewPagerAbilityM197do.LJLIL()) != null && (interfaceC583650MupX3 = c0sz8LJLIL.x3()) != null) {
                        videoView = interfaceC583650MupX3.getVideoView();
                    }
                    if (!(videoView instanceof C1473990oSb) || (c1473990oSb = (C1473990oSb) videoView) == null) {
                        return;
                    }
                    c1473990oSb.LIZIZ();
                }
            }
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        P2().onAttach(getPanelContext().LIZ(), getPanelContext().LJ);
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do = m197do();
        if (landscapeFeedViewPagerAbilityM197do != null) {
            landscapeFeedViewPagerAbilityM197do.bY0(this, new AwS625S0100000_11(this, 37));
        }
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0SeS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712380Rwy) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0SeT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712380Rwy) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS660S0100000_11(this, 1), 8);
        LandscapeFeedVideoEventDispatcherAbility landscapeFeedVideoEventDispatcherAbility = (LandscapeFeedVideoEventDispatcherAbility) this.LLILLJJLI.getValue();
        if (landscapeFeedVideoEventDispatcherAbility != null) {
            landscapeFeedVideoEventDispatcherAbility.Qu1(this, new AwS590S0100000_11(this, 147));
        }
        C726540Sei c726540Sei = BaseActivity.Companion;
        C726340SeO c726340SeO = this.LLIZLLLIL;
        c726540Sei.getClass();
        C726540Sei.LIZ(c726340SeO);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2020384924) {
            return null;
        }
        return this;
    }

    public final InterfaceC739770T0d P2() {
        return (InterfaceC739770T0d) this.LLIZ.getValue();
    }

    public final void bo() {
        if (C2549509yv.LIZ) {
            getPlayerManager().LJJLIIIJL();
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final LandscapeFeedViewPagerAbility m197do() {
        return (LandscapeFeedViewPagerAbility) this.LL.getValue();
    }

    public final C0N0Y getPlayerManager() {
        return (C0N0Y) this.LLILZIL.getValue();
    }

    public final C2189821An6 xp0() {
        return (C2189821An6) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final long K2() {
        return getPlayerManager().getDuration();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final long LLLJL() {
        return P2().getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final boolean isPaused() {
        return getPlayerManager().isPaused();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final boolean isPlaying() {
        return getPlayerManager().isPlaying();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        P2().LJLJLLL();
        P2().b8();
        P2().onDestroyView();
        P2().onDetach();
        C0N0Y playerManager = getPlayerManager();
        if (playerManager.LJLJI(P2().LJIIZILJ())) {
            playerManager.LJJIJ(null);
        }
        if (!C692480REg.LIZ()) {
            fo(this);
        }
        C726540Sei c726540Sei = BaseActivity.Companion;
        C726340SeO c726340SeO = this.LLIZLLLIL;
        c726540Sei.getClass();
        BaseActivity.callback.LL.remove(c726340SeO);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        P2().LJJ(true);
        if (!C20692815yA.LIZIZ()) {
            P2().onPause();
        }
        getPlayerManager().LJJLIIJ(P2().LJIIZILJ());
        P2().LJFF(System.currentTimeMillis(), null, true);
        C726680Sew.LIZ();
        if (C692480REg.LIZ()) {
            fo(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C0SZ8 c0sz8LJLIL;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC583650Mup interfaceC583650MupX3;
        C0SZ8 c0sz8LJLIL3;
        Video video;
        VideoUrlModel playAddr;
        VideoUrlModel videoUrlModelLJJIII;
        C0SZ8 c0sz8LJLIL4;
        super.onResume();
        P2().onResume();
        P2().LJJ(false);
        if (C692480REg.LIZ()) {
            this.LLILZLL = System.currentTimeMillis();
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do = m197do();
        Aweme aweme = null;
        C726680Sew.LIZIZ(landscapeFeedViewPagerAbilityM197do != null ? landscapeFeedViewPagerAbilityM197do.BD1() : null, C1389300mG0.LIZ(getPanelContext()), 1, xp0(), 16);
        boolean zLJLJI = getPlayerManager().LJLJI(P2().LJJJJJL());
        getPlayerManager().LJJIJ(P2().LJJJJJL());
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do2 = m197do();
        Aweme aweme2 = (landscapeFeedViewPagerAbilityM197do2 == null || (c0sz8LJLIL4 = landscapeFeedViewPagerAbilityM197do2.LJLIL()) == null) ? null : c0sz8LJLIL4.getAweme();
        C0N0Y playerManager = getPlayerManager();
        boolean zLJFF = Intrinsics.LJFF((playerManager == null || (videoUrlModelLJJIII = playerManager.LJJIII()) == null) ? null : videoUrlModelLJJIII.getUrlKey(), (aweme2 == null || (video = aweme2.getVideo()) == null || (playAddr = video.getPlayAddr()) == null) ? null : playAddr.getUrlKey());
        if (zLJLJI) {
            IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = P2().LJJLIIIJJIZ();
            boolean zPe = iBaseListFragmentPanelLJJLIIIJJIZ != null ? iBaseListFragmentPanelLJJLIIIJJIZ.Pe() : false;
            if (!zLJFF) {
                P2().LJJLIIIJILLIZJL(aweme2, true, null);
                bo();
            } else if (zPe) {
                getPlayerManager().LJJLIIJ(P2().LJIIZILJ());
            } else {
                InterfaceC739770T0d interfaceC739770T0dP2 = P2();
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do3 = m197do();
                if (landscapeFeedViewPagerAbilityM197do3 != null && (c0sz8LJLIL3 = landscapeFeedViewPagerAbilityM197do3.LJLIL()) != null) {
                    aweme = c0sz8LJLIL3.getAweme();
                }
                interfaceC739770T0dP2.ui(aweme);
                bo();
            }
        } else {
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do4 = m197do();
            if (landscapeFeedViewPagerAbilityM197do4 == null || (c0sz8LJLIL = landscapeFeedViewPagerAbilityM197do4.LJLIL()) == null) {
                return;
            }
            InterfaceC583650Mup interfaceC583650MupX32 = c0sz8LJLIL.x3();
            if ((interfaceC583650MupX32 != null && interfaceC583650MupX32.Da()) || C302540BtU.LIZIZ) {
                P2().LJJLIIIJILLIZJL(c0sz8LJLIL.getAweme(), true, null);
                bo();
            }
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do5 = m197do();
        if (landscapeFeedViewPagerAbilityM197do5 == null || (c0sz8LJLIL2 = landscapeFeedViewPagerAbilityM197do5.LJLIL()) == null) {
            return;
        }
        if (C302540BtU.LIZIZ) {
            c0sz8LJLIL2.onResume();
        } else if (C2531509w1.LIZ && (interfaceC583650MupX3 = c0sz8LJLIL2.x3()) != null && interfaceC583650MupX3.Da()) {
            c0sz8LJLIL2.onResume();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void fo(com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedPlayerComponent r8) {
        /*
            com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility r0 = r8.m197do()
            r5 = 1
            r2 = 0
            if (r0 == 0) goto Lb9
            int r0 = r0.LJLLJ()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r1 = r3.intValue()
            if (r1 < 0) goto Lb9
            com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility r0 = r8.m197do()
            if (r0 == 0) goto Lb9
            int r0 = r0.getItemCount()
            if (r1 >= r0) goto Lb9
            int r1 = r3.intValue()
            com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility r0 = r8.m197do()
            if (r0 == 0) goto Lb9
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.d2(r1)
        L30:
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            X.0RJN r0 = r8.getPanelContext()
            java.lang.String r1 = X.C1389300mG0.LIZ(r0)
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r1)
            if (r4 == 0) goto Lb7
            java.lang.String r1 = r4.getAid()
        L48:
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r1)
            if (r4 == 0) goto L59
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.getAuthor()
            if (r0 == 0) goto L59
            java.lang.String r2 = r0.getUid()
        L59:
            java.lang.String r0 = "author_id"
            r3.LJIIIIZZ(r0, r2)
            long r1 = java.lang.System.currentTimeMillis()
            long r6 = r8.LLILZLL
            long r1 = r1 - r6
            java.lang.String r0 = "duration"
            r3.LIZLLL(r1, r0)
            if (r4 == 0) goto Lb4
            boolean r0 = r4.isPaidContent
            if (r0 != r5) goto Lb4
            java.lang.String r1 = "1"
        L72:
            java.lang.String r0 = "is_collection_item"
            r3.LJIIIIZZ(r0, r1)
            X.0T0d r0 = r8.P2()
            long r1 = r0.te()
            java.lang.String r0 = "item_duration"
            r3.LIZLLL(r1, r0)
            X.1An6 r1 = r8.xp0()
            android.content.Context r0 = r8.getContext()
            X.C0SXF.LJFF(r3, r1, r4, r0, r5)
            android.content.Context r2 = r8.getContext()
            X.1An6 r1 = r8.xp0()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C0SXF.LJIIIZ(r3, r4, r2, r1, r0)
            X.C0SXF.LJIIL(r3, r4)
            X.1An6 r0 = r8.xp0()
            X.C0SXF.LIZIZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "landscape_screen_stay_time"
            X.C20684815ws.LJIILLIIL(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            r8.LLILZLL = r0
            return
        Lb4:
            java.lang.String r1 = "0"
            goto L72
        Lb7:
            r1 = r2
            goto L48
        Lb9:
            r4 = r2
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedPlayerComponent.fo(com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedPlayerComponent):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void Hz0(Integer num) {
        C0SZ8 c0sz8LJLIL;
        Aweme awemeBD1;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do;
        C0SZ8 c0sz8LJLIL2;
        if (num != null) {
            int iIntValue = num.intValue();
            InterfaceC739770T0d interfaceC739770T0dP2 = P2();
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do2 = m197do();
            C0SZ8 c0sz8LJLIL3 = null;
            if (landscapeFeedViewPagerAbilityM197do2 != null) {
                c0sz8LJLIL = landscapeFeedViewPagerAbilityM197do2.LJLIL();
            } else {
                c0sz8LJLIL = null;
            }
            interfaceC739770T0dP2.LIZ(iIntValue, c0sz8LJLIL, true);
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do3 = m197do();
            if (landscapeFeedViewPagerAbilityM197do3 != null && (awemeBD1 = landscapeFeedViewPagerAbilityM197do3.BD1()) != null && awemeBD1.isCanPlay()) {
                InterfaceC739770T0d interfaceC739770T0dP22 = P2();
                LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do4 = m197do();
                if (landscapeFeedViewPagerAbilityM197do4 != null) {
                    c0sz8LJLIL3 = landscapeFeedViewPagerAbilityM197do4.LJLIL();
                }
                String strLJJLIIIJILLIZJL = interfaceC739770T0dP22.LJJLIIIJILLIZJL(awemeBD1, false, c0sz8LJLIL3);
                if (Intrinsics.LJFF(strLJJLIIIJILLIZJL, "22") && (landscapeFeedViewPagerAbilityM197do = m197do()) != null && (c0sz8LJLIL2 = landscapeFeedViewPagerAbilityM197do.LJLIL()) != null) {
                    c0sz8LJLIL2.x3();
                }
                bo();
                C1299020juO.LIZJ("tryPlay", strLJJLIIIJILLIZJL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void LJIILL(float f) {
        getPlayerManager().seek(f);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final float gO0(float f) {
        Aweme awemeBD1;
        float speed = C1483410ohn.LJLJJI().getSpeed();
        P2().setSpeed(f);
        if (getPlayerManager().isPlaying()) {
            C586390MzF c586390MzF = C586390MzF.LIZ;
            LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM197do = m197do();
            if (landscapeFeedViewPagerAbilityM197do != null) {
                awemeBD1 = landscapeFeedViewPagerAbilityM197do.BD1();
            } else {
                awemeBD1 = null;
            }
            String strLIZ = C735610StL.LIZ(xp0().getPageType(), xp0().getEventType(), false);
            long jCurrentTimeMillis = System.currentTimeMillis();
            c586390MzF.getClass();
            C586390MzF.LIZ(awemeBD1, strLIZ, f, jCurrentTimeMillis, null);
        }
        return speed;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void ui(Aweme aweme) {
        P2().ui(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility
    public final void Y2(Aweme aweme, boolean z, boolean z2) {
        P2().Bj(aweme, z, false, false);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
