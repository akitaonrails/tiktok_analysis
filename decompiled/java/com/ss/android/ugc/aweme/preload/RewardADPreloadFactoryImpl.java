package com.ss.android.ugc.aweme.preload;

import X.C1032920czC;
import X.InterfaceC1033130czX;
import X.InterfaceC1033840d0g;
import Y.ARunnableS4S1201000_16;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IRewardAdPreloadFactory;
import com.ss.android.ugc.aweme.rich.reward.experiment.RewardPreloadStrategy;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardADPreloadFactoryImpl implements IRewardAdPreloadFactory {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0czC] */
    @Override // com.ss.android.ugc.aweme.IRewardAdPreloadFactory
    public final C1032920czC LIZ(InterfaceC1033130czX interfaceC1033130czX) {
        return new InterfaceC1033840d0g(interfaceC1033130czX) { // from class: X.0czC
            public final InterfaceC1033130czX LL;

            public final InterfaceC1033130czX getHostDelegate() {
                return this.LL;
            }

            {
                this.LL = interfaceC1033130czX;
            }

            @Override // X.InterfaceC1033840d0g
            public boolean hasPreloadAd(HashMap<String, Object> map) {
                String string;
                Object obj;
                if (map == null || map.isEmpty()) {
                    return false;
                }
                C1032890cz9.LIZ.getClass();
                if (!((Boolean) C1032890cz9.LIZLLL.getValue()).booleanValue()) {
                    return false;
                }
                String string2 = null;
                if (map != null && (obj = map.get("cache_key")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                    if (map != null) {
                    }
                    return C1032890cz9.LJ(string, string2);
                }
                Object obj2 = map.get("ad_id");
                if (obj2 != null) {
                    string2 = obj2.toString();
                }
                return C1032890cz9.LJ(string, string2);
            }

            @Override // X.InterfaceC1033840d0g
            public void preload(List<? extends HashMap<String, Object>> list) {
                int iIntValue;
                int iIntValue2;
                Integer num;
                Integer num2;
                Integer num3;
                Integer num4;
                C1032890cz9 c1032890cz9 = C1032890cz9.LIZ;
                InterfaceC1033130czX interfaceC1033130czX2 = this.LL;
                c1032890cz9.getClass();
                if (!((Boolean) C1032890cz9.LIZLLL.getValue()).booleanValue()) {
                    C625790Ogb.LIZ();
                    return;
                }
                int i = 0;
                if (list != null && !list.isEmpty()) {
                    RewardPreloadStrategy rewardPreloadStrategyLIZ = C1033060czQ.LIZ();
                    if (rewardPreloadStrategyLIZ != null && (num3 = rewardPreloadStrategyLIZ.strategy) != null && num3.intValue() != 0) {
                        int iIntValue3 = 2;
                        if (0 == 0) {
                            ((ConcurrentLinkedQueue) C1032890cz9.LJI.getValue()).addAll(list);
                            int size = list.size();
                            RewardPreloadStrategy rewardPreloadStrategyLIZ2 = C1033060czQ.LIZ();
                            if (rewardPreloadStrategyLIZ2 != null && (num4 = rewardPreloadStrategyLIZ2.concurrentRequestCount) != null && num4.intValue() > 0 && (iIntValue3 = num4.intValue()) <= 0) {
                                return;
                            }
                            do {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preloadTask-");
                                sbLIZ.append(i);
                                C1032890cz9.LIZIZ(size, interfaceC1033130czX2, C2188811AlT.LIZIZ(sbLIZ));
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
                        HashMap mapLIZ = C1032890cz9.LIZ(map.get("common_params"));
                        HashMap mapLIZ2 = C1032890cz9.LIZ(map.get("request_params"));
                        String str = (String) mapLIZ.get("ad_id");
                        String str2 = (String) mapLIZ.get("cache_key");
                        RewardPreloadStrategy rewardPreloadStrategyLIZ3 = C1033060czQ.LIZ();
                        if (rewardPreloadStrategyLIZ3 != null && (num2 = rewardPreloadStrategyLIZ3.concurrentRequestCount) != null && num2.intValue() > 0) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 2;
                        }
                        RewardPreloadStrategy rewardPreloadStrategyLIZ4 = C1033060czQ.LIZ();
                        if (rewardPreloadStrategyLIZ4 != null && (num = rewardPreloadStrategyLIZ4.requestInterval) != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 1;
                        }
                        if (!C1032890cz9.LJ(str2, str)) {
                            C786410Ut5.LJLIIL(((long) (i / iIntValue)) * 1000 * ((long) iIntValue2), (Handler) C1032890cz9.LJFF.getValue(), new ARunnableS4S1201000_16(mapLIZ2, str2, size2, interfaceC1033130czX2, 0));
                        }
                        i++;
                    } while (i < size2);
                    return;
                }
                C625790Ogb.LIZ();
            }
        };
    }
}
