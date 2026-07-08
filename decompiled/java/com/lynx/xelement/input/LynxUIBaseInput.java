package com.lynx.xelement.input;

import X.C0WZX;
import X.C1289960jfm;
import X.C1292490jjr;
import X.C1297830jsT;
import X.C1298530jtb;
import X.C1298720jtu;
import X.C1300980jxY;
import X.C1301060jxg;
import X.C1301090jxj;
import X.C1311130kDv;
import X.C1311730kEt;
import X.C1312920kGo;
import X.C1316960kNK;
import X.C21359518iP;
import X.C21359618iQ;
import X.C21360018iU;
import X.C21396918oR;
import X.C21524019Li;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1321810kV9;
import X.InterfaceC1967107nB;
import X.InterfaceC21359918iT;
import X.InterfaceC21393418ns;
import X.ViewOnFocusChangeListenerC1339230kxF;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS120S0100000_20;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.xelement.input.LynxUIBaseInput;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import j27.s;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUIBaseInput extends LynxUI<C21360018iU> implements InterfaceC1321810kV9 {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public boolean LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public float LLJI;
    public int LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C21359618iQ LLJJIJIL;
    public InputFilter.LengthFilter LLJJJ;
    public final C21359518iP LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;

    public void LJJIIZI() {
    }

    public int LJJIJIIJI() {
        return 0;
    }

    public boolean LJJIZ() {
        return false;
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "line-height")
    public final void setLineHeight(float f) {
    }

    @Override // X.InterfaceC1321810kV9
    public final void LJIJ() {
        HandlerHook.viewPost(this.mView, new ARunnableS120S0100000_20(this, 222));
    }

    public final void LJJIJLIJ() {
        Object objR2 = C786410Ut5.R2(this.mContext, "input_method");
        if (objR2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        ((InputMethodManager) objR2).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
    }

    public final void LJJJ() {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "confirm");
        Editable editableLLLLZLL = C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null));
        c1289960jfm.LIZIZ(editableLLLLZLL != null ? editableLLLLZLL.toString() : null, "value");
        c1298720jtu.LIZIZ(c1289960jfm);
    }

    public final boolean LJJJI() {
        Object objR2 = C786410Ut5.R2(this.mContext, "input_method");
        if (objR2 != null) {
            return ((InputMethodManager) objR2).showSoftInput(this.mView, 1, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean isFocusable() {
        return this.mView.isFocusable();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((TextView) this.mView).setWidth(getWidth());
        ((TextView) this.mView).setHeight(getHeight());
        ((TextView) this.mView).setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
        this.LLJJIII += LJJIJL(this.mView.isFocused());
    }

    @Override // X.InterfaceC1321810kV9
    public final void LJJIIJ(int i) {
        if (this.mView.isFocused()) {
            this.LLJJI = false;
            this.LLJILLL = i;
            this.LLJJIII = LJJIJL(true);
            C1298720jtu c1298720jtu = this.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "keyboardheightchange");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "height");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.18iU, X.18oR, android.view.View, android.widget.TextView, java.lang.Object] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIJ, reason: merged with bridge method [inline-methods] */
    public C21360018iU createView(Context context) {
        DisplayMetrics displayMetrics;
        s sVar = this.mContext;
        if (sVar != null) {
            displayMetrics = sVar.LLJJJ;
        } else {
            displayMetrics = null;
        }
        this.mFontSize = C1312920kGo.LIZJ("14px", 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
        ?? r3 = new C21396918oR(context) { // from class: X.18iU
            public InterfaceC21359918iT LLJILLL;
            public float LLJJ;
            public int LLJJI;

            public final InterfaceC21359918iT getOnSelectionChangeListener() {
                return this.LLJILLL;
            }

            {
                new LinkedHashMap();
            }

            @Override // android.widget.TextView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (!isFocusable()) {
                    return false;
                }
                if (motionEvent == null) {
                    return super.onTouchEvent(null);
                }
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                getParent().requestDisallowInterceptTouchEvent(false);
                                this.LLJJ = 0.0f;
                                Math.abs(getScrollY() - this.LLJJI);
                            }
                        } else if ((!canScrollVertically(1) && motionEvent.getY() < this.LLJJ) || (!canScrollVertically(-1) && motionEvent.getY() > this.LLJJ)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        this.LLJJ = 0.0f;
                        Math.abs(getScrollY() - this.LLJJI);
                    }
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    motionEvent.getX();
                    this.LLJJ = motionEvent.getY();
                    this.LLJJI = getScrollY();
                }
                return super.onTouchEvent(motionEvent);
            }

            public final void setOnSelectionChangeListener(InterfaceC21359918iT interfaceC21359918iT) {
                this.LLJILLL = interfaceC21359918iT;
            }

            @Override // android.widget.TextView
            public final void onSelectionChanged(int i, int i2) {
                super.onSelectionChanged(i, i2);
                InterfaceC21359918iT interfaceC21359918iT = this.LLJILLL;
                if (interfaceC21359918iT != null) {
                    interfaceC21359918iT.LIZ(i, i2);
                }
            }
        };
        r3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1339230kxF(this, r3, 1));
        r3.setOnAttachedToWindowListener(new InterfaceC21393418ns() { // from class: X.0kVE
            @Override // X.InterfaceC21393418ns
            public final void LIZ(int i) {
                for (LynxBaseUI parentBaseUI = this.LIZ.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
                    if (Intrinsics.LJFF(parentBaseUI.getTagName(), "x-overlay-ng") || Intrinsics.LJFF(parentBaseUI.getTagName(), "overlay")) {
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
        r3.setBackground(null);
        r3.setImeOptions(1);
        r3.addTextChangedListener(new C21524019Li(this, 2));
        r3.setOnSelectionChangeListener(new InterfaceC21359918iT() { // from class: X.18iS
            @Override // X.InterfaceC21359918iT
            public final void LIZ(int i, int i2) {
                LynxUIBaseInput lynxUIBaseInput = this.LIZ;
                C1298720jtu c1298720jtu = lynxUIBaseInput.mContext.LLIZ;
                C1289960jfm c1289960jfm = new C1289960jfm(lynxUIBaseInput.getSign(), "selection");
                c1289960jfm.LIZIZ(Integer.valueOf(i), "selectionStart");
                c1289960jfm.LIZIZ(Integer.valueOf(i2), "selectionEnd");
                c1298720jtu.LIZIZ(c1289960jfm);
            }
        });
        LynxView lynxViewLJIILJJIL = this.mContext.LJIILJJIL();
        if (lynxViewLJIILJJIL != null) {
            lynxViewLJIILJJIL.getKeyboardEvent().LIZJ();
            lynxViewLJIILJJIL.getKeyboardEvent().LJIIJJI.put(this, this);
        }
        r3.setHint("");
        r3.setFocusableInTouchMode(true);
        return r3;
    }

    public final void LJJIJIIJIL(Callback callback) {
        this.mView.clearFocus();
        if (!this.LLJJJJJIL) {
            LJJIJLIJ();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    public final void LJJIJIL(Callback callback) {
        if (this.mView.requestFocus()) {
            if (this.LLJJJJJIL) {
                LJJIJLIJ();
                return;
            }
            if (LJJJI()) {
                if (callback == null) {
                    return;
                }
                callback.invoke(0);
                return;
            } else {
                if (callback == null) {
                    return;
                }
                callback.invoke(1, "fail to show keyboard");
                return;
            }
        }
        if (callback == null) {
            return;
        }
        callback.invoke(1, "fail to focus");
    }

    public final float LJJIJL(boolean z) {
        Window window;
        View decorView;
        int height;
        if (this.LLJILJILJ && this.mContext.LJIILJJIL() != null) {
            if (z) {
                if (this.mView.isFocused()) {
                    RectF rectFLJ = C1292490jjr.LJ(this, new RectF(0.0f, 0.0f, getWidth(), getHeight()));
                    Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
                    if (activityLIZ != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        ViewGroup viewGroup = (ViewGroup) decorView;
                        View childAt = viewGroup.getChildAt(0);
                        int height2 = viewGroup.getHeight();
                        if (childAt != null) {
                            height = height2 - childAt.getHeight();
                        } else {
                            height = 0;
                        }
                        float translationY = (this.LLJILLL - (((height2 - height) - rectFLJ.bottom) + this.mContext.LJIILJJIL().getTranslationY())) + this.LLJJ;
                        if (this.LLJJIII == 0.0f) {
                            if (translationY > 0.0f) {
                                this.mContext.LJIILJJIL().animate().translationY(-translationY).setDuration(300L).start();
                                return translationY;
                            }
                        } else {
                            this.mContext.LJIILJJIL().animate().translationY(-translationY).setDuration(300L).start();
                            return 0.0f;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            } else if (this.LLJJI) {
                this.LLJJI = false;
                if (this.LLJJIII != 0.0f) {
                    this.mContext.LJIILJJIL().animate().translationY(0.0f).setDuration(300L).start();
                }
            }
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void afterPropsUpdated(C1311730kEt c1311730kEt) {
        Typeface typefaceCreate;
        Typeface typefaceLJ;
        boolean z;
        super.afterPropsUpdated(c1311730kEt);
        String str = this.LLIZ;
        if (str != null) {
            typefaceCreate = C1300980jxY.LJ(this.LLILZIL, this.mContext, str);
        } else {
            typefaceCreate = null;
        }
        String str2 = "";
        if (typefaceCreate == null) {
            C1301090jxj c1301090jxj = C1301060jxg.LIZ;
            s sVar = this.mContext;
            String str3 = this.LLIZ;
            if (str3 == null) {
                str3 = "";
            }
            typefaceCreate = c1301090jxj.LJ(sVar, str3, this.LLILZIL, null);
            if (typefaceCreate == null) {
                typefaceCreate = Typeface.create(((TextView) this.mView).getTypeface(), this.LLILZIL);
            }
        }
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i >= 29 && typefaceCreate != null) {
            int weight = typefaceCreate.getWeight();
            int i2 = this.LLILLJJLI;
            if (weight != i2) {
                if (this.LLILZIL == 2) {
                    z = true;
                } else {
                    z = false;
                }
                typefaceCreate = Typeface.create(typefaceCreate, i2, z);
            }
        }
        ((TextView) this.mView).setTypeface(typefaceCreate);
        ((TextView) this.mView).setTextSize(0, this.mFontSize);
        if (this.LLJ == null) {
            ((TextView) this.mView).setHint("");
        } else {
            int i3 = this.LLILLL;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.LLILLJJLI;
            }
            int i4 = this.LLILZLL;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.LLILZIL;
            }
            String str4 = this.LLIZLLLIL;
            if (str4 == null) {
                str4 = this.LLIZ;
            }
            float f = this.LLJI;
            if (f == Float.MIN_VALUE) {
                f = this.mFontSize;
            }
            if (str4 == null || (typefaceLJ = C1300980jxY.LJ(i4, this.mContext, str4)) == null) {
                C1301090jxj c1301090jxj2 = C1301060jxg.LIZ;
                s sVar2 = this.mContext;
                if (str4 != null) {
                    str2 = str4;
                }
                typefaceLJ = c1301090jxj2.LJ(sVar2, str2, i4, null);
                if (typefaceLJ == null) {
                    typefaceLJ = Typeface.create(((TextView) this.mView).getTypeface(), i4);
                }
            }
            if (i >= 29 && typefaceLJ != null && typefaceLJ.getWeight() != i3) {
                if (i4 != 2) {
                    z2 = false;
                }
                typefaceLJ = Typeface.create(typefaceLJ, i3, z2);
            }
            SpannableString spannableString = new SpannableString(this.LLJ);
            int length = spannableString.length();
            C786410Ut5.p2(spannableString, new AbsoluteSizeSpan((int) f, false), 0, length, 33);
            if (typefaceLJ != null) {
                C786410Ut5.p2(spannableString, new C1316960kNK(typefaceLJ), 0, length, 33);
            }
            ((TextView) this.mView).setHint(spannableString);
            ((TextView) this.mView).setHintTextColor(this.LLJIJIL);
        }
        if (i >= 28 && !Float.valueOf(this.LLILZ).equals(Float.valueOf(-1.0f))) {
            int fontMetricsInt = ((TextView) this.mView).getPaint().getFontMetricsInt(null);
            ((EditText) this.mView).setLineHeight(Math.max(fontMetricsInt, ((int) this.LLILZ) + fontMetricsInt));
        }
    }

    @InterfaceC1312540kGC(name = "avoid-keyboard")
    public final void setAvoidKeyboard(boolean z) {
        this.LLJILJILJ = z;
    }

    @InterfaceC1312540kGC(name = "avoid-keyboard-spacing")
    public final void setAvoidKeyboardSpacing(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            this.LLJJ = C1312920kGo.LIZIZ(interfaceC1298070jsr.asString(), 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
        } else {
            this.LLJJ = 0.0f;
        }
    }

    @InterfaceC1312540kGC(name = "confirm-enter")
    public final void setConfirmEnter(boolean z) {
        this.LLJJIJI = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1312540kGC(name = "confirm-type")
    public final void setConfirmType(String str) {
        if (LJJIZ()) {
            ((TextView) this.mView).setSingleLine(false);
            ((TextView) this.mView).setInputType(1);
            ((TextView) this.mView).setHorizontallyScrolling(false);
            T t = this.mView;
            ((TextView) t).setMaxLines(((TextView) t).getMaxLines());
        }
        if (str == null) {
            str = "done";
        }
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    ((TextView) this.mView).setImeOptions(3);
                }
                break;
            case 3304:
                if (str.equals("go")) {
                    ((TextView) this.mView).setImeOptions(2);
                }
                break;
            case 3089282:
                if (str.equals("done")) {
                    ((TextView) this.mView).setImeOptions(6);
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    ((TextView) this.mView).setImeOptions(5);
                }
                break;
            case 3526536:
                if (str.equals("send")) {
                    ((TextView) this.mView).setImeOptions(4);
                }
                break;
        }
    }

    @InterfaceC1312540kGC(name = "caret-color")
    public final void setCursorColor(String str) {
        Drawable textCursorDrawable;
        if (str != null && Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = ((EditText) this.mView).getTextCursorDrawable()) != null) {
            textCursorDrawable.setTint(ColorUtils.LIZIZ(str));
            ((EditText) this.mView).setTextCursorDrawable(textCursorDrawable);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "disabled")
    public final void setDisable(boolean z) {
        ((TextView) this.mView).setEnabled(!z);
        this.mView.setFocusable(!z);
        this.mView.setFocusableInTouchMode(!z);
        this.userInteractionEnabled = !z;
    }

    @InterfaceC1312540kGC(defaultInt = -16777216, name = "color")
    public final void setFontColor(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297830jsT.LIZ[type.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 4) {
                    ((TextView) this.mView).setTextColor(ColorUtils.LIZIZ(interfaceC1298070jsr.asString()));
                    return;
                }
                return;
            }
            ((TextView) this.mView).setTextColor(interfaceC1298070jsr.asInt());
        }
    }

    @InterfaceC1312540kGC(name = "font-family")
    public void setFontFamily(String str) {
        if (str != null) {
            this.LLIZ = str;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "font-style")
    public void setFontStyle(int i) {
        int i2 = 0;
        if (i != 0 && (i == 1 || i == 2)) {
            i2 = 2;
        }
        this.LLILZIL = i2;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "font-weight")
    public final void setFontWeight(Integer num) {
        int i;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i = (iIntValue - 1) * 100;
                } else {
                    i = OppoPermissionPopupMaskDelayExp.DEFAULT;
                }
            } else {
                i = 400;
            }
            this.LLILLJJLI = i;
        }
    }

    @InterfaceC1312540kGC(name = "hold-keyboard")
    public final void setHoldKeyboard(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @InterfaceC1312540kGC(name = "input-filter")
    public final void setInputFilter(String str) {
        this.LLJILJIL = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1312540kGC(name = "type")
    public final void setInputType(String str) {
        String str2;
        int imeOptions = ((TextView) this.mView).getImeOptions();
        if (str == null) {
            str2 = "text";
        } else {
            str2 = str;
        }
        switch (str2.hashCode()) {
            case -1034364087:
                if (str2.equals("number")) {
                    ((TextView) this.mView).setInputType(2);
                }
                break;
            case 114715:
                if (str2.equals("tel")) {
                    ((TextView) this.mView).setInputType(3);
                }
                break;
            case 3556653:
                if (str2.equals("text")) {
                    ((TextView) this.mView).setInputType(1);
                }
                break;
            case 95582509:
                if (str2.equals("digit")) {
                    ((TextView) this.mView).setInputType(8194);
                }
                break;
            case 96619420:
                if (str2.equals("email")) {
                    ((TextView) this.mView).setInputType(32);
                }
                break;
            case 1216985755:
                if (str2.equals("password")) {
                    ((TextView) this.mView).setInputType(128);
                }
                break;
        }
        int selectionStart = ((TextView) this.mView).getSelectionStart();
        if (!Intrinsics.LJFF(str, "password")) {
            ((TextView) this.mView).setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            ((TextView) this.mView).setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        ((EditText) this.mView).setSelection(selectionStart);
        T t = this.mView;
        ((TextView) t).setInputType(((TextView) t).getInputType() | 524288);
        if (LJJIZ()) {
            ((TextView) this.mView).setSingleLine(false);
            ((TextView) this.mView).setImeOptions(imeOptions);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "readonly")
    public final void setIsReadOnly(boolean z) {
        this.LL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-fullscreen-mode")
    public final void setKeyBoardFullscreenMode(boolean z) {
        if (!z) {
            T t = this.mView;
            ((TextView) t).setImeOptions(((TextView) t).getImeOptions() | 33554432 | 268435456);
        } else {
            T t2 = this.mView;
            ((TextView) t2).setImeOptions(((TextView) t2).getImeOptions() & (-33554433) & (-268435457));
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "letter-spacing")
    public final void setLetterSpacing(float f) {
        if (((TextView) this.mView).getTextSize() != 0.0f) {
            T t = this.mView;
            ((TextView) t).setLetterSpacing(f / ((TextView) t).getTextSize());
        }
    }

    @InterfaceC1312540kGC(name = "line-spacing")
    public void setLineSpacing(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            this.LLILZ = C1312920kGo.LIZIZ(interfaceC1298070jsr.asString(), 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
        } else {
            if (interfaceC1298070jsr.getType() != ReadableType.Number && interfaceC1298070jsr.getType() != ReadableType.Int) {
                return;
            }
            this.LLILZ = C1311130kDv.LIZ(interfaceC1298070jsr.asDouble());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    this.mView.setTextDirection(3);
                    return;
                }
                return;
            }
            this.mView.setTextDirection(4);
            return;
        }
        this.mView.setTextDirection(5);
    }

    @InterfaceC1312540kGC(name = "maxlength")
    public final void setMaxLength(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type;
        if (interfaceC1298070jsr != null && (type = interfaceC1298070jsr.getType()) != null) {
            int i = C1297830jsT.LIZ[type.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    this.LLJJJ = new InputFilter.LengthFilter(CastIntegerProtector.parseInt(interfaceC1298070jsr.asString()));
                    return;
                }
                return;
            }
            this.LLJJJ = new InputFilter.LengthFilter(interfaceC1298070jsr.asInt());
        }
    }

    @InterfaceC1312540kGC(name = "placeholder")
    public final void setPlaceholder(String str) {
        this.LLJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @X.InterfaceC1312540kGC(name = "placeholder-color")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlaceholderColor(X.InterfaceC1298070jsr r3) {
        /*
            r2 = this;
            com.lynx.react.bridge.ReadableType r0 = r3.getType()
            if (r0 == 0) goto L27
            int[] r1 = X.C1297830jsT.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L22
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 != r0) goto L27
            java.lang.String r0 = r3.asString()
            int r0 = com.lynx.tasm.utils.ColorUtils.LIZIZ(r0)
        L1f:
            r2.LLJIJIL = r0
            return
        L22:
            int r0 = r3.asInt()
            goto L1f
        L27:
            java.lang.String r0 = "#3c433c"
            int r0 = com.lynx.tasm.utils.ColorUtils.LIZIZ(r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.xelement.input.LynxUIBaseInput.setPlaceholderColor(X.0jsr):void");
    }

    @InterfaceC1312540kGC(name = "placeholder-font-family")
    public final void setPlaceholderFontFamily(String str) {
        this.LLIZLLLIL = str;
    }

    @InterfaceC1312540kGC(name = "placeholder-font-style")
    public final void setPlaceholderFontStyle(int i) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1 && i != 2) {
                i2 = Integer.MIN_VALUE;
            }
        } else {
            i2 = 0;
        }
        this.LLILZLL = i2;
    }

    @InterfaceC1312540kGC(defaultFloat = Float.MIN_VALUE, name = "placeholder-font-size")
    public final void setPlaceholderTextSize(float f) {
        this.LLJI = f;
    }

    @InterfaceC1312540kGC(name = "placeholder-font-weight")
    public final void setPlaceholderTextWeight(InterfaceC1298070jsr interfaceC1298070jsr) {
        int i = Integer.MIN_VALUE;
        if (interfaceC1298070jsr == null) {
            this.LLILLL = Integer.MIN_VALUE;
            return;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i2 = C1297830jsT.LIZ[type.ordinal()];
            int iAsInt = OppoPermissionPopupMaskDelayExp.DEFAULT;
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (interfaceC1298070jsr.asString().equals("bold")) {
                        i = OppoPermissionPopupMaskDelayExp.DEFAULT;
                    } else if (interfaceC1298070jsr.asString().equals("normal")) {
                        i = 400;
                    }
                    this.LLILLL = i;
                    return;
                }
            } else {
                int iAsInt2 = interfaceC1298070jsr.asInt();
                if (iAsInt2 != 0) {
                    if (iAsInt2 != 1) {
                        iAsInt = (interfaceC1298070jsr.asInt() - 1) * 100;
                    }
                } else {
                    iAsInt = 400;
                }
                this.LLILLL = iAsInt;
                return;
            }
        }
        this.LLILLL = Integer.MIN_VALUE;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "show-soft-input-on-focus")
    public final void setShowSoftInputOnFocus(boolean z) {
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        if (activityLIZ != null) {
            if (!z) {
                this.LLJJJJJIL = true;
                this.LLJJJJ = activityLIZ.getWindow().getAttributes().softInputMode & 15;
                activityLIZ.getWindow().setSoftInputMode((activityLIZ.getWindow().getAttributes().softInputMode ^ 15) | 3);
                ((TextView) this.mView).setShowSoftInputOnFocus(false);
                return;
            }
            this.LLJJJJJIL = false;
            activityLIZ.getWindow().setSoftInputMode((activityLIZ.getWindow().getAttributes().softInputMode ^ 15) | this.LLJJJJ);
            ((TextView) this.mView).setShowSoftInputOnFocus(true);
        }
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
        ((C21396918oR) this.mView).LLJI = i;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "text-align")
    public final void setTextAlign(int i) {
        int iLJJIJIIJI = LJJIJIIJI();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ((TextView) this.mView).setGravity(iLJJIJIIJI | 5);
                    return;
                }
                return;
            }
            ((TextView) this.mView).setGravity(iLJJIJIIJI | 1);
            return;
        }
        ((TextView) this.mView).setGravity(iLJJIJIIJI | 3);
    }

    @InterfaceC1312540kGC(name = "-x-placeholder-color")
    public final void setXPlaceholderColor(InterfaceC1298070jsr interfaceC1298070jsr) {
        setPlaceholderColor(interfaceC1298070jsr);
    }

    @InterfaceC1312540kGC(name = "-x-placeholder-font-family")
    public final void setXPlaceholderFontFamily(String str) {
        setPlaceholderFontFamily(str);
    }

    @InterfaceC1312540kGC(name = "-x-placeholder-font-style")
    public final void setXPlaceholderFontStyle(int i) {
        setPlaceholderFontStyle(i);
    }

    @InterfaceC1312540kGC(defaultFloat = Float.MIN_VALUE, name = "-x-placeholder-font-size")
    public final void setXPlaceholderTextSize(float f) {
        setPlaceholderTextSize(f);
    }

    @InterfaceC1312540kGC(name = "-x-placeholder-font-weight")
    public final void setXPlaceholderTextWeight(InterfaceC1298070jsr interfaceC1298070jsr) {
        setPlaceholderTextWeight(interfaceC1298070jsr);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18iQ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.18iP] */
    public LynxUIBaseInput(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLJJLI = 400;
        this.LLILLL = Integer.MIN_VALUE;
        this.LLILZ = -1.0f;
        this.LLILZLL = Integer.MIN_VALUE;
        this.LLJI = Float.MIN_VALUE;
        this.LLJIJIL = ColorUtils.LIZIZ("#3c433c4c");
        this.LLJJIJIL = new InputFilter() { // from class: X.18iQ
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (!this.LL.LL || spanned == null) {
                    return null;
                }
                return spanned.subSequence(i3, i4);
            }
        };
        this.LLJJJ = new InputFilter.LengthFilter(Integer.MAX_VALUE);
        this.LLJJJIL = new InputFilter() { // from class: X.18iP
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                String str = this.LL.LLJILJIL;
                if (str != null) {
                    StringBuilder sb = new StringBuilder("");
                    for (int i5 = 0; i5 < charSequence.length(); i5++) {
                        char cCharAt = charSequence.charAt(i5);
                        if (new Regex(str).matches(String.valueOf(cCharAt))) {
                            sb.append(cCharAt);
                        }
                    }
                    return sb.toString();
                }
                return charSequence;
            }
        };
    }

    @InterfaceC1967107nB
    public final void blur(ReadableMap readableMap, Callback callback) {
        if (((C21396918oR) this.mView).getMHasDrawn()) {
            LJJIJIIJIL(callback);
        } else {
            HandlerHook.viewPost(this.mView, new ARunnableS101S0200000_32(this, callback, 35));
        }
    }

    @InterfaceC1967107nB
    public final void focus(ReadableMap readableMap, Callback callback) {
        if (((C21396918oR) this.mView).getMHasDrawn()) {
            LJJIJIL(callback);
        } else {
            HandlerHook.viewPost(this.mView, new ARunnableS101S0200000_32(this, callback, 36));
        }
    }

    @InterfaceC1967107nB
    public final void getValue(ReadableMap readableMap, Callback callback) throws Throwable {
        boolean z;
        String strValueOf;
        int selectionStart;
        Editable editableLLLLZLL = C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null));
        int selectionEnd = -1;
        if (editableLLLLZLL != null) {
            C21396918oR c21396918oR = (C21396918oR) this.mView;
            if (!c21396918oR.LLJ) {
                LynxLog.w("LynxEditText", "InputConnection has not been initialized yet ");
            } else if (c21396918oR.LLIZLLLIL != null) {
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(editableLLLLZLL);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editableLLLLZLL);
                if (composingSpanStart != -1 && composingSpanEnd != -1) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)) != null) {
            strValueOf = String.valueOf(C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)));
        } else {
            strValueOf = "";
        }
        if (this.mView.isFocused()) {
            selectionStart = ((TextView) this.mView).getSelectionStart();
        } else {
            selectionStart = -1;
        }
        if (this.mView.isFocused()) {
            selectionEnd = ((TextView) this.mView).getSelectionEnd();
        }
        javaOnlyMap.put("value", strValueOf);
        javaOnlyMap.put("selectionStart", Integer.valueOf(selectionStart));
        javaOnlyMap.put("selectionEnd", Integer.valueOf(selectionEnd));
        javaOnlyMap.put("isComposing", Boolean.valueOf(z));
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void onFocusChanged(boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                this.mView.requestFocus();
                if (!this.LLJJJJJIL) {
                    LJJJI();
                    return;
                }
                return;
            }
            if (this.LLJJIJIIJIL) {
                return;
            }
            this.LLJJI = true;
            this.mView.clearFocus();
            LJJIJLIJ();
        }
    }

    @InterfaceC1967107nB
    public final void setSelectionRange(ReadableMap readableMap, Callback callback) {
        int i;
        int i2;
        int length;
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
        if (C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)) != null && (length = C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)).length()) != -1 && i <= length && i2 <= length && i >= 0 && i2 >= 0) {
            ((EditText) this.mView).setSelection(i, i2);
            if (callback != null) {
                callback.invoke(0, "Success.");
                return;
            }
            return;
        }
        if (callback != null) {
            callback.invoke(4, "Range does not meet expectations.");
        }
    }

    @InterfaceC1967107nB
    public final void setValue(ReadableMap readableMap, Callback callback) {
        String string;
        int i;
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
        if (readableMap.hasKey("cursor")) {
            i = readableMap.getInt("cursor");
        } else {
            i = -1;
        }
        if (C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)) == null) {
            ((TextView) this.mView).setText(string);
        } else {
            C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)).replace(0, C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ", null)).length(), string);
        }
        if (i != -1) {
            ((EditText) this.mView).setSelection(i);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
