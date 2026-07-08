package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CPH;
import X.C0VZ0;
import X.C0XPR;
import X.C0XPT;
import X.C1440005kM;
import X.C746350TPl;
import X.C786410Ut5;
import X.C799900VZk;
import X.C828030We1;
import X.C828040We2;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ACallableS245S0200000_13;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class InitServiceSettingTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitServiceSettingTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().initServiceSettingTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIIIZ();
            ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIIIIZZ(jSONObject.optJSONObject("user_badge_click_settings"));
            if (jSONObjectOptJSONObject != null) {
                boolean z = true;
                if (jSONObjectOptJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                C828030We1.LIZ = z;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("aweme_activity_setting");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    FestivalEntity festivalEntity = (FestivalEntity) new Gson().LJII(C786410Ut5.J3(jSONObjectOptJSONObject2), FestivalEntity.class);
                    if (festivalEntity != null) {
                        C828040We2.LIZIZ = festivalEntity;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C746350TPl.LIZ.LJ().LJ(C786410Ut5.J3(jSONObjectOptJSONObject2));
                C1440005kM.LIZ(new IEvent() { // from class: X.0We0
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
                return;
            }
            C746350TPl.LIZ.LJ().LJ("");
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new FetchTTSettingTask(Api.LIZ));
        c0cph.LIZIZ();
        C0XPR c0xpr = C0XPR.LIZ;
        C0XPT c0xpt = new C0XPT() { // from class: X.0Wdz
            @Override // X.C0XPT
            public final void onFailed(Throwable th) {
            }

            @Override // X.C0XPT
            public final void LIZIZ(JSONObject jSONObject) {
                C826860Wc8 c826860Wc8;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "is_async_setting", true, true)) {
                    C15O7.LIZIZ(new ACallableS245S0200000_13(this.LIZ, jSONObject, 11), C823050WQl.LIZLLL(), null);
                    return;
                }
                if (!C2206241BWk.LIZJ() && (c826860Wc8 = C826860Wc8.LIZIZ) != null) {
                    c826860Wc8.LIZ(jSONObject);
                }
                this.LIZ.getClass();
                InitServiceSettingTask.LIZ(jSONObject);
            }
        };
        c0xpr.getClass();
        C0XPR.LJ(c0xpt);
    }
}
