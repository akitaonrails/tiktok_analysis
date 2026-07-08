package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface RigPathBystanderSettings {
    public static final RigPathConfig LIZ = new RigPathConfig("/aweme/v1/aweme/stats/", "/service/2/app_log/");

    public static class RigPathConfig {

        @C09CT("cacheSizeCustom")
        public int cacheSizeCustom;

        @C09CT("pathFilter")
        public List<String> pathFilter;

        public RigPathConfig() {
            this.cacheSizeCustom = 10;
            this.pathFilter = new ArrayList();
        }

        public RigPathConfig(String str, String str2) {
            this.cacheSizeCustom = 10;
            ArrayList arrayList = new ArrayList();
            this.pathFilter = arrayList;
            arrayList.add(str);
            this.pathFilter.add(str2);
        }
    }
}
