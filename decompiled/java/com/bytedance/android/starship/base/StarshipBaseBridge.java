package com.bytedance.android.starship.base;

import X.AnonymousClass1455;
import X.C0CW0;
import X.C1510050pOl;
import X.C18045074x;
import X.C786410Ut5;
import X.C844470XAv;
import Y.AObjectS121S0000000_20;
import com.bytedance.android.starship.StarshipBridge;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS258S0000000_20;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class StarshipBaseBridge implements IStarshipBaseBridge {
    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final Integer LIZLLL() {
        return Integer.valueOf(((Number) C18045074x.LIZ.getValue()).intValue());
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final String LJFF() {
        JSONObject jSONObject;
        PitayaExperiment.Config config = PitayaExperiment.LIZ;
        JSONObject jSONObjectOptJSONObject = PitayaExperiment.LIZIZ.optJSONObject("pitaya_global");
        if (jSONObjectOptJSONObject == null || (jSONObject = jSONObjectOptJSONObject.optJSONObject("fast_engine_settings")) == null) {
            jSONObject = new JSONObject();
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final void LIZ(final AFwS258S0000000_20 aFwS258S0000000_20) {
        C844470XAv.LIZ.getClass();
        if (PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).isReady()) {
            aFwS258S0000000_20.invoke(Boolean.TRUE);
        } else {
            PreHostSetupWatcher.INSTANCE.registerListener(new PreHostSetupListener() { // from class: com.bytedance.android.starship.base.StarshipBaseBridge$registerPitayaReady$1
                @Override // com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener
                public void onPreHostSetup(boolean z) {
                    C844470XAv.LIZ.getClass();
                    if (PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).isReady()) {
                        aFwS258S0000000_20.invoke(Boolean.TRUE);
                        return;
                    }
                    HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
                    final Function1<Boolean, Unit> function1 = aFwS258S0000000_20;
                    hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.bytedance.android.starship.base.StarshipBaseBridge$registerPitayaReady$1$onPreHostSetup$1
                        @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                        public void onHostSetup(boolean z2) {
                            function1.invoke(Boolean.valueOf(z2));
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final void LJ(AObjectS121S0000000_20 aObjectS121S0000000_20) {
        synchronized (C0CW0.LIZ) {
            if (C0CW0.LIZIZ != null) {
                return;
            }
            C0CW0.LIZIZ = aObjectS121S0000000_20;
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null) {
                iLiveOuterService.i3(C0CW0.LIZLLL);
            }
        }
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final boolean initPitaya(String str) {
        return AnonymousClass1455.LIZ.LIZLLL(str, null, null);
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final void LIZIZ(final String str, final long j) {
        if (str == null) {
            return;
        }
        FeatureProducer featureProducer = new FeatureProducer(str, j) { // from class: X.0k94
            public final long LIZIZ;
            public String LIZJ;

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final String getProducerName() {
                return this.LIZJ;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final void setProducerName(String str2) {
                this.LIZJ = str2;
            }

            {
                this.LIZIZ = j;
                this.LIZJ = str;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final Object getFeatureInternal(String str2, JSONObject jSONObject, String str3, ReturnCode returnCode) {
                try {
                    return StarshipBridge.Companion.onGetFeatureData(this.LIZIZ, str2, String.valueOf(jSONObject));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        };
        FeatureServiceManager.Companion.getClass();
        if (FeatureServiceManager.containProducer$default(C1510050pOl.LIZ(), str, 0, 2, null)) {
            FeatureServiceManager.removeProducer$default(C1510050pOl.LIZ(), str, 0, 2, null);
        }
        FeatureServiceManager.addProducer$default(C1510050pOl.LIZ(), str, featureProducer, 0, 4, null);
    }

    @Override // com.bytedance.android.starship.base.IStarshipBaseBridge
    public final Object LIZJ(String str, String str2, String str3, String str4) {
        String str5 = str3;
        String str6 = str4;
        if (str == null || str2 == null) {
            return null;
        }
        if (str6 == null) {
            str6 = "starship";
        }
        if (str5 == null) {
            str5 = "{}";
        }
        try {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), str, 0, 2, null);
            if (producer$default == null) {
                return null;
            }
            return FeatureProducer.getFeature$default(producer$default, str2, str5, str6, (ReturnCode) null, 8, (Object) null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
