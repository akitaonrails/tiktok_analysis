package com.ss.android.ugc.aweme.friendstab.interfaces;

import X.C1587210rPD;
import X.EnumC1392960mLu;
import X.EnumC1586610rOF;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;

/* JADX INFO: loaded from: classes25.dex */
public interface IBottomFriendsTabAvatarAbility extends InterfaceC494301wD {
    void BB(boolean z);

    boolean Cs1(UserNewContent userNewContent, EnumC1586610rOF enumC1586610rOF);

    void Fw();

    boolean HM1();

    void ZD1(Aweme aweme);

    void fF0(String str, EnumC1392960mLu enumC1392960mLu);

    boolean isShowing();

    void onTabChanged(String str);

    C1587210rPD pm0();

    void unRegister();

    void w20();
}
