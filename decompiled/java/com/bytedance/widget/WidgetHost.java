package com.bytedance.widget;

import X.C214820195e;
import X.InterfaceC214818195c;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public final class WidgetHost extends Fragment {
    public static final String LLIZ = WidgetHost.class.getCanonicalName();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs7ICHELIOSs0LTFiHiY3LyA4ASAgPA==";
    public Fragment LL;
    public final Map<Integer, View> LLILZLL = new LinkedHashMap();
    public final HashMap<Integer, Widget> LLILLJJLI = new HashMap<>();
    public final List<InterfaceC214818195c> LLILLL = new ArrayList();
    public final Map<Lifecycle, C214820195e> LLILZ = new WeakHashMap();
    public final Set<Function0<Unit>> LLILZIL = new LinkedHashSet();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLILZLL).clear();
    }

    public final void MR(Widget widget) {
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC214818195c) it2.next()).LIZ();
        }
        if (widget.LLILZIL) {
            widget.LLILZIL = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.LLILLJJLI.get(Integer.valueOf(i));
        this.LLILLJJLI.remove(Integer.valueOf(i));
    }
}
