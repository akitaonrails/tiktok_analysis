package com.ss.android.ugc.aweme.internalshare.impl.datamgr.aggre;

import X.C01GW;
import X.C051M;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C452501pT;
import X.C461720I8s;
import X.C866950Xzh;
import X.EnumC1366980lg0;
import X.EnumC1473605pm;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AggregateAvatarDataServiceImpl implements IAggregateAvatarDataService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(569));
    public List<SharePanelItemInfo> LIZIZ;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.aggre.IAggregateAvatarDataService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.aggre.IAggregateAvatarDataService
    public final List<SharePanelItemInfo> LIZJ() {
        List<SharePanelItemInfo> arrayList;
        if (!C866950Xzh.LIZIZ(this.LIZIZ)) {
            Keva keva = (Keva) this.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internal_share_last_share_");
            sbLIZ.append(C461720I8s.LIZIZ());
            String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (C866950Xzh.LIZ(string)) {
                try {
                    arrayList = (List) C051M.LIZJ(C2093608Ic.LIZ(string, new Boolean[0]), new TypeToken<List<? extends SharePanelItemInfo>>() { // from class: X.04Yk
                    }.getType());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList = new ArrayList<>();
                }
                this.LIZIZ = arrayList;
            }
        }
        List<SharePanelItemInfo> list = this.LIZIZ;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.datamgr.aggre.IAggregateAvatarDataService
    public final void LIZIZ(List<? extends IMContact> list) {
        EnumC1473605pm enumC1473605pm;
        Long lValueOf;
        if (list == null) {
            return;
        }
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        for (IMContact iMContact : (ArrayList) listLJJJJLI) {
            boolean z = iMContact instanceof IMUser;
            if (z) {
                enumC1473605pm = EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER;
            } else {
                enumC1473605pm = EnumC1473605pm.SHARE_PANEL_ID_TYPE_GROUP;
            }
            int value = enumC1473605pm.getValue();
            int value2 = EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_CLIENT_LAST_SHARE.getValue();
            Long lValueOf2 = null;
            if (z) {
                lValueOf = Long.valueOf(C866950Xzh.LIZLLL(iMContact.getUid()));
            } else {
                lValueOf = null;
            }
            if (iMContact instanceof IMConversation) {
                lValueOf2 = Long.valueOf(C866950Xzh.LIZLLL(((IMConversation) iMContact).getConversationId()));
            }
            arrayList.add(new SharePanelItemInfo(value, value2, "last multi share", lValueOf, lValueOf2, null, Long.valueOf(System.currentTimeMillis()), null));
        }
        this.LIZIZ = arrayList;
        String strLIZIZ = C2093608Ic.LIZIZ(C051M.LJ(arrayList, false));
        Keva keva = (Keva) this.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internal_share_last_share_");
        sbLIZ.append(C461720I8s.LIZIZ());
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ);
    }
}
