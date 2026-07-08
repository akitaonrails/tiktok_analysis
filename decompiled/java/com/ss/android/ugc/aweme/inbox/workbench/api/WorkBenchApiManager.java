package com.ss.android.ugc.aweme.inbox.workbench.api;

import X.C01GW;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeMissionUpdateResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchApiManager {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(200));

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/notice/brand_partnership/v1/")
        Object fetchNoticeBrandPartnership(@InterfaceC1501070pAH("tab_id") int i, @InterfaceC1501070pAH("cursor") String str, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("last_read_time_in_session") String str2, @InterfaceC1501070pAH("wall_time") Long l, @InterfaceC1501070pAH("need_mark_read") Boolean bool, @InterfaceC1501070pAH("is_preload") Boolean bool2, @InterfaceC1501070pAH("id_list") List<Long> list, @InterfaceC1501070pAH("filters") String str3, InterfaceC1364105Vn<? super WorkBenchNoticeResponse> interfaceC1364105Vn);

        @InterfaceC1501170pAR("tiktok/notice/mission_settings/update/v1/")
        C11NZ<WorkBenchNoticeMissionUpdateResponse> postNoticeMissionSettingsUpdate(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("sub_source") int i2, @InterfaceC1501070pAH("is_unsubscribe") boolean z);
    }

    public static Api LIZ() {
        return (Api) LIZ.getValue();
    }
}
