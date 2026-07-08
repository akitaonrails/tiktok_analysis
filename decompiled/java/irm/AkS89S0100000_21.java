package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0LAB;
import X.C1065200dpG;
import X.C1196320hEk;
import X.C128Y;
import X.C1356140lOW;
import X.C1356160lOY;
import X.C1357250lQJ;
import X.C1357950lRR;
import X.C1358110lRh;
import X.C1358130lRj;
import X.C1358220lRs;
import X.C1358240lRu;
import X.C1358550lSP;
import X.C1359110lTJ;
import X.C1360460lVU;
import X.C1362030lY1;
import X.C1362080lY6;
import X.C1362100lY8;
import X.C1362120lYA;
import X.C1368710lin;
import X.C1387520mD8;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LP;
import X.C1401450mZb;
import X.C1401480mZe;
import X.C1440005kM;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2038407yg;
import X.C20684815ws;
import X.C2189821An6;
import X.C2386409Ws;
import X.C298420Bmq;
import X.C343950De5;
import X.C343970De7;
import X.C343980De8;
import X.C442430HWn;
import X.C785410UrT;
import X.C786410Ut5;
import X.C897490ZIt;
import X.C946803n0;
import X.DialogC1396120mR0;
import X.EnumC1341630l17;
import X.EnumC1356100lOS;
import X.EnumC1359800lUQ;
import X.EnumC992140bvQ;
import X.InterfaceC1340280kyw;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelAggregationPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelInviteFriendsPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelMorePowerCell;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.LemonPostDetailFragment;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.share.improve.action.delete.DeleteReeditSheetContentFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.CommentRepostPanelCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelFragmentAbility;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelTitleAssem;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelButtonAssem;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostThenNoteAssem;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostReplyCell;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: loaded from: classes22.dex */
public class AkS89S0100000_21 extends AbstractViewOnClickListenerC1173120gdK {
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS89S0100000_21(DialogC1396120mR0 dialogC1396120mR0, int i) {
        super(600L);
        this.$t = i;
        this.l0 = dialogC1396120mR0;
    }

    public static final void LIZ$0(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((C1368710lin) akS89S0100000_21.l0).LIZLLL().LLJJJ.setValue(Boolean.FALSE);
    }

    public static final void LIZ$1(AkS89S0100000_21 akS89S0100000_21, View view) {
        InterfaceC1340280kyw interfaceC1340280kyw = (InterfaceC1340280kyw) akS89S0100000_21.l0;
        if (interfaceC1340280kyw != null) {
            interfaceC1340280kyw.LIZ(false);
        }
    }

