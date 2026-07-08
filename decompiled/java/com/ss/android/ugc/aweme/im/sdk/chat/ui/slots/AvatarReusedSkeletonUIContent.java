package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0QSJ;
import X.C0ZOF;
import X.C13LE;
import X.C1559260qg8;
import X.C1EET;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C452501pT;
import X.C457780HxI;
import X.C462190IAn;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC462200IAo;
import X.InterfaceC665370Q7z;
import X.InterfaceC911210Zot;
import Y.ACListenerS110S0200000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AvatarState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.AvatarReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AvatarReusedSkeletonUIContent extends ReusedSkeletonUISlotAssem<AvatarReusedSkeletonUIContent, AvatarState> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1559260qg8 LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public AnonymousClass0956 LLJZIJLIL;
    public final C01GW LLL;
    public volatile InterfaceC911210Zot LLLF;
    public InterfaceC665370Q7z LLLFF;
    public C0QSJ LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AvatarReusedSkeletonUIContent.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.crh;
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

    public AvatarReusedSkeletonUIContent() {
        super(C0ZOF.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 860));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 859));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 861));
    }

    public final InterfaceC911210Zot Bp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLFFI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFF;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLFF = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLFFI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        this.LLJLLIL.getValue();
        ((C427660Gpo) this.LLJLLL.getValue()).setSize(28);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(final C869590Y9l c869590Y9l, AvatarState avatarState) {
        if (!avatarState.avatarVisibility) {
            C786410Ut5.LJLZ(4, (ViewGroup) this.LLJZ.getValue());
            InterfaceC911210Zot interfaceC911210ZotBp = this.LLLF;
            if (interfaceC911210ZotBp == null) {
                synchronized (this) {
                    interfaceC911210ZotBp = this.LLLF;
                    if (interfaceC911210ZotBp == null) {
                        interfaceC911210ZotBp = Bp();
                        this.LLLF = interfaceC911210ZotBp;
                    }
                }
            }
            interfaceC911210ZotBp.LIZLLL(c869590Y9l.getUuid(), C1EET.LIZ);
            return;
        }
        InterfaceC462200IAo interfaceC462200IAo = new InterfaceC462200IAo() { // from class: X.0ZOz
            @Override // X.InterfaceC462200IAo
            public final void LIZ() {
                C427660Gpo.LJIIJJI((C427660Gpo) this.LLJLLL.getValue(), Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1006);
            }

            @Override // X.InterfaceC462200IAo
            public final void LIZIZ(IMContact iMContact) {
                Drawable drawable;
                final AvatarReusedSkeletonUIContent avatarReusedSkeletonUIContent = this;
                final C869590Y9l c869590Y9l2 = c869590Y9l;
                avatarReusedSkeletonUIContent.getClass();
                IAccessibilityUtils.LIZ.getClass();
                IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
                if (iAccessibilityUtilsLIZ != null) {
                    iAccessibilityUtilsLIZ.LIZ((C1322110kVd) avatarReusedSkeletonUIContent.LLJLLL.getValue(), iMContact);
                }
                IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) avatarReusedSkeletonUIContent.LLL.getValue();
                if (iDMAvatarLoader != null) {
                    iDMAvatarLoader.LJ(iMContact, C0ZKF.LIZ(new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127), new C0ZK1() { // from class: X.0ZP3
                        @Override // X.C0ZK1
                        public final void LIZ() {
                        }

                        @Override // X.C0ZK1
                        public final void LIZIZ() {
                        }

                        @Override // X.C0ZK1
                        public final void LIZJ(int i, String str, boolean z) {
                            AvatarReusedSkeletonUIContent avatarReusedSkeletonUIContent2 = avatarReusedSkeletonUIContent;
                            InterfaceC911210Zot interfaceC911210ZotBp2 = avatarReusedSkeletonUIContent2.LLLF;
                            if (interfaceC911210ZotBp2 == null) {
                                synchronized (avatarReusedSkeletonUIContent2) {
                                    interfaceC911210ZotBp2 = avatarReusedSkeletonUIContent2.LLLF;
                                    if (interfaceC911210ZotBp2 == null) {
                                        interfaceC911210ZotBp2 = avatarReusedSkeletonUIContent2.Bp();
                                        avatarReusedSkeletonUIContent2.LLLF = interfaceC911210ZotBp2;
                                    }
                                }
                            }
                            interfaceC911210ZotBp2.LIZLLL(c869590Y9l2.getUuid(), C1EET.LIZ);
                        }
                    }));
                }
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(avatarReusedSkeletonUIContent, 19));
                C724270Sb3 c724270Sb3 = avatarReusedSkeletonUIContent.LLJI;
                C1622006Ws<Drawable> c1622006Ws = ((AvatarState) avatarReusedSkeletonUIContent.op()).avatarBottomDrawable;
                if (c1622006Ws != null && (drawable = c1622006Ws.LIZ) != null) {
                    C786410Ut5.LLLLLLZZ((TuxIconView) c01gwLIZIZ.getValue(), 0);
                    ((TuxIconView) c01gwLIZIZ.getValue()).setImageDrawable(drawable);
                } else {
                    C786410Ut5.LLLLLLZZ((TuxIconView) c01gwLIZIZ.getValue(), 8);
                }
            }
        };
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZIJLIL = C462190IAn.LIZ(((C457780HxI) this.LLJLLIL.getValue()).LL, c869590Y9l, interfaceC462200IAo, LifecycleOwnerKt.getLifecycleScope(this));
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLJZ.getValue());
        C786410Ut5.K7((ViewGroup) this.LLJZ.getValue(), new ACListenerS110S0200000_6(c869590Y9l, this, 1));
    }
}
