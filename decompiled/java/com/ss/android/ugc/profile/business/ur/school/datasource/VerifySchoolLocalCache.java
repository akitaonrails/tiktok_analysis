package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C13LP;
import X.C15438062q;
import X.C331430Cyz;
import X.C338120DNi;
import X.C338130DNj;
import X.C338140DNk;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class VerifySchoolLocalCache implements VerifySchoolCache {
    public final Map<Pair<String, String>, C338130DNj> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache
    public final void LIZLLL() {
        for (C338130DNj c338130DNj : ((LinkedHashMap) this.LIZ).values()) {
            ((ArrayList) c338130DNj.LIZ).clear();
            ((LinkedHashMap) c338130DNj.LIZIZ).clear();
        }
        ((LinkedHashMap) this.LIZ).clear();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache
    public final C338120DNi LIZ(String str, String str2, String str3) {
        Object next;
        C338130DNj c338130DNj = (C338130DNj) ((LinkedHashMap) this.LIZ).get(new Pair(str, str2));
        if (c338130DNj == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) c338130DNj.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C338140DNk) next).LIZJ.contains(str3)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C338140DNk c338140DNk = (C338140DNk) next;
        if (c338140DNk == null || c338140DNk.LIZ + C338130DNj.LIZJ <= SystemClock.uptimeMillis()) {
            return null;
        }
        return new C338120DNi(c338140DNk.LIZ, c338140DNk.LIZIZ);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache
    public final List<C331430Cyz> LIZIZ(String str, String str2, String str3) {
        C338130DNj c338130DNj = (C338130DNj) ((LinkedHashMap) this.LIZ).get(new Pair(str, str2));
        if (c338130DNj != null) {
            return (List) ((LinkedHashMap) c338130DNj.LIZIZ).get(str3);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache
    public final void LIZJ(String str, String str2, String str3, String str4) {
        Object next;
        Map<Pair<String, String>, C338130DNj> map = this.LIZ;
        Pair pair = new Pair(str, str2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c338130DNj = linkedHashMap.get(pair);
        if (c338130DNj == null) {
            c338130DNj = new C338130DNj();
            linkedHashMap.put(pair, c338130DNj);
        }
        C338130DNj c338130DNj2 = (C338130DNj) c338130DNj;
        Iterator it2 = ((ArrayList) c338130DNj2.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C338140DNk) next).LIZJ.contains(str3)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C338140DNk c338140DNk = (C338140DNk) next;
        if (c338140DNk == null) {
            c338140DNk = new C338140DNk(str4, Collections.singletonList(str3));
            ((ArrayList) c338130DNj2.LIZ).add(c338140DNk);
        }
        c338140DNk.LIZ = SystemClock.uptimeMillis();
        c338140DNk.LIZIZ = str4;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache
    public final void LJ(String str, String str2, String str3, List<C331430Cyz> list) {
        Map<Pair<String, String>, C338130DNj> map = this.LIZ;
        Pair pair = new Pair(str, str2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c338130DNj = linkedHashMap.get(pair);
        if (c338130DNj == null) {
            c338130DNj = new C338130DNj();
            linkedHashMap.put(pair, c338130DNj);
        }
        C338130DNj c338130DNj2 = (C338130DNj) c338130DNj;
        if (!list.isEmpty()) {
            c338130DNj2.LIZIZ.put(str3, list);
            C331430Cyz c331430Cyz = (C331430Cyz) C13LP.LJJJJZI(list);
            Iterator it2 = ((ArrayList) c338130DNj2.LIZ).iterator();
            while (it2.hasNext()) {
                if (((C338140DNk) it2.next()).LIZJ.contains(c331430Cyz.LLILLJJLI)) {
                    return;
                }
            }
            List<C338140DNk> list2 = c338130DNj2.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C331430Cyz> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().LLILLJJLI);
            }
            ((ArrayList) list2).add(new C338140DNk("", arrayList));
        }
    }
}
