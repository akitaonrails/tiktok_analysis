package com.bytedance.tux.sheet.calendar;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.content.Context;
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
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TuxCalendarRangePickerFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9KyQgLCE3KTHELIOSdiHTorCyQgLCE3KTceKCE0LRUlKiQ2OgM+KCg+LSs4";
    public int LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(85));

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = "";
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        int i = this.LL;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 202));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZJ(0);
        return c0om1;
    }

    public TuxCalendarRangePickerFragment() {
        Calendar.getInstance().getFirstDayOfWeek();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context context = getContext();
        C19GS c19gs = null;
        if (context == null) {
            viewTd = null;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxCalendarRangePicker, R.attr.xk, 0);
            C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerText);
            C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerStartTimeText);
            C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerEndTimeText);
            this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerCloseIcon, 0);
            typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerSeparatorColor, 0);
            typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerWeekFont, 0);
            typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerWeekTextColor, 0);
            typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerRangeTextColor, 0);
            typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerRangeTextFont, 0);
            typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerSubmitButtonSize, 0);
            typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCalendarRangePicker__tux_calendarRangePickerSubmitButtonVariant, 0);
            typedArrayObtainStyledAttributes.recycle();
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.g0, viewGroup, false);
            viewTd.findViewById(R.id.chr);
            viewTd.findViewById(R.id.cbr);
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
