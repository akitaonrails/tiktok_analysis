package com.ss.android.ugc.trill.download.protocol.download;

import X.C1379850m0l;
import X.C1382720m5O;
import X.C1383700m6y;
import X.C13LP;
import X.C912070ZqH;
import X.InterfaceC21171017t6;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class IMPrivateImageDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol<C1379850m0l> {
    public final List<String> LLILLL;
    public final C1382720m5O LLILZ;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC21171017t6 LIZLLL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0m5O] */
    public IMPrivateImageDownloadAbilityProtocol(C1379850m0l c1379850m0l) {
        UrlModel cover;
        super(c1379850m0l);
        Video video = c1379850m0l.LJFF.getVideo();
        List<String> arrayList = (video == null || (cover = video.getCover()) == null || (arrayList = cover.getUrlList()) == null) ? new ArrayList<>() : arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String str2 = str;
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            if (!c912070ZqH.LJ().LJI(str2) || c912070ZqH.LJ().LJFF(str2)) {
                arrayList2.add(str);
            }
        }
        this.LLILLL = C13LP.LJJJJLI(arrayList2);
        this.LLILZ = new InterfaceC21171017t6() { // from class: X.0m5O
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
        if (C1383700m6y.LIZIZ(this.LLILLJJLI, str2) || C1383700m6y.LIZ(this.LLILLJJLI, str2)) {
            return true;
        }
        return super.LJIIIIZZ(str, str2, str3, str4);
    }
}
