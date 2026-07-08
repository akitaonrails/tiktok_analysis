package com.ss.android.ugc.aweme.anchor.service;

import X.C08CX;
import X.C1385210m9P;
import X.C13LP;
import X.C15438062q;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorListServiceImpl implements IAnchorListService {
    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final void LIZ() {
        AnchorListManager.LIZ.getClass();
        AnchorListManager.LIZLLL(null);
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final Set<Integer> LIZLLL() {
        Collection collectionValues;
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        if (mapLJII != null && (collectionValues = mapLJII.values()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((AnchorPublishStruct) it2.next()).type));
            }
            Set<Integer> setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final boolean LIZIZ(int i) {
        Collection collectionValues;
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        if (mapLJII == null || (collectionValues = mapLJII.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((AnchorPublishStruct) it2.next()).type == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final boolean containAnchors(List<Integer> list) {
        AnchorListManager.LIZ.getClass();
        return AnchorListManager.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final void LJ(int i, String str, String str2) {
        C1385210m9P c1385210m9P = new C1385210m9P();
        c1385210m9P.LJIILLIIL = str;
        c1385210m9P.LIZLLL = "open_platform_share";
        c1385210m9P.LJIJJ = i;
        c1385210m9P.LJII = str2;
        c1385210m9P.LJIJI = "upload";
        c1385210m9P.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IAnchorListService
    public final void LIZJ(int i, String str, String str2, String str3) {
        C1385210m9P c1385210m9P = new C1385210m9P();
        c1385210m9P.LJIILLIIL = str;
        c1385210m9P.LIZLLL = "open_platform_share";
        c1385210m9P.LJIJJ = i;
        c1385210m9P.LJII = str2;
        c1385210m9P.LJIIIIZZ = str3;
        c1385210m9P.LJIJI = "upload";
        c1385210m9P.LJIILJJIL();
    }
}
