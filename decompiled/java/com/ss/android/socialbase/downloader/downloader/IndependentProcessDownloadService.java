package com.ss.android.socialbase.downloader.downloader;

import X.C1B74;
import X.C1B7F;
import X.C1B7L;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2199681B7e;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes35.dex */
public class IndependentProcessDownloadService extends DownloadService {
    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C2199681B7e.LJJIFFI(this);
        if (C2199681B7e.LJFF == null) {
            C2199681B7e.LJJIIJZLJL(new C1B7L());
        }
        C1B7F c1b7fLJIJ = C2199681B7e.LJIJ();
        this.LL = c1b7fLJIJ;
        ((C1B74) c1b7fLJIJ).LL = new WeakReference<>(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
