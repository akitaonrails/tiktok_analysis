package com.bytedance.ies.xelement.input;

import X.C0GVZ;
import X.C0WZX;
import X.C1285920jZG;
import X.C1299120juY;
import X.C1312920kGo;
import X.C1316790kN3;
import X.C1316940kNI;
import X.C1339210kxD;
import X.C21397018oS;
import X.C21397118oT;
import X.C21398218oe;
import X.C21399218oo;
import X.C21399318op;
import X.C21399518or;
import X.C21524019Li;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C439910HMv;
import X.C786410Ut5;
import X.InterfaceC1289280jeg;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC21397218oU;
import X.InterfaceC21397318oV;
import X.InterfaceC21400018ow;
import X.InterfaceC439930HMx;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import j27.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes33.dex */
public class LynxTextAreaView extends LynxBaseInputView {
    public static final /* synthetic */ int LLLILZLLLI = 0;
    public C21397018oS LLLFFI;
    public boolean LLLFZ;
    public int LLLI;
    public ClipboardManager LLLII;
    public boolean LLLIIII;
    public final List<InterfaceC21400018ow> LLLIIIIL;
    public final int LLLIIIL;
    public final int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public Function1<? super Context, ? extends InterfaceC439930HMx> LLLILZJ;

    public LynxTextAreaView() {
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJIL(C21397018oS c21397018oS, String str) {
    }

    @InterfaceC1967107nB
    public final void resetSelectionMenu() {
    }

    public final AutoHeightInputShadowNode LJJJJIZL() {
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF == null || !(shadowNodeLJFF instanceof AutoHeightInputShadowNode)) {
            return null;
        }
        return (AutoHeightInputShadowNode) shadowNodeLJFF;
    }

