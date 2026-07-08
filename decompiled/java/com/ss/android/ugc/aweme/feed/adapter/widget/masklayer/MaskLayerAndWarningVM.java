package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C01GW;
import X.C0JF0;
import X.C1697810uHb;
import X.C1ACA;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MaskLayerAndWarningVM extends LiveWidgetViewModel {
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 153));
    public int LLILZ = 100;
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();

    public final boolean vQ2() {
        return C1697810uHb.LJIIJJI(100, 200).contains(Integer.valueOf(this.LLILZ));
    }

    public final void wQ2() {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1aca = (C1ACA) this.LL.getValue();
        if (c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || !c1aca.LJFF || this.LLILLJJLI) {
            return;
        }
        if (liveRoomStruct.warningTag != null) {
            this.LLIZ.setValue(Boolean.TRUE);
        }
        this.LLILZIL.setValue(Boolean.FALSE);
        LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
        if (C0JF0.LIZ(liveRoomStruct2 != null ? liveRoomStruct2.maskLayer : null, this.LLILLL)) {
            this.LLILZIL.setValue(Boolean.TRUE);
        }
    }
}
