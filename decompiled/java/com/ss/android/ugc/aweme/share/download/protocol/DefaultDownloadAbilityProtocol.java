package com.ss.android.ugc.aweme.share.download.protocol;

import X.AbstractC1382740m5Q;
import X.AbstractC21169117sn;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DefaultDownloadAbilityProtocol<CONTEXT extends AbstractC21169117sn> extends DownloadAbilityProtocol<CONTEXT> {
    public final AbstractC1382740m5Q LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJI() {
        AbstractC1382740m5Q abstractC1382740m5Q = this.LLILLJJLI;
        if (abstractC1382740m5Q == null || abstractC1382740m5Q.LIZJ) {
            return;
        }
        DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(abstractC1382740m5Q.LIZ).getClass();
    }

    public DefaultDownloadAbilityProtocol(CONTEXT context) {
        super(context);
        this.LLILLJJLI = DownloadServiceImpl.LJ().LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LIZ(Context context) {
        AbstractC1382740m5Q abstractC1382740m5Q = this.LLILLJJLI;
        if (abstractC1382740m5Q != null) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context).cancel(abstractC1382740m5Q.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJII(AbsDownloadListener absDownloadListener) {
        AbstractC1382740m5Q abstractC1382740m5Q = this.LLILLJJLI;
        if (abstractC1382740m5Q != null) {
            abstractC1382740m5Q.LIZIZ = absDownloadListener;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LIZJ(String str, String str2, String str3) {
        boolean zLIZ;
        boolean zLJI = MethodIDManager.LJI(137681);
        AbstractC1382740m5Q abstractC1382740m5Q = this.LLILLJJLI;
        if (abstractC1382740m5Q != null) {
            zLIZ = abstractC1382740m5Q.LIZ(str, str2, str3);
        } else {
            zLIZ = false;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public boolean LJIIIIZZ(String str, String str2, String str3, String str4) {
        AbstractC1382740m5Q abstractC1382740m5Q = this.LLILLJJLI;
        if (abstractC1382740m5Q != null) {
            return abstractC1382740m5Q.LIZIZ(str, str2, str3, str4);
        }
        return false;
    }
}
