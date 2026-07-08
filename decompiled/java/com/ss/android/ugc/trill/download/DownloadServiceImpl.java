package com.ss.android.ugc.trill.download;

import X.AbstractC1382670m5J;
import X.AbstractC1382740m5Q;
import X.AbstractC21169117sn;
import X.C04TD;
import X.C1383600m6o;
import X.C1385180m9M;
import X.C1398780mVI;
import X.C1618280sDK;
import X.EnumC1379880m0o;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.share.download.service.IDownloadService;
import v7.o;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadServiceImpl implements IDownloadService {
    public static IDownloadService LJ() {
        Object objLIZ = C04TD.LIZ(IDownloadService.class, false);
        if (objLIZ != null) {
            return (IDownloadService) objLIZ;
        }
        if (C04TD.d7 == null) {
            synchronized (IDownloadService.class) {
                if (C04TD.d7 == null) {
                    C04TD.d7 = new DownloadServiceImpl();
                }
            }
        }
        return C04TD.d7;
    }

    @Override // com.ss.android.ugc.aweme.share.download.service.IDownloadService
    public final boolean LIZ() {
        return C1618280sDK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.download.service.IDownloadService
    public final C1398780mVI LIZIZ(AbstractC21169117sn abstractC21169117sn) {
        if (abstractC21169117sn.LIZJ == EnumC1379880m0o.AWEME_VIDEO.getType()) {
            return new C1398780mVI(abstractC21169117sn);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0m9M] */
    @Override // com.ss.android.ugc.aweme.share.download.service.IDownloadService
    public final C1385180m9M LIZJ(AbstractC21169117sn abstractC21169117sn) {
        if (abstractC21169117sn.LIZJ == EnumC1379880m0o.AWEME_VIDEO.getType()) {
            return new AbstractC1382670m5J() { // from class: X.0m9M
                @Override // X.AbstractC1382670m5J
                public final C15O7<Integer> LIZ(String str, String str2) {
                    if (str != null && str2 != null) {
                        final o oVar = new o();
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService().muteVideo(str, str2, new IAVProcessService.IProcessCallback<Integer>() { // from class: X.0m9N
                            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                            public final void finish(Integer num) {
                                oVar.LIZJ(Integer.valueOf(num.intValue()));
                            }
                        });
                        return oVar.LIZ;
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.download.service.IDownloadService
    public final AbstractC1382740m5Q LIZLLL(AbstractC21169117sn abstractC21169117sn) {
        int i = abstractC21169117sn.LIZJ;
        if (i == EnumC1379880m0o.AWEME_VIDEO.getType()) {
            return new C1383600m6o();
        }
        if (i != EnumC1379880m0o.AWEME_STORY_PHOTO.getType() && i != EnumC1379880m0o.AWEME_IMAGE.getType()) {
            return null;
        }
        return new AbstractC1382740m5Q() { // from class: X.0m5R
            @Override // X.AbstractC1382740m5Q
            public final boolean LIZ(String str, String str2, String str3) {
                if (str != null && str2 != null && str3 != null) {
                    AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                    abstractC2199801B7qWith.LIZJ = str2;
                    abstractC2199801B7qWith.LJ = str3;
                    abstractC2199801B7qWith.LJIIJJI = this.LIZIZ;
                    this.LIZ = abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.0m5S
                        @Override // X.InterfaceC2329409Au
                        public final void onStart(int i2) {
                        }
                    });
                    return true;
                }
                return false;
            }
        };
    }
}
