package com.ss.android.ugc.trill.download.protocol.download;

import X.C1379840m0k;
import X.C1382710m5N;
import X.C1383700m6y;
import X.C13BV;
import X.InterfaceC21171017t6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotResultModel;
import com.ss.android.ugc.aweme.feed.model.im.IMMediaModel;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class IMGroupShotDownloadGlobalAbilityProtocol extends DefaultDownloadAbilityProtocol<C1379840m0k> {
    public final List<String> LLILLL;
    public final C1382710m5N LLILZ;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC21171017t6 LIZLLL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0m5N] */
    public IMGroupShotDownloadGlobalAbilityProtocol(C1379840m0k c1379840m0k) {
        List<String> list;
        AIGroupShotMediaModel aIGroupShotMediaModel;
        super(c1379840m0k);
        IMMediaModel imMediaModel = AwemeBizExtKt.getImMediaModel(c1379840m0k.LJFF);
        if (imMediaModel == null || (aIGroupShotMediaModel = imMediaModel.groupShotMediaModel) == null || aIGroupShotMediaModel.currentIndex >= aIGroupShotMediaModel.results.size()) {
            list = C13BV.INSTANCE;
        } else {
            list = ((AIGroupShotResultModel) ListProtector.get(aIGroupShotMediaModel.results, aIGroupShotMediaModel.currentIndex)).urlList;
        }
        this.LLILLL = list;
        this.LLILZ = new InterfaceC21171017t6() { // from class: X.0m5N
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
