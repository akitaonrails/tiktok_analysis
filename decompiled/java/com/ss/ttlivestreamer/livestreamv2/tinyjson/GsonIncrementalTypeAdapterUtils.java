package com.ss.ttlivestreamer.livestreamv2.tinyjson;

import X.C09CT;
import X.C09CU;
import X.C09D1;
import X.C09D2;
import X.C09D3;
import X.C09DL;
import X.C1274040jG6;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsAdaptiveConfigs;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonIncrementalTypeAdapterUtils implements C09D1 {
    public final Gson LIZ;

    public static final class IncrementalGsonTypeAdapter<T> extends TypeAdapter<T> {
        public Gson LIZ;
        public final Class<T> LIZIZ;
        public final T LIZJ;
        public final Map<Class<?>, Map<String, Field>> LIZLLL;

        public IncrementalGsonTypeAdapter() {
            throw null;
        }

        public final Map<String, Field> LIZ(Class<?> cls) {
            Map<String, Field> map = (Map) ((HashMap) this.LIZLLL).get(cls);
            if (map != null) {
                return map;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            HashMap map2 = new HashMap();
            ((HashMap) this.LIZLLL).put(cls, map2);
            for (Field field : declaredFields) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
                if (c09ct != null) {
                    map2.put(c09ct.value(), field);
                }
            }
            return map2;
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            try {
                LIZIZ(c09cu, this.LIZJ, LIZ(this.LIZIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZJ.getClass().getSimpleName());
                sbLIZ.append(" gson read meet exception:");
                sbLIZ.append(e.getMessage());
                GsonIncrementalTypeAdapterUtils.LIZJ("GsonIncrementalParser", C2188811AlT.LIZIZ(sbLIZ), e);
            }
            return this.LIZJ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IncrementalGsonTypeAdapter(Class cls, Object obj) {
            this.LIZLLL = new HashMap();
            this.LIZIZ = cls;
            this.LIZJ = obj;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            this.LIZ.LJIIJ(this.LIZIZ).write(c09dl, this.LIZJ);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:398:0x030b
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        public final void LIZIZ(X.C09CU r13, java.lang.Object r14, java.util.Map<java.lang.String, java.lang.reflect.Field> r15) {
            /*
                Method dump skipped, instruction units count: 2246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonIncrementalTypeAdapterUtils.IncrementalGsonTypeAdapter.LIZIZ(X.09CU, java.lang.Object, java.util.Map):void");
        }
    }

    public GsonIncrementalTypeAdapterUtils(LiveSdkSetting liveSdkSetting) {
        e eVarLIZ = C09D3.LIZ();
        ArrayList arrayList = new ArrayList();
        IncrementalGsonTypeAdapter incrementalGsonTypeAdapter = new IncrementalGsonTypeAdapter(LiveSdkSetting.class, liveSdkSetting);
        eVarLIZ.LIZJ(incrementalGsonTypeAdapter, LiveSdkSetting.class);
        arrayList.add(incrementalGsonTypeAdapter);
        IncrementalGsonTypeAdapter incrementalGsonTypeAdapter2 = new IncrementalGsonTypeAdapter(TTLHABSettingsConfigs.class, liveSdkSetting.ttlhABSettingsConfigs);
        eVarLIZ.LIZJ(incrementalGsonTypeAdapter2, TTLHABSettingsConfigs.class);
        arrayList.add(incrementalGsonTypeAdapter2);
        IncrementalGsonTypeAdapter incrementalGsonTypeAdapter3 = new IncrementalGsonTypeAdapter(TTLHABSettingsAdaptiveConfigs.class, liveSdkSetting.LJIIIIZZ);
        eVarLIZ.LIZJ(incrementalGsonTypeAdapter3, TTLHABSettingsAdaptiveConfigs.class);
        arrayList.add(incrementalGsonTypeAdapter3);
        this.LIZ = eVarLIZ.LIZ();
        if (C09D3.LIZ == null) {
            synchronized (C09D3.class) {
                try {
                    if (C09D3.LIZ == null) {
                        e eVarLIZ2 = C09D3.LIZ();
                        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonUtils$1
                            @Override // com.google.gson.TypeAdapter
                            public final Boolean read(C09CU c09cu) {
                                int i = C09D2.LIZ[c09cu.LJJLIIIJ().ordinal()];
                                boolean z = true;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            return null;
                                        }
                                        String strLJJJZ = c09cu.LJJJZ();
                                        if (!"1".equals(strLJJJZ) && !"true".equalsIgnoreCase(strLJJJZ)) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    if (c09cu.LJJIL() == 0.0d) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                                return Boolean.valueOf(c09cu.LJJ());
                            }

                            @Override // com.google.gson.TypeAdapter
                            public final void write(C09DL c09dl, Boolean bool) {
                                c09dl.LJJJ(bool);
                            }
                        };
                        eVarLIZ2.LIZJ(typeAdapter, Boolean.TYPE);
                        eVarLIZ2.LIZJ(typeAdapter, Boolean.class);
                        C09D3.LIZ = eVarLIZ2.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Gson gson = C09D3.LIZ;
        for (int i = 0; i < arrayList.size(); i++) {
            ((IncrementalGsonTypeAdapter) ListProtector.get(arrayList, i)).LIZ = gson;
        }
    }

    public final Object LIZ(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return LIZIZ(str, obj.getClass());
    }

    public final <T> T LIZIZ(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            return (T) this.LIZ.LJII(str, cls);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fromJson failed:");
            sbLIZ.append(e.getMessage());
            LIZJ("GsonIncrementalParser", C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public static void LIZJ(String str, String str2, Exception exc) {
        AVLog.logKibanaEvent(6, str, "GsonIncrementalParser", false, str2, exc);
        if (!C1274040jG6.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(":");
        sbLIZ.append(str2);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), exc);
    }
}
