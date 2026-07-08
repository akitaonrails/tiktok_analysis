package com.ss.android.ugc.aweme.search;

import X.ActivityC21503719Dn;
import X.C06MM;
import X.C098200Yq;
import X.C09AE;
import X.C0C64;
import X.C0IEG;
import X.C0IFS;
import X.C0IFX;
import X.C0IGQ;
import X.C0IKH;
import X.C0IXL;
import X.C0J3O;
import X.C0J3P;
import X.C0J3R;
import X.C0J3T;
import X.C0J4S;
import X.C0J4U;
import X.C0J4W;
import X.C0R12;
import X.C0SUC;
import X.C0T1R;
import X.C1010120cOQ;
import X.C1148430fzV;
import X.C1161920gLG;
import X.C1209120hZO;
import X.C128Y;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1388190mED;
import X.C14EU;
import X.C1819620xS4;
import X.C189200o6;
import X.C19EG;
import X.C1ACA;
import X.C1AKK;
import X.C1ER1;
import X.C20441214yg;
import X.C2075608Be;
import X.C2189821An6;
import X.C2252051DCp;
import X.C261290ALv;
import X.C467800IWc;
import X.C472280Ifa;
import X.C479930Irv;
import X.C487280J9a;
import X.C497740JfY;
import X.C652090Phv;
import X.C748910TZh;
import X.C786410Ut5;
import X.C827750WdZ;
import X.EnumC2252111DCv;
import X.EnumC469210Iad;
import X.InterfaceC1209310hZh;
import X.InterfaceC20673515v3;
import X.InterfaceC487330J9f;
import Y.ARunnableS107S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchLiveCardViewHolder extends BaseFeedLiveViewHolder implements InterfaceC1209310hZh, C0IFS, C0IFX {
    public C0IEG LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public C0IKH LLJ;
    public final C1ACA LLJI;
    public EnterRoomConfig LLJIJIL;
    public Aweme LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public C2189821An6 LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C09AE LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public final C0J4S LLJJJJLIIL;

    @Override // X.C0IFX
    public final void LJLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLIILZL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLLLIIIILLL() {
        C0IEG c0ieg;
        View view;
        Context context;
        Activity activityLIZ;
        C128Y c128yLLLIILIL;
        try {
            c0ieg = this.LLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0J3P.LIZ.getClass();
            C20441214yg.LJI("LiveSearchPlayHelper", e);
        }
        if (c0ieg == null || c0ieg.LLLIILIL() == null || (view = getView()) == null || (context = view.getContext()) == null || (activityLIZ = C06MM.LIZ(context)) == null || activityLIZ.isFinishing() || !(activityLIZ instanceof ActivityC21503719Dn)) {
            return false;
        }
        C0IKH c0ikh = this.LLJ;
        if (c0ikh == null || !c0ikh.mt()) {
            C0IEG c0ieg2 = this.LLIZ;
            return c0ieg2 != null && (c128yLLLIILIL = c0ieg2.LLLIILIL()) != null && (c128yLLLIILIL instanceof C0IGQ) && ((C0IGQ) c128yLLLIILIL).onBackPressed();
        }
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        C467800IWc.LJIJ.LIZLLL = "close_btn";
        c0ikh.nt(false, true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final int getAwemeType() {
        return 101;
    }

    @Override // X.C0IFX
    public final boolean lB() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0IFX
    public final boolean pa() {
        return false;
    }

    @Override // X.C0IFS
    public final C472280Ifa q6() {
        return null;
    }

    @Override // X.C0IFX
    public final void qd() {
    }

    public final void A1() {
        Aweme aweme;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        UrlModel avatarLarger;
        List<String> urlList;
        List<String> urlList2;
        if (!((Boolean) C261290ALv.LIZ.getValue()).booleanValue()) {
            C0J3P.LIZ.getClass();
            if (TextUtils.isEmpty(C0J3P.LJIIIIZZ) || TextUtils.equals("click", C0J3P.LJIIIIZZ)) {
                return;
            }
        }
        Aweme aweme2 = this.LLJILJIL;
        List<String> urlList3 = null;
        if ((aweme2 == null || (newLiveRoomData = AwemeExtKt.getNewLiveRoomDataExt(aweme2)) == null) && ((aweme = this.LLJILJIL) == null || (roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
            return;
        }
        UrlModel urlModel = newLiveRoomData.blurredCover;
        if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null) {
            UrlModel urlModel2 = newLiveRoomData.roomCover;
            if (urlModel2 == null || (urlList = urlModel2.getUrlList()) == null) {
                User user = newLiveRoomData.owner;
                if (user != null && (avatarLarger = user.getAvatarLarger()) != null) {
                    urlList3 = avatarLarger.getUrlList();
                }
            } else {
                urlList3 = urlList;
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urlList3);
            c1324610kZfLIZJ.LJJIIZI(C12ES.LJIIJ(this.context) / C12ES.LJIIIIZZ(this.context));
            c1324610kZfLIZJ.LJJI(this.LLIZLLLIL);
        } else {
            C1819620xS4.LIZ().LIZJ(urlList2).LJJI(this.LLIZLLLIL);
        }
        C786410Ut5.LLJJIII(this.LLIZLLLIL, 0);
    }

    public final void C1() {
        C827750WdZ.LIZJ("CarViewHolder", "pauseLive");
        C0J3P.LIZ.getClass();
        C0J3P.LJII = true;
        C0IEG c0ieg = this.LLIZ;
        if (c0ieg != null) {
            c0ieg.e0();
        }
        this.LLJILJILJ = null;
        C786410Ut5.LLJJIII(this.LLIZLLLIL, 8);
        this.LLJJIJIIJIL = false;
    }

    public final void D1() {
        Unit unit;
        C0IEG c0ieg;
        HashMap<String, String> mobParams;
        String aid;
        LiveRoomStruct newLiveRoomDataExt;
        C0IXL c0ixl;
        C827750WdZ.LIZJ("CarViewHolder", "playLive");
        C0J3P.LIZ.getClass();
        C0J3P.LJII = false;
        HandlerHook.viewPostDelay(this.LLIZLLLIL, new ARunnableS107S0100000_7(this, 158), 1500L);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.trw);
        this.LLJJJIL = View.generateViewId();
        viewGroup.getChildAt(0).setId(this.LLJJJIL);
        this.LLJJJJ = View.generateViewId();
        viewGroup.getChildAt(1).setId(this.LLJJJJ);
        EnterRoomConfig enterRoomConfig = this.LLJIJIL;
        if (enterRoomConfig != null) {
            Unit unit2 = null;
            try {
                Aweme aweme = this.LLJILJIL;
                if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                    EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    B1(this.LLJILJIL, linkedHashMap, mobParams);
                    logData.logMap = linkedHashMap;
                    Object objGg0 = DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
                    if ((objGg0 instanceof C0IXL) && (c0ixl = (C0IXL) objGg0) != null) {
                        Map<String, String> map = c0ixl.LJJJJL;
                        if (map != null) {
                            B1(this.LLJILJIL, map, mobParams);
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            B1(this.LLJILJIL, linkedHashMap2, mobParams);
                            c0ixl.LJJJJL = linkedHashMap2;
                        }
                    }
                    Aweme aweme2 = this.LLJILJIL;
                    if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                        C2252051DCp c2252051DCp = C2252051DCp.LIZ;
                        EnumC2252111DCv enumC2252111DCv = EnumC2252111DCv.LIVE_ROOM_USER_COUNT;
                        Aweme aweme3 = this.LLJILJIL;
                        long j = (aweme3 == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme3)) == null) ? -1L : newLiveRoomDataExt.user_count;
                        c2252051DCp.getClass();
                        C2252051DCp.LJIIJJI(enumC2252111DCv, "", Long.valueOf(j), "general_search", aid);
                        unit2 = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                C0J3P c0j3p = C0J3P.LIZ;
                View view = getView();
                Fragment fragment = this.LLILLJJLI;
                EnterRoomConfig enterRoomConfig2 = this.LLJIJIL;
                int i = this.LLJJIJI;
                int i2 = this.LLJJJIL;
                c0j3p.getClass();
                C0IEG c0iegLJ = C0J3P.LJ(view, fragment, enterRoomConfig2, i, i2);
                this.LLIZ = c0iegLJ;
                if (c0iegLJ != null) {
                    c0iegLJ.qJ(this);
                }
                c0ieg = this.LLIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0J3P.LIZ.getClass();
                C20441214yg.LJI("LiveSearchPlayHelper", e);
                unit = Unit.LIZ;
            }
            if (c0ieg != null) {
                c0ieg.NF(this.LLJILJILJ);
                unit = Unit.LIZ;
                if (unit != null) {
                    return;
                }
            }
        }
        C827750WdZ.LIZJ("CarViewHolder", "enterRoomConfig is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.E1():void");
    }

    public final void G1() {
        H1(findViewById(this.LLJJJIL));
        H1(findViewById(this.LLJJJJ));
    }

    @Override // X.C0IFS
    public final void KR() {
        C19EG c19egLIZIZ;
        if (this.LLJJIJIL) {
            C0J3P c0j3p = C0J3P.LIZ;
            String strZ1 = z1();
            c0j3p.getClass();
            Live.getLiteService().yp(strZ1, this);
        }
        Context context = this.context;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C0J3P c0j3p2 = C0J3P.LIZ;
        C472280Ifa c472280Ifa = (C472280Ifa) findViewById(R.id.trw);
        int i = this.LLJJJJ;
        c0j3p2.getClass();
        C1AKK liteService = Live.getLiteService();
        this.LLJ = liteService != null ? liteService.tf(c19egLIZIZ, c472280Ifa, i, EnumC469210Iad.DETAIL_CONTAINER) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.unBind():void");
    }

    public final boolean y1() {
        C0J4W c0j4wC4;
        ILiveOuterService iLiveOuterService;
        C0J4W c0j4wC42;
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService2 == null || (c0j4wC4 = iLiveOuterService2.C4()) == null || !c0j4wC4.enable() || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (c0j4wC42 = iLiveOuterService.C4()) == null || !c0j4wC42.LIZ()) ? false : true;
    }

    public final String z1() {
        C19EG c19egLIZIZ;
        Context context = this.context;
        return (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) ? "" : c19egLIZIZ.getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final Aweme getAweme() {
        return this.LLILZ;
    }

    @Override // X.C0IFS
    public final C0IKH k6() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1209310hZh
    public final void E0(C0J3O c0j3o) {
        IViewPagerComponentAbility iViewPagerComponentAbilityLIZLLL;
        C0J4W c0j4wC4;
        VerticalViewPager verticalViewPager;
        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(c0j3o, this, 26);
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c0j3o, 415);
            c0j3o.getClass();
            C1ER1.LIZIZ.O0(awS408S0200000_7, awS551S0100000_7);
            return;
        }
        C0J3P.LIZ.getClass();
        C0J3P.LIZIZ = c0j3o;
        boolean zLIZLLL = C0J3P.LIZLLL();
        if (C0J3P.LJI != zLIZLLL) {
            C0J3O c0j3o2 = C0J3P.LIZIZ;
            if (c0j3o2 != null && (verticalViewPager = ((C1209120hZO) c0j3o2).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZLLL);
            }
            C0J3P.LJI = zLIZLLL;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j4wC4 = iLiveOuterService.C4()) != null && !c0j4wC4.enable()) {
            this.LLJIJIL = C0J3P.LJFF(this.LLJILJIL, this.LLJILLL, this.LLJJIII, this.LLJJ, this.LLJJI);
        }
        C09AE c09ae = this.LLJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        if (!TextUtils.isEmpty(C0J3P.LJIIIIZZ) && !TextUtils.equals("click", C0J3P.LJIIIIZZ)) {
            Aweme aweme = this.LLJILJIL;
            if (aweme != null && ((aweme.isAd() || C1010120cOQ.LJJIJ(aweme)) && (iViewPagerComponentAbilityLIZLLL = C0T1R.LIZLLL(this.LLILLJJLI)) != null)) {
                Aweme awemeK12 = iViewPagerComponentAbilityLIZLLL.k12(this.LLJILJIL);
                Aweme awemeRh = iViewPagerComponentAbilityLIZLLL.Rh(this.LLJILJIL);
                if (awemeK12 != null || awemeRh != null) {
                    this.LLJJJ = C0R12.LIZIZ.LJJI().LIZJ(aweme, awemeK12, awemeRh);
                    return;
                }
            }
            Aweme aweme2 = this.LLJILJIL;
            if (aweme2 != null && (aweme2.isAd() || C1010120cOQ.LJJIJ(aweme2))) {
                this.LLJJJ = C0R12.LIZIZ.LJJI().LJIIIIZZ(aweme2);
            }
        }
        this.LLJILLL = null;
        C0SUC.LIZ(this.LLILLL).setEcLiveExtra(null);
        DetailNavArgModel navArgModel = C0SUC.LIZ(this.LLILLL).getNavArgModel();
        if (navArgModel != null) {
            navArgModel.setTtlsLiveExtra(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            X.1ACA r2 = r3.LLJI
            r2.LIZIZ = r4
            r1 = 0
            if (r4 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r4)
            if (r0 != 0) goto L17
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r0 = r4.getRoomFeedCellStruct()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r0.getNewLiveRoomData()
        L17:
            r2.LIZJ = r0
            java.lang.String r0 = X.C1ABT.LIZLLL(r2)
            r2.LIZLLL = r0
            r0 = 0
            r2.LLFII = r0
            r2.LLFFF = r0
            X.1ACA r0 = r3.LLJI
            r0.LJJIII = r1
            X.C1ABT.LIZJ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r3.dataChannel
            java.lang.Class<X.0TZh> r1 = X.C748910TZh.class
            X.1ACA r0 = r3.LLJI
            r2.SX0(r1, r0)
            return
        L35:
            r0 = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder.F1(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void H1(View view) {
        if (C2075608Be.LIZJ(this.context)) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] <= 0 && !this.LLJJJJJIL) {
                view.setPadding(0, C497740JfY.LJIJ(), 0, 0);
            } else {
                view.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        if (i == 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "live_first_position_fix_config", true, true)) {
            E1();
        }
        C827750WdZ.LIZJ("CarViewHolder", "ViewHolderSelected");
        C1ACA c1aca = this.LLJI;
        c1aca.LLFII = false;
        c1aca.LLFFF = false;
        C0J3P.LIZ.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().U5();
        this.LLJJIJIL = true;
        Live.getLiteService().yp(z1(), this);
    }

    @Override // X.InterfaceC1209310hZh
    public final void LJJIJLIJ(MotionEvent motionEvent) {
        VerticalViewPager verticalViewPager;
        float xVelocity;
        float yVelocity;
        C0J3P c0j3p = C0J3P.LIZ;
        String strZ1 = z1();
        c0j3p.getClass();
        if (Live.getLiteService().fi(strZ1)) {
            return;
        }
        boolean zLIZLLL = C0J3P.LIZLLL();
        if (!Live.getLiteService().Jv(z1())) {
            String strZ12 = z1();
            if (C0J3P.LIZLLL == null) {
                C0J3P.LIZLLL = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = C0J3P.LIZLLL;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            if (motionEvent != null) {
                if (motionEvent.getAction() == 0) {
                    C0J3P.LJ = motionEvent.getX();
                    C0J3P.LJIIIZ = interfaceC20673515v3K4.up(strZ12);
                } else if (2 == motionEvent.getAction()) {
                    C0J3P.LJFF = motionEvent.getX();
                } else if (1 == motionEvent.getAction()) {
                    VelocityTracker velocityTracker2 = C0J3P.LIZLLL;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    float f = C0J3P.LJ;
                    float f2 = C0J3P.LJFF;
                    VelocityTracker velocityTracker3 = C0J3P.LIZLLL;
                    if (velocityTracker3 != null) {
                        xVelocity = velocityTracker3.getXVelocity();
                    } else {
                        xVelocity = 0.0f;
                    }
                    VelocityTracker velocityTracker4 = C0J3P.LIZLLL;
                    if (velocityTracker4 != null) {
                        yVelocity = velocityTracker4.getYVelocity();
                    } else {
                        yVelocity = 0.0f;
                    }
                    interfaceC20673515v3K4.N6(f, f2, xVelocity, yVelocity);
                    C0J3P.LJ = 0.0f;
                    C0J3P.LJFF = 0.0f;
                    VelocityTracker velocityTracker5 = C0J3P.LIZLLL;
                    if (velocityTracker5 != null) {
                        velocityTracker5.clear();
                    }
                    VelocityTracker velocityTracker6 = C0J3P.LIZLLL;
                    if (velocityTracker6 != null) {
                        velocityTracker6.recycle();
                    }
                    C0J3P.LIZLLL = null;
                }
            }
            if (!C0J3P.LJIIIZ) {
                interfaceC20673515v3K4.kc(motionEvent, strZ12);
            }
        } else {
            zLIZLLL = false;
        }
        if (C0J3P.LJI != zLIZLLL) {
            C0J3O c0j3o = C0J3P.LIZIZ;
            if (c0j3o != null && (verticalViewPager = ((C1209120hZO) c0j3o).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZLLL);
            }
            C0J3P.LJI = zLIZLLL;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        this.LLJILJIL = aweme;
        F1(aweme);
        this.dataChannel.SX0(C748910TZh.class, this.LLJI);
        E1();
    }

    @Override // X.C0IFX
    public final void T8(boolean z) {
        if (z) {
            C786410Ut5.LLJJIII(this.LLIZLLLIL, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void h(boolean z) {
        C1();
        C0J3P.LIZ.getClass();
        C0J3P.LJIIIIZZ = "draw";
        this.LLJJIJIL = false;
        C09AE c09ae = this.LLJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        Live.getLiteService().Zq(z1());
    }

    @C14EU
    public final void receiveLiveCloseEvent(C0J4U c0j4u) {
        Context context;
        C19EG c19egLIZIZ;
        if (this.LLJJIJIL && (context = this.context) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @C14EU
    public final void receivePauseEvent(C479930Irv c479930Irv) {
        C1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        String strLIZ;
        C0J4W c0j4wC4;
        LJI(aweme);
        C827750WdZ.LIZJ("CarViewHolder", "bind");
        this.LLJILJIL = aweme;
        this.LLJJIJI = i;
        C0J3R c0j3rLJJLIL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJLIL();
        Fragment fragment = this.LLILLJJLI;
        if (aweme != null) {
            this.LLJJIII = c0j3rLJJLIL.LIZ(fragment, aweme);
            F1(aweme);
            EventBus.LIZLLL().LJIJJ(this);
            if (y1()) {
                C0J3P.LIZ.getClass();
                C0J3T c0j3tLIZIZ = C0J3P.LIZIZ(aweme);
                if (c0j3tLIZIZ != null) {
                    strLIZ = c0j3tLIZIZ.LIZ;
                } else {
                    strLIZ = null;
                }
            } else {
                C0J3P.LIZ.getClass();
                strLIZ = C0J3P.LIZ(aweme);
            }
            this.LLJILJILJ = strLIZ;
            this.LLJILLL = C0SUC.LIZ(this.LLILLL).getEcLiveExtra();
            this.LLJJ = C0SUC.LIZ(this.LLILLL).getLiveExtraParams();
            this.LLJJI = C0SUC.LIZ(this.LLILLL);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (c0j4wC4 = iLiveOuterService.C4()) != null && !c0j4wC4.enable() && !TextUtils.isEmpty(this.LLJILJILJ)) {
                C0J3P c0j3p = C0J3P.LIZ;
                String str = this.LLJILLL;
                boolean z = this.LLJJIII;
                String str2 = this.LLJJ;
                C2189821An6 c2189821An6 = this.LLJJI;
                c0j3p.getClass();
                this.LLJIJIL = C0J3P.LJFF(aweme, str, z, str2, c2189821An6);
            }
            A1();
            G1();
            Activity activityLIZ = C1388190mED.LIZ(this.context);
            if (activityLIZ != null) {
                C487280J9a.LIZ(activityLIZ.hashCode(), this.LLJJJJLIIL);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0J4S] */
    public SearchLiveCardViewHolder(View view, Fragment fragment, String str) {
        Fragment detailSafRootFragment;
        Context context;
        C19EG c19egLIZIZ;
        Lifecycle lifecycle;
        super(view, fragment);
        C1ACA c1aca = new C1ACA(null, null, null, str, 0, -17);
        this.LLJI = c1aca;
        this.LLJJIII = true;
        this.LLJJJIL = R.id.n5p;
        this.LLJJJJ = R.id.n3w;
        this.LLJJJJLIIL = new InterfaceC487330J9f() { // from class: X.0J4S
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                int i = configuration.orientation;
                if (i != 1) {
                    if (i != 2) {
                        SearchLiveCardViewHolder searchLiveCardViewHolder = this.LL;
                        if (searchLiveCardViewHolder.LLJJJJJIL) {
                            searchLiveCardViewHolder.LLJJJJJIL = false;
                            searchLiveCardViewHolder.G1();
                            return;
                        }
                        return;
                    }
                    SearchLiveCardViewHolder searchLiveCardViewHolder2 = this.LL;
                    if (searchLiveCardViewHolder2.LLJJJJJIL) {
                        return;
                    }
                    searchLiveCardViewHolder2.LLJJJJJIL = true;
                    searchLiveCardViewHolder2.G1();
                    return;
                }
                SearchLiveCardViewHolder searchLiveCardViewHolder3 = this.LL;
                if (!searchLiveCardViewHolder3.LLJJJJJIL) {
                    return;
                }
                searchLiveCardViewHolder3.LLJJJJJIL = false;
                searchLiveCardViewHolder3.G1();
            }
        };
        RecyclableWidgetManager recyclableWidgetManagerOf = RecyclableWidgetManager.of(fragment, (LifecycleOwner) this, view, (IWidgetProvider) LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) null, true);
        setWidgetCallback(recyclableWidgetManagerOf.widgetCallback);
        this.dataChannel.SX0(C748910TZh.class, c1aca);
        recyclableWidgetManagerOf.createWidget(view, this);
        C0J3P c0j3p = C0J3P.LIZ;
        Context context2 = this.LLILLL;
        c0j3p.getClass();
        C0J3P.LIZJ(context2, fragment);
        final C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.mu1);
        this.LLIZLLLIL = c1324720kZq;
        if (TextUtils.isEmpty(C0J3P.LJIIIIZZ) && (((detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.LLILLJJLI)) != null && (lifecycle = detailSafRootFragment.getLifecycle()) != null) || (c1324720kZq != null && (context = c1324720kZq.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null))) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder$registerLifecycle$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    } else if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    Context context3;
                    C19EG c19egLIZIZ2;
                    Lifecycle lifecycle2;
                    C0J3P.LIZ.getClass();
                    C0J3P.LJIIIIZZ = "";
                    this.LL.LLJJIJIIJIL = false;
                    View view2 = c1324720kZq;
                    if (view2 == null || (context3 = view2.getContext()) == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context3)) == null || (lifecycle2 = c19egLIZIZ2.getLifecycle()) == null) {
                        return;
                    }
                    lifecycle2.removeObserver(this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    SearchLiveCardViewHolder searchLiveCardViewHolder = this.LL;
                    if (searchLiveCardViewHolder.LLJJIJIL) {
                        searchLiveCardViewHolder.E1();
                    }
                }
            });
        }
        C0J3P.LJII = true;
    }

    public static void B1(Aweme aweme, Map map, Map map2) {
        if (aweme == null) {
            return;
        }
        Object obj = map2.get("is_inner");
        if (obj != null) {
            map.put("is_inner", obj);
        }
        Object obj2 = map2.get("inner_search_id");
        if (obj2 != null) {
            map.put("inner_search_id", obj2);
        }
        Object obj3 = map2.get("rank_inner");
        if (obj3 != null) {
            map.put("rank_inner", obj3);
        }
        Object obj4 = map2.get("is_slide");
        if (obj4 != null) {
            map.put("is_slide", obj4);
        }
        Object obj5 = map2.get("slide_rank");
        if (obj5 != null) {
            map.put("slide_rank", obj5);
        }
        C652090Phv.LIZ(aweme, map);
    }
}
