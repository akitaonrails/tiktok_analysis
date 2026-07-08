package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.C01GW;
import X.C0IA3;
import X.C0W17;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C452501pT;
import X.C461930I9n;
import X.C461970I9r;
import X.C462030I9x;
import X.C628500Oky;
import X.C630740Ooa;
import X.C717610SCx;
import X.EnumC462000I9u;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS104S0400000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class FriendsV3PublishStatusViewModel extends AssemViewModel<C461930I9n> {
    public final C01GW LL;
    public final C630740Ooa LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C461930I9n(0);
    }

    public FriendsV3PublishStatusViewModel() {
        new CopyOnWriteArrayList();
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(56));
        this.LLILLJJLI = C628500Oky.LIZ(AFwS192S0000000_6.get$arr$(55));
    }

    public static int vQ2(int i, List list) {
        Object next;
        Integer numValueOf;
        Iterator it2 = C13LP.LLIIL(list).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            next = null;
            if (!c717610SCx.hasNext()) {
                break;
            }
            next = c717610SCx.next();
            IndexedValue indexedValue = (IndexedValue) next;
            int i2 = indexedValue.LIZ;
            T t = indexedValue.LIZIZ;
            if (i2 > i && (t instanceof C461970I9r)) {
                break;
            }
        }
        IndexedValue indexedValue2 = (IndexedValue) next;
        if (indexedValue2 != null && (numValueOf = Integer.valueOf(indexedValue2.LIZ)) != null) {
            return numValueOf.intValue();
        }
        return i;
    }

    public static List wQ2(int i, C0IA3 c0ia3, List list) {
        if (i <= 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (c0ia3 != null) {
            arrayList.add(c0ia3);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof C462030I9x) && arrayList2.size() < i && arrayList.size() < i) {
                arrayList2.add(obj);
            } else if ((obj instanceof C461970I9r) && arrayList.size() < i) {
                arrayList.add(obj);
            }
        }
        for (int i2 = 0; arrayList.size() < i && i2 < arrayList2.size(); i2++) {
            arrayList.add(ListProtector.get(arrayList2, i2));
        }
        return arrayList;
    }

    public final void xQ2(List<? extends C0IA3> list, EnumC462000I9u enumC462000I9u, C0IA3 c0ia3) {
        String str;
        PublishModel publishModelLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerUpdateOpt, reason=");
        sbLIZ.append(enumC462000I9u);
        C0W17.LIZJ("publishVM", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerUpdateOpt, topToRemove=");
        if (c0ia3 != null && (publishModelLIZIZ = c0ia3.LIZIZ()) != null) {
            str = publishModelLIZIZ.creationId;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", publishTaskList=");
        sbLIZ2.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS236S0000000_6.get$arr$(65), 31));
        C2188811AlT.LIZIZ(sbLIZ2);
        withState(new AwS104S0400000_6(enumC462000I9u, (EnumC462000I9u) this, (FriendsV3PublishStatusViewModel) list, (List<? extends C0IA3>) c0ia3, (C0IA3) 0));
    }
}
