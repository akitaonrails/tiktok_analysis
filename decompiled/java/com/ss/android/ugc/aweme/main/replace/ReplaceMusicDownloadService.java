package com.ss.android.ugc.aweme.main.replace;

import X.C01GW;
import X.C098200Yq;
import X.C09CT;
import X.C0PEM;
import X.C1227904rF;
import X.C1402605eK;
import X.C14DL;
import X.C189200o6;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C317840Cd4;
import X.C452501pT;
import X.InterfaceC1631620sYq;
import X.InterfaceC486470J5x;
import android.app.Activity;
import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ReplaceMusicDownloadService implements IReplaceMusicDownloadService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(152));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(153));

    public final C14DL LJII() {
        return (C14DL) this.LIZ.getValue();
    }

    public static final class MuteStripStatusUpdateListener implements InterfaceC486470J5x {
        public final ConcurrentHashMap<String, Function0<Unit>> LL = new ConcurrentHashMap<>();
        public final CopyOnWriteArrayList<WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>>> LLILLJJLI = new CopyOnWriteArrayList<>();

        @Override // X.InterfaceC486470J5x
        public final void LIZIZ(WsChannelMsg wsChannelMsg) {
            Object c098200Yq;
            Integer num;
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String str = wsChannelMsg.payloadEncoding;
                c1227904rF.getClass();
                StripFrontierMsg stripFrontierMsg = (StripFrontierMsg) C1227904rF.LIZIZ(str, StripFrontierMsg.class);
                String str2 = stripFrontierMsg.aid;
                if (str2 != null && (num = stripFrontierMsg.newStripStatus) != null) {
                    int iIntValue = num.intValue();
                    Iterator<WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>>> it2 = this.LLILLJJLI.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1631620sYq<String, Integer, Integer, Unit> interfaceC1631620sYq = it2.next().get();
                        if (interfaceC1631620sYq != null) {
                            interfaceC1631620sYq.invoke(stripFrontierMsg.aid, stripFrontierMsg.newStripStatus, stripFrontierMsg.musicEditStatus);
                        }
                    }
                    if (iIntValue >= 4) {
                        Function0<Unit> function0 = this.LL.get(str2);
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.LL.remove(str2);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C2344809Gs.LJI(thM5exceptionOrNullimpl);
            }
        }

        public static final class StripFrontierMsg {

            @C09CT("item_id")
            public final String aid;

            @C09CT("music_edit_status")
            public final Integer musicEditStatus;

            @C09CT("new_strip_status")
            public final Integer newStripStatus;

            public StripFrontierMsg(String str, Integer num, Integer num2) {
                this.aid = str;
                this.newStripStatus = num;
                this.musicEditStatus = num2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LIZJ(WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>> weakReference) {
        ((MuteStripStatusUpdateListener) this.LIZIZ.getValue()).LLILLJJLI.add(weakReference);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LJ(WeakReference<InterfaceC1631620sYq<String, Integer, Integer, Unit>> weakReference) {
        ((MuteStripStatusUpdateListener) this.LIZIZ.getValue()).LLILLJJLI.remove(weakReference);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final Unit LJI(Aweme aweme) {
        C14DL c14dlLJII = LJII();
        c14dlLJII.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1402605eK(aweme, c14dlLJII, "replace_music", null), 3);
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LIZIZ(Context context, Aweme aweme) {
        if (AwemeExtKt.isPhotoMode(aweme)) {
            C317840Cd4.LIZ.getClass();
            C317840Cd4.LIZ(context, aweme, "photomode_copyrighted", "change_ban_music");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: all -> 0x01d7, TryCatch #2 {all -> 0x01d7, blocks: (B:13:0x0039, B:15:0x0048, B:16:0x0052, B:22:0x0078, B:25:0x007d, B:27:0x0083, B:28:0x0087, B:32:0x0090, B:95:0x01d3, B:33:0x009c, B:35:0x00a2, B:36:0x00a6, B:38:0x00aa, B:94:0x01d1, B:43:0x00c6, B:44:0x00cd, B:51:0x00f5, B:56:0x0119, B:58:0x011d, B:60:0x0123, B:61:0x0127, B:63:0x012b, B:69:0x0155, B:74:0x0179, B:88:0x01b3, B:92:0x01cb, B:80:0x0181, B:85:0x01ae, B:21:0x0075, B:50:0x00f2, B:55:0x0116, B:68:0x0152, B:73:0x0176, B:84:0x01ab, B:91:0x01c8, B:93:0x01ce), top: B:102:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d A[Catch: 094W -> 0x017e, all -> 0x01d7, TryCatch #2 {all -> 0x01d7, blocks: (B:13:0x0039, B:15:0x0048, B:16:0x0052, B:22:0x0078, B:25:0x007d, B:27:0x0083, B:28:0x0087, B:32:0x0090, B:95:0x01d3, B:33:0x009c, B:35:0x00a2, B:36:0x00a6, B:38:0x00aa, B:94:0x01d1, B:43:0x00c6, B:44:0x00cd, B:51:0x00f5, B:56:0x0119, B:58:0x011d, B:60:0x0123, B:61:0x0127, B:63:0x012b, B:69:0x0155, B:74:0x0179, B:88:0x01b3, B:92:0x01cb, B:80:0x0181, B:85:0x01ae, B:21:0x0075, B:50:0x00f2, B:55:0x0116, B:68:0x0152, B:73:0x0176, B:84:0x01ab, B:91:0x01c8, B:93:0x01ce), top: B:102:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[Catch: 094W -> 0x017e, all -> 0x01d7, TryCatch #2 {all -> 0x01d7, blocks: (B:13:0x0039, B:15:0x0048, B:16:0x0052, B:22:0x0078, B:25:0x007d, B:27:0x0083, B:28:0x0087, B:32:0x0090, B:95:0x01d3, B:33:0x009c, B:35:0x00a2, B:36:0x00a6, B:38:0x00aa, B:94:0x01d1, B:43:0x00c6, B:44:0x00cd, B:51:0x00f5, B:56:0x0119, B:58:0x011d, B:60:0x0123, B:61:0x0127, B:63:0x012b, B:69:0x0155, B:74:0x0179, B:88:0x01b3, B:92:0x01cb, B:80:0x0181, B:85:0x01ae, B:21:0x0075, B:50:0x00f2, B:55:0x0116, B:68:0x0152, B:73:0x0176, B:84:0x01ab, B:91:0x01c8, B:93:0x01ce), top: B:102:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r20, java.lang.String r21, X.InterfaceC1364105Vn<? super X.C0WXA> r22) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService.LIZLLL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LIZ(Activity activity, String str, String str2, String str3) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//replace_music/download");
        smartRouteBuildRoute.withParam("aweme_id", str);
        smartRouteBuildRoute.withParam("type", "ban_music");
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.withParam("enter_method", str3);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService
    public final void LJFF(int i, long j, Aweme aweme, String str) {
        int duration;
        String mid;
        Music music;
        Video video;
        int i2 = 0;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (aweme == null || (music = aweme.getMusic()) == null || (mid = music.getMid()) == null) {
            mid = "";
        }
        c2344009Gk.LJIIIIZZ("music_id", mid);
        if (duration > 61000) {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "is_long_video");
        c2344009Gk.LIZJ(i, "is_success");
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("replace_music_process_time", c2344009Gk.LIZ);
    }
}
