package com.ss.android.ugc.aweme.feed.adapter.widget.bottom;

import X.C01GW;
import X.C452501pT;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewBottomCardVM extends LiveWidgetViewModel {
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 452));
    public final NextLiveData<Boolean> LLILLJJLI;
    public final NextLiveData<Boolean> LLILLL;
    public boolean LLILZ;
    public final NextLiveData<Boolean> LLILZIL;
    public final NextLiveData<Boolean> LLILZLL;

    public LivePreviewBottomCardVM() {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = new NextLiveData<>(bool);
        this.LLILLL = new NextLiveData<>(bool);
        this.LLILZIL = new NextLiveData<>(bool);
        this.LLILZLL = new NextLiveData<>(bool);
    }
}
