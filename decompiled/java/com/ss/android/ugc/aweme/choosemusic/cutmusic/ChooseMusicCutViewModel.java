package com.ss.android.ugc.aweme.choosemusic.cutmusic;

import X.C01GW;
import X.C15HO;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseMusicCutViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(102));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(100));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(103));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(104));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(101));

    public final MutableLiveData<C15HO> vQ2() {
        return (MutableLiveData) this.LLILZIL.getValue();
    }

    public final MutableLiveData<MusicModel> wQ2() {
        return (MutableLiveData) this.LL.getValue();
    }
}
