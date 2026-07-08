package kotlin.jvm.internal;

import X.AbstractC21318218bk;
import X.AbstractC21356318ht;
import X.AbstractC21517319It;
import X.AnonymousClass1891;
import X.C09AY;
import X.C09GA;
import X.C09S2;
import X.C0APQ;
import X.C0BJ3;
import X.C0BS5;
import X.C0C59;
import X.C0C64;
import X.C0CHQ;
import X.C0NOH;
import X.C0T81;
import X.C0TJZ;
import X.C0ZLD;
import X.C1002270cBl;
import X.C1178304jF;
import X.C1238990iLZ;
import X.C1323690kYB;
import X.C1338460kw0;
import X.C1436290nTn;
import X.C1519540pe4;
import X.C1545310qJd;
import X.C1647240sy2;
import X.C1664690tQB;
import X.C1702250uOl;
import X.C180G;
import X.C180H;
import X.C180J;
import X.C181J;
import X.C182Y;
import X.C18CS;
import X.C18EH;
import X.C18G6;
import X.C18IP;
import X.C18JB;
import X.C18JF;
import X.C18JS;
import X.C18LK;
import X.C18O4;
import X.C18PD;
import X.C18Q0;
import X.C18RT;
import X.C18S0;
import X.C18S6;
import X.C18S9;
import X.C18TX;
import X.C18UT;
import X.C18VB;
import X.C18YG;
import X.C18YH;
import X.C18YI;
import X.C18YT;
import X.C190H;
import X.C190I;
import X.C190N;
import X.C190T;
import X.C190Z;
import X.C1910890zpH;
import X.C192J;
import X.C194P;
import X.C196S;
import X.C19D4;
import X.C19D6;
import X.C20321414fM;
import X.C2097608Jq;
import X.C21138217no;
import X.C21141717oN;
import X.C21142217oS;
import X.C21142717oX;
import X.C21146117p5;
import X.C21151417pw;
import X.C21186517vb;
import X.C21187817vo;
import X.C21188817vy;
import X.C21191117wL;
import X.C21196617xE;
import X.C21198717xZ;
import X.C21201117xx;
import X.C21201217xy;
import X.C21209417zI;
import X.C21211217za;
import X.C21211417zc;
import X.C21213117zt;
import X.C212152180o;
import X.C212161180x;
import X.C212344187y;
import X.C212350188e;
import X.C212354188i;
import X.C212368188w;
import X.C212369188x;
import X.C21240318Af;
import X.C21242718Bd;
import X.C21244318Bt;
import X.C21265718Jz;
import X.C21282318Qj;
import X.C21288518St;
import X.C21289618Te;
import X.C21294518Vb;
import X.C21312818as;
import X.C21314218b6;
import X.C21314418b8;
import X.C21317918bh;
import X.C21319718bz;
import X.C21320018c2;
import X.C21320118c3;
import X.C21323018cW;
import X.C21337618es;
import X.C21352318hF;
import X.C21356218hs;
import X.C21360918id;
import X.C21361618ik;
import X.C21367018jc;
import X.C21377618lK;
import X.C21378418lS;
import X.C21378618lU;
import X.C21378918lX;
import X.C21394618o4;
import X.C214741192d;
import X.C214810194u;
import X.C21512419Gw;
import X.C21517519Iv;
import X.C21517619Iw;
import X.C2188811AlT;
import X.C286600BLe;
import X.C288750BTl;
import X.C288780BTo;
import X.C295350Bht;
import X.C297750Bll;
import X.C436470H9p;
import X.C444890HcV;
import X.C480460Ism;
import X.C721340SRg;
import X.C7740030o;
import X.C844470XAv;
import X.EnumC1910860zpE;
import X.EnumC559620LxA;
import X.InterfaceC20174613wm;
import X.InterfaceC21173117tR;
import X.InterfaceC21289318Tb;
import X.InterfaceC21290518Tn;
import X.InterfaceC21300818Xm;
import X.InterfaceC21420018sA;
import X.InterfaceC2188801AlS;
import X.InterfaceC2661011f;
import X.InterfaceC744680TJa;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.style.StrikethroughSpan;
import android.util.LruCache;
import android.util.Property;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.bcm.impl.model.BcmCheckParam;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.statisticlogger.btm.BxgyPageReturnConfigData;
import com.bytedance.ies.ugc.statisticlogger.btm.EcElement;
import com.bytedance.ies.xelement.XElementInitializerLite;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.ab.LivePreviewBgConfig;
import com.ss.android.ugc.aweme.account.loginapproval.LoginApprovalApi;
import com.ss.android.ugc.aweme.aigc.network.IMKitApi;
import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration;
import com.ss.android.ugc.aweme.challenge.ui.DetailPreloadViewCountInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.taskscheduler.ResourceUsageThresholdConfig;
import com.ss.android.ugc.aweme.creative.taskscheduler.downgrade.DowngradeStrategyConfig;
import com.ss.android.ugc.aweme.creative.taskscheduler.scheduler.g;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcAnchorDisableDeleteAppendInPublishConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcShouldEnablePrefixInMultiAnchorAB;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.InviteAndShareConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECPdpMynaConfigModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECGecCardMallConfigModel;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.review.EcAnchorCommentReviewsConfig;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.rule.ProtocolRuleApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.EcWidgetLoadAsCoreConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.EcWidgetLoadPriorityConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.EcomShopBagDailyAnimModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.PrefetchPinConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListClientRequestConfigDetail;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListFullDataConfigBean;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagAfterPinCardGuide;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.settings.ECommerceNativePreloadConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.business.popcard.common.model.VoucherButtonsColor;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.ViewFlipperController;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.PinCardStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.SeaLiveBagIconEducationBubbleSetting;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.CommonColor;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.StringCacheConfig;
import com.ss.android.ugc.aweme.fangroup.invite.FansGroupInviteApi;
import com.ss.android.ugc.aweme.favorites.business.music.raven.exp.RavenMusicCollectionEmbeddedExp;
import com.ss.android.ugc.aweme.feed.experiment.FlexiblePanelPerformanceSettings;
import com.ss.android.ugc.aweme.feed.experiment.PrerenderConfig;
import com.ss.android.ugc.aweme.feed.experiment.ReuseConfig;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMGuideSendOnAlbumUpdateExtraConfig;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.settings.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughKeyNeedMergedConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughKeyNeedMergedSettings;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRDMobConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRDMobModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.preload.config.Top1NimblePreloadConfigList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config.RomaSchemaConfig;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.popsuite.PopupConfigApi;
import com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.shortvideo.experiment.PostPageClickPostPredictionFriendsTabDataConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import com.ss.android.ugc.tools.chat.services.IAIChatGenerateServiceFactory;
import com.ss.android.ugc.tools.common.experiment.AiChatDomainSettings;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.MediaPayload;
import com.ss.android.ugc.ur.experiment.ManageBatchUnfollowAbilityExp;
import com.ss.ttvideoengine.TTVideoEngine;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS0S5100000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS54S0301000_32;
import kotlin.jvm.internal.AwS68S1300000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AFwS223S0000000_32 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(350);
    public final int $t;

    public static AFwS223S0000000_32 get$arr$(int i) {
        AFwS223S0000000_32 aFwS223S0000000_32 = (AFwS223S0000000_32) arr$.get(i);
        if (aFwS223S0000000_32 != null) {
            return aFwS223S0000000_32;
        }
        arr$.compareAndSet(i, null, new AFwS223S0000000_32(i));
        return (AFwS223S0000000_32) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$109(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$134(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "updateTypeface exception";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$139(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "tryRegisterPageStateListener skipped: pageStateObserver is null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$161(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "start dismiss animate";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$162(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "finish dismiss";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$163(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "show move animate";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$164(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "end move animate";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$177(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "pre execute expr failed";
    }

    public static final Object invoke$182(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "unselectAdVideo_onVideoDataUnbind";
    }

    public static final Object invoke$183(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "unselectAdVideo_onVideoFragmentDestroy";
    }

    public static final Object invoke$184(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "unselectAdVideo_onVideoSlideIn";
    }

    public static final Object invoke$185(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "unselectAdVideo_onVideoSlideOut";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$205(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "getTypefaceWrap exception";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$223(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "evalIfExpression, duringIfExpression is false while handle elif or else";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$224(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "mergeForConfigContext: forConfigValue is Null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$225(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "setRootViewManager while rootViewManager is not null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$231(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "height animator,value object is not number class";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$232(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "width animator,value object is not number class";
    }

    public static final Object invoke$237(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new int[2];
    }

    public static final Object invoke$238(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new float[2];
    }

    public static final /* bridge */ /* synthetic */ Object invoke$247(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "MynaElementDiff";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$248(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "removeChildAtInternal, view ref in dom and view not match";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$249(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "dispatchDetachFromParent while view is detached";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$250(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "getAttachView,hostViewManager is null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$251(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "setHostViewManager,this,hostViewManager is not null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$252(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "unInfo should not be null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$253(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "only MynaCSSUnit.PX supports plus operator";
    }

    public static final Object invoke$27(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "init Error! No GeckoDepend!";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$272(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "not support updateDrawingOrder";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$274(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "not support setChildZIndex(child: View, zIndex: Int)";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$276(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "ECMMKGecCardManager not register page config for MixMall";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "overflow style dispatchEvent illegalStateException";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$325(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "MynaTemplateLoadContext#notifyListeners,listener is null";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$335(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "Losing reference of GeckoBucketExecutor!";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$336(AFwS223S0000000_32 aFwS223S0000000_32) {
        return "Lose reference of GeckoBucketExecutor!";
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS223S0000000_32(int i) {
        super(0);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$10(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$100(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$101(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190Z(!C1436290nTn.LIZ.getBoolean("has_water_mark", false), 2131844952, false, Integer.valueOf(R.raw.icon_tiktok_logo_rectangle), (Integer) 2131844951, 48);
    }

    public static final Object invoke$102(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$103(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$104(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Float.valueOf(50 / ((float) C196S.LLJJJJLIIL));
    }

    public static final Object invoke$105(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Integer.valueOf(((Number) C286600BLe.LIZ.getValue()).intValue());
    }

    public static final Object invoke$106(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C0CHQ.LIZ().getGson();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$107(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$108(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$11(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$110(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21361618ik();
    }

    public static final Object invoke$111(AFwS223S0000000_32 aFwS223S0000000_32) {
        C19D4 c19d4 = new C19D4(0);
        c19d4.LJFF = R.attr.bx;
        c19d4.LJI = R.attr.e1;
        return c19d4;
    }

    public static final Object invoke$112(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C436470H9p(false);
    }

    public static final Object invoke$113(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Object() { // from class: X.194N
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$114(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$115(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$116(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$117(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$118(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$119(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$12(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$120(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$121(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$122(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.EDIT_PROFILE);
    }

    public static final Object invoke$123(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.EDIT_PROFILE);
    }

    public static final Object invoke$124(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Object() { // from class: X.18Sn
        };
    }

    public static final Object invoke$125(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21294518Vb();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$126(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$127(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$128(AFwS223S0000000_32 aFwS223S0000000_32) {
        if ((C21138217no.LIZ() & 4) != 0) {
            return new C18UT(0);
        }
        return null;
    }

    public static final Object invoke$129(AFwS223S0000000_32 aFwS223S0000000_32) {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$130(AFwS223S0000000_32 aFwS223S0000000_32) {
        boolean zLJFF;
        ManageBatchUnfollowAbilityExp.Config config = (ManageBatchUnfollowAbilityExp.Config) ManageBatchUnfollowAbilityExp.LIZIZ.getValue();
        if (config != null) {
            zLJFF = Intrinsics.LJFF(config.enable, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$131(AFwS223S0000000_32 aFwS223S0000000_32) {
        boolean zLJFF;
        ManageBatchUnfollowAbilityExp.Config config = (ManageBatchUnfollowAbilityExp.Config) ManageBatchUnfollowAbilityExp.LIZIZ.getValue();
        if (config != null) {
            zLJFF = Intrinsics.LJFF(config.enableSyncUnfollowNotification, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$132(AFwS223S0000000_32 aFwS223S0000000_32) {
        int iIntValue;
        Integer num;
        ManageBatchUnfollowAbilityExp.Config config = (ManageBatchUnfollowAbilityExp.Config) ManageBatchUnfollowAbilityExp.LIZIZ.getValue();
        if (config != null && (num = config.maxBatchUnfollowCount) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 100;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$133(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C0C64.LJIILLIIL().LJJII(ManageBatchUnfollowAbilityExp.Config.class, ManageBatchUnfollowAbilityExp.LIZ, "manage_batch_unfollow_ability_exp", true);
    }

    public static final Object invoke$135(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EventParamsConfig eventParamsConfig = C21314218b6.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EventParamsConfig.class, eventParamsConfig, "local_service_passthrough_params_rules", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return eventParamsConfig;
    }

    public static final Object invoke$136(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EventParamsConfig eventParamsConfig = C21314418b8.LIZIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EventParamsConfig.class, eventParamsConfig, "local_service_passthrough_params_rules_x_search", true);
        if (objLJJII == null) {
            C21314418b8.LIZ.getClass();
            return eventParamsConfig;
        }
        return objLJJII;
    }

    public static final Object invoke$137(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("task_scheduler_downgrade");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$138(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$14(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$140(AFwS223S0000000_32 aFwS223S0000000_32) {
        C1519540pe4.LIZ(null, "rd_ec_media_card_create", "", null);
        return Unit.LIZ;
    }

    public static final Object invoke$141(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18YI(new C18YH(C18YG.LJ));
    }

    public static final Object invoke$142(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18YT<C18VB>() { // from class: X.18Xg
            @Override // X.C18YT
            public final void LIZJ() {
            }

            @Override // X.C18YT
            public final void onShow() {
            }

            @Override // X.C18YT
            public final /* bridge */ /* synthetic */ void LIZ(Enum r1) {
            }

            @Override // X.C18YT
            public final /* bridge */ /* synthetic */ void LIZIZ(Enum r1) {
            }
        };
    }

    public static final Object invoke$143(AFwS223S0000000_32 aFwS223S0000000_32) {
        return EcShopBagBubbleNoImageSetting.LIZ();
    }

    public static final Object invoke$144(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$145(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$146(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$147(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$148(AFwS223S0000000_32 aFwS223S0000000_32) {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    public static final Object invoke$149(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C21198717xZ.LIZ());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$150(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$151(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21186517vb();
    }

    public static final Object invoke$152(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcAnchorCommentReviewsConfig ecAnchorCommentReviewsConfig = C18PD.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_comment_reviews_config", EcAnchorCommentReviewsConfig.class, ecAnchorCommentReviewsConfig);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return ecAnchorCommentReviewsConfig;
    }

    public static final Object invoke$153(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C2097608Jq.LJIIIIZZ(new Pair(0, new VoucherButtonsColor(null, new CommonColor(null, "#FFFE2C55", "#FFFE2C55"), new CommonColor(null, "#FFFFFFFF", "#FFFFFFFF"))), new Pair(1, new VoucherButtonsColor(null, new CommonColor(null, "#0D000000", "#0D000000"), new CommonColor(null, "#FF000000", "#FF000000"))));
    }

    public static final Object invoke$154(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C21198717xZ.LIZ());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$155(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$156(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$157(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$158(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECGecCardMallConfigModel eCGecCardMallConfigModel = C21320118c3.LIZIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_gec_card_mall_config", ECGecCardMallConfigModel.class, eCGecCardMallConfigModel);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return eCGecCardMallConfigModel;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$159(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$16(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.13wl] */
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
    public static final Object invoke$160(AFwS223S0000000_32 aFwS223S0000000_32) {
        g gVar = g.LIZ;
        ResourceUsageThresholdConfig resourceUsageThresholdConfig = (ResourceUsageThresholdConfig) C21378618lU.LIZIZ.getValue();
        String str = (String) C0BS5.LIZ.getValue();
        DowngradeStrategyConfig downgradeStrategyConfig = (DowngradeStrategyConfig) C20321414fM.LIZIZ.getValue();
        synchronized (gVar) {
            if (!g.LJIIIIZZ) {
                g.LJII = resourceUsageThresholdConfig;
                C0T81.LIZ.LIZ(str);
                C21377618lK.LIZ(downgradeStrategyConfig);
                C21378418lS.LJIIJJI = g.LJII.getNetworkThreshold();
                C1702250uOl.LIZLLL = g.LJII.getCpuThreshold();
                if (resourceUsageThresholdConfig.getThreadPoolSize() > 0) {
                    g.LJFF = resourceUsageThresholdConfig.getThreadPoolSize();
                }
                g.LJIIJ = resourceUsageThresholdConfig.getExecutionIntervalMs();
                g.LJIIIIZZ = true;
            }
        }
        C21378918lX.LIZ = false;
        if (((Boolean) C0APQ.LIZ.getValue()).booleanValue() && !C1647240sy2.LIZ().disableHighFreqPerfMob) {
            gVar.LIZ(new InterfaceC20174613wm() { // from class: X.13wl
                @Override // X.InterfaceC20174613wm
                public final void LIZ(long j, String str2) {
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("type", "ctt_task_scheduler");
                    c2344009Gk.LJIIIIZZ("task_name", str2);
                    c2344009Gk.LIZLLL(j, "totaltime");
                    C2341909Fp.LIZ("tool_performance_operation_cost_time", c2344009Gk.LIZ);
                }
            });
        }
        C0TJZ.LIZ = new InterfaceC744680TJa() { // from class: X.18lW
            @Override // X.InterfaceC744680TJa
            public final void LIZ(String str2) {
                C201955140j.LJ(str2);
            }

            @Override // X.InterfaceC744680TJa
            public final void i(String str2) {
                C201955140j.LJIIL(str2);
            }
        };
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$165(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$166(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$167(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C0C64.LJIILLIIL().LJJII(int[].class, C18Q0.LIZ, "ecommerce_ug_vsa_diversion_opt_array", true);
    }

    public static final Object invoke$168(AFwS223S0000000_32 aFwS223S0000000_32) {
        String str;
        C21213117zt.LIZ.getClass();
        ShopBagIconGuidanceAnimConfigSettings.ECShopBagLottieUrls eCShopBagLottieUrls = ShopBagIconGuidanceAnimConfigSettings.LIZ().lottieUrls;
        if (eCShopBagLottieUrls == null || (str = eCShopBagLottieUrls.animBagAfterPinBeforeBubble) == null) {
            str = "";
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("dynamic_lottie_file_name_setting", true)) {
            return new Pair(str, C21213117zt.LJI(str, "anim_new_bag_for_pin_close"));
        }
        return new Pair(str, "anim_new_bag_for_pin_close");
    }

    public static final Object invoke$169(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C288780BTo.LIZ());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$17(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$170(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21188817vy();
    }

    public static final Object invoke$171(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$172(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$173(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            Object objNewInstance = Class.forName("com.larus.business.markdown.fresco.ImagePluginImpl").newInstance();
            if (objNewInstance instanceof InterfaceC21420018sA) {
                return (InterfaceC21420018sA) objNewInstance;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object invoke$174(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            return (RomaSchemaConfig) C0C59.LJ().LJIILIIL(RomaSchemaConfig.class, null, "roma_schema_group_search_schema_config", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final Object invoke$175(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$176(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$178(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Gson();
    }

    public static final Object invoke$179(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Gson();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$18(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$180(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Gson();
    }

    public static final Object invoke$181(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            Object objNewInstance = Class.forName("c07.a").newInstance();
            if (objNewInstance instanceof InterfaceC21173117tR) {
                return (InterfaceC21173117tR) objNewInstance;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object invoke$186(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21394618o4();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$187(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$188(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$189(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$19(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1338460kw0();
    }

    public static final Object invoke$190(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$191(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$192(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$193(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18YI(new C18YH(C18YG.LJ));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$194(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$195(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$196(AFwS223S0000000_32 aFwS223S0000000_32) {
        e eVar = new e();
        eVar.LJIILIIL = true;
        return eVar.LIZ();
    }

    public static final Object invoke$197(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$198(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LinkedHashMap();
    }

    public static final Object invoke$199(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            EcElement ecElement = C18JB.LIZ;
            EcElement ecElement2 = (EcElement) c0c59LJ.LJIILIIL(EcElement.class, ecElement, "init_btm_sdk_backup", true);
            if (ecElement2 != null) {
                return ecElement2;
            }
            return ecElement;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C18JB.LIZ;
        }
    }

    public static final Object invoke$2(AFwS223S0000000_32 aFwS223S0000000_32) {
        EcLiveShopListFullDataConfigBean ecLiveShopListFullDataConfigBean = ((EcLiveShopListClientRequestConfigDetail) C21191117wL.LIZIZ.getValue()).config;
        if (ecLiveShopListFullDataConfigBean == null) {
            return C21191117wL.LIZ.config;
        }
        return ecLiveShopListFullDataConfigBean;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$20(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$200(AFwS223S0000000_32 aFwS223S0000000_32) {
        BxgyPageReturnConfigData bxgyPageReturnConfigData;
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            bxgyPageReturnConfigData = C18JS.LIZ;
            BxgyPageReturnConfigData bxgyPageReturnConfigData2 = (BxgyPageReturnConfigData) c0c59LJ.LJIILIIL(BxgyPageReturnConfigData.class, bxgyPageReturnConfigData, "purchase_reward_bxgy_landing_page_switcher", true);
            if (bxgyPageReturnConfigData2 != null) {
                bxgyPageReturnConfigData = bxgyPageReturnConfigData2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bxgyPageReturnConfigData = C18JS.LIZ;
        }
        return Boolean.valueOf(bxgyPageReturnConfigData.shouldReturnBxgyPage);
    }

    public static final Object invoke$201(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new InterfaceC2188801AlS() { // from class: X.18aW
            @Override // X.InterfaceC2188801AlS
            public final void LIZ(String str, JSONObject jSONObject) {
                if (u7.LIZ()) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1749001661) {
                        if (iHashCode != -205564286) {
                            if (iHashCode == -30478458 && str.equals("effect_event_init_display")) {
                                return;
                            }
                        } else if (str.equals("effect_performance")) {
                            return;
                        }
                    } else if (str.equals("effect_event_load_model")) {
                        return;
                    }
                }
                C20684815ws.LJIJ(str, jSONObject);
            }
        };
    }

    public static final Object invoke$202(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21361618ik();
    }

    public static final Object invoke$203(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AnchorLiveBagListOptConfig anchorLiveBagListOptConfig = C21211217za.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(AnchorLiveBagListOptConfig.class, anchorLiveBagListOptConfig, "ec_anchor_live_bag_list_opt_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return anchorLiveBagListOptConfig;
    }

    public static final Object invoke$204(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new StrikethroughSpan();
    }

    public static final Object invoke$206(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("im_sticker_live_photo");
    }

    public static final Object invoke$207(AFwS223S0000000_32 aFwS223S0000000_32) {
        Object objLJJII = C0C64.LJIILLIIL().LJJII(EarlyFeedbackButtonData.class, C21151417pw.LIZ, "dau_survey", false);
        if (objLJJII == null) {
            return new EarlyFeedbackButtonData(0, false, 0.0d, -1, -1L, -1L, -1, 0, Integer.MAX_VALUE, -1, null, null, -1L, -1L, 0L);
        }
        return objLJJII;
    }

    public static final Object invoke$208(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("early_feedback_debug_mock");
    }

    public static final Object invoke$209(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new AtomicBoolean(false);
    }

    public static final Object invoke$21(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21312818as();
    }

    public static final Object invoke$210(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Object() { // from class: X.187v
        };
    }

    public static final Object invoke$211(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Object() { // from class: X.187w
        };
    }

    public static final Object invoke$212(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$213(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$214(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("voice_input_keva");
    }

    public static final Object invoke$215(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECPdpMynaConfigModel eCPdpMynaConfigModel = C21320018c2.LIZIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_sea_myna_config", ECPdpMynaConfigModel.class, eCPdpMynaConfigModel);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return eCPdpMynaConfigModel;
    }

    public static final Object invoke$216(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212344187y(null, null, null, null, 31);
    }

    public static final Object invoke$217(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212344187y(null, null, null, null, 31);
    }

    public static final Object invoke$218(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212344187y(null, null, null, null, 31);
    }

    public static final Object invoke$219(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212344187y(null, null, null, null, 31);
    }

    public static final Object invoke$22(AFwS223S0000000_32 aFwS223S0000000_32) {
        if (C288750BTl.LIZ()) {
            return new C182Y() { // from class: X.1840
                @Override // X.C212238183w, X.InterfaceC212223183h
                public final InterfaceC428630GrN LIZLLL() {
                    return new C428670GrR() { // from class: X.0GrS
                        public final int LJJIIZI;
                        public final int LJJIJ;
                        public final int LJJIJIIJI;
                        public final float LJJIJIIJIL;
                        public final int LJJIJIL;
                        public final float LJJIJL;
                        public final Integer LJJIJLIJ;
                        public final float LJJIL;
                        public final int LJJIZ;
                        public final int LJJJ;
                        public final int LJJJI;

                        {
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            float fLIZIZ = C418440Gaw.LIZIZ(8);
                            Integer numValueOf = Integer.valueOf(R.attr.wm);
                            float fLIZIZ2 = C418440Gaw.LIZIZ(8);
                            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            this.LJJIIZI = iLIZIZ;
                            this.LJJIJ = iLIZIZ2;
                            this.LJJIJIIJI = iLIZIZ3;
                            this.LJJIJIIJIL = fLIZIZ;
                            this.LJJIJIL = R.attr.uk;
                            this.LJJIJL = 0.0f;
                            this.LJJIJLIJ = numValueOf;
                            this.LJJIL = fLIZIZ2;
                            this.LJJIZ = iLIZIZ4;
                            this.LJJJ = iLIZIZ5;
                            this.LJJJI = 72;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final Integer LIZIZ() {
                            return Integer.valueOf(this.LJJIJIIJI);
                        }

                        @Override // X.C428650GrP, X.InterfaceC428630GrN
                        public final Integer LJIILJJIL() {
                            return Integer.valueOf(this.LJJJ);
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final Integer getMarginTop() {
                            return Integer.valueOf(this.LJJIJ);
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final float LIZ() {
                            return this.LJJIJIIJIL;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final int LIZJ() {
                            return this.LJJIZ;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final float LIZLLL() {
                            return this.LJJIL;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final float LJFF() {
                            return this.LJJIJL;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final int LJIIIIZZ() {
                            return this.LJJIIZI;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final int LJIIJJI() {
                            return this.LJJIJIL;
                        }

                        @Override // X.C428650GrP, X.InterfaceC428630GrN
                        public final int LJIILIIL() {
                            return this.LJJJI;
                        }

                        @Override // X.C428670GrR, X.C428650GrP, X.InterfaceC428630GrN
                        public final Integer getBgColor() {
                            return this.LJJIJLIJ;
                        }
                    };
                }

                @Override // X.C212238183w, X.InterfaceC212223183h
                public final AnonymousClass1846 LJFF() {
                    return new C19342210lo() { // from class: X.10lq
                        public final float LIZ;
                        public final int LIZIZ;

                        {
                            float fLIZIZ = C418440Gaw.LIZIZ(14);
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            this.LIZ = fLIZIZ;
                            this.LIZIZ = iLIZIZ;
                        }

                        @Override // X.AnonymousClass1846
                        public final float LIZ() {
                            return this.LIZ;
                        }

                        @Override // X.AnonymousClass1846
                        public final int LJJI() {
                            return this.LIZIZ;
                        }
                    };
                }

                @Override // X.C212238183w, X.InterfaceC212223183h
                public final AnonymousClass1849 LJI() {
                    return new C212240183y() { // from class: X.183z
                        public final float LIZ = C418440Gaw.LIZIZ(8);

                        @Override // X.AnonymousClass1849
                        public final float LIZ() {
                            return this.LIZ;
                        }
                    };
                }
            };
        }
        return new C182Y();
    }

    public static final Object invoke$220(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212344187y(null, null, null, null, 31);
    }

    public static final Object invoke$221(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("broadcast_refresh_short_touch_delay_time", 0));
    }

    public static final Object invoke$222(AFwS223S0000000_32 aFwS223S0000000_32) {
        return 0;
    }

    public static final Object invoke$226(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Rect();
    }

    public static final Object invoke$227(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Paint();
    }

    public static final Object invoke$228(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Paint();
    }

    public static final Object invoke$229(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IMGuideSendOnAlbumUpdateExtraConfig iMGuideSendOnAlbumUpdateExtraConfig = C21512419Gw.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("im_guide_send_on_album_update_extras", IMGuideSendOnAlbumUpdateExtraConfig.class, iMGuideSendOnAlbumUpdateExtraConfig);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return iMGuideSendOnAlbumUpdateExtraConfig;
    }

    public static final Object invoke$23(AFwS223S0000000_32 aFwS223S0000000_32) {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$230(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$233(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InviteAndShareConfig inviteAndShareConfig = C18LK.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(InviteAndShareConfig.class, inviteAndShareConfig, "invite_and_share_settings", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return inviteAndShareConfig;
    }

    public static final Object invoke$234(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcAnchorDisableDeleteAppendInPublishConfig ecAnchorDisableDeleteAppendInPublishConfig = C18O4.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_disable_delete_append_in_publish", EcAnchorDisableDeleteAppendInPublishConfig.class, ecAnchorDisableDeleteAppendInPublishConfig);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return ecAnchorDisableDeleteAppendInPublishConfig;
    }

    public static final Object invoke$235(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ColorDrawable(C214810194u.LIZ(0.5f, -16777216));
    }

    public static final Object invoke$236(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PinCardStyleConfig pinCardStyleConfig = C21196617xE.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(PinCardStyleConfig.class, pinCardStyleConfig, "ecommerce_pin_card_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return pinCardStyleConfig;
    }

    public static final Object invoke$239(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Matrix();
    }

    public static final Object invoke$24(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final Object invoke$240(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Outline();
    }

    public static final Object invoke$241(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Rect();
    }

    public static final Object invoke$242(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Rect();
    }

    public static final Object invoke$243(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new RectF();
    }

    public static final Object invoke$244(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21319718bz();
    }

    public static final Object invoke$245(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1545310qJd();
    }

    public static final Object invoke$246(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C181J();
    }

    public static final Object invoke$25(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21337618es(0);
    }

    public static final Object invoke$254(AFwS223S0000000_32 aFwS223S0000000_32) {
        int iIntValue;
        Integer num;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel = C21201117xx.LIZ;
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel2 = (EcomShopBagDailyAnimModel) c0c64LJIILLIIL.LJJII(EcomShopBagDailyAnimModel.class, ecomShopBagDailyAnimModel, "ecom_cart_daily_anim_setting", true);
        if (ecomShopBagDailyAnimModel2 != null) {
            ecomShopBagDailyAnimModel = ecomShopBagDailyAnimModel2;
        }
        Integer num2 = ecomShopBagDailyAnimModel.enable;
        if (num2 != null && num2.intValue() == 1 && (num = ecomShopBagDailyAnimModel.interval) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$255(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C21198717xZ.LIZ());
    }

    public static final Object invoke$256(AFwS223S0000000_32 aFwS223S0000000_32) {
        boolean z;
        if (!C21142217oS.LIZIZ() && !C21142217oS.LIZ() && !Intrinsics.LJFF(((Top1NimblePreloadConfigList) C21142217oS.LIZIZ.getValue()).markdownOpt, Boolean.TRUE)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$257(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            Top1NimblePreloadConfigList top1NimblePreloadConfigList = C21142217oS.LIZ;
            Top1NimblePreloadConfigList top1NimblePreloadConfigList2 = (Top1NimblePreloadConfigList) c0c64LJIILLIIL.LJJII(Top1NimblePreloadConfigList.class, top1NimblePreloadConfigList, "top1_nimble_preload_config", true);
            if (top1NimblePreloadConfigList2 != null) {
                return top1NimblePreloadConfigList2;
            }
            return top1NimblePreloadConfigList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C21142217oS.LIZ;
        }
    }

    public static final Object invoke$258(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C0NOH();
    }

    public static final Object invoke$259(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C0NOH();
    }

    public static final Object invoke$26(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LinkedHashMap();
    }

    public static final Object invoke$260(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18S9(EnumC559620LxA.CLICK, C18S6.STOP, 64);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$261(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$262(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$263(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$264(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$265(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$266(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$267(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$268(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$269(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$270(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$271(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$273(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new WeakHashMap();
    }

    public static final Object invoke$275(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LinkedHashMap();
    }

    public static final Object invoke$277(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new AbstractC21318218bk<C21317918bh>() { // from class: X.18bg
            @Override // X.AbstractC21318218bk
            public final C21318318bl LIZ(Map map) {
                Map mapLJ;
                Object obj = null;
                if (map != null) {
                    obj = map.get("extra");
                }
                if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                return new C21318318bl(true, new C21317918bh(mapLJ));
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
            @Override // X.AbstractC21318218bk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C21319218bu r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    X.18bh r6 = (X.C21317918bh) r6
                    X.18bv r0 = r5.LIZIZ
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r0.LJ
                    java.lang.String r0 = "item"
                    java.lang.Object r3 = r1.get(r0)
                    boolean r0 = r3 instanceof X.C1773340wFQ
                    r2 = 0
                    if (r0 == 0) goto L36
                    X.0wFD r3 = (X.AbstractC1773210wFD) r3
                L13:
                    if (r6 == 0) goto L2f
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r6.LIZ
                    if (r1 == 0) goto L2f
                    if (r3 == 0) goto L2f
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r3.LJIJI
                    if (r0 != 0) goto L33
                    if (r3 == 0) goto L2f
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    r3.LJIJI = r0
                L28:
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r3.LJIJI
                    if (r0 == 0) goto L2f
                    r0.putAll(r1)
                L2f:
                    r5.LIZJ(r2)
                    return
                L33:
                    if (r3 == 0) goto L2f
                    goto L28
                L36:
                    r3 = r2
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21317818bg.LIZIZ(X.18bu, java.lang.Object):void");
            }
        };
    }

    public static final Object invoke$278(AFwS223S0000000_32 aFwS223S0000000_32) {
        return EcShopBagBubbleNoImageSetting.LIZ();
    }

    public static final Object invoke$279(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212152180o();
    }

    public static final Object invoke$28(AFwS223S0000000_32 aFwS223S0000000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("debug : ");
        sbLIZ.append(C18IP.LIZ.LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$280(AFwS223S0000000_32 aFwS223S0000000_32) {
        Object objLJJII = C0C64.LJIILLIIL().LJJII(ECommerceNativePreloadConfig.class, C21209417zI.LIZ, "ec_native_preload_setting_extra_setting", true);
        if (objLJJII == null) {
            return new ECommerceNativePreloadConfig(true);
        }
        return objLJJII;
    }

    public static final Object invoke$281(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ViewFlipperController();
    }

    public static final Object invoke$282(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ViewFlipperController();
    }

    public static final Object invoke$283(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18JF() { // from class: X.18JE
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(284));

            @Override // X.C18JF
            public final String getBtm() {
                String string;
                JSONObject jSONObjectLIZ = BtmSDK.INSTANCE.getBcmChainByBtmModel((C21244318Bt) this.LIZ.getValue(), 20, false).LIZ();
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (jSONObjectLIZ.has("chain")) {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObjectLIZ, "chain");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        if (jSONObject.has("btm")) {
                            string = JSONObjectProtectorUtils.getString(jSONObject, "btm");
                            break;
                        }
                        string = null;
                    }
                    string = null;
                } else {
                    string = null;
                }
                return string == null ? "" : string;
            }
        };
    }

    public static final Object invoke$284(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21244318Bt();
    }

    public static final Object invoke$285(AFwS223S0000000_32 aFwS223S0000000_32) {
        C21242718Bd c21242718Bd = new C21242718Bd();
        c21242718Bd.LIZ = true;
        return C2097608Jq.LJIIJ(new Pair("ecom_entrance", c21242718Bd));
    }

    public static final Object invoke$286(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LinkedBlockingQueue(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final Object invoke$287(AFwS223S0000000_32 aFwS223S0000000_32) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initByJSON, length: ");
        boolean z = C21240318Af.LIZ;
        List<BcmCheckParam> list = C21240318Af.LIZLLL.data.paramsList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$288(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ReentrantLock();
    }

    public static final Object invoke$289(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Integer.valueOf(C18CS.LIZ.LIZLLL().LIZLLL());
    }

    public static final Object invoke$29(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new XElementInitializerLite();
    }

    public static final Object invoke$290(AFwS223S0000000_32 aFwS223S0000000_32) {
        AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
        return Boolean.valueOf(((C18EH) AnonymousClass1891.LIZLLL.getValue()).LIZJ(AnonymousClass1891.LIZIZ));
    }

    public static final Object invoke$291(AFwS223S0000000_32 aFwS223S0000000_32) {
        String strLIZIZ;
        C18G6 c18g6 = AnonymousClass1891.LIZJ;
        if (c18g6 == null || (strLIZIZ = c18g6.LIZIZ("key_bcm", "")) == null) {
            strLIZIZ = "";
        }
        boolean z = true;
        if (strLIZIZ.length() > 0) {
            JSONObject jSONObject = new JSONObject(strLIZIZ);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Map<String, C212369188x> map = AnonymousClass1891.LIZIZ;
                C212368188w c212368188w = C212369188x.LJ;
                String strOptString = jSONObject.optString(next);
                c212368188w.getClass();
                map.put(next, C212368188w.LIZ(strOptString));
            }
        }
        C18G6 c18g62 = AnonymousClass1891.LIZJ;
        if (c18g62 != null) {
            c18g62.LIZJ("key_bcm", "");
        }
        if (strLIZIZ.length() <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$292(AFwS223S0000000_32 aFwS223S0000000_32) {
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null) {
            return iCommerceService.LIZIZ();
        }
        return null;
    }

    public static final Object invoke$293(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AiChatDomainSettings aiChatDomainSettings = C21288518St.LIZ;
            AiChatDomainSettings aiChatDomainSettings2 = (AiChatDomainSettings) settingsManagerLIZLLL.LJIIIIZZ("creation_ai_chat_domain_settings", AiChatDomainSettings.class, aiChatDomainSettings);
            if (aiChatDomainSettings2 != null) {
                return aiChatDomainSettings2;
            }
            return aiChatDomainSettings;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C21288518St.LIZ;
        }
    }

    public static final Object invoke$294(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcWidgetLoadAsCoreConfig ecWidgetLoadAsCoreConfig = C180G.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EcWidgetLoadAsCoreConfig.class, ecWidgetLoadAsCoreConfig, "ec_widget_load_as_core", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return ecWidgetLoadAsCoreConfig;
    }

    public static final Object invoke$295(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcWidgetLoadPriorityConfig ecWidgetLoadPriorityConfig = C180H.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EcWidgetLoadPriorityConfig.class, ecWidgetLoadPriorityConfig, "ec_widget_load_priority_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return ecWidgetLoadPriorityConfig;
    }

    public static final Object invoke$296(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PrefetchPinConfig prefetchPinConfig = C180J.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(PrefetchPinConfig.class, prefetchPinConfig, "ec_prefetch_pin_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return prefetchPinConfig;
    }

    public static final Object invoke$297(AFwS223S0000000_32 aFwS223S0000000_32) {
        C844470XAv.LIZ.getClass();
        TTVideoEngine tTVideoEngine = new TTVideoEngine(C844470XAv.LIZ(), 0);
        tTVideoEngine.LLILZIL("CameoPlayerScene");
        tTVideoEngine.LIZJ(199, 1);
        tTVideoEngine.setLooping(true);
        return tTVideoEngine;
    }

    public static final Object invoke$298(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final Object invoke$299(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21337618es(0);
    }

    public static final Object invoke$30(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new BPEAHandler();
    }

    public static final Object invoke$300(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LinkedHashMap();
    }

    public static final Object invoke$301(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21146117p5();
    }

    public static final Object invoke$302(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("creation_ai_chat_pending_auth");
    }

    public static final Object invoke$303(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("creation_ai_chat_privacy");
    }

    public static final Object invoke$304(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21356218hs();
    }

    public static final Object invoke$305(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C212354188i();
    }

    public static final Object invoke$306(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new AbstractC21356318ht() { // from class: X.18hr
            @Override // X.AbstractC21356318ht
            public final void LJ() {
                View view;
                View view2 = this.LJFF;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                Function0<Boolean> function0 = this.LJIILL;
                if (function0 == null || !function0.invoke().booleanValue() || (view = this.LJIILLIIL) == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view);
            }

            @Override // X.AbstractC21356318ht
            public final void LIZJ() {
                View viewLIZ = LIZ();
                if (viewLIZ != null) {
                    C786410Ut5.LJLLLLLL(8, viewLIZ);
                }
            }

            @Override // X.AbstractC21356318ht
            public final void LIZLLL() {
                View viewLIZ = LIZ();
                if (viewLIZ != null) {
                    C786410Ut5.T4(viewLIZ, 0.4f);
                }
            }

            @Override // X.AbstractC21356318ht
            public final void LJI(List<C1621190sI1> list) {
                int iLLLII;
                int i;
                C21355718hn c21355718hn = this.LJIILJJIL;
                if (c21355718hn != null) {
                    iLLLII = c21355718hn.LLLII();
                } else {
                    iLLLII = 0;
                }
                C1624230sMv c1624230sMv = this.LJIIZILJ;
                if (c1624230sMv != null) {
                    i = c1624230sMv.LIZJ;
                } else {
                    i = Integer.MAX_VALUE;
                }
                if (iLLLII >= i) {
                    View viewLIZ = LIZ();
                    if (viewLIZ != null) {
                        C786410Ut5.T4(viewLIZ, 1.0f);
                        return;
                    }
                    return;
                }
                View viewLIZ2 = LIZ();
                if (viewLIZ2 == null) {
                    return;
                }
                C786410Ut5.T4(viewLIZ2, 0.4f);
            }

            @Override // X.AbstractC21356318ht
            public final void LJIIIZ(int i) {
                boolean z;
                View view;
                int i2;
                float f;
                C1624230sMv c1624230sMv = this.LJIIZILJ;
                int iLLLII = 0;
                if (c1624230sMv != null && c1624230sMv.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    View view2 = this.LJFF;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    View view3 = this.LJIILLIIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                    View viewLIZ = LIZ();
                    if (viewLIZ != null) {
                        C21355718hn c21355718hn = this.LJIILJJIL;
                        if (c21355718hn != null) {
                            iLLLII = c21355718hn.LLLII();
                        }
                        C1624230sMv c1624230sMv2 = this.LJIIZILJ;
                        if (c1624230sMv2 != null) {
                            i2 = c1624230sMv2.LIZJ;
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (iLLLII >= i2) {
                            f = 1.0f;
                        } else {
                            f = 0.4f;
                        }
                        C786410Ut5.T4(viewLIZ, f);
                        return;
                    }
                    return;
                }
                View view4 = this.LJFF;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                Function0<Boolean> function0 = this.LJIILL;
                if (function0 == null || !function0.invoke().booleanValue() || (view = this.LJIILLIIL) == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, view);
            }

            @Override // X.AbstractC21356318ht
            public final void LJIIJJI(boolean z) {
                C1624230sMv c1624230sMv = this.LJIIZILJ;
                if (c1624230sMv != null && c1624230sMv.LIZIZ) {
                    if (z) {
                        View viewLIZ = LIZ();
                        if (viewLIZ != null) {
                            C21357918i9.LIZIZ(viewLIZ);
                            return;
                        }
                        return;
                    }
                    View viewLIZ2 = LIZ();
                    if (viewLIZ2 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, viewLIZ2);
                }
            }

            @Override // X.AbstractC21356318ht
            public final void LJIIJ(Effect effect, boolean z) {
                if (z) {
                    View viewLIZ = LIZ();
                    if (viewLIZ != null) {
                        C786410Ut5.I7(null, viewLIZ);
                        return;
                    }
                    return;
                }
                View viewLIZ2 = LIZ();
                if (viewLIZ2 != null) {
                    C786410Ut5.I7(new View.OnClickListener(viewLIZ2, this, effect) { // from class: X.18hp
                        public final /* synthetic */ View LL;
                        public final /* synthetic */ C21356118hr LLILLJJLI;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int size;
                            Map<C21356918hz, Integer> map;
                            Set setKeySet;
                            C21356118hr c21356118hr;
                            InterfaceC212356188k interfaceC212356188k;
                            List<C1621190sI1> listLLLIIIIL;
                            int i = 0;
                            if (this.LL.getAlpha() == 1.0f && (interfaceC212356188k = (c21356118hr = this.LLILLJJLI).LIZLLL) != null) {
                                C21355718hn c21355718hn = c21356118hr.LJIILJJIL;
                                if (c21355718hn != null) {
                                    listLLLIIIIL = c21355718hn.LLLIIIIL();
                                } else {
                                    listLLLIIIIL = C13BV.INSTANCE;
                                }
                                interfaceC212356188k.LJFF(listLLLIIIIL);
                            }
                            C21355718hn c21355718hn2 = this.LLILLJJLI.LJIILJJIL;
                            ArrayList arrayList = null;
                            if (c21355718hn2 != null && (map = c21355718hn2.LLJ) != null && (setKeySet = ((LinkedHashMap) map).keySet()) != null) {
                                arrayList = new ArrayList(setKeySet);
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (((C21356918hz) obj).LJI == 2) {
                                        arrayList2.add(obj);
                                    }
                                }
                                arrayList2.isEmpty();
                                if (arrayList != null && (!arrayList.isEmpty())) {
                                }
                            }
                            if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
                                if (arrayList != null) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (((C21356918hz) it2.next()).LJIIIZ < 200) {
                                            i = 1;
                                        }
                                    }
                                    size = arrayList.size();
                                } else {
                                    size = 0;
                                }
                                InterfaceC21358118iB interfaceC21358118iB = this.LLILLJJLI.LIZJ;
                                if (interfaceC21358118iB != null) {
                                    interfaceC21358118iB.LJI(i, size);
                                }
                            }
                            C21356118hr c21356118hr2 = this.LLILLJJLI;
                            InterfaceC21358118iB interfaceC21358118iB2 = c21356118hr2.LIZJ;
                            if (interfaceC21358118iB2 != null) {
                                C21355718hn c21355718hn3 = c21356118hr2.LJIILJJIL;
                                if (c21355718hn3 != null) {
                                    ((ArrayList) c21355718hn3.LLLIIIIL()).size();
                                }
                                interfaceC21358118iB2.onComplete();
                            }
                        }
                    }, viewLIZ2);
                }
            }
        };
    }

    public static final Object invoke$307(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.EDIT_PROFILE);
    }

    public static final Object invoke$308(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$309(AFwS223S0000000_32 aFwS223S0000000_32) {
        int iIntValue;
        Integer num;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel = C21201117xx.LIZ;
        EcomShopBagDailyAnimModel ecomShopBagDailyAnimModel2 = (EcomShopBagDailyAnimModel) c0c64LJIILLIIL.LJJII(EcomShopBagDailyAnimModel.class, ecomShopBagDailyAnimModel, "ecom_cart_daily_anim_setting", true);
        if (ecomShopBagDailyAnimModel2 != null) {
            ecomShopBagDailyAnimModel = ecomShopBagDailyAnimModel2;
        }
        Integer num2 = ecomShopBagDailyAnimModel.enable;
        if (num2 != null && num2.intValue() == 1 && (num = ecomShopBagDailyAnimModel.interval) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$31(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewBgConfig livePreviewBgConfig = C21282318Qj.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LivePreviewBgConfig.class, livePreviewBgConfig, "live_preview_background_setting", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return livePreviewBgConfig;
    }

    public static final Object invoke$310(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C21198717xZ.LIZ());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$311(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$312(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$313(AFwS223S0000000_32 aFwS223S0000000_32) {
        EcLiveShopListFullDataConfigBean ecLiveShopListFullDataConfigBean = ((EcLiveShopListClientRequestConfigDetail) C21191117wL.LIZIZ.getValue()).config;
        if (ecLiveShopListFullDataConfigBean == null) {
            return C21191117wL.LIZ.config;
        }
        return ecLiveShopListFullDataConfigBean;
    }

    public static final Object invoke$314(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PostPageClickPostPredictionFriendsTabDataConfig postPageClickPostPredictionFriendsTabDataConfig = C194P.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(PostPageClickPostPredictionFriendsTabDataConfig.class, postPageClickPostPredictionFriendsTabDataConfig, "studio_adr_post_page_pre_load_friends_tab_data_strategy", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return postPageClickPostPredictionFriendsTabDataConfig;
    }

    public static final Object invoke$315(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21367018jc();
    }

    public static final Object invoke$316(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$317(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$318(AFwS223S0000000_32 aFwS223S0000000_32) {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    public static final Object invoke$319(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("ecom_keva_repo_name_influencer");
    }

    public static final Object invoke$32(AFwS223S0000000_32 aFwS223S0000000_32) {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C1238990iLZ.LIZ);
        if (interfaceC2661011fLIZ != null) {
            return interfaceC2661011fLIZ.create(LoginApprovalApi.Api.class);
        }
        return null;
    }

    public static final Object invoke$320(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$321(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$322(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$323(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21323018cW(null, 0L, 0, null, null, null, null, false, null, null, null, 8190);
    }

    public static final Object invoke$324(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final Object invoke$326(AFwS223S0000000_32 aFwS223S0000000_32) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(12);
        return c444890HcV.getTypeface();
    }

    public static final Object invoke$327(AFwS223S0000000_32 aFwS223S0000000_32) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(61);
        return c444890HcV.getTypeface();
    }

    public static final Object invoke$328(AFwS223S0000000_32 aFwS223S0000000_32) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(11);
        return c444890HcV.getTypeface();
    }

    public static final Object invoke$329(AFwS223S0000000_32 aFwS223S0000000_32) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(62);
        return c444890HcV.getTypeface();
    }

    public static final Object invoke$33(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C295350Bht.LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.18TW] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.18UB] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.18Th] */
    public static final Object invoke$330(AFwS223S0000000_32 aFwS223S0000000_32) {
        C21289618Te c21289618TeLIZ;
        IAIChatGenerateServiceFactory iAIChatGenerateServiceFactory = (IAIChatGenerateServiceFactory) PluggableExtentionKt.pluggableSpi$default(IAIChatGenerateServiceFactory.class, false, false, false, 14, null);
        if (iAIChatGenerateServiceFactory != null && (c21289618TeLIZ = iAIChatGenerateServiceFactory.LIZ()) != 0) {
            final AwS646S0100000_32 awS646S0100000_32 = new AwS646S0100000_32(c21289618TeLIZ, 34);
            c21289618TeLIZ.LJIJI(new InterfaceC21290518Tn(awS646S0100000_32) { // from class: X.18Th
                public final Function2<C869590Y9l, String, Unit> LIZ;
                public boolean LIZIZ;
                public long LIZJ = -1;
                public String LIZLLL = "";
                public String LJ = "";

                @Override // X.InterfaceC21290518Tn
                public final void LIZIZ() {
                    this.LIZJ = -1L;
                    this.LIZLLL = "";
                    this.LIZIZ = false;
                }

                @Override // X.InterfaceC21290518Tn
                public final boolean isCanceled() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = awS646S0100000_32;
                }

                @Override // X.InterfaceC21290518Tn
                public final boolean LIZ(C869590Y9l c869590Y9l, Long l) {
                    if (!this.LIZIZ || l == null) {
                        return false;
                    }
                    long msgId = 0;
                    if (this.LIZJ <= 0) {
                        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(this.LIZLLL);
                        if (c869590Y9lLIZLLL != null) {
                            msgId = c869590Y9lLIZLLL.getMsgId();
                        }
                        this.LIZJ = msgId;
                    }
                    if (this.LIZJ != l.longValue()) {
                        return false;
                    }
                    this.LIZJ = -1L;
                    this.LIZLLL = "";
                    this.LIZIZ = false;
                    this.LIZ.invoke(c869590Y9l, this.LJ);
                    return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
                @Override // X.InterfaceC21290518Tn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZJ(X.C869590Y9l r5, java.lang.String r6) {
                    /*
                        r4 = this;
                        if (r5 != 0) goto L3
                        return
                    L3:
                        r4.LJ = r6
                        X.18T4 r0 = X.C21163117rp.LIZIZ()
                        boolean r0 = r0.LJIILL(r5)
                        r3 = 1820(0x71c, float:2.55E-42)
                        r2 = 1
                        if (r0 == 0) goto L47
                        r4.LIZIZ = r2
                        java.lang.String r0 = r5.getUuid()
                        r4.LIZLLL = r0
                        int r1 = r5.getMsgType()
                        r0 = 1821(0x71d, float:2.552E-42)
                        if (r1 != r0) goto L31
                        java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate.class
                        com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r5, r0)
                        com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate) r0
                        if (r0 == 0) goto L44
                        long r0 = r0.replyMsgId
                    L2e:
                        r4.LIZJ = r0
                    L30:
                        return
                    L31:
                        int r0 = r5.getMsgType()
                        if (r0 != r3) goto L44
                        java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate.class
                        com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r5, r0)
                        com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate) r0
                        if (r0 == 0) goto L44
                        long r0 = r0.replyMsgID
                        goto L2e
                    L44:
                        r0 = 0
                        goto L2e
                    L47:
                        int r1 = r5.getMsgType()
                        r0 = 1819(0x71b, float:2.549E-42)
                        if (r1 != r0) goto L5e
                        r4.LIZIZ = r2
                        java.lang.String r0 = r5.getUuid()
                        r4.LIZLLL = r0
                        long r0 = r5.getMsgId()
                        r4.LIZJ = r0
                        return
                    L5e:
                        int r0 = r5.getMsgType()
                        if (r0 != r3) goto L30
                        r0 = -1
                        r4.LIZJ = r0
                        java.lang.String r0 = ""
                        r4.LIZLLL = r0
                        r0 = 0
                        r4.LIZIZ = r0
                        kotlin.jvm.functions.Function2<X.0Y9l, java.lang.String, kotlin.Unit> r0 = r4.LIZ
                        r0.invoke(r5, r6)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21289918Th.LIZJ(X.0Y9l, java.lang.String):void");
                }
            }, new InterfaceC21289318Tb() { // from class: X.18UB
                public boolean LIZ;
                public String LIZIZ = "";
                public String LIZJ = "";
                public C869590Y9l LIZLLL;

                @Override // X.InterfaceC21289318Tb
                public final void LIZIZ() {
                    this.LIZ = true;
                    C21290818Tq.LIZJ("WaitForReplyDelegateImpl", "onReadyToShow");
                }

                @Override // X.InterfaceC21289318Tb
                public final void LIZ(boolean z) {
                    if (!this.LIZ) {
                        C21290818Tq.LIZJ("WaitForReplyDelegateImpl", "onLastMessageChanged: not ready");
                        return;
                    }
                    C869590Y9l c869590Y9l = null;
                    if (z) {
                        if (this.LIZLLL != null) {
                            return;
                        }
                        C21290818Tq.LIZJ("WaitForReplyDelegateImpl", "onLastMessageChanged: show");
                        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
                        if (fakeMsgOperatorService != null) {
                            String str = this.LIZIZ;
                            C1684506ih c1684506ih = new C1684506ih();
                            c1684506ih.LIZLLL(1282);
                            c1684506ih.LIZJ = "fake_wait_for_reply_msg_id";
                            c1684506ih.LJFF = new C18UF();
                            C1736806r8 c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(str, c1684506ih, this.LIZJ, null, null);
                            if (c1736806r8LIZIZ != null) {
                                c869590Y9l = c1736806r8LIZIZ.LIZJ;
                            }
                        }
                        this.LIZLLL = c869590Y9l;
                        return;
                    }
                    if (this.LIZLLL == null) {
                        return;
                    }
                    C21290818Tq.LIZJ("WaitForReplyDelegateImpl", "onLastMessageChanged: hide");
                    FakeMsgOperatorService fakeMsgOperatorService2 = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
                    if (fakeMsgOperatorService2 != null) {
                        String str2 = this.LIZIZ;
                        C1684506ih c1684506ih2 = new C1684506ih();
                        c1684506ih2.LIZLLL(1282);
                        c1684506ih2.LIZJ = "fake_wait_for_reply_msg_id";
                        fakeMsgOperatorService2.LIZ(str2, c1684506ih2, this.LIZJ, null);
                    }
                    this.LIZLLL = null;
                }

                @Override // X.InterfaceC21289318Tb
                public final void LIZJ(String str, String str2) {
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZ = false;
                    this.LIZLLL = null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onConversationReset: conversationId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", sessionUuid=");
                    sbLIZ.append(str2);
                    C21290818Tq.LIZJ("WaitForReplyDelegateImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, new C18TX() { // from class: X.18TW
                @Override // X.C18TX
                public final int LIZ() {
                    C1727006pY.LIZ.getClass();
                    return C1727006pY.LIZIZ();
                }
            });
            return c21289618TeLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$331(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new InterfaceC21300818Xm() { // from class: X.18Tc
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
            public final C054G LIZ;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C21289418Tc.class, "conversationRepository", "getConversationRepository()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationRepository;", 0);
                C13LE.LIZ.getClass();
                LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            {
                new C903950ZdB();
                C1DFH c1dfh = C0PEM.LIZ;
                this.LIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
            }

            @Override // X.InterfaceC21300818Xm
            public final boolean LIZ(String str) {
                String str2 = C342380DbY.LIZ().aiChatBotId;
                if (C1533950q1J.LJ(str) && Intrinsics.LJFF(str, str2)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJI(VideoPublishContainerScene videoPublishContainerScene) {
                List<Scene> listLJLJJLL;
                NavigationScene navigationSceneLIZ;
                List<Scene> sceneList;
                AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(videoPublishContainerScene);
                if (abstractC214814194yLIZ == null || (navigationSceneLIZ = C1447800nmM.LIZ(abstractC214814194yLIZ)) == null || (sceneList = navigationSceneLIZ.getSceneList()) == null || (listLJLJJLL = C13LP.LJLJJLL(sceneList)) == null) {
                    listLJLJJLL = C13BV.INSTANCE;
                }
                for (Scene scene : listLJLJJLL) {
                    if (!(scene instanceof AiChatRoomRootScene)) {
                        AbstractC214814194y abstractC214814194yLIZ2 = C372650EjH.LIZ(scene);
                        if (abstractC214814194yLIZ2 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("finish scene: ");
                            sbLIZ.append(scene.getClass().getSimpleName());
                            C21290818Tq.LIZ("AiChatRoomLauncher", C2188811AlT.LIZIZ(sbLIZ));
                            abstractC214814194yLIZ2.finish();
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJII(Context context) {
                C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromInnerPush");
                LJIIJ(context, new AwS146S1100000_32("visual_poet_inner_push", context, 26));
            }

            @Override // X.InterfaceC21300818Xm
            public final boolean LJIIIIZZ(String str) {
                String strLIZJ = C0YNP.LIZJ(5, C342380DbY.LIZ().aiChatBotId);
                if (C1533950q1J.LJ(str) && Intrinsics.LJFF(str, strLIZJ)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZIZ(Context context, String str) {
                C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromOuterPush");
                if (str == null) {
                    str = "visual_poet_outer_push";
                }
                LJIIJ(context, new AwS146S1100000_32(str, context, 26));
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJIIIZ(Context context, AIChatGenConsumptionModel aIChatGenConsumptionModel) {
                LJIIJ(context, new AwS398S0200000_32(context, aIChatGenConsumptionModel, 106));
            }

            public final void LJIIJ(Context context, Function1<? super String, Unit> function1) {
                C23250099c.LIZLLL(this.LIZ, null, null, new C21163217rq(function1, context, null), 3);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZLLL(Context context, OnActivityResultCallback onActivityResultCallback, AIChatPageConfig aIChatPageConfig) {
                C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromComment;");
                List<MediaPayload> list = aIChatPageConfig.payload.medias;
                if (list != null) {
                    for (MediaPayload mediaPayload : list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mediaPayload -> ");
                        sbLIZ.append(mediaPayload);
                        C21290818Tq.LIZJ("AiChatRoomLauncher", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    C21290818Tq.LIZJ("AiChatRoomLauncher", "aiChatPageConfig.payload.medias is null");
                }
                C21290818Tq.LIZJ("AiChatRoomLauncher", "tracking -> " + aIChatPageConfig.tracking);
                C21290818Tq.LIZJ("AiChatRoomLauncher", "features -> enableDraft: " + aIChatPageConfig.features.enableDraft + "; enableActionBar: " + aIChatPageConfig.features.enableActionBar);
                LJIIJ(context, new AwS54S0301000_32(context, onActivityResultCallback, aIChatPageConfig, 1));
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJFF(C19EG c19eg, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode, String str) {
                LJIIJ(c19eg, new AwS68S1300000_32(c19eg, aIChatGenConsumptionModel, aIChatGenNode, str, 1));
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZJ(Context context, AIChatGenModel aIChatGenModel, AIChatGenNode aIChatGenNode, String str, String str2) {
                LJIIJ(context, new C21289518Td(context, aIChatGenModel, aIChatGenNode, str2, str));
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJ(Context context, String str, String str2, String str3, String str4, String str5) {
                LJIIJ(context, new AwS0S5100000_32(context, str, str3, str4, str2, str5, 1));
            }
        };
    }

    public static final Object invoke$332(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.TRUE;
    }

    public static final Object invoke$333(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final Object invoke$334(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C0CHQ.LIZ().getNetworkService().createDefaultRetrofit(IMKitApi.class);
    }

    public static final Object invoke$337(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21211417zc();
    }

    public static final Object invoke$338(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$339(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$34(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new ArrayList();
    }

    public static final Object invoke$340(AFwS223S0000000_32 aFwS223S0000000_32) {
        int iLJIJI;
        try {
            iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.weak_net_country_traffic_opt(), "weak_net_country_traffic_opt");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21141717oN.LIZ.getClass();
            iLJIJI = 0;
        }
        return Integer.valueOf(iLJIJI);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$341(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$342(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$343(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcLiveShopListClientRequestConfigDetail ecLiveShopListClientRequestConfigDetail = C21191117wL.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EcLiveShopListClientRequestConfigDetail.class, ecLiveShopListClientRequestConfigDetail, "ec_live_shop_list_client_request_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return ecLiveShopListClientRequestConfigDetail;
    }

    public static final Object invoke$344(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcShopBagAfterPinCardGuide ecShopBagAfterPinCardGuide = C212161180x.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(EcShopBagAfterPinCardGuide.class, ecShopBagAfterPinCardGuide, "ttec_shopping_bag_click_guidance_bubble_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return ecShopBagAfterPinCardGuide;
    }

    public static final Object invoke$345(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C0NOH();
    }

    public static final Object invoke$346(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C0NOH();
    }

    public static final Object invoke$347(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AnchorPinCardConfig anchorPinCardConfig = C21201217xy.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(AnchorPinCardConfig.class, anchorPinCardConfig, "anchor_show_pin_product_card", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return anchorPinCardConfig;
    }

    public static final Object invoke$348(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1338460kw0();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$349(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C295350Bht.LIZ());
    }

    public static final Object invoke$36(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18S0(0);
    }

    public static final Object invoke$37(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PluggableExtentionKt.pluggableSpi$default(C0ZLD.class, false, false, false, 14, null);
    }

    public static final Object invoke$38(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Keva.getRepo("album_update_send_guide_repo");
    }

    public static final Object invoke$39(AFwS223S0000000_32 aFwS223S0000000_32) {
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        if (c212350188eLIZJ != null) {
            return c212350188eLIZJ.LIZ();
        }
        return null;
    }

    public static final Object invoke$4(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            final Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            final Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            final Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new AbstractC21517319It(declaredField3, declaredField, declaredField2) { // from class: X.19Is
                public final Field LIZ;
                public final Field LIZIZ;
                public final Field LIZJ;

                @Override // X.AbstractC21517319It
                public final boolean LIZ(InputMethodManager inputMethodManager) {
                    try {
                        this.LIZJ.set(inputMethodManager, null);
                        return true;
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }

                @Override // X.AbstractC21517319It
                public final Object LIZIZ(InputMethodManager inputMethodManager) {
                    try {
                        return this.LIZ.get(inputMethodManager);
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }

                @Override // X.AbstractC21517319It
                public final View LIZJ(InputMethodManager inputMethodManager) {
                    try {
                        return (View) this.LIZIZ.get(inputMethodManager);
                    } catch (ClassCastException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    } catch (IllegalAccessException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }

                {
                    this.LIZ = declaredField3;
                    this.LIZIZ = declaredField;
                    this.LIZJ = declaredField2;
                }
            };
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            return new AbstractC21517319It() { // from class: X.19Iu
                @Override // X.AbstractC21517319It
                public final boolean LIZ(InputMethodManager inputMethodManager) {
                    return false;
                }

                @Override // X.AbstractC21517319It
                public final Object LIZIZ(InputMethodManager inputMethodManager) {
                    return null;
                }

                @Override // X.AbstractC21517319It
                public final View LIZJ(InputMethodManager inputMethodManager) {
                    return null;
                }
            };
        }
    }

    public static final Object invoke$40(AFwS223S0000000_32 aFwS223S0000000_32) {
        C09GA c09ga = (C09GA) C21142717oX.LIZ.getValue();
        if (c09ga != null) {
            return c09ga.LJII(ByteBenchStrategyRecordVideoOutputSizeConfiguration.class);
        }
        return null;
    }

    public static final Object invoke$41(AFwS223S0000000_32 aFwS223S0000000_32) {
        ByteBenchStrategyRecordVideoOutputSizeConfiguration byteBenchStrategyRecordVideoOutputSizeConfiguration;
        String recordOutputSize;
        if (((Boolean) C0BJ3.LIZ.getValue()).booleanValue() && (byteBenchStrategyRecordVideoOutputSizeConfiguration = (ByteBenchStrategyRecordVideoOutputSizeConfiguration) C21142717oX.LIZIZ.getValue()) != null && (recordOutputSize = byteBenchStrategyRecordVideoOutputSizeConfiguration.getRecordOutputSize()) != null) {
            return recordOutputSize;
        }
        return null;
    }

    public static final Object invoke$42(AFwS223S0000000_32 aFwS223S0000000_32) {
        if (((Boolean) C0BJ3.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(C21142717oX.LIZJ.getValue(), C21142717oX.LIZLLL.getValue())) {
            return 1;
        }
        return 0;
    }

    public static final Object invoke$43(AFwS223S0000000_32 aFwS223S0000000_32) {
        ByteBenchStrategyRecordVideoOutputSizeConfiguration byteBenchStrategyRecordVideoOutputSizeConfiguration;
        if (((Boolean) C0BJ3.LIZ.getValue()).booleanValue() && (byteBenchStrategyRecordVideoOutputSizeConfiguration = (ByteBenchStrategyRecordVideoOutputSizeConfiguration) C21142717oX.LIZIZ.getValue()) != null) {
            return byteBenchStrategyRecordVideoOutputSizeConfiguration.getStaticRecordOutputSize();
        }
        return null;
    }

    public static final Object invoke$44(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        DetailPreloadViewCountInfo detailPreloadViewCountInfo = C21265718Jz.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(DetailPreloadViewCountInfo.class, detailPreloadViewCountInfo, "studio_recyclerview_prefetch_list_count", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return detailPreloadViewCountInfo;
    }

    public static final Object invoke$45(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C19D6.LIZJ;
    }

    public static final Object invoke$46(AFwS223S0000000_32 aFwS223S0000000_32) {
        HandlerThread handlerThread = new HandlerThread("global_task_scheduler");
        handlerThread.start();
        return handlerThread;
    }

    public static final Object invoke$47(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new VideoViewComponent();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS223S0000000_32 aFwS223S0000000_32) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EcShouldEnablePrefixInMultiAnchorAB.Config config = EcShouldEnablePrefixInMultiAnchorAB.LIZ;
            EcShouldEnablePrefixInMultiAnchorAB.Config config2 = (EcShouldEnablePrefixInMultiAnchorAB.Config) c0c64LJIILLIIL.LJJII(EcShouldEnablePrefixInMultiAnchorAB.Config.class, config, "ec_sv_should_enable_prefix_in_multi_anchor", true);
            if (config2 != null) {
                return config2;
            }
            return config;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EcShouldEnablePrefixInMultiAnchorAB.LIZ;
        }
    }

    public static final Object invoke$5(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PluggableExtentionKt.pluggableSpi$default(ITakoNetworkGate.class, false, false, false, 14, null);
    }

    public static final Object invoke$50(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C18RT();
    }

    public static final Object invoke$51(AFwS223S0000000_32 aFwS223S0000000_32) {
        C19D4 c19d4 = new C19D4(0);
        c19d4.LJFF = R.attr.bx;
        c19d4.LJI = R.attr.bx;
        c19d4.LJ = false;
        c19d4.LIZ = true;
        return c19d4;
    }

    public static final Object invoke$52(AFwS223S0000000_32 aFwS223S0000000_32) {
        C19D4 c19d4 = new C19D4(0);
        c19d4.LJFF = R.attr.bx;
        c19d4.LIZ = true;
        return c19d4;
    }

    public static final Object invoke$53(AFwS223S0000000_32 aFwS223S0000000_32) {
        C1519540pe4.LIZ(null, "rd_ec_media_card_create", "", null);
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS223S0000000_32 aFwS223S0000000_32) {
        URL url = new URL(C21187817vo.LIZ().ruleConfig.ruleCdnUrl);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(url.getProtocol());
        sbLIZ.append("://");
        sbLIZ.append(url.getHost());
        return ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(ProtocolRuleApi.class);
    }

    public static final Object invoke$55(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new LruCache(20);
    }

    public static final Object invoke$56(AFwS223S0000000_32 aFwS223S0000000_32) {
        final AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(32);
        C844470XAv.LIZ.getClass();
        final IPitayaCore core = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
        final String str = "gecc_live_shop_bag_icon_guide";
        core.queryPackage("gecc_live_shop_bag_icon_guide", new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ecommercelive.audience.common.business.clientai.EcLivePitayaMessageRegistry$checkPackageReady$1$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("package ");
                    sbLIZ.append(str);
                    sbLIZ.append(" ready");
                    C2188811AlT.LIZIZ(sbLIZ);
                    aFwS231S0000000_3.invoke(str);
                    return;
                }
                if (pTYError != null) {
                    if (pTYError.getCode() == PTYErrorCode.PACKAGE_NOT_READY.getCode()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("package ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" not ready, start download package...");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        IPitayaCore iPitayaCore = core;
                        final String str2 = str;
                        final Function1<String, Unit> function1 = aFwS231S0000000_3;
                        iPitayaCore.downloadPackage(str2, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ecommercelive.audience.common.business.clientai.EcLivePitayaMessageRegistry$checkPackageReady$1$1$onResult$1
                            @Override // com.bytedance.pitaya.api.PTYPackageCallback
                            public void onResult(boolean z2, PTYError pTYError2, PTYPackageInfo pTYPackageInfo2) {
                                if (z2) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("package ");
                                    sbLIZ3.append(str2);
                                    sbLIZ3.append(" download complete");
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    function1.invoke(str2);
                                    return;
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("package ");
                                sbLIZ4.append(str2);
                                sbLIZ4.append(" download error: ");
                                sbLIZ4.append(pTYError2);
                                C2188811AlT.LIZIZ(sbLIZ4);
                            }
                        });
                        return;
                    }
                    if (pTYError.getCode() == PTYErrorCode.PACKAGE_NOT_FOUND.getCode()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("package ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(" not found");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("package error: ");
                sbLIZ4.append(pTYError);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_preview_enable_client_ai", true, false));
    }

    public static final Object invoke$58(AFwS223S0000000_32 aFwS223S0000000_32) {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("ec_auction_replay_fallback", true));
    }

    public static final Object invoke$59(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$6(AFwS223S0000000_32 aFwS223S0000000_32) {
        Object objLJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("res_usage_threshold_config", ResourceUsageThresholdConfig.class, C21378618lU.LIZ);
        if (objLJIIIIZZ == null) {
            return new ResourceUsageThresholdConfig(0.7f, 0.9f, -1, 30000L, 0L);
        }
        return objLJIIIIZZ;
    }

    public static final Object invoke$60(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$61(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$62(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$63(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.4f, 1.0f);
    }

    public static final Object invoke$64(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig seaLiveBagIconEducationBubbleConfig = SeaLiveBagIconEducationBubbleSetting.LIZIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig.class, seaLiveBagIconEducationBubbleConfig, "sea_live_bag_icon_education_bubble", true);
        if (objLJJII == null) {
            SeaLiveBagIconEducationBubbleSetting.LIZ.getClass();
            return seaLiveBagIconEducationBubbleConfig;
        }
        return objLJJII;
    }

    public static final Object invoke$65(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = C21517619Iw.LIZ;
        Object objLJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "string_from_chars_cache_ab", 31744, StringCacheConfig.class, null, 2);
        if (objLJJIIJ == null) {
            return null;
        }
        return objLJJIIJ;
    }

    public static final Object invoke$66(AFwS223S0000000_32 aFwS223S0000000_32) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = C21517519Iv.LIZ;
        Object objLJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "string_from_substring_cache_ab", 31744, StringCacheConfig.class, null, 2);
        if (objLJJIIJ == null) {
            return null;
        }
        return objLJJIIJ;
    }

    public static final Object invoke$67(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C721340SRg(true);
    }

    public static final Object invoke$68(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C721340SRg(false);
    }

    public static final Object invoke$69(AFwS223S0000000_32 aFwS223S0000000_32) {
        if (C480460Ism.LIZ() != null) {
            return C480460Ism.LIZLLL(FansGroupInviteApi.class);
        }
        return null;
    }

    public static final Object invoke$7(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21360918id();
    }

    public static final Object invoke$70(AFwS223S0000000_32 aFwS223S0000000_32) {
        int i;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel = RavenMusicCollectionEmbeddedExp.LIZ;
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel2 = (RavenMusicCollectionEmbeddedExp.EmbeddedModel) c0c64LJIILLIIL.LJJII(RavenMusicCollectionEmbeddedExp.EmbeddedModel.class, embeddedModel, "raven_music_collection_embedded_exp", true);
            if (embeddedModel2 != null) {
                i = embeddedModel2.embeddedMode;
            } else {
                i = embeddedModel.embeddedMode;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = RavenMusicCollectionEmbeddedExp.LIZ.embeddedMode;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$71(AFwS223S0000000_32 aFwS223S0000000_32) {
        boolean z;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel = RavenMusicCollectionEmbeddedExp.LIZ;
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel2 = (RavenMusicCollectionEmbeddedExp.EmbeddedModel) c0c64LJIILLIIL.LJJII(RavenMusicCollectionEmbeddedExp.EmbeddedModel.class, embeddedModel, "raven_music_collection_embedded_exp", true);
            if (embeddedModel2 != null) {
                z = embeddedModel2.enable;
            } else {
                z = embeddedModel.enable;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = RavenMusicCollectionEmbeddedExp.LIZ.enable;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$72(AFwS223S0000000_32 aFwS223S0000000_32) {
        String str;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel = RavenMusicCollectionEmbeddedExp.LIZ;
            RavenMusicCollectionEmbeddedExp.EmbeddedModel embeddedModel2 = (RavenMusicCollectionEmbeddedExp.EmbeddedModel) c0c64LJIILLIIL.LJJII(RavenMusicCollectionEmbeddedExp.EmbeddedModel.class, embeddedModel, "raven_music_collection_embedded_exp", true);
            if (embeddedModel2 == null || (str = embeddedModel2.testSchema) == null) {
                return embeddedModel.testSchema;
            }
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return RavenMusicCollectionEmbeddedExp.LIZ.testSchema;
        }
    }

    public static final Object invoke$73(AFwS223S0000000_32 aFwS223S0000000_32) {
        Object objLJJII = C0C64.LJIILLIIL().LJJII(FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig.class, FlexiblePanelPerformanceSettings.LIZ, "fcp_spark_preload_strategy", true);
        if (objLJJII == null) {
            return new FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig(3000.0f, 7.0f, 0.3f, new PrerenderConfig(false, null, null, 0.0d, 0, 31, null), new ReuseConfig(false, null, 0.0d, 0, null, 31, null));
        }
        return objLJJII;
    }

    public static final Object invoke$74(AFwS223S0000000_32 aFwS223S0000000_32) {
        return SettingsManager.LIZLLL().LJIIIIZZ("ttls_passthrough_params_keys_need_merged", LSPassThroughKeyNeedMergedConfig.class, LSPassThroughKeyNeedMergedSettings.defaultConfig);
    }

    public static final Object invoke$75(AFwS223S0000000_32 aFwS223S0000000_32) {
        return SettingsManager.LIZLLL().LJIIIIZZ("ttls_passthrough_params_rd_mob_config", LSPassThroughRDMobModel.class, LSPassThroughRDMobConfig.defaultConfig);
    }

    public static final Object invoke$76(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new VideoViewComponent(0);
    }

    public static final Object invoke$77(AFwS223S0000000_32 aFwS223S0000000_32) {
        return C7740030o.LIZ().getGson();
    }

    public static final Object invoke$78(AFwS223S0000000_32 aFwS223S0000000_32) {
        C844470XAv.LIZ.getClass();
        return C1323690kYB.LIZ(C844470XAv.LIZ());
    }

    public static /* bridge */ /* synthetic */ Object invoke$79(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$80(AFwS223S0000000_32 aFwS223S0000000_32) {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C1238990iLZ.LIZ);
        if (interfaceC2661011fLIZ != null) {
            return interfaceC2661011fLIZ.create(PopupConfigApi.Api.class);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$81(AFwS223S0000000_32 aFwS223S0000000_32) {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C1238990iLZ.LIZ);
        if (interfaceC2661011fLIZ != null) {
            return interfaceC2661011fLIZ.create(PopupConfirmationApi.Api.class);
        }
        return null;
    }

    public static final Object invoke$82(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C21352318hF();
    }

    public static final Object invoke$83(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1664690tQB(null, Unit.LIZ);
    }

    public static final Object invoke$84(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1002270cBl();
    }

    public static final Object invoke$85(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190T(2131826465, 2131826464, null, Integer.valueOf(R.raw.icon_alt_text), null, 0, 116);
    }

    public static final Object invoke$86(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190I(2131828926, R.raw.icon_collaboration, true, null);
    }

    public static final Object invoke$87(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190T(2131849966, null, null, Integer.valueOf(R.raw.icon_film_star), null, 0, 118);
    }

    public static final Object invoke$88(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C214741192d();
    }

    public static final Object invoke$89(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new Object() { // from class: X.193e
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$9(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$90(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Unit.LIZ;
    }

    public static final Object invoke$91(AFwS223S0000000_32 aFwS223S0000000_32) {
        return PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
    }

    public static final Object invoke$92(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190T(2131825158, null, null, Integer.valueOf(R.raw.icon_playlist), null, 0, 118);
    }

    public static final Object invoke$93(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C190T(2131845179, 2131848269, null, Integer.valueOf(R.raw.icon_lock), null, 0, 116);
    }

    public static final Object invoke$94(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C214741192d();
    }

    public static final Object invoke$95(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C1178304jF(0);
    }

    public static final Object invoke$96(AFwS223S0000000_32 aFwS223S0000000_32) {
        return new C192J(0);
    }

    public static final Object invoke$97(AFwS223S0000000_32 aFwS223S0000000_32) {
        return Boolean.FALSE;
    }

    public static final Object invoke$98(AFwS223S0000000_32 aFwS223S0000000_32) {
        int i;
        int iLIZIZ = C190N.LIZIZ.LIZIZ();
        if (iLIZIZ != 2 && iLIZIZ != 3) {
            if (iLIZIZ != 4) {
                i = 2131849592;
            } else {
                i = 2131849591;
            }
        } else {
            i = 2131849590;
        }
        return new C190H(i, R.raw.icon_person, 8, null, 8, null);
    }

    public static final Object invoke$99(AFwS223S0000000_32 aFwS223S0000000_32) {
        int i;
        if (C297750Bll.LIZ()) {
            i = 2131846761;
        } else {
            i = 2131846760;
        }
        return new C190Z(C1436290nTn.LIZ.getBoolean("has_water_mark", false), i, false, Integer.valueOf(R.raw.icon_tiktok_logo_rectangle), (Integer) 2131844951, 48);
    }
}