    public final void LJJJJL() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL;
        C21397018oS c21397018oS = this.LLLFFI;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        if (C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)) == null || (autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL()) == null) {
            return;
        }
        autoHeightInputShadowNodeLJJJJIZL.LJJJJLI();
        this.LLLIILIL = autoHeightInputShadowNodeLJJJJIZL.LJJJJL();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJ() {
        super.LJJJJ();
        LJJJJL();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJI() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL;
        super.LJJJJI();
        if (this.LLILLL != null) {
            C21397018oS c21397018oS = this.LLLFFI;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            if (c21397018oS.getHint() == null || (autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL()) == null) {
                return;
            }
            autoHeightInputShadowNodeLJJJJIZL.LJJJJJL();
            this.LLLIILIL = autoHeightInputShadowNodeLJJJJIZL.LJJJJL();
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        C21397018oS c21397018oS;
        super.layout();
        if (LJJIZ() && this.LLLIILIL && this.LLJZ.LIZLLL()) {
            this.LLJZ.LJ();
            this.LLLIILIL = false;
        }
        if (LJJIZ() && this.LLLIL) {
            this.LLLIL = false;
            this.LLJJJJJIL = true;
            C21397018oS c21397018oS2 = this.LLLFFI;
            if (c21397018oS2 == null) {
                c21397018oS = null;
                c21397018oS2 = null;
            } else {
                c21397018oS = c21397018oS2;
            }
            c21397018oS.setText(C2204961BRm.LLLLII(c21397018oS2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)));
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL;
        super.onPropsUpdated();
        if (this.LLLILZ) {
            LJJJJL();
            C21397018oS c21397018oS = this.LLLFFI;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            if (c21397018oS.getHint() != null && (autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL()) != null) {
                autoHeightInputShadowNodeLJJJJIZL.LJJJJJL();
                this.LLLIILIL = autoHeightInputShadowNodeLJJJJIZL.LJJJJL();
            }
            this.LLLILZ = false;
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* JADX INFO: renamed from: LJJIJ */
    public C21397018oS createView(Context context) {
        C21397018oS c21397018oSLJJIJ = super.createView(context);
        this.LLLFFI = c21397018oSLJJIJ;
        if (c21397018oSLJJIJ == null) {
            c21397018oSLJJIJ = null;
        }
        c21397018oSLJJIJ.addTextChangedListener(new C21524019Li(this, 1));
        c21397018oSLJJIJ.setOnEditorActionListener(new C1339210kxD(this, c21397018oSLJJIJ, 2));
        C21397018oS c21397018oS = this.LLLFFI;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        LJJIJIIJI(c21397018oS);
        C21397018oS c21397018oS2 = this.LLLFFI;
        if (c21397018oS2 == null) {
            return null;
        }
        return c21397018oS2;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJI(C21397018oS c21397018oS) {
        c21397018oS.setHorizontallyScrolling(false);
        c21397018oS.setSingleLine(false);
        c21397018oS.setGravity(48);
    }

    public final <T> JavaOnlyArray LJJJJJ(Class<T> cls) throws Throwable {
        C21397018oS c21397018oS = this.LLLFFI;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
        Object[] spans = editableLLLLII.getSpans(0, editableLLLLII.length(), cls);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : spans) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("start", Integer.valueOf(editableLLLLII.getSpanStart(obj)));
            javaOnlyMap.put("end", Integer.valueOf(editableLLLLII.getSpanEnd(obj)));
            javaOnlyArray.add(javaOnlyMap);
        }
        return javaOnlyArray;
    }

    public final void LJJJJJL(ClipData clipData) throws Throwable {
        InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
        if (interfaceC1289280jeg != null) {
            try {
                interfaceC1289280jeg.LIZ(clipData);
                return;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("A RemoteException was encountered while calling systemInvokeService. ");
                sbLIZ.append(e.getMessage());
                LynxLog.e("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        try {
            ClipboardManager clipboardManager = this.LLLII;
            if (clipboardManager != null) {
                try {
                    C2204961BRm.LJJIJIIJI(clipboardManager, clipData, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    CrashlyticsWrapperService.LIZLLL().log("ClipboardLancet", e2.getLocalizedMessage());
                }
            }
        } catch (RemoteException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("When we tried to copy copyData, we encountered a RemoteException. ");
            sbLIZ2.append(e3.getMessage());
            LynxLog.e("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1967107nB
    public final void getTextInfo(Callback callback) {
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C21397018oS c21397018oS = this.LLLFFI;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        javaOnlyMap.put("text", String.valueOf(C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null))));
        int i = this.LLLI;
        int i2 = this.LLLIIIL;
        if ((i & i2) == i2) {
            javaOnlyMap.put("mention", LJJJJJ(C21399218oo.class));
        }
        if (C1316940kNI.LIZ()) {
            int i3 = this.LLLI;
            int i4 = this.LLLIIL;
            if ((i3 & i4) == i4) {
                javaOnlyMap.put("emoji", LJJJJJ(C0GVZ.class));
            }
        }
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLJJIJI = map.containsKey("line");
            this.LLLIIII = map.containsKey("mention");
        }
    }

    @InterfaceC1312540kGC(name = "max-height")
    public final void setMaxHeight(String str) {
        if (str == null) {
            ((TextView) this.mView).setMaxLines(Integer.MAX_VALUE);
        }
        ((TextView) this.mView).setMaxHeight((int) (((double) C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ)) + 0.5d));
        this.LLLILZ = true;
    }

    @InterfaceC1312540kGC(defaultInt = Integer.MAX_VALUE, name = "maxlines")
    public final void setMaxLines(int i) {
        this.LLJL = i;
    }

    @InterfaceC1312540kGC(name = "min-height")
    public final void setMinHeight(String str) {
        if (str == null) {
            ((TextView) this.mView).setMinLines(0);
            return;
        }
        ((TextView) this.mView).setMinHeight((int) (((double) C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ)) + 0.5d));
        this.LLLILZ = true;
    }

    @InterfaceC1312540kGC(name = "richtype")
    public final void setRichType(String str) {
        C21397018oS c21397018oS;
        if (str == null) {
            str = "none";
        }
        C21397018oS c21397018oS2 = null;
        if (a0.LJJIIZI(str, "none", false)) {
            this.LLLI = 0;
            ((ArrayList) this.LLLIIIIL).clear();
            C21397018oS c21397018oS3 = this.LLLFFI;
            if (c21397018oS3 == null) {
                c21397018oS = null;
            } else {
                c21397018oS = c21397018oS3;
            }
            C21397118oT c21397118oT = c21397018oS.LLIZLLLIL;
            if (c21397118oT != null) {
                c21397118oT.LIZ = null;
            }
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            c21397018oS3.LLJ = null;
            return;
        }
        if (a0.LJJIIZI(str, "mention", false)) {
            this.LLLI |= this.LLLIIIL;
            ((ArrayList) this.LLLIIIIL).add(new InterfaceC21400018ow() { // from class: X.18oq
                @Override // X.InterfaceC21400018ow
                public final boolean LIZ(Editable editable) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    Object[] spans = editable.getSpans(selectionStart, selectionEnd, C21399218oo.class);
                    int length = spans.length;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Object obj = spans[i];
                        if (editable.getSpanEnd(obj) == selectionStart) {
                            if (obj != null) {
                                if (selectionStart == selectionEnd) {
                                    z = true;
                                }
                                Selection.setSelection(editable, editable.getSpanStart(obj), editable.getSpanEnd(obj));
                            }
                        } else {
                            i++;
                        }
                    }
                    return z;
                }
            });
            this.LLJJJJJIL = true;
            C21398218oe c21398218oe = new C21398218oe(new C21399318op());
            C21397018oS c21397018oS4 = this.LLLFFI;
            if (c21397018oS4 == null) {
                c21397018oS4 = null;
            }
            c21397018oS4.setEditableFactory(c21398218oe);
        }
        if (C1316940kNI.LIZ() && a0.LJJIIZI(str, "bracket", false)) {
            this.LLLI |= this.LLLIIL;
            ((ArrayList) this.LLLIIIIL).add(C21399518or.LIZ);
            C439910HMv.LIZ().LIZ = this.LLLILZJ.invoke(this.mContext);
            this.LLLFZ = true;
        }
        if ((this.LLLI ^ 0) != 0) {
            C21397018oS c21397018oS5 = this.LLLFFI;
            if (c21397018oS5 == null) {
                c21397018oS5 = null;
            }
            c21397018oS5.setBackSpaceListener(new InterfaceC21397318oV() { // from class: X.18od
                @Override // X.InterfaceC21397318oV
                public final boolean LIZ() throws Throwable {
                    C21397018oS c21397018oS6 = this.LIZ.LLLFFI;
                    if (c21397018oS6 == null) {
                        c21397018oS6 = null;
                    }
                    Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS6, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
                    boolean z = false;
                    if (editableLLLLII == null || editableLLLLII.length() != 0) {
                        LynxTextAreaView lynxTextAreaView = this.LIZ;
                        loop0: while (true) {
                            z = false;
                            for (InterfaceC21400018ow interfaceC21400018ow : lynxTextAreaView.LLLIIIIL) {
                                if (!z) {
                                    C21397018oS c21397018oS7 = lynxTextAreaView.LLLFFI;
                                    if (c21397018oS7 == null) {
                                        c21397018oS7 = null;
                                    }
                                    if (interfaceC21400018ow.LIZ(C2204961BRm.LLLLII(c21397018oS7, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)))) {
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            });
            this.LLLII = (ClipboardManager) C786410Ut5.R2(this.mContext, "clipboard");
            InterfaceC21397218oU interfaceC21397218oU = new InterfaceC21397218oU() { // from class: X.18of
                @Override // X.InterfaceC21397218oU
                public final void LIZ() throws Throwable {
                    C21397018oS c21397018oS6 = this.LIZ.LLLFFI;
                    if (c21397018oS6 == null) {
                        c21397018oS6 = null;
                    }
                    int selectionStart = Selection.getSelectionStart(C2204961BRm.LLLLII(c21397018oS6, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)));
                    C21397018oS c21397018oS7 = this.LIZ.LLLFFI;
                    if (c21397018oS7 == null) {
                        c21397018oS7 = null;
                    }
                    int selectionEnd = Selection.getSelectionEnd(C2204961BRm.LLLLII(c21397018oS7, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)));
                    try {
                        Method declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                        if (selectionStart == -1 || selectionEnd == -1) {
                            this.LIZ.LJJJJJL(ClipData.newPlainText(null, ""));
                            declaredMethod.setAccessible(true);
                            C21397018oS c21397018oS8 = this.LIZ.LLLFFI;
                            declaredMethod.invoke(c21397018oS8 != null ? c21397018oS8 : null, new Object[0]);
                            return;
                        }
                        int i = selectionStart <= selectionEnd ? selectionStart : selectionEnd;
                        if (selectionStart <= selectionEnd) {
                            selectionStart = selectionEnd;
                        }
                        LynxTextAreaView lynxTextAreaView = this.LIZ;
                        C21397018oS c21397018oS9 = lynxTextAreaView.LLLFFI;
                        if (c21397018oS9 == null) {
                            c21397018oS9 = null;
                        }
                        C2204961BRm.LLLLII(c21397018oS9, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
                        C21397018oS c21397018oS10 = lynxTextAreaView.LLLFFI;
                        if (c21397018oS10 == null) {
                            c21397018oS10 = null;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2204961BRm.LLLLII(c21397018oS10, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)));
                        for (C21399218oo c21399218oo : (C21399218oo[]) spannableStringBuilder.getSpans(i, selectionStart, C21399218oo.class)) {
                            int spanStart = spannableStringBuilder.getSpanStart(c21399218oo);
                            spannableStringBuilder.delete(spanStart, spannableStringBuilder.getSpanEnd(c21399218oo));
                            spannableStringBuilder.insert(spanStart, (CharSequence) (c21399218oo.LIZIZ + c21399218oo.LIZ));
                        }
                        if (C1316940kNI.LIZ()) {
                            for (C0GVZ c0gvz : (C0GVZ[]) spannableStringBuilder.getSpans(i, selectionStart, C0GVZ.class)) {
                                spannableStringBuilder.removeSpan(c0gvz);
                            }
                        }
                        this.LIZ.LJJJJJL((i > spannableStringBuilder.length() || selectionStart > spannableStringBuilder.length()) ? ClipData.newPlainText(null, "") : ClipData.newPlainText(null, spannableStringBuilder.subSequence(i, selectionStart)));
                        declaredMethod.setAccessible(true);
                        C21397018oS c21397018oS11 = this.LIZ.LLLFFI;
                        declaredMethod.invoke(c21397018oS11 != null ? c21397018oS11 : null, new Object[0]);
                    } catch (NoSuchMethodException e) {
                        TryCatchGuardChecker.doCheck(e);
                        LynxLog.e("LynxTextAreaView", "Unable to find stopTextActionMode method");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LynxLog.e("LynxTextAreaView", "An unexpected error was encountered while getting the stopTextActionMode method. error message: " + th.getMessage());
                    }
                }
            };
            C21397018oS c21397018oS6 = this.LLLFFI;
            if (c21397018oS6 != null) {
                c21397018oS2 = c21397018oS6;
            }
            c21397018oS2.setCopyListener(interfaceC21397218oU);
        }
    }

    public LynxTextAreaView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLLIIIIL = new ArrayList();
        this.LLLIIIL = 1;
        this.LLLIIL = 16;
        this.LLLILZJ = AFwS258S0000000_20.get$arr$(7);
    }

    @InterfaceC1967107nB
    public final void addMention(ReadableMap readableMap, Callback callback) throws Throwable {
        C21399218oo c21399218oo;
        int i;
        int color;
        if (readableMap == null) {
            return;
        }
        int i2 = this.LLLI;
        int i3 = this.LLLIIIL;
        if ((i2 & i3) == i3 && readableMap.hasKey("name")) {
            if (readableMap.hasKey("symbol")) {
                c21399218oo = new C21399218oo(readableMap.getString("name"), readableMap.getString("symbol"));
            } else {
                c21399218oo = new C21399218oo(readableMap.getString("name"), e3.g);
            }
            Spannable spannableLIZ = c21399218oo.LIZ();
            int length = ((SpannableString) spannableLIZ).length();
            C21397018oS c21397018oS = this.LLLFFI;
            C21397018oS c21397018oS2 = null;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            C786410Ut5.o2(spannableLIZ, Integer.valueOf(c21397018oS.getHeight()), 0, length, 33);
            if (readableMap.hasKey("font-style")) {
                i = readableMap.getInt("font-style");
            } else {
                i = 1;
            }
            C786410Ut5.o2(spannableLIZ, new StyleSpan(i), 0, length, 33);
            if (readableMap.hasKey("font-color")) {
                color = ColorProtector.parseColor(readableMap.getString("font-color"));
            } else {
                color = -65536;
            }
            C786410Ut5.o2(spannableLIZ, new C1316790kN3(color), 0, length, 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) C21399218oo.LIZIZ(spannableLIZ, c21399218oo));
            if (readableMap.hasKey("extraSpace")) {
                spannableStringBuilder.append((CharSequence) readableMap.getString("extraSpace"));
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
            C21397018oS c21397018oS3 = this.LLLFFI;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS3, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null));
            if (editableLLLLII != null) {
                C21397018oS c21397018oS4 = this.LLLFFI;
                if (c21397018oS4 != null) {
                    c21397018oS2 = c21397018oS4;
                }
                editableLLLLII.insert(c21397018oS2.getSelectionEnd(), spannableStringBuilder);
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

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    @InterfaceC1967107nB
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        boolean z;
        C21397018oS c21397018oS;
        if (readableMap == null) {
            return;
        }
        if ((this.LLLI ^ 0) == 0) {
            super.sendDelEvent(readableMap, callback);
            return;
        }
        Iterator<InterfaceC21400018ow> it2 = this.LLLIIIIL.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                c21397018oS = null;
                if (!it2.hasNext()) {
                    break loop0;
                }
                InterfaceC21400018ow next = it2.next();
                if (!z) {
                    C21397018oS c21397018oS2 = this.LLLFFI;
                    if (c21397018oS2 == null) {
                        c21397018oS2 = null;
                    }
                    if (next.LIZ(C2204961BRm.LLLLII(c21397018oS2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98hIYE2+6xAQb2wHJXw==", null)))) {
                    }
                }
                z = true;
            }
        }
        if (z) {
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
                C21397018oS c21397018oS3 = this.LLLFFI;
                if (c21397018oS3 != null) {
                    c21397018oS = c21397018oS3;
                }
                C21397118oT c21397118oTLJIIIIZZ = c21397018oS.LJIIIIZZ();
                if (c21397118oTLJIIIIZZ != null) {
                    c21397118oTLJIIIIZZ.deleteSurroundingText(i2, 0);
                }
            }
            if (callback == null) {
                return;
            }
            callback.invoke(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (callback == null) {
                return;
            }
            callback.invoke(1, th);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL();
        if (autoHeightInputShadowNodeLJJJJIZL != null) {
            C21397018oS c21397018oS = this.LLLFFI;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            autoHeightInputShadowNodeLJJJJIZL.LJJLI = c21397018oS;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJJI(java.lang.CharSequence r11, int r12, int r13, android.text.Spanned r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.LJJJI(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
