package com.ss.android.ugc.aweme.notification.banner;

import X.C01GW;
import X.C0CYL;
import X.C13LP;
import X.C20554315bp;
import X.C2188811AlT;
import X.C452501pT;
import X.C624370OeJ;
import X.C636940Oya;
import X.C637320OzC;
import X.C637580Ozc;
import X.EnumC20654715s1;
import X.EnumC637310OzB;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerViewModel extends AssemViewModel<C637320OzC> {
    public String LLILLJJLI;
    public boolean LLILLL;
    public volatile boolean LLILZIL;
    public final ConcurrentHashMap<String, Pair<EnumC637310OzB, InterfaceC1891350zJl>> LL = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<String> LLILZ = new CopyOnWriteArraySet<>();
    public final Set<String> LLILZLL = new LinkedHashSet();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(264));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C637320OzC(0);
    }

    public final void xQ2() {
        String next;
        Pair<EnumC637310OzB, InterfaceC1891350zJl> pair;
        EnumC637310OzB first;
        if (C0CYL.LIZJ.LJIIIIZZ() && !this.LLILZIL) {
            C624370OeJ.LIZ("InboxBannerViewModel", "platform v2 enable, but platform banner not received");
            return;
        }
        String str = this.LLILLJJLI;
        if (str == null || C13LP.LJJJJ(str, C637580Ozc.LIZIZ)) {
            Iterator<String> it2 = vQ2().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    return;
                }
                next = it2.next();
                Pair<EnumC637310OzB, InterfaceC1891350zJl> pair2 = this.LL.get(next);
                EnumC637310OzB first2 = pair2 != null ? pair2.getFirst() : null;
                C624370OeJ.LIZIZ("InboxBannerViewModel", "getShowBannerTag, name = " + next + ", bannerState = " + first2);
                if (first2 == EnumC637310OzB.INIT) {
                    if (!this.LLILLL || !C637580Ozc.LIZ.contains(next)) {
                        return;
                    }
                } else if (first2 == EnumC637310OzB.TOP_SHOW || first2 == EnumC637310OzB.BOTTOM_SHOW) {
                    break;
                }
            }
            if (next == null || (pair = this.LL.get(next)) == null || (first = pair.getFirst()) == null) {
                return;
            }
            Pair<EnumC637310OzB, InterfaceC1891350zJl> pair3 = this.LL.get(next);
            InterfaceC1891350zJl second = pair3 != null ? pair3.getSecond() : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBannerShow, bannerTag = ");
            sbLIZ.append(next);
            sbLIZ.append(", showBannerState = ");
            sbLIZ.append(first);
            sbLIZ.append(", newBannerItem = ");
            sbLIZ.append(second);
            C624370OeJ.LIZ("InboxBannerViewModel", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI = next;
            setState(new AwS375S0200000_9(first, second, 87));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C0CYL.LIZJ.LJIIIIZZ()) {
            C636940Oya.LIZ.getClass();
            C20554315bp.LIZIZ.LIZIZ(EnumC20654715s1.INBOX_BANNER);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> vQ2() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.InboxBannerViewModel.vQ2():java.util.List");
    }

    public final void wQ2(String str) {
        Pair<EnumC637310OzB, InterfaceC1891350zJl> pair;
        EnumC637310OzB first;
        InterfaceC1891350zJl second;
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            if (Intrinsics.LJFF(str2, str) && (pair = this.LL.get(str)) != null && (first = pair.getFirst()) != null) {
                Pair<EnumC637310OzB, InterfaceC1891350zJl> pair2 = this.LL.get(str);
                if (pair2 != null) {
                    second = pair2.getSecond();
                } else {
                    second = null;
                }
                setState(new AwS375S0200000_9(first, second, 86));
                return;
            }
            return;
        }
        xQ2();
    }

    public final synchronized void yQ2(String str, Function0<Unit> function0) {
        if (this.LLILZ.contains(str)) {
            return;
        }
        this.LLILZ.add(str);
        function0.invoke();
    }
}
