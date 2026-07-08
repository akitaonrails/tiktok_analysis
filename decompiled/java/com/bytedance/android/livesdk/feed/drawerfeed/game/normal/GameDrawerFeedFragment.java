package com.bytedance.android.livesdk.feed.drawerfeed.game.normal;

import X.C0IYZ;
import X.C0IZ7;
import X.C469770IbX;
import X.C471640IeY;
import X.C500260Jjc;
import X.InterfaceC469760IbW;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerFeedFragment extends BaseDrawerFeedLiveFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LDHELIOS01LSAoZygyJSBiJyAhJSQgZwgyJSAIOy4kLTcKLCo3DjctLiI2JjE=";

    public GameDrawerFeedFragment() {
        super(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(22), AFwS237S0000000_7.get$arr$(23));
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final boolean VR() {
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (C500260Jjc.LJJJI(value != null ? Boolean.valueOf(value.isPreLoadingGameData) : null)) {
            return true;
        }
        return C500260Jjc.LJJJI(value != null ? Boolean.valueOf(value.isPreLoadingGameUI) : null);
    }

    public GameDrawerFeedFragment(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, Function1<? super C469770IbX, ? extends C0IZ7> function1, Function1<? super C469770IbX, ? extends C0IYZ> function12) {
        super(interfaceC469760IbW, c469770IbX, function1, function12);
    }
}
