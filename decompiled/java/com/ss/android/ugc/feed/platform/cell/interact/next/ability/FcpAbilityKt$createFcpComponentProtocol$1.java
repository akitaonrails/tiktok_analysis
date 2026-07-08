package com.ss.android.ugc.feed.platform.cell.interact.next.ability;

import X.C688590Qzh;
import X.C694010RKd;
import X.C694180RKu;
import X.C699500RcC;
import X.C700040Rd4;
import X.C700450Rdj;
import X.InterfaceC700000Rd0;
import X.InterfaceC700330RdX;
import X.InterfaceC701260Rf2;
import X.InterfaceC702260Rge;
import X.InterfaceC702540Rh6;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS153S1200000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS164S1200000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpAbilityKt$createFcpComponentProtocol$1 implements StandardPriorityProtocol {
    public final /* synthetic */ InterfaceC702260Rge LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C694010RKd LLILLL;
    public final /* synthetic */ InterfaceC700000Rd0 LLILZ;
    public final /* synthetic */ InterfaceC700330RdX LLILZIL;
    public final /* synthetic */ String LLILZLL;

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return true;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return this.LL.LIZIZ(this.LLILLJJLI) ? new C700040Rd4(new AwS153S1200000_11(this, this.LLILLJJLI, this.LL, 2), new AwS164S1200000_11(this, this.LLILLJJLI, this.LL, 1), new AwS160S1100000_11(this, this.LLILLJJLI, 2)) : new C700450Rdj(new AwS153S1200000_11(this, this.LLILLJJLI, this.LL, 3), new AwS153S1200000_11(this, this.LLILLJJLI, this.LL, 4), new AwS160S1100000_11(this.LL, this.LLILLJJLI, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        C694010RKd c694010RKd = this.LLILLL;
        View viewInvoke = c694010RKd.LLILLJJLI;
        if (viewInvoke == null) {
            viewInvoke = c694010RKd.LL.invoke();
            c694010RKd.LLILLJJLI = viewInvoke;
        }
        viewInvoke.setTag(R.id.em9, Boolean.TRUE);
        return viewInvoke;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.ability.StandardPriorityProtocol
    public final ReusedAssem<?> jO0() {
        return this.LL.LJFF(this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        final InterfaceC700000Rd0 interfaceC700000Rd0 = this.LLILZ;
        return new InterfaceC700000Rd0() { // from class: X.0Rgs
            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                InterfaceC700000Rd0 interfaceC700000Rd02 = interfaceC700000Rd0;
                if (interfaceC700000Rd02 != null) {
                    interfaceC700000Rd02.l0(z);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return this.LLILLJJLI;
    }

    public final Map<String, String> LIZ(String str) {
        Map<String, Map<String, String>> map;
        ClientStandardModel clientStandardModelKn = this.LLILZIL.getContext().LJFF.kn(this.LLILZLL);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsMobMap) != null) {
            return map.get(str);
        }
        return null;
    }

    public FcpAbilityKt$createFcpComponentProtocol$1(C694010RKd c694010RKd, InterfaceC700330RdX interfaceC700330RdX, InterfaceC702260Rge interfaceC702260Rge, InterfaceC702540Rh6 interfaceC702540Rh6, String str, String str2) {
        this.LL = interfaceC702260Rge;
        this.LLILLJJLI = str;
        this.LLILLL = c694010RKd;
        this.LLILZ = interfaceC702540Rh6;
        this.LLILZIL = interfaceC700330RdX;
        this.LLILZLL = str2;
    }
}
