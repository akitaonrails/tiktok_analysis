package com.ss.android.ugc.aweme.services;

import X.AbstractActivityC1602020rn6;
import X.AbstractC1025070cmX;
import X.AbstractC2420009e2;
import X.AbstractC827890Wdn;
import X.AbstractC848400XPy;
import X.C07I0;
import X.C0C64;
import X.C0CCZ;
import X.C0CPH;
import X.C0J5E;
import X.C0WHC;
import X.C0WQX;
import X.C0WZX;
import X.C0X98;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1019030ccn;
import X.C1021860chM;
import X.C1021940chU;
import X.C1024900cmG;
import X.C1025090cmZ;
import X.C1025140cme;
import X.C1030980cw4;
import X.C1041940dDk;
import X.C1041960dDm;
import X.C1064210dnf;
import X.C1076350e7F;
import X.C120W;
import X.C12863051p;
import X.C1336205Ku;
import X.C1393930mNT;
import X.C1400100mXQ;
import X.C1400140mXU;
import X.C1400210mXb;
import X.C1402840mbq;
import X.C1440005kM;
import X.C1443560nfW;
import X.C1445930njL;
import X.C1446010njT;
import X.C1449410nox;
import X.C1489140or2;
import X.C1523470pkP;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1559110qft;
import X.C1559540qga;
import X.C1585840rN0;
import X.C1589950rTd;
import X.C15KP;
import X.C15O7;
import X.C1603500rpU;
import X.C1701330uNH;
import X.C1865860yee;
import X.C19267810Zo;
import X.C19286910ct;
import X.C19290710dV;
import X.C19348310mn;
import X.C19572711ht;
import X.C19EG;
import X.C1B46;
import X.C1BL2;
import X.C1BL4;
import X.C1BN8;
import X.C1E90;
import X.C20684815ws;
import X.C2123408To;
import X.C2123508Tp;
import X.C21566519ah;
import X.C21566919al;
import X.C2162308dZ;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2203271BKz;
import X.C2203431BLp;
import X.C2204961BRm;
import X.C2206241BWk;
import X.C2214201BlK;
import X.C2277881EDy;
import X.C2344009Gk;
import X.C311890CKl;
import X.C430210Gtv;
import X.C430230Gtx;
import X.C487550JAb;
import X.C487580JAe;
import X.C626450Ohf;
import X.C786410Ut5;
import X.C799900VZk;
import X.C823050WQl;
import X.C828040We2;
import X.C844470XAv;
import X.InterfaceC1027210cpz;
import X.InterfaceC1028550cs9;
import X.InterfaceC1066660drc;
import X.InterfaceC1345705Ol;
import X.InterfaceC1489180or6;
import X.InterfaceC1603190roz;
import X.InterfaceC19340210lU;
import X.InterfaceC19576611iW;
import Y.ACallableS411S0100000_3;
import Y.AfS172S0100000_3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.service.IEcUgOutOfAppService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask;
import com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserverTabCheckTask;
import com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditActivity;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class MainServiceImpl implements IMainService {
    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startupTestColdBootEnd() {
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void clearDelayedPostMessage() {
        C626450Ohf.LLILLJJLI.removeMessages(1048577);
        C626450Ohf.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public InterfaceC1028550cs9 generateSplashAdDependImpl() {
        return new C1030980cw4();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public int getAppVersionCode() {
        C844470XAv.LIZ.getClass();
        return (int) C844470XAv.LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public List<AbstractC2420009e2> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AbstractC2420009e2() { // from class: X.10ac
            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return null;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (u.LJIJI("messages", str, true) && u.LJIJI("/group", str2, true)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                boolean zLIZIZ = C1BN8.LIZ().LIZIZ();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "invite_id");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    if (!zLIZIZ) {
                        Intent intentLIZ = C1076350e7F.LIZ(activity);
                        intentLIZ.putExtra("extra_from_deeplink", true);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentLIZ, activity);
                        C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
                    }
                    new C1231390i9J(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str).LIZ();
                }
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mWO
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "challenge_detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "tag");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIIIZZ(uri, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                smartRouteBuildRoute.withParam("enter_from", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"));
                C19264010Yc.LIZIZ.LIZIZ(uri, "challenge_detail", z);
                return smartRouteBuildRoute.buildIntent();
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0J5S
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(107));

            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "live";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "live");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                String str4;
                long jLongValue;
                Long lLJIILIIL;
                ((InterfaceC487230J8v) this.LIZ.getValue()).LIZIZ("before_parse_url");
                if (z) {
                    User user = new User();
                    user.setUid(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id"));
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    user.roomId = jLongValue;
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j3().LIZLLL(user, new AfS172S0100000_3(user, 8), "");
                }
                C1400240mXe.LJIIIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id"), uri);
                HashMap map = new HashMap();
                map.put("from_notification", String.valueOf(z));
                map.put("open_from_schema", "LiveCommand");
                if (!C1BN8.LIZ().LIZIZ()) {
                    Intent intent = new Intent(activity, C083R.LIZ());
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activity);
                    C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("process_status", "start_exactly_room");
                if (z) {
                    str4 = "push-push";
                } else {
                    str4 = "no-push";
                }
                pairArr[1] = new Pair("enterance", str4);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (z) {
                    mapLJIIJ.put("push_process_status", "push_start");
                }
                boolean z2 = C486660J6q.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(mapLJIIJ);
                C20684815ws.LJIILLIIL("livesdk_schema_enter_room", c2344009Gk.LIZ);
                if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().handleWithoutHost(activity, uri, map)) {
                    C19264010Yc.LIZIZ.LIZIZ(uri, "live", z);
                }
                return null;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0J5R
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "live";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "live_square");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                String str4;
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mRoomsData.fromNewStyle = true;
                enterRoomConfig.mLogData.openFromSchema = "LiveSquareCommand";
                C0IVR.LJIIJJI(uri, enterRoomConfig);
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                iLiveOuterService.jumpLiveSquareWithLogin(activity, roomsData.enterFromMerge, roomsData.enterMethod, new InterfaceC20311214di(uri, activity, enterRoomConfig) { // from class: X.0J5Q
                    public final /* synthetic */ Uri LIZ;
                    public final /* synthetic */ EnterRoomConfig LIZIZ;

                    {
                        this.LIZIZ = enterRoomConfig;
                    }

                    @Override // X.InterfaceC20311214di
                    public final void LIZ() {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "enter_square_source");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "schemaReqFrom";
                        }
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJII(this.LIZIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                });
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("process_status", "start_toplive");
                if (z) {
                    str4 = "push-push";
                } else {
                    str4 = "no-push";
                }
                pairArr[1] = new Pair("enterance", str4);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                boolean z2 = C486660J6q.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(mapLJIIIIZZ);
                C20684815ws.LJIILLIIL("livesdk_schema_enter_room", c2344009Gk.LIZ);
                if (C1BN8.LIZ().LIZIZ()) {
                    return null;
                }
                return new Intent(activity, C083R.LIZ());
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0JKO
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "live";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (Intrinsics.LJFF(str, "webcast_subscribe")) {
                    if (Intrinsics.LJFF(str2, "/sub_space_detail") || Intrinsics.LJFF(str2, "/sub_only_space")) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                SmartRouter.buildRoute(activity, uri.toString()).open();
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mXO
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) throws Throwable {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                Intent intentLJJJLIIL = C19212010Ec.LIZJ.LJJJLIIL(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                if (intentLJJJLIIL == null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("NewInboxNotificationCommand", "get PowerPage Intent is null on Push!!");
                    return;
                }
                Intent intent = activity.getIntent();
                if (intent != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            intentLJJJLIIL.putExtra("is_from_push", extras.getInt("is_from_push", 0));
                            intentLJJJLIIL.putExtra("push_type", extras.getString("push_type"));
                            intentLJJJLIIL.putExtra("push_id", extras.getString("push_id"));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    Intent intentLIZ = C0X99.LIZ(activity, intentLJJJLIIL, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentLIZ, activity);
                    C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
                    return;
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, z);
                if (C1BN8.LIZ().LIZIZ()) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLJJJLIIL, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentLJJJLIIL, activity);
                    C2204961BRm.LJIILLIIL(activity, intentLJJJLIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
                    return;
                }
                C2204961BRm.LJIILJJIL(activity, new Intent[]{C1076350e7F.LIZ(activity), intentLJJJLIIL}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJI(Uri uri, String str, String str2, String str3) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("match uri = ");
                sbLIZ.append(uri);
                sbLIZ.append(", label = ");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                C1720106oR.LJI("NewInboxNotificationCommand", C2188811AlT.LIZIZ(sbLIZ));
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "follow")) {
                    return false;
                }
                return Intrinsics.LJFF(str2, "notification");
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mXd
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "notification") && !Intrinsics.LJFF(str, "inbox")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                String stringExtra;
                String stringExtra2 = null;
                boolean z2 = false;
                if (Intrinsics.LJFF(str, "inbox") && C123100dR.LIZ(str2)) {
                    if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LJI("HandleUrlCommand", "Start App");
                        SmartRouter.buildRoute(activity, "//main").open();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme:");
                    sbLIZ.append(uri.getEncodedSchemeSpecificPart());
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, C2188811AlT.LIZIZ(sbLIZ));
                    Integer numValueOf = Integer.valueOf(activity.getIntent().getIntExtra("is_from_push", 0));
                    if (numValueOf.intValue() == 1) {
                        z2 = true;
                    }
                    if (!z2) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        numValueOf.intValue();
                        smartRouteBuildRoute.withParam("is_from_push", 1);
                        try {
                            stringExtra = activity.getIntent().getStringExtra("push_type");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        smartRouteBuildRoute.withParam("push_type", stringExtra);
                        try {
                            stringExtra2 = activity.getIntent().getStringExtra("push_id");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        smartRouteBuildRoute.withParam("push_id", stringExtra2);
                    }
                    return smartRouteBuildRoute.buildIntent();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
                if (!Intrinsics.LJFF("notification", str) && !Intrinsics.LJFF("inbox", str)) {
                    return null;
                }
                Intent intent = new Intent();
                intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent.setFlags(335544320);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "outer_push";
                }
                intent.putExtra("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "cell";
                }
                intent.putExtra("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "land_filter_tab");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                    intent.putExtra("land_filter_tab", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    intent.putExtra("need_clear_all_inbox_tab_count", false);
                    FilterTabType.Companion.getClass();
                    FilterTabType filterTabTypeLIZ = C879720YfC.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    if (filterTabTypeLIZ != null) {
                        C19212010Ec.LIZJ.LJIL(new C889900Yvc(filterTabTypeLIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3));
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_btm_token");
                if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                    intent.putExtra("source_btm_token", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                intent.putExtra("label", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                intent.putExtra("next_router", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "next_router"));
                C19264010Yc.LIZIZ.LIZIZ(uri, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, z);
                if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, "check_profile")) {
                    intent.putExtra("push", true);
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    return C0X99.LIZ(activity, intent, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                return intent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09fz
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "user/referral", false);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return new Intent(activity, C083R.LIZ());
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0XAh
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "private");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multi_account_push_uid");
                intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent.setFlags(335544320);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                intent.putExtra("label", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label"));
                intent.putExtra("uid", uri.getLastPathSegment());
                C1400240mXe.LIZ(activity, intent);
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    return C0X99.LIZ(activity, intent, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                return intent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mWQ
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "aweme/create", false);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Class<? extends Activity> pushCameraBlurActivityCls;
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
                boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
                boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aweme_id");
                IBusinessPublishService iBusinessPublishService = (IBusinessPublishService) PluggableExtentionKt.pluggableSpi$default(IBusinessPublishService.class, false, false, false, 14, null);
                if (iBusinessPublishService != null) {
                    pushCameraBlurActivityCls = iBusinessPublishService.getPushCameraBlurActivityCls();
                } else {
                    pushCameraBlurActivityCls = null;
                }
                Intent intent = new Intent(activity, pushCameraBlurActivityCls);
                intent.putExtra("show_dialog", booleanQueryParameter2);
                intent.putExtra("show_effect", booleanQueryParameter);
                intent.putExtra("show_duet", booleanQueryParameter3);
                intent.putExtra("aid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                return intent;
            }
        });
        arrayList2.add(new C1400210mXb());
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mXJ
            public final IProfileRecommendationService LIZ = (IProfileRecommendationService) PluggableExtentionKt.pluggableSpi$default(IProfileRecommendationService.class, false, false, false, 14, null);

            @Override // X.AbstractC2420009e2
            public final boolean LJFF(Uri uri) {
                IProfileRecommendationService iProfileRecommendationService;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "in_friend_exp");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                if (!C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || !Intrinsics.LJFF(str, "1") || (iProfileRecommendationService = this.LIZ) == null || !iProfileRecommendationService.LIZIZ()) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "user/profile/", false);
            }

            @Override // X.AbstractC2420009e2
            public final Uri LJIIIZ(Activity activity, Uri uri) {
                IProfileRecommendationService iProfileRecommendationService;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (iProfileRecommendationService = this.LIZ) != null) {
                    iProfileRecommendationService.LJ(new C1593950ra5(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, 14));
                }
                return UriProtector.parse("sslocal://feed?tab=1");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[PHI: r3
              0x006e: PHI (r3v32 java.lang.String) = (r3v29 java.lang.String), (r3v33 java.lang.String) binds: [B:19:0x006c, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[PHI: r3
              0x0074: PHI (r3v31 java.lang.String) = (r3v29 java.lang.String), (r3v32 java.lang.String) binds: [B:19:0x006c, B:21:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[PHI: r3
              0x00ca: PHI (r3v23 java.lang.String) = (r3v20 java.lang.String), (r3v24 java.lang.String) binds: [B:38:0x00c8, B:36:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[PHI: r3
              0x00d0: PHI (r3v22 java.lang.String) = (r3v20 java.lang.String), (r3v23 java.lang.String) binds: [B:38:0x00c8, B:40:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02a4 A[PHI: r3
              0x02a4: PHI (r3v25 java.lang.String) = (r3v18 java.lang.String), (r3v26 java.lang.String) binds: [B:31:0x00b4, B:29:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x02aa A[PHI: r3
              0x02aa: PHI (r3v34 java.lang.String) = (r3v27 java.lang.String), (r3v35 java.lang.String) binds: [B:12:0x0058, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC2420009e2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.content.Intent LIZ(android.app.Activity r47, android.net.Uri r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, boolean r52) {
                /*
                    Method dump skipped, instruction units count: 761
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1400030mXJ.LIZ(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mWR
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "prop_detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "stickers");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                boolean z2;
                ArrayList arrayList3;
                String str4;
                List listLL;
                if (!TextUtils.isEmpty(str2) && u.LJJIIJZLJL(str2, "/detail/", false)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
                String lastPathSegment = uri.getLastPathSegment();
                if (!TextUtils.isEmpty(lastPathSegment)) {
                    List<String> listSplit = new Regex(",").split(lastPathSegment, 0);
                    if (!listSplit.isEmpty()) {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        listLL = C13BV.INSTANCE;
                        String[] strArr = (String[]) listLL.toArray(new String[0]);
                        arrayList3 = new ArrayList(Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
                    } else {
                        listLL = C13BV.INSTANCE;
                        String[] strArr2 = (String[]) listLL.toArray(new String[0]);
                        arrayList3 = new ArrayList(Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)));
                    }
                } else {
                    arrayList3 = null;
                }
                IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
                if (!iMainService.isAppHot()) {
                    Intent mainActivityIntent = iMainService.getMainActivityIntent(activity);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, mainActivityIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(mainActivityIntent, activity);
                    C2204961BRm.LJIILLIIL(activity, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
                }
                C1394200mNu c1394200mNu = C1394200mNu.LIZ;
                if (arrayList3 == null || (str4 = (String) C13LP.LJJJLL(arrayList3)) == null) {
                    str4 = "";
                }
                SmartRoute smartRouteLIZ = c1394200mNu.LIZ(activity, str4, "deeplink");
                smartRouteLIZ.withParam("extra_stickers", arrayList3);
                Intent intentBuildIntent = smartRouteLIZ.buildIntent();
                C19264010Yc.LIZIZ.LIZIZ(uri, "prop_detail", z);
                return intentBuildIntent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mWP
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "livewallpaper");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                C2413209cw.LIZ.getClass();
                IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
                if (iWallpaperServiceApiLIZ != null) {
                    return iWallpaperServiceApiLIZ.LJI(activity, uri);
                }
                return null;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09gW
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "feed");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent(activity, C083R.LIZ());
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                try {
                    int i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    intent.putExtra("tab", i);
                    if (i != 1) {
                        if (i == 2) {
                            C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_fresh", z);
                        }
                    } else {
                        C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_hot", z);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                intent.addFlags(67108864);
                intent.addFlags(268435456);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                return intent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09g0
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "growth_activity_dialog");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return new Intent(activity, C083R.LIZ());
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0s2Q
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF("microapp", str) && !Intrinsics.LJFF("microgame", str)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "schema_from");
                if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "splash") && !TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "qr_code")) {
                    TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "ad_link");
                }
                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "position");
                C988700bps.LIZ.LIZIZ().openMiniApp(activity, uri.toString(), new C1611490s2N());
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0s2M
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF("game", str);
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                if (C1BN8.LIZ().LIZIZ()) {
                    C1611490s2N c1611490s2N = new C1611490s2N();
                    IMiniAppService iMiniAppServiceLIZIZ = C988700bps.LIZ.LIZIZ();
                    UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_id");
                    iMiniAppServiceLIZIZ.openMiniApp(activity, "", c1611490s2N);
                    return;
                }
                Intent intentLIZIZ = C2421209eE.LIZIZ(activity);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_id");
                intentLIZIZ.putExtra("jumpToGame", true);
                intentLIZIZ.putExtra("gameId", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZIZ, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZIZ, activity);
                C2204961BRm.LJIILLIIL(activity, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HnjWpdZV3/EfRLGIf1VNg=", null));
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09gX
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return C10EU.LJIIIIZZ();
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent();
                intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent.setFlags(335544320);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_hot", z);
                return intent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0mWS
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "helper_center");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//helper_center");
                smartRouteBuildRoute.withParam("URL_FIELD", "https://support.tiktok.com");
                smartRouteBuildRoute.withParam("FIELD_TITLE", activity.getString(2131834566));
                smartRouteBuildRoute.withParam("FIELD_SHOW_AGREE_BUTTON", false);
                return smartRouteBuildRoute.buildIntent();
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09gV
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "link_account");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent();
                intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent.setFlags(335544320);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", true);
                C19264010Yc.LIZIZ.LIZIZ(uri, "message", z);
                return intent;
            }
        });
        arrayList2.add(new C1400100mXQ() { // from class: X.0mXR
            @Override // X.AbstractC2420009e2
            public final void LIZLLL(Uri uri, Intent intent, boolean z) {
                C1234250iDv.LIZ(uri, intent, z);
            }
        });
        arrayList2.add(new C1400140mXU());
        arrayList2.add(new AbstractC2420009e2() { // from class: X.09g1
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "learn");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent(activity, C083R.LIZ());
                intent.addFlags(536870912);
                intent.addFlags(32768);
                intent.putExtra("page_type", 16000);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                return intent;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.10ZC
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "account");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                if (Intrinsics.LJFF(uri.getPath(), "/login/qrCodeVerify")) {
                    return;
                }
                SmartRouter.buildRoute(activity, uri.toString()).open();
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                if (Intrinsics.LJFF(str2, "/login/qrCodeVerify")) {
                    String string = uri.toString();
                    String strLIZIZ = C018G.LIZIZ(string, "af_dp");
                    String strLIZIZ2 = C018G.LIZIZ(string, "token");
                    String strLIZIZ3 = C018G.LIZIZ(string, "next_url");
                    String strLIZIZ4 = C018G.LIZIZ(string, "qr_source_aid");
                    String strLIZIZ5 = C018G.LIZIZ(string, "scanned_platform");
                    if (strLIZIZ != null) {
                        try {
                            String strDecode = URLDecoder.decode(strLIZIZ, Charsets.UTF_8.name());
                            if (strLIZIZ3 == null) {
                                strLIZIZ3 = C018G.LIZIZ(strDecode, "next_url");
                            }
                            if (strLIZIZ2 == null) {
                                strLIZIZ2 = C018G.LIZIZ(strDecode, "token");
                            }
                            if (strLIZIZ5 == null) {
                                strLIZIZ5 = C018G.LIZIZ(strDecode, "device_platform");
                            }
                            if (strLIZIZ4 == null) {
                                strLIZIZ4 = C018G.LIZIZ(strDecode, "qr_source_aid");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/login/qrCodeVerify");
                    smartRouteBuildRoute.withParam("scanned_platform", strLIZIZ5);
                    smartRouteBuildRoute.withParam("next_url", strLIZIZ3);
                    smartRouteBuildRoute.withParam("token", strLIZIZ2);
                    smartRouteBuildRoute.withParam("app_id", strLIZIZ4);
                    return smartRouteBuildRoute.buildIntent();
                }
                if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                    if (Intrinsics.LJFF(str2, "/2sv")) {
                        return SmartRouter.buildRoute(activity, "//account/login/auth/two_step_verification_management").buildIntent();
                    }
                    if (Intrinsics.LJFF(str2, "/setting")) {
                        return SmartRouter.buildRoute(activity, "//account/setting").buildIntent();
                    }
                    return null;
                }
                return null;
            }
        });
        arrayList2.add(new AbstractC2420009e2() { // from class: X.0s2P
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "stem");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                SmartRouter.buildRoute(activity, "//__stem").open();
            }
        });
        arrayList2.add(new C0X98());
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zoB
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (u.LJIJI("chatting", str, true) && u.LJIJI("/message", str2, true)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                OpenChatExt.LIZJ(activity, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "uid"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ext"));
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXi
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF("modern_feed", str);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLIZ = C1076350e7F.LIZ(activity);
                intentLIZ.putExtra("extra_from_deeplink", true);
                intentLIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                C1400240mXe.LJI(uri, intentLIZ, z);
                return intentLIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXh
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF("discovery", str);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLIZ = C1076350e7F.LIZ(activity);
                intentLIZ.putExtra("extra_from_deeplink", true);
                intentLIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                C1400240mXe.LJI(uri, intentLIZ, z);
                return intentLIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXD
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "personal_homepage";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJFF(Uri uri) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "switch_account_sec_uid");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() <= 0 || !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId())) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF("mine", str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/homepage")) {
                        return false;
                    }
                    return true;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Uri LJIIIZ(Activity activity, Uri uri) {
                String stringExtra;
                String stringExtra2;
                boolean z;
                try {
                    stringExtra = activity.getIntent().getStringExtra("push_multi_accounts_replace_url_no_params");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    String[] strArr = {"switch_account_sec_uid"};
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    ArrayList<String> arrayList4 = new ArrayList();
                    Iterator<T> it2 = queryParameterNames.iterator();
                    while (true) {
                        z = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (C13LQ.LJJIJIIJI(next, strArr) >= 0) {
                            z = true;
                        }
                        if (!z) {
                            arrayList4.add(next);
                        }
                    }
                    for (String str : arrayList4) {
                        builderClearQuery.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
                    }
                    String string = builderClearQuery.build().toString();
                    String strLJJLIL = a0.LJJLIL(string, "?", string);
                    if (strLJJLIL.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        return UriProtector.parse(stringExtra);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(stringExtra);
                    sbLIZ.append('?');
                    sbLIZ.append(strLJJLIL);
                    return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
                }
                try {
                    stringExtra2 = activity.getIntent().getStringExtra("push_multi_accounts_replace_url");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
                if (stringExtra2 == null) {
                    return null;
                }
                return UriProtector.parse(stringExtra2);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                boolean z2 = true;
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    Intent intentLIZ = C1076350e7F.LIZ(activity);
                    intentLIZ.putExtra("extra_from_deeplink", true);
                    return intentLIZ;
                }
                Intent intentLIZ2 = C1076350e7F.LIZ(activity);
                intentLIZ2.putExtra("extra_from_deeplink", true);
                intentLIZ2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "profile_from_scene");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    intentLIZ2.putExtra("profile_from_scene", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "shoot_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    intentLIZ2.putExtra("shoot_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "launchFlag");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    try {
                        intentLIZ2.addFlags(Integer.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3).intValue());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "switch_account_sec_uid");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4.length() <= 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = null;
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                        intentLIZ2.addFlags(67108864);
                        intentLIZ2.putExtra("switch_account_sec_uid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    }
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "mine", z);
                return intentLIZ2;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.09iw
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/addressbook/list") && !Intrinsics.LJFF(str, "friendRecommend") && !Intrinsics.LJFF(str, "newFriendRecommend")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return C1076010e6h.LIZJ.LIZLLL(activity);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0s22
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "nearby";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF("nearby", str);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                int iIntValue;
                Integer numLJIIJJI;
                Integer numLJIIJJI2;
                Intent intentLIZ = C1076350e7F.LIZ(activity);
                intentLIZ.putExtra("extra_from_deeplink", true);
                intentLIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "feed_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    iIntValue = numLJIIJJI2.intValue();
                } else {
                    iIntValue = 0;
                }
                intentLIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", iIntValue);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "insert_fresh_aweme_ids");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "insert_fresh_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                } else {
                    numLJIIJJI = null;
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && numLJIIJJI != null) {
                    intentLIZ.putExtra("insert_aweme_ids", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    intentLIZ.putExtra("insert_type", numLJIIJJI.intValue());
                }
                return intentLIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXK
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "others_homepage";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/profile") && !Intrinsics.LJFF(str, "profile")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String stringExtra;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, uri.toString());
                smartRouteBuildRoute.withParam("from_notification", z);
                Integer numValueOf = Integer.valueOf(activity.getIntent().getIntExtra("is_from_push", 0));
                if (numValueOf.intValue() == 1) {
                    String stringExtra2 = null;
                    if (1 != 0) {
                        numValueOf.intValue();
                        smartRouteBuildRoute.withParam("is_from_push", 1);
                        try {
                            stringExtra = activity.getIntent().getStringExtra("push_type");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            stringExtra = null;
                        }
                        smartRouteBuildRoute.withParam("push_type", stringExtra);
                        try {
                            stringExtra2 = activity.getIntent().getStringExtra("push_id");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        smartRouteBuildRoute.withParam("push_id", stringExtra2);
                    }
                }
                smartRouteBuildRoute.open();
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "profile/viewer")) {
                    return null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "uid");
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "unique_id");
                String strLJIIIZ = C1400240mXe.LJIIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, uri);
                Intent intentLIZ = C1074030e3V.LIZ.LIZ(activity, UserProfileFragment.class, null, null);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_scene");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    intentLIZ.putExtra("from_scene", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                intentLIZ.putExtra("uid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                intentLIZ.putExtra("sec_user_id", strLJIIIZ);
                intentLIZ.putExtra("unique_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                C1400240mXe.LIZ(activity, intentLIZ);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "external_link";
                }
                intentLIZ.putExtra("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                return intentLIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mWT
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/video");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
                intent.putExtra("enter_from", "push");
                intent.putExtra("refer", "push");
                intent.putExtra(FollowStatusChangeMethod.PARAM_UID, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                intent.putExtra("cid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "commentId"));
                C19264010Yc.LIZIZ.LIZIZ(uri, "detail", z);
                return intent;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.09j5
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "friend_recommend";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/find_friends");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                int iIntValue;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inviteType");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                try {
                    iIntValue = CastIntegerProtector.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).intValue();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    iIntValue = 1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "puid");
                String strLJIIIZ = C1400240mXe.LJIIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, uri);
                Intent intentLJJIIZ = C1076010e6h.LIZJ.LJJIIZ(activity, iIntValue);
                if (intentLJJIIZ != null) {
                    intentLJJIIZ.putExtra("bundle_puid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    intentLJJIIZ.putExtra("bundle_sec_puid", strLJIIIZ);
                    intentLJJIIZ.putExtra("bundle_recommend_user_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                return intentLJJIIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXX
            public static Intent LJIIJJI(Activity activity) {
                Intent intentLIZ = C1076350e7F.LIZ(activity);
                intentLIZ.putExtra("extra_from_deeplink", true);
                intentLIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                intentLIZ.putExtra("tab", 1);
                IDeeplinkTrackingService iDeeplinkTrackingService = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkTrackingService.class, false, false, false, 14, null);
                if (iDeeplinkTrackingService != null) {
                    iDeeplinkTrackingService.LIZIZ("fyp");
                }
                return intentLIZ;
            }

            public static Intent LJIIJ(Activity activity, Uri uri) {
                Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
                intent.putExtra("from_adsapp_activity", true);
                intent.putExtra("from_uid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_uid"));
                IDeeplinkTrackingService iDeeplinkTrackingService = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkTrackingService.class, false, false, false, 14, null);
                if (iDeeplinkTrackingService != null) {
                    iDeeplinkTrackingService.LIZIZ("detail");
                }
                return intent;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "aweme/push_detail");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLJIIJ;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String simpleName;
                String str4 = str3;
                JSONObject jSONObject = new JSONObject();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                String str5 = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                int i = 0;
                String str6 = (String) C13LP.LJJJLZIJ(0, a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, new String[]{","}, 0, 6));
                if (C1400240mXe.LJIIIIZZ(uri) && C123100dR.LIZ(str6)) {
                    intentLJIIJ = new Intent(activity, (Class<?>) DetailActivity.class);
                    intentLJIIJ.putExtra(FollowStatusChangeMethod.PARAM_UID, str6);
                    intentLJIIJ.putExtra("from_adsapp_activity", true);
                    intentLJIIJ.putExtra("from_uid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_uid"));
                    intentLJIIJ.putExtra("video_from", "from_search_video_detail_applink");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "search_keyword");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    intentLJIIJ.putExtra("search_keyword", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    intentLJIIJ.putExtra("key_search_type", "video");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_sub");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                    }
                    intentLJIIJ.putExtra("enter_from_sub", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                    }
                    intentLJIIJ.putExtra("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
                    }
                    intentLJIIJ.putExtra("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "preClickImprId");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = "";
                    }
                    intentLJIIJ.putExtra("preClickImprId", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                } else if (C1BN8.LIZ().LIZIZ()) {
                    if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hot"), "feed")) {
                        intentLJIIJ = LJIIJJI(activity);
                    } else {
                        intentLJIIJ = LJIIJ(activity, uri);
                    }
                } else if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cold"), "feed")) {
                    intentLJIIJ = LJIIJJI(activity);
                } else {
                    intentLJIIJ = LJIIJ(activity, uri);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8)) {
                    intentLJIIJ.putExtra("ids", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                    intentLJIIJ.putExtra("gids", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9)) {
                    intentLJIIJ.putExtra("from_micro_app", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = "web";
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10;
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9)) {
                    str4 = "mp_page";
                }
                intentLJIIJ.putExtra("refer", str4);
                intentLJIIJ.putExtra("gd_label", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_params");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11)) {
                    intentLJIIJ.putExtra("push_params", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11);
                }
                if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cold"), "nearby_detail") && !C1BN8.LIZ().LIZIZ()) {
                    intentLJIIJ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
                }
                try {
                    if (!C1BN8.LIZ().LIZIZ()) {
                        i = 1;
                    }
                    jSONObject.put("is_cold_launch", i);
                    if (C1BN8.LIZ().LIZIZ()) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hot");
                    } else {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cold");
                    }
                    jSONObject.put("landing_page", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = "";
                    }
                    jSONObject.put("rule_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = "";
                    }
                    jSONObject.put("group_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13);
                    AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                    if (abstractC1387200mCcArrLJII.length <= 1) {
                        simpleName = "";
                    } else {
                        simpleName = abstractC1387200mCcArrLJII[abstractC1387200mCcArrLJII.length - 1].LIZ.getClass().getSimpleName();
                    }
                    jSONObject.put("last_page_path", simpleName);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 != null) {
                        str5 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14;
                    }
                    jSONObject.put("push_label", str5);
                    C19264010Yc.LIZIZ.LIZIZ(uri, "homepage_hot", z);
                    C20684815ws.LJIJ("hot_search_video_push", jSONObject);
                    return intentLJIIJ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return intentLJIIJ;
                }
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07kE
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "notification";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "user/imfans");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//notification");
                smartRouteBuildRoute.withParam("from_where", 0);
                return smartRouteBuildRoute.buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07jf
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "assmusic/category", false);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXL
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "others_homepage";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "profile");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                C19264010Yc.LIZIZ.LIZIZ(uri, "personal_homepage", z);
                String stringExtra = null;
                Intent intentLIZ = C1074030e3V.LIZ.LIZ(activity, UserProfileFragment.class, null, null);
                intentLIZ.putExtra("uid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                intentLIZ.putExtra("sec_user_id", C1400240mXe.LJIIIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID), uri));
                intentLIZ.putExtra("enter_from", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"));
                try {
                    stringExtra = activity.getIntent().getStringExtra("token_request_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(str3)) {
                    C735410St1 c735410St1 = new C735410St1();
                    c735410St1.LIZLLL = str3;
                    c735410St1.LJJLIIIJILLIZJL = "click_button";
                    c735410St1.LJJLIIJ = uri.getLastPathSegment();
                    c735410St1.LJJLIL = stringExtra;
                    c735410St1.LJIILJJIL();
                }
                return intentLIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mWM
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "challenge_detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "challenge");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                int iIntValue;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                Integer numLJIIJJI;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_commerce");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_tab");
                boolean z2 = false;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = iIntValue - 1;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_challenge_from");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_btm_token");
                if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, "1") || u.LJIJI("true", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, true)) {
                    ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIL(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_aid");
                if (!TextUtils.isEmpty(str2) && u.LJJIIJZLJL(str2, "/detail/", false)) {
                    z2 = true;
                }
                if (!Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8) && !z2) {
                    return null;
                }
                if (!z2 ? (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID)) == null : (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = uri.getLastPathSegment()) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIIIZZ(uri, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
                if (z2) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = uri.getLastPathSegment();
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
                }
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                smartRouteBuildRoute.withParam("from_token", str3);
                smartRouteBuildRoute.withParam("show_tab_index", i);
                smartRouteBuildRoute.withParam("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                smartRouteBuildRoute.withParam("extra_challenge_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 != null) {
                    smartRouteBuildRoute.withParam("aweme_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9);
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) {
                    smartRouteBuildRoute.withParam("source_btm_token", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                }
                try {
                    CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    smartRouteBuildRoute.withParam("extra_challenge_is_hashtag", true);
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "challenge_detail", z);
                return smartRouteBuildRoute.buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mWN
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "music_detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "music") && !Intrinsics.LJFF(str, "song")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                if (Intrinsics.LJFF(str, "song")) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//music/detail");
                    smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackId"));
                    Intent intentBuildIntent = smartRouteBuildRoute.buildIntent();
                    C19264010Yc.LIZIZ.LIZIZ(uri, "music_detail", z);
                    return intentBuildIntent;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group");
                boolean z2 = false;
                if (!TextUtils.isEmpty(str2) && u.LJJIIJZLJL(str2, "/detail/", false)) {
                    z2 = true;
                }
                String str4 = null;
                if (!Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && !z2) {
                    return null;
                }
                Intent intentBuildIntent2 = SmartRouter.buildRoute(activity, "//music/detail").buildIntent();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = uri.getLastPathSegment();
                }
                if (!Intrinsics.LJFF("detail", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && !Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_aid");
                if (intentBuildIntent2 != null) {
                    intentBuildIntent2.putExtra(FollowStatusChangeMethod.PARAM_UID, str4);
                    intentBuildIntent2.putExtra("from_token", str3);
                    intentBuildIntent2.putExtra("partnerName", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "partnerName"));
                    intentBuildIntent2.putExtra("partnerMusicId", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "partnerMusicId"));
                    intentBuildIntent2.putExtra("extra_music_from", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"));
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && intentBuildIntent2 != null) {
                    intentBuildIntent2.putExtra("aweme_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "music_detail", z);
                return intentBuildIntent2;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0MT5
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "profile_edit";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "profileEdit");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Bundle extras;
                String string;
                Intent intent;
                Intent intent2 = new Intent(activity, (Class<?>) ProfileEditActivity.class);
                Intent intent3 = activity.getIntent();
                if (intent3 != null) {
                    Bundle extras2 = null;
                    try {
                        extras = intent3.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                    if (extras != null && (string = extras.getString("enter_from")) != null && C13LQ.LJIILLIIL(string, (Object[]) C1228204rI.LIZIZ.getValue()) && (intent = activity.getIntent()) != null) {
                        try {
                            extras2 = intent.getExtras();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (extras2 != null) {
                            intent2.putExtras(extras2);
                        }
                    }
                }
                return intent2;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0JED
            public static void LJIIJ(String str, HashMap map) {
                if (str != null && str.length() != 0) {
                    Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).iterator();
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (listLJJLIIIJILLIZJL.size() == 2) {
                            map.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                        }
                    }
                }
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "feedback_input");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                String feHelp;
                String strSubstring;
                int i;
                String str4 = "";
                try {
                    feHelp = C0CLW.LIZIZ.LIZ.getFeedbackConf().getFeHelp();
                } catch (C316660CbA e) {
                    TryCatchGuardChecker.doCheck(e);
                    feHelp = "";
                }
                HashMap map = new HashMap();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(feHelp), "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                int iLJJIZ = a0.LJJIZ(str4, '?', 0, false, 6);
                if (iLJJIZ > 0 && str4.length() > (i = iLJJIZ + 1)) {
                    LJIIJ(str4.substring(i), map);
                }
                LJIIJ(uri.getEncodedQuery(), map);
                int iLJJIZ2 = a0.LJJIZ(str4, '?', 0, false, 6);
                if (iLJJIZ2 > 0) {
                    strSubstring = str4.substring(0, iLJJIZ2);
                } else {
                    strSubstring = str4;
                }
                C0XI4 c0xi4 = new C0XI4(strSubstring);
                for (Map.Entry entry : map.entrySet()) {
                    c0xi4.LJ((String) entry.getKey(), (String) entry.getValue());
                }
                return C1041940dDk.LIZIZ(activity, UriProtector.parse(u.LJJIFFI(feHelp, URLEncoder.encode(str4), URLEncoder.encode(c0xi4.LJFF()), true)), !z, z);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlM
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "feedback_record");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                C19296410eQ.LIZIZ.startFeedbackRecordActivity(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0s20
            public boolean LIZ;

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "search");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context] */
            /* JADX WARN: Type inference failed for: r7v2 */
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                Object objLIZIZ;
                C19EG c19egLIZIZ;
                C19EG c19egLIZIZ2;
                ?? r7 = activity;
                if (C2285308xP.LIZ() && this.LIZ) {
                    try {
                        SearchResultParam searchResultParam = new SearchResultParam();
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "keyword");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "deeplink";
                        }
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                            searchResultParam.setKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        searchResultParam.setSearchFrom("deeplink");
                        C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
                        c0qeqNewBuilder.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                        c0qeqNewBuilder.LJJJJJ = true;
                        C0QER c0qerLJ = c0qeqNewBuilder.LJ();
                        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                        int length = abstractC1387200mCcArrLJII.length;
                        int i = 0;
                        while (true) {
                            objLIZIZ = null;
                            if (i >= length) {
                                break;
                            }
                            AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                            abstractC1387200mCc.toString();
                            if (activityLIZIZ != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
                                objLIZIZ = SAFExtensionKt.LJIILLIIL(c19egLIZIZ2);
                            }
                            Objects.toString(objLIZIZ);
                            if ((activityLIZIZ instanceof InterfaceC1603190roz) && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && SAFExtensionKt.LJIILLIIL(c19egLIZIZ) != null) {
                                objLIZIZ = abstractC1387200mCc.LIZIZ();
                                break;
                            }
                            i++;
                        }
                        if (objLIZIZ != null) {
                            r7 = objLIZIZ;
                        }
                        C0QDS c0qds = new C0QDS(r7, searchResultParam, c0qerLJ, null, null, null);
                        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
                        if (iSearchService != null) {
                            iSearchService.B(c0qds);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLIZLLL;
                this.LIZ = false;
                if (ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
                    C1ER1.LIZIZ.LLLLZLLIL(uri);
                    Intent intentLIZ = C1076350e7F.LIZ(activity);
                    intentLIZ.putExtra("extra_from_deeplink", true);
                    return intentLIZ;
                }
                IEcUgOutOfAppService iEcUgOutOfAppService = (IEcUgOutOfAppService) PluggableExtentionKt.pluggableSpi$default(IEcUgOutOfAppService.class, false, false, false, 14, null);
                if (iEcUgOutOfAppService != null && (intentLIZLLL = iEcUgOutOfAppService.LIZLLL(activity, uri)) != null) {
                    return intentLIZLLL;
                }
                if (!C1BN8.LIZ().LIZIZ()) {
                    Intent intentLIZ2 = C1076350e7F.LIZ(activity);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ2, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentLIZ2, activity);
                    C2204961BRm.LJIILLIIL(activity, intentLIZ2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
                }
                if (C293700BfE.LIZ() != 0 && ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LIZJ(uri) && ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab()) {
                    return ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJIIJJI(activity, uri.buildUpon().build());
                }
                if (C2285308xP.LIZ()) {
                    this.LIZ = true;
                    return null;
                }
                return C1ER1.LIZIZ.LJIIJJI(activity, uri);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0sGK
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "shop");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLJII;
                IEcUgOutOfAppService iEcUgOutOfAppService = (IEcUgOutOfAppService) PluggableExtentionKt.pluggableSpi$default(IEcUgOutOfAppService.class, false, false, false, 14, null);
                if (iEcUgOutOfAppService != null && (intentLJII = iEcUgOutOfAppService.LJII(activity, uri)) != null) {
                    return intentLJII;
                }
                if (C1BN8.LIZ().LIZIZ()) {
                    return null;
                }
                return C1076350e7F.LIZ(activity);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXP
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "login");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) throws Throwable {
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    if (C1BN8.LIZ().LIZIZ()) {
                        Intent intent = new Intent(activity, (Class<?>) PushLoginActivity.class);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, activity);
                        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
                        return;
                    }
                    Intent intentLIZ = C1076350e7F.LIZ(activity);
                    intentLIZ.putExtra("extra_from_deeplink", true);
                    C2204961BRm.LJIILJJIL(activity, new Intent[]{intentLIZ, new Intent(activity, (Class<?>) PushLoginActivity.class)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
                    return;
                }
                Intent intentLIZ2 = C1076350e7F.LIZ(activity);
                intentLIZ2.putExtra("extra_from_deeplink", true);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ2, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZ2, activity);
                C2204961BRm.LJIILLIIL(activity, intentLIZ2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXH
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "detail";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "aweme/detail_list", false)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(str2);
                    if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2), "tuwen/detail_list", false)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LIZLLL(Uri uri, Intent intent, boolean z) {
                C1234250iDv.LIZ(uri, intent, z);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                List listLJJLIIIJILLIZJL;
                Intent intent;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "web";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, new String[]{","}, 0, 6);
                } else {
                    listLJJLIIIJILLIZJL = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ug_landing_api_enter_from");
                String str4 = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    C1554960qZC.LIZ(GScope.LL, new C1156060gBo("", listLJJLIIIJILLIZJL, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), C1156060gBo.class, "ug_ads_deeplink_params_key");
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_params");
                if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    ArrayList arrayList4 = new ArrayList(a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, new String[]{","}, 0, 6));
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ugdp_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                        str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                    }
                    C1400160mXW.LIZ.getClass();
                    int iLIZ = C1400160mXW.LIZ(z, uri);
                    int iLIZJ = C1400240mXe.LIZJ();
                    if (arrayList4.size() > 0) {
                        C1554960qZC.LIZ(GScope.LL, new C1234650iEZ((String) ListProtector.get(arrayList4, 0), str4, iLIZ, iLIZJ, C1400240mXe.LJ(iLIZJ), arrayList4, true, false, 800), C1234650iEZ.class, "ug_deeplink_params_key");
                    }
                }
                if (!Intrinsics.LJFF("tuwen", str) && C1400240mXe.LJFF(activity)) {
                    intent = C1076350e7F.LIZ(activity);
                    intent.putExtra("extra_from_deeplink", true);
                } else {
                    intent = new Intent(activity, (Class<?>) DetailActivity.class);
                    if (!TextUtils.isEmpty(str3)) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str3;
                    }
                    intent.putExtra("from_adsapp_activity", true);
                    intent.putExtra("refer", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    intent.putExtra("from_uid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_uid"));
                }
                C1234250iDv.LIZ(uri, intent, z);
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) {
                        intent.putExtra("from_micro_app", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                        intent.putExtra("refer", "mp_page");
                    }
                    intent.putExtra("ids", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                    intent.putExtra("push_params", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                }
                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_id");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                    try {
                        JSONObjectProtectorUtils.getString(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4), "gids");
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "detail", z);
                return intent;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mWo
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "collection");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group"))) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://music/category/");
                    smartRouteBuildRoute.withParam("mc_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID));
                    smartRouteBuildRoute.withParam("title_name", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "collection_name"));
                    smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                    return smartRouteBuildRoute.buildIntent();
                }
                return null;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlI
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "webview") && !Intrinsics.LJFF(str, "webview_popup")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null && iTouchPointModuleService.LJJIJ(uri)) {
                    ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                    if (iTouchPointModuleService2 != null) {
                        iTouchPointModuleService2.LJJIJIIJI(activity, uri, false);
                        return;
                    }
                    return;
                }
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "media_source");
                c1893790zNh.getClass();
                if (C1893790zNh.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    try {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                            String str = C0S0T.LIZ.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            if (str == null) {
                                str = "";
                            }
                            if (str.length() != 0) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = str;
                            }
                            C0J3B.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "onelink");
                            C1893580zNM.LJ(C1893580zNM.LIZ, activity, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "onelink", false, null, null, null, 240);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                boolean z2;
                if (((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIJLLLLLLLZ()) {
                    boolean booleanExtra = activity.getIntent().getBooleanExtra("new_user_journey", false);
                    if (!C1BN8.LIZ().LIZIZ() && !booleanExtra) {
                        SmartRouter.buildRoute(activity, "//main").open();
                    }
                }
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null && iTouchPointModuleService.LJJIJ(uri)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "media_source");
                c1893790zNh.getClass();
                if (C1893790zNh.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    return null;
                }
                Intent intentLIZIZ = C1041940dDk.LIZIZ(activity, uri, !z, z);
                if (intentLIZIZ != null) {
                    C2429209fW.LIZ().appendDataFlowId(intentLIZIZ, "402685958");
                }
                if (z) {
                    if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") != null && a0.LJJIIZI(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"), "referral", false)) {
                        if (intentLIZIZ != null) {
                            intentLIZIZ.putExtra("enter_from", "notification");
                        }
                    } else if (intentLIZIZ != null) {
                        intentLIZIZ.putExtra("hide_more", false);
                        intentLIZIZ.putExtra("enter_from", "notification");
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "referral", false) && intentLIZIZ != null) {
                    intentLIZIZ.putExtra("bundle_from_referral", true);
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "h5", z);
                return intentLIZIZ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0X97
            @Override // X.AbstractC2420009e2
            public final boolean LJFF(Uri uri) {
                return C0OU4.LIZ(uri.toString());
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF("roma_redirect", str);
            }

            @Override // X.AbstractC2420009e2
            public final Uri LJIIIZ(Activity activity, Uri uri) {
                Object c098200Yq;
                try {
                    c098200Yq = UriProtector.parse(C1545590qK5.LIZIZ.LIZIZ(uri.toString(), C2097608Jq.LJ()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Uri uri2 = (Uri) c098200Yq;
                if (!DeeplinkPrefetchImpl.LIZLLL().LIZ(new C0W8R(uri2, Boolean.FALSE)).LJII) {
                    return null;
                }
                return uri2;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07ke
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "lynxview") && !Intrinsics.LJFF(str, "lynxview_popup")) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
            @Override // X.AbstractC2420009e2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJ(android.app.Activity r17, android.net.Uri r18, boolean r19) {
                /*
                    Method dump skipped, instruction units count: 345
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1951407ke.LJ(android.app.Activity, android.net.Uri, boolean):void");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return C1951707kh.LIZIZ.LIZ(activity, uri, str, str2, str3, z);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07jd
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "ec_lynxview");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String query = uri.getQuery();
                if (query != null) {
                    HashMap mapLIZIZ = C01CD.LIZIZ(query);
                    String[] strArr = C1945007jc.LIZIZ;
                    if (strArr != null) {
                        boolean z2 = false;
                        for (String str : strArr) {
                            if (mapLIZIZ.containsKey(str)) {
                                mapLIZIZ.remove(str);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(uri.getScheme());
                            sbLIZ.append("://");
                            sbLIZ.append(uri.getAuthority());
                            sbLIZ.append('?');
                            sbLIZ.append(C01CD.LIZ(mapLIZIZ));
                            uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").authority("lynxview").build().toString()).open();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07kd
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "incentive/general_pure_logic");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                boolean z2 = !C1BN8.LIZ().LIZIZ();
                if (z2) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//main");
                    smartRouteBuildRoute.addFlags(67108864);
                    smartRouteBuildRoute.addFlags(536870912);
                    smartRouteBuildRoute.open();
                }
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJIIZILJ(activity, uri, z2);
                }
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlJ
            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return null;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "mobile") && !Intrinsics.LJFF(str, "bind_phone")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                C0XQ7.LIZ().bindMobile(activity, "scheme", null, null);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlK
            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return null;
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "change_phone");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                C0XQ7.LIZ().modifyMobile(activity, "scheme", null, null);
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.11iC
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "verify");
            }
        });
        arrayList3.add(new C19572711ht());
        arrayList3.add(new AbstractC2420009e2() { // from class: X.10I3
            public final String LIZ = "ban_music";

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "openVideoEditPage");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, this.LIZ)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "item_id");
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                        return;
                    }
                    String str = "from_promote";
                    if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_promote"))) {
                        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
                        C1911640zqU.LJIIJJI(uri);
                    } else {
                        str = "";
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        if (awemeLLILZ != null && AwemeExtKt.isPhotoMode(awemeLLILZ)) {
                            ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LIZIZ(activity, awemeLLILZ);
                            return;
                        } else {
                            ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LIZ(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, str, "");
                            return;
                        }
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07ji
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "studio/editor_pro");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                if (!C1BN8.LIZ().LIZIZ()) {
                    try {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//main");
                        smartRouteBuildRoute.withParam("is_ep_deeplink", true);
                        smartRouteBuildRoute.open();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                SmartRouter.buildRoute(activity, uri.buildUpon().appendQueryParameter("is_ep_deeplink", "true").build().toString()).open();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.11iB
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (u.LJIJI("studio", str, true) && u.LJIJI("/upload", str2, true)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(final Activity activity, Uri uri, boolean z) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithActivity(activity, "deep_link_upload_video", new IExternalService.ServiceLoadCallback() { // from class: X.11iA
                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onDismiss() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onFailed() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onOK() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        RecordConfig.Builder builder = new RecordConfig.Builder();
                        builder.shootWay("upload_anchor");
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build());
                    }
                });
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.11hx
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                return Intrinsics.LJFF(str, "publishVideo");
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "deep_link_publish_video", new C12YU(activity, uri, 0));
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0JEC
            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "live";
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "hotlive/feed", false);
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                C0J5O c0j5oZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5();
                if (c0j5oZ5 != null) {
                    c0j5oZ5.LJII(new EnterRoomConfig(), "HotLiveCommand");
                }
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0MT4
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "startCreation", false);
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "deep_link_startCreation", new C580990MqX(uri, activity, 0));
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0JEB
            public final int LIZ = 3;
            public final long LIZIZ = -1;
            public boolean LIZJ;

            @Override // X.AbstractC2420009e2
            public final String LIZJ(boolean z, Uri uri) {
                return "live";
            }

            public final boolean LJIIJ() {
                InterfaceC20673515v3 interfaceC20673515v3K4;
                Map<String, Object> mapL7;
                ILiveOuterService iLiveOuterService;
                InterfaceC20673515v3 interfaceC20673515v3K42;
                if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n4().LIZIZ()) {
                    return false;
                }
                ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if ((iLiveOuterService2 != null ? iLiveOuterService2.k4() : null) == null) {
                    if (this.LIZJ) {
                        return false;
                    }
                    this.LIZJ = true;
                    return true;
                }
                ILiveOuterService iLiveOuterService3 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService3 == null || (interfaceC20673515v3K4 = iLiveOuterService3.k4()) == null || (mapL7 = interfaceC20673515v3K4.L7(this.LIZIZ)) == null) {
                    return false;
                }
                return (C2093608Ic.LJ(mapL7.get("feed_url") instanceof String ? (String) mapL7.get("feed_url") : null) || (mapL7.get("feed_style") instanceof Integer ? ((Integer) mapL7.get("feed_style")).intValue() : 0) != this.LIZ || (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) == null || (interfaceC20673515v3K42 = iLiveOuterService.k4()) == null || interfaceC20673515v3K42.LLIIIZ() == null) ? false : true;
            }

            public static void LJIIL(HashMap map) {
                InterfaceC20673515v3 interfaceC20673515v3K4;
                InterfaceC20673515v3 interfaceC20673515v3K42;
                InterfaceC468140IXk interfaceC468140IXkLLIIIZ;
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LLIIIZ() != null) {
                    HashMap map2 = new HashMap();
                    map2.put("intercept", "new_style");
                    Object obj = map.get("gd_label");
                    if (obj != null) {
                        map2.put("gd_label", obj);
                    }
                    Object obj2 = map.get("enter_from_merge");
                    if (obj2 != null) {
                        map2.put("enter_from_merge", obj2);
                    }
                    Object obj3 = map.get("enter_method");
                    if (obj3 != null) {
                        map2.put("enter_method", obj3);
                    }
                    ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    if (iLiveOuterService2 != null && (interfaceC20673515v3K42 = iLiveOuterService2.k4()) != null && (interfaceC468140IXkLLIIIZ = interfaceC20673515v3K42.LLIIIZ()) != null) {
                        ((C468110IXh) interfaceC468140IXkLLIIIZ).LIZ(map2);
                    }
                }
            }

            public static void LJIILIIL(HashMap map) {
                Object obj = map.get("gd_label");
                Object obj2 = map.get("enter_from_merge");
                HashMap map2 = new HashMap();
                map2.put("_param_live_platform", "live");
                if (obj != null) {
                    map2.put("gd_label", obj);
                    map2.put("enter_from_merge", "inner_ad");
                } else {
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    map2.put("enter_from_merge", obj2);
                }
                C20684815ws.LJIILLIIL("livesdk_enter_live_merge", map2);
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!Intrinsics.LJFF(str, "sign") && !Intrinsics.LJFF(str, "webcast_room") && !Intrinsics.LJFF(str, "webcast_profile") && !Intrinsics.LJFF(str, "webcast_feed") && !Intrinsics.LJFF(str, "webcast_feed_activity") && !Intrinsics.LJFF(str, "webcast_webview") && !Intrinsics.LJFF(str, "webcast_lynxview") && !Intrinsics.LJFF(str, "webcast_game_universal_link")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String string;
                String string2;
                if (!Intrinsics.LJFF(uri.getHost(), "webcast_feed") && !Intrinsics.LJFF(uri.getHost(), "webcast_feed_activity")) {
                    if (Intrinsics.LJFF(uri.getHost(), "webcast_webview") || Intrinsics.LJFF(uri.getHost(), "webcast_lynxview")) {
                        String str = "";
                        if (((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZJ(Boolean.TRUE, "deeplink_webcast_webview_use_sec_link_enable")).booleanValue()) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (string2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).toString()) != null) {
                                str = string2;
                            }
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            Uri uri2 = UriProtector.parse(str);
                            if (Intrinsics.LJFF("https", uri2.getScheme()) && uri2.getUserInfo() == null) {
                                LJIIJJI(activity, z, uri.toString(), true);
                                return;
                            }
                            return;
                        }
                        Boolean bool = (Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZJ(Boolean.FALSE, "deeplink_webcast_webview_enable");
                        Object[] objArr = (Object[]) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZJ(new String[0], "deeplink_webcast_webview_allowed_list");
                        if (!bool.booleanValue()) {
                            return;
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                        if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && (string = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).toString()) != null) {
                            str = string;
                        }
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        Uri uri3 = UriProtector.parse(str);
                        C089E c089e = new C089E(objArr);
                        while (c089e.hasNext()) {
                            Object next = c089e.next();
                            if (!Intrinsics.LJFF("https", uri3.getScheme()) || uri3.getUserInfo() != null || !Intrinsics.LJFF(next, uri3.getHost())) {
                            }
                        }
                        return;
                    }
                    if (Intrinsics.LJFF(uri.getHost(), "webcast_game_universal_link")) {
                        if (!C1BN8.LIZ().LIZIZ()) {
                            try {
                                SmartRouter.buildRoute(activity, "//main").open();
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                        LJIIJJI(activity, z, uri.toString(), false);
                        return;
                    }
                    LJIIJJI(activity, z, uri.toString(), false);
                    return;
                }
                HashMap map = new HashMap();
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            map.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                        }
                    }
                }
                try {
                    if (LJIIJ()) {
                        LJIILIIL(map);
                        LJIIL(map);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            public static void LJIIJJI(Context context, boolean z, String str, boolean z2) {
                InterfaceC20673515v3 interfaceC20673515v3K4;
                try {
                    Uri uri = UriProtector.parse(str);
                    Uri.Builder builderClearQuery = UriProtector.parse(str).buildUpon().clearQuery();
                    for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                        if (!Intrinsics.LJFF(str2, "need_sec_link")) {
                            builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                        }
                    }
                    builderClearQuery.appendQueryParameter("is_from_push", String.valueOf(z));
                    if (!z) {
                        builderClearQuery.appendQueryParameter("sec_link_scene", "deeplink");
                    }
                    if (z2) {
                        builderClearQuery.appendQueryParameter("need_sec_link", "1");
                        builderClearQuery.appendQueryParameter("need_detect_2_jump", "1");
                    }
                    str = builderClearQuery.build().toString();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                try {
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                        interfaceC20673515v3K4.LIZLLL(context, str);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                }
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlN
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (u.LJIJI("user", str, true) && u.LJIJI("/favorite/", str2, true)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab_name");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mix_ids");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://favorite?tab_name=");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ.append("&push_ids=");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                sbLIZ.append("&enter_from=");
                sbLIZ.append(str);
                C19724912Fj.LIZLLL().LJII(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07jh
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                if (!u.LJJIIJZLJL(str, "wallet_index", false) && !Intrinsics.LJFF(str, "wallet")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0znC
            @Override // X.AbstractC2420009e2
            public final boolean LJIIIIZZ(String str, String str2, String str3) {
                if (!Intrinsics.LJFF(str, "https") && !Intrinsics.LJFF(str, "http")) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                String str4;
                Intent intent = new Intent(activity, (Class<?>) CrossPlatformActivity.class);
                C1041960dDm c1041960dDm = C1041960dDm.LIZ;
                String string = uri.toString();
                if (!z) {
                    str4 = "deeplink";
                } else {
                    str4 = "push";
                }
                c1041960dDm.getClass();
                intent.setData(UriProtector.parse(C1041960dDm.LIZ(string, str4)));
                intent.putExtra("need_sec_link", true);
                intent.putExtra("need_detect_2_jump", true);
                intent.putExtra("sec_link_scene", "deeplink");
                if (z) {
                    intent.putExtra("hide_more", false);
                    intent.putExtra("enter_from", "notification");
                }
                C19264010Yc.LIZIZ.LIZIZ(uri, "h5", z);
                return intent;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07jg
            @Override // X.AbstractC2420009e2
            public final boolean LJIIIIZZ(String str, String str2, String str3) {
                return Intrinsics.LJFF(str2, "anywhere");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                return SmartRouter.buildRoute(activity, uri.toString()).buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0zlL
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "notice/detail", false);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                Intent intentLJIJ = C19212010Ec.LIZJ.LJIJ(activity);
                intentLJIJ.putExtra("from_where", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_where"));
                intentLJIJ.putExtra("unRead_message_count", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "unRead_message_count"));
                intentLJIJ.putExtra("second_tab_name", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "second_tab_name"));
                intentLJIJ.putExtra("notice_name", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "notice_name"));
                return intentLJIJ;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0sGL
            public static final void LJIIJ(String str) {
                IMallLandingPerfTracker iMallLandingPerfTracker;
                if (u.LJJIIJZLJL(str, "aweme://ec/mall", false) && (iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null)) != null) {
                    iMallLandingPerfTracker.LIZJ(str);
                }
            }

            public static Uri LJIIJJI(Uri uri, String str) {
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                ArrayList<String> arrayList4 = new ArrayList();
                for (Object obj : queryParameterNames) {
                    if (!Intrinsics.LJFF(obj, str)) {
                        arrayList4.add(obj);
                    }
                }
                for (String str2 : arrayList4) {
                    builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
                return builderClearQuery.build();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00bf A[RETURN] */
            @Override // X.AbstractC2420009e2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJI(android.net.Uri r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
                /*
                    Method dump skipped, instruction units count: 254
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1620150sGL.LJI(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):boolean");
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                IEcUgDeeplinkService iEcUgDeeplinkService;
                String string;
                Intent intentLIZLLL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = false;
                if (Intrinsics.LJFF(uri.getPath(), "/pdp")) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fullScreen");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "false";
                    }
                    if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true")) {
                        uri = LJIIJJI(uri, "fullScreen").buildUpon().appendQueryParameter("fullScreen", "true").build();
                    }
                    Uri uriBuild = uri.buildUpon().scheme("aweme").build();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "ec_ug_link_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                        z2 = true;
                    }
                    if (z2) {
                        string = uriBuild.buildUpon().appendQueryParameter("ec_ug_link_type", "deeplink").build().toString();
                    } else {
                        string = uriBuild.toString();
                    }
                    try {
                        IEcUgOutOfAppService iEcUgOutOfAppService = (IEcUgOutOfAppService) PluggableExtentionKt.pluggableSpi$default(IEcUgOutOfAppService.class, false, false, false, 14, null);
                        if (iEcUgOutOfAppService != null) {
                            String strLJ = iEcUgOutOfAppService.LJ(uriBuild, string);
                            if (strLJ != null) {
                                string = strLJ;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    IEcUgOutOfAppService iEcUgOutOfAppService2 = (IEcUgOutOfAppService) PluggableExtentionKt.pluggableSpi$default(IEcUgOutOfAppService.class, false, false, false, 14, null);
                    if (iEcUgOutOfAppService2 != null && (intentLIZLLL = iEcUgOutOfAppService2.LIZLLL(activity, uriBuild)) != null) {
                        return intentLIZLLL;
                    }
                    LJIIJ(string);
                    return SmartRouter.buildRoute(activity, string).buildIntent();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    String string2 = LJIIJJI(uri, "fallback").buildUpon().scheme("aweme").build().toString();
                    LJIIJ(string2);
                    return SmartRouter.buildRoute(activity, string2).buildIntent();
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.scheme("aweme");
                if (Intrinsics.LJFF(uri.getPath(), "/mall") && (iEcUgDeeplinkService = (IEcUgDeeplinkService) PluggableExtentionKt.pluggableSpi$default(IEcUgDeeplinkService.class, false, false, false, 14, null)) != null) {
                    iEcUgDeeplinkService.LIZJ(builderBuildUpon, jCurrentTimeMillis);
                }
                if (Intrinsics.LJFF(uri.getPath(), "/order/middle_page") && !C1BN8.LIZ().LIZIZ()) {
                    Intent intentLIZ = C1076350e7F.LIZ(activity);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentLIZ, activity);
                    C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
                }
                String string3 = builderBuildUpon.build().toString();
                LJIIJ(string3);
                return SmartRouter.buildRoute(activity, string3).buildIntent();
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07je
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                SmartRouter.buildRoute(activity, "//baautomessaging").open();
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJI(Uri uri, String str, String str2, String str3) {
                return Intrinsics.LJFF(str2, "baautomessaging");
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0OFM
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null && lastPathSegment.length() != 0) {
                    if (C304900BxI.LIZ()) {
                        C730000SkI.LIZIZ.LIZIZ(1);
                        C0XQ7.LJ();
                        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("//add_yours/hub/");
                        sbLIZ.append(curUserId);
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, C2188811AlT.LIZIZ(sbLIZ));
                        smartRouteBuildRoute.withParam("is_from_qa", true);
                        smartRouteBuildRoute.withParam("show_topic_detail", 1);
                        smartRouteBuildRoute.withParam("topic_id", lastPathSegment);
                        smartRouteBuildRoute.withParam("enter_from", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"));
                        smartRouteBuildRoute.withParam("enter_method", "qa_share");
                        smartRouteBuildRoute.open();
                        return;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131845725);
                    c1389890mGx.LJIIJJI();
                }
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJI(Uri uri, String str, String str2, String str3) {
                return Intrinsics.LJFF(str2, "qna");
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.0mXm
            @Override // X.AbstractC2420009e2
            public final void LJ(Activity activity, Uri uri, boolean z) {
                ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJ(activity, uri, C1BN8.LIZ().LIZIZ());
            }

            @Override // X.AbstractC2420009e2
            public final boolean LJI(Uri uri, String str, String str2, String str3) {
                Locale locale = Locale.ROOT;
                if (!Intrinsics.LJFF(str2.toLowerCase(locale), "minis") && !Intrinsics.LJFF(str2.toLowerCase(locale), "minis_krypton")) {
                    return false;
                }
                return true;
            }
        });
        arrayList3.add(new AbstractC2420009e2() { // from class: X.07k9
            @Override // X.AbstractC2420009e2
            public final boolean LJII(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "text_post/detail/", false);
            }

            @Override // X.AbstractC2420009e2
            public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
                if (!C1BN8.LIZ().LIZIZ()) {
                    SmartRouter.buildRoute(activity, "//main").open();
                }
                boolean zLJFF = C1400240mXe.LJFF(activity);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString());
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, uri.getLastPathSegment());
                smartRouteBuildRoute.withParam("form_cold_start", zLJFF);
                if (z) {
                    smartRouteBuildRoute.withParam("enter_from", "push");
                }
                return smartRouteBuildRoute.buildIntent();
            }
        });
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).ttepAbilityService().enablePreviewByDeeplink()) {
            arrayList3.add(new AbstractC2420009e2() { // from class: X.0zo7
                @Override // X.AbstractC2420009e2
                public final void LJ(Activity activity, Uri uri, boolean z) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "object_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        return;
                    }
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).ttepAbilityService().jumpShootPageAndPreview(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, C1BN8.LIZ().LIZIZ());
                }

                @Override // X.AbstractC2420009e2
                public final boolean LJI(Uri uri, String str, String str2, String str3) {
                    Integer numLJIIJJI;
                    Locale locale = Locale.ROOT;
                    if (!Intrinsics.LJFF(str2.toLowerCase(locale), "aweme") || !u.LJJIIJZLJL(str3.toLowerCase(locale), "/sticker/", false)) {
                        return false;
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "object_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "schema_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    } else {
                        numLJIIJJI = null;
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0 || numLJIIJJI == null || numLJIIJJI.intValue() != 33) {
                        return false;
                    }
                    return true;
                }
            });
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getFollowFragmentCache() {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = ColdBootPreloadInstanceTask.LLILLL;
        c799900VZk.getClass();
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask2 = (ColdBootPreloadInstanceTask) C799900VZk.LIZLLL(coldBootPreloadInstanceTask);
        Fragment fragment = coldBootPreloadInstanceTask2.LLILLJJLI;
        if (fragment == null) {
            return null;
        }
        coldBootPreloadInstanceTask2.LLILLJJLI = null;
        return fragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public List<AbstractC2420009e2> getHighLevelCommands() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1400210mXb());
        arrayList.add(new C1400140mXU());
        arrayList.add(new C0X98());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getMainLifecycleRegistryClassName() {
        return C19348310mn.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public C0CCZ getMultiProcessMobEventTask() {
        return new MultiProcessMobEventTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public C0CCZ getObserverTabCheckTask() {
        return new ObserverTabCheckTask();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public IEvent getPublishConcatMessage() {
        return new C1446010njT(-1, null);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment getRecommendFragmentCache() {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask = ColdBootPreloadInstanceTask.LLILLL;
        c799900VZk.getClass();
        ColdBootPreloadInstanceTask coldBootPreloadInstanceTask2 = (ColdBootPreloadInstanceTask) C799900VZk.LIZLLL(coldBootPreloadInstanceTask);
        FeedRecommendFragment feedRecommendFragment = coldBootPreloadInstanceTask2.LL;
        if (feedRecommendFragment == null) {
            return null;
        }
        coldBootPreloadInstanceTask2.LL = null;
        return feedRecommendFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void hideUploadRecover() {
        C1440005kM.LIZ(new C1445930njL());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isContainsKeyWithLruEntries() {
        return C311890CKl.LIZIZ.isContainsKeyWithLruEntries();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isLimitAdTrackingEnabled() {
        if (((Boolean) C0WHC.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        if (!C0WHC.LIZIZ) {
            C0WHC.LIZIZ = true;
            if (C2206241BWk.LIZIZ()) {
                C15O7.LIZIZ(new Callable() { // from class: X.0WHA
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("AdvertisingInfoUtil@6cf.enabled$1");
                        try {
                            try {
                                try {
                                    C844470XAv.LIZ.getClass();
                                    AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
                                    C0WHC.LIZ = infoLIZIZ != null ? infoLIZIZ.LIZIZ : true;
                                } catch (C812710VuP e) {
                                    TryCatchGuardChecker.doCheck(e);
                                } catch (IllegalStateException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } catch (C829170Wfr e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            C0WHC.LIZIZ = true;
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("AdvertisingInfoUtil@6cf.enabled$1");
                            return unit;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C0WHC.LIZIZ = true;
                            throw th;
                        }
                    }
                }, C823050WQl.LIZLLL(), null);
            } else {
                C15O7.LIZJ(new Callable() { // from class: X.0WHB
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("AdvertisingInfoUtil@6cf.enabled$2");
                        try {
                            try {
                                try {
                                    C844470XAv.LIZ.getClass();
                                    AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
                                    C0WHC.LIZ = infoLIZIZ != null ? infoLIZIZ.LIZIZ : true;
                                } catch (C812710VuP e) {
                                    TryCatchGuardChecker.doCheck(e);
                                } catch (IllegalStateException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } catch (C829170Wfr e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            C0WHC.LIZIZ = true;
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("AdvertisingInfoUtil@6cf.enabled$2");
                            return unit;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C0WHC.LIZIZ = true;
                            throw th;
                        }
                    }
                });
            }
        }
        return C0WHC.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isReplaceAwemeCache() {
        return C311890CKl.LIZIZ.isReplaceAwemeCache();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public InterfaceC1066660drc routerDepend() {
        return new InterfaceC1066660drc() { // from class: X.1BL3
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void unRegisterModerationResultPush() {
        C487550JAb c487550JAb = C487550JAb.LL;
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LJIIIZ(c487550JAb);
        c2203431BLp.LJIIJJI(c487550JAb);
        C487550JAb.LLILLJJLI = false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getAccessKey() {
        return C1553670qX7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAppHot() {
        return C1BN8.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isAwemeAppDataEmpty() {
        return AbstractC827890Wdn.LIZIZ() != null;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isInActivity() {
        return C828040We2.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isLastPublishFailed() {
        return SharePrefCache.inst().getLastPublishFailed() != null && SharePrefCache.inst().getLastPublishFailed().LIZ().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isMoveMainTrackersEnabled() {
        return C07I0.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainMainPageFragment() {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return null;
        }
        MainPageFragment.LLJLLIL.getClass();
        Bundle bundle = new Bundle();
        MainPageFragment mainPageFragment = new MainPageFragment();
        mainPageFragment.setArguments(bundle);
        return mainPageFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Fragment obtainSecondTabFragment() {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "i18n_tab_mode", Boolean.TRUE);
        Fragment fragmentLLJILJILJ = C1603500rpU.LIZIZ.LLJILJILJ();
        fragmentLLJILJILJ.setArguments(bundle);
        return fragmentLLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void preloadScene() {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.199T
            public static void LIZ() {
                try {
                    new MainRootFragment();
                    new AnonymousClass1991(null);
                    new C19C2(0, new InterfaceC19394510uF() { // from class: X.199U
                        @Override // X.InterfaceC19394510uF
                        public final <T extends View> T LIZ(int i) {
                            throw new IllegalStateException("not reach here");
                        }
                    }, (C19EG) null, new SAFFragmentRootScene(), new InterfaceC21498919Br() { // from class: X.199V
                        @Override // X.InterfaceC21498919Br
                        public final C214937199r IQ() {
                            return new C214937199r(null, null, "saf_root_scene");
                        }
                    }, (C1701300uNE) null, 192);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainScenePreloaderKt@bb0.preloadScene$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainScenePreloaderKt@bb0.preloadScene$1");
            }
        });
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0uP4
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainScenePreloaderKt@bb0.preloadScene$2");
                try {
                    NavigationScene.LLLLLLL();
                    new NavigationScene();
                    C189200o6.m2constructorimpl(new C1710130ubT(C1BWL.LIZ(), 0));
                } finally {
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
                C1C7U.LIZIZ("MainScenePreloaderKt@bb0.preloadScene$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public IAVRouterIntentParse getAVRouterIntentParse() {
        return C120W.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getApiUrlPrefix() {
        return Api.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getMainActivityClass() {
        return MainActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public C0CCZ getPreloadInstanceTask() {
        return ColdBootPreloadInstanceTask.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    private boolean isOnFollowPage(Activity activity) {
        if (activity != null && (activity instanceof MainActivity)) {
            AbstractActivityC1602020rn6 abstractActivityC1602020rn6 = (AbstractActivityC1602020rn6) activity;
            if (C1559540qga.LIZIZ(abstractActivityC1602020rn6) && (abstractActivityC1602020rn6.getCurFragment() instanceof MainFragment)) {
                MainFragment mainFragment = (MainFragment) abstractActivityC1602020rn6.getCurFragment();
                if (mainFragment.getUserVisibleHint() && mainFragment.Vp()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private JSONArray jsonArrayToJSONArray(h hVar) {
        return new JSONArray(hVar.toString());
    }

    private JSONObject jsonObjectToJSONObject(n nVar) {
        return new JSONObject(nVar.toString());
    }

    private List<String> mergeKeys(List<String> list) {
        HashSet hashSet = new HashSet();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String[] strArrSplit = it2.next().split("\\.");
            if (strArrSplit.length > 0) {
                hashSet.add(strArrSplit[0]);
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public AVMusic avMusicApply(MusicModel musicModel) {
        return new C15KP().apply(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getAnywhereChannelPath(String str) {
        return C1552050qUV.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z) {
        return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getMainActivityIntent(Context context) {
        return C1076350e7F.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String getSecurityUrl(String str) {
        C1041960dDm c1041960dDm = C1041960dDm.LIZ;
        String strLJFF = C19286910ct.LIZIZ.LJFF();
        c1041960dDm.getClass();
        return C1041960dDm.LIZ(str, strLJFF);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Map<String, Object> getSettings(List<String> list) {
        try {
            Map<String, Object> settings = C12863051p.LIZIZ.getSettings(mergeKeys(list));
            HashMap map = new HashMap();
            for (Map.Entry<String, Object> entry : settings.entrySet()) {
                if (entry.getValue() != null) {
                    if (entry.getValue() instanceof n) {
                        map.put(entry.getKey(), jsonObjectToJSONObject((n) entry.getValue()));
                    } else if (entry.getValue() instanceof h) {
                        map.put(entry.getKey(), jsonArrayToJSONArray((h) entry.getValue()));
                    } else {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            HashMap map2 = new HashMap();
            for (String str : list) {
                Object objRetrieveSettingValue = retrieveSettingValue(str, map);
                if (objRetrieveSettingValue != null) {
                    map2.put(str, objRetrieveSettingValue);
                }
            }
            return map2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isChattingMessageUri(String str) {
        return OpenChatExt.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isMainActivity(C19EG c19eg) {
        return c19eg instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isMainPage(Context context) {
        if ((context instanceof MainActivity) || (SAFExtensionKt.LJIIIIZZ(context) instanceof C0J5E)) {
            return true;
        }
        return context instanceof MainActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isNUJSingleActivityExpDeeplinkEnabled(Context context) {
        return ((Boolean) C1865860yee.LIZJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isNUJSingleActivityExpHit(Context context) {
        return ((Boolean) C1865860yee.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isNewUser(C19EG c19eg) {
        return C1559110qft.LIZIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void onBackToOpenPlatform(BaseShortVideoContext baseShortVideoContext) {
        C19267810Zo.LIZIZ(C1B46.LIZLLL(baseShortVideoContext), baseShortVideoContext.mShootWay);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // com.ss.android.ugc.aweme.services.IMainService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackToTikTokMusic(android.app.Activity r12) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.MainServiceImpl.onBackToTikTokMusic(android.app.Activity):void");
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void pendingDeepLinkLog(final Function1<? super Boolean, Unit> function1) {
        Objects.requireNonNull(function1);
        AbstractC1025070cmX.LJJIII(new InterfaceC1027210cpz() { // from class: X.1BKy
            @Override // X.InterfaceC1027210cpz
            public final void LIZ(boolean z) {
                function1.invoke(Boolean.valueOf(z));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void processPublishChallenges(BaseShortVideoContext baseShortVideoContext) {
        C1BL4.LIZ.getClass();
        if (((VideoPublishEditModelKt) baseShortVideoContext).getStructList() != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().resolveHashtagNamesInCaption(baseShortVideoContext);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void registerModerationResultPush(final Function1<? super String, Unit> function1) {
        C487550JAb c487550JAb = C487550JAb.LL;
        Function1<? super String, Unit> function12 = new Function1() { // from class: X.1BL1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainServiceImpl.lambda$registerModerationResultPush$3(function1, (String) obj);
            }
        };
        if (!C487550JAb.LLILLJJLI) {
            C487550JAb.LLILLL = function12;
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            c2203431BLp.LIZLLL(c487550JAb);
            c2203431BLp.LJI(50331700, 1, c487550JAb);
            c2203431BLp.LJI(16778074, 1, c487550JAb);
            C487550JAb.LLILLJJLI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void releaseWindowBackgroundTask(Activity activity) {
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new ReleaseWindowBackgroundTask(activity));
        c0cph.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setLastPublishFailed(boolean z) {
        SharePrefCache.inst().getLastPublishFailed().LJ(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setOptSmartAvatarBorderView(boolean z) {
        C430210Gtv.setOpt(z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void setOptSmartAvatarVideoBorderView(boolean z) {
        boolean z2 = C430230Gtx.LLJILJILJ;
        C430230Gtx.LLJILJILJ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startCleanEffect(Context context) {
        if (context != null && !CleanEffectsTask.LL && C2214201BlK.LJFF() == null) {
            C15O7.LIZIZ(new ACallableS411S0100000_3(context, 13), C823050WQl.LIZIZ(), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public String transferClickFromToRefer(int i) {
        return AbstractC1025070cmX.LJJIIZI(i);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void updateIMUserFollowStatus(User user) {
        IMUser iMUserLIZJ;
        InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
        if (user != null) {
            IMUser.Companion.getClass();
            iMUserLIZJ = C2201941BFw.LIZJ(user);
        } else {
            iMUserLIZJ = null;
        }
        imUserService.LJIILJJIL(iMUserLIZJ);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MainServiceImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6Au1PIXUWfFZLMGaRmmy5Q==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MainServiceImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MainServiceImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    public static /* synthetic */ Boolean lambda$handleLiveSchema$2(Context context, Uri uri) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        if (iLiveOuterService != null && uri != null) {
            return iLiveOuterService.O5().LIZLLL(context, uri.toString());
        }
        return Boolean.FALSE;
    }

    public static /* synthetic */ Unit lambda$registerModerationResultPush$3(Function1 function1, String str) {
        function1.invoke(str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object retrieveSettingValue(java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r7.split(r0)
            int r0 = r5.length
            r4 = 0
            if (r0 != 0) goto Lb
            return r4
        Lb:
            r3 = 0
        Lc:
            if (r8 == 0) goto L39
            int r0 = r5.length
            if (r3 >= r0) goto L39
            r2 = r5[r3]
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L27
            r1 = r8
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L27
            java.lang.Object r8 = r1.get(r2)
        L24:
            int r3 = r3 + 1
            goto Lc
        L27:
            boolean r0 = r8 instanceof org.json.JSONObject
            if (r0 == 0) goto L38
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r0 = r8.opt(r2)
            if (r0 == 0) goto L38
            java.lang.Object r8 = r8.opt(r2)
            goto L24
        L38:
            return r4
        L39:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.MainServiceImpl.retrieveSettingValue(java.lang.String, java.util.Map):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void changeStatusBarMainTab(Activity activity, String str) {
        C19267810Zo.LIZ(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void checkAmplify(Activity activity, int i) {
        if (activity != null) {
            C19290710dV.LL.getClass();
            if (!activity.isFinishing()) {
                C19290710dV.LLILLJJLI = new WeakReference<>(activity);
                if (C0XQ7.LJFF().isLogin() && ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJJJLI()) {
                    C1E90.LIZIZ.LIZJ(C19290710dV.LLILLL, 3, i);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z, String str) {
        return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public <T> T getSP(Context context, Class<T> cls) {
        return (T) C1489140or2.LIZ(context, cls);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BKz] */
    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean handleLiveSchema(String str, final Context context) {
        Uri uri;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        C1523470pkP c1523470pkP = C1523470pkP.LIZ;
        ?? r2 = new Function1() { // from class: X.1BKz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainServiceImpl.lambda$handleLiveSchema$2(context, (Uri) obj);
            }
        };
        c1523470pkP.getClass();
        return ((Boolean) C1523470pkP.LIZIZ(uri, null, new AwS602S0100000_23((C2203271BKz) r2, 30))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean hasAppByHttp(Context context, Uri uri) {
        return C1025140cme.LIZJ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean isOnFollowPage(Activity activity, Fragment fragment) {
        if (activity == null) {
            return false;
        }
        if (fragment == null) {
            return isOnFollowPage(activity);
        }
        if (!(C487580JAe.LIZJ(fragment) instanceof InterfaceC1603190roz)) {
            return false;
        }
        return isOnFollowPage(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAppByHttpUri(Context context, Uri uri) {
        return C1025140cme.LJ(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void openPlatformDialog(C1402840mbq c1402840mbq, String str) {
        C19267810Zo.LIZIZ(c1402840mbq, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openSystemBrowser(Context context, String str) {
        return AbstractC1025070cmX.LJJII(context, str, "", Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void preloadStageTask(int i, Context context) {
        if (context != null && C2162308dZ.LJI(context)) {
            if (i != 1) {
                if (i == 2) {
                    Iterator it2 = ((Set) C1585840rN0.LIZ.getValue()).iterator();
                    while (it2.hasNext()) {
                        ((C1BL2) it2.next()).LIZIZ();
                    }
                    return;
                }
                return;
            }
            Iterator it3 = ((Set) C1585840rN0.LIZ.getValue()).iterator();
            while (it3.hasNext()) {
                ((C1BL2) it3.next()).LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void processPublishStickerIds(C19EG c19eg, String str) {
        C1BL4.LIZ.getClass();
        if (str != null) {
            C844470XAv.LIZ.getClass();
            C1489140or2.LIZ(C844470XAv.LIZ(), InterfaceC1489180or6.class);
            if (!a0.LJJIIZI(str, "153070", false)) {
                a0.LJJIIZI(str, "153071", false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void saveShowAd(final String str, final String str2) {
        C1064210dnf c1064210dnfLJ = C1064210dnf.LJ();
        if (!((HashMap) c1064210dnfLJ.LIZLLL).containsKey(str)) {
            ((HashMap) c1064210dnfLJ.LIZLLL).put(str, str2);
        }
        C15O7.LIZIZ(new Callable() { // from class: X.0dng
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                String str4 = str2;
                C1C7U.LIZ("AdShowFilterManager@c491.saveDataBase$1L");
                try {
                    ShowAdDataBase showAdDataBaseLIZIZ = C1064210dnf.LJI.LIZIZ();
                    if (showAdDataBaseLIZIZ != null) {
                        try {
                            showAdDataBaseLIZIZ.LIZ().LIZ(new C0VL6(str3, str4));
                        } catch (SQLiteConstraintException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1C7U.LIZIZ("AdShowFilterManager@c491.saveDataBase$1L");
                return null;
            }
        }, C15O7.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean startActivity(Context context, Intent intent) {
        return AbstractC1025070cmX.LJJIIZ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void trackAppsFlyerEvent(final String str, final String str2) {
        if (!TextUtils.equals("video_view", str)) {
            if (C19267810Zo.LIZ == null) {
                synchronized (C19267810Zo.class) {
                    try {
                        if (C19267810Zo.LIZ == null) {
                            C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
                            c2123408To.LIZIZ = "AppsFlyer";
                            C19267810Zo.LIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C15O7.LIZIZ(new Callable<Object>() { // from class: X.0T8X
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("I18nBridgeServiceUtils@aac4.trackAppsFlyerEvent$1");
                    ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
                    C836440Wra.LIZJ(str, str2);
                    C1C7U.LIZIZ("I18nBridgeServiceUtils@aac4.trackAppsFlyerEvent$1");
                    return null;
                }
            }, C19267810Zo.LIZ, null);
        }
    }

    public static void lambda$downloadStickerHelper$0(String str, String str2, Effect effect) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("prop_id", str);
        c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        c2344009Gk.LJFF("prop_resource_id", effect.getResourceId());
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
            c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        }
        String str3 = C1443560nfW.LIZIZ;
        c2344009Gk.LJFF("from_group_id", str3);
        c2344009Gk.LJFF("last_group_id", str3);
        c2344009Gk.LJFF("group_id", str3);
        ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZLLL(new C1449410nox(str2, "scan", "qr_code_scan", C1443560nfW.LJIIIIZZ(), C1443560nfW.LJIIIIZZ(), null), c2344009Gk.LIZ);
    }

    public static /* synthetic */ void lambda$downloadStickerHelper$1(IMainService.DownLoadFinishListener downLoadFinishListener, int i, Effect effect) {
        boolean z;
        if (i == 2006) {
            z = true;
        } else {
            z = false;
        }
        downLoadFinishListener.doAfterDownLoad(i, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2) {
        return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIJ(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean handleCarouselMultiJump(Context context, Aweme aweme, int i) {
        return C1021860chM.LJJIJLIJ(context, aweme, i, ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIJIIJIL(), null);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void logFeedRawAdClick(Context context, Aweme aweme, String str) {
        C626450Ohf.LIZ(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdOpenUrl(Context context, String str, boolean z) {
        return AbstractC1025070cmX.LJIILJJIL(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdTestUrl(Context context, String str, int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return AbstractC1025070cmX.LJIILL(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Boolean openAppLinkHandlerV2ActivityClass(Context context, String str, String str2) {
        if (!str.isEmpty() && (str.toLowerCase(Locale.getDefault()).startsWith("https://") || str.toLowerCase(Locale.getDefault()).startsWith("http://"))) {
            IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi(IDeepLinkService.class);
            if (iDeepLinkService == null) {
                return Boolean.FALSE;
            }
            Class<? extends Activity> clsLJJLIIJ = iDeepLinkService.LJJLIIJ();
            if (clsLJJLIIJ == null) {
                return Boolean.FALSE;
            }
            Intent intent = new Intent(context, clsLJJLIIJ);
            intent.setData(UriProtector.parse(str));
            intent.addFlags(268435456);
            intent.putExtra("is_from_self", true);
            intent.putExtra("in_app_enter_from", str2);
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MainServiceImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void openDeepLinkActivity(Context context, String str, String str2) {
        Intent intent = new Intent(context, ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLJJI(str2));
        intent.setData(UriProtector.parse(str));
        intent.putExtra("is_from_self", true);
        intent.putExtra("in_app_enter_from", str2);
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi(IDeepLinkService.class);
        if (iDeepLinkService != null && iDeepLinkService.LJJJ(context, intent, "main")) {
            return;
        }
        intent.addFlags(268435456);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MainServiceImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openFeedAdScheme(Context context, Aweme aweme, int i) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            return AbstractC1025070cmX.LJIILLIIL(context, i, aweme.getAwemeRawAd().getOpenUrl(), aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openFeedAdWebUrl(Context context, Aweme aweme, int i) {
        return AbstractC1025070cmX.LJIJI(context, aweme, null, null, i);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean searchAdTransformOpen(Context context, Aweme aweme, int i) {
        if (context == null || aweme == null || !C1017070cZd.LJJLIIJ(aweme) || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return false;
        }
        type.getClass();
        if (!type.equals("app")) {
            if (!type.equals("web")) {
                return true;
            }
            return AbstractC1025070cmX.LJI(context, aweme, i);
        }
        C1021860chM.LJJIJIL(context, aweme, i, null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void showConfirmDialogBeforeJumpTo3rdApp(final Context context, final Aweme aweme, final String str) {
        if (aweme != null) {
            C21566919al c21566919al = new C21566919al(context);
            c21566919al.LIZ(2131824742);
            c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0csB
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Context context2 = context;
                    Aweme aweme2 = aweme;
                    String str2 = str;
                    AbstractC1025070cmX.LJIIZILJ(context2, aweme2);
                    C1019030ccn.LJJJJ(context2, "click_open_url_window_confirm", aweme2, C1019030ccn.LJIIIZ(context2, aweme2));
                    C2184171Adz.LIZLLL("draw_ad", "click_open_url_window_confirm", aweme2.getAwemeRawAd()).LJIIIIZZ();
                    C1019030ccn.LJJIII(context2, aweme2, null, str2);
                    dialogInterface.dismiss();
                }
            }, false);
            c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0csC
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Context context2 = context;
                    Aweme aweme2 = aweme;
                    C1019030ccn.LJJJJ(context2, "click_open_url_window_cancel", aweme2, C1019030ccn.LJIIIZ(context2, aweme2));
                    C2184171Adz.LIZLLL("draw_ad", "click_open_url_window_cancel", aweme2.getAwemeRawAd()).LJIIIIZZ();
                    dialogInterface.dismiss();
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
            C1019030ccn.LJJJJ(context, "open_url_window_show", aweme, C1019030ccn.LJIIIZ(context, aweme));
            C2184171Adz.LIZLLL("draw_ad", "open_url_window_show", aweme.getAwemeRawAd()).LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean startAdsAppActivity(Context context, String str, String str2) {
        return C1041940dDk.LIZJ(context, str, str2, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean tryShowIllegalUsernameDialog(final String str, Runnable runnable, final Runnable runnable2) {
        C1589950rTd c1589950rTd = C1589950rTd.LIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!ComplianceServiceProvider.LJFF().LIZJ(4) && !C2277881EDy.LIZIZ.userNameLegitimate() && activityLJFF != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C1589950rTd.LIZ.getClass();
            Keva keva = C1589950rTd.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_illegal_dialog_show_");
            sbLIZ.append(curUserId);
            long j = jCurrentTimeMillis - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 4, "username_modify_tip_interval_2", true);
            if (iLJIJ != 1) {
                if (iLJIJ != 2) {
                    if (iLJIJ != 3) {
                        if (iLJIJ == 4 && j > 604800000) {
                            if (!Intrinsics.LJFF(str, "comment") && !Intrinsics.LJFF(str, "publish") && !Intrinsics.LJFF(str, "profile")) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (j > 172800000) {
                        if (!Intrinsics.LJFF(str, "comment") && !Intrinsics.LJFF(str, "publish") && !Intrinsics.LJFF(str, "profile")) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (j > 172800000) {
                    if (!Intrinsics.LJFF(str, "comment") && !Intrinsics.LJFF(str, "publish")) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (j > 172800000) {
                if (!Intrinsics.LJFF(str, "comment") && !Intrinsics.LJFF(str, "profile")) {
                    return false;
                }
            } else {
                return false;
            }
            final Dialog changeIllegalUsernameDialog = AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false).getChangeIllegalUsernameDialog(activityLJFF, curUser);
            C1589950rTd.LIZIZ = jCurrentTimeMillis;
            C1589950rTd.LIZJ = str;
            changeIllegalUsernameDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0rTf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String strLJIIIIZZ;
                    InterfaceC1232340iAq interfaceC1232340iAq;
                    Runnable runnable3 = runnable2;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    KeyEvent.Callback callback = changeIllegalUsernameDialog;
                    if (!(callback instanceof InterfaceC1232340iAq) || (interfaceC1232340iAq = (InterfaceC1232340iAq) callback) == null || (strLJIIIIZZ = interfaceC1232340iAq.LJIIIIZZ()) == null) {
                        strLJIIIIZZ = "background";
                    }
                    C1589950rTd c1589950rTd2 = C1589950rTd.LIZ;
                    String str2 = str;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c1589950rTd2.getClass();
                    C1589950rTd.LIZ(jCurrentTimeMillis2, str2, strLJIIIIZZ);
                    C1589950rTd.LIZIZ = -1L;
                }
            });
            if (runnable != null) {
                runnable.run();
            }
            C786410Ut5.B4(changeIllegalUsernameDialog);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("notify_username", c2344009Gk.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("last_illegal_dialog_show_");
            sbLIZ2.append(curUserId);
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean useSystemBrowserOpenWebPage(Context context, Aweme aweme, int i) {
        return AbstractC1025070cmX.LJJIJIIJI(context, aweme, i);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C1041940dDk.LIZIZ(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2) {
        return C1041940dDk.LIZIZ(context, uri, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void openAppWithLog(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        C1025140cme.LJFF(context, awemeRawAd, str, z, "draw_ad");
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openGooglePlayStore(Context context, Aweme aweme, String str, int i) {
        return C1021860chM.LJJJIL(context, aweme, str, i);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openPopUpWebPageWithViewShrink(Context context, Aweme aweme, int i, AdWebUrlDataFromJsb adWebUrlDataFromJsb) {
        if (context != null && aweme != null) {
            UUID.randomUUID().toString();
            C1025090cmZ c1025090cmZ = new C1025090cmZ();
            c1025090cmZ.LJIIIIZZ = aweme;
            c1025090cmZ.LIZ = context;
            c1025090cmZ.LIZIZ = aweme.getAwemeRawAd();
            c1025090cmZ.LIZLLL = i;
            c1025090cmZ.LIZ(aweme.getAid());
            if (adWebUrlDataFromJsb != null) {
                c1025090cmZ.LJIIJ = true;
                c1025090cmZ.LJFF = adWebUrlDataFromJsb.getWebUrl();
                c1025090cmZ.LJI = adWebUrlDataFromJsb.getWebTitle();
                c1025090cmZ.LJ = adWebUrlDataFromJsb.getRefer();
            }
            return AbstractC1025070cmX.LJJ(c1025090cmZ);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void downloadStickerHelper(final String str, String str2, Activity activity, boolean z, final IMainService.DownLoadFinishListener downLoadFinishListener) {
        C1393930mNT c1393930mNT = new C1393930mNT();
        c1393930mNT.LIZIZ = "scan";
        c1393930mNT.LJIIJJI = false;
        c1393930mNT.LJIILIIL = new InterfaceC19340210lU() { // from class: X.1BL0
            @Override // X.InterfaceC19340210lU
            public final void LIZ(Effect effect, String str3) {
                MainServiceImpl.lambda$downloadStickerHelper$0(str, str3, effect);
            }
        };
        c1393930mNT.LJIILJJIL = new InterfaceC19576611iW() { // from class: X.1BKx
            @Override // X.InterfaceC19576611iW
            public final void LIZ(int i, Effect effect) {
                MainServiceImpl.lambda$downloadStickerHelper$1(downLoadFinishListener, i, effect);
            }
        };
        c1393930mNT.LJIIIZ = "qrcode";
        c1393930mNT.LJ = "qr_code_scan";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJFF(activity, arrayList, c1393930mNT.LIZ(), z);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean openFeedAdWebUrl(Context context, Aweme aweme, String str, String str2, int i) {
        return AbstractC1025070cmX.LJIJI(context, aweme, str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean tryToOpenGPMiniCard(Context context, Aweme aweme, int i, boolean z, boolean z2) {
        return C1024900cmG.LJII(context, i, null, aweme, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public boolean tryToGetApps(Context context, int i, String str, Aweme aweme, boolean z, boolean z2) {
        return C1021940chU.LIZIZ(context, i, str, aweme, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService
    public void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f) {
        String str7 = VideoPlayActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) VideoPlayActivity.class);
        intent.putExtra("play_addr_string", str);
        intent.putExtra("cover_image_string", str2);
        intent.putExtra("loop", z);
        intent.putExtra("video_id", str3);
        intent.putExtra("video_md5", str4);
        intent.putExtra("enter_from", str5);
        intent.putExtra("video_type", str6);
        intent.putExtra("progress", f);
        intent.putExtra("tag_line", "");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuAyTtibRPnCXKAUtkc937rwUJYpmE=", null));
    }
}
