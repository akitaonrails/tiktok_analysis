package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class StatUtil {
    public static final String TYPE = "type";

    public static void statisticMessage(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        statisticMessage(context, linkedList);
    }

    public static boolean statisticMessage(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSupportStatisticByMcs:");
        sbLIZ.append(isSupportStatisticByMcs(context));
        sbLIZ.append(",list size:");
        sbLIZ.append(linkedList.size());
        e.b(C2188811AlT.LIZIZ(sbLIZ));
        if (linkedList.size() <= 0 || !isSupportStatisticByMcs(context)) {
            return false;
        }
        return statisticMessageByMcs(context, linkedList);
    }

    public static boolean isSupportStatisticByMcs(Context context) {
        String mcsPackageName = PushService.a.a.getMcsPackageName(context);
        if (Utils.isExistPackage(context, mcsPackageName) && Utils.getVersionCode(context, mcsPackageName) >= 1017) {
            return true;
        }
        return false;
    }

    public static boolean statisticMessageByMcs(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.a.a.getReceiveSdkAction(context));
            intent.setPackage(PushService.a.a.getMcsPackageName(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", 12291);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<MessageStat> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toJsonObject());
            }
            intent.putStringArrayListExtra("list", arrayList);
            C786410Ut5.s3(context, intent);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("statisticMessage--Exception");
            sbLIZ.append(e.getMessage());
            e.e(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }
}
