package kotlin.jvm.internal;

import X.AbstractC1327750kej;
import X.AbstractC20356314kz;
import X.AbstractC447090Hg3;
import X.C09AY;
import X.C0NB4;
import X.C0PEM;
import X.C0SKG;
import X.C118300cf;
import X.C1210880hcE;
import X.C127I;
import X.C129G;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1325700kbQ;
import X.C1360890lWB;
import X.C1388190mED;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C13LP;
import X.C13XS;
import X.C13XZ;
import X.C1440005kM;
import X.C150D;
import X.C150X;
import X.C150Z;
import X.C15438062q;
import X.C154M;
import X.C155H;
import X.C155Z;
import X.C157Y;
import X.C15KP;
import X.C15M4;
import X.C15MM;
import X.C15V3;
import X.C163E;
import X.C16CD;
import X.C1749280vcc;
import X.C19EG;
import X.C201955140j;
import X.C201962140q;
import X.C20356614l2;
import X.C20356914l5;
import X.C20357914lF;
import X.C20361214lm;
import X.C20380414os;
import X.C20380514ot;
import X.C20441214yg;
import X.C20517115Qb;
import X.C20517915Qj;
import X.C20518015Qk;
import X.C20521215Rq;
import X.C20526015Tm;
import X.C20532515Vz;
import X.C20565515dd;
import X.C20590015ha;
import X.C20590315hd;
import X.C20590915hj;
import X.C20591015hk;
import X.C20623915n3;
import X.C20654015ru;
import X.C20654215rw;
import X.C20698915z9;
import X.C20699015zA;
import X.C207235167l;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C294250Bg7;
import X.C294280BgA;
import X.C362440EIw;
import X.C389001fE;
import X.C634930OvL;
import X.C723850SaN;
import X.C724240Sb0;
import X.C725940Sdk;
import X.C737410SwF;
import X.C737420SwG;
import X.C786410Ut5;
import X.C822700WPc;
import X.EnumC1654750tA9;
import X.EnumC20429514wn;
import X.InterfaceC1320200kSY;
import X.InterfaceC1459100o4a;
import X.InterfaceC1631620sYq;
import X.InterfaceC20354714kj;
import X.InterfaceC204613154p;
import X.InterfaceC20517315Qd;
import X.InterfaceC20517715Qh;
import X.InterfaceC20619215mI;
import X.InterfaceC207228167e;
import X.InterfaceC946300ajU;
import Y.ARunnableS35S0201000_31;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.playentity.EnhanceEntity;
import com.bytedance.android.live.effect.playentity.MusicEntity;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.AIWallpaperEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.ManageGuestEntity;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.android.livesdk.condition.PlayCondition;
import com.bytedance.android.livesdk.interaction.playentity.DrawGuessEntity;
import com.bytedance.android.livesdk.interaction.playentity.PollAndGiftVoteEntity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.router.SmartRoute;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.common.live_data.NextLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabRootScene;
import com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.ss.android.ugc.aweme.shortvideo.model.MultiChoose;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS147S0110000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS275S0300000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS275S0300000_31 awS275S0300000_31) {
        if (C294250Bg7.LIZ() != 0 && C0SKG.LIZ.enableAtomicDedup) {
            if (((AtomicBoolean) awS275S0300000_31.l0).compareAndSet(false, true)) {
                ((C163E) awS275S0300000_31.l1).LJIIJ((Aweme) awS275S0300000_31.l2, false);
            }
        } else {
            ((C163E) awS275S0300000_31.l1).LJIIJ((Aweme) awS275S0300000_31.l2, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS275S0300000_31 awS275S0300000_31) {
        C19EG c19eg = (C19EG) awS275S0300000_31.l0;
        C723850SaN.LIZIZ(c19eg, new AwS240S0300000_31((FrameLayout) awS275S0300000_31.l1, c19eg, (CommonHorizontalContainerAssem) awS275S0300000_31.l2, 2));
        return c19eg;
    }

    public static final Object invoke$10(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LJII((ManageGuestEntity) awS275S0300000_31.l0, 1, (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) awS275S0300000_31.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LIZJ((DrawGuessEntity) awS275S0300000_31.l0, "", (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS275S0300000_31 awS275S0300000_31) {
        if (((PollAndGiftVoteEntity) awS275S0300000_31.l0).LLJJJJJIL.LJ != 0) {
            PlayEntityUtilKt.LJ((PollAndGiftVoteEntity) awS275S0300000_31.l0, 2, (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element);
            PlayEntityUtilKt.LIZLLL((PollAndGiftVoteEntity) awS275S0300000_31.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS275S0300000_31 awS275S0300000_31) {
        if (((PollAndGiftVoteEntity) awS275S0300000_31.l0).LLJJJJJIL.LJ != 0) {
            PlayEntityUtilKt.LJ((PollAndGiftVoteEntity) awS275S0300000_31.l0, 1, (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element);
            PlayEntityUtilKt.LIZLLL((PollAndGiftVoteEntity) awS275S0300000_31.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
      0x0024: PHI (r1v1 androidx.lifecycle.LifecycleOwner) = (r1v0 androidx.lifecycle.LifecycleOwner), (r1v5 androidx.lifecycle.LifecycleOwner) binds: [B:3:0x000d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS275S0300000_31 r4) {
        /*
            com.bytedance.tux.common.live_data.NextLiveData r3 = new com.bytedance.tux.common.live_data.NextLiveData
            r3.<init>()
            java.lang.Object r0 = r4.l0
            android.view.View r0 = (android.view.View) r0
            androidx.lifecycle.LifecycleOwner r1 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r0)
            if (r1 != 0) goto L24
            java.lang.Object r0 = r4.l1
            X.15ha r0 = (X.C20590015ha) r0
            android.view.View r0 = r0.LIZ
            r1 = 0
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.getContext()
        L1c:
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L40
            X.19FO r1 = (X.C19FO) r1
            if (r1 == 0) goto L40
        L24:
            java.lang.Object r0 = r4.l2
            X.15hj r0 = (X.C20590915hj) r0
            r3.observe(r1, r0)
        L2b:
            java.lang.Object r2 = r4.l0
            android.view.View r2 = (android.view.View) r2
            r0 = 2131396242(0x7f0a8692, float:1.841322E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r0 = X.C20591015hk.LJFF(r2)
            r0.put(r1, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            java.lang.Object r0 = r4.l2
            X.15hj r0 = (X.C20590915hj) r0
            r3.observeForever(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS275S0300000_31.invoke$14(kotlin.jvm.internal.AwS275S0300000_31):java.lang.Object");
    }

    public static final Object invoke$15(AwS275S0300000_31 awS275S0300000_31) {
        ((NextLiveData) awS275S0300000_31.l0).removeObserver((C20590915hj) awS275S0300000_31.l1);
        View view = (View) awS275S0300000_31.l2;
        C20591015hk.LJFF(view).remove(Integer.valueOf(R.id.z1s));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS275S0300000_31 awS275S0300000_31) {
        ((CommerceToolsMusicService) awS275S0300000_31.l0).LJFF((AVMusic) awS275S0300000_31.l1, (Integer) awS275S0300000_31.l2);
        ((CommerceToolsMusicService) awS275S0300000_31.l0).LIZIZ((AVMusic) awS275S0300000_31.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS275S0300000_31 awS275S0300000_31) {
        String string;
        View view;
        C1440005kM.LIZ(new C1210880hcE("homepage_explore", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C20526015Tm) awS275S0300000_31.l0).LL));
        C20526015Tm c20526015Tm = (C20526015Tm) awS275S0300000_31.l0;
        Aweme aweme = c20526015Tm.LL;
        Integer numValueOf = Integer.valueOf(c20526015Tm.LLILZLL);
        ExploreFeedComponent exploreFeedComponent = (ExploreFeedComponent) awS275S0300000_31.l1;
        Aweme aweme2 = ((C20526015Tm) awS275S0300000_31.l0).LL;
        exploreFeedComponent.getClass();
        C20532515Vz.LIZ(new C725940Sdk(aweme, numValueOf, ExploreFeedComponent.So(aweme2)));
        ExploreFeedListViewModel.LLL = ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        ExploreFeedComponent exploreFeedComponent2 = (ExploreFeedComponent) awS275S0300000_31.l1;
        exploreFeedComponent2.LLJJIJI = true;
        Context context = exploreFeedComponent2.getContext();
        if (context == null || (string = context.getString(2131839832)) == null) {
            string = "";
        }
        Fragment fragmentLJI = C724240Sb0.LJI((ExploreFeedComponent) awS275S0300000_31.l1);
        if (fragmentLJI != null && (view = fragmentLJI.getView()) != null) {
            C118300cf c118300cf = (C118300cf) awS275S0300000_31.l2;
            C1389910mGz c1389910mGz = new C1389910mGz(view);
            c1389910mGz.LJIIJ(string);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZIZ(c118300cf.element);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZIZ = 0;
            c1360890lWB.LIZLLL = 3;
            c1389910mGz.LJIIJJI();
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$18(AwS275S0300000_31 awS275S0300000_31) {
        String string;
        View view;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C737410SwF((C20526015Tm) awS275S0300000_31.l0, null), 3);
        ExploreFeedListViewModel.LLL = ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        C1440005kM.LIZ(new C1210880hcE("homepage_explore", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C20526015Tm) awS275S0300000_31.l0).LL));
        C20532515Vz.LIZ(new C15V3(((C20526015Tm) awS275S0300000_31.l0).LL, ((ExploreFeedComponent) awS275S0300000_31.l1).ja(), ((ExploreFeedComponent) awS275S0300000_31.l1).Ek()));
        ExploreFeedComponent exploreFeedComponent = (ExploreFeedComponent) awS275S0300000_31.l1;
        exploreFeedComponent.LLJJIJI = true;
        Context context = exploreFeedComponent.getContext();
        if (context == null || (string = context.getString(2131839833)) == null) {
            string = "";
        }
        Fragment fragmentLJI = C724240Sb0.LJI((ExploreFeedComponent) awS275S0300000_31.l1);
        if (fragmentLJI != null && (view = fragmentLJI.getView()) != null) {
            C118300cf c118300cf = (C118300cf) awS275S0300000_31.l2;
            C1389910mGz c1389910mGz = new C1389910mGz(view);
            c1389910mGz.LJIIJ(string);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZIZ(c118300cf.element);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZIZ = 0;
            c1360890lWB.LIZLLL = 3;
            c1389910mGz.LJIIJJI();
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$19(AwS275S0300000_31 awS275S0300000_31) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIZ(((C20526015Tm) awS275S0300000_31.l0).LL, "homepage_explore", ((ViewGroup) awS275S0300000_31.l1).getContext(), "long_press", "homepage_explore", null, "", 0, null, null);
        ((ExploreFeedComponent) awS275S0300000_31.l2).LLJJIJI = true;
        ExploreFeedListViewModel.LLL = ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS275S0300000_31 awS275S0300000_31) {
        Executor executor = (Executor) awS275S0300000_31.l2;
        final C15MM c15mm = (C15MM) awS275S0300000_31.l0;
        final Exception exc = (Exception) awS275S0300000_31.l1;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AwS275S0300000_31.invoke$lambda$0$0(c15mm, exc);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS275S0300000_31 awS275S0300000_31) {
        String string;
        C1440005kM.LIZ(new C1210880hcE("homepage_explore", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C20526015Tm) awS275S0300000_31.l0).LL));
        C20526015Tm c20526015Tm = (C20526015Tm) awS275S0300000_31.l0;
        String str = null;
        C20532515Vz.LIZ(new C725940Sdk(c20526015Tm.LL, Integer.valueOf(c20526015Tm.LLILZLL), null));
        ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1;
        exploreTopicGeneralFeedListComponent.LLJJI = true;
        Context context = exploreTopicGeneralFeedListComponent.getContext();
        if (context == null || (string = context.getString(2131839832)) == null) {
            string = "";
        }
        View viewLJJIJL = ((ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1).LJJIJL();
        C118300cf c118300cf = (C118300cf) awS275S0300000_31.l2;
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1;
        C1389910mGz c1389910mGz = new C1389910mGz(viewLJJIJL);
        c1389910mGz.LJIIJ(string);
        c1389910mGz.LIZIZ(c118300cf.element);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        C20521215Rq c20521215RqEk = exploreTopicGeneralFeedListComponent2.Ek();
        if (c20521215RqEk != null) {
            str = c20521215RqEk.LIZ;
        }
        if (Intrinsics.LJFF(str, "topic_popup_page")) {
            c1389910mGz.LIZ.LJIIIZ = viewLJJIJL.getRootView();
        }
        c1389910mGz.LJIIJJI();
        return Boolean.TRUE;
    }

    public static final Object invoke$21(AwS275S0300000_31 awS275S0300000_31) {
        String string;
        String str = null;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C737420SwG((C20526015Tm) awS275S0300000_31.l0, null), 3);
        ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        C1440005kM.LIZ(new C1210880hcE("homepage_explore", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C20526015Tm) awS275S0300000_31.l0).LL));
        C20532515Vz.LIZ(new C15V3(((C20526015Tm) awS275S0300000_31.l0).LL, ((ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1).ja(), ((ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1).Ek()));
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1;
        exploreTopicGeneralFeedListComponent.LLJJI = true;
        Context context = exploreTopicGeneralFeedListComponent.getContext();
        if (context == null || (string = context.getString(2131839833)) == null) {
            string = "";
        }
        View viewLJJIJL = ((ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1).LJJIJL();
        C118300cf c118300cf = (C118300cf) awS275S0300000_31.l2;
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l1;
        C1389910mGz c1389910mGz = new C1389910mGz(viewLJJIJL);
        c1389910mGz.LJIIJ(string);
        c1389910mGz.LIZIZ(c118300cf.element);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        C20521215Rq c20521215RqEk = exploreTopicGeneralFeedListComponent2.Ek();
        if (c20521215RqEk != null) {
            str = c20521215RqEk.LIZ;
        }
        if (Intrinsics.LJFF(str, "topic_popup_page")) {
            c1389910mGz.LIZ.LJIIIZ = viewLJJIJL.getRootView();
        }
        c1389910mGz.LJIIJJI();
        return Boolean.TRUE;
    }

    public static final Object invoke$22(AwS275S0300000_31 awS275S0300000_31) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIZ(((C20526015Tm) awS275S0300000_31.l0).LL, "homepage_explore", ((ViewGroup) awS275S0300000_31.l1).getContext(), "long_press", "homepage_explore", null, "", 0, null, null);
        ((ExploreTopicGeneralFeedListComponent) awS275S0300000_31.l2).LLJJI = true;
        ((C20526015Tm) awS275S0300000_31.l0).LL.getAid();
        return Boolean.TRUE;
    }

    public static final Object invoke$23(AwS275S0300000_31 awS275S0300000_31) {
        ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) awS275S0300000_31.l0;
        AwS308S0300000_31 awS308S0300000_31 = new AwS308S0300000_31((IAwemeService) awS275S0300000_31.l2, (ExploreAwemeList) awS275S0300000_31.l1, exploreFeedListViewModel, 1);
        exploreFeedListViewModel.getClass();
        exploreFeedListViewModel.withState(new AwS397S0200000_31(exploreFeedListViewModel, (ExploreFeedListViewModel) awS308S0300000_31, (Function2<? super Integer, ? super C150D, Unit>) 81));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS275S0300000_31 awS275S0300000_31) {
        Scene scene;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        LiveMultiTabRootScene liveMultiTabRootScene = (LiveMultiTabRootScene) awS275S0300000_31.l0;
        liveMultiTabRootScene.LLJJJJJIL = (Integer) awS275S0300000_31.l1;
        C150Z c150z = (C150Z) awS275S0300000_31.l2;
        if (c150z != null) {
            FrameLayout frameLayout = liveMultiTabRootScene.LLJJJ;
            if (frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
            if (Intrinsics.LJFF(c150z.LIZJ, C150X.LIVE.getTag())) {
                if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = 0;
                }
                Activity activity = liveMultiTabRootScene.mActivity;
                if (activity != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(activity)) != null) {
                    ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ2);
                    TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ2, immersionBarLJIILJJIL);
                    immersionBarLJIILJJIL.LJIIL();
                    tuxImmersionBar.LJ(R.attr.e1);
                    tuxImmersionBar.LIZLLL();
                }
            } else {
                if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = liveMultiTabRootScene.LLJJJJLIIL;
                }
                Activity activity2 = liveMultiTabRootScene.mActivity;
                if (activity2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity2)) != null) {
                    TuxImmersionBar tuxImmersionBar2 = new TuxImmersionBar(c19egLIZIZ, ImmersionBar.LJIILJJIL(c19egLIZIZ));
                    tuxImmersionBar2.LJIIIIZZ(R.attr.e1);
                    tuxImmersionBar2.LJ(R.attr.e1);
                    tuxImmersionBar2.LIZLLL();
                }
            }
            FrameLayout frameLayout2 = liveMultiTabRootScene.LLJJJ;
            if (frameLayout2 != null) {
                C786410Ut5.a6(frameLayout2, layoutParams2);
            }
        }
        if (((LiveMultiTabRootScene) awS275S0300000_31.l0).isAdded(((C150Z) awS275S0300000_31.l2).LIZIZ)) {
            ((LiveMultiTabRootScene) awS275S0300000_31.l0).show(((C150Z) awS275S0300000_31.l2).LIZIZ);
        } else {
            LiveMultiTabRootScene liveMultiTabRootScene2 = (LiveMultiTabRootScene) awS275S0300000_31.l0;
            C150Z c150z2 = (C150Z) awS275S0300000_31.l2;
            liveMultiTabRootScene2.add(R.id.eqx, c150z2.LIZIZ, c150z2.LIZJ);
        }
        ((LiveMultiTabRootScene) awS275S0300000_31.l0).LLLLJI((C150Z) awS275S0300000_31.l2, true);
        LiveMultiTabRootScene liveMultiTabRootScene3 = (LiveMultiTabRootScene) awS275S0300000_31.l0;
        C150Z c150z3 = liveMultiTabRootScene3.LLJJJJ;
        if (c150z3 != null && (scene = c150z3.LIZIZ) != null) {
            liveMultiTabRootScene3.LLLLJI(c150z3, false);
            liveMultiTabRootScene3.hide(scene);
        }
        ((LiveMultiTabRootScene) awS275S0300000_31.l0).LLJJJJ = (C150Z) awS275S0300000_31.l2;
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS275S0300000_31 awS275S0300000_31) {
        ((C157Y) awS275S0300000_31.l0).LIZIZ(new HostClientAiService$wrapperLivePitayaCore$1((IPitayaCore) ((C259800zU) awS275S0300000_31.l1).element, (IFeatureCore) awS275S0300000_31.l2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS275S0300000_31 awS275S0300000_31) {
        ((NetworkStandardUIServiceImpl) awS275S0300000_31.l2).autoRetryListener.put(new WeakReference<>((C1749280vcc) awS275S0300000_31.l1), new WeakReference<>((Function0) awS275S0300000_31.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS275S0300000_31 awS275S0300000_31) {
        C15M4.LIZ((AsyncAVService) awS275S0300000_31.l0, (C634930OvL) awS275S0300000_31.l1, (RecordConfig.Builder) awS275S0300000_31.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS275S0300000_31 awS275S0300000_31) {
        C15M4.LIZ((AsyncAVService) awS275S0300000_31.l0, (C634930OvL) awS275S0300000_31.l1, (RecordConfig.Builder) awS275S0300000_31.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS275S0300000_31 awS275S0300000_31) {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ = ((VerticalMusicViewV2) awS275S0300000_31.l0).LJJ();
        if (lifecycleCoroutineScopeLJJ != null) {
            ((InterfaceC1459100o4a) awS275S0300000_31.l1).LIZ((MusicModel) awS275S0300000_31.l2, lifecycleCoroutineScopeLJJ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS275S0300000_31 awS275S0300000_31) {
        Executor executor = (Executor) awS275S0300000_31.l2;
        final C15MM c15mm = (C15MM) awS275S0300000_31.l0;
        final Object obj = awS275S0300000_31.l1;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c15mm.LIZ(obj);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS275S0300000_31 awS275S0300000_31) {
        MusicModel.MusicItemType musicItemType;
        boolean z;
        boolean zLJJJJI;
        String strEN;
        String musicId;
        InterfaceC204613154p interfaceC204613154pLJJJJLL;
        MusicModel musicModel = (MusicModel) awS275S0300000_31.l0;
        boolean z2 = false;
        if (musicModel != null && Intrinsics.LJFF(C154M.LIZ, musicModel.getMusicId())) {
            MusicModel musicModel2 = (MusicModel) awS275S0300000_31.l0;
            C155H c155h = null;
            if (musicModel2 != null) {
                musicItemType = musicModel2.getMusicItemType();
            } else {
                musicItemType = null;
            }
            if (musicItemType == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                z = true;
            } else {
                z = false;
            }
            VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) awS275S0300000_31.l1;
            EnumC1654750tA9 enumC1654750tA9 = verticalMusicViewV2.LLLF;
            EnumC1654750tA9 enumC1654750tA92 = EnumC1654750tA9.TAB_AI;
            if (enumC1654750tA9 == enumC1654750tA92) {
                zLJJJJI = verticalMusicViewV2.LJJJJI((MusicModel) awS275S0300000_31.l0);
            } else {
                zLJJJJI = false;
            }
            C129G c129gLJIILLIIL = ((VerticalMusicViewV2) awS275S0300000_31.l1).LJIILLIIL();
            MusicModel musicModel3 = (MusicModel) awS275S0300000_31.l0;
            if (musicModel3 != null && musicModel3.hasExtendMusicList()) {
                C155H c155h2 = ((VerticalMusicViewV2) awS275S0300000_31.l1).LLIZ;
                if (c155h2 == null) {
                    c155h2 = null;
                }
                c155h2.LJIIL.LJIIZILJ(false);
            }
            C155H c155h3 = ((VerticalMusicViewV2) awS275S0300000_31.l1).LLIZ;
            if (c155h3 == null) {
                c155h3 = null;
            }
            C155Z c155z = c155h3.LJIIL;
            AVMusic aVMusicLIZ = new C15KP().apply((MusicModel) awS275S0300000_31.l0);
            MultiChoose multiChoose = new MultiChoose((MusicModel) awS275S0300000_31.l0, (Map) awS275S0300000_31.l2);
            Long lValueOf = Long.valueOf(((VerticalMusicViewV2) awS275S0300000_31.l1).LLLIZZ);
            EnumC1654750tA9 enumC1654750tA93 = ((VerticalMusicViewV2) awS275S0300000_31.l1).LLLF;
            if (enumC1654750tA93 == enumC1654750tA92) {
                z2 = true;
            }
            String stringValue = enumC1654750tA93.getStringValue();
            MusicModel musicModel4 = (MusicModel) awS275S0300000_31.l0;
            if (musicModel4 != null && (musicId = musicModel4.getMusicId()) != null && (interfaceC204613154pLJJJJLL = ((VerticalMusicViewV2) awS275S0300000_31.l1).LJJJJLL()) != null) {
                strEN = interfaceC204613154pLJJJJLL.EN(musicId);
            } else {
                strEN = null;
            }
            c155z.LJIJI(aVMusicLIZ, multiChoose, lValueOf, z2, z, false, zLJJJJI, stringValue, strEN, false);
            C201955140j.LJIILL(C201962140q.LIZIZ, "VerticalMusicView", "onMultiMusicDownloadSuccess: onMusicChoose real success");
            if (c129gLJIILLIIL != null) {
                c129gLJIILLIIL.LLLIILIL(-1);
            }
            ((VerticalMusicViewV2) awS275S0300000_31.l1).LJJLIIIJ((MusicModel) awS275S0300000_31.l0);
            VerticalMusicViewV2 verticalMusicViewV22 = (VerticalMusicViewV2) awS275S0300000_31.l1;
            C155H c155h4 = verticalMusicViewV22.LLIZ;
            if (c155h4 != null) {
                c155h = c155h4;
            }
            c155h.LJIIL.LJIIIZ((MusicModel) awS275S0300000_31.l0, zLJJJJI, verticalMusicViewV22.LLLF.getStringValue(), ((VerticalMusicViewV2) awS275S0300000_31.l1).LLLIZZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS275S0300000_31 awS275S0300000_31) {
        Function2<? super DownloadInfo, ? super BaseException, Unit> function2 = ((C207235167l) awS275S0300000_31.l0).LLILZ;
        if (function2 != null) {
            function2.invoke((DownloadInfo) awS275S0300000_31.l1, (BaseException) awS275S0300000_31.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS275S0300000_31 awS275S0300000_31) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) awS275S0300000_31.l0;
        IHostSubscription.Result.PhotoFile photoFile = (IHostSubscription.Result.PhotoFile) awS275S0300000_31.l1;
        InterfaceC207228167e interfaceC207228167e = (InterfaceC207228167e) awS275S0300000_31.l2;
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, liveSubMediaModel.getUuidStr());
        jSONObject.put("base64Data", photoFile.base64);
        jSONObject.put("with_text_sticker", interfaceC207228167e.getEmotesShowStyle());
        C389001fE.LIZ("chooseImageForSubReady", jSONObject, System.currentTimeMillis(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS275S0300000_31 awS275S0300000_31) {
        C127I c127i = C127I.LIZ;
        Context context = (Context) awS275S0300000_31.l0;
        PushSettings pushSettings = (PushSettings) awS275S0300000_31.l1;
        String str = ((DisplayAndCaptionVM) awS275S0300000_31.l2).LL;
        c127i.getClass();
        if (C294280BgA.LIZ()) {
            DoNotTranslateSettingPageV2.LLJJIII.getClass();
            SmartRoute smartRouteLIZIZ = C20698915z9.LIZIZ(context, pushSettings, str, null);
            if (smartRouteLIZIZ != null) {
                smartRouteLIZIZ.open(1003);
            }
        } else {
            DoNotTranslateSettingPage.LLJILLL.getClass();
            SmartRoute smartRouteLIZ = C20699015zA.LIZ(context, pushSettings, str, null);
            if (smartRouteLIZ != null) {
                smartRouteLIZ.open(1002);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS275S0300000_31 awS275S0300000_31) {
        ((C16CD) awS275S0300000_31.l0).LLLFZ((C21341918fZ) awS275S0300000_31.l1, (List) awS275S0300000_31.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS275S0300000_31 awS275S0300000_31) {
        InterfaceC20619215mI interfaceC20619215mI = (InterfaceC20619215mI) awS275S0300000_31.l0;
        if (interfaceC20619215mI != null) {
            boolean zLJII = interfaceC20619215mI.LJII((TuxSheet) awS275S0300000_31.l1);
            EditShareSelectFragment editShareSelectFragment = (EditShareSelectFragment) awS275S0300000_31.l2;
            if (zLJII) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIILIIL(editShareSelectFragment);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[PHI: r11
      0x008e: PHI (r11v4 X.14of) = (r11v3 X.14of), (r11v6 X.14of) binds: [B:33:0x008b, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS275S0300000_31 r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS275S0300000_31.invoke$36(kotlin.jvm.internal.AwS275S0300000_31):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250 A[PHI: r7
      0x0250: PHI (r7v8 X.14of) = (r7v3 X.14of), (r7v10 X.14of) binds: [B:58:0x0129, B:56:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$37(kotlin.jvm.internal.AwS275S0300000_31 r14) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS275S0300000_31.invoke$37(kotlin.jvm.internal.AwS275S0300000_31):java.lang.Object");
    }

    public static final Object invoke$38(AwS275S0300000_31 awS275S0300000_31) {
        Map<String, String> map = C0NB4.LIZ;
        C0NB4.LIZIZ(((C20623915n3) awS275S0300000_31.l0).LIZIZ.getAid(), ((C20623915n3) awS275S0300000_31.l0).LIZIZ.getRequestId(), ((C20623915n3) awS275S0300000_31.l0).LJIILIIL.LIZLLL(), ((C20623915n3) awS275S0300000_31.l0).LJIIJJI.LIZJ());
        List<DislikeHashTag> listLIZLLL = ((C20623915n3) awS275S0300000_31.l0).LJIILIIL.LIZLLL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
        Iterator<DislikeHashTag> it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().name);
        }
        C0NB4.LIZ(arrayList);
        ((TuxSheet) awS275S0300000_31.l1).dismiss();
        Function0 function0 = (Function0) awS275S0300000_31.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS275S0300000_31 awS275S0300000_31) {
        Map<String, String> map = C0NB4.LIZ;
        C0NB4.LIZIZ(((C20623915n3) awS275S0300000_31.l0).LIZIZ.getAid(), ((C20623915n3) awS275S0300000_31.l0).LIZIZ.getRequestId(), ((C20623915n3) awS275S0300000_31.l0).LJIILIIL.LIZLLL(), ((C20623915n3) awS275S0300000_31.l0).LJIIJJI.LIZJ());
        List<DislikeHashTag> listLIZLLL = ((C20623915n3) awS275S0300000_31.l0).LJIILIIL.LIZLLL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
        Iterator<DislikeHashTag> it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().name);
        }
        C0NB4.LIZ(arrayList);
        ((TuxSheet) awS275S0300000_31.l1).dismiss();
        Function0 function0 = (Function0) awS275S0300000_31.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LIZJ((EnhanceEntity) awS275S0300000_31.l0, "", (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS275S0300000_31 awS275S0300000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[getWidthScaleRegularV1] tag ");
        sbLIZ.append(((C20565515dd) awS275S0300000_31.l0).LIZ);
        sbLIZ.append(", results ");
        sbLIZ.append((List) awS275S0300000_31.l1);
        sbLIZ.append(", result ");
        sbLIZ.append(((C362440EIw) awS275S0300000_31.l2).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$41(AwS275S0300000_31 awS275S0300000_31) {
        UrlModel originCover;
        List<String> urlList;
        String str;
        Video video = ((Aweme) awS275S0300000_31.l0).getVideo();
        if (video != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && str.length() != 0) {
            ((C20517115Qb) awS275S0300000_31.l2).LIZLLL = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(str)).LIZ(), (C20517115Qb) awS275S0300000_31.l2);
            final C20517115Qb c20517115Qb = (C20517115Qb) awS275S0300000_31.l2;
            final InterfaceC20517715Qh interfaceC20517715Qh = (InterfaceC20517715Qh) awS275S0300000_31.l1;
            AbstractC447090Hg3 abstractC447090Hg3 = new AbstractC447090Hg3() { // from class: X.15Qg
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2;
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY3;
                    try {
                        interfaceC20517715Qh.onFail();
                        if (Intrinsics.LJFF(interfaceC1320200kSY, c20517115Qb.LIZLLL) && (interfaceC1320200kSY3 = c20517115Qb.LIZLLL) != null) {
                            interfaceC1320200kSY3.close();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (Intrinsics.LJFF(interfaceC1320200kSY, c20517115Qb.LIZLLL) && (interfaceC1320200kSY2 = c20517115Qb.LIZLLL) != null) {
                            interfaceC1320200kSY2.close();
                        }
                        throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v19, types: [T, android.graphics.Bitmap] */
                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    try {
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                                return;
                            }
                            return;
                        }
                        if (c20517115Qb.LIZIZ.get()) {
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2 = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY2 != null) {
                                interfaceC1320200kSY2.close();
                                return;
                            }
                            return;
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            C259800zU c259800zU = new C259800zU();
                            try {
                                Bitmap.Config config = bitmap.getConfig();
                                if (config != null) {
                                    c259800zU.element = bitmap.copy(config, true);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            T t = c259800zU.element;
                            if (t == 0) {
                                interfaceC20517715Qh.onFail();
                                InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY3 = c20517115Qb.LIZLLL;
                                if (interfaceC1320200kSY3 != null) {
                                    interfaceC1320200kSY3.close();
                                    return;
                                }
                                return;
                            }
                            Bitmap bitmap2 = (Bitmap) t;
                            if (bitmap2 != null) {
                                interfaceC20517715Qh.LIZLLL(bitmap2);
                            }
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY4 = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY4 != null) {
                                interfaceC1320200kSY4.close();
                                return;
                            }
                            return;
                        }
                        interfaceC20517715Qh.onFail();
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY5 = c20517115Qb.LIZLLL;
                        if (interfaceC1320200kSY5 != null) {
                            interfaceC1320200kSY5.close();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY6 = c20517115Qb.LIZLLL;
                        if (interfaceC1320200kSY6 != null) {
                            interfaceC1320200kSY6.close();
                        }
                        throw th2;
                    }
                }
            };
            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = ((C20517115Qb) awS275S0300000_31.l2).LIZLLL;
            if (interfaceC1320200kSY != null) {
                interfaceC1320200kSY.LIZJ(abstractC447090Hg3, C822700WPc.LL);
            }
        } else {
            ((InterfaceC20517715Qh) awS275S0300000_31.l1).onFail();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS275S0300000_31 awS275S0300000_31) {
        UrlModel originCover;
        List<String> urlList;
        String str;
        Video video = ((Aweme) awS275S0300000_31.l0).getVideo();
        if (video != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && str.length() != 0) {
            ((C20517115Qb) awS275S0300000_31.l1).LIZLLL = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(str)).LIZ(), (C20517115Qb) awS275S0300000_31.l1);
            final C20517115Qb c20517115Qb = (C20517115Qb) awS275S0300000_31.l1;
            final InterfaceC20517315Qd interfaceC20517315Qd = (InterfaceC20517315Qd) awS275S0300000_31.l2;
            AbstractC447090Hg3 abstractC447090Hg3 = new AbstractC447090Hg3() { // from class: X.15Qe
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2;
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY3;
                    try {
                        interfaceC20517315Qd.onFail();
                        if (Intrinsics.LJFF(interfaceC1320200kSY, c20517115Qb.LIZLLL) && (interfaceC1320200kSY3 = c20517115Qb.LIZLLL) != null) {
                            interfaceC1320200kSY3.close();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (Intrinsics.LJFF(interfaceC1320200kSY, c20517115Qb.LIZLLL) && (interfaceC1320200kSY2 = c20517115Qb.LIZLLL) != null) {
                            interfaceC1320200kSY2.close();
                        }
                        throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v22, types: [T, android.graphics.Bitmap] */
                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    try {
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            c20517115Qb.LIZIZ(interfaceC20517315Qd);
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                                return;
                            }
                            return;
                        }
                        if (c20517115Qb.LIZIZ.get()) {
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2 = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY2 != null) {
                                interfaceC1320200kSY2.close();
                                return;
                            }
                            return;
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            C259800zU c259800zU = new C259800zU();
                            try {
                                Bitmap.Config config = bitmap.getConfig();
                                if (config != null) {
                                    c259800zU.element = bitmap.copy(config, true);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            T t = c259800zU.element;
                            if (t == 0) {
                                c20517115Qb.LIZIZ(interfaceC20517315Qd);
                                InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY3 = c20517115Qb.LIZLLL;
                                if (interfaceC1320200kSY3 != null) {
                                    interfaceC1320200kSY3.close();
                                    return;
                                }
                                return;
                            }
                            C20517115Qb c20517115Qb2 = c20517115Qb;
                            InterfaceC20517315Qd interfaceC20517315Qd2 = interfaceC20517315Qd;
                            c20517115Qb2.getClass();
                            Integer numLIZ = C20517115Qb.LIZ((Bitmap) t);
                            if (numLIZ == null) {
                                c20517115Qb2.LIZIZ(interfaceC20517315Qd2);
                            } else {
                                C786410Ut5.LJJZZIII(c20517115Qb2.LIZJ, new ARunnableS35S0201000_31(numLIZ.intValue(), interfaceC20517315Qd2, c20517115Qb2, 7));
                            }
                            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY4 = c20517115Qb.LIZLLL;
                            if (interfaceC1320200kSY4 != null) {
                                interfaceC1320200kSY4.close();
                                return;
                            }
                            return;
                        }
                        c20517115Qb.LIZIZ(interfaceC20517315Qd);
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY5 = c20517115Qb.LIZLLL;
                        if (interfaceC1320200kSY5 != null) {
                            interfaceC1320200kSY5.close();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY6 = c20517115Qb.LIZLLL;
                        if (interfaceC1320200kSY6 != null) {
                            interfaceC1320200kSY6.close();
                        }
                        throw th2;
                    }
                }
            };
            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = ((C20517115Qb) awS275S0300000_31.l1).LIZLLL;
            if (interfaceC1320200kSY != null) {
                interfaceC1320200kSY.LIZJ(abstractC447090Hg3, C822700WPc.LL);
            }
        } else {
            ((C20517115Qb) awS275S0300000_31.l1).LIZIZ((InterfaceC20517315Qd) awS275S0300000_31.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS275S0300000_31 awS275S0300000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(((C20654015ru) awS275S0300000_31.l0).LIZ);
        sbLIZ.append(" -- StrategyCheck#");
        sbLIZ.append(((C20654215rw) awS275S0300000_31.l1).LIZ.LIZ());
        sbLIZ.append(" finish. ");
        sbLIZ.append((RuleHitState) awS275S0300000_31.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$44(AwS275S0300000_31 awS275S0300000_31) {
        List<Condition> list;
        Condition condition;
        final PlayCondition playConditionInvoke;
        boolean z = true;
        if (C20356914l5.LIZ[((AbstractC20356314kz) awS275S0300000_31.l0).LJJJIL().LJII.ordinal()] == 1) {
            C20357914lF c20357914lFLJJJIL = ((AbstractC20356314kz) awS275S0300000_31.l0).LJJJIL();
            EnumC20429514wn enumC20429514wn = EnumC20429514wn.RUNNING;
            c20357914lFLJJJIL.LJII = enumC20429514wn;
            if (((AbstractC20356314kz) awS275S0300000_31.l0).LJJJI().getCurrentState() != Lifecycle.State.RESUMED) {
                ((AbstractC20356314kz) awS275S0300000_31.l0).LJJJI().handleLifecycleEvent(Lifecycle.Event.ON_START);
                ((AbstractC20356314kz) awS275S0300000_31.l0).LJJJI().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
            ((AbstractC20356314kz) awS275S0300000_31.l0).LJJJIL().LJII = enumC20429514wn;
            Function0 function0 = (Function0) awS275S0300000_31.l1;
            if (function0 != null) {
                function0.invoke();
            }
            final AbstractC20356314kz abstractC20356314kz = (AbstractC20356314kz) awS275S0300000_31.l0;
            final C20361214lm c20361214lm = (C20361214lm) awS275S0300000_31.l2;
            abstractC20356314kz.getClass();
            String str = c20361214lm.LJII;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                abstractC20356314kz.LJJIJIIJI();
                C20441214yg.LJ("PlaybookDecoration", "runDecoration error, conditions is empty");
            } else {
                ConditionData conditionDataLIZ = C20356614l2.LIZ(str);
                if (conditionDataLIZ != null && (list = conditionDataLIZ.conditions) != null && (condition = (Condition) C13LP.LJJJLZIJ(0, list)) != null && condition.name != null) {
                    InterfaceC1631620sYq<? super Condition, ? super LifecycleOwner, ? super C20361214lm, ? extends PlayCondition> interfaceC1631620sYq = abstractC20356314kz.LLJJIII;
                    if (interfaceC1631620sYq != null && (playConditionInvoke = interfaceC1631620sYq.invoke(condition, abstractC20356314kz.LLJJJIL.getValue(), c20361214lm)) != null) {
                        if (PlayEntityUtilKt.LJIIJ(c20361214lm.LIZ)) {
                            abstractC20356314kz.LJJIJIIJI();
                            C20441214yg.LJ("PlaybookDecoration", "runDecoration error, mutex scene is running");
                        } else {
                            try {
                                playConditionInvoke.LJI(new InterfaceC946300ajU() { // from class: X.14l1
                                    @Override // X.InterfaceC946300ajU
                                    public final void LIZ(boolean z2, boolean z3) {
                                        if (z2) {
                                            playConditionInvoke.LJIIIIZZ();
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("condition met, name=");
                                            sbLIZ.append(c20361214lm.LIZ);
                                            C20441214yg.LJ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ));
                                            AbstractC20356314kz abstractC20356314kz2 = abstractC20356314kz;
                                            abstractC20356314kz2.getClass();
                                            C500260Jjc.LJJLIIIJILLIZJL(new AwS147S0110000_31(abstractC20356314kz2, z3, 3));
                                            return;
                                        }
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("condition not met, name=");
                                        sbLIZ2.append(c20361214lm.LIZ);
                                        C20441214yg.LJ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                });
                                playConditionInvoke.LIZLLL();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("observeBooleanExpr error ");
                                sbLIZ.append(th);
                                C20441214yg.LJ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    } else {
                        abstractC20356314kz.LJJIJIIJI();
                        C20441214yg.LJ("PlaybookDecoration", "runDecoration error, playCondition is null");
                    }
                } else {
                    abstractC20356314kz.LJJIJIIJI();
                    C20441214yg.LJ("PlaybookDecoration", "runDecoration error, conditionName is empty");
                }
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlayEntity_");
            sbLIZ2.append(((AbstractC20356314kz) awS275S0300000_31.l0).LJJJIL().LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("transitDecorationStateRunning error, origin: ");
            sbLIZ3.append(((AbstractC20356314kz) awS275S0300000_31.l0).LJJJIL().LJII);
            C20441214yg.LJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LIZJ((MusicEntity) awS275S0300000_31.l0, "", (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LIZJ((VoiceEffectsEntity) awS275S0300000_31.l0, "", (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LJ((StickerEffectEntity) awS275S0300000_31.l0, 2, (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((Function0) awS275S0300000_31.l2).invoke());
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LJII((AIWallpaperEntity) awS275S0300000_31.l0, 1, (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) awS275S0300000_31.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS275S0300000_31 awS275S0300000_31) {
        PlayEntityUtilKt.LIZJ((AIWallpaperEntity) awS275S0300000_31.l0, "", (C20361214lm) awS275S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS275S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final void invoke$lambda$0$0(C15MM c15mm, Exception exc) {
        c15mm.LIZ(new C13XZ(exc.getMessage()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(AbstractC20356314kz abstractC20356314kz, AwS432S0200000_31 awS432S0200000_31, C20361214lm c20361214lm, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20356314kz;
        this.l1 = awS432S0200000_31;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(C157Y c157y, C157Y c157y2, C259800zU<IPitayaCore> c259800zU, IFeatureCore iFeatureCore) {
        super(0);
        this.$t = iFeatureCore;
        this.l0 = c157y;
        this.l1 = c157y2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20526015Tm c20526015Tm, ViewGroup viewGroup, ExploreFeedComponent exploreFeedComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20526015Tm;
        this.l1 = viewGroup;
        this.l2 = exploreFeedComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20526015Tm c20526015Tm, ViewGroup viewGroup, ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20526015Tm;
        this.l1 = viewGroup;
        this.l2 = exploreTopicGeneralFeedListComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20526015Tm c20526015Tm, ExploreFeedComponent exploreFeedComponent, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20526015Tm;
        this.l1 = exploreFeedComponent;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20526015Tm c20526015Tm, ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20526015Tm;
        this.l1 = exploreTopicGeneralFeedListComponent;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(C20565515dd c20565515dd, C20565515dd c20565515dd2, List<Double> list, C362440EIw c362440EIw) {
        super(0);
        this.$t = c362440EIw;
        this.l0 = c20565515dd;
        this.l1 = c20565515dd2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(InterfaceC20619215mI interfaceC20619215mI, TuxSheet tuxSheet, EditShareSelectFragment editShareSelectFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC20619215mI;
        this.l1 = tuxSheet;
        this.l2 = editShareSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20623915n3 c20623915n3, TuxSheet tuxSheet, AwS555S0100000_11 awS555S0100000_11, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20623915n3;
        this.l1 = tuxSheet;
        this.l2 = awS555S0100000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C20654015ru c20654015ru, C20654215rw c20654215rw, RuleHitState ruleHitState, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20654015ru;
        this.l1 = c20654215rw;
        this.l2 = ruleHitState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(C207235167l c207235167l, DownloadInfo downloadInfo, BaseException baseException, int i) {
        super(0);
        this.$t = i;
        this.l0 = c207235167l;
        this.l1 = downloadInfo;
        this.l2 = baseException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(C16CD c16cd, C16CD c16cd2, C21341918fZ c21341918fZ, List<TikTokMediaModel> list) {
        super(0);
        this.$t = list;
        this.l0 = c16cd;
        this.l1 = c16cd2;
        this.l2 = c21341918fZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(Context context, PushSettings pushSettings, DisplayAndCaptionVM displayAndCaptionVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = pushSettings;
        this.l2 = displayAndCaptionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(View view, C20590015ha c20590015ha, C20590915hj c20590915hj, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c20590015ha;
        this.l2 = c20590915hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(FrameLayout frameLayout, C19EG c19eg, CommonHorizontalContainerAssem commonHorizontalContainerAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = frameLayout;
        this.l2 = commonHorizontalContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(EnhanceEntity enhanceEntity, EnhanceEntity enhanceEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = enhanceEntity;
        this.l1 = enhanceEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(MusicEntity musicEntity, MusicEntity musicEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = musicEntity;
        this.l1 = musicEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(StickerEffectEntity stickerEffectEntity, StickerEffectEntity stickerEffectEntity2, C20361214lm c20361214lm, Function0<? extends InterfaceC20354714kj> function0) {
        super(0);
        this.$t = function0;
        this.l0 = stickerEffectEntity;
        this.l1 = stickerEffectEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(VoiceEffectsEntity voiceEffectsEntity, VoiceEffectsEntity voiceEffectsEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = voiceEffectsEntity;
        this.l1 = voiceEffectsEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(AIWallpaperEntity aIWallpaperEntity, AIWallpaperEntity aIWallpaperEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = aIWallpaperEntity;
        this.l1 = aIWallpaperEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(AIWallpaperEntity aIWallpaperEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = aIWallpaperEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(ManageGuestEntity manageGuestEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = manageGuestEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(DrawGuessEntity drawGuessEntity, DrawGuessEntity drawGuessEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = drawGuessEntity;
        this.l1 = drawGuessEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(PollAndGiftVoteEntity pollAndGiftVoteEntity, PollAndGiftVoteEntity pollAndGiftVoteEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = pollAndGiftVoteEntity;
        this.l1 = pollAndGiftVoteEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(LiveSubMediaModel liveSubMediaModel, IHostSubscription.Result.PhotoFile photoFile, InterfaceC207228167e interfaceC207228167e, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveSubMediaModel;
        this.l1 = photoFile;
        this.l2 = interfaceC207228167e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(NextLiveData nextLiveData, NextLiveData<C20590315hd> nextLiveData2, C20590915hj c20590915hj, View view) {
        super(0);
        this.$t = view;
        this.l0 = nextLiveData;
        this.l1 = nextLiveData2;
        this.l2 = c20590915hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(IAwemeService iAwemeService, ExploreAwemeList exploreAwemeList, ExploreFeedListViewModel exploreFeedListViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = exploreFeedListViewModel;
        this.l1 = exploreAwemeList;
        this.l2 = iAwemeService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(CommerceToolsMusicService commerceToolsMusicService, AVMusic aVMusic, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = commerceToolsMusicService;
        this.l1 = aVMusic;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(Aweme aweme, C20517115Qb c20517115Qb, C20517915Qj c20517915Qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c20517115Qb;
        this.l2 = c20517915Qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(Aweme aweme, C20518015Qk c20518015Qk, C20517115Qb c20517115Qb, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c20518015Qk;
        this.l2 = c20517115Qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(LiveMultiTabRootScene liveMultiTabRootScene, Integer num, C150Z c150z, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveMultiTabRootScene;
        this.l1 = num;
        this.l2 = c150z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(AsyncAVService asyncAVService, C634930OvL c634930OvL, RecordConfig.Builder builder, int i) {
        super(0);
        this.$t = i;
        this.l0 = asyncAVService;
        this.l1 = c634930OvL;
        this.l2 = builder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, NetworkStandardUIServiceImpl networkStandardUIServiceImpl2, C1749280vcc c1749280vcc, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l2 = networkStandardUIServiceImpl;
        this.l1 = networkStandardUIServiceImpl2;
        this.l0 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(MusicModel musicModel, MusicModel musicModel2, VerticalMusicViewV2 verticalMusicViewV2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = musicModel;
        this.l1 = musicModel2;
        this.l2 = verticalMusicViewV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(VerticalMusicViewV2 verticalMusicViewV2, InterfaceC1459100o4a interfaceC1459100o4a, MusicModel musicModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = verticalMusicViewV2;
        this.l1 = interfaceC1459100o4a;
        this.l2 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(Exception exc, Exception exc2, Executor executor, C15MM<Void, C13XS> c15mm) {
        super(0);
        this.$t = c15mm;
        this.l1 = exc;
        this.l2 = exc2;
        this.l0 = executor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(List list, BasePlaybookEditorViewModel basePlaybookEditorViewModel, C20380414os c20380414os, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = basePlaybookEditorViewModel;
        this.l2 = c20380414os;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(List list, BasePlaybookEditorViewModel basePlaybookEditorViewModel, C20380514ot c20380514ot, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = basePlaybookEditorViewModel;
        this.l2 = c20380514ot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS275S0300000_31(Executor executor, Executor executor2, C15MM<R1, E1> c15mm, E1 e1) {
        super(0);
        this.$t = e1;
        this.l2 = executor;
        this.l0 = executor2;
        this.l1 = c15mm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0300000_31(AtomicBoolean atomicBoolean, C163E c163e, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = atomicBoolean;
        this.l1 = c163e;
        this.l2 = aweme;
    }
}
