package com.google.android.material.datepicker;

import X.AbstractC21562119Zz;
import X.C098200Yq;
import X.C1389600mGU;
import X.C14K9;
import X.C14MI;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19PF;
import X.C21538919Rb;
import X.C21545019Tk;
import X.C21561719Zv;
import X.C21562319a1;
import X.C21565019aS;
import X.C786410Ut5;
import X.InterfaceC21561919Zx;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class MaterialDatePicker extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZigtPSohISQgZyHELIOSsyPCA8ICw4LTdiBC4nLTclKCMXKTEpGSYwIyA+";
    public final LinkedHashSet<InterfaceC21561919Zx<Object>> LL = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> LLILLJJLI = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> LLILLL = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> LLILZ = new LinkedHashSet<>();
    public int LLILZIL;
    public DateSelector<Object> LLILZLL;
    public PickerFragment<Object> LLIZ;
    public CalendarConstraints LLIZLLLIL;
    public MaterialCalendar<Object> LLJ;
    public int LLJI;
    public CharSequence LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public TextView LLJILLL;
    public C21545019Tk LLJJ;
    public C21538919Rb LLJJI;
    public Button LLJJIII;

    public final void RR() {
        String strJd = this.LLILZLL.jd(getContext());
        this.LLJILLL.setContentDescription(C786410Ut5.j4(getString(2131837542), new Object[]{strJd}));
        this.LLJILLL.setText(strJd);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LLIZ.LL.clear();
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.19Zw] */
    public final void PR() {
        PickerFragment<Object> materialTextInputPicker;
        Context contextRequireContext = requireContext();
        int iIv = this.LLILZIL;
        if (iIv == 0) {
            iIv = this.LLILZLL.iv(contextRequireContext);
        }
        DateSelector<Object> dateSelector = this.LLILZLL;
        CalendarConstraints calendarConstraints = this.LLIZLLLIL;
        MaterialCalendar<Object> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iIv);
        C786410Ut5.LJJIJL(bundle, "GRID_SELECTOR_KEY", dateSelector);
        C786410Ut5.LJJIJL(bundle, "CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        C786410Ut5.LJJIJL(bundle, "CURRENT_MONTH_KEY", calendarConstraints.openAt);
        materialCalendar.setArguments(bundle);
        this.LLJ = materialCalendar;
        if (this.LLJJ.isChecked()) {
            DateSelector<Object> dateSelector2 = this.LLILZLL;
            CalendarConstraints calendarConstraints2 = this.LLIZLLLIL;
            materialTextInputPicker = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iIv);
            C786410Ut5.LJJIJL(bundle2, "DATE_SELECTOR_KEY", dateSelector2);
            C786410Ut5.LJJIJL(bundle2, "CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
        } else {
            materialTextInputPicker = this.LLJ;
        }
        this.LLIZ = materialTextInputPicker;
        RR();
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.omm, this.LLIZ, null);
        c19ehLJIIJ.LJIIJJI();
        this.LLIZ.MR(new AbstractC21562119Zz<Object>() { // from class: X.19Zw
            @Override // X.AbstractC21562119Zz
            public final void LIZ() {
                this.LIZ.LLJJIII.setEnabled(false);
            }

            @Override // X.AbstractC21562119Zz
            public final void LIZIZ(Object obj) {
                this.LIZ.RR();
                MaterialDatePicker materialDatePicker = this.LIZ;
                materialDatePicker.LLJJIII.setEnabled(materialDatePicker.LLILZLL.Vk());
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Window window2 = requireDialog().getWindow();
        if (this.LLJILJIL) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(this.LLJJI);
        } else {
            window2.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.a8v);
            final Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window2.setBackgroundDrawable(new InsetDrawable((Drawable) this.LLJJI, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window2.getDecorView();
            final Dialog dialogRequireDialog = requireDialog();
            decorView2.setOnTouchListener(new View.OnTouchListener(dialogRequireDialog, rect) { // from class: X.0kVH
                public final Dialog LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;

                {
                    this.LL = dialogRequireDialog;
                    this.LLILLJJLI = rect.left;
                    this.LLILLL = rect.top;
                    this.LLILZ = ViewConfiguration.get(dialogRequireDialog.getContext()).getScaledWindowTouchSlop();
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    View viewFindViewById = view.findViewById(android.R.id.content);
                    int left = this.LLILLJJLI + viewFindViewById.getLeft();
                    int width = viewFindViewById.getWidth() + left;
                    if (new RectF(left, this.LLILLL + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r1).contains(motionEvent.getX(), motionEvent.getY())) {
                        return false;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        motionEventObtain.setAction(4);
                    }
                    if (Build.VERSION.SDK_INT < 28) {
                        motionEventObtain.setAction(0);
                        int i = this.LLILZ;
                        motionEventObtain.setLocation((-i) - 1, (-i) - 1);
                    }
                    view.performClick();
                    return this.LL.onTouchEvent(motionEventObtain);
                }
            });
        }
        PR();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public static int MR(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.a8n);
        int i = new Month(C21565019aS.LJII()).LLILLL;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.a8t) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.a97));
    }

    public static boolean NR(Context context) {
        return OR(android.R.attr.windowFullscreen, context);
    }

    public final void SR(C21545019Tk c21545019Tk) {
        String string;
        if (this.LLJJ.isChecked()) {
            string = c21545019Tk.getContext().getString(2131837567);
        } else {
            string = c21545019Tk.getContext().getString(2131837569);
        }
        this.LLJJ.setContentDescription(string);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LLILZIL = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.LLILZLL = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.LLIZLLLIL = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.LLJI = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.LLJIJIL = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.LLJILJILJ = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iIv = this.LLILZIL;
        if (iIv == 0) {
            iIv = this.LLILZLL.iv(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iIv);
        Context context = dialog.getContext();
        this.LLJILJIL = NR(context);
        int iLIZIZ = C19PF.LIZIZ(context, R.attr.bix, MaterialDatePicker.class.getCanonicalName());
        C21538919Rb c21538919Rb = new C21538919Rb(context, null, R.attr.f3n, R.style.a53);
        this.LLJJI = c21538919Rb;
        c21538919Rb.LJIIIIZZ(context);
        this.LLJJI.LJIIJJI(ColorStateList.valueOf(iLIZIZ));
        this.LLJJI.LJIIJ(C14K9.LJIIIIZZ(dialog.getWindow().getDecorView()));
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialog);
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month monthLJI;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.LLILZIL);
        C786410Ut5.LJJIJL(bundle, "DATE_SELECTOR_KEY", this.LLILZLL);
        C21561719Zv c21561719Zv = new C21561719Zv(this.LLIZLLLIL);
        Month month = this.LLJ.LLILZIL;
        if (month != null) {
            c21561719Zv.LIZJ = Long.valueOf(month.LLILZIL);
        }
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJL(bundle2, "DEEP_COPY_VALIDATOR_KEY", c21561719Zv.LIZLLL);
        Month monthLJI2 = Month.LJI(c21561719Zv.LIZ);
        Month monthLJI3 = Month.LJI(c21561719Zv.LIZIZ);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c21561719Zv.LIZJ;
        if (l == null) {
            monthLJI = null;
        } else {
            monthLJI = Month.LJI(l.longValue());
        }
        C786410Ut5.LJJIJL(bundle, "CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthLJI2, monthLJI3, dateValidator, monthLJI));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.LLJI);
        C786410Ut5.LJJIJIIJI(bundle, "TITLE_TEXT_KEY", this.LLJIJIL);
    }

    public static boolean OR(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C19PF.LIZIZ(context, R.attr.f3n, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        if (this.LLJILJIL) {
            i = R.layout.dp6;
        } else {
            i = R.layout.dp5;
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflater, viewGroup);
        Context context = viewSd.getContext();
        if (this.LLJILJIL) {
            C786410Ut5.W5(viewSd.findViewById(R.id.omm), new LinearLayout.LayoutParams(MR(context), -2));
        } else {
            View viewFindViewById = viewSd.findViewById(R.id.omn);
            View viewFindViewById2 = viewSd.findViewById(R.id.omm);
            C786410Ut5.W5(viewFindViewById, new LinearLayout.LayoutParams(MR(context), -1));
            Resources resources = requireContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.a9_) + resources.getDimensionPixelOffset(R.dimen.a9a) + resources.getDimensionPixelOffset(R.dimen.a99);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.a8u);
            int i2 = C21562319a1.LLILZLL;
            viewFindViewById2.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.a8p) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(R.dimen.a98)) + resources.getDimensionPixelOffset(R.dimen.a8m));
        }
        TextView textView = (TextView) viewSd.findViewById(R.id.omy);
        this.LLJILLL = textView;
        textView.setAccessibilityLiveRegion(1);
        this.LLJJ = (C21545019Tk) viewSd.findViewById(R.id.on0);
        TextView textView2 = (TextView) viewSd.findViewById(R.id.on4);
        CharSequence charSequence = this.LLJIJIL;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.LLJI);
        }
        this.LLJJ.setTag("TOGGLE_BUTTON_TAG");
        C21545019Tk c21545019Tk = this.LLJJ;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C14MI.LIZ(context, R.drawable.clm));
        stateListDrawable.addState(new int[0], C14MI.LIZ(context, R.drawable.clo));
        c21545019Tk.setImageDrawable(stateListDrawable);
        C21545019Tk c21545019Tk2 = this.LLJJ;
        if (this.LLJILJILJ != 0) {
            z = true;
        } else {
            z = false;
        }
        c21545019Tk2.setChecked(z);
        C19GS c19gs = null;
        q0.LJIJ(this.LLJJ, null);
        SR(this.LLJJ);
        C786410Ut5.t9(this.LLJJ, new View.OnClickListener() { // from class: X.19Zu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker materialDatePicker = this.LL;
                materialDatePicker.LLJJIII.setEnabled(materialDatePicker.LLILZLL.Vk());
                this.LL.LLJJ.toggle();
                MaterialDatePicker materialDatePicker2 = this.LL;
                materialDatePicker2.SR(materialDatePicker2.LLJJ);
                this.LL.PR();
            }
        });
        this.LLJJIII = (Button) viewSd.findViewById(R.id.eoq);
        if (this.LLILZLL.Vk()) {
            this.LLJJIII.setEnabled(true);
        } else {
            this.LLJJIII.setEnabled(false);
        }
        this.LLJJIII.setTag("CONFIRM_BUTTON_TAG");
        C786410Ut5.L7(this.LLJJIII, new View.OnClickListener() { // from class: X.19Zt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                for (InterfaceC21561919Zx<Object> interfaceC21561919Zx : this.LL.LL) {
                    this.LL.LLILZLL.cL();
                    interfaceC21561919Zx.LIZ();
                }
                this.LL.dismiss();
            }
        });
        Button button = (Button) viewSd.findViewById(R.id.db1);
        button.setTag("CANCEL_BUTTON_TAG");
        C786410Ut5.L7(button, new View.OnClickListener() { // from class: X.189q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator<View.OnClickListener> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().onClick(view);
                }
                this.LL.dismiss();
            }
        });
        try {
            ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewSd, this);
            viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewSd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewSd;
        }
    }
}
