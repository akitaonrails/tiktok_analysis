package com.ss.android.ugc.aweme.choosemusic.viewmodel;

import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SelectedMusicViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(113));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(114));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(115));
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public final MutableLiveData<Integer> vQ2() {
        return (MutableLiveData) this.LLILZLL.getValue();
    }

    public final MutableLiveData<MusicModel> wQ2() {
        return (MutableLiveData) this.LLILLJJLI.getValue();
    }

    public final MutableLiveData<Integer> xQ2() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final MutableLiveData<Boolean> yQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public SelectedMusicViewModel() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(111));
        this.LLILZ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(110));
        this.LLILZIL = c01gwLIZIZ2;
        this.LLILZLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(112));
        yQ2().setValue(Boolean.FALSE);
        wQ2().setValue(null);
        xQ2().setValue(1);
        LiveData liveData = (LiveData) c01gwLIZIZ.getValue();
        Boolean bool = Boolean.TRUE;
        liveData.setValue(bool);
        ((LiveData) c01gwLIZIZ2.getValue()).setValue(bool);
        vQ2().setValue(1);
    }
}
