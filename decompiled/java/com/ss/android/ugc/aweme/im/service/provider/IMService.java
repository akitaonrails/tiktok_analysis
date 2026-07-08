package com.ss.android.ugc.aweme.im.service.provider;

import X.C01GW;
import X.C04TD;
import X.C0CCZ;
import X.C0CN5;
import X.C0R54;
import X.C0VU1;
import X.C0VZ0;
import X.C0Z60;
import X.C0Z69;
import X.C0ZUN;
import X.C1325480kb4;
import X.C1368100lho;
import X.C1477305qN;
import X.C1765406vk;
import X.C1906580ziK;
import X.C1976907ol;
import X.C20330614gq;
import X.C20330714gr;
import X.C2188811AlT;
import X.C2206211BWh;
import X.C2529509vh;
import X.C452501pT;
import X.C895090Z9n;
import X.C907170ZiN;
import X.C960203pA;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1252250igx;
import X.InterfaceC1325490kb5;
import X.InterfaceC1345705Ol;
import X.InterfaceC1395120mPO;
import X.InterfaceC1521605xW;
import X.InterfaceC1617930sCl;
import X.InterfaceC1765906vp;
import X.InterfaceC1903310zd3;
import X.InterfaceC1908910zm5;
import X.InterfaceC1908920zm6;
import X.InterfaceC2188371Akl;
import X.InterfaceC315700CZc;
import X.InterfaceC714600S1i;
import X.InterfaceC799780VYy;
import X.InterfaceC878090YcZ;
import X.InterfaceC894260Z6i;
import X.InterfaceC895100Z9o;
import X.InterfaceC896190ZDt;
import Y.ARunnableS100S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel.CloseDetailFeedViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper;
import com.ss.android.ugc.aweme.im.service.gecko.MessagingGeckoUtils;
import com.ss.android.ugc.aweme.im.service.impl.AutoMessageTooltipHelper;
import com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.utils.InboxVisibilityChangeManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS105S1000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS91S1000000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public final class IMService implements IIMService {
    public static final C20330714gr Companion = new Object() { // from class: X.14gr
    };
    public final long initTimestamp = SystemClock.uptimeMillis();
    public final C01GW imInitializeService$delegate = C452501pT.LIZIZ(new C20330614gq());

    private final void interceptSchema() {
        SmartRouter.addInterceptor(new IInterceptor() { // from class: com.ss.android.ugc.aweme.im.service.provider.IMService.interceptSchema.1
            @Override // com.bytedance.router.interceptor.IInterceptor
            public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
                return C1976907ol.LIZ(this, routeIntent);
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean matchInterceptRules(RouteIntent routeIntent) {
                String host;
                String path;
                String host2;
                Uri uri;
                Uri uri2;
                Uri uri3;
                Uri uri4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String path2 = null;
                if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
                    host = uri4.getHost();
                } else {
                    host = null;
                }
                sbLIZ.append(host);
                if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
                    path = uri3.getPath();
                } else {
                    path = null;
                }
                sbLIZ.append(path);
                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "chat/message", false)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                        host2 = uri2.getHost();
                    } else {
                        host2 = null;
                    }
                    sbLIZ2.append(host2);
                    if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                        path2 = uri.getPath();
                    }
                    sbLIZ2.append(path2);
                    if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2), "im/chat_room", false)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws Throwable {
                EnterChatParams enterChatParamsLJIIJJI;
                if (routeIntent == null || (enterChatParamsLJIIJJI = IMService.this.getImChatService().LJIIJJI(routeIntent)) == null) {
                    return true;
                }
                IMChatService.LIZIZ.LJIILLIIL(enterChatParamsLJIIJJI, null);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1521605xW getAssembleEmojiPanelService() {
        return (InterfaceC1521605xW) C2206211BWh.LJIILLIIL.getValue();
    }

    public IAwemeCoverManager getAwemeCoverManager() {
        IAwemeCoverManager.LIZ.getClass();
        IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
        if (iAwemeCoverManagerLIZ != null) {
            return iAwemeCoverManagerLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IIMBulletinBoardService getBulletinBoardService() {
        return (IIMBulletinBoardService) C2206211BWh.LJIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IIMChatService getImChatService() {
        return (IIMChatService) C2206211BWh.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1908910zm5 getImEnsureService() {
        return (InterfaceC1908910zm5) C2206211BWh.LJIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1617930sCl getImInitializeService() {
        return (InterfaceC1617930sCl) this.imInitializeService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1908920zm6 getImMafService() {
        return (InterfaceC1908920zm6) C2206211BWh.LJIIIIZZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IIMNudgeAndStreakService getImNudgeAndStreakService() {
        return (IIMNudgeAndStreakService) C2206211BWh.LJIIJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC315700CZc getImPopupService() {
        return (InterfaceC315700CZc) C2206211BWh.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public PrivacySettingsFeature getImPrivacySettings() {
        return (PrivacySettingsFeature) C2206211BWh.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1252250igx getImSayHiService() {
        return (InterfaceC1252250igx) C2206211BWh.LJII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1345705Ol getImUserService() {
        return (InterfaceC1345705Ol) C2206211BWh.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public C0R54 getImVideoService() {
        return (C0R54) C2206211BWh.LJIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1765906vp getImXBridgeProviderService() {
        return (C1765406vk) C2206211BWh.LJIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC896190ZDt getLightInteractService() {
        return (InterfaceC896190ZDt) C2206211BWh.LJIILIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IMessageRefreshManager getMessageRefreshManager() {
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IMessageRefreshManager.class);
        if (objPluggableSpiForReal != null) {
            return (IMessageRefreshManager) objPluggableSpiForReal;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public MessagingGeckoUtils getMessagingGeckoUtils() {
        return (MessagingGeckoUtils) C2206211BWh.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IMPerformanceService getPerformanceService() {
        return (IMPerformanceService) C2206211BWh.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IQuickDmService getQuickDmService() {
        return (IQuickDmService) C2206211BWh.LJIILJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC894260Z6i getReplyingMsgService() {
        return (InterfaceC894260Z6i) C2206211BWh.LJIIZILJ.getValue();
    }

    public IMService() {
        IIMEntranceService iIMEntranceService;
        Object objLIZ = C04TD.LIZ(IIMEntranceService.class, false);
        if (objLIZ != null) {
            iIMEntranceService = (IIMEntranceService) objLIZ;
        } else {
            if (C04TD.LLLLZLL == null) {
                synchronized (IIMEntranceService.class) {
                    if (C04TD.LLLLZLL == null) {
                        C04TD.LLLLZLL = new ImEntranceService();
                    }
                }
            }
            iIMEntranceService = C04TD.LLLLZLL;
        }
        iIMEntranceService.init(this);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static final class IdleTask implements C0CCZ, InterfaceC799780VYy {
        public static final /* synthetic */ int LLILLJJLI = 0;
        public final long LL;

        @Override // X.InterfaceC799780VYy
        public final long LIZ() {
            return 1000L;
        }

        @Override // X.InterfaceC799780VYy
        public final /* synthetic */ void LJ(Long l) {
        }

        @Override // X.InterfaceC799780VYy
        public final void LJFF() {
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "InitInSubThreadTask";
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.C0CCZ
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.InterfaceC799780VYy
        public final C0VU1 threadType() {
            return C0VU1.CPU;
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.IDLE;
        }

        public IdleTask(long j) {
            this.LL = j;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C0Z60.LIZ(this.LL);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IAutomessageTooltipHelper getAutoMessageTooltipHelper() {
        return AutoMessageTooltipHelper.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IAwemeFetchManager getAwemeFetchManager() {
        return AwemeFetchManager.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1395120mPO getCameraEffectService() {
        return new InterfaceC1395120mPO() { // from class: X.0mGa
            @Override // X.InterfaceC1395120mPO
            public final void LIZ(String str) {
                C19EG c19eg;
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if ((validTopActivity instanceof C19EG) && (c19eg = (C19EG) validTopActivity) != null) {
                    AwS105S1000000_21 awS105S1000000_21 = new AwS105S1000000_21(str, 10);
                    new C736950SvV(C13LE.LIZ(CloseDetailFeedViewModel.class), new AwS565S0100000_21(awS105S1000000_21, (Function0<Unit>) 1609), new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(437), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg)).getValue().setState(AnonymousClass0207.get$arr$(91));
                }
            }

            @Override // X.InterfaceC1395120mPO
            public final List<String> LIZIZ(Fragment fragment, String str) {
                AwS105S1000000_21 awS105S1000000_21 = new AwS105S1000000_21(str, 9);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(CameraEffectViewModel.class);
                AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(436);
                C451460Hn6 c451460Hn6 = new C451460Hn6(fragment, false);
                C451620HnM c451620HnM = new C451620HnM(fragment, true);
                C338520DOw c338520DOw = new C338520DOw(fragment);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
                if (!(fragment instanceof HasDefaultViewModelProviderFactory)) {
                    fragment = null;
                }
                C2199508jZ c2199508jZ = (C2199508jZ) C13LP.LJJJLL(((CameraEffectViewModel) new C736950SvV(c19719912DlLIZ, awS105S1000000_21, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment), aFwS259S0000000_21, c451460Hn6, c451620HnM, c338520DOw).getValue()).LLILZ.LIZ());
                if (c2199508jZ == null) {
                    return null;
                }
                return c2199508jZ.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r19v3, types: [X.05Vn] */
            @Override // X.InterfaceC1395120mPO
            public final void LIZJ(Fragment fragment, String str, List list) {
                Fragment fragment2;
                C0IA9 c0ia9;
                C869590Y9l c869590Y9l;
                C099V c099v;
                AwS105S1000000_21 awS105S1000000_21 = new AwS105S1000000_21(str, 11);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(CameraEffectViewModel.class);
                AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(438);
                C451460Hn6 c451460Hn6 = new C451460Hn6(fragment, false);
                C451620HnM c451620HnM = new C451620HnM(fragment, true);
                C338520DOw c338520DOw = new C338520DOw(fragment);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
                boolean z = fragment instanceof HasDefaultViewModelProviderFactory;
                Fragment fragment3 = null;
                if (z) {
                    fragment3 = fragment;
                }
                C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, awS105S1000000_21, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment3), aFwS259S0000000_21, c451460Hn6, c451620HnM, c338520DOw);
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SendMessageViewModel.class);
                Fragment fragment4 = null;
                AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(545);
                C451460Hn6 c451460Hn62 = new C451460Hn6(fragment, false);
                C451620HnM c451620HnM2 = new C451620HnM(fragment, true);
                C338520DOw c338520DOw2 = new C338520DOw(fragment);
                C1622206Wu c1622206WuLJII2 = C724750Sbp.LJII(fragment);
                if (z) {
                    fragment2 = fragment;
                } else {
                    fragment2 = null;
                }
                C0IAH<C869590Y9l> c0iah = ((C0IAJ) new C736950SvV(c19719912DlLIZ2, null, c452070Ho5, c1622206WuLJII2, C1220000hqw.LIZ(fragment2), aFwS248S0000000_14, c451460Hn62, c451620HnM2, c338520DOw2).getValue().getState()).LLILLJJLI;
                if ((c0iah instanceof C0IA9) && (c0ia9 = (C0IA9) c0iah) != null && (c869590Y9l = (C869590Y9l) c0ia9.LIZ) != null) {
                    if (list != null) {
                        CameraEffectViewModel cameraEffectViewModel = (CameraEffectViewModel) c736950SvV.getValue();
                        c099v = null;
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cameraEffectViewModel), null, null, new C2199408jY(cameraEffectViewModel, list, Long.valueOf(c869590Y9l.getCreatedAt()), null), 3);
                    } else {
                        c099v = null;
                    }
                    AwS91S1000000_6 awS91S1000000_6 = new AwS91S1000000_6(str, 3);
                    C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CameraEffectViewModel.class);
                    AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(439);
                    C451460Hn6 c451460Hn63 = new C451460Hn6(fragment, false);
                    C451620HnM c451620HnM3 = new C451620HnM(fragment, true);
                    C338520DOw c338520DOw3 = new C338520DOw(fragment);
                    C1622206Wu c1622206WuLJII3 = C724750Sbp.LJII(fragment);
                    if (z) {
                        fragment4 = fragment;
                    }
                    C736950SvV c736950SvV2 = new C736950SvV(c19719912DlLIZ3, awS91S1000000_6, c452070Ho5, c1622206WuLJII3, C1220000hqw.LIZ(fragment4), aFwS259S0000000_212, c451460Hn63, c451620HnM3, c338520DOw3);
                    if (Intrinsics.LJFF(c869590Y9l.getLocalExtValue("detail_feed_effect_dismiss"), "1")) {
                        CameraEffectViewModel.vQ2((CameraEffectViewModel) c736950SvV2.getValue());
                        return;
                    }
                    C19EG activity = fragment.getActivity();
                    if (activity != null) {
                        CameraEffectViewModel cameraEffectViewModel2 = (CameraEffectViewModel) c736950SvV2.getValue();
                        Long lValueOf = Long.valueOf(c869590Y9l.getCreatedAt());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (cameraEffectViewModel2.LLILZIL <= jCurrentTimeMillis) {
                            if (list == null) {
                                CameraEffectViewModel.vQ2(cameraEffectViewModel2);
                            } else {
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cameraEffectViewModel2), cameraEffectViewModel2.LLILLJJLI, c099v, new C2443209hm(cameraEffectViewModel2, list, activity, jCurrentTimeMillis, true, lValueOf, c099v), 2);
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC2188371Akl getHeavyJobControlService() {
        return new InterfaceC2188371Akl() { // from class: X.0YaW
            @Override // X.InterfaceC2188371Akl
            public final void LIZ() {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("im_heavy_job_control", C2097908Jt.LIZJ(new Pair("action", "startHeavyJob")));
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIIL().LJIILJJIL().LIZLLL(false);
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJIJ();
            }

            @Override // X.InterfaceC2188371Akl
            public final void LIZIZ() {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIIL().LJIILJJIL().LIZLLL(true);
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("im_heavy_job_control", C2097908Jt.LIZJ(new Pair("action", "stopHeavyJob")));
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJIIZILJ();
            }
        };
    }

    public InterfaceC1325490kb5 getImImageService() {
        return C1325480kb4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC895100Z9o getImNudgeAnalytics() {
        return C895090Z9n.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IMSayhiAnalytics getImSayhiAnalytics() {
        return C895090Z9n.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC1903310zd3 getInboxAnalytics() {
        return C895090Z9n.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public IInboxVisibilityChangeManager getInboxTabChangeManager() {
        return InboxVisibilityChangeManager.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public long getInitTimestamp() {
        return this.initTimestamp;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC714600S1i getQuickReplyAnalytics() {
        return C895090Z9n.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public InterfaceC878090YcZ getSendMessageTemplateService() {
        return C2206211BWh.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initIM(X.C0ZUN r35) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.provider.IMService.initIM(X.0ZUN):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public void initialize(C0ZUN c0zun) {
        C1477305qN.LIZIZ = "https://api-va.tiktokv.com/aweme/v1/";
        long j = C2529509vh.LIZ;
        if (j != -1 && !C1906580ziK.LJI()) {
            C0CN5.LIZLLL(Long.valueOf(j), "dm", new ARunnableS100S0200000_31(this, c0zun, 17));
        } else {
            initIM(c0zun);
        }
        interceptSchema();
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMService
    public void setHighlightText(TextView textView, String str, String str2) {
        C1368100lho.LIZ(textView, str, str2, C960203pA.LIZ(R.attr.a04, textView.getContext()));
    }
}
