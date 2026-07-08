package com.ss.android.ugc.aweme.live.consumefeature;

import X.C01GW;
import X.C09CT;
import X.C0J0Q;
import X.C1161920gLG;
import X.C15438062q;
import X.C2099208Kg;
import X.C2188811AlT;
import X.C293501Bt;
import X.C452501pT;
import X.C469170IaZ;
import X.C469190Iab;
import X.EnumC452301pR;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveConsumeFeatureManager {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C469190Iab());
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C01GW LIZLLL;
    public static final CopyOnWriteArrayList<ConsumeInfo> LJ;
    public static final C2099208Kg<String, ConsumeInfo> LJFF;

    public static final class ConsumeInfo implements Serializable {

        @C09CT("ap")
        public int isAlreadyPlay;

        @C09CT("ip")
        public int isPreview;

        @C09CT("ri")
        public String roomId;

        public ConsumeInfo() {
            this("", 0, 0);
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final int isAlreadyPlay() {
            return this.isAlreadyPlay;
        }

        public final int isPreview() {
            return this.isPreview;
        }

        public final void setAlreadyPlay(int i) {
            this.isAlreadyPlay = i;
        }

        public final void setPreview(int i) {
            this.isPreview = i;
        }

        public final void setRoomId(String str) {
            this.roomId = str;
        }

        public ConsumeInfo(String str, int i, int i2) {
            this.roomId = str;
            this.isPreview = i;
            this.isAlreadyPlay = i2;
        }
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C469170IaZ());
        LIZLLL = c01gwLIZIZ;
        LJ = new CopyOnWriteArrayList<>();
        LJFF = new C2099208Kg<>(((Number) c01gwLIZIZ.getValue()).intValue());
    }

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZLLL() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LJFF.values());
        arrayList.addAll(LJ);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(GsonProtectorUtils.toJson(C293501Bt.LIZ(), it2.next()));
        }
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).bg(C0J0Q.APP, "recent_live_consume_record", arrayList, "recommendation_server", false);
    }

    public static void LIZIZ(int i, long j) {
        ConsumeInfo consumeInfo = new ConsumeInfo(String.valueOf(j), i, 1);
        C2099208Kg<String, ConsumeInfo> c2099208Kg = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(i);
        c2099208Kg.put(C2188811AlT.LIZIZ(sbLIZ), consumeInfo);
        LIZLLL();
        LIZIZ = true;
    }

    public static void LIZJ(int i, List list) {
        LJ.clear();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LJ.add(new ConsumeInfo(String.valueOf(((Number) it2.next()).longValue()), i, 0));
            }
        }
        CopyOnWriteArrayList<ConsumeInfo> copyOnWriteArrayList = LJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<ConsumeInfo> it3 = copyOnWriteArrayList.iterator();
        while (it3.hasNext()) {
            arrayList.add(GsonProtectorUtils.toJson(C293501Bt.LIZ(), it3.next()));
        }
        LIZLLL();
    }
}
