package com.ss.android.ugc.aweme.minidrama.common.component.tab;

import X.C0AMY;
import X.C1163504gr;
import X.C1577260r9A;
import X.C1612650s4F;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C718550SGn;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHomeTabStayTimeComponent implements GenericLifecycleObserver {
    public final Fragment LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public final String LLJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (this.LLJ != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJ;
            if (jCurrentTimeMillis > 100) {
                String str = C1577260r9A.LIZ;
                if (!(str == null || str.length() == 0) && ((Number) C0AMY.LIZ.getValue()).intValue() == 1) {
                    C1163504gr c1163504gr = C1163504gr.LIZIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("duration", String.valueOf(jCurrentTimeMillis));
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_series");
                    c2344009Gk.LJIIIIZZ("series_session_id", str);
                    c2344009Gk.LJIIIIZZ("series_tab_location", this.LLILLJJLI);
                    c2344009Gk.LJIIIIZZ("current_page", this.LLILLL);
                    c2344009Gk.LJIIIIZZ("series_enter_entrance", this.LLILZ);
                    c1163504gr.onEventV3("homepage_series_stay_time", c2344009Gk.LIZ);
                }
                if (Intrinsics.LJFF(this.LLILLL, "innerfeed")) {
                    C1163504gr c1163504gr2 = C1163504gr.LIZIZ;
                    C1612650s4F c1612650s4F = C1612650s4F.LIZIZ;
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    String str2 = this.LLILZIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c2344009Gk2.LJIIIIZZ("enter_from", str2);
                    c2344009Gk2.LJIIIIZZ("series_enter_entrance", this.LLILZ);
                    c2344009Gk2.LIZLLL(jCurrentTimeMillis, "duration");
                    c2344009Gk2.LJIIIIZZ("source_series_card_type", this.LLILZLL);
                    c2344009Gk2.LJIIIIZZ("session_id", this.LLJIJIL);
                    c2344009Gk2.LJIIIIZZ("source_video_id", this.LLIZ);
                    c2344009Gk2.LJIIIIZZ("source_series_card_id", this.LLIZLLLIL);
                    c1612650s4F.getClass();
                    ISeriesCommonETService.LIZ.getClass();
                    ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
                    Object obj = c2344009Gk2;
                    if (iSeriesCommonETServiceLIZ != null) {
                        Object objAppendSeriesInnerFeedMobParam = iSeriesCommonETServiceLIZ.appendSeriesInnerFeedMobParam(null, c2344009Gk2);
                        obj = c2344009Gk2;
                        if (objAppendSeriesInnerFeedMobParam != null) {
                            obj = objAppendSeriesInnerFeedMobParam;
                        }
                    }
                    c1163504gr2.onEventV3("series_innerfeed_stay_time", ((C2344009Gk) obj).LIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 12304);
                sbLIZ.append(this.LL.getClass().getSimpleName());
                sbLIZ.append("】   stopCalTime() called with: ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLJ = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLJI) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLJI) {
            this.LLJ = System.currentTimeMillis();
        }
    }

    public /* synthetic */ SeriesHomeTabStayTimeComponent(Fragment fragment, String str, String str2) {
        this(fragment, str, str2, null, null, null, null, null);
    }

    public SeriesHomeTabStayTimeComponent(Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = -1L;
        this.LLJI = true;
        this.LLJIJIL = UUID.randomUUID().toString();
        fragment.getLifecycle().addObserver(this);
    }
}
