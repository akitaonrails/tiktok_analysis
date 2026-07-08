package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C01GW;
import X.C05P0;
import X.C09AY;
import X.C0H56;
import X.C0H7U;
import X.C0HQX;
import X.C0I03;
import X.C0I04;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1628906Zj;
import X.C1668330tW3;
import X.C1680510tph;
import X.C1680520tpi;
import X.C19EG;
import X.C2097608Jq;
import X.C23250099c;
import X.C291001Au;
import X.C370240EfO;
import X.C426750GoL;
import X.C434820H3g;
import X.C436180H8m;
import X.C440750HQb;
import X.C442090HVf;
import X.C448200Hhq;
import X.C451030HmP;
import X.C453260Hq0;
import X.C454010HrD;
import X.C454040HrG;
import X.C454050HrH;
import X.C454060HrI;
import X.C454100HrM;
import X.C454140HrQ;
import X.C457400Hwg;
import X.C457420Hwi;
import X.C457780HxI;
import X.C458160Hxu;
import X.C459110HzR;
import X.C461100I6i;
import X.C631370Opb;
import X.C643400PLm;
import X.C650450PfH;
import X.C659520Ptu;
import X.C661020PwK;
import X.C680810Qn9;
import X.C703302op;
import X.C736950SvV;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC442280HVy;
import X.EnumC451180Hme;
import X.EnumC454490Hrz;
import X.InterfaceC0148002o;
import X.InterfaceC1680500tpg;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.sticker.assem.CommentStickerPanelAssem;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.experiment.CommentStickerConsumptionSpecExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.StoryReactionAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPUGCPlayAssem;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumFragment;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoCommentVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.ResultV1Cell;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS442S0200000_6 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS442S0200000_6(android.view.View r3, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 14 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.<init>(android.view.View, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem, int):void");
    }

    public static final Object invoke$0(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C454060HrI c454060HrILIZ;
        C0I04 c0i04;
        C454040HrG c454040HrGLIZ;
        C0I04 c0i042;
        C454010HrD c454010HrDLIZ;
        C0I04 c0i043;
        String strLIZ;
        C0I03 c0i03Kp;
        C0I04 c0i044;
        KeyEvent keyEventLIZ;
        C0I03 c0i03Kp2;
        C0I04 c0i045;
        C454050HrH c454050HrH = (C454050HrH) obj2;
        C291001Au<KeyEvent> c291001Au = c454050HrH.LL;
        if (c291001Au != null && (keyEventLIZ = c291001Au.LIZ()) != null) {
            CommentStickerPanelAssem commentStickerPanelAssem = (CommentStickerPanelAssem) awS442S0200000_6.l0;
            if (keyEventLIZ.getKeyCode() == 67 && (c0i03Kp2 = commentStickerPanelAssem.kp()) != null && (c0i045 = c0i03Kp2.LL) != null) {
                c0i045.yd(keyEventLIZ);
            }
        }
        C291001Au<String> c291001Au2 = c454050HrH.LLILLJJLI;
        if (c291001Au2 != null && (strLIZ = c291001Au2.LIZ()) != null) {
            CommentStickerPanelAssem commentStickerPanelAssem2 = (CommentStickerPanelAssem) awS442S0200000_6.l0;
            if (C703302op.LIZ(strLIZ) && (c0i03Kp = commentStickerPanelAssem2.kp()) != null && (c0i044 = c0i03Kp.LL) != null) {
                c0i044.Hp(strLIZ);
            }
        }
        C291001Au<C454010HrD> c291001Au3 = c454050HrH.LLILZIL;
        if (c291001Au3 != null && (c454010HrDLIZ = c291001Au3.LIZ()) != null) {
            View view = (View) awS442S0200000_6.l1;
            CommentStickerPanelAssem commentStickerPanelAssem3 = (CommentStickerPanelAssem) awS442S0200000_6.l0;
            if (CommentStickerConsumptionSpecExp.LIZ()) {
                C454140HrQ.LIZJ(view.getContext());
            }
            commentStickerPanelAssem3.getClass();
            CommentStickerPanelAssem.mp();
            C0I03 c0i03Kp3 = commentStickerPanelAssem3.kp();
            if (c0i03Kp3 != null && (c0i043 = c0i03Kp3.LL) != null) {
                c0i043.lc(c454010HrDLIZ);
            }
        }
        C291001Au<C454040HrG> c291001Au4 = c454050HrH.LLILLL;
        if (c291001Au4 != null && (c454040HrGLIZ = c291001Au4.LIZ()) != null) {
            C0I03 c0i03Kp4 = ((CommentStickerPanelAssem) awS442S0200000_6.l0).kp();
            if (c0i03Kp4 != null && (c0i042 = c0i03Kp4.LL) != null) {
                c0i042.Cj(c454040HrGLIZ);
            }
            CommentStickerPanelAssem.mp();
        }
        C291001Au<C454060HrI> c291001Au5 = c454050HrH.LLIZ;
        if (c291001Au5 != null && (c454060HrILIZ = c291001Au5.LIZ()) != null) {
            C0I03 c0i03Kp5 = ((CommentStickerPanelAssem) awS442S0200000_6.l0).kp();
            if (c0i03Kp5 != null && (c0i04 = c0i03Kp5.LL) != null) {
                c0i04.g7(c454060HrILIZ);
            }
            CommentStickerPanelAssem.mp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        FrameLayout.LayoutParams layoutParams;
        if (((Number) obj2).intValue() == 0) {
            ((View) awS442S0200000_6.l0).getLayoutParams().height = -1;
        } else {
            AssemVMLazy assemVMLazy = ((ChatroomEmojiPanelAssem) awS442S0200000_6.l1).LLJJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatroomEmojiPanelAssem.LLJLLIL;
            ((View) awS442S0200000_6.l0).getLayoutParams().height = (int) (((double) ((C458160Hxu) assemVMLazy.getValue().getState()).LL) * 0.68d);
        }
        ViewGroup.LayoutParams layoutParams2 = ((View) awS442S0200000_6.l0).getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 48;
        }
        ((View) awS442S0200000_6.l0).requestLayout();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558360qeg.LJ((ViewPager) awS442S0200000_6.l0, null), "pic_preview", null, new C1185050gwZ(PageFinder.via((PoiGalleryActivityForReviews) awS442S0200000_6.l1)), 20);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) awS442S0200000_6.l0, null), "pic_preview", null, new C1185050gwZ(PageFinder.via((PoiGalleryActivity) awS442S0200000_6.l1)), 20);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C1185430gxB.LJJIJIL(C1185430gxB.LIZ, C1558360qeg.LJ((ViewPager) awS442S0200000_6.l0, null), "pic_preview", null, new C1185050gwZ(PageFinder.via((PoiReviewsGalleryActivity) awS442S0200000_6.l1)), 20);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS442S0200000_6 r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r0 = r18
            r15 = r17
            com.bytedance.assem.arch.core.UIAssem r15 = (com.bytedance.assem.arch.core.UIAssem) r15
            X.01Au r0 = (X.C291001Au) r0
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.LIZ()
            X.0I6p r0 = (X.C461170I6p) r0
            if (r0 == 0) goto La0
            long r13 = r0.LIZ
            long r7 = r0.LIZIZ
            long r1 = r0.LIZJ
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r15)
            r5 = 0
            if (r0 == 0) goto L65
            X.0Q7z r6 = X.C1558360qeg.LJFF(r0, r5)
            r0 = 1
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r3 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r0 = 0
            r4[r0] = r3
            X.0QSJ r3 = X.C687700QyG.LIZJ(r6, r4)
            if (r3 == 0) goto L63
            java.lang.Class<com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility> r0 = com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility.class
            java.lang.Object r3 = r3.getAbility(r0)
        L37:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility
            if (r0 != 0) goto L3c
            r3 = r5
        L3c:
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility r3 = (com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility) r3
            if (r3 == 0) goto L65
            java.util.List r0 = r3.vi2()
            if (r0 == 0) goto L65
            java.util.Iterator r6 = r0.iterator()
            r17 = 0
        L4c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r6.next()
            X.0Y9l r0 = (X.C869590Y9l) r0
            long r3 = r0.getMsgId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r17 = r17 + 1
            goto L4c
        L63:
            r3 = r5
            goto L37
        L65:
            r17 = -1
        L67:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r15)
            if (r0 == 0) goto La0
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility> r0 = com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility r6 = (com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility) r6
            if (r6 == 0) goto La0
            X.0I6s r9 = X.EnumC461200I6s.MIDDLE
            X.0I6m r12 = new X.0I6m
            r2 = r16
            java.lang.Object r1 = r2.l0
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = (com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo) r1
            java.lang.Object r0 = r2.l1
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = (com.bytedance.assem.arch.viewModel.AssemVMLazy) r0
            r16 = r1
            r18 = r0
            r12.<init>(r13, r15, r16, r17, r18)
            kotlin.jvm.internal.AwS546S0100000_2 r13 = new kotlin.jvm.internal.AwS546S0100000_2
            java.lang.Object r1 = r2.l0
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = (com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo) r1
            r0 = 1057(0x421, float:1.481E-42)
            r13.<init>(r1, r0)
            r10 = 0
            r11 = 0
            r6.d42(r7, r9, r10, r11, r12, r13)
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.invoke$13(kotlin.jvm.internal.AwS442S0200000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        View view = (View) obj;
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(view, (View) awS442S0200000_6.l0)) {
            SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir1Assem) awS442S0200000_6.l1).op();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("chapters_type", "1");
            pairArr[1] = new Pair("is_click_abbre", CardStruct.IStatusCode.DEFAULT);
            Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir1Assem) awS442S0200000_6.l1)).LL.getVideo();
            if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
                objLJJJLL = "";
            }
            pairArr[2] = new Pair("album_url", objLJJJLL);
            searchVideoKeyFrameViewModelOp.wQ2(view, C2097608Jq.LJIIIIZZ(pairArr));
            return C643400PLm.LIZ(c643400PLm, null, true, null, null, 260095);
        }
        return c643400PLm;
    }

    public static final Object invoke$15(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Aweme aweme;
        Object objLJJJLL;
        final Aweme aweme2;
        final List<SearchKeyFramePoint> list;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list2;
        List<C434820H3g> list3 = ((SearchKeyframeOptDir3PanelAssem) awS442S0200000_6.l0).LLJZIJLIL;
        ArrayList arrayList = new ArrayList();
        Iterator<C434820H3g> it2 = list3.iterator();
        while (true) {
            aweme = null;
            if (!it2.hasNext()) {
                break;
            }
            String str = it2.next().LIZ.title;
            if ((!a0.LJJJIL(str)) && str != null) {
                arrayList.add(str);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir3PanelAssem) awS442S0200000_6.l0).op();
        View view = (View) awS442S0200000_6.l1;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("chapters_type", "3");
        pairArr[1] = new Pair("sub_titles_list", strLJJLIIIJ);
        Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir3PanelAssem) awS442S0200000_6.l0)).LL.getVideo();
        if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list2 = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list2)) == null) {
            objLJJJLL = "";
        }
        pairArr[2] = new Pair("sub_url_list", objLJJJLL);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C659520Ptu c659520Ptu = searchVideoKeyFrameViewModelOp.LL;
        if (c659520Ptu != null && (aweme2 = c659520Ptu.LL) != null && (list = searchVideoKeyFrameViewModelOp.LLILLJJLI) != null) {
            C661020PwK<C0H7U> c661020PwK = new C661020PwK<C0H7U>(aweme2, list) { // from class: X.0H7U
            };
            for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                c661020PwK.LJ((String) entry.getKey(), (String) entry.getValue());
            }
            C659520Ptu c659520Ptu2 = searchVideoKeyFrameViewModelOp.LL;
            if (c659520Ptu2 != null) {
                aweme = c659520Ptu2.LL;
            }
            C650450PfH.LIZ(c661020PwK, view, aweme, searchVideoKeyFrameViewModelOp.LLILLL, false);
            c661020PwK.LJIILJJIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(obj, (View) awS442S0200000_6.l0)) {
            ((SearchKeyframeOptDir3PanelAssem) awS442S0200000_6.l1).op().xQ2("view_all", (View) awS442S0200000_6.l0, C2097608Jq.LJ());
            return C643400PLm.LIZ(c643400PLm, null, true, null, null, 260095);
        }
        return c643400PLm;
    }

    public static final Object invoke$17(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir1Assem) awS442S0200000_6.l0).op();
        View view = (View) awS442S0200000_6.l1;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("chapters_type", "1");
        Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir1Assem) awS442S0200000_6.l0)).LL.getVideo();
        if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
            objLJJJLL = "";
        }
        pairArr[1] = new Pair("album_url", objLJJJLL);
        searchVideoKeyFrameViewModelOp.yQ2(view, C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        View view = (View) obj;
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(view, (View) awS442S0200000_6.l0)) {
            SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir2Assem) awS442S0200000_6.l1).op();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("chapters_type", "2");
            pairArr[1] = new Pair("is_click_abbre", "1");
            Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir2Assem) awS442S0200000_6.l1)).LL.getVideo();
            if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
                objLJJJLL = "";
            }
            pairArr[2] = new Pair("album_url", objLJJJLL);
            searchVideoKeyFrameViewModelOp.wQ2(view, C2097608Jq.LJIIIIZZ(pairArr));
            return C643400PLm.LIZ(c643400PLm, null, true, null, null, 260095);
        }
        return c643400PLm;
    }

    public static final Object invoke$19(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir2Assem) awS442S0200000_6.l0).op();
        View view = (View) awS442S0200000_6.l1;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("chapters_type", "2");
        Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir2Assem) awS442S0200000_6.l0)).LL.getVideo();
        if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
            objLJJJLL = "";
        }
        pairArr[1] = new Pair("album_url", objLJJJLL);
        searchVideoKeyFrameViewModelOp.yQ2(view, C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        String string;
        String str;
        C451030HmP c451030HmP = (C451030HmP) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1628906Zj.LIZ(((RecyclerView) awS442S0200000_6.l0).getContext());
        Emoji emoji = c451030HmP.LIZJ;
        if (emoji != null) {
            SuggestedEmojiAssem suggestedEmojiAssem = (SuggestedEmojiAssem) awS442S0200000_6.l1;
            suggestedEmojiAssem.So().wQ2(iIntValue, String.valueOf(emoji.getId()), null, "ugc_stickers");
            AssemVMLazy assemVMLazy = suggestedEmojiAssem.LLJILJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SuggestedEmojiAssem.LLJZ;
            ((SendMessageVM) assemVMLazy.getValue()).LLILLL.LIZJ(new C453260Hq0(c451030HmP, null, null, null));
            IMEditTextAbility iMEditTextAbility = (IMEditTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(suggestedEmojiAssem), IMEditTextAbility.class, null);
            if (iMEditTextAbility != null) {
                iMEditTextAbility.rv();
            }
        }
        SetSticker setSticker = c451030HmP.LJ;
        if (setSticker != null) {
            SuggestedEmojiAssem suggestedEmojiAssem2 = (SuggestedEmojiAssem) awS442S0200000_6.l1;
            SuggestedEmojiViewModel suggestedEmojiViewModelSo = suggestedEmojiAssem2.So();
            Long stickerId = setSticker.getStickerId();
            if (stickerId != null) {
                string = stickerId.toString();
            } else {
                string = null;
            }
            Integer stickerType = setSticker.getStickerType();
            int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
            if (stickerType != null && stickerType.intValue() == type) {
                str = "aimoji";
            } else {
                str = "sticker";
            }
            suggestedEmojiViewModelSo.wQ2(iIntValue, string, str, null);
            AssemVMLazy assemVMLazy2 = suggestedEmojiAssem2.LLJILJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = SuggestedEmojiAssem.LLJZ;
            ((SendMessageVM) assemVMLazy2.getValue()).LLILZIL.LIZJ(new C454100HrM(setSticker, EnumC454490Hrz.KEYWORD_SUGGESTION, null));
            IMEditTextAbility iMEditTextAbility2 = (IMEditTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(suggestedEmojiAssem2), IMEditTextAbility.class, null);
            if (iMEditTextAbility2 != null) {
                iMEditTextAbility2.rv();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir3Assem) awS442S0200000_6.l0).op();
        FrameLayout frameLayout = (FrameLayout) awS442S0200000_6.l1;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("chapters_type", "3");
        Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir3Assem) awS442S0200000_6.l0)).LL.getVideo();
        if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
            objLJJJLL = "";
        }
        pairArr[1] = new Pair("album_url", objLJJJLL);
        searchVideoKeyFrameViewModelOp.yQ2(frameLayout, C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        SearchKeyframeOptDir3Assem searchKeyframeOptDir3Assem = (SearchKeyframeOptDir3Assem) obj;
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            searchKeyframeOptDir3Assem.tp((FrameLayout) awS442S0200000_6.l0, (FrameLayout) awS442S0200000_6.l1, searchKeyframeOptDir3Assem.op().getState().LLILLJJLI);
            if (!searchKeyframeOptDir3Assem.op().getState().LLILLJJLI) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(searchKeyframeOptDir3Assem), null, null, new C0H56((FrameLayout) awS442S0200000_6.l0, searchKeyframeOptDir3Assem, null), 3);
            }
        } else {
            C436180H8m.LIZIZ((FrameLayout) awS442S0200000_6.l0);
            C436180H8m.LIZIZ((FrameLayout) awS442S0200000_6.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        SearchKeyframeOptDir3Assem searchKeyframeOptDir3Assem = (SearchKeyframeOptDir3Assem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List<SearchKeyFramePoint> list = searchKeyframeOptDir3Assem.op().getState().LL;
        if (list != null && !list.isEmpty()) {
            searchKeyframeOptDir3Assem.tp((FrameLayout) awS442S0200000_6.l0, (FrameLayout) awS442S0200000_6.l1, zBooleanValue);
        } else {
            C436180H8m.LIZIZ((FrameLayout) awS442S0200000_6.l0);
            C436180H8m.LIZIZ((FrameLayout) awS442S0200000_6.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        if (((Number) obj2).intValue() != ((C0HQX) awS442S0200000_6.l0).LL) {
            C370240EfO c370240EfO = ((ResultV1Cell) awS442S0200000_6.l1).LLIZLLLIL;
            if (c370240EfO != null) {
                int visibility = c370240EfO.getVisibility();
                c370240EfO.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c370240EfO);
            }
        } else {
            C370240EfO c370240EfO2 = ((ResultV1Cell) awS442S0200000_6.l1).LLIZLLLIL;
            if (c370240EfO2 != null) {
                int visibility2 = c370240EfO2.getVisibility();
                c370240EfO2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c370240EfO2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        if (((C013C) awS442S0200000_6.l0).element) {
            C01GW c01gw = (C01GW) awS442S0200000_6.l1;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C459110HzR.LLILZIL;
            C426750GoL.LJIIIZ((View) c01gw.getValue(), null, null, null, Integer.valueOf(iIntValue), false, 23);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        C457420Hwi.LJI(((AbstractC738140SxQ) obj).getLifecycle(), ((C457780HxI) awS442S0200000_6.l0).LL.getConversationId(), (MessageReplyVM) ((C736950SvV) awS442S0200000_6.l1).getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        LifecycleRegistry lifecycle = ((AbstractC738140SxQ) obj).getLifecycle();
        C1559260qg8 c1559260qg8 = (C1559260qg8) awS442S0200000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457400Hwg.LIZ;
        C457420Hwi.LJI(lifecycle, ((C457780HxI) c1559260qg8.getValue()).LL.getConversationId(), (MessageReplyVM) ((C736950SvV) awS442S0200000_6.l1).getValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$27(kotlin.jvm.internal.AwS442S0200000_6 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131833911(0x7f113437, float:1.9300917E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.0HQb r0 = (X.C440750HQb) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            X.0HQb r2 = (X.C440750HQb) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS407S0200000_6 r8 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 95
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5a:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            r0 = 2131833910(0x7f113436, float:1.9300915E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r6)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.0HQb r0 = (X.C440750HQb) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            X.0HQb r2 = (X.C440750HQb) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L97
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La1
        L97:
            kotlin.jvm.internal.AwS407S0200000_6 r8 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 96
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La1:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJII(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.invoke$27(kotlin.jvm.internal.AwS442S0200000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$28(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        if (obj2 == EnumC442280HVy.GRANTED) {
            C442090HVf.LJFF("album", PageFinder.via((C19EG) awS442S0200000_6.l0));
        }
        ((LocalServiceAlbumFragment) awS442S0200000_6.l1).SR().setState(new AwS21S0010000_6(true, 27));
        ((LocalServiceAlbumFragment) awS442S0200000_6.l1).SR().vQ2((C19EG) awS442S0200000_6.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        if (obj2 == EnumC442280HVy.GRANTED) {
            C442090HVf.LJFF("camera", PageFinder.via((C19EG) awS442S0200000_6.l0));
        }
        ((LocalServiceAlbumFragment) awS442S0200000_6.l1).SR().vQ2((C19EG) awS442S0200000_6.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        AssemVMLazy assemVMLazy = ((StoryReactionAssem) awS442S0200000_6.l0).LLLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryReactionAssem.LLLILZLLLI;
        Pair<Long, C291001Au<Boolean>> pair = ((C461100I6i) assemVMLazy.getValue().getState()).LLILLJJLI;
        if (pair != null) {
            long jLongValue = pair.getFirst().longValue();
            C291001Au<Boolean> second = pair.getSecond();
            ViewPropertyAnimator viewPropertyAnimator = null;
            if (((C869590Y9l) awS442S0200000_6.l1).getMsgId() == jLongValue && second != null && second.LIZ() != null) {
                StoryReactionAssem storyReactionAssem = (StoryReactionAssem) awS442S0200000_6.l0;
                View viewLJJIJL = reusedUIAssem.LJJIJL();
                ViewPropertyAnimator viewPropertyAnimatorAnimate = viewLJJIJL.animate();
                if (viewPropertyAnimatorAnimate != null) {
                    viewPropertyAnimatorAnimate.setStartDelay(200L);
                    viewPropertyAnimatorAnimate.scaleX(1.08f);
                    viewPropertyAnimatorAnimate.scaleY(1.08f);
                    viewPropertyAnimatorAnimate.setDuration(200L);
                    viewPropertyAnimatorAnimate.setInterpolator(C1619980sG4.LIZLLL());
                    viewPropertyAnimatorAnimate.withEndAction(new ARunnableS105S0100000_5(viewLJJIJL, 106));
                    viewPropertyAnimator = viewPropertyAnimatorAnimate;
                }
                storyReactionAssem.LLLIL = viewPropertyAnimator;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        final Aweme aweme;
        final Comment comment;
        SearchVideoCommentVM searchVideoCommentVMCp = ((SearchVideoCommentAssem) awS442S0200000_6.l0).cp();
        View view = (View) awS442S0200000_6.l1;
        C659520Ptu c659520Ptu = searchVideoCommentVMCp.LL;
        if (c659520Ptu != null && (aweme = c659520Ptu.LL) != null && (comment = searchVideoCommentVMCp.LLILLL) != null) {
            C680810Qn9<C448200Hhq> c680810Qn9 = new C680810Qn9<C448200Hhq>(comment, aweme) { // from class: X.0Hhp
            };
            searchVideoCommentVMCp.vQ2(c680810Qn9, view);
            c680810Qn9.LJIILJJIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        ((SearchVideoKeyFrameAssem) awS442S0200000_6.l0).dp().yQ2((View) awS442S0200000_6.l1, C2097608Jq.LJ());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String string = ((BaseSocialAvatarCameraScene) awS442S0200000_6.l0).getString(2131826302);
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C05P0 c05p0 = (C05P0) awS442S0200000_6.l1;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AwS550S0100000_6(c05p0, (C05P0<Boolean>) 698);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIZ(384, 2, interfaceC1680500tpg, string, (Function0) objLJJ, false);
            String string2 = ((BaseSocialAvatarCameraScene) awS442S0200000_6.l0).getString(2131826301);
            interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg.LJII((BaseSocialAvatarCameraScene) awS442S0200000_6.l0);
            BaseSocialAvatarCameraScene baseSocialAvatarCameraScene = (BaseSocialAvatarCameraScene) awS442S0200000_6.l0;
            C05P0 c05p02 = (C05P0) awS442S0200000_6.l1;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS407S0200000_6(baseSocialAvatarCameraScene, (BaseSocialAvatarCameraScene) c05p02, (C05P0<Boolean>) 33);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg.LJ();
            C1668330tW3.LJIIIIZZ(0, 2, interfaceC1680500tpg, string2, (Function0) objLJJ2, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS442S0200000_6 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r4 = r9
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L1a
            r4.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131830681(0x7f112799, float:1.9294366E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r7 = 1
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment r0 = (com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment) r0
            boolean r3 = r4.LJII(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment r2 = (com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment) r2
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r3 != 0) goto L50
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L5a
        L50:
            kotlin.jvm.internal.AwS406S0200000_5 r6 = new kotlin.jvm.internal.AwS406S0200000_5
            r0 = 56
            r6.<init>(r2, r1, r0)
            r4.LJJIJIIJI(r6)
        L5a:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJII(r2, r3, r4, r5, r6, r7)
            r0 = 2131830680(0x7f112798, float:1.9294364E38)
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r4)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r4.LJJIIJ(r0)
            java.lang.Object r1 = r8.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L8d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L97
        L8d:
            kotlin.jvm.internal.AwS550S0100000_6 r6 = new kotlin.jvm.internal.AwS550S0100000_6
            r0 = 877(0x36d, float:1.229E-42)
            r6.<init>(r1, r0)
            r4.LJJIJIIJI(r6)
        L97:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r2 = 48
            r3 = 0
            X.C1668330tW3.LJIIIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.invoke$7(kotlin.jvm.internal.AwS442S0200000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS442S0200000_6 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r1
            r0 = 2131838858(0x7f11478a, float:1.9310951E38)
            java.lang.String r7 = r1.getString(r0)
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r0
            boolean r4 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS420S0200000_19 r8 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 133(0x85, float:1.86E-43)
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L5e:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r1 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r1
            r0 = 2131838857(0x7f114789, float:1.931095E38)
            java.lang.String r7 = r1.getString(r0)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r0 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r0
            boolean r3 = r6.LJII(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r2 = (com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L9f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto La9
        L9f:
            kotlin.jvm.internal.AwS420S0200000_19 r8 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 134(0x86, float:1.88E-43)
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        La9:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.invoke$8(kotlin.jvm.internal.AwS442S0200000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS442S0200000_6 awS442S0200000_6, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    TuxIconView tuxIconView = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJ;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    }
                    TuxIconView tuxIconView2 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                    TuxIconView tuxIconView3 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
                    if (tuxIconView3 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                    }
                    TuxIconView tuxIconView4 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.clearAnimation();
                    }
                }
            } else {
                TuxIconView tuxIconView5 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJ;
                if (tuxIconView5 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
                }
                TuxIconView tuxIconView6 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJIL;
                if (tuxIconView6 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
                }
                TuxIconView tuxIconView7 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
                if (tuxIconView7 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
                }
                TuxIconView tuxIconView8 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
                if (tuxIconView8 != null) {
                    tuxIconView8.clearAnimation();
                }
            }
        } else {
            TuxIconView tuxIconView9 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJ;
            if (tuxIconView9 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView9, 8);
            }
            TuxIconView tuxIconView10 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJIL;
            if (tuxIconView10 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView10, 8);
            }
            TuxIconView tuxIconView11 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
            if (tuxIconView11 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView11, 0);
            }
            TuxIconView tuxIconView12 = ((MusicPUGCPlayAssem) awS442S0200000_6.l0).LLJJJJJIL;
            if (tuxIconView12 != null) {
                tuxIconView12.startAnimation(AnimationUtils.loadAnimation((Context) awS442S0200000_6.l1, R.anim.e9));
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS442S0200000_6(android.view.View r3, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 18 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.<init>(android.view.View, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS442S0200000_6(android.view.View r3, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 15 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS442S0200000_6.<init>(android.view.View, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(C013C c013c, C013C c013c2, C01GW<? extends View> c01gw) {
        super(2);
        this.$t = c01gw;
        this.l0 = c013c;
        this.l1 = c013c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(C0HQX c0hqx, ResultV1Cell resultV1Cell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0hqx;
        this.l1 = resultV1Cell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(C440750HQb c440750HQb, C440750HQb c440750HQb2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c440750HQb;
        this.l1 = c440750HQb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(C457780HxI c457780HxI, C457780HxI c457780HxI2, C736950SvV<InterfaceC0148002o, MessageReplyVM> c736950SvV) {
        super(2);
        this.$t = c736950SvV;
        this.l0 = c457780HxI;
        this.l1 = c457780HxI2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(C1559260qg8 c1559260qg8, C1559260qg8<C457780HxI> c1559260qg82, C736950SvV<InterfaceC0148002o, MessageReplyVM> c736950SvV) {
        super(2);
        this.$t = c736950SvV;
        this.l0 = c1559260qg8;
        this.l1 = c1559260qg82;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, PoiGalleryActivity poiGalleryActivity, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20631115oD;
        this.l1 = poiGalleryActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(C19EG c19eg, LocalServiceAlbumFragment localServiceAlbumFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = localServiceAlbumFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(View view, ChatroomEmojiPanelAssem chatroomEmojiPanelAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = chatroomEmojiPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        super(2);
        this.$t = i;
        this.l0 = frameLayout;
        this.l1 = frameLayout2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(RecyclerView recyclerView, SuggestedEmojiAssem suggestedEmojiAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = recyclerView;
        this.l1 = suggestedEmojiAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(ViewPager viewPager, PoiGalleryActivityForReviews poiGalleryActivityForReviews, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewPager;
        this.l1 = poiGalleryActivityForReviews;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(ViewPager viewPager, PoiReviewsGalleryActivity poiReviewsGalleryActivity, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewPager;
        this.l1 = poiReviewsGalleryActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(CommentStickerPanelAssem commentStickerPanelAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = commentStickerPanelAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(SessionInfo sessionInfo, SessionInfo sessionInfo2, AssemVMLazy<C461100I6i, ScrollToMessageViewModel> assemVMLazy) {
        super(2);
        this.$t = assemVMLazy;
        this.l0 = sessionInfo;
        this.l1 = sessionInfo2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(StoryReactionAssem storyReactionAssem, C869590Y9l c869590Y9l, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyReactionAssem;
        this.l1 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(MusicPUGCPlayAssem musicPUGCPlayAssem, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPUGCPlayAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(SearchVideoCommentAssem searchVideoCommentAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchVideoCommentAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(SearchVideoKeyFrameAssem searchVideoKeyFrameAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchVideoKeyFrameAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS442S0200000_6(SearchKeyframeOptDir3Assem searchKeyframeOptDir3Assem, FrameLayout frameLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchKeyframeOptDir3Assem;
        this.l1 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, BaseSocialAvatarCameraScene baseSocialAvatarCameraScene2, C05P0<Boolean> c05p0) {
        super(2);
        this.$t = c05p0;
        this.l0 = baseSocialAvatarCameraScene;
        this.l1 = baseSocialAvatarCameraScene2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(InlineCaptionTextFragment inlineCaptionTextFragment, InlineCaptionTextFragment inlineCaptionTextFragment2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = inlineCaptionTextFragment;
        this.l1 = inlineCaptionTextFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS442S0200000_6(ProfileEditBioFragment profileEditBioFragment, ProfileEditBioFragment profileEditBioFragment2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = profileEditBioFragment;
        this.l1 = profileEditBioFragment2;
    }
}
