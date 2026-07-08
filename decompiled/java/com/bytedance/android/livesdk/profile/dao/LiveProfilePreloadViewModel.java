package com.bytedance.android.livesdk.profile.dao;

import X.AnonymousClass0956;
import X.C495930Jcd;
import X.C603820NmG;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveProfilePreloadViewModel extends ViewModel {
    public volatile C495930Jcd LL;
    public volatile C603820NmG<Long, C495930Jcd> LLILLJJLI = new C603820NmG<>(3);
    public AnonymousClass0956 LLILLL;
    public Function1<? super BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>, Unit> LLILZ;
}
