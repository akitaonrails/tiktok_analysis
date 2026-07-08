package com.ss.android.ugc.aweme.shortvideo.experiment;

import X.C04TD;
import X.C0CHQ;
import X.C20186013yc;
import X.C2427009fA;
import X.C786410Ut5;
import X.EnumC1335420kr6;
import X.InterfaceC345370DgN;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.publish.IPublishPageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class PublishPageImpl implements IPublishPageService {
    public static IPublishPageService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IPublishPageService.class, false);
        if (objLIZ != null) {
            return (IPublishPageService) objLIZ;
        }
        if (C04TD.j5 == null) {
            synchronized (IPublishPageService.class) {
                if (C04TD.j5 == null) {
                    C04TD.j5 = new PublishPageImpl();
                }
            }
        }
        return C04TD.j5;
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishPageService
    public final boolean LIZ() {
        C0CHQ.LIZ().getRegionService();
        return C20186013yc.LIZ().equals("KR");
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishPageService
    public final void LIZJ() {
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        if (listLJIIJJI != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIIJJI) {
                if (!Intrinsics.LJFF(((InterfaceC345370DgN) obj).LIZ(), "AV_STORAGE_CLEANER_CACHE")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                InterfaceC345370DgN interfaceC345370DgN = (InterfaceC345370DgN) obj2;
                if ((interfaceC345370DgN != null ? interfaceC345370DgN.LIZLLL() : null) == EnumC1335420kr6.CACHE) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC345370DgN) it2.next()).LJII(true);
            }
        }
        List<InterfaceC345370DgN> listLJIIJJI2 = C2427009fA.LJIIJJI();
        if (listLJIIJJI2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJIIJJI2) {
                if (!Intrinsics.LJFF(((InterfaceC345370DgN) obj3).LIZ(), "AV_STORAGE_CLEANER_CACHE")) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                InterfaceC345370DgN interfaceC345370DgN2 = (InterfaceC345370DgN) obj4;
                if ((interfaceC345370DgN2 != null ? interfaceC345370DgN2.LIZLLL() : null) == EnumC1335420kr6.CACHE) {
                    arrayList4.add(obj4);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                ((InterfaceC345370DgN) it3.next()).LJII(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishPageService
    public final void LIZIZ(int i, View view) {
        boolean z;
        C0CHQ.LIZ().getRegionService();
        if (C20186013yc.LIZ().equals("KR")) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m24);
            if (tuxTextView != null) {
                if (z) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                } else {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            }
        }
    }
}
