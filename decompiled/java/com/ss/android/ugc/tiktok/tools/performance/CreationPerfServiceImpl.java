package com.ss.android.ugc.tiktok.tools.performance;

import X.C0M1V;
import X.InterfaceC1450850nrH;
import X.InterfaceC1453270nvB;
import X.InterfaceC1655410tBD;
import X.InterfaceC1655560tBS;
import X.InterfaceC1655590tBV;
import X.InterfaceC1658920tGs;
import X.InterfaceC573160Mdu;
import X.InterfaceC855250Xgp;
import Y.ARunnableS83S0000000_3;
import aho.b;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lego.wrapper.ITaskExecutorApi;
import com.ss.android.ugc.aweme.services.IAutoAdjustVolumeService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.optimization.IAlbumPlusClickPreloadService;
import com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.CreationAutoVolumeAdjustmentOpt;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.IsOpenAndCostTimeConfig;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.StudioRunnableBlockConfig;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.VESoMigrateNewBootFinishTaskConfig;
import com.ss.android.ugc.tiktok.tools.performance.services.CreationContextServiceImpl;
import com.ss.android.ugc.tiktok.tools.performance.services.UtilServiceImpl;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS604S0100000_25;
import org.json.JSONObject;
import pgo.c0;
import pgo.z1;

