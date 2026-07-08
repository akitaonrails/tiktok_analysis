package com.ss.android.ugc.feed.platform.cell.component.playerview;

import X.C01GW;
import X.C1558520qew;
import X.C452501pT;
import X.C690980R8m;
import X.C692910RFx;
import X.C724270Sb3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public class CellPlayerViewComponent extends BaseCellContentComponent<CellPlayerViewComponent> implements CellPlayerViewAbility, InterfaceC1554640qYg {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(254));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1059232495) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewAbility
    public final C690980R8m bI1() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Context context = getContext();
        if (context != null) {
            return new C690980R8m(context, aweme, (C692910RFx) this.LLJJJJLIIL.getValue(), AwemeExtKt.getOcrLocation(aweme), (ViewGroup) LJJIJL(), (CellAdaptionComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CellAdaptionComponentAbility.class, null));
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
