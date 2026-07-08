package com.lynx.xelement.input;

import X.C0WZX;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1311730kEt;
import X.C19LS;
import X.C21355518hl;
import X.C21355618hm;
import X.C21360018iU;
import X.C2204961BRm;
import X.C430850Gux;
import X.InterfaceC1309740kBg;
import X.InterfaceC1312540kGC;
import Y.ARunnableS26S0201000_20;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.core.LynxLayoutProxy;
import com.lynx.xelement.input.LynxUIBaseInputShadowNode;
import com.lynx.xelement.input.LynxUITextArea;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import j27.s;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUITextArea extends LynxUIBaseInput {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C21355518hl LLJL;
    public final C21355618hm LLJLIL;

    @Override // com.lynx.xelement.input.LynxUIBaseInput
    public final boolean LJJIZ() {
        return true;
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput
    public final void LJJIIZI() {
        Layout layoutLIZ = C430850Gux.LIZ(String.valueOf(C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bZYA+tAzf8cI=", null))), (EditText) this.mView, getWidth());
        if (layoutLIZ.getHeight() != this.LLJJL) {
            LJJJJ(layoutLIZ.getHeight());
            this.LLJJL = layoutLIZ.getHeight();
            if (!this.LLJJLIIIJLLLLLLLZ) {
                C1298720jtu c1298720jtu = this.mContext.LLIZ;
                C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "line");
                c1289960jfm.LIZIZ(Integer.valueOf(layoutLIZ.getLineCount()), "line");
                c1298720jtu.LIZIZ(c1289960jfm);
            }
        }
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    public final boolean LJJJIL() {
        int imeOptions = ((TextView) this.mView).getImeOptions() & 255;
        if (imeOptions == 2 || imeOptions == 3 || imeOptions == 4 || imeOptions == 5 || imeOptions == 6) {
            return !this.LLJJIJI;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        LJJJJ(C430850Gux.LIZ(String.valueOf(C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bZYA+tAzf8cI=", null))), (EditText) this.mView, getWidth()).getHeight());
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput
    /* JADX INFO: renamed from: LJJIJ */
    public final C21360018iU createView(Context context) {
        C21360018iU c21360018iUCreateView = super.createView(context);
        c21360018iUCreateView.setHorizontallyScrolling(false);
        c21360018iUCreateView.setSingleLine(false);
        c21360018iUCreateView.setGravity(48);
        c21360018iUCreateView.setPadding(0, 0, 0, 0);
        c21360018iUCreateView.setOnEditorActionListener(new C19LS(this, 1));
        return c21360018iUCreateView;
    }

    public final void LJJJJ(final int i) {
        final Layout layoutLIZ = C430850Gux.LIZ(((TextView) this.mView).getHint(), (EditText) this.mView, getWidth());
        s sVar = this.mContext;
        int sign = getSign();
        InterfaceC1309740kBg interfaceC1309740kBg = new InterfaceC1309740kBg() { // from class: X.0kGb
            @Override // X.InterfaceC1309740kBg
            public final void LIZ(ShadowNode shadowNode) {
                Layout layout = layoutLIZ;
                int i2 = i;
                if (shadowNode instanceof LynxUIBaseInputShadowNode) {
                    LynxUIBaseInputShadowNode lynxUIBaseInputShadowNode = (LynxUIBaseInputShadowNode) shadowNode;
                    int height = layout.getHeight();
                    if (height >= i2) {
                        i2 = height;
                    }
                    if (i2 != lynxUIBaseInputShadowNode.LJJJLIIL) {
                        lynxUIBaseInputShadowNode.LJJJLIIL = i2;
                        lynxUIBaseInputShadowNode.LJ = false;
                        lynxUIBaseInputShadowNode.LJIILLIIL();
                        lynxUIBaseInputShadowNode.LIZ.LJIIIZ(lynxUIBaseInputShadowNode.LIZIZ);
                    }
                }
            }
        };
        sVar.getClass();
        ARunnableS26S0201000_20 aRunnableS26S0201000_20 = new ARunnableS26S0201000_20(sVar, sign, interfaceC1309740kBg, 9);
        LynxLayoutProxy lynxLayoutProxy = sVar.LLJILJIL.get();
        if (lynxLayoutProxy != null) {
            lynxLayoutProxy.LIZIZ(aRunnableS26S0201000_20);
        }
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        C21355518hl c21355518hl = this.LLJL;
        if (c21355518hl != null) {
            ((TextView) this.mView).setFilters(new InputFilter[]{this.LLJLIL, this.LLJJJIL, this.LLJJJ, c21355518hl, this.LLJJIJIL});
            if (Unit.LIZ != null) {
                return;
            }
        }
        ((TextView) this.mView).setFilters(new InputFilter[]{this.LLJLIL, this.LLJJJIL, this.LLJJJ, this.LLJJIJIL});
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-scroll-bar")
    public final void setEnableScrollBar(boolean z) {
        this.mView.setVerticalScrollBarEnabled(z);
        this.mView.setHorizontalScrollBarEnabled(false);
        this.mView.setScrollbarFadingEnabled(true);
        this.mView.setScrollBarDefaultDelayBeforeFade(LSPassThroughRecordSizeConfig.DEFAULT);
        if (Build.VERSION.SDK_INT >= 29) {
            ((EditText) this.mView).setVerticalScrollbarThumbDrawable(new ColorDrawable(-3355444));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1312540kGC(defaultInt = Integer.MAX_VALUE, name = "maxlines")
    public final void setMaxLines(final int i) {
        C21355518hl c21355518hl;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        ((TextView) this.mView).setMaxLines(i);
        if (i == Integer.MAX_VALUE) {
            c21355518hl = 0;
        } else {
            c21355518hl = new InputFilter() { // from class: X.18hl
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                    boolean z;
                    LynxUITextArea lynxUITextArea = this.LL;
                    int i6 = i;
                    lynxUITextArea.LLJJLIIIJLLLLLLLZ = false;
                    if (i6 != Integer.MAX_VALUE && i6 > 0 && i2 < i3) {
                        CharSequence charSequenceSubSequence = charSequence.subSequence(i2, i3);
                        int length = charSequenceSubSequence.length();
                        int i7 = 0;
                        while (true) {
                            z = true;
                            if (i7 >= length) {
                                break;
                            }
                            int i8 = ((i7 + length) + 1) / 2;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
                            spannableStringBuilder.replace(i4, i5, charSequenceSubSequence.subSequence(0, i8));
                            if (C430850Gux.LIZ(spannableStringBuilder, (EditText) lynxUITextArea.mView, lynxUITextArea.getWidth()).getLineCount() <= i6) {
                                i7 = i8;
                            } else {
                                length = i8 - 1;
                            }
                        }
                        if (i7 >= charSequenceSubSequence.length()) {
                            z = false;
                        }
                        lynxUITextArea.LLJJLIIIJLLLLLLLZ = z;
                        if (z) {
                            C1298720jtu c1298720jtu = lynxUITextArea.mContext.LLIZ;
                            C1289960jfm c1289960jfm = new C1289960jfm(lynxUITextArea.getSign(), "line");
                            c1289960jfm.LIZIZ(-1, "line");
                            c1298720jtu.LIZIZ(c1289960jfm);
                            return charSequenceSubSequence.subSequence(0, i7);
                        }
                        return null;
                    }
                    return null;
                }
            };
        }
        this.LLJL = c21355518hl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18hm] */
    public LynxUITextArea(s sVar, Object obj) {
        super(sVar, obj);
        this.LLJJL = -1;
        this.LLJLIL = new InputFilter() { // from class: X.18hm
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (this.LL.LJJJIL() && Intrinsics.LJFF(charSequence.toString(), "\n")) {
                    return "";
                }
                return null;
            }
        };
    }
}
