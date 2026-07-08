package com.ss.android.ugc.aweme.series.innerfeed.fragment;

import X.C01GW;
import X.C0RRR;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C452501pT;
import X.InterfaceC1577520r9a;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.minidrama.common.component.eventlog.staytime.DramaStayTimeComponent;
import com.ss.android.ugc.aweme.minidrama.common.component.tab.SeriesHomeTabStayTimeComponent;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS108S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedFragment extends DetailFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2slJyE2OiHELIOSMpLCt9LjctLiI2JjFiGiohISA/ACE9LTcKLCo3DjctLiI2JjE=";
    public SeriesHomeTabStayTimeComponent LLJJLIIIJLLLLLLLZ;
    public DramaStayTimeComponent LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(310));

    public final String getSeriesEnterEntrance() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("series_enter_entrance") : null;
        boolean z = false;
        if (string != null && string.length() != 0) {
            return string;
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("enter_from") : null;
        Bundle arguments3 = getArguments();
        boolean z2 = arguments3 != null && arguments3.getBoolean("is_from_anchor");
        Bundle arguments4 = getArguments();
        boolean z3 = arguments4 != null && arguments4.getBoolean("is_from_bottom_banner");
        Bundle arguments5 = getArguments();
        if (arguments5 != null && arguments5.getBoolean("is_ads")) {
            z = true;
        }
        Bundle arguments6 = getArguments();
        Boolean boolValueOf = arguments6 != null ? Boolean.valueOf(arguments6.getBoolean("is_from_hot_zone")) : null;
        Bundle arguments7 = getArguments();
        Boolean boolValueOf2 = arguments7 != null ? Boolean.valueOf(arguments7.getBoolean("is_from_drama_component")) : null;
        Bundle arguments8 = getArguments();
        String string3 = arguments8 != null ? arguments8.getString("source_card") : null;
        ISeriesCommonETService iSeriesCommonETService = (ISeriesCommonETService) this.LLJLIL.getValue();
        if (string2 == null) {
            string2 = "";
        }
        return iSeriesCommonETService.getSeriesEnterEntrance(string2, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z), boolValueOf, boolValueOf2, string3);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment
    public final Class<? extends CommonPageFragment> PR() {
        return SeriesInnerFeedDetailPageFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/series/innerfeed/fragment/SeriesInnerFeedFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wqRMbbsU21Za8g7u6W0fZx3SQFpBQst+9mRR7kB+qyzNfuxuiJl9huVU8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        SeriesHomeTabStayTimeComponent seriesHomeTabStayTimeComponent = this.LLJJLIIIJLLLLLLLZ;
        if (seriesHomeTabStayTimeComponent != null) {
            seriesHomeTabStayTimeComponent.LLJI = z;
            if (z) {
                seriesHomeTabStayTimeComponent.LLJ = System.currentTimeMillis();
            } else {
                seriesHomeTabStayTimeComponent.LIZ();
            }
        }
        DramaStayTimeComponent dramaStayTimeComponent = this.LLJL;
        if (dramaStayTimeComponent != null) {
            dramaStayTimeComponent.LLIZLLLIL = z;
            if (z) {
                dramaStayTimeComponent.LLIZ = System.currentTimeMillis();
            } else {
                dramaStayTimeComponent.LIZ();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SeriesInnerFeedFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String strLJIILJJIL;
        String string2;
        String string3;
        String string4;
        String string5;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        String string6 = null;
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL();
        } else {
            strLJIILJJIL = null;
        }
        String seriesEnterEntrance = getSeriesEnterEntrance();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enter_from");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("source_series_card_type");
        } else {
            string3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("source_video_id");
        } else {
            string4 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string5 = arguments5.getString("source_series_card_id");
        } else {
            string5 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = new SeriesHomeTabStayTimeComponent(this, strLJIILJJIL, "innerfeed", seriesEnterEntrance, string2, string3, string4, string5);
        String seriesEnterEntrance2 = getSeriesEnterEntrance();
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            string6 = arguments6.getString("event_tracking");
        }
        this.LLJL = new DramaStayTimeComponent(this, string, seriesEnterEntrance2, string6, new AwS108S1000000_24(string, 1));
    }
}
