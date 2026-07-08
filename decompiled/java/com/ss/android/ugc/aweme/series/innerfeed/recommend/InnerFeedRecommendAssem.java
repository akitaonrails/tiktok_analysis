package com.ss.android.ugc.aweme.series.innerfeed.recommend;

import X.C1308910kAL;
import X.C1389890mGx;
import X.C1611550s2T;
import X.C2097608Jq;
import X.C687700QyG;
import X.C718180SFc;
import X.C718550SGn;
import X.InterfaceC1146704e9;
import X.InterfaceC1613530s5f;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.ad.DetailFeedFragmentScope;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InnerFeedRecommendAssem extends UISlotAssem implements InterfaceC1613530s5f, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final InnerFeedRecommendAssem LLJJI = this;
    public boolean LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bo1;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailFeedFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailFeedFragmentScope.class}).unbindAbility(this.LLJJI, InterfaceC1613530s5f.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        float dimension;
        Integer numLIZJ;
        Resources resources;
        super.onViewCreated(view);
        view.findViewById(R.id.g9l);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.g9m);
        View viewFindViewById = view.findViewById(R.id.g9k);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context = viewFindViewById.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                dimension = resources.getDimension(R.dimen.b4);
            } else {
                dimension = 0.0f;
            }
            gradientDrawable.setCornerRadius(dimension);
            Context context2 = viewFindViewById.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zg, context2)) != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            viewFindViewById.setBackground(gradientDrawable);
        } else {
            viewFindViewById = null;
        }
        this.LLJJIJIIJIL = viewFindViewById;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailFeedFragmentScope.class}).bindAbility(this.LLJJI, InterfaceC1613530s5f.class);
    }

    @Override // X.InterfaceC1613530s5f
    public final void og(long j, int i) {
        if ((((long) i) - j) / 1000 <= 3) {
            String string = LJJIJL().getResources().getString(2131839408);
            if (!this.LLJJIII) {
                this.LLJJIII = true;
                C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static void hp(Aweme aweme, String str, boolean z) {
        String str2;
        String str3;
        Long lValueOf;
        Long lValueOf2;
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null && paidContentInfo.isLimitedFreeShortDrama()) {
            str2 = "limited_free_series";
        } else {
            str2 = "paid_series";
        }
        if (z) {
            str3 = "recommend_drama_component_show";
        } else {
            str3 = "recommend_drama_component_click";
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("enter_from", str);
            pairArr[1] = new Pair("series_feed_type", C718180SFc.LIZLLL(aweme, str));
            PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
            String seriesVideoType = null;
            if (paidContentInfo2 != null) {
                lValueOf = Long.valueOf(paidContentInfo2.getPaidCollectionId());
            } else {
                lValueOf = null;
            }
            pairArr[2] = new Pair("series_collection_id", String.valueOf(lValueOf));
            pairArr[3] = new Pair("series_state", str2);
            PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
            if (paidContentInfo3 != null) {
                lValueOf2 = Long.valueOf(paidContentInfo3.getCategory());
            } else {
                lValueOf2 = null;
            }
            pairArr[4] = new Pair("series_category", String.valueOf(lValueOf2));
            ISeriesCommonETService.LIZ.getClass();
            ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
            if (iSeriesCommonETServiceLIZ != null) {
                seriesVideoType = iSeriesCommonETServiceLIZ.getSeriesVideoType(aweme);
            }
            pairArr[5] = new Pair("series_video_type", seriesVideoType);
            miniDramaETInjectServiceLIZ.onEventV3(str3, C2097608Jq.LJIIIIZZ(pairArr));
        }
    }
}
