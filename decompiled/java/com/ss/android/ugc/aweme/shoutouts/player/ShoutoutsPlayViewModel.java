package com.ss.android.ugc.aweme.shoutouts.player;

import X.AbstractC2199801B7q;
import X.C004I;
import X.C11CK;
import X.C12Y1;
import X.C13LP;
import X.C1B72;
import X.C2084808Es;
import X.C2188811AlT;
import X.C2400409as;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrder;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ShoutoutsPlayViewModel extends JediViewModel<ShoutoutsPlayState> {
    public final MutableLiveData<ShoutoutsOrder> LLILZIL = new MutableLiveData<>();
    public int LLILZLL = -1;
    public final C12Y1 LLIZ = new C12Y1(this, 1);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ShoutoutsPlayState(0, C11CK.PREPARED);
    }

    public final void hR2(Context context, Video video) {
        String str;
        UrlModel downloadAddr;
        List<String> urlList;
        if (video != null && (downloadAddr = video.getDownloadAddr()) != null && (urlList = downloadAddr.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2084808Es.LIZ(str));
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".mp4");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Uri uriLIZLLL = C2400409as.LIZLLL(context, strLIZIZ);
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LJIILIIL = true;
        abstractC2199801B7qWith.LJIL = true;
        abstractC2199801B7qWith.LJ = uriLIZLLL.toString();
        abstractC2199801B7qWith.LIZJ = strLIZIZ;
        abstractC2199801B7qWith.LIZIZ(this.LLIZ.hashCode(), this.LLIZ, C1B72.SUB);
        this.LLILZLL = abstractC2199801B7qWith.LIZJ();
    }
}
