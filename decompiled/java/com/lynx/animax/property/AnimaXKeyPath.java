package com.lynx.animax.property;

import X.C2188811AlT;
import com.lynx.animax.base.bridge.JavaOnlyArray;
import com.lynx.animax.util.AnimaXLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXKeyPath {
    public final JavaOnlyArray LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyPath{keys=");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.LIZ) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        sbLIZ.append(arrayList.toString());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JavaOnlyArray getKeys() {
        return this.LIZ;
    }

    public AnimaXKeyPath(String... strArr) {
        this.LIZ = new JavaOnlyArray();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                this.LIZ.pushString(str);
            } else {
                AnimaXLog.LIZIZ("AnimaXKeyPath", "AnimaXKeyPath received a null or empty key, which will be ignored.");
            }
        }
    }

    public AnimaXKeyPath(JavaOnlyArray javaOnlyArray) {
        this.LIZ = javaOnlyArray;
    }
}
