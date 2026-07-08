package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcomLruCacheSetting {
    public static final EcomLruCacheSettingConfig LIZ;

    public static final class EcomLruCacheSettingConfig {

        @C09CT("scenes")
        public List<EcomLruCacheScene> scenes;

        public EcomLruCacheSettingConfig() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EcomLruCacheScene(false, 1, "cart_order_submit_params", 0, false));
            arrayList.add(new EcomLruCacheScene(false, 1, "intercept_submit_storage", 0, false));
            arrayList.add(new EcomLruCacheScene(false, 1, "order_submit_preload_cart", 0, false));
            this(arrayList);
        }

        public EcomLruCacheSettingConfig(List<EcomLruCacheScene> list) {
            this.scenes = list;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EcomLruCacheScene(false, 1, "cart_order_submit_params", 0, false));
        arrayList.add(new EcomLruCacheScene(false, 1, "intercept_submit_storage", 0, false));
        arrayList.add(new EcomLruCacheScene(false, 1, "order_submit_preload_cart", 0, false));
        LIZ = new EcomLruCacheSettingConfig(arrayList);
    }

    public static final class EcomLruCacheScene {

        @C09CT("immediate")
        public final boolean immediate;

        @C09CT("max_size")
        public int maxSize;

        @C09CT("persistence")
        public boolean persistence;

        @C09CT(Scene.SCENE_SERVICE)
        public String scene;

        @C09CT("timeout")
        public final int timeout;

        public EcomLruCacheScene() {
            this(false, 10, null, 0, false);
        }

        public EcomLruCacheScene(boolean z, int i, String str, int i2, boolean z2) {
            this.persistence = z;
            this.maxSize = i;
            this.scene = str;
            this.timeout = i2;
            this.immediate = z2;
        }
    }
}
