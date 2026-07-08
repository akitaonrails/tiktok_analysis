package com.bytedance.ies.xelement.input;

import X.C21397018oS;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxInputView;
import j27.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class LynxInputView extends LynxBaseInputView {
    public static final /* synthetic */ int LLLFZ = 0;
    public C21397018oS LLLFFI;

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final int LJJIJIL() {
        return 16;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIIZI() {
        if (this.LLLF) {
            C21397018oS c21397018oS = this.LLLFFI;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            if (c21397018oS.getInputType() == 12290) {
                C21397018oS c21397018oS2 = this.LLLFFI;
                (c21397018oS2 != null ? c21397018oS2 : null).setInputType(2);
                return;
            }
            return;
        }
        C21397018oS c21397018oS3 = this.LLLFFI;
        if (c21397018oS3 == null) {
            c21397018oS3 = null;
        }
        if (c21397018oS3.getInputType() == 2) {
            C21397018oS c21397018oS4 = this.LLLFFI;
            (c21397018oS4 != null ? c21397018oS4 : null).setInputType(12290);
        }
    }

    public LynxInputView(s sVar) {
        super(sVar, null);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* JADX INFO: renamed from: LJJIJ */
    public final C21397018oS createView(Context context) {
        C21397018oS c21397018oSCreateView = super.createView(context);
        this.LLLFFI = c21397018oSCreateView;
        if (c21397018oSCreateView == null) {
            c21397018oSCreateView = null;
        }
        c21397018oSCreateView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0kYv
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws Throwable {
                LynxInputView lynxInputView = this.LL;
                if (i == 0 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                    if (lynxInputView.LLJJJIL) {
                        C1298720jtu c1298720jtu = lynxInputView.mContext.LLIZ;
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxInputView.getSign(), "confirm");
                        C21397018oS c21397018oS = lynxInputView.LLLFFI;
                        String string = null;
                        if (c21397018oS == null) {
                            c21397018oS = null;
                        }
                        Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98g8TG26P4Agf+g==", null));
                        if (editableLLLLII != null) {
                            string = editableLLLLII.toString();
                        }
                        c1289960jfm.LIZIZ(string, "value");
                        c1298720jtu.LIZIZ(c1289960jfm);
                    }
                    if (i != 5) {
                        lynxInputView.setFocus(false);
                        return true;
                    }
                }
                return false;
            }
        });
        c21397018oSCreateView.setOnTouchListener(null);
        c21397018oSCreateView.setImeOptions(6);
        C21397018oS c21397018oS = this.LLLFFI;
        if (c21397018oS == null) {
            return null;
        }
        return c21397018oS;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJI(C21397018oS c21397018oS) {
        c21397018oS.setLines(1);
        c21397018oS.setSingleLine(true);
        c21397018oS.setHorizontallyScrolling(true);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "password")
    public final void setIsPassword(boolean z) {
        C21397018oS c21397018oS = null;
        if (z) {
            C21397018oS c21397018oS2 = this.LLLFFI;
            if (c21397018oS2 == null) {
                c21397018oS2 = null;
            }
            int selectionStart = c21397018oS2.getSelectionStart();
            C21397018oS c21397018oS3 = this.LLLFFI;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            c21397018oS3.setInputType(128);
            C21397018oS c21397018oS4 = this.LLLFFI;
            if (c21397018oS4 == null) {
                c21397018oS4 = null;
            }
            c21397018oS4.setTransformationMethod(PasswordTransformationMethod.getInstance());
            C21397018oS c21397018oS5 = this.LLLFFI;
            if (c21397018oS5 != null) {
                c21397018oS = c21397018oS5;
            }
            c21397018oS.setSelection(selectionStart);
            return;
        }
        C21397018oS c21397018oS6 = this.LLLFFI;
        if (c21397018oS6 == null) {
            c21397018oS6 = null;
        }
        int selectionStart2 = c21397018oS6.getSelectionStart();
        C21397018oS c21397018oS7 = this.LLLFFI;
        if (c21397018oS7 == null) {
            c21397018oS7 = null;
        }
        c21397018oS7.setInputType(this.LLJLLIL);
        C21397018oS c21397018oS8 = this.LLLFFI;
        if (c21397018oS8 == null) {
            c21397018oS8 = null;
        }
        c21397018oS8.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        C21397018oS c21397018oS9 = this.LLLFFI;
        if (c21397018oS9 != null) {
            c21397018oS = c21397018oS9;
        }
        c21397018oS.setSelection(selectionStart2);
    }

    public LynxInputView(s sVar, Object obj) {
        super(sVar, obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJIL(C21397018oS c21397018oS, String str) {
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    if (this.LLLF) {
                        c21397018oS.setInputType(2);
                    } else {
                        c21397018oS.setInputType(12290);
                    }
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    c21397018oS.setInputType(3);
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c21397018oS.setInputType(1);
                }
                break;
            case 95582509:
                if (str.equals("digit")) {
                    c21397018oS.setInputType(8194);
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    c21397018oS.setInputType(32);
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c21397018oS.setInputType(128);
                }
                break;
        }
        int selectionStart = c21397018oS.getSelectionStart();
        if (!Intrinsics.LJFF(str, "password")) {
            c21397018oS.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            c21397018oS.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        c21397018oS.setSelection(selectionStart);
    }
}
