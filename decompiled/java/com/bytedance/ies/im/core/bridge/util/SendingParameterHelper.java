package com.bytedance.ies.im.core.bridge.util;

import X.C786410Ut5;
import X.C869590Y9l;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SendingParameterHelper implements ISendingParameterHelper {
    public static final SendingParameterHelper LIZ = new SendingParameterHelper();
    public static final Map<String, Bundle> LIZIZ = new ConcurrentHashMap();

    public static final class Service implements ISendingParameterHelper {
        public final /* synthetic */ SendingParameterHelper LIZ = SendingParameterHelper.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
        public final String LIZ(String str, String str2) {
            return this.LIZ.LIZ(str, "process_id");
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
        public final void LIZIZ(String str, String str2, String str3) {
            this.LIZ.LIZIZ(str, str2, str3);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
        public final void LIZJ(C869590Y9l c869590Y9l) {
            this.LIZ.LIZJ(c869590Y9l);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
    public final void LIZJ(C869590Y9l c869590Y9l) {
        String localExtValue;
        if (c869590Y9l == null || (localExtValue = c869590Y9l.getLocalExtValue("process_id")) == null || localExtValue.length() == 0) {
            return;
        }
        Iterator it2 = ((ConcurrentHashMap) LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(localExtValue, ((BaseBundle) ((Map.Entry) it2.next()).getValue()).getString("process_id"))) {
                it2.remove();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
    public final String LIZ(String str, String str2) {
        BaseBundle baseBundle;
        if (str != null && str.length() != 0 && str2.length() != 0) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
            if (concurrentHashMap.containsKey(str) && (baseBundle = (BaseBundle) concurrentHashMap.get(str)) != null) {
                return baseBundle.getString(str2);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper
    public final void LIZIZ(String str, String str2, String str3) {
        if (str != null && str.length() != 0 && str2.length() != 0 && str3 != null && str3.length() != 0) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
            if (concurrentHashMap.containsKey(str)) {
                Bundle bundle = (Bundle) concurrentHashMap.get(str);
                if (bundle != null) {
                    C786410Ut5.LJJJI(str2, str3, bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI(str2, str3, bundle2);
            concurrentHashMap.put(str, bundle2);
        }
    }
}
