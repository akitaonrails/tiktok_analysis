package com.bytedance.android.livesdkapi.util.file;

import X.C207209166l;
import X.C207235167l;
import X.InterfaceC1741706rv;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: loaded from: classes32.dex */
public final class FileDownloadTaskController implements InterfaceC1741706rv {
    public final Downloader LL;
    public final C207209166l LLILLJJLI;
    public final C207235167l LLILLL;
    public final DownloadTask LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC1741706rv
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        int status = this.LLILZ.getDownloadInfo().getStatus();
        if (status == -3 || status == -4 || status == -1) {
            return;
        }
        this.LL.pause(this.LLILZ.getDownloadId());
        this.LLILLL.LJI();
    }

    @Override // X.InterfaceC1741706rv
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        if (this.LL.canResume(this.LLILZ.getDownloadId())) {
            this.LL.resume(this.LLILZ.getDownloadId());
            C207235167l c207235167l = this.LLILLL;
            c207235167l.getClass();
            c207235167l.LLIZLLLIL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1741706rv
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void cancel(boolean z) {
        if (this.LLILZ.getDownloadInfo().getStatus() != -3) {
            this.LL.cancel(this.LLILZ.getDownloadId(), z);
        }
    }

    public FileDownloadTaskController(Downloader downloader, C207209166l c207209166l, C207235167l c207235167l, DownloadTask downloadTask) {
        this.LL = downloader;
        this.LLILLJJLI = c207209166l;
        this.LLILLL = c207235167l;
        this.LLILZ = downloadTask;
    }
}
