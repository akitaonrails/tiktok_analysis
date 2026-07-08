package com.ss.android.ugc.aweme.poi.textarea;

import X.C013C;
import X.C089E;
import X.C0GVZ;
import X.C0WZX;
import X.C1285920jZG;
import X.C1289960jfm;
import X.C1299120juY;
import X.C1312920kGo;
import X.C1316790kN3;
import X.C1339210kxD;
import X.C1529870puj;
import X.C20145713s7;
import X.C21397018oS;
import X.C21397118oT;
import X.C21398218oe;
import X.C21399218oo;
import X.C21399318op;
import X.C21399518or;
import X.C21400518p1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C430860Guy;
import X.C439910HMv;
import X.C589980NCa;
import X.C786410Ut5;
import X.InterfaceC1289280jeg;
import X.InterfaceC1312540kGC;
import X.InterfaceC1541990qEH;
import X.InterfaceC1967107nB;
import X.InterfaceC20096813kE;
import X.InterfaceC21397218oU;
import X.InterfaceC21397318oV;
import X.InterfaceC21400018ow;
import X.InterfaceC439930HMx;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew;
import j27.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes33.dex */
public class LocalServiceTextAreaNew extends LynxBaseInputView {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public String LLLFFI;
    public InterfaceC1541990qEH LLLFZ;
    public C21397018oS LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public ClipboardManager LLLIIIIL;
    public boolean LLLIIIL;
    public final List<InterfaceC21400018ow> LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final IdentityHashMap<C21399218oo, C589980NCa> LLLJ;
    public final IdentityHashMap<C21399218oo, Integer> LLLJIL;
    public float LLLJL;
    public float LLLL;
    public Function1<? super Context, ? extends InterfaceC439930HMx> LLLLII;

