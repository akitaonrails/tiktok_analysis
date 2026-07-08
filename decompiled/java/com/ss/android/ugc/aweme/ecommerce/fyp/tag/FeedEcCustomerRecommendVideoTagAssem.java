package com.ss.android.ugc.aweme.ecommerce.fyp.tag;

import X.C0RF0;
import X.C1308910kAL;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.ECommerce;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.TTECContentTag;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedEcCustomerRecommendVideoTagAssem extends DynamicComponent<FeedEcCustomerRecommendVideoTagAssem> {
    public TuxTag LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.c74;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        ECommerce ecommerce;
        TTECContentTag tTECContentTag;
        TuxTag tuxTag = this.LLJZIJLIL;
        if (tuxTag != null) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (ecommerce = standardBusinessModel.getEcommerce()) != null && (tTECContentTag = ecommerce.ttecContentTag) != null) {
                str = tTECContentTag.recommendationTagConsumerStr;
            } else {
                str = null;
            }
            tuxTag.setText(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        super.onViewCreated(view);
        TuxTag tuxTag = (TuxTag) view.findViewById(R.id.zt1);
        this.LLJZIJLIL = tuxTag;
        if (tuxTag != null) {
            tuxTag.setMaxWidth(Integer.MAX_VALUE);
        }
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZIZ(this.LLJZIJLIL);
            TuxTag tuxTag2 = this.LLJZIJLIL;
            if (tuxTag2 != null) {
                tuxTag2.setTagSize(2);
            }
            TuxTag tuxTag3 = this.LLJZIJLIL;
            if (tuxTag3 != null && (context2 = tuxTag3.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ds, context2)) != null) {
                int iIntValue = numLIZJ2.intValue();
                TuxTag tuxTag4 = this.LLJZIJLIL;
                if (tuxTag4 != null) {
                    tuxTag4.setTagBackgroundColor(iIntValue);
                }
            }
            TuxTag tuxTag5 = this.LLJZIJLIL;
            if (tuxTag5 != null && (context = tuxTag5.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ej, context)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                TuxTag tuxTag6 = this.LLJZIJLIL;
                if (tuxTag6 != null) {
                    tuxTag6.setTagTextColor(iIntValue2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
