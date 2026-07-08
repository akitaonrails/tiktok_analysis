package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields;

import X.C0I7D;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C1727360v3G;
import X.C1727830v41;
import X.C1727980v4G;
import X.C1748440vbG;
import X.C1749190vcT;
import X.C531650Kt9;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsTextInputCell extends BasePcsInputCell<C1727360v3G> {
    public C1748440vbG LLILZIL;
    public EditText LLILZLL;
    public final C1727830v41 LLIZ = new TextWatcher() { // from class: X.0v41
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws Throwable {
            String string = editable.toString();
            if (this.LL.P5().BQ2(this.LL.LLILLL, string)) {
                C1748440vbG c1748440vbG = this.LL.LLILZIL;
                if (c1748440vbG != null) {
                    c1748440vbG.LIZJ();
                    return;
                }
                return;
            }
            this.LL.T5(string);
        }
    };

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void U5() {
        C1748440vbG c1748440vbG = this.LLILZIL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(3);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell
    public final void V5() {
        C1748440vbG c1748440vbG = this.LLILZIL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C1748440vbG c1748440vbG = this.LLILZIL;
        if (c1748440vbG != null) {
            C1748440vbG.LJIIL(c1748440vbG, this.LLIZ);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1727360v3G c1727360v3G) {
        C1748440vbG c1748440vbG;
        super.onBindItemView(c1727360v3G);
        String str = (String) ((LinkedHashMap) P5().LLILZ).get(c1727360v3G.LLILLJJLI.LIZ);
        if (str == null) {
            str = c1727360v3G.LLILLJJLI.LJ;
        }
        C1748440vbG c1748440vbG2 = this.LLILZIL;
        if (c1748440vbG2 != null) {
            c1748440vbG2.setPlaceholderText(c1727360v3G.LLILLJJLI.LJI);
        }
        C1748440vbG c1748440vbG3 = this.LLILZIL;
        if (c1748440vbG3 != null) {
            c1748440vbG3.LLJLILLLLZIIL.setText(str);
        }
        LivePcsFormUxOptSetting livePcsFormUxOptSetting = LivePcsFormUxOptSetting.INSTANCE;
        if (livePcsFormUxOptSetting.isUxOptEnabled() && (c1748440vbG = this.LLILZIL) != null) {
            c1748440vbG.setImeOptions(R5());
        }
        C1749190vcT c1749190vcT = this.LLILLJJLI;
        if (c1749190vcT != null) {
            C1727980v4G.LIZ(c1749190vcT, this.LLILZIL, c1727360v3G.LLILLJJLI);
        }
        if (livePcsFormUxOptSetting.isAutofillEnabled()) {
            String[] strArr = c1727360v3G.LLILLJJLI.LJIIIZ;
            if (strArr == null) {
                strArr = new String[0];
            }
            EditText editText = this.LLILZLL;
            if (editText != null) {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                if (Build.VERSION.SDK_INT >= 26) {
                    editText.setAutofillHints((String[]) Arrays.copyOf(strArr2, strArr2.length));
                    editText.setImportantForAutofill(1);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.BasePcsInputCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int childCount;
        View childAt;
        final C0I7D c0i7d;
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C1748440vbG c1748440vbG = new C1748440vbG(viewGroup.getContext(), null, 6);
        c1748440vbG.setEditTextIsFocusable(true);
        c1748440vbG.setEditTextIsFocusableInTouchMode(true);
        c1748440vbG.setImeOptions(5);
        c1748440vbG.setSingleLine(true);
        c1748440vbG.LJIILLIIL(false);
        this.LLILZIL = c1748440vbG;
        c1748440vbG.LIZ(this.LLIZ);
        C1748440vbG c1748440vbG2 = this.LLILZIL;
        if (c1748440vbG2 != null && (c0i7d = c1748440vbG2.LLJLILLLLZIIL) != null) {
            c0i7d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0v40
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    C1748440vbG c1748440vbG3;
                    if (z) {
                        final C0I7D c0i7d2 = c0i7d;
                        HandlerHook.viewPost(c0i7d2, new Runnable() { // from class: X.0Heq
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PcsTextInputCell@583c.onCreateItemView$2$1$1");
                                try {
                                    C0I7D c0i7d3 = c0i7d2;
                                    Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sRoTTpTFTVp1bcmmtTXMxvjviL8MDMFOrcMkD0ab3LxO", null));
                                    c0i7d3.setSelection(editableLLLLJI != null ? editableLLLLJI.length() : 0);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PcsTextInputCell@583c.onCreateItemView$2$1$1");
                            }
                        });
                    }
                    if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled() && (c1748440vbG3 = this.LLILZIL) != null) {
                        c1748440vbG3.LJIILLIIL(z);
                    }
                }
            });
            if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
                c0i7d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0v42
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 5 && i != 6) {
                            return false;
                        }
                        this.LL.N5();
                        return true;
                    }
                });
            }
        }
        C1748440vbG c1748440vbG3 = this.LLILZIL;
        if (c1748440vbG3 != null) {
            childCount = c1748440vbG3.getChildCount();
        } else {
            childCount = 0;
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, childCount);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            C1748440vbG c1748440vbG4 = this.LLILZIL;
            if (c1748440vbG4 != null) {
                childAt = c1748440vbG4.getChildAt(iNextInt);
            } else {
                childAt = null;
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof EditText) {
                arrayList2.add(obj);
            }
        }
        this.LLILZLL = (EditText) C13LP.LJJJLL(arrayList2);
        return viewOnCreateItemView;
    }
}
