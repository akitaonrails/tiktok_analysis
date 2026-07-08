package com.ss.android.ugc.aweme.search.lynx.core.communicate.schemas.config;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCustomizedSchemaSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class Schema implements Serializable {
        public static final int $stable = 8;

        @C09CT("action")
        public String action = "";

        @C09CT("schema_prefix")
        public String schemaPrefix = "";

        public final String getAction() {
            return this.action;
        }

        public final String getSchemaPrefix() {
            return this.schemaPrefix;
        }

        public final void setAction(String str) {
            this.action = str;
        }

        public final void setSchemaPrefix(String str) {
            this.schemaPrefix = str;
        }
    }

    public static final class SchemaList implements Serializable {
        public static final int $stable = 8;

        @C09CT("schema_list")
        public List<Schema> schemaList = new ArrayList();

        public final List<Schema> getSchemaList() {
            return this.schemaList;
        }

        public final void setSchemaList(List<Schema> list) {
            this.schemaList = list;
        }
    }
}
