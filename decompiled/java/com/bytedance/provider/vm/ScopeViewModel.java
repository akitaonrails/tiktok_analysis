package com.bytedance.provider.vm;

import X.InterfaceC665370Q7z;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ScopeViewModel extends ViewModel {
    public final CopyOnWriteArrayList<InterfaceC665370Q7z> LL = new CopyOnWriteArrayList<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.clear();
    }

    public final InterfaceC665370Q7z vQ2(String str) {
        InterfaceC665370Q7z next;
        Iterator<InterfaceC665370Q7z> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getKey(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final InterfaceC665370Q7z wQ2(String str, Function1<? super String, ? extends InterfaceC665370Q7z> function1) {
        if (str == null) {
            str = "scope_default_key";
        }
        InterfaceC665370Q7z interfaceC665370Q7zVQ2 = vQ2(str);
        if (interfaceC665370Q7zVQ2 == null) {
            InterfaceC665370Q7z interfaceC665370Q7zInvoke = function1.invoke(str);
            this.LL.add(interfaceC665370Q7zInvoke);
            return interfaceC665370Q7zInvoke;
        }
        return interfaceC665370Q7zVQ2;
    }
}
