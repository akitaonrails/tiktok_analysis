package com.ss.android.ugc.trill.download.protocol.download;

import X.AbstractC21169117sn;
import X.AbstractC2199801B7q;
import X.InterfaceC2329409Au;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CampaignLottieDownloadAbilityProtocol<CONTEXT extends AbstractC21169117sn> extends DownloadAbilityProtocol<CONTEXT> {
    public int LLILLJJLI;
    public AbsDownloadListener LLILLL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LJIIIIZZ(String str, String str2, String str3, String str4) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJI() {
        DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(this.LLILLJJLI).getClass();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LIZ(Context context) {
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context).cancel(this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJII(AbsDownloadListener absDownloadListener) {
        this.LLILLL = absDownloadListener;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LIZJ(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
            AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(str);
            abstractC2199801B7qWith.LIZJ = str2;
            abstractC2199801B7qWith.LJ = str3;
            abstractC2199801B7qWith.LJII = downloadServiceManager.getRetryExpCount();
            abstractC2199801B7qWith.LJIIJJI = this.LLILLL;
            this.LLILLJJLI = abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.0m5U
                @Override // X.InterfaceC2329409Au
                public final void onStart(int i) {
                }
            });
            return true;
        }
        return false;
    }
}
