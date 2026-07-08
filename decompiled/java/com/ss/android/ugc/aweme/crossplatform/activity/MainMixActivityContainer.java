package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C1038660d8S;
import X.C1041660dDI;
import X.C19EG;
import X.InterfaceC1037470d6X;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.IDownloadBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.ShareH5Service;

/* JADX INFO: loaded from: classes17.dex */
public class MainMixActivityContainer extends MixActivityContainer {
    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer, com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIII() {
        IDownloadBusinessService iDownloadBusinessService = (IDownloadBusinessService) PluggableExtentionKt.pluggableSpi(IDownloadBusinessService.class);
        if (iDownloadBusinessService != null) {
            iDownloadBusinessService.LIZ(this.LLILZIL, this.LL, (InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class));
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIJIIJIL() {
        IDownloadBusinessService iDownloadBusinessService = (IDownloadBusinessService) PluggableExtentionKt.pluggableSpi(IDownloadBusinessService.class);
        if (iDownloadBusinessService != null) {
            iDownloadBusinessService.LIZIZ(this.LLILZIL, this.LL);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIIJZLJL() {
        if (LJI()) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIIL(this.LLILZIL, ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ(), 2);
        } else {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIILJJIL(this.LLILZIL, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIIZ() {
        if (LJI()) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIIL(this.LLILZIL, ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ(), 1);
        } else {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIILJJIL(this.LLILZIL, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer
    public final void LJJIJ(Boolean bool) {
        if (bool.booleanValue()) {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIJJ(this.LLILZIL, ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ(), 2);
        } else {
            ShareH5Service.LIZ.getClass();
            C1038660d8S.LIZ().LJIJJ(this.LLILZIL, ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ(), 1);
        }
    }

    public MainMixActivityContainer(C19EG c19eg, C1041660dDI c1041660dDI) {
        super(c19eg, c1041660dDI);
    }
}
