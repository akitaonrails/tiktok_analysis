package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell;

import X.AbstractC899510ZQn;
import X.C03H5;
import X.C13IQ;
import X.C14IR;
import X.C723830SaL;
import X.C899570ZQt;
import X.C899580ZQu;
import X.C899590ZQv;
import X.InterfaceC461030I6b;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AbsSkeletonLayoutReusedUISlotAssem<T extends C03H5> extends ReusedUISlotAssem<T> {
    public final List<C899580ZQu> LLJJLIIIJLLLLLLLZ = new ArrayList();
    public final Map<C14IR, C13IQ<? extends ReusedUIAssem<? extends C03H5>>> LLJL = new LinkedHashMap();

    public abstract void op();

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        op();
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            C723830SaL.LIZ(this, null, new C899570ZQt(this, (C899580ZQu) it2.next()));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void sp(Function1<? super C899580ZQu, Unit> function1) {
        InterfaceC461030I6b<RECEIVER, T> interfaceC461030I6b;
        C13IQ<? extends ReusedUIAssem<? extends C03H5>> c13iqLIZ;
        C899580ZQu c899580ZQu = new C899580ZQu();
        function1.invoke(c899580ZQu);
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(c899580ZQu);
        for (Map.Entry entry : ((LinkedHashMap) c899580ZQu.LIZ).entrySet()) {
            Object key = entry.getKey();
            AbstractC899510ZQn<?, ?> abstractC899510ZQn = ((C899590ZQv) entry.getValue()).LIZ;
            if (abstractC899510ZQn != null && (interfaceC461030I6b = abstractC899510ZQn.LIZ) != 0 && (c13iqLIZ = interfaceC461030I6b.LIZ()) != null) {
                this.LLJL.put((C14IR) key, c13iqLIZ);
            }
        }
    }

    public final void tp(C14IR c14ir) {
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            ((C899580ZQu) it2.next()).LIZ.remove(c14ir);
            this.LLJL.remove(c14ir);
        }
    }
}
