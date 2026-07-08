package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class SubscribeSimulcastCommand extends AbstractC1268060j6S implements Serializable {

    @C09CT("subscribe_remote_stream_height")
    public int subscribeRemoteStreamHeight;

    @C09CT("subscribe_remote_stream_width")
    public int subscribeRemoteStreamWidth;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeSimulcastCommand{subscribeRemoteStreamWidth=");
        sbLIZ.append(this.subscribeRemoteStreamWidth);
        sbLIZ.append(", subscribeRemoteStreamHeight=");
        sbLIZ.append(this.subscribeRemoteStreamHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.SUBSCRIBE_SIMULCAST;
    }

    public static SubscribeSimulcastCommand fromHaspMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        try {
            SubscribeSimulcastCommand subscribeSimulcastCommand = new SubscribeSimulcastCommand();
            subscribeSimulcastCommand.parseReportMap(map, map2);
            Object obj = map.get("subscribe_remote_stream_width");
            if (obj != null) {
                subscribeSimulcastCommand.subscribeRemoteStreamWidth = CastIntegerProtector.parseInt(obj.toString());
            }
            Object obj2 = map.get("subscribe_remote_stream_height");
            if (obj2 != null) {
                subscribeSimulcastCommand.subscribeRemoteStreamHeight = CastIntegerProtector.parseInt(obj2.toString());
            }
            return subscribeSimulcastCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
