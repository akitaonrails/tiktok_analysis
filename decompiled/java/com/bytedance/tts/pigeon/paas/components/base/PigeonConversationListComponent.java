package com.bytedance.tts.pigeon.paas.components.base;

import X.C01GW;
import X.C08XD;
import X.C0Y8T;
import X.C0YX2;
import X.C0YX9;
import X.C0YXA;
import X.C0YXD;
import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C872060YIy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;
import com.bytedance.tts.pigeon.paas.components.api.PigeonConversationListComponentApi;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonConversationListComponent extends AbsPigeonGlobalProtocol implements PigeonConversationListComponentApi {
    public final GECPigeon LL;
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(C13BV.INSTANCE);
    public final CopyOnWriteArrayList<C0YX2> LLILLL = new CopyOnWriteArrayList<>();
    public final C2252321DDq LLILZ = C1BNE.LIZ(Boolean.FALSE);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 33));

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXH
    public final void LJJIL() {
        if (((Boolean) ((PigeonIMLoginStateComponentApi) this.LLILZIL.getValue()).LJIIIZ().getValue()).booleanValue() && this.LLILLL.isEmpty()) {
            LJJLIIIJILLIZJL();
        }
    }

    public final void LJJLIIIJILLIZJL() {
        GECPigeon.Companion.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C872060YIy.LIZ().LIZJ().LIZ), null, null, new C0YX9(this, null), 3);
    }

    @Override // com.bytedance.tts.pigeon.paas.components.api.PigeonConversationListComponentApi
    public final C2252321DDq LJIJI() {
        return this.LLILLJJLI;
    }

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public PigeonConversationListComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJJIJIIJI(C0Y8T c0y8t) {
        if (c0y8t == null) {
            LJJLIIIJILLIZJL();
            return;
        }
        synchronized (this.LLILLL) {
            try {
                this.LLILLL.add(new C0YX2(c0y8t));
                try {
                    C08XD.LJJ(this.LLILLL, C0YXA.LL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LLILLJJLI.setValue(new ArrayList(this.LLILLL));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJJIJIIJIL(Map<String, C0Y8T> map) {
        LJJLIIIJILLIZJL();
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJJIJIL(C0Y8T c0y8t) {
        C0YX2 next;
        if (c0y8t == null) {
            LJJLIIIJILLIZJL();
            return;
        }
        synchronized (this.LLILLL) {
            try {
                Iterator<C0YX2> it2 = this.LLILLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ.getConversationId(), c0y8t.getConversationId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                this.LLILLL.remove(next);
                this.LLILLJJLI.setValue(new ArrayList(this.LLILLL));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJJJI(C0Y8T c0y8t) {
        LJJLIIIJILLIZJL();
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJJJJZI(C0Y8T c0y8t) {
        LJJIJIL(c0y8t);
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YWS
    public final void LJJLI(boolean z) {
        if (!z) {
            synchronized (this.LLILLL) {
                try {
                    this.LLILLL.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLILLJJLI.setValue(C13BV.INSTANCE);
            this.LLILZ.setValue(Boolean.FALSE);
            C0YXD.LIZJ(this.LL, AFwS248S0000000_14.get$arr$(14));
        }
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.C0YXG
    public final void LJI(int i, C0Y8T c0y8t) {
        C0YX2 next;
        if (c0y8t == null) {
            LJJLIIIJILLIZJL();
            return;
        }
        synchronized (this.LLILLL) {
            try {
                Iterator<C0YX2> it2 = this.LLILLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ.getConversationId(), c0y8t.getConversationId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0YX2 c0yx2 = next;
                int iIndexOf = this.LLILLL.indexOf(c0yx2);
                if (iIndexOf >= 0) {
                    if (c0yx2 != null) {
                        this.LLILLL.set(iIndexOf, new C0YX2(c0y8t));
                        if (c0y8t.getSortOrder() != c0yx2.LIZ.getSortOrder() && (iIndexOf != 0 || c0y8t.getSortOrder() < c0yx2.LIZ.getSortOrder())) {
                            try {
                                C08XD.LJJ(this.LLILLL, C0YXA.LL);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        this.LLILLJJLI.setValue(new ArrayList(this.LLILLL));
                    }
                } else {
                    LJJLIIIJILLIZJL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
