package com.bytedance.ies.ugc.aweme.network.zstd;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class ZstdDictSetting {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ZstdDictSetting();
    }

    public static final class ZstdDictConfigWrapper {

        @C09CT("zstd_dict")
        public final ZstdDictConfig config;

        public ZstdDictConfigWrapper(ZstdDictConfig zstdDictConfig) {
            this.config = zstdDictConfig;
        }
    }

    public static final class DictUrl {

        @C09CT("checksum")
        public final String checksum;

        @C09CT("url")
        public final String url;

        public DictUrl() {
            this(null, null);
        }

        public DictUrl(String str, String str2) {
            this.url = str;
            this.checksum = str2;
        }
    }

    public static final class ZstdDictConfig {

        @C09CT("path")
        public final Map<String, String> path;

        @C09CT("version_url")
        public final Map<String, DictUrl> versionUrl;

        public ZstdDictConfig() {
            this(null, null);
        }

        public ZstdDictConfig(Map<String, String> map, Map<String, DictUrl> map2) {
            this.path = map;
            this.versionUrl = map2;
        }
    }
}
