package com.ss.bytertc.engine.avclient;

import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LyraxAVBusinessPayload {
    public String content;
    public Map<String, ? extends Object> ext;
    public String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVBusinessPayload)) {
            return false;
        }
        LyraxAVBusinessPayload lyraxAVBusinessPayload = (LyraxAVBusinessPayload) obj;
        return Intrinsics.LJFF(this.type, lyraxAVBusinessPayload.type) && Intrinsics.LJFF(this.content, lyraxAVBusinessPayload.content) && Intrinsics.LJFF(this.ext, lyraxAVBusinessPayload.ext);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.content.hashCode()) * 31) + this.ext.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVBusinessPayload(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAVBusinessPayload() {
        this("", "", C2097608Jq.LJ());
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setExt(Map<String, ? extends Object> map) {
        this.ext = map;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public LyraxAVBusinessPayload(String str, String str2, Map<String, ? extends Object> map) {
        this.type = str;
        this.content = str2;
        this.ext = map;
    }
}
