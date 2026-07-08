package com.ss.android.ugc.aweme.poi.textarea;

import X.C089E;
import X.C0GVZ;
import X.C0WZX;
import X.C1289960jfm;
import X.C1316940kNI;
import X.C13LQ;
import X.C21397018oS;
import X.C21399018om;
import X.C21399218oo;
import X.C21399918ov;
import X.C21400418p0;
import X.C21400518p1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C439900HMu;
import Y.ARunnableS132S0100000_32;
import android.text.Editable;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class LocalServiceTextAreaNew$createView$1$2 implements TextWatcher {
    public boolean LL;
    public final C21399018om LLILLJJLI;
    public final /* synthetic */ LocalServiceTextAreaNew LLILLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18om] */
    public LocalServiceTextAreaNew$createView$1$2(final LocalServiceTextAreaNew localServiceTextAreaNew) {
        this.LLILLL = localServiceTextAreaNew;
        this.LLILLJJLI = new SpanWatcher() { // from class: X.18om
            @Override // android.text.SpanWatcher
            public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            }

            @Override // android.text.SpanWatcher
            public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            }

            @Override // android.text.SpanWatcher
            public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) throws JSONException {
                if (obj == Selection.SELECTION_END || obj == Selection.SELECTION_START) {
                    LocalServiceTextAreaNew localServiceTextAreaNew2 = localServiceTextAreaNew;
                    if (spannable != null) {
                        if (!localServiceTextAreaNew2.LLLIZZ) {
                            int selectionStart = Selection.getSelectionStart(spannable);
                            int selectionEnd = Selection.getSelectionEnd(spannable);
                            if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart == selectionEnd) {
                                int i5 = selectionEnd - 1;
                                if (i5 < 0) {
                                    i5 = 0;
                                }
                                int i6 = selectionEnd + 1;
                                int length = spannable.length();
                                if (i6 > length) {
                                    i6 = length;
                                }
                                C089E c089e = new C089E(spannable.getSpans(i5, i6, C21399918ov.class));
                                while (true) {
                                    if (!c089e.hasNext()) {
                                        break;
                                    }
                                    Object next = c089e.next();
                                    int spanStart = spannable.getSpanStart(next);
                                    int spanEnd = spannable.getSpanEnd(next);
                                    if (selectionEnd > spanStart && selectionEnd <= spanEnd) {
                                        localServiceTextAreaNew2.LLLIZZ = true;
                                        try {
                                            Selection.setSelection(spannable, spanStart);
                                            localServiceTextAreaNew2.LLLIZZ = false;
                                            break;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            localServiceTextAreaNew2.LLLIZZ = false;
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        localServiceTextAreaNew2.getClass();
                    }
                }
                if (obj == Selection.SELECTION_END && !this.LL) {
                    LocalServiceTextAreaNew localServiceTextAreaNew3 = localServiceTextAreaNew;
                    if (!localServiceTextAreaNew3.LLJJJJJIL) {
                        LocalServiceTextAreaNew.LJJJJL(localServiceTextAreaNew3, "move_cursor");
                    }
                }
            }
        };
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        int i;
        int i2;
        boolean z;
        int foregroundColor;
        boolean z2;
        char cCharAt;
        C21397018oS c21397018oS = this.LLILLL.LLLI;
        if (c21397018oS != null) {
            HandlerHook.viewPost(c21397018oS, new ARunnableS132S0100000_32(this, 43));
        }
        LocalServiceTextAreaNew localServiceTextAreaNew = this.LLILLL;
        boolean z3 = localServiceTextAreaNew.LLJJJJJIL;
        localServiceTextAreaNew.LLJJJJJIL = true;
        if (C1316940kNI.LIZ() && localServiceTextAreaNew.LLLII) {
            Pattern pattern = C439900HMu.LIZ;
            C439900HMu.LIZ((TextView) localServiceTextAreaNew.mView);
        }
        LocalServiceTextAreaNew localServiceTextAreaNew2 = this.LLILLL;
        localServiceTextAreaNew2.LLJJJJJIL = z3;
        if (editable != null) {
            localServiceTextAreaNew2.LJJJJLL(editable);
            this.LLILLL.getClass();
            C089E c089e = new C089E(editable.getSpans(0, editable.length(), C21399218oo.class));
            while (c089e.hasNext()) {
                Object next = c089e.next();
                int spanStart = editable.getSpanStart(next);
                int spanEnd = editable.getSpanEnd(next);
                if (spanStart <= 0 || ((cCharAt = editable.charAt(spanStart - 1)) != '#' && cCharAt != '@')) {
                    i = spanStart;
                }
                C21400418p0 c21400418p0 = (C21400418p0) C13LQ.LJJIFFI(editable.getSpans(spanStart, spanEnd, C21400418p0.class));
                if (c21400418p0 != null) {
                    i2 = c21400418p0.LIZ;
                } else {
                    i2 = -16776961;
                }
                int i3 = spanEnd;
                while (i3 < editable.length()) {
                    int i4 = i3 + 1;
                    if (editable.getSpans(i3, i4, C21399218oo.class).length != 0 || editable.getSpans(i3, i4, C21399918ov.class).length != 0) {
                        break;
                    }
                    char cCharAt2 = editable.charAt(i3);
                    if (cCharAt2 != '@' && cCharAt2 != '#') {
                        if (cCharAt2 == ' ' || cCharAt2 == '\n' || cCharAt2 == '\r' || cCharAt2 == '\t') {
                            i3 = i4;
                        } else {
                            z = true;
                            break;
                        }
                    } else if (i4 >= editable.length() || editable.getSpans(i4, i3 + 2, C21399218oo.class).length == 0) {
                        z = true;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                }
                z = false;
                OverlayForegroundColorSpan overlayForegroundColorSpan = (OverlayForegroundColorSpan) C13LQ.LJJIFFI(editable.getSpans(i, spanEnd, OverlayForegroundColorSpan.class));
                if (overlayForegroundColorSpan != null) {
                    foregroundColor = overlayForegroundColorSpan.originalColor;
                    z2 = true;
                } else {
                    C21400518p1 c21400518p1 = (C21400518p1) C13LQ.LJJIFFI(editable.getSpans(i, spanEnd, C21400518p1.class));
                    if (c21400518p1 != null) {
                        foregroundColor = c21400518p1.LIZ;
                    } else {
                        ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) C13LQ.LJJIFFI(editable.getSpans(i, spanEnd, ForegroundColorSpan.class));
                        if (foregroundColorSpan != null) {
                            foregroundColor = foregroundColorSpan.getForegroundColor();
                        } else {
                            foregroundColor = -65536;
                        }
                    }
                    z2 = false;
                }
                if (z != z2) {
                    C089E c089e2 = new C089E(editable.getSpans(i, spanEnd, ForegroundColorSpan.class));
                    while (c089e2.hasNext()) {
                        editable.removeSpan(c089e2.next());
                    }
                    if (z) {
                        editable.setSpan(new OverlayForegroundColorSpan(foregroundColor, i2), i, spanEnd, 33);
                    } else {
                        editable.setSpan(new ForegroundColorSpan(foregroundColor), i, spanEnd, 33);
                    }
                }
            }
            if (C13LQ.LJJIJIIJI(this.LLILLJJLI, editable.getSpans(0, editable.length(), SpanWatcher.class)) < 0) {
                editable.setSpan(this.LLILLJJLI, 0, editable.length(), 18);
            }
        }
        this.LLILLL.LJJJJZI();
    }

    public final class OverlayForegroundColorSpan extends ForegroundColorSpan {
        public final int originalColor;

        public OverlayForegroundColorSpan(int i, int i2) {
            super(i2);
            this.originalColor = i;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        C21397018oS c21397018oS;
        this.LL = true;
        LocalServiceTextAreaNew localServiceTextAreaNew = this.LLILLL;
        if (!localServiceTextAreaNew.LLJJJJJIL && i3 != 0 && (c21397018oS = localServiceTextAreaNew.LLLI) != null) {
            Object obj = null;
            Editable editableLLLLII = C2204961BRm.LLLLII(c21397018oS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHa2SoBJs7n+GpotKgle3l7urOBr7eA1VhaZX/pgY2T7Q==", null));
            if (editableLLLLII != null) {
                if ((localServiceTextAreaNew.LLLIIII & 16) == 16) {
                    int i4 = i + i2;
                    Object[] spans = editableLLLLII.getSpans(i, i4, C0GVZ.class);
                    int length = spans.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Object obj2 = spans[i5];
                        if (editableLLLLII.getSpanStart(obj2) == i && editableLLLLII.getSpanEnd(obj2) == i4) {
                            if (obj2 != null) {
                                editableLLLLII.removeSpan(obj2);
                            }
                        } else {
                            i5++;
                        }
                    }
                }
                if ((localServiceTextAreaNew.LLLIIII & 1) == 1) {
                    int i6 = i2 + i;
                    Object[] spans2 = editableLLLLII.getSpans(i, i6, C21399218oo.class);
                    int length2 = spans2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length2) {
                            break;
                        }
                        Object obj3 = spans2[i7];
                        if (editableLLLLII.getSpanStart(obj3) == i && editableLLLLII.getSpanEnd(obj3) == i6) {
                            obj = obj3;
                            break;
                        }
                        i7++;
                    }
                    C21399218oo c21399218oo = (C21399218oo) obj;
                    if (c21399218oo != null) {
                        localServiceTextAreaNew.LLJJJJJIL = true;
                        editableLLLLII.delete(editableLLLLII.getSpanStart(c21399218oo), editableLLLLII.getSpanEnd(c21399218oo));
                        localServiceTextAreaNew.LLJJJJJIL = true;
                        editableLLLLII.insert(i, c21399218oo.LIZIZ + c21399218oo.LIZ);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before: ");
        sbLIZ.append(i2);
        sbLIZ.append(", count: ");
        sbLIZ.append(i3);
        sbLIZ.append(", mIsChangeFromLynx: ");
        sbLIZ.append(this.LLILLL.LLJJJJJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i2 > i3) {
            LocalServiceTextAreaNew localServiceTextAreaNew = this.LLILLL;
            if (!localServiceTextAreaNew.LLJJJJJIL) {
                LocalServiceTextAreaNew.LJJJJL(localServiceTextAreaNew, "delete");
            }
        }
        LocalServiceTextAreaNew localServiceTextAreaNew2 = this.LLILLL;
        if ((localServiceTextAreaNew2.LLLIIII & 1) == 1 && localServiceTextAreaNew2.LLLIIIL && !localServiceTextAreaNew2.LLJJJJJIL && i2 == 0 && i3 == 1 && !TextUtils.isEmpty(charSequence) && charSequence != null && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '#')) {
            LocalServiceTextAreaNew localServiceTextAreaNew3 = this.LLILLL;
            localServiceTextAreaNew3.mContext.LLIZ.LIZIZ(new C1289960jfm(localServiceTextAreaNew3.getSign(), "mention"));
        }
        LocalServiceTextAreaNew localServiceTextAreaNew4 = this.LLILLL;
        if (!localServiceTextAreaNew4.LLJJIJIIJIL && localServiceTextAreaNew4.LLJJJJJIL) {
            localServiceTextAreaNew4.LLJJJJJIL = false;
        }
    }
}
