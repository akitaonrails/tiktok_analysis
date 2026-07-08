package com.tiktok.strategycenterengineimpl.manager;

import X.AbstractC2213701BkW;
import X.C0VEF;
import X.C1877907Xd;
import X.C19719512Dh;
import X.C1BWO;
import X.C204536151q;
import X.C2190161Ane;
import X.C2213421Bk4;
import X.C2213431Bk5;
import X.C2213751Bkb;
import X.C2213851Bkl;
import X.C2213941Bku;
import X.C786410Ut5;
import X.C829720Wgk;
import X.C829890Wh1;
import X.C830820WiW;
import X.C830860Wia;
import X.C830870Wib;
import X.EnumC1153320g7O;
import X.EnumC2213771Bkd;
import X.EnumC2213801Bkg;
import X.EnumC829940Wh6;
import X.InterfaceC829710Wgj;
import X.InterfaceC829930Wh5;
import X.InterfaceC830810WiV;
import X.InterfaceC830850WiZ;
import X.InterfaceC830890Wid;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.feature.IFeatureCenterDataManager;
import com.tiktok.strategycenterengineimpl.action.IPSPFeatureAction;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMSceneModel;
import com.tiktok.strategycenterengineimpl.storagecenter.nativedb.TTMNativeDataManager;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMStrategyCenterManagerImpl {
    public static boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static IFeatureCenterDataManager LJFF;
    public static long LJIIIZ;
    public static boolean LJIIJ;
    public static final TTMStrategyCenterManagerImpl LIZ = new TTMStrategyCenterManagerImpl();
    public static String LIZIZ = CardStruct.IStatusCode.DEFAULT;
    public static final ConcurrentHashMap<Integer, InterfaceC829930Wh5> LJ = new ConcurrentHashMap<>();
    public static Set<String> LJI = new LinkedHashSet();
    public static final ConcurrentHashMap<String, InterfaceC830890Wid> LJII = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Object> LJIIIIZZ = new ConcurrentHashMap<>();

    private final native long getFileAccessTime(String str);

    private final native long getStrategyCenterBdiFunc();

    static {
        C830860Wia.LIZ();
    }

    public static void LJFF() {
        IPSPFeatureAction iPSPFeatureAction;
        boolean z = C2213421Bk4.LIZ;
        try {
            new AwS578S0100000_34(C2213421Bk4.LJII, (Function2<? super EnumC1153320g7O, ? super JSONObject, Unit>) 108).invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2213941Bku.LIZ = new InterfaceC830850WiZ() { // from class: X.0WiU
            @Override // X.InterfaceC830850WiZ
            public final InterfaceC830810WiV LIZ(String str, InterfaceC830810WiV interfaceC830810WiV) {
                if (str != null && str.length() != 0) {
                    return interfaceC830810WiV.LIZ(new AwS592S0100000_13(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)), (Set<String>) 9));
                }
                return interfaceC830810WiV;
            }
        };
        C2213431Bk5 c2213431Bk5 = C2213421Bk4.LIZLLL;
        LJFF = c2213431Bk5 != null ? c2213431Bk5.LIZIZ : null;
        C1877907Xd c1877907Xd = C2213421Bk4.LIZJ;
        if (c1877907Xd == null || (iPSPFeatureAction = c1877907Xd.LIZ) == null) {
            return;
        }
        C2190161Ane.LIZ.put(EnumC2213801Bkg.CAI_ACTION_TYPE_STORE_VALUE_TO_FEATURE_CENTER, iPSPFeatureAction);
    }

    public final void LJ() {
        if (LIZLLL || LJIIJ || C1BWO.LIZ == null) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZLLL) {
                    return;
                }
                Function0<Unit> function0 = C1BWO.LIZ;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(InterfaceC830890Wid interfaceC830890Wid) {
        if (interfaceC830890Wid != null) {
            try {
                C830870Wib c830870Wib = (C830870Wib) interfaceC830890Wid;
                LJII.remove(c830870Wib.LIZ, interfaceC830890Wid);
                Iterator<AbstractC2213701BkW> it2 = c830870Wib.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void LIZLLL(Context context) {
        boolean z;
        TTMCore.Config config;
        boolean z2 = C2213421Bk4.LIZ;
        try {
            if (!LIZLLL && !LJIIJ) {
                try {
                    new AwS578S0100000_34(C2213421Bk4.LJII, (Function2<? super EnumC1153320g7O, ? super JSONObject, Unit>) 108).invoke();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                LoadSoLancet.LIZJ("psp_engine");
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF("psp_engine");
                LoadSoLancet.LJ(jUptimeMillis, "psp_engine");
                LoadSoLancet.LIZLLL(jUptimeMillis, "psp_engine");
                LoadSoLancet.LIZIZ("psp_engine");
                LIZIZ = C2213421Bk4.LJI;
                if (context instanceof Activity) {
                    C786410Ut5.L3((Activity) context);
                }
                TTMStrategyCenterManagerImpl tTMStrategyCenterManagerImpl = LIZ;
                tTMStrategyCenterManagerImpl.getClass();
                TTMStrategyCenter.setExecutor(null);
                Throwable thInit = TTMStrategyCenter.getInstance().init(C2213421Bk4.LIZLLL);
                if (thInit == null) {
                    if (C2213421Bk4.LJ) {
                        LJIIIZ = tTMStrategyCenterManagerImpl.getStrategyCenterBdiFunc();
                        TTMStrategyCenter.getInstance().registerExternFuncAddress(LJIIIZ);
                        C830860Wia.LIZ();
                        TTMStrategyCenter.setExecutor(null);
                        LJFF();
                        C0VEF.LIZ.LIZIZ(context);
                        LJI = C2213421Bk4.LIZIZ;
                        C2213431Bk5 c2213431Bk5 = C2213421Bk4.LIZLLL;
                        if (c2213431Bk5 != null && (config = c2213431Bk5.LIZ) != null) {
                            z = config.isLocalTest;
                        } else {
                            z = false;
                        }
                        LIZJ = z;
                        LIZLLL = true;
                        C2213751Bkb c2213751BkbLIZ = C2213851Bkl.LIZ();
                        if (c2213751BkbLIZ != null) {
                            try {
                                TTMNativeDataManager.INSTANCE.getDBFileSize();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c2213751BkbLIZ.LJI = -1L;
                            c2213751BkbLIZ.LIZ();
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C2213751Bkb c2213751BkbLIZ2 = C2213851Bkl.LIZ();
                    if (c2213751BkbLIZ2 != null) {
                        c2213751BkbLIZ2.LIZJ = C204536151q.LIZ(EnumC2213771Bkd.TTMCenterInitSuccess);
                        c2213751BkbLIZ2.LJIIJ = jCurrentTimeMillis2 - jCurrentTimeMillis;
                        c2213751BkbLIZ2.LIZ();
                        return;
                    }
                    return;
                }
                throw thInit;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LJIIJ = true;
            C2213751Bkb c2213751BkbLIZ3 = C2213851Bkl.LIZ();
            if (c2213751BkbLIZ3 != null) {
                c2213751BkbLIZ3.LIZLLL = th2.toString();
                c2213751BkbLIZ3.LIZJ = C204536151q.LIZ(EnumC2213771Bkd.TTMCenterInitError);
                c2213751BkbLIZ3.LIZ();
            }
        }
    }

    public final int LJII(JSONObject jSONObject) throws JSONException {
        LJ();
        if (LIZLLL) {
            if (!C0VEF.LIZJ) {
                return -4;
            }
            if (!TTMNativeDataManager.INSTANCE.deleteAllData()) {
                return -2;
            }
            int i = 0;
            for (TTMSceneModel tTMSceneModel : C0VEF.LIZIZ.values()) {
                int iInsertSceneModelToDB = TTMNativeDataManager.INSTANCE.insertSceneModelToDB(tTMSceneModel);
                if (iInsertSceneModelToDB == 0) {
                    ConcurrentHashMap<String, TTMSceneModel> concurrentHashMap = C0VEF.LIZIZ;
                    C19719512Dh.LIZJ(concurrentHashMap).remove(tTMSceneModel.getSceneKey());
                } else {
                    if (jSONObject != null) {
                        String sceneKey = tTMSceneModel.getSceneKey();
                        if (sceneKey == null) {
                            sceneKey = "";
                        }
                        jSONObject.putOpt(sceneKey, Integer.valueOf(iInsertSceneModelToDB));
                    }
                    i = -3;
                }
            }
            LIZ.getClass();
            Iterator<InterfaceC829930Wh5> it2 = LJ.values().iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(EnumC829940Wh6.TTMStateSceneDataUpdateFinish);
            }
            C0VEF.LIZLLL = 2;
            return i;
        }
        return -1;
    }

    public final int LJIIIIZZ(Object obj) {
        if (!(obj instanceof TTMSceneModel)) {
            return -1;
        }
        LJ();
        if (!LIZLLL) {
            return -1;
        }
        TTMSceneModel tTMSceneModel = (TTMSceneModel) obj;
        C0VEF.LIZLLL = 1;
        LIZ.getClass();
        Iterator<InterfaceC829930Wh5> it2 = LJ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(EnumC829940Wh6.TTMStateSceneDataUpdateStart);
        }
        if (tTMSceneModel.getSceneKey() != null) {
            C0VEF.LIZIZ.put(tTMSceneModel.getSceneKey(), tTMSceneModel);
            return 0;
        }
        return 0;
    }

    public static boolean LIZ(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            try {
                C829890Wh1.LJI.LIZIZ(new TTMParamData((ITTMParamData) new C829720Wgk(str, jSONObject)));
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return true;
            }
        }
        return false;
    }

    public static void LIZJ(InterfaceC830810WiV interfaceC830810WiV, InterfaceC829710Wgj interfaceC829710Wgj) {
        if (interfaceC830810WiV != null && interfaceC829710Wgj != null) {
            try {
                ((C830820WiW) interfaceC830810WiV).LIZIZ(new TTMParamData(interfaceC829710Wgj));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x004a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r19, java.util.List r20, X.C830930Wih r21, X.AbstractC830880Wic r22, X.C2213881Bko r23, X.C2213751Bkb r24) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl.LJI(java.lang.String, java.util.List, X.0Wih, X.0Wic, X.1Bko, X.1Bkb):void");
    }
}
