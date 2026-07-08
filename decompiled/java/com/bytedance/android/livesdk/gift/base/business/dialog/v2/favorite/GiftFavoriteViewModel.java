package com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite;

import X.C0IJT;
import X.C1129850fVX;
import X.C1131040fXS;
import X.C1148840g0A;
import X.C1148910g0H;
import X.C1149010g0R;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C497740JfY;
import X.EnumC1148880g0E;
import X.InterfaceC0148002o;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftFavoriteViewModel extends AssemViewModel<C1149010g0R> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1148840g0A.class, (Class<Object>) null, (String) 13), true);
    public int LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1149010g0R(0);
    }

    public final C1148840g0A yQ2() {
        return (C1148840g0A) this.LL.getValue();
    }

    public final void AQ2() {
        int i;
        List<C1148910g0H> list = getState().LL;
        ArrayList arrayList = new ArrayList();
        for (C1148910g0H c1148910g0H : list) {
            Long l = c1148910g0H.LIZLLL;
            if (l == null || l.longValue() != 0) {
                arrayList.add(c1148910g0H);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Long l2 = ((C1148910g0H) it2.next()).LIZLLL;
            if (l2 != null) {
                arrayList2.add(l2);
            }
        }
        C20441214yg.LIZIZ("favoritegift", "saveFavoriteGifts: ");
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i2);
            sbLIZ.append(" : ");
            sbLIZ.append(((Number) ListProtector.get(arrayList2, i2)).longValue());
            C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1131040fXS.LIZ(yQ2().LLIZLLLIL, yQ2().LL, arrayList2);
        String str = yQ2().LLILZIL;
        List<Long> list2 = yQ2().LLILZLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_save_button_click");
        c474500IjALIZ.LJIL();
        C1129850fVX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "button_type");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Number) obj).longValue() != 0) {
                arrayList3.add(obj);
            }
        }
        c474500IjALIZ.LJJII(arrayList3, "featured_gift_id_set");
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = arrayList2.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (((Number) it3.next()).longValue() != 0 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "featured_gift_cnt");
        ArrayList arrayList4 = new ArrayList();
        for (Long l3 : list2) {
            if (l3.longValue() != 0) {
                arrayList4.add(l3);
            }
        }
        c474500IjALIZ.LJJII(arrayList4, "original_featured_gift_id_set");
        c474500IjALIZ.LIZ();
    }

    public final int xQ2() {
        List<C1148910g0H> list = getState().LL;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C1148910g0H> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                EnumC1148880g0E enumC1148880g0E = it2.next().LJ;
                if (enumC1148880g0E == EnumC1148880g0E.FAVORITE_ITEM || enumC1148880g0E == EnumC1148880g0E.FAVORITE_DISABLED_ITEM) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        return i;
    }

    public final String zQ2() {
        if (xQ2() == 0) {
            return C497740JfY.LJIJI(2131841936);
        }
        Iterator<C1148910g0H> it2 = getState().LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1148910g0H next = it2.next();
            if (next.LJI) {
                if (next != null) {
                    return yQ2().LLILLJJLI ? C497740JfY.LJIJI(2131843755) : C497740JfY.LJIJI(2131843754);
                }
            }
        }
        return yQ2().LLILLJJLI ? C497740JfY.LJIJI(2131841937) : C497740JfY.LJIJI(2131841935);
    }

    public static LinkedList vQ2(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1148910g0H.LIZ((C1148910g0H) it2.next(), null, false, 1023));
        }
        return new LinkedList(arrayList);
    }

    public static void wQ2(LinkedList linkedList) {
        int i = 0;
        if (linkedList.size() > 4) {
            int size = linkedList.size() - 4;
            while (i < size) {
                linkedList.removeLast();
                i++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removed ");
            sbLIZ.append(size);
            sbLIZ.append(" empty until list size ");
            sbLIZ.append(linkedList.size());
            C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int size2 = 4 - linkedList.size();
        while (i < size2) {
            linkedList.addLast(new C1148910g0H((String) null, (ImageModel) null, (Integer) null, (Long) null, EnumC1148880g0E.EMPTY_ITEM, (Integer) null, false, (String) null, (Gift.SchemeInfo) null, 1007));
            i++;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("added ");
        sbLIZ2.append(size2);
        sbLIZ2.append(" empty until list size ");
        sbLIZ2.append(linkedList.size());
        C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
