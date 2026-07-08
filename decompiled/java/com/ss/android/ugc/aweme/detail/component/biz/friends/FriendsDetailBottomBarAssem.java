package com.ss.android.ugc.aweme.detail.component.biz.friends;

import X.C01GW;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C339190DRl;
import X.C452501pT;
import X.C723850SaN;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailBottomBarAssem extends UISlotAssem implements IDetailBottomProtocol {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 115));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bkn;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
        C339190DRl.LIZIZ((View) this.LLJJI.getValue());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, this);
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C723850SaN.LIZLLL(this, new AwS590S0100000_11(this, 61));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        return (View) this.LLJJI.getValue();
    }
}