    public static final void LIZ$10(AkS89S0100000_21 akS89S0100000_21, View view) {
        String str;
        VideoItemParams videoItemParams;
        ((UpvotePanelButtonAssem) akS89S0100000_21.l0).Lo(EnumC1359800lUQ.MENTION);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        UpvotePanelListViewModel upvotePanelListViewModel = ((UpvotePanelButtonAssem) akS89S0100000_21.l0).LLJ;
        if (upvotePanelListViewModel != null && (videoItemParams = upvotePanelListViewModel.LLJI) != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        c1358550lSP.getClass();
        C1358550lSP.LJFF("click", str);
    }

    public static final void LIZ$11(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((UpvotePanelButtonAssem) akS89S0100000_21.l0).Lo(EnumC1359800lUQ.EMOJI);
    }

    public static final void LIZ$12(AkS89S0100000_21 akS89S0100000_21, View view) {
        RepostThenNoteAssem repostThenNoteAssem = (RepostThenNoteAssem) akS89S0100000_21.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RepostThenNoteAssem.LLJJJ;
        repostThenNoteAssem.Zo(EnumC1359800lUQ.BUTTON);
    }

    public static final void LIZ$13(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((RepostThenNoteAssem) akS89S0100000_21.l0).Vo();
    }

    public static final void LIZ$14(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((RepostThenNoteAssem) akS89S0100000_21.l0).Vo();
    }

    public static final void LIZ$15(AkS89S0100000_21 akS89S0100000_21, View view) {
        String str;
        ((RepostThenNoteAssem) akS89S0100000_21.l0).Zo(EnumC1359800lUQ.MENTION);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = ((RepostThenNoteAssem) akS89S0100000_21.l0).No().LLILLJJLI;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        c1358550lSP.getClass();
        C1358550lSP.LJFF("click", str);
    }

    public static final void LIZ$16(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((RepostThenNoteAssem) akS89S0100000_21.l0).Zo(EnumC1359800lUQ.EMOJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[PHI: r5
      0x00be: PHI (r5v3 androidx.fragment.app.FragmentManager) = 
      (r5v0 androidx.fragment.app.FragmentManager)
      (r5v1 androidx.fragment.app.FragmentManager)
      (r5v4 androidx.fragment.app.FragmentManager)
     binds: [B:16:0x0048, B:13:0x0040, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$17(irm.AkS89S0100000_21 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS89S0100000_21.LIZ$17(irm.AkS89S0100000_21, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$18(AkS89S0100000_21 akS89S0100000_21, View view) {
        String str;
        String tabName;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        RepostReplyStruct repostReplyStruct;
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(((RepostReplyCell) akS89S0100000_21.l0).itemView.getContext());
        C1357950lRR c1357950lRR = (C1357950lRR) ((RepostReplyCell) akS89S0100000_21.l0).getItem();
        String str2 = null;
        if (c1357950lRR != null && (repostReplyStruct = c1357950lRR.LLILZLL) != null) {
            str = repostReplyStruct.replyToUserid;
        } else {
            str = null;
        }
        UpvoteStruct upvoteStructS5 = ((RepostReplyCell) akS89S0100000_21.l0).S5();
        VideoItemParams videoItemParams = ((RepostReplyCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams != null) {
            str2 = videoItemParams.mEventType;
        }
        VideoItemParams videoItemParams2 = ((RepostReplyCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams2 == null || (baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        c1358110lRh.getClass();
        C1358110lRh.LIZ(activityLIZ, str, upvoteStructS5, str2, "cell", tabName);
        ((RepostReplyCell) akS89S0100000_21.l0).X5("name");
    }

    public static final void LIZ$19(AkS89S0100000_21 akS89S0100000_21, View view) {
        User user;
        UpvoteStruct upvoteStruct;
        String tabName;
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        UpvoteStruct upvoteStruct2;
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(((UpvotePanelListCell) akS89S0100000_21.l0).itemView.getContext());
        C1358130lRj item = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        String str = null;
        if (item != null && (upvoteStruct2 = item.LL) != null) {
            user = upvoteStruct2.user;
        } else {
            user = null;
        }
        C1358130lRj item2 = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        if (item2 != null) {
            upvoteStruct = item2.LL;
        } else {
            upvoteStruct = null;
        }
        VideoItemParams videoItemParamsB6 = ((UpvotePanelListCell) akS89S0100000_21.l0).b6();
        if (videoItemParamsB6 != null) {
            str = videoItemParamsB6.mEventType;
        }
        C1358130lRj item3 = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        if (item3 == null || (videoItemParams = item3.LLILLJJLI) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, upvoteStruct, str, "repost_panel_avatar", null, false, tabName, 96);
        ((UpvotePanelListCell) akS89S0100000_21.l0).u6("name");
    }

    public static final void LIZ$2(AkS89S0100000_21 akS89S0100000_21, View view) {
        InterfaceC1340280kyw interfaceC1340280kyw = (InterfaceC1340280kyw) akS89S0100000_21.l0;
        if (interfaceC1340280kyw != null) {
            interfaceC1340280kyw.LIZ(true);
        }
    }

    public static final void LIZ$20(AkS89S0100000_21 akS89S0100000_21, View view) {
        User user;
        UpvoteStruct upvoteStruct;
        String tabName;
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        UpvoteStruct upvoteStruct2;
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(((UpvotePanelListCell) akS89S0100000_21.l0).itemView.getContext());
        C1358130lRj item = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        String str = null;
        if (item != null && (upvoteStruct2 = item.LL) != null) {
            user = upvoteStruct2.user;
        } else {
            user = null;
        }
        C1358130lRj item2 = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        if (item2 != null) {
            upvoteStruct = item2.LL;
        } else {
            upvoteStruct = null;
        }
        VideoItemParams videoItemParamsB6 = ((UpvotePanelListCell) akS89S0100000_21.l0).b6();
        if (videoItemParamsB6 != null) {
            str = videoItemParamsB6.mEventType;
        }
        C1358130lRj item3 = ((UpvotePanelListCell) akS89S0100000_21.l0).getItem();
        if (item3 == null || (videoItemParams = item3.LLILLJJLI) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, upvoteStruct, str, "repost_panel_avatar", null, false, tabName, 96);
        C897490ZIt.LIZIZ(((UpvotePanelListCell) akS89S0100000_21.l0).V5());
        ((UpvotePanelListCell) akS89S0100000_21.l0).u6("avatar");
    }

    public static final void LIZ$21(AkS89S0100000_21 akS89S0100000_21, View view) {
        Function0 function0 = (Function0) akS89S0100000_21.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$22(AkS89S0100000_21 akS89S0100000_21, View view) {
        Function0 function0 = (Function0) akS89S0100000_21.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$23(AkS89S0100000_21 akS89S0100000_21, View view) {
        IContactActionAbility iContactActionAbility;
        SharePackage sharePackage;
        C1362080lY6 c1362080lY6 = (C1362080lY6) ((SharePanelInviteFriendsPowerCell) akS89S0100000_21.l0).getItem();
        if (c1362080lY6 != null && c1362080lY6.LLILLL.LIZJ) {
            C1362120lYA c1362120lYAL5 = ((SharePanelInviteFriendsPowerCell) akS89S0100000_21.l0).L5();
            if (c1362120lYAL5 != null && (sharePackage = c1362120lYAL5.LL) != null) {
                Context context = ((SharePanelInviteFriendsPowerCell) akS89S0100000_21.l0).itemView.getContext();
                SharePanelInviteFriendsPowerCell sharePanelInviteFriendsPowerCell = (SharePanelInviteFriendsPowerCell) akS89S0100000_21.l0;
                sharePackage.LJIIIZ(context, null, sharePanelInviteFriendsPowerCell.itemView, new AwS422S0200000_21(sharePanelInviteFriendsPowerCell, c1362080lY6, 80));
            } else {
                SharePanelInviteFriendsPowerCell sharePanelInviteFriendsPowerCell2 = (SharePanelInviteFriendsPowerCell) akS89S0100000_21.l0;
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(sharePanelInviteFriendsPowerCell2);
                if (interfaceC665370Q7zLIZ == null || (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) == null) {
                    return;
                }
                iContactActionAbility.fK0(sharePanelInviteFriendsPowerCell2.itemView, c1362080lY6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$24(AkS89S0100000_21 akS89S0100000_21, View view) {
        IContactActionAbility iContactActionAbility;
        SharePackage sharePackage;
        C1362100lY8 c1362100lY8 = (C1362100lY8) ((SharePanelMorePowerCell) akS89S0100000_21.l0).getItem();
        if (c1362100lY8 != null) {
            C1362120lYA c1362120lYAL5 = ((SharePanelMorePowerCell) akS89S0100000_21.l0).L5();
            if (c1362120lYAL5 != null && (sharePackage = c1362120lYAL5.LL) != null) {
                sharePackage.LJIIIZ(((SharePanelMorePowerCell) akS89S0100000_21.l0).P5().getContext(), null, ((SharePanelMorePowerCell) akS89S0100000_21.l0).P5(), new AwS422S0200000_21((SharePanelMorePowerCell) akS89S0100000_21.l0, c1362100lY8, 81));
                return;
            }
            SharePanelMorePowerCell sharePanelMorePowerCell = (SharePanelMorePowerCell) akS89S0100000_21.l0;
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(sharePanelMorePowerCell);
            if (interfaceC665370Q7zLIZ == null || (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) == null) {
                return;
            }
            iContactActionAbility.fK0(sharePanelMorePowerCell.P5(), c1362100lY8);
        }
    }

    public static final void LIZ$25(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((OpenAlbumAssem) akS89S0100000_21.l0).Ap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$26(AkS89S0100000_21 akS89S0100000_21, View view) {
        User user;
        String tabName;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C1358240lRu c1358240lRu;
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(((BaseRepostCell) akS89S0100000_21.l0).itemView.getContext());
        C1358220lRs c1358220lRs = (C1358220lRs) ((BaseRepostCell) akS89S0100000_21.l0).getItem();
        String str = null;
        if (c1358220lRs != null && (c1358240lRu = c1358220lRs.LLILLL) != null) {
            user = c1358240lRu.LIZ;
        } else {
            user = null;
        }
        VideoItemParams videoItemParams = ((BaseRepostCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        }
        VideoItemParams videoItemParams2 = ((BaseRepostCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams2 == null || (baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, null, str, "repost_panel_avatar", null, false, tabName, 96);
        C897490ZIt.LIZIZ(((BaseRepostCell) akS89S0100000_21.l0).U5());
        ((BaseRepostCell) akS89S0100000_21.l0).X5("avatar");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$27(AkS89S0100000_21 akS89S0100000_21, View view) {
        User user;
        String tabName;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C1358240lRu c1358240lRu;
        C1358110lRh c1358110lRh = C1358110lRh.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(((BaseRepostCell) akS89S0100000_21.l0).itemView.getContext());
        C1358220lRs c1358220lRs = (C1358220lRs) ((BaseRepostCell) akS89S0100000_21.l0).getItem();
        String str = null;
        if (c1358220lRs != null && (c1358240lRu = c1358220lRs.LLILLL) != null) {
            user = c1358240lRu.LIZ;
        } else {
            user = null;
        }
        UpvoteStruct upvoteStructS5 = ((BaseRepostCell) akS89S0100000_21.l0).S5();
        VideoItemParams videoItemParams = ((BaseRepostCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        }
        VideoItemParams videoItemParams2 = ((BaseRepostCell) akS89S0100000_21.l0).V5().LLILLJJLI;
        if (videoItemParams2 == null || (baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C1358110lRh.LIZIZ(c1358110lRh, activityLIZ, user, upvoteStructS5, str, "cell", null, false, tabName, 96);
        ((BaseRepostCell) akS89S0100000_21.l0).X5("name");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$28(AkS89S0100000_21 akS89S0100000_21, View view) {
        EnumC992140bvQ enumC992140bvQ;
        C1358240lRu c1358240lRu;
        BaseRepostCell baseRepostCell = (BaseRepostCell) akS89S0100000_21.l0;
        C1358220lRs c1358220lRs = (C1358220lRs) baseRepostCell.getItem();
        if (c1358220lRs != null && (c1358240lRu = c1358220lRs.LLILLL) != null) {
            enumC992140bvQ = c1358240lRu.LJII;
        } else {
            enumC992140bvQ = null;
        }
        if (enumC992140bvQ == EnumC992140bvQ.SUCCESS) {
            baseRepostCell.c6("click_repost_text");
        }
    }

    public static final void LIZ$29(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((BaseRepostCell) akS89S0100000_21.l0).c6("click_repost_reply");
    }

    public static final void LIZ$3(AkS89S0100000_21 akS89S0100000_21, View view) {
        Function0 function0 = (Function0) akS89S0100000_21.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$30(AkS89S0100000_21 akS89S0100000_21, View view) {
        List<C2386409Ws> value = ((DialogC1396120mR0) akS89S0100000_21.l0).LJLIIIL().LIZIZ.getValue();
        if (value == null) {
            return;
        }
        AwS135S1100000_21 awS135S1100000_21 = ((DialogC1396120mR0) akS89S0100000_21.l0).LLJILJILJ.LIZIZ;
        if (awS135S1100000_21 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
            Iterator<C2386409Ws> it2 = value.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            awS135S1100000_21.invoke(arrayList);
        }
        DialogC1396120mR0 dialogC1396120mR0 = (DialogC1396120mR0) akS89S0100000_21.l0;
        dialogC1396120mR0.dismiss();
        C785410UrT.LIZ(dialogC1396120mR0);
    }

    public static final void LIZ$31(AkS89S0100000_21 akS89S0100000_21, View view) {
        C1401450mZb c1401450mZb;
        List<String> queryKeywords;
        C1401450mZb c1401450mZb2;
        String biz;
        int i = ((C1401480mZe) akS89S0100000_21.l0).LLJILLL;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "effect_detail_page");
        c0lab.LJ("entrance_type", "pin");
        c0lab.LIZ(i, "draft_cnt");
        c0lab.LJ("click_type", "body");
        c0lab.LJ("land_page", "draft_box");
        C20684815ws.LJIILLIIL("recall_drafts_entrance_click", c0lab.LIZ);
        ((C1401480mZe) akS89S0100000_21.l0).LLIZLLLIL.NN();
        Aweme aweme = ((C1401480mZe) akS89S0100000_21.l0).LL;
        if ((aweme instanceof C1401450mZb) && (c1401450mZb = (C1401450mZb) aweme) != null && (queryKeywords = c1401450mZb.getQueryKeywords()) != null) {
            Aweme aweme2 = ((C1401480mZe) akS89S0100000_21.l0).LL;
            if ((aweme2 instanceof C1401450mZb) && (c1401450mZb2 = (C1401450mZb) aweme2) != null && (biz = c1401450mZb2.getBiz()) != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                C13LP.LLFII(queryKeywords, arrayList);
                C786410Ut5.LJJJIL(bundle, "subType_query_keyword", arrayList);
                C786410Ut5.LJJJI("subType_query_type", biz, bundle);
                IAVDraftService iAVDraftService = (IAVDraftService) ((C1401480mZe) akS89S0100000_21.l0).LLJ.getValue();
                if (iAVDraftService != null) {
                    iAVDraftService.openDraftActivity(((C1401480mZe) akS89S0100000_21.l0).LLIZ.getContext(), bundle);
                }
            }
        }
    }

    public static final void LIZ$32(AkS89S0100000_21 akS89S0100000_21, View view) {
        boolean zEnableToastCenter;
        Activity activityLIZ = C1388190mED.LIZ(((MentionAfterPublishListCell) akS89S0100000_21.l0).itemView.getContext());
        if (activityLIZ != null) {
            ((MentionAfterPublishListCell) akS89S0100000_21.l0).getClass();
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
            if (iAVPublishPageUIRefactorService == null) {
                zEnableToastCenter = false;
            } else {
                zEnableToastCenter = iAVPublishPageUIRefactorService.enableToastCenter();
            }
            if (zEnableToastCenter) {
                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                c1389880mGw.LJIIIZ(activityLIZ.getString(2131837169));
                c1389880mGw.LIZ(true);
                c1389880mGw.LJIIJ();
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(activityLIZ.getString(2131837169));
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$33(AkS89S0100000_21 akS89S0100000_21, View view) {
        Aweme aweme;
        String str;
        String str2;
        Aweme aweme2;
        String aid;
        PostModeDetailParams postModeDetailParams;
        C1356140lOW c1356140lOW = C1356140lOW.LIZ;
        C19EG activity = ((LemonPostDetailFragment) akS89S0100000_21.l0).getActivity();
        C442430HWn c442430HWn = ((LemonPostDetailFragment) akS89S0100000_21.l0).LLIZ;
        if (c442430HWn != null) {
            aweme = c442430HWn.LIZJ;
        } else {
            aweme = null;
        }
        EnumC1341630l17 enumC1341630l17 = EnumC1341630l17.DETAIL;
        EnumC1356100lOS enumC1356100lOS = EnumC1356100lOS.BOTTOM_BUTTON;
        String str3 = "";
        if (c442430HWn == null || (postModeDetailParams = c442430HWn.LJI) == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1356140lOW.getClass();
        C1356140lOW.LIZ(activity, aweme, null, enumC1341630l17, enumC1356100lOS, "tiktok_search_inapp_native", linkedHashMap, str);
        C19EG activity2 = ((LemonPostDetailFragment) akS89S0100000_21.l0).getActivity();
        boolean z = false;
        if (activity2 != null) {
            try {
                if (C786410Ut5.Y3(activity2.getPackageManager(), C1065200dpG.LIZ().lemon8PkgName, 1) != null) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        C442430HWn c442430HWn2 = ((LemonPostDetailFragment) akS89S0100000_21.l0).LLIZ;
        if (c442430HWn2 != null && (aweme2 = c442430HWn2.LIZJ) != null && (aid = aweme2.getAid()) != null) {
            str3 = aid;
        }
        if (z) {
            str2 = "open_app";
        } else {
            str2 = "install";
        }
        C1356160lOY.LIZLLL(c1356160lOY, str3, "bottom_button", "bottom_button", "1", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(AkS89S0100000_21 akS89S0100000_21, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IContactActionAbility iContactActionAbility;
        C1362030lY1 c1362030lY1 = (C1362030lY1) ((SharePanelAggregationPowerCell) akS89S0100000_21.l0).getItem();
        if (c1362030lY1 != null && (interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SharePanelAggregationPowerCell) akS89S0100000_21.l0)) != null && (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) != null) {
            iContactActionAbility.fK0(((SharePanelAggregationPowerCell) akS89S0100000_21.l0).itemView, c1362030lY1);
        }
    }

    public static final void LIZ$5(AkS89S0100000_21 akS89S0100000_21, View view) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) akS89S0100000_21.l0;
        if (musicSquareViewHolder.LLLIIL) {
            if (musicSquareViewHolder.LLLIIIIL) {
                musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_ltr);
            } else {
                musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_slash_ltr);
            }
            MusicSquareViewHolder musicSquareViewHolder2 = (MusicSquareViewHolder) akS89S0100000_21.l0;
            boolean z = !musicSquareViewHolder2.LLLIIIIL;
            musicSquareViewHolder2.LLLIIIIL = z;
            musicSquareViewHolder2.LLLII.storeBoolean(musicSquareViewHolder2.LLLIIIL, z);
            MusicSquareViewHolder musicSquareViewHolder3 = (MusicSquareViewHolder) akS89S0100000_21.l0;
            boolean z2 = musicSquareViewHolder3.LLLIIIIL;
            View view2 = musicSquareViewHolder3.itemView;
            if (view2 != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(view2, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility.Fq2(z2);
            }
        }
    }

    public static final void LIZ$6(AkS89S0100000_21 akS89S0100000_21, View view) {
        C1387520mD8 c1387520mD8 = ((DeleteReeditSheetContentFragment) akS89S0100000_21.l0).LLILZLL;
        if (c1387520mD8 != null) {
            c1387520mD8.invoke();
        }
        DeleteReeditSheetContentFragment deleteReeditSheetContentFragment = (DeleteReeditSheetContentFragment) akS89S0100000_21.l0;
        if (deleteReeditSheetContentFragment.LLIZ) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(deleteReeditSheetContentFragment, new C343950De5());
        }
    }

    public static final void LIZ$7(AkS89S0100000_21 akS89S0100000_21, View view) {
        String cid;
        String str;
        String str2;
        String uid;
        Integer numValueOf;
        String str3;
        RepostPanelFragmentAbility repostPanelFragmentAbility;
        String str4;
        Comment comment;
        int status;
        CommentRepostPanelCell commentRepostPanelCell = (CommentRepostPanelCell) akS89S0100000_21.l0;
        C1357250lQJ item = commentRepostPanelCell.getItem();
        if (item != null) {
            CommentInfoStruct commentInfoStruct = item.LL.commentInfo;
            if ((commentInfoStruct != null && (comment = commentInfoStruct.comment) != null && (status = comment.getStatus()) != 0 && status != 2 && status != 4 && status != 7 && (cid = comment.getCid()) != null && cid.length() > 0) || (cid = item.LL.carrierId) != null) {
                UpvoteStruct upvoteStruct = item.LL;
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                VideoItemParams videoItemParamsS5 = commentRepostPanelCell.S5();
                if (videoItemParamsS5 != null) {
                    str = videoItemParamsS5.mEventType;
                } else {
                    str = null;
                }
                UpvotePanelListViewModel upvotePanelListViewModel = commentRepostPanelCell.LL;
                String str5 = "";
                if (upvotePanelListViewModel == null || (str2 = upvotePanelListViewModel.LL) == null) {
                    str2 = "";
                }
                Aweme awemeR5 = commentRepostPanelCell.R5();
                User user = upvoteStruct.user;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                User user2 = upvoteStruct.user;
                if (user2 != null) {
                    numValueOf = Integer.valueOf(user2.getFollowStatus());
                } else {
                    numValueOf = null;
                }
                C1358550lSP.LJIILIIL(c1358550lSP, str, str2, awemeR5, "comment_repost_quote", uid, numValueOf, upvoteStruct.upvoteId, null, null, null, cid, 896);
                VideoItemParams videoItemParamsS52 = commentRepostPanelCell.S5();
                if (videoItemParamsS52 != null) {
                    str3 = videoItemParamsS52.mEventType;
                } else {
                    str3 = null;
                }
                UpvotePanelListViewModel upvotePanelListViewModel2 = commentRepostPanelCell.LL;
                if (upvotePanelListViewModel2 != null && (str4 = upvotePanelListViewModel2.LL) != null) {
                    str5 = str4;
                }
                C1358550lSP.LJIILJJIL(c1358550lSP, str3, str5, upvoteStruct, null, "comment_repost_quote", false, null, cid, "comment", Boolean.valueOf(C298420Bmq.LIZ()), 136);
                C128Y c128yLIZ = C946803n0.LIZ(commentRepostPanelCell.itemView);
                if ((c128yLIZ instanceof RepostPanelFragmentAbility) && (repostPanelFragmentAbility = (RepostPanelFragmentAbility) c128yLIZ) != null) {
                    repostPanelFragmentAbility.uz2(C343970De7.LIZ);
                }
                C1440005kM.LIZ(new C2038407yg(cid, C1360460lVU.LIZIZ.LJJJJIZL()));
            }
        }
    }

    public static final void LIZ$8(AkS89S0100000_21 akS89S0100000_21, View view) {
        if (C1359110lTJ.LIZ()) {
            AssemVMLazy assemVMLazy = ((RepostPanelTitleAssem) akS89S0100000_21.l0).LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RepostPanelTitleAssem.LLJJJIL;
            assemVMLazy.getValue().setState(AFwS259S0000000_21.get$arr$(366));
        } else {
            RepostPanelFragmentAbility repostPanelFragmentAbility = (RepostPanelFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((RepostPanelTitleAssem) akS89S0100000_21.l0), RepostPanelFragmentAbility.class, null);
            if (repostPanelFragmentAbility == null) {
                return;
            }
            repostPanelFragmentAbility.uz2(C343980De8.LIZ);
        }
    }

    public static final void LIZ$9(AkS89S0100000_21 akS89S0100000_21, View view) {
        ((UpvotePanelButtonAssem) akS89S0100000_21.l0).Lo(EnumC1359800lUQ.INPUT_BOX);
    }

    public AkS89S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS89S0100000_21(OpenAlbumAssem openAlbumAssem, TuxIconView tuxIconView, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = openAlbumAssem;
    }
}
