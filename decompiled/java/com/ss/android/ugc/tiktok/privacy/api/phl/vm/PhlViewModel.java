package com.ss.android.ugc.tiktok.privacy.api.phl.vm;

import X.C11S5;
import X.C1701940uOG;
import X.InterfaceC438730HIh;
import Y.AfS175S0100000_6;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensApproveInfo;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensDescription;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensVideo;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class PhlViewModel extends ViewModel {
    public final InterfaceC438730HIh LL;
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<PrivacyHighlightsForTeensDescription> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<List<PrivacyHighlightsForTeensVideo>> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<String> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<PrivacyHighlightsForTeensApproveInfo> LLIZ = new MutableLiveData<>();

    public final void vQ2() {
        this.LL.LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS175S0100000_6(this, 9), new AfS175S0100000_6(this, 10));
    }

    public PhlViewModel(InterfaceC438730HIh interfaceC438730HIh) {
        this.LL = interfaceC438730HIh;
    }
}
