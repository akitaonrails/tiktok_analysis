package com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem;

import X.AbstractC738140SxQ;
import X.C1558520qew;
import X.C2188811AlT;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FirstScreenHelperAssem extends AbstractC738140SxQ implements FirstScreenHelperAbility, InterfaceC1554640qYg {
    public final Set<String> LL = Collections.synchronizedSet(new LinkedHashSet());
    public boolean LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility
    public final void Am() {
        this.LLILLJJLI = true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -620075026) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility
    public final void reset() {
        this.LL.clear();
        this.LLILLJJLI = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility
    public final String Kz0(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 == null || str2.length() == 0 || Intrinsics.LJFF(str2, str)) {
                str2 = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('-');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!this.LL.contains(strLIZIZ)) {
                if (!this.LLILLJJLI) {
                    this.LL.add(strLIZIZ);
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
