package com.ss.android.ugc.ur.school.educationsheet;

import X.C0X52;
import X.C2164708dx;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: loaded from: classes4.dex */
public interface CampusEducationSheetStatusAPI {
    public static final C2164708dx LIZ = C2164708dx.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/school/popup/status/")
    Object getPopupStatus(@InterfaceC1501070pAH("group") int i, InterfaceC1364105Vn<? super CampusEducationSheetStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/school/popup/status/update")
    Object updatePopupStatus(InterfaceC1364105Vn<? super C0X52<TypedInput>> interfaceC1364105Vn);
}
