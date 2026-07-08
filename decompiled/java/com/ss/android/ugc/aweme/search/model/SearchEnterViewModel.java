package com.ss.android.ugc.aweme.search.model;

import X.C0QER;
import X.C19EG;
import X.C294780Bgy;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEnterViewModel extends ViewModel {
    public static final Map<Integer, C0QER> LLILLJJLI = new LinkedHashMap();
    public C0QER LL;

    public final C0QER vQ2() {
        C0QER c0qer = this.LL;
        return c0qer == null ? new C0QER() : c0qer;
    }

    public final void yQ2(C19EG c19eg, C0QER c0qer, Fragment fragment) {
        int iIntValue;
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (c0qer == null || c19eg == null) {
            return;
        }
        this.LL = c0qer;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC214902198i interfaceC214902198i = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        break;
                    } else {
                        fragment = fragment.getParentFragment();
                        if (fragment == null) {
                            break;
                        }
                    }
                }
            }
        }
        sAFHelper.getClass();
        Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198i, c19eg);
        if (numLJJIJIIJI != null) {
            iIntValue = numLJJIJIIJI.intValue();
        } else {
            iIntValue = -1;
        }
        LLILLJJLI.put(Integer.valueOf(iIntValue), c0qer);
    }
}
