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
import X.C21399918ov;
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
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
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
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea;
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
public class LocalServiceTextArea extends LynxBaseInputView {
    public static final /* synthetic */ int LLLLII = 0;
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
    public float LLLJIL;
    public float LLLJL;
    public Function1<? super Context, ? extends InterfaceC439930HMx> LLLL;

    public LocalServiceTextArea() {
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJIL(C21397018oS c21397018oS, String str) {
    }

    @InterfaceC1967107nB
    public final void resetSelectionMenu() {
    }

    public final AutoHeightInputShadowNode LJJJJJ() {
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF == null || !(shadowNodeLJFF instanceof AutoHeightInputShadowNode)) {
            return null;
        }
        return (AutoHeightInputShadowNode) shadowNodeLJFF;
    }

    public final void LJJJJZI() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJJ;
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS == null || c21397018oS.getHint() == null || (autoHeightInputShadowNodeLJJJJJ = LJJJJJ()) == null) {
            return;
        }
        autoHeightInputShadowNodeLJJJJJ.LJJJJJL();
        this.LLLIILIL = autoHeightInputShadowNodeLJJJJJ.LJJJJL();
    }

    public final void LJJJLIIL() {
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJJ;
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS == null || C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null)) == null || (autoHeightInputShadowNodeLJJJJJ = LJJJJJ()) == null) {
            return;
        }
        autoHeightInputShadowNodeLJJJJJ.LJJJJLI();
        this.LLLIILIL = autoHeightInputShadowNodeLJJJJJ.LJJJJL();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJ() {
        super.LJJJJ();
        LJJJLIIL();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJJJI() {
        super.LJJJJI();
        if (this.LLILLL != null) {
            LJJJJZI();
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
                c21397018oS.setText(C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null)));
            }
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLLILZ) {
            LJJJLIIL();
            LJJJJZI();
            this.LLLILZ = false;
        }
    }

    public LocalServiceTextArea(s sVar) {
        super(sVar, null);
        this.LLLIIL = new ArrayList();
        this.LLLJ = new IdentityHashMap<>();
        this.LLLJL = 1.0f;
        this.LLLL = AFwS258S0000000_20.get$arr$(21);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* JADX INFO: renamed from: LJJIJ */
    public final C21397018oS createView(Context context) {
        C21397018oS c21397018oSLJJIJ = super.createView(context);
        this.LLLI = c21397018oSLJJIJ;
        q0.LJIL(c21397018oSLJJIJ, new String[]{"text/*"}, new InterfaceC20096813kE() { // from class: X.18os
            @Override // X.InterfaceC20096813kE
            public final C20098713kX LIZ(View view, C20098713kX c20098713kX) throws JSONException {
                if (c20098713kX.LIZ.getSource() == 1) {
                    LocalServiceTextArea.LJJJJLI(this.LIZ, "copy");
                }
                return c20098713kX;
            }
        });
        c21397018oSLJJIJ.addTextChangedListener(new LocalServiceTextArea$createView$1$2(this));
        c21397018oSLJJIJ.setOnEditorActionListener(new C1339210kxD(this, c21397018oSLJJIJ, 0));
        LJJIJIIJI(c21397018oSLJJIJ);
        return c21397018oSLJJIJ;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJI(C21397018oS c21397018oS) {
        c21397018oS.setHorizontallyScrolling(false);
        c21397018oS.setSingleLine(false);
        c21397018oS.setGravity(48);
    }

    public final <T> JavaOnlyArray LJJJJJL(Class<T> cls) throws Throwable {
        Editable editableLLLLII;
        C21397018oS c21397018oS = this.LLLI;
        Object[] spans = null;
        if (c21397018oS != null) {
            editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null));
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

    public final void LJJJJL(ClipData clipData) {
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

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0111, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ff A[Catch: all -> 0x037f, TryCatch #4 {all -> 0x037f, blocks: (B:119:0x01db, B:128:0x01ee, B:134:0x0226, B:136:0x022a, B:138:0x0239, B:139:0x023e, B:142:0x0245, B:144:0x024b, B:146:0x0253, B:147:0x0256, B:149:0x027e, B:150:0x0281, B:154:0x029a, B:156:0x02a0, B:157:0x02a8, B:159:0x02b0, B:161:0x02b6, B:163:0x02cc, B:164:0x02cf, B:167:0x02df, B:170:0x02e7, B:172:0x02ed, B:174:0x02f5, B:176:0x02fd, B:177:0x0304, B:181:0x030e, B:183:0x031d, B:185:0x0323, B:186:0x0327, B:188:0x032f, B:190:0x033e, B:192:0x0343, B:196:0x0356, B:197:0x036a, B:130:0x01ff, B:131:0x0210), top: B:222:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0210 A[Catch: all -> 0x037f, TryCatch #4 {all -> 0x037f, blocks: (B:119:0x01db, B:128:0x01ee, B:134:0x0226, B:136:0x022a, B:138:0x0239, B:139:0x023e, B:142:0x0245, B:144:0x024b, B:146:0x0253, B:147:0x0256, B:149:0x027e, B:150:0x0281, B:154:0x029a, B:156:0x02a0, B:157:0x02a8, B:159:0x02b0, B:161:0x02b6, B:163:0x02cc, B:164:0x02cf, B:167:0x02df, B:170:0x02e7, B:172:0x02ed, B:174:0x02f5, B:176:0x02fd, B:177:0x0304, B:181:0x030e, B:183:0x031d, B:185:0x0323, B:186:0x0327, B:188:0x032f, B:190:0x033e, B:192:0x0343, B:196:0x0356, B:197:0x036a, B:130:0x01ff, B:131:0x0210), top: B:222:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0327 A[Catch: all -> 0x037f, TryCatch #4 {all -> 0x037f, blocks: (B:119:0x01db, B:128:0x01ee, B:134:0x0226, B:136:0x022a, B:138:0x0239, B:139:0x023e, B:142:0x0245, B:144:0x024b, B:146:0x0253, B:147:0x0256, B:149:0x027e, B:150:0x0281, B:154:0x029a, B:156:0x02a0, B:157:0x02a8, B:159:0x02b0, B:161:0x02b6, B:163:0x02cc, B:164:0x02cf, B:167:0x02df, B:170:0x02e7, B:172:0x02ed, B:174:0x02f5, B:176:0x02fd, B:177:0x0304, B:181:0x030e, B:183:0x031d, B:185:0x0323, B:186:0x0327, B:188:0x032f, B:190:0x033e, B:192:0x0343, B:196:0x0356, B:197:0x036a, B:130:0x01ff, B:131:0x0210), top: B:222:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184 A[Catch: all -> 0x038b, LOOP:8: B:92:0x017d->B:95:0x0184, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x038b, blocks: (B:9:0x001a, B:10:0x003e, B:12:0x0044, B:14:0x004e, B:15:0x0052, B:16:0x0061, B:18:0x0069, B:20:0x0077, B:23:0x0083, B:25:0x0087, B:28:0x0090, B:29:0x0094, B:31:0x009d, B:33:0x00a7, B:34:0x00aa, B:35:0x00ad, B:36:0x00bb, B:38:0x00c1, B:40:0x00d1, B:42:0x00d7, B:44:0x00ea, B:46:0x00f0, B:48:0x00f8, B:54:0x0107, B:63:0x0124, B:59:0x0113, B:61:0x0119, B:67:0x012b, B:69:0x0134, B:71:0x0138, B:73:0x013c, B:75:0x0146, B:77:0x014e, B:81:0x015a, B:83:0x0160, B:89:0x016c, B:90:0x016f, B:91:0x0179, B:95:0x0184, B:96:0x0197, B:98:0x019f, B:102:0x01ac, B:57:0x010e), top: B:220:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(android.text.Editable r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea.LJJJJZ(android.text.Editable):void");
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
            editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null));
        }
        javaOnlyMap.put("text", String.valueOf(editableLLLLII));
        if ((this.LLLIIII & 1) == 1) {
            javaOnlyMap.put("mention", LJJJJJL(C21399218oo.class));
        }
        if ((this.LLLIIII & 16) == 16) {
            javaOnlyMap.put("emoji", LJJJJJL(C0GVZ.class));
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
        this.LLLJIL = f;
        TextView textView = (TextView) this.mView;
        if (textView != null) {
            textView.setLineSpacing(f, this.LLLJL);
        }
    }

    @InterfaceC1312540kGC(name = "line-spacing-mult")
    public final void setLineSpacingMult(float f) {
        this.LLLJL = f;
        TextView textView = (TextView) this.mView;
        if (textView != null) {
            textView.setLineSpacing(this.LLLJIL, f);
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
            ((ArrayList) this.LLLIIL).add(new InterfaceC21400018ow() { // from class: X.18ol
                /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
                
                    if (android.text.Selection.getSelectionEnd(r14) != r3) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0188, code lost:
                
                    r2 = LIZJ(r4, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x018c, code lost:
                
                    if (r2 < 0) goto L107;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x018e, code lost:
                
                    if (r4 <= 0) goto L107;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0190, code lost:
                
                    r1 = r4 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x0196, code lost:
                
                    if (r14.charAt(r1) != '\n') goto L107;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x0198, code lost:
                
                    r4 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x0199, code lost:
                
                    r14.delete(r4, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x019c, code lost:
                
                    if (r2 < 0) goto L110;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x019e, code lost:
                
                    android.text.Selection.setSelection(r14, X.C13LZ.LJ(r2, 0, r14.length()));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x01a9, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x01aa, code lost:
                
                    android.text.Selection.setSelection(r14, r4, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x01ad, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
                
                    r4 = r14.getSpanStart(r8);
                    r3 = r14.getSpanEnd(r8);
                    r2 = r14.length();
                    r1 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
                
                    if (r3 >= r2) goto L148;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
                
                    if (r1 >= 10) goto L149;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
                
                    if (r14.charAt(r3) != ' ') goto L150;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
                
                    r3 = r3 + 1;
                    r1 = r1 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
                
                    if (r14.charAt(r4) != ' ') goto L138;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
                
                    r11 = r11 + 1;
                    r12 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
                
                    if (r8 != null) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x0178, code lost:
                
                    r3 = LIZIZ(r14, r8, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
                
                    if (android.text.Selection.getSelectionStart(r14) != r4) goto L111;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
                @Override // X.InterfaceC21400018ow
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZ(android.text.Editable r14) {
                    /*
                        Method dump skipped, instruction units count: 510
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21398918ol.LIZ(android.text.Editable):boolean");
                }

                public static int LIZJ(int i, Editable editable) {
                    int spanStart;
                    if (i > 0) {
                        int i2 = i - 1;
                        if (editable.charAt(i2) == '\n') {
                            i = i2;
                        }
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    int i3 = i + 1;
                    int length = editable.length();
                    if (i3 > length) {
                        i3 = length;
                    }
                    C21399918ov[] c21399918ovArr = (C21399918ov[]) editable.getSpans(0, i3, C21399918ov.class);
                    int length2 = c21399918ovArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        C21399918ov c21399918ov = c21399918ovArr[i4];
                        int spanStart2 = editable.getSpanStart(c21399918ov);
                        int spanEnd = editable.getSpanEnd(c21399918ov);
                        if (spanStart2 <= i && i <= spanEnd) {
                            if (c21399918ov == null || (spanStart = editable.getSpanStart(c21399918ov)) <= 0 || editable.charAt(spanStart - 1) != '\n') {
                                return -1;
                            }
                            return spanStart;
                        }
                        i4++;
                    }
                    return -1;
                }

                public static int LIZIZ(Editable editable, C21399218oo c21399218oo, int i) {
                    int spanEnd;
                    int spanStart = editable.getSpanStart(c21399218oo);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    C089E c089e = new C089E(editable.getSpans(spanStart, editable.length(), C21399918ov.class));
                    while (c089e.hasNext()) {
                        C21399918ov c21399918ov = (C21399918ov) c089e.next();
                        if (c21399918ov.LIZ == c21399218oo && (spanEnd = editable.getSpanEnd(c21399918ov)) > i) {
                            i = spanEnd;
                        }
                    }
                    return i;
                }
            });
            this.LLJJJJJIL = true;
            C21398218oe c21398218oe = new C21398218oe(new C21399318op());
            C21397018oS c21397018oS2 = this.LLLI;
            if (c21397018oS2 != null) {
                c21397018oS2.setEditableFactory(c21398218oe);
            }
        }
        if (a0.LJJIIZI(str, "bracket", false)) {
            this.LLLIIII |= 16;
            ((ArrayList) this.LLLIIL).add(C21399518or.LIZ);
            C439910HMv.LIZ().LIZ = this.LLLL.invoke(this.mContext);
            this.LLLII = true;
        }
        if ((this.LLLIIII ^ 0) != 0) {
            C21397018oS c21397018oS3 = this.LLLI;
            if (c21397018oS3 != null) {
                c21397018oS3.setBackSpaceListener(new InterfaceC21397318oV() { // from class: X.18oj
                    @Override // X.InterfaceC21397318oV
                    public final boolean LIZ() throws Throwable {
                        Editable editableLLLLII;
                        C21397018oS c21397018oS4;
                        Editable editableLLLLII2;
                        InputMethodManager inputMethodManager;
                        C21397018oS c21397018oS5;
                        Editable editableLLLLII3;
                        C21397018oS c21397018oS6 = this.LIZ.LLLI;
                        if (c21397018oS6 != null) {
                            editableLLLLII = C2204961BRm.LLLLII(c21397018oS6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null));
                            if (editableLLLLII != null && editableLLLLII.length() == 0) {
                                return false;
                            }
                        } else {
                            editableLLLLII = null;
                        }
                        this.LIZ.getClass();
                        if (editableLLLLII != null) {
                            this.LIZ.LJJJJZ(editableLLLLII);
                        }
                        this.LIZ.getClass();
                        C013C c013c = new C013C();
                        LocalServiceTextArea localServiceTextArea = this.LIZ;
                        Iterator<InterfaceC21400018ow> it2 = localServiceTextArea.LLLIIL.iterator();
                        while (it2.hasNext()) {
                            c013c.element = c013c.element || !((c21397018oS5 = localServiceTextArea.LLLI) == null || (editableLLLLII3 = C2204961BRm.LLLLII(c21397018oS5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null))) == null || !Boolean.valueOf(it2.next().LIZ(editableLLLLII3)).booleanValue());
                        }
                        if (c013c.element && (c21397018oS4 = this.LIZ.LLLI) != null && (editableLLLLII2 = C2204961BRm.LLLLII(c21397018oS4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null))) != null) {
                            c21397018oS4.clearComposingText();
                            int selectionStart = Selection.getSelectionStart(editableLLLLII2);
                            int selectionEnd = Selection.getSelectionEnd(editableLLLLII2);
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Context context = c21397018oS4.getContext();
                                Object objH2 = context != null ? C786410Ut5.H2(context, "input_method") : null;
                                if (objH2 instanceof InputMethodManager) {
                                    inputMethodManager = (InputMethodManager) objH2;
                                    if (inputMethodManager != null) {
                                        inputMethodManager.updateSelection(c21397018oS4, selectionStart, selectionEnd, -1, -1);
                                    }
                                } else {
                                    inputMethodManager = null;
                                }
                                if (selectionStart != selectionEnd && inputMethodManager != null) {
                                    inputMethodManager.restartInput(c21397018oS4);
                                }
                            }
                        }
                        LocalServiceTextArea localServiceTextArea2 = this.LIZ;
                        C21397018oS c21397018oS7 = localServiceTextArea2.LLLI;
                        if (c21397018oS7 != null) {
                            C2204961BRm.LLLLII(c21397018oS7, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null));
                        }
                        localServiceTextArea2.getClass();
                        return c013c.element;
                    }
                });
            }
            this.LLLIIIIL = (ClipboardManager) C786410Ut5.R2(this.mContext, "clipboard");
            InterfaceC21397218oU interfaceC21397218oU = new InterfaceC21397218oU() { // from class: X.18og
                @Override // X.InterfaceC21397218oU
                public final void LIZ() {
                    SpannableStringBuilder spannableStringBuilder;
                    C21397018oS c21397018oS4 = this.LIZ.LLLI;
                    int selectionStart = c21397018oS4 != null ? Selection.getSelectionStart(C2204961BRm.LLLLII(c21397018oS4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null))) : -1;
                    C21397018oS c21397018oS5 = this.LIZ.LLLI;
                    int selectionEnd = c21397018oS5 != null ? Selection.getSelectionEnd(C2204961BRm.LLLLII(c21397018oS5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null))) : -1;
                    try {
                        Method declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                        if (selectionStart == -1 || selectionEnd == -1) {
                            this.LIZ.LJJJJL(ClipData.newPlainText(null, ""));
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
                        if (c21397018oS7 == null || C2204961BRm.LLLLII(c21397018oS7, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null)) == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        } else {
                            LocalServiceTextArea localServiceTextArea = this.LIZ;
                            localServiceTextArea.getClass();
                            C21397018oS c21397018oS8 = localServiceTextArea.LLLI;
                            spannableStringBuilder = new SpannableStringBuilder(c21397018oS8 != null ? C2204961BRm.LLLLII(c21397018oS8, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null)) : null);
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
                        this.LIZ.LJJJJL((i > spannableStringBuilder.length() || selectionStart > spannableStringBuilder.length()) ? ClipData.newPlainText(null, "") : ClipData.newPlainText(null, spannableStringBuilder.subSequence(i, selectionStart)));
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

    public static void LJJJJLI(LocalServiceTextArea localServiceTextArea, String str) throws JSONException {
        localServiceTextArea.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send lsTextAreaSignalEvent, action_type: ");
        sbLIZ.append(str);
        sbLIZ.append("");
        LynxLog.i("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1541990qEH interfaceC1541990qEH = localServiceTextArea.LLLFZ;
        if (interfaceC1541990qEH == null) {
            String str2 = localServiceTextArea.LLLFFI;
            if (str2 != null && str2.length() != 0) {
                C1529870puj.LIZ.getClass();
                localServiceTextArea.LLLFZ = C1529870puj.LJFF(str2);
            }
            interfaceC1541990qEH = localServiceTextArea.LLLFZ;
            if (interfaceC1541990qEH == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("send lsTextAreaSignalEvent failed, kitView not found for containerId: ");
                sbLIZ2.append(localServiceTextArea.LLLFFI);
                LynxLog.w("LynxTextAreaView", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", str);
        interfaceC1541990qEH.LIZ("lsTextAreaSignalEvent", jSONObject);
    }

    public final Spannable LJJJJLL(ReadableMap readableMap, Spannable spannable) {
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

    /* JADX WARN: Removed duplicated region for block: B:85:0x018d A[Catch: all -> 0x01a9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x00c3, B:72:0x013e, B:74:0x014b, B:76:0x0150, B:77:0x015a, B:79:0x016f, B:85:0x018d, B:89:0x019d), top: B:105:0x0025 }] */
    @X.InterfaceC1967107nB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addMention(com.lynx.react.bridge.ReadableMap r18, com.lynx.react.bridge.Callback r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea.addMention(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
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
            if (!c013c.element && ((c21397018oS = this.LLLI) == null || (editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgQ==", null))) == null || !Boolean.valueOf(next.LIZ(editableLLLLII)).booleanValue())) {
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
        AutoHeightInputShadowNode autoHeightInputShadowNodeLJJJJJ = LJJJJJ();
        C21397018oS c21397018oS = this.LLLI;
        if (c21397018oS != null && autoHeightInputShadowNodeLJJJJJ != null) {
            autoHeightInputShadowNodeLJJJJJ.LJJLI = c21397018oS;
        }
    }

    public static void LJJJJIZL(Editable editable, C21399218oo c21399218oo, C589980NCa c589980NCa, int i, int i2) {
        editable.setSpan(new C21399918ov(c21399218oo), i, i2, 33);
        editable.setSpan(new ForegroundColorSpan(c589980NCa.LIZIZ), i, i2, 33);
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
