package com.ss.android.ugc.aweme.im.service.chat;

import X.C19EG;
import X.InterfaceC1398730mVD;
import X.InterfaceC888500YtM;
import androidx.lifecycle.LifecycleObserver;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public interface InboxSocPubStatusViewModel extends LifecycleObserver {

    public interface Factory {
        InboxSocPubStatusViewModelImpl LIZ(C19EG c19eg);
    }

    void Jk2();

    void gk2(String str, boolean z);

    void i72(InterfaceC1398730mVD interfaceC1398730mVD, IMUser iMUser);

    void jo1(InterfaceC1398730mVD interfaceC1398730mVD, User user);

    Set<String> lg0();

    void qb1(List<String> list);

    Map<String, Serializable> tR0();

    void yb2(InterfaceC888500YtM interfaceC888500YtM, InterfaceC1398730mVD interfaceC1398730mVD);
}
