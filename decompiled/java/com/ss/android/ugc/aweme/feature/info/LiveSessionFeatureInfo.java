package com.ss.android.ugc.aweme.feature.info;

import X.C13LP;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveSessionFeatureInfo extends MemoryFeatureInfo {
    public static int putCount;
    public static int putIndex;
    public final int putIndex$1;
    public final String roomId;
    public static final Companion Companion = new Companion();
    public static final ConcurrentHashMap<String, LiveSessionFeatureInfo> infoCache = new ConcurrentHashMap<>(24);
    public static final CopyOnWriteArrayList<String> roomIdList = new CopyOnWriteArrayList<>();

    public static final class Companion {
        private final void clearOnce() {
            int i = (LiveSessionFeatureInfo.putIndex - 24) + 8;
            ConcurrentHashMap<String, LiveSessionFeatureInfo> concurrentHashMap = LiveSessionFeatureInfo.infoCache;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, LiveSessionFeatureInfo> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().getPutIndex() < i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(linkedHashMap.keySet());
            LiveSessionFeatureInfo.infoCache.keySet().removeAll(setLLIIJI);
            LiveSessionFeatureInfo.roomIdList.removeAll(setLLIIJI);
            LiveSessionFeatureInfo.putCount -= setLLIIJI.size();
        }

        public final LiveSessionFeatureInfo getOrPut(String str) {
            ConcurrentHashMap<String, LiveSessionFeatureInfo> concurrentHashMap = LiveSessionFeatureInfo.infoCache;
            LiveSessionFeatureInfo liveSessionFeatureInfo = concurrentHashMap.get(str);
            if (liveSessionFeatureInfo != null) {
                return liveSessionFeatureInfo;
            }
            LiveSessionFeatureInfo liveSessionFeatureInfo2 = new LiveSessionFeatureInfo(str, LiveSessionFeatureInfo.putIndex);
            concurrentHashMap.put(str, liveSessionFeatureInfo2);
            LiveSessionFeatureInfo.roomIdList.add(str);
            LiveSessionFeatureInfo.putCount++;
            LiveSessionFeatureInfo.putIndex++;
            if (LiveSessionFeatureInfo.putCount >= 24) {
                LiveSessionFeatureInfo.Companion.clearOnce();
            }
            return liveSessionFeatureInfo2;
        }

        public final LiveSessionFeatureInfo obtain(String str) {
            ConcurrentHashMap<String, LiveSessionFeatureInfo> concurrentHashMap = LiveSessionFeatureInfo.infoCache;
            if (str == null) {
                return null;
            }
            return concurrentHashMap.get(str);
        }

        public final List<LiveSessionFeatureInfo> obtainRecentInfoList(int i) {
            int size;
            ArrayList arrayList = new ArrayList();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = LiveSessionFeatureInfo.roomIdList;
            if (i < copyOnWriteArrayList.size()) {
                size = copyOnWriteArrayList.size() - i;
            } else {
                size = 0;
            }
            Iterator<String> it2 = copyOnWriteArrayList.subList(size, copyOnWriteArrayList.size()).iterator();
            while (it2.hasNext()) {
                LiveSessionFeatureInfo liveSessionFeatureInfo = LiveSessionFeatureInfo.infoCache.get(it2.next());
                if (liveSessionFeatureInfo != null) {
                    arrayList.add(liveSessionFeatureInfo);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveSession(featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getPutIndex() {
        return this.putIndex$1;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public LiveSessionFeatureInfo(String str, int i) {
        this.roomId = str;
        this.putIndex$1 = i;
    }
}
