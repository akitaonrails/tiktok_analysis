package com.ss.android.ugc.aweme.tools.music.avoidonresult;

import X.InterfaceC744580TIq;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AvoidOnResultFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZig5OiYwHELIOSZiQ6JiY3Jys+LDwmJDFiCDk8ISEDJx02OzAgPQkhKSIhLCEn";
    public final HashMap<Integer, List<InterfaceC744580TIq>> LL = new HashMap<>();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<T> it2 = this.LL.keySet().iterator();
        while (it2.hasNext()) {
            this.LL.remove(it2.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<InterfaceC744580TIq> list = this.LL.get(Integer.valueOf(i));
        if (list != null && !list.isEmpty()) {
            InterfaceC744580TIq interfaceC744580TIq = (InterfaceC744580TIq) ListProtector.remove(list, list.size() - 1);
            if (list.isEmpty()) {
                this.LL.remove(Integer.valueOf(i));
            }
            if (interfaceC744580TIq != null) {
                interfaceC744580TIq.LIZ(i2, intent);
                return;
            }
            return;
        }
        this.LL.remove(Integer.valueOf(i));
    }
}
