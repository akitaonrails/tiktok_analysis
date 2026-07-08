package com.ss.android.ugc.aweme.publish.core.createaweme;

import X.C0X9S;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501320pAg;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface CreateAwemeApi$API {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/create/aweme/")
    C0X9S<CreateAwemeResponse> createAweme(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/create/aweme/")
    @InterfaceC1501320pAg(3)
    C0X9S<CreateAwemeResponse> createAwemeHighPriority(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/create/photo/")
    C0X9S<CreateAwemeResponse> createPhoto(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/create/photo/")
    @InterfaceC1501320pAg(3)
    C0X9S<CreateAwemeResponse> createPhotoHighPriority(@InterfaceC1501150pAP Map<String, String> map);
}
