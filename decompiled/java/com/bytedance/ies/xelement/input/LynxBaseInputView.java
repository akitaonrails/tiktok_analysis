package com.bytedance.ies.xelement.input;

import X.C0WZX;
import X.C1289620jfE;
import X.C1297820jsS;
import X.C1298530jtb;
import X.C1299120juY;
import X.C1300980jxY;
import X.C1301060jxg;
import X.C1312920kGo;
import X.C1316960kNK;
import X.C1321710kUz;
import X.C1321900kVI;
import X.C21393618nu;
import X.C21393718nv;
import X.C21397018oS;
import X.C21397118oT;
import X.C21524019Li;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC21393818nw;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1321880kVG;
import X.InterfaceC1967107nB;
import X.RunnableC21393518nt;
import X.ViewOnFocusChangeListenerC1339230kxF;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS50S0110000_32;
import Y.ARunnableS89S0200000_20;
import Y.ATListenerS453S0100000_20;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import j27.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class LynxBaseInputView extends LynxUI<EditText> {
    public static final /* synthetic */ int LLLFF = 0;
    public C21397018oS LL;
    public int LLILLJJLI;
    public String LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public float LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public C21393718nv LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public final C1321900kVI LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;

    public static int LJJIJLIJ(int i) {
        if (i == 100 || i == 200 || i == 300 || i == 400) {
            return 0;
        }
        return (i == 500 || i == 600 || i == 700 || i == 800 || i == 900) ? 1 : 0;
    }

    public void LJJIIZI() {
    }

    public void LJJIJIIJI(C21397018oS c21397018oS) {
    }

    public void LJJIJIIJIL(C21397018oS c21397018oS, String str) {
    }

    public int LJJIJIL() {
        return 0;
    }

    public CharSequence LJJJI(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return charSequence;
    }

    public final void LJJIJL() {
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (c21397018oS.requestFocus()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFocus failed, input hasSize=");
        sbLIZ.append(LJJIZ());
        LynxLog.e("LynxBaseInputView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJJIZ() {
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        int bottom = c21397018oS.getBottom();
        C21397018oS c21397018oS2 = this.LL;
        if (c21397018oS2 == null) {
            c21397018oS2 = null;
        }
        if (bottom <= c21397018oS2.getTop()) {
            return false;
        }
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        int right = c21397018oS3.getRight();
        C21397018oS c21397018oS4 = this.LL;
        return right > (c21397018oS4 != null ? c21397018oS4 : null).getLeft();
    }

    public final void LJJJ() {
        Object objR2 = C786410Ut5.R2(this.mContext, "input_method");
        if (objR2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) objR2;
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        inputMethodManager.hideSoftInputFromWindow(c21397018oS.getWindowToken(), 0);
    }

    public void LJJJJ() {
        int iLJJIJLIJ = LJJIJLIJ(this.LLJI);
        String str = this.LLJIJIL;
        if (str != null) {
            Typeface typefaceLJ = C1300980jxY.LJ(iLJJIJLIJ, this.mContext, str);
            if (typefaceLJ == null) {
                LynxLog.i("LynxBaseInputView", "font-face is not found in TypefaceCache");
                typefaceLJ = C1301060jxg.LIZ.LJ(this.mContext, this.LLJIJIL, iLJJIJLIJ, new C21393618nu(this, 0));
                if (typefaceLJ == null) {
                    LynxLog.i("LynxBaseInputView", "font-face is not loaded, use default font");
                }
            }
            C21397018oS c21397018oS = this.LL;
            (c21397018oS != null ? c21397018oS : null).setTypeface(Typeface.create(typefaceLJ, iLJJIJLIJ));
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C21397018oS c21397018oS2 = this.LL;
            TextPaint paint = (c21397018oS2 != null ? c21397018oS2 : null).getPaint();
            paint.setTypeface(Typeface.create(paint.getTypeface(), this.LLJI, false));
        } else {
            C21397018oS c21397018oS3 = this.LL;
            C21397018oS c21397018oS4 = c21397018oS3 != null ? c21397018oS3 : null;
            c21397018oS4.setTypeface(Typeface.create(c21397018oS4.getTypeface(), iLJJIJLIJ));
        }
    }

    public void LJJJJI() {
        Typeface typefaceLJ;
        if (this.LLILLL == null) {
            return;
        }
        int iLJJIJLIJ = LJJIJLIJ(this.LLIZLLLIL);
        if (this.LLJILJILJ || this.LLJIJIL != null) {
            typefaceLJ = C1300980jxY.LJ(iLJJIJLIJ, this.mContext, this.LLJILJIL);
            if (typefaceLJ == null) {
                LynxLog.i("LynxBaseInputView", "font-face is not found in TypefaceCache");
                typefaceLJ = C1301060jxg.LIZ.LJ(this.mContext, this.LLJILJIL, iLJJIJLIJ, new C21393618nu(this, 1));
                if (typefaceLJ == null) {
                    LynxLog.i("LynxBaseInputView", "font-face is not loaded, use default font");
                }
            }
        } else {
            typefaceLJ = null;
        }
        if (typefaceLJ == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C21397018oS c21397018oS = this.LL;
                if (c21397018oS == null) {
                    c21397018oS = null;
                }
                typefaceLJ = Typeface.create(c21397018oS.getPaint().getTypeface(), this.LLIZLLLIL, false);
            } else {
                C21397018oS c21397018oS2 = this.LL;
                if (c21397018oS2 == null) {
                    c21397018oS2 = null;
                }
                typefaceLJ = Typeface.create(c21397018oS2.getTypeface(), iLJJIJLIJ);
            }
        }
        SpannableString spannableString = new SpannableString(this.LLILLL);
        int length = spannableString.length();
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan((int) this.LLILZ, false), 0, length, 33);
        if (typefaceLJ != null) {
            C786410Ut5.p2(spannableString, new C1316960kNK(typefaceLJ), 0, length, 33);
        }
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        c21397018oS3.setHint(spannableString);
        if (this.LLIZ) {
            C21397018oS c21397018oS4 = this.LL;
            (c21397018oS4 != null ? c21397018oS4 : null).setHintTextColor(this.LLILZLL);
            this.LLIZ = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        C1321900kVI c1321900kVI = this.LLJZ;
        if (c1321900kVI.LIZLLL != null) {
            C1321710kUz c1321710kUz = c1321900kVI.LJFF;
            C21397018oS c21397018oS = c1321900kVI.LJ;
            c1321710kUz.getClass();
            try {
                if (c1321710kUz.LJ != null) {
                    c1321710kUz.LJIIJ.remove(c21397018oS);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean isFocusable() {
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        return c21397018oS.isFocusable();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOverflow() {
        return super.getOverflow();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        super.layout();
        if (LJJIZ() && this.LLL) {
            this.LLL = false;
            setFocus(true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingTop + this.mBorderTopWidth;
        int i2 = this.mPaddingBottom + this.mBorderBottomWidth;
        int i3 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i4 = this.mPaddingRight + this.mBorderRightWidth;
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        c21397018oS.setPadding(i3, i, i4, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        String str = this.LLJJI;
        if (str != null) {
            LJJJIL(str, null, null);
            this.LLJJI = null;
        }
        if (this.LLJILLL) {
            LJJJJ();
            this.LLJILLL = false;
        }
        if (!this.LLJJ || this.LLILLL == null) {
            return;
        }
        LJJJJI();
        this.LLJJ = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIJ, reason: merged with bridge method [inline-methods] */
    public C21397018oS createView(Context context) {
        C21397018oS c21397018oS;
        C21397018oS c21397018oS2 = new C21397018oS(context);
        this.LL = c21397018oS2;
        C21393718nv c21393718nv = new C21393718nv(this);
        this.LLJLIL = c21393718nv;
        c21397018oS2.setFilters(new InputFilter[]{c21393718nv});
        c21397018oS2.addTextChangedListener(new C21524019Li(this, 0));
        c21397018oS2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1339230kxF(this, c21397018oS2, 0));
        c21397018oS2.setOnAttachedToWindowListener(new InterfaceC1321880kVG() { // from class: X.0kVF
            @Override // X.InterfaceC1321880kVG
            public final void LIZ(int i) {
                for (LynxBaseUI parentBaseUI = this.LIZ.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
                    if (Intrinsics.LJFF(parentBaseUI.getTagName(), "x-overlay-ng")) {
                        Window window = parentBaseUI.getWindow();
                        if (window != null) {
                            window.setSoftInputMode(i);
                            return;
                        }
                        return;
                    }
                }
                Window window2 = this.LIZ.getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(i);
                }
            }
        });
        c21397018oS2.setBackground(null);
        c21397018oS2.setImeOptions(1);
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        LJJIJIIJI(c21397018oS3);
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 == null) {
            c21397018oS4 = null;
        }
        c21397018oS4.setOnTouchListener(new ATListenerS453S0100000_20(this, 1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            C21397018oS c21397018oS5 = this.LL;
            if (c21397018oS5 == null) {
                c21397018oS5 = null;
            }
            c21397018oS5.setLayerType(1, null);
            C21397018oS c21397018oS6 = this.LL;
            if (c21397018oS6 == null) {
                c21397018oS6 = null;
            }
            c21397018oS6.setImportantForAutofill(2);
        }
        float fLIZJ = C1312920kGo.LIZJ("14px", 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ);
        this.mFontSize = fLIZJ;
        this.LLILZ = fLIZJ;
        C21397018oS c21397018oS7 = this.LL;
        if (c21397018oS7 == null) {
            c21397018oS7 = null;
        }
        c21397018oS7.setTextSize(0, fLIZJ);
        C21397018oS c21397018oS8 = this.LL;
        if (c21397018oS8 == null) {
            c21397018oS8 = null;
        }
        c21397018oS8.setTextColor(-16777216);
        C21397018oS c21397018oS9 = this.LL;
        if (c21397018oS9 == null) {
            c21397018oS = null;
            c21397018oS9 = null;
        } else {
            c21397018oS = c21397018oS9;
        }
        c21397018oS.setInputType(c21397018oS9.getInputType() | 524288);
        C21397018oS c21397018oS10 = this.LL;
        if (c21397018oS10 == null) {
            c21397018oS10 = null;
        }
        c21397018oS10.setFocusableInTouchMode(true);
        if (i >= 28) {
            C21397018oS c21397018oS11 = this.LL;
            if (c21397018oS11 == null) {
                c21397018oS11 = null;
            }
            c21397018oS11.setFallbackLineSpacing(true);
        }
        C21397018oS c21397018oS12 = this.LL;
        if (c21397018oS12 == null) {
            c21397018oS12 = null;
        }
        c21397018oS12.setCursorVisible(false);
        C21397018oS c21397018oS13 = this.LL;
        if (c21397018oS13 == null) {
            return null;
        }
        return c21397018oS13;
    }

    @InterfaceC1967107nB
    public final void blur(Callback callback) {
        setFocus(false);
        HandlerHook.viewPost(this.mView, new ARunnableS89S0200000_20(callback, this, 77));
    }

    @InterfaceC1967107nB
    public final void focus(Callback callback) {
        setFocus(true);
        HandlerHook.viewPost(this.mView, new ARunnableS89S0200000_20(callback, this, 76));
    }

    @InterfaceC1967107nB
    public final void getSelection(Callback callback) {
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (c21397018oS.isFocused()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            javaOnlyMap.putInt("selectionStart", c21397018oS3.getSelectionStart());
            C21397018oS c21397018oS4 = this.LL;
            if (c21397018oS4 != null) {
                c21397018oS2 = c21397018oS4;
            }
            javaOnlyMap.putInt("selectionEnd", c21397018oS2.getSelectionEnd());
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, "Target is not focused now.");
    }

    @InterfaceC1967107nB
    public final void select(Callback callback) {
        C21397018oS c21397018oS;
        C21397018oS c21397018oS2 = this.LL;
        if (c21397018oS2 == null) {
            c21397018oS2 = null;
        }
        if (C2204961BRm.LLLLII(c21397018oS2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null)) != null) {
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 == null) {
                c21397018oS = null;
                c21397018oS3 = null;
            } else {
                c21397018oS = c21397018oS3;
            }
            c21397018oS.setSelection(0, C2204961BRm.LLLLII(c21397018oS3, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null)).length());
            if (callback != null) {
                callback.invoke(0, "Success.");
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, "Input is not ready.");
    }

    @InterfaceC1312540kGC(name = "adjust-mode")
    public final void setAdjustMode(String str) {
        if (str == null) {
            str = "end";
        }
        this.LLJZ.LJIIIIZZ = str;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "auto-fill")
    public final void setAutoFill(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C21397018oS c21397018oS = null;
            if (!z) {
                C21397018oS c21397018oS2 = this.LL;
                if (c21397018oS2 != null) {
                    c21397018oS = c21397018oS2;
                }
                c21397018oS.setImportantForAutofill(2);
                return;
            }
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 != null) {
                c21397018oS = c21397018oS3;
            }
            c21397018oS.setImportantForAutofill(1);
            return;
        }
        LynxLog.w("LynxBaseInputView", "auto fill require android version above 8");
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "auto-fit")
    public final void setAutoFit(boolean z) {
        this.LLJZ.LJIIIZ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "keyboard-hide-blur")
    public final void setBlurKeyboardHide(boolean z) {
        this.LLJLL = z;
    }

    @InterfaceC1312540kGC(name = "bottom-inset")
    public final void setBottomInset(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "0px";
        }
        C1321900kVI c1321900kVI = this.LLJZ;
        c1321900kVI.LJIIJ = (int) C1312920kGo.LIZIZ(str2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c1321900kVI.LIZJ.LLJJJ);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "compat-number-type")
    public final void setCompatNumberType(boolean z) {
        this.LLLF = z;
        LJJIIZI();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1312540kGC(name = "confirm-type")
    public final void setConfirmType(String str) {
        if (str == null) {
            str = "done";
        }
        C21397018oS c21397018oS = null;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    C21397018oS c21397018oS2 = this.LL;
                    if (c21397018oS2 != null) {
                        c21397018oS = c21397018oS2;
                    }
                    c21397018oS.setImeOptions(3);
                }
                break;
            case 3304:
                if (str.equals("go")) {
                    C21397018oS c21397018oS3 = this.LL;
                    if (c21397018oS3 != null) {
                        c21397018oS = c21397018oS3;
                    }
                    c21397018oS.setImeOptions(2);
                }
                break;
            case 3089282:
                if (str.equals("done")) {
                    C21397018oS c21397018oS4 = this.LL;
                    if (c21397018oS4 != null) {
                        c21397018oS = c21397018oS4;
                    }
                    c21397018oS.setImeOptions(6);
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    C21397018oS c21397018oS5 = this.LL;
                    if (c21397018oS5 != null) {
                        c21397018oS = c21397018oS5;
                    }
                    c21397018oS.setImeOptions(5);
                }
                break;
            case 3526536:
                if (str.equals("send")) {
                    C21397018oS c21397018oS6 = this.LL;
                    if (c21397018oS6 != null) {
                        c21397018oS = c21397018oS6;
                    }
                    c21397018oS.setImeOptions(4);
                }
                break;
        }
    }

    @InterfaceC1312540kGC(name = "caret-color")
    public final void setCursorColor(String str) {
        Field declaredField;
        Object obj;
        Class<?> cls;
        if (str == null) {
            return;
        }
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        int iLIZIZ = ColorUtils.LIZIZ(str);
        try {
            try {
                declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                obj = declaredField.get(c21397018oS);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                declaredField = null;
            }
            if (obj == null) {
                obj = c21397018oS;
            }
            if (declaredField == null) {
                cls = TextView.class;
            } else {
                cls = obj.getClass();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField2.setAccessible(true);
            Drawable drawable = this.mContext.getDrawable(declaredField2.getInt(c21397018oS));
            if (drawable != null) {
                drawable.setTint(iLIZIZ);
                if (Build.VERSION.SDK_INT >= 28) {
                    Field declaredField3 = cls.getDeclaredField("mDrawableForCursor");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawable);
                } else {
                    Field declaredField4 = cls.getDeclaredField("mCursorDrawable");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj, new Drawable[]{drawable, drawable});
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (Intrinsics.LJFF(str, "transparent")) {
            try {
                Field declaredField5 = TextView.class.getDeclaredField("mTextSelectHandleRes");
                declaredField5.setAccessible(true);
                C21397018oS c21397018oS3 = this.LL;
                if (c21397018oS3 != null) {
                    c21397018oS2 = c21397018oS3;
                }
                declaredField5.setInt(c21397018oS2, R.color.transparent);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                LynxLog.w("LynxBaseInputView", "Failed to set transparent text select handle");
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "disabled")
    public final void setDisable(boolean z) {
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        c21397018oS.setEnabled(!z);
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        c21397018oS3.setFocusable(!z);
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 != null) {
            c21397018oS2 = c21397018oS4;
        }
        c21397018oS2.setFocusableInTouchMode(!z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLJJJ = map.containsKey("blur");
            this.LLJJJIL = map.containsKey("confirm");
            this.LLJJIJIL = map.containsKey("focus");
            this.LLJJIJIIJIL = map.containsKey("input");
            this.LLJJJJ = map.containsKey("length");
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "focus")
    public final void setFocus(boolean z) {
        if (!LJJIZ() && z) {
            this.LLL = true;
        } else {
            HandlerHook.viewPost(this.mView, new ARunnableS50S0110000_32(this, z, 1));
        }
    }

    @InterfaceC1312540kGC(defaultInt = -16777216, name = "color")
    public final void setFontColor(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297820jsS.LIZ[type.ordinal()];
            C21397018oS c21397018oS = null;
            if (i != 1) {
                if (i == 2) {
                    C21397018oS c21397018oS2 = this.LL;
                    if (c21397018oS2 != null) {
                        c21397018oS = c21397018oS2;
                    }
                    c21397018oS.setTextColor(ColorUtils.LIZIZ(interfaceC1298070jsr.asString()));
                    return;
                }
            } else {
                C21397018oS c21397018oS3 = this.LL;
                if (c21397018oS3 != null) {
                    c21397018oS = c21397018oS3;
                }
                c21397018oS.setTextColor(interfaceC1298070jsr.asInt());
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not supported color type: ");
        sbLIZ.append(interfaceC1298070jsr.getType().name());
        LynxLog.w("LynxBaseInputView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1312540kGC(name = "font-family")
    public final void setFontFamily(String str) {
        if (str == null) {
            return;
        }
        this.LLJIJIL = str;
        if (!this.LLJILJILJ) {
            this.LLJILJIL = str;
            this.LLJJ = true;
        }
        this.LLJILLL = true;
    }

    @InterfaceC1312540kGC(name = "font-size")
    public final void setFontTextSize(InterfaceC1298070jsr interfaceC1298070jsr) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        C21397018oS c21397018oS = null;
        if (interfaceC1298070jsr == null) {
            s sVar = this.mContext;
            if (sVar != null) {
                displayMetrics2 = sVar.LLJJJ;
            } else {
                displayMetrics2 = null;
            }
            this.mFontSize = C1312920kGo.LIZJ("14px", 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics2);
        } else {
            ReadableType type = interfaceC1298070jsr.getType();
            if (type != null) {
                int i = C1297820jsS.LIZ[type.ordinal()];
                if (i != 2) {
                    if (i == 3) {
                        float fAsDouble = (float) interfaceC1298070jsr.asDouble();
                        this.mFontSize = fAsDouble;
                        C21397018oS c21397018oS2 = this.LL;
                        if (c21397018oS2 == null) {
                            c21397018oS2 = null;
                        }
                        c21397018oS2.setTextSize(0, fAsDouble);
                    }
                } else {
                    String strAsString = interfaceC1298070jsr.asString();
                    s sVar2 = this.mContext;
                    if (sVar2 != null) {
                        displayMetrics = sVar2.LLJJJ;
                    } else {
                        displayMetrics = null;
                    }
                    float fLIZJ = C1312920kGo.LIZJ(strAsString, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
                    this.mFontSize = fLIZJ;
                    C21397018oS c21397018oS3 = this.LL;
                    if (c21397018oS3 == null) {
                        c21397018oS3 = null;
                    }
                    c21397018oS3.setTextSize(0, fLIZJ);
                }
            }
        }
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 != null) {
            c21397018oS = c21397018oS4;
        }
        c21397018oS.setTextSize(0, this.mFontSize);
        if (!this.LLILZIL) {
            this.LLILZ = this.mFontSize;
            this.LLJJ = true;
        }
    }

    @InterfaceC1312540kGC(name = "font-weight")
    public final void setFontWeight(Integer num) {
        int iIntValue = 400;
        if (num == null) {
            this.LLJI = 400;
        } else {
            int iIntValue2 = num.intValue();
            if (iIntValue2 != 0) {
                if (iIntValue2 != 1) {
                    iIntValue = (num.intValue() - 1) * 100;
                } else {
                    iIntValue = OppoPermissionPopupMaskDelayExp.DEFAULT;
                }
            }
            this.LLJI = iIntValue;
        }
        if (!this.LLJ) {
            this.LLIZLLLIL = this.LLJI;
            this.LLJJ = true;
        }
        this.LLJILLL = true;
    }

    @InterfaceC1967107nB
    public final void setInputFilter(ReadableMap readableMap) {
        C21393718nv c21393718nv;
        if (readableMap != null && (c21393718nv = this.LLJLIL) != null) {
            c21393718nv.LLILLJJLI = readableMap.getString("pattern");
        }
    }

    @InterfaceC1312540kGC(name = "type")
    public final void setInputType(String str) {
        if (str == null) {
            str = "text";
        }
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        LJJIJIIJIL(c21397018oS, str);
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        c21397018oS3.setInputType(c21397018oS3.getInputType() | 524288);
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 != null) {
            c21397018oS2 = c21397018oS4;
        }
        this.LLJLLIL = c21397018oS2.getInputType();
    }

    @InterfaceC1312540kGC(name = "value")
    public final void setInputValue(String str) {
        if (str == null) {
            str = "";
        }
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (Intrinsics.LJFF(str, String.valueOf(C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null))))) {
            return;
        }
        this.LLJJI = str;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enableAutoFill")
    public final void setIsAutoFillEnabled(boolean z) {
        this.LLJZIJLIL = z;
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        if (activityLIZ != null && Build.VERSION.SDK_INT >= 26) {
            if (this.LLJZIJLIL) {
                activityLIZ.getWindow().getDecorView().setImportantForAutofill(1);
            } else {
                activityLIZ.getWindow().getDecorView().setImportantForAutofill(8);
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "readonly")
    public final void setIsReadOnly(boolean z) {
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        c21397018oS.setFocusable(!z);
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 != null) {
            c21397018oS2 = c21397018oS3;
        }
        c21397018oS2.setFocusableInTouchMode(!z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "fullscreen-mode")
    public final void setKeyBoardFullscreenMode(boolean z) {
        C21397018oS c21397018oS = null;
        if (!z) {
            C21397018oS c21397018oS2 = this.LL;
            if (c21397018oS2 == null) {
                c21397018oS2 = null;
            } else {
                c21397018oS = c21397018oS2;
            }
            c21397018oS2.setImeOptions(c21397018oS.getImeOptions() | 33554432 | 268435456);
            return;
        }
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 != null) {
            c21397018oS = c21397018oS3;
        }
        c21397018oS.setImeOptions(1);
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "letter-spacing")
    public final void setLetterSpacing(float f) {
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (c21397018oS.getTextSize() == 0.0f) {
            LynxLog.w("LynxBaseInputView", "Input's textSize is 0f.");
            return;
        }
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 != null) {
            c21397018oS2 = c21397018oS3;
        }
        c21397018oS2.setLetterSpacing(f / c21397018oS2.getTextSize());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
        C21397018oS c21397018oS = null;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    C21397018oS c21397018oS2 = this.LL;
                    if (c21397018oS2 != null) {
                        c21397018oS = c21397018oS2;
                    }
                    c21397018oS.setTextDirection(3);
                    return;
                }
                return;
            }
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 != null) {
                c21397018oS = c21397018oS3;
            }
            c21397018oS.setTextDirection(4);
            return;
        }
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 != null) {
            c21397018oS = c21397018oS4;
        }
        c21397018oS.setTextDirection(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @X.InterfaceC1312540kGC(name = "maxlength")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMaxLength(X.InterfaceC1298070jsr r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L18
            r0 = 140(0x8c, float:1.96E-43)
            r2.LLILLJJLI = r0
        L6:
            int r0 = r2.LLILLJJLI
            if (r0 >= 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.LLILLJJLI = r0
        Lf:
            X.18nv r1 = r2.LLJLIL
            if (r1 == 0) goto L17
            int r0 = r2.LLILLJJLI
            r1.LL = r0
        L17:
            return
        L18:
            com.lynx.react.bridge.ReadableType r0 = r3.getType()
            if (r0 == 0) goto L32
            int[] r1 = X.C1297820jsS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L5b
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 3
            if (r1 == r0) goto L5b
            r0 = 4
            if (r1 == r0) goto L5b
        L32:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Not supported length type: "
            r1.append(r0)
            com.lynx.react.bridge.ReadableType r0 = r3.getType()
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxBaseInputView"
            com.lynx.base.log.LynxLog.w(r0, r1)
            goto L6
        L50:
            java.lang.String r0 = r3.asString()
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r2.LLILLJJLI = r0
            goto L6
        L5b:
            int r0 = r3.asInt()
            r2.LLILLJJLI = r0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setMaxLength(X.0jsr):void");
    }

    @InterfaceC1312540kGC(name = "placeholder-style")
    public final void setPlaceHolderStyle(ReadableMap readableMap) {
        String string;
        InterfaceC1298070jsr dynamic;
        InterfaceC1298070jsr dynamic2;
        InterfaceC1298070jsr dynamic3;
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("color") && (dynamic3 = readableMap.getDynamic("color")) != null) {
            setPlaceholderColor(dynamic3);
        }
        if (readableMap.hasKey("font-size") && (dynamic2 = readableMap.getDynamic("font-size")) != null) {
            setPlaceholderTextSize(dynamic2);
        }
        if (readableMap.hasKey("font-weight") && (dynamic = readableMap.getDynamic("font-weight")) != null) {
            setPlaceholderTextWeight(dynamic);
        }
        if (readableMap.hasKey("font-family") && (string = readableMap.getString("font-family")) != null) {
            setPlaceholderFontFamily(string);
        }
    }

    @InterfaceC1312540kGC(name = "placeholder")
    public final void setPlaceholder(String str) {
        if (str == null) {
            str = null;
        }
        this.LLILLL = str;
        this.LLJJ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r1 != 4) goto L14;
     */
    @X.InterfaceC1312540kGC(name = "placeholder-color")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlaceholderColor(X.InterfaceC1298070jsr r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L8
            r4.LLILZLL = r3
            r4.LLIZ = r3
            return
        L8:
            r2 = 1
            r4.LLIZ = r2
            r4.LLJJ = r2
            com.lynx.react.bridge.ReadableType r0 = r5.getType()
            if (r0 == 0) goto L23
            int[] r1 = X.C1297820jsS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L50
            r0 = 2
            if (r1 == r0) goto L45
            r0 = 4
            if (r1 == r0) goto L50
        L23:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Not supported color type: "
            r1.append(r0)
            com.lynx.react.bridge.ReadableType r0 = r5.getType()
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxBaseInputView"
            com.lynx.base.log.LynxLog.w(r0, r1)
            r4.LLIZ = r3
            r4.LLJJ = r3
            return
        L45:
            java.lang.String r0 = r5.asString()
            int r0 = com.lynx.tasm.utils.ColorUtils.LIZIZ(r0)
            r4.LLILZLL = r0
            return
        L50:
            int r0 = r5.asInt()
            r4.LLILZLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setPlaceholderColor(X.0jsr):void");
    }

    @InterfaceC1312540kGC(name = "placeholder-font-family")
    public final void setPlaceholderFontFamily(String str) {
        if (str == null) {
            this.LLJILJILJ = false;
            String str2 = this.LLJIJIL;
            if (str2 != null) {
                this.LLJILJIL = str2;
            } else {
                this.LLJILJIL = null;
            }
        } else {
            this.LLJILJILJ = true;
            this.LLJILJIL = str;
        }
        this.LLJJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @X.InterfaceC1312540kGC(name = "placeholder-font-size")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlaceholderTextSize(X.InterfaceC1298070jsr r12) {
        /*
            r11 = this;
            r2 = 0
            r3 = 1
            if (r12 != 0) goto Ld
            float r0 = r11.mFontSize
            r11.LLILZ = r0
            r11.LLILZIL = r2
        La:
            r11.LLJJ = r3
            return
        Ld:
            r11.LLILZIL = r3
            com.lynx.react.bridge.ReadableType r0 = r12.getType()
            if (r0 == 0) goto L28
            int[] r1 = X.C1297820jsS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L6c
            r0 = 2
            if (r1 == r0) goto L54
            r0 = 3
            if (r1 == r0) goto L4c
            r0 = 4
            if (r1 == r0) goto L6c
        L28:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Not supported placeholder-font-size type: "
            r1.append(r0)
            com.lynx.react.bridge.ReadableType r0 = r12.getType()
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxBaseInputView"
            com.lynx.base.log.LynxLog.w(r0, r1)
            r11.LLILZIL = r2
            float r0 = r11.mFontSize
            r11.LLILZ = r0
            goto La
        L4c:
            double r1 = r12.asDouble()
            float r0 = (float) r1
            r11.LLILZ = r0
            goto La
        L54:
            java.lang.String r4 = r12.asString()
            r5 = 0
            j27.s r0 = r11.mContext
            if (r0 == 0) goto L6a
            android.util.DisplayMetrics r10 = r0.LLJJJ
        L5f:
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            float r0 = X.C1312920kGo.LIZIZ(r4, r5, r6, r7, r8, r9, r10)
            r11.LLILZ = r0
            goto La
        L6a:
            r10 = 0
            goto L5f
        L6c:
            double r1 = r12.asDouble()
            float r0 = (float) r1
            r11.LLILZ = r0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setPlaceholderTextSize(X.0jsr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @X.InterfaceC1312540kGC(name = "placeholder-font-weight")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlaceholderTextWeight(X.InterfaceC1298070jsr r7) {
        /*
            r6 = this;
            r5 = 0
            r4 = 1
            if (r7 != 0) goto Ld
            int r0 = r6.LLJI
            r6.LLIZLLLIL = r0
            r6.LLJ = r5
        La:
            r6.LLJJ = r4
            return
        Ld:
            r6.LLJ = r4
            com.lynx.react.bridge.ReadableType r0 = r7.getType()
            if (r0 == 0) goto L2c
            int[] r1 = X.C1297820jsS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r3 = 700(0x2bc, float:9.81E-43)
            r2 = 400(0x190, float:5.6E-43)
            if (r1 == r4) goto L6e
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 3
            if (r1 == r0) goto L6e
            r0 = 4
            if (r1 == r0) goto L6e
        L2c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Not supported placeholder-font-weight type: "
            r1.append(r0)
            com.lynx.react.bridge.ReadableType r0 = r7.getType()
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxBaseInputView"
            com.lynx.base.log.LynxLog.w(r0, r1)
            r6.LLJ = r5
            int r0 = r6.LLJI
            r6.LLIZLLLIL = r0
            goto La
        L50:
            java.lang.String r1 = r7.asString()
            java.lang.String r0 = "bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            r6.LLIZLLLIL = r3
            goto La
        L5f:
            java.lang.String r1 = r7.asString()
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            r6.LLIZLLLIL = r2
            goto La
        L6e:
            int r0 = r7.asInt()
            if (r0 == 0) goto L80
            if (r0 == r4) goto L7d
            int r0 = r7.asInt()
            int r0 = r0 - r4
            int r3 = r0 * 100
        L7d:
            r6.LLIZLLLIL = r3
            goto La
        L80:
            r3 = 400(0x190, float:5.6E-43)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setPlaceholderTextWeight(X.0jsr):void");
    }

    @InterfaceC1312540kGC(name = "android-selection-handle-color")
    public final void setSelectionHandleColor(String str) {
        if (str == null) {
            return;
        }
        int iLIZIZ = ColorUtils.LIZIZ(str);
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        Drawable textSelectHandleLeft = c21397018oS.getTextSelectHandleLeft();
        C21397018oS c21397018oS3 = this.LL;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        Drawable textSelectHandleRight = c21397018oS3.getTextSelectHandleRight();
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 == null) {
            c21397018oS4 = null;
        }
        Drawable textSelectHandle = c21397018oS4.getTextSelectHandle();
        if (textSelectHandleLeft != null) {
            textSelectHandleLeft.setColorFilter(new PorterDuffColorFilter(iLIZIZ, PorterDuff.Mode.SRC_IN));
            C21397018oS c21397018oS5 = this.LL;
            if (c21397018oS5 == null) {
                c21397018oS5 = null;
            }
            c21397018oS5.setTextSelectHandleLeft(textSelectHandleLeft);
        }
        if (textSelectHandleRight != null) {
            textSelectHandleRight.setColorFilter(new PorterDuffColorFilter(iLIZIZ, PorterDuff.Mode.SRC_IN));
            C21397018oS c21397018oS6 = this.LL;
            if (c21397018oS6 == null) {
                c21397018oS6 = null;
            }
            c21397018oS6.setTextSelectHandleRight(textSelectHandleRight);
        }
        if (textSelectHandle != null) {
            textSelectHandle.setColorFilter(new PorterDuffColorFilter(iLIZIZ, PorterDuff.Mode.SRC_IN));
            C21397018oS c21397018oS7 = this.LL;
            if (c21397018oS7 != null) {
                c21397018oS2 = c21397018oS7;
            }
            c21397018oS2.setTextSelectHandle(textSelectHandle);
        }
    }

    @InterfaceC1312540kGC(name = "android-selection-highlight-color")
    public final void setSelectionHighLightColor(String str) {
        if (str == null) {
            return;
        }
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        c21397018oS.setHighlightColor(ColorUtils.LIZIZ(str));
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "show-soft-input-onfocus")
    public final void setShowSoftInputOnFocus(boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        C21397018oS c21397018oS = null;
        try {
            method = C21397018oS.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
        } catch (Exception e) {
            e = e;
            method = null;
        }
        try {
            method.setAccessible(true);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        if (activityLIZ != null) {
            if (!z) {
                this.LLJLILLLLZIIL = true;
                this.LLJLLL = activityLIZ.getWindow().getAttributes().softInputMode & 15;
                activityLIZ.getWindow().setSoftInputMode((activityLIZ.getWindow().getAttributes().softInputMode ^ 15) | 3);
                if (method != null) {
                    C21397018oS c21397018oS2 = this.LL;
                    if (c21397018oS2 != null) {
                        c21397018oS = c21397018oS2;
                    }
                    method.invoke(c21397018oS, Boolean.FALSE);
                    return;
                }
                return;
            }
            this.LLJLILLLLZIIL = false;
            activityLIZ.getWindow().setSoftInputMode((activityLIZ.getWindow().getAttributes().softInputMode ^ 15) | this.LLJLLL);
            if (method == null) {
                return;
            }
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 != null) {
                c21397018oS = c21397018oS3;
            }
            method.invoke(c21397018oS, Boolean.TRUE);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "smart-scroll")
    public final void setSmartScroll(boolean z) {
        C1321900kVI c1321900kVI = this.LLJZ;
        if (z) {
            if (!c1321900kVI.LJFF.LIZLLL) {
                if (!C1289620jfE.LIZIZ()) {
                    C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1321900kVI, 143));
                }
            } else {
                c1321900kVI.LIZJ();
            }
        } else if (c1321900kVI.LIZLLL != null) {
            C1321710kUz c1321710kUz = c1321900kVI.LJFF;
            C21397018oS c21397018oS = c1321900kVI.LJ;
            c1321710kUz.getClass();
            try {
                if (c1321710kUz.LJ != null) {
                    c1321710kUz.LJIIJ.remove(c21397018oS);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c1321900kVI.LJIIJJI = z;
    }

    @InterfaceC1312540kGC(name = "android-set-soft-input-mode")
    public final void setSoftInputMode(String str) {
        int i = 0;
        if (!Intrinsics.LJFF("unspecified", str)) {
            if (Intrinsics.LJFF("nothing", str)) {
                i = 48;
            } else if (Intrinsics.LJFF("pan", str)) {
                i = 32;
            } else if (Intrinsics.LJFF("resize", str)) {
                i = 16;
            }
        }
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        c21397018oS.LLJIJIL = i;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "text-align")
    public final void setTextAlign(int i) {
        int iLJJIJIL = LJJIJIL();
        C21397018oS c21397018oS = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C21397018oS c21397018oS2 = this.LL;
                    if (c21397018oS2 != null) {
                        c21397018oS = c21397018oS2;
                    }
                    c21397018oS.setGravity(iLJJIJIL | 5);
                    return;
                }
                return;
            }
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 != null) {
                c21397018oS = c21397018oS3;
            }
            c21397018oS.setGravity(iLJJIJIL | 1);
            return;
        }
        C21397018oS c21397018oS4 = this.LL;
        if (c21397018oS4 != null) {
            c21397018oS = c21397018oS4;
        }
        c21397018oS.setGravity(iLJJIJIL | 3);
    }

    public LynxBaseInputView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLJJLI = 140;
        this.LLIZLLLIL = 400;
        this.LLJI = 400;
        this.LLJL = Integer.MAX_VALUE;
        this.LLJLLIL = 1;
        this.LLJZ = new C1321900kVI(this);
    }

    @InterfaceC1967107nB
    public final void addText(ReadableMap readableMap, Callback callback) throws Throwable {
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("text");
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null));
        if (editableLLLLII != null) {
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 != null) {
                c21397018oS2 = c21397018oS3;
            }
            editableLLLLII.insert(c21397018oS2.getSelectionEnd(), string);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @InterfaceC1967107nB
    public final void controlKeyBoard(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        int i = readableMap.getInt("action");
        if (i >= 0 && i <= EnumC21393818nw.values().length - 1) {
            LJJIJL();
            C21397018oS c21397018oS = null;
            if (i == 0) {
                RunnableC21393518nt runnableC21393518nt = new RunnableC21393518nt(this.mContext, this);
                C21397018oS c21397018oS2 = this.LL;
                if (c21397018oS2 != null) {
                    c21397018oS = c21397018oS2;
                }
                HandlerHook.viewPost(c21397018oS, runnableC21393518nt);
            } else if (i == 1) {
                LJJJ();
            } else if (i != 2 && i == 3) {
                C21397018oS c21397018oS3 = this.LL;
                if (c21397018oS3 != null) {
                    c21397018oS = c21397018oS3;
                }
                c21397018oS.clearFocus();
                LJJJ();
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (callback != null) {
            callback.invoke(4);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void onFocusChanged(boolean z, boolean z2) {
        if (!z2 || this.LLJLILLLLZIIL) {
            if (z && !this.LLJJLIIIJLLLLLLLZ) {
                setFocus(true);
            } else {
                setFocus(false);
            }
        }
    }

    @InterfaceC1967107nB
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        try {
            int i = readableMap.getInt("action");
            if (i != 0) {
                if (i == 1) {
                    ((EditText) this.mView).dispatchKeyEvent(new KeyEvent(0, 67));
                }
            } else {
                int i2 = readableMap.getInt("length");
                C21397018oS c21397018oS = this.LL;
                if (c21397018oS == null) {
                    c21397018oS = null;
                }
                C21397118oT c21397118oTLJIIIIZZ = c21397018oS.LJIIIIZZ();
                if (c21397118oTLJIIIIZZ != null) {
                    c21397118oTLJIIIIZZ.deleteSurroundingText(i2, 0);
                }
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (callback != null) {
                callback.invoke(1, th);
            }
        }
    }

    @InterfaceC1967107nB
    public final void setSelectionRange(ReadableMap readableMap, Callback callback) {
        int i;
        int i2;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(4, "Param is not a map.");
                return;
            }
            return;
        }
        if (readableMap.hasKey("selectionStart")) {
            i = readableMap.getInt("selectionStart");
        } else {
            i = -1;
        }
        if (readableMap.hasKey("selectionEnd")) {
            i2 = readableMap.getInt("selectionEnd");
        } else {
            i2 = -1;
        }
        C21397018oS c21397018oS = this.LL;
        C21397018oS c21397018oS2 = null;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null)) != null) {
            C21397018oS c21397018oS3 = this.LL;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            int length = C2204961BRm.LLLLII(c21397018oS3, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8=", null)).length();
            if (length != -1 && i <= length && i2 <= length && i >= 0 && i2 >= 0) {
                C21397018oS c21397018oS4 = this.LL;
                if (c21397018oS4 != null) {
                    c21397018oS2 = c21397018oS4;
                }
                c21397018oS2.setSelection(i, i2);
                if (callback != null) {
                    callback.invoke(0, "Success.");
                    return;
                }
                return;
            }
        }
        if (callback != null) {
            callback.invoke(4, "Range does not meet expectations.");
        }
    }

    @InterfaceC1967107nB
    public final void setValue(ReadableMap readableMap, Callback callback) throws Throwable {
        String string;
        Integer numValueOf;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(4, "Param is not a map.");
                return;
            }
            return;
        }
        if (readableMap.hasKey("value")) {
            string = readableMap.getString("value");
        } else {
            string = "";
        }
        if (readableMap.hasKey("index")) {
            numValueOf = Integer.valueOf(readableMap.getInt("index"));
        } else {
            numValueOf = null;
        }
        LJJJIL(string, numValueOf, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1 A[PHI: r5
      0x00c1: PHI (r5v1 android.text.style.UnderlineSpan[]) = (r5v0 android.text.style.UnderlineSpan[]), (r5v4 android.text.style.UnderlineSpan[]) binds: [B:11:0x0040, B:19:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(java.lang.String r15, java.lang.Integer r16, com.lynx.react.bridge.Callback r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.LJJJIL(java.lang.String, java.lang.Integer, com.lynx.react.bridge.Callback):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        if (this.LLJJIII) {
            LJJJ();
        }
        super.onListCellDisAppear(str, lynxBaseUI, z);
    }
}
