package com.ss.android.ugc.aweme.profile.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;

/* JADX INFO: loaded from: classes5.dex */
public final class BlockApi {
    public static final BlockService LIZ = (BlockService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(BlockService.class);

    /* JADX INFO: loaded from: classes4.dex */
    public interface BlockService {
        @InterfaceC1501160pAQ("/aweme/v1/user/block/")
        C0X9S<BlockStruct> block(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("block_type") int i, @InterfaceC1501070pAH("source") int i2);
    }
}
