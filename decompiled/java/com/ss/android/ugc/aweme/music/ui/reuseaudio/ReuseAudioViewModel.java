package com.ss.android.ugc.aweme.music.ui.reuseaudio;

import X.C15MQ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public final class ReuseAudioViewModel extends ViewModel {
    public final MutableLiveData<Aweme> LL = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<C15MQ> LLILZ = new MutableLiveData<>(C15MQ.PLAY);
    public final MutableLiveData<UrlModel> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZLL = new MutableLiveData<>();
    public ReuseAudioPlayer LLIZ;
}
