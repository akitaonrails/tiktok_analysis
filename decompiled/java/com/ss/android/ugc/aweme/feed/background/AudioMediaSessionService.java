package com.ss.android.ugc.aweme.feed.background;

import X.BinderC808440VnW;
import X.C01GW;
import X.C0WIH;
import X.C0WIS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1AF0;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C452501pT;
import X.C788530UwV;
import X.C817700W5w;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media.MediaBrowserServiceCompat;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class AudioMediaSessionService extends MediaBrowserServiceCompat {
    public static final List<String> LLJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(129));

    @Override // androidx.media.MediaBrowserServiceCompat
    public final C0WIH LIZIZ(String str) {
        return null;
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.intent.action.MEDIA_BUTTON");
        arrayList.add("android.media.browse.MediaBrowserService");
        arrayList.add("android.media.AUDIO_BECOMING_NOISY");
        LLJ = arrayList;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZJ(C0WIS c0wis) {
        c0wis.LIZLLL(null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/feed/background/AudioMediaSessionService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNIe/Va8aPtkCY2lGoET4hqdLzxTRSHRJs=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return new BinderC808440VnW(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ActivityManager activityManager;
        List listLJIIIIZZ;
        String action;
        Intent intent2 = new Intent("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST");
        intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        if (intent != null && (action = intent.getAction()) != null && ((ArrayList) LLJ).contains(action)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpect intent: ");
            sbLIZ.append(intent);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        LocalBroadcastManager.LIZ(this).LIZJ(intent2);
        if (Build.VERSION.SDK_INT >= 26 && (activityManager = (ActivityManager) this.LLIZLLLIL.getValue()) != null && (listLJIIIIZZ = C2204961BRm.LJIIIIZZ(activityManager, Integer.MAX_VALUE, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNIe/Va8aPtkCY2lGoET4hqdLzxTRSHRJs=", null))) != null) {
            Iterator it2 = listLJIIIIZZ.iterator();
            while (it2.hasNext() && !Intrinsics.LJFF(C2204961BRm.LJJIJIIJIL(((ActivityManager.RunningServiceInfo) it2.next()).service, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNIe/Va8aPtkCY2lGoET4hqdLzxTRSHRJs=", null)), getClass().getName())) {
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
