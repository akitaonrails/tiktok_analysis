package com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik;

import X.C098200Yq;
import X.C09RD;
import X.C09RE;
import X.C1018703yb;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1719570uqh;
import X.C1748330vb5;
import X.C1754640vlG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C339010DQt;
import X.C343970De7;
import X.C786410Ut5;
import X.C911003hE;
import X.EnumC1723120uwQ;
import X.EnumC1723160uwU;
import X.InterfaceC1754730vlP;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik.BlikCodeInputBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class BlikCodeInputBottomSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGHELIOSs6ICokZicgICR9CiklIgw8LCAFJz8mPAcjPTs8JRYkLConDjctLiI2JjE=";
    public Function1<? super String, Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public C1754640vlG LLILLL;
    public C1748330vb5 LLILZ;
    public C1390410mHn LLILZIL;
    public EditText LLILZLL;
    public C1719570uqh LLIZ;
    public long LLIZLLLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        EditText editText;
        C1719570uqh c1719570uqh = this.LLIZ;
        if (c1719570uqh != null && (editText = this.LLILZLL) != null) {
            editText.removeTextChangedListener(c1719570uqh);
        }
        this.LLIZ = null;
        this.LLILZLL = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LL = null;
        this.LLILLJJLI = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InputMethodManager inputMethodManager;
        super.onPause();
        View view = getView();
        if (view != null) {
            Object objH2 = C786410Ut5.H2(view.getContext(), "input_method");
            if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InputMethodManager inputMethodManager;
        super.onStart();
        C1754640vlG c1754640vlG = this.LLILLL;
        if (c1754640vlG != null) {
            c1754640vlG.requestFocus();
        }
        Context context = getContext();
        Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this.LLILLL, 1);
    }

    public final void u3() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLIZLLLIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "blik_code_input");
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public static EditText MR(View view) {
        EditText editTextMR;
        if (view instanceof EditText) {
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            do {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    editTextMR = MR((View) c09re.next());
                } else {
                    return null;
                }
            } while (editTextMR == null);
            return editTextMR;
        }
        return null;
    }

    public final void setLoading(boolean z) {
        if (z) {
            C1390410mHn c1390410mHn = this.LLILZIL;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 0);
            }
            C1390410mHn c1390410mHn2 = this.LLILZIL;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZJ();
            }
            C1748330vb5 c1748330vb5 = this.LLILZ;
            if (c1748330vb5 != null) {
                C786410Ut5.LLLLLLLZIL(c1748330vb5, 8);
                return;
            }
            return;
        }
        C1390410mHn c1390410mHn3 = this.LLILZIL;
        if (c1390410mHn3 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn3, 8);
        }
        C1390410mHn c1390410mHn4 = this.LLILZIL;
        if (c1390410mHn4 != null) {
            c1390410mHn4.LIZLLL();
        }
        C1748330vb5 c1748330vb52 = this.LLILZ;
        if (c1748330vb52 == null) {
            return;
        }
        C786410Ut5.LLLLLLLZIL(c1748330vb52, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0uqh, android.text.TextWatcher] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (C1754640vlG) view.findViewById(R.id.c35);
        this.LLILZ = (C1748330vb5) view.findViewById(R.id.c36);
        this.LLILZIL = (C1390410mHn) view.findViewById(R.id.c34);
        TextView textView = (TextView) view.findViewById(R.id.c33);
        if (textView != null) {
            Context context = view.getContext();
            String string = context.getString(2131840224);
            String string2 = context.getString(2131840225);
            String strLJJIFFI = u.LJJIFFI(string, "{boldText}", string2, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJJIFFI);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, strLJJIFFI.length(), 33);
            }
            int iLJJJ = a0.LJJJ(strLJJIFFI, string2, 0, false, 6);
            if (iLJJJ >= 0) {
                int length = string2.length() + iLJJJ;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ2 != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), iLJJJ, length, 33);
                }
            }
            textView.setText(spannableStringBuilder);
        }
        C1754640vlG c1754640vlG = this.LLILLL;
        if (c1754640vlG != null) {
            c1754640vlG.setAutoWidth(false);
        }
        C1754640vlG c1754640vlG2 = this.LLILLL;
        if (c1754640vlG2 != null) {
            c1754640vlG2.setPinType(EnumC1723120uwQ.NUMERIC);
        }
        C1754640vlG c1754640vlG3 = this.LLILLL;
        if (c1754640vlG3 != null) {
            c1754640vlG3.setPattern(new C339010DQt(C1697810uHb.LJ(Integer.valueOf(C911003hE.LIZLLL().inputCodeDigit))));
        }
        C1754640vlG c1754640vlG4 = this.LLILLL;
        if (c1754640vlG4 != null) {
            c1754640vlG4.setDeleteAllAfterError(true);
        }
        C1754640vlG c1754640vlG5 = this.LLILLL;
        if (c1754640vlG5 != null) {
            c1754640vlG5.setShowCursor(EnumC1723160uwU.ALWAYS);
        }
        C1754640vlG c1754640vlG6 = this.LLILLL;
        if (c1754640vlG6 != null) {
            c1754640vlG6.setListener(new InterfaceC1754730vlP() { // from class: X.0uqf
                @Override // X.InterfaceC1754730vlP
                public final void LIZ(int i, CharSequence charSequence) {
                }

                @Override // X.InterfaceC1754730vlP
                public final void LJJLL() {
                }

                @Override // X.InterfaceC1754730vlP
                public final void LJJZ(CharSequence charSequence) {
                    String string3;
                    this.LIZ.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("page_name", "blik_code_input");
                    C1018703yb.LIZIZ("tiktokec_blik_code_input", linkedHashMap);
                    this.LIZ.setLoading(true);
                    Function1<? super String, Unit> function1 = this.LIZ.LL;
                    if (function1 != null) {
                        if (charSequence == null || (string3 = charSequence.toString()) == null) {
                            string3 = "";
                        }
                        function1.invoke(string3);
                    }
                }
            });
        }
        C1754640vlG c1754640vlG7 = this.LLILLL;
        if (c1754640vlG7 != null) {
            EditText editTextMR = MR(c1754640vlG7);
            this.LLILZLL = editTextMR;
            ?? r0 = new TextWatcher() { // from class: X.0uqh
                public int LL;

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int length2;
                    C1748330vb5 c1748330vb5;
                    if (editable != null) {
                        length2 = editable.length();
                    } else {
                        length2 = 0;
                    }
                    if (length2 > this.LL && (c1748330vb5 = this.LLILLJJLI.LLILZ) != null && c1748330vb5.getVisibility() == 0) {
                        BlikCodeInputBottomSheetFragment blikCodeInputBottomSheetFragment = this.LLILLJJLI;
                        C1748330vb5 c1748330vb52 = blikCodeInputBottomSheetFragment.LLILZ;
                        if (c1748330vb52 != null) {
                            c1748330vb52.setMessageStyle(C1719580uqi.LIZ);
                        }
                        C1748330vb5 c1748330vb53 = blikCodeInputBottomSheetFragment.LLILZ;
                        if (c1748330vb53 != null) {
                            c1748330vb53.setMessageIcon(null);
                        }
                        C1748330vb5 c1748330vb54 = blikCodeInputBottomSheetFragment.LLILZ;
                        if (c1748330vb54 != null) {
                            c1748330vb54.setMessage(null);
                        }
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    int length2;
                    if (charSequence != null) {
                        length2 = charSequence.length();
                    } else {
                        length2 = 0;
                    }
                    this.LL = length2;
                }
            };
            this.LLIZ = r0;
            if (editTextMR != 0) {
                editTextMR.addTextChangedListener(r0);
            }
        }
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.cov), new ACListenerS160S0100000_26(this, 30));
        this.LLIZLLLIL = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "blik_code_input");
        C1018703yb.LIZIZ("tiktokec_enter_page", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c85, viewGroup, false);
        C19GS c19gs = null;
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
