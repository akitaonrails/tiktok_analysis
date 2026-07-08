package wh6;

import X.AbstractC1387200mCc;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C0OB8;
import X.C0PEM;
import X.C0RF0;
import X.C0SXF;
import X.C0T4J;
import X.C0WZX;
import X.C109100bB;
import X.C123100dR;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1352500lIe;
import X.C1355330lND;
import X.C1356730lPT;
import X.C1356760lPW;
import X.C1358170lRn;
import X.C1358550lSP;
import X.C1361050lWR;
import X.C1361220lWi;
import X.C1389300mG0;
import X.C13LP;
import X.C13LQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C189200o6;
import X.C19337210l0;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2204961BRm;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C423700GjQ;
import X.C520040KaQ;
import X.C523420Kfs;
import X.C631370Opb;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729160Siw;
import X.C786410Ut5;
import X.C817650W5r;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC1361130lWZ;
import X.EnumC1430380nKG;
import X.EnumC255700yp;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.DanmakuCompatibleReportAndLoginViewModel;
import com.ss.android.ugc.aweme.DanmakuSwitchAssem;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.api.FriendsV3FeedRepostCommentAbility;
import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordAssem;
import com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost.FriendsV3RepostCommentCellAssem;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.text.assem.FriendsV3TextCommentInputAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentInputAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.repost.FriendsV3RepostCommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.repost.FriendsV3RepostCommentInputAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost.FriendsV3RepostCommentBtnAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveShareAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3MoreOptionAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.ShareActionAbility;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShareToEditAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.services.story.IAlbumParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.ailive.StoryAILiveButtonComponent;
import com.ss.android.ugc.aweme.tools.ICreatorCenterApi;
import com.ss.android.ugc.aweme.upvote.detail.input.IRepostMentionAbility;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostInternalShareCell;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AbS701S0100000_21 extends AbstractViewOnClickListenerC1637610siV {
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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS701S0100000_21(Object obj, int i) {
        super(800L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS701S0100000_21 abS701S0100000_21, View view) {
        FriendsV3RepostCommentCellAssem friendsV3RepostCommentCellAssem;
        RepostReplyStruct repostReplyStruct;
        FriendsV3FeedRepostCommentAbility friendsV3FeedRepostCommentAbility;
        if (view != null && (repostReplyStruct = (friendsV3RepostCommentCellAssem = (FriendsV3RepostCommentCellAssem) abS701S0100000_21.l0).LLJLILLLLZIIL) != null && (friendsV3FeedRepostCommentAbility = (FriendsV3FeedRepostCommentAbility) friendsV3RepostCommentCellAssem.LLJLIL.getValue()) != null) {
            friendsV3FeedRepostCommentAbility.Rc1(repostReplyStruct);
        }
    }

    public static final void LIZ$1(AbS701S0100000_21 abS701S0100000_21, View view) {
        if (view != null) {
            FriendsV3TextCommentInputAssem friendsV3TextCommentInputAssem = (FriendsV3TextCommentInputAssem) abS701S0100000_21.l0;
            Aweme commentInputAweme = friendsV3TextCommentInputAssem.getCommentInputAweme();
            CommentService.LIZ.getClass();
            InterfaceC737440SwI interfaceC737440SwILJLILLLLZI = C523420Kfs.LIZ().LJLILLLLZI(C724240Sb0.LIZ(friendsV3TextCommentInputAssem), C724240Sb0.LJI(friendsV3TextCommentInputAssem), commentInputAweme, C1389300mG0.LIZ(friendsV3TextCommentInputAssem.getPanelContext()), "click_friends_quick_panel", C1389300mG0.LIZ(friendsV3TextCommentInputAssem.getPanelContext()), new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.FEED_QUICK_COMMENT, 0, EnumC1341680l1C.TEXT, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, "", null, "friends_v3_text_post_detail", null, ""), false), null);
            if (interfaceC737440SwILJLILLLLZI != null) {
                interfaceC737440SwILJLILLLLZI.e6(new AwS565S0100000_21(interfaceC737440SwILJLILLLLZI, 1522));
                interfaceC737440SwILJLILLLLZI.sp(new AwS565S0100000_21(interfaceC737440SwILJLILLLLZI, 1523));
                interfaceC737440SwILJLILLLLZI.hr(AFwS259S0000000_21.get$arr$(422));
                interfaceC737440SwILJLILLLLZI.jg(new AwS600S0100000_21(friendsV3TextCommentInputAssem, 378));
            }
            C109100bB c109100bB = C109100bB.LIZ;
            Map mapLJIIL = C2097608Jq.LJIIL(friendsV3TextCommentInputAssem.ip(), C2097908Jt.LIZJ(new Pair("action_type", "text")));
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_quick_comment_panel_click", mapLJIIL);
        }
    }

    public static final void LIZ$10(AbS701S0100000_21 abS701S0100000_21, View view) {
        Context context;
        EnterStoryParam enterStoryParam;
        EnterStoryParam enterStoryParamCopy;
        Fragment fragment;
        FragmentManager childFragmentManager;
        C0RF0 c0rf0;
        Fragment fragment2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        LifecycleOwner lifecycleOwnerLJFF;
        Object obj;
        AnchorCommonStruct anchorCommonStruct;
        String text;
        AIAliveInfo aIAliveInfo;
        String str;
        UrlModel thumbnail;
        List<String> urlList;
        AIAliveInfo aIAliveInfoCopy;
        FragmentManager supportFragmentManager;
        LifecycleOwner lifecycleOwnerLJFF2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2;
        FragmentManager supportFragmentManager2;
        AIAliveInfo aIAliveInfo2;
        AnchorCommonStruct next;
        if (view != null) {
            StoryAILiveButtonComponent storyAILiveButtonComponent = (StoryAILiveButtonComponent) abS701S0100000_21.l0;
            Object obj2 = null;
            if (storyAILiveButtonComponent.Ep().isPostAILiveEnable()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(storyAILiveButtonComponent);
                if (c19egLIZ != null) {
                    C724270Sb3 c724270Sb3 = storyAILiveButtonComponent.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    Aweme aweme = ((VideoItemParams) obj).getAweme();
                    if (aweme != null) {
                        List<AnchorCommonStruct> anchors = aweme.getAnchors();
                        if (anchors != null) {
                            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.getType() == EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE.getTYPE()) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            anchorCommonStruct = next;
                        } else {
                            anchorCommonStruct = null;
                        }
                        IAILiveService iAILiveServiceEp = storyAILiveButtonComponent.Ep();
                        AIAliveInfo aIAliveInfo3 = aweme.aiAliveInfo;
                        if (aIAliveInfo3 != null) {
                            text = aIAliveInfo3.getText();
                        } else {
                            text = null;
                        }
                        String translateResult = iAILiveServiceEp.getTranslateResult(text);
                        if ((!C123100dR.LIZ(translateResult) || translateResult == null || (aIAliveInfo2 = aweme.aiAliveInfo) == null || (aIAliveInfo = aIAliveInfo2.copy(translateResult, aIAliveInfo2.promptType, aIAliveInfo2.modelPrompt, aIAliveInfo2.modelKey, aIAliveInfo2.styleImageUrl)) == null) && (aIAliveInfo = aweme.aiAliveInfo) == null) {
                            String dynamicString$default = IAILiveService.DefaultImpls.getDynamicString$default(storyAILiveButtonComponent.Ep(), 2131820733, null, new Object[0], 2, null);
                            String dynamicString$default2 = IAILiveService.DefaultImpls.getDynamicString$default(storyAILiveButtonComponent.Ep(), 2131820733, null, new Object[0], 2, null);
                            if (anchorCommonStruct == null || (thumbnail = anchorCommonStruct.getThumbnail()) == null || (urlList = thumbnail.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                                str = "";
                            }
                            aIAliveInfo = new AIAliveInfo(dynamicString$default, "default", dynamicString$default2, "", str);
                        }
                        AIAliveInfo aIAliveInfo4 = aweme.aiAliveInfo;
                        if (aIAliveInfo4 != null) {
                            aIAliveInfoCopy = aIAliveInfo4.copy(aIAliveInfo4.text, aIAliveInfo4.promptType, aIAliveInfo4.modelPrompt, aIAliveInfo4.modelKey, aIAliveInfo4.styleImageUrl);
                        } else {
                            aIAliveInfoCopy = null;
                        }
                        C724270Sb3 c724270Sb32 = storyAILiveButtonComponent.LLJI;
                        if (c724270Sb32 != null) {
                            obj2 = c724270Sb32.LL;
                        }
                        OpenPostAlbumParams openPostAlbumParams = new OpenPostAlbumParams("story_ai_photo_try_it_out", aIAliveInfo, "ai_livephoto_anchor", ((VideoItemParams) obj2).mEventType, false, aIAliveInfoCopy, null);
                        if (storyAILiveButtonComponent.Ep().isPostAILiveEnable() && storyAILiveButtonComponent.Ep().shouldShowSheetWhenClickAnchor()) {
                            Fragment fragmentLJI = C724240Sb0.LJI(storyAILiveButtonComponent);
                            if (fragmentLJI == null || (supportFragmentManager2 = fragmentLJI.getChildFragmentManager()) == null) {
                                supportFragmentManager2 = c19egLIZ.getSupportFragmentManager();
                            }
                            storyAILiveButtonComponent.Ep().refreshQuotaCache(RefreshQuotaScene.CLICK_ANCHOR);
                            storyAILiveButtonComponent.Ep().provideAILiveSheetContentView(c19egLIZ, openPostAlbumParams).show(supportFragmentManager2, "ai_live");
                        } else if (storyAILiveButtonComponent.Ep().isPostAILiveEnable()) {
                            Fragment fragmentLJI2 = C724240Sb0.LJI(storyAILiveButtonComponent);
                            if (fragmentLJI2 == null || (supportFragmentManager = fragmentLJI2.getChildFragmentManager()) == null) {
                                supportFragmentManager = c19egLIZ.getSupportFragmentManager();
                            }
                            Fragment fragmentLJI3 = C724240Sb0.LJI(storyAILiveButtonComponent);
                            if (fragmentLJI3 == null || (abstractC1387200mCcLIZIZ2 = C520040KaQ.LIZIZ(fragmentLJI3)) == null || (lifecycleOwnerLJFF2 = abstractC1387200mCcLIZIZ2.LJFF()) == null) {
                                lifecycleOwnerLJFF2 = c19egLIZ;
                            }
                            IAILiveService.DefaultImpls.goPostAlbum$default(storyAILiveButtonComponent.Ep(), c19egLIZ, openPostAlbumParams, lifecycleOwnerLJFF2, supportFragmentManager, null, 16, null);
                        }
                    }
                }
            } else {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(storyAILiveButtonComponent);
                if (c19egLIZ2 != null && (context = storyAILiveButtonComponent.getContext()) != null) {
                    IAlbumParam iAlbumParamDefaultAlbumParam = storyAILiveButtonComponent.Ep().defaultAlbumParam();
                    if ((iAlbumParamDefaultAlbumParam instanceof EnterStoryParam) && (enterStoryParam = (EnterStoryParam) iAlbumParamDefaultAlbumParam) != null && (enterStoryParamCopy = enterStoryParam.copy("ai_livephoto_anchor", "story_ai_photo_try_it_out", "ai_live_photo_anchor", enterStoryParam.creationId, enterStoryParam.fromGroupId, enterStoryParam.shootEnterFrom, enterStoryParam.shootEnterMethod, enterStoryParam.storyShootEnterPosition, enterStoryParam.shootExtraData, enterStoryParam.isUploadDirectEnter, enterStoryParam.isStoryEnhancedEntrance, enterStoryParam.enableSwipeUpExit, enterStoryParam.sharedElementTransitionMode, enterStoryParam.sharedElementRoundedMaskInitialY, 18, enterStoryParam.interceptorWhenFailEnterStoryAlbum, enterStoryParam.socAlbumConfig, enterStoryParam.creationSearchModel, enterStoryParam.requestId, enterStoryParam.baseSecretReplyData, enterStoryParam.entranceType, enterStoryParam.isFromSocialCameraEntrance, enterStoryParam.storyArchiveTabName, enterStoryParam.isSubOnlyStory, enterStoryParam.afterPublishLandingMode, enterStoryParam.preselectedMusic)) != null) {
                        if (storyAILiveButtonComponent.Ep().enableStoryAILivePhotoAlbumEntrance()) {
                            storyAILiveButtonComponent.Ep().goStoryAlbum(c19egLIZ2, enterStoryParamCopy);
                        } else {
                            C0RF0 c0rf02 = storyAILiveButtonComponent.jm().LIZLLL;
                            if (c0rf02 != null && (fragment = c0rf02.LIZJ) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (c0rf0 = storyAILiveButtonComponent.jm().LIZLLL) != null && (fragment2 = c0rf0.LIZJ) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment2)) != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF()) != null) {
                                storyAILiveButtonComponent.Ep().goStoryAlbumWithGuideCheck(c19egLIZ2, context, lifecycleOwnerLJFF, childFragmentManager, enterStoryParamCopy);
                            }
                        }
                    }
                }
            }
            storyAILiveButtonComponent.Fp("story_try_out_click");
        }
    }

    public static final void LIZ$11(AbS701S0100000_21 abS701S0100000_21, View view) {
        String str;
        String str2;
        RepostReplyStruct repostReplyStruct;
        if (view != null) {
            RepostReplyKeyboard repostReplyKeyboard = (RepostReplyKeyboard) abS701S0100000_21.l0;
            FrameLayout frameLayout = repostReplyKeyboard.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            repostReplyKeyboard.LLJJIII = false;
            repostReplyKeyboard.PR(true);
            repostReplyKeyboard.OR(false);
            KeyboardUtils.LIZLLL(repostReplyKeyboard.LLIZLLLIL);
            String str3 = null;
            IRepostMentionAbility iRepostMentionAbility = (IRepostMentionAbility) C1558520qew.LIZ(C1558360qeg.LJFF((RepostReplyKeyboard) abS701S0100000_21.l0, null), IRepostMentionAbility.class, null);
            if (iRepostMentionAbility != null) {
                iRepostMentionAbility.En2();
            }
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLJILJIL;
            if (videoItemParams == null || (str = videoItemParams.mEventType) == null) {
                C1356730lPT c1356730lPT = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLJILJILJ;
                if (c1356730lPT != null) {
                    str = c1356730lPT.LJFF;
                } else {
                    str = null;
                }
            }
            RepostReplyKeyboard repostReplyKeyboard2 = (RepostReplyKeyboard) abS701S0100000_21.l0;
            C1356730lPT c1356730lPT2 = repostReplyKeyboard2.LLJILJILJ;
            if (c1356730lPT2 != null) {
                str2 = c1356730lPT2.LJIIIIZZ;
                if (str2 == null) {
                    str2 = c1356730lPT2.LJI;
                }
            } else {
                str2 = null;
            }
            String strMR = repostReplyKeyboard2.MR();
            C1356730lPT c1356730lPT3 = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLJILJILJ;
            if (c1356730lPT3 != null && ((repostReplyStruct = c1356730lPT3.LIZ) == null || (str3 = repostReplyStruct.repostId) == null)) {
                str3 = c1356730lPT3.LIZIZ;
            }
            c1358550lSP.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJIIIIZZ("group_id", strMR);
            C1358170lRn.LIZ(c2344009Gk, "repost_id", str3);
            C20684815ws.LJIILLIIL("ttsocial_repost_panel_reply_at_button_click", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$12(AbS701S0100000_21 abS701S0100000_21, View view) {
        TuxIconView tuxIconView;
        if (view != null && (tuxIconView = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLILZIL) != null) {
            tuxIconView.setSelected(!tuxIconView.isSelected());
            if (tuxIconView.isSelected()) {
                RepostReplyKeyboard repostReplyKeyboard = (RepostReplyKeyboard) abS701S0100000_21.l0;
                repostReplyKeyboard.getClass();
                IRepostMentionAbility iRepostMentionAbility = (IRepostMentionAbility) C1558520qew.LIZ(C1558360qeg.LJFF(repostReplyKeyboard, null), IRepostMentionAbility.class, null);
                if (iRepostMentionAbility != null) {
                    iRepostMentionAbility.d90();
                }
                View view2 = repostReplyKeyboard.getView();
                if (view2 != null && !repostReplyKeyboard.LLJJI) {
                    repostReplyKeyboard.LLJJI = true;
                    C723850SaN.LIZ(repostReplyKeyboard, false, null, new AwS387S0200000_21(repostReplyKeyboard, view2, 58), 3);
                }
                FrameLayout frameLayout = repostReplyKeyboard.LLILZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                repostReplyKeyboard.LLJJIII = true;
                repostReplyKeyboard.PR(false);
                repostReplyKeyboard.OR(true);
                KeyboardUtils.LIZIZ(repostReplyKeyboard.LLIZLLLIL);
            } else {
                RepostReplyKeyboard repostReplyKeyboard2 = (RepostReplyKeyboard) abS701S0100000_21.l0;
                FrameLayout frameLayout2 = repostReplyKeyboard2.LLILZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
                repostReplyKeyboard2.LLJJIII = false;
                repostReplyKeyboard2.PR(true);
                repostReplyKeyboard2.OR(false);
                KeyboardUtils.LIZLLL(repostReplyKeyboard2.LLIZLLLIL);
            }
            ((RepostReplyKeyboard) abS701S0100000_21.l0).OR(tuxIconView.isSelected());
        }
    }

    public static final void LIZ$13(AbS701S0100000_21 abS701S0100000_21, View view) {
        if (view != null) {
            RepostReplyKeyboard repostReplyKeyboard = (RepostReplyKeyboard) abS701S0100000_21.l0;
            FrameLayout frameLayout = repostReplyKeyboard.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            repostReplyKeyboard.LLJJIII = false;
            repostReplyKeyboard.PR(true);
            repostReplyKeyboard.OR(false);
            KeyboardUtils.LIZLLL(repostReplyKeyboard.LLIZLLLIL);
        }
    }

    public static final void LIZ$14(AbS701S0100000_21 abS701S0100000_21, View view) {
        String string;
        List<TextExtraStruct> listPx;
        Editable editableJ;
        Editable editableJ2;
        if (view != null) {
            C1355330lND c1355330lND = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLIZLLLIL;
            if (c1355330lND != null && (editableJ2 = C2204961BRm.J(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsD4TcuK8aJlD4G+1Ax", null))) != null) {
                string = editableJ2.toString();
            } else {
                string = null;
            }
            IRepostMentionAbility iRepostMentionAbility = (IRepostMentionAbility) C1558520qew.LIZ(C1558360qeg.LJFF((RepostReplyKeyboard) abS701S0100000_21.l0, null), IRepostMentionAbility.class, null);
            if (iRepostMentionAbility != null) {
                listPx = iRepostMentionAbility.Px();
            } else {
                listPx = null;
            }
            RepostSyncViewModel repostSyncViewModel = (RepostSyncViewModel) ((RepostReplyKeyboard) abS701S0100000_21.l0).LLJI.getValue();
            String strMR = ((RepostReplyKeyboard) abS701S0100000_21.l0).MR();
            C1356730lPT c1356730lPT = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLJILJILJ;
            int i = 1;
            if (strMR != null && strMR.length() != 0 && c1356730lPT != null && string != null && string.length() != 0) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1356760lPW(repostSyncViewModel, strMR, c1356730lPT, string, listPx, null), 3);
            }
            C1355330lND c1355330lND2 = ((RepostReplyKeyboard) abS701S0100000_21.l0).LLIZLLLIL;
            if (c1355330lND2 != null && (editableJ = C2204961BRm.J(c1355330lND2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfj8Ig5ARorXFGjhAJTN6xGEWNMdsD4TcuK8aJlD4G+1Ax", null))) != null) {
                editableJ.clear();
            }
            if (listPx == null || !(!listPx.isEmpty())) {
                i = 0;
            }
            ((RepostReplyKeyboard) abS701S0100000_21.l0).NR(i, "ttsocial_repost_reply_publish", string);
            ((RepostReplyKeyboard) abS701S0100000_21.l0).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$15(AbS701S0100000_21 abS701S0100000_21, View view) {
        if (view != null) {
            ((RepostInternalShareCell) abS701S0100000_21.l0).I5().vQ2();
        }
    }

    public static final void LIZ$16(AbS701S0100000_21 abS701S0100000_21, View view) {
        Music music;
        ShootAbility shootAbility;
        if (view != null) {
            try {
                MusicDetail musicDetailLIZ = ((MusicShareToEditAssem) abS701S0100000_21.l0).op().getState().LL.LIZ();
                Unit unit = null;
                if (musicDetailLIZ != null) {
                    music = musicDetailLIZ.music;
                } else {
                    music = null;
                }
                ((MusicShareToEditAssem) abS701S0100000_21.l0).LLJJIJIIJIL.LIZ(music, "pop");
                Fragment fragmentLJI = C724240Sb0.LJI((MusicShareToEditAssem) abS701S0100000_21.l0);
                if (fragmentLJI != null && (shootAbility = (ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ShootAbility.class, null)) != null) {
                    shootAbility.te0();
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LIZ$17(AbS701S0100000_21 abS701S0100000_21, View view) {
        if (view != null) {
            if (C1352500lIe.LIZ[((CommentAudioRecordAssem) abS701S0100000_21.l0).op().getState().LL.ordinal()] == 1) {
                CommentAudioRecordAssem commentAudioRecordAssem = (CommentAudioRecordAssem) abS701S0100000_21.l0;
                commentAudioRecordAssem.getClass();
                commentAudioRecordAssem.LLJL = "manual_stop";
                commentAudioRecordAssem.op().yQ2();
                C423700GjQ c423700GjQ = commentAudioRecordAssem.LLJJIJIIJIL;
                if (c423700GjQ != null) {
                    c423700GjQ.LLIZLLLIL = false;
                    ValueAnimator valueAnimator = c423700GjQ.LLJ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
            }
        }
    }

    public static final void LIZ$18(AbS701S0100000_21 abS701S0100000_21, View view) {
        Float fValueOf;
        if (view != null) {
            CommentAudioRecordAssem commentAudioRecordAssem = (CommentAudioRecordAssem) abS701S0100000_21.l0;
            commentAudioRecordAssem.LLLF = true;
            commentAudioRecordAssem.ip();
            float[] fArr = commentAudioRecordAssem.op().getState().LLIZLLLIL;
            if (fArr != null) {
                fValueOf = Float.valueOf((float) C13LQ.LJIIL(fArr));
            } else {
                fValueOf = null;
            }
            commentAudioRecordAssem.up("delete", null, fValueOf, Long.valueOf(commentAudioRecordAssem.op().getState().LLILLJJLI));
            commentAudioRecordAssem.op().vQ2();
        }
    }

    public static final void LIZ$19(AbS701S0100000_21 abS701S0100000_21, View view) {
        int i;
        String str;
        String str2;
        String str3;
        if (view != null) {
            C19337210l0 c19337210l0 = (C19337210l0) abS701S0100000_21.l0;
            c19337210l0.getClass();
            ICreatorCenterApi iCreatorCenterApi = (ICreatorCenterApi) ServiceManager.get().getService(ICreatorCenterApi.class);
            Context context = view.getContext();
            NewFaceStickerBean newFaceStickerBean = c19337210l0.LJFF;
            if (newFaceStickerBean != null) {
                i = newFaceStickerBean.effectSource;
            } else {
                i = 0;
            }
            Integer numValueOf = null;
            if (newFaceStickerBean != null) {
                str = newFaceStickerBean.effectId;
            } else {
                str = null;
            }
            iCreatorCenterApi.LIZ(context, i, String.valueOf(str), "effect_detail_page", null);
            Pair[] pairArr = new Pair[3];
            if (c19337210l0.LIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("is_self", str2);
            NewFaceStickerBean newFaceStickerBean2 = c19337210l0.LJFF;
            if (newFaceStickerBean2 != null) {
                str3 = newFaceStickerBean2.effectId;
            } else {
                str3 = null;
            }
            pairArr[1] = new Pair("resource_id", String.valueOf(str3));
            NewFaceStickerBean newFaceStickerBean3 = c19337210l0.LJFF;
            if (newFaceStickerBean3 != null) {
                numValueOf = Integer.valueOf(newFaceStickerBean3.effectSource);
            }
            pairArr[2] = new Pair("effect_source", String.valueOf(numValueOf));
            C20684815ws.LJIILLIIL("prop_detail_page_top_effect_badge_click", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    public static final void LIZ$2(AbS701S0100000_21 abS701S0100000_21, View view) {
        Object obj;
        if (view != null) {
            FriendsV3CommentInputAssem friendsV3CommentInputAssem = (FriendsV3CommentInputAssem) abS701S0100000_21.l0;
            C724270Sb3 c724270Sb3 = friendsV3CommentInputAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((C0OB8) obj).getAweme();
            CommentService.LIZ.getClass();
            InterfaceC737440SwI interfaceC737440SwILJLILLLLZI = C523420Kfs.LIZ().LJLILLLLZI(C724240Sb0.LIZ(friendsV3CommentInputAssem), C724240Sb0.LJI(friendsV3CommentInputAssem), aweme, "homepage_friends", "click_friends_quick_panel", "homepage_friends", new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.FEED_QUICK_COMMENT, 0, EnumC1341680l1C.TEXT, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, "", null, "friends_v3_feeds", null, ""), false), null);
            if (interfaceC737440SwILJLILLLLZI != null) {
                interfaceC737440SwILJLILLLLZI.e6(new AwS565S0100000_21(interfaceC737440SwILJLILLLLZI, 26));
                interfaceC737440SwILJLILLLLZI.sp(new AwS565S0100000_21(interfaceC737440SwILJLILLLLZI, 27));
                interfaceC737440SwILJLILLLLZI.hr(AFwS259S0000000_21.get$arr$(3));
                interfaceC737440SwILJLILLLLZI.jg(new AwS600S0100000_21(friendsV3CommentInputAssem, 11));
            }
            C109100bB c109100bB = C109100bB.LIZ;
            Map mapLJIIL = C2097608Jq.LJIIL(friendsV3CommentInputAssem.tp(), C2097908Jt.LIZJ(new Pair("action_type", "text")));
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_quick_comment_panel_click", mapLJIIL);
        }
    }

    public static final void LIZ$3(AbS701S0100000_21 abS701S0100000_21, View view) {
        FriendsV3RepostModel friendsV3RepostModel;
        Aweme aweme;
        Object obj;
        String str;
        if (view != null) {
            FriendsV3RepostCommentAssem friendsV3RepostCommentAssem = (FriendsV3RepostCommentAssem) abS701S0100000_21.l0;
            friendsV3RepostCommentAssem.getClass();
            C19EG c19egLIZ = C724240Sb0.LIZ(friendsV3RepostCommentAssem);
            if (c19egLIZ != null && (friendsV3RepostModel = friendsV3RepostCommentAssem.LLJJJJLIIL) != null && (aweme = friendsV3RepostModel.repostedAweme) != null) {
                friendsV3RepostCommentAssem.LLJLL++;
                friendsV3RepostCommentAssem.ep(false);
                IUpvoteService iUpvoteService = (IUpvoteService) friendsV3RepostCommentAssem.LLJJJJJIL.getValue();
                if (iUpvoteService != null) {
                    C724270Sb3 c724270Sb3 = friendsV3RepostCommentAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    FriendsV3RepostModel friendsV3RepostModel2 = friendsV3RepostCommentAssem.LLJJJJLIIL;
                    if (friendsV3RepostModel2 == null || (str = friendsV3RepostModel2.realRepostId) == null) {
                        str = "";
                    }
                    iUpvoteService.LJIIZILJ(c19egLIZ, obj, aweme, str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(AbS701S0100000_21 abS701S0100000_21, View view) {
        Aweme aweme;
        String str;
        User user;
        if (view != null) {
            FriendsV3RepostModel friendsV3RepostModelSp = ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).sp();
            String str2 = null;
            if (friendsV3RepostModelSp != null) {
                aweme = friendsV3RepostModelSp.repostedAweme;
            } else {
                aweme = null;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0);
            if (aweme != null && c19egLIZ != null) {
                IUpvoteService iUpvoteService = (IUpvoteService) ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).LLJL.getValue();
                if (iUpvoteService != null) {
                    Object objLIZ = C631370Opb.LIZ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0);
                    RepostReplyStruct repostReplyStruct = null;
                    Object[] objArr = 0;
                    FriendsV3RepostModel friendsV3RepostModelSp2 = ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).sp();
                    if (friendsV3RepostModelSp2 != null) {
                        str = friendsV3RepostModelSp2.realRepostId;
                    } else {
                        str = null;
                    }
                    FriendsV3RepostModel friendsV3RepostModelSp3 = ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).sp();
                    if (friendsV3RepostModelSp3 != null) {
                        user = friendsV3RepostModelSp3.reposter;
                    } else {
                        user = null;
                    }
                    FriendsV3RepostModel friendsV3RepostModelSp4 = ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).sp();
                    if (friendsV3RepostModelSp4 != null) {
                        str2 = friendsV3RepostModelSp4.repostText;
                    }
                    iUpvoteService.LJJ(c19egLIZ, objLIZ, new C1356730lPT(repostReplyStruct, str, user, !TextUtils.isEmpty(str2), aweme, "homepage_friends", "friends_repost_cell", "friends_v3_feeds", objArr == true ? 1 : 0, 256));
                }
                ((FriendsV3RepostCommentInputAssem) abS701S0100000_21.l0).up(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$5(AbS701S0100000_21 abS701S0100000_21, View view) {
        FriendsV3RepostModel friendsV3RepostModel;
        Aweme aweme;
        IUpvoteService iUpvoteService;
        Object obj;
        if (view != null) {
            FriendsV3RepostCommentBtnAssem friendsV3RepostCommentBtnAssem = (FriendsV3RepostCommentBtnAssem) abS701S0100000_21.l0;
            friendsV3RepostCommentBtnAssem.getClass();
            C19EG c19egLIZ = C724240Sb0.LIZ(friendsV3RepostCommentBtnAssem);
            if (c19egLIZ != null && (friendsV3RepostModel = friendsV3RepostCommentBtnAssem.LLJL) != null && (aweme = friendsV3RepostModel.repostedAweme) != null && (iUpvoteService = (IUpvoteService) friendsV3RepostCommentBtnAssem.LLJLL.getValue()) != null) {
                C724270Sb3 c724270Sb3 = friendsV3RepostCommentBtnAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                iUpvoteService.LJJ(c19egLIZ, obj, new C1356730lPT(null, friendsV3RepostModel.realRepostId, friendsV3RepostModel.reposter, !TextUtils.isEmpty(friendsV3RepostModel.repostText), aweme, "homepage_friends", "click_cell_comment_btn", "friends_v3_feeds", 0 == true ? 1 : 0, 256));
            }
        }
    }

    public static final void LIZ$6(AbS701S0100000_21 abS701S0100000_21, View view) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (view != null) {
            FriendsV3MoreOptionAssem friendsV3MoreOptionAssem = (FriendsV3MoreOptionAssem) abS701S0100000_21.l0;
            C724270Sb3 c724270Sb3 = friendsV3MoreOptionAssem.LLJI;
            Object obj7 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (obj instanceof C1361220lWi) {
                FriendsV3LiveShareAbility friendsV3LiveShareAbility = (FriendsV3LiveShareAbility) friendsV3MoreOptionAssem.LLJJL.getValue();
                if (friendsV3LiveShareAbility != null) {
                    friendsV3LiveShareAbility.Au0();
                    return;
                }
                return;
            }
            ShareActionAbility shareActionAbility = (ShareActionAbility) friendsV3MoreOptionAssem.LLJJJJLIIL.getValue();
            if (shareActionAbility == null) {
                return;
            }
            C724270Sb3 c724270Sb32 = ((FriendsV3MoreOptionAssem) abS701S0100000_21.l0).LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            User userLLILLL = ((InterfaceC1361270lWn) obj2).LLILLL();
            if (userLLILLL != null) {
                userLLILLL.getUid();
            }
            C724270Sb3 c724270Sb33 = ((FriendsV3MoreOptionAssem) abS701S0100000_21.l0).LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            Aweme aweme = ((C0OB8) obj3).getAweme();
            C724270Sb3 c724270Sb34 = ((FriendsV3MoreOptionAssem) abS701S0100000_21.l0).LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            if (obj4 instanceof InterfaceC1357880lRK) {
                if (c724270Sb34 != null) {
                    obj6 = c724270Sb34.LL;
                } else {
                    obj6 = null;
                }
                AwemeBizExtKt.setRepostUser(aweme, ((InterfaceC1361270lWn) obj6).LLILLL());
            }
            FriendsV3MoreOptionAssem friendsV3MoreOptionAssem2 = (FriendsV3MoreOptionAssem) abS701S0100000_21.l0;
            friendsV3MoreOptionAssem2.getClass();
            C729160Siw c729160Siw = new C729160Siw();
            C724270Sb3 c724270Sb35 = friendsV3MoreOptionAssem2.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            c729160Siw.LIZ.LJJIIJZLJL = obj5 instanceof InterfaceC1357880lRK;
            if (c724270Sb35 != null) {
                obj7 = c724270Sb35.LL;
            }
            boolean zLIZ = C817650W5r.LIZ(((C0OB8) obj7).getAweme());
            C0T4J c0t4j = c729160Siw.LIZ;
            c0t4j.LJJIIZ = zLIZ;
            c0t4j.LJJIIZI = true;
            String strLIZIZ = C1389300mG0.LIZIZ(C724240Sb0.LJI(friendsV3MoreOptionAssem2));
            if (!Intrinsics.LJFF(strLIZIZ, "")) {
                c729160Siw.LIZ.LJJIJ = strLIZIZ;
            }
            C0T4J c0t4j2 = c729160Siw.LIZ;
            c0t4j2.LJIIIIZZ = "share_panel";
            shareActionAbility.Mx1(aweme, c0t4j2);
        }
    }

    public static final void LIZ$7(AbS701S0100000_21 abS701S0100000_21, View view) {
        Aweme aweme;
        if (view != null) {
            DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ((DanmakuSwitchAssem) abS701S0100000_21.l0)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "landscape_danmaku_interaction");
            }
            DanmakuViewModel danmakuViewModelEp = ((DanmakuSwitchAssem) abS701S0100000_21.l0).Ep();
            VideoItemParams item = danmakuViewModelEp.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                danmakuViewModelEp.withState(new AwS387S0200000_21(danmakuViewModelEp, aweme, 47));
            }
        }
    }

    public static final void LIZ$8(AbS701S0100000_21 abS701S0100000_21, View view) {
        EnumC255700yp enumC255700yp;
        if (view != null) {
            DataCenter dataCenter = ((VideoItemParams) C631370Opb.LIZ((DanmakuSwitchAssem) abS701S0100000_21.l0)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "landscape_danmaku_interaction");
            }
            ((DanmakuSwitchAssem) abS701S0100000_21.l0).Gp(true);
            C1361050lWR c1361050lWR = C1361050lWR.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ((DanmakuSwitchAssem) abS701S0100000_21.l0);
            DanmakuViewModel danmakuViewModelEp = ((DanmakuSwitchAssem) abS701S0100000_21.l0).Ep();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((DanmakuSwitchAssem) abS701S0100000_21.l0);
            EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.VIDEO;
            if (C0SXF.LJIJ(((DanmakuSwitchAssem) abS701S0100000_21.l0).Bp())) {
                enumC255700yp = EnumC255700yp.IS_FAKE_LANDSCAPE;
            } else {
                enumC255700yp = EnumC255700yp.IS_LANDSCAPE;
            }
            DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel = (DanmakuCompatibleReportAndLoginViewModel) ((DanmakuSwitchAssem) abS701S0100000_21.l0).LLL.getValue();
            c1361050lWR.getClass();
            C1361050lWR.LIZLLL(c19egLIZ, danmakuViewModelEp, interfaceC665370Q7zLJIIL, enumC1361130lWZ, enumC255700yp, danmakuCompatibleReportAndLoginViewModel);
        }
    }

    public static final void LIZ$9(AbS701S0100000_21 abS701S0100000_21, View view) {
        if (view != null) {
            ((Function0) abS701S0100000_21.l0).invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS701S0100000_21(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS701S0100000_21(Object obj, int i, int i2, int i3) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }
}
