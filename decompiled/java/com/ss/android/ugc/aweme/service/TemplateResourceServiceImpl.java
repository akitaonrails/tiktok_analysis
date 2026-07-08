package com.ss.android.ugc.aweme.service;

import X.AnonymousClass0962;
import X.C08QA;
import X.C08SA;
import X.C09BH;
import X.C09JN;
import X.C0B7T;
import X.C0B7W;
import X.C0C64;
import X.C0CHQ;
import X.C0CIJ;
import X.C0L41;
import X.C0L42;
import X.C0L7K;
import X.C0L7L;
import X.C0L9B;
import X.C0LCY;
import X.C0LE8;
import X.C0VSJ;
import X.C118300cf;
import X.C11JF;
import X.C11NZ;
import X.C11RK;
import X.C11S5;
import X.C123100dR;
import X.C1398350mUb;
import X.C13LP;
import X.C13RH;
import X.C1403010mc7;
import X.C1416990myf;
import X.C1418100n0S;
import X.C1419810n3D;
import X.C1428730nHb;
import X.C1428780nHg;
import X.C1428790nHh;
import X.C1428840nHm;
import X.C1428920nHu;
import X.C1429050nI7;
import X.C1429160nII;
import X.C1429200nIM;
import X.C1701940uOG;
import X.C19221910Hx;
import X.C19858912mx;
import X.C19859212n0;
import X.C20186013yc;
import X.C201955140j;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2200151B8z;
import X.C2268941DrQ;
import X.C2286708xd;
import X.C259800zU;
import X.C260650AJj;
import X.C268160Af8;
import X.C296620Bjw;
import X.C301650Bs3;
import X.C311170CHr;
import X.C311200CHu;
import X.C516201zk;
import X.C5181020d;
import X.C532330KuF;
import X.C533070KvR;
import X.C533090KvT;
import X.C573580Mea;
import X.C573920Mf8;
import X.EnumC1412640mre;
import X.EnumC539100LCi;
import X.InterfaceC1416880myU;
import X.InterfaceC1416890myV;
import X.InterfaceC1428880nHq;
import X.InterfaceC1487280oo2;
import X.InterfaceC1623990sMX;
import X.InterfaceC1635410sex;
import X.InterfaceC420801kM;
import X.InterfaceC500500Jk0;
import Y.AfS157S0200000_22;
import Y.AfS177S0100000_8;
import Y.AfS191S0100000_22;
import Y.AfS199S0100000_30;
import Y.AkS328S0200000_22;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.cutsame.resourcefetcher.NetworkFileFetcher;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.TemplateInfo;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.resource.TemplateApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.TemplateResourceServiceImpl;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.AssetCondition;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS3S2400000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import lgo.a;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateResourceServiceImpl implements ITemplateResourceService {
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJIIJ() {
        C1416990myf.LIZ.getClass();
        ((LinkedHashMap) ((C533070KvR) C1416990myf.LIZJ.getValue()).LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final String getRegion() {
        if (!((Boolean) C0B7T.LIZ.getValue()).booleanValue()) {
            return null;
        }
        C1403010mc7.LIZ.getRegionService();
        return C20186013yc.LIZ();
    }

    public static boolean LJIILJJIL(AVMusic aVMusic) {
        String strLJJLIIIJ;
        List<String> urlList;
        FullSongUrlStruct fullSongUrl;
        List<String> urlList2;
        FullSongUrlStruct fullSongUrl2;
        List<String> urlList3;
        List<String> urlList4;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPrivateClipInFullSong: playerUrl = ");
        UrlModel playUrl = aVMusic.getPlayUrl();
        String strLJJLIIIJ2 = null;
        if (playUrl != null && (urlList4 = playUrl.getUrlList()) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(urlList4, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", isFullSong = ");
        sbLIZ.append(aVMusic.getIsFullSong());
        sbLIZ.append(", fullSongUrl: ");
        FullSongDetail fullSongDetail = aVMusic.getFullSongDetail();
        if (fullSongDetail != null && (fullSongUrl2 = fullSongDetail.getFullSongUrl()) != null && (urlList3 = fullSongUrl2.getUrlList()) != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(urlList3, null, null, null, 0, null, null, 63);
        }
        sbLIZ.append(strLJJLIIIJ2);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        UrlModel playUrl2 = aVMusic.getPlayUrl();
        if (playUrl2 != null && (urlList = playUrl2.getUrlList()) != null && !urlList.isEmpty()) {
            if (!aVMusic.getIsFullSong()) {
                return false;
            }
            FullSongDetail fullSongDetail2 = aVMusic.getFullSongDetail();
            if (fullSongDetail2 != null && (fullSongUrl = fullSongDetail2.getFullSongUrl()) != null && (urlList2 = fullSongUrl.getUrlList()) != null && !urlList2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final C532330KuF LJIIIIZZ(String str) {
        C1416990myf.LIZ.getClass();
        return (C532330KuF) ((LinkedHashMap) ((C533070KvR) C1416990myf.LIZJ.getValue()).LIZ).get(str);
    }

    public static void LJIILIIL(AVMusic aVMusic, String str) {
        if (C301650Bs3.LIZ()) {
            long jLongValue = 0;
            if (aVMusic.id < 0 && str != null && str.length() != 0) {
                aVMusic.setMusicId(str);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                }
                aVMusic.setLocalMusicId(jLongValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJII(InterfaceC1635410sex interfaceC1635410sex, String str, C573580Mea c573580Mea) {
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.LIZIZ(str, null, c573580Mea);
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LIZJ(String str, Pair pair, int i, AwS3S2400000_8 awS3S2400000_8, AwS587S0100000_8 awS587S0100000_8) {
        TemplateApi templateApi = C1416990myf.LIZIZ;
        String effectSDKVersion = C0CHQ.LIZ().LJJJ().getEffectSDKVersion();
        String str2 = (String) pair.getFirst();
        C1429050nI7.LIZ.getClass();
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        String str3 = (String) pair.getSecond();
        C0CHQ.LIZ().getApplicationService();
        String strLIZIZ = C19221910Hx.LIZIZ();
        String strLIZJ = C13RH.LIZJ();
        C1416990myf.LIZ.getClass();
        templateApi.requestMergedTemplateDetail(str, i, effectSDKVersion, str2, "2", str3, "android", strLIZIZ, strLIZJ, new HashMap<>()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS157S0200000_22(awS587S0100000_8, awS3S2400000_8, 12), new C516201zk(awS587S0100000_8, 257));
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJFF(Context context, CutSource cutSource, final C1428840nHm c1428840nHm, LifecycleOwner lifecycleOwner, Integer num) {
        C0L9B c0l9b;
        EnumC539100LCi enumC539100LCi;
        EnumC539100LCi enumC539100LCi2;
        if (C533090KvT.LIZIZ.LJFF() && u.LJJIIJZLJL(cutSource.value, "/", false)) {
            C0VSJ c0vsj = new C0VSJ(cutSource.value);
            File parentFile = c0vsj.getParentFile();
            C08SA.LIZJ(c0vsj, parentFile);
            C1419810n3D.LIZ.getClass();
            C0LE8.LIZIZ(C1419810n3D.LIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C08QA.LJIJI(c0vsj));
            sbLIZ.append("/NLETemplate.json");
            C0VSJ c0vsj2 = new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchTemplateDetailFromZip: nleJsonFile= ");
            sbLIZ2.append(c0vsj2);
            C2188811AlT.LIZIZ(sbLIZ2);
            NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(C09BH.LJI(c0vsj2, Charsets.UTF_8));
            if (nLETemplateModelRestore != null) {
                TemplateInfo templateInfo = nLETemplateModelRestore.getTemplateInfo();
                if (templateInfo != null) {
                    templateInfo.clearMutableItems();
                }
                cutSource = new CutSource(nLETemplateModelRestore.store(), CutSourceType.JSON);
            }
        }
        if (((Boolean) C0B7W.LIZ.getValue()).booleanValue() && c1428840nHm.LJIIIIZZ) {
            C2268941DrQ c2268941DrQ = C2268941DrQ.LIZ;
            C0LE8.LIZ.getClass();
            C2268941DrQ.LIZIZ = C0LE8.LIZ().templateCacheDir;
        }
        NLEPrepareListener nLEPrepareListener = new NLEPrepareListener() { // from class: X.0nHk
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                VecNLETrackSPtr tracks;
                VecNLETrackSPtr tracks2;
                C1428840nHm c1428840nHm2 = c1428840nHm;
                if (c1428840nHm2.LIZJ) {
                    if (c1428840nHm2.LJII) {
                        if (nLETemplateModel != null && (tracks2 = nLETemplateModel.getTracks()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (NLETrack nLETrack : tracks2) {
                                if (C351220Dpo.LLILLL(nLETrack)) {
                                    arrayList.add(nLETrack);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                nLETemplateModel.removeTrack((NLETrack) it2.next());
                            }
                        }
                    } else if (nLETemplateModel != null && (tracks = nLETemplateModel.getTracks()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (NLETrack nLETrack2 : tracks) {
                            if (nLETrack2.getTrackType() == NLETrackType.AUDIO) {
                                arrayList2.add(nLETrack2);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            nLETemplateModel.removeTrack((NLETrack) it3.next());
                        }
                    }
                }
                NLEPrepareListener nLEPrepareListener2 = c1428840nHm.LJIIIZ;
                if (nLEPrepareListener2 != null) {
                    nLEPrepareListener2.onPreSuccess(nLETemplateModel);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                NLEPrepareListener nLEPrepareListener2 = c1428840nHm.LJIIIZ;
                if (nLEPrepareListener2 != null) {
                    nLEPrepareListener2.onSuccess(nLETemplateModel);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str) {
                NLEPrepareListener nLEPrepareListener2 = c1428840nHm.LJIIIZ;
                if (nLEPrepareListener2 != null) {
                    nLEPrepareListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str) {
                NLEPrepareListener nLEPrepareListener2 = c1428840nHm.LJIIIZ;
                if (nLEPrepareListener2 != null) {
                    nLEPrepareListener2.onProgress(f, str);
                }
            }
        };
        NLETemplateSource nLETemplateSource = new NLETemplateSource(context, cutSource, c1428840nHm.LIZ);
        NetworkFileFetcher c19859212n0 = c1428840nHm.LIZLLL;
        if (c19859212n0 == null) {
            c19859212n0 = new C19859212n0(new C19858912mx(context));
        }
        nLETemplateSource.LJIIIIZZ(c19859212n0);
        if (((Boolean) C268160Af8.LIZ.getValue()).booleanValue()) {
            a.LIZIZ.LIZ().LIZJ(lifecycleOwner, "TemplateResourceServiceImpl#downloadTemplate", new AwS566S0100000_22(nLETemplateSource, 235));
        }
        NLEModelDownloader nLEModelDownloaderLIZ = c1428840nHm.LJ;
        if (nLEModelDownloaderLIZ != null || ((enumC539100LCi2 = c1428840nHm.LJFF) != null && (nLEModelDownloaderLIZ = C2268941DrQ.LIZ.LIZ(enumC539100LCi2)) != null)) {
            nLETemplateSource.LJIIJ(nLEModelDownloaderLIZ);
        }
        ICutReporter iCutReporter = c1428840nHm.LJI;
        if (iCutReporter != null) {
            nLETemplateSource.LJIIIZ(iCutReporter);
        }
        Boolean bool = c1428840nHm.LIZIZ;
        if (bool != null) {
            nLETemplateSource.LJFF(bool.booleanValue());
        }
        ITemplateResourceDownloaderService iTemplateResourceDownloaderService = AnonymousClass0962.LIZ;
        if (iTemplateResourceDownloaderService != null) {
            if (iTemplateResourceDownloaderService.LIZIZ()) {
                nLETemplateSource.LJI();
                nLETemplateSource.LJIIJJI(iTemplateResourceDownloaderService.LIZ());
            }
            if (num != null && num.intValue() > 0) {
                nLETemplateSource.LJII(num);
            } else {
                if (c1428840nHm.LJIIIIZZ) {
                    c0l9b = C0L9B.TT;
                } else if (!c1428840nHm.LJII && (enumC539100LCi = c1428840nHm.LJFF) != EnumC539100LCi.CUTSAME) {
                    if (enumC539100LCi == EnumC539100LCi.UGC) {
                        c0l9b = C0L9B.TT;
                    }
                } else {
                    c0l9b = C0L9B.CC;
                }
                if (c0l9b != null) {
                    nLETemplateSource.LJII(Integer.valueOf(c0l9b.getValue()));
                }
            }
        }
        nLETemplateSource.LJ();
        nLETemplateSource.LIZ(nLEPrepareListener);
        nLETemplateSource.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJIIIZ(Context context, String str, C1428840nHm c1428840nHm, LifecycleOwner lifecycleOwner, Integer num) {
        LJFF(context, new CutSource(str, CutSourceType.URL), c1428840nHm, lifecycleOwner, num);
    }

    public final void LJIIL(final Context context, String str, final String str2, final String str3, final InterfaceC1428880nHq interfaceC1428880nHq) {
        Context context2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadMusicFromUrl: musicUrl = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(str2);
        sbLIZ.append(", musicName = ");
        sbLIZ.append(str3);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1428880nHq != null) {
            interfaceC1428880nHq.LJ();
        }
        final boolean z = false;
        if (str != null && str.length() != 0) {
            String downloadDir = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getDownloadDir();
            String downloadFileName = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getDownloadFileName(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(downloadDir);
            sbLIZ2.append(downloadFileName);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("downloadMusicFromUrl: localMusicPath = ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", exist? ");
            sbLIZ3.append(C2286708xd.LIZJ(strLIZIZ));
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
            if (C2286708xd.LIZJ(strLIZIZ)) {
                C1428920nHu.LIZ.getClass();
                AVMusic aVMusicLIZ = C1428920nHu.LIZ(context, strLIZIZ, str2, str3);
                if (aVMusicLIZ == null) {
                    if (interfaceC1428880nHq != null) {
                        interfaceC1428880nHq.LIZJ();
                        interfaceC1428880nHq.LIZ(-10002, "");
                        return;
                    }
                    return;
                }
                LJIILIIL(aVMusicLIZ, str2);
                if (interfaceC1428880nHq != null) {
                    interfaceC1428880nHq.LJI();
                    interfaceC1428880nHq.LJFF(aVMusicLIZ, strLIZIZ, true, z);
                    return;
                }
                return;
            }
            if (context == null) {
                context2 = C0CHQ.LIZ;
            } else {
                context2 = context;
            }
            DownloadTask downloadTaskWith = C2200151B8z.with(context2);
            downloadTaskWith.url(str);
            downloadTaskWith.savePath(downloadDir);
            downloadTaskWith.name(downloadFileName);
            downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0nHt
                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String targetFilePath;
                    boolean z2;
                    super.onSuccessed(downloadInfo);
                    if (downloadInfo != null) {
                        targetFilePath = downloadInfo.getTargetFilePath();
                    } else {
                        targetFilePath = null;
                    }
                    if (targetFilePath != null && targetFilePath.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && C2286708xd.LIZJ(targetFilePath)) {
                        C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                        String str4 = str2;
                        String str5 = str3;
                        Context context3 = context;
                        c1428920nHu.getClass();
                        AVMusic aVMusicLIZ2 = C1428920nHu.LIZ(context3, targetFilePath, str4, str5);
                        if (aVMusicLIZ2 == null) {
                            InterfaceC1428880nHq interfaceC1428880nHq2 = interfaceC1428880nHq;
                            if (interfaceC1428880nHq2 != null) {
                                interfaceC1428880nHq2.LIZJ();
                            }
                            InterfaceC1428880nHq interfaceC1428880nHq3 = interfaceC1428880nHq;
                            if (interfaceC1428880nHq3 != null) {
                                interfaceC1428880nHq3.LIZ(-10002, "");
                                return;
                            }
                            return;
                        }
                        TemplateResourceServiceImpl templateResourceServiceImpl = this;
                        String str6 = str2;
                        templateResourceServiceImpl.getClass();
                        TemplateResourceServiceImpl.LJIILIIL(aVMusicLIZ2, str6);
                        InterfaceC1428880nHq interfaceC1428880nHq4 = interfaceC1428880nHq;
                        if (interfaceC1428880nHq4 != null) {
                            interfaceC1428880nHq4.LJI();
                        }
                        InterfaceC1428880nHq interfaceC1428880nHq5 = interfaceC1428880nHq;
                        if (interfaceC1428880nHq5 != null) {
                            interfaceC1428880nHq5.LJFF(aVMusicLIZ2, targetFilePath, false, z);
                            return;
                        }
                        return;
                    }
                    InterfaceC1428880nHq interfaceC1428880nHq6 = interfaceC1428880nHq;
                    if (interfaceC1428880nHq6 != null) {
                        interfaceC1428880nHq6.LIZJ();
                    }
                    InterfaceC1428880nHq interfaceC1428880nHq7 = interfaceC1428880nHq;
                    if (interfaceC1428880nHq7 != null) {
                        interfaceC1428880nHq7.LIZ(-10001, "");
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    Integer numValueOf;
                    super.onFailed(downloadInfo, baseException);
                    InterfaceC1428880nHq interfaceC1428880nHq2 = interfaceC1428880nHq;
                    if (interfaceC1428880nHq2 != null) {
                        interfaceC1428880nHq2.LIZJ();
                    }
                    InterfaceC1428880nHq interfaceC1428880nHq3 = interfaceC1428880nHq;
                    if (interfaceC1428880nHq3 != null) {
                        String errorMessage = null;
                        if (baseException != null) {
                            numValueOf = Integer.valueOf(baseException.getErrorCode());
                            errorMessage = baseException.getErrorMessage();
                        } else {
                            numValueOf = null;
                        }
                        interfaceC1428880nHq3.LIZ(numValueOf, errorMessage);
                    }
                }
            });
            downloadTaskWith.download();
            return;
        }
        if (interfaceC1428880nHq != null) {
            interfaceC1428880nHq.LIZJ();
            interfaceC1428880nHq.LIZ(null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LIZIZ(InterfaceC1635410sex interfaceC1635410sex, String str, AssetType assetType, boolean z, boolean z2, IFetchAssetItemInfo iFetchAssetItemInfo) {
        String str2;
        Long lLJIILIIL;
        MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters;
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        if (C296620Bjw.LIZ()) {
            str2 = null;
        } else {
            str2 = str;
        }
        if (C296620Bjw.LIZ()) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo = new MixedItemAssetsRequestBodyInfo(Collections.singletonList(new AssetCondition(str2, lLJIILIIL, "tt_template", Integer.valueOf(assetType.getValue()), null, null)), null, null, null, null, "", Boolean.valueOf(z), null, Boolean.valueOf(z2), "", null);
        if (interfaceC1635410sex != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_template_h5_force_no_filter", true, false)) {
                C1429050nI7.LIZ.getClass();
                Pair pairLIZ = C1429050nI7.LIZ();
                Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
                mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pairLIZ, "2", null, "tt_template", null, false, "item", "tt_template", false);
            } else {
                C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
                TemplateScene templateScene = TemplateScene.TEMPLATE_TAB;
                c1429050nI7.getClass();
                Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
                Map<C0CIJ, C311200CHu> map2 = C311170CHr.LIZ;
                mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", null, "tt_template", null, false, "item", "tt_template", false);
            }
            interfaceC1635410sex.LJJIL(mixedAssetsQueryAdditionalParameters, mixedItemAssetsRequestBodyInfo, iFetchAssetItemInfo);
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.0n1G] */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final C1429200nIM LIZ(final Context context, final String str, final String str2, AVMusic aVMusic, final Boolean bool, final C1418100n0S c1418100n0S, final InterfaceC1428880nHq interfaceC1428880nHq) {
        String musicId;
        boolean z;
        final int i;
        String title;
        boolean zLJI = MethodIDManager.LJI(137916);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadMusic: musicId = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicUrl = ");
        sbLIZ.append(str2);
        sbLIZ.append(", avMusic = ");
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(", musicPostUnavailable = ");
        sbLIZ.append(bool);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        final boolean zLIZ = C123100dR.LIZ(str2);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_download_cc_music_concurrent", true, false) && c1418100n0S.LIZJ == EnumC1412640mre.CUT_SAME) {
            z = true;
        } else {
            z = false;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1428920nHu.LIZ.getClass();
        if (bool == null) {
            i = 2;
        } else if (bool.booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        final ?? r15 = new InterfaceC1428880nHq() { // from class: X.0n1G
            public Boolean LIZJ;
            public Boolean LJFF;
            public long LIZ = -1;
            public long LIZIZ = -1;
            public long LIZLLL = -1;
            public long LJ = -1;

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i2) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = this.LIZLLL;
                c1428920nHu.getClass();
                this.LJ = C1428920nHu.LIZIZ(j);
                this.LJFF = Boolean.FALSE;
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = this.LIZLLL;
                c1428920nHu.getClass();
                this.LJ = C1428920nHu.LIZIZ(j);
                this.LJFF = Boolean.TRUE;
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
                this.LIZLLL = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
                this.LIZ = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = this.LIZ;
                c1428920nHu.getClass();
                this.LIZIZ = C1428920nHu.LIZIZ(j);
                this.LIZJ = Boolean.FALSE;
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic2) {
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = this.LIZ;
                c1428920nHu.getClass();
                this.LIZIZ = C1428920nHu.LIZIZ(j);
                this.LIZJ = Boolean.TRUE;
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str3) {
                String strLIZLLL;
                C201955140j.LIZJ(C1398350mUb.LIZIZ, "mob downloadTemplateMusic failure");
                C0LAB c0lab = new C0LAB();
                c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c0lab.LIZLLL(num, "error_code");
                c0lab.LJ("error_msg", str3);
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = jCurrentTimeMillis;
                c1428920nHu.getClass();
                c0lab.LIZIZ(C1428920nHu.LIZIZ(j), "duration");
                c0lab.LJ("template_id", c1418100n0S.LIZIZ);
                EnumC1412640mre enumC1412640mre = c1418100n0S.LIZJ;
                if (enumC1412640mre != null) {
                    strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mre);
                } else {
                    strLIZLLL = null;
                }
                c0lab.LJ("template_type", strLIZLLL);
                c0lab.LJ("music_id", str);
                c0lab.LJ("music_url", str2);
                c0lab.LIZ(i, "music_post_unavailable");
                c0lab.LIZ(0, "has_cache");
                c0lab.LIZ(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_download_cc_music_concurrent", true, false) ? 1 : 0, "is_concurrent");
                c0lab.LJ("scene_name", c1418100n0S.LIZ);
                Boolean bool2 = this.LJFF;
                Boolean bool3 = Boolean.TRUE;
                c0lab.LIZ(!Intrinsics.LJFF(bool2, bool3) ? 1 : 0, "music_file_download_status");
                c0lab.LIZ(!Intrinsics.LJFF(this.LIZJ, bool3) ? 1 : 0, "music_model_download_status");
                c0lab.LIZIZ(this.LJ, "music_file_download_duration");
                c0lab.LIZIZ(this.LIZIZ, "music_model_download_duration");
                C20684815ws.LJIILLIIL("tool_performance_template_music_download", c0lab.LIZ);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic2, String str3, boolean z2, boolean z3) {
                String strLIZLLL;
                C201955140j.LIZJ(C1398350mUb.LIZIZ, "mob downloadTemplateMusic success");
                C0LAB c0lab = new C0LAB();
                c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                C1428920nHu c1428920nHu = C1428920nHu.LIZ;
                long j = jCurrentTimeMillis;
                c1428920nHu.getClass();
                c0lab.LIZIZ(C1428920nHu.LIZIZ(j), "duration");
                c0lab.LJ("template_id", c1418100n0S.LIZIZ);
                EnumC1412640mre enumC1412640mre = c1418100n0S.LIZJ;
                if (enumC1412640mre != null) {
                    strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mre);
                } else {
                    strLIZLLL = null;
                }
                c0lab.LJ("template_type", strLIZLLL);
                c0lab.LJ("music_id", str);
                c0lab.LJ("music_url", str2);
                c0lab.LIZ(i, "music_post_unavailable");
                c0lab.LIZ(z2 ? 1 : 0, "has_cache");
                c0lab.LIZ(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_download_cc_music_concurrent", true, false) ? 1 : 0, "is_concurrent");
                c0lab.LJ("scene_name", c1418100n0S.LIZ);
                Boolean bool2 = this.LJFF;
                Boolean bool3 = Boolean.TRUE;
                c0lab.LIZ(!Intrinsics.LJFF(bool2, bool3) ? 1 : 0, "music_file_download_status");
                c0lab.LIZ(!Intrinsics.LJFF(this.LIZJ, bool3) ? 1 : 0, "music_model_download_status");
                c0lab.LIZIZ(this.LJ, "music_file_download_duration");
                c0lab.LIZIZ(this.LIZIZ, "music_model_download_duration");
                C20684815ws.LJIILLIIL("tool_performance_template_music_download", c0lab.LIZ);
            }
        };
        final InterfaceC1428880nHq interfaceC1428880nHq2 = new InterfaceC1428880nHq() { // from class: X.0nHo
            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
                r15.LIZJ();
                interfaceC1428880nHq.LIZJ();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
                r15.LJ();
                interfaceC1428880nHq.LJ();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
                r15.LJI();
                interfaceC1428880nHq.LJI();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
                r15.LJIIIIZZ();
                interfaceC1428880nHq.LJIIIIZZ();
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
                r15.LIZIZ(exc);
                interfaceC1428880nHq.LIZIZ(exc);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic2) {
                r15.LIZLLL(aVMusic2);
                interfaceC1428880nHq.LIZLLL(aVMusic2);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i2) {
                r15.LJII(i2);
                interfaceC1428880nHq.LJII(i2);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str3) {
                r15.LIZ(num, str3);
                interfaceC1428880nHq.LIZ(num, str3);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic2, String str3, boolean z2, boolean z3) {
                r15.LJFF(aVMusic2, str3, z2, z3);
                interfaceC1428880nHq.LJFF(aVMusic2, str3, z2, z3);
            }
        };
        if (z) {
            C1429200nIM c1429200nIM = new C1429200nIM(new C1429160nII(context, str, str2, aVMusic, bool, c1418100n0S), interfaceC1428880nHq2);
            c1429200nIM.LIZ(null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1429200nIM;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LJIIL(context, str2, str, null, interfaceC1428880nHq2);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        if (aVMusic != null) {
            if (LJIILJJIL(aVMusic)) {
                MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
                if (matchedPGCSoundInfo == null || (title = matchedPGCSoundInfo.getTitle()) == null) {
                    title = aVMusic.musicName;
                }
                LJIIL(context, str2, str, title, interfaceC1428880nHq2);
            } else {
                LJIIJJI(context, aVMusic, c1418100n0S, interfaceC1428880nHq2, this, bool, str2, zLIZ);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return null;
            }
            return null;
        }
        if (C123100dR.LIZ(str)) {
            interfaceC1428880nHq2.LJIIIIZZ();
            C0CHQ.LIZ().LJJJJL().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0nHl
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    String strLIZIZ;
                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLoadMusicFail: ");
                    if (exc != null) {
                        strLIZIZ = C13SZ.LIZIZ(exc);
                    } else {
                        strLIZIZ = null;
                    }
                    sbLIZ2.append(strLIZIZ);
                    C201955140j.LIZJ(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (zLIZ) {
                        this.LJIIL(context, str2, str, null, interfaceC1428880nHq2);
                        return;
                    }
                    InterfaceC1428880nHq interfaceC1428880nHq3 = interfaceC1428880nHq2;
                    if (interfaceC1428880nHq3 != null) {
                        interfaceC1428880nHq3.LIZIZ(exc);
                    }
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic2) {
                    String musicId2;
                    String str3;
                    String title2;
                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLoadMusicSuccess: music: musicId = ");
                    if (aVMusic2 != null) {
                        musicId2 = aVMusic2.getMusicId();
                    } else {
                        musicId2 = null;
                    }
                    sbLIZ2.append(musicId2);
                    sbLIZ2.append(", musicName = ");
                    if (aVMusic2 != null) {
                        str3 = aVMusic2.musicName;
                    } else {
                        str3 = null;
                    }
                    sbLIZ2.append(str3);
                    C201955140j.LIZJ(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (aVMusic2 == null) {
                        if (zLIZ) {
                            this.LJIIL(context, str2, str, null, interfaceC1428880nHq2);
                            return;
                        }
                        InterfaceC1428880nHq interfaceC1428880nHq3 = interfaceC1428880nHq2;
                        if (interfaceC1428880nHq3 == null) {
                            return;
                        }
                        interfaceC1428880nHq3.LIZIZ(null);
                        return;
                    }
                    this.getClass();
                    if (TemplateResourceServiceImpl.LJIILJJIL(aVMusic2)) {
                        TemplateResourceServiceImpl templateResourceServiceImpl = this;
                        Context context2 = context;
                        String str4 = str2;
                        String str5 = str;
                        MatchedPGCSoundInfo matchedPGCSoundInfo2 = aVMusic2.getMatchedPGCSoundInfo();
                        if (matchedPGCSoundInfo2 == null || (title2 = matchedPGCSoundInfo2.getTitle()) == null) {
                            title2 = aVMusic2.musicName;
                        }
                        templateResourceServiceImpl.LJIIL(context2, str4, str5, title2, interfaceC1428880nHq2);
                        return;
                    }
                    InterfaceC1428880nHq interfaceC1428880nHq4 = interfaceC1428880nHq2;
                    if (interfaceC1428880nHq4 != null) {
                        interfaceC1428880nHq4.LIZLLL(aVMusic2);
                    }
                    TemplateResourceServiceImpl templateResourceServiceImpl2 = this;
                    TemplateResourceServiceImpl.LJIIJJI(context, aVMusic2, c1418100n0S, interfaceC1428880nHq2, templateResourceServiceImpl2, bool, str2, zLIZ);
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
                return null;
            }
            return null;
        }
        interfaceC1428880nHq2.LIZ(null, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJ(List list, Pair pair, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, String str, String str2, String str3) {
        if (((Boolean) C260650AJj.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(str, "story_celebration")) {
            C1416990myf.LIZJ(list, pair, str2, str3, awS587S0100000_8, awS622S0100000_8, null);
        } else {
            C1416990myf.LIZ.getClass();
            C1416990myf.LIZIZ(list, pair, 2, CardStruct.IStatusCode.DEFAULT, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS199S0100000_30(awS587S0100000_8, 2), new C516201zk(awS622S0100000_8, 258));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0nHn] */
    public static final void LJIIJJI(Context context, final AVMusic aVMusic, final C1418100n0S c1418100n0S, final InterfaceC1428880nHq interfaceC1428880nHq, final TemplateResourceServiceImpl templateResourceServiceImpl, final Boolean bool, final String str, final boolean z) {
        final Context context2 = context;
        final ?? r2 = new InterfaceC1428880nHq(context2, aVMusic, c1418100n0S, interfaceC1428880nHq, templateResourceServiceImpl, bool, str, z) { // from class: X.0nHn
            public final /* synthetic */ InterfaceC1428880nHq LIZ;
            public final /* synthetic */ boolean LIZIZ;
            public final /* synthetic */ TemplateResourceServiceImpl LIZJ;
            public final /* synthetic */ Context LIZLLL;
            public final /* synthetic */ String LJ;
            public final /* synthetic */ AVMusic LJFF;

            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic2) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LIZJ();
                }
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJ();
                }
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJI();
                }
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i) {
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJII(i);
                }
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str2) {
                if (this.LIZIZ) {
                    this.LIZJ.LJIIL(this.LIZLLL, this.LJ, this.LJFF.getMusicId(), null, this.LIZ);
                    return;
                }
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 == null) {
                    return;
                }
                interfaceC1428880nHq2.LIZ(num, str2);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic2, String str2, boolean z2, boolean z3) {
                InterfaceC1428880nHq interfaceC1428880nHq2 = this.LIZ;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJFF(aVMusic2, str2, z2, z3);
                }
            }

            {
                this.LIZ = interfaceC1428880nHq;
                this.LIZIZ = z;
                this.LIZJ = templateResourceServiceImpl;
                this.LJ = str;
            }
        };
        templateResourceServiceImpl.getClass();
        boolean zLJI = MethodIDManager.LJI(137916);
        InterfaceC1623990sMX interfaceC1623990sMXLJJJJL = C0CHQ.LIZ().LJJJJL();
        if (context2 == null) {
            context2 = C0CHQ.LIZ;
        }
        interfaceC1623990sMXLJJJJL.LJ("template_resource", context2, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0nHp
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z2) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
                InterfaceC1428880nHq interfaceC1428880nHq2 = r2;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJ();
                }
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
                InterfaceC1428880nHq interfaceC1428880nHq2 = r2;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJII(i);
                }
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str2) {
                InterfaceC1428880nHq interfaceC1428880nHq2 = r2;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LIZJ();
                }
                InterfaceC1428880nHq interfaceC1428880nHq3 = r2;
                if (interfaceC1428880nHq3 != null) {
                    interfaceC1428880nHq3.LIZ(num, str2);
                }
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                InterfaceC1428880nHq interfaceC1428880nHq2 = r2;
                if (interfaceC1428880nHq2 != null) {
                    interfaceC1428880nHq2.LJI();
                }
                InterfaceC1428880nHq interfaceC1428880nHq3 = r2;
                if (interfaceC1428880nHq3 != null) {
                    interfaceC1428880nHq3.LJFF(aVMusic, str2, false, false);
                }
            }
        }, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final void LJI(final String str, Pair pair, int i, String str2, final Function1 function1, final Function2 function2, final AFwS239S0000000_8 aFwS239S0000000_8, String str3, String str4) {
        if (((Boolean) C260650AJj.LIZ.getValue()).booleanValue()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = "";
            C1416990myf.LIZJ(Collections.singletonList(str), pair, str3, str4, new C0L42(str, aFwS239S0000000_8, c118300cf, c259800zU, jElapsedRealtime, c259800zU2, function1, function2), new C0L41(aFwS239S0000000_8, c118300cf, jElapsedRealtime, function2), new C5181020d(c118300cf, (C118300cf) c259800zU, (C259800zU<String>) c259800zU2, (C259800zU<String>) 0));
            return;
        }
        C1416990myf c1416990myf = C1416990myf.LIZ;
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C1416990myf c1416990myf2 = C1416990myf.LIZ;
        List listSingletonList = Collections.singletonList(str);
        c1416990myf2.getClass();
        C1416990myf.LIZIZ(listSingletonList, pair, i, str2, "").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.14EL
            /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 249
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14EL.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0L40
            @Override // X.C09JN
            public final void accept(Object obj) {
                Function2<String, String, Unit> function22;
                C1C7U.LIZ("TemplateFetcher@4ce9.requestTemplateDetail$2");
                Throwable th = (Throwable) obj;
                Function1<C536920L3y, Unit> function12 = aFwS239S0000000_8;
                if (function12 != null) {
                    function12.invoke(new C536920L3y(jElapsedRealtime2, -1, th.getMessage(), "", false));
                }
                String message = th.getMessage();
                if (message != null && (function22 = function2) != null) {
                    function22.invoke(message, "");
                }
                C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetail$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateResourceService
    public final C1428780nHg LIZLLL(Context context, String str, EnumC1412640mre enumC1412640mre, CutsameDataItem cutsameDataItem, String str2, final String str3, final Boolean bool, C573920Mf8 c573920Mf8, TemplateSourceConfig templateSourceConfig, final C1418100n0S c1418100n0S, boolean z, C0L7K c0l7k) {
        String str4;
        String str5;
        InterfaceC420801kM interfaceC420801kMLJJLJLI;
        C1428790nHh c1428790nHh;
        C1428790nHh c1428790nHh2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadTemplate: templateId = ");
        sbLIZ.append(str);
        sbLIZ.append(", templateType = ");
        sbLIZ.append(enumC1412640mre);
        sbLIZ.append(", templateData = ");
        if (cutsameDataItem != null) {
            str4 = cutsameDataItem.templateId;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append('-');
        if (cutsameDataItem != null) {
            str5 = cutsameDataItem.templateUrl;
        } else {
            str5 = null;
        }
        sbLIZ.append(str5);
        sbLIZ.append("\nmusicId = ");
        sbLIZ.append(str2);
        sbLIZ.append(", musicUrl = ");
        sbLIZ.append(str3);
        sbLIZ.append(", musicUnavailable = ");
        sbLIZ.append(bool);
        sbLIZ.append(", needRemoveAudioSlots = ");
        sbLIZ.append(c573920Mf8.LIZJ);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        final C1428780nHg c1428780nHg = new C1428780nHg(context, c573920Mf8, templateSourceConfig);
        boolean zLJI = MethodIDManager.LJI(202447);
        if (((str != null && str.length() != 0) || cutsameDataItem != null) && context != null) {
            if (c1428780nHg.LIZLLL == null || c1428780nHg.LJ == null || (((c1428790nHh = c1428780nHg.LJIIIIZZ) != null && c1428790nHh.LIZ()) || !Intrinsics.LJFF(c1428780nHg.LJFF, str) || !Intrinsics.LJFF(null, cutsameDataItem) || !Intrinsics.LJFF(str2, c1428780nHg.LJI) || !Intrinsics.LJFF(null, str3))) {
                C0LCY.LIZ(LogLevel.LEVEL_INFO, "start new disposable");
                c1428780nHg.LJII = new C0L7L(c0l7k);
                c1428780nHg.LJI = str2;
                c1428780nHg.LJFF = str;
                c1428780nHg.LJIIIIZZ = null;
                final C11RK c11rk = new C11RK();
                c1428780nHg.LIZLLL = (C11JF) c11rk.LJJLJLI(new AfS177S0100000_8(c1428780nHg, 1));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TemplateDownloader subscribeDownloadSubject: musicId = ");
                sbLIZ2.append(str2);
                sbLIZ2.append(", templateType = ");
                sbLIZ2.append(enumC1412640mre);
                sbLIZ2.append(", needRemoveAudioSlots = ");
                sbLIZ2.append(c573920Mf8.LIZJ);
                C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                C0LCY c0lcy = C0LCY.LIZ;
                String str6 = c1418100n0S.LIZ;
                c0lcy.getClass();
                C0LCY.LIZLLL(enumC1412640mre, str, str2, str3, bool, str6);
                if (str2 == null || str2.length() == 0 || (enumC1412640mre == EnumC1412640mre.CUT_SAME && !c573920Mf8.LIZJ)) {
                    if (z) {
                        interfaceC420801kMLJJLJLI = c1428780nHg.LIZLLL(str, cutsameDataItem, c11rk).LJJJ(new InterfaceC1487280oo2() { // from class: X.0nHd
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                C1428790nHh c1428790nHh3 = (C1428790nHh) obj;
                                C1428780nHg c1428780nHg2 = c1428780nHg;
                                String str7 = c1428790nHh3.LJIIIZ;
                                String str8 = str3;
                                Boolean bool2 = bool;
                                C1418100n0S c1418100n0S2 = c1418100n0S;
                                C11RK<C0L7F> c11rk2 = c11rk;
                                c1428780nHg2.getClass();
                                return C11NZ.LJIJJLI(new C1428730nHb(c11rk2, str7, str8, bool2, c1428780nHg2, c1418100n0S2)).LJJJJZI(new AkS328S0200000_22(c1428780nHg, c1428790nHh3, 0));
                            }
                        }, false).LJJLJLI(new AfS191S0100000_22(c1428780nHg, 0));
                    } else {
                        interfaceC420801kMLJJLJLI = c1428780nHg.LIZLLL(str, cutsameDataItem, c11rk).LJJLJLI(new AfS191S0100000_22(c1428780nHg, 0));
                    }
                } else {
                    c1428780nHg = c1428780nHg;
                    interfaceC420801kMLJJLJLI = C11NZ.LJLLILLLL(C11NZ.LJIJJLI(new C1428730nHb(c11rk, str2, str3, bool, c1428780nHg, c1418100n0S)), c1428780nHg.LIZLLL(str, cutsameDataItem, c11rk), new InterfaceC500500Jk0() { // from class: X.0nHr
                        @Override // X.InterfaceC500500Jk0
                        public final Object apply(Object obj, Object obj2) {
                            c1428780nHg.getClass();
                            return C1428780nHg.LIZJ((C1428790nHh) obj, (C1428790nHh) obj2);
                        }
                    }).LJJLJLI(new AfS191S0100000_22(c1428780nHg, 0));
                }
                c1428780nHg.LJ = (C11JF) interfaceC420801kMLJJLJLI;
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } else {
                C11JF c11jf = c1428780nHg.LJ;
                if (c11jf != null && c11jf.isDisposed() && (c1428790nHh2 = c1428780nHg.LJIIIIZZ) != null && c1428790nHh2.LIZIZ()) {
                    C0LCY.LIZ(LogLevel.LEVEL_INFO, "current process of downloading has been finished, build NLEModel");
                    C0L7L c0l7l = c1428780nHg.LJII;
                    if (c0l7l != null) {
                        c0l7l.LJI(c0l7k);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return c1428780nHg;
                    }
                } else {
                    C0LCY.LIZ(LogLevel.LEVEL_INFO, "is downloading, continue it");
                    C0L7L c0l7l2 = c1428780nHg.LJII;
                    if (c0l7l2 != null) {
                        c0l7l2.LJI(c0l7k);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return c1428780nHg;
                    }
                }
            }
        } else if (zLJI) {
            MethodIDManager.LJ();
            return c1428780nHg;
        }
        return c1428780nHg;
    }
}
