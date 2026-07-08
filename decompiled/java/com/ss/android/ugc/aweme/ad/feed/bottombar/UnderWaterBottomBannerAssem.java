package com.ss.android.ugc.aweme.ad.feed.bottombar;

import X.C01GW;
import X.C0REX;
import X.C0RQ7;
import X.C452501pT;
import X.C637920P0k;
import X.C786410Ut5;
import X.InterfaceC1008930cMV;
import X.RunnableC514801zW;
import android.os.Looper;
import android.view.View;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.IOnHolderSelectOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class UnderWaterBottomBannerAssem extends CommerceBaseSlotComponent implements C0REX {
    public boolean LLLFF;
    public int LLLF = -1;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 53));

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    public final int Ip() {
        return R.id.ym4;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b7a;
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    public final String Gp() {
        return C0RQ7.ANOLE_INTERACTIVE_BOTTOM_BANNER_UNDER_WATER_SLOT.getSlotName();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        IOnHolderSelectOwner iOnHolderSelectOwner = (IOnHolderSelectOwner) this.LLLFFI.getValue();
        if (iOnHolderSelectOwner != null) {
            iOnHolderSelectOwner.LK2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Ep();
        super.unBind();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        Bp();
        if (this.LLLFF && this.LLLF >= 0) {
            this.LLLFF = false;
            InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
            if (interfaceC1008930cMVFp != null) {
                interfaceC1008930cMVFp.LJJIJIIJIL(this.LLLF);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    /* JADX INFO: renamed from: Jp */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        Bp();
        if (this.LLLFF && this.LLLF >= 0) {
            this.LLLFF = false;
            InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
            if (interfaceC1008930cMVFp != null) {
                interfaceC1008930cMVFp.LJJIJIIJIL(this.LLLF);
            }
        }
        View viewLJJIJL = LJJIJL();
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            C786410Ut5.LJLLLLLL(0, viewLJJIJL);
        } else {
            C637920P0k.LIZ(viewLJJIJL, new RunnableC514801zW(viewLJJIJL, 81));
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        IOnHolderSelectOwner iOnHolderSelectOwner = (IOnHolderSelectOwner) this.LLLFFI.getValue();
        if (iOnHolderSelectOwner != null) {
            iOnHolderSelectOwner.DF1(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        this.LLLF = i;
        if (!this.LLJZ) {
            this.LLLFF = true;
            return;
        }
        this.LLLFF = false;
        InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
        if (interfaceC1008930cMVFp != null) {
            interfaceC1008930cMVFp.LJJIJIIJIL(i);
        }
    }
}
