package com.ss.android.ugc.aweme.shortvideo.component.schedule;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2257791DYr;
import X.C297750Bll;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: loaded from: classes25.dex */
public final class ScheduleTimePickerFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9KyohOSHELIOSA9LSs4ZzwwICAoPCM2ZhYvISo3PSkpHSY+LRUlKiQ2OgM+KCg+LSs4";
    public int LL;
    public Long LLILLJJLI;
    public Long LLILLL;
    public Long LLILZ;
    public AwS636S0100000_22 LLILZIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131858149);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        int i = this.LL;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1120));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jLongValue;
        C19GS c19gs = null;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, R$styleable.TuxWheelPickerSheet, R.attr.z8, 0);
        this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetCloseIcon, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetButtonVariant, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPickerSheet__tux_wheelPickerSheetButtonSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9l, viewGroup, false);
        C2257791DYr c2257791DYr = (C2257791DYr) viewTd.findViewById(R.id.qff);
        if (C297750Bll.LIZ()) {
            ((TextView) viewTd.findViewById(R.id.t5k)).setText(C20642515q3.LJI(2131858148));
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_schedule_post_v2", true)) {
            c2257791DYr.setPickerVariant(7);
        } else {
            c2257791DYr.setPickerVariant(1);
        }
        c2257791DYr.setGranularity(0);
        Long l = this.LLILLJJLI;
        Long l2 = this.LLILLL;
        if (l != null && l2 != null) {
            c2257791DYr.LJ(l.longValue(), l2.longValue());
            Long l3 = this.LLILZ;
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = l.longValue();
            }
            c2257791DYr.setCurrentTime(jLongValue);
        }
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.cp0);
        c197039127h.setButtonVariant(i);
        c197039127h.setButtonSize(i2);
        C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(this, c2257791DYr, 10));
        C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.cwb);
        if (this.LLILZ != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
            c197039127h2.setButtonVariant(1);
            c197039127h2.setButtonSize(i2);
            C786410Ut5.U8(c197039127h2, new ACListenerS158S0100000_24(this, 51));
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
