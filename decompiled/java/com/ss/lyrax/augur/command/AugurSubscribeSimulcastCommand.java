package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurSubscribeSimulcastCommand extends AbsAugurCommand implements Serializable {

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

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.SUBSCRIBE_SIMULCAST;
    }

    public static AugurSubscribeSimulcastCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            AugurSubscribeSimulcastCommand augurSubscribeSimulcastCommand = new AugurSubscribeSimulcastCommand();
            augurSubscribeSimulcastCommand.parseReportMap(jSONObject, jSONObject2);
            augurSubscribeSimulcastCommand.subscribeRemoteStreamWidth = jSONObject.optInt("subscribe_remote_stream_width", 0);
            augurSubscribeSimulcastCommand.subscribeRemoteStreamHeight = jSONObject.optInt("subscribe_remote_stream_height", 0);
            return augurSubscribeSimulcastCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
