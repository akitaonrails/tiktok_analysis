package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0J0B;
import X.C0J0Q;
import X.C1090540eU8;
import X.C1094620eai;
import X.C1161920gLG;
import X.C1479130oat;
import X.C1519790peT;
import X.C1CC2;
import X.C2355009Kq;
import X.C467390IUn;
import X.C582130MsN;
import X.C792590V7h;
import X.C802400Vdm;
import X.EnumC1094630eaj;
import X.InterfaceC1090510eU5;
import X.InterfaceC792210V5v;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ab.FollowTopliveBubbleConfig;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes24.dex */
public class LiveHostConfig implements IHostConfig {
    public final C1519790peT LL = new InterfaceC1090510eU5() { // from class: X.0peT
        @Override // X.InterfaceC1090510eU5
        public final void isMockPopup() {
        }

        @Override // X.InterfaceC1090510eU5
        public final Map<String, k> LIZ() {
            n liveSettingData;
            k kVarLJJIIZ;
            new Object() { // from class: X.0peU
            }.getClass();
            ITtmockService iTtmockService = (ITtmockService) ServiceManager.get().getService(ITtmockService.class, false, false);
            if (iTtmockService == null || (liveSettingData = iTtmockService.getLiveSettingData()) == null) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Set<String> setLJJIJIL = liveSettingData.LJJIJIL();
            if (setLJJIJIL == null) {
                return concurrentHashMap;
            }
            for (String str : setLJJIJIL) {
                if (str != null && (kVarLJJIIZ = liveSettingData.LJJIIZ(str)) != null) {
                    concurrentHashMap.put(str, kVarLJJIIZ);
                }
            }
            return concurrentHashMap;
        }

        @Override // X.InterfaceC1090510eU5
        public final float LIZIZ() {
            return C1697630uHJ.LIZ();
        }

        @Override // X.InterfaceC1090510eU5
        public final float LIZJ() {
            return C1697630uHJ.LIZIZ();
        }

        @Override // X.InterfaceC1090510eU5
        public final boolean LIZLLL() {
            return SharePrefCache.inst().isEnableMessagePb2Json().LIZ().booleanValue();
        }
    };
    public volatile boolean LLILLJJLI;

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final synchronized void d40() {
        if (this.LLILLJJLI) {
            return;
        }
        if (!((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "live_enable_launch_parasitic_modules")).booleanValue()) {
            this.LLILLJJLI = true;
            return;
        }
        try {
            Iterator it2 = ServiceManager.get().getServices(ILiveParasiticModuleLaunchService.class).iterator();
            while (it2.hasNext()) {
                ((ILiveParasiticModuleLaunchService) it2.next()).launch();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            HashMap map = new HashMap();
            map.put("error_msg", th.getMessage());
            C1CC2.LJII(1, "ttlive_live_launch_parasitic_modules", map);
        }
        this.LLILLJJLI = true;
        return;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final Set<String> Sa2() {
        Set<String> set;
        InterfaceC792210V5v interfaceC792210V5v = (InterfaceC792210V5v) C792590V7h.LIZ(InterfaceC792210V5v.class);
        if (interfaceC792210V5v == null || interfaceC792210V5v.getConfig() == null || (set = interfaceC792210V5v.getConfig().LIZ) == null || set.isEmpty()) {
            return null;
        }
        return set;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C1090540eU8 VQ() {
        C1090540eU8 c1090540eU8 = new C1090540eU8();
        RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.LJFF.LIZ;
        double dMax = 0.0d;
        if (rateSettingsResponse != null) {
            double speed = C1479130oat.LJIIIIZZ().getSpeed();
            AutoBitrateSet autoBitrateSetLive = rateSettingsResponse.getAutoBitrateSetLive();
            if (speed > 0.0d && autoBitrateSetLive != null) {
                dMax = Math.max((autoBitrateSetLive.firstParam * speed * speed * speed) + (autoBitrateSetLive.secondParam * speed * speed) + (autoBitrateSetLive.thirdParam * speed) + autoBitrateSetLive.fourthParam, autoBitrateSetLive.minBitrate);
            }
        }
        int iLIZLLL = C582130MsN.LIZ().LJ().LIZLLL();
        c1090540eU8.LIZ = dMax;
        c1090540eU8.LIZIZ = iLIZLLL;
        return c1090540eU8;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void dz1() {
        Npth.addAttachUserData(new AttachUserData() { // from class: X.0Ijc
            @Override // com.bytedance.crash.AttachUserData
            public final Map getUserData(CrashType crashType) {
                String str;
                if (C07MW.LIZ()) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    if (iHostAction.isLivePlayActivity(abstractC1387200mCcLIZIZ) || iHostAction.isLivePlayRootFragment(abstractC1387200mCcLIZIZ)) {
                        InterfaceC1106030et7.y7.LJFF(Boolean.TRUE);
                    }
                } else if (C2214201BlK.LJFF() instanceof LivePlayActivity) {
                    InterfaceC1106030et7.y7.LJFF(Boolean.TRUE);
                }
                if (LiveSlardarTagSetting.INSTANCE.getCurrentValue().enable) {
                    Map<String, String> mapJh0 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).jh0();
                    Map<String, String> broadcastTag = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastTag();
                    HashMap map = new HashMap(32);
                    C01GW c01gw = C474750IjZ.LIZ;
                    if (((HashMap) c01gw.getValue()).size() != 0) {
                        if (Boolean.parseBoolean((String) ((HashMap) c01gw.getValue()).get("is_anchor"))) {
                            if (broadcastTag != null) {
                                map.putAll(broadcastTag);
                            }
                        } else if (mapJh0 != null) {
                            map.putAll(mapJh0);
                        }
                        map.put("room_type", C465520INi.LIZ.getBroadcastScene());
                        map.put("live_sdk_version", "4510");
                        int i = C474750IjZ.LIZLLL;
                        if (i < 0) {
                            str = "invalid count";
                        } else if (i < 25) {
                            str = "[0, 25)";
                        } else if (i < 50) {
                            str = "[25, 50)";
                        } else if (i < 100) {
                            str = "[50, 100)";
                        } else if (i < 500) {
                            str = "[100, 500)";
                        } else if (i < 1000) {
                            str = "[500, 1K)";
                        } else if (i < 5000) {
                            str = "[1K, 5K)";
                        } else if (i < 10000) {
                            str = "[5K, 10K)";
                        } else if (i < 50000) {
                            str = "[10K, 50K)";
                        } else if (i < 100000) {
                            str = "[50K, 100K)";
                        } else if (i < 500000) {
                            str = "[100K, 500K)";
                        } else if (i < 1000000) {
                            str = "[500K, 1M)";
                        } else {
                            str = "[1M, +∞)";
                        }
                        map.put("room_user_count", str);
                        List<E> list = ((C1101510elp) C474750IjZ.LIZIZ.getValue()).LIZIZ;
                        int i2 = 0;
                        if (list != 0) {
                            int i3 = 0;
                            for (Object obj : list) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("live_message_");
                                    sbLIZ.append(i4);
                                    map.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        List<E> list2 = ((C1101510elp) C474750IjZ.LIZJ.getValue()).LIZIZ;
                        if (list2 != 0) {
                            for (Object obj2 : list2) {
                                int i5 = i2 + 1;
                                if (i2 >= 0) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("live_log_");
                                    sbLIZ2.append(i5);
                                    map.put(C2188811AlT.LIZIZ(sbLIZ2), obj2);
                                    i2 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        map.putAll((HashMap) C474750IjZ.LIZ.getValue());
                    }
                    Npth.addTags(map);
                }
                return null;
            }
        }, CrashType.ALL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final boolean qD2() {
        LivePodcastResponse.ResponseData responseData;
        LivePodcastResponse.ResponseData responseData2 = (LivePodcastResponse.ResponseData) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.ResponseData.class, "live_podcast_response");
        if (responseData2 != null && Boolean.valueOf(responseData2.canBeLivePodcast).booleanValue()) {
            return responseData2.canBeLivePodcast;
        }
        LivePodcastResponse livePodcastResponse = (LivePodcastResponse) C2355009Kq.LJIILIIL(-1, LivePodcastResponse.class, "live_podcast_response");
        if (livePodcastResponse == null || (responseData = livePodcastResponse.data) == null || !Boolean.valueOf(responseData.canBeLivePodcast).booleanValue()) {
            return false;
        }
        return responseData.canBeLivePodcast;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final int Ve() {
        boolean zLJJJJZI = ComplianceServiceProvider.LJIL().LJJJJZI();
        boolean zLJIJJLI = ComplianceServiceProvider.LJIIJJI().LJIJJLI();
        if (zLJJJJZI) {
            return zLJIJJLI ? 1 : 2;
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C467390IUn mB2() {
        FollowTopliveBubbleConfig followTopliveBubbleConfigLIZ = C0J0B.LIZ();
        return new C467390IUn(followTopliveBubbleConfigLIZ.enable, followTopliveBubbleConfigLIZ.skylightInsert, followTopliveBubbleConfigLIZ.toplivesInsert);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final InterfaceC1090510eU5 i32() {
        return this.LL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void L80(String str, String str2) {
        if (str2 == null) {
            C802400Vdm.LIZLLL(str);
        } else {
            Npth.addImportTag(str, str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void Rt0(String str, String str2) {
        if (str2 == null) {
            Npth.removeTag(str);
        } else {
            Npth.addTag(str, str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void AO0(String str, String str2, boolean z) {
        C0J0Q c0j0q;
        if (z) {
            c0j0q = C0J0Q.ANCHOR;
        } else {
            c0j0q = C0J0Q.LIVE;
        }
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).zG1(c0j0q, str, str2, "performance");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void pK1(String str, Object obj, int i) {
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        C0J0Q.Companion.getClass();
        C0J0Q c0j0q = C0J0Q.LIVE;
        EnumC1094630eaj.Companion.getClass();
        iLiveFeatureCenterService.zq1(c0j0q, C1094620eai.LIZ("default"), str, obj, i);
    }
}
