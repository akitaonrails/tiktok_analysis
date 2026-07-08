package com.ss.android.ugc.aweme.autocaption.refactor;

import X.C13LE;
import X.C20702915zn;
import X.C2217381BqS;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS319S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CLACaptionDebugAssemV2 extends BaseCellSlotComponent<CLACaptionDebugAssemV2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C20702915zn LLJLLIL = new C20702915zn(this);
    public View LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CLACaptionDebugAssemV2.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/autocaption/refactor/CLACaptionViewModelV2;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ad9;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(this, LLJZ[0]), new C2217381BqS() { // from class: X.15zr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C160C) obj).LLILLL;
            }
        }, null, AFwS319S0000000_31.get$arr$(4), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
