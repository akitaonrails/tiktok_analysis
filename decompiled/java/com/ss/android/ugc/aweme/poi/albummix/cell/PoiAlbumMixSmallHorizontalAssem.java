package com.ss.android.ugc.aweme.poi.albummix.cell;

import X.C1183810guZ;
import X.C2211631BhB;
import X.C339190DRl;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixSmallHorizontalAssem extends BasePoiAlbumMixCardAssem<PoiAlbumMixSmallHorizontalAssem> {
    public SmartImageView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public View LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dyg;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.ld7);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.tv_topic_tag);
        this.LLJLLIL = view.findViewById(R.id.ffk);
        C2211631BhB.LJ(view, new AwS597S0100000_18(this, 236));
        C786410Ut5.I7(new AbS699S0100000_18(this, 15, 42), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1183810guZ c1183810guZ) {
        PoiListApi.PoiMergedListItem poiMergedListItem = c1183810guZ.LLILLJJLI;
        sp(this.LLJLILLLLZIIL, poiMergedListItem.getCropAwemeCover());
        String awemeTopicTag = poiMergedListItem.getAwemeTopicTag();
        if (awemeTopicTag != null && !a0.LJJJIL(awemeTopicTag)) {
            TuxTextView tuxTextView = this.LLJLL;
            if (tuxTextView != null) {
                C339190DRl.LIZLLL(tuxTextView);
            }
            View view = this.LLJLLIL;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(awemeTopicTag);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            C339190DRl.LIZIZ(tuxTextView3);
        }
        View view2 = this.LLJLLIL;
        if (view2 == null) {
            return;
        }
        C339190DRl.LIZIZ(view2);
    }
}
