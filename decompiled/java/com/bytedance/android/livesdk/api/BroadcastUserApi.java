package com.bytedance.android.livesdk.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.retrofit2.mime.TypedOutput;

/* JADX INFO: loaded from: classes8.dex */
public interface BroadcastUserApi {
    @InterfaceC1501170pAR("/webcast/room/upload/image/")
    AbstractC19484711Kz<C470590Icr<CoverImageModel>> uploadAvatar(@InterfaceC1485405rg TypedOutput typedOutput);
}
