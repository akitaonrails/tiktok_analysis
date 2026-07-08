package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.C01GW;
import X.C1192504lX;
import X.C20546415aY;
import X.C20546515aZ;
import X.C20684815ws;
import X.C386801es;
import X.C452501pT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS575S0100000_31;
import realtimefeedback.IRealtimeFeedbackService;

/* JADX INFO: loaded from: classes32.dex */
public final class RealtimeFeedbackService implements IRealtimeFeedbackService {
    public final Map<String, Integer> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public RealtimeFeedbackInterceptor LJ;
    public boolean LJFF;

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final int LJ() {
        Integer num;
        C20546515aZ.LIZ.getClass();
        RealtimeFeedbackModel realtimeFeedbackModel = (RealtimeFeedbackModel) SettingsManager.LIZLLL().LJIIIIZZ("realtime_feedback_setting_v2", RealtimeFeedbackModel.class, C20546515aZ.LIZIZ);
        if (realtimeFeedbackModel == null || (num = realtimeFeedbackModel.maxDays) == null) {
            return 3;
        }
        return num.intValue();
    }

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final void clearAll() {
        ((Keva) this.LIZIZ.getValue()).clear();
        ((LinkedHashMap) this.LIZ).clear();
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }

    public RealtimeFeedbackService() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1192504lX());
        this.LIZIZ = c01gwLIZIZ;
        this.LIZJ = ((Keva) c01gwLIZIZ.getValue()).getInt("total_impr_count", 0);
        this.LIZLLL = ((Keva) c01gwLIZIZ.getValue()).getInt("total_impr_count", 0);
        this.LJFF = true;
    }

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final int LIZIZ(String str) {
        int iIntValue;
        if (str == null) {
            return this.LIZLLL;
        }
        Integer num = (Integer) ((LinkedHashMap) this.LIZ).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = C386801es.DEFAULT;
        }
        return this.LIZJ + iIntValue;
    }

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final int LIZJ(String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LIZ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return C386801es.DEFAULT;
    }

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final void LIZLLL(String str) {
        if (str == null || this.LIZLLL == Integer.MAX_VALUE || this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, Integer.valueOf(this.LIZ.size()));
        this.LIZLLL++;
        ((Keva) this.LIZIZ.getValue()).storeInt("total_impr_count", this.LIZLLL);
    }

    @Override // realtimefeedback.IRealtimeFeedbackService
    public final void LIZ(boolean z, boolean z2) {
        RealtimeFeedbackInterceptor realtimeFeedbackInterceptor;
        RealtimeFeedbackModel realtimeFeedbackModel;
        Integer num;
        if (z) {
            new C20546415aY().LIZIZ.clear();
            ((IRealtimeFeedbackService) ServiceManager.get().getService(IRealtimeFeedbackService.class)).clearAll();
            RealtimeFeedbackInterceptor.LIZ.getClass();
            RealtimeFeedbackInterceptor.LIZIZ = false;
        }
        if (z2) {
            RealtimeFeedbackInterceptor realtimeFeedbackInterceptor2 = this.LJ;
            if (realtimeFeedbackInterceptor2 != null) {
                C20684815ws.LJIJJLI(realtimeFeedbackInterceptor2);
                this.LJFF = true;
            }
            new C20546415aY().LIZIZ.storeBoolean("is_new_user_key", false);
        }
        C20546415aY c20546415aY = new C20546415aY(z);
        if (((Boolean) c20546415aY.LIZLLL.getValue()).booleanValue() && !c20546415aY.LIZIZ.getBoolean("new_user_over_hundred_videos", false) && !c20546415aY.LIZIZ.getBoolean("kill_switch", false) && (realtimeFeedbackModel = c20546415aY.LIZJ) != null && (num = realtimeFeedbackModel.shouldUpload) != null && num.intValue() == 1) {
            realtimeFeedbackInterceptor = RealtimeFeedbackInterceptor.LIZ;
        } else {
            realtimeFeedbackInterceptor = null;
        }
        this.LJ = realtimeFeedbackInterceptor;
        if (realtimeFeedbackInterceptor != null) {
            RealtimeFeedbackInterceptor.LJ = new AwS575S0100000_31(this, 930);
            if (this.LJFF) {
                C20684815ws.LIZ(realtimeFeedbackInterceptor);
                this.LJFF = false;
            }
        }
    }
}
