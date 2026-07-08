package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.C0CQT;
import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes31.dex */
public final class ReuseAudioApi {
    public static final ReuseAudioApi LIZ = new ReuseAudioApi();
    public static final IReuseAudioApi LIZIZ = (IReuseAudioApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(IReuseAudioApi.class);

    public interface IReuseAudioApi {
        @InterfaceC1501160pAQ("/aweme/v1/multi/aweme/detail/")
        C0X9S<BatchDetailList> queryBatchAweme(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("request_source") int i);
    }
}
