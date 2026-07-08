package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@C09CS(PrivacyUserSettingsV2Deserializer.class)
public final class PrivacyUserSettingsV2 {
    public final Map<String, Integer> LIZ;

    public PrivacyUserSettingsV2() {
        this(0);
    }

    public /* synthetic */ PrivacyUserSettingsV2(int i) {
        this(new LinkedHashMap());
    }

    public final Integer LIZ(String str) {
        return this.LIZ.get(str);
    }

    public final void LIZJ(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        for (Map.Entry<String, Integer> entry : privacyUserSettingsV2.LIZ.entrySet()) {
            this.LIZ.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue()));
        }
    }

    public PrivacyUserSettingsV2(Map<String, Integer> map) {
        this.LIZ = map;
    }

    public final void LIZIZ(int i, String str) {
        this.LIZ.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static final class PrivacyUserSettingsV2Deserializer implements j<PrivacyUserSettingsV2>, r<PrivacyUserSettingsV2> {
        public final Type LIZ = new TypeToken<Map<String, Integer>>() { // from class: X.104d
        }.getType();

        @Override // com.google.gson.r
        public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
            return aVar.LIZJ(((PrivacyUserSettingsV2) obj).LIZ, this.LIZ);
        }

        @Override // com.google.gson.j
        public final PrivacyUserSettingsV2 deserialize(k kVar, Type type, i iVar) {
            if (iVar != null) {
                try {
                    Map map = (Map) ((TreeTypeAdapter.a) iVar).LIZ(kVar, this.LIZ);
                    if (map != null) {
                        return new PrivacyUserSettingsV2((Map<String, Integer>) map);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return null;
        }
    }
}
