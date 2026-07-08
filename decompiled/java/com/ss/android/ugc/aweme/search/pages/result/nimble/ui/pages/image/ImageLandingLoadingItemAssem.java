package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.C01GW;
import X.C098200Yq;
import X.C0PQK;
import X.C0QC4;
import X.C0R45;
import X.C1390410mHn;
import X.C189200o6;
import X.C2217381BqS;
import X.C452501pT;
import X.C723830SaL;
import X.C724240Sb0;
import X.C736680Sv4;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchStatusViewVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageLandingLoadingItemAssem extends ReusedUISlotAssem<ImageLandingLoadingItemAssem> implements InterfaceC712990Rxx<C0QC4> {
    public View LLJL;
    public SearchStatusViewVM LLJLIL;
    public C1390410mHn LLJLILLLLZIIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 600));
    public final C0R45 LLJLL = new C0R45(this, 13);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ewv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SearchImageLandingPageVM searchImageLandingPageVMDb1;
        Unit unit;
        this.LLJLILLLLZIIL = (C1390410mHn) view.findViewById(R.id.gb7);
        this.LLJL = view.findViewById(R.id.m55);
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                this.LLJLIL = C0PQK.LIZIZ(fragmentLJI);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 159));
        IImageLandingPageAbility iImageLandingPageAbility = (IImageLandingPageAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iImageLandingPageAbility != null && (searchImageLandingPageVMDb1 = iImageLandingPageAbility.Db1()) != null) {
            C736680Sv4.LJIIIIZZ(this, searchImageLandingPageVMDb1, new C2217381BqS() { // from class: X.0QC2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C666400QBy) obj).LLILZ;
                }
            }, null, AFwS293S0000000_10.get$arr$(26), 6);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0QC4 c0qc4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C0QC4 c0qc4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0QC4 c0qc4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
