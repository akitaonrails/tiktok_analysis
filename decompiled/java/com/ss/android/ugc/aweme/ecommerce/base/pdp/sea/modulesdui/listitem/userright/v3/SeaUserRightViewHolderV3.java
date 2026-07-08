package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3;

import X.C01GW;
import X.C1005503wT;
import X.C1006103wZ;
import X.C10515049h;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C452501pT;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpBtm;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS71S1300000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaUserRightViewHolderV3 extends AbsFullSpanVH<SeaProductSelectUserRightVOV3> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SeaUserRightViewHolderV3(Context context) {
        super(new C1006103wZ(context, null));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 80));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1006103wZ c1006103wZ;
        SeaProductSelectUserRightVOV3 seaProductSelectUserRightVOV3 = (SeaProductSelectUserRightVOV3) obj;
        View view = this.itemView;
        if ((view instanceof C1006103wZ) && (c1006103wZ = (C1006103wZ) view) != null) {
            C1005503wT c1005503wT = C1005503wT.LIZ;
            SeaPdpBtm seaPdpBtm = seaProductSelectUserRightVOV3.btm;
            c1005503wT.getClass();
            String strLIZ = C1005503wT.LIZ(seaPdpBtm);
            PageFinder pageFinderVia = PageFinder.via(this.itemView);
            c1006103wZ.setUserRight(seaProductSelectUserRightVOV3);
            c1006103wZ.setUserRightModuleClickListener$ecommerce_transaction_release(new AwS71S1300000_1(pageFinderVia, seaProductSelectUserRightVOV3, this, strLIZ, 2));
            c1006103wZ.setUserRightSlideListener$ecommerce_transaction_release(new AwS43S1300000_1(pageFinderVia, seaProductSelectUserRightVOV3, this, strLIZ, 14));
            C1748720vbi.LJI(this.itemView, new C10515049h(), new AwS545S0100000_1(seaProductSelectUserRightVOV3, 1538), strLIZ, pageFinderVia, new AwS367S0200000_1(this, seaProductSelectUserRightVOV3, 206));
        }
    }
}
