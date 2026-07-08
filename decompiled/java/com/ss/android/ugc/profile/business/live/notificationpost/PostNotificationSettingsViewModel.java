package com.ss.android.ugc.profile.business.live.notificationpost;

import X.C004I;
import X.C013C;
import X.C01GW;
import X.C11TR;
import X.C1265190j1p;
import X.C19572411hq;
import X.C2217381BqS;
import X.C259800zU;
import X.C452501pT;
import X.EnumC1265510j2L;
import X.InterfaceC1891350zJl;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PostNotificationSettingsViewModel extends JediViewModel<PostNotificationStatus> {
    public boolean LLJ;
    public boolean LLJI;
    public final C11TR LLILZIL = new C11TR();
    public boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(298));
    public final int LLIZLLLIL = EnumC1265510j2L.SOURCE_TYPE_BY_POST_NOTIFICATION.getValue();
    public final ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> LLJIJIL = new ListMiddleware<>(new AwS608S0100000_29(this, 446), new AwS608S0100000_29(this, 447), AFwS317S0000000_29.get$arr$(12), AFwS317S0000000_29.get$arr$(13));

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        setState(AFwS273S0000000_29.get$arr$(255));
        super.onCleared();
        this.LLILZIL.release();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new PostNotificationStatus(null, null, null, false, 0, null, false, false, null, null, 1023, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        this.LLJI = false;
        ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> listMiddleware = this.LLJIJIL;
        C19572411hq c19572411hq = new C2217381BqS() { // from class: X.11hq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PostNotificationStatus) obj).getListState();
            }
        };
        AFwS317S0000000_29 aFwS317S0000000_29 = AFwS317S0000000_29.get$arr$(25);
        listMiddleware.LLILLL = c19572411hq;
        listMiddleware.LLILZ = aFwS317S0000000_29;
        xQ2(listMiddleware);
    }

    public final void hR2(FollowingItemList followingItemList) {
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        withState(new AwS395S0200000_29(c013c, (C013C) c259800zU, (C259800zU<String>) 52));
        setState(new AwS238S0300000_29(c013c, (C013C) followingItemList, (FollowingItemList) c259800zU, (C259800zU<String>) 19));
    }
}
