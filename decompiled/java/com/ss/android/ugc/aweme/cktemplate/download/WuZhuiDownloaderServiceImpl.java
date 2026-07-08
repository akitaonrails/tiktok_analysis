package com.ss.android.ugc.aweme.cktemplate.download;

import X.C07X0;
import X.C07X1;
import X.C0C64;
import X.C0CHQ;
import X.C13LN;
import X.C1419850n3H;
import X.C1877507Wz;
import X.C19221910Hx;
import X.C20186013yc;
import X.C2533109wH;
import X.C291060Bay;
import X.InterfaceC531800KtO;
import com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader;
import com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class WuZhuiDownloaderServiceImpl implements ITemplateResourceDownloaderService {
    public WuZhuiDownloader LIZ;
    public SmartMovieDownloaderImpl LIZIZ;
    public final Set<ISmartMovieDownloader> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService
    public final WuZhuiDownloader LIZ() {
        if (this.LIZ != null && !C2533109wH.LIZ()) {
            WuZhuiDownloader wuZhuiDownloader = this.LIZ;
            return wuZhuiDownloader == null ? new WuZhuiDownloader() : wuZhuiDownloader;
        }
        String downloadDir = C0CHQ.LIZ().LJJJJL().getDownloadDir();
        if (u.LJIIZILJ(downloadDir, "/", false)) {
            downloadDir = C13LN.LJLL(1, downloadDir);
        }
        C0CHQ.LIZ().getApplicationService();
        String strValueOf = String.valueOf(C19221910Hx.LIZ());
        C0CHQ.LIZ().getRegionService();
        C07X0 c07x0 = new C07X0(new C07X1(strValueOf, C0CHQ.LIZ().getNetworkService().getApiHost(), C0CHQ.LIZ().getAppLanguage(), C20186013yc.LIZ(), downloadDir), new C1877507Wz(EffectPlatform.LLILZ.getAbsolutePath()));
        WuZhuiDownloader wuZhuiDownloader2 = new WuZhuiDownloader();
        wuZhuiDownloader2.setMaterialDownloadConfig(c07x0);
        if (!C2533109wH.LIZ()) {
            this.LIZ = wuZhuiDownloader2;
        }
        return wuZhuiDownloader2;
    }

    @Override // com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService
    public final SmartMovieDownloaderImpl LIZLLL() {
        if (this.LIZIZ != null && !C2533109wH.LIZ()) {
            WuZhuiDownloader wuZhuiDownloaderLIZ = LIZ();
            SmartMovieDownloaderImpl smartMovieDownloaderImpl = this.LIZIZ;
            return smartMovieDownloaderImpl == null ? new SmartMovieDownloaderImpl(wuZhuiDownloaderLIZ) : smartMovieDownloaderImpl;
        }
        SmartMovieDownloaderImpl smartMovieDownloaderImpl2 = new SmartMovieDownloaderImpl(LIZ());
        if (!C2533109wH.LIZ()) {
            this.LIZIZ = smartMovieDownloaderImpl2;
        } else if (C291060Bay.LIZ()) {
            this.LIZJ.add(smartMovieDownloaderImpl2);
            return smartMovieDownloaderImpl2;
        }
        return smartMovieDownloaderImpl2;
    }

    @Override // com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_use_new_downloader", true, false);
    }

    @Override // com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService
    public final void LIZJ(String str, final C1419850n3H c1419850n3H) {
        LIZ().fetchResourceWithPath(str, new InterfaceC531800KtO() { // from class: X.0Lpg
            @Override // X.InterfaceC531800KtO
            public final void LJJI(String str2, String str3) {
                c1419850n3H.LJJI(str2, str3);
            }

            @Override // X.InterfaceC531800KtO
            public final void onError(String str2, int i, String str3) {
                c1419850n3H.LIZ(i, str2, str3);
            }
        });
    }
}
