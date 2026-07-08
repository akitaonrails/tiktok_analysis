package com.ss.android.ugc.aweme.live.mix;

import X.ActivityC21503719Dn;
import X.C06MM;
import X.C098200Yq;
import X.C0C64;
import X.C0IEG;
import X.C0IFX;
import X.C0IGQ;
import X.C0IXL;
import X.C0J3N;
import X.C0J3O;
import X.C0J4R;
import X.C0J4U;
import X.C0J4V;
import X.C0SUC;
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
import X.C20441214yg;
import X.C2075608Be;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2252051DCp;
import X.C479930Irv;
import X.C487280J9a;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748910TZh;
import X.C786410Ut5;
import X.C827750WdZ;
import X.EnumC2252111DCv;
import X.InterfaceC1209310hZh;
import X.InterfaceC487330J9f;
import Y.ARunnableS107S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MotionEvent;
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
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.mix.MixLiveCardViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes8.dex */
public final class MixLiveCardViewHolder extends BaseFeedLiveViewHolder implements C0IFX, InterfaceC1209310hZh {
    public final C0J4V LLIZ;
    public C0IEG LLIZLLLIL;
    public final C1324720kZq LLJ;
    public final C1ACA LLJI;
    public EnterRoomConfig LLJIJIL;
    public Aweme LLJILJIL;
    public C2189821An6 LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public final C0J4R LLJJIJIIJIL;

