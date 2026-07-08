package com.google.android.material.datepicker;

import X.AbstractC1585810rMx;
import X.C098200Yq;
import X.C0DXR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19PE;
import X.C19S0;
import X.C20094213jo;
import X.C20635115or;
import X.C21561819Zw;
import X.C21562419a2;
import X.C21562619a4;
import X.C21563719aF;
import X.C21679019sq;
import X.C786410Ut5;
import X.EnumC21173817tY;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.datepicker.MaterialCalendar;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZigtPSohISQgZyHELIOSsyPCA8ICw4LTdiBC4nLTclKCMQKSkpJysyOg==";
    public int LLILLJJLI;
    public DateSelector<S> LLILLL;
    public CalendarConstraints LLILZ;
    public Month LLILZIL;
    public EnumC21173817tY LLILZLL;
    public C19PE LLIZ;
    public RecyclerView LLIZLLLIL;
    public RecyclerView LLJ;
    public View LLJI;
    public View LLJIJIL;

    @Override // com.google.android.material.datepicker.PickerFragment
    public final boolean MR(C21561819Zw c21561819Zw) {
        return super.MR(c21561819Zw);
    }

    public final void NR(Month month) {
        boolean z;
        C21562419a2 c21562419a2 = (C21562419a2) this.LLJ.getAdapter();
        final int iLJIILL = c21562419a2.LLILLJJLI.start.LJIILL(month);
        int iLJIILL2 = iLJIILL - c21562419a2.LLILLJJLI.start.LJIILL(this.LLILZIL);
        boolean z2 = true;
        if (Math.abs(iLJIILL2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (iLJIILL2 <= 0) {
            z2 = false;
        }
        this.LLILZIL = month;
        if (z) {
            if (z2) {
                this.LLJ.scrollToPosition(iLJIILL - 3);
                HandlerHook.viewPost(this.LLJ, new Runnable() { // from class: X.17pl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
                        try {
                            this.LLILLJJLI.LLJ.smoothScrollToPosition(iLJIILL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
                    }
                });
                return;
            } else {
                this.LLJ.scrollToPosition(iLJIILL + 3);
                HandlerHook.viewPost(this.LLJ, new Runnable() { // from class: X.17pl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
                        try {
                            this.LLILLJJLI.LLJ.smoothScrollToPosition(iLJIILL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
                    }
                });
                return;
            }
        }
        HandlerHook.viewPost(this.LLJ, new Runnable() { // from class: X.17pl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
                try {
                    this.LLILLJJLI.LLJ.smoothScrollToPosition(iLJIILL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MaterialCalendar@12a1.postSmoothRecyclerViewScroll$1");
            }
        });
    }

    public final void OR(EnumC21173817tY enumC21173817tY) {
        this.LLILZLL = enumC21173817tY;
        if (enumC21173817tY == EnumC21173817tY.YEAR) {
            this.LLIZLLLIL.getLayoutManager().scrollToPosition(this.LLILZIL.LLILLJJLI - ((C21562619a4) this.LLIZLLLIL.getAdapter()).LL.LLILZ.start.LLILLJJLI);
            C786410Ut5.LJLLLLLL(0, this.LLJI);
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
            return;
        }
        if (enumC21173817tY != EnumC21173817tY.DAY) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLJI);
        C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
        NR(this.LLILZIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LLILLJJLI = bundle.getInt("THEME_RES_ID_KEY");
        this.LLILLL = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.LLILZ = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.LLILZIL = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.LLILLJJLI);
        C786410Ut5.LJJIJL(bundle, "GRID_SELECTOR_KEY", this.LLILLL);
        C786410Ut5.LJJIJL(bundle, "CALENDAR_CONSTRAINTS_KEY", this.LLILZ);
        C786410Ut5.LJJIJL(bundle, "CURRENT_MONTH_KEY", this.LLILZIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        C19GS c19gs;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.LLILLJJLI);
        this.LLIZ = new C19PE(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.LLILZ.start;
        if (MaterialDatePicker.NR(contextThemeWrapper)) {
            i = R.layout.dp0;
            i2 = 1;
        } else {
            i = R.layout.dov;
            i2 = 0;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterCloneInContext, i, viewGroup, false);
        GridView gridView = (GridView) viewTd.findViewById(R.id.oml);
        q0.LJIJ(gridView, new C20094213jo() { // from class: X.19Za
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        gridView.setAdapter((ListAdapter) new BaseAdapter() { // from class: X.19a6
            public static final int LLILZ;
            public final Calendar LL;
            public final int LLILLJJLI;
            public final int LLILLL;

            @Override // android.widget.Adapter
            public final long getItemId(int i3) {
                return 0L;
            }

            static {
                LLILZ = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
            }

            {
                Calendar calendarLJIIIIZZ = C21565019aS.LJIIIIZZ(null);
                this.LL = calendarLJIIIIZZ;
                this.LLILLJJLI = calendarLJIIIIZZ.getMaximum(7);
                this.LLILLL = calendarLJIIIIZZ.getFirstDayOfWeek();
            }

            @Override // android.widget.Adapter
            public final int getCount() {
                return this.LLILLJJLI;
            }

            @Override // android.widget.Adapter
            public final Object getItem(int i3) {
                int i4 = this.LLILLJJLI;
                if (i3 >= i4) {
                    return null;
                }
                int i5 = i3 + this.LLILLL;
                if (i5 > i4) {
                    i5 -= i4;
                }
                return Integer.valueOf(i5);
            }

            @Override // android.widget.Adapter
            public final View getView(int i3, View view, ViewGroup viewGroup2) {
                TextView textView = (TextView) view;
                if (view == null) {
                    textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup2.getContext()), R.layout.dot, viewGroup2, false);
                }
                Calendar calendar = this.LL;
                int i4 = i3 + this.LLILLL;
                int i5 = this.LLILLJJLI;
                if (i4 > i5) {
                    i4 -= i5;
                }
                calendar.set(7, i4);
                textView.setText(this.LL.getDisplayName(7, LLILZ, textView.getResources().getConfiguration().locale));
                textView.setContentDescription(C786410Ut5.j4(viewGroup2.getContext().getString(2131837548), new Object[]{this.LL.getDisplayName(7, 2, Locale.getDefault())}));
                return textView;
            }
        });
        gridView.setNumColumns(month.LLILLL);
        gridView.setEnabled(false);
        this.LLJ = (RecyclerView) viewTd.findViewById(R.id.omo);
        final Context context = getContext();
        this.LLJ.setLayoutManager(new C21679019sq(context, i2) { // from class: X.19aD
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = this.LLILLJJLI.LLJ.getWidth();
                    iArr[1] = this.LLILLJJLI.LLJ.getWidth();
                } else {
                    iArr[0] = this.LLILLJJLI.LLJ.getHeight();
                    iArr[1] = this.LLILLJJLI.LLJ.getHeight();
                }
            }
        });
        this.LLJ.setTag("MONTHS_VIEW_GROUP_TAG");
        final C21562419a2 c21562419a2 = new C21562419a2(contextThemeWrapper, this.LLILLL, this.LLILZ, new C21563719aF(this));
        this.LLJ.setAdapter(c21562419a2);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.bz);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.omr);
        this.LLIZLLLIL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.LLIZLLLIL.setLayoutManager(new GridLayoutManager(integer, 1, (Context) contextThemeWrapper, false));
            this.LLIZLLLIL.setAdapter(new C21562619a4(this));
            this.LLIZLLLIL.addItemDecoration(new C0DXR() { // from class: X.19a5
                public final Calendar LL = C21565019aS.LJIIIIZZ(null);
                public final Calendar LLILLJJLI = C21565019aS.LJIIIIZZ(null);

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int left;
                    int width;
                    if ((recyclerView2.getAdapter() instanceof C21562619a4) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        C21562619a4 c21562619a4 = (C21562619a4) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        for (C0WIY<Long, Long> c0wiy : this.LLILLL.LLILLL.aq()) {
                            Long l = c0wiy.LIZ;
                            if (l != null && c0wiy.LIZIZ != null) {
                                this.LL.setTimeInMillis(l.longValue());
                                this.LLILLJJLI.setTimeInMillis(c0wiy.LIZIZ.longValue());
                                int i3 = this.LL.get(1) - c21562619a4.LL.LLILZ.start.LLILLJJLI;
                                int i4 = this.LLILLJJLI.get(1) - c21562619a4.LL.LLILZ.start.LLILLJJLI;
                                View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i3);
                                View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i4);
                                int i5 = gridLayoutManager.LLILLJJLI;
                                int i6 = i3 / i5;
                                int i7 = i4 / i5;
                                for (int i8 = i6; i8 <= i7; i8++) {
                                    View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.LLILLJJLI * i8);
                                    if (viewFindViewByPosition3 != null) {
                                        int top = viewFindViewByPosition3.getTop() + this.LLILLL.LLIZ.LIZLLL.LIZ.top;
                                        int bottom = viewFindViewByPosition3.getBottom() - this.LLILLL.LLIZ.LIZLLL.LIZ.bottom;
                                        if (i8 == i6) {
                                            left = viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2);
                                        } else {
                                            left = 0;
                                        }
                                        if (i8 == i7) {
                                            width = viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2);
                                        } else {
                                            width = recyclerView2.getWidth();
                                        }
                                        canvas.drawRect(left, top, width, bottom, this.LLILLL.LLIZ.LJII);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        if (viewTd.findViewById(R.id.oke) != null) {
            final C19S0 c19s0 = (C19S0) viewTd.findViewById(R.id.oke);
            c19s0.setTag("SELECTOR_TOGGLE_TAG");
            q0.LJIJ(c19s0, new C20094213jo() { // from class: X.19Zb
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    String string;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    if (this.LIZ.LLJIJIL.getVisibility() == 0) {
                        string = this.LIZ.getString(2131837570);
                    } else {
                        string = this.LIZ.getString(2131837568);
                    }
                    accessibilityNodeInfoCompat.setHintText(string);
                }
            });
            C19S0 c19s02 = (C19S0) viewTd.findViewById(R.id.okg);
            c19s02.setTag("NAVIGATION_PREV_TAG");
            C19S0 c19s03 = (C19S0) viewTd.findViewById(R.id.okf);
            c19s03.setTag("NAVIGATION_NEXT_TAG");
            this.LLJI = viewTd.findViewById(R.id.omr);
            this.LLJIJIL = viewTd.findViewById(R.id.omk);
            OR(EnumC21173817tY.DAY);
            c19s0.setText(this.LLILZIL.LJIIJJI(viewTd.getContext()));
            this.LLJ.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.19a7
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i3) {
                    if (i3 == 0) {
                        recyclerView2.announceForAccessibility(c19s0.getText());
                    }
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i3, int i4) {
                    int iFindLastVisibleItemPosition;
                    if (i3 < 0) {
                        iFindLastVisibleItemPosition = ((LinearLayoutManager) this.LLILLL.LLJ.getLayoutManager()).findFirstVisibleItemPosition();
                    } else {
                        iFindLastVisibleItemPosition = ((LinearLayoutManager) this.LLILLL.LLJ.getLayoutManager()).findLastVisibleItemPosition();
                    }
                    this.LLILLL.LLILZIL = c21562419a2.LLILLJJLI.start.LJIILJJIL(iFindLastVisibleItemPosition);
                    C19S0 c19s04 = c19s0;
                    C21562419a2 c21562419a22 = c21562419a2;
                    c19s04.setText(c21562419a22.LLILLJJLI.start.LJIILJJIL(iFindLastVisibleItemPosition).LJIIJJI(c21562419a22.LL));
                }
            });
            C786410Ut5.r9(c19s0, new View.OnClickListener() { // from class: X.17ta
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = this.LL;
                    EnumC21173817tY enumC21173817tY = materialCalendar.LLILZLL;
                    EnumC21173817tY enumC21173817tY2 = EnumC21173817tY.YEAR;
                    if (enumC21173817tY == enumC21173817tY2) {
                        materialCalendar.OR(EnumC21173817tY.DAY);
                    } else {
                        if (enumC21173817tY != EnumC21173817tY.DAY) {
                            return;
                        }
                        materialCalendar.OR(enumC21173817tY2);
                    }
                }
            });
            C786410Ut5.r9(c19s03, new View.OnClickListener() { // from class: X.19a8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) this.LLILLJJLI.LLJ.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                    if (iFindFirstVisibleItemPosition < this.LLILLJJLI.LLJ.getAdapter().getItemCount()) {
                        this.LLILLJJLI.NR(c21562419a2.LLILLJJLI.start.LJIILJJIL(iFindFirstVisibleItemPosition));
                    }
                }
            });
            C786410Ut5.r9(c19s02, new View.OnClickListener() { // from class: X.19aA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int iFindLastVisibleItemPosition = ((LinearLayoutManager) this.LLILLJJLI.LLJ.getLayoutManager()).findLastVisibleItemPosition() - 1;
                    if (iFindLastVisibleItemPosition >= 0) {
                        this.LLILLJJLI.NR(c21562419a2.LLILLJJLI.start.LJIILJJIL(iFindLastVisibleItemPosition));
                    }
                }
            });
        }
        if (!MaterialDatePicker.NR(contextThemeWrapper)) {
            new C20635115or().LIZIZ(this.LLJ);
        }
        this.LLJ.scrollToPosition(c21562419a2.LLILLJJLI.start.LJIILL(this.LLILZIL));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
