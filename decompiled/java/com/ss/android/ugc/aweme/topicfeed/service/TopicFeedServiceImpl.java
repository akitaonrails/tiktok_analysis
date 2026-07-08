package com.ss.android.ugc.aweme.topicfeed.service;

import X.AbstractC1585770rMt;
import X.C0QSJ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1583100rIa;
import X.C19252910Tv;
import X.C19EG;
import X.C2188811AlT;
import X.C297720Bli;
import X.C687700QyG;
import X.EnumC1584360rKc;
import X.InterfaceC1582890rIF;
import X.InterfaceC1603190roz;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.ITopicFeedService;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedServiceImpl implements ITopicFeedService {
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean H7(int i) {
        if (i == 1000 || i == 1001) {
            return true;
        }
        switch (i) {
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
            case 51:
            case 52:
            case 53:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final String P7(int i) {
        if (i == 1000) {
            return "Personalized0";
        }
        if (i == 1001) {
            return "Personalized1";
        }
        switch (i) {
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return "Topic0";
            case 51:
                return "Topic1";
            case 52:
                return "Topic2";
            case 53:
                return "Topic3";
            default:
                return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean G7() {
        C1583100rIa.LIZ.getClass();
        return C1583100rIa.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void F7() {
        Fragment fragmentKi;
        HomeViewPagerAbility homeViewPagerAbility;
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack != null) {
            for (Activity activity : activityStack) {
                if ((activity instanceof InterfaceC1603190roz) && (fragmentKi = Hox.LLJILJIL.LIZ((C19EG) activity).Ki("HOME")) != null) {
                    if (C297720Bli.LIZ()) {
                        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragmentKi, null), MainActivityScope.class);
                        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeViewPagerAbility.class) : null;
                        homeViewPagerAbility = (HomeViewPagerAbility) (ability instanceof HomeViewPagerAbility ? ability : null);
                    } else {
                        homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentKi, null), HomeViewPagerAbility.class, null);
                    }
                    if (homeViewPagerAbility != null) {
                        homeViewPagerAbility.F7();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean I7(String str) {
        if (!u.LJJIIJZLJL(str, "Topic", false) && !u.LJJIIJZLJL(str, "Personalized", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final int J7(String str) {
        Integer num = this.LIZ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void K7(HashMap<String, String> map) {
        C1583100rIa.LIZ.getClass();
        int i = C1583100rIa.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Topic");
            sbLIZ.append(i2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("homepage_topic_");
            C1583100rIa.LIZ.getClass();
            sbLIZ2.append(C1583100rIa.LIZIZ(i2).eventTrackingName);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            map.put(strLIZIZ, strLIZIZ2);
            this.LIZ.put(strLIZIZ2, Integer.valueOf(C1583100rIa.LIZIZ(i2).topicFeedId + DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        InterfaceC1582890rIF interfaceC1582890rIFLLI = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI();
        int iLLILZIL = interfaceC1582890rIFLLI.LLILZIL();
        for (int i3 = 0; i3 < iLLILZIL; i3++) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Personalized");
            sbLIZ3.append(i3);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("homepage_topic_");
            sbLIZ4.append(interfaceC1582890rIFLLI.LLLL(i3).eventTrackingTitle);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            map.put(strLIZIZ3, strLIZIZ4);
            this.LIZ.put(strLIZIZ4, Integer.valueOf(interfaceC1582890rIFLLI.LLLL(i3).topicFeedId));
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void L7(HashMap<String, String> map) {
        C1583100rIa.LIZ.getClass();
        int i = C1583100rIa.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Topic");
            sbLIZ.append(i2);
            map.put(C2188811AlT.LIZIZ(sbLIZ), "enter_topic_tab");
        }
        int iLLILZIL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LLILZIL();
        for (int i3 = 0; i3 < iLLILZIL; i3++) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Personalized");
            sbLIZ2.append(i3);
            map.put(C2188811AlT.LIZIZ(sbLIZ2), "enter_topic_tab");
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean M7(String str) {
        return u.LJJIIJZLJL(str, "TopicFeedFragment", false);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean N7(String str) {
        if (str == null) {
            return false;
        }
        return u.LJJIIJZLJL(str, "homepage_topic", false);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final Object O7(Object obj) {
        if (obj instanceof EnumC1584360rKc) {
            final EnumC1584360rKc enumC1584360rKc = (EnumC1584360rKc) obj;
            return new AbstractC1585770rMt(enumC1584360rKc) { // from class: X.0qZF
                public static final C01GW<Map<EnumC1584360rKc, TopTabProtocol>> LJ = C452501pT.LIZIZ(new C1554970qZD());
                public final EnumC1584360rKc LIZLLL;

                @Override // X.AbstractC1585770rMt
                public final TopTabProtocol LIZLLL() {
                    return LJ.getValue().get(this.LIZLLL);
                }

                @Override // X.AbstractC1585770rMt
                public final EnumC1584360rKc LIZIZ() {
                    return this.LIZLLL;
                }

                {
                    this.LIZLLL = enumC1584360rKc;
                }
            };
        }
        return null;
    }
}
