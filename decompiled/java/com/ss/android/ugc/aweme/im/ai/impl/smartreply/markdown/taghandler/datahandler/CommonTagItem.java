package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommonTagItem {

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonTagItem)) {
            return false;
        }
        CommonTagItem commonTagItem = (CommonTagItem) obj;
        return Intrinsics.LJFF(this.schema, commonTagItem.schema) && Intrinsics.LJFF(this.extra, commonTagItem.extra) && Intrinsics.LJFF(this.title, commonTagItem.title) && Intrinsics.LJFF(this.type, commonTagItem.type);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.extra;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonTagItem(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommonTagItem(String str, Map<String, ? extends Object> map, String str2, String str3) {
        this.schema = str;
        this.extra = map;
        this.title = str2;
        this.type = str3;
    }
}
