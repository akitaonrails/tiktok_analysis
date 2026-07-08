package com.bytedance.android.livesdk.feed.drawerfeed.game.esport;

import X.C469770IbX;
import X.C470660Icy;
import X.C471230Idt;
import X.C471240Idu;
import X.C471640IeY;
import X.InterfaceC469760IbW;
import android.content.res.Configuration;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameESportDrawerFeedFragment extends BaseDrawerFeedLiveFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LD01LSHELIOSAoZygyJSBiLDwjJzc4ZwgyJSAJGj88OjEIOy4kLTcKLCo3DjctLiI2JjE=";

    public GameESportDrawerFeedFragment() {
        super(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(18), AFwS237S0000000_7.get$arr$(19));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C470660Icy c470660Icy = this.LLIZ;
        if (c470660Icy != null) {
            c470660Icy.notifyItemRangeChanged(0, c470660Icy.getItemCount());
        }
    }

    public GameESportDrawerFeedFragment(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, C471230Idt c471230Idt, C471240Idu c471240Idu) {
        super(interfaceC469760IbW, c469770IbX, c471230Idt, c471240Idu);
    }
}
