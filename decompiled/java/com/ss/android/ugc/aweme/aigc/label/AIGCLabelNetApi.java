package com.ss.android.ugc.aweme.aigc.label;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes3.dex */
public interface AIGCLabelNetApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v3/aigc/label/status/")
    Object updateAigcLabelStatus(@InterfaceC1501050pAF("uid") String str, @InterfaceC1501050pAF("vid") String str2, @InterfaceC1501050pAF("overlabel_warning") String str3, @InterfaceC1501050pAF("user_label_status") String str4, InterfaceC1364105Vn<? super AIGCLabelStatusResponse> interfaceC1364105Vn);
}
