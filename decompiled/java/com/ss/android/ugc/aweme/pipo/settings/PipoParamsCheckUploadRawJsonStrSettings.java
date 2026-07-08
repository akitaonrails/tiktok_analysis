package com.ss.android.ugc.aweme.pipo.settings;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoParamsCheckUploadRawJsonStrSettings {
    public static final EnabledModelList LIZ = new EnabledModelList(null);

    public static final class EnabledModelList {

        @C09CT("enabled_list")
        public final List<EnabledModel> enabledList;

        public EnabledModelList() {
            this(null);
        }

        public EnabledModelList(List<EnabledModel> list) {
            this.enabledList = list;
        }
    }

    public static final class EnabledModel {

        @C09CT(Scene.SCENE_SERVICE)
        public final String scene;

        @C09CT("strategy")
        public final String strategy;

        public EnabledModel() {
            this(null, null);
        }

        public EnabledModel(String str, String str2) {
            this.scene = str;
            this.strategy = str2;
        }
    }
}
