package com.ss.android.ugc.aweme.external;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C2200151B8z;
import X.C2354709Kn;
import X.C573720Meo;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DownloadCameraWidgetGuide implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DownloadCameraWidgetGuide";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.IDLE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_creation_enable_camera_widget_guide", true, false)) {
            C573720Meo.LIZ.getClass();
            if (!C2354709Kn.LIZIZ(C573720Meo.LIZ())) {
                DownloadTask downloadTaskWith = C2200151B8z.with(context);
                downloadTaskWith.url("https://p16.tiktokcdn.com/obj/musically-maliva-obj/camera_widget_guide.png");
                downloadTaskWith.name("now_widget_guide.png");
                downloadTaskWith.savePath(C573720Meo.LIZIZ);
                downloadTaskWith.force(true);
                downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0Mep
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                    }
                });
                downloadTaskWith.download();
            }
        }
    }
}
