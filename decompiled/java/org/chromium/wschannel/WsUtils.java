package org.chromium.wschannel;

import X.C1494230ozF;
import X.C2088908Gh;
import X.C2188811AlT;
import X.C838730WvH;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class WsUtils {
    public static int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 6;
        }
        return i;
    }

    public static void loadCronetKernel() {
        try {
            if (C1494230ozF.LJIL) {
                TTNetInit.getInitCompletedLatch();
                TTNetInit.preInitCronetKernel();
            } else {
                Object objNewInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
                Reflect.on(objNewInstance).call("getInitCompletedLatch");
                Reflect.on(objNewInstance).call("preInitCronetKernel");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logger.debug();
        }
    }

    public static String[] constructMessageMetaInfo(WsChannelMsg wsChannelMsg) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("method_id");
        arrayList.add(String.valueOf(wsChannelMsg.method));
        if (!TextUtils.isEmpty(wsChannelMsg.payloadType)) {
            arrayList.add("payload_type");
            arrayList.add(wsChannelMsg.payloadType);
        }
        if (!TextUtils.isEmpty(wsChannelMsg.payloadEncoding)) {
            arrayList.add("payload_encoding");
            arrayList.add(wsChannelMsg.payloadEncoding);
        }
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
        if (list == null) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        for (WsChannelMsg.MsgHeader msgHeader : list) {
            if (!TextUtils.isEmpty(msgHeader.key) && !TextUtils.isEmpty(msgHeader.value)) {
                arrayList.add(msgHeader.key);
                arrayList.add(msgHeader.value);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static String getCookieHeader(URI uri) {
        ?? r2 = 0;
        ?? r22 = 0;
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                r2 = cookieHandler.get(uri, map);
                r22 = r2;
            }
            if (r22 != 0 && !r22.isEmpty()) {
                for (Map.Entry entry : r22.entrySet()) {
                    if ("cookie".equalsIgnoreCase((String) entry.getKey()) && !((List) entry.getValue()).isEmpty()) {
                        int i = 0;
                        for (String str : (List) entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str);
                            i++;
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return r2;
        }
    }

    public static boolean isFrontierDomainEnabled(String str) {
        boolean zContains = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if ("/".equals(uri.getPath())) {
                return false;
            }
            String host = uri.getHost();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = C838730WvH.LIZ;
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            zContains = C838730WvH.LIZ.contains(host);
            return zContains;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zContains;
        }
    }

    public static URI parsePrivateProtocolUrl(String str) {
        URI uriLJ = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (str.startsWith("wss:")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https:");
                sbLIZ.append(str.substring(4));
                str = C2188811AlT.LIZIZ(sbLIZ);
            } else if (str.startsWith("ws:")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("http:");
                sbLIZ2.append(str.substring(3));
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            uriLJ = C2088908Gh.LJ(str);
            return uriLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return uriLJ;
        }
    }

    public static WsChannelMsg constructWsChannelMsg(int i, Map<String, String> map, byte[] bArr) {
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.service = i;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                if (entry.getKey().equalsIgnoreCase("method_id")) {
                    try {
                        wsChannelMsg.method = CastIntegerProtector.valueOf(entry.getValue()).intValue();
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (entry.getKey().equalsIgnoreCase("payload_encoding")) {
                    wsChannelMsg.payloadEncoding = entry.getValue();
                } else if (entry.getKey().equalsIgnoreCase("payload_type")) {
                    wsChannelMsg.payloadType = entry.getValue();
                } else if (entry.getKey().equalsIgnoreCase("msg_id")) {
                    wsChannelMsg.msgId = entry.getValue();
                } else if (entry.getKey().equalsIgnoreCase("server_timing")) {
                    wsChannelMsg.serverTiming = entry.getValue();
                } else {
                    WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                    msgHeader.key = entry.getKey();
                    msgHeader.value = entry.getValue();
                    arrayList.add(msgHeader);
                }
            }
        }
        wsChannelMsg.msgHeaders = arrayList;
        wsChannelMsg.payload = bArr;
        if (wsChannelMsg.payloadEncoding == null) {
            wsChannelMsg.payloadEncoding = "";
        }
        if (wsChannelMsg.payloadType == null) {
            wsChannelMsg.payloadType = "";
        }
        return wsChannelMsg;
    }
}
