package kotlin.jvm.internal;

import X.C09AY;
import X.C1366300leu;
import X.C1366430lf7;
import X.C1366440lf8;
import X.C19EG;
import X.C20684815ws;
import X.C2172521A0s;
import X.C2344009Gk;
import X.C733920Sqc;
import X.ExecutorC1592406Li;
import X.InterfaceC1389050mFb;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS16S2300000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S2300000_21 awS16S2300000_21) {
        String str = ScreenshotShareFragment._pnsPageId;
        C1366300leu.LIZ((C19EG) awS16S2300000_21.l2, awS16S2300000_21.s0, awS16S2300000_21.s1, (C1366430lf7) awS16S2300000_21.l3);
        if (((C1366440lf8) awS16S2300000_21.l4).LIZIZ) {
            C733920Sqc.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("enter_method", "screenshot_popup");
            C20684815ws.LJIILLIIL("float_window_popup_external_share", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S2300000_21 awS16S2300000_21) {
        ExecutorC1592406Li executorC1592406Li = ExecutorC1592406Li.LLILLJJLI;
        final C19EG c19eg = (C19EG) awS16S2300000_21.l2;
        final String str = awS16S2300000_21.s0;
        final DownloadInfo downloadInfo = (DownloadInfo) awS16S2300000_21.l3;
        final String str2 = awS16S2300000_21.s1;
        final InterfaceC1389050mFb interfaceC1389050mFb = (InterfaceC1389050mFb) awS16S2300000_21.l4;
        executorC1592406Li.execute(new Runnable() { // from class: X.0mFc
            public final void LIZ() throws Throwable {
                final String savePath;
                C1389070mFd c1389070mFd = C1389070mFd.LIZ;
                C19EG c19eg2 = c19eg;
                String str3 = str;
                DownloadInfo downloadInfo2 = downloadInfo;
                String str4 = str2;
                final InterfaceC1389050mFb interfaceC1389050mFb2 = interfaceC1389050mFb;
                c1389070mFd.getClass();
                Uri uriLJIIIIZZ = C2400409as.LJIIIIZZ(c19eg2, str4);
                if (C2400409as.LJIIIZ(c19eg2, uriLJIIIIZZ)) {
                    interfaceC1389050mFb2.onSuccess(uriLJIIIIZZ.toString());
                    return;
                }
                if (downloadInfo2 == null) {
                    Uri uriLIZLLL = C2400409as.LIZLLL(c19eg2, str4);
                    savePath = uriLIZLLL != null ? uriLIZLLL.toString() : "";
                } else {
                    savePath = downloadInfo2.getSavePath();
                }
                AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.0mFa
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onCanceled(DownloadInfo downloadInfo3) {
                        super.onCanceled(downloadInfo3);
                        try {
                            C20642515q3.LIZ().getContentResolver().delete(UriProtector.parse(savePath), null, null);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        InterfaceC1389050mFb interfaceC1389050mFb3 = interfaceC1389050mFb2;
                        if (interfaceC1389050mFb3 != null) {
                            interfaceC1389050mFb3.onFailed("download_cancel");
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo3) {
                        super.onProgress(downloadInfo3);
                        InterfaceC1389050mFb interfaceC1389050mFb3 = interfaceC1389050mFb2;
                        if (interfaceC1389050mFb3 != null) {
                            interfaceC1389050mFb3.onProgress(downloadInfo3);
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo3) {
                        super.onSuccessed(downloadInfo3);
                        InterfaceC1389050mFb interfaceC1389050mFb3 = interfaceC1389050mFb2;
                        if (interfaceC1389050mFb3 != null) {
                            String savePath2 = downloadInfo3.getSavePath();
                            downloadInfo3.getName();
                            interfaceC1389050mFb3.onSuccess(savePath2);
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo3, BaseException baseException) {
                        super.onFailed(downloadInfo3, baseException);
                        InterfaceC1389050mFb interfaceC1389050mFb3 = interfaceC1389050mFb2;
                        if (interfaceC1389050mFb3 != null) {
                            interfaceC1389050mFb3.onFailed(baseException.getMessage());
                        }
                    }
                };
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str3);
                abstractC2199801B7qWith.LIZJ = str4;
                abstractC2199801B7qWith.LJ = savePath;
                abstractC2199801B7qWith.LJIIJJI = absDownloadListener;
                abstractC2199801B7qWith.LJIIJ = "ecommerce_highlight";
                Integer numValueOf = Integer.valueOf(abstractC2199801B7qWith.LIZJ());
                if (interfaceC1389050mFb2 != null) {
                    interfaceC1389050mFb2.LIZ(numValueOf);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ECVideoDownloadUtil@4deb.downloadVideo$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ECVideoDownloadUtil@4deb.downloadVideo$1$1");
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S2300000_21(C19EG c19eg, String str, DownloadInfo downloadInfo, String str2, C2172521A0s c2172521A0s, int i) {
        super(0);
        this.$t = i;
        this.l2 = c19eg;
        this.s0 = str;
        this.l3 = downloadInfo;
        this.s1 = str2;
        this.l4 = c2172521A0s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S2300000_21(C19EG c19eg, String str, String str2, C1366430lf7 c1366430lf7, C1366440lf8 c1366440lf8, int i) {
        super(0);
        this.$t = i;
        this.l2 = c19eg;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c1366430lf7;
        this.l4 = c1366440lf8;
    }
}
