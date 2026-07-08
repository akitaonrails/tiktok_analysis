package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C0B43;
import X.C0C2Z;
import X.C0R93;
import X.C0S4M;
import X.C1003300cDQ;
import X.C1308910kAL;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C13LQ;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC487330J9f;
import X.InterfaceC718610SGt;
import Y.ACListenerS54S1200000_11;
import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS502S0200000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractPlayListBottomBarAssem extends InteractBottomBannerAssem<InteractPlayListBottomBarAssem> implements InterfaceC487330J9f, FcpStandardPreloadProtocol {
    public C197039127h LLLIIIIL;
    public View LLLIIIL;
    public TuxIconView LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public final String LLLFFI = "bottom_banner_playlist";
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1216));
    public final C01GW LLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(561));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(262));
    public final C01GW LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(562));
    public final double LLLILZJ = C0B43.LIZ * ((double) LSPassThroughRecordSizeConfig.DEFAULT);
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(261));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLLIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        this.LLLIL = false;
    }

    public final AbsMixBottomBarVM jq() {
        return (AbsMixBottomBarVM) this.LLLFZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        IMixFeedService iMixFeedService = (IMixFeedService) PluggableExtentionKt.pluggableSpi$default(IMixFeedService.class, false, false, false, 14, null);
        if (iMixFeedService == null) {
            return null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        return iMixFeedService.LJJIJIL(c724270Sb3 != null ? c724270Sb3.LL : null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String Jp() {
        return this.LLLFFI;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C487280J9a.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        this.LLLIL = false;
        this.LLLILZ = false;
        int i = PlayListBottomBarAssemTrigger.LLJL;
        this.LLLIILIL = C0S4M.LIZ(videoItemParams);
        C197039127h c197039127h = this.LLLIIIIL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        super.up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig Up(FeedBottomBannerConfig.Builder builder) {
        builder.setIconWithLocalRes(R.raw.icon_playlist_fill);
        builder.setUpdateTitleSync(true);
        builder.setTitleEndIcon((C419910GdJ) this.LLLILZLLLI.getValue(), new AwS590S0100000_11(this, 531));
        builder.setInteractionWithCustomViewAsync(R.layout.b_t, new FeedBottomBannerConfig.Callback() { // from class: X.0SXn
            @Override // com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig.Callback
            public final void onFinishedInflate(View view) {
                int i;
                Object obj;
                Object obj2;
                Object obj3;
                InteractPlayListBottomBarAssem interactPlayListBottomBarAssem = this.LIZ;
                interactPlayListBottomBarAssem.getClass();
                C0C2Z c0c2z = C0C2Z.LIZ;
                String str = interactPlayListBottomBarAssem.LLLFFI;
                c0c2z.getClass();
                if (C13LQ.LJIILLIIL(str, (Object[]) C0C2Z.LIZJ.getValue())) {
                    i = -2;
                } else {
                    i = -1;
                }
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(i, -2));
                InteractPlayListBottomBarAssem interactPlayListBottomBarAssem2 = this.LIZ;
                interactPlayListBottomBarAssem2.getClass();
                interactPlayListBottomBarAssem2.LLLIIL = (TuxIconView) view.findViewById(R.id.h4e);
                C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d6g);
                interactPlayListBottomBarAssem2.setComponentClickStatusExperimental(c197039127h, EnumC700430Rdh.POSITIVE);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
                c197039127h.LJJJJI(12.0f);
                C786410Ut5.I7(new AbS502S0200000_11(interactPlayListBottomBarAssem2, c197039127h, 1), c197039127h);
                interactPlayListBottomBarAssem2.LLLIIIIL = c197039127h;
                Context context = view.getContext();
                C724270Sb3 c724270Sb3 = interactPlayListBottomBarAssem2.LLJI;
                Object obj4 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                C1003300cDQ.LIZ(context, ((VideoItemParams) obj).getAweme(), interactPlayListBottomBarAssem2.LLLIIL);
                C724270Sb3 c724270Sb32 = interactPlayListBottomBarAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (interactPlayListBottomBarAssem2.kq(((VideoItemParams) obj2).mEventType)) {
                    C724270Sb3 c724270Sb33 = interactPlayListBottomBarAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    PlayListInfo playListInfo = ((VideoItemParams) obj3).getAweme().playlist_info;
                    if (playListInfo != null && playListInfo.getAlreadyShownPlayNext()) {
                        C724270Sb3 c724270Sb34 = interactPlayListBottomBarAssem2.LLJI;
                        if (c724270Sb34 != null) {
                            obj4 = c724270Sb34.LL;
                        }
                        if (!C0R93.LJI(((VideoItemParams) obj4).mEventType)) {
                            interactPlayListBottomBarAssem2.lq(false);
                            return;
                        }
                    }
                }
                C197039127h c197039127h2 = interactPlayListBottomBarAssem2.LLLIIIIL;
                if (c197039127h2 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h2, 8);
                }
                View view2 = interactPlayListBottomBarAssem2.LLLIIIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                TuxIconView tuxIconView = interactPlayListBottomBarAssem2.LLLIIL;
                if (tuxIconView == null) {
                    return;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        });
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        builder.setBackgroundOverride(c19252910Tv.LIZLLL().LJIJI().LJLLILLLL());
        builder.setIconTintOverride(c19252910Tv.LIZLLL().LJIJI().LLL());
        return builder.build();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean dq(VideoItemParams videoItemParams) {
        int i = PlayListBottomBarAssemTrigger.LLJL;
        return C0S4M.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void fq(VideoItemParams videoItemParams) {
        PlayListInfo playListInfo;
        String mixName;
        int iIntValue;
        super.fq(videoItemParams);
        View viewLJJIJL = LJJIJL();
        Aweme aweme = videoItemParams.getAweme();
        String str = videoItemParams.mEventType;
        TuxIconView tuxIconView = this.LLLIIL;
        AbsMixBottomBarVM absMixBottomBarVMJq = jq();
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 335);
        AwS590S0100000_11 awS590S0100000_112 = new AwS590S0100000_11(this, 336);
        Context context = viewLJJIJL.getContext();
        if (aweme != null && aweme.playlist_info != null) {
            Context context2 = viewLJJIJL.getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context2.getString(R.string.nww));
            sbLIZ.append(" • ");
            PlayListInfo playListInfo2 = aweme.playlist_info;
            if (playListInfo2 == null || (mixName = playListInfo2.getMixName()) == null) {
                mixName = "";
            }
            sbLIZ.append(mixName);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ.append((CharSequence) strLIZIZ);
            C1360500lVY c1360500lVY = c1360520lVa.LIZ;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLL()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C786410Ut5.r2(c1360500lVY, new ForegroundColorSpan(iIntValue), 0, context.getString(R.string.nww).length() + 1, 33);
            }
            awS590S0100000_11.invoke(Collections.singletonList(new FeedBottomBannerUIProps.Title(c1360500lVY)));
            C1003300cDQ.LIZ(context, aweme, tuxIconView);
            awS590S0100000_112.invoke(new ACListenerS54S1200000_11(aweme, str, absMixBottomBarVMJq, 1));
        }
        if (kq(videoItemParams.mEventType) && (playListInfo = videoItemParams.getAweme().playlist_info) != null && playListInfo.getAlreadyShownPlayNext() && !C0R93.LJI(videoItemParams.mEventType)) {
            lq(false);
            return;
        }
        C197039127h c197039127h = this.LLLIIIIL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        View view = this.LLLIIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TuxIconView tuxIconView2 = this.LLLIIL;
        if (tuxIconView2 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
    }

    public final boolean kq(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot") && !C0R93.LJI(str)) {
            return false;
        }
        return true;
    }

    public final void lq(boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        C197039127h c197039127h = this.LLLIIIIL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        View view = this.LLLIIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (z) {
            C197039127h c197039127h2 = this.LLLIIIIL;
            if (c197039127h2 != null) {
                C786410Ut5.w5(c197039127h2, 0.0f);
            }
            View view2 = this.LLLIIIL;
            if (view2 != null) {
                C786410Ut5.T4(view2, 0.0f);
            }
            TuxIconView tuxIconView = this.LLLIIL;
            if (tuxIconView != null && (viewPropertyAnimatorAlpha = tuxIconView.animate().alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null && (viewPropertyAnimatorWithEndAction = duration.withEndAction(new ARunnableS111S0100000_11(this, 77))) != null) {
                viewPropertyAnimatorWithEndAction.start();
            }
        } else {
            TuxIconView tuxIconView2 = this.LLLIIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String mixId = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        PlayListInfo playListInfo = ((VideoItemParams) obj).getAweme().playlist_info;
        if (playListInfo != null && !playListInfo.getAlreadyShownPlayNext()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            PlayListInfo playListInfo2 = ((VideoItemParams) obj2).getAweme().playlist_info;
            if (playListInfo2 != null) {
                playListInfo2.setAlreadyShownPlayNext(true);
            }
            Pair[] pairArr = new Pair[4];
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            pairArr[0] = new Pair("enter_from", ((VideoItemParams) obj3).mEventType);
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            pairArr[1] = new Pair("group_id", ((VideoItemParams) obj4).getAweme().getAid());
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            pairArr[2] = new Pair("author_id", AwemeExtKt.getAuthorUid(((VideoItemParams) obj5).getAweme()));
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj6 = c724270Sb36.LL;
            } else {
                obj6 = null;
            }
            PlayListInfo playListInfo3 = ((VideoItemParams) obj6).getAweme().playlist_info;
            if (playListInfo3 != null) {
                mixId = playListInfo3.getMixId();
            }
            pairArr[3] = new Pair("playlist_id", mixId);
            C20684815ws.LJIILLIIL("show_play_next_toast", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        C19EG c19egLIZ;
        super.onViewCreated(view);
        FeedBottomBannerView feedBottomBannerView = this.LLJZIJLIL;
        if (feedBottomBannerView != null) {
            C0C2Z c0c2z = C0C2Z.LIZ;
            String str = this.LLLFFI;
            c0c2z.getClass();
            feedBottomBannerView.setTitleTextWeightedEnabled(C13LQ.LJIILLIIL(str, (Object[]) C0C2Z.LIZJ.getValue()));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(), new C2217381BqS() { // from class: X.0S73
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0RFV) obj2).LLJJI;
            }
        }, null, AFwS294S0000000_11.get$arr$(209), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0S7e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(210), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0S7f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(211), 6);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (kq(((VideoItemParams) obj).mEventType)) {
            AssemViewModel.asyncSubscribe$default(jq(), new C2217381BqS() { // from class: X.0SXo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C723070SXx) obj2).LL;
                }
            }, null, null, null, new AwS590S0100000_11(this, 334), 14, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLII() && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLII()) {
            c19252910Tv.LIZLLL().LJIJI().Z5();
        }
    }
}
