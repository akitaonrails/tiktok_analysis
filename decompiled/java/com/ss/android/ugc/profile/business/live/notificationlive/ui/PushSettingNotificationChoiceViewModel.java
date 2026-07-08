package com.ss.android.ugc.profile.business.live.notificationlive.ui;

import X.C004I;
import X.C013C;
import X.C0XQ7;
import X.C11TR;
import X.C1265190j1p;
import X.C19572311hp;
import X.C2217381BqS;
import X.C259800zU;
import X.InterfaceC1891350zJl;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PushSettingNotificationChoiceViewModel extends JediViewModel<NotificationChoiceState> {
    public final C11TR LLILZIL = new C11TR();
    public boolean LLILZLL = true;
    public final int LLIZ;
    public boolean LLIZLLLIL;
    public final ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> LLJ;

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        setState(AFwS273S0000000_29.get$arr$(253));
        super.onCleared();
        this.LLILZIL.release();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new NotificationChoiceState(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    public PushSettingNotificationChoiceViewModel() {
        this.LLIZ = C0XQ7.LJFF().LIZLLL() ? 1 : 2;
        this.LLJ = new ListMiddleware<>(new AwS608S0100000_29(this, 444), new AwS608S0100000_29(this, 445), AFwS317S0000000_29.get$arr$(10), AFwS317S0000000_29.get$arr$(11));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> listMiddleware = this.LLJ;
        C19572311hp c19572311hp = new C2217381BqS() { // from class: X.11hp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((NotificationChoiceState) obj).getListState();
            }
        };
        AFwS317S0000000_29 aFwS317S0000000_29 = AFwS317S0000000_29.get$arr$(24);
        listMiddleware.LLILLL = c19572311hp;
        listMiddleware.LLILZ = aFwS317S0000000_29;
        xQ2(listMiddleware);
    }

    public final void hR2(FollowingItemList followingItemList) {
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        withState(new AwS395S0200000_29(c013c, (C013C) c259800zU, (C259800zU<String>) 50));
        setState(new AwS238S0300000_29(c013c, (C013C) followingItemList, (FollowingItemList) c259800zU, (C259800zU<String>) 18));
    }
}
