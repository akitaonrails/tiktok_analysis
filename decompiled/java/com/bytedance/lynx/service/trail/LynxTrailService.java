package com.bytedance.lynx.service.trail;

import X.C1299250jul;
import X.C1299340juu;
import X.C1299360juw;
import X.C1299440jv4;
import X.C1299460jv6;
import X.C1309760kBi;
import X.C13LE;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2663011h;
import X.EnumC1980107pH;
import X.InterfaceC1299450jv5;
import android.content.Context;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxTrailService;
import com.lynx.tasm.service.ILynxTrailServiceExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxTrailService implements ILynxTrailService, ILynxTrailServiceExtension {
    public static final LynxTrailService INSTANCE = new LynxTrailService();
    public static InterfaceC1299450jv5 abExperimentAdapter;

    @Override // com.lynx.tasm.service.ILynxTrailService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1299440jv4.LIZ(this);
    }

    @Override // com.lynx.tasm.service.ILynxTrailService
    public Map<String, Object> getAllValues() {
        return C1299250jul.LIZ(C1299250jul.LIZJ().LJFF());
    }

    private final Object objectValueForTrailKeyFromSettings(String str) {
        C1299250jul c1299250julLIZJ = C1299250jul.LIZJ();
        if (c1299250julLIZJ.LIZIZ != null) {
            ((ReentrantReadWriteLock) c1299250julLIZJ.LIZJ).readLock().lock();
            Object obj = c1299250julLIZJ.LIZIZ.get("lynx_common");
            ((ReentrantReadWriteLock) c1299250julLIZJ.LIZJ).readLock().unlock();
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            return null;
        }
        return null;
    }

    private final String stringValueForTrailKeyFromLibra(String str) {
        String strStringValueForTrailKey;
        InterfaceC1299450jv5 interfaceC1299450jv5 = abExperimentAdapter;
        if (interfaceC1299450jv5 != null) {
            strStringValueForTrailKey = interfaceC1299450jv5.stringValueForTrailKey(str);
        } else {
            strStringValueForTrailKey = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get ExperimentValue: ");
        sbLIZ.append(strStringValueForTrailKey);
        sbLIZ.append(", for key: ");
        sbLIZ.append(str);
        LynxLog.i("LynxTrailService", C2188811AlT.LIZIZ(sbLIZ));
        if (strStringValueForTrailKey == null || strStringValueForTrailKey.length() == 0) {
            return null;
        }
        return strStringValueForTrailKey;
    }

    private final String stringValueForTrailKeyFromSettings(String str) {
        C1299250jul c1299250julLIZJ = C1299250jul.LIZJ();
        if (c1299250julLIZJ.LIZIZ != null) {
            ((ReentrantReadWriteLock) c1299250julLIZJ.LIZJ).readLock().lock();
            Object obj = c1299250julLIZJ.LIZIZ.get("lynx_common");
            ((ReentrantReadWriteLock) c1299250julLIZJ.LIZJ).readLock().unlock();
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(str);
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                if (!(obj2 instanceof Integer) && !(obj2 instanceof Boolean)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown value type: ");
                    sbLIZ.append(obj2);
                    LynxLog.e("LynxSettingsManager", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
                return obj2.toString();
            }
            return null;
        }
        return null;
    }

    @Override // com.lynx.tasm.service.ILynxTrailService
    public Object objectValueForTrailKey(String str) {
        Object objLIZ;
        Object objStringValueForTrailKeyFromLibra = stringValueForTrailKeyFromLibra(str);
        if (objStringValueForTrailKeyFromLibra == null) {
            objStringValueForTrailKeyFromLibra = objectValueForTrailKeyFromSettings(str);
        }
        StringBuilder sb = new StringBuilder("get objectValue: ");
        sb.append(objStringValueForTrailKeyFromLibra);
        sb.append(", forTrailKey: ");
        sb.append(str);
        sb.append(", valueType: ");
        if (objStringValueForTrailKeyFromLibra != null) {
            objLIZ = C13LE.LIZ(objStringValueForTrailKeyFromLibra.getClass());
        } else {
            objLIZ = "null";
        }
        sb.append(objLIZ);
        LynxLog.i("LynxTrailService", sb.toString());
        return objStringValueForTrailKeyFromLibra;
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public void onInitialize(Context context) {
        C1299250jul.LIZJ().LIZIZ(context);
    }

    @Override // com.lynx.tasm.service.ILynxTrailServiceExtension
    public void parseLynxViewBuilder(C1309760kBi c1309760kBi) {
        Integer numLJIIJJI;
        c1309760kBi.getClass();
        Map<String, String> map = c1309760kBi.LJJIJ;
        if (map != null) {
            TraceEvent.LIZJ("LynxViewConfigProcessor.setConfig", map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    if (Intrinsics.LJFF(key, EnumC1980107pH.PLATFORM_CONFIG.getKey())) {
                        if (c1309760kBi.LJJIJ == null) {
                            c1309760kBi.LJJIJ = new HashMap();
                        }
                        if (c1309760kBi.LJJIJ.get(key) == null) {
                            c1309760kBi.LJJIJ.put(key, value);
                        }
                    } else if (Intrinsics.LJFF(key, "enable_unified_pipeline")) {
                        Boolean boolLIZ = C2663011h.LIZ(value);
                        if (boolLIZ != null) {
                            c1309760kBi.LJI = boolLIZ.booleanValue();
                        }
                    } else if (Intrinsics.LJFF(key, "enable_js_group_thread")) {
                        Boolean boolLIZ2 = C2663011h.LIZ(value);
                        if (boolLIZ2 != null) {
                            boolean zBooleanValue = boolLIZ2.booleanValue();
                            C1299340juu c1299340juuLIZIZ = c1309760kBi.LIZIZ();
                            if (c1299340juuLIZIZ == null) {
                                c1299340juuLIZIZ = new C1299340juu(new C1299360juw());
                            }
                            c1299340juuLIZIZ.LJ = zBooleanValue;
                            c1309760kBi.LIZLLL.LIZJ = c1299340juuLIZIZ;
                        }
                    } else if (Intrinsics.LJFF(key, "enable_mts_module")) {
                        Boolean boolLIZ3 = C2663011h.LIZ(value);
                        if (boolLIZ3 != null) {
                            c1309760kBi.LJJI = boolLIZ3.booleanValue();
                        }
                    } else if (Intrinsics.LJFF(key, "embedded_mode") && (numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL(value).toString())) != null) {
                        int iIntValue = numLJIIJJI.intValue();
                        c1309760kBi.LJJ = iIntValue;
                        if ((iIntValue & 1) > 0) {
                            c1309760kBi.LIZJ.LIZIZ = C1299460jv6.LIZ;
                        }
                    }
                }
            }
            TraceEvent.LJII("LynxViewConfigProcessor.setConfig");
        }
    }

    public final void setABExperimentAdapter(InterfaceC1299450jv5 interfaceC1299450jv5) {
        abExperimentAdapter = interfaceC1299450jv5;
    }

    @Override // com.lynx.tasm.service.ILynxTrailService
    public String stringValueForTrailKey(String str) {
        String strStringValueForTrailKeyFromLibra = stringValueForTrailKeyFromLibra(str);
        if (strStringValueForTrailKeyFromLibra == null) {
            strStringValueForTrailKeyFromLibra = stringValueForTrailKeyFromSettings(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get stringValue: ");
        sbLIZ.append(strStringValueForTrailKeyFromLibra);
        sbLIZ.append(", forTrailKey: ");
        sbLIZ.append(str);
        LynxLog.i("LynxTrailService", C2188811AlT.LIZIZ(sbLIZ));
        return strStringValueForTrailKeyFromLibra;
    }

    public final void setSettingsWithTime(String str, long j) {
        C1299250jul.LIZJ().LJ(str, j);
    }
}
