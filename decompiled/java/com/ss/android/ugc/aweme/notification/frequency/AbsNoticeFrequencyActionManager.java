package com.ss.android.ugc.aweme.notification.frequency;

import X.AbstractC848400XPy;
import X.C09CT;
import X.C0XQ7;
import X.C786410Ut5;
import X.InterfaceC1902520zbm;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbsNoticeFrequencyActionManager {
    public final InterfaceC1902520zbm LIZ;
    public final LinkedHashMap<String, NoticeFrequencyControlConfig> LIZIZ = new LinkedHashMap<>();
    public volatile boolean LIZJ;

    public abstract void LIZ();

    public abstract int LIZIZ();

    public abstract String LIZLLL();

    public static Keva LIZJ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("inbox_notice_frequency_%s", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public AbsNoticeFrequencyActionManager(InterfaceC1902520zbm interfaceC1902520zbm) {
        this.LIZ = interfaceC1902520zbm;
    }

    public static final class FrequencyLocalEntry {

        @C09CT("config")
        public final NoticeFrequencyControlConfig config;

        @C09CT("nid")
        public final String nid;

        public FrequencyLocalEntry(String str, NoticeFrequencyControlConfig noticeFrequencyControlConfig) {
            this.nid = str;
            this.config = noticeFrequencyControlConfig;
        }
    }
}
