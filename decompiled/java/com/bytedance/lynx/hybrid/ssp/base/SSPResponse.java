package com.bytedance.lynx.hybrid.ssp.base;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class SSPResponse {
    public static final /* synthetic */ int LJII = 0;
    public n LIZ;
    public int LIZIZ = -1;
    public long LIZJ;
    public Map<String, Data> LIZLLL;
    public Map<String, List<Rule>> LJ;
    public Map<String, String> LJFF;
    public String LJI;

    public static final class Data {

        @C09CT("expire")
        public long expire;

        @C09CT("matchType")
        public int matchType;

        @C09CT("preconnectList")
        public PreConnect[] preConnectList;

        @C09CT("prefetchList")
        public Prefetch[] prefetchList;

        @C09CT("subpagePreconnectList")
        public PreConnect[] subpagePreConnectList;

        @C09CT("validityPeriod")
        public int validityPeriod;

        @C09CT("logID")
        public String logID = "";

        @C09CT("mode")
        public int mode = -1;
    }

    public static final class PreConnect {

        @C09CT("custom")
        public n custom;

        @C09CT("domain")
        public String domain;

        @C09CT("level")
        public int level = 1;

        @C09CT("protocol")
        public String protocol;

        @C09CT("source")
        public Integer source;
    }

    public static final class Prefetch {

        @C09CT("custom")
        public n custom;

        @C09CT("reqHeader")
        public Map<String, String> reqHeader;

        @C09CT("source")
        public Integer source;

        @C09CT("url")
        public String url;

        @C09CT("level")
        public Integer level = 1;

        @C09CT("isMainFrame")
        public Boolean isMainFrame = Boolean.FALSE;
    }

    public static final class Rule {

        @C09CT("name")
        public String name;

        @C09CT("regex")
        public String regex;

        @C09CT("type")
        public String type;

        /* JADX WARN: Multi-variable type inference failed */
        public Rule() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Rule(name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", regex=");
            sbLIZ.append(this.regex);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Rule(String str, String str2, String str3) {
            this.name = str;
            this.type = str2;
            this.regex = str3;
        }

        public /* synthetic */ Rule(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }
}
