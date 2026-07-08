package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C05OG;
import X.C0HZQ;
import X.C0IJT;
import X.C1142350fph;
import X.C1390380mHk;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1496690p3D;
import X.C1515210pX5;
import X.C1558520qew;
import X.C1578630rBN;
import X.C15QC;
import X.C15TA;
import X.C16CO;
import X.C16CR;
import X.C1735430vGH;
import X.C1777560wME;
import X.C1838900xxA;
import X.C197039127h;
import X.C1A5L;
import X.C1DD8;
import X.C20361514lp;
import X.C20377014oK;
import X.C20441214yg;
import X.C20544115aB;
import X.C20552315bV;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C462920IDi;
import X.C474500IjA;
import X.C631370Opb;
import X.C724240Sb0;
import X.C784920Uqg;
import X.C915190ZvJ;
import X.C978360bZC;
import X.C985403tE;
import X.EnumC1779020wOa;
import X.EnumC1877260yx2;
import X.EnumC993840byA;
import X.InterfaceC1132110fZB;
import X.InterfaceC20638715pR;
import X.InterfaceC665370Q7z;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMMeditationAssem;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteRatingCardAssem;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class AbS516S0200000_31 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS516S0200000_31 abS516S0200000_31, View view) {
        ExploreTopBannerData exploreTopBannerData;
        String str;
        if (view != null && (str = (exploreTopBannerData = (ExploreTopBannerData) abS516S0200000_31.l0).jumpUrl) != null) {
            C15TA.LIZ.getClass();
            C15TA.LJIILL(new ARunnableS131S0100000_31(exploreTopBannerData, 218));
            Context context = ((View) abS516S0200000_31.l1).getContext();
            if (context != null) {
                SmartRouter.buildRoute(context, str).open();
            }
        }
    }

    public static final void LIZ$1(AbS516S0200000_31 abS516S0200000_31, View view) {
        if (view != null) {
            C197039127h c197039127h = (C197039127h) abS516S0200000_31.l0;
            if (!c197039127h.LLLII) {
                C197039127h c197039127h2 = ((FootNoteRatingCardAssem) abS516S0200000_31.l1).LLLII;
                if (c197039127h2 != null && c197039127h2.LLLII) {
                    return;
                }
                c197039127h.setLoading(true);
                ((C1735430vGH) ((FootNoteRatingCardAssem) abS516S0200000_31.l1).LLLIILIL.getValue()).LJFF();
                ((FootNoteRatingCardAssem) abS516S0200000_31.l1).Fp(EnumC993840byA.NOT_HELPFUL.ordinal());
                ((FootNoteRatingCardAssem) abS516S0200000_31.l1).Bp().wQ2("not_helpful_rating");
            }
        }
    }

    public static final void LIZ$2(AbS516S0200000_31 abS516S0200000_31, View view) {
        if (view != null) {
            C197039127h c197039127h = (C197039127h) abS516S0200000_31.l0;
            if (!c197039127h.LLLII) {
                C197039127h c197039127h2 = ((FootNoteRatingCardAssem) abS516S0200000_31.l1).LLLIIII;
                if (c197039127h2 != null && c197039127h2.LLLII) {
                    return;
                }
                c197039127h.setLoading(true);
                ((C1735430vGH) ((FootNoteRatingCardAssem) abS516S0200000_31.l1).LLLIIL.getValue()).LJFF();
                ((FootNoteRatingCardAssem) abS516S0200000_31.l1).Fp(EnumC993840byA.HELPFUL.ordinal());
                ((FootNoteRatingCardAssem) abS516S0200000_31.l1).Bp().wQ2("helpful_rating");
            }
        }
    }

    public static final void LIZ$3(AbS516S0200000_31 abS516S0200000_31, View view) {
        if (view != null) {
            C15QC c15qc = (C15QC) abS516S0200000_31.l0;
            boolean z = false;
            if (!c15qc.LLIZLLLIL) {
                PUgcSlotData pUgcSlotData = c15qc.LLJ;
                if (pUgcSlotData == null) {
                    pUgcSlotData = null;
                }
                if (!pUgcSlotData.isFixed) {
                    View view2 = c15qc.itemView;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850071);
                    C1390380mHk.LIZLLL(view2, 6008, creativeToastBuilder);
                    return;
                }
            }
            C0HZQ c0hzq = ((C15QC) abS516S0200000_31.l0).LLILZ;
            if (!c0hzq.isChecked()) {
                z = true;
            }
            c0hzq.setChecked(z);
            if (((C15QC) abS516S0200000_31.l0).getAbsoluteAdapterPosition() == -1) {
                return;
            }
            ((Function2) abS516S0200000_31.l1).invoke(Integer.valueOf(((C15QC) abS516S0200000_31.l0).getAbsoluteAdapterPosition()), Boolean.valueOf(!((C15QC) abS516S0200000_31.l0).LLILZ.isChecked()));
        }
    }

    public static final void LIZ$4(AbS516S0200000_31 abS516S0200000_31, View view) {
        EnumC1779020wOa enumC1779020wOa;
        DataChannel dataChannel;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        Playbook playbookLJIILJJIL;
        PlaybookAnchorViewModel playbookAnchorViewModel;
        C20377014oK c20377014oK;
        if (view != null && (enumC1779020wOa = ((C1777560wME) abS516S0200000_31.l0).LIZ) != EnumC1779020wOa.RUNNING && enumC1779020wOa != EnumC1779020wOa.UNDOING && (dataChannel = ((C20361514lp) abS516S0200000_31.l1).LL) != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null && (playbookLJIILJJIL = playbookAnchorServiceV2LIZIZ.LJIILJJIL()) != null) {
            if (((C1777560wME) abS516S0200000_31.l0).LIZ == EnumC1779020wOa.SUCCESS) {
                C1397580mTM c1397580mTM = new C1397580mTM(((C20361514lp) abS516S0200000_31.l1).itemView.getContext());
                c1397580mTM.LJFF(2131854657);
                c1397580mTM.LIZ(2131854656);
                C985403tE.LIZ(c1397580mTM, new AwS397S0200000_31(playbookLJIILJJIL, (C20361514lp) abS516S0200000_31.l1, 72));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                C978360bZC.LJJII(playbookLJIILJJIL.playbookId, "show", "undo");
                return;
            }
            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
            C978360bZC.LJJII(playbookLJIILJJIL.playbookId, "click", "apply");
            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2 = C784920Uqg.LIZIZ(((C20361514lp) abS516S0200000_31.l1).LL);
            if (playbookAnchorServiceV2LIZIZ2 == null || (playbookAnchorViewModel = (PlaybookAnchorViewModel) playbookAnchorServiceV2LIZIZ2.LLILLJJLI) == null || (c20377014oK = playbookAnchorViewModel.LLJJJJJIL.LJ.get(PlaybookUtilKt.LIZIZ(playbookLJIILJJIL))) == null) {
                return;
            }
            C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", "applyDecorationStep");
            c20377014oK.LIZLLL.LJFF(c20377014oK.LJFF);
        }
    }

    public static final void LIZ$5(AbS516S0200000_31 abS516S0200000_31, View view) {
        if (view != null) {
            C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.G0.getValue());
            ((STMMeditationAssem) abS516S0200000_31.l0).hp().pause();
            C05OG.LIZ.getClass();
            C05OG.LIZ();
            ((STMMeditationAssem) abS516S0200000_31.l0).ip().xQ2(((C20544115aB) abS516S0200000_31.l1).getContext());
        }
    }

    public static final void LIZ$6(AbS516S0200000_31 abS516S0200000_31, View view) {
        C1838900xxA c1838900xxA;
        List<T> list;
        LiveFragmentDetail liveFragmentDetail;
        if (view != null) {
            C20552315bV.LIZJ(((VideoItemParams) abS516S0200000_31.l0).getAweme(), "homepage_hot", false);
            int i = ((LiveSfvPostContentComponent) abS516S0200000_31.l1).kp().LLILZ;
            Integer numValueOf = null;
            if (i >= 0 && (c1838900xxA = ((LiveSfvPostContentComponent) abS516S0200000_31.l1).LLJZIJLIL) != null && i < c1838900xxA.getItemCount()) {
                C1838900xxA c1838900xxA2 = ((LiveSfvPostContentComponent) abS516S0200000_31.l1).LLJZIJLIL;
                if (c1838900xxA2 != null && (list = c1838900xxA2.mmItems) != 0 && (liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLZIJ(i, list)) != null) {
                    C1515210pX5.LIZLLL().getClass();
                    InterfaceC1132110fZB interfaceC1132110fZBLJII = C1515210pX5.LJII(LiveFragmentDetail.class);
                    C1496690p3D c1496690p3D = new C1496690p3D();
                    C1142350fph c1142350fph = new C1142350fph(c1496690p3D);
                    if (interfaceC1132110fZBLJII != null) {
                        interfaceC1132110fZBLJII.LIZ(c1142350fph, liveFragmentDetail);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((LiveSfvPostContentComponent) abS516S0200000_31.l1).getContext(), "//webcast_highlight_page");
                    smartRouteBuildRoute.withParam("fragment_id", String.valueOf(liveFragmentDetail.fragmentId));
                    smartRouteBuildRoute.withParam("replay_room_id", String.valueOf(liveFragmentDetail.roomId));
                    smartRouteBuildRoute.withParam("click_position", String.valueOf(i));
                    smartRouteBuildRoute.withParam("enter_method", "special_shaped_card");
                    smartRouteBuildRoute.withParam("enter_from_page", "homepage_hot");
                    smartRouteBuildRoute.withParam("enter_from", "homepage_hot");
                    smartRouteBuildRoute.withParam("is_quick_post", CardStruct.IStatusCode.DEFAULT);
                    smartRouteBuildRoute.withParam("anchor_id", UserService.getInstance().user().getCurrentUserId());
                    smartRouteBuildRoute.withParam("single_post_fragment", c1496690p3D.LJZL());
                    smartRouteBuildRoute.open(LSPassThroughRecordSizeConfig.DEFAULT, new C462920IDi((LiveSfvPostContentComponent) abS516S0200000_31.l1, 1));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_shaped_card");
                    c474500IjALIZ.LJJII(122, "card_id");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ.LJJII("click", "action_type");
                    c474500IjALIZ.LJJII("1", "click_type");
                    c474500IjALIZ.LJJII(((LiveSfvPostContentComponent) abS516S0200000_31.l1).ip().getSubTitleStaringKey(), "card_info");
                    c474500IjALIZ.LJJII(0, "is_video_play");
                    c474500IjALIZ.LJJII(1, "is_uninsertion_card");
                    c474500IjALIZ.LJJII("homepage_hot", "enter_from");
                    c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail.fragmentId), "fragment_id");
                    c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail.fragmentTypeNew), "fragment_type");
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("btnPost - curSelectedPosition: ");
            sbLIZ.append(i);
            sbLIZ.append(", itemCount: ");
            C1838900xxA c1838900xxA3 = ((LiveSfvPostContentComponent) abS516S0200000_31.l1).LLJZIJLIL;
            if (c1838900xxA3 != null) {
                numValueOf = Integer.valueOf(c1838900xxA3.getItemCount());
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LIZIZ("LiveSfvPostContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZ$7(AbS516S0200000_31 abS516S0200000_31, View view) {
        C16CR c16cr;
        if (view != null && (c16cr = ((C16CO) abS516S0200000_31.l0).LLJJLIIIJLLLLLLLZ) != null) {
            c16cr.LJ((TikTokMediaModel) abS516S0200000_31.l1);
        }
    }

    public static final void LIZ$8(AbS516S0200000_31 abS516S0200000_31, View view) {
        if (view != null) {
            EarlyFeedbackVM earlyFeedbackVMIp = ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0).Ip();
            String aid = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme().getAid();
            String groupId = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme().getGroupId();
            earlyFeedbackVMIp.getClass();
            earlyFeedbackVMIp.setStateImmediate(AFwS276S0000000_31.get$arr$(343));
            earlyFeedbackVMIp.vQ2();
            ((IEarlyFeedbackService) earlyFeedbackVMIp.LL.getValue()).LIZLLL(aid, groupId, EnumC1877260yx2.BUTTON, C1DD8.LIKE, earlyFeedbackVMIp.LLILLJJLI);
            int iLIZJ = ((InterfaceC20638715pR) abS516S0200000_31.l1).LIZJ(((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme());
            Fragment fragmentLJI = C724240Sb0.LJI((EarlyFeedbackButtonAssem) abS516S0200000_31.l0);
            if (fragmentLJI != null) {
                ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0).Wp(iLIZJ, fragmentLJI);
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) abS516S0200000_31.l0;
            earlyFeedbackButtonAssem.Ep(((VideoItemParams) C631370Opb.LIZ(earlyFeedbackButtonAssem)).getAweme().getAid());
        }
    }

    public static final void LIZ$9(AbS516S0200000_31 abS516S0200000_31, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        if (view != null) {
            EarlyFeedbackVM earlyFeedbackVMIp = ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0).Ip();
            String aid = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme().getAid();
            String groupId = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme().getGroupId();
            earlyFeedbackVMIp.getClass();
            earlyFeedbackVMIp.setStateImmediate(AFwS276S0000000_31.get$arr$(344));
            earlyFeedbackVMIp.vQ2();
            ((IEarlyFeedbackService) earlyFeedbackVMIp.LL.getValue()).LIZLLL(aid, groupId, EnumC1877260yx2.BUTTON, C1DD8.DISLIKE, earlyFeedbackVMIp.LLILLJJLI);
            int iLIZ = ((InterfaceC20638715pR) abS516S0200000_31.l1).LIZ(((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0)).getAweme());
            Fragment fragmentLJI = C724240Sb0.LJI((EarlyFeedbackButtonAssem) abS516S0200000_31.l0);
            if (fragmentLJI != null) {
                ((EarlyFeedbackButtonAssem) abS516S0200000_31.l0).Wp(iLIZ, fragmentLJI);
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) abS516S0200000_31.l0;
            earlyFeedbackButtonAssem.Ep(((VideoItemParams) C631370Opb.LIZ(earlyFeedbackButtonAssem)).getAweme().getAid());
            if (!Intrinsics.LJFF(((InterfaceC20638715pR) abS516S0200000_31.l1).getType(), "useful")) {
                EarlyFeedbackButtonAssem earlyFeedbackButtonAssem2 = (EarlyFeedbackButtonAssem) abS516S0200000_31.l0;
                earlyFeedbackButtonAssem2.getClass();
                Fragment fragmentLJI2 = C724240Sb0.LJI(earlyFeedbackButtonAssem2);
                if (fragmentLJI2 != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentLJI2)) != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null) {
                    iViewPagerComponentAbility.rH();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS516S0200000_31(ExploreTopBannerData exploreTopBannerData, View view, int i) {
        super(500L);
        this.$t = i;
        this.l0 = exploreTopBannerData;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS516S0200000_31(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
