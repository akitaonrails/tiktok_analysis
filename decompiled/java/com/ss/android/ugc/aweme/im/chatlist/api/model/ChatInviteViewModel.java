package com.ss.android.ugc.aweme.im.chatlist.api.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatInviteViewModel extends ViewModel {
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData LLILLJJLI;

    public abstract void vQ2(String str);

    public ChatInviteViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(-1);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
    }
}
