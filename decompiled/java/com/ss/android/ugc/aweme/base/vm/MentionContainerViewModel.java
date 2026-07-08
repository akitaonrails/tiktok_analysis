package com.ss.android.ugc.aweme.base.vm;

import X.C20611315l1;
import X.C20611815l6;
import X.C20611915l7;
import X.C20612215lA;
import X.C20612815lG;
import X.C2097608Jq;
import X.C316530Cax;
import X.C897520ZIw;
import X.InterfaceC0148002o;
import X.InterfaceC20613315lL;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS23S0111000_31;
import kotlin.jvm.internal.AwS43S0001000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionContainerViewModel extends AssemViewModel<C20612215lA> {
    public C20612815lG LL;
    public C897520ZIw LLILLJJLI;
    public ActivityStatusAnalyticsCommonLifecycleOwner LLILLL;
    public String LLILZ;
    public final Map<String, C316530Cax> LLILZIL = new LinkedHashMap();
    public String LLILZLL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20612215lA(0);
    }

    public final Map<String, String> vQ2() {
        C20612815lG c20612815lG = this.LL;
        return c20612815lG != null ? c20612815lG.LIZLLL : C2097608Jq.LJ();
    }

    public final String wQ2() {
        C20612815lG c20612815lG = this.LL;
        if (c20612815lG == null || this.LLILZ != null) {
            String str = this.LLILZ;
            return str != null ? str : "";
        }
        String str2 = c20612815lG.LIZLLL.get("enter_type");
        return str2 != null ? str2 : "";
    }

    public final void yQ2(int i) {
        setState(new AwS43S0001000_31(i, 0));
    }

    public final void xQ2(C20611915l7 c20611915l7, int i, boolean z) {
        if (this.LL == null) {
            return;
        }
        if (!c20611915l7.LJIIJ) {
            setState(AFwS276S0000000_31.get$arr$(53));
            return;
        }
        setStateImmediate(new AwS23S0111000_31(c20611915l7, i, z, 0));
        C20612815lG c20612815lG = null;
        if (z) {
            C20612815lG c20612815lG2 = this.LL;
            if (c20612815lG2 != null) {
                c20612815lG = c20612815lG2;
            }
            InterfaceC20613315lL interfaceC20613315lL = c20612815lG.LJII;
            if (interfaceC20613315lL != null) {
                User userLJFF = C20611815l6.LJFF(c20611915l7);
                C20611315l1 c20611315l1 = c20611915l7.LJIIL;
                interfaceC20613315lL.Mi(userLJFF, c20611315l1.LIZJ, "", c20611315l1.LIZ, i);
                return;
            }
            return;
        }
        C20612815lG c20612815lG3 = this.LL;
        if (c20612815lG3 != null) {
            c20612815lG = c20612815lG3;
        }
        InterfaceC20613315lL interfaceC20613315lL2 = c20612815lG.LJII;
        if (interfaceC20613315lL2 == null) {
            return;
        }
        interfaceC20613315lL2.qj(C20611815l6.LJFF(c20611915l7));
    }
}
