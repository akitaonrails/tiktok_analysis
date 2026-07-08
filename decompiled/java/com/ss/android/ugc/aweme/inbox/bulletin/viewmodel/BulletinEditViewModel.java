package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C09R9;
import X.C0OKS;
import X.C0ONX;
import X.C0OOF;
import X.C0OPX;
import X.C0OVR;
import X.C0OVT;
import X.C0PEM;
import X.C13LE;
import X.C2188811AlT;
import X.C23250099c;
import X.C620540OVo;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEditViewModel extends AssemViewModel<C620540OVo> {
    public String LLILLL;
    public boolean LLILZ;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public C0OOF LLJ;
    public String LLJI;
    public volatile boolean LLJIJIL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public String LLILLJJLI = "";
    public final Map<String, String> LLILZIL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C620540OVo(0);
    }

    public final String wQ2() {
        Pair<String, Long> pairLLZILL = ((C0OKS) this.LL.getValue().getOperator()).LLZILL(this.LLILZLL);
        String first = pairLLZILL != null ? pairLLZILL.getFirst() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTextDraft() - bulletinId = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", draft = ");
        sbLIZ.append(first);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = first;
        this.LLILLJJLI = first == null ? "" : first;
        return first;
    }

    public final void vQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearTextDraft() - bulletinId = ");
        sbLIZ.append(this.LLILZLL);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        String str = this.LLILZLL;
        if (str == null) {
            return;
        }
        this.LLILLJJLI = "";
        this.LLILLL = "";
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0OVR(this, str, null), 2);
        this.LLJI = null;
    }

    public final void zQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveText() - bulletinId = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", nowText = ");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS588S0100000_9(this, 204));
    }

    public final void AQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPublishState() - bulletinId = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", canPublish = ");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS24S0010000_9(z, 3));
    }

    public final void xQ2(C0OVT c0ovt) {
        ((LinkedHashMap) this.LLILZIL).clear();
        String str = c0ovt.LIZJ;
        if (str != null && (!a0.LJJJIL(str))) {
            this.LLILZIL.put("enter_method", str);
        }
        String str2 = c0ovt.LIZLLL;
        if (str2 != null && (!a0.LJJJIL(str2))) {
            this.LLILZIL.put("interactive_method", str2);
        }
        String str3 = c0ovt.LJ;
        if (str3 != null && (!a0.LJJJIL(str3))) {
            this.LLILZIL.put("template_type", str3);
        }
        String str4 = c0ovt.LJII;
        if (str4 != null && (!a0.LJJJIL(str4))) {
            this.LLILZIL.put("task_id", str4);
        }
        String str5 = c0ovt.LJIIIIZZ;
        if (str5 != null && (!a0.LJJJIL(str5))) {
            this.LLILZIL.put("unique_key", str5);
        }
    }

    public final void yQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFocus() - bulletinId = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", keyboardVisibility = ");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS24S0010000_9(z, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(java.lang.String r7, java.lang.String r8, kotlin.Pair<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "storeTextDraft() - bulletinId = "
            r1.append(r0)
            java.lang.String r0 = r6.LLILZLL
            r1.append(r0)
            java.lang.String r0 = ", nowText = "
            r1.append(r0)
            java.lang.String r0 = r6.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            boolean r0 = X.C296830BkH.LIZ()
            if (r0 != 0) goto L3c
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.LLILZIL
            java.lang.String r0 = "enter_method"
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            X.0OO9 r0 = X.C0OO9.WRITE_BUTTON
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L3c
            return
        L3c:
            java.lang.String r5 = r6.LLILZLL
            if (r5 != 0) goto L41
            return
        L41:
            java.lang.String r1 = r6.LLILLL
            java.lang.String r0 = r6.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            return
        L4c:
            r1 = 0
            if (r7 == 0) goto L56
            int r0 = r7.length()
            if (r0 <= 0) goto L56
            r1 = 1
        L56:
            r4 = 0
            if (r1 != 0) goto L72
            if (r9 == 0) goto L70
            java.lang.Object r0 = r9.getSecond()
        L5f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L72
            java.lang.String r7 = r6.LLILLL
        L67:
            java.lang.String r0 = r6.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L77
            return
        L70:
            r0 = r4
            goto L5f
        L72:
            if (r7 != 0) goto L67
            java.lang.String r7 = ""
            goto L67
        L77:
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.09AM r1 = X.C09AM.LL
            X.1DFB r0 = X.C0PEM.LIZJ
            kotlin.coroutines.CoroutineContext r2 = r1.plus(r0)
            X.0OVS r1 = new X.0OVS
            r1.<init>(r6, r5, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel.BQ2(java.lang.String, java.lang.String, kotlin.Pair):void");
    }
}
