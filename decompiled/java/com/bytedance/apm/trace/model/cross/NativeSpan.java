package com.bytedance.apm.trace.model.cross;

import X.AbstractC794540VEu;
import X.C2188811AlT;
import X.C794740VFo;
import X.InterfaceC794710VFl;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class NativeSpan {
    public long finishTime;
    public boolean isErrorSpan;
    public boolean isFinish;
    public String parentId;
    public String referenceId;
    public String spanId;
    public String spanName;
    public long startTime;
    public Map<String, String> tags;
    public String threadName;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NativeSpan{, spanName='");
        sbLIZ.append(this.spanName);
        sbLIZ.append('\'');
        sbLIZ.append(", spanId=");
        sbLIZ.append(this.spanId);
        sbLIZ.append(", parentId=");
        sbLIZ.append(this.parentId);
        sbLIZ.append(", referenceId=");
        sbLIZ.append(this.referenceId);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", finishTime=");
        sbLIZ.append(this.finishTime);
        sbLIZ.append(", threadName='");
        sbLIZ.append(this.threadName);
        sbLIZ.append('\'');
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(", isErrorSpan=");
        sbLIZ.append(this.isErrorSpan);
        sbLIZ.append(", isFinish=");
        sbLIZ.append(this.isFinish);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public InterfaceC794710VFl parseToSpan(AbstractC794540VEu abstractC794540VEu) {
        if (!this.isFinish) {
            return null;
        }
        String str = this.spanName;
        long j = CastLongProtector.parseLong(this.spanId);
        abstractC794540VEu.getClass();
        C794740VFo c794740VFo = new C794740VFo(str, abstractC794540VEu, j);
        String str2 = this.parentId;
        if (str2 != null && !str2.isEmpty()) {
            c794740VFo.LIZLLL = this.parentId;
        }
        String str3 = this.referenceId;
        if (str3 != null && !str3.isEmpty()) {
            c794740VFo.LJ = this.referenceId;
        }
        c794740VFo.LJI = this.threadName;
        for (Map.Entry<String, String> entry : this.tags.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC794540VEu abstractC794540VEu2 = c794740VFo.LJFF;
            if (!((CopyOnWriteArrayList) abstractC794540VEu2.LIZLLL).contains(key)) {
                ((CopyOnWriteArrayList) abstractC794540VEu2.LIZLLL).add(key);
            }
            if (c794740VFo.LJII == null) {
                c794740VFo.LJII = new HashMap();
            }
            if (TextUtils.equals(key, "error")) {
                c794740VFo.LJIIIIZZ = true;
            }
            ((HashMap) c794740VFo.LJII).put(key, value);
        }
        return c794740VFo;
    }

    public NativeSpan(String str, String str2, String str3, String str4, long j, long j2, String str5, HashMap<String, String> map, boolean z, boolean z2) {
        this.spanName = str;
        this.spanId = str2;
        this.parentId = str3;
        this.referenceId = str4;
        this.startTime = j;
        this.finishTime = j2;
        this.threadName = str5;
        this.tags = map;
        this.isErrorSpan = z;
        this.isFinish = z2;
    }
}
