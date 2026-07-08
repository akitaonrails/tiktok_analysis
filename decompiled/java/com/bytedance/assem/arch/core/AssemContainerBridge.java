package com.bytedance.assem.arch.core;

import X.C1119470fEn;
import X.InterfaceC1631620sYq;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class AssemContainerBridge extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstOjw2JWstOyw7ZiHELIOSYjOyp9CTY/LCIQJys4KCY9LTcOOyY3LyA=";
    public final C1119470fEn<InterfaceC1631620sYq<Integer, Integer, Intent, Unit>> LL = new C1119470fEn<>((Object) null);
    public final C1119470fEn<Function1<int[], Unit>> LLILLJJLI = new C1119470fEn<>((Object) null);
    public final Set<Function0<Unit>> LLILLL = new LinkedHashSet();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<Function0<Unit>> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        this.LLILLL.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC1631620sYq<Integer, Integer, Intent, Unit> interfaceC1631620sYqLIZLLL = this.LL.LIZLLL(i);
        if (interfaceC1631620sYqLIZLLL != null) {
            interfaceC1631620sYqLIZLLL.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
            this.LL.LJI(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Function1<int[], Unit> function1LIZLLL = this.LLILLJJLI.LIZLLL(i);
        if (function1LIZLLL != null) {
            function1LIZLLL.invoke(iArr);
            this.LLILLJJLI.LJI(i);
        }
    }
}
