package com.ss.android.ugc.aweme.locale;

import X.C04TD;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class LocalServiceImpl implements ILocalService {
    public static ILocalService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ILocalService.class, false);
        if (objLIZ != null) {
            return (ILocalService) objLIZ;
        }
        if (C04TD.Z1 == null) {
            synchronized (ILocalService.class) {
                if (C04TD.Z1 == null) {
                    C04TD.Z1 = new LocalServiceImpl();
                }
            }
        }
        return C04TD.Z1;
    }

    @Override // com.ss.android.ugc.aweme.locale.ILocalService
    public final String LIZ(Context context) {
        Locale localeLJIIZILJ;
        String strT2;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            localeLJIIZILJ = i18nServiceApi.LIZ().LJIIZILJ(context);
        } else {
            localeLJIIZILJ = context.getResources().getConfiguration().locale;
        }
        if (localeLJIIZILJ != null) {
            strT2 = C786410Ut5.t2(localeLJIIZILJ);
        } else {
            strT2 = "";
        }
        if (TextUtils.equals(strT2, "in")) {
            strT2 = FollowStatusChangeMethod.PARAM_UID;
        }
        if (TextUtils.equals(strT2, "pt")) {
            strT2 = "pt_BR";
        }
        if (TextUtils.equals(strT2, "zh")) {
            strT2 = "zh_Hant";
        }
        if (TextUtils.equals(strT2, "km")) {
            return "en";
        }
        return strT2;
    }
}
