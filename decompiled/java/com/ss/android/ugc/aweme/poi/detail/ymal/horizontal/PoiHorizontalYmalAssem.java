package com.ss.android.ugc.aweme.poi.detail.ymal.horizontal;

import X.C1173340gdg;
import X.C1767006w0;
import X.C20600815jK;
import X.C2211631BhB;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS45S0100000_18;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiDetailYmalModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHorizontalYmalAssem extends PoiDetailBaseAssem<PoiDetailYmalModule> {
    public TuxTextView LLJJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public PoiDetailYmalModule LLJL;
    public int LLJLIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e34;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) baseComponentData;
        super.CG1(poiDetailYmalModule);
        this.LLJL = poiDetailYmalModule;
        List<C1173340gdg> horizontalYmalCards = poiDetailYmalModule.toHorizontalYmalCards();
        if (horizontalYmalCards != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(horizontalYmalCards, null);
        }
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            tuxTextView.setText(poiDetailYmalModule.getTitle());
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.tv_title);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(HorizontalYmalCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1767006w0(this, 0));
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS45S0100000_18(this, 1));
        }
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 16));
    }
}
