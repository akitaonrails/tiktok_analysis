package com.heytap.mcssdk.f;

import android.content.Context;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static boolean a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageStat(context.getPackageName(), str));
        return StatUtil.statisticMessage(context, arrayList);
    }

    public static boolean a(Context context, String str, DataMessage dataMessage) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        arrayList.add(dataMessage == null ? new MessageStat(packageName, str) : new MessageStat(dataMessage.getMessageType(), packageName, dataMessage.getGlobalId(), dataMessage.getTaskID(), str, null, dataMessage.getStatisticsExtra(), dataMessage.getDataExtra()));
        return StatUtil.statisticMessage(context, arrayList);
    }

    public static boolean a(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        if (list != null && list.size() != 0) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new MessageStat(packageName, it2.next()));
            }
        }
        return StatUtil.statisticMessage(context, arrayList);
    }
}
