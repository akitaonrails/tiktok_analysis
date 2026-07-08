package com.ss.android.ugc.aweme.music.ui;

import X.C086I;
import X.C786410Ut5;
import X.InterfaceC20499515Jh;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public class AIMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public Toast LLJJJJLIIL;
    public final ArrayList<Integer> LLJJL;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.InterfaceC20500415Jq
    public final void onDestroy() {
        Downloader downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LL.LLILLL());
        if (!C086I.LIZIZ(this.LLJJL)) {
            for (Integer num : this.LLJJL) {
                if (num != null) {
                    downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance.cancel(num.intValue());
                }
            }
        }
        super.onDestroy();
    }

    public AIMusicDownloadPlayHelper(InterfaceC20499515Jh interfaceC20499515Jh, String str) {
        super(interfaceC20499515Jh, str);
        this.LLJJL = new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean LIZ(Context context, MusicModel musicModel) {
        if (musicModel != null) {
            if (!musicModel.isLocalMusic() && !musicModel.isPlayUrlValid()) {
                String string = context.getString(2131837774);
                Toast toast = this.LLJJJJLIIL;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toastMakeText = Toast.makeText(context, string, 0);
                this.LLJJJJLIIL = toastMakeText;
                if (toastMakeText != null) {
                    toastMakeText.setGravity(17, 0, 0);
                    C786410Ut5.re(this.LLJJJJLIIL);
                }
                return false;
            }
            if (musicModel.getMusicStatus() == 0) {
                String offlineDesc = musicModel.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(2131837770);
                }
                Toast toast2 = this.LLJJJJLIIL;
                if (toast2 != null) {
                    toast2.cancel();
                }
                Toast toastMakeText2 = Toast.makeText(context, offlineDesc, 0);
                this.LLJJJJLIIL = toastMakeText2;
                if (toastMakeText2 != null) {
                    toastMakeText2.setGravity(17, 0, 0);
                    C786410Ut5.re(this.LLJJJJLIIL);
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
