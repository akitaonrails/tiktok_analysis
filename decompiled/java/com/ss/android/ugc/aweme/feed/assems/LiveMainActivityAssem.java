package com.ss.android.ugc.aweme.feed.assems;

import X.C01GW;
import X.C1150504el;
import X.C452501pT;
import X.C486610J6l;
import X.C755980Tl6;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveMainActivityAssem extends BaseMainContainerAssem {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 388));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 387));

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"LiveMainActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        ((C486610J6l) this.LL.getValue()).LIZ();
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Object value = this.LL.getValue();
        value.getClass();
        EventBus.LIZLLL().LJJI(value);
        C755980Tl6.LIZ().LIZJ();
    }
}
