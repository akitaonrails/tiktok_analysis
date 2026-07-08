package com.ss.android.ugc.aweme.commerce.tools.tcm.service;

import X.AbstractC23140094w;
import X.AbstractC856620Xj2;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0HTI;
import X.C0LAB;
import X.C11G4;
import X.C127K;
import X.C1390380mHk;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C15N0;
import X.C15N1;
import X.C15N2;
import X.C1602160rnK;
import X.C1848410yCV;
import X.C189200o6;
import X.C19292410dm;
import X.C19EG;
import X.C20507315Mh;
import X.C20507415Mi;
import X.C20508815Mw;
import X.C20508915Mx;
import X.C20642515q3;
import X.C20684815ws;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2252611DEt;
import X.C2286608xc;
import X.C23260099m;
import X.C2512009ss;
import X.C2512109st;
import X.C340190DVh;
import X.C345890DhD;
import X.C634540Oui;
import X.C770750ULh;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogInterfaceOnCancelListenerC1864700ycm;
import X.InterfaceC1364105Vn;
import Y.ACListenerS95S0300000_31;
import Y.AObserverS190S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import avg.f;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.publish.IPublishPageService;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceToolsTcmServiceImpl implements ICommerceToolsTcmService {
    public C15N0 LIZ;
    public C634540Oui LIZIZ;
    public BCPageModel LIZJ;

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void clear() {
        this.LIZIZ = null;
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIIZ() {
        boolean z = C2512109st.LIZ;
        return C2512109st.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIJ() {
        C20508815Mw.LIZ.getClass();
        return C20508815Mw.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIJJI() {
        C20508815Mw.LIZ.getClass();
        TcmConfig tcmConfigLIZ = C20508815Mw.LIZ();
        if (tcmConfigLIZ == null || (!tcmConfigLIZ.isTcmCreator() && tcmConfigLIZ.getUseBcEntranceInPost())) {
            return C2512009ss.LIZ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIZILJ() {
        return C20508815Mw.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LIZ(JSONObject jSONObject) {
        Object objLIZLLL;
        String strOptString;
        C19292410dm currentUser;
        String strOptString2 = jSONObject.optString("branded_content_type");
        String strOptString3 = jSONObject.optString("brand_organic_type");
        String strOptString4 = jSONObject.optString("campaign_info");
        boolean zOptBoolean = jSONObject.optBoolean("ads_only");
        boolean zOptBoolean2 = jSONObject.optBoolean("ads_authorization");
        String strOptString5 = jSONObject.optString("tcm_params");
        boolean zOptBoolean3 = jSONObject.optBoolean("is_account_ad_settings_open");
        if (zOptBoolean3 && (currentUser = o.LJIIZILJ.getCurrentUser()) != null) {
            currentUser.LJIIL();
        }
        String strOptString6 = jSONObject.optString("deliverable_id");
        BCPageModel bCPageModel = null;
        if (!Intrinsics.LJFF(strOptString2, CardStruct.IStatusCode.DEFAULT) && !TextUtils.isEmpty(strOptString6)) {
            strOptString = jSONObject.optString("deliverable_id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("submit_text");
            if (jSONObjectOptJSONObject != null) {
                objLIZLLL = JsonParseUtils.LIZLLL(TCMPostPageSubmitTextModel.class, C786410Ut5.J3(jSONObjectOptJSONObject));
            } else {
                objLIZLLL = null;
            }
        } else {
            objLIZLLL = null;
            strOptString = null;
        }
        BCPageModel bCPageModel2 = this.LIZJ;
        if (bCPageModel2 != null) {
            bCPageModel = bCPageModel2;
        }
        bCPageModel.LL.setValue(new C15N1(strOptString2, strOptString3, strOptString4, strOptString5, zOptBoolean, zOptBoolean2, zOptBoolean3, strOptString, (TCMPostPageSubmitTextModel) objLIZLLL));
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final CommerceTcmPublishModule LIZIZ(AbstractC856620Xj2 abstractC856620Xj2) {
        return new CommerceTcmPublishModule(abstractC856620Xj2);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILL(CommerceToolsTcmModel commerceToolsTcmModel) {
        String outerTcmOrder = commerceToolsTcmModel.getOuterTcmOrder();
        if (outerTcmOrder != null && outerTcmOrder.length() > 0) {
            JSONObject jSONObject = new JSONObject(outerTcmOrder);
            String strOptString = jSONObject.optString("campaignInfo");
            if ((!TextUtils.isEmpty(strOptString)) && strOptString != null) {
                commerceToolsTcmModel.setTcmOrder(true);
                commerceToolsTcmModel.setTcmCampaignInfo(strOptString);
                commerceToolsTcmModel.setBrandedContentSwitch("1");
            }
            String strOptString2 = jSONObject.optString("sparkAdsAuth");
            if ((!TextUtils.isEmpty(strOptString2)) && strOptString2 != null) {
                commerceToolsTcmModel.setSparkAdsAuth(strOptString2);
            }
            String strOptString3 = jSONObject.optString("deliverableId");
            if ((!TextUtils.isEmpty(strOptString3)) && strOptString3 != null) {
                commerceToolsTcmModel.setDeliverableId(strOptString3);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("submitText");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject != null) {
                commerceToolsTcmModel.setSubmitText(new TCMPostPageSubmitTextModel(jSONObjectOptJSONObject.optString("submitTitle"), jSONObjectOptJSONObject.optString("submitButton")));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIJI(BCPageModel bCPageModel) {
        this.LIZJ = bCPageModel;
    }

    public static void LJIJJ(AwemeDraft awemeDraft, JSONObject jSONObject) {
        CommerceToolsTcmModel tcmModel = awemeDraft.LIZ.commerceModel.getTcmModel();
        tcmModel.setTcmOrder(!TextUtils.isEmpty(jSONObject.optString("campaignInfo")));
        tcmModel.setBrandedContentSwitch("1");
        tcmModel.setTcmCampaignInfo(jSONObject.optString("campaignInfo"));
        tcmModel.setDeliverableId(jSONObject.optString("deliverableId"));
        tcmModel.setSparkAdsAuth(jSONObject.optString("sparkAdsAuth"));
        tcmModel.setOuterTcmOrder(C786410Ut5.J3(jSONObject));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("submitText");
        if (jSONObjectOptJSONObject != null) {
            tcmModel.setSubmitText(new TCMPostPageSubmitTextModel(jSONObjectOptJSONObject.optString("submitTitle"), jSONObjectOptJSONObject.optString("submitButton")));
        }
        if (tcmModel.getTcmPreventSelfSee() != 2) {
            tcmModel.setTcmPreventSelfSee(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJI(Context context, String str) {
        C15N2 c15n2;
        C15N2 c15n22;
        C15N2 c15n23;
        C15N2 c15n24;
        if (context == null) {
            return;
        }
        if (!TextUtils.equals(str, CardStruct.IStatusCode.DEFAULT)) {
            C15N0 c15n0 = this.LIZ;
            if (c15n0 != null && (c15n24 = c15n0.LIZ) != null) {
                c15n24.setChangeOrGetVisibility(0);
            }
            C15N0 c15n02 = this.LIZ;
            if (c15n02 != null && (c15n23 = c15n02.LIZ) != null) {
                c15n23.setBrandedContent(TextUtils.equals(str, "2"));
            }
            C634540Oui c634540Oui = this.LIZIZ;
            if (c634540Oui != null) {
                if (!TextUtils.equals("1", "1")) {
                    TextUtils.equals("1", "2");
                }
                c634540Oui.setLabelText("");
            }
        } else {
            C15N0 c15n03 = this.LIZ;
            if (c15n03 != null && (c15n2 = c15n03.LIZ) != null) {
                c15n2.setChangeOrGetVisibility(8);
            }
            C634540Oui c634540Oui2 = this.LIZIZ;
            if (c634540Oui2 != null) {
                c634540Oui2.setLabelText("");
            }
        }
        IPublishPageService iPublishPageServiceLIZLLL = PublishPageImpl.LIZLLL();
        C15N0 c15n04 = this.LIZ;
        if (c15n04 != null && (c15n22 = c15n04.LIZ) != null) {
            iPublishPageServiceLIZLLL.LIZIZ(c15n22.getChangeOrGetVisibility(), c15n22.getProvideRootView());
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIL(boolean z, boolean z2) {
        C19292410dm currentUser;
        if (z && !z2 && (currentUser = o.LJIIZILJ.getCurrentUser()) != null) {
            currentUser.LJIIL();
        }
        C19292410dm currentUser2 = o.LJIIZILJ.getCurrentUser();
        if (currentUser2 != null) {
            return currentUser2.LJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILJJIL(CommerceToolsTcmModel commerceToolsTcmModel, C15N1 c15n1) {
        if (commerceToolsTcmModel != null) {
            int i = 1;
            commerceToolsTcmModel.setTcmOrder(!TextUtils.isEmpty(c15n1.LIZJ));
            commerceToolsTcmModel.setBrandedContentSwitch(c15n1.LIZ);
            commerceToolsTcmModel.setBrandOrganicType(c15n1.LIZIZ);
            commerceToolsTcmModel.setAdsOnlySwitch(c15n1.LJ);
            commerceToolsTcmModel.setAdsAuthorizationSwitch(c15n1.LJFF);
            commerceToolsTcmModel.setTcmCampaignInfo(c15n1.LIZJ);
            commerceToolsTcmModel.setTcmParams(c15n1.LIZLLL);
            commerceToolsTcmModel.setAccountAdSettingsBeOpen(c15n1.LJI);
            if (TextUtils.equals(c15n1.LIZ, "1")) {
                i = 2;
            }
            commerceToolsTcmModel.setTcmPreventSelfSee(i);
            String str = c15n1.LJII;
            if (str != null) {
                commerceToolsTcmModel.setDeliverableId(str);
                commerceToolsTcmModel.setSubmitText(c15n1.LJIIIIZZ);
            } else {
                commerceToolsTcmModel.setDeliverableId(null);
                commerceToolsTcmModel.setSubmitText(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LIZLLL(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AwS610S0100000_31 awS610S0100000_31) {
        if (context == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIIZ = new C340190DVh(context, R.raw.icon_2pt_horn_ltr, Integer.valueOf(R.attr.a1h), 8);
        c1397580mTM.LJFF(2131827272);
        c1397580mTM.LIZ(2131827271);
        C985403tE.LIZ(c1397580mTM, new AwS237S0300000_28(context, commerceToolsTcmModel, awS610S0100000_31, 24));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LLJJIII = false;
        c1397510mTF.LJFF(false);
        c1397510mTF.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJ(C127K c127k, C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        IFoundationAVServiceProxy iFoundationAVServiceProxy;
        CommerceToolsTcmModel tcmModel;
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        C20508815Mw.LIZ.getClass();
        TcmConfig tcmConfigLIZ = C20508815Mw.LIZ();
        if (tcmConfigLIZ == null || !tcmConfigLIZ.getUseBcEntranceInPost() || ((iFoundationAVServiceProxy = (IFoundationAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IFoundationAVServiceProxy.class, false, false, false, 14, null)) != null && iFoundationAVServiceProxy.complianceService() != null && ComplianceServiceProvider.LJIJJ().LJJIIZ())) {
            C786410Ut5.LJLLLLLL(8, c127k);
            return;
        }
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null) {
            tcmModel = commerceToolsModel.getTcmModel();
        } else {
            tcmModel = null;
        }
        if ((c127k instanceof C127K) && c127k != null) {
            C11G4 c11g4 = new C11G4(c127k.getContext(), null);
            c11g4.LJIILL(new ACListenerS95S0300000_31(c19eg, videoPublishEditModel, tcmModel, 4));
            c127k.setAccessory(c11g4);
        }
        BCPageModel bCPageModel = new BCPageModel();
        this.LIZJ = bCPageModel;
        bCPageModel.LL.observe(c19eg, new AObserverS190S0200000_31(this, tcmModel, 10));
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJFF(Context context, C20507315Mh c20507315Mh, C20507415Mi c20507415Mi) {
        if (context == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131849983);
        c1397580mTM.LIZ(2131849982);
        C985403tE.LIZ(c1397580mTM, new AwS397S0200000_31(c20507315Mh, c20507415Mi, 135));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILLIIL(ViewStub viewStub, boolean z, boolean z2) {
        C20508815Mw.LIZ.getClass();
        TcmConfig tcmConfigLIZ = C20508815Mw.LIZ();
        if (tcmConfigLIZ != null && tcmConfigLIZ.getUseBcEntranceInPost()) {
            this.LIZ = new C15N0(viewStub, z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final Object LJIILIIL(Activity activity, AwemeDraft awemeDraft, String str, AbstractC23140094w abstractC23140094w) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        JSONObject jSONObject = new JSONObject(str);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "deliverableId");
        CommerceToolsTcmModel tcmModel = awemeDraft.LIZ.commerceModel.getTcmModel();
        if (awemeDraft.LJJJJIZL.creationMode == 2) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131849986);
            C1390380mHk.LIZ(activity, 6007, creativeToastBuilder);
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        } else {
            String deliverableId = tcmModel.getDeliverableId();
            if (deliverableId != null && !Intrinsics.LJFF(string, deliverableId)) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LJFF(2131849976);
                c1397580mTM.LIZ(2131849975);
                C985403tE.LIZ(c1397580mTM, new AwS103S0400000_5(c23260099m, this, awemeDraft, jSONObject, 17));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            } else {
                LJIJJ(awemeDraft, jSONObject);
                C189200o6.m2constructorimpl(awemeDraft);
                c23260099m.resumeWith(awemeDraft);
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIIIIZZ(Activity activity, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i) {
        C20508915Mx.LIZ(activity, z, commerceToolsTcmModel, z2, "post", i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("user_id", o.LJIIZILJ.getCurrentUserID());
        C20684815ws.LJIILLIIL("ttcm_more_page_click_disclosure", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final Object LIZJ(Fragment fragment, Aweme aweme, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        Drawable drawableLIZ;
        FragmentManager supportFragmentManager;
        if (aweme != null && aweme.getAwemeType() == 150) {
            return C2286608xc.LJ(0);
        }
        C20508815Mw.LIZ.getClass();
        if (!C20508815Mw.LJ()) {
            return C2286608xc.LJ(0);
        }
        if (z3 && (z || z2)) {
            return C2286608xc.LJ(0);
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C770750ULh c770750ULh = new C770750ULh();
        Context context = fragment.getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x_;
            drawableLIZ = c0hti.LIZ(context);
        } else {
            drawableLIZ = null;
        }
        c770750ULh.LIZ = drawableLIZ;
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = C20642515q3.LJI(2131849557);
        c770750ULh.LJFF(new C345890DhD(C20642515q3.LJI(2131849554), false), new C345890DhD(C20642515q3.LJI(2131849555), true), new C345890DhD(C20642515q3.LJI(2131849556), true));
        c770750ULh.LJI(C20642515q3.LJI(2131849558), new AwS238S0300000_29(fragment, aweme, c2252611DEt, 1));
        c770750ULh.LJII(C20642515q3.LJI(2131849559), new AwS608S0100000_29(c2252611DEt, 76));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm = new DialogInterfaceOnCancelListenerC1864700ycm(c2252611DEt, 1);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = dialogInterfaceOnCancelListenerC1864700ycm;
        C19EG activity = fragment.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "showBCSheetOnTagPeople");
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.content.Context r20, boolean r21, boolean r22, boolean r23, java.util.List r24, com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel r25, com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus r26, int r27) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl.LJII(android.content.Context, boolean, boolean, boolean, java.util.List, com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel, com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus, int):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIJ(final Fragment fragment, ViewStub viewStub, final CommerceToolsTcmModel commerceToolsTcmModel, final boolean z, final boolean z2, final boolean z3, final int i, final VideoPublishEditModel videoPublishEditModel) {
        String brandedContentSwitch;
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.fs1);
            viewStub.setInflatedId(R.id.xfw);
            this.LIZIZ = (C634540Oui) C786410Ut5.LJLLLL(viewStub);
            C634540Oui c634540Oui = this.LIZIZ;
            if (c634540Oui != null) {
                C20508815Mw.LIZ.getClass();
                if (!C20508815Mw.LIZJ()) {
                    int visibility = c634540Oui.getVisibility();
                    c634540Oui.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c634540Oui);
                    return;
                }
                int visibility2 = c634540Oui.getVisibility();
                c634540Oui.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c634540Oui);
                String brandedContentSwitch2 = null;
                if (commerceToolsTcmModel != null) {
                    brandedContentSwitch = commerceToolsTcmModel.getBrandedContentSwitch();
                } else {
                    brandedContentSwitch = null;
                }
                if (!TextUtils.equals(brandedContentSwitch, CardStruct.IStatusCode.DEFAULT)) {
                    fragment.getContext();
                    if (commerceToolsTcmModel != null) {
                        brandedContentSwitch2 = commerceToolsTcmModel.getBrandedContentSwitch();
                    }
                    if (!TextUtils.equals(brandedContentSwitch2, "1")) {
                        TextUtils.equals(brandedContentSwitch2, "2");
                    }
                    c634540Oui.setLabelText("");
                } else {
                    c634540Oui.setLabelText("");
                }
                if (z && !C2512109st.LIZ) {
                    c634540Oui.setTitle(2131849971);
                }
                View.OnClickListener fVar = new View.OnClickListener() { // from class: X.15Mv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Activity activityLIZ;
                        String str;
                        C0CHQ.LIZ().LJI().LIZLLL(videoPublishEditModel);
                        Context context = fragment.getContext();
                        if (context != null) {
                            activityLIZ = C1388190mED.LIZ(context);
                        } else {
                            activityLIZ = null;
                        }
                        C20508915Mx.LIZ(activityLIZ, z2, commerceToolsTcmModel, z3, "post", i);
                        C0LAB c0lab = new C0LAB();
                        C20508815Mw.LIZ.getClass();
                        c0lab.LIZ(C20508815Mw.LIZIZ() ? 1 : 0, "is_tcm_creator");
                        c0lab.LJ("user_id", o.LJIIZILJ.getCurrentUserID());
                        if (z) {
                            str = "photo mode";
                        } else {
                            str = "video";
                        }
                        c0lab.LJ("content_type", str);
                        C20684815ws.LJIILLIIL("ttcm_post_page_click_disclosure", c0lab.LIZ);
                    }
                };
                if (C1848410yCV.LIZ) {
                    fVar = new f(fVar);
                }
                a aVar = new a(fVar);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c634540Oui);
                }
                c634540Oui.setOnClickListener(aVar);
                return;
            }
            return;
        }
        this.LIZIZ = (C634540Oui) viewStub.findViewById(R.id.buk);
    }
}
