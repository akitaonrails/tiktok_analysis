package com.google.android.material.timepicker;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19PF;
import X.C19S0;
import X.C19ZW;
import X.C21538919Rb;
import X.C21554519Xb;
import X.C21554619Xc;
import X.C21554719Xd;
import X.C21555619Xm;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public final class MaterialTimePicker extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZigtPSohISQgZzHELIOSs6JSA8ICw4LTdiBC4nLTclKCMHISgpGSYwIyA+";
    public C21554719Xd LLILZIL;
    public ViewStub LLILZLL;
    public C21554619Xc LLIZ;
    public C21554519Xb LLIZLLLIL;
    public C19ZW LLJ;
    public int LLJI;
    public int LLJIJIL;
    public String LLJILJILJ;
    public C19S0 LLJILLL;
    public TimeModel LLJJI;
    public final Set<View.OnClickListener> LL = new LinkedHashSet();
    public final Set<View.OnClickListener> LLILLJJLI = new LinkedHashSet();
    public final Set<DialogInterface.OnCancelListener> LLILLL = new LinkedHashSet();
    public final Set<DialogInterface.OnDismissListener> LLILZ = new LinkedHashSet();
    public int LLJILJIL = 0;
    public int LLJJ = 0;

    public final void MR(C19S0 c19s0) {
        C19ZW c19zw;
        Pair pair;
        C19ZW c19zw2 = this.LLJ;
        if (c19zw2 != null) {
            c19zw2.hide();
        }
        if (this.LLJJ == 0) {
            C21554619Xc c21554619Xc = this.LLIZ;
            C21554619Xc c21554619Xc2 = c21554619Xc;
            if (c21554619Xc == null) {
                c21554619Xc2 = new C21554619Xc(this.LLILZIL, this.LLJJI);
            }
            this.LLIZ = c21554619Xc2;
            c19zw = c21554619Xc2;
        } else {
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = new C21554519Xb((LinearLayout) C786410Ut5.LJLLLL(this.LLILZLL), this.LLJJI);
            }
            C21554519Xb c21554519Xb = this.LLIZLLLIL;
            c21554519Xb.LLILZIL.setChecked(false);
            c21554519Xb.LLILZLL.setChecked(false);
            c19zw = this.LLIZLLLIL;
        }
        this.LLJ = c19zw;
        c19zw.show();
        this.LLJ.invalidate();
        int i = this.LLJJ;
        if (i != 0) {
            if (i == 1) {
                pair = new Pair(Integer.valueOf(this.LLJIJIL), 2131837059);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("no icon for mode: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            pair = new Pair(Integer.valueOf(this.LLJI), 2131837064);
        }
        c19s0.setIconResource(((Integer) pair.first).intValue());
        c19s0.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
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
        if (bundle == null && (bundle = getArguments()) == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.LLJJI = timeModel;
        if (timeModel == null) {
            this.LLJJI = new TimeModel();
        }
        this.LLJJ = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
        this.LLJILJIL = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.LLJILJILJ = bundle.getString("TIME_PICKER_TITLE_TEXT");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        View decorView;
        TypedValue typedValueLIZ = C19PF.LIZ(R.attr.f3v, requireContext());
        Context contextRequireContext = requireContext();
        if (typedValueLIZ == null) {
            i = 0;
        } else {
            i = typedValueLIZ.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        int iLIZIZ = C19PF.LIZIZ(context, R.attr.bix, MaterialTimePicker.class.getCanonicalName());
        C21538919Rb c21538919Rb = new C21538919Rb(context, null, R.attr.f3u, R.style.a6e);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.MaterialTimePicker, R.attr.f3u, R.style.a6e);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialTimePicker_clockIcon, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialTimePicker_keyboardIcon, 0);
        typedArrayObtainStyledAttributes.recycle();
        c21538919Rb.LJIIIIZZ(context);
        c21538919Rb.LJIIJJI(ColorStateList.valueOf(iLIZIZ));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(c21538919Rb);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
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
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "TIME_PICKER_TIME_MODEL", this.LLJJI);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.LLJJ);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.LLJILJIL);
        C786410Ut5.LJJJI("TIME_PICKER_TITLE_TEXT", this.LLJILJILJ, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewSd = C786410Ut5.Sd(R.layout.dky, layoutInflater, viewGroup);
        C21554719Xd c21554719Xd = (C21554719Xd) viewSd.findViewById(R.id.o45);
        this.LLILZIL = c21554719Xd;
        c21554719Xd.setOnDoubleTapListener(new C21555619Xm(this));
        this.LLILZLL = (ViewStub) viewSd.findViewById(R.id.o3z);
        this.LLJILLL = (C19S0) viewSd.findViewById(R.id.o43);
        TextView textView = (TextView) viewSd.findViewById(R.id.jkv);
        if (!TextUtils.isEmpty(this.LLJILJILJ)) {
            textView.setText(this.LLJILJILJ);
        }
        int i = this.LLJILJIL;
        if (i != 0) {
            textView.setText(i);
        }
        MR(this.LLJILLL);
        C786410Ut5.L7((Button) viewSd.findViewById(R.id.o44), new View.OnClickListener() { // from class: X.19ZU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator<View.OnClickListener> it2 = this.LL.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().onClick(view);
                }
                this.LL.dismiss();
            }
        });
        C786410Ut5.L7((Button) viewSd.findViewById(R.id.o40), new View.OnClickListener() { // from class: X.19ZV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator<View.OnClickListener> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().onClick(view);
                }
                this.LL.dismiss();
            }
        });
        C786410Ut5.r9(this.LLJILLL, new View.OnClickListener() { // from class: X.19Xl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                MaterialTimePicker materialTimePicker = this.LL;
                if (materialTimePicker.LLJJ == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                materialTimePicker.LLJJ = i2;
                materialTimePicker.MR(materialTimePicker.LLJILLL);
            }
        });
        try {
            ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewSd, this);
            viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
