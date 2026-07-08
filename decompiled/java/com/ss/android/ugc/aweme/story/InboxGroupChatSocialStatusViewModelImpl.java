package com.ss.android.ugc.aweme.story;

import X.AnonymousClass0956;
import X.C01GW;
import X.C08WK;
import X.C08WL;
import X.C08WM;
import X.C09AE;
import X.C0YSQ;
import X.C0ZFW;
import X.C0ZP6;
import X.C0ZPB;
import X.C18002073g;
import X.C2135408Ye;
import X.C2135908Yj;
import X.C2136008Yk;
import X.C2136108Yl;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC2135708Yh;
import X.InterfaceC876950Yaj;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS9S1100000_3;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class InboxGroupChatSocialStatusViewModelImpl extends ViewModel implements C0ZP6 {
    public AnonymousClass0956 LLJI;
    public int LLJIJIL;
    public InterfaceC2135708Yh LLJILJILJ;
    public final Map<String, Long> LL = new LinkedHashMap();
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final LinkedHashSet<String> LLILLL = new LinkedHashSet<>();
    public final Map<String, C09AE> LLILZ = new LinkedHashMap();
    public final LinkedList<String> LLILZIL = new LinkedList<>();
    public final Map<String, Integer> LLILZLL = new LinkedHashMap();
    public final ConcurrentHashMap<String, C2135908Yj> LLIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C0ZPB> LLIZLLLIL = new ConcurrentHashMap<>();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(558));
    public final AtomicBoolean LLJILJIL = new AtomicBoolean(false);

    @Override // X.C0ZP6
    public final void LJFF() {
        synchronized (this.LLILLJJLI) {
            try {
                this.LLILLJJLI.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJILJIL.compareAndSet(true, false);
    }

    public final IPublishResourceFirstPolicyService wQ2() {
        return (IPublishResourceFirstPolicyService) this.LLJ.getValue();
    }

    public final void yQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LLJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C08WK(this, null), 3);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.clear();
        this.LLILZIL.clear();
        ((LinkedHashMap) this.LLILZ).clear();
        ((LinkedHashMap) this.LLILZLL).clear();
        synchronized (this.LL) {
            try {
                ((LinkedHashMap) this.LL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (this.LLILLJJLI) {
            try {
                this.LLILLJJLI.clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LLJIJIL = 0;
        this.LLJILJIL.set(false);
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJILJ = null;
        this.LLIZ.clear();
        this.LLIZLLLIL.clear();
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ2 = wQ2();
        if (iPublishResourceFirstPolicyServiceWQ2 != null) {
            iPublishResourceFirstPolicyServiceWQ2.LIZIZ(C2136108Yl.LIZIZ);
        }
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ22 = wQ2();
        if (iPublishResourceFirstPolicyServiceWQ22 != null) {
            iPublishResourceFirstPolicyServiceWQ22.LIZIZ(C2136008Yk.LIZIZ);
        }
    }

    public final void zQ2() {
        if (wQ2() == null) {
            yQ2();
            return;
        }
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ2 = wQ2();
        if (iPublishResourceFirstPolicyServiceWQ2 != null) {
            iPublishResourceFirstPolicyServiceWQ2.LIZIZ(C2136108Yl.LIZIZ);
        }
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ22 = wQ2();
        if (iPublishResourceFirstPolicyServiceWQ22 != null) {
            iPublishResourceFirstPolicyServiceWQ22.LIZ(C2136108Yl.LIZIZ, new ARunnableS103S0100000_3(this, 49));
        }
    }

    @Override // X.C0ZP6
    public final void HB(String str) {
        if (!C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str))) {
            return;
        }
        this.LLILLL.add(str);
        if (!xQ2(str) || this.LLILZ.containsKey(str)) {
            return;
        }
        this.LLILZ.put(str, C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C08WM(this, str, null), 3));
    }

    @Override // X.C0ZP6
    public final void Ni0(String str) {
        boolean z;
        synchronized (this.LL) {
            try {
                if (((LinkedHashMap) this.LL).get(str) == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C08WL(this, str, null), 3);
    }

    @Override // X.C0ZP6
    public final void Vo1(int i) {
        if (this.LLJIJIL != 0 && i == 0 && (!this.LLILZIL.isEmpty())) {
            zQ2();
        }
        this.LLJIJIL = i;
    }

    @Override // X.C0ZP6
    public final void Yx2(String str) {
        this.LLILLL.remove(str);
        this.LLILZIL.remove(str);
        C09AE c09aeRemove = this.LLILZ.remove(str);
        if (c09aeRemove != null) {
            c09aeRemove.LIZIZ(null);
        }
    }

    @Override // X.C0ZP6
    public final void hS0(String str) {
        this.LLIZLLLIL.remove(str);
    }

    @Override // X.C0ZP6
    public final void q20(List<String> list) {
        if (((Number) C18002073g.LIZ.getValue()).intValue() != 0 && (!((ArrayList) list).isEmpty()) && this.LLJILJIL.compareAndSet(false, true)) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2135408Ye(list, this, null), 3);
        }
    }

    @Override // X.C0ZP6
    public final C2135908Yj vl1(String str) {
        return this.LLIZ.get(str);
    }

    public final boolean xQ2(String str) {
        boolean z;
        synchronized (this.LL) {
            try {
                Long l = (Long) ((LinkedHashMap) this.LL).get(str);
                if (l != null) {
                    if (System.currentTimeMillis() - l.longValue() > 10000) {
                        this.LL.remove(str);
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            return false;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (!this.LLILLJJLI.contains(str)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.C0ZP6
    public final void fh1(String str, C0ZPB c0zpb) {
        this.LLIZLLLIL.put(str, c0zpb);
    }

    public final void vQ2(String str, boolean z) {
        if (this.LLILZIL.contains(str)) {
            return;
        }
        if (z) {
            this.LLILZIL.addFirst(str);
        } else {
            this.LLILZIL.addLast(str);
        }
    }

    @Override // X.C0ZP6
    public final void Je1(int i, String str, boolean z) {
        boolean z2;
        boolean z3;
        if (i == 0) {
            this.LLIZ.remove(str);
            C09AE c09aeRemove = this.LLILZ.remove(str);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            this.LLILLL.remove(str);
            this.LLILZIL.remove(str);
            synchronized (this.LL) {
                try {
                    this.LL.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (this.LLILLJJLI) {
                try {
                    this.LLILLJJLI.remove(str);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            InterfaceC2135708Yh interfaceC2135708Yh = this.LLJILJILJ;
            if (interfaceC2135708Yh != null) {
                interfaceC2135708Yh.vr0(str);
                return;
            }
            return;
        }
        C2135908Yj c2135908Yj = this.LLIZ.get(str);
        if (c2135908Yj != null && c2135908Yj.LIZ == i && Intrinsics.LJFF(c2135908Yj.LIZIZ, Boolean.valueOf(z))) {
            return;
        }
        this.LLIZ.put(str, new C2135908Yj(i, Boolean.valueOf(z)));
        if (c2135908Yj != null && c2135908Yj.LIZ == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            boolean zContains = this.LLILLL.contains(str);
            InterfaceC2135708Yh interfaceC2135708Yh2 = this.LLJILJILJ;
            if (interfaceC2135708Yh2 != null) {
                interfaceC2135708Yh2.vr0(str);
            }
            if (zContains) {
                ARunnableS9S1100000_3 aRunnableS9S1100000_3 = new ARunnableS9S1100000_3(this, str, 7);
                IPublishResourceFirstPolicyService iPublishResourceFirstPolicyServiceWQ2 = wQ2();
                if (iPublishResourceFirstPolicyServiceWQ2 != null) {
                    iPublishResourceFirstPolicyServiceWQ2.LIZ(C2136008Yk.LIZIZ, aRunnableS9S1100000_3);
                } else {
                    aRunnableS9S1100000_3.run();
                }
            }
        }
    }
}
