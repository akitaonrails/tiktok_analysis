package com.ss.android.ugc.aweme.im.saas.host.api.share;

import X.C0ZHK;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface IInternalShareMethodBridge {
    public static final C0ZHK LIZ = C0ZHK.LIZ;

    void LIZIZ(String str, Map<String, String> map);

    Object LIZLLL(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, List<? extends BaseContact> list, boolean z6, InterfaceC1364105Vn<? super List<? extends BaseContact>> interfaceC1364105Vn);

    String LJ(IMUser iMUser);

    Object LJFF(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, List<? extends BaseContact> list, boolean z6, InterfaceC1364105Vn<? super List<? extends BaseContact>> interfaceC1364105Vn);
}
