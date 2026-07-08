package com.ss.android.ugc.aweme.shortvideo.model;

import X.AbstractC666100QAu;
import X.C1BVK;
import X.C1C7U;
import com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes30.dex */
public class MusicListModel extends AbstractC666100QAu<MusicList> {
    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC666100QAu
    public boolean sendRequest(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: com.ss.android.ugc.aweme.shortvideo.model.MusicListModel.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                C1C7U.LIZ("MusicListModel@fcd3.sendRequest$1");
                MusicList musicListLIZ = MusicChoicesApi.LIZ();
                C1C7U.LIZIZ("MusicListModel@fcd3.sendRequest$1");
                return musicListLIZ;
            }
        }, 0);
        return true;
    }
}
