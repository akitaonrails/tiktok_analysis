package com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.viewmodel;

import X.C05W2;
import X.C05W3;
import X.C0PEM;
import X.C1477105qL;
import X.C1DFH;
import X.C23250099c;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.ChatInviteShareResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatInviteViewModelImpl extends ChatInviteViewModel {
    public static final C05W3 LLILZ = new Object() { // from class: X.05W3
    };
    public final TikTokImApi LLILLL;

    public ChatInviteViewModelImpl() {
        this(0);
    }

    public ChatInviteViewModelImpl(int i) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILLL = C1477105qL.LIZJ();
        new MutableLiveData(new ChatInviteShareResponse(null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.api.model.ChatInviteViewModel
    public final void vQ2(String str) {
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05W2(this, str, null), 3);
    }
}
