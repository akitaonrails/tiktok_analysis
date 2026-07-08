package com.tiktok.strategycenterengineimpl.setting;

import X.InterfaceC830890Wid;
import com.tiktok.ttm.TTMContext;
import com.tiktok.ttm.TTMParamData;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes14.dex */
public class PSPStaticConfigManager {
    public static TTMParamData getStaticConfig(TTMContext tTMContext, String str, String str2) {
        Object obj;
        InterfaceC830890Wid interfaceC830890Wid;
        Object objLIZLLL;
        if (tTMContext == null || (obj = tTMContext.userContextData) == null || (interfaceC830890Wid = (InterfaceC830890Wid) ((Reference) obj).get()) == null) {
            return null;
        }
        if (str2 == null) {
            objLIZLLL = interfaceC830890Wid.LIZ(str);
        } else {
            objLIZLLL = interfaceC830890Wid.LIZLLL(str, str2);
        }
        if (objLIZLLL != null) {
            return new TTMParamData(objLIZLLL);
        }
        return null;
    }
}
