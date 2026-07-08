package com.bytedance.android.livesdk.broadcast.settingpage;

import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.C385701eh;
import X.C385801ei;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsViewModel extends ViewModel {
    public final Map<Integer, C385801ei> LL = new LinkedHashMap();
    public final LinkedHashMap<Integer, List<Integer>> LLILLJJLI = new LinkedHashMap<>();
    public final List<C385801ei> LLILLL = new ArrayList();
    public boolean LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C2252321DDq LLIZLLLIL;

    public final void vQ2() {
        C2252321DDq c2252321DDq = this.LLILZIL;
        LinkedHashMap<Integer, List<Integer>> linkedHashMap = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry<Integer, List<Integer>> entry : linkedHashMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<Integer> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Integer> it2 = value.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = it2.next().intValue();
                Object obj = ((LinkedHashMap) this.LL).get(Integer.valueOf(iIntValue2));
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(new C385701eh(iIntValue, arrayList2));
        }
        c2252321DDq.setValue(arrayList);
    }

    public SettingsViewModel() {
        C13BV c13bv = C13BV.INSTANCE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c13bv);
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(c13bv);
        this.LLIZ = c2252321DDqLIZ2;
        this.LLIZLLLIL = c2252321DDqLIZ2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) this.LL).clear();
        this.LLILLJJLI.clear();
        ((ArrayList) this.LLILLL).clear();
        C2252321DDq c2252321DDq = this.LLILZIL;
        C13BV c13bv = C13BV.INSTANCE;
        c2252321DDq.setValue(c13bv);
        this.LLIZ.setValue(c13bv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r1 = r6.size();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(int r8, int r9, X.C385801ei r10) {
        /*
            r7 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.util.Map<java.lang.Integer, X.01ei> r0 = r7.LL
            r0.put(r1, r10)
            java.util.LinkedHashMap<java.lang.Integer, java.util.List<java.lang.Integer>> r1 = r7.LLILLJJLI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r1.get(r0)
            if (r6 != 0) goto L1d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.put(r0, r6)
        L1d:
            java.util.List r6 = (java.util.List) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L3e
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> r1 = X.C00JC.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r1.get(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6.add(r0)
        L3e:
            boolean r0 = r7.LLILZ
            if (r0 == 0) goto L45
            r7.vQ2()
        L45:
            return
        L46:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            int r4 = r5.indexOf(r0)
            r3 = -1
            if (r4 != r3) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6.add(r0)
            goto L3e
        L59:
            java.util.Iterator r2 = r6.iterator()
            r1 = 0
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r5.indexOf(r0)
            if (r0 == r3) goto L88
            if (r0 <= r4) goto L88
            if (r1 != r3) goto L80
        L7c:
            int r1 = r6.size()
        L80:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r1, r0)
            goto L3e
        L88:
            int r1 = r1 + 1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel.wQ2(int, int, X.01ei):void");
    }
}
