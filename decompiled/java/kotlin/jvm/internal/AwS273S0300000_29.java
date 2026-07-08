package kotlin.jvm.internal;

import X.AbstractC194339111l;
import X.C013C;
import X.C08JS;
import X.C098200Yq;
import X.C09AE;
import X.C09AY;
import X.C0CQT;
import X.C0E48;
import X.C0FSX;
import X.C0LAB;
import X.C0P0T;
import X.C0R60;
import X.C1044430dHl;
import X.C1164504h1;
import X.C118300cf;
import X.C11G7;
import X.C11GO;
import X.C11V3;
import X.C11YC;
import X.C11YJ;
import X.C11YV;
import X.C123100dR;
import X.C1239510iMP;
import X.C1258350iqn;
import X.C12G1;
import X.C12G2;
import X.C1308910kAL;
import X.C13LP;
import X.C13SZ;
import X.C1428310nGv;
import X.C1440005kM;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15438062q;
import X.C1618440sDa;
import X.C1664590tQ1;
import X.C1664680tQA;
import X.C1799610wvn;
import X.C189200o6;
import X.C19461111Bx;
import X.C19471611Fy;
import X.C19510811Va;
import X.C19512911Vv;
import X.C19513311Vz;
import X.C19553011ei;
import X.C19556311fF;
import X.C19568211hA;
import X.C19580611jA;
import X.C19581511jJ;
import X.C19581611jK;
import X.C19582611jU;
import X.C19591211ks;
import X.C19595711lb;
import X.C19596011le;
import X.C19597811lw;
import X.C19598911m7;
import X.C19601011mS;
import X.C19623911q9;
import X.C19624011qA;
import X.C19643111tF;
import X.C196990125k;
import X.C19713012Au;
import X.C19756712Rp;
import X.C19756812Rq;
import X.C19EG;
import X.C20280014Ww;
import X.C20441214yg;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2203211BKt;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C350890DpH;
import X.C356670Dyb;
import X.C361680EFy;
import X.C418440Gaw;
import X.C675940QfI;
import X.C705930RmZ;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C860720Xpe;
import X.EnumC1461710o8n;
import X.ExecutorC527170Klv;
import X.InterfaceC1464960oE2;
import X.InterfaceC19568511hD;
import X.InterfaceC19598211m0;
import X.InterfaceC19632811ra;
import X.RunnableC194343111p;
import Y.ARunnableS62S0300000_29;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.android.livesdk.dataChannel.LiveCenterTopNoticeShowingEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.internal.FlowLifecycleAwareCollector;
import com.bytedance.assem.arch.viewModel.internal.LifecycleAwareObserverNew;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class AwS273S0300000_29 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS273S0300000_29 awS273S0300000_29) {
        HandlerHook.viewRemoveCallbacks((View) awS273S0300000_29.l0, (Runnable) awS273S0300000_29.l1);
        ((ObjectAnimator) awS273S0300000_29.l2).cancel();
        ((Runnable) awS273S0300000_29.l1).run();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS273S0300000_29 awS273S0300000_29) {
        C09AE c09ae;
        ((FlowLifecycleAwareCollector) awS273S0300000_29.l0).LIZ((LifecycleOwner) awS273S0300000_29.l1, true);
        if (((Lifecycle.Event) awS273S0300000_29.l2) == Lifecycle.Event.ON_DESTROY && (c09ae = ((FlowLifecycleAwareCollector) awS273S0300000_29.l0).LLJI) != null) {
            c09ae.LIZIZ(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS273S0300000_29 awS273S0300000_29) {
        ((C11YC) awS273S0300000_29.l0).LIZ(99999);
        ((C11YC) awS273S0300000_29.l0).LIZJ(C11YJ.CLIENT.getValue());
        C11YC c11yc = (C11YC) awS273S0300000_29.l0;
        String message = ((RuntimeException) awS273S0300000_29.l1).getMessage();
        if (message == null) {
            message = C13SZ.LIZIZ((RuntimeException) awS273S0300000_29.l1);
        }
        c11yc.LIZIZ(message);
        ((C11YC) awS273S0300000_29.l0).LIZLLL();
        ((C11YV) awS273S0300000_29.l2).LIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS273S0300000_29 awS273S0300000_29) {
        AddYoursStickerModel addYoursStickerModel;
        InterfaceC1464960oE2 interfaceC1464960oE2W2;
        StickerModel stickerModel = (StickerModel) awS273S0300000_29.l0;
        if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel = (AddYoursStickerModel) stickerModel) != null) {
            List<UserInvitee> list = (List) awS273S0300000_29.l1;
            C19643111tF c19643111tF = (C19643111tF) awS273S0300000_29.l2;
            if ((!list.isEmpty()) && (interfaceC1464960oE2W2 = c19643111tF.W2()) != null) {
                interfaceC1464960oE2W2.LLILII(true, C1664590tQ1.LJIIIZ(c19643111tF).getResources().getQuantityString(2131755079, list.size(), Integer.valueOf(list.size())), addYoursStickerModel.getId(), C0FSX.BOTTOM, null, null, null, null, null);
            }
            AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(c19643111tF.H2().creativeModel.stickerModel.addYoursStickerExtras);
            if (addYoursStickerExtras != null) {
                addYoursStickerExtras.setAddYoursInvitees(list);
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<UserInvitee> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(it2.next().getUid())));
            }
            AddYoursStickerModel addYoursStickerModelCopy = addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, arrayList, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
            InterfaceC1464960oE2 interfaceC1464960oE2W22 = c19643111tF.W2();
            if (interfaceC1464960oE2W22 != null) {
                interfaceC1464960oE2W22.J4(addYoursStickerModelCopy);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS273S0300000_29 awS273S0300000_29) {
        boolean z;
        String str;
        String str2;
        String extra;
        if (((Number) ((Pair) awS273S0300000_29.l0).getFirst()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C356670Dyb.LIZ(((C19556311fF) awS273S0300000_29.l1).LIZ);
        int iIntValue = ((Number) ((Pair) awS273S0300000_29.l0).getSecond()).intValue() + 1;
        SoundEffectTabModel soundEffectTabModel = (SoundEffectTabModel) C13LP.LJJJLZIJ(((Number) ((Pair) awS273S0300000_29.l0).getFirst()).intValue(), ((C19553011ei) awS273S0300000_29.l2).LLJJL);
        String str3 = "";
        if (soundEffectTabModel == null || (str = soundEffectTabModel.name) == null) {
            str = "";
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ((C19553011ei) awS273S0300000_29.l2).LLJJJJ.getValue();
        C0E48 c0e48LIZIZ = ((C19553011ei) awS273S0300000_29.l2).LLLLIL().LIZIZ();
        if (videoPublishEditModel != null && c0e48LIZIZ != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48LIZIZ, new Pair(-1, -1));
            c0labLJFF.LJ("tab_name", str);
            c0labLJFF.LIZ(iIntValue, "index");
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48LIZIZ);
            if (nLETrackLIZLLL != null && (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) != null) {
                str3 = extra;
            }
            c0labLJFF.LJ("music_id", str3);
            if (z) {
                str2 = "favorite";
            } else {
                str2 = "other";
            }
            c0labLJFF.LJ("sound_effect_source", str2);
            c0labLJFF.LJ("sound_effect_id", strLIZ);
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("sound_effect_show", c0labLJFF.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS273S0300000_29 awS273S0300000_29) {
        Context context = (Context) awS273S0300000_29.l0;
        C19581611jK c19581611jK = (C19581611jK) awS273S0300000_29.l1;
        return new C19581511jJ(context, c19581611jK, c19581611jK.LJIIIZ, (C705930RmZ) awS273S0300000_29.l2, c19581611jK.LJIIJ);
    }

    public static final Object invoke$14(AwS273S0300000_29 awS273S0300000_29) {
        ((Function1) awS273S0300000_29.l0).invoke((TuxIconView) awS273S0300000_29.l1);
        ((C19471611Fy) awS273S0300000_29.l2).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS273S0300000_29 awS273S0300000_29) {
        Object c098200Yq;
        String str;
        C705930RmZ c705930RmZ;
        C19623911q9 c19623911q9 = (C19623911q9) awS273S0300000_29.l1;
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) awS273S0300000_29.l2;
        Object obj = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("article_sticker_");
            C19591211ks interactStickerContainerCommonParam = c19623911q9.getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null) {
                str = c705930RmZ.LIZLLL;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(interactStickerStruct.getMaterialIndex());
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        if (obj == null) {
            return String.valueOf(((View) awS273S0300000_29.l0).hashCode());
        }
        return obj;
    }

    public static final Object invoke$16(AwS273S0300000_29 awS273S0300000_29) {
        return Boolean.valueOf(((C19568211hA) awS273S0300000_29.l0).LJ().remove(awS273S0300000_29.l1, (InterfaceC19568511hD) awS273S0300000_29.l2));
    }

    public static final Object invoke$17(AwS273S0300000_29 awS273S0300000_29) {
        String str;
        C0R60 c0r60;
        C0R60 c0r602;
        C19596011le c19596011le = (C19596011le) awS273S0300000_29.l0;
        VideoShareInfoStruct videoShareInfoStruct = (VideoShareInfoStruct) awS273S0300000_29.l1;
        c19596011le.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickViewOriginal navigating to originalAwemeId=");
        sbLIZ.append(videoShareInfoStruct.awemeId);
        sbLIZ.append(" photomodeIndex=");
        sbLIZ.append(videoShareInfoStruct.photomodeIndex);
        sbLIZ.append(" enterFrom=");
        C705930RmZ c705930RmZ = c19596011le.LLILLJJLI;
        String str2 = null;
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r602.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19596011le.LL, "//aweme/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, videoShareInfoStruct.awemeId);
            boolean z = true;
            smartRouteBuildRoute.withParam("extra_is_from_shared_story", true);
            smartRouteBuildRoute.withParam("extra_prev_panel_id", C1618440sDa.LIZIZ.LJIJJLI().LJIILL());
            smartRouteBuildRoute.withParam("story_to_post_photomode_index", videoShareInfoStruct.photomodeIndex);
            C705930RmZ c705930RmZ2 = c19596011le.LLILLJJLI;
            if (c705930RmZ2 != null && (c0r60 = c705930RmZ2.LJIIZILJ) != null) {
                str2 = c0r60.LIZ;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            smartRouteBuildRoute.withParam("enter_from", str2);
            String aid = c19596011le.LLILLL.getAid();
            if (aid != null) {
                str3 = aid;
            }
            smartRouteBuildRoute.withParam("share_to_story_aid_of_story", str3);
            smartRouteBuildRoute.open();
            if (C2203211BKt.LIZ(c19596011le.LLILLL) == null) {
                z = false;
            }
            c19596011le.LIZ("click", videoShareInfoStruct, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS273S0300000_29.l2).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS273S0300000_29 awS273S0300000_29) {
        C786410Ut5.LJLLLLLL(8, (View) awS273S0300000_29.l0);
        C786410Ut5.T4((View) awS273S0300000_29.l0, 1.0f);
        C786410Ut5.Ob((View) awS273S0300000_29.l0, 1.0f);
        C786410Ut5.pc((View) awS273S0300000_29.l0, 1.0f);
        C786410Ut5.ed((View) awS273S0300000_29.l0, ((LiveCenterTopNoticeWidget) awS273S0300000_29.l1).B1());
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", "dismiss: exit anim done, view GONE");
        DataChannel dataChannel = ((LiveCenterTopNoticeWidget) awS273S0300000_29.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LiveCenterTopNoticeShowingEvent.class, Boolean.FALSE);
        }
        Function0<Unit> function0 = ((C1164504h1) awS273S0300000_29.l2).LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS273S0300000_29 awS273S0300000_29) {
        return ((C11GO) awS273S0300000_29.l0).LJIIL((Context) awS273S0300000_29.l1, (AttributeSet) awS273S0300000_29.l2);
    }

    public static final Object invoke$2(AwS273S0300000_29 awS273S0300000_29) {
        ((LifecycleAwareObserverNew) awS273S0300000_29.l0).onLifecycleEvent((LifecycleOwner) awS273S0300000_29.l1);
        if (((Lifecycle.Event) awS273S0300000_29.l2) == Lifecycle.Event.ON_DESTROY) {
            ((LifecycleAwareObserverNew) awS273S0300000_29.l0).onDestroy();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS273S0300000_29 awS273S0300000_29) {
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS273S0300000_29.l0;
        abstractC194339111l.LIZJ((View) awS273S0300000_29.l1, new AwS464S0200000_29(abstractC194339111l, (AbstractC194339111l<int>) awS273S0300000_29.l2, 21));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS273S0300000_29 awS273S0300000_29) {
        ExecutorC527170Klv.LLILLJJLI.LIZ(50L, new ARunnableS62S0300000_29((C19461111Bx) awS273S0300000_29.l0, (Activity) awS273S0300000_29.l1, (VideoPublishEditModel) awS273S0300000_29.l2, 9));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[PHI: r1
      0x002f: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:12:0x002d, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[PHI: r1 r2
      0x0058: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:12:0x002d, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:12:0x002d, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AwS273S0300000_29 r9) {
        /*
            java.lang.Object r0 = r9.l0
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            X.0P0T r0 = (X.C0P0T) r0
            if (r0 == 0) goto Ld
            r0.dismiss()
        Ld:
            java.lang.Object r8 = r9.l1
            X.11mS r8 = (X.C19601011mS) r8
            java.lang.Object r7 = r9.l2
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r7 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r7
            r8.getClass()
            X.0zKj r6 = X.C1891950zKj.LIZIZ
            android.content.Context r5 = r8.LL
            X.07bY r4 = new X.07bY
            X.0RmZ r3 = r8.LLILLJJLI
            java.lang.String r2 = ""
            if (r3 == 0) goto L2c
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L2c
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2f
        L2c:
            r1 = r2
            if (r3 == 0) goto L58
        L2f:
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.LJ
            if (r0 == 0) goto L38
            r2 = r0
        L38:
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L58
            int r0 = r0.LIZLLL
        L3e:
            r4.<init>(r1, r2, r0)
            X.11mH r1 = r6.LJ(r5, r7, r4)
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LLILZ
            r1.LJLJJI(r0)
        L50:
            X.13BV r0 = X.C13BV.INSTANCE
            r1.LJLJJL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS273S0300000_29.invoke$22(kotlin.jvm.internal.AwS273S0300000_29):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r1
      0x001f: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:9:0x001d, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[PHI: r1 r2
      0x0036: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:9:0x001d, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:9:0x001d, B:16:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AwS273S0300000_29 r8) {
        /*
            X.0zKj r7 = X.C1891950zKj.LIZIZ
            java.lang.Object r6 = r8.l0
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r8.l1
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r5 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r5
            X.07bY r4 = new X.07bY
            java.lang.Object r3 = r8.l2
            X.0RmZ r3 = (X.C705930RmZ) r3
            java.lang.String r2 = ""
            if (r3 == 0) goto L1c
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L1f
        L1c:
            r1 = r2
            if (r3 == 0) goto L36
        L1f:
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.LJ
            if (r0 == 0) goto L28
            r2 = r0
        L28:
            X.11mJ r0 = r3.LJIJJ
            if (r0 == 0) goto L36
            int r0 = r0.LIZLLL
        L2e:
            r4.<init>(r1, r2, r0)
            X.11mH r0 = r7.LJ(r6, r5, r4)
            return r0
        L36:
            r0 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS273S0300000_29.invoke$23(kotlin.jvm.internal.AwS273S0300000_29):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS273S0300000_29 awS273S0300000_29) {
        ((C013C) awS273S0300000_29.l0).element = false;
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS273S0300000_29.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        C675940QfI.LIZJ("photo_search_help_panel_click", ((EcTakePhotoActivity) awS273S0300000_29.l2).LLJJL, new AwS608S0100000_29(C2097608Jq.LJIIJ(new Pair("click_type", "OK")), (Map<String, String>) 512));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS273S0300000_29 awS273S0300000_29) {
        Object c098200Yq;
        Context context = (Context) awS273S0300000_29.l0;
        ((C19512911Vv) awS273S0300000_29.l1).getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//news/anchor_publish");
        C19513311Vz c19513311Vz = (C19513311Vz) awS273S0300000_29.l2;
        c19513311Vz.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("action", c19513311Vz.LIZ.getType());
        UrlModel urlModel = c19513311Vz.LIZJ;
        if (urlModel != null) {
            try {
                c098200Yq = C08JS.LIZLLL(urlModel);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str == null) {
                str = "";
            }
            C786410Ut5.LJJJI("icon", str, bundle);
        }
        String str2 = c19513311Vz.LIZLLL;
        if (str2 != null) {
            C786410Ut5.LJJJI("content", str2, bundle);
        }
        Boolean bool = c19513311Vz.LJ;
        if (bool != null) {
            bundle.putBoolean("already_added", bool.booleanValue());
        }
        String str3 = c19513311Vz.LJFF;
        if (str3 != null) {
            C786410Ut5.LJJJI("title", str3, bundle);
        }
        String str4 = c19513311Vz.LJI;
        if (str4 != null) {
            C786410Ut5.LJJJI("link", str4, bundle);
        }
        Boolean bool2 = c19513311Vz.LJII;
        if (bool2 != null) {
            bundle.putBoolean("custom_title", bool2.booleanValue());
        }
        Boolean bool3 = c19513311Vz.LJIIIIZZ;
        if (bool3 != null) {
            bundle.putBoolean("is_editing_post", bool3.booleanValue());
        }
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS273S0300000_29 awS273S0300000_29) {
        ((C196990125k) awS273S0300000_29.l0).LIZIZ((List) awS273S0300000_29.l1);
        ((Function1) awS273S0300000_29.l2).invoke((C196990125k) awS273S0300000_29.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AwS273S0300000_29 awS273S0300000_29) {
        C705930RmZ c705930RmZ;
        C1239510iMP c1239510iMP = C1239510iMP.LIZ;
        Context context = ((C20280014Ww) awS273S0300000_29.l0).getContext();
        DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) ((C1664680tQA) awS273S0300000_29.l1).LIZ;
        C19591211ks interactStickerContainerCommonParam = ((C20280014Ww) awS273S0300000_29.l0).getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null) {
            c705930RmZ = interactStickerContainerCommonParam.LJFF;
        } else {
            c705930RmZ = null;
        }
        AwS244S0300000_35 awS244S0300000_35 = new AwS244S0300000_35((C1664680tQA) awS273S0300000_29.l1, (Aweme) awS273S0300000_29.l2, (C20280014Ww) awS273S0300000_29.l0, 9);
        c1239510iMP.getClass();
        C1239510iMP.LIZ(context, dMGroupChatStickerModel, c705930RmZ, awS244S0300000_35);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$28(AwS273S0300000_29 awS273S0300000_29) {
        C705930RmZ c705930RmZ;
        C1239510iMP c1239510iMP = C1239510iMP.LIZ;
        Context context = ((C20280014Ww) awS273S0300000_29.l0).getContext();
        DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) ((C1664680tQA) awS273S0300000_29.l1).LIZ;
        C19591211ks interactStickerContainerCommonParam = ((C20280014Ww) awS273S0300000_29.l0).getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null) {
            c705930RmZ = interactStickerContainerCommonParam.LJFF;
        } else {
            c705930RmZ = null;
        }
        AwS244S0300000_35 awS244S0300000_35 = new AwS244S0300000_35((C1664680tQA) awS273S0300000_29.l1, (Aweme) awS273S0300000_29.l2, (C20280014Ww) awS273S0300000_29.l0, 10);
        c1239510iMP.getClass();
        C1239510iMP.LIZ(context, dMGroupChatStickerModel, c705930RmZ, awS244S0300000_35);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$29(AwS273S0300000_29 awS273S0300000_29) {
        C705930RmZ c705930RmZ;
        C1239510iMP c1239510iMP = C1239510iMP.LIZ;
        Context context = ((C20280014Ww) awS273S0300000_29.l0).getContext();
        DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) ((C1664680tQA) awS273S0300000_29.l1).LIZ;
        C19591211ks interactStickerContainerCommonParam = ((C20280014Ww) awS273S0300000_29.l0).getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null) {
            c705930RmZ = interactStickerContainerCommonParam.LJFF;
        } else {
            c705930RmZ = null;
        }
        AwS244S0300000_35 awS244S0300000_35 = new AwS244S0300000_35((C1664680tQA) awS273S0300000_29.l1, (Aweme) awS273S0300000_29.l2, (C20280014Ww) awS273S0300000_29.l0, 11);
        c1239510iMP.getClass();
        C1239510iMP.LIZ(context, dMGroupChatStickerModel, c705930RmZ, awS244S0300000_35);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS273S0300000_29 awS273S0300000_29) {
        boolean z;
        ((C12G2) awS273S0300000_29.l0).LIZJ = ((C12G1) awS273S0300000_29.l1).LLLLLLLLLL((RecyclerView.ViewHolder) awS273S0300000_29.l2);
        C12G2 c12g2 = (C12G2) awS273S0300000_29.l0;
        float f = C1428310nGv.LIZLLL(((RecyclerView.ViewHolder) awS273S0300000_29.l2).itemView).bottom;
        View view = ((C12G1) awS273S0300000_29.l1).LLJJJJ;
        if (view == null) {
            view = null;
        }
        if (f > C1428310nGv.LIZLLL(view).top) {
            z = true;
        } else {
            z = false;
        }
        c12g2.LJ = z;
        ((C12G1) awS273S0300000_29.l1).LLLLLLLZIL(((C12G2) awS273S0300000_29.l0).LIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS273S0300000_29 awS273S0300000_29) {
        C19713012Au.i0((C19713012Au) awS273S0300000_29.l0, (C118300cf) awS273S0300000_29.l1, (Function0) awS273S0300000_29.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS273S0300000_29 awS273S0300000_29) {
        String aid;
        BaseShortVideoContext baseShortVideoContext;
        ArrayList<ImportVideoInfo> importInfoList;
        C11V3.LIZ.getClass();
        C11V3 c11v3 = (C11V3) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(C11V3.class);
        Aweme aweme = (Aweme) awS273S0300000_29.l0;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl = (CapcutPromotionPopupServiceImpl) awS273S0300000_29.l1;
        PublishModel publishModel = (PublishModel) awS273S0300000_29.l2;
        capcutPromotionPopupServiceImpl.getClass();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModelKt videoPublishEditModelKt = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
        }
        if (videoPublishEditModelKt != null && (importInfoList = videoPublishEditModelKt.getImportInfoList()) != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                String description = it2.next().getDescription();
                if (description != null) {
                    try {
                        String strOptString = new JSONObject(new JSONObject(description).optString("data")).optString("product");
                        if (C123100dR.LIZ(strOptString)) {
                            arrayList.add(strOptString);
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return c11v3.LIZ(aid, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62)).execute().LIZIZ;
    }

    public static final Object invoke$32(AwS273S0300000_29 awS273S0300000_29) {
        ViewGroup viewGroup;
        NormalTrackTimeStamp normalTrackTimeStamp;
        C19595711lb c19595711lb = (C19595711lb) awS273S0300000_29.l0;
        LifecycleOwner lifecycleOwner = ((C19598911m7) awS273S0300000_29.l1).LJ().LJIIJJI;
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) awS273S0300000_29.l2;
        if (!c19595711lb.LLJ) {
            ViewParent parent = c19595711lb.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                if (width > 0 && height > 0 && (normalTrackTimeStamp = (NormalTrackTimeStamp) C13LP.LJJJLL(interactStickerStruct.getTrackTimeStampCache())) != null) {
                    TuxTextView tuxTextView = new TuxTextView(c19595711lb.LLILZIL, null, 6, 0);
                    tuxTextView.setId(R.id.w7j);
                    tuxTextView.setText(tuxTextView.getContext().getString(2131827017));
                    tuxTextView.setTuxFont(102);
                    tuxTextView.setTextColorRes(R.attr.ee);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zf, tuxTextView.getContext());
                    if (numLIZJ != null) {
                        tuxTextView.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ.intValue());
                    }
                    tuxTextView.setTextAlignment(4);
                    C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(156)), -2));
                    float f = 2;
                    C786410Ut5.Jd(tuxTextView, (normalTrackTimeStamp.getX() * width) - (C418440Gaw.LIZIZ(156) / f));
                    C786410Ut5.Od(tuxTextView, ((normalTrackTimeStamp.getY() - (normalTrackTimeStamp.getHeight() / f)) * height) - C418440Gaw.LIZIZ(28));
                    viewGroup.addView(tuxTextView);
                    c19595711lb.LLJ = true;
                    c19595711lb.LLIZLLLIL = tuxTextView;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C860720Xpe(lifecycleOwner, c19595711lb, null), 3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS273S0300000_29 awS273S0300000_29) throws JSONException {
        if (C1044430dHl.LIZ().enable) {
            String str = C1044430dHl.LIZ().video;
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = ((View) awS273S0300000_29.l0).getContext();
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        } else {
            int i = ((AnchorPublishStruct) awS273S0300000_29.l1).type;
            JSONObject jSONObject = new JSONObject();
            C19510811Va c19510811Va = (C19510811Va) awS273S0300000_29.l2;
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) awS273S0300000_29.l1;
            jSONObject.put("add_from", c19510811Va.LL);
            jSONObject.put("subtype", anchorPublishStruct.subtype);
            jSONObject.put("third_id", anchorPublishStruct.getLeadsPageId);
            C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(i, C786410Ut5.J3(jSONObject), ((AnchorPublishStruct) awS273S0300000_29.l1).title, "", 1, "", null, true, "", "", Long.MAX_VALUE, "", ((AnchorPublishStruct) awS273S0300000_29.l1).subtype, true, null, null, null, null, 0, -1, null, null)));
            C11G7 c11g7 = ((C19510811Va) awS273S0300000_29.l2).LLJILLL;
            if (c11g7 != null) {
                c11g7.dismiss();
                C785410UrT.LIZ(c11g7);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS273S0300000_29 awS273S0300000_29) {
        ((C19756712Rp) awS273S0300000_29.l0).S5((EnumC1461710o8n) awS273S0300000_29.l1, (Pair) ((C259800zU) awS273S0300000_29.l2).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS273S0300000_29 awS273S0300000_29) {
        ((C19756812Rq) awS273S0300000_29.l0).N5((EnumC1461710o8n) awS273S0300000_29.l1, (Pair) ((C259800zU) awS273S0300000_29.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS273S0300000_29 awS273S0300000_29) {
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = (C19EG) awS273S0300000_29.l0;
        C705930RmZ c705930RmZ = (C705930RmZ) awS273S0300000_29.l1;
        c19582611jU.getClass();
        C19582611jU.LIZIZ(c19eg, c705930RmZ);
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS273S0300000_29.l2).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS273S0300000_29 awS273S0300000_29) {
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS273S0300000_29.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = (C19EG) awS273S0300000_29.l1;
        C705930RmZ c705930RmZ = (C705930RmZ) awS273S0300000_29.l2;
        c19582611jU.getClass();
        C19582611jU.LIZIZ(c19eg, c705930RmZ);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS273S0300000_29 awS273S0300000_29) {
        String str;
        String str2;
        String str3;
        String str4;
        String pollStickerId;
        String str5;
        String str6;
        String str7;
        String str8;
        InterfaceC19598211m0 interfaceC19598211m0;
        List<PollStruct.OptionsBean> options;
        String pollStickerId2;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C0R60 c0r605;
        C0R60 c0r606;
        C0R60 c0r607;
        C0R60 c0r608;
        C0P0T c0p0t = (C0P0T) ((C259800zU) awS273S0300000_29.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C19597811lw c19597811lw = (C19597811lw) awS273S0300000_29.l1;
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) awS273S0300000_29.l2;
        c19597811lw.getClass();
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C705930RmZ c705930RmZ = c19597811lw.LLILZ;
        c19582611jU.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment = null;
        if (c705930RmZ != null && (c0r608 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r608.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (c705930RmZ != null && (c0r607 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r607.LIZJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c705930RmZ != null && (c0r606 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r606.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        if (c705930RmZ != null && (c0r605 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r605.LIZ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        StickerAttrStruct stickerAttrStructLIZ = C19580611jA.LIZ(interactStickerStruct);
        String str9 = "";
        if (stickerAttrStructLIZ == null || (pollStickerId = stickerAttrStructLIZ.getPollStickerId()) == null) {
            pollStickerId = "";
        }
        c2344009Gk.LJIIIIZZ("prop_id", pollStickerId);
        C20684815ws.LJIILLIIL("poll_prop_label_click", c2344009Gk.LIZ);
        C705930RmZ c705930RmZ2 = c19597811lw.LLILZ;
        C19EG c19eg = c19597811lw.LLILLL;
        InterfaceC19632811ra interfaceC19632811ra = c19597811lw.LLILZLL;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        if (c705930RmZ2 != null && (c0r604 = c705930RmZ2.LJIIZILJ) != null) {
            str5 = c0r604.LIZLLL;
        } else {
            str5 = null;
        }
        c2344009Gk2.LJIIIIZZ("group_id", str5);
        if (c705930RmZ2 != null && (c0r603 = c705930RmZ2.LJIIZILJ) != null) {
            str6 = c0r603.LIZJ;
        } else {
            str6 = null;
        }
        c2344009Gk2.LJIIIIZZ("author_id", str6);
        if (c705930RmZ2 != null && (c0r602 = c705930RmZ2.LJIIZILJ) != null) {
            str7 = c0r602.LJ;
        } else {
            str7 = null;
        }
        c2344009Gk2.LJIIIIZZ("log_pb", str7);
        if (c705930RmZ2 != null && (c0r60 = c705930RmZ2.LJIIZILJ) != null) {
            str8 = c0r60.LIZ;
        } else {
            str8 = null;
        }
        c2344009Gk2.LJIIIIZZ("enter_from", str8);
        StickerAttrStruct stickerAttrStructLIZ2 = C19580611jA.LIZ(interactStickerStruct);
        if (stickerAttrStructLIZ2 != null && (pollStickerId2 = stickerAttrStructLIZ2.getPollStickerId()) != null) {
            str9 = pollStickerId2;
        }
        c2344009Gk2.LJIIIIZZ("prop_id", str9);
        C20684815ws.LJIILLIIL("enter_poll_detail", c2344009Gk2.LIZ);
        PollStruct pollStruct = interactStickerStruct.getPollStruct();
        if (pollStruct != null && (options = pollStruct.getOptions()) != null && options.size() >= 2) {
            pollBottomSheetDialogFragment = new PollBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "key_poll", pollStruct);
            pollBottomSheetDialogFragment.setArguments(bundle);
        }
        c19eg.getSupportFragmentManager().LJJJJL();
        if (pollBottomSheetDialogFragment != null) {
            if (!pollBottomSheetDialogFragment.isAdded() && !pollBottomSheetDialogFragment.isVisible() && !pollBottomSheetDialogFragment.isRemoving()) {
                pollBottomSheetDialogFragment.LLJ = interfaceC19632811ra;
                pollBottomSheetDialogFragment.show(c19eg.getSupportFragmentManager(), "VoteBottomSheetDialogFragment");
                pollBottomSheetDialogFragment.LLIZLLLIL = new C1258350iqn(c705930RmZ2);
                if (c705930RmZ2 != null) {
                    interfaceC19598211m0.LIZLLL();
                }
            }
        } else if (c705930RmZ2 != null && (interfaceC19598211m0 = c705930RmZ2.LJIILJJIL) != null) {
            interfaceC19598211m0.LIZLLL();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS273S0300000_29(X.C19EG r3, X.C19EG r4, X.C705930RmZ r5, X.C259800zU<X.C0P0T> r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 7 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS273S0300000_29.<init>(X.19EG, X.0RmZ, X.00zU, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C259800zU c259800zU, C259800zU<C0P0T> c259800zU2, C19597811lw c19597811lw, InteractStickerStruct interactStickerStruct) {
        super(0);
        this.$t = interactStickerStruct;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c19597811lw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C013C c013c, C013C c013c2, C259800zU<TuxSheet> c259800zU, EcTakePhotoActivity ecTakePhotoActivity) {
        super(0);
        this.$t = ecTakePhotoActivity;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C1664680tQA c1664680tQA, Aweme aweme, C20280014Ww c20280014Ww, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20280014Ww;
        this.l1 = c1664680tQA;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(AbstractC194339111l abstractC194339111l, AbstractC194339111l<T> abstractC194339111l2, T t, T t2) {
        super(0);
        this.$t = t2;
        this.l0 = abstractC194339111l;
        this.l1 = abstractC194339111l2;
        this.l2 = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C19461111Bx c19461111Bx, Activity activity, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19461111Bx;
        this.l1 = activity;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C11GO c11go, Context context, AttributeSet attributeSet, int i) {
        super(0);
        this.$t = i;
        this.l0 = c11go;
        this.l1 = context;
        this.l2 = attributeSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C11YC c11yc, RuntimeException runtimeException, C11YV c11yv, int i) {
        super(0);
        this.$t = i;
        this.l0 = c11yc;
        this.l1 = runtimeException;
        this.l2 = c11yv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C19568211hA c19568211hA, C19568211hA<Object, Object> c19568211hA2, Object obj, InterfaceC19568511hD<Object, Object> interfaceC19568511hD) {
        super(0);
        this.$t = interfaceC19568511hD;
        this.l0 = c19568211hA;
        this.l1 = c19568211hA2;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C19595711lb c19595711lb, C19598911m7 c19598911m7, InteractStickerStruct interactStickerStruct, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19595711lb;
        this.l1 = c19598911m7;
        this.l2 = interactStickerStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C19596011le c19596011le, C19596011le c19596011le2, VideoShareInfoStruct videoShareInfoStruct, C259800zU<C0P0T> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c19596011le;
        this.l1 = c19596011le2;
        this.l2 = videoShareInfoStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C19601011mS c19601011mS, InteractStickerStruct interactStickerStruct, C259800zU c259800zU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c19601011mS;
        this.l2 = interactStickerStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C196990125k c196990125k, C196990125k c196990125k2, List<TextFontStyleData> list, Function1<? super View, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c196990125k;
        this.l1 = c196990125k2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C19713012Au c19713012Au, C19713012Au c19713012Au2, C118300cf c118300cf, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c19713012Au;
        this.l1 = c19713012Au2;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C12G2 c12g2, C12G1 c12g1, RecyclerView.ViewHolder viewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = c12g2;
        this.l1 = c12g1;
        this.l2 = viewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C19756712Rp c19756712Rp, C19756712Rp c19756712Rp2, EnumC1461710o8n enumC1461710o8n, C259800zU<Pair<NLETrackSlot, Long>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c19756712Rp;
        this.l1 = c19756712Rp2;
        this.l2 = enumC1461710o8n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(C19756812Rq c19756812Rq, C19756812Rq c19756812Rq2, EnumC1461710o8n enumC1461710o8n, C259800zU<Pair<NLETrackSlot, Long>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c19756812Rq;
        this.l1 = c19756812Rq2;
        this.l2 = enumC1461710o8n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(Context context, C19512911Vv c19512911Vv, C19513311Vz c19513311Vz, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c19512911Vv;
        this.l2 = c19513311Vz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(Context context, C19581611jK c19581611jK, C705930RmZ c705930RmZ, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c19581611jK;
        this.l2 = c705930RmZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(Context context, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = interactStickerStruct;
        this.l2 = c705930RmZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(View view, RunnableC194343111p runnableC194343111p, ObjectAnimator objectAnimator, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = runnableC194343111p;
        this.l2 = objectAnimator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(View view, LiveCenterTopNoticeWidget liveCenterTopNoticeWidget, C1164504h1 c1164504h1, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = liveCenterTopNoticeWidget;
        this.l2 = c1164504h1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(View view, AnchorPublishStruct anchorPublishStruct, C19510811Va c19510811Va, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = anchorPublishStruct;
        this.l2 = c19510811Va;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(FlowLifecycleAwareCollector flowLifecycleAwareCollector, FlowLifecycleAwareCollector<T> flowLifecycleAwareCollector2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super(0);
        this.$t = event;
        this.l0 = flowLifecycleAwareCollector;
        this.l1 = flowLifecycleAwareCollector2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(LifecycleAwareObserverNew lifecycleAwareObserverNew, LifecycleAwareObserverNew<T> lifecycleAwareObserverNew2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super(0);
        this.$t = event;
        this.l0 = lifecycleAwareObserverNew;
        this.l1 = lifecycleAwareObserverNew2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(Aweme aweme, CapcutPromotionPopupServiceImpl capcutPromotionPopupServiceImpl, PublishModel publishModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = capcutPromotionPopupServiceImpl;
        this.l2 = publishModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(StickerModel stickerModel, StickerModel stickerModel2, List<UserInvitee> list, C19643111tF c19643111tF) {
        super(0);
        this.$t = c19643111tF;
        this.l0 = stickerModel;
        this.l1 = stickerModel2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(Pair pair, Pair<Integer, Integer> pair2, C19556311fF c19556311fF, C19553011ei c19553011ei) {
        super(0);
        this.$t = c19553011ei;
        this.l0 = pair;
        this.l1 = pair2;
        this.l2 = c19556311fF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS273S0300000_29(Function1 function1, Function1<? super View, Unit> function12, TuxIconView tuxIconView, C19471611Fy c19471611Fy) {
        super(0);
        this.$t = c19471611Fy;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS273S0300000_29(C19624011qA c19624011qA, View view, C19623911q9 c19623911q9, InteractStickerStruct interactStickerStruct, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c19623911q9;
        this.l2 = interactStickerStruct;
    }
}
