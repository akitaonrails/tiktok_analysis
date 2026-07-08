package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Node {

    @C09CT("config")
    public final Config config;

    @C09CT("data")
    public final n data;

    @C09CT("dynamic_events")
    public final List<SlashEvent> dynamicEvents;

    @C09CT("events")
    public final Map<String, EventModel> events;

    @C09CT("sub_type")
    public final String subType;

    @C09CT("type")
    public final String type;

    @C09CT("update_strategy")
    public final UpdateStrategy updateStrategy;

    @C09CT("url")
    public final String url;

    public Node() {
        this(null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Config {

        @C09CT("biz_name")
        public final String bizName;

        public Config() {
            this(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.LJFF(this.bizName, ((Config) obj).bizName);
        }

        public int hashCode() {
            String str = this.bizName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(bizName=");
            sbLIZ.append(this.bizName);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(String str) {
            this.bizName = str;
        }
    }

    public Node(n nVar, String str, String str2, String str3, Map<String, EventModel> map, List<SlashEvent> list, UpdateStrategy updateStrategy, Config config) {
        this.data = nVar;
        this.type = str;
        this.subType = str2;
        this.url = str3;
        this.events = map;
        this.dynamicEvents = list;
        this.updateStrategy = updateStrategy;
        this.config = config;
    }
}
