package com.ss.android.ugc.aweme.out;

import X.C08SA;
import X.C0CHQ;
import X.C0VSJ;
import X.C1433730nPf;
import X.C1656740tDM;
import X.C1661450tKx;
import X.C532650Kul;
import X.C574480Mg2;
import X.C790290UzL;
import X.C794580VEy;
import X.InterfaceC1178904jL;
import X.InterfaceC1444620nhE;
import X.InterfaceC570310MYj;
import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import java.io.IOException;
import lth.o;

/* JADX INFO: loaded from: classes26.dex */
public final class AVServiceImpl implements IInternalAVService {
    public final C1661450tKx LIZ = new IFilterService() { // from class: X.0tKx
        @Override // com.ss.android.ugc.aweme.services.filter.IFilterService
        public final void refreshData() {
            o.LJIL.LJJIL().LIZ().refreshData();
        }

        @Override // com.ss.android.ugc.aweme.services.filter.IFilterService
        public final FilterBean getFilter(int i) {
            return o.LJIL.LJJIL().LIZ().getFilter(i);
        }
    };
    public SDKServiceImpl LIZIZ;

    static {
        Keva keva = C790290UzL.LIZ;
        TENativeLibsLoader.setLibraryHooker(C794580VEy.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IEffectService effectService() {
        return EffectService.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final ISDKService getSDKService() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new SDKServiceImpl();
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void tryCopyDuetDefaultLayout() throws Throwable {
        if (Keva.getRepo("duet_layout").getInt("duet_layout_version", 0) < 1) {
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", false);
            Keva.getRepo("duet_layout").storeInt("duet_layout_version", 1);
        }
        if (C1656740tDM.LIZJ()) {
            return;
        }
        try {
            C08SA.LJ(C0CHQ.LIZ.getAssets().open("duet_default_layout.zip"), new C0VSJ(C1656740tDM.LIZIZ()).getAbsolutePath());
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", true);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IInternalAVService
    public final InterfaceC1444620nhE avPreferences() {
        return C0CHQ.LIZ().LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IAVSettingsService avSettingsService() {
        return AVSettingsServiceImpl.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IInternalAVService
    public final InterfaceC570310MYj pathService() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IFilterService getFilterService() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        return new C532650Kul(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IInternalAVService
    public final boolean isPublishing(Context context) {
        return C1433730nPf.LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final String photoDir(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJLIJ(creativeInfo);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void setLastInfo(InterfaceC1178904jL interfaceC1178904jL) {
        new Object() { // from class: X.0tNq
        }.getClass();
        C574480Mg2.LIZIZ(interfaceC1178904jL);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void fetchResourcesNeededByRequirements(String[] strArr, final IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        o.LIZLLL();
        DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(strArr, new IFetchModelListener() { // from class: X.0tNp
            @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
            public final void onFailed(Exception exc) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener2 = iFetchResourcesListener;
                if (iFetchResourcesListener2 != null) {
                    iFetchResourcesListener2.onFailed(exc);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
            public final void onSuccess(String[] strArr2) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener2 = iFetchResourcesListener;
                if (iFetchResourcesListener2 != null) {
                    iFetchResourcesListener2.onSuccess(strArr2);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void loadLibrary(String str, Application application) {
        Librarian.LJI(application, str);
    }
}
