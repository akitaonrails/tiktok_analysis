package com.ss.android.ugc.aweme.pipo.init;

import X.C1062300dka;
import X.C10UI;
import X.C1530670pw1;
import X.C1530710pw5;
import X.C1713870uhV;
import X.C1723710uxN;
import X.C1723960uxm;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C290830Bab;
import X.C786410Ut5;
import X.InterfaceC829930Wh5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.base.PipoEventService;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig;
import com.ss.android.ugc.aweme.pipo.payments.ab.EcomPipoBraintreeSdkConfigModel;
import com.ss.android.ugc.tiktok.pipo.saas.core.init.IPipoBusinessInitService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS40S0000100_26;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class PiPOGeneralInitService implements IPipoBusinessInitService {
    /* JADX WARN: Type inference failed for: r0v63, types: [X.0Wh5, X.0pw3] */
    @Override // com.ss.android.ugc.tiktok.pipo.saas.core.init.IPipoBusinessInitService
    public final void init() throws JSONException {
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJII();
        ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).init();
        C1530670pw1 c1530670pw1 = C1530670pw1.LIZ;
        PipoContainerSspConfig pipoContainerSspConfigLIZ = C1530710pw5.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init called: registered=");
        sbLIZ.append(C1530670pw1.LJFF != null);
        sbLIZ.append(", registering=");
        sbLIZ.append(C1530670pw1.LIZIZ.get());
        sbLIZ.append(", pending=");
        sbLIZ.append(C1530670pw1.LIZJ.get());
        sbLIZ.append(", hasListener=");
        sbLIZ.append(C1530670pw1.LJI != null);
        sbLIZ.append(", ttmInitFinished=");
        AtomicBoolean atomicBoolean = C1530670pw1.LIZLLL;
        sbLIZ.append(atomicBoolean.get());
        sbLIZ.append(", postInitRegisterFailureCount=");
        AtomicInteger atomicInteger = C1530670pw1.LJ;
        sbLIZ.append(atomicInteger.get());
        sbLIZ.append(", enabled=");
        sbLIZ.append(pipoContainerSspConfigLIZ.getEnabled());
        sbLIZ.append(", prewarmTriggersEnabled=");
        sbLIZ.append(pipoContainerSspConfigLIZ.getPrewarmTriggersEnabled());
        C2188811AlT.LIZIZ(sbLIZ);
        if (pipoContainerSspConfigLIZ.getEnabled() && pipoContainerSspConfigLIZ.getPrewarmTriggersEnabled() && C1530670pw1.LJFF == null && (!atomicBoolean.get() || atomicInteger.get() < 1)) {
            if (C1530670pw1.LJI == null) {
                synchronized (c1530670pw1) {
                    try {
                        if (C1530670pw1.LJI == null) {
                            ?? r0 = new InterfaceC829930Wh5() { // from class: X.0pw3
                                @Override // X.InterfaceC829930Wh5
                                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                                    boolean z;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("ttm state changed: state=");
                                    sbLIZ2.append(enumC829940Wh6);
                                    sbLIZ2.append(", registered=");
                                    if (C1530670pw1.LJFF != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    sbLIZ2.append(z);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                                        C1530670pw1.LIZLLL.set(true);
                                        if (C1530670pw1.LJFF == null) {
                                            C1530670pw1.LIZ();
                                        }
                                    }
                                }
                            };
                            C1530670pw1.LJI = r0;
                            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(r0);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C1530670pw1.LIZ();
        }
        if (C290830Bab.LIZ()) {
            try {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0uhZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PiPOGeneralInitService@fa25.init$1");
                        try {
                            PipoEventService.LIZJ().LIZIZ();
                        } finally {
                            try {
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                        }
                        C1C7U.LIZIZ("PiPOGeneralInitService@fa25.init$1");
                    }
                });
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
        }
        try {
            C1062300dka.LIZLLL(C1723960uxm.class, null, null, 6);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C1AF0.LJ(th3);
        }
        ((IPIPOCashierService) ServiceManager.get().getService(IPIPOCashierService.class)).initialize();
        if (!C10UI.LIZ()) {
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIILLIIL();
        }
        if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI()) {
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPipoBraintreeSdkConfigModel ecomPipoBraintreeSdkConfigModel = C1723710uxN.LIZ;
        EcomPipoBraintreeSdkConfigModel ecomPipoBraintreeSdkConfigModel2 = (EcomPipoBraintreeSdkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_pipo_braintree_sdk_config", EcomPipoBraintreeSdkConfigModel.class, ecomPipoBraintreeSdkConfigModel);
        if (ecomPipoBraintreeSdkConfigModel2 != null) {
            ecomPipoBraintreeSdkConfigModel = ecomPipoBraintreeSdkConfigModel2;
        }
        if (ecomPipoBraintreeSdkConfigModel.enablePreload) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1713870uhV.LIZ("rd_pipo_payment_df_download_start", C2097608Jq.LJIIIIZZ(new Pair("source_id", "init_task"), new Pair("download_scene", "initTask")));
            if (C10UI.LIZ()) {
                return;
            }
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIILJJIL(new AwS40S0000100_26(jCurrentTimeMillis, 2));
        }
    }
}
