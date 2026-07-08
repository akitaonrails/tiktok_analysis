package com.ss.android.ugc.aweme.tako.arch.protocol;

import X.AnonymousClass0956;
import X.C01GW;
import X.C1723500ux2;
import X.C452501pT;
import X.InterfaceC1858000yRy;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoCardContainerSharedVM extends ViewModel {
    public static final C01GW<ConcurrentHashMap<String, TakoCardContainerSharedVM>> LLILZLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(564));
    public final ArrayList<ITakoCardProtocol<InterfaceC1858000yRy>> LL = new ArrayList<>();
    public final ConcurrentHashMap<Integer, ITakoCardProtocol<InterfaceC1858000yRy>> LLILLJJLI = new ConcurrentHashMap<>();
    public final List<Class<? extends PowerCell<?>>> LLILLL = new ArrayList();
    public final List<C1723500ux2> LLILZ = new ArrayList();
    public AnonymousClass0956 LLILZIL;

    public final ITakoCardProtocol<InterfaceC1858000yRy> vQ2(InterfaceC1858000yRy interfaceC1858000yRy) {
        ITakoCardProtocol<InterfaceC1858000yRy> next;
        Iterator<ITakoCardProtocol<InterfaceC1858000yRy>> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                ITakoCardProtocol<InterfaceC1858000yRy> iTakoCardProtocol = next;
                if (iTakoCardProtocol.getDataType().LIZIZ(interfaceC1858000yRy) && iTakoCardProtocol.ru1(interfaceC1858000yRy)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ITakoCardProtocol<InterfaceC1858000yRy> iTakoCardProtocol2 = next;
        if (iTakoCardProtocol2 == null) {
            return NonMatching.LL;
        }
        return iTakoCardProtocol2;
    }
}
