package com.bytedance.tux.picker;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1579100rC8;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2257791DYr;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS88S0300000_24;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TuxWheelPickerFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9OCwvIiohHELIOSZhE5MRg7LSAgGSYwIyA+Dz0yLygpJzs=";
    public C1579100rC8 LL;
    public int LLILLJJLI;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C1579100rC8 c1579100rC8 = this.LL;
        if (c1579100rC8 == null || (str = c1579100rC8.LJI) == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        int i = this.LLILLJJLI;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 43));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        long jLongValue;
        C19GS c19gs = null;
        int iIntValue2 = 0;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, R$styleable.TuxWheelPickerSheet, R.attr.z8, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetCloseIcon, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetButtonVariant, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetButtonSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hd, viewGroup, false);
        C1579100rC8 c1579100rC8 = this.LL;
        if (c1579100rC8 != null) {
            C2257791DYr c2257791DYr = (C2257791DYr) viewTd.findViewById(R.id.qff);
            Integer num = c1579100rC8.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c2257791DYr.setPickerVariant(iIntValue);
            Integer num2 = c1579100rC8.LJFF;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            c2257791DYr.setGranularity(iIntValue2);
            Long l = c1579100rC8.LIZIZ;
            Long l2 = c1579100rC8.LIZJ;
            if (l != null && l2 != null) {
                c2257791DYr.LJ(l.longValue(), l2.longValue());
                Long l3 = c1579100rC8.LIZLLL;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = l.longValue();
                }
                c2257791DYr.setCurrentTime(jLongValue);
            }
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.clq);
            c197039127h.setButtonVariant(i);
            c197039127h.setButtonSize(i2);
            c197039127h.setText(c1579100rC8.LJII);
            C786410Ut5.U8(c197039127h, new ACListenerS88S0300000_24(c1579100rC8, c2257791DYr, this, 0));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
