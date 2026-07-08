package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import X.C09CT;
import X.C1428490nHD;
import X.EnumC1428480nHC;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class InteractStickerTracksContext implements Serializable {
    public String LL;

    @C09CT("multi_edit_map")
    public LinkedHashMap<String, List<InteractStickerStruct>> multiEditMap = new LinkedHashMap<>();

    @C09CT("multi_record_map")
    public LinkedHashMap<String, List<InteractStickerStruct>> multiRecordMap = new LinkedHashMap<>();

    public String getExtra() {
        return this.LL;
    }

    public final LinkedHashMap<String, List<InteractStickerStruct>> LIZ(EnumC1428480nHC enumC1428480nHC) {
        int i = C1428490nHD.LIZ[enumC1428480nHC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new LinkedHashMap<>();
            }
            return this.multiEditMap;
        }
        return this.multiRecordMap;
    }

    public List<InteractStickerStruct> getStickerStructsByPage(EnumC1428480nHC... enumC1428480nHCArr) {
        ArrayList arrayList = new ArrayList();
        for (EnumC1428480nHC enumC1428480nHC : enumC1428480nHCArr) {
            LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMapLIZ = LIZ(enumC1428480nHC);
            Iterator<String> it2 = linkedHashMapLIZ.keySet().iterator();
            while (it2.hasNext()) {
                List<InteractStickerStruct> list = linkedHashMapLIZ.get(it2.next());
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public boolean isEmpty(EnumC1428480nHC... enumC1428480nHCArr) {
        for (EnumC1428480nHC enumC1428480nHC : enumC1428480nHCArr) {
            if (!LIZ(enumC1428480nHC).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void setExtra(String str) {
        this.LL = str;
    }

    public List<InteractStickerStruct> getStickerStructByPageAndType(Integer num, EnumC1428480nHC enumC1428480nHC) {
        LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMapLIZ = LIZ(enumC1428480nHC);
        if (linkedHashMapLIZ.isEmpty()) {
            return null;
        }
        return linkedHashMapLIZ.get(String.valueOf(num));
    }

    public boolean removeStickerStructByPage(EnumC1428480nHC enumC1428480nHC, int i) {
        LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMapLIZ = LIZ(enumC1428480nHC);
        if (linkedHashMapLIZ.get(String.valueOf(i)) != null) {
            linkedHashMapLIZ.remove(String.valueOf(i));
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void upDateStickerStructs(java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r7, X.EnumC1428480nHC r8) {
        /*
            r6 = this;
            java.util.LinkedHashMap r4 = r6.LIZ(r8)
            r4.clear()
            boolean r0 = X.C086I.LIZIZ(r7)
            if (r0 != 0) goto L79
            java.util.Iterator r5 = r7.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r3 = r5.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3
            int r1 = r3.getType()
            r2 = 3
            if (r1 == r2) goto L77
            r0 = 4
            if (r1 == r0) goto L75
            r0 = 5
            if (r1 == r0) goto L3d
            r0 = 6
            if (r1 == r0) goto L73
            r0 = 20
            if (r1 == r0) goto L70
            r0 = 22
            if (r1 == r0) goto L6d
            r0 = 23
            if (r1 == r0) goto L6a
            switch(r1) {
                case 8: goto L67;
                case 9: goto L64;
                case 10: goto L61;
                case 11: goto L70;
                default: goto L3c;
            }
        L3c:
            r2 = -1
        L3d:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r4.get(r0)
            if (r0 != 0) goto L53
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.put(r1, r0)
        L53:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            r0.add(r3)
            goto L11
        L61:
            r2 = 10
            goto L3d
        L64:
            r2 = 9
            goto L3d
        L67:
            r2 = 8
            goto L3d
        L6a:
            r2 = 14
            goto L3d
        L6d:
            r2 = 13
            goto L3d
        L70:
            r2 = 11
            goto L3d
        L73:
            r2 = 4
            goto L3d
        L75:
            r2 = 2
            goto L3d
        L77:
            r2 = 1
            goto L3d
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext.upDateStickerStructs(java.util.List, X.0nHC):void");
    }
}
