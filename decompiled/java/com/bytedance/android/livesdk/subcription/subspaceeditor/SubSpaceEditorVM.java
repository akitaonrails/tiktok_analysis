package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.C0IQ2;
import X.C0JC4;
import X.C0JCM;
import X.C0JCN;
import X.C0JCS;
import X.C1554960qZC;
import X.C521840KdK;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import android.text.Editable;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceEditorVM extends AssemViewModel<C0JC4> {
    public C0JCN LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0JCM LLILLL;
    public C0IQ2 LLILZ;
    public int LLILZIL = -1;
    public final C521840KdK LLILZLL = new C521840KdK(this, 2);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JC4(0);
    }

    public final void vQ2() {
        setState(AFwS237S0000000_7.get$arr$(46));
        setState(AFwS237S0000000_7.get$arr$(47));
        setState(AFwS237S0000000_7.get$arr$(48));
    }

    public final C0JCM wQ2() {
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JCM.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C0JCM) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    public final void xQ2(Editable editable) {
        List<AtWithIndex> list;
        List<AtWithIndex> list2;
        List<AtWithIndex> list3;
        List<AtWithIndex> list4 = null;
        if (editable == null) {
            C0JCM c0jcmWQ2 = wQ2();
            if (c0jcmWQ2 != null) {
                c0jcmWQ2.LL = null;
            }
            C0JCM c0jcmWQ22 = wQ2();
            if (c0jcmWQ22 != null && (list3 = c0jcmWQ22.LLILLL) != null) {
                ((ArrayList) list3).clear();
            }
        } else {
            C0JCS[] c0jcsArr = (C0JCS[]) editable.getSpans(0, editable.length(), C0JCS.class);
            C0JCM c0jcmWQ23 = wQ2();
            if (c0jcmWQ23 != null) {
                c0jcmWQ23.LL = editable.toString();
            }
            C0JCM c0jcmWQ24 = wQ2();
            if (c0jcmWQ24 != null && (list2 = c0jcmWQ24.LLILLL) != null) {
                ((ArrayList) list2).clear();
            }
            if (c0jcsArr != null) {
                for (C0JCS c0jcs : c0jcsArr) {
                    AtWithIndex atWithIndex = new AtWithIndex();
                    atWithIndex.userId = c0jcs.LIZ.getId();
                    atWithIndex.startIndex = editable.getSpanStart(c0jcs);
                    atWithIndex.endIndex = editable.getSpanEnd(c0jcs);
                    C0JCM c0jcmWQ25 = wQ2();
                    if (c0jcmWQ25 != null && (list = c0jcmWQ25.LLILLL) != null) {
                        ((ArrayList) list).add(atWithIndex);
                    }
                }
            }
        }
        C0JCM c0jcmWQ26 = wQ2();
        if (c0jcmWQ26 != null) {
            list4 = c0jcmWQ26.LLILLL;
        }
        C0JCN c0jcn = this.LL;
        if (c0jcn != null) {
            c0jcn.Ga(editable, list4);
        }
    }
}
