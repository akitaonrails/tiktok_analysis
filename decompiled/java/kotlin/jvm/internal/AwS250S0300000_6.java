package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0H75;
import X.C0H76;
import X.C0HLE;
import X.C0HLG;
import X.C0HLS;
import X.C0I5R;
import X.C0ICC;
import X.C0IDR;
import X.C1066100dqi;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1388190mED;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1607100rvI;
import X.C1662100tM0;
import X.C16AZ;
import X.C19EG;
import X.C20684815ws;
import X.C2172401A0g;
import X.C2172411A0h;
import X.C2243571Crb;
import X.C2344009Gk;
import X.C259800zU;
import X.C441730HTv;
import X.C448440HiE;
import X.C457480Hwo;
import X.C457500Hwq;
import X.C457780HxI;
import X.C461620I8i;
import X.C463050IDv;
import X.C631370Opb;
import X.C736950SvV;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC1338240kve;
import X.EnumC451180Hme;
import X.InterfaceC0148002o;
import X.ViewTreeObserverOnPreDrawListenerC429930GtT;
import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayout.ImageSpecVH2;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayout.ImageWithTextSpecVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListCommentClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGifClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGroupInviteCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRepostClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareLiveEventClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomVM;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import r4b.g;

/* JADX INFO: loaded from: classes7.dex */
public class AwS250S0300000_6 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS250S0300000_6 awS250S0300000_6) {
        MessageListCommentClickAbility messageListCommentClickAbility = (MessageListCommentClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListCommentClickAbility.class, null);
        if (messageListCommentClickAbility != null) {
            Context context = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext();
            C869590Y9l c869590Y9l = (C869590Y9l) awS250S0300000_6.l1;
            String awemeId = ((CommentContent) awS250S0300000_6.l2).getAwemeId();
            if (awemeId != null) {
                String commentId = ((CommentContent) awS250S0300000_6.l2).getCommentId();
                if (commentId == null) {
                    commentId = "";
                }
                messageListCommentClickAbility.Sa1(context, c869590Y9l, awemeId, commentId);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS250S0300000_6 awS250S0300000_6) {
        MessageListRepostClickAbility messageListRepostClickAbility = (MessageListRepostClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListRepostClickAbility.class, null);
        if (messageListRepostClickAbility != null) {
            messageListRepostClickAbility.eI2(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext(), (C869590Y9l) awS250S0300000_6.l1, String.valueOf(((ShareRepostCardTemplate) awS250S0300000_6.l2).shareRepost.itemId), String.valueOf(((ShareRepostCardTemplate) awS250S0300000_6.l2).shareRepost.repostUserInfo.userId));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.W32(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), (ShareLiveContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS250S0300000_6 awS250S0300000_6) {
        C0HLG.LJ(C0HLE.CLOSE, (C0HLS) ((C05P0) ((C259800zU) awS250S0300000_6.l1).element).getValue(), ((SocialAvatarCameraSceneV2) ((BaseSocialAvatarCameraScene) awS250S0300000_6.l0)).LLLF.LLJLLL.LJIILLIIL);
        ((C05P0) awS250S0300000_6.l2).setValue(Boolean.valueOf(false));
        ((SocialAvatarCameraSceneV2) ((BaseSocialAvatarCameraScene) awS250S0300000_6.l0)).LLLF.getClass();
        BaseSocialAvatarCameraScene baseSocialAvatarCameraScene = (BaseSocialAvatarCameraScene) awS250S0300000_6.l0;
        ((SocialAvatarCameraSceneV2) baseSocialAvatarCameraScene).LLLF.LLJLLL.LJIILIIL = "click_close";
        baseSocialAvatarCameraScene.finish();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS250S0300000_6 awS250S0300000_6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "regenerate");
        c2344009Gk.LJIIIIZZ("enter_from", ((SocialAvatarReviewFragment) awS250S0300000_6.l0).getEnterFrom());
        C20684815ws.LJIILLIIL("ttsocial_avatar_try_new_look_popup", c2344009Gk.LIZ);
        ((SocialAvatarReviewFragment) awS250S0300000_6.l0).dS((Context) awS250S0300000_6.l1, true);
        ((Function0) awS250S0300000_6.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS250S0300000_6 awS250S0300000_6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "not_now");
        c2344009Gk.LJIIIIZZ("enter_from", ((SocialAvatarReviewFragment) awS250S0300000_6.l0).getEnterFrom());
        C20684815ws.LJIILLIIL("ttsocial_avatar_try_new_look_popup", c2344009Gk.LIZ);
        ((Function0) awS250S0300000_6.l1).invoke();
        ((Function0) awS250S0300000_6.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS250S0300000_6 awS250S0300000_6) {
        C1066100dqi c1066100dqi = new C1066100dqi();
        ImageSpecVH2 imageSpecVH2 = (ImageSpecVH2) awS250S0300000_6.l2;
        C2172411A0h c2172411A0h = (C2172411A0h) awS250S0300000_6.l0;
        c1066100dqi.LIZJ = "sku_detail";
        c1066100dqi.LIZ(imageSpecVH2.getLayoutPosition());
        c1066100dqi.LIZJ(c2172411A0h.LIZ.toThumbFirstImageUrlModel());
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = ((C2172411A0h) awS250S0300000_6.l0).LIZ;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
        c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = ((g) awS250S0300000_6.l1).LLJJ();
        c1331670kl3LJ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, ((ImageSpecVH2) awS250S0300000_6.l2).itemView.getContext()));
        c1331670kl3LJ.LJJ(((ImageSpecVH2) awS250S0300000_6.l2).LLJJJIL);
        c1331670kl3LJ.LJIIJ(new C463050IDv(c1066100dqi, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS250S0300000_6 awS250S0300000_6) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = ((C2172401A0g) awS250S0300000_6.l0).LIZ;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
        c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJ.LJJI = C1326790kdB.LIZJ;
        c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, ((ImageWithTextSpecVH) awS250S0300000_6.l1).itemView.getContext()));
        c1331670kl3LJ.LJJ(((ImageWithTextSpecVH) awS250S0300000_6.l1).c6());
        c1331670kl3LJ.LJIIJ(new C463050IDv((C1066100dqi) awS250S0300000_6.l2, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS250S0300000_6 awS250S0300000_6) {
        ((C441730HTv) awS250S0300000_6.l0).n0((C1662100tM0) awS250S0300000_6.l1, (View) awS250S0300000_6.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS250S0300000_6 awS250S0300000_6) {
        String string;
        Activity activityLIZ = C1388190mED.LIZ(((View) awS250S0300000_6.l0).getContext());
        if (activityLIZ != null) {
            DefaultStickerClickHandler defaultStickerClickHandler = (DefaultStickerClickHandler) awS250S0300000_6.l1;
            StickerTemplate stickerTemplate = (StickerTemplate) awS250S0300000_6.l2;
            Long lLIZIZ = C2243571Crb.LIZIZ(stickerTemplate);
            if (lLIZIZ != null) {
                string = lLIZIZ.toString();
            } else {
                string = null;
            }
            String strLIZ = C2243571Crb.LIZ(stickerTemplate);
            String strValueOf = String.valueOf(C2243571Crb.LIZLLL(stickerTemplate));
            defaultStickerClickHandler.getClass();
            DefaultStickerClickHandler.LJFF(activityLIZ, string, strLIZ, strValueOf);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$18(AwS250S0300000_6 awS250S0300000_6) {
        int iIntValue;
        C0H75 c0h75 = (C0H75) awS250S0300000_6.l0;
        c0h75.LL = (List) awS250S0300000_6.l1;
        c0h75.LLILLJJLI.clear();
        List list = (List) awS250S0300000_6.l1;
        C0H75 c0h752 = (C0H75) awS250S0300000_6.l0;
        Function1 function1 = (Function1) awS250S0300000_6.l2;
        for (Object obj : list) {
            HashMap<D, Integer> map = c0h752.LLILLJJLI;
            if (function1 != null) {
                iIntValue = ((Number) function1.invoke(obj)).intValue();
            } else {
                iIntValue = 0;
            }
            map.put((D) obj, Integer.valueOf(iIntValue));
        }
        ((C0H75) awS250S0300000_6.l0).notifyDataSetChanged();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS250S0300000_6 awS250S0300000_6) {
        if (Intrinsics.LJFF(((RelationButton) awS250S0300000_6.l0).getTag(86573056), ((User) awS250S0300000_6.l1).getUid())) {
            C1607100rvI c1607100rvI = (C1607100rvI) awS250S0300000_6.l2;
            RelationButton relationButton = (RelationButton) awS250S0300000_6.l0;
            c1607100rvI.getClass();
            if (relationButton != null) {
                ViewPropertyAnimator duration = relationButton.animate().scaleX(0.3f).scaleY(0.3f).setDuration(150L);
                ViewPropertyAnimator startDelay = relationButton.animate().alpha(0.0f).setDuration(100L).setStartDelay(50L);
                duration.start();
                startDelay.withEndAction(new ARunnableS106S0100000_6((Object) relationButton, 289)).start();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS250S0300000_6 awS250S0300000_6) {
        MessageListShareLiveEventClickAbility messageListShareLiveEventClickAbility = (MessageListShareLiveEventClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListShareLiveEventClickAbility.class, null);
        if (messageListShareLiveEventClickAbility != null) {
            messageListShareLiveEventClickAbility.CC2(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), (C869590Y9l) awS250S0300000_6.l1, (ShareLiveEventContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS250S0300000_6 awS250S0300000_6) {
        GameChallengeChatroomVM gameChallengeChatroomVM = (GameChallengeChatroomVM) ((C736950SvV) awS250S0300000_6.l2).getValue();
        C869590Y9l c869590Y9l = (C869590Y9l) awS250S0300000_6.l0;
        GameChallengeCardTemplate gameChallengeCardTemplate = ((C0ICC) C631370Opb.LIZ((GameChallengeCardReusedUISlot) awS250S0300000_6.l1)).LLILZ;
        ((GameChallengeCardReusedUISlot) awS250S0300000_6.l1).tp().getChatType();
        gameChallengeChatroomVM.vQ2(c869590Y9l, gameChallengeCardTemplate);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS250S0300000_6 awS250S0300000_6) {
        return new C16AZ((View) awS250S0300000_6.l0, ((C457780HxI) ((C1559260qg8) awS250S0300000_6.l1).getValue()).LL, new C457480Hwo((IAlbumUpdateGuideViewModel) ((C736950SvV) awS250S0300000_6.l2).getValue()), new C457500Hwq((IAlbumUpdateGuideViewModel) ((C736950SvV) awS250S0300000_6.l2).getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$22(AwS250S0300000_6 awS250S0300000_6) {
        if (((View) ((C259800zU) awS250S0300000_6.l0).element).getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(((View) ((C259800zU) awS250S0300000_6.l0).element).getViewTreeObserver(), (ViewTreeObserver.OnPreDrawListener) awS250S0300000_6.l1);
        }
        ((View) ((C259800zU) awS250S0300000_6.l0).element).removeOnAttachStateChangeListener((C0IDR) awS250S0300000_6.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS250S0300000_6 awS250S0300000_6) {
        String str;
        FragmentManager supportFragmentManager;
        MessageListStickerClickAbility messageListStickerClickAbility = (MessageListStickerClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListStickerClickAbility.class, null);
        if (messageListStickerClickAbility != null && (str = ((StickerTemplate) awS250S0300000_6.l1).baseRequestComponent.queryData.extras.get("a:sticker_type")) != null) {
            if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.STATIC.getType())) && !Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.ANIMATED.getType()))) {
                if (Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()))) {
                    View viewLJJIJL = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        messageListStickerClickAbility.up1(viewLJJIJL, supportFragmentManager, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                } else if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType())) && !Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType()))) {
                    View viewLJJIJL2 = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ2 != null) {
                        messageListStickerClickAbility.zM(viewLJJIJL2, c19egLIZIZ2, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                } else {
                    View viewLJJIJL3 = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ3 != null) {
                        messageListStickerClickAbility.dH1(viewLJJIJL3, c19egLIZIZ3, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                }
            } else {
                C19EG c19egLIZIZ4 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                if (c19egLIZIZ4 != null) {
                    messageListStickerClickAbility.Gl1(c19egLIZIZ4, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS250S0300000_6 awS250S0300000_6) {
        MessageListGifClickAbility messageListGifClickAbility = (MessageListGifClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListGifClickAbility.class, null);
        if (messageListGifClickAbility != null) {
            messageListGifClickAbility.Qw2((GifContent) awS250S0300000_6.l1, (C869590Y9l) awS250S0300000_6.l2, ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS250S0300000_6 awS250S0300000_6) {
        Aweme awemeLJIJ;
        MessageListPhotoClickAbility messageListPhotoClickAbility = (MessageListPhotoClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListPhotoClickAbility.class, null);
        if (messageListPhotoClickAbility != null) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null && (awemeLJIJ = iMCameraBridgeApiLIZ.LJIJ((C869590Y9l) awS250S0300000_6.l1, Boolean.FALSE)) != null) {
                messageListPhotoClickAbility.wM0(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).getContentView(), (C869590Y9l) awS250S0300000_6.l1, awemeLJIJ, (PictureCardTemplate) awS250S0300000_6.l2, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.W32(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), (ShareLiveContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS250S0300000_6 awS250S0300000_6) {
        MessageListCommentClickAbility messageListCommentClickAbility = (MessageListCommentClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListCommentClickAbility.class, null);
        if (messageListCommentClickAbility != null) {
            Context context = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext();
            C869590Y9l c869590Y9l = (C869590Y9l) awS250S0300000_6.l1;
            String awemeId = ((CommentContent) awS250S0300000_6.l2).getAwemeId();
            if (awemeId != null) {
                String commentId = ((CommentContent) awS250S0300000_6.l2).getCommentId();
                if (commentId == null) {
                    commentId = "";
                }
                messageListCommentClickAbility.Sa1(context, c869590Y9l, awemeId, commentId);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS250S0300000_6 awS250S0300000_6) {
        MessageListRepostClickAbility messageListRepostClickAbility = (MessageListRepostClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListRepostClickAbility.class, null);
        if (messageListRepostClickAbility != null) {
            messageListRepostClickAbility.eI2(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext(), (C869590Y9l) awS250S0300000_6.l1, String.valueOf(((ShareRepostCardTemplate) awS250S0300000_6.l2).shareRepost.itemId), String.valueOf(((ShareRepostCardTemplate) awS250S0300000_6.l2).shareRepost.repostUserInfo.userId));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS250S0300000_6 awS250S0300000_6) {
        MessageListShareLiveEventClickAbility messageListShareLiveEventClickAbility = (MessageListShareLiveEventClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListShareLiveEventClickAbility.class, null);
        if (messageListShareLiveEventClickAbility != null) {
            messageListShareLiveEventClickAbility.CC2(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), (C869590Y9l) awS250S0300000_6.l1, (ShareLiveEventContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS250S0300000_6 awS250S0300000_6) {
        MessageListGroupInviteCardClickAbility messageListGroupInviteCardClickAbility = (MessageListGroupInviteCardClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListGroupInviteCardClickAbility.class, null);
        if (messageListGroupInviteCardClickAbility != null) {
            messageListGroupInviteCardClickAbility.lB1((C869590Y9l) awS250S0300000_6.l1, (GroupInviteCardContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS250S0300000_6 awS250S0300000_6) {
        MessageListGroupInviteCardClickAbility messageListGroupInviteCardClickAbility = (MessageListGroupInviteCardClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListGroupInviteCardClickAbility.class, null);
        if (messageListGroupInviteCardClickAbility != null) {
            messageListGroupInviteCardClickAbility.lB1((C869590Y9l) awS250S0300000_6.l1, (GroupInviteCardContent) awS250S0300000_6.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.lC1(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), new C0I5R(Boolean.FALSE, ((DynamicCardClientInfoComponent) awS250S0300000_6.l2).resourceId, null, ((C869590Y9l) awS250S0300000_6.l1).getScene(), false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null && iMCameraBridgeApiLIZ.LJIILIIL((C869590Y9l) awS250S0300000_6.l1, Boolean.valueOf(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).lp())) != null) {
                messageListQuotedMessageClickAbility.RK(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), ((VideoCardTemplate) awS250S0300000_6.l2).baseVideoComponent.id);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS250S0300000_6 awS250S0300000_6) {
        String str;
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            View viewLJJIJL = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
            long msgId = ((C869590Y9l) awS250S0300000_6.l1).getMsgId();
            Long lValueOf = Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType());
            ImageComponent imageComponent = (ImageComponent) awS250S0300000_6.l2;
            if (imageComponent == null || (str = imageComponent.id) == null) {
                str = "";
            }
            messageListQuotedMessageClickAbility.TQ0(viewLJJIJL, msgId, lValueOf, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.lC1(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), new C0I5R(Boolean.FALSE, ((DynamicCardClientInfoComponent) awS250S0300000_6.l2).resourceId, null, ((C869590Y9l) awS250S0300000_6.l1).getScene(), false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS250S0300000_6 awS250S0300000_6) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null && iMCameraBridgeApiLIZ.LJIILIIL((C869590Y9l) awS250S0300000_6.l1, Boolean.valueOf(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).lp())) != null) {
                messageListQuotedMessageClickAbility.RK(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), ((C869590Y9l) awS250S0300000_6.l1).getMsgId(), Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType()), ((VideoCardTemplate) awS250S0300000_6.l2).baseVideoComponent.id);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS250S0300000_6 awS250S0300000_6) {
        String str;
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            View viewLJJIJL = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
            long msgId = ((C869590Y9l) awS250S0300000_6.l1).getMsgId();
            Long lValueOf = Long.valueOf(((C869590Y9l) awS250S0300000_6.l1).getMsgType());
            ImageComponent imageComponent = (ImageComponent) awS250S0300000_6.l2;
            if (imageComponent == null || (str = imageComponent.id) == null) {
                str = "";
            }
            messageListQuotedMessageClickAbility.TQ0(viewLJJIJL, msgId, lValueOf, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS250S0300000_6 awS250S0300000_6) {
        String str;
        FragmentManager supportFragmentManager;
        MessageListStickerClickAbility messageListStickerClickAbility = (MessageListStickerClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListStickerClickAbility.class, null);
        if (messageListStickerClickAbility != null && (str = ((StickerTemplate) awS250S0300000_6.l1).baseRequestComponent.queryData.extras.get("a:sticker_type")) != null) {
            if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.STATIC.getType())) && !Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.ANIMATED.getType()))) {
                if (Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()))) {
                    View viewLJJIJL = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        messageListStickerClickAbility.up1(viewLJJIJL, supportFragmentManager, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                } else if (!Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType())) && !Intrinsics.LJFF(str, String.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType()))) {
                    View viewLJJIJL2 = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ2 != null) {
                        messageListStickerClickAbility.zM(viewLJJIJL2, c19egLIZIZ2, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                } else {
                    View viewLJJIJL3 = ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL();
                    C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                    if (c19egLIZIZ3 != null) {
                        messageListStickerClickAbility.dH1(viewLJJIJL3, c19egLIZIZ3, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                    }
                }
            } else {
                C19EG c19egLIZIZ4 = C1388190mED.LIZIZ(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL().getContext());
                if (c19egLIZIZ4 != null) {
                    messageListStickerClickAbility.Gl1(c19egLIZIZ4, (C869590Y9l) awS250S0300000_6.l2, (StickerTemplate) awS250S0300000_6.l1);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS250S0300000_6 awS250S0300000_6) {
        MessageListGifClickAbility messageListGifClickAbility = (MessageListGifClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListGifClickAbility.class, null);
        if (messageListGifClickAbility != null) {
            messageListGifClickAbility.Qw2((GifContent) awS250S0300000_6.l1, (C869590Y9l) awS250S0300000_6.l2, ((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS250S0300000_6 awS250S0300000_6) {
        Aweme awemeLJIJ;
        MessageListPhotoClickAbility messageListPhotoClickAbility = (MessageListPhotoClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((IMReplyLayoutInputAssem2) awS250S0300000_6.l0), MessageListPhotoClickAbility.class, null);
        if (messageListPhotoClickAbility != null) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null && (awemeLJIJ = iMCameraBridgeApiLIZ.LJIJ((C869590Y9l) awS250S0300000_6.l1, Boolean.FALSE)) != null) {
                messageListPhotoClickAbility.wM0(((IMReplyLayoutInputAssem2) awS250S0300000_6.l0).LJJIJL(), (C869590Y9l) awS250S0300000_6.l1, awemeLJIJ, (PictureCardTemplate) awS250S0300000_6.l2, false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(C259800zU c259800zU, ViewTreeObserverOnPreDrawListenerC429930GtT viewTreeObserverOnPreDrawListenerC429930GtT, C0IDR c0idr, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = viewTreeObserverOnPreDrawListenerC429930GtT;
        this.l2 = c0idr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(C0H75 c0h75, C0H75<Object, C0H76> c0h752, List<Object> list, Function1<Object, Integer> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c0h75;
        this.l1 = c0h752;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(C441730HTv c441730HTv, C1662100tM0 c1662100tM0, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c441730HTv;
        this.l1 = c1662100tM0;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, GameChallengeCardReusedUISlot gameChallengeCardReusedUISlot, C736950SvV<C448440HiE, GameChallengeChatroomVM> c736950SvV) {
        super(0);
        this.$t = c736950SvV;
        this.l0 = c869590Y9l;
        this.l1 = c869590Y9l2;
        this.l2 = gameChallengeCardReusedUISlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(C2172401A0g c2172401A0g, ImageWithTextSpecVH imageWithTextSpecVH, C1066100dqi c1066100dqi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2172401A0g;
        this.l1 = imageWithTextSpecVH;
        this.l2 = c1066100dqi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(C2172411A0h c2172411A0h, g gVar, ImageSpecVH2 imageSpecVH2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2172411A0h;
        this.l1 = gVar;
        this.l2 = imageSpecVH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(View view, View view2, C1559260qg8<C457780HxI> c1559260qg8, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV) {
        super(0);
        this.$t = c736950SvV;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c1559260qg8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, CommentContent commentContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = commentContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = groupInviteCardContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, ShareLiveContent shareLiveContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = shareLiveContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = shareLiveEventContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, PictureCardTemplate pictureCardTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = pictureCardTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, ShareRepostCardTemplate shareRepostCardTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = shareRepostCardTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, VideoCardTemplate videoCardTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = videoCardTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, DynamicCardClientInfoComponent dynamicCardClientInfoComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = dynamicCardClientInfoComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, C869590Y9l c869590Y9l, ImageComponent imageComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = c869590Y9l;
        this.l2 = imageComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, GifContent gifContent, C869590Y9l c869590Y9l, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = gifContent;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(IMReplyLayoutInputAssem2 iMReplyLayoutInputAssem2, StickerTemplate stickerTemplate, C869590Y9l c869590Y9l, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMReplyLayoutInputAssem2;
        this.l1 = stickerTemplate;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(User user, RelationButton relationButton, C1607100rvI c1607100rvI, int i) {
        super(0);
        this.$t = i;
        this.l0 = relationButton;
        this.l1 = user;
        this.l2 = c1607100rvI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, BaseSocialAvatarCameraScene baseSocialAvatarCameraScene2, C259800zU<C05P0<C0HLS>> c259800zU, C05P0<Boolean> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = baseSocialAvatarCameraScene;
        this.l1 = baseSocialAvatarCameraScene2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS250S0300000_6(RoundingCornerLayout roundingCornerLayout, DefaultStickerClickHandler defaultStickerClickHandler, StickerTemplate stickerTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = roundingCornerLayout;
        this.l1 = defaultStickerClickHandler;
        this.l2 = stickerTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(SocialAvatarReviewFragment socialAvatarReviewFragment, SocialAvatarReviewFragment socialAvatarReviewFragment2, Context context, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = socialAvatarReviewFragment;
        this.l1 = socialAvatarReviewFragment2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS250S0300000_6(SocialAvatarReviewFragment socialAvatarReviewFragment, SocialAvatarReviewFragment socialAvatarReviewFragment2, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = socialAvatarReviewFragment;
        this.l1 = socialAvatarReviewFragment2;
        this.l2 = function0;
    }
}
