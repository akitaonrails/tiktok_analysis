package com.bytedance.android.livesdk.sticker;

import X.C09CT;
import X.C14KS;
import X.C15438062q;
import X.C1697810uHb;
import X.C916720Zxm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerLiveLayoutUtils {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C916720Zxm c916720Zxm = (C916720Zxm) it2.next();
            String strValueOf = String.valueOf(c916720Zxm.LIZ);
            int i = c916720Zxm.LIZIZ;
            float fLJFF = C14KS.LJFF();
            float fLIZLLL = C14KS.LIZLLL();
            arrayList.add(new BoxInfo(strValueOf, i, C1697810uHb.LJIIJJI(Float.valueOf(c916720Zxm.LIZLLL.LIZ / fLJFF), Float.valueOf(c916720Zxm.LIZLLL.LIZIZ / fLIZLLL), Float.valueOf(c916720Zxm.LIZLLL.LIZJ / fLJFF), Float.valueOf(c916720Zxm.LIZLLL.LIZLLL / fLIZLLL))));
        }
        return arrayList;
    }

    public static final class LiveLayoutBoxInfo {

        @C09CT("otherBoxInfo")
        public final List<BoxInfo> otherBoxInfo;

        @C09CT("targetBoxInfo")
        public final List<BoxInfo> targetBoxInfo;

        public LiveLayoutBoxInfo(List<BoxInfo> list, List<BoxInfo> list2) {
            this.targetBoxInfo = list;
            this.otherBoxInfo = list2;
        }
    }

    public static final class BoxInfo {

        @C09CT("level")
        public final int level;

        @C09CT("rect")
        public final List<Float> rect;

        @C09CT("uid")
        public final String uid;

        public BoxInfo(String str, int i, List<Float> list) {
            this.uid = str;
            this.level = i;
            this.rect = list;
        }
    }
}
