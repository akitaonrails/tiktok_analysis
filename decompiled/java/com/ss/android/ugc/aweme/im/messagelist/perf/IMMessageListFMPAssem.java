package com.ss.android.ugc.aweme.im.messagelist.perf;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C19H0;
import X.C19H1;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC911210Zot;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class IMMessageListFMPAssem extends AbstractC738140SxQ implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 205));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 207));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 206));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 204));
    public volatile C19H1 LLILZIL;
    public volatile C19H0 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMMessageListFMPAssem.class, "fmpPerfTrackerProvider", "getFmpPerfTrackerProvider()Lcom/ss/android/ugc/aweme/im/messagelist/perf/util/FMPPerfTrackerProvider;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMMessageListFMPAssem.class, "clsPerfTrackerProvider", "getClsPerfTrackerProvider()Lcom/ss/android/ugc/aweme/im/messagelist/perf/util/CLSPerfTrackerProvider;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Map<String, String> map = (Map) this.LLILZ.getValue();
        if (map != null) {
            ((InterfaceC911210Zot) this.LLILLJJLI.getValue()).LIZIZ(map);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            final MessageListCLSTracker messageListCLSTracker = (MessageListCLSTracker) this.LLILLL.getValue();
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, OnChatRoomTouchListener.class, C1697810uHb.LJIILJJIL(messageListCLSTracker));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.perf.IMMessageListFMPAssem$onParentViewCreated$lambda$0$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, OnChatRoomTouchListener.class, messageListCLSTracker);
                        }
                    }
                });
            }
            final MessageListCLSTracker messageListCLSTracker2 = (MessageListCLSTracker) this.LLILLL.getValue();
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(messageListCLSTracker2));
            Lifecycle lifecycle2 = getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.perf.IMMessageListFMPAssem$onParentViewCreated$lambda$0$$inlined$registerProtocol$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, IMessageEventProtocol.class, messageListCLSTracker2);
                        }
                    }
                });
            }
        }
        ((InterfaceC911210Zot) this.LLILLJJLI.getValue()).LIZ();
        Map<String, String> map = (Map) this.LLILZ.getValue();
        if (map != null) {
            ((MessageListCLSTracker) this.LLILLL.getValue()).QT(map);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ((InterfaceC911210Zot) this.LLILLJJLI.getValue()).onPause();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLILLJJLI.getValue(), InterfaceC911210Zot.class);
        c0qsjLIZIZ.unbindAbility(this.LLILLL.getValue(), MessageListCLSTracker.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.bindAbility(this.LLILLJJLI.getValue(), InterfaceC911210Zot.class);
        c0qsjLIZIZ.bindAbility(this.LLILLL.getValue(), MessageListCLSTracker.class);
    }
}
