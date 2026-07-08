package com.ss.android.ugc.aweme.paid.content;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0XQ7;
import X.C1440005kM;
import X.C1612930s4h;
import X.C1697810uHb;
import X.C1799610wvn;
import X.C2188811AlT;
import X.C580990MqX;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentAnchorAttachServiceImpl implements IPaidContentAnchorAttachService {
    public static IPaidContentAnchorAttachService LIZJ() {
        Object objLIZ = C04TD.LIZ(IPaidContentAnchorAttachService.class, false);
        if (objLIZ != null) {
            return (IPaidContentAnchorAttachService) objLIZ;
        }
        if (C04TD.Y2 == null) {
            synchronized (IPaidContentAnchorAttachService.class) {
                if (C04TD.Y2 == null) {
                    C04TD.Y2 = new PaidContentAnchorAttachServiceImpl();
                }
            }
        }
        return C04TD.Y2;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService
    public final void LIZIZ(CollectionDetailModel collectionDetailModel, int i) throws JSONException {
        if (collectionDetailModel != null) {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://paidcontent/collections/detail?collection_id=");
            sbLIZ.append(collectionDetailModel.collectionId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            jSONObject.put("third_id", String.valueOf(collectionDetailModel.collectionId));
            C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(i, C786410Ut5.J3(jSONObject), collectionDetailModel.collectionName, "", 1, "", null, true, strLIZIZ, "", Long.MAX_VALUE, "", "", true, null, null, collectionDetailModel.category, null, 0, -1, null, null)));
            C1612930s4h.LIZIZ.LIZLLL(collectionDetailModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService
    public final void LIZ(Context context, String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) it2.next();
            if (collectionDetailModel != null) {
                JSONObject jSONObject = new JSONObject();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://paidcontent/collections/detail?collection_id=");
                sbLIZ.append(collectionDetailModel.collectionId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    jSONObject.put("third_id", String.valueOf(collectionDetailModel.collectionId));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                arrayList.add(new AnchorTransData(55, C786410Ut5.J3(jSONObject), collectionDetailModel.collectionName, "", 1, "", null, true, strLIZIZ, "", Long.MAX_VALUE, "", "", true, null, null, collectionDetailModel.category, null, 0, -1, null, null));
            }
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("guide_post_anchor");
        builder.setAutoSelectedAnchorList(arrayList);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "guide_post_anchor", new C580990MqX(context, builder, 14));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            Long lValueOf = null;
            if (i >= 0) {
                CollectionDetailModel collectionDetailModel2 = (CollectionDetailModel) obj;
                if (i > 0) {
                    sb.append(",");
                }
                if (collectionDetailModel2 != null) {
                    lValueOf = Long.valueOf(collectionDetailModel2.collectionId);
                }
                sb.append(String.valueOf(lValueOf));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1612930s4h.LIZIZ.LIZJ(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), sb.toString());
    }
}
