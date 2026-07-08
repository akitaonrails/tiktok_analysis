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
public class TTLHUpdateFpsResolutionCommand extends AbstractC1268060j6S implements Serializable {

    @C09CT("cap_height")
    public int capHeight;

    @C09CT("cap_width")
    public int capWidth;

    @C09CT("fps")
    public int fps;

    @C09CT("height")
    public int height;

    @C09CT("reason")
    public String reason;

    @C09CT("width")
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHUpdateFpsResolutionCommand{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", capWidth=");
        sbLIZ.append(this.capWidth);
        sbLIZ.append(", capHeight=");
        sbLIZ.append(this.capHeight);
        sbLIZ.append(", reason='");
        sbLIZ.append(this.reason);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.UPDATE_FPS_RESOLUTION;
    }

    public static TTLHUpdateFpsResolutionCommand fromHaspMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        try {
            TTLHUpdateFpsResolutionCommand tTLHUpdateFpsResolutionCommand = new TTLHUpdateFpsResolutionCommand();
            tTLHUpdateFpsResolutionCommand.parseReportMap(map, map2);
            tTLHUpdateFpsResolutionCommand.width = CastIntegerProtector.parseInt(map.get("width").toString());
            tTLHUpdateFpsResolutionCommand.height = CastIntegerProtector.parseInt(map.get("height").toString());
            tTLHUpdateFpsResolutionCommand.fps = CastIntegerProtector.parseInt(map.get("fps").toString());
            if (map.containsKey("reason")) {
                tTLHUpdateFpsResolutionCommand.reason = map.get("reason").toString();
            }
            if (map.containsKey("cap_width")) {
                tTLHUpdateFpsResolutionCommand.capWidth = CastIntegerProtector.parseInt(map.get("cap_width").toString());
            }
            if (map.containsKey("cap_height")) {
                tTLHUpdateFpsResolutionCommand.capHeight = CastIntegerProtector.parseInt(map.get("cap_height").toString());
            }
            return tTLHUpdateFpsResolutionCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
