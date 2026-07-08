package kotlin.jvm.internal;

import X.C09AY;
import X.C0HD2;
import X.C0I0E;
import X.C0RF0;
import X.C0RQ5;
import X.C0RQN;
import X.C0RUD;
import X.C0RZV;
import X.C0S1Y;
import X.C0SED;
import X.C0SIK;
import X.C0SIR;
import X.C0SPF;
import X.C0T6L;
import X.C1057880ddS;
import X.C12835050n;
import X.C1397630mTR;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2222691Bz1;
import X.C291001Au;
import X.C328100Ctc;
import X.C418440Gaw;
import X.C697790RYr;
import X.C700180RdI;
import X.C700190RdJ;
import X.C714560S1e;
import X.C717830SDt;
import X.C722400SVi;
import X.C729440SjO;
import X.C729450SjP;
import X.C730090SkR;
import X.C730120SkU;
import X.C732520SoM;
import X.C733520Spy;
import X.C814420VxA;
import X.EnumC697290RWt;
import X.EnumC697300RWu;
import X.EnumC733460Sps;
import X.InterfaceC729460SjQ;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentVM;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryUploadProgressComponent;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.FcpAnnotationContainer;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS125S1100000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(VideoShareViewModel videoShareViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoShareViewModel;
        this.s0 = "whatsapp";
    }

    public static final Object invoke$0(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        return C730090SkR.LIZ((C730090SkR) obj, null, null, new C291001Au(new C0SED(awS125S1100000_11.s0, null, ((C730120SkU) awS125S1100000_11.l1).LIZIZ, null, null, 26)), false, null, null, null, 0, 0, 0L, 0L, false, false, null, null, 32763);
    }

    public static final Object invoke$1(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String str;
        Integer num;
        C0RUD c0rud = (C0RUD) obj;
        C0RF0 c0rf0 = ((InteractAreaComponent) awS125S1100000_11.l1).jm().LIZLLL;
        Integer numValueOf = null;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        c0rud.LLJILLL = str;
        C0RF0 c0rf02 = ((InteractAreaComponent) awS125S1100000_11.l1).jm().LIZLLL;
        if (c0rf02 != null) {
            num = c0rf02.LJIIZILJ;
        } else {
            num = null;
        }
        c0rud.LLJJ = num;
        C0RF0 c0rf03 = ((InteractAreaComponent) awS125S1100000_11.l1).jm().LIZLLL;
        if (c0rf03 != null) {
            numValueOf = Integer.valueOf(c0rf03.LJIILJJIL);
        }
        c0rud.LLJJI = numValueOf;
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String str2 = awS125S1100000_11.s0;
        String start = EnumC697290RWt.P_INTERACT_RIGHT_CREATE.getStart();
        c697790RYr.getClass();
        C697790RYr.LIZJ(str2, start, null, null, null, null);
        InteractRightAreaComponent interactRightAreaComponent = new InteractRightAreaComponent();
        InteractAreaComponent interactAreaComponent = (InteractAreaComponent) awS125S1100000_11.l1;
        interactRightAreaComponent.LLJJL = interactAreaComponent;
        interactRightAreaComponent.LLJJJJLIIL = interactAreaComponent.nJ2();
        c0rud.LLJ = interactRightAreaComponent;
        c0rud.LLJI = R.id.kvd;
        C0RQN.LJ(((InteractAreaComponent) awS125S1100000_11.l1).Ig(), C0RQ5.C_INTERACT_RIGHT, EnumC697300RWu.M_CREATE, jLJFF);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        ((SocialPublishCallback) obj).onSynthesisSuccess((PublishModel) awS125S1100000_11.l1, awS125S1100000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        ICommerceChallengeService iCommerceChallengeService;
        UrlModel urlModelLJIIL;
        C0SIR c0sir = (C0SIR) obj;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c0sir);
        Object obj2 = c0sir.LIZLLL;
        if (obj2 instanceof TextExtraStruct) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) obj2;
            if (textExtraStruct.getType() == 1 && (urlModelLJIIL = (iCommerceChallengeService = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIL(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                View view = (View) awS125S1100000_11.l1;
                String str = awS125S1100000_11.s0;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
                listLJIILJJIL.add(new C0SIR("[emoji]", C1697810uHb.LJIILJJIL(new C0HD2(colorDrawable, iLIZIZ, urlModelLJIIL, view)), C0SIK.EMOJI, 8));
                iCommerceChallengeService.LJIIIZ(str, textExtraStruct.getHashTagName());
            }
        }
        return listLJIILJJIL;
    }

    public static final Object invoke$12(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        return C714560S1e.LIZ((C714560S1e) obj, null, null, new C291001Au(new C0S1Y((C0I0E) awS125S1100000_11.l1, awS125S1100000_11.s0)), 111);
    }

    public static final Object invoke$13(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        Aweme aweme;
        C732520SoM c732520SoM = (C732520SoM) obj;
        EnumC733460Sps enumC733460Sps = EnumC733460Sps.BREATHE_SHARE;
        VideoItemParams item = ((VideoShareViewModel) awS125S1100000_11.l1).getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        return C732520SoM.LIZ(c732520SoM, null, null, null, null, null, new C291001Au(new Pair(enumC733460Sps, new C733520Spy(aweme, ((VideoShareViewModel) awS125S1100000_11.l1).eventType, awS125S1100000_11.s0))), 63);
    }

    public static final Object invoke$14(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String str = (String) obj;
        String str2 = awS125S1100000_11.s0;
        if (str2 != null) {
            ((MessageDraftViewModel) ((VideoExposeSharerInformationAssem) awS125S1100000_11.l1).LLJZIJLIL.getValue()).wQ2(str2, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        ((FcpAnnotationContainer) awS125S1100000_11.l1).ep(awS125S1100000_11.s0, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        ((FcpAnnotationContainer) awS125S1100000_11.l1).ep(awS125S1100000_11.s0, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS125S1100000_11 awS125S1100000_11, Object obj) throws JSONException {
        String aid;
        String authorUid;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("to_user_id", awS125S1100000_11.s0);
        jSONObject.put("enter_from", ((FeedTaggedListViewModel) awS125S1100000_11.l1).vQ2().LLILLL);
        Aweme aweme = ((FeedTaggedListViewModel) awS125S1100000_11.l1).vQ2().LL;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        jSONObject.put("group_id", aid);
        Aweme aweme2 = ((FeedTaggedListViewModel) awS125S1100000_11.l1).vQ2().LL;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str = authorUid;
        }
        jSONObject.put("author_id", str);
        jSONObject.put("anchor_type", ((FeedTaggedListViewModel) awS125S1100000_11.l1).vQ2().LLILZ);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String scheduleId;
        C729450SjP c729450SjP;
        Aweme aweme;
        List<C0SPF> list = (List) obj;
        if (list != null) {
            String str = awS125S1100000_11.s0;
            StoryUploadProgressComponent storyUploadProgressComponent = (StoryUploadProgressComponent) awS125S1100000_11.l1;
            for (C0SPF c0spf : list) {
                if (c0spf == null || (c729450SjP = c0spf.LIZIZ) == null || (aweme = c729450SjP.LJ) == null || (scheduleId = AwemeBizExtKt.getScheduleId(aweme)) == null) {
                    scheduleId = "";
                }
                if (!Intrinsics.LJFF(scheduleId, str)) {
                    storyUploadProgressComponent.Jp(scheduleId);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String str;
        Set<String> setPo0;
        String str2 = awS125S1100000_11.s0;
        ExposedCommentInfo exposedCommentInfo = ((C0RZV) obj).LLILLJJLI;
        if (exposedCommentInfo != null) {
            str = exposedCommentInfo.commentUserId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            ExposedCommentVM exposedCommentVM = (ExposedCommentVM) awS125S1100000_11.l1;
            exposedCommentVM.getClass();
            exposedCommentVM.setState(AFwS243S0000000_11.get$arr$(827));
            IExposedCommentDataAbility iExposedCommentDataAbility = ((ExposedCommentVM) awS125S1100000_11.l1).LL;
            if (iExposedCommentDataAbility != null && (setPo0 = iExposedCommentDataAbility.po0()) != null) {
                setPo0.add(awS125S1100000_11.s0);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS125S1100000_11 r5, java.lang.Object r6) {
        /*
            X.050n r6 = (X.C12835050n) r6
            java.lang.Object r0 = r5.l1
            X.0RdJ r0 = (X.C700190RdJ) r0
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZLLL
            r4 = 0
            if (r0 == 0) goto L2f
            java.util.List<java.lang.String> r1 = r0.priorityList
            if (r1 == 0) goto L2f
            java.lang.String r0 = r5.s0
            boolean r0 = r1.contains(r0)
            r3 = 1
            if (r0 != r3) goto L2f
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "in_priority_list"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            r6.LIZ(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L2f:
            r3 = 0
            java.lang.String r4 = "check enable failed"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS125S1100000_11.invoke$2(kotlin.jvm.internal.AwS125S1100000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String str;
        C12835050n c12835050n = (C12835050n) obj;
        boolean z = ((ConditionData) awS125S1100000_11.l1).canApplySlot;
        if (!z) {
            str = "active check failed";
        } else {
            str = null;
        }
        c12835050n.LIZ(str, C2097608Jq.LJIIIIZZ(new Pair("biz_active", Boolean.valueOf(z)), new Pair("can_apply_slot", Boolean.valueOf(((ConditionData) awS125S1100000_11.l1).canApplySlot))));
        new AwS11S1010000_11(awS125S1100000_11.s0, z, 0);
        C0T6L.LIZLLL();
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS125S1100000_11 r5, java.lang.Object r6) {
        /*
            X.050n r6 = (X.C12835050n) r6
            java.lang.Object r0 = r5.l1
            X.0RdI r0 = (X.C700180RdI) r0
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZLLL
            r4 = 0
            if (r0 == 0) goto L3a
            java.util.List<java.lang.String> r1 = r0.priorityList
            if (r1 == 0) goto L3a
            java.lang.String r0 = r5.s0
            boolean r0 = r1.contains(r0)
            r3 = 1
            if (r0 != r3) goto L3a
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "in_priority_list"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            r6.LIZ(r4, r0)
            kotlin.jvm.internal.AwS11S1010000_11 r2 = new kotlin.jvm.internal.AwS11S1010000_11
            java.lang.String r1 = r5.s0
            r0 = 2
            r2.<init>(r1, r3, r0)
            X.C0T6L.LIZLLL()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3a:
            r3 = 0
            java.lang.String r4 = "check enable failed"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS125S1100000_11.invoke$4(kotlin.jvm.internal.AwS125S1100000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        String str;
        C2189821An6 c2189821An6;
        C717830SDt c717830SDt = (C717830SDt) obj;
        String strLIZIZ = awS125S1100000_11.s0;
        VideoItemParams videoItemParams = (VideoItemParams) awS125S1100000_11.l1;
        if (strLIZIZ.length() == 0) {
            Aweme aweme = videoItemParams.getAweme();
            String str2 = videoItemParams.mEventType;
            Aweme aweme2 = videoItemParams.getAweme();
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            String uid = null;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                uid = c2189821An6.getUid();
            }
            String str3 = "";
            if (uid == null) {
                uid = "";
            }
            BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams2 != null && (str = baseFeedPageParams2.eventType) != null) {
                str3 = str;
            }
            strLIZIZ = C1057880ddS.LIZIZ(str2, C328100Ctc.LIZ(aweme2, uid, str3), aweme);
        }
        return new C717830SDt(strLIZIZ, c717830SDt.LLILLJJLI, c717830SDt.LLILLL, c717830SDt.LLILZ, c717830SDt.LLILZIL);
    }

    public static final Object invoke$6(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        C722400SVi c722400SVi = (C722400SVi) awS125S1100000_11.l1;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("object_id", c722400SVi.LIZJ);
        pairArr[1] = new Pair("country_code", C2222691Bz1.LIZ());
        String str = c722400SVi.LIZIZ;
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("previous_page", str);
        C20684815ws.LJIILLIIL("scm_learn_more_click", C2097608Jq.LJIIIIZZ(pairArr));
        Context context = ((C722400SVi) awS125S1100000_11.l1).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS125S1100000_11.s0);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(((C722400SVi) awS125S1100000_11.l1).LIZIZ);
        sbLIZ.append("&object_id=");
        sbLIZ.append(((C722400SVi) awS125S1100000_11.l1).LIZJ);
        sbLIZ.append("&country_code=");
        sbLIZ.append(C2222691Bz1.LIZ());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("hide_status_bar", true);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LIZJ(0, ((C722400SVi) awS125S1100000_11.l1).LIZ.getString(2131847027), new AwS125S1100000_11((C722400SVi) awS125S1100000_11.l1, awS125S1100000_11.s0, 6));
        c1397630mTR.LIZJ(1, ((C722400SVi) awS125S1100000_11.l1).LIZ.getString(2131847026), AFwS243S0000000_11.get$arr$(653));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        ((InterfaceC729460SjQ) obj).LIZ(awS125S1100000_11.s0, (C0SPF) awS125S1100000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS125S1100000_11 awS125S1100000_11, Object obj) {
        InterfaceC729460SjQ interfaceC729460SjQ = (InterfaceC729460SjQ) obj;
        if (((C729440SjO) awS125S1100000_11.l1).LJIJ(awS125S1100000_11.s0) != null) {
            interfaceC729460SjQ.LIZLLL(awS125S1100000_11.s0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(C0I0E c0i0e, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0i0e;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(C700190RdJ c700190RdJ, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c700190RdJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(C722400SVi c722400SVi, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c722400SVi;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(C21415018rM c21415018rM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21415018rM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoExposeSharerInformationAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(VideoItemParams videoItemParams, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(PublishModel publishModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = publishModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(InteractAreaComponent interactAreaComponent, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interactAreaComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(FcpAnnotationContainer fcpAnnotationContainer, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fcpAnnotationContainer;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, C0SPF c0spf, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0spf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, C729440SjO c729440SjO, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c729440SjO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, C730120SkU c730120SkU, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c730120SkU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, ExposedCommentVM exposedCommentVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = exposedCommentVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, StoryUploadProgressComponent storyUploadProgressComponent, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = storyUploadProgressComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(String str, FeedTaggedListViewModel feedTaggedListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = feedTaggedListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(C700180RdI c700180RdI, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c700180RdI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S1100000_11(ConditionData conditionData, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l1 = conditionData;
        this.s0 = str2;
    }
}
