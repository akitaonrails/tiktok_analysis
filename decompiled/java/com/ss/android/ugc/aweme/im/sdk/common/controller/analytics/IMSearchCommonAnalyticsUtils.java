package com.ss.android.ugc.aweme.im.sdk.common.controller.analytics;

import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMSearchCommonAnalyticsUtils;
import java.util.Map;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSearchCommonAnalyticsUtils implements IIMSearchCommonAnalyticsUtils {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IIMSearchCommonAnalyticsUtils {
    }

    public static void LIZ(Map map, AwS593S0100000_14 awS593S0100000_14) {
        boolean z;
        Object objInvoke = awS593S0100000_14.invoke("inbox_search_position");
        String str = (String) objInvoke;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && objInvoke != null) {
            map.put("inbox_search_position", objInvoke);
        }
        Object objInvoke2 = awS593S0100000_14.invoke("inbox_search_cell_type");
        String str2 = (String) objInvoke2;
        if (str2 != null && str2.length() != 0 && objInvoke2 != null) {
            map.put("inbox_search_cell_type", objInvoke2);
        }
        Object objInvoke3 = awS593S0100000_14.invoke("inbox_search_tab_name");
        String str3 = (String) objInvoke3;
        if (str3 != null && str3.length() != 0 && objInvoke3 != null) {
            map.put("inbox_search_tab_name", objInvoke3);
        }
    }

    public static void LIZIZ(Bundle bundle, SessionInfo sessionInfo) {
        String inboxSearchTabName;
        if (sessionInfo != null) {
            String inboxSearchPosition = sessionInfo.getInboxSearchPosition();
            if (inboxSearchPosition != null && inboxSearchPosition.length() != 0) {
                C786410Ut5.LJJJI("inbox_search_position", inboxSearchPosition, bundle);
            }
            if (sessionInfo != null) {
                String inboxSearchCellType = sessionInfo.getInboxSearchCellType();
                if (inboxSearchCellType != null && inboxSearchCellType.length() != 0) {
                    C786410Ut5.LJJJI("inbox_search_cell_type", inboxSearchCellType, bundle);
                }
                if (sessionInfo != null && (inboxSearchTabName = sessionInfo.getInboxSearchTabName()) != null && inboxSearchTabName.length() != 0 && inboxSearchTabName != null) {
                    C786410Ut5.LJJJI("inbox_search_tab_name", inboxSearchTabName, bundle);
                }
            }
        }
    }
}
