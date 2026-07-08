package com.ss.android.ugc.aweme.nimblecard.tako.config;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TemplateConfig {

    @C09CT("cdn_prefix")
    public final String cdnPrefix;

    @C09CT("items")
    public final List<Item> items;

    public TemplateConfig() {
        this(null, null);
    }

    public TemplateConfig(String str, List<Item> list) {
        this.cdnPrefix = str;
        this.items = list;
    }

    public static final class Item {

        @C09CT("key")
        public final String key;

        @C09CT("min_version")
        public final Long minVersion;

        @C09CT(Scene.SCENE_SERVICE)
        public final String scene;

        public Item() {
            this(null, null, null);
        }

        public Item(String str, Long l, String str2) {
            this.key = str;
            this.minVersion = l;
            this.scene = str2;
        }
    }
}
