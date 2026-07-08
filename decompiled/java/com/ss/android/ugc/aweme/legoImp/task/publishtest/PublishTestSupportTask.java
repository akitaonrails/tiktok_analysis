package com.ss.android.ugc.aweme.legoImp.task.publishtest;

import X.C04TD;
import X.C0C64;
import X.C0CCZ;
import X.C0VSJ;
import X.C0VSP;
import X.C0VZ0;
import X.C11S5;
import X.C1552050qUV;
import X.C1701940uOG;
import X.C1C7U;
import X.C2105608Ms;
import X.C291680Bby;
import X.C596970NbD;
import X.C786410Ut5;
import X.C805380Via;
import X.C810380Vqe;
import X.C823670WSv;
import X.C844470XAv;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC596980NbE;
import X.InterfaceC823630WSr;
import Y.AfS136S0000000_13;
import Y.AfS149S0200000_13;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService;
import java.io.FileNotFoundException;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PublishTestSupportTask implements C0CCZ {
    public IPublishDrillService LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PublishTestSupportTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static void LIZ(Context context) {
        boolean zLIZ = C291680Bby.LIZ();
        boolean z = C810380Vqe.LIZIZ.LIZ().getBoolean("trigger_launch_protect_drill_crash", false);
        if (zLIZ && z) {
            RuntimeException runtimeException = new RuntimeException("LaunchProtectDrillTest");
            C805380Via.LJFF("LaunchProtectException", "LaunchProtectDrill", runtimeException);
            if (C823670WSv.LIZ == null) {
                C823670WSv.LIZ = context;
            }
            C823670WSv.LIZLLL = true;
            C823670WSv.LIZIZ(C823670WSv.LIZ, runtimeException.toString(), false);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        IPublishDrillService publishDrillServiceImpl;
        IPublishDrillService iPublishDrillService;
        IPublishDrillService iPublishDrillService2;
        String strLIZ;
        IPublishDrillService iPublishDrillService3;
        Object objLIZ = C04TD.LIZ(IPublishDrillService.class, false);
        if (objLIZ != null) {
            publishDrillServiceImpl = (IPublishDrillService) objLIZ;
        } else {
            publishDrillServiceImpl = new PublishDrillServiceImpl();
        }
        this.LL = publishDrillServiceImpl;
        PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig = (PublishTestSupportSetting$PublishTestSupportConfig) SettingsManager.LIZLLL().LJIIIIZZ("publish_support_test2", PublishTestSupportSetting$PublishTestSupportConfig.class, null);
        IPublishDrillService iPublishDrillService4 = this.LL;
        if (iPublishDrillService4 != null) {
            iPublishDrillService4.LIZ(context, publishTestSupportSetting$PublishTestSupportConfig);
        }
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "TCE_publish_test", true, false)) {
                ((InterfaceC823630WSr) PublishTestSupportTCEApi.LIZ.getValue()).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS149S0200000_13(context, this, 13), new AfS136S0000000_13(1));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ByteSync_publish_test", true, false)) {
                C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.DRILL_PRACTICE_SYNC_ONLINE, new InterfaceC596980NbE() { // from class: X.0WSs
                    @Override // X.InterfaceC596980NbE
                    public final void LJ(C1525630pnt c1525630pnt) {
                        PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig2;
                        IPublishDrillService iPublishDrillService5;
                        try {
                            byte[] bArr = c1525630pnt.LIZ;
                            if (bArr != null && (publishTestSupportSetting$PublishTestSupportConfig2 = (PublishTestSupportSetting$PublishTestSupportConfig) C08JS.LIZ(new String(bArr), PublishTestSupportSetting$PublishTestSupportConfig.class)) != null && (iPublishDrillService5 = this.LLILLJJLI.LL) != null) {
                                iPublishDrillService5.LIZ(context, publishTestSupportSetting$PublishTestSupportConfig2);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            LIZ(context);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        Object objLJJII = C0C64.LJIILLIIL().LJJII(PublishTestSupportSetting$PublishTestSupportConfig.class, null, "publish_support_test_config_center", true);
        IPublishDrillService iPublishDrillService5 = this.LL;
        if (iPublishDrillService5 != null && (objLJJII instanceof PublishTestSupportSetting$PublishTestSupportConfig)) {
            iPublishDrillService5.LIZ(context, (PublishTestSupportSetting$PublishTestSupportConfig) objLJJII);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "libra_publish_test", true, false)) {
            C805380Via.LJ("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
        }
        try {
            String strLJ = C1552050qUV.LJ("5f9b53de0fe2c2204e38dad97cd75bf6", "only");
            if (strLJ != null) {
                try {
                    strLIZ = C2105608Ms.LIZ(new C0VSP(new C0VSJ(strLJ.concat("/gecko_publish_test.json"))));
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZ = null;
                }
                if (!TextUtils.isEmpty(strLIZ) && (iPublishDrillService3 = this.LL) != null) {
                    iPublishDrillService3.LIZIZ(context, strLIZ);
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        try {
            Object objInvoke = Class.forName("com.ss.android.ugc.aweme.publish_test.PluginPublishTest").getMethod("report", Context.class).invoke(null, context);
            if (objInvoke != null && (objInvoke instanceof String) && (iPublishDrillService2 = this.LL) != null) {
                iPublishDrillService2.LIZIZ(context, (String) objInvoke);
            }
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
        }
        HotFixTest.init();
        String configJson = HotFixTest.getConfigJson();
        if (!TextUtils.isEmpty(configJson) && (iPublishDrillService = this.LL) != null) {
            iPublishDrillService.LIZIZ(context, configJson);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("safe_cushion_test", false)) {
            try {
                C1C7U.LIZ("PublishTestSupportTask@9b60.safeCushionPublishTest$1L");
                GsonProtectorUtils.toJson(new Gson(), Activity.class);
                C1C7U.LIZIZ("PublishTestSupportTask@9b60.safeCushionPublishTest$1L");
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                C805380Via.LJ("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", th6);
            }
        }
        C844470XAv.LIZ.getClass();
        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).registerApplogRunEventCallback("tiktok_drill_test", new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishTestSupportTask.2
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                IPublishDrillService iPublishDrillService6;
                if (!z || pTYTaskData == null || (params = pTYTaskData.getParams()) == null) {
                    return;
                }
                String strJ3 = C786410Ut5.J3(params);
                if (!TextUtils.isEmpty(strJ3) && (iPublishDrillService6 = PublishTestSupportTask.this.LL) != null) {
                    iPublishDrillService6.LIZIZ(context, strJ3);
                }
            }
        });
    }
}