    public LocalServiceTextAreaNew() {
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

    public final void LJJJJZ() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL;
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS == null || c21397018oS.getHint() == null || (autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL()) == null) {
            return;
        }
        autoHeightInputShadowNodeLJJJJIZL.LJJJJJL();
        this.LLLIILIL = autoHeightInputShadowNodeLJJJJIZL.LJJJJL();
    }

    public final void LJJJJZI() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJIZL;
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS == null || C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null)) == null || (autoHeightInputShadowNodeLJJJJIZL = LJJJJIZL()) == null) {
            return;
        }
        autoHeightInputShadowNodeLJJJJIZL.LJJJJLI();
        this.LLLIILIL = autoHeightInputShadowNodeLJJJJIZL.LJJJJL();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJ() {
        super.LJJJJ();
        LJJJJZI();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJI() {
        super.LJJJJI();
        if (this.LLILLL != null) {
            LJJJJZ();
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        if (LJJIZ() && this.LLLIILIL && this.LLJZ.LIZLLL()) {
            this.LLJZ.LJ();
            this.LLLIILIL = false;
        }
        if (LJJIZ() && this.LLLIL) {
            this.LLLIL = false;
            this.LLJJJJJIL = true;
            C21397018oS c21397018oS = this.LLLI;
            if (c21397018oS != null) {
                c21397018oS.setText(C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null)));
            }
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLLILZ) {
            LJJJJZI();
            LJJJJZ();
            this.LLLILZ = false;
        }
    }

    public LocalServiceTextAreaNew(s sVar) {
        super(sVar, null);
        this.LLLIIL = new ArrayList();
        this.LLLJ = new IdentityHashMap<>();
        this.LLLJIL = new IdentityHashMap<>();
        this.LLLL = 1.0f;
        this.LLLLII = AFwS258S0000000_20.get$arr$(22);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* JADX INFO: renamed from: LJJIJ */
    public final C21397018oS createView(Context context) {
        C21397018oS c21397018oSLJJIJ = super.createView(context);
        this.LLLI = c21397018oSLJJIJ;
        q0.LJIL(c21397018oSLJJIJ, new String[]{"text/*"}, new InterfaceC20096813kE() { // from class: X.18ot
            @Override // X.InterfaceC20096813kE
            public final C20098713kX LIZ(View view, C20098713kX c20098713kX) throws JSONException {
                if (c20098713kX.LIZ.getSource() == 1) {
                    LocalServiceTextAreaNew.LJJJJL(this.LIZ, "copy");
                }
                return c20098713kX;
            }
        });
        c21397018oSLJJIJ.addTextChangedListener(new LocalServiceTextAreaNew$createView$1$2(this));
        c21397018oSLJJIJ.setOnEditorActionListener(new C1339210kxD(this, c21397018oSLJJIJ, 1));
        LJJIJIIJI(c21397018oSLJJIJ);
        return c21397018oSLJJIJ;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJI(C21397018oS c21397018oS) {
        c21397018oS.setHorizontallyScrolling(false);
        c21397018oS.setSingleLine(false);
        c21397018oS.setGravity(48);
    }

    public final <T> JavaOnlyArray LJJJJJ(Class<T> cls) throws Throwable {
        Editable editableLLLLII;
        C21397018oS c21397018oS = this.LLLI;
        Object[] spans = null;
        if (c21397018oS != null) {
            editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null));
            if (editableLLLLII != null) {
                spans = editableLLLLII.getSpans(0, editableLLLLII.length(), cls);
            }
        } else {
            editableLLLLII = null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (spans == null) {
            return javaOnlyArray;
        }
        C089E c089e = new C089E(spans);
        while (c089e.hasNext()) {
            Object next = c089e.next();
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("start", Integer.valueOf(editableLLLLII.getSpanStart(next)));
            javaOnlyMap.put("end", Integer.valueOf(editableLLLLII.getSpanEnd(next)));
            javaOnlyArray.add(javaOnlyMap);
        }
        return javaOnlyArray;
    }

    public final void LJJJJJL(ClipData clipData) {
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
            ClipboardManager clipboardManager = this.LLLIIIIL;
            if (clipboardManager != null) {
                C20145713s7.LIZJ(clipboardManager, clipData, CertProviderManagerKt.findCert("bpea-ls_review_write_clipboard", 1476399165));
            }
        } catch (RemoteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("When we tried to copy copyData, we encountered a RemoteException. ");
            sbLIZ2.append(e2.getMessage());
            LynxLog.e("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027c A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:9:0x0016, B:10:0x0038, B:12:0x003e, B:14:0x0048, B:15:0x004c, B:16:0x0056, B:18:0x005c, B:20:0x0066, B:21:0x006a, B:22:0x0079, B:24:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x009f, B:34:0x00a8, B:35:0x00ac, B:37:0x00b5, B:39:0x00bf, B:40:0x00c2, B:41:0x00c5, B:42:0x00d3, B:44:0x00d9, B:46:0x00e9, B:48:0x00f3, B:52:0x0102, B:56:0x010b, B:57:0x011e, B:59:0x0124, B:61:0x012c, B:67:0x013b, B:72:0x0147, B:74:0x014b, B:76:0x0151, B:79:0x0156, B:81:0x0160, B:83:0x0169, B:85:0x016d, B:87:0x0171, B:88:0x0179, B:95:0x018b, B:96:0x018e, B:97:0x0198, B:99:0x01a6, B:100:0x01b0, B:102:0x01b8, B:142:0x02a2, B:144:0x02a8, B:148:0x02b2, B:152:0x02b8, B:155:0x02c2, B:156:0x02cd, B:109:0x01c9, B:111:0x01cd, B:113:0x01dd, B:114:0x01e2, B:117:0x01e9, B:119:0x01ef, B:121:0x01f7, B:122:0x01fa, B:124:0x0222, B:125:0x0234, B:128:0x024b, B:130:0x0251, B:132:0x0261, B:134:0x0267, B:136:0x027c, B:137:0x028e, B:70:0x0142), top: B:165:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(android.text.Editable r15) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew.LJJJJLL(android.text.Editable):void");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1967107nB
    public final void getTextInfo(Callback callback) throws Throwable {
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C21397018oS c21397018oS = this.LLLI;
        Editable editableLLLLII = null;
        if (c21397018oS != null) {
            editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null));
        }
        javaOnlyMap.put("text", String.valueOf(editableLLLLII));
        if ((this.LLLIIII & 1) == 1) {
            javaOnlyMap.put("mention", LJJJJJ(C21399218oo.class));
        }
        if ((this.LLLIIII & 16) == 16) {
            javaOnlyMap.put("emoji", LJJJJJ(C0GVZ.class));
        }
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLJJIJI = map.containsKey("line");
            this.LLLIIIL = map.containsKey("mention");
        }
        if (!this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
        }
    }

    @InterfaceC1312540kGC(name = "line-spacing-android")
    public final void setLineSpacing(int i) {
        float f = i;
        this.LLLJL = f;
        TextView textView = (TextView) this.mView;
        if (textView != null) {
            textView.setLineSpacing(f, this.LLLL);
        }
    }

    @InterfaceC1312540kGC(name = "line-spacing-mult")
    public final void setLineSpacingMult(float f) {
        this.LLLL = f;
        TextView textView = (TextView) this.mView;
        if (textView != null) {
            textView.setLineSpacing(this.LLLJL, f);
        }
    }

    @InterfaceC1312540kGC(name = "max-height")
    public final void setMaxHeight(String str) {
        if (str == null) {
            TextView textView = (TextView) this.mView;
            if (textView != null) {
                textView.setMaxLines(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        float fLIZIZ = C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ);
        TextView textView2 = (TextView) this.mView;
        if (textView2 != null) {
            textView2.setMaxHeight((int) (((double) fLIZIZ) + 0.5d));
        }
        this.LLLILZ = true;
    }

    @InterfaceC1312540kGC(defaultInt = Integer.MAX_VALUE, name = "maxlines")
    public final void setMaxLines(int i) {
        this.LLJL = i;
    }

    @InterfaceC1312540kGC(name = "min-height")
    public final void setMinHeight(String str) {
        if (str == null) {
            TextView textView = (TextView) this.mView;
            if (textView != null) {
                textView.setMinLines(0);
                return;
            }
            return;
        }
        float fLIZIZ = C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ);
        TextView textView2 = (TextView) this.mView;
        if (textView2 != null) {
            textView2.setMinHeight((int) (((double) fLIZIZ) + 0.5d));
        }
        this.LLLILZ = true;
    }

    @InterfaceC1312540kGC(name = "review_view_container_id")
    public final void setReviewViewContainerId(String str) {
        if (!Intrinsics.LJFF(this.LLLFFI, str)) {
            this.LLLFFI = str;
            this.LLLFZ = null;
        }
    }

    @InterfaceC1312540kGC(name = "richtype")
    public final void setRichType(String str) {
        if (str == null) {
            str = "none";
        }
        if (a0.LJJIIZI(str, "none", false)) {
            this.LLLIIII = 0;
            ((ArrayList) this.LLLIIL).clear();
            C21397018oS c21397018oS = this.LLLI;
            if (c21397018oS != null) {
                C21397118oT c21397118oT = c21397018oS.LLIZLLLIL;
                if (c21397118oT != null) {
                    c21397118oT.LIZ = null;
                }
                c21397018oS.LLJ = null;
                return;
            }
            return;
        }
        if (a0.LJJIIZI(str, "mention", false)) {
            this.LLLIIII |= 1;
            ((ArrayList) this.LLLIIL).add(new InterfaceC21400018ow() { // from class: X.18on
                @Override // X.InterfaceC21400018ow
                public final boolean LIZ(Editable editable) {
                    Object obj;
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int i = 0;
                    if (selectionStart != selectionEnd) {
                        int iMin = Math.min(selectionStart, selectionEnd);
                        if (iMin < 0) {
                            iMin = 0;
                        }
                        int iMax = Math.max(selectionStart, selectionEnd);
                        int length = editable.length();
                        if (iMax > length) {
                            iMax = length;
                        }
                        C089E c089e = new C089E(editable.getSpans(iMin, iMax, C21399918ov.class));
                        while (c089e.hasNext()) {
                            Object next = c089e.next();
                            iMin = Math.min(iMin, editable.getSpanStart(next));
                            iMax = Math.max(iMax, editable.getSpanEnd(next));
                        }
                        if (iMin >= 0) {
                            i = iMin;
                        }
                        int length2 = editable.length();
                        if (iMax > length2) {
                            iMax = length2;
                        }
                        editable.delete(i, iMax);
                        return true;
                    }
                    if (selectionStart < 0) {
                        return false;
                    }
                    int i2 = selectionStart - 1;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int i3 = selectionStart + 1;
                    int length3 = editable.length();
                    if (i3 > length3) {
                        i3 = length3;
                    }
                    Object[] spans = editable.getSpans(i2, i3, C21399918ov.class);
                    int length4 = spans.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length4) {
                            obj = spans[i4];
                            int spanStart = editable.getSpanStart(obj);
                            int spanEnd = editable.getSpanEnd(obj);
                            if (spanStart <= selectionStart && selectionStart <= spanEnd) {
                                break;
                            }
                            i4++;
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C21399918ov c21399918ov = (C21399918ov) obj;
                    if (c21399918ov != null) {
                        int spanEnd2 = editable.getSpanEnd(c21399918ov.LIZ);
                        int spanEnd3 = editable.getSpanEnd(c21399918ov);
                        if (spanEnd2 >= 0 && spanEnd2 < spanEnd3 && spanEnd3 <= editable.length()) {
                            editable.delete(spanEnd2, spanEnd3);
                            Selection.setSelection(editable, C13LZ.LJ(spanEnd2, 0, editable.length()));
                            return true;
                        }
                    }
                    return false;
                }
            });
            this.LLJJJJJIL = true;
            C21398218oe c21398218oe = new C21398218oe(new C21399318op() { // from class: X.18ou
                @Override // X.C21399318op, android.text.SpanWatcher
                public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
                }
            });
            C21397018oS c21397018oS2 = this.LLLI;
            if (c21397018oS2 != null) {
                c21397018oS2.setEditableFactory(c21398218oe);
            }
        }
        if (a0.LJJIIZI(str, "bracket", false)) {
            this.LLLIIII |= 16;
            ((ArrayList) this.LLLIIL).add(C21399518or.LIZ);
            C439910HMv.LIZ().LIZ = this.LLLLII.invoke(this.mContext);
            this.LLLII = true;
        }
        if ((this.LLLIIII ^ 0) != 0) {
            C21397018oS c21397018oS3 = this.LLLI;
            if (c21397018oS3 != null) {
                c21397018oS3.setBackSpaceListener(new InterfaceC21397318oV() { // from class: X.18oi
                    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
                    @Override // X.InterfaceC21397318oV
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZ() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 349
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21398618oi.LIZ():boolean");
                    }
                });
            }
            this.LLLIIIIL = (ClipboardManager) C786410Ut5.R2(this.mContext, "clipboard");
            InterfaceC21397218oU interfaceC21397218oU = new InterfaceC21397218oU() { // from class: X.18oh
                @Override // X.InterfaceC21397218oU
                public final void LIZ() {
                    SpannableStringBuilder spannableStringBuilder;
                    C21397018oS c21397018oS4 = this.LIZ.LLLI;
                    int selectionStart = c21397018oS4 != null ? Selection.getSelectionStart(C2204961BRm.LLLLII(c21397018oS4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null))) : -1;
                    C21397018oS c21397018oS5 = this.LIZ.LLLI;
                    int selectionEnd = c21397018oS5 != null ? Selection.getSelectionEnd(C2204961BRm.LLLLII(c21397018oS5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null))) : -1;
                    try {
                        Method declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                        if (selectionStart == -1 || selectionEnd == -1) {
                            this.LIZ.LJJJJJL(ClipData.newPlainText(null, ""));
                            declaredMethod.setAccessible(true);
                            C21397018oS c21397018oS6 = this.LIZ.LLLI;
                            if (c21397018oS6 != null) {
                                try {
                                    declaredMethod.invoke(c21397018oS6, new Object[0]);
                                    return;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    LynxLog.e("LynxTextAreaView", "Failed to stop action mode");
                                    return;
                                }
                            }
                            return;
                        }
                        int i = selectionStart <= selectionEnd ? selectionStart : selectionEnd;
                        if (selectionStart <= selectionEnd) {
                            selectionStart = selectionEnd;
                        }
                        C21397018oS c21397018oS7 = this.LIZ.LLLI;
                        if (c21397018oS7 == null || C2204961BRm.LLLLII(c21397018oS7, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null)) == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        } else {
                            LocalServiceTextAreaNew localServiceTextAreaNew = this.LIZ;
                            localServiceTextAreaNew.getClass();
                            C21397018oS c21397018oS8 = localServiceTextAreaNew.LLLI;
                            spannableStringBuilder = new SpannableStringBuilder(c21397018oS8 != null ? C2204961BRm.LLLLII(c21397018oS8, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null)) : null);
                            C089E c089e = new C089E(spannableStringBuilder.getSpans(i, selectionStart, C21399218oo.class));
                            while (c089e.hasNext()) {
                                C21399218oo c21399218oo = (C21399218oo) c089e.next();
                                int spanStart = spannableStringBuilder.getSpanStart(c21399218oo);
                                spannableStringBuilder.delete(spanStart, spannableStringBuilder.getSpanEnd(c21399218oo));
                                spannableStringBuilder.insert(spanStart, (CharSequence) (c21399218oo.LIZIZ + c21399218oo.LIZ));
                            }
                            C089E c089e2 = new C089E(spannableStringBuilder.getSpans(i, selectionStart, C0GVZ.class));
                            while (c089e2.hasNext()) {
                                spannableStringBuilder.removeSpan(c089e2.next());
                            }
                        }
                        this.LIZ.LJJJJJL((i > spannableStringBuilder.length() || selectionStart > spannableStringBuilder.length()) ? ClipData.newPlainText(null, "") : ClipData.newPlainText(null, spannableStringBuilder.subSequence(i, selectionStart)));
                        declaredMethod.setAccessible(true);
                        C21397018oS c21397018oS9 = this.LIZ.LLLI;
                        if (c21397018oS9 != null) {
                            try {
                                declaredMethod.invoke(c21397018oS9, new Object[0]);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                LynxLog.e("LynxTextAreaView", "Failed to stop action mode");
                            }
                        }
                    } catch (NoSuchMethodException e) {
                        TryCatchGuardChecker.doCheck(e);
                        LynxLog.e("LynxTextAreaView", "Unable to find stopTextActionMode method");
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        LynxLog.e("LynxTextAreaView", "An unexpected error was encountered while getting the stopTextActionMode method. error message: " + th3.getMessage());
                    }
                }
            };
            C21397018oS c21397018oS4 = this.LLLI;
            if (c21397018oS4 != null) {
                c21397018oS4.setCopyListener(interfaceC21397218oU);
            }
        }
    }

    public static void LJJJJL(LocalServiceTextAreaNew localServiceTextAreaNew, String str) throws JSONException {
        localServiceTextAreaNew.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send lsTextAreaSignalEvent, action_type: ");
        sbLIZ.append(str);
        sbLIZ.append("");
        LynxLog.i("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1541990qEH interfaceC1541990qEH = localServiceTextAreaNew.LLLFZ;
        if (interfaceC1541990qEH == null) {
            String str2 = localServiceTextAreaNew.LLLFFI;
            if (str2 != null && str2.length() != 0) {
                C1529870puj.LIZ.getClass();
                localServiceTextAreaNew.LLLFZ = C1529870puj.LJFF(str2);
            }
            interfaceC1541990qEH = localServiceTextAreaNew.LLLFZ;
            if (interfaceC1541990qEH == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("send lsTextAreaSignalEvent failed, kitView not found for containerId: ");
                sbLIZ2.append(localServiceTextAreaNew.LLLFFI);
                LynxLog.w("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", str);
        interfaceC1541990qEH.LIZ("lsTextAreaSignalEvent", jSONObject);
    }

    public final Spannable LJJJJLI(ReadableMap readableMap, Spannable spannable) {
        int i;
        int iArgb;
        int length = ((SpannableString) spannable).length();
        if (readableMap.hasKey("font-style")) {
            i = readableMap.getInt("font-style");
        } else {
            i = 1;
        }
        C786410Ut5.o2(spannable, new StyleSpan(i), 0, length, 33);
        if (readableMap.hasKey("font-color")) {
            try {
                iArgb = ColorUtils.LIZIZ(readableMap.getString("font-color"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iArgb = -65536;
            }
        } else {
            iArgb = -65536;
        }
        if (Color.alpha(iArgb) == 0) {
            iArgb = Color.argb(255, Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
        }
        C786410Ut5.o2(spannable, new C1316790kN3(iArgb), 0, length, 33);
        C786410Ut5.o2(spannable, new C21400518p1(iArgb), 0, length, 33);
        return spannable;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x019a A[Catch: all -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01b6, blocks: (B:39:0x00ba, B:69:0x0135, B:71:0x0142, B:73:0x0147, B:74:0x0151, B:77:0x0160, B:78:0x016a, B:80:0x017c, B:86:0x019a, B:90:0x01aa), top: B:106:0x001c }] */
    @X.InterfaceC1967107nB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addMention(com.lynx.react.bridge.ReadableMap r18, com.lynx.react.bridge.Callback r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew.addMention(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    @InterfaceC1967107nB
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        C21397118oT c21397118oTLJIIIIZZ;
        C21397018oS c21397018oS;
        Editable editableLLLLII;
        if (readableMap == null) {
            return;
        }
        if ((this.LLLIIII ^ 0) == 0) {
            super.sendDelEvent(readableMap, callback);
            return;
        }
        C013C c013c = new C013C();
        Iterator<InterfaceC21400018ow> it2 = this.LLLIIL.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC21400018ow next = it2.next();
            if (!c013c.element && ((c21397018oS = this.LLLI) == null || (editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null))) == null || !Boolean.valueOf(next.LIZ(editableLLLLII)).booleanValue())) {
                z = false;
            }
            c013c.element = z;
        }
        if (c013c.element) {
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
                C21397018oS c21397018oS2 = this.LLLI;
                if (c21397018oS2 != null && (c21397118oTLJIIIIZZ = c21397018oS2.LJIIIIZZ()) != null) {
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
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS != null && autoHeightInputShadowNodeLJJJJIZL != null) {
            autoHeightInputShadowNodeLJJJJIZL.LJJLI = c21397018oS;
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final CharSequence LJJJI(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Spannable spannable;
        C21397018oS c21397018oS;
        boolean z = true;
        if (this.LLJL != Integer.MAX_VALUE && LJJIZ()) {
            int i5 = 0;
            if (!(charSequence instanceof Spannable) || (c21397018oS = this.LLLI) == null || c21397018oS.LJIIIIZZ() == null || !C21397118oT.LIZIZ((Spannable) charSequence)) {
                z = false;
            }
            CharSequence charSequenceSubSequence = new SpannableStringBuilder(charSequence).subSequence(i, i2);
            int i6 = i;
            int i7 = i2;
            while (i6 < i7) {
                int i8 = (i6 + i7) / 2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
                int i9 = i8 + 1;
                spannableStringBuilder.replace(i3, i4, charSequenceSubSequence.subSequence(i5, i9));
                C21397018oS c21397018oS2 = this.LLLI;
                if (c21397018oS2 == null) {
                    break;
                }
                int width = c21397018oS2.getWidth();
                c21397018oS2.getHeight();
                Layout layoutLIZ = C430860Guy.LIZ(spannableStringBuilder, c21397018oS2, width);
                if (layoutLIZ == null) {
                    break;
                }
                if (layoutLIZ.getLineCount() <= this.LLJL) {
                    i6 = i9;
                } else {
                    i7 = i8;
                }
                i5 = 0;
            }
            for (MatchResult matchResult : Regex.findAll$default(new Regex("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-\u1f6ff]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), charSequence, 0, 2, null)) {
                int i10 = i7 + i;
                if (matchResult.LIZIZ().LL <= i10 && matchResult.LIZIZ().LL + matchResult.getValue().length() > i10) {
                    i7 = matchResult.LIZIZ().LL;
                }
            }
            if (i7 < i2 && this.LLJJIJI) {
                this.mContext.LLIZ.LIZIZ(new C1289960jfm(getSign(), "line"));
            }
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(0, i7);
            if (z && (charSequenceSubSequence2 instanceof Spannable) && (spannable = (Spannable) charSequenceSubSequence2) != null) {
                BaseInputConnection.setComposingSpans(spannable);
            }
            return charSequenceSubSequence2;
        }
        if (this.LLJL != Integer.MAX_VALUE && !LJJIZ()) {
            this.LLLIL = true;
        }
        return charSequence;
    }
}
