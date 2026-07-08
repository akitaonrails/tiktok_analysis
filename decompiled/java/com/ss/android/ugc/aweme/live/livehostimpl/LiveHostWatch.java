package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC2361009My;
import X.AbstractC848400XPy;
import X.C0DHG;
import X.C0IF8;
import X.C0IIR;
import X.C0IJT;
import X.C0IL2;
import X.C0IOU;
import X.C0IQK;
import X.C0IVM;
import X.C0J3N;
import X.C0J3O;
import X.C0J4Y;
import X.C0J53;
import X.C0J54;
import X.C0J5O;
import X.C0J7C;
import X.C0J7D;
import X.C0N61;
import X.C0VSJ;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1090000eTG;
import X.C1094620eai;
import X.C1161920gLG;
import X.C118300cf;
import X.C1209120hZO;
import X.C1306400k6I;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1440005kM;
import X.C1604850rrf;
import X.C1701940uOG;
import X.C19503011Sa;
import X.C19719212De;
import X.C1AE5;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2175221ABc;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C326690CrL;
import X.C421540Gfw;
import X.C463880IHa;
import X.C464680IKc;
import X.C474500IjA;
import X.C475360IkY;
import X.C480000Is2;
import X.C480220IsO;
import X.C486190J4v;
import X.C486200J4w;
import X.C486220J4y;
import X.C486230J4z;
import X.C500260Jjc;
import X.C632670Orh;
import X.C784440Upu;
import X.C804420Vh2;
import X.C985403tE;
import X.EnumC1094630eaj;
import X.EnumC480200IsM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1835090xr1;
import X.InterfaceC465210IMd;
import X.InterfaceC470090Ic3;
import X.InterfaceC586170Myt;
import X.InterfaceC588410N5z;
import X.InterfaceC671190QUj;
import X.RunnableC519000KXa;
import Y.AObjectS283S0200000_7;
import Y.AfS103S0300000_7;
import Y.AfS143S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateFragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.gecko.GeckoStorageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveParallelStreamCDNStrategyKey;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomBoostExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.services.LiveMonitorService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ISearchCardLiveService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS316S0300000_16;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.api.feed.SortStatsTag;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostWatch implements IHostWatch {
    public C486200J4w LL;
    public C486190J4v LLILLJJLI;
    public final Map<Long, String> LLILLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void abortEnterRoomBoost() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).lA0();
        C463880IHa.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09My, X.0J4w] */
    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void addScreenShotListener() {
        ?? r2 = new AbstractC2361009My() { // from class: X.0J4w
            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                super.onShot(str);
                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Sx(str);
                return false;
            }
        };
        this.LL = r2;
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJFF(r2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC465210IMd getAudioPlayerController() {
        return new InterfaceC465210IMd() { // from class: X.0dUy
            public InterfaceC1484830ok5 LIZ;

            @Override // X.InterfaceC465210IMd
            public final boolean isPlaying() {
                InterfaceC1483850oiV playState;
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                return (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null || !playState.isPlaying()) ? false : true;
            }

            @Override // X.InterfaceC465210IMd
            public final void release() {
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.release();
                }
            }

            @Override // X.InterfaceC465210IMd
            public final void resume() {
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.resume();
                }
            }

            @Override // X.InterfaceC465210IMd
            public final void stop() {
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.stop();
                }
            }

            @Override // X.InterfaceC465210IMd
            public final void LIZ(final FrameLayout frameLayout) {
                if (this.LIZ == null) {
                    InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
                    C1478410oZj c1478410oZj = new C1478410oZj();
                    c1478410oZj.LIZIZ = true;
                    this.LIZ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
                }
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.LIZJ(new InterfaceC1483820oiS() { // from class: X.0dUz
                        @Override // X.InterfaceC1483820oiS
                        public final /* synthetic */ boolean bn() {
                            return true;
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                            return null;
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final /* synthetic */ Surface getSurface() {
                            return null;
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final /* synthetic */ void hj() {
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final /* synthetic */ void pe() {
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final HashMap getParams() {
                            return new HashMap();
                        }

                        @Override // X.InterfaceC1483820oiS
                        public final FrameLayout getPlayViewContainer() {
                            return frameLayout;
                        }
                    });
                }
            }

            @Override // X.InterfaceC465210IMd
            public final void Lf(String str) {
                C1482580ogS c1482580ogS = new C1482580ogS();
                c1482580ogS.LIZ = C2254508sR.LIZ(str);
                C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                c1058540deW.LIZIZ(str);
                c1058540deW.LIZJ = 0;
                C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
                c1482570ogRLIZ.LIZ(EnumC1046760dLW.AUDIO);
                C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                c1482580ogS2.LJ = c1482570ogRLIZ;
                InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.LJ(new C1484680ojq(c1482580ogS2).LIZ());
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getEnterRoomBoostEnable() {
        return LiveEnterRoomBoostExp.INSTANCE.enable();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getEnterRoomBoostType() {
        return LiveEnterRoomBoostExp.INSTANCE.boostType();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Rect getLiveIconRect() {
        return LiveIconGenerator.LLJJJ ? LiveIconGenerator.LLJJIJIIJIL : new Rect();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void markNearbyEnter() {
        Keva.getRepo("nearby_bubble_repo").storeBoolean(C0J53.LIZ("bubble_enter"), true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onFeedRequestTriggerFinish() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).MW();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void removeScreenShotListener() {
        C486200J4w c486200J4w = this.LL;
        if (c486200J4w != null) {
            ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZLLL(c486200J4w);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateMixLiveScrollStatus() {
        VerticalViewPager verticalViewPager;
        C0J3N.LIZ.getClass();
        boolean zLIZIZ = C0J3N.LIZIZ();
        if (C0J3N.LJII != zLIZIZ) {
            C0J3O c0j3o = C0J3N.LIZLLL;
            if (c0j3o != null && (verticalViewPager = ((C1209120hZO) c0j3o).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZIZ);
            }
            C0J3N.LJII = zLIZIZ;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getAnchorPosition() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().getAnchorPosition();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getFollowWidgetType() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowJumpToLive() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIIJJI();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowWidgetExp() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().getIsFollowWidgetExp();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getLiveScopedUserId() {
        return LiveMonitorService.LIZ().getLiveScopedUserId();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getWidgetAnchorNum() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().getWidgetAnchorNum();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void initPitayaAfterUserTrigger() {
        ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).initPitayaAfterUserTrigger();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateSearchScrollStatus() {
        ((ISearchCardLiveService) ServiceManager.get().getService(ISearchCardLiveService.class)).LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long getBackgroundTime() {
        return C480000Is2.LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC671190QUj getILiveSearchService() {
        return new InterfaceC671190QUj() { // from class: X.0QUh
            @Override // X.InterfaceC671190QUj
            public final String LJIILJJIL() {
                return C1ER1.LIZIZ.LJIILJJIL();
            }

            @Override // X.InterfaceC671190QUj
            public final void LIZ(LiveSearchIntermediateFragment liveSearchIntermediateFragment, C671180QUi c671180QUi) {
                Word word;
                SearchSugEntity searchSugEntity = new SearchSugEntity();
                searchSugEntity.sugType = c671180QUi.LIZJ;
                searchSugEntity.content = c671180QUi.LIZ;
                searchSugEntity.mWord = new Word(c671180QUi.LJFF, c671180QUi.LJI);
                int i = c671180QUi.LIZIZ;
                String str = c671180QUi.LJ;
                String str2 = c671180QUi.LIZLLL;
                String strLIZLLL = "";
                if (liveSearchIntermediateFragment.getActivity() != null && (word = searchSugEntity.mWord) != null) {
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    n nVar = new n();
                    try {
                        nVar.LJJIIJ("raw_query", searchSugEntity.content);
                        nVar.LJJIIJ("words_content", word.getWord());
                        nVar.LJJIII(Integer.valueOf(i), "words_position");
                        if (str2 == null) {
                            str2 = "";
                        }
                        nVar.LJJIIJ("impr_id", str2);
                        nVar.LJJIIJ("group_id", word.getId());
                        nVar.LJJIIJ("words_source", "sug");
                        nVar.LJJIIJ("sug_type", searchSugEntity.sugType);
                        nVar.LJJIIJ("feedback_id", str);
                        strLIZLLL = C08JS.LIZLLL(nVar);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    builderAppendQueryParameter.appendQueryParameter("extra", strLIZLLL);
                    ComplianceServiceProvider.LJJ().LIZIZ(liveSearchIntermediateFragment.getActivity(), builderAppendQueryParameter);
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean isAppBackground() {
        return C2214201BlK.LJIIJJI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void cancelPTFTask(long j) {
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).a70(j);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long cleanLiveUnimportantGecko(boolean z) {
        String strC5;
        IHostResource iHostResource;
        IHostResource iHostResource2;
        GeckoStorageOptSetting geckoStorageOptSetting = GeckoStorageOptSetting.INSTANCE;
        long folderSize = 0;
        if (geckoStorageOptSetting.isExp() && !geckoStorageOptSetting.channelList().isEmpty()) {
            for (String str : geckoStorageOptSetting.channelList()) {
                if (!TextUtils.isEmpty(str) && (iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null) {
                    strC5 = iHostResource2.C5(str);
                } else {
                    strC5 = null;
                }
                if (!TextUtils.isEmpty(strC5)) {
                    C0VSJ c0vsj = new C0VSJ(strC5);
                    if (c0vsj.exists()) {
                        folderSize += FileUtils.INSTANCE.getFolderSize(c0vsj);
                        if (z && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null && !TextUtils.isEmpty(strC5)) {
                            iHostResource.pB(strC5);
                        }
                    }
                }
            }
        }
        return folderSize;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void clearSessionId(Long l) {
        if (l != null) {
            this.LLILLL.remove(Long.valueOf(l.longValue()));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void deleteUnreadLiveCard(long j) {
        String aid;
        Long lLJIILIIL;
        for (C0J7D c0j7d : C0J7C.LIZIZ()) {
            Aweme aweme = c0j7d.LIZ;
            if (aweme != null && (aid = aweme.getAid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null && lLJIILIIL.longValue() == j) {
                Aweme aweme2 = c0j7d.LIZ;
                if (aweme2 != null) {
                    C1440005kM.LIZ(new C486220J4y(aweme2));
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void enqueueFlushTrigger(int i) {
        C1AE5.LIZ.getClass();
        C1AE5.LIZ(i);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final C0IOU getSearchComponent(final String str) {
        return new C0IOU() { // from class: X.0IQF
            @Override // X.C0IOU
            public final boolean LJIIJJI() {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIIJJI();
            }

            @Override // X.C0IOU
            public final List<EnterRoomConfig> LJIILJJIL() {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIILJJIL();
            }

            @Override // X.C0IOU
            public final void release() {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).release();
            }

            @Override // X.C0IOU
            public final void LJIIL(long j) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIIL(j);
            }

            @Override // X.C0IOU
            public final void LJIILIIL(long j) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIILIIL(j);
            }

            @Override // X.C0IOU
            public final void LJIILLIIL(Map<String, String> map) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIILLIIL(map);
            }

            @Override // X.C0IOU
            public final void LJIILL(int i, C0IOT c0iot) {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().getSearchComponent(str).LJIILL(i, c0iot);
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getSessionId(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            return (String) ((LinkedHashMap) this.LLILLL).get(Long.valueOf(jLongValue));
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void mixLiveScrollToNextItem(boolean z) {
        C0J3N.LIZ.getClass();
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollToNextItem, needDelete=");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("MixLivePlayHelper", C2188811AlT.LIZIZ(sbLIZ));
            C0J3O c0j3o = C0J3N.LIZLLL;
            if (c0j3o != null) {
                C1209120hZO c1209120hZO = (C1209120hZO) c0j3o;
                Aweme awemeLJIIIIZZ = c1209120hZO.LIZ.LJIIIIZZ();
                if (awemeLJIIIIZZ != null && AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
                    C421540Gfw.LIZ(new AObjectS283S0200000_7(c1209120hZO, awemeLJIIIIZZ, 1));
                    return;
                }
                return;
            }
            return;
        }
        C0J3O c0j3o2 = C0J3N.LIZLLL;
        if (c0j3o2 == null) {
            return;
        }
        ((C1209120hZO) c0j3o2).LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onSceneTriggerArrived(String str) {
        EnumC480200IsM.Companion.getClass();
        EnumC480200IsM enumC480200IsMLIZ = C480220IsO.LIZ(str);
        if (enumC480200IsMLIZ != null) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(enumC480200IsMLIZ);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void openWatchLaterHistoryActivity(Context context) {
        SmartRouter.buildRoute(context, "//live/watch_later_history").open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void recordExitRoomId(long j) {
        C1440005kM.LIZ(new C486230J4z(j));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void searchScrollToNextItem(boolean z) {
        ((ISearchCardLiveService) ServiceManager.get().getService(ISearchCardLiveService.class)).searchScrollToNextItem(z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void setIsFollowJumpToLive(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJJIJ(z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateRecInfo(Map<String, ? extends List<SortStatsTag>> map) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).updateRecInfo(map);
    }

    public static void LIZIZ(EnterRoomConfig enterRoomConfig, String str) {
        if (C500260Jjc.LJJIIZ(enterRoomConfig.mLogData.openFromSchema)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_schema_enter_room");
            c474500IjALIZ.LJJII(str, "failed_reason");
            if (Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterFromMerge, "push")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push_");
                sbLIZ.append(str);
                c474500IjALIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "push_process_status");
            }
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Room getUnreadLiveCard(Set<Long> set, int i) {
        Aweme awemeLIZJ = C0J7C.LIZJ(set, i);
        if (awemeLIZJ != null) {
            return C2175221ABc.LIZ(C0J4Y.LJI(awemeLIZJ));
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Long hasUnreadLiveCard(Set<Long> set, int i) {
        String aid;
        Aweme awemeLIZJ = C0J7C.LIZJ(set, i);
        if (awemeLIZJ != null && (aid = awemeLIZJ.getAid()) != null) {
            return C2095008Iq.LJIILIIL(aid);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onECMixFeedLiveFirstFrameRender(EnterRoomConfig enterRoomConfig, long j) {
        C1604850rrf c1604850rrfLIZJ;
        ECMixFeedService eCMixFeedService = (ECMixFeedService) PluggableExtentionKt.pluggableSpi$default(ECMixFeedService.class, false, false, false, 14, null);
        if (eCMixFeedService != null && eCMixFeedService.LIZLLL(enterRoomConfig) && (c1604850rrfLIZJ = eCMixFeedService.LIZJ()) != null) {
            c1604850rrfLIZJ.LIZ(enterRoomConfig, j);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void predictP95Strategy(String str, C0IVM c0ivm) {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        StrategyCenter.getInstance().setStringValue(12001, str);
        String stringValue = StrategyCenter.getInstance().getStringValue(12000, "");
        if (!TextUtils.isEmpty(stringValue)) {
            try {
                c118300cf.element = new JSONObject(stringValue).optInt("main", -1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            c118300cf.element = 0;
        }
        if (c118300cf.element != -1) {
            String value = LiveParallelStreamCDNStrategyKey.INSTANCE.getValue();
            IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
            C1306400k6I c1306400k6I = new C1306400k6I(value);
            c1306400k6I.LIZ(Integer.valueOf(c118300cf.element), "pricing_method_p95");
            iStarShipStrategy.runStrategy(c1306400k6I, new AwS373S0200000_7(c118300cf, c0ivm, 19));
            return;
        }
        ((C19503011Sa) c0ivm).LIZ(false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void requestForEnterRoomBoost(EnterRoomConfig enterRoomConfig, Context context) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).lA0();
        C463880IHa.LIZJ(enterRoomConfig, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void saveSessionId(Long l, String str) {
        if (l != null) {
            this.LLILLL.put(Long.valueOf(l.longValue()), str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLive(Context context, EnterRoomConfig enterRoomConfig) {
        Integer num;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        C0IL2.LIZ.LIZLLL(new EnterRoomLinkSession(enterRoomConfig));
        if (TextUtils.equals(enterRoomConfig.mRoomsData.enterRoomScene, "inner_draw")) {
            enterRoomConfig.mRoomsData.enterRoomScene = "inner_jump";
        }
        if (!C804420Vh2.LJI(context) && !C0J54.LIZ(context) && (context instanceof Activity) && (Live.getService() == null || ((num = (Integer) Live.getService().LIZJ(0, "live_mt_remove_traffic_dialog")) != null && num.intValue() == 0))) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                C632670Orh.LIZIZ(context, new C19719212De(-380999202, new AwS316S0300000_16(context, enterRoomConfig, this, 0), true));
                return false;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZ(2131858143);
            C985403tE.LIZ(c1397580mTM, new AwS216S0300000_7(context, enterRoomConfig, this, 2));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return false;
        }
        if (C500260Jjc.LJJIIZ(enterRoomConfig.mLogData.openFromSchema) && Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterFromMerge, "push")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_schema_enter_room");
            c474500IjALIZ.LJJII("push_ready_enter", "push_process_status");
            c474500IjALIZ.LIZ();
        }
        C475360IkY.LIZ.getClass();
        return C475360IkY.LIZ(context, enterRoomConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0224  */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, X.0XQS] */
    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean watchLiveFromSchema(final android.content.Context r14, final com.bytedance.android.livesdkapi.session.EnterRoomConfig r15) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch.watchLiveFromSchema(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    public static void LIZ(EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        String str;
        enterRoomConfig.mRoomsData.fromRoomId = room.getId();
        enterRoomLinkSession.LIZIZ(new Event("live_scheme_jump_to_other_room", 771, C0IIR.BussinessApiCall));
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        C0IF8 c0if8 = new C0IF8(roomsData.roomId);
        c0if8.LJ = enterRoomConfig;
        if (Intrinsics.LJFF("true", roomsData.xtBackRoom)) {
            C784440Upu.LIZ().LIZIZ(new C464680IKc(c0if8));
            return;
        }
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS() && enterRoomConfig.mRoomsData.isShowBackRoom) {
            str = "jump_source_mic_room";
        } else {
            str = "jump_source_live_banner";
        }
        enterRoomConfig.mRoomsData.backRoomSource = str;
        C784440Upu.LIZ().LIZIZ(c0if8);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long commitPTFTask(String str, String str2, Runnable runnable) {
        return ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).So0(new RunnableC519000KXa(str, str2, runnable));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void deleteEnterRoomBoostCache(String str, long j, long j2) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).lA0();
        C463880IHa.LIZIZ(j, j2, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Object getLiveFeature(String str, String str2, String str3) {
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        EnumC1094630eaj.Companion.getClass();
        C1090000eTG c1090000eTGO3 = iLiveFeatureCenterService.O3(C1094620eai.LIZ(str), str2, str3);
        if (c1090000eTGO3 != null) {
            return c1090000eTGO3.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig enterRoomConfig, long j) {
        UserService.getInstance().user().LJIJJ(j, "LiveHostStartLiveManager_watchLive").LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS103S0300000_7(context, enterRoomConfig, this, 3), new AfS143S0200000_7((Object) this, (EmoteModel) enterRoomConfig, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0J4v, X.0Myt] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLiveFromSchemaNoLogin(final Context context, final EnterRoomConfig enterRoomConfig, final String str) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return watchLiveFromSchema(context, enterRoomConfig);
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fullscreen_dialog", true);
        bundle.putBoolean("is_skippable_dialog", false);
        C0XQS c0xqs = new C0XQS();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        c0xqs.LIZIZ = roomsData.enterFromMerge;
        c0xqs.LIZJ = roomsData.enterMethod;
        c0xqs.LIZ = (Activity) context;
        c0xqs.LIZLLL = bundle;
        ?? r2 = new InterfaceC586170Myt() { // from class: X.0J4v
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (!TextUtils.isEmpty(str)) {
                        this.watchLive(context, enterRoomConfig, str);
                    } else {
                        this.watchLiveFromSchema(context, enterRoomConfig);
                    }
                }
                C486190J4v c486190J4v = this.LLILLJJLI;
                if (c486190J4v != null) {
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJI(c486190J4v);
                }
            }
        };
        this.LLILLJJLI = r2;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(new C0XQT(c0xqs));
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(r2);
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig enterRoomConfig, String str) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U4().LIZJ().LIZ(str, new AwS586S0100000_7(new C0IQK(context, enterRoomConfig, this, str), 240));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateRoomLists(String str, boolean z, int i, List<Long> list) {
        C0J5O c0j5oZ5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LJIIIZ(Boolean.valueOf(z), Integer.valueOf(i), str, list);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC470090Ic3 getVideoCleanPlayerController(TextureView textureView, String str, int i, InterfaceC1835090xr1 interfaceC1835090xr1, String str2, InterfaceC588410N5z interfaceC588410N5z) {
        C0N61 c0n61 = null;
        if (i != 0 && str != null && !a0.LJJJIL(str) && textureView != null) {
            c0n61 = new C0N61(textureView);
            Video video = new Video();
            LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            localVideoUrlModel.setSourceId(C2188811AlT.LIZIZ(sbLIZ));
            localVideoUrlModel.setUrlList(new ArrayList());
            localVideoUrlModel.getUrlList().add(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            localVideoUrlModel.setUrlKey(C2188811AlT.LIZIZ(sbLIZ2));
            video.setPlayAddr(localVideoUrlModel);
            video.setVideoLength(i);
            video.setPlayAddrBytevc1(video.getPlayAddr());
            c0n61.LJFF = video;
            if (interfaceC588410N5z != null) {
                c0n61.LIZ().add(interfaceC588410N5z);
            }
        }
        return c0n61;
    }
}
