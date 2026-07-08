package com.ss.ttlivestreamer.livestreamv2.videoquality.probe.cache;

import X.C09CT;
import X.C1283030jUb;
import X.C1283420jVE;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1283150jUn;
import X.InterfaceC1283430jVF;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BwProbeCacheResult {
    public EnumC1283150jUn LIZ = EnumC1283150jUn.DEFAULT;

    @C09CT("cache_ts")
    public long cacheTs;

    @C09CT("final_net_speed")
    public int finalNetSpeed;

    @C09CT("level")
    public int level;

    @C09CT("loss_rate")
    public double lossRate;

    @C09CT("net_speed")
    public int netSpeed;

    @C09CT("net_type")
    public int netType;

    @C09CT("protocol")
    public int protocol;

    @C09CT("rtt")
    public int rtt;

    public final String LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", this.level);
            jSONObject.put("net_speed", this.netSpeed);
            jSONObject.put("final_net_speed", this.finalNetSpeed);
            jSONObject.put("net_type", this.netType);
            jSONObject.put("cache_ts", this.cacheTs);
            jSONObject.put("protocol", this.protocol);
            jSONObject.put("rtt", this.rtt);
            jSONObject.put("loss_rate", this.lossRate);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1283420jVE c1283420jVE = C1283030jUb.LIZ;
            InterfaceC1283430jVF interfaceC1283430jVF = c1283420jVE.LIZ;
            if (interfaceC1283430jVF != null) {
                interfaceC1283430jVF.LJFF("BwProbeCacheResult.toJsonString", e);
            }
            if (C1283420jVE.LIZ()) {
                throw new AndroidRuntimeException(e);
            }
            InterfaceC1283430jVF interfaceC1283430jVF2 = c1283420jVE.LIZ;
            if (interfaceC1283430jVF2 == null) {
                return "";
            }
            interfaceC1283430jVF2.LIZJ(6, "BwProbeCacheResult", "BwProbeCacheResult.toJsonString:", e);
            return "";
        }
    }

    public BwProbeCacheResult() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BwProbeCacheResult{level=");
        sbLIZ.append(this.level);
        sbLIZ.append(", netSpeed=");
        sbLIZ.append(this.netSpeed);
        sbLIZ.append(", finalNetSpeed=");
        sbLIZ.append(this.finalNetSpeed);
        sbLIZ.append(", netType=");
        sbLIZ.append(this.netType);
        sbLIZ.append(", cacheTs=");
        sbLIZ.append(this.cacheTs);
        sbLIZ.append(", protocol=");
        sbLIZ.append(this.protocol);
        sbLIZ.append(", rtt=");
        sbLIZ.append(this.rtt);
        sbLIZ.append(", lossRate=");
        sbLIZ.append(this.lossRate);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static BwProbeCacheResult LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            BwProbeCacheResult bwProbeCacheResult = new BwProbeCacheResult(jSONObject.optInt("level", 0), jSONObject.optInt("net_speed", 0), jSONObject.optInt("final_net_speed", 0), jSONObject.optInt("net_type", 0), jSONObject.optLong("cache_ts", 0L), jSONObject.optInt("protocol", -1), jSONObject.optInt("rtt", -1), jSONObject.optDouble("loss_rate", -1.0d));
            if (bwProbeCacheResult.level > 0) {
                if (bwProbeCacheResult.finalNetSpeed > 0 || bwProbeCacheResult.netSpeed > 0) {
                    if (bwProbeCacheResult.cacheTs > 0) {
                        return bwProbeCacheResult;
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1283420jVE c1283420jVE = C1283030jUb.LIZ;
            InterfaceC1283430jVF interfaceC1283430jVF = c1283420jVE.LIZ;
            if (interfaceC1283430jVF != null) {
                interfaceC1283430jVF.LJFF("BwProbeCacheResult.fromJsonString", e);
            }
            if (!C1283420jVE.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BwProbeCacheResult.fromJsonString:");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1283430jVF interfaceC1283430jVF2 = c1283420jVE.LIZ;
                if (interfaceC1283430jVF2 != null) {
                    interfaceC1283430jVF2.LIZJ(6, "BwProbeCacheResult", strLIZIZ, e);
                    return null;
                }
                return null;
            }
            throw new AndroidRuntimeException(e);
        }
    }

    public BwProbeCacheResult(int i, int i2, int i3, int i4, long j, int i5, int i6, double d) {
        this.level = i;
        this.netSpeed = i2;
        this.finalNetSpeed = i3;
        this.netType = i4;
        this.cacheTs = j;
        this.protocol = i5;
        this.rtt = i6;
        this.lossRate = d;
    }
}
