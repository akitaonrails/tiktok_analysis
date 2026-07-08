package com.ss.android.ugc.trill.download.protocol.download;

import X.C1379830m0j;
import X.C1382700m5M;
import X.InterfaceC21171017t6;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryPhotoDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol<C1379830m0j> {
    public final List<String> LLILLL;
    public final String LLILZ;
    public final C1382700m5M LLILZIL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC21171017t6 LIZLLL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final String LJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0m5M] */
    public StoryPhotoDownloadAbilityProtocol(C1379830m0j c1379830m0j) {
        super(c1379830m0j);
        String value = c1379830m0j.LJIJ.getValue();
        this.LLILLL = Collections.singletonList(value == null ? "" : value);
        String aid = c1379830m0j.LJFF.getAid();
        this.LLILZ = aid != null ? aid : "";
        this.LLILZIL = new InterfaceC21171017t6() { // from class: X.0m5M
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
}
