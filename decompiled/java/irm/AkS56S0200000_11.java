package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0SFC;
import X.C0SFV;
import X.C0SFW;
import X.C0SGU;
import X.C1388190mED;
import X.C1440005kM;
import X.C1611550s2T;
import X.C1612650s4F;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C214878197k;
import X.C2344009Gk;
import X.C453940Hr6;
import X.C563980MAa;
import X.C631370Opb;
import X.C712590RxJ;
import X.C712620RxM;
import X.C712630RxN;
import X.C718180SFc;
import X.C718280SFm;
import X.C718510SGj;
import X.C737450SwJ;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.collab.CollabInFeedLabelAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBottomBannerButtonType;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesInteractBottomBannerAssem;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentImmersiveViewHolder;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AkS56S0200000_11 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(irm.AkS56S0200000_11 r9, android.view.View r10) {
        /*
            java.lang.Object r0 = r9.l0
            X.0SPV r0 = (X.C0SPV) r0
            android.content.Context r0 = r0.getContext()
            X.19EG r6 = X.C1388190mED.LIZIZ(r0)
            if (r6 == 0) goto L2a
            X.197k r4 = X.C214878197k.LIZIZ
            java.lang.Object r0 = r9.l0
            X.0SPV r0 = (X.C0SPV) r0
            X.0SPY r1 = r0.LLJJJJLIIL
            r0 = 0
            if (r1 != 0) goto L1a
            r1 = r0
        L1a:
            java.lang.String r5 = r1.enterFrom
            java.lang.Object r7 = r9.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            if (r7 != 0) goto L2b
            java.lang.String r8 = ""
        L24:
            r9 = 0
            java.lang.String r10 = ""
            r4.LJIIJ(r5, r6, r7, r8, r9, r10)
        L2a:
            return
        L2b:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = r7.getCollabInfo()
            if (r0 == 0) goto L6a
            java.util.List<com.ss.android.ugc.aweme.feed.model.CollaboratorInfo> r1 = r0.collaborators
            if (r1 == 0) goto L6a
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.CollaboratorInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollaboratorInfo) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            r2.add(r0)
            goto L4e
        L64:
            java.util.Set r2 = X.C13LP.LLIIJI(r2)
            if (r2 != 0) goto L6c
        L6a:
            X.08CX r2 = X.C08CX.INSTANCE
        L6c:
            java.lang.String r1 = r3.getUid()
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7d
            java.lang.String r8 = "author"
            goto L24
        L7d:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L86
            java.lang.String r8 = "collaber"
            goto L24
        L86:
            java.lang.String r8 = "user"
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS56S0200000_11.LIZ$0(irm.AkS56S0200000_11, android.view.View):void");
    }

    public static final void LIZ$1(AkS56S0200000_11 akS56S0200000_11, View view) {
        ((CollabInFeedLabelAssem) akS56S0200000_11.l0).Up((Aweme) akS56S0200000_11.l1);
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str = ((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).mEventType;
        if (str == null) {
            str = "";
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).getAweme());
        String aid = ((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        CollabInFeedLabelAssem collabInFeedLabelAssem = (CollabInFeedLabelAssem) akS56S0200000_11.l0;
        iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, aid, collabInFeedLabelAssem.Tp(((VideoItemParams) C631370Opb.LIZ(collabInFeedLabelAssem)).getAweme()), false);
    }

    public static final void LIZ$2(AkS56S0200000_11 akS56S0200000_11, View view) {
        ((CollabInFeedLabelAssem) akS56S0200000_11.l0).Up((Aweme) akS56S0200000_11.l1);
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str = ((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).mEventType;
        if (str == null) {
            str = "";
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).getAweme());
        String aid = ((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) akS56S0200000_11.l0)).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        CollabInFeedLabelAssem collabInFeedLabelAssem = (CollabInFeedLabelAssem) akS56S0200000_11.l0;
        iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, aid, collabInFeedLabelAssem.Tp(((VideoItemParams) C631370Opb.LIZ(collabInFeedLabelAssem)).getAweme()), false);
    }

    public static final void LIZ$3(AkS56S0200000_11 akS56S0200000_11, View view) {
        C19EG c19egLIZIZ;
        Context context = ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            VideoAuthorInfoVM videoAuthorInfoVMQp = ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).Qp();
            Aweme aweme = (Aweme) akS56S0200000_11.l1;
            String str = ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).LLLLII;
            videoAuthorInfoVMQp.getClass();
            C737450SwJ.LIZIZ.LJI(c19egLIZIZ, aweme, videoAuthorInfoVMQp.eventType, str);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", videoAuthorInfoVMQp.eventType);
            String aid = aweme.getAid();
            String str2 = "";
            if (aid == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid != null) {
                str2 = authorUid;
            }
            c2344009Gk.LJIIIIZZ("author_id", str2);
            c2344009Gk.LJIIIIZZ("anchor_type", str);
            C20684815ws.LJIILLIIL("tag_anchor_click", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$4(AkS56S0200000_11 akS56S0200000_11, View view) {
        String jumpEpisodeVideoId;
        Boolean boolIsJumpLastWatch;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        Map<String, String> logExtra2;
        String str;
        String uid;
        PaidContentInfo paidContentInfo3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ4;
        long paidCollectionId = ((PaidContentImmersiveViewHolder) akS56S0200000_11.l0).LLJJ.mPaidContentInfo.getPaidCollectionId();
        C0SFV.LIZLLL = C0SFW.START;
        C0SFV.LIZJ = paidCollectionId;
        C0SFV.LIZ = 0L;
        C0SFV.LIZIZ = System.currentTimeMillis();
        C19EG activity = ((PaidContentImmersiveViewHolder) akS56S0200000_11.l0).getActivity();
        if (activity != null) {
            C786410Ut5.ce(activity, 0, 0);
        }
        Aweme aweme = ((PaidContentImmersiveViewHolder) akS56S0200000_11.l0).LLJJ;
        String aid = aweme.getAid();
        PaidContentInfo paidContentInfo4 = aweme.mPaidContentInfo;
        String str2 = null;
        if (paidContentInfo4 != null && (paidContentMiniDramaInfoLIZ4 = C718180SFc.LIZ(paidContentInfo4)) != null) {
            jumpEpisodeVideoId = paidContentMiniDramaInfoLIZ4.getJumpEpisodeVideoId();
        } else {
            jumpEpisodeVideoId = null;
        }
        PaidContentInfo paidContentInfo5 = aweme.mPaidContentInfo;
        if (paidContentInfo5 != null && (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo5)) != null) {
            boolIsJumpLastWatch = paidContentMiniDramaInfoLIZ3.isJumpLastWatch();
        } else {
            boolIsJumpLastWatch = null;
        }
        if (!C718510SGj.LIZJ(aweme)) {
            if (jumpEpisodeVideoId != null && jumpEpisodeVideoId.length() != 0) {
                aid = jumpEpisodeVideoId;
            } else if (Intrinsics.LJFF(boolIsJumpLastWatch, Boolean.TRUE) || (paidContentInfo3 = aweme.mPaidContentInfo) == null || paidContentInfo3.isPaidCollectionIntro()) {
                aid = null;
            }
        }
        C0SFC.LIZIZ.LIZ(((PaidContentImmersiveViewHolder) akS56S0200000_11.l0).getActivity(), (Context) akS56S0200000_11.l1, aid, aweme, ((PaidContentImmersiveViewHolder) akS56S0200000_11.l0).LLJILJILJ.LJIIIZ, Boolean.FALSE, "", AFwS243S0000000_11.get$arr$(310));
        PaidContentImmersiveViewHolder paidContentImmersiveViewHolder = (PaidContentImmersiveViewHolder) akS56S0200000_11.l0;
        paidContentImmersiveViewHolder.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612650s4F.LIZ(c2344009Gk, paidContentImmersiveViewHolder.LLJJ);
        c2344009Gk.LJFF("series_feed_type", C718180SFc.LIZLLL(paidContentImmersiveViewHolder.LLJJ, paidContentImmersiveViewHolder.LLJILJILJ.LJIIIZ));
        String strLJ = C718180SFc.LJ(paidContentImmersiveViewHolder.LLJJ);
        String str3 = "";
        if (strLJ == null) {
            strLJ = "";
        }
        c2344009Gk.LJFF("series_video_type", strLJ);
        c2344009Gk.LJFF("series_component_type", C718180SFc.LIZJ(paidContentImmersiveViewHolder.LLJJ, paidContentImmersiveViewHolder.LLJILJILJ.LJIIIZ));
        c2344009Gk.LJFF("enter_from", paidContentImmersiveViewHolder.LLJILJILJ.LJIIIZ);
        c2344009Gk.LJFF("component_key", "bottom_button_drama");
        c2344009Gk.LJFF("component_type", "bottom_button");
        c2344009Gk.LJFF("series_click_content", "breathing_light");
        User author = paidContentImmersiveViewHolder.LLJJ.getAuthor();
        if (author != null && (uid = author.getUid()) != null) {
            str2 = uid;
        }
        c2344009Gk.LJFF("anchor_author_id", str2);
        c2344009Gk.LJFF("group_id", paidContentImmersiveViewHolder.LLJJ.getAid());
        HashMap<String, String> mobParams = paidContentImmersiveViewHolder.LLJJ.getMobParams();
        if (mobParams != null && (str = mobParams.get("is_from_series_dnu_insertion")) != null) {
            str3 = str;
        }
        c2344009Gk.LJFF("is_from_series_dnu_insertion", str3);
        Aweme aweme2 = paidContentImmersiveViewHolder.LLJJ;
        if (aweme2 != null && (paidContentInfo2 = aweme2.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo2)) != null && (logExtra2 = paidContentMiniDramaInfoLIZ2.getLogExtra()) != null) {
            c2344009Gk.LJII(logExtra2);
        }
        Aweme aweme3 = paidContentImmersiveViewHolder.LLJJ;
        if (aweme3 != null && (paidContentInfo = aweme3.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
            c2344009Gk.LJII(logExtra);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("click_core_fdmt_component", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$5(AkS56S0200000_11 akS56S0200000_11, View view) {
        C19EG c19egLIZIZ;
        Context context = ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).Qp().wQ2(c19egLIZIZ, (Aweme) akS56S0200000_11.l1, AFwS198S0000000_11.get$arr$(353));
        }
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str = ((VideoItemParams) C631370Opb.LIZ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0)).mEventType;
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) akS56S0200000_11.l1);
        String aid = ((Aweme) akS56S0200000_11.l1).getAid();
        if (aid == null) {
            aid = "";
        }
        iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, aid, ((VideoAuthorInfoRelationAssem) akS56S0200000_11.l0).Tp(), false);
    }

    public static final void LIZ$6(AkS56S0200000_11 akS56S0200000_11, View view) {
        boolean zIsLimitedFreeShortDrama;
        String innerFeedPanelFreeTagText;
        String innerFeedPanelTitle;
        String innerFeedPanelDesc;
        UrlModel coverUrl;
        String aid;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
        SeriesBottomBannerButtonType seriesBottomBannerButtonType;
        Object tag = ((C197039127h) akS56S0200000_11.l0).getTag();
        String collectionName = null;
        if ((tag instanceof SeriesBottomBannerButtonType) && (seriesBottomBannerButtonType = (SeriesBottomBannerButtonType) tag) != null) {
            C718280SFm c718280SFm = C718280SFm.LIZ;
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme();
            String str = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).mEventType;
            c718280SFm.getClass();
            C718280SFm.LIZ("series_play_next_button_click", aweme, seriesBottomBannerButtonType, str);
        }
        String strWQ2 = ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1).Bp().wQ2();
        String strLIZJ = C0SGU.LIZJ(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme());
        if (strLIZJ != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C197039127h) akS56S0200000_11.l0).getContext(), strLIZJ);
            boolean z = true;
            smartRouteBuildRoute.withParam("is_from_bottom_banner", true);
            smartRouteBuildRoute.withParam("is_intro_or_preview", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().isPaidContent);
            smartRouteBuildRoute.withParam("enter_from", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).mEventType);
            smartRouteBuildRoute.withParam("should_hide_video_list", "1");
            smartRouteBuildRoute.withParam("source_video_id", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().getAid());
            smartRouteBuildRoute.withParam("source_group_id", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().getGroupId());
            smartRouteBuildRoute.withParam("source_author_id", AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme()));
            smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme()));
            smartRouteBuildRoute.withParam("log_extra", C718180SFc.LIZIZ(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme()));
            smartRouteBuildRoute.withParam("series_feed_type", C718180SFc.LIZLLL(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme(), ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).mEventType));
            smartRouteBuildRoute.withParam("anchor_group_id", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().getGroupId());
            smartRouteBuildRoute.withParam("anchor_video_id", ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().getAid());
            smartRouteBuildRoute.withParam("anchor_author_id", AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme()));
            smartRouteBuildRoute.withParam("root_scene", "2");
            PaidContentInfo paidContentInfo = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo != null) {
                zIsLimitedFreeShortDrama = paidContentInfo.isLimitedFreeShortDrama();
            } else {
                zIsLimitedFreeShortDrama = false;
            }
            smartRouteBuildRoute.withParam("is_limited_free", zIsLimitedFreeShortDrama);
            PaidContentInfo paidContentInfo2 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo2 != null && (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo2)) != null) {
                innerFeedPanelFreeTagText = paidContentMiniDramaInfoLIZ3.getInnerFeedPanelFreeTagText();
            } else {
                innerFeedPanelFreeTagText = null;
            }
            smartRouteBuildRoute.withParam("free_tag_text", innerFeedPanelFreeTagText);
            PaidContentInfo paidContentInfo3 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo3 != null && (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo3)) != null) {
                innerFeedPanelTitle = paidContentMiniDramaInfoLIZ2.getInnerFeedPanelTitle();
            } else {
                innerFeedPanelTitle = null;
            }
            smartRouteBuildRoute.withParam("inner_feed_panel_title", innerFeedPanelTitle);
            PaidContentInfo paidContentInfo4 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo4 != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo4)) != null) {
                innerFeedPanelDesc = paidContentMiniDramaInfoLIZ.getInnerFeedPanelDesc();
            } else {
                innerFeedPanelDesc = null;
            }
            smartRouteBuildRoute.withParam("inner_feed_panel_desc", innerFeedPanelDesc);
            smartRouteBuildRoute.withParam("component_preload_scene", "bottom_banner_play_next");
            PaidContentInfo paidContentInfo5 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo5 != null) {
                coverUrl = paidContentInfo5.getCoverUrl();
            } else {
                coverUrl = null;
            }
            smartRouteBuildRoute.withParam("cover_url", coverUrl);
            PaidContentInfo paidContentInfo6 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme().mPaidContentInfo;
            if (paidContentInfo6 != null) {
                collectionName = paidContentInfo6.getCollectionName();
            }
            smartRouteBuildRoute.withParam("collection_name", collectionName);
            if (strWQ2 != null && strWQ2.length() != 0) {
                z = false;
            }
            if (z) {
                Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1)).getAweme();
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aid);
                smartRouteBuildRoute.withParam("series_extra_play_next_in_feed", ((SeriesInteractBottomBannerAssem) akS56S0200000_11.l1).Bp().vQ2().name());
            } else {
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strWQ2);
            }
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$7(AkS56S0200000_11 akS56S0200000_11, View view) {
        C19EG c19egLIZIZ;
        String str;
        Context context = ((C712630RxN) akS56S0200000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            StoryInsertCard storyInsertCard = (StoryInsertCard) akS56S0200000_11.l1;
            if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
                str = "";
            }
            C563980MAa.LIZ(c19egLIZIZ, "click_publish_card_plus", str);
        }
    }

    public static final void LIZ$8(AkS56S0200000_11 akS56S0200000_11, View view) {
        C19EG c19egLIZIZ;
        String str;
        Context context = ((C712620RxM) akS56S0200000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            StoryInsertCard storyInsertCard = (StoryInsertCard) akS56S0200000_11.l1;
            if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
                str = "";
            }
            C563980MAa.LIZ(c19egLIZIZ, "click_publish_card_plus", str);
        }
    }

    public static final void LIZ$9(AkS56S0200000_11 akS56S0200000_11, View view) {
        C19EG c19egLIZIZ;
        String str;
        Context context = ((C712590RxJ) akS56S0200000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            StoryInsertCard storyInsertCard = (StoryInsertCard) akS56S0200000_11.l1;
            if (storyInsertCard == null || (str = storyInsertCard.enterFrom) == null) {
                str = "";
            }
            C563980MAa.LIZ(c19egLIZIZ, "click_publish_card_plus", str);
        }
    }

    public AkS56S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
