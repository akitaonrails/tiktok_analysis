package kotlin.jvm.internal;

import X.AbstractC926030aCn;
import X.C013C;
import X.C01ZA;
import X.C05P0;
import X.C09AY;
import X.C1102690enj;
import X.C1109770ez9;
import X.C1112330f3H;
import X.C1161920gLG;
import X.C118300cf;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C154500iV;
import X.C1555540qa8;
import X.C158B;
import X.C1819620xS4;
import X.C19ME;
import X.C1ACJ;
import X.C20361214lm;
import X.C20441214yg;
import X.C2188811AlT;
import X.C410901il;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C914240Ztm;
import X.C914830Zuj;
import X.C915980Zwa;
import X.C916180Zwu;
import X.C916490ZxP;
import X.C917910Zzh;
import X.C918230a0D;
import X.C918350a0P;
import X.C918410a0V;
import X.C918650a0t;
import X.C920060a3A;
import X.C920170a3L;
import X.C922570a7D;
import X.C923330a8R;
import X.C925150aBN;
import X.C926050aCp;
import X.C926060aCq;
import X.C926190aD3;
import X.C928340aGW;
import X.C928360aGY;
import X.C928400aGc;
import X.C928450aGh;
import X.C930540aK4;
import X.C933770aPH;
import X.C933980aPc;
import X.C934320aQA;
import X.C934350aQD;
import X.C936720aU2;
import X.C937300aUy;
import X.C937750aVh;
import X.C939550aYb;
import X.C940400aZy;
import X.C940450aa3;
import X.C940460aa4;
import X.C940470aa5;
import X.C940490aa7;
import X.C940890aal;
import X.C943860afY;
import X.C944450agV;
import X.C945320ahu;
import X.C949560aok;
import X.C949600aoo;
import X.C950220apo;
import X.C950340aq0;
import X.C950490aqF;
import X.C950840aqo;
import X.C953600avG;
import X.C953610avH;
import X.C954460awe;
import X.C955410ayB;
import X.C955540ayO;
import X.C955590ayT;
import X.C955850ayt;
import X.C956790b0P;
import X.C958270b2n;
import X.C958280b2o;
import X.C958360b2w;
import X.C959530b4p;
import X.C959620b4y;
import X.C960260b60;
import X.C961300b7g;
import X.C969340bKe;
import X.C971360bNu;
import X.C974060bSG;
import X.C974100bSK;
import X.C974990bTl;
import X.C987300bnc;
import X.EnumC1102740eno;
import X.EnumC918860a1E;
import X.EnumC919170a1j;
import X.EnumC928480aGk;
import X.EnumC930180aJU;
import X.EnumC950120ape;
import X.EnumC950200apm;
import X.EnumC955790ayn;
import X.EnumC958900b3o;
import X.EnumC959580b4u;
import X.EnumC959750b5B;
import X.InterfaceC20354714kj;
import X.InterfaceC665370Q7z;
import X.InterfaceC914930Zut;
import X.InterfaceC916700Zxk;
import X.InterfaceC918290a0J;
import X.InterfaceC920110a3F;
import X.InterfaceC934580aQa;
import X.InterfaceC937900aVw;
import X.InterfaceC940230aZh;
import X.InterfaceC940380aZw;
import X.InterfaceC954180awC;
import X.InterfaceC955990az7;
import X.InterfaceC956060azE;
import X.InterfaceC956210azT;
import X.InterfaceC957070b0r;
import X.InterfaceC958410b31;
import X.InterfaceC959610b4x;
import X.InterfaceC960070b5h;
import X.InterfaceC971000bNK;
import X.InterfaceC974170bSR;
import X.InterfaceViewOnClickListenerC1102800enu;
import Y.ACListenerS150S0100000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownForAllEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.ExpandEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GiftSettingEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LayoutSettingEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LiveShowEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer.MultiCoHostBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandlerV2;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestSuspendJoinedEvent;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.LinkAudienceTurnOnGuideEvent;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAllowInviteWithApplySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS259S0300000_15 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS259S0300000_15 awS259S0300000_15) {
        C928340aGW.LLILZIL = Long.valueOf(((C928360aGY) awS259S0300000_15.l0).LIZ);
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            C928340aGW.LIZJ(((View) awS259S0300000_15.l1).getContext(), EnumC928480aGk.BUBBLE_ABOVE_MULTI);
        } else {
            ((DataChannel) awS259S0300000_15.l2).FQ2(MultiGuestSuspendJoinedEvent.class);
            C928340aGW.LLILZ = new Pair<>("liveHome", "inviteBubble");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS259S0300000_15 awS259S0300000_15) {
        C928400aGc.LLJIJIL = Long.valueOf(((C928450aGh) awS259S0300000_15.l0).LIZ);
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            C928400aGc.LJ(((View) awS259S0300000_15.l1).getContext(), EnumC928480aGk.BUBBLE_ABOVE_MULTI);
        } else {
            ((DataChannel) awS259S0300000_15.l2).LC0(LinkAudienceTurnOnGuideEvent.class, "tool_tip_bubble");
            C928400aGc.LLJI = new Pair<>("liveHome", "multiguestBubble");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((ExpandEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((GiftSettingEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((GuestShowdownEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((LayoutSettingEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((LiveShowEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((NoticeboardEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((SharedBackgroundEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS259S0300000_15 awS259S0300000_15) {
        C782110Um9 c782110Um9 = new C782110Um9((Context) awS259S0300000_15.l0);
        c782110Um9.LJIIZILJ(2131854989);
        c782110Um9.LJII(2131854988);
        c782110Um9.LJIILIIL(2131854987, new AcS496S0100000_15((Function0) awS259S0300000_15.l1, 27));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIJ(2131854971, new AcS496S0100000_15((Function0) awS259S0300000_15.l2, 28));
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS259S0300000_15 awS259S0300000_15) {
        if (((TextHeaderListFragment) awS259S0300000_15.l0).LLILZIL) {
            Pair pairLJI = C500260Jjc.LJI((C410901il) awS259S0300000_15.l1, new C5183020f((C01ZA) awS259S0300000_15.l2, 75));
            TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) awS259S0300000_15.l0;
            int iIntValue = ((Number) pairLJI.getSecond()).intValue();
            if (iIntValue >= 0) {
                textHeaderListFragment.LLILZIL = false;
                RecyclerView recyclerView = textHeaderListFragment.LLILZLL;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(iIntValue);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS259S0300000_15 r6) {
        /*
            int r0 = X.C960860b6y.LIZ
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            int r2 = X.C960860b6y.LIZ(r0)
            int r0 = X.C960860b6y.LIZ
            if (r2 >= r0) goto L7a
            java.lang.String r0 = "INVITEE_APPLIED_MULTI_CO_HOST_FRAGMENT"
            boolean r0 = X.C943660afE.LIZLLL(r0)
            r4 = 0
            if (r0 != 0) goto L7a
            X.0b7g r0 = X.C961300b7g.LIZ
            r0.getClass()
            java.lang.String r0 = "cohost_be_invited_panel"
            boolean r0 = X.C961300b7g.LJIIIIZZ(r0)
            if (r0 != 0) goto L7a
            X.0b7g r0 = X.C961300b7g.LIZ
            r0.getClass()
            X.C961300b7g.LIZLLL()
            java.lang.Object r1 = r6.l0
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            int r0 = r2 + 1
            X.14i1<java.util.Map<java.lang.Long, java.lang.Integer>> r5 = X.InterfaceC1106030et7.J8
            java.lang.Object r3 = r5.LIZIZ()
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L41
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L41:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            long r0 = r1.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r2)
            r5.LJFF(r3)
            java.lang.Object r1 = r6.l1
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = (com.bytedance.ies.sdk.datachannel.DataChannel) r1
            java.lang.Class<X.0TZe> r0 = X.C748880TZe.class
            java.lang.Object r3 = r1.gg0(r0)
            androidx.fragment.app.FragmentManager r3 = (androidx.fragment.app.FragmentManager) r3
            if (r3 == 0) goto L77
            java.lang.Object r1 = r6.l2
            X.0agV r1 = (X.C944450agV) r1
            java.lang.String r0 = com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptFragment._pnsPageId
            X.0b6z r0 = new X.0b6z
            r0.<init>(r1)
            com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptFragment r2 = new com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptFragment
            r2.<init>(r0)
            java.lang.String r1 = "cohost_follow_prompt_dialog"
            r0 = 0
            X.C19322110iZ.LJFF(r3, r2, r1, r0, r4)
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7a:
            java.lang.String r1 = "FollowPrompt"
            java.lang.String r0 = "invalid trigger"
            X.C20441214yg.LJIIIZ(r1, r0)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.invoke$19(kotlin.jvm.internal.AwS259S0300000_15):java.lang.Object");
    }

    public static final Object invoke$2(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut2;
        C959620b4y c959620b4y = ((C959530b4p) awS259S0300000_15.l0).LJII;
        if (c959620b4y != null) {
            EnumC959750b5B enumC959750b5B = (EnumC959750b5B) awS259S0300000_15.l1;
            C950840aqo c950840aqo = (C950840aqo) awS259S0300000_15.l2;
            if (!LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                C20441214yg.LIZIZ("QuickCoHostEngine", "team pair is not enabled. won't start quick co-host for team pair");
                if (c950840aqo != null && (interfaceC914930Zut2 = c950840aqo.LIZIZ) != null) {
                    interfaceC914930Zut2.LIZ(1, "team pair is not enabled", null);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startQuickCoHostForTeamPair");
                sbLIZ.append(" current status = ");
                sbLIZ.append(c959620b4y.Y2());
                sbLIZ.append(". entranceType=");
                sbLIZ.append(enumC959750b5B);
                C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
                if (c959620b4y.Y2() != EnumC958900b3o.NONE) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startQuickCoHostForTeamPair");
                    sbLIZ2.append(" return by current status = ");
                    sbLIZ2.append(c959620b4y.Y2());
                    C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c950840aqo != null && (interfaceC914930Zut = c950840aqo.LIZIZ) != null) {
                        interfaceC914930Zut.LIZ(1, "quick co-host is running", null);
                    }
                } else {
                    InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = c959620b4y.LJII;
                    if (interfaceC959610b4x != null) {
                        interfaceC959610b4x.LJJ(enumC959750b5B, c950840aqo);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS259S0300000_15 awS259S0300000_15) {
        MultiCoHostBeInvitedDialog multiCoHostBeInvitedDialog = (MultiCoHostBeInvitedDialog) awS259S0300000_15.l0;
        C943860afY c943860afY = (C943860afY) awS259S0300000_15.l1;
        c943860afY.LIZ = (DataChannel) awS259S0300000_15.l2;
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = new MultiCoHostBeInvitedFragment();
        LinkerInviteContent linkerInviteContent = c943860afY.LIZIZ;
        if (linkerInviteContent == null) {
            linkerInviteContent = new LinkerInviteContent();
        }
        multiCoHostBeInvitedFragment.LLLFF = linkerInviteContent;
        multiCoHostBeInvitedFragment.LLLFFI = c943860afY.LIZJ;
        multiCoHostBeInvitedFragment.LLLFZ = c943860afY.LIZ;
        multiCoHostBeInvitedFragment.LLLI = c943860afY.LIZLLL;
        multiCoHostBeInvitedFragment.LLILLL = new C950490aqF(multiCoHostBeInvitedFragment, c943860afY);
        multiCoHostBeInvitedFragment.LLILLJJLI = multiCoHostBeInvitedDialog;
        return multiCoHostBeInvitedFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[PHI: r7
      0x0046: PHI (r7v1 long) = (r7v0 long), (r7v4 long) binds: [B:21:0x0043, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS259S0300000_15 r14) {
        /*
            java.lang.Object r4 = r14.l0
            com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl r4 = (com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl) r4
            java.lang.Object r3 = r14.l1
            X.0awC r3 = (X.InterfaceC954180awC) r3
            java.lang.Object r14 = r14.l2
            com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage r14 = (com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage) r14
            r4.getClass()
            if (r14 == 0) goto L3e
            if (r3 == 0) goto L3e
            tikcast.linkmic.common.GroupPlayer r1 = r14.operator
            if (r1 == 0) goto L41
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L41
            long r7 = r0.uid
        L1d:
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L46
            long r9 = r0.roomId
        L23:
            long r11 = r1.channelId
        L25:
            r6 = 0
            r0 = 0
            com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent r13 = X.C001X.LIZ(r0)
            X.0awx r5 = new X.0awx
            r5.<init>(r6, r7, r9, r11, r13, r14)
            X.0TJp r2 = r4.LLJ
            if (r2 == 0) goto L3b
            long r0 = X.C950220apo.LJFF()
            r2.LJ(r0)
        L3b:
            r4.LLLZ(r3, r5)
        L3e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            r7 = 0
            if (r1 == 0) goto L46
            goto L1d
        L46:
            r9 = 0
            if (r1 != 0) goto L23
            r11 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.invoke$21(kotlin.jvm.internal.AwS259S0300000_15):java.lang.Object");
    }

    public static final Object invoke$22(AwS259S0300000_15 awS259S0300000_15) {
        if (((InterfaceC957070b0r) ((MultiHostCrossAdapterImpl) awS259S0300000_15.l0).LLLI.getValue()).LIZ((InviteGroupMessage) awS259S0300000_15.l1)) {
            C961300b7g.LIZ.getClass();
            C961300b7g.LJ();
        } else {
            ((MultiHostCrossAdapterImpl) awS259S0300000_15.l0).LLLLZLLLI((InterfaceC954180awC) awS259S0300000_15.l2, (InviteGroupMessage) awS259S0300000_15.l1, null, "");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS259S0300000_15 awS259S0300000_15) {
        ((MultiHostCrossAdapterImpl) awS259S0300000_15.l0).LLLLZLL((InterfaceC954180awC) awS259S0300000_15.l1, (ApplyGroupMessage) awS259S0300000_15.l2, null, "");
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[PHI: r5
      0x0042: PHI (r5v1 long) = (r5v0 long), (r5v4 long) binds: [B:21:0x003f, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AwS259S0300000_15 r12) {
        /*
            java.lang.Object r2 = r12.l0
            com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl r2 = (com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl) r2
            java.lang.Object r1 = r12.l1
            X.0awC r1 = (X.InterfaceC954180awC) r1
            java.lang.Object r12 = r12.l2
            com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage r12 = (com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage) r12
            r2.getClass()
            if (r12 == 0) goto L3a
            if (r1 == 0) goto L3a
            tikcast.linkmic.common.GroupPlayer r3 = r12.operator
            if (r3 == 0) goto L3d
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r3.user
            if (r0 == 0) goto L3d
            long r5 = r0.uid
        L1d:
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r3.user
            if (r0 == 0) goto L42
            long r7 = r0.roomId
        L23:
            long r9 = r3.channelId
        L25:
            r4 = 1
            r0 = 0
            com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent r11 = X.C001X.LIZ(r0)
            X.0awx r3 = new X.0awx
            r3.<init>(r4, r5, r7, r9, r11, r12)
            X.0TJp r0 = r2.LLJ
            if (r0 == 0) goto L37
            r0.LJ(r5)
        L37:
            r2.LLLZ(r1, r3)
        L3a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3d:
            r5 = 0
            if (r3 == 0) goto L42
            goto L1d
        L42:
            r7 = 0
            if (r3 != 0) goto L23
            r9 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.invoke$24(kotlin.jvm.internal.AwS259S0300000_15):java.lang.Object");
    }

    public static final Object invoke$25(AwS259S0300000_15 awS259S0300000_15) {
        MultiGuestEnterIntentHandlerV2 multiGuestEnterIntentHandlerV2 = (MultiGuestEnterIntentHandlerV2) awS259S0300000_15.l0;
        AbstractC926030aCn abstractC926030aCn = ((C926060aCq) awS259S0300000_15.l1).LIZ;
        C926050aCp c926050aCp = (C926050aCp) awS259S0300000_15.l2;
        multiGuestEnterIntentHandlerV2.getClass();
        if (abstractC926030aCn != C926190aD3.LIZLLL) {
            abstractC926030aCn.LIZJ = c926050aCp;
        }
        multiGuestEnterIntentHandlerV2.LJI.LIZ(abstractC926030aCn);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS259S0300000_15 awS259S0300000_15) {
        if (((C013C) awS259S0300000_15.l0).element) {
            ((Function0) awS259S0300000_15.l1).invoke();
        } else {
            ((Function0) awS259S0300000_15.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS259S0300000_15 awS259S0300000_15) {
        C20441214yg.LJIIIZ("CompetitionAnchorLauncher", "handleCatchBeanCapsuleGuide checkMatchPermission success ");
        C974060bSG c974060bSG = (C974060bSG) awS259S0300000_15.l0;
        InterfaceC974170bSR interfaceC974170bSR = c974060bSG.LIZ;
        if (interfaceC974170bSR != null) {
            interfaceC974170bSR.LIZIZ(new C974100bSK(c974060bSG, (List) awS259S0300000_15.l1, EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, (MultiMatchPrepareResponse) awS259S0300000_15.l2, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS259S0300000_15 awS259S0300000_15) {
        C974060bSG c974060bSG = (C974060bSG) awS259S0300000_15.l0;
        InterfaceC974170bSR interfaceC974170bSR = c974060bSG.LIZ;
        if (interfaceC974170bSR != null) {
            interfaceC974170bSR.LIZIZ(new C974100bSK(c974060bSG, (List) awS259S0300000_15.l1, EnumC919170a1j.MATCH_TYPE_1V1, (MultiMatchPrepareResponse) awS259S0300000_15.l2, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS259S0300000_15 awS259S0300000_15) {
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        ((Function0) awS259S0300000_15.l1).invoke();
        ((C974990bTl) awS259S0300000_15.l2).LIZJ(false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        C959620b4y c959620b4y = ((C959530b4p) awS259S0300000_15.l0).LJII;
        if (c959620b4y != null) {
            EnumC959750b5B enumC959750b5B = (EnumC959750b5B) awS259S0300000_15.l1;
            C950840aqo c950840aqo = (C950840aqo) awS259S0300000_15.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startQuickCoHostForQuickBattle");
            sbLIZ.append(" current status = ");
            sbLIZ.append(c959620b4y.Y2());
            sbLIZ.append(". entranceType=");
            sbLIZ.append(enumC959750b5B);
            C20441214yg.LJIIIZ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ));
            if (c959620b4y.Y2() != EnumC958900b3o.NONE) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startQuickCoHostForQuickBattle");
                sbLIZ2.append(" return by current status = ");
                sbLIZ2.append(c959620b4y.Y2());
                C20441214yg.LJ("QuickCoHostEngine", C2188811AlT.LIZIZ(sbLIZ2));
                if (c950840aqo != null && (interfaceC914930Zut = c950840aqo.LIZIZ) != null) {
                    interfaceC914930Zut.LIZ(1, "quick co-host is running", null);
                }
            } else {
                InterfaceC959610b4x<? extends InterfaceC960070b5h> interfaceC959610b4x = c959620b4y.LJII;
                if (interfaceC959610b4x != null) {
                    interfaceC959610b4x.LJIIL(enumC959750b5B, c950840aqo);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS259S0300000_15 awS259S0300000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS259S0300000_15.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AwS224S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) awS259S0300000_15.l1, (DataChannel) awS259S0300000_15.l2, 35));
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS259S0300000_15 awS259S0300000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS259S0300000_15.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AwS224S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) awS259S0300000_15.l1, (DataChannel) awS259S0300000_15.l2, 36));
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS259S0300000_15 awS259S0300000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS259S0300000_15.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AwS224S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) awS259S0300000_15.l1, (DataChannel) awS259S0300000_15.l2, 37));
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS259S0300000_15 awS259S0300000_15) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS259S0300000_15.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AwS224S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) awS259S0300000_15.l1, (DataChannel) awS259S0300000_15.l2, 38));
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS259S0300000_15 awS259S0300000_15) {
        C949560aok.LJFF((C949560aok) awS259S0300000_15.l0, (C1109770ez9) awS259S0300000_15.l1, (C1112330f3H) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS259S0300000_15 awS259S0300000_15) {
        DataChannel dataChannel = ((C1109770ez9) awS259S0300000_15.l0).LJIIIZ;
        if (dataChannel != null) {
            C949560aok c949560aok = (C949560aok) awS259S0300000_15.l1;
            C1112330f3H c1112330f3H = (C1112330f3H) awS259S0300000_15.l2;
            c949560aok.getClass();
            dataChannel.LC0(OpenCoHostEvent.class, C949560aok.LIZLLL(c1112330f3H));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS259S0300000_15 awS259S0300000_15) {
        C949560aok.LIZJ((C949560aok) awS259S0300000_15.l1, (C1112330f3H) awS259S0300000_15.l0, (CapsuleBizParamsCohost) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS259S0300000_15 awS259S0300000_15) {
        C949560aok.LIZJ((C949560aok) awS259S0300000_15.l1, (C1112330f3H) awS259S0300000_15.l0, (CapsuleBizParamsCohost) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS259S0300000_15 awS259S0300000_15) {
        Object objGg0;
        boolean z;
        C954460awe c954460aweLLILL;
        EnumC950200apm enumC950200apm;
        C949560aok c949560aok = (C949560aok) awS259S0300000_15.l0;
        CapsuleBizParamsCohost capsuleBizParamsCohost = (CapsuleBizParamsCohost) awS259S0300000_15.l1;
        C1112330f3H c1112330f3H = (C1112330f3H) awS259S0300000_15.l2;
        c949560aok.getClass();
        C1109770ez9 c1109770ez9LLIIIILZ = c1112330f3H.LLIIIILZ();
        DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(MultiCoHostStateChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC950120ape.Applied || ((c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF())) != null && (enumC950200apm = c954460aweLLILL.LJJIIZ) != null && enumC950200apm.isApplying())) {
            z = true;
        } else {
            z = false;
        }
        if (!LiveCoHostAllowInviteWithApplySetting.INSTANCE.enable() && z) {
            C955850ayt.LIZ(c1109770ez9LLIIIILZ.LIZ, EnumC955790ayn.APPLY_INVITE, new AwS259S0300000_15(c949560aok, c1112330f3H, capsuleBizParamsCohost, 39), AFwS203S0000000_15.get$arr$(271));
        } else {
            C955540ayO c955540ayOLJ = C949560aok.LJ(c1112330f3H);
            List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
            ArrayList arrayList = new ArrayList();
            for (C954460awe c954460awe : listLJIJJ) {
                C954460awe c954460awe2 = c954460awe;
                EnumC950200apm enumC950200apm2 = c954460awe2.LJJIIZ;
                if (enumC950200apm2 == EnumC950200apm.INVITING || enumC950200apm2 == EnumC950200apm.INVITED) {
                    if (c954460awe2.LJIIJJI()) {
                        arrayList.add(c954460awe);
                    }
                }
            }
            int size = arrayList.size();
            int size2 = C915980Zwa.LJII().LJIJJ().size();
            if (size >= C950220apo.LJIIJ(c955540ayOLJ)) {
                C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755813, C950220apo.LJIIJ(c955540ayOLJ), Integer.valueOf(C950220apo.LJIIJ(c955540ayOLJ))));
            } else if (C950220apo.LJIJ(size2, 0)) {
                if (size <= 0 && !C915980Zwa.LJIIIZ().Jf()) {
                    C766270U4b.LIZLLL(2131841237);
                } else {
                    C766270U4b.LIZLLL(2131841238);
                }
            } else {
                c949560aok.LJIIL(capsuleBizParamsCohost, c1112330f3H);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS259S0300000_15 awS259S0300000_15) {
        C915980Zwa.LJII().LJJLIIIIJ(true);
        ((C949560aok) awS259S0300000_15.l0).LJIIL((CapsuleBizParamsCohost) awS259S0300000_15.l1, (C1112330f3H) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS259S0300000_15 awS259S0300000_15) {
        ((C958280b2o) awS259S0300000_15.l0).LIZIZ((C958360b2w) awS259S0300000_15.l1, (Room) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS259S0300000_15 awS259S0300000_15) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS259S0300000_15.l0;
        enlargeScreenManageParams.scene = 8;
        ((C920170a3L) awS259S0300000_15.l1).LJIILL((InterfaceC920110a3F) awS259S0300000_15.l2, enlargeScreenManageParams);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS259S0300000_15 awS259S0300000_15) {
        ((C949600aoo) awS259S0300000_15.l0).LIZIZ((C1109770ez9) awS259S0300000_15.l1, (C154500iV) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS259S0300000_15 awS259S0300000_15) {
        C955410ayB.LJI(C915980Zwa.LJIIIZ().LIZLLL(), "popup", "switch_random_to_invite");
        C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.WITHDRAW_QUICK_CO_HOST_TO_INVITE, null);
        InterfaceC956060azE interfaceC956060azET5 = ((InterfaceC955990az7) awS259S0300000_15.l0).t5();
        if (interfaceC956060azET5 != null) {
            interfaceC956060azET5.ce((C955590ayT) awS259S0300000_15.l1, (C955540ayO) awS259S0300000_15.l2, true, C158B.LIZ(), null);
        }
        ((C955590ayT) awS259S0300000_15.l1).LJIIJJI = false;
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC956210azT interfaceC956210azTG4;
        ((C955590ayT) awS259S0300000_15.l0).LJIIJJI = false;
        InterfaceC955990az7 interfaceC955990az7 = (InterfaceC955990az7) awS259S0300000_15.l1;
        if (interfaceC955990az7 != null && (interfaceC956210azTG4 = interfaceC955990az7.g4()) != null) {
            interfaceC956210azTG4.GP((C955590ayT) awS259S0300000_15.l0, (C955540ayO) awS259S0300000_15.l2, true, C158B.LIZ());
        }
        if (C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.WAITED) {
            C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.WITHDRAW_QUICK_CO_HOST_AND_INVITE, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC956060azE interfaceC956060azET5 = ((InterfaceC955990az7) awS259S0300000_15.l0).t5();
        if (interfaceC956060azET5 != null) {
            interfaceC956060azET5.ce((C955590ayT) awS259S0300000_15.l1, (C955540ayO) awS259S0300000_15.l2, true, C158B.LIZ(), null);
        }
        ((C955590ayT) awS259S0300000_15.l1).LJIIJJI = false;
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS259S0300000_15 awS259S0300000_15) {
        Function1 function1 = (Function1) awS259S0300000_15.l0;
        C920060a3A c920060a3A = (C920060a3A) awS259S0300000_15.l1;
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS259S0300000_15.l2;
        c920060a3A.getClass();
        function1.invoke(C920060a3A.LJJIIZI(enlargeScreenManageParams));
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS259S0300000_15 awS259S0300000_15) {
        C918410a0V c918410a0V;
        C918350a0P c918350a0P = (C918350a0P) awS259S0300000_15.l0;
        InterfaceC918290a0J interfaceC918290a0J = c918350a0P.LIZIZ;
        if ((interfaceC918290a0J instanceof C918410a0V) && (c918410a0V = (C918410a0V) interfaceC918290a0J) != null) {
            C918410a0V c918410a0V2 = new C918410a0V(c918410a0V.LIZ, c918410a0V.LIZIZ, c918410a0V.LIZJ, c918410a0V.LIZLLL, c918410a0V.LJ, c918410a0V.LJFF, true, c918410a0V.LJII, c918410a0V.LJIIIIZZ, c918410a0V.LJIIIZ, c918410a0V.LJIIJ, (Function1<? super Boolean, Unit>) c918410a0V.LJIIJJI, (Function1<? super Long, Unit>) c918410a0V.LJIIL, (Function2<? super Long, ? super Throwable, Unit>) c918410a0V.LJIILIIL);
            C918350a0P c918350a0PLIZ = C918350a0P.LIZ(c918350a0P, c918410a0V2, null, null, 13);
            if (((C918230a0D) awS259S0300000_15.l1).LIZIZ == EnumC918860a1E.LEGACY) {
                ((C918650a0t) awS259S0300000_15.l2).LJIIJ(c918350a0PLIZ, c918410a0V2);
            } else {
                ((C918650a0t) awS259S0300000_15.l2).LJIIIZ(c918350a0PLIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS259S0300000_15 awS259S0300000_15) {
        int i;
        Long lValueOf;
        if (LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable()) {
            ((C940470aa5) awS259S0300000_15.l0).LLJJI = C969340bKe.LJFF((C945320ahu) awS259S0300000_15.l1);
            C940490aa7 c940490aa7 = ((C940470aa5) awS259S0300000_15.l0).LLILZLL;
            if (c940490aa7 != null) {
                lValueOf = Long.valueOf(c940490aa7.LIZ);
            } else {
                lValueOf = null;
            }
            C945320ahu c945320ahu = (C945320ahu) awS259S0300000_15.l1;
            if (lValueOf != null && lValueOf.longValue() != 0 && c945320ahu != null) {
                DataChannelGlobal.LLILZ.JQ2(C940460aa4.class, new Pair(lValueOf, c945320ahu));
            }
        }
        C940470aa5 c940470aa5 = (C940470aa5) awS259S0300000_15.l0;
        c940470aa5.LLILZ.LJJIL((SeiAppData) awS259S0300000_15.l2, c940470aa5.LLIZ);
        ((C940470aa5) awS259S0300000_15.l0).LLILZIL.LJJIII((SeiAppData) awS259S0300000_15.l2);
        SeiAppData seiAppData = (SeiAppData) awS259S0300000_15.l2;
        C939550aYb.LJ(seiAppData.anchorLinkMicId, seiAppData.businessExtraInfo);
        C937300aUy c937300aUy = C937300aUy.LIZ;
        C945320ahu c945320ahu2 = (C945320ahu) awS259S0300000_15.l1;
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15((C940470aa5) awS259S0300000_15.l0, 1005);
        c937300aUy.getClass();
        C937300aUy.LIZ(c945320ahu2, awS594S0100000_15);
        InterfaceC937900aVw interfaceC937900aVw = ((C940470aa5) awS259S0300000_15.l0).LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LJLJLLL("CommonLinkMicFeedViewManager#onParsed", C936720aU2.LIZIZ());
        }
        C937750aVh.LIZIZ((SeiAppData) awS259S0300000_15.l2);
        C1ACJ.LIZJ((SeiAppData) awS259S0300000_15.l2);
        C940470aa5 c940470aa52 = (C940470aa5) awS259S0300000_15.l0;
        SeiDsl seiDsl = ((SeiAppData) awS259S0300000_15.l2).dsl;
        if (seiDsl != null) {
            i = seiDsl.scene;
        } else {
            i = 0;
        }
        InterfaceC940380aZw interfaceC940380aZwLJIIJJI = c940470aa52.LJIIJJI(i, c940470aa52.LLILZ);
        if (interfaceC940380aZwLJIIJJI != null) {
            C940470aa5 c940470aa53 = (C940470aa5) awS259S0300000_15.l0;
            SeiAppData seiAppData2 = (SeiAppData) awS259S0300000_15.l2;
            interfaceC940380aZwLJIIJJI.LJIIL(c940470aa53.LLJJJIL);
            interfaceC940380aZwLJIIJJI.LLJJJJJIL(seiAppData2);
            FrameLayout frameLayout = c940470aa53.LLIZLLLIL;
            if (frameLayout != null) {
                interfaceC940380aZwLJIIJJI.LLIIJI(frameLayout, c940470aa53.LLJJIJIL);
            }
        }
        C914240Ztm c914240Ztm = C914240Ztm.LIZ;
        SeiAppData seiAppData3 = (SeiAppData) awS259S0300000_15.l2;
        c914240Ztm.getClass();
        if (seiAppData3.LJIILLIIL()) {
            if (C914240Ztm.LIZIZ <= 0) {
                C914240Ztm.LIZIZ = System.currentTimeMillis();
            }
            C914240Ztm.LIZ();
        } else if (seiAppData3.LJIILL()) {
            if (C914240Ztm.LIZLLL <= 0) {
                C914240Ztm.LIZLLL = System.currentTimeMillis();
            }
            C914240Ztm.LIZJ();
        }
        InterfaceC940230aZh interfaceC940230aZh = ((C940470aa5) awS259S0300000_15.l0).LLJJJIL;
        if (interfaceC940230aZh != null) {
            interfaceC940230aZh.LIZJ();
        }
        SeiAppData seiAppData4 = (SeiAppData) awS259S0300000_15.l2;
        C940890aal.LIZ = seiAppData4.linkCondition;
        C940890aal.LIZIZ = seiAppData4.linkConditionV2;
        SeiAppData seiAppData5 = ((C940470aa5) awS259S0300000_15.l0).LLJILJIL;
        if (seiAppData5 != null && seiAppData5.LJIILLIIL()) {
            C914830Zuj c914830Zuj = C914830Zuj.LIZ;
            C940470aa5 c940470aa54 = (C940470aa5) awS259S0300000_15.l0;
            InterfaceC937900aVw interfaceC937900aVw2 = c940470aa54.LLIZ;
            C940490aa7 c940490aa72 = c940470aa54.LLILZLL;
            String str = ((SeiAppData) awS259S0300000_15.l2).anchorLinkMicId;
            c914830Zuj.getClass();
            C914830Zuj.LIZ(interfaceC937900aVw2, c940490aa72, str, "video_live");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS259S0300000_15 awS259S0300000_15) {
        if (((Boolean) ((C05P0) awS259S0300000_15.l1).getValue()).booleanValue() && !((Boolean) ((C05P0) awS259S0300000_15.l2).getValue()).booleanValue()) {
            C05P0 c05p0 = (C05P0) awS259S0300000_15.l2;
            Boolean bool = Boolean.TRUE;
            c05p0.setValue(bool);
            ((C05P0) awS259S0300000_15.l1).setValue(Boolean.FALSE);
            ((Function1) awS259S0300000_15.l0).invoke(bool);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS259S0300000_15 awS259S0300000_15) {
        ((C953610avH) awS259S0300000_15.l0).LJIIL((C953600avG) awS259S0300000_15.l1, (Bitmap) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS259S0300000_15 awS259S0300000_15) {
        ((C958280b2o) awS259S0300000_15.l0).LIZJ((C958360b2w) awS259S0300000_15.l1, (List) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$50(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ViewGroup viewGroup;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        C930540aK4.LJJIJLIJ((ViewGroup) awS259S0300000_15.l0, new AwS594S0100000_15((C933770aPH) awS259S0300000_15.l1, 1050));
        IApplyGuideAbility iApplyGuideAbility = null;
        iGuidenceAbility = null;
        IGuidenceAbility iGuidenceAbility = null;
        iApplyGuideAbility = null;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            C933770aPH c933770aPH = (C933770aPH) awS259S0300000_15.l1;
            DataChannel dataChannel = c933770aPH.LLILZ;
            if (dataChannel != null && (interfaceC665370Q7z2 = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
                iGuidenceAbility = (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z2, IGuidenceAbility.class, null);
            }
            c933770aPH.LLILZLL = iGuidenceAbility;
            View viewFindViewById = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.jfk);
            if (viewFindViewById != null) {
                ViewGroup viewGroup2 = (ViewGroup) awS259S0300000_15.l0;
                C786410Ut5.I7(new ACListenerS150S0100000_15((C933770aPH) awS259S0300000_15.l1, 274), viewFindViewById);
                float width = viewGroup2.getWidth() * 0.8f;
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams instanceof C19ME) {
                    ((C19ME) layoutParams).matchConstraintMaxWidth = (int) width;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                }
            }
            View viewFindViewById2 = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.qt3);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15((C933770aPH) awS259S0300000_15.l1, 275), viewFindViewById2);
            }
        } else {
            C933770aPH c933770aPH2 = (C933770aPH) awS259S0300000_15.l1;
            DataChannel dataChannel2 = c933770aPH2.LLILZ;
            if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null) {
                iApplyGuideAbility = (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IApplyGuideAbility.class, null);
            }
            c933770aPH2.LLIZLLLIL = iApplyGuideAbility;
        }
        C500260Jjc.LJLIIIL(1500L, (ViewGroup) awS259S0300000_15.l2, new AwS594S0100000_15(new AwS559S0100000_15((C933770aPH) awS259S0300000_15.l1, 1059), (Function0<Unit>) 1048));
        int width2 = (int) (((ViewGroup) awS259S0300000_15.l0).getWidth() * C933980aPc.LIZJ(C933980aPc.LJFF()));
        int i = (int) (width2 * 0.375f);
        ImageView imageView = (ImageView) ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.h23);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ff1);
        }
        View viewFindViewById3 = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.h23);
        if (viewFindViewById3 != null) {
            C933980aPc.LJIIZILJ(width2, width2, viewFindViewById3);
        }
        View viewFindViewById4 = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.qt3);
        if (viewFindViewById4 != null) {
            C933980aPc.LJIIZILJ(width2, width2, viewFindViewById4);
        }
        View viewFindViewById5 = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.qt4);
        if (viewFindViewById5 != null) {
            C933980aPc.LJIIZILJ(width2, width2, viewFindViewById5);
        }
        View viewFindViewById6 = ((ViewGroup) awS259S0300000_15.l2).findViewById(R.id.h34);
        if (viewFindViewById6 != null) {
            C933980aPc.LJIIZILJ(i, i, viewFindViewById6);
        }
        if (C922570a7D.LIZ(((C933770aPH) awS259S0300000_15.l1).LLILZ) && (viewGroup = ((C933770aPH) awS259S0300000_15.l1).LLILLL) != null) {
            C786410Ut5.R4(0.5f, viewGroup);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS259S0300000_15 awS259S0300000_15) {
        int width;
        View view;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) awS259S0300000_15.l0);
        int width2 = ((C1324720kZq) awS259S0300000_15.l1).getWidth();
        int height = ((C1324720kZq) awS259S0300000_15.l1).getHeight();
        c1324610kZfLJIIIZ.LJ = width2;
        c1324610kZfLJIIIZ.LJFF = height;
        C940400aZy c940400aZy = (C940400aZy) awS259S0300000_15.l2;
        C1324720kZq c1324720kZq = (C1324720kZq) awS259S0300000_15.l1;
        C940450aa3 c940450aa3 = c940400aZy.LLILZLL;
        String str = null;
        if (c940450aa3 != null) {
            str = c940450aa3.LIZJ;
        }
        Object parent = c1324720kZq.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            width = view.getWidth();
        } else {
            width = 0;
        }
        int iLIZJ = (int) (width * C933980aPc.LIZJ(str));
        c1324610kZfLJIIIZ.LJ = iLIZJ;
        c1324610kZfLJIIIZ.LJFF = iLIZJ;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        C1324720kZq c1324720kZq2 = (C1324720kZq) awS259S0300000_15.l1;
        c1324610kZfLJIIIZ.LJIIL = new C987300bnc(c1324720kZq2, 3);
        c1324610kZfLJIIIZ.LJJI(c1324720kZq2);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS259S0300000_15 awS259S0300000_15) {
        String str;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        Map<Integer, String> map;
        int iIntValue = ((Integer) awS259S0300000_15.l0).intValue();
        if (iIntValue != 4) {
            if (iIntValue != 6) {
                if (iIntValue == 8 && C917910Zzh.LIZ(C930540aK4.LIZJ())) {
                    str = C925150aBN.LJIIIZ;
                } else {
                    str = null;
                }
            } else {
                str = C925150aBN.LJIIIIZZ;
            }
        } else {
            str = C925150aBN.LJII;
        }
        ((C916180Zwu) awS259S0300000_15.l1).LIZLLL(str);
        if (str != null && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && (map = multiGuestDataHolderLIZJ.LJIJJLI) != null) {
            ((ConcurrentHashMap) map).put(1, str);
        }
        ((Function0) awS259S0300000_15.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS259S0300000_15 awS259S0300000_15) {
        ((InterfaceC971000bNK) awS259S0300000_15.l0).LJJIIZ((List) awS259S0300000_15.l1, (List) awS259S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS259S0300000_15 awS259S0300000_15) {
        Drawable background;
        Drawable drawableMutate;
        LiveIconView liveIconView = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLIL;
        if (liveIconView != null) {
            C500260Jjc.LJLJLJ(liveIconView, true);
        }
        View view = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLIILIL;
        if (view != null && (background = view.getBackground()) != null && (drawableMutate = background.mutate()) != null) {
            C118300cf c118300cf = (C118300cf) awS259S0300000_15.l2;
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setColor(c118300cf.element);
            }
        }
        LiveIconView liveIconView2 = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLIL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(((C118300cf) awS259S0300000_15.l1).element);
        }
        LiveIconView liveIconView3 = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLILZJ;
        if (liveIconView3 != null) {
            liveIconView3.setIconTint(((C118300cf) awS259S0300000_15.l1).element);
        }
        TextView textView = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLILZ;
        if (textView != null) {
            textView.setTextColor(((C118300cf) awS259S0300000_15.l1).element);
        }
        TextView textView2 = ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l0).LLLILZ;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131842168));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS259S0300000_15 awS259S0300000_15) {
        List<String> list = ((LinkPlayerInfo) awS259S0300000_15.l0).recommendTagList;
        if (list == null || !list.contains("randmatch_guest")) {
            ((MultiLiveAsAnchorListDialogV2) awS259S0300000_15.l1).LJLLJ().LIZ(((LinkPlayerInfo) awS259S0300000_15.l0).mUser.getId());
        }
        ((Function0) awS259S0300000_15.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS259S0300000_15 awS259S0300000_15) {
        C1102690enj c1102690enjHy0;
        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableMultiGuestIconOptimize(((C934350aQD) awS259S0300000_15.l0).LIZ)) {
            DataChannel dataChannel = ((C934350aQD) awS259S0300000_15.l0).LIZ;
            InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enuLJ = null;
            if (dataChannel != null && (c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel)) != null) {
                interfaceViewOnClickListenerC1102800enuLJ = c1102690enjHy0.LJ(EnumC1102740eno.MULTIGUEST);
            }
            if (!(interfaceViewOnClickListenerC1102800enuLJ instanceof C934320aQA) || interfaceViewOnClickListenerC1102800enuLJ == null) {
                return new C934320aQA((InterfaceC934580aQa) awS259S0300000_15.l1, (LifecycleOwner) awS259S0300000_15.l2, ((C934350aQD) awS259S0300000_15.l0).LIZIZ);
            }
            return interfaceViewOnClickListenerC1102800enuLJ;
        }
        return new C934320aQA((InterfaceC934580aQa) awS259S0300000_15.l1, (LifecycleOwner) awS259S0300000_15.l2, ((C934350aQD) awS259S0300000_15.l0).LIZIZ);
    }

    public static final Object invoke$6(AwS259S0300000_15 awS259S0300000_15) {
        Object objGg0;
        EnumC950200apm enumC950200apm;
        boolean z;
        EnumC950200apm enumC950200apm2;
        C958280b2o c958280b2o = (C958280b2o) awS259S0300000_15.l0;
        C958360b2w c958360b2w = (C958360b2w) awS259S0300000_15.l1;
        List<? extends Room> list = (List) awS259S0300000_15.l2;
        c958280b2o.getClass();
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
        DataChannel dataChannel = c958280b2o.LIZJ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(MultiCoHostStateChannel.class);
        } else {
            objGg0 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkConflict isInviteType:");
        sbLIZ.append(C958270b2n.LIZJ(c958360b2w));
        C20441214yg.LIZIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = true;
        if (C958270b2n.LIZJ(c958360b2w)) {
            if (objGg0 == EnumC950120ape.Applied || (c954460aweLLILL != null && (enumC950200apm2 = c954460aweLLILL.LJJIIZ) != null && enumC950200apm2.isApplying())) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkInviteConflict isStateApplying:");
            sbLIZ2.append(z);
            C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
                C915980Zwa.LJI().LIZ().LJLZ(C915980Zwa.LJI().LIZ().LJLJI());
                C915980Zwa.LJI().LIZ().LJJLJLI(C915980Zwa.LJI().LIZ().LLIIIJ());
                C955850ayt.LIZ(c958280b2o.LIZLLL, EnumC955790ayn.APPLY_INVITE, new AwS259S0300000_15(c958280b2o, (C958280b2o) c958360b2w, (C958360b2w) list, (List<? extends Room>) 5), new AwS559S0100000_15(c958280b2o, 91));
            } else {
                List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
                ArrayList arrayList = new ArrayList();
                for (C954460awe c954460awe : listLJIJJ) {
                    C954460awe c954460awe2 = c954460awe;
                    EnumC950200apm enumC950200apm3 = c954460awe2.LJJIIZ;
                    if (enumC950200apm3 == EnumC950200apm.INVITING || enumC950200apm3 == EnumC950200apm.INVITED) {
                        if (c954460awe2.LJIIJJI()) {
                            arrayList.add(c954460awe);
                        }
                    }
                }
                int size = arrayList.size();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkInviteConflict inviteByCurrentSize:");
                sbLIZ3.append(size);
                C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ3));
                C955540ayO c955540ayO = C958280b2o.LJI;
                if (size >= C950220apo.LJIIJ(c955540ayO)) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755813, C950220apo.LJIIJ(c955540ayO), Integer.valueOf(C950220apo.LJIIJ(c955540ayO))));
                    InterfaceC958410b31 interfaceC958410b31 = c958280b2o.LJ;
                    if (interfaceC958410b31 != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("You can only send up to ");
                        sbLIZ4.append(C950220apo.LJIIJ(c955540ayO));
                        sbLIZ4.append(" invites");
                        interfaceC958410b31.LIZ(-1002, C2188811AlT.LIZIZ(sbLIZ4));
                    }
                } else {
                    int size2 = C915980Zwa.LJII().LLILZLL(true).size();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("checkInviteConflict linkedUserSize:");
                    sbLIZ5.append(size2);
                    C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ5));
                    if (C950220apo.LJIJ(size2, C915980Zwa.LJIIIZ().LIZJ())) {
                        if (size <= 0 && !C915980Zwa.LJIIIZ().Jf()) {
                            C766270U4b.LIZLLL(2131841237);
                            InterfaceC958410b31 interfaceC958410b312 = c958280b2o.LJ;
                            if (interfaceC958410b312 != null) {
                                interfaceC958410b312.LIZ(-1002, "Couldn’t send invite. Maximum number of LIVE creators reached");
                            }
                        } else {
                            C766270U4b.LIZLLL(2131841238);
                            InterfaceC958410b31 interfaceC958410b313 = c958280b2o.LJ;
                            if (interfaceC958410b313 != null) {
                                interfaceC958410b313.LIZ(-1002, "Maximum number of invites sent");
                            }
                        }
                    } else {
                        c958280b2o.LIZJ(c958360b2w, list, false);
                    }
                }
            }
        } else {
            Room room = (Room) ListProtector.get(list, 0);
            if (objGg0 == EnumC950120ape.Applied || (c954460aweLLILL != null && (enumC950200apm = c954460aweLLILL.LJJIIZ) != null && enumC950200apm.isApplying())) {
                C20441214yg.LJ("BattlePairInviteUtils", "checkApplyConflict return due to already applied one");
                C766270U4b.LIZLLL(2131841239);
                InterfaceC958410b31 interfaceC958410b314 = c958280b2o.LJ;
                if (interfaceC958410b314 != null) {
                    interfaceC958410b314.LIZ(-1002, "already applied one");
                }
            } else {
                boolean zLIZ = C950340aq0.LIZ();
                if (objGg0 != EnumC950120ape.Invited && !zLIZ) {
                    z2 = false;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("checkApplyConflict isStateInviting:");
                sbLIZ6.append(z2);
                sbLIZ6.append(", hasInvitingByMeInCrossArc:");
                sbLIZ6.append(zLIZ);
                C20441214yg.LIZIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ6));
                if (z2) {
                    C955850ayt.LIZ(c958280b2o.LIZLLL, EnumC955790ayn.INVITE_APPLY, new AwS259S0300000_15(c958280b2o, c958360b2w, room, 4), new AwS559S0100000_15(c958280b2o, 90));
                } else {
                    c958280b2o.LIZIZ(c958360b2w, room, false);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS259S0300000_15 awS259S0300000_15) {
        InterfaceC916700Zxk interfaceC916700Zxk = ((LayoutSettingContract) awS259S0300000_15.l0).bizSwitchLayoutCallBack;
        if (interfaceC916700Zxk != null) {
            interfaceC916700Zxk.LIZIZ((EnumC930180aJU) awS259S0300000_15.l1);
        }
        Function0 function0 = (Function0) awS259S0300000_15.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((CountDownForAllEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS259S0300000_15 awS259S0300000_15) {
        PlayEntityUtilKt.LJII((CountDownSingleEntity) awS259S0300000_15.l0, 1, (C20361214lm) awS259S0300000_15.l1, (InterfaceC20354714kj) awS259S0300000_15.l2, true);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS259S0300000_15(X.C955540ayO r3, X.InterfaceC955990az7 r4, X.C955590ayT r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 42: goto L11;
                case 43: goto L5;
                case 44: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.<init>(X.0ayO, X.0az7, X.0ayT, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS259S0300000_15(X.C949560aok r3, X.C1112330f3H r4, com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 36: goto L11;
                case 37: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.<init>(X.0aok, X.0f3H, com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS259S0300000_15(X.C949560aok r3, X.C1109770ez9 r4, X.C1112330f3H r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 34 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS259S0300000_15.<init>(X.0aok, X.0ez9, X.0f3H, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C013C c013c, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = awS559S0100000_15;
        this.l2 = awS559S0100000_152;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C918350a0P c918350a0P, C918230a0D c918230a0D, C918650a0t c918650a0t, int i) {
        super(0);
        this.$t = i;
        this.l0 = c918350a0P;
        this.l1 = c918230a0D;
        this.l2 = c918650a0t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(EnumC919170a1j enumC919170a1j, AwS18S0410000_15 awS18S0410000_15, C974990bTl c974990bTl, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC919170a1j;
        this.l1 = awS18S0410000_15;
        this.l2 = c974990bTl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C920060a3A c920060a3A, EnlargeScreenManageParams enlargeScreenManageParams, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.l1 = c920060a3A;
        this.l2 = enlargeScreenManageParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C928360aGY c928360aGY, View view, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c928360aGY;
        this.l1 = view;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C928450aGh c928450aGh, View view, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c928450aGh;
        this.l1 = view;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C934350aQD c934350aQD, InterfaceC934580aQa interfaceC934580aQa, LifecycleOwner lifecycleOwner, int i) {
        super(0);
        this.$t = i;
        this.l0 = c934350aQD;
        this.l1 = interfaceC934580aQa;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C940470aa5 c940470aa5, C945320ahu c945320ahu, SeiAppData seiAppData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c940470aa5;
        this.l1 = c945320ahu;
        this.l2 = seiAppData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C949600aoo c949600aoo, C154500iV c154500iV, C1109770ez9 c1109770ez9, int i) {
        super(0);
        this.$t = i;
        this.l0 = c949600aoo;
        this.l1 = c1109770ez9;
        this.l2 = c154500iV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C953610avH c953610avH, C953600avG c953600avG, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.l0 = c953610avH;
        this.l1 = c953600avG;
        this.l2 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C958280b2o c958280b2o, C958360b2w c958360b2w, Room room, int i) {
        super(0);
        this.$t = i;
        this.l0 = c958280b2o;
        this.l1 = c958360b2w;
        this.l2 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(C958280b2o c958280b2o, C958280b2o c958280b2o2, C958360b2w c958360b2w, List<? extends Room> list) {
        super(0);
        this.$t = list;
        this.l0 = c958280b2o;
        this.l1 = c958280b2o2;
        this.l2 = c958360b2w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(C959530b4p c959530b4p, EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c959530b4p;
        this.l1 = enumC959750b5B;
        this.l2 = c950840aqo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(InterfaceC971000bNK interfaceC971000bNK, InterfaceC971000bNK interfaceC971000bNK2, List<C971360bNu> list, List<C971360bNu> list2) {
        super(0);
        this.$t = list2;
        this.l0 = interfaceC971000bNK;
        this.l1 = interfaceC971000bNK2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(C974060bSG c974060bSG, C974060bSG c974060bSG2, List<C954460awe> list, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        super(0);
        this.$t = multiMatchPrepareResponse;
        this.l0 = c974060bSG;
        this.l1 = c974060bSG2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(Context context, Context context2, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(ViewGroup viewGroup, C933770aPH c933770aPH, ViewGroup viewGroup2, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = c933770aPH;
        this.l2 = viewGroup2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(ImageModel imageModel, C1324720kZq c1324720kZq, C940400aZy c940400aZy, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageModel;
        this.l1 = c1324720kZq;
        this.l2 = c940400aZy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(CountDownForAllEntity countDownForAllEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = countDownForAllEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(CountDownSingleEntity countDownSingleEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = countDownSingleEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(ExpandEntity expandEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = expandEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(GiftSettingEntity giftSettingEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = giftSettingEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(GuestShowdownEntity guestShowdownEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = guestShowdownEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(LayoutSettingEntity layoutSettingEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = layoutSettingEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(LiveShowEntity liveShowEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(NoticeboardEntity noticeboardEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = noticeboardEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(SharedBackgroundEntity sharedBackgroundEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(0);
        this.$t = i;
        this.l0 = sharedBackgroundEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiGuestSharedBgAnchorViewModel;
        this.l1 = context;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(TextHeaderListFragment textHeaderListFragment, C410901il c410901il, C01ZA c01za, int i) {
        super(0);
        this.$t = i;
        this.l0 = textHeaderListFragment;
        this.l1 = c410901il;
        this.l2 = c01za;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, C118300cf c118300cf, C118300cf c118300cf2, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiLiveAsAnchorListDialogV2;
        this.l1 = c118300cf;
        this.l2 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiCoHostBeInvitedDialog multiCoHostBeInvitedDialog, C943860afY c943860afY, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiCoHostBeInvitedDialog;
        this.l1 = c943860afY;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiHostCrossAdapterImpl;
        this.l1 = interfaceC954180awC;
        this.l2 = applyGroupMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiHostCrossAdapterImpl;
        this.l1 = interfaceC954180awC;
        this.l2 = cancelApplyGroupMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiHostCrossAdapterImpl;
        this.l1 = interfaceC954180awC;
        this.l2 = cancelInviteGroupMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InviteGroupMessage inviteGroupMessage, InterfaceC954180awC interfaceC954180awC, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiHostCrossAdapterImpl;
        this.l1 = inviteGroupMessage;
        this.l2 = interfaceC954180awC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(MultiGuestEnterIntentHandlerV2 multiGuestEnterIntentHandlerV2, C926060aCq c926060aCq, C926050aCp c926050aCp, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiGuestEnterIntentHandlerV2;
        this.l1 = c926060aCq;
        this.l2 = c926050aCp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920170a3L c920170a3L, InterfaceC920110a3F interfaceC920110a3F, int i) {
        super(0);
        this.$t = i;
        this.l0 = enlargeScreenManageParams;
        this.l1 = c920170a3L;
        this.l2 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(LinkPlayerInfo linkPlayerInfo, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, AwS559S0100000_15 awS559S0100000_15, int i) {
        super(0);
        this.$t = i;
        this.l0 = linkPlayerInfo;
        this.l1 = multiLiveAsAnchorListDialogV2;
        this.l2 = awS559S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS259S0300000_15(Room room, DataChannel dataChannel, C944450agV c944450agV, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = dataChannel;
        this.l2 = c944450agV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(Integer num, Integer num2, C916180Zwu c916180Zwu, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = c916180Zwu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(Function1 function1, Function1<? super Boolean, Unit> function12, C05P0<Boolean> c05p0, C05P0<Boolean> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS259S0300000_15(LayoutSettingContract layoutSettingContract, LayoutSettingContract layoutSettingContract2, int i, EnumC930180aJU enumC930180aJU, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = layoutSettingContract;
        this.l1 = i;
        this.l2 = enumC930180aJU;
    }
}
