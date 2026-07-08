package com.ss.android.ugc.aweme.share.viewmodel;

import X.C0SHT;
import X.C0TA1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedPanelStateViewModel extends ViewModel implements C0SHT {
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final DialogStateLiveData LLILLJJLI = new DialogStateLiveData();
    public final DialogStateLiveData LLILLL = new DialogStateLiveData();
    public final DialogStateLiveData LLILZ = new DialogStateLiveData();
    public final DialogStateLiveData LLILZIL = new DialogStateLiveData();
    public final DialogStateLiveData LLILZLL = new DialogStateLiveData();
    public final DialogStateLiveData LLIZ = new DialogStateLiveData();
    public final DialogStateLiveData LLIZLLLIL = new DialogStateLiveData();
    public final DialogStateLiveData LLJ = new DialogStateLiveData();
    public final DialogStateLiveData LLJI = new DialogStateLiveData();
    public final DialogStateLiveData LLJIJIL = new DialogStateLiveData();
    public final DialogStateLiveData LLJILJIL = new DialogStateLiveData();
    public final DialogStateLiveData LLJILJILJ = new DialogStateLiveData();
    public final DialogStateLiveData LLJILLL = new DialogStateLiveData();
    public final DialogStateLiveData LLJJ = new DialogStateLiveData();
    public final DialogStateLiveData LLJJI;
    public final DialogStateLiveData LLJJIII;
    public final DialogStateLiveData LLJJIJI;
    public final DialogStateLiveData LLJJIJIIJIL;
    public final DialogStateLiveData LLJJIJIL;
    public final DialogStateLiveData LLJJJ;

    public FeedPanelStateViewModel() {
        new DialogStateLiveData();
        this.LLJJI = new DialogStateLiveData();
        this.LLJJIII = new DialogStateLiveData();
        this.LLJJIJI = new DialogStateLiveData();
        this.LLJJIJIIJIL = new DialogStateLiveData();
        this.LLJJIJIL = new DialogStateLiveData();
        this.LLJJJ = new DialogStateLiveData();
    }

    public final class DialogStateLiveData extends MutableLiveData<Boolean> {
        public C0TA1 stateRequestHandler;

        public final C0TA1 getStateRequestHandler() {
            return this.stateRequestHandler;
        }

        public DialogStateLiveData() {
        }

        public void postValue(boolean z) {
            super.postValue(Boolean.valueOf(z));
            FeedPanelStateViewModel.this.LL.postValue(Boolean.valueOf(z));
        }

        public final void setStateRequestHandler(C0TA1 c0ta1) {
            this.stateRequestHandler = c0ta1;
        }

        public void setValue(boolean z) {
            super.setValue(Boolean.valueOf(z));
            FeedPanelStateViewModel.this.LL.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public /* bridge */ /* synthetic */ void postValue(Object obj) {
            postValue(((Boolean) obj).booleanValue());
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public /* bridge */ /* synthetic */ void setValue(Object obj) {
            setValue(((Boolean) obj).booleanValue());
        }
    }

    @Override // X.C0SHT
    public final /* bridge */ /* synthetic */ MutableLiveData gn0() {
        return this.LL;
    }
}
