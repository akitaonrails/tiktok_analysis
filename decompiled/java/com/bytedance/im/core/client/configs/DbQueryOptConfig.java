package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class DbQueryOptConfig {

    @C09CT("chunk_size")
    public final int chunkSize;

    @C09CT("enable_count_sql_rewrite")
    public final boolean enableCountSqlRewrite;

    @C09CT("enable_in_list_binding")
    public final boolean enableInListBinding;

    public DbQueryOptConfig() {
        this(false, false, 500);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DbQueryOptConfig)) {
            return false;
        }
        DbQueryOptConfig dbQueryOptConfig = (DbQueryOptConfig) obj;
        return this.enableCountSqlRewrite == dbQueryOptConfig.enableCountSqlRewrite && this.enableInListBinding == dbQueryOptConfig.enableInListBinding && this.chunkSize == dbQueryOptConfig.chunkSize;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enableCountSqlRewrite) * 31) + C786410Ut5.Z2(this.enableInListBinding)) * 31) + this.chunkSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DbQueryOptConfig(enableCountSqlRewrite=");
        sbLIZ.append(this.enableCountSqlRewrite);
        sbLIZ.append(", enableInListBinding=");
        sbLIZ.append(this.enableInListBinding);
        sbLIZ.append(", chunkSize=");
        sbLIZ.append(this.chunkSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DbQueryOptConfig(boolean z, boolean z2, int i) {
        this.enableCountSqlRewrite = z;
        this.enableInListBinding = z2;
        this.chunkSize = i;
    }
}
