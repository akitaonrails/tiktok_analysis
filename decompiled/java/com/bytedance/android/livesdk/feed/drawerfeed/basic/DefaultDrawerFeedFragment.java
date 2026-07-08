package com.bytedance.android.livesdk.feed.drawerfeed.basic;

import X.C0IYZ;
import X.C0IZ7;
import X.C1C7U;
import X.C469770IbX;
import X.C470660Icy;
import X.C471340Ie4;
import X.C471640IeY;
import X.InterfaceC469760IbW;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class DefaultDrawerFeedFragment extends BaseDrawerFeedLiveFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7HELIOSLD01LSAoZy0yOywvZws2LiQ5JTsXOiQ7LD0VLSAoDz0yLygpJzs=";
    public final DefaultDrawerFeedFragment$uiHandler$1 LLJJJ;

    public DefaultDrawerFeedFragment() {
        this(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(12), AFwS237S0000000_7.get$arr$(13));
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final boolean UR() {
        return TextUtils.equals(this.LLILLJJLI.LIZ, "foru");
    }

    public final void cS() {
        if (Intrinsics.LJFF("foru", this.LLILLJJLI.LIZ)) {
            DefaultDrawerFeedFragment$uiHandler$1 defaultDrawerFeedFragment$uiHandler$1 = this.LLJJJ;
            String str = this.LLILLJJLI.LIZ;
            if (str == null) {
                str = "";
            }
            C471340Ie4.LJIIIZ(str, defaultDrawerFeedFragment$uiHandler$1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel OR() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.drawerfeed.basic.DefaultDrawerFeedFragment.OR():com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel");
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final void WR() {
        super.WR();
        String str = this.LLILLJJLI.LIZ;
        if (str == null) {
            str = "";
        }
        C471340Ie4.LJII(str);
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final void bS(String str) {
        super.bS(str);
        cS();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C470660Icy c470660Icy = this.LLIZ;
        if (c470660Icy != null) {
            c470660Icy.notifyItemRangeChanged(0, c470660Icy.getItemCount());
        }
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cS();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.android.livesdk.feed.drawerfeed.basic.DefaultDrawerFeedFragment$uiHandler$1] */
    public DefaultDrawerFeedFragment(InterfaceC469760IbW interfaceC469760IbW, final C469770IbX c469770IbX, Function1<? super C469770IbX, ? extends C0IZ7> function1, Function1<? super C469770IbX, ? extends C0IYZ> function12) {
        super(interfaceC469760IbW, c469770IbX, function1, function12);
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJJJ = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.feed.drawerfeed.basic.DefaultDrawerFeedFragment$uiHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BaseListResponse baseListResponse;
                C1C7U.LIZ("DefaultDrawerFeedFragment@2e27.uiHandler$1");
                if (message.what == 54) {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj instanceof BaseListResponse) && (baseListResponse = (BaseListResponse) messageObj) != null) {
                        String str = c469770IbX.LIZ;
                        if (str == null) {
                            str = "";
                        }
                        C471340Ie4.LJIIJ(str, baseListResponse);
                    }
                }
                C1C7U.LIZIZ("DefaultDrawerFeedFragment@2e27.uiHandler$1");
            }
        };
    }
}
