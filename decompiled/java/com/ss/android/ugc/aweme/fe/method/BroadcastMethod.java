package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1038820d8i;
import X.C1388190mED;
import X.C1440005kM;
import X.C1479605qk;
import X.C1537820q7Y;
import X.C1ER1;
import X.C2277881EDy;
import X.C484220Iyq;
import X.EnumC1254690ikt;
import X.InterfaceC1028200cra;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class BroadcastMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BroadcastMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        try {
            Context baseContext = this.mContextRef.get();
            while (true) {
                if (baseContext != null) {
                    Activity activityLIZ = C1388190mED.LIZ(baseContext);
                    if (activityLIZ == null) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    } else {
                        baseContext = activityLIZ;
                        break;
                    }
                } else {
                    baseContext = null;
                    break;
                }
            }
            LIZ(baseContext, jSONObject, this.LLILLJJLI, null);
            interfaceC1041760dDS.onSuccess("");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1041760dDS.LIZ(-1, "");
        }
    }

    public static void LIZ(Context context, JSONObject jSONObject, IESJsBridge iESJsBridge, InterfaceC1028200cra interfaceC1028200cra) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        String string;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        C1440005kM.LIZ(new C484220Iyq(jSONObject));
        C1440005kM.LIZ(new C1038820d8i(jSONObject));
        C1440005kM.LIZ(new IEvent() { // from class: X.0btE
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        C0XQ7.LIZLLL().notifyFromRnAndH5(jSONObject);
        C1ER1.LIZIZ.notifyFromRnAndH5(jSONObject);
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).notifyFromRnAndH5(jSONObject);
        C1537820q7Y.LIZ("notification", jSONObject);
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "activity_view")) {
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            c2277881EDy.updateFirstTimeInCouponKeva(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"));
            c2277881EDy.setShownBubbleInCouponKeva(false);
            c2277881EDy.setShownBarInCouponKeva(false);
            c2277881EDy.setShownStarInCouponKeva(false);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "music_feedback_send_success")) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0On3
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "onBcAdBeforeSave") && (jSONObjectOptJSONObject6 = jSONObject.optJSONObject("data")) != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).commerceToolsService().handleReceptionByEvent(jSONObjectOptJSONObject6, context);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "onBcAdAfterSave") && (jSONObjectOptJSONObject5 = jSONObject.optJSONObject("data")) != null) {
            ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LIZ(jSONObjectOptJSONObject5);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "appeal_status_change") && (jSONObjectOptJSONObject4 = jSONObject.optJSONObject("data")) != null) {
            ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIILLIIL(jSONObjectOptJSONObject4);
        }
        if ((TextUtils.equals(jSONObject.optString("eventName"), "notify_kyc_status_refresh") || TextUtils.equals(jSONObject.optString("eventName"), "notify_kyc_id_verification_popup") || TextUtils.equals(jSONObject.optString("eventName"), "affiliate_tos_page_close") || TextUtils.equals(jSONObject.optString("eventName"), "affiliate_self_apply_page_close")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
            ((IECommerceLiveBridgeService) ServiceManager.get().getService(IECommerceLiveBridgeService.class)).LIZIZ(jSONObject.optString("eventName"), jSONObjectOptJSONObject);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "bc_pop_music_alert")) {
            ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIIZILJ(context, iESJsBridge, interfaceC1028200cra);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "userBlockSuccess")) {
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject7 != null) {
                string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject7, "uid");
            } else {
                string = null;
            }
            C1440005kM.LIZ(new C1479605qk(string));
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "_dou_ad_create_tcm_order")) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            ((IProfileService) ServiceManager.get().getService(IProfileService.class)).queryUser(((IProfileService) ServiceManager.get().getService(IProfileService.class)).userUrl(curUser.getSecUid(), curUser.getUid(), curUser.getUniqueId(), 0, EnumC1254690ikt.PROFILE_JSB), true, "");
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "live-link-pin") || TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "live-link-card")) {
            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIILIIL(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "leadsGenStatusChangeNotification")) {
            GetLeadsAnchorService.LJ().LIZIZ(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "enterGetLeadsPageNotification")) {
            GetLeadsAnchorService.LJ().LIZLLL(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "closeLeadForm")) {
            GetLeadsAnchorService.LJ().LIZJ(5);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "BALiveLeadsGenEvent")) {
            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LIZ(jSONObject);
        }
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "BALiveLeadsGenPinActionEvent")) {
            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIILLIIL(jSONObject);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "feelgood-submit-result") && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data")) != null) {
            BASwitchToPAorBAServiceImpl.LIZLLL().LIZJ(jSONObjectOptJSONObject3);
            ComplianceServiceProvider.LJIILIIL().LJFF(jSONObjectOptJSONObject3);
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "feelgood-close") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data")) != null) {
            ComplianceServiceProvider.LJIILIIL().LJJII(jSONObjectOptJSONObject2);
        }
    }
}
