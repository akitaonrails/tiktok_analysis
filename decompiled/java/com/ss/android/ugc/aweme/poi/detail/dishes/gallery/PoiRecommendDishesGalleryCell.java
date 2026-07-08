package com.ss.android.ugc.aweme.poi.detail.dishes.gallery;

import X.C1182540gsW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19HL;
import X.InterfaceC1182630gsf;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public class PoiRecommendDishesGalleryCell extends AssemPowerCell<PoiRecommendDishesGalleryAssem, C1182540gsW> implements InterfaceC20631915oL, InterfaceC1182630gsf {
    public C19HL LLIZ;
    public View LLIZLLLIL;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e3z;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiRecommendDishesGalleryAssem();
    }

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        InterfaceC1182630gsf interfaceC1182630gsf = (InterfaceC1182630gsf) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiRecommendDishesGalleryAbility.class, null);
        if (interfaceC1182630gsf != null) {
            interfaceC1182630gsf.Yx();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C19HL c19hl = (C19HL) this.itemView.findViewById(R.id.r2o);
        this.LLIZ = c19hl;
        if (c19hl != null) {
            c19hl.setOnDragOuterWidgetsChangeListener(this);
        }
        C19HL c19hl2 = this.LLIZ;
        if (c19hl2 != null) {
            c19hl2.setDragThreshold(Integer.MAX_VALUE);
        }
        this.LLIZLLLIL = this.itemView.findViewById(R.id.fx4);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiRecommendDishesGalleryAbility.class, null);
        if (poiRecommendDishesGalleryAbility != null) {
            poiRecommendDishesGalleryAbility.Ui2(i, this.LLIZ, this.LLIZLLLIL);
        }
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
        InterfaceC1182630gsf interfaceC1182630gsf = (InterfaceC1182630gsf) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), PoiRecommendDishesGalleryAbility.class, null);
        if (interfaceC1182630gsf != null) {
            interfaceC1182630gsf.yt(f);
        }
    }
}
