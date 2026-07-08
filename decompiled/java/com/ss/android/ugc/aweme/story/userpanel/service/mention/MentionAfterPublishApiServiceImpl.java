package com.ss.android.ugc.aweme.story.userpanel.service.mention;

import X.C05FF;
import X.C05FG;
import X.C2095008Iq;
import X.InterfaceC1484405rW;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionAfterPublishApiServiceImpl implements IMentionAfterPublishApiService {
    @Override // com.ss.android.ugc.aweme.story.userpanel.service.mention.IMentionAfterPublishApiService
    public final BaseResponse LIZ(C05FG c05fg) {
        Long lLJIILIIL;
        String str = c05fg.LIZ;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            List<String> list = c05fg.LIZIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(it2.next());
                if (lLJIILIIL2 != null) {
                    arrayList.add(lLJIILIIL2);
                }
            }
            return ((InterfaceC1484405rW) C05FF.LIZ.getValue()).LIZ(lLJIILIIL.longValue(), arrayList, 5, c05fg.LIZJ).execute().LIZIZ;
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.status_code = 1;
        baseResponse.status_msg = "Error occurred while creating mention after publish request.";
        return baseResponse;
    }
}
