package com.ss.android.ugc.aweme.poi.mapmode.map.permission;

import X.C13LP;
import X.C15438062q;
import X.C19741112Lp;
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

/* JADX INFO: loaded from: classes4.dex */
public final class MapModePermissionChangeObserver implements LifecycleEventObserver {
    public final List<String> LL;
    public final Function0<Unit> LLILLJJLI;
    public List<Boolean> LLILLL;
    public List<Boolean> LLILZ;

    public MapModePermissionChangeObserver(List<String> list, Function0<Unit> function0) {
        this.LL = list;
        this.LLILLJJLI = function0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            c19741112Lp.getClass();
            arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ, str)));
        }
        this.LLILLL = arrayList;
        this.LLILZ = arrayList;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            List<String> list = this.LL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                c19741112Lp.getClass();
                arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ, str)));
            }
            this.LLILZ = arrayList;
            List<Boolean> list2 = this.LLILLL;
            if (list2 == null) {
                list2 = null;
            }
            ArrayList arrayList2 = (ArrayList) C13LP.LLIILII(arrayList, list2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it2.next();
                    if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                        this.LLILLJJLI.invoke();
                        break;
                    }
                }
            }
        }
        if (event == Lifecycle.Event.ON_STOP) {
            List<String> list3 = this.LL;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (String str2 : list3) {
                C19741112Lp c19741112Lp2 = C19741112Lp.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                c19741112Lp2.getClass();
                arrayList3.add(Boolean.valueOf(C19741112Lp.LIZLLL(contextLIZ2, str2)));
            }
            this.LLILLL = arrayList3;
        }
    }
}
