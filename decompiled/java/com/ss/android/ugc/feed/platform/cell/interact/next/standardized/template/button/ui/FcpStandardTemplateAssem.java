package com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui;

import X.AbstractC705030Rl7;
import X.C01GW;
import X.C0S4A;
import X.C0S4B;
import X.C2188811AlT;
import X.C299640Boo;
import X.C452501pT;
import X.C704830Rkn;
import X.C704850Rkp;
import X.C704910Rkv;
import X.C705060RlA;
import X.C705340Rlc;
import X.C705590Rm1;
import X.InterfaceC705050Rl9;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStandardTemplateAssem extends BaseCellSlotComponent<FcpStandardTemplateAssem> implements C0S4B {
    public final C704830Rkn LLJLLIL;
    public AbstractC705030Rl7<?> LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1284));

    @Override // X.C0S4B
    public final View U7() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        FcpUiTemplate fcpUiTemplate = this.LLJLIL.LLILZLL;
        String strLIZ = C704850Rkp.LIZ(fcpUiTemplate != null ? fcpUiTemplate.type : null);
        if (strLIZ == null) {
            return R.layout.b6l;
        }
        switch (strLIZ.hashCode()) {
            case -1932888972:
                return strLIZ.equals("Tip_Card") ? R.layout.b6k : R.layout.b6l;
            case -318407835:
                return strLIZ.equals("Plain_Tag") ? R.layout.b6j : R.layout.b6l;
            case 1398592391:
                return strLIZ.equals("Plain_Button") ? R.layout.b6i : R.layout.b6l;
            case 1590607796:
                return strLIZ.equals("Avatar_Tag") ? R.layout.b6g : R.layout.b6l;
            case 1890417979:
                return strLIZ.equals("Plain_Bottom_Tag") ? R.layout.b6h : R.layout.b6l;
            default:
                return R.layout.b6l;
        }
    }

    @Override // X.C0S4B
    public final C705590Rm1 j8() {
        T t;
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        return new C705590Rm1((abstractC705030Rl7 == null || (t = abstractC705030Rl7.LJIIL) == 0 || !t.LIZLLL()) ? "INVALID_DEFAULT" : "INVALID_DATA", null);
    }

    @Override // X.C0S4B
    public final C0S4A x1() {
        C705060RlA c705060RlALIZLLL;
        T t;
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        if (abstractC705030Rl7 == null || (t = abstractC705030Rl7.LJIIL) == 0 || t.LIZLLL()) {
            AbstractC705030Rl7<?> abstractC705030Rl72 = this.LLJLLL;
            if (!Intrinsics.LJFF((abstractC705030Rl72 == null || (c705060RlALIZLLL = abstractC705030Rl72.LIZLLL()) == null) ? null : c705060RlALIZLLL.LIZ, "showing")) {
                return C0S4A.VALID;
            }
        }
        return C0S4A.INVALID;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C704910Rkv c704910RkvLIZJ;
        if ((C299640Boo.LIZ() || this.LLJLIL.LLILZLL == null) && !(C299640Boo.LIZ() && this.LLILLJJLI)) {
            return;
        }
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        if (Intrinsics.LJFF((abstractC705030Rl7 == null || (c704910RkvLIZJ = abstractC705030Rl7.LIZJ()) == null) ? null : c704910RkvLIZJ.LIZ, "active")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("component key: ");
            sbLIZ.append(this.LLJLIL.LLILLL);
            sbLIZ.append(", onHolderUnSelected invoked");
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC705030Rl7<?> abstractC705030Rl72 = this.LLJLLL;
            if (abstractC705030Rl72 != null) {
                abstractC705030Rl72.LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJLIL.LLILLL);
        sbLIZ.append(", onActive invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        if (abstractC705030Rl7 != null) {
            abstractC705030Rl7.LIZJ().LIZ = "active";
            abstractC705030Rl7.LJIILLIIL();
        }
        super.mo();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJLIL.LLILLL);
        sbLIZ.append(", onInActive invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        if (abstractC705030Rl7 != null) {
            abstractC705030Rl7.LIZJ().LIZ = "inactive";
            InterfaceC705050Rl9.LIZ.getClass();
            C705340Rlc c705340Rlc = abstractC705030Rl7.LJIILIIL;
            if (c705340Rlc != null) {
                c705340Rlc.LIZ("exposure_action");
            }
            C705340Rlc c705340Rlc2 = abstractC705030Rl7.LJIILIIL;
            if (c705340Rlc2 != null) {
                c705340Rlc2.LIZIZ("exposure_over_action");
            }
            abstractC705030Rl7.LIZ("inactive");
        }
        super.oo();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component key: ");
        sbLIZ.append(this.LLJLIL.LLILLL);
        sbLIZ.append(", unBind invoked");
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLIL.LLILZLL = null;
        AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
        if (abstractC705030Rl7 != null) {
            abstractC705030Rl7.LJIILIIL();
        }
    }

    public FcpStandardTemplateAssem(C704830Rkn c704830Rkn) {
        this.LLJLLIL = c704830Rkn;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        String str;
        C704910Rkv c704910RkvLIZJ;
        if ((!C299640Boo.LIZ() && this.LLJLIL.LLILZLL != null) || (C299640Boo.LIZ() && this.LLILLJJLI)) {
            AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
            if (abstractC705030Rl7 != null && (c704910RkvLIZJ = abstractC705030Rl7.LIZJ()) != null) {
                str = c704910RkvLIZJ.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "active")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LLJLIL.LLILLL);
                sbLIZ.append(", onHolderResume invoked");
                C2188811AlT.LIZIZ(sbLIZ);
                AbstractC705030Rl7<?> abstractC705030Rl72 = this.LLJLLL;
                if (abstractC705030Rl72 != null) {
                    abstractC705030Rl72.LJIIJ();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!C299640Boo.LIZ()) {
            super.onViewCreated(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (!C299640Boo.LIZ()) {
            if (this.LLJLIL.LLILZLL != null) {
                return true;
            }
            return false;
        }
        return super.ur(videoItemParams);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r22) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.button.ui.FcpStandardTemplateAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String str;
        C704910Rkv c704910RkvLIZJ;
        if ((!C299640Boo.LIZ() && this.LLJLIL.LLILZLL != null) || (C299640Boo.LIZ() && this.LLILLJJLI)) {
            AbstractC705030Rl7<?> abstractC705030Rl7 = this.LLJLLL;
            if (abstractC705030Rl7 != null && (c704910RkvLIZJ = abstractC705030Rl7.LIZJ()) != null) {
                str = c704910RkvLIZJ.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "active")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component key: ");
                sbLIZ.append(this.LLJLIL.LLILLL);
                sbLIZ.append(", onHolderSelected invoked");
                C2188811AlT.LIZIZ(sbLIZ);
                AbstractC705030Rl7<?> abstractC705030Rl72 = this.LLJLLL;
                if (abstractC705030Rl72 != null) {
                    abstractC705030Rl72.LJIIJ();
                }
            }
        }
    }
}
