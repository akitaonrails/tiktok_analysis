package com.ss.android.ugc.aweme.application.bootfinish;

import X.AnonymousClass1466;
import X.AnonymousClass1468;
import X.AnonymousClass1469;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.lego.wrapper.ITaskExecutorApi;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class TaskExecutorImpl implements ITaskExecutorApi {
    public final String LIZ = "boot_finish_task_";

    @Override // com.ss.android.ugc.aweme.lego.wrapper.ITaskExecutorApi
    public final void LIZ(String str) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, AnonymousClass1469> concurrentHashMap = AnonymousClass1468.LIZJ;
        AnonymousClass1469 anonymousClass1469 = concurrentHashMap.get(strLIZIZ);
        if (anonymousClass1469 != null) {
            concurrentHashMap.put(strLIZIZ, new AnonymousClass1469(anonymousClass1469.LIZ, anonymousClass1469.LIZIZ, anonymousClass1469.LIZJ, 1, 1, anonymousClass1469.LJFF, 0, anonymousClass1469.LJII, anonymousClass1469.LJIIIIZZ));
        } else {
            concurrentHashMap.put(strLIZIZ, new AnonymousClass1469(strLIZIZ, 0L, 0L, 1, 1, 0, 0, 0L, C786410Ut5.u3().getName()));
        }
        AnonymousClass1469 anonymousClass14692 = concurrentHashMap.get(strLIZIZ);
        if (anonymousClass14692 != null) {
            AnonymousClass1466.LIZ(anonymousClass14692, false);
        }
    }
}
