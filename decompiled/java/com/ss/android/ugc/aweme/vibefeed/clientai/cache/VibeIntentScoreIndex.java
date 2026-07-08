package com.ss.android.ugc.aweme.vibefeed.clientai.cache;

import X.C08XD;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C19719612Di;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.AComparatorS28S0000000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeIntentScoreIndex {

    @C09CT("items")
    public List<IndexItem> items = new ArrayList();

    public static final class IndexItem {

        @C09CT("key")
        public final String storageKey;

        @C09CT("ts")
        public final long timestamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndexItem)) {
                return false;
            }
            IndexItem indexItem = (IndexItem) obj;
            return Intrinsics.LJFF(this.storageKey, indexItem.storageKey) && this.timestamp == indexItem.timestamp;
        }

        public final int hashCode() {
            return (this.storageKey.hashCode() * 31) + C786410Ut5.Y2(this.timestamp);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IndexItem(storageKey=");
            sbLIZ.append(this.storageKey);
            sbLIZ.append(", timestamp=");
            sbLIZ.append(this.timestamp);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public IndexItem() {
            this("", 0L);
        }

        public IndexItem(String str, long j) {
            this.storageKey = str;
            this.timestamp = j;
        }
    }

    public final List LIZ(long j, String str) {
        C19719612Di.LJJIIJ(this.items, new AwS60S1000000_9(str, 9), true);
        this.items.add(new IndexItem(str, j));
        if (this.items.size() <= 200) {
            return C13BV.INSTANCE;
        }
        List<IndexItem> list = this.items;
        if (list.size() > 1) {
            C08XD.LJJ(list, new AComparatorS28S0000000_9(17));
        }
        int size = this.items.size() - 200;
        List listLL = C13LP.LL(this.items, size);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IndexItem) it2.next()).storageKey);
        }
        for (int i = 0; i < size; i++) {
            ListProtector.remove(this.items, 0);
        }
        return arrayList;
    }
}
