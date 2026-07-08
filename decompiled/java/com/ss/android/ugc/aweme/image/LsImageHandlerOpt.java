package com.ss.android.ugc.aweme.image;

import X.C01GW;
import X.C09CT;
import X.C1321290kUJ;
import X.C452501pT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LsImageHandlerOpt {
    public static final LsImageHandlerOptConfig LIZ = new LsImageHandlerOptConfig(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1321290kUJ());

    public static final class LsImageHandlerOptConfig {
        public static final int $stable = 8;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("scenes")
        public final List<LsImageHandlerOptItemModel> scenes;

        public LsImageHandlerOptConfig() {
            this(false, null);
        }

        public LsImageHandlerOptConfig(boolean z, List<LsImageHandlerOptItemModel> list) {
            this.enable = z;
            this.scenes = list;
        }
    }

    public static final class LsImageHandlerOptItemModel {
        public static final int $stable = 0;

        @C09CT("page_tag")
        public final String pageTag;

        @C09CT("scene_tag")
        public final String sceneTag;

        public LsImageHandlerOptItemModel() {
            this(null, null);
        }

        public LsImageHandlerOptItemModel(String str, String str2) {
            this.pageTag = str;
            this.sceneTag = str2;
        }
    }
}