    @Override // X.C0IFX
    public final void LJLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLIILZL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLLLIIIILLL() {
        View view;
        Context context;
        Activity activityLIZ;
        C0IEG c0ieg;
        C128Y c128yLLLIILIL;
        C0IGQ c0igq;
        try {
            C0IEG c0ieg2 = this.LLIZLLLIL;
            if (c0ieg2 == null) {
                return false;
            }
            Boolean boolValueOf = null;
            if (c0ieg2.LLLIILIL() != null && (view = getView()) != null && (context = view.getContext()) != null && (activityLIZ = C06MM.LIZ(context)) != null && !activityLIZ.isFinishing() && (activityLIZ instanceof ActivityC21503719Dn) && (c0ieg = this.LLIZLLLIL) != null && (c128yLLLIILIL = c0ieg.LLLIILIL()) != null) {
                if ((c128yLLLIILIL instanceof C0IGQ) && (c0igq = (C0IGQ) c128yLLLIILIL) != null) {
                    boolValueOf = Boolean.valueOf(c0igq.onBackPressed());
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("MixLiveCardViewHolder", e);
        }
        return false;
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

    @Override // X.C0IFX
    public final void qd() {
    }

    public final void A1() {
        Unit unit;
        C0IEG c0ieg;
        String aid;
        LiveRoomStruct newLiveRoomDataExt;
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "playLive");
        C0J3N.LIZ.getClass();
        C0J3N.LIZJ = false;
        HandlerHook.viewPostDelay(this.LLJ, new ARunnableS107S0100000_7(this, 8), 1500L);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.trv);
        this.LLJJIII = View.generateViewId();
        viewGroup.getChildAt(0).setId(this.LLJJIII);
        EnterRoomConfig enterRoomConfig = this.LLJIJIL;
        if (enterRoomConfig != null) {
            try {
                Aweme aweme = this.LLJILJIL;
                if (aweme != null && aweme.getMobParams() != null) {
                    EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    this.LLIZ.LIZIZ.LIZ();
                    logData.logMap = linkedHashMap;
                    C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
                    if (c0ixl != null) {
                        if (c0ixl.LJJJJL != null) {
                            this.LLIZ.LIZIZ.LIZ();
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            this.LLIZ.LIZIZ.LIZ();
                            c0ixl.LJJJJL = linkedHashMap2;
                        }
                    }
                    Aweme aweme2 = this.LLJILJIL;
                    if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                        C2252051DCp c2252051DCp = C2252051DCp.LIZ;
                        EnumC2252111DCv enumC2252111DCv = EnumC2252111DCv.LIVE_ROOM_USER_COUNT;
                        String str = this.LLIZ.LIZ;
                        Aweme aweme3 = this.LLJILJIL;
                        long j = (aweme3 == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme3)) == null) ? -1L : newLiveRoomDataExt.user_count;
                        c2252051DCp.getClass();
                        C2252051DCp.LJIIJJI(enumC2252111DCv, "", Long.valueOf(j), str, aid);
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                C0J3N c0j3n = C0J3N.LIZ;
                View view = getView();
                Fragment fragment = this.LLILLJJLI;
                EnterRoomConfig enterRoomConfig2 = this.LLJIJIL;
                int i = this.LLJILLL;
                int i2 = this.LLJJIII;
                c0j3n.getClass();
                C0IEG c0iegLIZJ = C0J3N.LIZJ(view, fragment, enterRoomConfig2, i, i2);
                this.LLIZLLLIL = c0iegLIZJ;
                if (c0iegLIZJ != null) {
                    c0iegLIZJ.qJ(this);
                }
                c0ieg = this.LLIZLLLIL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("MixLiveCardViewHolder", e);
                unit = Unit.LIZ;
            }
            if (c0ieg != null) {
                c0ieg.NF(C0J3N.LIZIZ);
                unit = Unit.LIZ;
                if (unit != null) {
                    return;
                }
            }
        }
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "enterRoomConfig is null");
    }

    public final void B1() {
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "resumeLive");
        if (this.LLJJ) {
            return;
        }
        boolean z = true;
        this.LLJJ = true;
        if (((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C786410Ut5.LLJJIII(this.LLJ, 8);
            if (this.LLJIJIL != null) {
                C0J3N c0j3n = C0J3N.LIZ;
                Aweme aweme = this.LLJILJIL;
                c0j3n.getClass();
                if (!C0J3N.LJ(aweme) && !C0J3N.LIZJ) {
                    z = false;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enterRoomConfig ");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(", roomIsChange:");
            C0J3N c0j3n2 = C0J3N.LIZ;
            Aweme aweme2 = this.LLJILJIL;
            c0j3n2.getClass();
            sbLIZ.append(C0J3N.LJ(aweme2));
            sbLIZ.append(", isNeedReLoad: ");
            sbLIZ.append(C0J3N.LIZJ);
            C827750WdZ.LIZJ("MixLiveCardViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                try {
                    y1();
                    this.LLJIJIL = this.LLIZ.LIZIZ.LIZIZ(this.LLJILJIL, this.LLILLJJLI, this.LLJILJILJ);
                    A1();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("MixLiveCardViewHolder", e);
                }
            }
        }
    }

    public final void D1() {
        View viewFindViewById = findViewById(this.LLJJIII);
        if (viewFindViewById == null || !C2075608Be.LIZJ(this.context)) {
            return;
        }
        viewFindViewById.getLocationOnScreen(new int[2]);
        if (this.LLJJIJI) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        } else {
            viewFindViewById.setPadding(0, C497740JfY.LJIJ(), 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.mix.MixLiveCardViewHolder.unBind():void");
    }

    public final void y1() {
        Aweme aweme;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        UrlModel avatarLarger;
        List<String> urlList;
        List<String> urlList2;
        C0J3N.LIZ.getClass();
        if (TextUtils.isEmpty(C0J3N.LIZIZ) || TextUtils.equals("click", C0J3N.LIZIZ)) {
            return;
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
            c1324610kZfLIZJ.LJJI(this.LLJ);
        } else {
            C1819620xS4.LIZ().LIZJ(urlList2).LJJI(this.LLJ);
        }
        C786410Ut5.LLJJIII(this.LLJ, 0);
    }

    public final void z1() {
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "pauseLive");
        C0J3N.LIZ.getClass();
        C0J3N.LIZJ = true;
        C0IEG c0ieg = this.LLIZLLLIL;
        if (c0ieg != null) {
            c0ieg.e0();
        }
        C786410Ut5.LLJJIII(this.LLJ, 8);
        this.LLJJ = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final Aweme getAweme() {
        return this.LLILZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.mix.MixLiveCardViewHolder.C1(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC1209310hZh
    public final void E0(C0J3O c0j3o) {
        VerticalViewPager verticalViewPager;
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "onSelected");
        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            ((C1209120hZO) c0j3o).LIZ();
            return;
        }
        C0J3N.LIZ.getClass();
        C0J3N.LIZLLL = c0j3o;
        boolean zLIZIZ = C0J3N.LIZIZ();
        if (C0J3N.LJII != zLIZIZ) {
            C0J3O c0j3o2 = C0J3N.LIZLLL;
            if (c0j3o2 != null && (verticalViewPager = ((C1209120hZO) c0j3o2).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZIZ);
            }
            C0J3N.LJII = zLIZIZ;
        }
        this.LLJIJIL = this.LLIZ.LIZIZ.LIZIZ(this.LLJILJIL, this.LLILLJJLI, this.LLJILJILJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        if (i == 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "live_first_position_fix_config", true, true)) {
            B1();
        }
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "ViewHolderSelected");
        C1ACA c1aca = this.LLJI;
        c1aca.LLFII = false;
        c1aca.LLFFF = false;
        C0J3N.LIZ.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().U5();
        this.LLJJI = true;
    }

    @Override // X.InterfaceC1209310hZh
    public final void LJJIJLIJ(MotionEvent motionEvent) {
        String simpleName;
        Boolean boolValueOf;
        VerticalViewPager verticalViewPager;
        C19EG c19egLIZIZ;
        try {
            C0J3N c0j3n = C0J3N.LIZ;
            Context context = this.context;
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                simpleName = c19egLIZIZ.getClass().getSimpleName();
            } else {
                simpleName = "";
            }
            c0j3n.getClass();
            C1AKK liteService = Live.getLiteService();
            if (liteService != null) {
                boolValueOf = Boolean.valueOf(liteService.fi(simpleName));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return;
            }
            boolean zLIZIZ = C0J3N.LIZIZ();
            Context context2 = this.context;
            if (context2 != null) {
                C1388190mED.LIZIZ(context2);
            }
            C0J3N.LJFF(motionEvent);
            C0J3O c0j3o = C0J3N.LIZLLL;
            if (c0j3o != null && (verticalViewPager = ((C1209120hZO) c0j3o).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZIZ);
            }
            C0J3N.LJII = zLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("MixLiveCardViewHolder", e);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        this.LLJILJIL = aweme;
        C1(aweme);
        this.dataChannel.SX0(C748910TZh.class, this.LLJI);
        B1();
    }

    @Override // X.C0IFX
    public final void T8(boolean z) {
        if (z) {
            C786410Ut5.LLJJIII(this.LLJ, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void h(boolean z) {
        z1();
        C0J3N.LIZ.getClass();
        C0J3N.LIZIZ = "draw";
        this.LLJJI = false;
    }

    @C14EU
    public final void receiveLiveCloseEvent(C0J4U c0j4u) {
        Context context;
        C19EG c19egLIZIZ;
        if (this.LLJJI && (context = this.context) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @C14EU
    public final void receivePauseEvent(C479930Irv c479930Irv) {
        z1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        LJI(aweme);
        C827750WdZ.LIZJ("MixLiveCardViewHolder", "bind");
        this.LLJILJIL = aweme;
        this.LLJILLL = i;
        C1(aweme);
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJILJILJ = C0SUC.LIZ(this.LLILLL);
        y1();
        D1();
        Activity activityLIZ = C1388190mED.LIZ(this.context);
        if (activityLIZ != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this.LLJJIJIIJIL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0J4R] */
    public MixLiveCardViewHolder(View view, Fragment fragment, C0J4V c0j4v) {
        Fragment detailSafRootFragment;
        Context context;
        C19EG c19egLIZIZ;
        Lifecycle lifecycle;
        super(view, fragment);
        this.LLIZ = c0j4v;
        C1ACA c1aca = new C1ACA(null, null, null, c0j4v.LIZ, 0, -17);
        this.LLJI = c1aca;
        this.LLJJIII = R.id.n21;
        this.LLJJIJIIJIL = new InterfaceC487330J9f() { // from class: X.0J4R
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                int i = configuration.orientation;
                if (i != 1) {
                    if (i != 2) {
                        MixLiveCardViewHolder mixLiveCardViewHolder = this.LL;
                        if (mixLiveCardViewHolder.LLJJIJI) {
                            mixLiveCardViewHolder.LLJJIJI = false;
                            mixLiveCardViewHolder.D1();
                            return;
                        }
                        return;
                    }
                    MixLiveCardViewHolder mixLiveCardViewHolder2 = this.LL;
                    if (mixLiveCardViewHolder2.LLJJIJI) {
                        return;
                    }
                    mixLiveCardViewHolder2.LLJJIJI = true;
                    mixLiveCardViewHolder2.D1();
                    return;
                }
                MixLiveCardViewHolder mixLiveCardViewHolder3 = this.LL;
                if (!mixLiveCardViewHolder3.LLJJIJI) {
                    return;
                }
                mixLiveCardViewHolder3.LLJJIJI = false;
                mixLiveCardViewHolder3.D1();
            }
        };
        RecyclableWidgetManager recyclableWidgetManagerOf = RecyclableWidgetManager.of(fragment, (LifecycleOwner) this, view, (IWidgetProvider) LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) null, true);
        setWidgetCallback(recyclableWidgetManagerOf.widgetCallback);
        this.dataChannel.SX0(C748910TZh.class, c1aca);
        recyclableWidgetManagerOf.createWidget(view, this);
        C0J3N c0j3n = C0J3N.LIZ;
        Context context2 = this.LLILLL;
        c0j3n.getClass();
        C0J3N.LIZ(context2, fragment);
        final C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.mu0);
        this.LLJ = c1324720kZq;
        if (TextUtils.isEmpty(C0J3N.LIZIZ) && (((detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.LLILLJJLI)) != null && (lifecycle = detailSafRootFragment.getLifecycle()) != null) || (c1324720kZq != null && (context = c1324720kZq.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null))) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.live.mix.MixLiveCardViewHolder$registerLifecycle$1
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
                    C0J3N.LIZ.getClass();
                    C0J3N.LIZIZ = "";
                    this.LL.LLJJ = false;
                    View view2 = c1324720kZq;
                    if (view2 == null || (context3 = view2.getContext()) == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context3)) == null || (lifecycle2 = c19egLIZIZ2.getLifecycle()) == null) {
                        return;
                    }
                    lifecycle2.removeObserver(this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    MixLiveCardViewHolder mixLiveCardViewHolder = this.LL;
                    if (mixLiveCardViewHolder.LLJJI) {
                        mixLiveCardViewHolder.B1();
                    }
                }
            });
        }
        C0J3N.LIZJ = true;
    }
}
