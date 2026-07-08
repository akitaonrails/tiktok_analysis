package com.heytap.mcssdk.c;

import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public int c;
    public int d;
    public int f;
    public int g;
    public StatusBarNotification h;
    public int a = 3;
    public List<NotificationSortMessage> b = new ArrayList();
    public List<String> e = new ArrayList();

    public static class a {
        public static final b a = new b();
    }

    private int a(List<NotificationSortMessage> list, int i) {
        int size = list == null ? 0 : list.size();
        if (i <= 0 || size == 0) {
            return i;
        }
        if (size < i) {
            int i2 = i - size;
            list.clear();
            return i2;
        }
        int i3 = 0;
        do {
            ListProtector.remove(list, (size - 1) - i3);
            i3++;
        } while (i3 < i);
        return 0;
    }

    private DataMessage a(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMcs", "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put("clientStatisticData", statisticData);
            }
            dataMessage.setStatisticsExtra(C786410Ut5.J3(jSONObject));
            return dataMessage;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return dataMessage;
        }
    }

    private void a(int i) {
        if (i == 7) {
            this.c++;
        } else if (i == 5) {
            this.d++;
        }
    }

    private void a(NotificationManager notificationManager, Context context, int i) {
        a(com.heytap.mcssdk.c.a.a(notificationManager, context.getPackageName()), i);
    }

    private void a(Context context, NotificationManager notificationManager, int i) {
        a(this.b, i);
        a(context, notificationManager, this.b);
    }

    private void a(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        a(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put("SORT_ARRAY", jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (arrayList.size() != 0) {
            HashMap map = new HashMap();
            map.put("push_delete_by_fold", arrayList);
            StatisticUtils.statisticEvent(context, map);
        }
    }

    private void a(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("EXTRA_MESSAGE_ID", notificationSortMessage.getMessageId());
                    jSONObject.put("EXTRA_NOTIFY_ID", notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                list2.add(a(context, notificationSortMessage));
                this.e.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void a(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.b.size() != 0) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = (NotificationSortMessage) ListProtector.get(this.b, size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    ListProtector.add(this.b, size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        ListProtector.add(this.b, 0, notificationSortMessage);
    }

    private void a(ISortListener iSortListener, boolean z, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z, builder, this.e);
        }
    }

    private void a(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_AUTO_DELETE", notificationSortMessage.getAutoDelete());
        bundle.putInt("EXTRA_IMPORTANT_LEVEL", notificationSortMessage.getImportantLevel());
        C786410Ut5.LJJJI("EXTRA_MESSAGE_ID", notificationSortMessage.getMessageId(), bundle);
        bundle.putLong("EXTRA_POST_TIME", System.currentTimeMillis());
        bundle.putBoolean("EXTRA_IS_MCS", false);
        C786410Ut5.LJJJI("EXTRA_STATISTIC_DATA", notificationSortMessage.getStatisticData(), bundle);
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    private void a(StatusBarNotification[] statusBarNotificationArr, int i) {
        b();
        if (statusBarNotificationArr != null && statusBarNotificationArr.length != 0) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                Bundle bundle = statusBarNotification.getNotification().extras;
                boolean z = bundle.getBoolean("EXTRA_IS_MCS", true);
                long j = bundle.getLong("EXTRA_POST_TIME", statusBarNotification.getPostTime());
                String string = bundle.getString("EXTRA_MESSAGE_ID", "");
                int i2 = bundle.getInt("EXTRA_AUTO_DELETE", 1);
                int i3 = bundle.getInt("EXTRA_IMPORTANT_LEVEL", 5);
                String string2 = bundle.getString("EXTRA_STATISTIC_DATA");
                int id = statusBarNotification.getId();
                if (i == id) {
                    this.h = statusBarNotification;
                    return;
                }
                NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i3, i2, z, j, id, string2);
                b(i2);
                a(i3);
                a(notificationSortMessage);
            }
        }
        if (e.g()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initParams : notDelete:");
            sbLIZ.append(this.g);
            sbLIZ.append(" canDelete : ");
            sbLIZ.append(this.f);
            sbLIZ.append('\n');
            sbLIZ.append(" highSize : ");
            sbLIZ.append(this.c);
            sbLIZ.append(" normalSize :");
            sbLIZ.append(this.d);
            sbLIZ.append('\n');
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canDeleteList size : ");
            sbLIZ2.append(this.b.size());
            e.b(C2188811AlT.LIZIZ(sbLIZ2));
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                NotificationSortMessage notificationSortMessage2 = (NotificationSortMessage) ListProtector.get(this.b, i4);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("第");
                sbLIZ3.append(i4);
                sbLIZ3.append("条消息 messageId : ");
                sbLIZ3.append(notificationSortMessage2.getMessageId());
                sbLIZ3.append(" importanceLevel : ");
                sbLIZ3.append(notificationSortMessage2.getImportantLevel());
                sbLIZ3.append(" autoDelete : ");
                sbLIZ3.append(notificationSortMessage2.getAutoDelete());
                sbLIZ3.append(" notifyId: ");
                sbLIZ3.append(notificationSortMessage2.getNotifyId());
                sbLIZ3.append(" postTime:");
                sbLIZ3.append(notificationSortMessage2.getPostTime());
                e.b(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    private boolean a(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        StringBuilder sbLIZ;
        if (e.g()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dealCurrentMessage : deleteNumber");
            sbLIZ2.append(this.f + this.g);
            sbLIZ2.append(" keepNumber : ");
            sbLIZ2.append(this.a);
            e.b(C2188811AlT.LIZIZ(sbLIZ2));
        }
        boolean zA = true;
        if (this.f + this.g < this.a) {
            if (notificationSortMessage.getAutoDelete() == -1) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mcs.");
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mcs.enable.");
            }
            sbLIZ.append(context.getPackageName());
            notificationSortMessage.setGroup(C2188811AlT.LIZIZ(sbLIZ));
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mcs.");
            sbLIZ3.append(context.getPackageName());
            notificationSortMessage.setGroup(C2188811AlT.LIZIZ(sbLIZ3));
            int i = this.a - this.g;
            if (e.g()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("dealCurrentMessage : allowDelete :");
                sbLIZ4.append(i);
                e.b(C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (i > 0) {
                a(context, notificationManager, i - 1);
            } else {
                Notification notificationA = com.heytap.mcssdk.c.a.a(context, notificationSortMessage.getGroup(), builder);
                if (notificationA != null) {
                    notificationManager.notify(SpeechEngineDefines.TTS_WORK_MODE_BOTH, notificationA);
                }
            }
        } else {
            zA = a(context, notificationManager, notificationSortMessage);
        }
        if (e.g()) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("dealCurrentMessage : needPost :");
            sbLIZ5.append(zA);
            e.b(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (zA) {
            a(builder, notificationSortMessage);
            return zA;
        }
        com.heytap.mcssdk.f.a.a(context, "push_no_show_by_fold", a(context, notificationSortMessage));
        return zA;
    }

    private boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i = this.g;
        int i2 = this.a;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - i;
        if (e.g()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("judgeShowCurrentMessage : allowDelete");
            sbLIZ.append(i3);
            e.b(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (notificationSortMessage.getImportantLevel() != 7) {
            if (notificationSortMessage.getImportantLevel() == 5) {
                if (this.c >= i3) {
                    return false;
                }
            } else if (this.c + this.d >= i3) {
                return false;
            }
        }
        a(context, notificationManager, i3 - 1);
        return true;
    }

    private boolean a(Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Notification notification;
        StringBuilder sbLIZ;
        String str;
        int verifyNotifyId = builder.getVerifyNotifyId();
        StatusBarNotification statusBarNotification = this.h;
        if (statusBarNotification == null || verifyNotifyId == -1 || (notification = statusBarNotification.getNotification()) == null) {
            return false;
        }
        if (notificationSortMessage.getAutoDelete() == 1) {
            sbLIZ = C2188811AlT.LIZ();
            str = "mcs.enable.";
        } else {
            sbLIZ = C2188811AlT.LIZ();
            str = "mcs.";
        }
        sbLIZ.append(str);
        sbLIZ.append(context.getPackageName());
        notificationSortMessage.setGroup(C2188811AlT.LIZIZ(sbLIZ));
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("EXTRA_MESSAGE_ID", "");
        a(builder, notificationSortMessage);
        this.e.add(string);
        return true;
    }

    private void b() {
        this.f = 0;
        this.g = 0;
        this.c = 0;
        this.d = 0;
        this.b.clear();
        this.e.clear();
        this.h = null;
    }

    private void b(int i) {
        if (i == -1) {
            this.g++;
        } else if (i == 1) {
            this.f++;
        }
    }

    public void a(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        a(iSortListener, a(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }

    public boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        int i;
        if (notificationSortMessage.getAutoDelete() == 0 || (i = Build.VERSION.SDK_INT) < 24 || i >= 30) {
            return false;
        }
        if (!com.heytap.mcssdk.c.a.a(notificationManager, context.getPackageName(), SpeechEngineDefines.TTS_WORK_MODE_BOTH)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mcs.");
        sbLIZ.append(context.getPackageName());
        notificationSortMessage.setGroup(C2188811AlT.LIZIZ(sbLIZ));
        a(builder, notificationSortMessage);
        return false;
    }

    public static b a() {
        return a.a;
    }

    private boolean a(PushNotification.Builder builder, int i, int i2, String str, String str2) {
        Context context = PushService.a.a.getContext();
        if (builder != null && context != null) {
            NotificationManager notificationManagerA = com.heytap.mcssdk.c.a.a(context);
            NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i2, i, false, System.currentTimeMillis(), str2);
            if (!a(context, notificationManagerA, notificationSortMessage, builder)) {
                return true;
            }
            a(notificationManagerA, context, builder.getVerifyNotifyId());
            if (a(context, builder, notificationSortMessage)) {
                return true;
            }
            return a(notificationManagerA, context, builder, notificationSortMessage);
        }
        return false;
    }
}
