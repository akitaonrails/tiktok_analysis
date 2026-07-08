package com.bytedance.lobby.google;

import X.C1741980vQq;
import X.C2277811EDr;
import X.C847650XNb;
import X.InterfaceC1742050vQx;
import X.InterfaceC847760XNm;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleWebAuthProvider extends BaseProvider {
    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
        Application application = LobbyCore.getApplication();
        String str = this.LLILLL.LIZJ;
        if (C847650XNb.LIZ(InterfaceC847760XNm.class) == null) {
            throw new IllegalStateException("need IAuthorizeMonitorService to upload SDK events, please call AuthorizeFramework.registerService(IAuthorizeMonitorService instacne) first");
        }
        C1741980vQq c1741980vQq = application == null ? null : (TextUtils.isEmpty("https://accounts.google.com/o/oauth2/v2/auth") || TextUtils.isEmpty("https://www.googleapis.com/oauth2/v4/token")) ? new C1741980vQq(str) : new C1741980vQq("https://accounts.google.com/o/oauth2/v2/auth", "https://www.googleapis.com/oauth2/v4/token", str);
        if (c1741980vQq != null) {
            ((ConcurrentHashMap) C847650XNb.LIZ).put(InterfaceC1742050vQx.class, c1741980vQq);
        }
    }

    public GoogleWebAuthProvider(Application application, C2277811EDr c2277811EDr) {
        super(application, c2277811EDr);
    }
}
