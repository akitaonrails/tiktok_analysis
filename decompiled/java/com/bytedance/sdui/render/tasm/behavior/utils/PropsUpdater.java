package com.bytedance.sdui.render.tasm.behavior.utils;

import X.C0WZX;
import X.C1291190jhl;
import X.C1291290jhv;
import X.C1298550jtd;
import X.C2188811AlT;
import X.C2204961BRm;
import android.util.Log;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.utils.e;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class PropsUpdater {
    public static final Map<Class<?>, SDUIUISetter<?>> LIZ = new ConcurrentHashMap();
    public static final Map<String, Settable> LIZIZ = new HashMap();

    public static class FallbackSDUIUISetter<T extends SDUIBaseUI> implements SDUIUISetter<T> {
        public final Map<String, e.j> LIZ;

        public FallbackSDUIUISetter() {
            throw null;
        }

        public FallbackSDUIUISetter(Class cls) {
            this.LIZ = e.LIZ(cls);
        }

        @Override // com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
        public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
            e.j jVar = this.LIZ.get(str);
            if (jVar != null) {
                try {
                    Integer num = jVar.LIZJ;
                    if (num == null) {
                        jVar.LIZLLL[0] = jVar.LIZ(c1291290jhv);
                        C2204961BRm.a0(jVar.LIZIZ, sDUIBaseUI, jVar.LIZLLL, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B4aebVuLdzxCayAva8xbKE=", null));
                        Arrays.fill(jVar.LIZLLL, (Object) null);
                    } else {
                        Object[] objArr = jVar.LJ;
                        objArr[0] = num;
                        objArr[1] = jVar.LIZ(c1291290jhv);
                        C2204961BRm.a0(jVar.LIZIZ, sDUIBaseUI, jVar.LJ, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYGJVpd8Eyg0kCfMpLuqw3B4aebVuLdzxCayAva8xbKE=", null));
                        Arrays.fill(jVar.LJ, (Object) null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new RuntimeException("Error while updating property '" + jVar.LIZ + "' in shadow node of type: " + sDUIBaseUI.getClass() + c1291290jhv + "this:" + jVar + ":" + th.getMessage(), th);
                }
            }
        }
    }

    public static void LIZ(C1291290jhv c1291290jhv, SDUIBaseUI sDUIBaseUI) {
        Class<?> cls = sDUIBaseUI.getClass();
        SDUIUISetter fallbackSDUIUISetter = (SDUIUISetter) ((ConcurrentHashMap) LIZ).get(cls);
        if (fallbackSDUIUISetter == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append("$$PropsSetter");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Object objNewInstance = (Settable) ((HashMap) LIZIZ).get(strLIZIZ);
            if (objNewInstance == null) {
                try {
                    objNewInstance = Class.forName(strLIZIZ).newInstance();
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    objNewInstance = null;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Unable to instantiate methods getter for ");
                    sbLIZ2.append(strLIZIZ);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
                } catch (InstantiationException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("Unable to instantiate methods getter for ");
                    sbLIZ22.append(strLIZIZ);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ22), e);
                }
            }
            fallbackSDUIUISetter = (SDUIUISetter) objNewInstance;
            if (fallbackSDUIUISetter == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("PropsSetter not generated for class: ");
                sbLIZ3.append(cls.getName());
                sbLIZ3.append(". You should add module lynxProcessor");
                C2188811AlT.LIZIZ(sbLIZ3);
                fallbackSDUIUISetter = new FallbackSDUIUISetter(cls);
            }
            ((ConcurrentHashMap) LIZ).put(cls, fallbackSDUIUISetter);
        }
        ReadableMap readableMap = c1291290jhv.LIZ;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            try {
                fallbackSDUIUISetter.LIZ(sDUIBaseUI, strNextKey, c1291290jhv);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Error while updating property '");
                sbLIZ4.append(strNextKey);
                sbLIZ4.append("' in ui ");
                sbLIZ4.append(sDUIBaseUI.LJJIJIL());
                sbLIZ4.append(": ");
                sbLIZ4.append(th.getMessage());
                sbLIZ4.append("props:");
                sbLIZ4.append(readableMap);
                Map map = (Map) ((ConcurrentHashMap) e.LIZ).get(sDUIBaseUI.getClass());
                Objects.requireNonNull(map);
                sbLIZ4.append(map.get(strNextKey));
                RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), th);
                runtimeException.setStackTrace(th.getStackTrace());
                C1298550jtd.LIZ(sDUIBaseUI.LLILZ, new C1291190jhl(109, Log.getStackTraceString(th)), "");
                sDUIBaseUI.LLILZ.LIZJ(runtimeException, 104, new JSONObject());
            }
        }
    }
}
