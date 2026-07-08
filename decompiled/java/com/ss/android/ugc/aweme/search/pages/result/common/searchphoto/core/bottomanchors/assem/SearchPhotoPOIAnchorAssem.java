package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.assem;

import X.C0Q3E;
import X.C0ZP4;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C659750PuH;
import X.C660810Pvz;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoPOIAnchorAssem extends ReusedUIContentAssem<SearchPhotoPOIAnchorAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJJ;
    public C659750PuH LLJJJJJIL;
    public C660810Pvz LLJJJJLIIL;
    public C0ZP4 LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchPhotoPOIAnchorAssem.class, "photoVM", "getPhotoVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchphoto/core/SearchPhotoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchPhotoPOIAnchorAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPhotoViewModel.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 517), null, AFwS241S0000000_10.get$arr$(233));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C0ZP4 c0zp4 = this.LLJJL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.udn);
        if (viewStub != null) {
            C786410Ut5.LJLLLL(viewStub);
        }
        C660810Pvz c660810Pvz = new C660810Pvz(getContext(), LJJIJL(), C0Q3E.LIZ(view));
        this.LLJJJJLIIL = c660810Pvz;
        c660810Pvz.LIZIZ(R.id.u6w, view);
        this.LLJJL = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]), new C2217381BqS() { // from class: X.0PtP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C237400vs) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(65), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C659750PuH r4) {
        /*
            r3 = this;
            X.0PuH r4 = (X.C659750PuH) r4
            r3.LLJJJJJIL = r4
            X.0PvT r1 = r4.LLILLL
            X.0Pva r0 = X.C660560Pva.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            X.0Pvz r2 = r3.LLJJJJLIIL
            if (r2 == 0) goto L28
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LL
            if (r0 == 0) goto L29
            X.0PvI r0 = X.C660380PvI.LIZ
            r0.getClass()
            boolean r0 = X.C660380PvI.LIZJ(r1)
            if (r0 == 0) goto L29
            r0 = 1
        L20:
            r2.LIZLLL(r1, r0)
            if (r0 == 0) goto L28
            X.C660810Pvz.LIZJ(r2, r1)
        L28:
            return
        L29:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.assem.SearchPhotoPOIAnchorAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
