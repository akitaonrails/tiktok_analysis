package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlResp;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.depend.model.live._MsgNotifyQuota_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._NotifyFCConfig_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyControlResp_Data_ProtoDecoder implements C0IMD<MsgNotifyControlResp.Data> {
    public static MsgNotifyControlResp.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyControlResp.Data data = new MsgNotifyControlResp.Data();
        data.quotaConfig = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.refreshMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        data.notifyFcConfig = _NotifyFCConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    MsgNotifyQuota msgNotifyQuotaLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                msgNotifyQuotaLIZLLL = _MsgNotifyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (msgNotifyQuotaLIZLLL != null) {
                            data.quotaConfig.put(lValueOf, msgNotifyQuotaLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(MsgNotifyControlResp.Data data) {
        Map<Long, MsgNotifyQuota> map = data.quotaConfig;
        if (map == null) {
            data.quotaConfig = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, MsgNotifyQuota>> it2 = data.quotaConfig.entrySet().iterator();
            while (it2.hasNext()) {
                MsgNotifyQuota value = it2.next().getValue();
                if (value != null && value.positionCountMap == null) {
                    value.positionCountMap = new HashMap();
                }
            }
        }
        NotifyFCConfig notifyFCConfig = data.notifyFcConfig;
        if (notifyFCConfig != null) {
            _NotifyFCConfig_ProtoDecoder.LJ(notifyFCConfig);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MsgNotifyControlResp.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final MsgNotifyControlResp.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyControlResp.Data data, List list) {
    }
}
