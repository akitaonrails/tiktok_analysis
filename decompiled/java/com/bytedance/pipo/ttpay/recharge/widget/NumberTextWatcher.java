package com.bytedance.pipo.ttpay.recharge.widget;

import X.C13LN;
import X.C13LZ;
import Y.ARunnableS126S0100000_26;
import android.os.Looper;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import defpackage.CurrencyFormat;
import defpackage.c5;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public class NumberTextWatcher implements TextWatcher {
    public final LifecycleOwner LL;
    public final EditText LLILLJJLI;
    public final CurrencyFormat LLILLL;
    public final int LLILZ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS126S0100000_26 LLILZLL = new ARunnableS126S0100000_26(this, 14);
    public final long LLIZ;
    public final WeakReference<EditText> LLIZLLLIL;
    public String LLJ;
    public int LLJI;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final String LIZ() {
        String str;
        Character chLJLLILLLL;
        String string;
        CurrencyFormat currencyFormat = this.LLILLL;
        return (currencyFormat == null || (str = currencyFormat.decimalSeparator) == null || (chLJLLILLLL = C13LN.LJLLILLLL(str)) == null || (string = chLJLLILLLL.toString()) == null) ? e3.d : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0145, code lost:
    
        if (kotlin.text.u.LJIIZILJ(r4, LIZ(), false) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ttpay.recharge.widget.NumberTextWatcher.afterTextChanged(android.text.Editable):void");
    }

    public final int LIZIZ(int i, String str) {
        String strLIZ = LIZ();
        String strLJZL = C13LN.LJZL(i, str);
        int i2 = 0;
        for (int i3 = 0; i3 < strLJZL.length(); i3++) {
            char cCharAt = strLJZL.charAt(i3);
            if (Character.isDigit(cCharAt) || Intrinsics.LJFF(String.valueOf(cCharAt), strLIZ)) {
                i2++;
            }
        }
        return i2;
    }

    public final int LIZJ(int i, String str) {
        if (str == null || str.length() == 0 || i <= 0) {
            return 0;
        }
        String strLIZ = LIZ();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            i2++;
            if ((Character.isDigit(cCharAt) || Intrinsics.LJFF(String.valueOf(cCharAt), strLIZ)) && (i3 = i3 + 1) == i) {
                return i2;
            }
        }
        return str.length();
    }

    public NumberTextWatcher(LifecycleOwner lifecycleOwner, EditText editText, CurrencyFormat currencyFormat, int i) {
        float fFloatValue;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = editText;
        this.LLILLL = currencyFormat;
        this.LLILZ = i;
        Float f = c5.LIZ().debounceInterval;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.5f;
        }
        this.LLIZ = (long) (fFloatValue * 1000);
        this.LLIZLLLIL = new WeakReference<>(this.LLILLJJLI);
        this.LLJ = "";
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.ttpay.recharge.widget.NumberTextWatcher.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    NumberTextWatcher.this.LLILZIL.removeCallbacksAndMessages(null);
                }
            }
        });
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.LLJ = string;
        this.LLJI = LIZIZ(C13LZ.LJ(i, 0, string.length()), string);
    }
}
