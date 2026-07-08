package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2097908Jt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomSparkLruInjectConfig {
    public static final EcomSparkLruInjectModel[] LIZ;

    static {
        EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr = new EcomSparkLruInjectModel[0];
        EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr2 = (EcomSparkLruInjectModel[]) SettingsManager.LIZLLL().LJIIIIZZ("ecom_spark_lru_inject_config", EcomSparkLruInjectModel[].class, ecomSparkLruInjectModelArr);
        if (ecomSparkLruInjectModelArr2 != null) {
            ecomSparkLruInjectModelArr = ecomSparkLruInjectModelArr2;
        }
        LIZ = ecomSparkLruInjectModelArr;
    }

    public static Map LIZ() {
        EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr = LIZ;
        if (ecomSparkLruInjectModelArr.length == 0) {
            return C2097608Jq.LJ();
        }
        int iLIZIZ = C2097908Jt.LIZIZ(ecomSparkLruInjectModelArr.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EcomSparkLruInjectModel ecomSparkLruInjectModel : ecomSparkLruInjectModelArr) {
            linkedHashMap.put(ecomSparkLruInjectModel.channel, ecomSparkLruInjectModel);
        }
        return linkedHashMap;
    }

    public static final class EcomSparkLruInjectModel {

        @C09CT("cache")
        public final List<EcomSparkLruInjectCache> cache;

        @C09CT("channel")
        public final String channel;

        public EcomSparkLruInjectModel(String str, List<EcomSparkLruInjectCache> list) {
            this.channel = str;
            this.cache = list;
        }

        public EcomSparkLruInjectModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class EcomSparkLruInjectCache {

        @C09CT("key")
        public final String key;

        @C09CT(Scene.SCENE_SERVICE)
        public final String scene;

        @C09CT("sub_channel")
        public final String subChannel;

        public EcomSparkLruInjectCache(String str, String str2, String str3) {
            this.subChannel = str;
            this.scene = str2;
            this.key = str3;
        }
    }
}
