package com.ss.android.ugc.aweme.im.common.util;

import X.C06ZT;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.common.model.BlockResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IImApiUtil {
    Object LIZ(String str, String str2, int i, InterfaceC1364105Vn<? super BlockResponse> interfaceC1364105Vn);

    void LIZIZ(Activity activity, IMUser iMUser, String str, String str2);

    Object LIZJ(String str, String str2, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8, List list, Integer num, String str9, C06ZT c06zt);
}
