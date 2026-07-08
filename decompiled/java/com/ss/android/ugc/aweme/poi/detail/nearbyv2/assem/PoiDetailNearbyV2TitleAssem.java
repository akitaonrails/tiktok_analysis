package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2TitleAssem extends ReusedUIContentAssem<PoiDetailNearbyV2TitleAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public TuxTextView LLJJJJ;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.r0y);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        PoiNearbyV2Model poiNearbyV2Model2 = poiNearbyV2Model;
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(poiNearbyV2Model2.getTitle());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiNearbyV2Model poiNearbyV2Model) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiNearbyV2Model poiNearbyV2Model) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
