package com.ss.ugc.live.sdk.message.data;

import X.C2188811AlT;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class ProtoApiResult {
    public String compressType;
    public String cursor;
    public long delayTimeBeforeDispatch;
    public long dimension;
    public long enterUniqueId;
    public Map<String, Object> extraParams;
    public long fetchInterval;
    public int fetchType;
    public FullLinkTrack fullLinkTrack;
    public long heartbeatDuration;
    public String historyCommentCursor;
    public boolean historyNoMore;
    public String internalExt;
    public boolean isFirst;
    public long logId;
    public int messageFrom;
    public List<IMessage> messages;
    public boolean needAck;
    public long now;
    public String payloadType;
    public List<ProtoMessage> protoMessages;
    public String pushServer;
    public long receiveMessageTime;
    public long roomIdInHeader;
    public Map<String, String> routeParams;

    public static final class ProtoMessage {
        public boolean isHistoryMsg;
        public String method;
        public long msgId;
        public int msgType;
        public byte[] payload;
        public int sampleFlag;
    }

    public String getFormatRouteParams() {
        if (this.routeParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.routeParams.entrySet()) {
            if (entry != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getKey());
                sbLIZ.append("=");
                sbLIZ.append(entry.getValue());
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return TextUtils.join("&", arrayList);
    }

    public String getFormatAckInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("log id is ");
        sbLIZ.append(this.logId);
        sbLIZ.append(", internal ext is ");
        sbLIZ.append(this.internalExt);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
