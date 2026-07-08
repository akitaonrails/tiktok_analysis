package kotlin.jvm.internal;

import X.C01GW;
import X.C01U6;
import X.C09AY;
import X.C0PEM;
import X.C0SY7;
import X.C0SYD;
import X.C103M;
import X.C10B4;
import X.C10B6;
import X.C10CQ;
import X.C10DS;
import X.C10Y8;
import X.C10YA;
import X.C10YH;
import X.C1163504gr;
import X.C1166090gRz;
import X.C1245050iVL;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C1619720sFe;
import X.C1623606Xi;
import X.C1703730uR9;
import X.C1800330wwx;
import X.C1887860zE8;
import X.C1888220zEi;
import X.C1893680zNW;
import X.C1894320zOY;
import X.C1894570zOx;
import X.C1894700zPA;
import X.C1897250zTH;
import X.C1898920zVy;
import X.C1899080zWE;
import X.C1900300zYC;
import X.C1900760zYw;
import X.C1900980zZI;
import X.C1916300zy0;
import X.C1917240zzW;
import X.C1917290zzb;
import X.C191880104w;
import X.C191969108h;
import X.C191984108w;
import X.C19266910Zf;
import X.C19280110bn;
import X.C19323610io;
import X.C1950707kX;
import X.C197039127h;
import X.C19EG;
import X.C1DFH;
import X.C20149813sm;
import X.C20639815pc;
import X.C2107308Nj;
import X.C2178808gE;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C291001Au;
import X.C434310H1h;
import X.C491001vg;
import X.C770770ULj;
import X.C849850XVn;
import X.EnumC1876780ywG;
import X.EnumC1889520zGo;
import X.EnumC1900750zYv;
import X.EnumC1906270zhp;
import X.EnumC19280010bm;
import X.InterfaceC1631630sYr;
import X.InterfaceC1891350zJl;
import X.InterfaceC1897260zTI;
import X.InterfaceC1917330zzf;
import X.InterfaceC1917380zzk;
import X.InterfaceC19231810Ls;
import Y.ACListenerS92S0300000_28;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.touchpoint.api.model.ProfileActivityButton;
import com.bytedance.touchpoint.api.model.ProfileActivityIcon;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.TaskEventResponse;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupComplianceDialogUI;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IArticleModeRssService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragment;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS237S0300000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((C1916300zy0) awS237S0300000_28.l0).LJFF("fbv_consent_popup_click_ok");
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS237S0300000_28.l1;
        if (interfaceC1631630sYr != null) {
            CollectConsentParam collectConsentParam = (CollectConsentParam) awS237S0300000_28.l2;
            interfaceC1631630sYr.invoke(collectConsentParam.consentKey, EnumC1876780ywG.APPROVE, collectConsentParam.flow, collectConsentParam.scenario);
        }
        C849850XVn.LIZIZ.LIZJ().LJIJI("332", "effects_creation_FBVnotice_btn1", true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        int iIntValue;
        ((C191984108w) awS237S0300000_28.l0).LIZ(null, ((C103M) awS237S0300000_28.l1).LLILLL);
        Integer value = ((C103M) awS237S0300000_28.l1).LLILLJJLI.LLILLJJLI.LIZIZ.getValue();
        int iIntValue2 = 0;
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 0;
        }
        Integer value2 = ((C103M) awS237S0300000_28.l1).LLILLJJLI.LL.LIZIZ.getValue();
        if (value2 != null) {
            iIntValue2 = value2.intValue();
        }
        Integer numValueOf = Integer.valueOf(C1888220zEi.LIZIZ.LIZJ());
        String str = ((C103M) awS237S0300000_28.l1).LLILZ;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C1887860zE8 c1887860zE8 = new C1887860zE8();
        Gson gsonLIZ = C1703730uR9.LIZ();
        ArrayList arrayList = new ArrayList();
        if (iIntValue == 1) {
            arrayList.add("all");
        }
        if (iIntValue2 == 1) {
            arrayList.add("ai");
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            arrayList.add("keyword");
        }
        C1887860zE8.LIZ(c1887860zE8, "filters_condition", GsonProtectorUtils.toJson(gsonLIZ, arrayList));
        C1887860zE8.LIZ(c1887860zE8, "enter_method", str);
        c1163504gr.onEventV3("filtered_comment_review_bysetting_ck", c1887860zE8.LIZ);
        try {
            String strEncode = URLEncoder.encode("https://www.tiktok.com/inapp/filtered_comments/posts?hide_loading=1&enable_report_optimization=1&hide_nav_bar=1&service_id=0", "UTF-8");
            Context context = (Context) awS237S0300000_28.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url=");
            sbLIZ.append(strEncode);
            sbLIZ.append("&use_spark=1");
            SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS237S0300000_28.l0).getString(2131847035), new AwS607S0100000_28((Function0) awS237S0300000_28.l1, (Function0<Unit>) 304));
        c1397620mTQ.LIZJ(1, ((Activity) awS237S0300000_28.l0).getString(2131847036), new AwS607S0100000_28((Function0) awS237S0300000_28.l2, (Function0<Unit>) 305));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        Activity activity = ((C1894570zOx) awS237S0300000_28.l0).LLILZIL;
        if (activity != null) {
            C01U6.LIZIZ(new AwS272S0300000_28(activity, (ProfileActivityIcon) awS237S0300000_28.l2, (ProfileActivityButton) awS237S0300000_28.l1, 20));
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        String str = ((ProfileActivityButton) awS237S0300000_28.l1).activityId;
        c1894320zOY.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_type", str);
        linkedHashMap.put("enter_from", "personal_homepage");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("activity_button_click", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C19266910Zf c19266910Zf = (C19266910Zf) obj;
        if (c19266910Zf.LIZJ) {
            String str = c19266910Zf.LIZIZ;
            if (str.length() == 0) {
                C10Y8 c10y8 = (C10Y8) awS237S0300000_28.l0;
                Uri uri = (Uri) awS237S0300000_28.l1;
                c10y8.getClass();
                C10Y8.LJFF(uri, "", "transUrl is empty", false);
            } else {
                C10Y8 c10y82 = (C10Y8) awS237S0300000_28.l0;
                Uri uri2 = (Uri) awS237S0300000_28.l1;
                c10y82.getClass();
                C10Y8.LJFF(uri2, str, "transUrl", true);
                ((C10Y8) awS237S0300000_28.l0).LJ((Uri) awS237S0300000_28.l1, c19266910Zf.LIZIZ, (C1950707kX) awS237S0300000_28.l2);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C10YH((C10Y8) awS237S0300000_28.l0, (Uri) awS237S0300000_28.l1, c19266910Zf, null), 3);
            }
        } else {
            C10YA.LIZ.getClass();
            IKMPDeeplinkService iKMPDeeplinkServiceLIZ = C10YA.LIZ();
            if (iKMPDeeplinkServiceLIZ != null) {
                iKMPDeeplinkServiceLIZ.LIZ(c19266910Zf);
            }
            C10Y8 c10y83 = (C10Y8) awS237S0300000_28.l0;
            Uri uri3 = (Uri) awS237S0300000_28.l1;
            c10y83.getClass();
            C10Y8.LJFF(uri3, "", "transUrl trans fail", false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        int iIntValue;
        ((Animation) awS237S0300000_28.l0).LIZ = ((File) obj).getAbsolutePath();
        ((C1897250zTH) awS237S0300000_28.l1).LIZLLL = false;
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) awS237S0300000_28.l2;
        int i = referralFeedBanner.LIZ;
        Integer num = referralFeedBanner.LIZJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1893680zNW.getClass();
        C1893680zNW.LIZ(1, i, iIntValue, 1, "");
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        return C19323610io.LJJIJL((C19323610io) obj, null, new ACListenerS92S0300000_28((C1166090gRz) awS237S0300000_28.l1, (IArticleModeRssService) awS237S0300000_28.l0, (CreatorToolsActivity) awS237S0300000_28.l2, 13), true, null, null, false, !((IArticleModeRssService) awS237S0300000_28.l0).getHasRssEntrypointClicked(), null, false, false, null, false, false, 16776683);
    }

    public static final Object invoke$15(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((UniversalPopupBlocksUI) awS237S0300000_28.l0).pl(((UniversalPopupBlockElement) ((Map.Entry) awS237S0300000_28.l1).getValue()).action, null, ((UniversalPopupBlock) awS237S0300000_28.l2).id);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((UniversalPopupBlocksUI) awS237S0300000_28.l0).pl(((UniversalPopupBlockElement) ((Map.Entry) awS237S0300000_28.l1).getValue()).action, null, ((UniversalPopupBlock) awS237S0300000_28.l2).id);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((UniversalPopupComplianceDialogUI) awS237S0300000_28.l0).pl(((UniversalPopupBlockElement) ((Map.Entry) awS237S0300000_28.l1).getValue()).action, null, ((UniversalPopupBlock) awS237S0300000_28.l2).id);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((UniversalPopupComplianceDialogUI) awS237S0300000_28.l0).pl(((UniversalPopupBlockElement) ((Map.Entry) awS237S0300000_28.l1).getValue()).action, null, ((UniversalPopupBlock) awS237S0300000_28.l2).id);
        ((C1397660mTU) obj).LIZJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        int i = C0SYD.LIZ[((C0SY7) obj).ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                User user = (User) awS237S0300000_28.l0;
                com.bytedance.android.live.base.model.user.User user2 = (com.bytedance.android.live.base.model.user.User) awS237S0300000_28.l1;
                user2.setFollowStatus(user.getFollowStatus());
                user2.followStatus = C20639815pc.LIZ(user);
                ((InterfaceC19231810Ls) awS237S0300000_28.l2).LIZ();
            }
        } else {
            User user3 = (User) awS237S0300000_28.l0;
            com.bytedance.android.live.base.model.user.User user4 = (com.bytedance.android.live.base.model.user.User) awS237S0300000_28.l1;
            user4.setFollowStatus(user3.getFollowStatus());
            user4.followStatus = C20639815pc.LIZ(user3);
            ((InterfaceC19231810Ls) awS237S0300000_28.l2).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        boolean z;
        C1900300zYC c1900300zYC = (C1900300zYC) obj;
        List listSingletonList = Collections.singletonList(new C1900980zZI(new AwS572S0100000_28((FollowerViewModel) awS237S0300000_28.l2, 249), EnumC1906270zhp.NEW_FOLLOWER));
        C491001vg c491001vg = new C491001vg(new Throwable() { // from class: X.0zZn
            public static final int $stable = 8;
        });
        C291001Au c291001Au = new C291001Au(EnumC1889520zGo.COMPLETE);
        if (((EnumC1900750zYv) awS237S0300000_28.l0) != EnumC1900750zYv.FIRST_REFRESH) {
            z = true;
        } else {
            z = false;
        }
        return C1900300zYC.LIZ(c1900300zYC, listSingletonList, c291001Au, c491001vg, null, null, null, new C291001Au(new C1800330wwx(z, (Exception) awS237S0300000_28.l1)), null, 184);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$20(kotlin.jvm.internal.AwS237S0300000_28 r8, java.lang.Object r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS237S0300000_28.invoke$20(kotlin.jvm.internal.AwS237S0300000_28, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131846624, new AwS237S0300000_28((Context) awS237S0300000_28.l0, (Context) awS237S0300000_28.l1, (LifecycleOwner) awS237S0300000_28.l2, (Function0<Unit>) 20));
        c1397620mTQ.LJII(2131846621, new AwS607S0100000_28((Function0) awS237S0300000_28.l2, (Function0<Unit>) 385));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131846170, new AwS237S0300000_28((EnumC19280010bm) awS237S0300000_28.l0, (C19280110bn) awS237S0300000_28.l1, (View) awS237S0300000_28.l2, 23));
        c1397630mTR.LJI(2131846171, new AwS394S0200000_28((EnumC19280010bm) awS237S0300000_28.l0, (C19280110bn) awS237S0300000_28.l1, 115));
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        TuxActionSheet tuxActionSheet;
        ((EnumC19280010bm) awS237S0300000_28.l0).uploadEvent("click_confirm_allow_popup", new Pair<>("popup_key", ((C19280110bn) awS237S0300000_28.l1).LJFF), new Pair<>("action", "confirm"));
        ((EnumC19280010bm) awS237S0300000_28.l0).requestAndToast((View) awS237S0300000_28.l2, (C19280110bn) awS237S0300000_28.l1);
        WeakReference<TuxActionSheet> weakReference = EnumC19280010bm.currentSheet;
        if (weakReference != null && (tuxActionSheet = weakReference.get()) != null) {
            tuxActionSheet.dismissAllowingStateLoss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131827273, new AwS394S0200000_28((Context) awS237S0300000_28.l0, (Context) awS237S0300000_28.l1, (Function1<? super Boolean, Unit>) 116));
        c1397620mTQ.LJII(2131827270, new AwS394S0200000_28((CommerceToolsTcmModel) awS237S0300000_28.l2, (CommerceToolsTcmModel) awS237S0300000_28.l1, (Function1<? super Boolean, Unit>) 117));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        List<String> list = (List) obj;
        C20149813sm c20149813sm = (C20149813sm) awS237S0300000_28.l0;
        if (c20149813sm.LLILZ == 2) {
            Activity activity = (Activity) awS237S0300000_28.l1;
            List<String> list2 = (List) awS237S0300000_28.l2;
            c20149813sm.LIZJ(activity, list2, list, list2);
        } else {
            c20149813sm.LIZJ((Activity) awS237S0300000_28.l1, (List) awS237S0300000_28.l2, list, list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        boolean z;
        C1900300zYC c1900300zYC = (C1900300zYC) obj;
        C1245050iVL.LIZ("FollowerViewModel, checkResultStatus, not empty, RefreshErrorThrowable");
        List list = (List) awS237S0300000_28.l0;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C491001vg c491001vg = new C491001vg(new Throwable(jCurrentTimeMillis) { // from class: X.0zZo
            public static final int $stable = 8;
            public final long LL;

            public final long getStamp() {
                return this.LL;
            }

            {
                this.LL = jCurrentTimeMillis;
            }
        });
        if (((EnumC1900750zYv) awS237S0300000_28.l1) != EnumC1900750zYv.FIRST_REFRESH) {
            z = true;
        } else {
            z = false;
        }
        return C1900300zYC.LIZ(c1900300zYC, list, null, c491001vg, null, null, null, new C291001Au(new C1800330wwx(z, (Exception) awS237S0300000_28.l2)), null, 186);
    }

    public static final Object invoke$4(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        C1623606Xi c1623606Xi = new C1623606Xi((List) awS237S0300000_28.l0);
        return C1900300zYC.LIZ((C1900300zYC) obj, (List) awS237S0300000_28.l0, new C291001Au((EnumC1889520zGo) awS237S0300000_28.l1), c1623606Xi, null, null, new C291001Au(Boolean.valueOf(C1900760zYw.LIZ.contains((EnumC1900750zYv) awS237S0300000_28.l2))), null, null, 216);
    }

    public static final Object invoke$5(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C10CQ c10cq = new C10CQ((Context) awS237S0300000_28.l0, (C1917290zzb) awS237S0300000_28.l1);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(((C1917290zzb) awS237S0300000_28.l1).LJIIJJI)) {
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                final Context context = (Context) awS237S0300000_28.l0;
                final C1917290zzb c1917290zzb = (C1917290zzb) awS237S0300000_28.l1;
                final C10DS c10ds = (C10DS) awS237S0300000_28.l2;
                InterfaceC1917380zzk interfaceC1917380zzk = new InterfaceC1917380zzk() { // from class: X.0zy3
                    @Override // X.InterfaceC1917380zzk
                    public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                        int i = C2187451AjH.LIZ;
                        C10DS c10ds2 = c10ds;
                        if (c10ds2 != null) {
                            c10ds2.LIZIZ(1, abstractC343940De4);
                        }
                    }
                };
                InterfaceC1917330zzf interfaceC1917330zzf = new InterfaceC1917330zzf() { // from class: X.0zgK
                    @Override // X.InterfaceC1917330zzf
                    public final void LIZIZ() {
                        int i = C2187451AjH.LIZ;
                        C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                        Context context2 = context;
                        C1917290zzb c1917290zzb2 = c1917290zzb;
                        c1917240zzW2.getClass();
                        C1917240zzW.LIZ(context2, c1917290zzb2, true);
                    }

                    @Override // X.InterfaceC1917330zzf
                    public final void LIZ(String str) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tryShowUGGuideOutPushDialog.onNotShow(");
                        sbLIZ.append(str);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1917290zzb c1917290zzb2 = c1917290zzb;
                        c1917290zzb2.LJIIIIZZ = str;
                        C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                        Context context2 = context;
                        c1917240zzW2.getClass();
                        C1917240zzW.LIZ(context2, c1917290zzb2, false);
                        C10DS c10ds2 = c10ds;
                        if (c10ds2 != null) {
                            c10ds2.LIZ(str);
                        }
                    }
                };
                c1917240zzW.getClass();
                C1917240zzW.LJIIIZ(context, c10cq, c1917290zzb, interfaceC1917380zzk, interfaceC1917330zzf);
            } else {
                C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                final Context context2 = (Context) awS237S0300000_28.l0;
                final C10DS c10ds2 = (C10DS) awS237S0300000_28.l2;
                InterfaceC1917380zzk interfaceC1917380zzk2 = new InterfaceC1917380zzk() { // from class: X.0zy4
                    @Override // X.InterfaceC1917380zzk
                    public final void LIZ(AbstractC343940De4 abstractC343940De4) {
                        int i = C2187451AjH.LIZ;
                        C10DS c10ds3 = c10ds2;
                        if (c10ds3 != null) {
                            c10ds3.LIZIZ(1, abstractC343940De4);
                        }
                    }
                };
                final C1917290zzb c1917290zzb2 = (C1917290zzb) awS237S0300000_28.l1;
                InterfaceC1917330zzf interfaceC1917330zzf2 = new InterfaceC1917330zzf() { // from class: X.0zgL
                    @Override // X.InterfaceC1917330zzf
                    public final void LIZIZ() {
                        int i = C2187451AjH.LIZ;
                        C1917240zzW c1917240zzW3 = C1917240zzW.LIZ;
                        Context context3 = context2;
                        C1917290zzb c1917290zzb3 = c1917290zzb2;
                        c1917240zzW3.getClass();
                        C1917240zzW.LIZ(context3, c1917290zzb3, true);
                    }

                    @Override // X.InterfaceC1917330zzf
                    public final void LIZ(String str) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tryShowUGGuideOutPushDialog.onNotShow(");
                        sbLIZ.append(str);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1917290zzb c1917290zzb3 = c1917290zzb2;
                        c1917290zzb3.LJIIIIZZ = str;
                        C1917240zzW c1917240zzW3 = C1917240zzW.LIZ;
                        Context context3 = context2;
                        c1917240zzW3.getClass();
                        C1917240zzW.LIZ(context3, c1917290zzb3, false);
                        C10DS c10ds3 = c10ds2;
                        if (c10ds3 != null) {
                            c10ds3.LIZ(str);
                        }
                    }
                };
                c1917240zzW2.getClass();
                C1917240zzW.LJI(context2, c10cq, interfaceC1917380zzk2, interfaceC1917330zzf2);
            }
        } else {
            int i = C2187451AjH.LIZ;
            C1917290zzb c1917290zzb3 = (C1917290zzb) awS237S0300000_28.l1;
            c1917290zzb3.LJIIIIZZ = "pitaya_filtered";
            C1917240zzW c1917240zzW3 = C1917240zzW.LIZ;
            Context context3 = (Context) awS237S0300000_28.l0;
            c1917240zzW3.getClass();
            C1917240zzW.LIZ(context3, c1917290zzb3, false);
            C10DS c10ds3 = (C10DS) awS237S0300000_28.l2;
            if (c10ds3 != null) {
                c10ds3.LIZ("pitaya_filtered");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131821883, new AwS237S0300000_28((PaPromptFragment) awS237S0300000_28.l0, (PaPromptFragment) awS237S0300000_28.l1, (C10B4) awS237S0300000_28.l2, (Function0<Unit>) 7));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        String str;
        ((PaPromptFragment) awS237S0300000_28.l0).LLJJ = true;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "account_privacy_page");
        c191969108h.LIZLLL("action_type", "click");
        c191969108h.LIZIZ(System.currentTimeMillis() - ((PaPromptFragment) awS237S0300000_28.l0).LLJJI, "stay_time");
        int i = C10B6.LIZ[((C10B4) awS237S0300000_28.l1).ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "private";
            } else {
                str = "remind_me_later";
            }
        } else {
            str = "public";
        }
        c191969108h.LIZLLL("page_type", str);
        c1163504gr.onEventV3("account_privacy_manage_confirm", c191969108h.LIZ);
        ((Function0) awS237S0300000_28.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        List<TouchPoint> list;
        C1898920zVy c1898920zVy = (C1898920zVy) obj;
        ((C1899080zWE) awS237S0300000_28.l0).getClass();
        TaskEventResponse taskEventResponse = c1898920zVy.LIZIZ;
        if (taskEventResponse != null && (list = taskEventResponse.touchPoints) != null) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C2178808gE.LIZ().LJIIIIZZ(list);
        }
        ((C1899080zWE) awS237S0300000_28.l0).LJIILJJIL(c1898920zVy);
        ((C1899080zWE) awS237S0300000_28.l0).LJIILIIL(c1898920zVy);
        ((C1899080zWE) awS237S0300000_28.l0).LJIILLIIL(c1898920zVy);
        Function1 function1 = (Function1) awS237S0300000_28.l1;
        if (function1 != null) {
            function1.invoke(c1898920zVy);
        }
        ((C1899080zWE) awS237S0300000_28.l0).LIZ.LJFF((TaskEventContent) awS237S0300000_28.l2, c1898920zVy);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS237S0300000_28 awS237S0300000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C191880104w c191880104w = C191880104w.LIZ;
            AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2((C19EG) awS237S0300000_28.l1, (C19EG) awS237S0300000_28.l2, (C259800zU<TuxSheet>) 69);
            c191880104w.getClass();
            C191880104w.LIZIZ("switch_inbox_mode", awS403S0200000_2);
        }
        C197039127h c197039127h = ((C770770ULj) awS237S0300000_28.l0).LIZ;
        if (c197039127h != null) {
            c197039127h.setClickable(true);
        }
        ((C770770ULj) awS237S0300000_28.l0).LIZ(false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(C770770ULj c770770ULj, C770770ULj c770770ULj2, C19EG c19eg, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = c770770ULj;
        this.l1 = c770770ULj2;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(C1894570zOx c1894570zOx, ProfileActivityButton profileActivityButton, ProfileActivityIcon profileActivityIcon, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1894570zOx;
        this.l1 = profileActivityButton;
        this.l2 = profileActivityIcon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(C1899080zWE c1899080zWE, C1899080zWE c1899080zWE2, Function1<? super C1898920zVy, Unit> function1, TaskEventContent taskEventContent) {
        super(1);
        this.$t = taskEventContent;
        this.l0 = c1899080zWE;
        this.l1 = c1899080zWE2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(EnumC1900750zYv enumC1900750zYv, Exception exc, FollowerViewModel followerViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1900750zYv;
        this.l1 = exc;
        this.l2 = followerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(C1916300zy0 c1916300zy0, C1916300zy0 c1916300zy02, InterfaceC1631630sYr<? super String, ? super EnumC1876780ywG, ? super String, ? super String, Unit> interfaceC1631630sYr, CollectConsentParam collectConsentParam) {
        super(1);
        this.$t = collectConsentParam;
        this.l0 = c1916300zy0;
        this.l1 = c1916300zy02;
        this.l2 = interfaceC1631630sYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(C191984108w c191984108w, C103M c103m, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c103m;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(C10Y8 c10y8, Uri uri, C1950707kX c1950707kX, int i) {
        super(1);
        this.$t = i;
        this.l0 = c10y8;
        this.l1 = uri;
        this.l2 = c1950707kX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(EnumC19280010bm enumC19280010bm, C19280110bn c19280110bn, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC19280010bm;
        this.l1 = c19280110bn;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(C20149813sm c20149813sm, C19EG c19eg, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20149813sm;
        this.l1 = c19eg;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(Activity activity, Activity activity2, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(Context context, C1917290zzb c1917290zzb, C10DS c10ds, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1917290zzb;
        this.l2 = c10ds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(Context context, Context context2, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(Context context, LifecycleOwner lifecycleOwner, AwS572S0100000_28 awS572S0100000_28, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = lifecycleOwner;
        this.l2 = awS572S0100000_28;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AwS610S0100000_31 awS610S0100000_31, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = awS610S0100000_31;
        this.l2 = commerceToolsTcmModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(Animation animation, ReferralFeedBanner referralFeedBanner, C1897250zTH c1897250zTH, int i) {
        super(1);
        this.$t = i;
        this.l0 = animation;
        this.l1 = c1897250zTH;
        this.l2 = referralFeedBanner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(CreatorToolsActivity creatorToolsActivity, C1166090gRz c1166090gRz, IArticleModeRssService iArticleModeRssService, int i) {
        super(1);
        this.$t = i;
        this.l0 = iArticleModeRssService;
        this.l1 = c1166090gRz;
        this.l2 = creatorToolsActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(UniversalPopupBlocksUI universalPopupBlocksUI, UniversalPopupBlocksUI universalPopupBlocksUI2, Map.Entry<String, UniversalPopupBlockElement> entry, UniversalPopupBlock universalPopupBlock) {
        super(1);
        this.$t = universalPopupBlock;
        this.l0 = universalPopupBlocksUI;
        this.l1 = universalPopupBlocksUI2;
        this.l2 = entry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(UniversalPopupComplianceDialogUI universalPopupComplianceDialogUI, UniversalPopupComplianceDialogUI universalPopupComplianceDialogUI2, Map.Entry<String, UniversalPopupBlockElement> entry, UniversalPopupBlock universalPopupBlock) {
        super(1);
        this.$t = universalPopupBlock;
        this.l0 = universalPopupComplianceDialogUI;
        this.l1 = universalPopupComplianceDialogUI2;
        this.l2 = entry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS237S0300000_28(User user, com.bytedance.android.live.base.model.user.User user2, C434310H1h c434310H1h, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = c434310H1h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(PaPromptFragment paPromptFragment, PaPromptFragment paPromptFragment2, C10B4 c10b4, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = paPromptFragment;
        this.l1 = paPromptFragment2;
        this.l2 = c10b4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(List list, List<? extends InterfaceC1891350zJl> list2, EnumC1889520zGo enumC1889520zGo, EnumC1900750zYv enumC1900750zYv) {
        super(1);
        this.$t = enumC1900750zYv;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = enumC1889520zGo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS237S0300000_28(List list, List<? extends InterfaceC1891350zJl> list2, EnumC1900750zYv enumC1900750zYv, Exception exc) {
        super(1);
        this.$t = exc;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = enumC1900750zYv;
    }
}
