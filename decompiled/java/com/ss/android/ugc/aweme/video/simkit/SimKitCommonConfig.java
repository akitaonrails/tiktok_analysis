package com.ss.android.ugc.aweme.video.simkit;

import X.C01GW;
import X.C0C64;
import X.C0NFP;
import X.C0XA0;
import X.C0XA1;
import X.C1030680cva;
import X.C1055540dZg;
import X.C1477180oXk;
import X.C1477190oXl;
import X.C1477280oXu;
import X.C1477920oYw;
import X.C1478500oZs;
import X.C1478530oZv;
import X.C1479130oat;
import X.C1483590oi5;
import X.C1786206z6;
import X.C300100BpY;
import X.InterfaceC1477050oXX;
import X.InterfaceC1477240oXq;
import X.InterfaceC1477620oYS;
import X.InterfaceC1477730oYd;
import X.InterfaceC1478540oZw;
import X.InterfaceC2524109up;
import X.InterfaceC288420BSe;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.model.FeedCacheStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.SceneLoudnessConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public class SimKitCommonConfig implements ICommonConfig {
    public static final long COLD_BOOT_TIME_POINT = System.currentTimeMillis();
    public InterfaceC1477620oYS mSrListener = InterfaceC1477620oYS.LIZ;

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ List getColdBootVideoUrlHooks() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ String getLocalVideoPath(String str) {
        return null;
    }

    public int getPreloaderType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ float getSrTimeParam() {
        return 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ boolean isCloseSimKitReporter() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean simKitStrategyEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public C0XA1 getCommonParamsProcessor() {
        return new C0XA0();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getDefaultRateSettingsResponse() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        if (videoBitRateABManager.LJ == null) {
            videoBitRateABManager.LJI();
        }
        return videoBitRateABManager.LJ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public FeedCacheStrategyConfig getFeedCacheStrategyConfig() {
        C01GW c01gw = C1478500oZs.LIZ;
        return (FeedCacheStrategyConfig) C1478500oZs.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public LoudnessStrategyConfig getLoudnessStrategyConfig() {
        return (LoudnessStrategyConfig) C1478530oZv.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getRateSettingsResponse() {
        return VideoBitRateABManager.LJFF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public SceneLoudnessConfig getSceneLoudnessConfig() {
        return (SceneLoudnessConfig) C1483590oi5.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public SuperResolutionStrategyConfigV2 getSuperResolutionStrategyConfigV2() {
        return (SuperResolutionStrategyConfigV2) C1055540dZg.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public InterfaceC1477730oYd getVideoUrlHookHook() {
        return new InterfaceC1477730oYd() { // from class: X.0oZo
            @Override // X.InterfaceC1477730oYd
            public final String LIZ(SimVideoUrlModel simVideoUrlModel) {
                if (simVideoUrlModel != null) {
                    String strLIZJ = C0NFP.LIZJ(simVideoUrlModel.getSourceId());
                    if (C0NFP.LJFF(strLIZJ)) {
                        return strLIZJ;
                    }
                    return null;
                }
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List<InterfaceC1477240oXq> getVideoUrlHooks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oYx
            public static final C603840NmI<SimVideoUrlModel, C1477210oXn> LIZJ = new C603840NmI<>(100);

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                return C1477960oZ0.LIZ(c1477250oXr);
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "OutputCacheHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final boolean isValid() {
                return ((Boolean) C1474810oTv.LJJLIIIJJIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                SimVideoUrlModel simVideoUrlModel;
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
                    C603840NmI<SimVideoUrlModel, C1477210oXn> c603840NmI = LIZJ;
                    C1477210oXn c1477210oXnLIZLLL = c603840NmI.get(simVideoUrlModel);
                    if (c1477210oXnLIZLLL == null) {
                        c1477210oXnLIZLLL = c1477250oXr.LIZLLL(c1477270oXt);
                        c603840NmI.put(simVideoUrlModel, c1477210oXnLIZLLL);
                    }
                    return c1477210oXnLIZLLL;
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oZm
            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "PersonalVideoLocalUrlHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean isValid() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                C1478000oZ4 c1478000oZ4 = c1477250oXr.LIZJ;
                String strLIZJ = LocalVideoPlayerManager.LJ().LIZJ(C1481230oeH.LJIIIZ(c1478000oZ4.LIZ));
                if (!TextUtils.isEmpty(strLIZJ)) {
                    C201955140j.LIZ("LocalVideoCache=>play audio using cache,filePath:" + strLIZJ);
                    C1477210oXn c1477210oXn = new C1477210oXn(strLIZJ);
                    if (C0C64.LJIILLIIL().LJIJ(31744, 1, "force_software_play", true) == 1) {
                        c1477210oXn.LIZLLL = true;
                    }
                    return c1477210oXn;
                }
                return c1477250oXr.LIZJ(c1478000oZ4);
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                String strLIZJ = LocalVideoPlayerManager.LJ().LIZJ(C1481230oeH.LJIIJ(c1477270oXt.LIZ));
                if (!TextUtils.isEmpty(strLIZJ)) {
                    C201955140j.LIZ("LocalVideoCache=>play video using cache,filePath:" + strLIZJ);
                    C1477210oXn c1477210oXn = new C1477210oXn(strLIZJ);
                    if (C0C64.LJIILLIIL().LJIJ(31744, 1, "force_software_play", true) == 1) {
                        c1477210oXn.LIZLLL = true;
                    }
                    return c1477210oXn;
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        if (C300100BpY.LIZ()) {
            arrayList.add(new InterfaceC1477240oXq() { // from class: X.0okF
                public static boolean LIZJ;
                public static String LIZLLL;

                @Override // X.InterfaceC1477240oXq
                public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                    return C1477960oZ0.LIZ(c1477250oXr);
                }

                @Override // X.InterfaceC1477240oXq
                public final /* synthetic */ boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC1477240oXq
                public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                    return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
                }

                @Override // X.InterfaceC1477240oXq
                public final String getName() {
                    return "ReuseCreationMusicUrlHook";
                }

                @Override // X.InterfaceC1477240oXq
                public final /* synthetic */ boolean isValid() {
                    return true;
                }

                @Override // X.InterfaceC1477240oXq
                public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                    SimVideoUrlModel simVideoUrlModel;
                    String sourceId;
                    String urlKey;
                    boolean zIsPhotoMode;
                    Map<String, String> creationMusicIdToLocalPathMap;
                    Object c098200Yq;
                    String downloadDir;
                    Aweme awemeLLILZ;
                    C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                    Object obj = null;
                    if (c1477270oXt != null) {
                        simVideoUrlModel = c1477270oXt.LIZ;
                    } else {
                        simVideoUrlModel = null;
                    }
                    if (simVideoUrlModel == null) {
                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "input or urlModel is null");
                        return c1477250oXr.LIZLLL(c1477270oXt);
                    }
                    VideoUrlModel videoUrlModelLJIIJ = C1481230oeH.LJIIJ(c1477270oXt.LIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("input.key & music_id= ");
                    sbLIZ.append(c1477270oXt.LIZIZ);
                    sbLIZ.append("，input.urlModel.sourceId = ");
                    SimVideoUrlModel simVideoUrlModel2 = c1477270oXt.LIZ;
                    if (simVideoUrlModel2 != null) {
                        sourceId = simVideoUrlModel2.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    sbLIZ.append(sourceId);
                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("urlModel = ");
                    sbLIZ2.append(videoUrlModelLJIIJ);
                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ2));
                    if (videoUrlModelLJIIJ == null) {
                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "toVideoUrlModel is null");
                        return c1477250oXr.LIZLLL(c1477270oXt);
                    }
                    String sourceId2 = videoUrlModelLJIIJ.getSourceId();
                    if (sourceId2 != null && sourceId2.length() != 0) {
                        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                        if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(videoUrlModelLJIIJ.getSourceId())) != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("checkIsImageTextMode aweme.isPhotoMode = ");
                            sbLIZ3.append(AwemeExtKt.isPhotoMode(awemeLLILZ));
                            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ3));
                            zIsPhotoMode = AwemeExtKt.isPhotoMode(awemeLLILZ);
                        } else {
                            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "checkIsImageTextMode aweme is null, judge by params");
                            if (!((Boolean) C268120Af4.LIZ.getValue()).booleanValue()) {
                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "only in feed photo");
                            } else if (videoUrlModelLJIIJ.getDuration() == 0.0d && (urlKey = videoUrlModelLJIIJ.getUrlKey()) != null && urlKey.length() != 0) {
                                String urlKey2 = videoUrlModelLJIIJ.getUrlKey();
                                int i = 0;
                                while (true) {
                                    if (i < urlKey2.length()) {
                                        if (!Character.isDigit(urlKey2.charAt(i))) {
                                            zIsPhotoMode = false;
                                            break;
                                        }
                                        i++;
                                    } else {
                                        zIsPhotoMode = true;
                                        break;
                                    }
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("isNumber = ");
                                sbLIZ4.append(zIsPhotoMode);
                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("duration == ");
                                sbLIZ5.append(videoUrlModelLJIIJ.getDuration());
                                sbLIZ5.append(", urlKey == ");
                                sbLIZ5.append(videoUrlModelLJIIJ.getUrlKey());
                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                        if (zIsPhotoMode) {
                            List<String> urlList = videoUrlModelLJIIJ.getUrlList();
                            if (urlList != null && !urlList.isEmpty()) {
                                String str = LIZLLL;
                                if (str == null || str.length() == 0) {
                                    IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
                                    if (iMusicService != null) {
                                        downloadDir = iMusicService.getDownloadDir();
                                    } else {
                                        downloadDir = null;
                                    }
                                    LIZLLL = downloadDir;
                                }
                                String str2 = LIZLLL;
                                if (str2 != null && str2.length() != 0) {
                                    for (String str3 : urlList) {
                                        String str4 = LIZLLL;
                                        if (str4 != null && a0.LJJIIZI(str3, str4, false)) {
                                            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "url is local, don't intercept");
                                            return c1477250oXr.LIZLLL(c1477270oXt);
                                        }
                                    }
                                }
                            }
                            if (!LIZJ) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C336901Sl(null), 3);
                                LIZJ = true;
                            }
                            String str5 = c1477270oXt.LIZIZ;
                            if (str5 != null && str5.length() != 0) {
                                IMusicService iMusicService2 = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
                                if (iMusicService2 != null && (creationMusicIdToLocalPathMap = iMusicService2.getCreationMusicIdToLocalPathMap()) != null && !creationMusicIdToLocalPathMap.isEmpty()) {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("musicIdToLocalPathMap = ");
                                    sbLIZ6.append(creationMusicIdToLocalPathMap);
                                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ6));
                                    String str6 = creationMusicIdToLocalPathMap.get(str5);
                                    if (str6 != null && str6.length() != 0) {
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("return local musicPath ");
                                        sbLIZ7.append(str6);
                                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ7));
                                        if (str6 != null && str6.length() != 0) {
                                            try {
                                                c098200Yq = Boolean.valueOf(new C0VSJ(str6).exists());
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                            if (thM5exceptionOrNullimpl != null) {
                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                sbLIZ8.append("checkFilePath fail, e = ");
                                                sbLIZ8.append(thM5exceptionOrNullimpl);
                                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ8));
                                                C1AF0.LJ(thM5exceptionOrNullimpl);
                                            }
                                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                                obj = c098200Yq;
                                            }
                                            Boolean bool = (Boolean) obj;
                                            if (bool != null && bool.booleanValue()) {
                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                sbLIZ9.append("use local file, path = ");
                                                sbLIZ9.append(str6);
                                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ9));
                                                C1477210oXn c1477210oXn = new C1477210oXn(str6);
                                                LJ(c1477270oXt.LIZIZ, true);
                                                return c1477210oXn;
                                            }
                                        }
                                    } else {
                                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                        sbLIZ10.append("music id ");
                                        sbLIZ10.append(str5);
                                        sbLIZ10.append(" don't have local cache");
                                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", C2188811AlT.LIZIZ(sbLIZ10));
                                    }
                                } else {
                                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "musicIdToLocalPathMap is empty");
                                }
                            } else {
                                C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "awemeId == null");
                            }
                            C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "don't find local cache or file not exists");
                            LJ(c1477270oXt.LIZIZ, false);
                            return c1477250oXr.LIZLLL(c1477270oXt);
                        }
                    } else {
                        C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "checkIsImageTextMode sourceId is null");
                    }
                    C201955140j.LIZIZ("ReuseCreationMusicUrlHook", "not image text mode, don't intercept");
                    return c1477250oXr.LIZLLL(c1477270oXt);
                }

                public static void LJ(String str, boolean z) {
                    int i;
                    if (!((Boolean) C283530B9j.LIZIZ.getValue()).booleanValue()) {
                        return;
                    }
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C336801Sk(i, str, null), 3);
                }
            });
        }
        arrayList.add(C1477180oXk.LIZIZ);
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oZn
            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "SplashAdLocalUrlHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean isValid() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                String strLJI;
                boolean z;
                C1478000oZ4 c1478000oZ4 = c1477250oXr.LIZJ;
                VideoUrlModel videoUrlModelLJIIIZ = C1481230oeH.LJIIIZ(c1478000oZ4.LIZ);
                if (videoUrlModelLJIIIZ != null) {
                    String urlKey = videoUrlModelLJIIIZ.getUrlKey();
                    String fileHash = videoUrlModelLJIIIZ.getFileHash();
                    if (!TextUtils.isEmpty(videoUrlModelLJIIIZ.getaK()) && videoUrlModelLJIIIZ.getaK() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    strLJI = C1030680cva.LJI(urlKey, fileHash, z);
                } else {
                    strLJI = "";
                }
                if (!TextUtils.isEmpty(strLJI)) {
                    return new C1477210oXn(strLJI);
                }
                return c1477250oXr.LIZJ(c1478000oZ4);
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                Aweme awemeLLILZ;
                List<LongVideo> longVideos;
                Video video;
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                VideoUrlModel videoUrlModelLJIIJ = C1481230oeH.LJIIJ(c1477270oXt.LIZ);
                String sourceId = videoUrlModelLJIIJ.getSourceId();
                double duration = videoUrlModelLJIIJ.getDuration();
                boolean z = true;
                if (!TextUtils.isEmpty(sourceId) && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(sourceId)) != null && (longVideos = awemeLLILZ.getLongVideos()) != null && !longVideos.isEmpty()) {
                    for (LongVideo longVideo : longVideos) {
                        if (longVideo != null && (video = longVideo.getVideo()) != null && video.getDuration() == duration) {
                            return c1477250oXr.LIZLLL(c1477270oXt);
                        }
                    }
                }
                String urlKey = videoUrlModelLJIIJ.getUrlKey();
                String fileHash = videoUrlModelLJIIJ.getFileHash();
                if (TextUtils.isEmpty(videoUrlModelLJIIJ.getaK()) || videoUrlModelLJIIJ.getaK() == null) {
                    z = false;
                }
                String strLJI = C1030680cva.LJI(urlKey, fileHash, z);
                if (!TextUtils.isEmpty(strLJI)) {
                    return new C1477210oXn(strLJI);
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        arrayList.add(C1477920oYw.LIZIZ);
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oYy
            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                return C1477960oZ0.LIZ(c1477250oXr);
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "ForceVideoUrlHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean isValid() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                SimVideoUrlModel simVideoUrlModel;
                String[] strArr;
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    if (sourceId != null && u.LJIIZILJ(sourceId, "_sub", false) && (strArr = c1477270oXt.LIZJ) != null && strArr.length != 0) {
                        return new C1477210oXn(strArr[0]);
                    }
                    return c1477250oXr.LIZLLL(c1477270oXt);
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oXm
            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                return C1477960oZ0.LIZ(c1477250oXr);
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "SingleBitRateUrlHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final boolean isValid() {
                return ((Boolean) C1474810oTv.LJJLIIIJJI.getValue()).booleanValue() && ((Boolean) C1474810oTv.LJJLL.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                if (c1477270oXt != null) {
                    SimVideoUrlModel simVideoUrlModel = c1477270oXt.LIZ;
                    Boolean boolValueOf = Boolean.valueOf(c1477270oXt.LIZLLL);
                    if (simVideoUrlModel != null) {
                        List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
                        if (bitRate != null && bitRate.isEmpty()) {
                            return C1477150oXh.LIZ(this, simVideoUrlModel.getUrlList(), simVideoUrlModel, null, boolValueOf);
                        }
                        List<SimBitRate> bitRate2 = simVideoUrlModel.getBitRate();
                        if (bitRate2 != null && bitRate2.size() == 1) {
                            SimBitRate simBitRate = (SimBitRate) ListProtector.get(simVideoUrlModel.getBitRate(), 0);
                            return C1477150oXh.LIZ(this, simBitRate.urlList(), simVideoUrlModel, simBitRate, boolValueOf);
                        }
                    }
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        arrayList.add(new InterfaceC1477240oXq() { // from class: X.0oXj
            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
                return C1477960oZ0.LIZ(c1477250oXr);
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1477240oXq
            public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
                return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
            }

            @Override // X.InterfaceC1477240oXq
            public final String getName() {
                return "SelectBitrateFromMemoryCacheUrlHook";
            }

            @Override // X.InterfaceC1477240oXq
            public final boolean isValid() {
                return ((Boolean) C1474810oTv.LJJLIIIJL.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1477240oXq
            public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
                SimVideoUrlModel simVideoUrlModel;
                C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
                if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
                    Boolean boolValueOf = Boolean.valueOf(c1477270oXt.LIZLLL);
                    InterfaceC1476030oVt interfaceC1476030oVtLIZ = C1475980oVo.LIZ(simVideoUrlModel, EnumC1476080oVy.FromMemory);
                    if (interfaceC1476030oVtLIZ.LIZJ() > 0) {
                        List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
                        SimBitRate simBitRate = null;
                        if (bitRate != null) {
                            Iterator<SimBitRate> it2 = bitRate.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                SimBitRate next = it2.next();
                                if (Intrinsics.LJFF(next.getUrlKey(), interfaceC1476030oVtLIZ.key())) {
                                    simBitRate = next;
                                    break;
                                }
                            }
                            SimBitRate simBitRate2 = simBitRate;
                            if (simBitRate2 != null) {
                                return C1477150oXh.LIZ(this, simBitRate2.urlList(), simVideoUrlModel, simBitRate2, boolValueOf);
                            }
                        }
                    }
                    return c1477250oXr.LIZLLL(c1477270oXt);
                }
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
        });
        arrayList.add(C1477190oXl.LIZIZ);
        return arrayList;
    }

    public int getBitrateBusinessType() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "bitrate_modularization_experiment", true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public double getBitrateSwitchThreshold() {
        if (C1786206z6.LIZ()) {
            return 10000.1d;
        }
        return C0C64.LJIILLIIL().LJIIL(0.75d, 31744, "bitrate_switch_threshold", true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getDefaultCDNTimeoutTime() {
        return (int) C0C64.LJIILLIIL().LJIJJLI(31744, 2400000L, "cdn_url_timeout_time", true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getLastNetworkSpeed() {
        return SharePrefCache.inst().getLastUsableNetworkSpeed().LIZ().intValue();
    }

    public double getSpeedInBitPerSec() {
        return C1479130oat.LJIIIIZZ().getSpeed();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isUseLastNetworkSpeed() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_record_last_network_speed_enabled", true, true);
    }

    public InterfaceC1478540oZw getAutoBitrateSetStrategy() {
        return new InterfaceC1478540oZw() { // from class: X.0oZp
            public static final List<C1478490oZr> LIZIZ = Collections.singletonList(new InterfaceC1478540oZw() { // from class: X.0oZr
            });
        };
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public InterfaceC1477620oYS getForceSuperResolutionListener() {
        return this.mSrListener;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public InterfaceC1477050oXX getSuperResolutionStrategy() {
        return C1477280oXu.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean checkIsBytevc1InCache(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            return simVideoUrlModel.isBytevc1();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public String getIncompleteLocalVideoPath(SimVideoUrlModel simVideoUrlModel) {
        if (InterfaceC288420BSe.LIZ && simVideoUrlModel != null) {
            String strLIZIZ = C0NFP.LIZIZ(-1, simVideoUrlModel.getSourceId());
            if (C0NFP.LJ(strLIZIZ)) {
                return strLIZIZ;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public String getLocalVideoPath(SimVideoUrlModel simVideoUrlModel) {
        if (InterfaceC2524109up.LIZ && simVideoUrlModel != null) {
            String strLIZJ = C0NFP.LIZJ(simVideoUrlModel.getSourceId());
            if (C0NFP.LJFF(strLIZJ)) {
                return strLIZJ;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isSkipSelectBitrate(SimVideoUrlModel simVideoUrlModel) {
        if (InterfaceC2524109up.LIZ && simVideoUrlModel != null && C0NFP.LJFF(C0NFP.LIZJ(simVideoUrlModel.getSourceId()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean onPreGetProperBitrate(SimVideoUrlModel simVideoUrlModel) {
        boolean z;
        String urlKey = simVideoUrlModel.getUrlKey();
        String fileHash = simVideoUrlModel.getFileHash();
        if (!TextUtils.isEmpty(simVideoUrlModel.getaK()) && simVideoUrlModel.getaK() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(C1030680cva.LJI(urlKey, fileHash, z))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public void setForceSuperResolutionListener(InterfaceC1477620oYS interfaceC1477620oYS) {
        this.mSrListener = interfaceC1477620oYS;
    }

    public void setInitialSpeed(double d) {
        C1479130oat.LJIIIIZZ().LIZLLL(d);
    }
}
