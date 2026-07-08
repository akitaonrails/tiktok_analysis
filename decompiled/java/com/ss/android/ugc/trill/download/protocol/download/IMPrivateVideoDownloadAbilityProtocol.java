package com.ss.android.ugc.trill.download.protocol.download;

import X.C1379820m0i;
import X.C1382730m5P;
import X.C1383700m6y;
import X.C13BV;
import X.C13LP;
import X.C912070ZqH;
import X.InterfaceC21171017t6;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class IMPrivateVideoDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol<C1379820m0i> {
    public final List<String> LLILLL;
    public final C1382730m5P LLILZ;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC21171017t6 LIZLLL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0m5P] */
    public IMPrivateVideoDownloadAbilityProtocol(C1379820m0i c1379820m0i) {
        List<String> listLJJJJLI;
        VideoUrlModel playAddr;
        List<String> urlList;
        super(c1379820m0i);
        Video video = c1379820m0i.LJFF.getVideo();
        if (video != null && (playAddr = video.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlList) {
                String str2 = str;
                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                if (!c912070ZqH.LJ().LJI(str2) || c912070ZqH.LJ().LJFF(str2)) {
                    arrayList.add(str);
                }
            }
            listLJJJJLI = C13LP.LJJJJLI(arrayList);
        } else {
            listLJJJJLI = C13BV.INSTANCE;
        }
        this.LLILLL = listLJJJJLI;
        this.LLILZ = new InterfaceC21171017t6() { // from class: X.0m5P
            @Override // X.InterfaceC21171017t6
            public final void LIZ() {
            }

            @Override // X.InterfaceC21171017t6
            public final void onCancel() {
            }

            @Override // X.InterfaceC21171017t6
            public final void onFailed() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = false;
            }

            @Override // X.InterfaceC21171017t6
            public final void onStart() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = true;
            }

            @Override // X.InterfaceC21171017t6
            public final void onSuccess() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol, com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LJIIIIZZ(String str, String str2, String str3, String str4) {
        if (str2 == null) {
            return super.LJIIIIZZ(str, str2, str3, str4);
        }
        if (C1383700m6y.LIZIZ(this.LLILLJJLI, str2)) {
            return true;
        }
        return super.LJIIIIZZ(str, str2, str3, str4);
    }
}
