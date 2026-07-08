package com.bytedance.jedi.ext.adapter.internal;

import X.C19465511Dp;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class JediViewHolderProxyHost extends Fragment {
    public static final String LLILZIL = JediViewHolderProxyHost.class.getCanonicalName();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWsmLCs6ZiA0PWEyLCQ8PSohZiHELIOSwiPSohJiQgZwU2LCwaICokACogLSohGDcjMTYbJzY4";
    public Fragment LL;
    public final Map<Integer, View> LLILZ = new LinkedHashMap();
    public final Map<Lifecycle, C19465511Dp> LLILLJJLI = new WeakHashMap();
    public final Set<Function0<Unit>> LLILLL = new LinkedHashSet();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLILZ).clear();
    }
}
