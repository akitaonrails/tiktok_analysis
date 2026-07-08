package com.ss.android.ugc.aweme.live.notify;

import X.C1155050gAB;
import X.C1161920gLG;
import X.C13LP;
import X.C15438062q;
import X.C1733680vDS;
import X.C1733710vDV;
import X.C1733720vDW;
import X.C1954807lC;
import X.C2097908Jt;
import X.InterfaceC1102350enB;
import X.InterfaceC1733670vDR;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.live.notify.LiveNotifyWidgetObserverService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveNotifyWidgetObserverService implements ILiveNotifyWidgetObserverService {
    public static final void LIZ(Map map, Function1 function1) {
        Collection collectionValues = map.values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((Boolean) it2.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        function1.invoke(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.live.notify.ILiveNotifyWidgetObserverService
    public final InterfaceC1733670vDR observeNotifyWidgets(final DataChannel dataChannel, List<? extends LiveNotifyWidget> list, Function1<? super Boolean, Unit> function1) {
        C1733720vDW c1733720vDW;
        if (list.isEmpty()) {
            ((AwS605S0100000_26) function1).invoke(Boolean.FALSE);
            InterfaceC1733670vDR.LIZ.getClass();
            return C1733680vDS.LIZIZ;
        }
        final ILiveNotifyService iLiveNotifyService = (ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class);
        if (iLiveNotifyService == null) {
            ((AwS605S0100000_26) function1).invoke(Boolean.FALSE);
            InterfaceC1733670vDR.LIZ.getClass();
            return C1733680vDS.LIZIZ;
        }
        List listLJJJJI = C13LP.LJJJJI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
        Iterator it2 = listLJJJJI.iterator();
        while (it2.hasNext()) {
            int i = C1155050gAB.LIZ[((LiveNotifyWidget) it2.next()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c1733720vDW = new C1733720vDW(1);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1733720vDW = new C1733720vDW(3);
            }
            arrayList.add(c1733720vDW);
        }
        if (arrayList.isEmpty()) {
            ((AwS605S0100000_26) function1).invoke(Boolean.FALSE);
            InterfaceC1733670vDR.LIZ.getClass();
            return C1733680vDS.LIZIZ;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        int i2 = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            C1733720vDW c1733720vDW2 = (C1733720vDW) obj;
            linkedHashMap.put(obj, Boolean.valueOf(iLiveNotifyService.x82(c1733720vDW2.LIZ, dataChannel, c1733720vDW2.LIZIZ)));
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ2 >= 16) {
            i2 = iLIZIZ2;
        }
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap(i2);
        for (Object obj2 : arrayList) {
            final C1733720vDW c1733720vDW3 = (C1733720vDW) obj2;
            final AwS605S0100000_26 awS605S0100000_26 = (AwS605S0100000_26) function1;
            linkedHashMap3.put(obj2, new InterfaceC1102350enB() { // from class: X.0vDV
                @Override // X.InterfaceC1102350enB
                public final void LIZ() {
                    linkedHashMap2.put(c1733720vDW3, Boolean.FALSE);
                    LiveNotifyWidgetObserverService.LIZ(linkedHashMap2, awS605S0100000_26);
                }

                @Override // X.InterfaceC1102350enB
                public final void LIZIZ() {
                    linkedHashMap2.put(c1733720vDW3, Boolean.TRUE);
                    LiveNotifyWidgetObserverService.LIZ(linkedHashMap2, awS605S0100000_26);
                }
            });
        }
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            C1733720vDW c1733720vDW4 = (C1733720vDW) entry.getKey();
            iLiveNotifyService.tc2(dataChannel, c1733720vDW4.LIZ, c1733720vDW4.LIZIZ, (C1733710vDV) entry.getValue());
        }
        LIZ(linkedHashMap2, function1);
        return new InterfaceC1733670vDR() { // from class: X.0vDU
            public boolean LIZIZ;

            @Override // X.InterfaceC1733670vDR
            public final void dispose() {
                if (this.LIZIZ) {
                    return;
                }
                this.LIZIZ = true;
                Map<C1733720vDW, C1733710vDV> map = linkedHashMap3;
                ILiveNotifyService iLiveNotifyService2 = iLiveNotifyService;
                DataChannel dataChannel2 = dataChannel;
                for (Map.Entry<C1733720vDW, C1733710vDV> entry2 : map.entrySet()) {
                    C1733720vDW key = entry2.getKey();
                    iLiveNotifyService2.iF2(dataChannel2, key.LIZ, key.LIZIZ, entry2.getValue());
                }
            }
        };
    }
}
