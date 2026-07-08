package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C0PYD;
import X.C0Q3E;
import X.C15438062q;
import X.C435800H7a;
import X.C435950H7p;
import X.C435980H7s;
import X.C435990H7t;
import X.C650450PfH;
import X.C659520Ptu;
import X.C660640Pvi;
import X.C660650Pvj;
import X.C661020PwK;
import X.InterfaceC0148002o;
import X.InterfaceC660500PvU;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.model.KeySegmentInfo;
import com.ss.android.ugc.aweme.search.model.SearchKeySegmentsInfo;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS94S0110000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoKeyFrameViewModel extends AssemViewModel<C435950H7p> {
    public static final ConcurrentHashMap<String, Boolean> LLILZ = new ConcurrentHashMap<>();
    public C659520Ptu LL;
    public List<SearchKeyFramePoint> LLILLJJLI;
    public ISearchContextAbility LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C435950H7p(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint>] */
    public final void vQ2(C659520Ptu c659520Ptu) {
        List<KeySegmentInfo> keySegmentInfos;
        ?? arrayList;
        String uniqueId;
        SearchKeySegmentsInfo keySegmentsInfo = c659520Ptu.LL.getKeySegmentsInfo();
        if (keySegmentsInfo != null) {
            keySegmentInfos = keySegmentsInfo.getKeySegmentInfos();
        } else {
            keySegmentInfos = null;
        }
        this.LL = c659520Ptu;
        InterfaceC660500PvU interfaceC660500PvU = c659520Ptu.LLILLL;
        boolean zLJFF = false;
        if (((interfaceC660500PvU instanceof C660650Pvj) || (interfaceC660500PvU instanceof C660640Pvi)) && keySegmentInfos != null && !keySegmentInfos.isEmpty()) {
            arrayList = new ArrayList(C15438062q.LJIJJ(keySegmentInfos, 10));
            for (KeySegmentInfo keySegmentInfo : keySegmentInfos) {
                String title = keySegmentInfo.getTitle();
                String str = "";
                if (title == null) {
                    title = "";
                }
                String subTitle = keySegmentInfo.getSubTitle();
                if (subTitle != null) {
                    str = subTitle;
                }
                arrayList.add(new SearchKeyFramePoint(title, str, keySegmentInfo.getSecondStart(), keySegmentInfo.getSecondEnd(), keySegmentInfo.getTitlePlaying(), keySegmentInfo.getSubTitlePlaying(), false, null, -1, -1));
            }
        } else {
            arrayList = ((C0PYD) C0Q3E.LIZJ(c659520Ptu.LL).Y30().LIZJ()).LLILZLL;
        }
        this.LLILLJJLI = arrayList;
        C659520Ptu c659520Ptu2 = this.LL;
        if (c659520Ptu2 != null && (uniqueId = AwemeSaaSExtKt.getUniqueId(c659520Ptu2.LL)) != null) {
            zLJFF = Intrinsics.LJFF(LLILZ.get(uniqueId), Boolean.TRUE);
        }
        setState(new AwS94S0110000_6(this, zLJFF, 1));
    }

    public final void wQ2(View view, Map<String, String> map) {
        Aweme aweme;
        List<SearchKeyFramePoint> list;
        Aweme aweme2;
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu == null || (aweme = c659520Ptu.LL) == null || (list = this.LLILLJJLI) == null) {
            return;
        }
        C435800H7a c435800H7a = new C435800H7a(aweme, list);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c435800H7a.LJ(entry.getKey(), entry.getValue());
        }
        C659520Ptu c659520Ptu2 = this.LL;
        if (c659520Ptu2 != null) {
            aweme2 = c659520Ptu2.LL;
        } else {
            aweme2 = null;
        }
        C650450PfH.LIZ(c435800H7a, view, aweme2, this.LLILLL, false);
        c435800H7a.LJIILJJIL();
    }

    public final void yQ2(View view, Map<String, String> map) {
        Aweme aweme;
        List<SearchKeyFramePoint> list;
        Aweme aweme2;
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu == null || (aweme = c659520Ptu.LL) == null || (list = this.LLILLJJLI) == null) {
            return;
        }
        C435980H7s c435980H7s = new C435980H7s(aweme, list);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c435980H7s.LJ(entry.getKey(), entry.getValue());
        }
        C659520Ptu c659520Ptu2 = this.LL;
        if (c659520Ptu2 != null) {
            aweme2 = c659520Ptu2.LL;
        } else {
            aweme2 = null;
        }
        C650450PfH.LIZ(c435980H7s, view, aweme2, this.LLILLL, false);
        c435980H7s.LJIILJJIL();
    }

    public final void xQ2(final String str, View view, Map map) {
        final Aweme aweme;
        final List<SearchKeyFramePoint> list;
        Aweme aweme2;
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu == null || (aweme = c659520Ptu.LL) == null || (list = this.LLILLJJLI) == null) {
            return;
        }
        C661020PwK<C435990H7t> c661020PwK = new C661020PwK<C435990H7t>(str, aweme, list) { // from class: X.0H7t
            {
                super("chapters_dashboard_click", aweme, list);
                LJ("click_type", str);
            }
        };
        for (Map.Entry entry : map.entrySet()) {
            c661020PwK.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        C659520Ptu c659520Ptu2 = this.LL;
        if (c659520Ptu2 != null) {
            aweme2 = c659520Ptu2.LL;
        } else {
            aweme2 = null;
        }
        C650450PfH.LIZ(c661020PwK, view, aweme2, this.LLILLL, false);
        c661020PwK.LJIILJJIL();
    }
}
