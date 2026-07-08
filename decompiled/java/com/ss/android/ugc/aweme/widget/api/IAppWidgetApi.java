package com.ss.android.ugc.aweme.widget.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.widget.model.AppWidgetStruct;

/* JADX INFO: loaded from: classes28.dex */
public interface IAppWidgetApi {
    @InterfaceC1501160pAQ("/tiktok/v1/widget/challenge/")
    C0X9S<AppWidgetStruct> fetchChallenge(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("widget_size") int i2);
}
