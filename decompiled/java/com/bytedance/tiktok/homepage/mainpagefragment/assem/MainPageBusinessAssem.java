package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.AbstractActivityC1602020rn6;
import X.AbstractC1386130mAt;
import X.AbstractC1386140mAu;
import X.AbstractC1591090rVT;
import X.C01GW;
import X.C07WV;
import X.C0CXE;
import X.C0QSJ;
import X.C0RRR;
import X.C0S43;
import X.C0S4U;
import X.C0SE5;
import X.C0SHX;
import X.C0SZ8;
import X.C0T3B;
import X.C1017070cZd;
import X.C1022290ci3;
import X.C1058550deX;
import X.C1058560deY;
import X.C1260910iuv;
import X.C1308910kAL;
import X.C1357660lQy;
import X.C1360540lVc;
import X.C1372320loc;
import X.C1385040m98;
import X.C1386360mBG;
import X.C1388190mED;
import X.C1395900mQe;
import X.C13LE;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1567240qt0;
import X.C1569420qwW;
import X.C1569430qwX;
import X.C1570490qyF;
import X.C1581940rGi;
import X.C1583510rJF;
import X.C1584090rKB;
import X.C1590300rUC;
import X.C1590720rUs;
import X.C1590740rUu;
import X.C1590780rUy;
import X.C1590810rV1;
import X.C1590820rV2;
import X.C1590970rVH;
import X.C1592370rXX;
import X.C1620050sGB;
import X.C1720106oR;
import X.C19252910Tv;
import X.C19651011uW;
import X.C19EG;
import X.C1AV2;
import X.C1AV3;
import X.C1D0F;
import X.C20684815ws;
import X.C2180521AVm;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2277711EDh;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C259800zU;
import X.C296200BjG;
import X.C296550Bjp;
import X.C297720Bli;
import X.C308240C6k;
import X.C343710Ddh;
import X.C452501pT;
import X.C486860J7k;
import X.C628000OkA;
import X.C679360Qko;
import X.C687700QyG;
import X.C690970R8l;
import X.C724240Sb0;
import X.C735370Ssx;
import X.C735410St1;
import X.C735840Sti;
import X.C736480Suk;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC1002140cBY;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC2180541AVo;
import X.EnumC721820STc;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1372340loe;
import X.InterfaceC1554640qYg;
import X.InterfaceC1577520r9a;
import X.InterfaceC1577600r9i;
import X.InterfaceC1577630r9l;
import X.InterfaceC1582030rGr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ALAdapterS11S0200000_16;
import Y.ALAdapterS12S0100000_16;
import Y.ALAdapterS18S0200000_24;
import Y.ARunnableS21S1100000_16;
import Y.AUListenerS223S0200000_16;
import Y.AUListenerS229S0200000_24;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageBusinessAssem extends BaseMainPageFragmentUIAssem implements InterfaceC1372340loe, MainPageBusinessAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public C1372320loc LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C1620050sGB LLJILJIL;
    public View LLJILJILJ;
    public MainPageSeekAbility LLJJJIL;
    public volatile MainBusinessAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 41));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1569420qwW(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1590740rUu(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1590720rUs(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C1569430qwX(this));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1584090rKB(this));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1590300rUC());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C1570490qyF(this));
    public final CopyOnWriteArrayList<Animator> LLJJJJ = new CopyOnWriteArrayList<>();
    public final MainPageBusinessAssem LLJJJJJIL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainPageBusinessAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @C14EU
    public final void onComplianceDialogCheckEvent(C1590780rUy c1590780rUy) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -556924923) {
            return null;
        }
        return this;
    }

    public final View Go() {
        C1592370rXX c1592370rXXLIZ;
        View view = this.LLJIJIL;
        if (view == null) {
            return null;
        }
        return (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII() && (c1592370rXXLIZ = C1395900mQe.LIZ(view)) != null) ? c1592370rXXLIZ : view;
    }

    public final HomePageDataViewModel Jo() {
        return (HomePageDataViewModel) this.LLJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.MainBusinessAbility Lo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLJJJJLIIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJLIIIJLLLLLLLZ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJJJLIIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem.Lo():com.ss.android.ugc.aweme.base.MainBusinessAbility");
    }

    public final AbstractC1591090rVT No() {
        return (AbstractC1591090rVT) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void OK0() {
        IO2(Intrinsics.LJFF(C1058550deX.LIZLLL, "USER") ? "personal_homepage" : Intrinsics.LJFF(C1058550deX.LIZLLL, "NOTIFICATION") ? "notification_page" : "others_homepage", C1590810rV1.LIZ(C724240Sb0.LIZ(this), "profile_2_feed"));
    }

    public final TabChangeManager Oo() {
        return (TabChangeManager) this.LLJJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void Vw() {
        String uid;
        IAdPhotoModeService iAdPhotoModeService;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        ((IHomePageService) this.LLJJIJIL.getValue()).LJIILL(c19egLIZ).aA();
        HomePageDataViewModel homePageDataViewModelJo = Jo();
        if (homePageDataViewModelJo != null && !homePageDataViewModelJo.LLJILLL && LJIIIIZZ() != null && (c19egLIZ instanceof MainActivity)) {
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            Context context = getContext();
            IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
            if (C1017070cZd.LLIIL(awemeLJIIIIZZ) && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null)) != null) {
                iAdPhotoModeService.LJJI(EnumC1002140cBY.SLIDE_FOLLOW);
            }
            if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                C1022290ci3.LJIIJJI(context, awemeLJIIIIZZ);
            }
        }
        Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 != null) {
            C736480Suk c736480Suk = new C736480Suk();
            HomePageDataViewModel homePageDataViewModelJo2 = Jo();
            c736480Suk.LIZ("enter_from", homePageDataViewModelJo2 != null ? homePageDataViewModelJo2.getEventType() : null);
            HomePageDataViewModel homePageDataViewModelJo3 = Jo();
            if ((homePageDataViewModelJo3 == null || homePageDataViewModelJo3.LLJILLL) ? false : true) {
                getContext();
                MainBusinessAbility mainBusinessAbilitySo = So();
                C20684815ws.LJIILIIL("slide_left", "left", mainBusinessAbilitySo != null ? mainBusinessAbilitySo.uP2() : null, awemeLJIIIIZZ2.getAid(), c736480Suk.LIZIZ());
                HomePageDataViewModel homePageDataViewModelJo4 = Jo();
                String eventType = homePageDataViewModelJo4 != null ? homePageDataViewModelJo4.getEventType() : null;
                C0CXE.LIZ.getClass();
                boolean z = (C0CXE.LIZ() && (C1058550deX.LIZIZ(c19egLIZ, "USER") || C1058550deX.LIZIZ(c19egLIZ, "NOTIFICATION"))) ? false : true;
                boolean zFQ2 = C486860J7k.LIZIZ(c19egLIZ).FQ2("page_profile");
                C1440005kM.LIZ(new C737030Svd(86, awemeLJIIIIZZ2));
                if (eventType != null && z && zFQ2) {
                    BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJJJ.getValue();
                    CommonPageFragment commonPageFragmentXQ2 = baseScrollSwitchStateManager != null ? baseScrollSwitchStateManager.xQ2("page_profile") : null;
                    if (!(commonPageFragmentXQ2 instanceof ProfilePageFragment)) {
                        commonPageFragmentXQ2 = null;
                    }
                    if (!C690970R8l.LIZ() || Jo() == null) {
                        uid = null;
                    } else {
                        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
                        Bundle bundle = new Bundle();
                        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(awemeLJIIIIZZ2);
                        if (newLiveRoomDataExt == null) {
                            RoomFeedCellStruct roomFeedCellStruct = awemeLJIIIIZZ2.getRoomFeedCellStruct();
                            newLiveRoomDataExt = roomFeedCellStruct != null ? roomFeedCellStruct.getNewLiveRoomData() : null;
                        }
                        if (!(AwemeSaaSExtKt.isLive(awemeLJIIIIZZ2)) || newLiveRoomDataExt == null) {
                            User author = awemeLJIIIIZZ2.getAuthor();
                            if (author != null && author.roomId > 0) {
                                C786410Ut5.LJJJI("live_feed_enter_from", "live_head", bundle);
                                User author2 = awemeLJIIIIZZ2.getAuthor();
                                C786410Ut5.LJJJI("from_room_id", String.valueOf(author2 != null ? Long.valueOf(author2.roomId) : null), bundle);
                                User author3 = awemeLJIIIIZZ2.getAuthor();
                                C786410Ut5.LJJJI("from_anchor_id", author3 != null ? author3.getUid() : null, bundle);
                                C786410Ut5.LJJJI("room_request_id", awemeLJIIIIZZ2.getRequestId(), bundle);
                                C786410Ut5.LJJJI("enter_from_merge", eventType, bundle);
                            }
                        } else {
                            C786410Ut5.LJJJI("live_feed_enter_from", "live_card", bundle);
                            C786410Ut5.LJJJI("from_room_id", String.valueOf(newLiveRoomDataExt.id), bundle);
                            C786410Ut5.LJJJI("from_anchor_id", String.valueOf(newLiveRoomDataExt.getAnchorId()), bundle);
                            C786410Ut5.LJJJI("room_request_id", awemeLJIIIIZZ2.getRequestId(), bundle);
                            C786410Ut5.LJJJI("enter_from_merge", eventType, bundle);
                        }
                        if (C296550Bjp.LIZ()) {
                            String requestId = awemeLJIIIIZZ2.getAuthor().getRequestId();
                            if (requestId == null) {
                                requestId = awemeLJIIIIZZ2.getRequestId();
                            }
                            uid = null;
                            C786410Ut5.LJJIZ(bundle, "follow_recommend_nav_param", new C07WV(requestId, false));
                        } else {
                            uid = null;
                        }
                        c2277881EDy.updateProfilePageFragmentParams(commonPageFragmentXQ2, bundle);
                    }
                    C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    C735410St1 c735410St1 = new C735410St1();
                    c735410St1.LIZLLL = eventType;
                    c735410St1.LJJLIIIJILLIZJL = "slide_left";
                    c735410St1.LJJLL = "";
                    c735410St1.LJJZ = "";
                    c735410St1.LJJLJLI = "";
                    c735410St1.LJJIJLIJ(0, awemeLJIIIIZZ2);
                    MainBusinessAbility mainBusinessAbilitySo2 = So();
                    c735410St1.LJJLIIJ = mainBusinessAbilitySo2 != null ? mainBusinessAbilitySo2.uP2() : uid;
                    HomePageDataViewModel homePageDataViewModelJo5 = Jo();
                    c735410St1.LJJLIL = homePageDataViewModelJo5 != null ? homePageDataViewModelJo5.LLJ : uid;
                    c735410St1.LJJZZIII = eventType;
                    c735410St1.LJJIJL(getContext());
                    Object objLJIIIZ = c19651011uW.LJIIIZ(awemeLJIIIIZZ2, c735410St1);
                    c735840Sti.getClass();
                    C735840Sti.LIZIZ(awemeLJIIIIZZ2, objLJIIIZ);
                    String aid = awemeLJIIIIZZ2.getAid();
                    HomePageDataViewModel homePageDataViewModelJo6 = Jo();
                    String str = homePageDataViewModelJo6 != null ? homePageDataViewModelJo6.LLJI : uid;
                    HomePageDataViewModel homePageDataViewModelJo7 = Jo();
                    C1357660lQy.LIZIZ(aid, str, homePageDataViewModelJo7 != null ? homePageDataViewModelJo7.LLJILJIL : uid, "external_sharer_uid", objLJIIIZ);
                    String aid2 = awemeLJIIIIZZ2.getAid();
                    HomePageDataViewModel homePageDataViewModelJo8 = Jo();
                    String str2 = homePageDataViewModelJo8 != null ? homePageDataViewModelJo8.LLJIJIL : uid;
                    HomePageDataViewModel homePageDataViewModelJo9 = Jo();
                    C1357660lQy.LIZIZ(aid2, str2, homePageDataViewModelJo9 != null ? homePageDataViewModelJo9.LLJILJIL : uid, "_oid", objLJIIIZ);
                    AbstractC1386140mAu abstractC1386140mAu = (AbstractC1386140mAu) objLJIIIZ;
                    if (C1386360mBG.LJI(eventType)) {
                        abstractC1386140mAu.LJJJJJL = C1386360mBG.LJ();
                    }
                    C735370Ssx.LIZJ(awemeLJIIIIZZ2);
                    AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) c2277711EDh.LJJIIJ(objLJIIIZ);
                    LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(awemeLJIIIIZZ2);
                    if (newLiveRoomDataExt2 == null) {
                        RoomFeedCellStruct roomFeedCellStruct2 = awemeLJIIIIZZ2.getRoomFeedCellStruct();
                        newLiveRoomDataExt2 = roomFeedCellStruct2 != null ? roomFeedCellStruct2.getNewLiveRoomData() : uid;
                    }
                    if (!AwemeSaaSExtKt.isLive(awemeLJIIIIZZ2) || newLiveRoomDataExt2 == null) {
                        User author4 = awemeLJIIIIZZ2.getAuthor();
                        if (author4 != null && author4.roomId > 0) {
                            abstractC1386130mAt.LJ("live_feed_enter_from", "live_head");
                            abstractC1386130mAt.LJ("room_request_id", awemeLJIIIIZZ2.getRequestId());
                            User author5 = awemeLJIIIIZZ2.getAuthor();
                            abstractC1386130mAt.LJ("from_room_id", String.valueOf(author5 != null ? Long.valueOf(author5.roomId) : uid));
                        }
                    } else {
                        abstractC1386130mAt.LJ("live_feed_enter_from", "live_card");
                        abstractC1386130mAt.LJ("room_request_id", awemeLJIIIIZZ2.getRequestId());
                        abstractC1386130mAt.LJ("from_room_id", String.valueOf(newLiveRoomDataExt2.id));
                    }
                    abstractC1386130mAt.LIZLLL(awemeLJIIIIZZ2.getIsCommentPostVideo() ? 1 : 0, "is_comment_post_video");
                    abstractC1386130mAt.LJIILJJIL();
                } else {
                    uid = null;
                }
                Pair pair = awemeLJIIIIZZ2.getAwemeType() == 4003 ? new Pair(EnumC1260920iuw.CARD, Boolean.TRUE) : new Pair(EnumC1260920iuw.ITEM, Boolean.FALSE);
                EnumC1260920iuw enumC1260920iuw = (EnumC1260920iuw) pair.getFirst();
                boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
                String str3 = Intrinsics.LJFF(Ho(), "homepage_friends") ? "homepage_friends" : "homepage_hot";
                C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
                C735840Sti c735840Sti2 = C735840Sti.LIZ;
                C19651011uW c19651011uW2 = C19651011uW.LIZIZ;
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJIJLIJ(str3);
                c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
                c1260910iuv.LJIJI(awemeLJIIIIZZ2);
                c1260910iuv.LJJLL = EnumC721820STc.SLIDE_LEFT.getType();
                c1260910iuv.LJJJJZI(awemeLJIIIIZZ2.getAuthor());
                if (C296550Bjp.LIZ()) {
                    String requestId2 = awemeLJIIIIZZ2.getRequestId();
                    if (requestId2 == null) {
                        User author6 = awemeLJIIIIZZ2.getAuthor();
                        requestId2 = author6 != null ? author6.getRequestId() : uid;
                    }
                    c1260910iuv.LJJJJLI(requestId2);
                } else {
                    User author7 = awemeLJIIIIZZ2.getAuthor();
                    c1260910iuv.LJJJJLI(author7 != null ? author7.getRequestId() : uid);
                }
                c1260910iuv.LJLJI = zBooleanValue;
                Object objLJIIIZ2 = c19651011uW2.LJIIIZ(awemeLJIIIIZZ2, c1260910iuv);
                c735840Sti2.getClass();
                C735840Sti.LIZIZ(awemeLJIIIIZZ2, objLJIIIZ2);
                ((C1260910iuv) c1360540lVc.LIZ(awemeLJIIIIZZ2, objLJIIIZ2)).LJJJJI();
            } else {
                uid = null;
            }
            c736480Suk.LIZ("group_id", awemeLJIIIIZZ2.getAid());
            c736480Suk.LIZ("enter_method", "slide_left");
            HomePageDataViewModel homePageDataViewModelJo10 = Jo();
            c736480Suk.LIZ("request_id", homePageDataViewModelJo10 != null ? homePageDataViewModelJo10.LLJ : uid);
            c736480Suk.LIZ("enter_type", "normal_way");
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("enter_detail");
            mobClickObtain.setLabelName("personal_homepage");
            User author8 = awemeLJIIIIZZ2.getAuthor();
            if (author8 != null) {
                uid = author8.getUid();
            }
            mobClickObtain.setValue(uid);
            mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
            C20684815ws.onEvent(mobClickObtain);
        }
    }

    public final String Ho() {
        AbstractActivityC1602020rn6 abstractActivityC1602020rn6;
        String enterFrom;
        return ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(C724240Sb0.LIZ(this)) ? "homepage_hot" : (!(C724240Sb0.LIZ(this) instanceof MainActivity) || (abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) C724240Sb0.LIZ(this)) == null || (enterFrom = abstractActivityC1602020rn6.getEnterFrom()) == null) ? "" : enterFrom;
    }

    public final Aweme LJIIIIZZ() {
        MainBusinessAbility mainBusinessAbilitySo = So();
        if (mainBusinessAbilitySo != null) {
            return mainBusinessAbilitySo.LJIIIIZZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void LJJLIIIJLLLLLLLZ() {
        if (C1483410ohn.LJLJJI().isPaused()) {
            C1483410ohn.LJLJJI().LJJJ();
        }
    }

    public final MainBusinessAbility So() {
        MainActivityScope mainActivityScopeLIZJ;
        if (C297720Bli.LIZ()) {
            return Lo();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) == null) {
            return null;
        }
        return C1058560deY.LIZIZ(mainActivityScopeLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final boolean ZM0() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        Fragment fragmentBQ2 = C343710Ddh.LIZ(c19egLIZ).BQ2();
        if (fragmentBQ2 instanceof MainFragment) {
            return ((MainFragment) fragmentBQ2).ux() instanceof FeedRecommendFragment;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final C0SZ8 bG() {
        Fragment fragmentBQ2;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return null;
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ);
        Fragment fragmentBQ22 = tabChangeManagerLIZ.BQ2();
        if (fragmentBQ22 instanceof MainFragment) {
            fragmentBQ2 = ((MainFragment) fragmentBQ22).ux();
        } else {
            if (!TextUtils.equals(fragmentBQ22 != null ? fragmentBQ22.getTag() : null, "FRIENDS_TAB")) {
                return null;
            }
            fragmentBQ2 = tabChangeManagerLIZ.BQ2();
        }
        if (fragmentBQ2 == null) {
            return null;
        }
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentBQ2, null), IFeedFragmentAbility.class, null);
        if (!(interfaceC494301wDLIZ instanceof IHomeFeedFragmentAbility)) {
            interfaceC494301wDLIZ = null;
        }
        IHomeFeedFragmentAbility iHomeFeedFragmentAbility = (IHomeFeedFragmentAbility) interfaceC494301wDLIZ;
        if (iHomeFeedFragmentAbility != null) {
            return iHomeFeedFragmentAbility.k4();
        }
        return null;
    }

    @Override // X.InterfaceC1372340loe
    public final void ge() {
        TabChangeManager tabChangeManagerOo = Oo();
        Fragment fragmentBQ2 = tabChangeManagerOo != null ? tabChangeManagerOo.BQ2() : null;
        if (fragmentBQ2 instanceof MainFragment) {
            FeedFragment feedFragmentUx = ((MainFragment) fragmentBQ2).ux();
            if (feedFragmentUx instanceof FeedRecommendFragment) {
            }
        }
    }

    @Override // X.InterfaceC1372340loe
    public final String getEnterFrom() {
        return Ho();
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final String nM() {
        return Ho();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1372320loc c1372320loc = this.LLJ;
        if (c1372320loc != null) {
            EventBus.LIZLLL().LJJI(c1372320loc);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void qg() {
        Integer numLIZJ;
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.ne, C1385040m98.LIZ(context, false))) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        View view = this.LLJI;
        if (view != null) {
            view.setBackgroundColor(iIntValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final View FS0() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void Db(boolean z) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ne, C1385040m98.LIZ(context, !z))) != null) {
            int iIntValue = numLIZJ.intValue();
            View view = this.LLJI;
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
        }
        if (C724240Sb0.LIZ(this) instanceof MainActivity) {
            ((MainActivity) C724240Sb0.LIZ(this)).refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLJJJJJIL, MainPageBusinessAbility.class);
    }

    @Override // X.InterfaceC1372340loe
    public final void jd(boolean z) {
        C1AV2 c1av2LIZ = C1AV3.LIZ(2, "Feed", null, "dislike_mode");
        AbstractC1591090rVT abstractC1591090rVTNo = No();
        if (abstractC1591090rVTNo != null) {
            abstractC1591090rVTNo.LJJJJLL(z, true);
        }
        Vo(z, c1av2LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDislikeAwemeEvent(X.C1372310lob r11) {
        /*
            r10 = this;
            int r0 = r11.LIZIZ
            r5 = 0
            r2 = 1
            if (r0 != r2) goto L6a
            r3 = 1
        L7:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r10.Oo()
            r9 = 0
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.CQ2()
        L12:
            java.lang.String r0 = "FRIENDS_TAB"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L38
            java.lang.Class<com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service> r4 = com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service.class
            r8 = 14
            r6 = r5
            r7 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service r1 = (com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service) r1
            if (r1 == 0) goto L66
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r10.Oo()
            if (r0 == 0) goto L32
            androidx.fragment.app.Fragment r9 = r0.BQ2()
        L32:
            boolean r0 = r1.Pu(r9)
            if (r0 != r2) goto L66
        L38:
            r0 = 0
        L39:
            if (r3 != 0) goto L3d
            if (r0 == 0) goto L55
        L3d:
            boolean r0 = r11.LIZ
            if (r0 == 0) goto L56
            X.0loc r1 = r10.LLJ
            if (r1 == 0) goto L55
            X.0loe r0 = r1.LIZ
            r0.ge()
            X.0loe r0 = r1.LIZ
            r0.jd(r2)
            java.lang.String r1 = "enterDislikeMode"
            r0 = 5
            X.C308240C6k.LIZJ(r0, r1, r5)
        L55:
            return
        L56:
            X.0loc r2 = r10.LLJ
            if (r2 == 0) goto L55
            r1 = 6
            java.lang.String r0 = "exitDislikeMode"
            X.C308240C6k.LIZJ(r1, r0, r5)
            X.0loe r0 = r2.LIZ
            r0.jd(r5)
            return
        L66:
            r0 = 1
            goto L39
        L68:
            r1 = r9
            goto L12
        L6a:
            r3 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem.onDislikeAwemeEvent(X.0lob):void");
    }

    @C14EU
    public final void onMobEnterFromEvent(C1567240qt0 c1567240qt0) {
        MainPageDataViewModel mainPageDataViewModel = (MainPageDataViewModel) this.LLJJIII.getValue();
        if (mainPageDataViewModel != null) {
            mainPageDataViewModel.LL = c1567240qt0.LIZ;
        }
    }

    @C14EU
    public final void onRefreshEndEvent(C1581940rGi c1581940rGi) {
        C19EG c19egLIZIZ;
        AbstractC1591090rVT abstractC1591090rVTY01;
        if (!this.LLILZ) {
            return;
        }
        String str = c1581940rGi.LIZ;
        if (str == null) {
            str = "HOME";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -734952021) {
            if (iHashCode != 2223327) {
                if (iHashCode != 2614219 || !str.equals("USER")) {
                    return;
                }
            } else if (!str.equals("HOME")) {
                return;
            }
        } else if (!str.equals("FRIENDS_TAB")) {
            return;
        }
        Context context = getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (abstractC1591090rVTY01 = ((IHomePageService) this.LLJJIJIL.getValue()).LJIILL(c19egLIZIZ).y01()) == null) {
            return;
        }
        abstractC1591090rVTY01.LJJIJIL(str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        BaseScrollSwitchStateManager baseScrollSwitchStateManager;
        HomePageDataViewModel homePageDataViewModelJo;
        DataCenter dataCenter;
        MainPageDataViewModel mainPageDataViewModel;
        super.onViewCreated(view);
        this.LLJI = view.findViewById(R.id.ch9);
        this.LLJIJIL = view.findViewById(R.id.nwe);
        this.LLJILJILJ = view.findViewById(R.id.uxv);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (homePageDataViewModelJo = Jo()) != null && (dataCenter = (DataCenter) this.LLJJI.getValue()) != null && (mainPageDataViewModel = (MainPageDataViewModel) this.LLJJIII.getValue()) != null) {
            this.LLJ = new C1372320loc(this, homePageDataViewModelJo, mainPageDataViewModel.LL, dataCenter, fragmentLJI);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(c19egLIZ, C1590970rVH.LIZ(this));
            this.LLJILJIL = c1620050sGBLIZ;
            c1620050sGBLIZ.LJIIIZ("swipe_up_guide", new C0T3B() { // from class: X.0rUv
                @Override // X.C0T3B
                public final void LIZ() {
                    MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
                    View viewGo = mainPageBusinessAssem.Go();
                    if (viewGo != null) {
                        C786410Ut5.T4(viewGo, 1.0f);
                    }
                    BaseScrollSwitchStateManager baseScrollSwitchStateManager2 = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LLJJJ.getValue();
                    if (baseScrollSwitchStateManager2 != null) {
                        baseScrollSwitchStateManager2.KQ2(true);
                    }
                }

                @Override // X.C0T3B
                public final void LIZIZ() {
                    MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
                    View viewGo = mainPageBusinessAssem.Go();
                    if (viewGo != null) {
                        C786410Ut5.T4(viewGo, 0.5f);
                    }
                    BaseScrollSwitchStateManager baseScrollSwitchStateManager2 = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LLJJJ.getValue();
                    if (baseScrollSwitchStateManager2 != null) {
                        baseScrollSwitchStateManager2.KQ2(false);
                    }
                }
            });
            C1620050sGB c1620050sGB = this.LLJILJIL;
            if (c1620050sGB != null) {
                c1620050sGB.LJIIIZ("not_interested_tutorial", new C0T3B() { // from class: X.0rUw
                    @Override // X.C0T3B
                    public final void LIZ() {
                        MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
                        View viewGo = mainPageBusinessAssem.Go();
                        if (viewGo != null) {
                            C786410Ut5.T4(viewGo, 1.0f);
                        }
                        BaseScrollSwitchStateManager baseScrollSwitchStateManager2 = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LLJJJ.getValue();
                        if (baseScrollSwitchStateManager2 != null) {
                            baseScrollSwitchStateManager2.KQ2(true);
                        }
                    }

                    @Override // X.C0T3B
                    public final void LIZIZ() {
                        MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
                        View viewGo = mainPageBusinessAssem.Go();
                        if (viewGo != null) {
                            C786410Ut5.T4(viewGo, 0.5f);
                        }
                        BaseScrollSwitchStateManager baseScrollSwitchStateManager2 = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LLJJJ.getValue();
                        if (baseScrollSwitchStateManager2 != null) {
                            baseScrollSwitchStateManager2.KQ2(false);
                        }
                    }
                });
            }
        }
        final C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJJJ.getValue()) != null) {
            baseScrollSwitchStateManager.LLJILJILJ.observe(this, new Observer() { // from class: X.0qzz
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MainBusinessAbility mainBusinessAbilityLIZJ;
                    C19EG c19egLIZIZ;
                    TabChangeManager tabChangeManagerOo;
                    Configuration configuration;
                    Pair pair = (Pair) obj;
                    Context context = null;
                    if (C297720Bli.LIZ()) {
                        mainBusinessAbilityLIZJ = this.LL.Lo();
                    } else {
                        mainBusinessAbilityLIZJ = C1058560deY.LIZJ(C1558360qeg.LJI(c19egLIZ2, null));
                    }
                    if (mainBusinessAbilityLIZJ != null) {
                        mainBusinessAbilityLIZJ.Ug2();
                    }
                    MainPageBusinessAssem mainPageBusinessAssem = this.LL;
                    String str = (String) pair.getFirst();
                    Context context2 = mainPageBusinessAssem.getContext();
                    if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (tabChangeManagerOo = mainPageBusinessAssem.Oo()) != null) {
                        C1620050sGB c1620050sGBLIZ2 = C0SHX.LIZ(c19egLIZIZ, null);
                        if (!c1620050sGBLIZ2.LJI() && !c1620050sGBLIZ2.LIZLLL()) {
                            C1440005kM.LIZ(new IEvent() { // from class: X.0Szk
                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent post() {
                                    C1440005kM.LIZ(this);
                                    return this;
                                }

                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent postSticky() {
                                    C1440005kM.LIZIZ(this);
                                    return this;
                                }
                            });
                            if (!TextUtils.equals(tabChangeManagerOo.CQ2(), str)) {
                                ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).removeNoticeView();
                            }
                            IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
                            Fragment fragmentBQ2 = tabChangeManagerOo.BQ2();
                            if (fragmentBQ2 != null) {
                                context = fragmentBQ2.getContext();
                            }
                            if (iMSAdaptionService.LIZLLL(context)) {
                                Resources resources = c19egLIZIZ.getResources();
                                if (resources != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZIZ, "//duo");
                                    smartRouteBuildRoute.withParam("duo_type", "duo_bottom_click");
                                    smartRouteBuildRoute.withParam("duo_clicked_tab_name", str);
                                    smartRouteBuildRoute.open();
                                    return;
                                }
                                if (TextUtils.equals(str, "PUBLISH")) {
                                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                                    c1389890mGx.LJIIIZ(2131832497);
                                    c1389890mGx.LJIIJJI();
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        InterfaceC1583870rJp interfaceC1583870rJpQG0 = ((IHomePageService) this.LL.LLJJIJIL.getValue()).LJIILL(c19egLIZ2).QG0((String) pair.getFirst());
                        if (interfaceC1583870rJpQG0 == null) {
                            return;
                        }
                        interfaceC1583870rJpQG0.LJIIJ();
                        return;
                    }
                    InterfaceC1583870rJp interfaceC1583870rJpQG02 = ((IHomePageService) this.LL.LLJJIJIL.getValue()).LJIILL(c19egLIZ2).QG0((String) pair.getFirst());
                    if (interfaceC1583870rJpQG02 == null) {
                        return;
                    }
                    interfaceC1583870rJpQG02.LIZIZ();
                }
            });
        }
        DataCenter dataCenter2 = (DataCenter) this.LLJJI.getValue();
        if (dataCenter2 != null) {
            dataCenter2.yQ2("ENTER_DISLIKE_MODE", new Observer() { // from class: X.0lof
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Object obj2 = ((C0RD4) obj).LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        C1372320loc c1372320loc = this.LL.LLJ;
                        if (c1372320loc != null) {
                            c1372320loc.LIZ.ge();
                            c1372320loc.LIZ.jd(true);
                            C308240C6k.LIZJ(5, "enterDislikeMode", false);
                            return;
                        }
                        return;
                    }
                    C1372320loc c1372320loc2 = this.LL.LLJ;
                    if (c1372320loc2 == null) {
                        return;
                    }
                    C308240C6k.LIZJ(6, "exitDislikeMode", false);
                    c1372320loc2.LIZ.jd(false);
                }
            }, false);
            dataCenter2.yQ2("setTabBackground", new Observer() { // from class: X.0bsW
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MainPageBusinessAssem mainPageBusinessAssem = this.LL;
                    Object obj2 = ((C0RD4) obj).LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    mainPageBusinessAssem.Db(((Boolean) obj2).booleanValue());
                }
            }, false);
            dataCenter2.yQ2("proformToTab", new Observer() { // from class: X.0bsX
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MainPageBusinessAssem mainPageBusinessAssem = this.LL;
                    Object obj2 = ((C0RD4) obj).LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    String str = (String) obj2;
                    if (str == null) {
                        mainPageBusinessAssem.getClass();
                        return;
                    }
                    View view2 = mainPageBusinessAssem.LLJIJIL;
                    if (view2 == null) {
                        return;
                    }
                    HandlerHook.viewPost(view2, new ARunnableS21S1100000_16(mainPageBusinessAssem, str, 5));
                }
            }, true);
            dataCenter2.yQ2("performClickTab", new Observer() { // from class: X.0e4G
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C0RD4 c0rd4 = (C0RD4) obj;
                    Object obj2 = c0rd4.LIZIZ;
                    Object obj3 = null;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    if (C1585030rLh.LJIILL() && obj2 != null && Intrinsics.LJFF("USER", obj2)) {
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(this.LL);
                        if (c19egLIZ3 != null) {
                            Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZ3);
                            Object obj4 = c0rd4.LIZIZ;
                            if (obj4 != null) {
                                obj3 = obj4;
                            }
                            hoxLIZ.TQ2(new Bundle(), (String) obj3, false);
                            return;
                        }
                        return;
                    }
                    AbstractC1591090rVT abstractC1591090rVTNo = this.LL.No();
                    if (abstractC1591090rVTNo == null) {
                        return;
                    }
                    Object obj5 = c0rd4.LIZIZ;
                    if (obj5 != null) {
                        obj3 = obj5;
                    }
                    abstractC1591090rVTNo.LJJIIZI((String) obj3);
                }
            }, true);
        }
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ3).wQ2("HOME", new InterfaceC1055110dYz() { // from class: X.0rUx
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle) {
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle) {
                    C1ER1.LIZIZ.LLL();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void pL2(boolean z) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("MainPageBusinessAssem", "hideBottomTab");
        View viewGo = Go();
        if (viewGo == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C1AV2 c1av2LIZ = C1AV3.LIZ(4, "Feed", null, "mainpage_assem");
        valueAnimatorOfFloat.addListener(new ALAdapterS11S0200000_16(viewGo, c1av2LIZ, 0));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS223S0200000_16(viewGo, c1av2LIZ, 0));
        if (z) {
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.end();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLJJJJJIL, MainPageBusinessAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void showBottomTab(boolean z) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("MainPageBusinessAssem", "showBottomTab");
        View viewGo = Go();
        if (viewGo == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewGo);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setStartDelay(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addListener(new ALAdapterS12S0100000_16(viewGo, 2));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(viewGo, 15));
        if (z) {
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.end();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void IO2(String str, String str2) {
        ISeriesFeedService iSeriesFeedServiceLIZIZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        boolean zIsConnected;
        String strLIZJ;
        TabChangeManager tabChangeManagerOo = Oo();
        if (tabChangeManagerOo != null && (tabChangeManagerOo.BQ2() instanceof MainFragment)) {
            FeedFragment feedFragmentUx = ((MainFragment) tabChangeManagerOo.BQ2()).ux();
            C1058550deX.LIZLLL = null;
            if (feedFragmentUx instanceof FeedRecommendFragment) {
                C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_hot");
                c1590820rV2.LJIJ = str2;
                c1590820rV2.LIZLLL = str;
                c1590820rV2.LJIJJ = C735370Ssx.LJIILIIL(LJIIIIZZ());
                c1590820rV2.LJIILLIIL(LJIIIIZZ());
                c1590820rV2.LJIILJJIL();
                if (C0SE5.LIZIZ(LJIIIIZZ())) {
                    C628000OkA.LIZ.getClass();
                    C2344009Gk c2344009Gk = C628000OkA.LIZIZ;
                    c2344009Gk.getClass();
                    c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                    C20684815ws.LJIILLIIL("enter_homepage_from_other_profile", c2344009Gk.LIZ);
                    C628000OkA.LIZIZ(LJIIIIZZ());
                    return;
                }
                return;
            }
            if (feedFragmentUx instanceof FeedFollowFragment) {
                C1590820rV2 c1590820rV22 = new C1590820rV2("enter_homepage_follow");
                c1590820rV22.LJIJ = str2;
                c1590820rV22.LIZLLL = str;
                c1590820rV22.LJIJJ = C735370Ssx.LJIILIIL(LJIIIIZZ());
                c1590820rV22.LJIILLIIL(LJIIIIZZ());
                C1D0F c1d0f = C1D0F.LIZ;
                if (c1d0f != null) {
                    zIsConnected = c1d0f.isConnected();
                } else {
                    zIsConnected = false;
                }
                c1590820rV22.LJJIII = zIsConnected;
                if (c1d0f == null || (strLIZJ = c1d0f.LIZJ()) == null) {
                    strLIZJ = "";
                }
                c1590820rV22.LJJIIJ = strLIZJ;
                c1590820rV22.LJIILJJIL();
                return;
            }
            if (feedFragmentUx instanceof InterfaceC1582030rGr) {
                C1590820rV2 c1590820rV23 = new C1590820rV2("enter_homepage_nearby");
                c1590820rV23.LJIJ = str2;
                c1590820rV23.LIZLLL = str;
                c1590820rV23.LJIJJ = C735370Ssx.LJIILIIL(LJIIIIZZ());
                c1590820rV23.LJIILLIIL(LJIIIIZZ());
                c1590820rV23.LJIILJJIL();
                return;
            }
            if (feedFragmentUx instanceof InterfaceC1577630r9l) {
                C1590820rV2 c1590820rV24 = new C1590820rV2("enter_homepage_live");
                c1590820rV24.LJIJ = str2;
                c1590820rV24.LIZLLL = str;
                c1590820rV24.LJIJJ = C735370Ssx.LJIILIIL(LJIIIIZZ());
                c1590820rV24.LJIILLIIL(LJIIIIZZ());
                c1590820rV24.LJIILJJIL();
                return;
            }
            if (!(feedFragmentUx instanceof InterfaceC1577600r9i) || (iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null) {
                return;
            }
            interfaceC1577520r9aLIZIZ.LJ(str, str2, null);
        }
    }

    public final void Vo(boolean z, C1AV2 c1av2) {
        float alpha;
        View view = this.LLJI;
        float f = 0.0f;
        if (view != null) {
            alpha = view.getAlpha();
        } else {
            alpha = 0.0f;
        }
        if (!z) {
            f = 1.0f;
        }
        C679360Qko.LIZ(alpha, f, view);
        Zo(z, null, false, false, c1av2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, X.1AV2] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final void Zo(boolean z, Animator animator, boolean z2, boolean z3, C1AV2 c1av2) {
        ?? BQ2;
        String strCQ2;
        C19EG c19egLIZ;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        C0S43 c0s43;
        ?? Ki;
        C1AV2 c1av22 = c1av2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMainFragmentTabContainer, hide: ");
        sbLIZ.append(z);
        C308240C6k.LIZJ(1, C2188811AlT.LIZIZ(sbLIZ), !z);
        C259800zU c259800zU = new C259800zU();
        TabChangeManager tabChangeManagerOo = Oo();
        if (tabChangeManagerOo != null && (BQ2 = tabChangeManagerOo.BQ2()) != 0) {
            c259800zU.element = BQ2;
            if (!(BQ2 instanceof MainFragment) && z3) {
                TabChangeManager tabChangeManagerOo2 = Oo();
                if (tabChangeManagerOo2 != null && (Ki = tabChangeManagerOo2.Ki("HOME")) != 0) {
                    c259800zU.element = Ki;
                } else {
                    return;
                }
            }
            float f = 0.0f;
            int i = 0;
            String str = null;
            if (c259800zU.element instanceof MainFragment) {
                C1AV2 c1av2LIZ = c1av22;
                if (z2) {
                    if (c1av22 == null) {
                        c1av2LIZ = C1AV3.LIZ(2, "Feed", null, "mainpage_assem");
                    }
                    FrameLayout frameLayout = ((MainFragment) c259800zU.element).LLILZLL;
                    if (!z) {
                        f = 1.0f;
                    }
                    C2180521AVm.LIZJ(frameLayout, f, c1av2LIZ);
                    FrameLayout frameLayout2 = ((MainFragment) c259800zU.element).LLILZLL;
                    if (z) {
                        i = 4;
                    }
                    C2180521AVm.LIZLLL(frameLayout2, i, c1av2LIZ);
                    return;
                }
                C259800zU c259800zU2 = new C259800zU();
                ?? LIZ = c1av22;
                if (c1av22 == null) {
                    LIZ = C1AV3.LIZ(3, "Feed", null, "mainpage_assem");
                }
                c259800zU2.element = LIZ;
                if (animator != null) {
                    float[] fArr = new float[2];
                    fArr[0] = ((MainFragment) c259800zU.element).LLILZLL.getAlpha();
                    if (!z) {
                        f = 1.0f;
                    }
                    fArr[1] = f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                    valueAnimatorOfFloat.setDuration(animator.getDuration());
                    valueAnimatorOfFloat.setInterpolator(animator.getInterpolator());
                    valueAnimatorOfFloat.setStartDelay(animator.getStartDelay());
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS229S0200000_24(c259800zU, c259800zU2, 0));
                    valueAnimatorOfFloat.addListener(new ALAdapterS18S0200000_24(this, valueAnimatorOfFloat, 1));
                    this.LLJJJJ.add(valueAnimatorOfFloat);
                    valueAnimatorOfFloat.start();
                } else {
                    FrameLayout frameLayout3 = ((MainFragment) c259800zU.element).LLILZLL;
                    C2180521AVm.LIZ(frameLayout3, EnumC2180541AVo.V_ANIMATE, LIZ);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = frameLayout3.animate();
                    if (!z) {
                        f = 1.0f;
                    }
                    viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).start();
                }
                FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
                if (z) {
                    c0s43 = C0S43.CLEAN_MODE_OPEN;
                } else {
                    c0s43 = C0S43.CLEAN_MODE_CLOSE;
                }
                C1AV2 c1av23 = (C1AV2) c259800zU2.element;
                if (c1av23 != null) {
                    str = c1av23.LIZIZ;
                }
                feedInfraTimingSensor.getClass();
                FeedInfraTimingSensor.LIZLLL(c0s43, str);
                return;
            }
            TabChangeManager tabChangeManagerOo3 = Oo();
            if (tabChangeManagerOo3 != null) {
                strCQ2 = tabChangeManagerOo3.CQ2();
            } else {
                strCQ2 = null;
            }
            if (!Intrinsics.LJFF(strCQ2, "FRIENDS_TAB")) {
                return;
            }
            IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
            if ((iFriendsTabV3Service != null && iFriendsTabV3Service.Pu((Fragment) c259800zU.element)) || (c19egLIZ = C724240Sb0.LIZ(this)) == null || (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZ, null))) == null) {
                return;
            }
            if (!z) {
                f = 1.0f;
            }
            iFriendsTabLayoutAbilityLIZLLL.Sl2(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility
    public final void YA1(boolean z, boolean z2, boolean z3, boolean z4, Animator animator, boolean z5, boolean z6, C1AV2 c1av2) {
        float alpha;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideMainPageTabs, hide=");
        sbLIZ.append(z);
        C1720106oR.LJI("MainPageBusinessAssem", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<Animator> it2 = this.LLJJJJ.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        this.LLJJJJ.clear();
        if (z2) {
            Zo(z, animator, z5, z6, c1av2);
        }
        if (z3) {
            AbstractC1591090rVT abstractC1591090rVTNo = No();
            int i2 = 0;
            if (abstractC1591090rVTNo != null) {
                abstractC1591090rVTNo.LJJJJLL(z, false);
            }
            float f = 1.0f;
            if (z5) {
                View view = this.LLJI;
                if (view != null) {
                    if (z) {
                        f = 0.0f;
                    }
                    C786410Ut5.T4(view, f);
                }
                AbstractC1591090rVT abstractC1591090rVTNo2 = No();
                if (abstractC1591090rVTNo2 != null) {
                    if (z) {
                        i2 = 4;
                    }
                    abstractC1591090rVTNo2.LJJJJZ(i2, c1av2);
                }
            } else {
                View view2 = this.LLJI;
                if (view2 != null) {
                    alpha = view2.getAlpha();
                } else {
                    alpha = 0.0f;
                }
                if (z) {
                    f = 0.0f;
                }
                C679360Qko.LIZ(alpha, f, view2);
            }
        }
        if (z4) {
            if (this.LLJJJIL == null) {
                this.LLJJJIL = (MainPageSeekAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MainPageSeekAbility.class, null);
            }
            MainPageSeekAbility mainPageSeekAbility = this.LLJJJIL;
            if (mainPageSeekAbility != null) {
                mainPageSeekAbility.uo1(z);
            }
        }
    }
}
