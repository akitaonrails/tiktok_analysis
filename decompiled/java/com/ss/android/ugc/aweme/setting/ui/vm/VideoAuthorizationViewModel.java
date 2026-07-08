package com.ss.android.ugc.aweme.setting.ui.vm;

import X.C01GW;
import X.C11NJ;
import X.C11S5;
import X.C1701940uOG;
import X.C19472111Gd;
import X.C452501pT;
import X.InterfaceC19472011Gc;
import Y.AfS140S0200000_4;
import Y.AfS198S0100000_29;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.commercialize.advideo.InvitationInfo;
import com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoAuthorizationViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final MutableLiveData<InvitationInfo> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData LLILZIL;
    public final C01GW LLILZLL;

    public VideoAuthorizationViewModel() {
        MutableLiveData<InvitationInfo> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = mutableLiveData2;
        this.LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(135));
    }

    public final void vQ2(VideoAuthorizationActivity videoAuthorizationActivity, String str, String str2, int i, int i2, long j) {
        this.LL.setValue(Boolean.TRUE);
        InterfaceC19472011Gc.LIZ.getClass();
        ((C11NJ) this.LLILZLL.getValue()).LIZ(C19472111Gd.LIZIZ.getValue().LIZ(str, str2, i, i2, j).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 27), new AfS140S0200000_4(videoAuthorizationActivity, this, 9)));
    }
}
