package com.bytedance.android.livesdk.feed.drawerfeed.game.guess;

import X.AbstractC471420IeC;
import X.C00UG;
import X.C1338270kvh;
import X.C1A6B;
import X.C469770IbX;
import X.C470660Icy;
import X.C471120Idi;
import X.C471170Idn;
import X.C471640IeY;
import X.InterfaceC469760IbW;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveGuessingDrawerCacheTimeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameGuessDrawerFeedFragment extends BaseDrawerFeedLiveFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWE3OiQ7LD01HELIOSLSAoZygyJSBiLjo2OzZiDi4+LQI5LDwgDDctPiohDiApLQkhKSIhLCEn";

    public GameGuessDrawerFeedFragment() {
        super(new C471640IeY(), new C469770IbX(0), AFwS237S0000000_7.get$arr$(20), AFwS237S0000000_7.get$arr$(21));
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final long RR() {
        return GameLiveGuessingDrawerCacheTimeSetting.INSTANCE.getValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final Map<String, String> SR() {
        AbstractList abstractList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = 0;
        try {
            C470660Icy c470660Icy = this.LLIZ;
            ArrayList arrayList = null;
            if (!(c470660Icy instanceof AbstractC471420IeC)) {
                c470660Icy = null;
            }
            if (c470660Icy != null) {
                C1A6B<T> c1a6b = c470660Icy.LL;
                abstractList = c1a6b.LJI;
                if (abstractList == null) {
                    abstractList = c1a6b.LJFF;
                }
            } else {
                abstractList = null;
            }
            if (abstractList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : abstractList) {
                    C00UG c00ug = obj instanceof C00UG ? (C00UG) obj : null;
                    boolean z = true;
                    if (!(c00ug != null && c00ug.LIZ) || ((C00UG) obj).getRoom() == null) {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                size = arrayList.size();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        linkedHashMap.put("guessing_room_nums", String.valueOf(size));
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment
    public final void bS(String str) {
        super.bS(str);
        TabFeedViewModel tabFeedViewModel = this.LLJILJIL;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.EQ2();
        }
    }

    public GameGuessDrawerFeedFragment(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, C471120Idi c471120Idi, C471170Idn c471170Idn) {
        super(interfaceC469760IbW, c469770IbX, c471120Idi, c471170Idn);
    }
}
