package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C1629290sV5;
import X.InterfaceC1628910sUT;
import X.InterfaceC1629300sV6;
import X.InterfaceC1635390sev;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerStatesStoreViewModel extends ViewModel {
    public final Map<String, InterfaceC1628910sUT> LL = new LinkedHashMap();

    public final InterfaceC1628910sUT vQ2(InterfaceC1629300sV6 interfaceC1629300sV6, String str, InterfaceC1635390sev interfaceC1635390sev) {
        InterfaceC1628910sUT interfaceC1628910sUT = (InterfaceC1628910sUT) ((LinkedHashMap) this.LL).get(str);
        if (interfaceC1628910sUT == null) {
            C1629290sV5 c1629290sV5 = new C1629290sV5(interfaceC1629300sV6, interfaceC1635390sev);
            this.LL.put(str, c1629290sV5);
            return c1629290sV5;
        }
        return interfaceC1628910sUT;
    }
}