/* JADX INFO: loaded from: classes36.dex */
public final class CreationPerfServiceImpl implements ICreationPerfService {
    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1450850nrH LIZ() {
        return UtilServiceImpl.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC573160Mdu LIZIZ() {
        return b.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1655590tBV LIZJ() {
        return new InterfaceC1655590tBV() { // from class: X.1DRY
            @Override // X.InterfaceC1655590tBV
            public final void LIZIZ() {
                IAlbumPlusClickPreloadService iAlbumPlusClickPreloadService;
                b bVar = b.LIZ;
                C2255801DRa c2255801DRa = C2255801DRa.LIZIZ;
                bVar.LIZ(c2255801DRa);
                z1.LIZ.getClass();
                C2184311AeD.LIZ(c2255801DRa, (StudioRunnableBlockConfig) z1.LIZJ.getValue());
                c0.LIZ.getClass();
                C01GW c01gw = c0.LIZJ;
                if (((IsOpenAndCostTimeConfig) c01gw.getValue()).isOpen) {
                    int i = ((IsOpenAndCostTimeConfig) c01gw.getValue()).costTime;
                    if (i < 0) {
                        i = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InhibitLogInPhotoFirstFrame time = ");
                    sbLIZ.append(i);
                    C201955140j.LIZIZ("LightRecordServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                    C2187451AjH.LJII(i, true);
                }
                if (!((Boolean) C300020BpQ.LIZ.getValue()).booleanValue() || (iAlbumPlusClickPreloadService = (IAlbumPlusClickPreloadService) PluggableExtentionKt.pluggableSpi$default(IAlbumPlusClickPreloadService.class, false, false, false, 14, null)) == null) {
                    return;
                }
                iAlbumPlusClickPreloadService.preloadCreateTabCelebrationOnPlusClick();
            }

            @Override // X.InterfaceC1655590tBV
            public final void onDestroyView() {
                C1449450np1.LIZIZ.remove("click_plus_btn_shoot");
            }

            @Override // X.InterfaceC1655590tBV
            public final void onEnterAnimationComplete() {
                C2184901AfA c2184901AfA;
                C1449450np1.LIZIZ.remove("click_plus_btn_shoot");
                b bVar = b.LIZ;
                b.LIZIZ(C2255801DRa.LIZIZ, false);
                if (C2184311AeD.LIZ && (c2184901AfA = C2184311AeD.LIZIZ) != null) {
                    C1BCA.LJJIIZI(c2184901AfA);
                }
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                    C14KR.LIZLLL = false;
                }
            }

            @Override // X.InterfaceC1655590tBV
            public final void LIZ() {
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                }
            }

            @Override // X.InterfaceC1655590tBV
            public final void LIZJ() {
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                    C14KR.LIZLLL = true;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1655410tBD LIZLLL() {
        return new InterfaceC1655410tBD() { // from class: X.0WXb
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(423));

            @Override // X.InterfaceC1655410tBD
            public final InterfaceC20685415wy LIZ() {
                return (InterfaceC20685415wy) LIZIZ.getValue();
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final C0M1V LJ() {
        return new C0M1V() { // from class: X.0MUI
            @Override // X.C0M1V
            public final void LIZ() {
                if (C0BP1.LIZ()) {
                    C0MUH.LIZ.LIZ(true);
                }
            }

            @Override // X.C0M1V
            public final void LIZIZ() {
                if (C0BP1.LIZ()) {
                    C0MUH.LIZ.LIZ(true);
                }
            }

            @Override // X.C0M1V
            public final void LIZJ() {
                if (C0BP1.LIZ()) {
                    C0MUH.LIZ.LIZ(true);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1658920tGs LJFF() {
        return new InterfaceC1658920tGs() { // from class: X.0tGv
            public static boolean LIZIZ;
            public static float LIZJ;
            public static int LIZLLL;
            public static boolean LJ;

            @Override // X.InterfaceC1658920tGs
            public final void LIZ() {
                C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("restoreAutoVolumeToDefault, hasBeenAdjusted: ");
                sbLIZ.append(LIZIZ);
                sbLIZ.append(", userHasManuallyAdjusted: ");
                sbLIZ.append(LJ);
                sbLIZ.append(",  originalVolumeLevel: ");
                sbLIZ.append(LIZJ);
                C201955140j.LIZLLL(c20102213l6, "CreationAutoVolumeAdjustment", C2188811AlT.LIZIZ(sbLIZ));
                if (!LIZIZ || LJ) {
                    LIZIZ = false;
                    LJ = false;
                    LIZJ = 0.0f;
                    LIZLLL = 0;
                    return;
                }
                C844470XAv.LIZ.getClass();
                if (C2179771ASp.LJII(C844470XAv.LIZ()) == LIZLLL) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setMusicVolume to originalVolumeLevel: ");
                    sbLIZ2.append(LIZJ);
                    C201955140j.LIZLLL(c20102213l6, "CreationAutoVolumeAdjustment", C2188811AlT.LIZIZ(sbLIZ2));
                    Context contextLIZ = C844470XAv.LIZ();
                    int iLJFF = (int) (LIZJ * C2179771ASp.LJFF(contextLIZ));
                    if (!C2179771ASp.LJIIJJI(contextLIZ)) {
                        try {
                            C2179771ASp.LIZ.setStreamVolume(3, iLJFF, 8);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CrashlyticsWrapperService.LIZLLL().logException(e);
                        }
                    }
                }
                LIZIZ = false;
                LJ = false;
                LIZJ = 0.0f;
                LIZLLL = 0;
            }

            @Override // X.InterfaceC1658920tGs
            public final void LIZIZ() {
                C201955140j.LIZLLL(C20102213l6.LIZIZ, "CreationAutoVolumeAdjustment", "onUserManualVolumeAdjustment");
                LJ = true;
            }

            @Override // X.InterfaceC1658920tGs
            public final void LIZJ(AwS604S0100000_25 awS604S0100000_25) {
                boolean z;
                boolean z2;
                List<Float> list;
                if (!LIZIZ) {
                    IAutoAdjustVolumeService iAutoAdjustVolumeService = (IAutoAdjustVolumeService) PluggableExtentionKt.pluggableSpi$default(IAutoAdjustVolumeService.class, false, false, false, 14, null);
                    if (iAutoAdjustVolumeService != null && iAutoAdjustVolumeService.isGlobalMuteMode()) {
                        return;
                    }
                    float fLJIIIIZZ = (float) C2179771ASp.LJIIIIZZ();
                    LIZJ = fLJIIIIZZ;
                    if (fLJIIIIZZ == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C201955140j.LIZLLL(C20102213l6.LIZIZ, "CreationAutoVolumeAdjustment", "originalVolumeLevel == 0f, no need to adjust");
                        return;
                    }
                    int iLIZLLL = C2179771ASp.LIZLLL();
                    if (iLIZLLL != 4 && iLIZLLL != 5 && iLIZLLL != 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    float fLIZLLL = LIZJ;
                    if (z2) {
                        list = ((CreationAutoVolumeAdjustmentOpt.AutoVolumeAdjustmentConfig) CreationAutoVolumeAdjustmentOpt.LIZIZ.getValue()).volumeWithEarphone;
                    } else {
                        list = ((CreationAutoVolumeAdjustmentOpt.AutoVolumeAdjustmentConfig) CreationAutoVolumeAdjustmentOpt.LIZIZ.getValue()).volumeWithoutEarphone;
                    }
                    int iMin = Math.min((int) (10 * fLIZLLL), 9);
                    if (iMin >= 0 && iMin < list.size()) {
                        float fFloatValue = ((Number) ListProtector.get(list, iMin)).floatValue();
                        if (fFloatValue != 0.0f) {
                            fLIZLLL = C13LZ.LIZLLL(fLIZLLL + fFloatValue, 0.0f, 1.0f);
                        }
                    }
                    if (fLIZLLL != LIZJ) {
                        C844470XAv.LIZ.getClass();
                        int iLJFF = (int) (C2179771ASp.LJFF(C844470XAv.LIZ()) * fLIZLLL);
                        if (!C2179771ASp.LJIIJJI(C844470XAv.LIZ())) {
                            try {
                                C2179771ASp.LIZ.setStreamVolume(3, iLJFF, 8);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                CrashlyticsWrapperService.LIZLLL().logException(e);
                            }
                        }
                        LIZLLL = iLJFF;
                        LIZIZ = true;
                    }
                    C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startAutoVolumeAdjustment, isAdjusted: ");
                    sbLIZ.append(LIZIZ);
                    sbLIZ.append(", beforeVolumeLevel: ");
                    sbLIZ.append(LIZJ);
                    sbLIZ.append(", afterVolumeLevel: ");
                    sbLIZ.append(fLIZLLL);
                    C201955140j.LIZLLL(c20102213l6, "CreationAutoVolumeAdjustment", C2188811AlT.LIZIZ(sbLIZ));
                    awS604S0100000_25.invoke(new C1658930tGt(LIZJ, fLIZLLL, LIZIZ, z2));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1453270nvB editService() {
        return new InterfaceC1453270nvB() { // from class: X.1DRc
            @Override // X.InterfaceC1453270nvB
            public final void LJII() {
                b bVar = b.LIZ;
                b.LIZIZ(C1662150tM5.LIZIZ, false);
            }

            @Override // X.InterfaceC1453270nvB
            public final void onCreate() {
                b.LIZ.LIZ(C1662150tM5.LIZIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC855250Xgp publishService() {
        return new InterfaceC855250Xgp() { // from class: X.1DRd
            @Override // X.InterfaceC855250Xgp
            public final void LJII() {
                b bVar = b.LIZ;
                b.LIZIZ(C1453590nvh.LIZIZ, false);
            }

            @Override // X.InterfaceC855250Xgp
            public final void onCreate() {
                b.LIZ.LIZ(C1453590nvh.LIZIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService
    public final InterfaceC1655560tBS recordService() {
        return new InterfaceC1655560tBS() { // from class: X.1DRX
            @Override // X.InterfaceC1655560tBS
            public final void LJ() {
                C2345409Gy.LIZ = false;
                C791460V2y.LIZ = false;
                if (C1442410ndf.LIZ() > 0) {
                    C1409905fV.LJ.execute(new ARunnableS83S0000000_3(0));
                }
                if (C2345409Gy.LIZIZ < 0 || ((ArrayList) C2345409Gy.LIZLLL).isEmpty()) {
                    return;
                }
                C786410Ut5.LJL(C2345409Gy.LIZJ, new Runnable() { // from class: X.09Gx
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StartShootOpt@8017.scheduleResume$1");
                        try {
                            Iterator it2 = ((ArrayList) C2345409Gy.LIZLLL).iterator();
                            while (it2.hasNext()) {
                                ((RunnableC2345109Gv) it2.next()).run();
                            }
                            ((ArrayList) C2345409Gy.LIZLLL).clear();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StartShootOpt@8017.scheduleResume$1");
                    }
                });
            }

            @Override // X.InterfaceC1655560tBS
            public final void LJFF() {
                C2345409Gy.LIZ = true;
            }

            @Override // X.InterfaceC1655560tBS
            public final void LJI() {
                C2345409Gy.LIZ = false;
                C791460V2y.LIZ = false;
                if (C1442410ndf.LIZ() > 0) {
                    C1409905fV.LJ.execute(new ARunnableS83S0000000_3(0));
                }
                if (C2345409Gy.LIZIZ >= 0) {
                    ArrayList arrayList = (ArrayList) C2345409Gy.LIZLLL;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC2345109Gv) it2.next()).run();
                    }
                    ((ArrayList) C2345409Gy.LIZLLL).clear();
                }
            }

            @Override // X.InterfaceC1655560tBS
            public final void LJII() {
            }

            @Override // X.InterfaceC1655560tBS
            public final void LIZIZ() {
                b bVar = b.LIZ;
                C2255841DRe c2255841DRe = C2255841DRe.LIZIZ;
                bVar.LIZ(c2255841DRe);
                z1.LIZ.getClass();
                C2184311AeD.LIZ(c2255841DRe, (StudioRunnableBlockConfig) z1.LIZJ.getValue());
                c0.LIZ.getClass();
                C01GW c01gw = c0.LIZJ;
                if (((IsOpenAndCostTimeConfig) c01gw.getValue()).isOpen) {
                    int i = ((IsOpenAndCostTimeConfig) c01gw.getValue()).costTime;
                    if (i < 0) {
                        i = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InhibitLogInPhotoFirstFrame time = ");
                    sbLIZ.append(i);
                    C201955140j.LIZIZ("RecordServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                    C2187451AjH.LJII(i, true);
                }
            }

            @Override // X.InterfaceC1655560tBS
            public final boolean LIZLLL() {
                C01GW c01gw = C1DRZ.LIZIZ;
                if (!((VESoMigrateNewBootFinishTaskConfig) c01gw.getValue()).isOpen) {
                    C201955140j.LIZIZ("PreloadVESo", "not preload, ab not open");
                    return false;
                }
                int i = ((VESoMigrateNewBootFinishTaskConfig) c01gw.getValue()).thresholdCount;
                if (i == 0) {
                    C201955140j.LIZIZ("PreloadVESo", "need preload, not use predict");
                    return true;
                }
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer = C1510050pOl.LIZ().getProducer("ttm_publish", 2);
                if (producer == null) {
                    C201955140j.LIZIZ("PreloadVESo", "not preload, producer is null");
                    return false;
                }
                Number numericFeature$default = FeatureProducer.getNumericFeature$default(producer, "creation_predict_user_shoot", (JSONObject) null, "ttm_publish_creation_predict_user_shoot", (ReturnCode) null, 10, (Object) null);
                int iIntValue = numericFeature$default != null ? numericFeature$default.intValue() : 0;
                List listFeature$default = FeatureProducer.getListFeature$default(producer, "creation_start_shoot", null, "ttm_publish_creation_start_shoot", null, 10, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("creation_predict_user_shoot = ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", creation_start_shoot = ");
                sbLIZ.append(listFeature$default);
                C201955140j.LIZIZ("PreloadVESo", C2188811AlT.LIZIZ(sbLIZ));
                if (iIntValue < i || listFeature$default == null || listFeature$default.isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("not preload, current=");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(", expect=");
                    sbLIZ2.append(i);
                    C201955140j.LIZIZ("PreloadVESo", C2188811AlT.LIZIZ(sbLIZ2));
                    return false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("need preload, current=");
                sbLIZ3.append(iIntValue);
                sbLIZ3.append(", expect=");
                sbLIZ3.append(i);
                C201955140j.LIZIZ("PreloadVESo", C2188811AlT.LIZIZ(sbLIZ3));
                return true;
            }

            @Override // X.InterfaceC1655560tBS
            public final void onDestroyView() {
                CreationContextServiceImpl.INSTANCE.clear();
            }

            @Override // X.InterfaceC1655560tBS
            public final void onEnterAnimationComplete() {
                C2184901AfA c2184901AfA;
                b bVar = b.LIZ;
                b.LIZIZ(C2255841DRe.LIZIZ, false);
                if (C2184311AeD.LIZ && (c2184901AfA = C2184311AeD.LIZIZ) != null) {
                    C1BCA.LJJIIZI(c2184901AfA);
                }
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                    C14KR.LIZLLL = false;
                }
            }

            @Override // X.InterfaceC1655560tBS
            public final void LIZ() {
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                }
            }

            @Override // X.InterfaceC1655560tBS
            public final void LIZJ() {
                ITaskExecutorApi iTaskExecutorApi;
                if (C283510B9h.LIZ()) {
                    C14KR.LIZ();
                    C14KR.LIZLLL = true;
                }
                if (!((VESoMigrateNewBootFinishTaskConfig) C1DRZ.LIZIZ.getValue()).isOpen || (iTaskExecutorApi = (ITaskExecutorApi) PluggableExtentionKt.pluggableSpi$default(ITaskExecutorApi.class, false, false, false, 14, null)) == null) {
                    return;
                }
                iTaskExecutorApi.LIZ("AVCameraInitTaskNew");
            }

            @Override // X.InterfaceC1655560tBS
            public final C0CCZ LJIIIIZZ() {
                IInitTaskService iInitTaskServiceInitService;
                if (!LIZLLL()) {
                    return null;
                }
                C201955140j.LIZIZ("PreloadVESo", "register AVCameraInitTaskNew");
                C1449450np1.LIZ.LIZ(SystemClock.uptimeMillis(), "camera_init_task_new_register");
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService == null || (iInitTaskServiceInitService = iExternalService.initService()) == null) {
                    return null;
                }
                return iInitTaskServiceInitService.initTask(2);
            }
        };
    }
}
