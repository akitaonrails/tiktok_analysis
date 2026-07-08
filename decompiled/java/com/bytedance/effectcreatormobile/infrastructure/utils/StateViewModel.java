package com.bytedance.effectcreatormobile.infrastructure.utils;

import X.C20673087z;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class StateViewModel extends ViewModel {
    public final List<Object> LL = new ArrayList();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void vQ2(C20673087z c20673087z, Object obj) {
        c20673087z.LIZ.postValue((S) obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void wQ2(C20673087z c20673087z, Object obj) {
        c20673087z.LIZ.setValue((S) obj);
    }
}
