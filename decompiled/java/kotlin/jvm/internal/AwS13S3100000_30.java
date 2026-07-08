package kotlin.jvm.internal;

import X.AbstractC20187113yn;
import X.C09AY;
import X.C0C64;
import X.C13MA;
import X.C13SS;
import X.C1490520otG;
import X.C1662010tLr;
import X.C19995713Ln;
import X.C20155713tj;
import X.C20187213yo;
import X.C20187613ys;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C298110BmL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.vesdk.VEDownloaderConfig;
import com.ss.android.vesdk.VEFileDownloader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S2102001_30;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.jvm.internal.AwS24S1110000_30;
import kotlin.jvm.internal.AwS2S2102000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AwS13S3100000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S3100000_30 awS13S3100000_30) {
        Map<String, VEFileDownloader> map;
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreDownload url=");
        sbLIZ.append(awS13S3100000_30.s0);
        sbLIZ.append(" downloaderMap=");
        sbLIZ.append(C20187213yo.LIZIZ.size());
        C201955140j.LIZLLL(c201962140q, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ));
        UUID.randomUUID().toString();
        while (true) {
            map = C20187213yo.LIZIZ;
            if ((!map.isEmpty()) && map.size() >= C0C64.LJIILLIIL().LJIJ(31744, 3, "edit_page_stream_playback_max_download_count", true)) {
                String key = map.entrySet().iterator().next().getKey();
                if (Intrinsics.LJFF(key, awS13S3100000_30.s0)) {
                    break;
                }
                C20187213yo.LIZ.getClass();
                C20187213yo.LIZIZ(key);
            } else {
                break;
            }
        }
        C20187213yo c20187213yo = C20187213yo.LIZ;
        final AbstractC20187113yn abstractC20187113yn = (AbstractC20187113yn) awS13S3100000_30.l3;
        final String str = awS13S3100000_30.s1;
        final String str2 = awS13S3100000_30.s2;
        c20187213yo.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC20187113yn abstractC20187113yn2 = new AbstractC20187113yn() { // from class: X.13yp
            @Override // X.InterfaceC20187013ym
            public final void LIZ(String str3) {
                String str4;
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFinished url=");
                sbLIZ2.append(str3);
                C201955140j.LIZLLL(c201962140q2, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ2));
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LIZ(str3);
                }
                C0CNO.LIZLLL(0L, new AwS179S1100000_30(abstractC20187113yn, str3, 0));
                C20187813yu c20187813yu = C20187813yu.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c20187813yu.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("resource_type", "music_stream");
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
                String str5 = "";
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                c2344009Gk.LJIIIIZZ("resource_url", str4);
                String str6 = C20187813yu.LIZJ;
                if (str6 != null) {
                    str5 = str6;
                }
                c2344009Gk.LJIIIIZZ("resource_id", str5);
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "finish");
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
                C20187213yo c20187213yo2 = C20187213yo.LIZ;
                if (str3 != null) {
                    String str7 = str2;
                    String str8 = str;
                    C20187213yo.LIZIZ.remove(str3);
                    C20187213yo.LIZ.getClass();
                    String strLIZ = C20187213yo.LIZ(str3, str7);
                    if (strLIZ != null) {
                        String name = new C0VSJ(strLIZ).getName();
                        boolean z = C13TD.LIZIZ;
                        C13TC.LIZ(name, str8);
                    }
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZJ(String str3) {
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onConnected url=");
                sbLIZ2.append(str3);
                C201955140j.LIZLLL(c201962140q2, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ2));
                abstractC20187113yn.LIZJ(str3);
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LIZJ(str3);
                }
                C20187813yu c20187813yu = C20187813yu.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c20187813yu.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("resource_type", "music_stream");
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c2344009Gk.LJIIIIZZ("resource_url", str3);
                String str5 = C20187813yu.LIZJ;
                if (str5 != null) {
                    str4 = str5;
                }
                c2344009Gk.LJIIIIZZ("resource_id", str4);
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "connect");
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZLLL(String str3, boolean z) {
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onOpenResult url=");
                sbLIZ2.append(str3);
                sbLIZ2.append(" success=");
                sbLIZ2.append(z);
                C201955140j.LIZLLL(c201962140q2, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ2));
                C0CNO.LIZLLL(0L, new AwS24S1110000_30(abstractC20187113yn, str3, z, 0));
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LIZLLL(str3, z);
                }
                C20187813yu c20187813yu = C20187813yu.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c20187813yu.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("resource_type", "music_stream");
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c2344009Gk.LJIIIIZZ("resource_url", str3);
                String str5 = C20187813yu.LIZJ;
                if (str5 != null) {
                    str4 = str5;
                }
                c2344009Gk.LJIIIIZZ("resource_id", str4);
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "open");
                c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC20187013ym
            public final void LJJJLL(String str3, float f) {
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onProgress url=");
                sbLIZ2.append(str3);
                sbLIZ2.append(" progress=");
                sbLIZ2.append(f);
                C201955140j.LIZLLL(c201962140q2, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ2));
                abstractC20187113yn.LJJJLL(str3, f);
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LJJJLL(str3, f);
                }
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZIZ(String str3, int i, int i2, String str4) {
                String str5 = str4;
                String str6 = str3;
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onError url=");
                sbLIZ2.append(str6);
                sbLIZ2.append(" errorCode=");
                sbLIZ2.append(i);
                sbLIZ2.append(" ext=");
                sbLIZ2.append(i2);
                sbLIZ2.append(" msg=");
                sbLIZ2.append(str5);
                C201955140j.LJIIJ(c201962140q2, "EditMusicStream", new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                C0CNO.LIZLLL(0L, new AwS2S2102000_30(abstractC20187113yn, str6, i, i2, str5, 0));
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LIZIZ(str6, i, i2, str5);
                }
                C20187813yu c20187813yu = C20187813yu.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c20187813yu.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("resource_type", "music_stream");
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                c2344009Gk.LJIIIIZZ("resource_url", str6);
                String str8 = C20187813yu.LIZJ;
                if (str8 != null) {
                    str7 = str8;
                }
                c2344009Gk.LJIIIIZZ("resource_id", str7);
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "error");
                c2344009Gk.LIZJ(i, "error_code");
                if (str5 == null) {
                    str5 = "empty_error_msg";
                }
                c2344009Gk.LJIIIIZZ("error_msg", str5);
                c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
                C20187213yo c20187213yo2 = C20187213yo.LIZ;
            }

            @Override // X.AbstractC20187113yn
            public final void LJ(String str3, int i, int i2, float f, String str4) {
                C201962140q c201962140q2 = C201962140q.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onInfo type=");
                sbLIZ2.append(i);
                sbLIZ2.append(" - msg: ");
                sbLIZ2.append(str4);
                C201955140j.LIZLLL(c201962140q2, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ2));
                Iterator it2 = ((CopyOnWriteArraySet) C20187213yo.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((AbstractC20187113yn) it2.next()).LJ(str3, i, i2, f, str4);
                }
                C0CNO.LIZLLL(0L, new AwS0S2102001_30(i, abstractC20187113yn, str3, i2, f, str4, 0));
            }
        };
        VEFileDownloader vEFileDownloader = new VEFileDownloader();
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Accept-Encoding", "gzip");
        VEDownloaderConfig vEDownloaderConfig = new VEDownloaderConfig(awS13S3100000_30.s0, C1490520otG.LJFF().LIZ());
        vEDownloaderConfig.maxDownloadCount = C0C64.LJIILLIIL().LJIJ(31744, 3, "edit_page_stream_playback_max_download_count", true);
        vEDownloaderConfig.maxCacheFileCount = C0C64.LJIILLIIL().LJIJ(31744, 50, "edit_page_stream_playback_max_cache_count", true);
        vEDownloaderConfig.needSaveFile = true;
        vEDownloaderConfig.maxNetworkTimeout = C0C64.LJIILLIIL().LJIJ(31744, LivePreCreateNextRoomPlayer.ENABLE, "edit_page_stream_playback_audio_underrun_timeout", true);
        vEDownloaderConfig.headerParams = map2;
        if (C298110BmL.LIZ()) {
            vEDownloaderConfig.customSavePath = C1490520otG.LJFF().LJ(awS13S3100000_30.s0, awS13S3100000_30.s2);
            vEFileDownloader.createFileDownloadWithCustomPath(vEDownloaderConfig, abstractC20187113yn2);
        } else {
            vEFileDownloader.createFileDownload(vEDownloaderConfig, abstractC20187113yn2);
        }
        map.put(awS13S3100000_30.s0, vEFileDownloader);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S3100000_30 awS13S3100000_30) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageXTemplate path replace failed! ");
        sbLIZ.append(((C20155713tj) awS13S3100000_30.l3).LJIIIZ);
        sbLIZ.append(" @ ");
        sbLIZ.append(awS13S3100000_30.s0);
        sbLIZ.append(" -> ");
        sbLIZ.append(awS13S3100000_30.s1);
        sbLIZ.append(" @ ");
        sbLIZ.append(awS13S3100000_30.s2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS13S3100000_30 awS13S3100000_30) {
        C19995713Ln c19995713Ln = (C19995713Ln) awS13S3100000_30.l3;
        C13MA c13maLIZ = c19995713Ln.LIZIZ.LJJJIL.LIZ(c19995713Ln.LIZJ);
        String str = awS13S3100000_30.s0;
        if (str != null && str.length() != 0) {
            if (c13maLIZ != null) {
                c13maLIZ.onSuccess(awS13S3100000_30.s0);
            }
        } else {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute callback fail empty finalPath resourceKey=");
            sbLIZ.append(((C19995713Ln) awS13S3100000_30.l3).LIZ.getResourceKey());
            sbLIZ.append(" uri=");
            sbLIZ.append(((C19995713Ln) awS13S3100000_30.l3).LIZ.getUri());
            sbLIZ.append(" cacheKey=");
            sbLIZ.append(awS13S3100000_30.s1);
            sbLIZ.append(" basePath=");
            sbLIZ.append(awS13S3100000_30.s2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("MaterialResTask", strLIZIZ, null);
            if (c13maLIZ != null) {
                c13maLIZ.onFail(null, new C1662010tLr(10002));
            }
        }
        C19995713Ln c19995713Ln2 = (C19995713Ln) awS13S3100000_30.l3;
        c19995713Ln2.LIZIZ.LJJJIL.LIZJ(c19995713Ln2.LIZJ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S3100000_30(C19995713Ln c19995713Ln, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.l3 = c19995713Ln;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S3100000_30(C20155713tj c20155713tj, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.l3 = c20155713tj;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S3100000_30(C20187613ys c20187613ys, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l3 = c20187613ys;
        this.s1 = str2;
        this.s2 = str3;
    }
}
