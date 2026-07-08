package com.ss.android.ugc.aweme.rich.reward.preload;

import X.C1031490cwt;
import X.C1032930czD;
import X.InterfaceC1033150czZ;
import X.InterfaceC1033840d0g;
import Y.ARunnableS4S1201000_16;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.rich.reward.IGmtRewardAdPreloadFactory;
import com.ss.android.ugc.aweme.rich.reward.experiment.RewardPreloadStrategy;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardADPreloadFactoryImpl implements IGmtRewardAdPreloadFactory {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0czD] */
    @Override // com.ss.android.ugc.aweme.rich.reward.IGmtRewardAdPreloadFactory
    public final C1032930czD LIZ(InterfaceC1033150czZ interfaceC1033150czZ, C1031490cwt c1031490cwt) {
        return new InterfaceC1033840d0g(interfaceC1033150czZ, c1031490cwt) { // from class: X.0czD
            public final InterfaceC1033150czZ LL;

            @Override // X.InterfaceC1033840d0g
            public boolean hasPreloadAd(HashMap<String, Object> map) {
                String string;
                Object obj;
                if (map == null || map.isEmpty() || !((Boolean) C1032880cz8.LIZJ.getValue()).booleanValue()) {
                    return false;
                }
                String string2 = null;
                if (map != null && (obj = map.get("cache_key")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                    if (map != null) {
                    }
                    return C1032880cz8.LJ(string, string2);
                }
                Object obj2 = map.get("ad_id");
                if (obj2 != null) {
                    string2 = obj2.toString();
                }
                return C1032880cz8.LJ(string, string2);
            }

            @Override // X.InterfaceC1033840d0g
            public void preload(List<? extends HashMap<String, Object>> list) {
                int iIntValue;
                int iIntValue2;
                Integer num;
                Integer num2;
                Integer num3;
                Integer num4;
                InterfaceC1033150czZ interfaceC1033150czZ2 = this.LL;
                if (((Boolean) C1032880cz8.LIZJ.getValue()).booleanValue()) {
                    int i = 0;
                    if (list != null && !list.isEmpty()) {
                        RewardPreloadStrategy rewardPreloadStrategy = C1033520d0A.LIZ;
                        if (rewardPreloadStrategy != null && (num3 = rewardPreloadStrategy.strategy) != null && num3.intValue() != 0) {
                            int iIntValue3 = 2;
                            if (0 == 0) {
                                ((ConcurrentLinkedQueue) C1032880cz8.LJFF.getValue()).addAll(list);
                                int size = list.size();
                                RewardPreloadStrategy rewardPreloadStrategy2 = C1033520d0A.LIZ;
                                if (rewardPreloadStrategy2 != null && (num4 = rewardPreloadStrategy2.concurrentRequestCount) != null && num4.intValue() > 0 && (iIntValue3 = num4.intValue()) <= 0) {
                                    return;
                                }
                                do {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("preloadTask-");
                                    sbLIZ.append(i);
                                    C1032880cz8.LIZIZ(size, interfaceC1033150czZ2, C2188811AlT.LIZIZ(sbLIZ));
                                    i++;
                                } while (i < iIntValue3);
                                return;
                            }
                        }
                        int size2 = list.size();
                        if (size2 <= 0) {
                            return;
                        }
                        do {
                            HashMap map = (HashMap) ListProtector.get(list, i);
                            HashMap mapLIZ = C1032880cz8.LIZ(map.get("common_params"));
                            HashMap mapLIZ2 = C1032880cz8.LIZ(map.get("request_params"));
                            String str = (String) mapLIZ.get("ad_id");
                            String str2 = (String) mapLIZ.get("cache_key");
                            RewardPreloadStrategy rewardPreloadStrategy3 = C1033520d0A.LIZ;
                            if (rewardPreloadStrategy3 != null && (num2 = rewardPreloadStrategy3.concurrentRequestCount) != null && num2.intValue() > 0) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 2;
                            }
                            RewardPreloadStrategy rewardPreloadStrategy4 = C1033520d0A.LIZ;
                            if (rewardPreloadStrategy4 != null && (num = rewardPreloadStrategy4.requestInterval) != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 1;
                            }
                            if (!C1032880cz8.LJ(str2, str)) {
                                C786410Ut5.LJLIIL(((long) (i / iIntValue)) * 1000 * ((long) iIntValue2), (Handler) C1032880cz8.LJ.getValue(), new ARunnableS4S1201000_16(mapLIZ2, str2, size2, interfaceC1033150czZ2, 2));
                            }
                            i++;
                        } while (i < size2);
                    }
                }
            }

            {
                this.LL = interfaceC1033150czZ;
                if (c1031490cwt != null) {
                    C1033520d0A.LIZ = c1031490cwt.LIZ;
                }
            }
        };
    }
}
