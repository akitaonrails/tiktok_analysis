package com.ss.android.ugc.aweme.im.messagelist.api.ability;

import X.C0BCV;
import X.C786410Ut5;
import X.EnumC432220GxA;
import X.InterfaceC494301wD;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class EasterEggShareMessageAnimatorAbility implements InterfaceC494301wD {
    public final Map<EnumC432220GxA, Set<View>> LL = new LinkedHashMap();
    public View LLILLJJLI;

    public static void LIZIZ(View view) {
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.ed(view, 0.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
    }

    public final void LIZ(View view, EnumC432220GxA enumC432220GxA) {
        if (((Number) C0BCV.LIZ.getValue()).intValue() == 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
            Object linkedHashSet = linkedHashMap.get(enumC432220GxA);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(enumC432220GxA, linkedHashSet);
            }
            ((Set) linkedHashSet).add(view);
        }
    }

    public final void LIZLLL(View view, EnumC432220GxA enumC432220GxA) {
        Set set = (Set) ((LinkedHashMap) this.LL).get(enumC432220GxA);
        if (set != null) {
            set.remove(view);
        }
        LIZIZ(view);
    }
}
