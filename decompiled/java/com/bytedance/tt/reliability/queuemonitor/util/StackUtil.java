package com.bytedance.tt.reliability.queuemonitor.util;

import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.queuemonitor.model.StackInfo;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class StackUtil {
    public static final StackUtil INSTANCE = new StackUtil();

    public final StackInfo capture$arm_release(List<String> list) {
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stackTraceElement.getClassName());
            sbLIZ.append('.');
            sbLIZ.append((Object) stackTraceElement.getMethodName());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str, it2.next(), false)) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        Iterator it3 = arrayList2.iterator();
        long jHashCode = 1125899906842624L;
        while (it3.hasNext()) {
            jHashCode = (jHashCode * 1315423911) + ((long) ((String) it3.next()).hashCode());
        }
        return new StackInfo(jHashCode, C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, null, 62));
    }
}
