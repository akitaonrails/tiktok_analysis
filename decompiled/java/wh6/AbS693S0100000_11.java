package wh6;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0B70;
import X.C0C64;
import X.C0MLA;
import X.C0OB8;
import X.C0PEM;
import X.C0RF0;
import X.C0RJN;
import X.C0ROF;
import X.C0RSU;
import X.C0S12;
import X.C0SFC;
import X.C0SPF;
import X.C0SR4;
import X.C0SY3;
import X.C0SZ8;
import X.C0XQ7;
import X.C1012040cRW;
import X.C109100bB;
import X.C10EU;
import X.C1247530iZL;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1349800lEI;
import X.C1357660lQy;
import X.C1386160mAw;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13DA;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1558420qem;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1600710rkz;
import X.C1609930rzr;
import X.C19EG;
import X.C205700ql;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C2344009Gk;
import X.C278590Avx;
import X.C289420BWa;
import X.C296440Bje;
import X.C453940Hr6;
import X.C461720I8s;
import X.C523420Kfs;
import X.C631370Opb;
import X.C718180SFc;
import X.C718510SGj;
import X.C721900STk;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729220Sj2;
import X.C729440SjO;
import X.C729510SjV;
import X.C733080SpG;
import X.C735840Sti;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC696090RSd;
import X.InterfaceC1361270lWn;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC737440SwI;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.CtaDisplayConfig;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.FriendsV3CommentButtonAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsRepostInteractiveAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsV3MessageButtonAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsV3RepostMessageButtonAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonAssem;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonBackupAssem;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryUploadProgressComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardAvatarViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryShareComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.second.StoryImmersiveQuitComponent;
import com.ss.android.ugc.aweme.story.friends.FriendsDetailViewerEntranceLogicAbility;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceUIAssem;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveActionService;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS96S1200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AbS693S0100000_11 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS693S0100000_11(MiniDramaBottomButtonAssem miniDramaBottomButtonAssem, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = miniDramaBottomButtonAssem;
    }

    public static final void LIZ$0(AbS693S0100000_11 abS693S0100000_11, View view) {
        Object obj;
        boolean z;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        boolean z2;
        boolean z3;
        C0RJN c0rjnLIZIZ3;
        String str;
        if (view != null) {
            FriendsV3CommentButtonAssem friendsV3CommentButtonAssem = (FriendsV3CommentButtonAssem) abS693S0100000_11.l0;
            C724270Sb3 c724270Sb3 = friendsV3CommentButtonAssem.LLJI;
            C0RJN c0rjnLIZIZ4 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((C0OB8) obj).getAweme();
            if (aweme != null) {
                if (((Boolean) C0B70.LIZ.getValue()).booleanValue() && AwemeExtKt.isProhibited(aweme)) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(friendsV3CommentButtonAssem);
                    if (c19egLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJIIIZ(2131829184);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                boolean zLJIIZILJ = C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme));
                if (!C296440Bje.LIZ() ? friendsV3CommentButtonAssem.sp().LIZ.total == 0 : !(friendsV3CommentButtonAssem.sp().LIZ.total != 0 || ((str = ((C733080SpG) ((AssemViewModel) friendsV3CommentButtonAssem.LLJLIL.getValue(friendsV3CommentButtonAssem, FriendsV3CommentButtonAssem.LLJLLIL[0])).getState()).LLILZ) != null && str.length() != 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)))) {
                    if (C1386160mAw.LIZIZ(aweme)) {
                        CommentService.LIZ.getClass();
                        CommentService commentServiceLIZ = C523420Kfs.LIZ();
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(friendsV3CommentButtonAssem);
                        Fragment fragmentLJI = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                        Fragment fragmentLJI2 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                        if (fragmentLJI2 != null) {
                            c0rjnLIZIZ3 = C1578630rBN.LIZIZ(fragmentLJI2);
                        } else {
                            c0rjnLIZIZ3 = null;
                        }
                        String strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ3);
                        Fragment fragmentLJI3 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                        if (fragmentLJI3 != null) {
                            c0rjnLIZIZ4 = C1578630rBN.LIZIZ(fragmentLJI3);
                        }
                        InterfaceC737440SwI interfaceC737440SwILJLILLLLZI = commentServiceLIZ.LJLILLLLZI(c19egLIZ2, fragmentLJI, aweme, strLIZ, "click_comment_icon", C1389300mG0.LIZ(c0rjnLIZIZ4), new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.FEED_QUICK_COMMENT, 0, EnumC1341680l1C.TEXT, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, "", null, C1389300mG0.LIZIZ(C724240Sb0.LJI(friendsV3CommentButtonAssem)), null, ""), false), null);
                        if (interfaceC737440SwILJLILLLLZI == null) {
                            return;
                        }
                        interfaceC737440SwILJLILLLLZI.e6(new AwS555S0100000_11(interfaceC737440SwILJLILLLLZI, 45));
                        interfaceC737440SwILJLILLLLZI.sp(new AwS555S0100000_11(interfaceC737440SwILJLILLLLZI, 46));
                        return;
                    }
                }
                if (((Boolean) C278590Avx.LIZ.getValue()).booleanValue() && !zLJIIZILJ && C1386160mAw.LIZIZ(aweme)) {
                    z = true;
                } else {
                    z = false;
                }
                CommentService.LIZ.getClass();
                CommentService commentServiceLIZ2 = C523420Kfs.LIZ();
                C19EG c19egLIZ3 = C724240Sb0.LIZ(friendsV3CommentButtonAssem);
                Fragment fragmentLJI4 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
                Fragment fragmentLJI5 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                if (fragmentLJI5 != null) {
                    c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI5);
                } else {
                    c0rjnLIZIZ = null;
                }
                c1349800lEI.setEnterFrom(C1389300mG0.LIZ(c0rjnLIZIZ));
                Fragment fragmentLJI6 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                if (fragmentLJI6 != null) {
                    c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI6);
                } else {
                    c0rjnLIZIZ2 = null;
                }
                c1349800lEI.setEventType(C1389300mG0.LIZ(c0rjnLIZIZ2));
                if (!aweme.isCmtSwt()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1349800lEI.setEnableComment(z2);
                c1349800lEI.setCommentClose(C523420Kfs.LIZ().LJIILLIIL(aweme));
                if (C523420Kfs.LIZ().LJIILLIIL(aweme) && !C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1349800lEI.setCommentLimited(z3);
                c1349800lEI.setLocatePageType(1);
                c1349800lEI.setAuthorUid(AwemeExtKt.getAuthorUid(aweme));
                c1349800lEI.setEnterMethod("click_comment_icon");
                Fragment fragmentLJI7 = C724240Sb0.LJI(friendsV3CommentButtonAssem);
                if (fragmentLJI7 != null) {
                    c0rjnLIZIZ4 = C1578630rBN.LIZIZ(fragmentLJI7);
                }
                c1349800lEI.setVideoFrom(C1389300mG0.LIZ(c0rjnLIZIZ4));
                c1349800lEI.setNavigationBarAutoColorOnHide(true);
                c1349800lEI.setFriendsV3Feed(true);
                c1349800lEI.setFriendsV3TrackScene(C1389300mG0.LIZIZ(C724240Sb0.LJI(friendsV3CommentButtonAssem)));
                c1349800lEI.forceRefresh(friendsV3CommentButtonAssem.sp().LIZLLL);
                c1349800lEI.setNeedShowMask(true);
                c1349800lEI.setForceAutoOpenKeyboard(z);
                commentServiceLIZ2.LJJL(c19egLIZ3, fragmentLJI4, aweme, c1349800lEI);
                friendsV3CommentButtonAssem.sp().LIZLLL = false;
            }
        }
    }

    public static final void LIZ$1(AbS693S0100000_11 abS693S0100000_11, View view) {
        C0RJN c0rjnLIZIZ;
        Object obj;
        Object obj2;
        String uid;
        Object obj3;
        Object obj4;
        if (view != null) {
            FriendsV3MessageButtonAssem friendsV3MessageButtonAssem = (FriendsV3MessageButtonAssem) abS693S0100000_11.l0;
            friendsV3MessageButtonAssem.getClass();
            C109100bB c109100bB = C109100bB.LIZ;
            C13DA c13da = new C13DA();
            c13da.put("friends_tab_version", "v3.0");
            Fragment fragmentLJI = C724240Sb0.LJI(friendsV3MessageButtonAssem);
            if (fragmentLJI != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
            } else {
                c0rjnLIZIZ = null;
            }
            c13da.put("enter_from", C1389300mG0.LIZ(c0rjnLIZIZ));
            C724270Sb3 c724270Sb3 = friendsV3MessageButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c13da.put("group_id", ((C0OB8) obj).getAweme().getAid());
            C724270Sb3 c724270Sb32 = friendsV3MessageButtonAssem.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            User userLLILLL = ((InterfaceC1361270lWn) obj2).LLILLL();
            if (userLLILLL != null) {
                uid = userLLILLL.getUid();
            } else {
                uid = null;
            }
            c13da.put("author_id", uid);
            Map mapBuild = c13da.build();
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_friend_tab_dm_btn_click", mapBuild);
            C724270Sb3 c724270Sb33 = friendsV3MessageButtonAssem.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            User userLLILLL2 = ((InterfaceC1361270lWn) obj3).LLILLL();
            if (userLLILLL2 != null) {
                C0SY3 c0sy3 = C0SY3.LIZ;
                Context context = friendsV3MessageButtonAssem.getContext();
                Fragment fragmentLJI2 = C724240Sb0.LJI(friendsV3MessageButtonAssem);
                C724270Sb3 c724270Sb34 = friendsV3MessageButtonAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(friendsV3MessageButtonAssem), FriendsV3PlayerAbility.class, null);
                c0sy3.getClass();
                C0SY3.LIZ(context, fragmentLJI2, (InterfaceC1361270lWn) obj4, userLLILLL2, friendsV3PlayerAbility);
            }
        }
    }

    public static final void LIZ$10(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((StoryGuideCardComponent) abS693S0100000_11.l0).Fp().vQ2("story_card");
            StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = ((StoryGuideCardComponent) abS693S0100000_11.l0).Fp();
            storyGuideCardAvatarViewModelFp.getClass();
            storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(782));
        }
    }

    public static final void LIZ$11(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((StoryGuideCardComponent) abS693S0100000_11.l0).Fp().vQ2("story_card");
            StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = ((StoryGuideCardComponent) abS693S0100000_11.l0).Fp();
            storyGuideCardAvatarViewModelFp.getClass();
            storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(783));
        }
    }

    public static final void LIZ$12(AbS693S0100000_11 abS693S0100000_11, View view) {
        String uid;
        boolean z;
        boolean z2;
        Object obj;
        Integer num;
        String eventType;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Integer numValueOf;
        String strLJIL;
        Object obj6;
        String str;
        Object obj7;
        String str2;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        String eventType2;
        Object obj12;
        Object obj13;
        Object obj14;
        StoryHighlightCollection storyHighlightCollection;
        String str3;
        Aweme aweme;
        CelebrationMetaData celebrationMetaData;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightInfo storyHighlightInfo2;
        FragmentManager childFragmentManager;
        IStoryHighlightsImmersiveActionService iStoryHighlightsImmersiveActionService;
        String eventType3;
        C0SR4 c0sr4LJJLIIIJL;
        if (view != null) {
            boolean zLJIIL = C729510SjV.LJIIL(((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme());
            boolean zLJFF = Intrinsics.LJFF(((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).mFrom, "STORY_ENTRANCE_HIGHLIGHTS");
            boolean zLJFF2 = Intrinsics.LJFF(((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).mFrom, "STORY_ENTRANCE_INBOX_TOP_LIST");
            User author = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme().getAuthor();
            Object obj15 = null;
            numValueOf = null;
            Integer numValueOf2 = null;
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            boolean zLJFF3 = Intrinsics.LJFF(uid, C461720I8s.LIZIZ());
            if (zLJIIL && zLJFF && zLJFF3) {
                z = true;
            } else {
                z = false;
            }
            if (!C289420BWa.LIZ() && zLJIIL && !zLJFF3) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str4 = "";
            if (z) {
                Context context = ((StoryShareComponent) abS693S0100000_11.l0).getContext();
                if (context != null && (iStoryHighlightsImmersiveActionService = (IStoryHighlightsImmersiveActionService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsImmersiveActionService.class, false, false, false, 14, null)) != null) {
                    Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme();
                    Fragment fragmentLJI = C724240Sb0.LJI((StoryShareComponent) abS693S0100000_11.l0);
                    IAdapterAbility iAdapterAbility = (IAdapterAbility) ((StoryShareComponent) abS693S0100000_11.l0).LLJZIJLIL.getValue();
                    if (iAdapterAbility != null && (c0sr4LJJLIIIJL = iAdapterAbility.LJJLIIIJL()) != null) {
                        numValueOf2 = Integer.valueOf(c0sr4LJJLIIIJL.getCount());
                    }
                    C2189821An6 c2189821An6 = (C2189821An6) ((StoryShareComponent) abS693S0100000_11.l0).LLJZ.getValue();
                    if (c2189821An6 != null && (eventType3 = c2189821An6.getEventType()) != null) {
                        str4 = eventType3;
                    }
                    iStoryHighlightsImmersiveActionService.LIZ(aweme2, context, fragmentLJI, numValueOf2, str4, "click_more", new AwS555S0100000_11((StoryShareComponent) abS693S0100000_11.l0, 722), new AwS590S0100000_11((StoryShareComponent) abS693S0100000_11.l0, 207));
                    return;
                }
                return;
            }
            if (z2) {
                StoryShareComponent storyShareComponent = (StoryShareComponent) abS693S0100000_11.l0;
                storyShareComponent.getClass();
                C1390850mIV c1390850mIV = new C1390850mIV();
                C1247530iZL c1247530iZL = new C1247530iZL();
                c1247530iZL.LIZJ(R.raw.icon_flag);
                c1247530iZL.LIZIZ(2131835780);
                c1247530iZL.LIZ(new AwS600S0100000_21(storyShareComponent, 9));
                c1390850mIV.LIZ(c1247530iZL);
                c1390850mIV.LIZ.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0S10
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                    }
                };
                TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                Fragment fragmentLJI2 = C724240Sb0.LJI((StoryShareComponent) abS693S0100000_11.l0);
                if (fragmentLJI2 != null && (childFragmentManager = fragmentLJI2.getChildFragmentManager()) != null) {
                    tuxActionSheetLIZJ.show(childFragmentManager, "StoryHighlightsImmersiveMenu");
                }
                C1440005kM.LIZ(new C453940Hr6(true, false, 6));
                return;
            }
            if (zLJIIL && ((zLJFF || (zLJFF2 && (storyHighlightInfo2 = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme().storyHighlightInfo) != null && storyHighlightInfo2.containerCollectionInfo != null)) && (storyHighlightInfo = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme().storyHighlightInfo) != null)) {
                storyHighlightInfo.setSharedFromHighlightImmersiveFeed(true);
            }
            DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).getAweme().getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
            }
            DataCenter dataCenter2 = ((VideoItemParams) C631370Opb.LIZ((StoryShareComponent) abS693S0100000_11.l0)).dataCenter;
            if (dataCenter2 != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("tab_name", "output", bundle);
                dataCenter2.zQ2(bundle, "video_share_click");
            }
            StoryShareComponent storyShareComponent2 = (StoryShareComponent) abS693S0100000_11.l0;
            C724270Sb3 c724270Sb3 = storyShareComponent2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (celebrationMetaData = aweme.getCelebrationMetaData()) != null) {
                num = celebrationMetaData.celebrationType;
            } else {
                num = null;
            }
            String strLIZ = C0MLA.LIZ(num);
            C2344009Gk c2344009Gk = new C2344009Gk();
            C2189821An6 c2189821An62 = (C2189821An6) storyShareComponent2.LLJZ.getValue();
            if (c2189821An62 != null) {
                eventType = c2189821An62.getEventType();
            } else {
                eventType = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", eventType);
            C724270Sb3 c724270Sb32 = storyShareComponent2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", ((VideoItemParams) obj2).getAweme().getAid());
            C724270Sb3 c724270Sb33 = storyShareComponent2.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(((VideoItemParams) obj3).getAweme()));
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C724270Sb3 c724270Sb34 = storyShareComponent2.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            User author2 = ((VideoItemParams) obj4).getAweme().getAuthor();
            c735840Sti.getClass();
            c2344009Gk.LJIIIIZZ("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author2)));
            C724270Sb3 c724270Sb35 = storyShareComponent2.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            User author3 = ((VideoItemParams) obj5).getAweme().getAuthor();
            if (author3 != null) {
                numValueOf = Integer.valueOf(author3.getFollowStatusRelation());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "follow_status_relation");
            c2344009Gk.LJIIIIZZ("story_theme", strLIZ);
            C2189821An6 c2189821An63 = (C2189821An6) storyShareComponent2.LLJZ.getValue();
            if (c2189821An63 != null) {
                strLJIL = C1609930rzr.LJIL(c2189821An63);
            } else {
                strLJIL = null;
            }
            c2344009Gk.LJIIIIZZ("enter_position", strLJIL);
            C724270Sb3 c724270Sb36 = storyShareComponent2.LLJI;
            if (c724270Sb36 != null) {
                obj6 = c724270Sb36.LL;
            } else {
                obj6 = null;
            }
            if (C729510SjV.LJJ(((VideoItemParams) obj6).getAweme())) {
                str = "story";
            } else {
                str = "post";
            }
            c2344009Gk.LJIIIIZZ("story_type", str);
            C724270Sb3 c724270Sb37 = storyShareComponent2.LLJI;
            if (c724270Sb37 != null) {
                obj7 = c724270Sb37.LL;
            } else {
                obj7 = null;
            }
            String str5 = "1";
            if (C729510SjV.LJJIIZI(((VideoItemParams) obj7).getAweme())) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_note", str2);
            C724270Sb3 c724270Sb38 = storyShareComponent2.LLJI;
            if (c724270Sb38 != null) {
                obj8 = c724270Sb38.LL;
            } else {
                obj8 = null;
            }
            if (!AwemeBizExtKt.getHasFriendsTag(((VideoItemParams) obj8).getAweme())) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("has_friends_tag", str5);
            C724270Sb3 c724270Sb39 = storyShareComponent2.LLJI;
            if (c724270Sb39 != null) {
                obj9 = c724270Sb39.LL;
            } else {
                obj9 = null;
            }
            c2344009Gk.LIZJ(((VideoItemParams) obj9).getAweme().getAwemeType(), "aweme_type");
            C724270Sb3 c724270Sb310 = storyShareComponent2.LLJI;
            if (c724270Sb310 != null) {
                obj10 = c724270Sb310.LL;
            } else {
                obj10 = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", ((VideoItemParams) obj10).getAweme().getRequestId());
            C724270Sb3 c724270Sb311 = storyShareComponent2.LLJI;
            if (c724270Sb311 != null) {
                obj11 = c724270Sb311.LL;
            } else {
                obj11 = null;
            }
            c2344009Gk.LJIIIIZZ("story_collection_id", C729510SjV.LJII(((VideoItemParams) obj11).getAweme()));
            C2189821An6 c2189821An64 = (C2189821An6) storyShareComponent2.LLJZ.getValue();
            if (c2189821An64 != null) {
                eventType2 = c2189821An64.getEventType();
            } else {
                eventType2 = null;
            }
            c2344009Gk.LJIIIIZZ("previous_page", eventType2);
            if (zLJIIL) {
                c2344009Gk.LJFF("content_type", "story_highlight");
                C724270Sb3 c724270Sb312 = storyShareComponent2.LLJI;
                if (c724270Sb312 != null) {
                    obj14 = c724270Sb312.LL;
                } else {
                    obj14 = null;
                }
                StoryHighlightInfo storyHighlightInfo3 = ((VideoItemParams) obj14).getAweme().storyHighlightInfo;
                if (storyHighlightInfo3 != null && (storyHighlightCollection = storyHighlightInfo3.containerCollectionInfo) != null && (str3 = storyHighlightCollection.collectionId) != null) {
                    str4 = str3;
                }
                c2344009Gk.LJFF("story_highlight_id", str4);
            }
            C724270Sb3 c724270Sb313 = storyShareComponent2.LLJI;
            if (c724270Sb313 != null) {
                obj12 = c724270Sb313.LL;
            } else {
                obj12 = null;
            }
            C1357660lQy.LIZLLL(c2344009Gk, ((VideoItemParams) obj12).getAweme());
            C724270Sb3 c724270Sb314 = storyShareComponent2.LLJI;
            if (c724270Sb314 != null) {
                obj13 = c724270Sb314.LL;
            } else {
                obj13 = null;
            }
            C1357660lQy.LJI(c2344009Gk, ((VideoItemParams) obj13).getAweme());
            C724270Sb3 c724270Sb315 = storyShareComponent2.LLJI;
            if (c724270Sb315 != null) {
                obj15 = c724270Sb315.LL;
            }
            C1357660lQy.LJIIIIZZ(c2344009Gk, ((VideoItemParams) obj15).getAweme());
            C20684815ws.LJIILLIIL("click_more_button", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$13(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((StoryViewerEntranceComponent) abS693S0100000_11.l0).BN(view.getContext(), "click_bottom_bar", null);
        }
    }

    public static final void LIZ$14(AbS693S0100000_11 abS693S0100000_11, View view) {
        int i;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        if (view != null) {
            C0RF0 c0rf0 = ((StoryImmersiveQuitComponent) abS693S0100000_11.l0).LLJLLIL;
            String from = null;
            if (c0rf0 == null) {
                c0rf0 = null;
            }
            IDetailBaseAbility iDetailBaseAbilityLIZ = C1600710rkz.LIZ(c0rf0.LIZJ);
            if (iDetailBaseAbilityLIZ != null) {
                StoryImmersiveQuitComponent storyImmersiveQuitComponent = (StoryImmersiveQuitComponent) abS693S0100000_11.l0;
                storyImmersiveQuitComponent.getClass();
                C721900STk c721900STk = C721900STk.LIZ;
                C0RF0 c0rf02 = storyImmersiveQuitComponent.jm().LIZLLL;
                if (c0rf02 != null && (baseFeedPageParams = c0rf02.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                    from = c2189821An6.getFrom();
                }
                c721900STk.getClass();
                if (Intrinsics.LJFF("STORY_ENTRANCE_GUIDE_CARD", from)) {
                    i = 1;
                } else {
                    i = -1;
                }
                iDetailBaseAbilityLIZ.yF(i, "click");
            }
            if (C0S12.LIZJ(((VideoItemParams) C631370Opb.LIZ((StoryImmersiveQuitComponent) abS693S0100000_11.l0)).getAweme())) {
                C0ROF.LIZ.getClass();
                C0ROF.LIZIZ();
            }
        }
    }

    public static final void LIZ$15(AbS693S0100000_11 abS693S0100000_11, View view) {
        C0SZ8 c0sz8LJLIL;
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        if (view != null) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) ((FriendsDetailViewerEntranceUIAssem) abS693S0100000_11.l0).LLJJJIL.getValue();
            InterfaceC494301wD interfaceC494301wDLIZ2 = null;
            if (iViewPagerComponentAbility != null) {
                c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
            } else {
                c0sz8LJLIL = null;
            }
            if ((c0sz8LJLIL instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FriendsDetailViewerEntranceLogicAbility.class, null)) != null) {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            } else {
                if ((c0sz8LJLIL instanceof C0SZ8) && c0sz8LJLIL != null) {
                    c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                } else {
                    c0sz8LLJLLL = null;
                }
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FriendsDetailViewerEntranceLogicAbility.class, null);
                }
            }
            FriendsDetailViewerEntranceLogicAbility friendsDetailViewerEntranceLogicAbility = (FriendsDetailViewerEntranceLogicAbility) interfaceC494301wDLIZ2;
            if (friendsDetailViewerEntranceLogicAbility != null) {
                friendsDetailViewerEntranceLogicAbility.n10("click_bottom_bar");
            }
        }
    }

    public static final void LIZ$16(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((Function1) abS693S0100000_11.l0).invoke(view);
        }
    }

    public static final void LIZ$17(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            FriendsRepostInteractiveAssem friendsRepostInteractiveAssem = (FriendsRepostInteractiveAssem) abS693S0100000_11.l0;
            int i = FriendsRepostInteractiveAssem.LLJZ;
            friendsRepostInteractiveAssem.tp(null);
        }
    }

    public static final void LIZ$2(AbS693S0100000_11 abS693S0100000_11, View view) {
        C0RJN c0rjnLIZIZ;
        Object obj;
        Object obj2;
        String uid;
        Object obj3;
        Object obj4;
        if (view != null) {
            FriendsV3RepostMessageButtonAssem friendsV3RepostMessageButtonAssem = (FriendsV3RepostMessageButtonAssem) abS693S0100000_11.l0;
            friendsV3RepostMessageButtonAssem.getClass();
            C109100bB c109100bB = C109100bB.LIZ;
            C13DA c13da = new C13DA();
            c13da.put("friends_tab_version", "v3.0");
            Fragment fragmentLJI = C724240Sb0.LJI(friendsV3RepostMessageButtonAssem);
            if (fragmentLJI != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
            } else {
                c0rjnLIZIZ = null;
            }
            c13da.put("enter_from", C1389300mG0.LIZ(c0rjnLIZIZ));
            C724270Sb3 c724270Sb3 = friendsV3RepostMessageButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c13da.put("group_id", ((C0OB8) obj).getAweme().getAid());
            C724270Sb3 c724270Sb32 = friendsV3RepostMessageButtonAssem.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            User userLLILLL = ((InterfaceC1361270lWn) obj2).LLILLL();
            if (userLLILLL != null) {
                uid = userLLILLL.getUid();
            } else {
                uid = null;
            }
            c13da.put("author_id", uid);
            Map mapBuild = c13da.build();
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_friend_tab_dm_btn_click", mapBuild);
            C724270Sb3 c724270Sb33 = friendsV3RepostMessageButtonAssem.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            User userLLILLL2 = ((InterfaceC1361270lWn) obj3).LLILLL();
            if (userLLILLL2 != null) {
                C0SY3 c0sy3 = C0SY3.LIZ;
                Context context = friendsV3RepostMessageButtonAssem.getContext();
                Fragment fragmentLJI2 = C724240Sb0.LJI(friendsV3RepostMessageButtonAssem);
                C724270Sb3 c724270Sb34 = friendsV3RepostMessageButtonAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(friendsV3RepostMessageButtonAssem), FriendsV3PlayerAbility.class, null);
                c0sy3.getClass();
                C0SY3.LIZ(context, fragmentLJI2, (InterfaceC1361270lWn) obj4, userLLILLL2, friendsV3PlayerAbility);
            }
        }
    }

    public static final void LIZ$3(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0).Ep();
        }
    }

    public static final void LIZ$4(AbS693S0100000_11 abS693S0100000_11, View view) {
        if (view != null) {
            ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0).Ep();
        }
    }

    public static final void LIZ$5(AbS693S0100000_11 abS693S0100000_11, View view) {
        Context context;
        if (view != null && (context = ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0).getContext()) != null) {
            C0SFC.LIZIZ.LIZ(C724240Sb0.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0), context, ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).getAweme().getAid(), ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).getAweme(), ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).mEventType, Boolean.valueOf(!C0C64.LJIILLIIL().LJIIIZ(31744, "mini_drama_cta_disable_auto_panel", true, false)), "", AFwS243S0000000_11.get$arr$(310));
        }
    }

    public static final void LIZ$6(AbS693S0100000_11 abS693S0100000_11, View view) {
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        CtaDisplayConfig ctaDisplayConfig;
        String playNextVideoId;
        if (view != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).getAweme();
            String aid = aweme.getAid();
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (ctaDisplayConfig = paidContentMiniDramaInfoLIZ.getCtaDisplayConfig()) != null && (playNextVideoId = ctaDisplayConfig.getPlayNextVideoId()) != null && playNextVideoId.length() != 0) {
                aid = playNextVideoId;
            }
            Context context = ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0).getContext();
            if (context != null) {
                C0SFC.LIZIZ.LIZ(C724240Sb0.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0), context, aid, ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).getAweme(), ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonAssem) abS693S0100000_11.l0)).mEventType, Boolean.FALSE, "bottom_button_play_next", AFwS243S0000000_11.get$arr$(310));
            }
        }
    }

    public static final void LIZ$7(AbS693S0100000_11 abS693S0100000_11, View view) {
        Long lValueOf;
        Long lValueOf2;
        String jumpEpisodeVideoId;
        Boolean boolIsJumpLastWatch;
        PaidContentInfo paidContentInfo;
        String str;
        boolean zIsLimitedFreeShortDrama;
        String innerFeedPanelFreeTagText;
        String innerFeedPanelTitle;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ4;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ5;
        if (view != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).getAweme();
            String aid = aweme.getAid();
            PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
            String innerFeedPanelDesc = null;
            if (paidContentInfo2 != null) {
                lValueOf = Long.valueOf(paidContentInfo2.getPaidCollectionId());
            } else {
                lValueOf = null;
            }
            PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
            if (paidContentInfo3 != null) {
                lValueOf2 = Long.valueOf(paidContentInfo3.getCategory());
            } else {
                lValueOf2 = null;
            }
            PaidContentInfo paidContentInfo4 = aweme.mPaidContentInfo;
            if (paidContentInfo4 != null && (paidContentMiniDramaInfoLIZ5 = C718180SFc.LIZ(paidContentInfo4)) != null) {
                jumpEpisodeVideoId = paidContentMiniDramaInfoLIZ5.getJumpEpisodeVideoId();
            } else {
                jumpEpisodeVideoId = null;
            }
            PaidContentInfo paidContentInfo5 = aweme.mPaidContentInfo;
            if (paidContentInfo5 != null && (paidContentMiniDramaInfoLIZ4 = C718180SFc.LIZ(paidContentInfo5)) != null) {
                boolIsJumpLastWatch = paidContentMiniDramaInfoLIZ4.isJumpLastWatch();
            } else {
                boolIsJumpLastWatch = null;
            }
            if (jumpEpisodeVideoId == null || jumpEpisodeVideoId.length() == 0) {
                if (!Intrinsics.LJFF(boolIsJumpLastWatch, Boolean.TRUE) && (paidContentInfo = aweme.mPaidContentInfo) != null && !paidContentInfo.isPaidCollectionIntro()) {
                    jumpEpisodeVideoId = aid;
                } else {
                    jumpEpisodeVideoId = null;
                }
            }
            String strLIZIZ = "";
            if (!Intrinsics.LJFF(jumpEpisodeVideoId, aid) || C724240Sb0.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0) == null) {
                str = "";
            } else {
                C1012040cRW.LIZIZ().LIZ = C1483410ohn.LJLJJI();
                C1012040cRW.LIZIZ().LIZJ = System.currentTimeMillis();
                C1012040cRW.LIZIZ().LIZIZ = aid;
                str = "1";
            }
            PaidContentInfo paidContentInfo6 = aweme.mPaidContentInfo;
            if (paidContentInfo6 != null) {
                zIsLimitedFreeShortDrama = paidContentInfo6.isLimitedFreeShortDrama();
            } else {
                zIsLimitedFreeShortDrama = false;
            }
            boolean zLIZIZ = C718510SGj.LIZIZ(aweme);
            if (zLIZIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).mEventType);
                sbLIZ.append("_outerfeed");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            Context context = ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0).getContext();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aweme://paidcontent/innerfeed?enter_from=");
            sbLIZ2.append(((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).mEventType);
            sbLIZ2.append("&collection_id=");
            sbLIZ2.append(lValueOf);
            sbLIZ2.append("&category=");
            sbLIZ2.append(lValueOf2);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2));
            smartRouteBuildRoute.withParam("is_from_bottom_banner", true);
            smartRouteBuildRoute.withParam("is_intro_or_preview", ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).getAweme().isPaidContent);
            smartRouteBuildRoute.withParam("should_hide_video_list", "1");
            smartRouteBuildRoute.withParam("root_scene", "2");
            smartRouteBuildRoute.withParam("use_share_player", str);
            if (jumpEpisodeVideoId != null && jumpEpisodeVideoId.length() != 0) {
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, jumpEpisodeVideoId);
            }
            smartRouteBuildRoute.withParam("is_limited_free", zIsLimitedFreeShortDrama);
            smartRouteBuildRoute.withParam("source_video_id", aweme.getAid());
            smartRouteBuildRoute.withParam("source_group_id", aweme.getGroupId());
            smartRouteBuildRoute.withParam("source_author_id", AwemeExtKt.getAuthorUid(aweme));
            smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(aweme));
            smartRouteBuildRoute.withParam("log_extra", C718180SFc.LIZIZ(aweme));
            smartRouteBuildRoute.withParam("series_feed_type", C718180SFc.LIZLLL(aweme, ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).mEventType));
            PaidContentInfo paidContentInfo7 = ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).getAweme().mPaidContentInfo;
            if (paidContentInfo7 != null && (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo7)) != null) {
                innerFeedPanelFreeTagText = paidContentMiniDramaInfoLIZ3.getInnerFeedPanelFreeTagText();
            } else {
                innerFeedPanelFreeTagText = null;
            }
            smartRouteBuildRoute.withParam("free_tag_text", innerFeedPanelFreeTagText);
            PaidContentInfo paidContentInfo8 = ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).getAweme().mPaidContentInfo;
            if (paidContentInfo8 != null && (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo8)) != null) {
                innerFeedPanelTitle = paidContentMiniDramaInfoLIZ2.getInnerFeedPanelTitle();
            } else {
                innerFeedPanelTitle = null;
            }
            smartRouteBuildRoute.withParam("inner_feed_panel_title", innerFeedPanelTitle);
            PaidContentInfo paidContentInfo9 = ((VideoItemParams) C631370Opb.LIZ((MiniDramaBottomButtonBackupAssem) abS693S0100000_11.l0)).getAweme().mPaidContentInfo;
            if (paidContentInfo9 != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo9)) != null) {
                innerFeedPanelDesc = paidContentMiniDramaInfoLIZ.getInnerFeedPanelDesc();
            }
            smartRouteBuildRoute.withParam("inner_feed_panel_desc", innerFeedPanelDesc);
            smartRouteBuildRoute.withParam("drama_extra_tracking_params", new DramaExtraTrackingParams(Boolean.FALSE, Boolean.valueOf(zLIZIZ), strLIZIZ, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE).toJson());
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$8(AbS693S0100000_11 abS693S0100000_11, View view) {
        StoryUploadProgressComponent storyUploadProgressComponent;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp;
        String scheduleId;
        Aweme item;
        if (view != null && (feedCollectionViewPagerAbilityEp = (storyUploadProgressComponent = (StoryUploadProgressComponent) abS693S0100000_11.l0).Ep()) != null) {
            int iLJIL = feedCollectionViewPagerAbilityEp.LJIL();
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityEp2 = storyUploadProgressComponent.Ep();
            if (feedCollectionViewPagerAbilityEp2 == null || (item = feedCollectionViewPagerAbilityEp2.getItem(iLJIL)) == null || (scheduleId = AwemeBizExtKt.getScheduleId(item)) == null) {
                scheduleId = "";
            }
            storyUploadProgressComponent.Jp(scheduleId);
            C729220Sj2 c729220Sj2 = C729220Sj2.LL;
            Function1<List<C0SPF>, Unit> awS125S1100000_11 = new AwS125S1100000_11(scheduleId, storyUploadProgressComponent, 18);
            c729220Sj2.getClass();
            C729440SjO c729440SjO = C729220Sj2.LJIIZILJ().LLILLJJLI;
            c729440SjO.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (Intrinsics.LJFF(c729440SjO.LLJ, curUserId) && !c729440SjO.LL.LIZIZ.get()) {
                CopyOnWriteArrayList<C0SPF> copyOnWriteArrayList = c729440SjO.LL.LIZJ;
                ArrayList arrayList = new ArrayList();
                for (C0SPF c0spf : copyOnWriteArrayList) {
                    if (c0spf.LIZIZ.LIZIZ == EnumC696090RSd.FAILED) {
                        arrayList.add(c0spf);
                    }
                }
                awS125S1100000_11.invoke(arrayList);
                return;
            }
            CopyOnWriteArrayList<Function1<List<C0SPF>, Unit>> copyOnWriteArrayList2 = c729440SjO.LL.LIZLLL.get(curUserId);
            if (copyOnWriteArrayList2 == null) {
                c729440SjO.LL.LIZLLL.clear();
                CopyOnWriteArrayList<Function1<List<C0SPF>, Unit>> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList3.add(awS125S1100000_11);
                c729440SjO.LL.LIZLLL.put(curUserId, copyOnWriteArrayList3);
            } else {
                copyOnWriteArrayList2.add(awS125S1100000_11);
            }
            c729440SjO.LJIIJJI(null, C2296808zG.LIZ(C0PEM.LIZJ));
        }
    }

    public static final void LIZ$9(AbS693S0100000_11 abS693S0100000_11, View view) {
        Aweme aweme;
        String scheduleId;
        String str;
        String string;
        SimplePublishModel simplePublishModel;
        if (view != null && (aweme = ((StoryUploadProgressComponent) abS693S0100000_11.l0).LLLFF) != null && (scheduleId = AwemeBizExtKt.getScheduleId(aweme)) != null && C729510SjV.LJIJ(aweme) && scheduleId.length() != 0) {
            C0RSU c0rsu = ((StoryUploadProgressComponent) abS693S0100000_11.l0).LLLFZ.get(scheduleId);
            C0SPF c0spfLJIIJ = C729220Sj2.LL.LJIIJ(scheduleId);
            if (c0spfLJIIJ != null && (simplePublishModel = c0spfLJIIJ.LIZ) != null) {
                str = simplePublishModel.publishId;
            } else {
                str = null;
            }
            if (c0rsu != null && (c0rsu instanceof C205700ql)) {
                C1397580mTM c1397580mTM = new C1397580mTM(((StoryUploadProgressComponent) abS693S0100000_11.l0).getContentView().getContext());
                c1397580mTM.LJFF(2131846539);
                c1397580mTM.LIZ(2131846538);
                C985403tE.LIZ(c1397580mTM, new AwS96S1200000_11(str, (StoryUploadProgressComponent) abS693S0100000_11.l0, c0spfLJIIJ, 0));
                c1397580mTM.LJII = false;
                c1397580mTM.LIZLLL(new AwS590S0100000_11((StoryUploadProgressComponent) abS693S0100000_11.l0, 176));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                ((StoryUploadProgressComponent) abS693S0100000_11.l0).LLLIIL = c1397510mTF;
                c1397510mTF.LIZLLL();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancelPublish: ");
            sbLIZ.append(AwemeBizExtKt.getScheduleId(aweme));
            C2188811AlT.LIZIZ(sbLIZ);
            if (aweme.getIsTikTokStory()) {
                string = ((StoryUploadProgressComponent) abS693S0100000_11.l0).getContentView().getContext().getString(2131830546);
            } else {
                string = ((StoryUploadProgressComponent) abS693S0100000_11.l0).getContentView().getContext().getString(2131844940);
            }
            C1397580mTM c1397580mTM2 = new C1397580mTM(((StoryUploadProgressComponent) abS693S0100000_11.l0).getContentView().getContext());
            c1397580mTM2.LIZIZ(string);
            C985403tE.LIZ(c1397580mTM2, new AwS377S0200000_11(aweme, (StoryUploadProgressComponent) abS693S0100000_11.l0, 47));
            c1397580mTM2.LJII = false;
            c1397580mTM2.LIZLLL(new AwS590S0100000_11((StoryUploadProgressComponent) abS693S0100000_11.l0, 177));
            C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM2);
            ((StoryUploadProgressComponent) abS693S0100000_11.l0).LLLIIL = c1397510mTF2;
            c1397510mTF2.LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS693S0100000_11(StoryShareComponent storyShareComponent, int i) {
        super(800L);
        this.$t = i;
        this.l0 = storyShareComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS693S0100000_11(Object obj, int i) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS693S0100000_11(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
