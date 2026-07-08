package com.bytedance.lynx.hybrid.ssr.cache;

import X.C1154850g9r;
import X.C1537480q70;
import X.C1539530qAJ;
import X.C1539620qAS;
import X.C1539670qAX;
import X.C1539820qAm;
import X.C1C7U;
import X.C2188811AlT;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class SSRCacheManager {
    public static final SSRCacheManager LIZ = new SSRCacheManager();
    public static final SSRCacheManager$handler$1 LIZIZ;
    public static final Map<String, List<Function2<C1539820qAm, Throwable, Unit>>> LIZJ;
    public static final Map<String, C1539820qAm> LIZLLL;
    public static final Map<String, C1154850g9r> LJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager$handler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LIZIZ = new BPEAHandler(mainLooper) { // from class: com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("SSRCacheManager@bec1.handler$1");
                super.handleMessage(message);
                if (message.what == 1000001) {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    Map<String, List<Function2<C1539820qAm, Throwable, Unit>>> map = SSRCacheManager.LIZJ;
                    if (map.containsKey(messageObj)) {
                        map.remove(messageObj);
                    }
                    Map<String, C1539820qAm> map2 = SSRCacheManager.LIZLLL;
                    if (map2.containsKey(messageObj)) {
                        map2.remove(messageObj);
                    }
                    Map<String, C1154850g9r> map3 = SSRCacheManager.LJ;
                    if (map3.containsKey(messageObj)) {
                        map3.remove(messageObj);
                    }
                }
                C1C7U.LIZIZ("SSRCacheManager@bec1.handler$1");
            }
        };
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashMap();
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(a0.LJLIIIL(str).toString());
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(Context context, String str, Map map, int i, C1537480q70 c1537480q70, SparkSchemaParam sparkSchemaParam, long j) {
        int iIntValue = i;
        String globalPropsAllowList = null;
        if (sparkSchemaParam != null) {
            String ssrUrl = sparkSchemaParam.getSsrUrl();
            if (sparkSchemaParam != null) {
                Integer ssrMode = sparkSchemaParam.getSsrMode();
                if (ssrMode != null) {
                    iIntValue = ssrMode.intValue();
                } else {
                    iIntValue = 1;
                }
                globalPropsAllowList = sparkSchemaParam.getGlobalPropsAllowList();
            }
            if (ssrUrl != null && ssrUrl.length() != 0) {
                SSRCacheManager$handler$1 sSRCacheManager$handler$1 = LIZIZ;
                sSRCacheManager$handler$1.removeMessages(1000001);
                Message message = new Message();
                message.what = 1000001;
                LIZ.getClass();
                message.obj = LIZ(ssrUrl, str);
                sSRCacheManager$handler$1.sendMessageDelayed(message, ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j);
                C1539620qAS c1539620qAS = C1539620qAS.LIZ;
                String strLJIJI = c1537480q70.LJIJI();
                if (iIntValue != 0) {
                    c1539620qAS.getClass();
                    if (iIntValue == 1 && C1539620qAS.LIZJ(c1537480q70, strLJIJI)) {
                        return;
                    }
                } else {
                    c1539620qAS.getClass();
                    if (C1539620qAS.LIZIZ(ssrUrl, str)) {
                        return;
                    }
                }
                String strLIZ = LIZ(ssrUrl, str);
                ArrayList arrayList = new ArrayList();
                LIZJ.put(strLIZ, arrayList);
                C1539530qAJ c1539530qAJ = C1539530qAJ.LIZ;
                boolean appendCommonParams = sparkSchemaParam.getAppendCommonParams();
                C1539670qAX c1539670qAX = new C1539670qAX(arrayList, strLIZ, str);
                c1539530qAJ.getClass();
                LJ.put(strLIZ, C1539530qAJ.LJ(context, ssrUrl, map, globalPropsAllowList, appendCommonParams, c1537480q70, sparkSchemaParam, null, c1539670qAX));
            }
        }
    }
}
