package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import X.C01GW;
import X.C0Y8T;
import X.C0YHX;
import X.C0YM2;
import X.C0YNP;
import X.C356901a3;
import X.C452501pT;
import X.C882360YjS;
import X.C882380YjU;
import X.C882420YjY;
import X.InterfaceC1755906uD;
import X.InterfaceC881630YiH;
import X.InterfaceC892260YzQ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ReadStateSyncDelegateV2 implements InterfaceC892260YzQ, GenericLifecycleObserver {
    public final SessionInfo LL;
    public final InterfaceC1755906uD LLILLJJLI;
    public final InterfaceC881630YiH LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC892260YzQ
    public final void C() {
    }

    @Override // X.InterfaceC892260YzQ
    public final void lz0() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C0Y8T LIZ() {
        return C0YNP.LIZIZ(this.LL.getConversationId()).LJ();
    }

    public final C882360YjS LIZIZ() {
        return (C882360YjS) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC892260YzQ
    public final void T20() {
        if (this.LL.isSingleChat()) {
            LIZIZ().LIZ(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        if (r12.LL.isSingleChat() != false) goto L55;
     */
    @Override // X.InterfaceC892260YzQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PW0(java.util.List<? extends X.C869590Y9l> r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegateV2.PW0(java.util.List):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        InterfaceC881630YiH interfaceC881630YiH = this.LLILLL;
        if (interfaceC881630YiH != null) {
            interfaceC881630YiH.LJI(Integer.valueOf(hashCode()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C882380YjU c882380YjU;
        this.LLILZ = true;
        if (!this.LL.isReportPage() && LIZ() != null) {
            C0Y8T c0y8tLIZ = LIZ();
            boolean z = false;
            if ((c0y8tLIZ != null && !c0y8tLIZ.isMember()) || (c882380YjU = LIZIZ().LIZIZ) == null || !this.LLILZ || c882380YjU.LIZIZ == 2) {
                return;
            }
            IIMCoreDependProxyService.LIZ.getClass();
            IIMCoreDependProxyService iIMCoreDependProxyServiceLIZ = C882420YjY.LIZ();
            if (iIMCoreDependProxyServiceLIZ != null) {
                iIMCoreDependProxyServiceLIZ.LIZJ();
                if (WsDependImpl.LL.LIZJ()) {
                    z = true;
                }
            }
            this.LLIZ = z;
            InterfaceC881630YiH interfaceC881630YiH = this.LLILLL;
            if (interfaceC881630YiH == null) {
                return;
            }
            interfaceC881630YiH.fetch(this.LL.getConversationId(), "ReadStateSyncDelegateV2", true);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.LLILZ = false;
    }

    public ReadStateSyncDelegateV2(SessionInfo sessionInfo, InterfaceC1755906uD interfaceC1755906uD) {
        InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
        C0YHX c0yhxLIZ;
        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
        if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null) {
            interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ();
        } else {
            interfaceC881630YiHLJIIIIZZ = null;
        }
        this.LL = sessionInfo;
        this.LLILLJJLI = interfaceC1755906uD;
        this.LLILLL = interfaceC881630YiHLJIIIIZZ;
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1670));
        if (interfaceC881630YiHLJIIIIZZ != null) {
            interfaceC881630YiHLJIIIIZZ.LIZIZ(Integer.valueOf(hashCode()), sessionInfo.getConversationId(), new AwS593S0100000_14(this, 355));
        }
    }
}
