package com.ss.android.ugc.aweme.poi.quiz.permission;

import X.C13LP;
import X.C15438062q;
import X.C19741112Lp;
import X.C2213708lr;
import X.C844470XAv;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiQuizMapPermissionChangeObserver implements LifecycleEventObserver {
    public final List<String> LL;
    public final Function0<Unit> LLILLJJLI;
    public List<Boolean> LLILLL;
    public List<Boolean> LLILZ;

    public PoiQuizMapPermissionChangeObserver(List list, AwS562S0100000_18 awS562S0100000_18) {
        ArrayList arrayList;
        this.LL = list;
        this.LLILLJJLI = awS562S0100000_18;
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                c19741112Lp.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ, str)));
            }
        } else {
            arrayList = new ArrayList();
        }
        this.LLILLL = arrayList;
        this.LLILZ = arrayList;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = C2213708lr.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                List<String> list = this.LL;
                if (list != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (String str : list) {
                        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        c19741112Lp.getClass();
                        arrayList2.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ, str)));
                    }
                } else {
                    arrayList2 = new ArrayList();
                }
                this.LLILLL = arrayList2;
                return;
            }
            return;
        }
        List<String> list2 = this.LL;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (String str2 : list2) {
                C19741112Lp c19741112Lp2 = C19741112Lp.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                c19741112Lp2.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ2, str2)));
            }
        } else {
            arrayList = new ArrayList();
        }
        this.LLILZ = arrayList;
        ArrayList<Pair> arrayList3 = (ArrayList) C13LP.LLIILII(arrayList, this.LLILLL);
        if (!arrayList3.isEmpty()) {
            for (Pair pair : arrayList3) {
                if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                    this.LLILLJJLI.invoke();
                    return;
                }
            }
        }
    }
}
