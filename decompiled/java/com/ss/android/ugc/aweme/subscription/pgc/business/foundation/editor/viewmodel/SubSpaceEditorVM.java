package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0JC5;
import X.C0JCG;
import X.C0JCO;
import X.C0JCP;
import X.C0JCT;
import X.C13BV;
import X.C1554960qZC;
import X.C1BNE;
import X.C2252321DDq;
import X.C456340Huy;
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
public final class SubSpaceEditorVM extends AssemViewModel<C0JC5> {
    public C0JCO LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0JCP LLILLL;
    public C0JCG LLILZ;
    public int LLILZIL = -1;
    public final C456340Huy LLILZLL = new C456340Huy();
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final C521840KdK LLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JC5(0);
    }

    public final void vQ2() {
        setState(AFwS237S0000000_7.get$arr$(196));
        setState(AFwS237S0000000_7.get$arr$(197));
        setState(AFwS237S0000000_7.get$arr$(198));
    }

    public final C0JCP wQ2() {
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JCP.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C0JCP) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    public SubSpaceEditorVM() {
        C13BV c13bv = C13BV.INSTANCE;
        C09IC.LIZIZ(C1BNE.LIZ(c13bv));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c13bv);
        this.LLIZ = c2252321DDqLIZ;
        this.LLIZLLLIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C09IC.LIZIZ(C1BNE.LIZ(Boolean.FALSE));
        this.LLJ = new C521840KdK(this, 4);
    }

    public final void xQ2(Editable editable) {
        List<AtWithIndex> list;
        List<AtWithIndex> list2;
        List<AtWithIndex> list3;
        List<AtWithIndex> list4 = null;
        if (editable == null) {
            C0JCP c0jcpWQ2 = wQ2();
            if (c0jcpWQ2 != null) {
                c0jcpWQ2.LL = null;
            }
            C0JCP c0jcpWQ22 = wQ2();
            if (c0jcpWQ22 != null && (list3 = c0jcpWQ22.LLILLL) != null) {
                ((ArrayList) list3).clear();
            }
        } else {
            C0JCT[] c0jctArr = (C0JCT[]) editable.getSpans(0, editable.length(), C0JCT.class);
            C0JCP c0jcpWQ23 = wQ2();
            if (c0jcpWQ23 != null) {
                c0jcpWQ23.LL = editable.toString();
            }
            C0JCP c0jcpWQ24 = wQ2();
            if (c0jcpWQ24 != null && (list2 = c0jcpWQ24.LLILLL) != null) {
                ((ArrayList) list2).clear();
            }
            if (c0jctArr != null) {
                for (C0JCT c0jct : c0jctArr) {
                    AtWithIndex atWithIndex = new AtWithIndex();
                    atWithIndex.userId = c0jct.LIZ.getId();
                    atWithIndex.startIndex = editable.getSpanStart(c0jct);
                    atWithIndex.endIndex = editable.getSpanEnd(c0jct);
                    C0JCP c0jcpWQ25 = wQ2();
                    if (c0jcpWQ25 != null && (list = c0jcpWQ25.LLILLL) != null) {
                        ((ArrayList) list).add(atWithIndex);
                    }
                }
            }
        }
        C0JCP c0jcpWQ26 = wQ2();
        if (c0jcpWQ26 != null) {
            list4 = c0jcpWQ26.LLILLL;
        }
        C0JCO c0jco = this.LL;
        if (c0jco != null) {
            c0jco.Ga(editable, list4);
        }
    }
}
