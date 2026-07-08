package com.ss.android.ugc.aweme.pgc.hybrid.ui;

import X.C089E;
import X.C0WZX;
import X.C21394018ny;
import X.C21397018oS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C446310Hen;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import j27.s;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxCreatorTextAreaView extends LynxTextAreaView {
    public LynxCreatorTextAreaView(s sVar) {
        super(sVar, null);
    }

    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView, com.bytedance.ies.xelement.input.LynxBaseInputView
    /* JADX INFO: renamed from: LJJIJ */
    public final C21397018oS createView(Context context) {
        C21397018oS c21397018oSLJJIJ = super.createView(context);
        c21397018oSLJJIJ.setInputType(131073);
        c21397018oSLJJIJ.addTextChangedListener(new C446310Hen(c21397018oSLJJIJ));
        return c21397018oSLJJIJ;
    }

    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView, com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1967107nB
    public final void getMentions(Callback callback) throws Throwable {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        C21397018oS c21397018oS = this.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqvYNHGxTAxfAlEmoUyLYeC0okEtWdFpAbKPqyc3eTFj+R6Weo=", null));
        if (editableLLLLII != null) {
            C089E c089e = new C089E(editableLLLLII.getSpans(0, editableLLLLII.length(), C21394018ny.class));
            while (c089e.hasNext()) {
                C21394018ny c21394018ny = (C21394018ny) c089e.next();
                int spanStart = editableLLLLII.getSpanStart(c21394018ny);
                int spanEnd = editableLLLLII.getSpanEnd(c21394018ny);
                if (spanStart >= 0 && spanEnd <= editableLLLLII.length() && spanStart <= spanEnd) {
                    if (Intrinsics.LJFF(editableLLLLII.subSequence(spanStart, spanEnd).toString(), c21394018ny.LIZ + c21394018ny.LIZIZ)) {
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        javaOnlyMap.put("start", Integer.valueOf(spanStart));
                        javaOnlyMap.put("end", Integer.valueOf(spanEnd));
                        javaOnlyMap.put("params", c21394018ny.LIZJ);
                        javaOnlyArray.add(javaOnlyMap);
                    }
                }
            }
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.put("mention_list", javaOnlyArray);
        if (callback != null) {
            callback.invoke(0, javaOnlyMap2);
        }
    }

    @InterfaceC1967107nB
    public final void addUserMention(ReadableMap readableMap, final Callback callback) throws Throwable {
        if (readableMap == null) {
            return;
        }
        int i = this.LLLI;
        int i2 = this.LLLIIIL;
        if ((i & i2) == i2 && readableMap.hasKey("name")) {
            final JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            for (Map.Entry<String, Object> entry : readableMap.asHashMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key.equals("name")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(value);
                    sbLIZ.append((char) 8291);
                    javaOnlyMap.put(key, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    javaOnlyMap.put(key, value);
                }
            }
            final C21397018oS c21397018oS = this.LL;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            final int selectionEnd = c21397018oS.getSelectionEnd();
            addMention(javaOnlyMap, new Callback() { // from class: X.18nz
                @Override // com.lynx.react.bridge.Callback
                public final void invoke(Object[] objArr) throws Throwable {
                    boolean zLJFF;
                    Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqvYNHGxTAxfAlEmoUyLYeC0okEtWdFpAbKPqyc3eTFj+R6Weo=", null));
                    if (editableLLLLII != null) {
                        JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
                        final int i3 = selectionEnd;
                        final C21397018oS c21397018oS2 = c21397018oS;
                        Callback callback2 = callback;
                        if (objArr != null) {
                            zLJFF = Intrinsics.LJFF(C13LQ.LJJIFFI(objArr), 0);
                        } else {
                            zLJFF = false;
                        }
                        if (zLJFF) {
                            String string = javaOnlyMap2.getString("name");
                            String string2 = javaOnlyMap2.getString("symbol", e3.g);
                            int length = string2.length() + string.length();
                            String string3 = javaOnlyMap2.getString("extraSpace");
                            if (string3 == null) {
                                string3 = " ";
                            }
                            final int length2 = string3.length() + length;
                            editableLLLLII.setSpan(new C21394018ny(string2, string, javaOnlyMap2), i3, length + i3, 33);
                            HandlerHook.viewPost(c21397018oS2, new Runnable() { // from class: X.18o0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("LynxCreatorTextAreaView@8752.addUserMention$postMentionSuccessCallback$1$1$1");
                                    try {
                                        c21397018oS2.setSelection(i3 + length2);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("LynxCreatorTextAreaView@8752.addUserMention$postMentionSuccessCallback$1$1$1");
                                }
                            });
                            if (callback2 != null) {
                                callback2.invoke(0);
                                return;
                            }
                            return;
                        }
                        if (callback2 == null) {
                            return;
                        }
                        callback2.invoke(8);
                    }
                }
            });
            return;
        }
        if (callback != null) {
            callback.invoke(4);
        }
    }
}
