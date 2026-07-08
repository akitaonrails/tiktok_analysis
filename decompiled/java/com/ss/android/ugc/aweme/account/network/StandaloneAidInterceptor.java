package com.ss.android.ugc.aweme.account.network;

import X.C080U;
import X.C0X52;
import X.C0XKL;
import X.C0XLO;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class StandaloneAidInterceptor implements InterfaceC1904907d9 {
    public static final StandaloneAidInterceptor LL = new StandaloneAidInterceptor();
    public static String LLILLJJLI;

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        ArrayList arrayList;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String str = LLILLJJLI;
        if (str != null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            StandaloneAidSettingsObject standaloneAidSettingsObject = C0XKL.LIZ;
            StandaloneAidSettingsObject standaloneAidSettingsObject2 = (StandaloneAidSettingsObject) settingsManagerLIZLLL.LJIIIIZZ("standalone_aid_config", StandaloneAidSettingsObject.class, standaloneAidSettingsObject);
            if (standaloneAidSettingsObject2 == null) {
                standaloneAidSettingsObject2 = standaloneAidSettingsObject;
            }
            if (!standaloneAidSettingsObject2.disabled) {
                String path = UriProtector.parse(request.getUrl()).getPath();
                if (path != null && path.length() != 0) {
                    StandaloneAidSettingsObject standaloneAidSettingsObject3 = (StandaloneAidSettingsObject) SettingsManager.LIZLLL().LJIIIIZZ("standalone_aid_config", StandaloneAidSettingsObject.class, standaloneAidSettingsObject);
                    if (standaloneAidSettingsObject3 != null) {
                        standaloneAidSettingsObject = standaloneAidSettingsObject3;
                    }
                    if (!standaloneAidSettingsObject.paths.contains(path)) {
                        return c1494590ozp.LIZ(request);
                    }
                    C0XMB c0xmbNewBuilder = request.newBuilder();
                    C0XLO c0xloLIZJ = C0XLO.LIZJ(request.getUrl());
                    c0xloLIZJ.LJI.LIZIZ("standalone_aid", str);
                    c0xmbNewBuilder.LIZJ(c0xloLIZJ.LIZIZ());
                    List<C080U> headers = request.getHeaders();
                    if (headers != null) {
                        arrayList = new ArrayList(headers);
                    } else {
                        arrayList = new ArrayList();
                    }
                    c0xmbNewBuilder.LIZJ = arrayList;
                    return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
                }
                return c1494590ozp.LIZ(request);
            }
        }
        return c1494590ozp.LIZ(request);
    }
}
