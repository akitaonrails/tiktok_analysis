package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0OB8;
import X.C0OVM;
import X.C0RJN;
import X.C0ROE;
import X.C0ROF;
import X.C0ROG;
import X.C0S12;
import X.C0SY7;
import X.C0SZ8;
import X.C1206504nn;
import X.C1247120iYg;
import X.C1252380ihA;
import X.C1260960iv0;
import X.C1360320lVG;
import X.C1386160mAw;
import X.C1388190mED;
import X.C1389300mG0;
import X.C13LP;
import X.C13LQ;
import X.C1558420qem;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1600710rkz;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C563980MAa;
import X.C631370Opb;
import X.C695110ROj;
import X.C721230SQv;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C727310Sfx;
import X.C727350Sg1;
import X.C729510SjV;
import X.C735840Sti;
import X.EnumC717440SCg;
import X.EnumC736440Sug;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC898260ZLs;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarDiggButtonAssem;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggLogicAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.avatar.FriendsV3AvatarAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3UserInfoAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3MessageAbility;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.service.ISocialPortraitService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.StoryGuideUploadCardConfigModel;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardThoughtComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardAvatarViewModel;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardLogicAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal.StoryRevealUnlockButtonComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.center.StoryRevealOptOutComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AkS83S0100000_11 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS83S0100000_11(FriendsV3AvatarAssem friendsV3AvatarAssem, int i) {
        super(2000L);
        this.$t = i;
        if (1 - i != 0) {
            this.l0 = friendsV3AvatarAssem;
        } else {
            this.l0 = friendsV3AvatarAssem;
        }
    }

    public static final void LIZ$0(AkS83S0100000_11 akS83S0100000_11, View view) {
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) ((FriendsDetailBottomBarDiggButtonAssem) akS83S0100000_11.l0).LLJJIJIL.getValue();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (iViewPagerComponentAbility != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null) {
            if ((c0sz8LJLIL instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FriendsDetailDiggLogicAbility.class, null)) != null) {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            } else {
                C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FriendsDetailDiggLogicAbility.class, null);
                }
            }
            FriendsDetailDiggLogicAbility friendsDetailDiggLogicAbility = (FriendsDetailDiggLogicAbility) interfaceC494301wDLIZ2;
            if (friendsDetailDiggLogicAbility != null) {
                friendsDetailDiggLogicAbility.fH2();
            }
        }
    }

    public static final void LIZ$1(AkS83S0100000_11 akS83S0100000_11, View view) {
        C0RJN c0rjnLIZIZ;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) C631370Opb.LIZ((FriendsV3AvatarAssem) akS83S0100000_11.l0);
        Context context = ((FriendsV3AvatarAssem) akS83S0100000_11.l0).getContext();
        Fragment fragmentLJI = C724240Sb0.LJI((FriendsV3AvatarAssem) akS83S0100000_11.l0);
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        C1386160mAw.LJIIIZ(interfaceC1361270lWn, context, C1389300mG0.LIZ(c0rjnLIZIZ), "click_head", C1389300mG0.LIZIZ(C724240Sb0.LJI((FriendsV3AvatarAssem) akS83S0100000_11.l0)));
    }

    public static final void LIZ$10(AkS83S0100000_11 akS83S0100000_11, View view) {
        C19EG c19egLIZIZ;
        String str;
        Context context = ((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C0ROF c0rof = C0ROF.LIZ;
            Keva keva = C0ROF.LIZIZ;
            c0rof.getClass();
            int i = keva.getInt(C0ROF.LIZ("constant_negative_signal_times"), 0);
            if (!keva.getBoolean(C0ROF.LIZ("shutdown_forever"), false) && i < ((StoryGuideUploadCardConfigModel) C0ROG.LIZIZ.getValue()).limitNegativeSignalTimes) {
                keva.storeInt(C0ROF.LIZ("constant_negative_signal_times"), 0);
            }
            StoryInsertCard storyInsertCard = ((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0).LLJLLL;
            if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
                str = "";
            }
            C563980MAa.LIZ(c19egLIZIZ, "click_publish_card_create_new_story", str);
        }
    }

    public static final void LIZ$11(AkS83S0100000_11 akS83S0100000_11, View view) {
        String str;
        IDetailBaseAbility iDetailBaseAbilityLIZ;
        C0ROE c0roe = C0ROE.LIZ;
        StoryGuideUploadCardLogicAssem storyGuideUploadCardLogicAssem = (StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0;
        StoryInsertCard storyInsertCard = storyGuideUploadCardLogicAssem.LLJLLL;
        String str2 = "";
        if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
            str = "";
        }
        int i = storyGuideUploadCardLogicAssem.LLLFZ;
        c0roe.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str2 = "three_photo";
                    }
                } else {
                    str2 = "profile";
                }
            } else {
                str2 = "one_photo";
            }
        } else {
            str2 = "non_profile";
        }
        C20684815ws.LJIILLIIL("click_story_publish_card_not_now", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_position", "top_cell"), new Pair("card_type", str2)));
        StoryInsertCard storyInsertCard2 = ((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0).LLJLLL;
        if (storyInsertCard2 != null && storyInsertCard2.insertLast()) {
            Fragment fragmentLJI = C724240Sb0.LJI((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0);
            if (fragmentLJI != null && (iDetailBaseAbilityLIZ = C1600710rkz.LIZ(fragmentLJI)) != null) {
                iDetailBaseAbilityLIZ.yF(-1, "click");
            }
        } else {
            UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) ((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0).LLJLLIL.getValue();
            if (userFeedViewPagerAbility != null) {
                userFeedViewPagerAbility.rf0("auto");
            }
            UserFeedViewPagerAbility userFeedViewPagerAbility2 = (UserFeedViewPagerAbility) ((StoryGuideUploadCardLogicAssem) akS83S0100000_11.l0).LLJLLIL.getValue();
            if (userFeedViewPagerAbility2 != null) {
                userFeedViewPagerAbility2.bh1();
            }
        }
        C0ROF.LIZ.getClass();
        C0ROF.LIZIZ();
    }

    public static final void LIZ$12(AkS83S0100000_11 akS83S0100000_11, View view) {
        InterfaceC898260ZLs interfaceC898260ZLs;
        int value;
        C0RJN c0rjnLIZIZ;
        String strLIZIZ;
        C0RJN c0rjnLIZIZ2;
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String strValueOf;
        Object obj9;
        String str2;
        FriendsV3MessageAbility friendsV3MessageAbility;
        if (C1206504nn.LIZ() && (friendsV3MessageAbility = (FriendsV3MessageAbility) ((FriendsV3AvatarAssem) akS83S0100000_11.l0).LLJJJJJIL.getValue()) != null) {
            friendsV3MessageAbility.hL1();
        }
        User userCp = ((FriendsV3AvatarAssem) akS83S0100000_11.l0).cp();
        if (userCp != null && (interfaceC898260ZLs = (InterfaceC898260ZLs) ((FriendsV3AvatarAssem) akS83S0100000_11.l0).LLJJJJLIIL.getValue()) != null) {
            C0OVM c0ovm = new C0OVM();
            c0ovm.LIZJ(userCp.getUid());
            c0ovm.LIZIZ(userCp.getSecUid());
            c0ovm.LIZ.LJIIJ = userCp.getFollowStatus();
            c0ovm.LIZ.LJIIJJI = userCp.getFollowerStatus();
            c0ovm.LIZ.LJIILIIL = userCp.isAccuratePrivateAccount();
            FriendsV3AvatarAssem friendsV3AvatarAssem = (FriendsV3AvatarAssem) akS83S0100000_11.l0;
            int followStatus = userCp.getFollowStatus();
            friendsV3AvatarAssem.getClass();
            C0SY7 c0sy7 = C0SY7.UNFOLLOW;
            if (followStatus == c0sy7.getValue()) {
                value = C0SY7.FOLLOWED.getValue();
            } else {
                value = c0sy7.getValue();
            }
            c0ovm.LIZ.LIZLLL = value;
            Fragment fragmentLJI = C724240Sb0.LJI((FriendsV3AvatarAssem) akS83S0100000_11.l0);
            if (fragmentLJI != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
            } else {
                c0rjnLIZIZ = null;
            }
            String strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
            C1252380ihA c1252380ihA = c0ovm.LIZ;
            c1252380ihA.LJI = strLIZ;
            c1252380ihA.LJIILL = userCp;
            c0ovm.LIZ.LJIILLIIL = userCp.getAccurateRecType();
            c0ovm.LIZ.LJIJI = String.valueOf(((FriendsV3AvatarAssem) akS83S0100000_11.l0).hashCode());
            C1252380ihA c1252380ihALIZ = c0ovm.LIZ();
            FriendsV3AvatarAssem friendsV3AvatarAssem2 = (FriendsV3AvatarAssem) akS83S0100000_11.l0;
            Fragment fragmentLJI2 = C724240Sb0.LJI(friendsV3AvatarAssem2);
            if (fragmentLJI2 == null || (strLIZIZ = C1389300mG0.LIZIZ(fragmentLJI2)) == null) {
                strLIZIZ = "";
            }
            Fragment fragmentLJI3 = C724240Sb0.LJI(friendsV3AvatarAssem2);
            if (fragmentLJI3 != null) {
                c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragmentLJI3);
            } else {
                c0rjnLIZIZ2 = null;
            }
            String strLIZ2 = C1389300mG0.LIZ(c0rjnLIZIZ2);
            User author = ((C0OB8) C631370Opb.LIZ(friendsV3AvatarAssem2)).getAweme().getAuthor();
            C724270Sb3 c724270Sb3 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C729510SjV.LJJIJIL(((C0OB8) obj).getAweme())) {
                str = "story";
            } else {
                str = "post";
            }
            C724270Sb3 c724270Sb32 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(((C0OB8) obj2).getAweme());
            C724270Sb3 c724270Sb33 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            String aid = ((C0OB8) obj3).getAweme().getAid();
            C724270Sb3 c724270Sb34 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            int awemeType = ((C0OB8) obj4).getAweme().getAwemeType();
            C724270Sb3 c724270Sb35 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            String strLJII = C729510SjV.LJII(((C0OB8) obj5).getAweme());
            C724270Sb3 c724270Sb36 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb36 != null) {
                obj6 = c724270Sb36.LL;
            } else {
                obj6 = null;
            }
            boolean z = obj6 instanceof InterfaceC1357880lRK;
            String strLIZ3 = C721230SQv.LIZ(Boolean.valueOf(C1360320lVG.LIZJ(strLIZIZ)));
            Pair[] pairArr = new Pair[3];
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C724270Sb3 c724270Sb37 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb37 != null) {
                obj7 = c724270Sb37.LL;
            } else {
                obj7 = null;
            }
            User author2 = ((C0OB8) obj7).getAweme().getAuthor();
            c735840Sti.getClass();
            pairArr[0] = new Pair("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author2)));
            C724270Sb3 c724270Sb38 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb38 != null) {
                obj8 = c724270Sb38.LL;
            } else {
                obj8 = null;
            }
            User author3 = ((C0OB8) obj8).getAweme().getAuthor();
            if (author3 == null || (strValueOf = Integer.valueOf(author3.getFollowStatusRelation()).toString()) == null) {
                strValueOf = String.valueOf(EnumC736440Sug.ELSE.getValue());
            }
            pairArr[1] = new Pair("follow_status_relation", strValueOf);
            C724270Sb3 c724270Sb39 = friendsV3AvatarAssem2.LLJI;
            if (c724270Sb39 != null) {
                obj9 = c724270Sb39.LL;
            } else {
                obj9 = null;
            }
            if (C729510SjV.LJJIIZI(((C0OB8) obj9).getAweme())) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[2] = new Pair("is_note", str2);
            interfaceC898260ZLs.Hb1(c1252380ihALIZ, new C1260960iv0(strLIZ2, author, "main_head", (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, aid, str, strLJII, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Integer.valueOf(awemeType), (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, C2097608Jq.LJIIIIZZ(pairArr), (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, authorUid, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, "v3.0", "feed", (Integer) null, Integer.valueOf(z ? 1 : 0), strLIZ3, (C1247120iYg) null, (Map) null, -229384, -8390673, 12927), null);
        }
    }

    public static final void LIZ$2(AkS83S0100000_11 akS83S0100000_11, View view) {
        ((StoryGuideCardThoughtComponent) akS83S0100000_11.l0).Fp().vQ2("story_card");
        StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = ((StoryGuideCardThoughtComponent) akS83S0100000_11.l0).Fp();
        storyGuideCardAvatarViewModelFp.getClass();
        storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(782));
    }

    public static final void LIZ$3(AkS83S0100000_11 akS83S0100000_11, View view) {
        ((StoryGuideCardThoughtComponent) akS83S0100000_11.l0).Fp().vQ2("story_card");
        StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = ((StoryGuideCardThoughtComponent) akS83S0100000_11.l0).Fp();
        storyGuideCardAvatarViewModelFp.getClass();
        storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(783));
    }

    public static final void LIZ$4(AkS83S0100000_11 akS83S0100000_11, View view) {
        ((StoryGuideCardThoughtComponent) akS83S0100000_11.l0).Fp().vQ2("story_card_bubble");
    }

    public static final void LIZ$5(AkS83S0100000_11 akS83S0100000_11, View view) {
        Boolean boolValueOf;
        StoryPhotoAbility storyPhotoAbilityEp;
        C19EG c19egLIZ = C724240Sb0.LIZ((StoryRevealOptOutComponent) akS83S0100000_11.l0);
        if (c19egLIZ != null) {
            StoryPhotoAbility storyPhotoAbilityEp2 = ((StoryRevealOptOutComponent) akS83S0100000_11.l0).Ep();
            if (storyPhotoAbilityEp2 != null) {
                storyPhotoAbilityEp2.pausePlay();
            }
            IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
            if (iStoryRevealService != null) {
                boolValueOf = Boolean.valueOf(iStoryRevealService.LIZ(c19egLIZ, C695110ROj.LIZ(((StoryRevealOptOutComponent) akS83S0100000_11.l0).jm()), EnumC717440SCg.TOP_RIGHT_DOTS, new AwS555S0100000_11((StoryRevealOptOutComponent) akS83S0100000_11.l0, 788)));
            } else {
                boolValueOf = null;
            }
            if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && (storyPhotoAbilityEp = ((StoryRevealOptOutComponent) akS83S0100000_11.l0).Ep()) != null) {
                storyPhotoAbilityEp.LJIILLIIL();
            }
        }
    }

    public static final void LIZ$6(AkS83S0100000_11 akS83S0100000_11, View view) {
        Aweme aweme;
        String str;
        C727310Sfx item = ((StoryGalleryCoverCell) akS83S0100000_11.l0).getItem();
        if (item != null && (aweme = item.LL) != null && C0S12.LIZIZ(aweme)) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((StoryGalleryCoverCell) akS83S0100000_11.l0).itemView.getContext());
            if (c19egLIZIZ != null) {
                AssemVMLazy assemVMLazy = ((StoryGalleryCoverCell) akS83S0100000_11.l0).LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryGalleryCoverCell.LLIZLLLIL;
                C727350Sg1 c727350Sg1 = ((StoryViewerListViewModel) assemVMLazy.getValue()).LLILLL;
                if (c727350Sg1 == null || (str = c727350Sg1.feedEnterFrom) == null) {
                    str = "";
                }
                C563980MAa.LIZ(c19egLIZIZ, "click_view_lists_panel_camera_icon", str);
                return;
            }
            return;
        }
        AssemVMLazy assemVMLazy2 = ((StoryGalleryCoverCell) akS83S0100000_11.l0).LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = StoryGalleryCoverCell.LLIZLLLIL;
        assemVMLazy2.getValue().setState(new AwS26S0001000_11(((StoryGalleryCoverCell) akS83S0100000_11.l0).getLayoutPosition(), 1));
    }

    public static final void LIZ$7(AkS83S0100000_11 akS83S0100000_11, View view) {
        StoryRevealUnlockButtonComponent storyRevealUnlockButtonComponent = (StoryRevealUnlockButtonComponent) akS83S0100000_11.l0;
        storyRevealUnlockButtonComponent.LLJZ = storyRevealUnlockButtonComponent.LLLF.invoke(Boolean.valueOf(!storyRevealUnlockButtonComponent.LLJZ)).booleanValue();
        ((StoryRevealUnlockButtonComponent) akS83S0100000_11.l0).Ep();
    }

    public static final void LIZ$8(AkS83S0100000_11 akS83S0100000_11, View view) {
        C0RJN c0rjnLIZIZ;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) C631370Opb.LIZ((FriendsV3UserInfoAssem) akS83S0100000_11.l0);
        Context context = ((FriendsV3UserInfoAssem) akS83S0100000_11.l0).getContext();
        Fragment fragmentLJI = C724240Sb0.LJI((FriendsV3UserInfoAssem) akS83S0100000_11.l0);
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        C1386160mAw.LJIIIZ(interfaceC1361270lWn, context, C1389300mG0.LIZ(c0rjnLIZIZ), "click_name", C1389300mG0.LIZIZ(C724240Sb0.LJI((FriendsV3UserInfoAssem) akS83S0100000_11.l0)));
    }

    public static final void LIZ$9(AkS83S0100000_11 akS83S0100000_11, View view) {
        MutualStruct mutualStruct;
        List<MutualUser> list;
        Integer numValueOf;
        Fragment fragmentLJI;
        ISocialPortraitService iSocialPortraitService;
        MutualStruct mutualStruct2;
        MatchedFriendStruct matchedFriendStructSp = ((FriendsV3UserInfoAssem) akS83S0100000_11.l0).sp();
        if (matchedFriendStructSp != null && (mutualStruct = matchedFriendStructSp.mMutualStruct) != null && (list = mutualStruct.userList) != null && (!list.isEmpty())) {
            Set setLJLIIL = C13LQ.LJLIIL(new Integer[]{2, 3, 1});
            MatchedFriendStruct matchedFriendStructSp2 = ((FriendsV3UserInfoAssem) akS83S0100000_11.l0).sp();
            if (matchedFriendStructSp2 != null && (mutualStruct2 = matchedFriendStructSp2.mMutualStruct) != null) {
                numValueOf = Integer.valueOf(mutualStruct2.mutualType);
            } else {
                numValueOf = null;
            }
            if (C13LP.LJJJJ(numValueOf, setLJLIIL) && (fragmentLJI = C724240Sb0.LJI((FriendsV3UserInfoAssem) akS83S0100000_11.l0)) != null && (iSocialPortraitService = (ISocialPortraitService) PluggableExtentionKt.pluggableSpi$default(ISocialPortraitService.class, false, false, false, 14, null)) != null) {
                iSocialPortraitService.LIZ(fragmentLJI, ((FriendsV3UserInfoAssem) akS83S0100000_11.l0).sp());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS83S0100000_11(StoryRevealOptOutComponent storyRevealOptOutComponent, int i) {
        super(600L);
        this.$t = i;
        this.l0 = storyRevealOptOutComponent;
    }

    public AkS83S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
