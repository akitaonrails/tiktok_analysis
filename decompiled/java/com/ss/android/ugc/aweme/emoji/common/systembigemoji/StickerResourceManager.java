package com.ss.android.ugc.aweme.emoji.common.systembigemoji;

import X.AbstractC2199801B7q;
import X.C01GW;
import X.C036E;
import X.C054G;
import X.C0I0B;
import X.C0PEM;
import X.C0VSJ;
import X.C1366690lfX;
import X.C1501605uI;
import X.C1BA6;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452100Ho8;
import X.C452501pT;
import X.C894660Z7w;
import X.EnumC565770MGx;
import X.InterfaceC2199931B8d;
import X.InterfaceC449620Hk8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.SimpleStopwatch;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.systembigemoji.IStickerResourceManager;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes35.dex */
public final class StickerResourceManager implements InterfaceC449620Hk8, IStickerResourceManager {
    public final C054G LL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final Set<InterfaceC449620Hk8> LLILLJJLI = new LinkedHashSet();
    public final HashSet<String> LLILLL = new HashSet<>();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(238));

    public static void LIZLLL(Resources resources) {
        C0VSJ c0vsj = new C0VSJ(C1BA6.LIZ(resources));
        if (c0vsj.exists() && c0vsj.isFile()) {
            c0vsj.delete();
        }
    }

    @Override // com.ss.android.ugc.aweme.systembigemoji.IStickerResourceManager
    public final void LIZIZ(InterfaceC449620Hk8 interfaceC449620Hk8) {
        this.LLILLJJLI.add(interfaceC449620Hk8);
    }

    @Override // com.ss.android.ugc.aweme.systembigemoji.IStickerResourceManager
    public final boolean LIZJ(final Resources resources) {
        final SimpleStopwatch simpleStopwatchLIZ;
        final C1366690lfX c1366690lfXLIZIZ;
        File parentFile;
        IStopwatchFactory iStopwatchFactoryLIZLLL;
        IMPerformanceService iMPerformanceService = (IMPerformanceService) this.LLILZ.getValue();
        if (iMPerformanceService != null && (iStopwatchFactoryLIZLLL = iMPerformanceService.LIZLLL()) != null) {
            simpleStopwatchLIZ = iStopwatchFactoryLIZLLL.LIZ();
        } else {
            simpleStopwatchLIZ = null;
        }
        IMPerformanceService iMPerformanceService2 = (IMPerformanceService) this.LLILZ.getValue();
        if (iMPerformanceService2 != null) {
            c1366690lfXLIZIZ = iMPerformanceService2.LIZIZ();
        } else {
            c1366690lfXLIZIZ = null;
        }
        C0I0B.LJFF.LIZJ();
        C894660Z7w.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LLILLL.contains(resources.getResourceUrl())) {
                    return false;
                }
                C0VSJ c0vsj = new C0VSJ(C1BA6.LIZ(resources));
                File parentFile2 = c0vsj.getParentFile();
                if (parentFile2 != null && !parentFile2.exists() && (parentFile = c0vsj.getParentFile()) != null && !parentFile.mkdirs()) {
                    return false;
                }
                this.LLILLL.add(resources.getResourceUrl());
                AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.1BA5
                    public final /* synthetic */ boolean LLILZIL = false;

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onCanceled(DownloadInfo downloadInfo) {
                        long jLIZ;
                        DurationPerfMon durationPerfMon = c1366690lfXLIZIZ;
                        if (durationPerfMon != null) {
                            C1501605uI c1501605uI = new C1501605uI(String.valueOf(resources.getId()));
                            long id = resources.getId();
                            Stopwatch stopwatch = simpleStopwatchLIZ;
                            if (stopwatch != null) {
                                jLIZ = stopwatch.LIZ();
                            } else {
                                jLIZ = 0;
                            }
                            durationPerfMon.LIZJ(c1501605uI, new C1497105tZ(false, id, jLIZ));
                        }
                        this.LLILLL.remove(resources.getResourceUrl());
                        StickerResourceManager stickerResourceManager = this;
                        Resources resources2 = resources;
                        stickerResourceManager.getClass();
                        StickerResourceManager.LIZLLL(resources2);
                        this.LJ(resources, false);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        String[] list;
                        long jLIZ;
                        DurationPerfMon durationPerfMon = c1366690lfXLIZIZ;
                        if (durationPerfMon != null) {
                            C1501605uI c1501605uI = new C1501605uI(String.valueOf(resources.getId()));
                            long id = resources.getId();
                            Stopwatch stopwatch = simpleStopwatchLIZ;
                            if (stopwatch != null) {
                                jLIZ = stopwatch.LIZ();
                            } else {
                                jLIZ = 0;
                            }
                            durationPerfMon.LIZJ(c1501605uI, new C1497105tZ(true, id, jLIZ));
                        }
                        this.LLILLL.remove(resources.getResourceUrl());
                        StickerResourceManager stickerResourceManager = this;
                        Resources resources2 = resources;
                        stickerResourceManager.getClass();
                        StickerResourceManager.LIZLLL(resources2);
                        StickerResourceManager stickerResourceManager2 = this;
                        Resources resources3 = resources;
                        stickerResourceManager2.getClass();
                        boolean z = false;
                        if (resources3 != null) {
                            String type = resources3.getType();
                            long id2 = resources3.getId();
                            String version = resources3.getVersion();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(C1BA6.LIZIZ(type));
                            sbLIZ2.append(C1BA6.LIZJ(id2, version));
                            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                            sbLIZ.append("/");
                            sbLIZ.append(id2);
                            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                            if (c0vsj2.exists() && c0vsj2.isDirectory() && (list = c0vsj2.list()) != null && list.length != 0) {
                                z = true;
                            }
                        }
                        this.LJ(resources, z);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        long jLIZ;
                        DurationPerfMon durationPerfMon = c1366690lfXLIZIZ;
                        if (durationPerfMon != null) {
                            C1501605uI c1501605uI = new C1501605uI(String.valueOf(resources.getId()));
                            long id = resources.getId();
                            Stopwatch stopwatch = simpleStopwatchLIZ;
                            if (stopwatch != null) {
                                jLIZ = stopwatch.LIZ();
                            } else {
                                jLIZ = 0;
                            }
                            durationPerfMon.LIZJ(c1501605uI, new C1497105tZ(false, id, jLIZ));
                        }
                        this.LLILLL.remove(resources.getResourceUrl());
                        if (this.LLILZIL) {
                            this.LIZJ(resources);
                            return;
                        }
                        StickerResourceManager stickerResourceManager = this;
                        Resources resources2 = resources;
                        stickerResourceManager.getClass();
                        StickerResourceManager.LIZLLL(resources2);
                        this.LJ(resources, false);
                    }
                };
                InterfaceC2199931B8d interfaceC2199931B8d = new InterfaceC2199931B8d() { // from class: X.0Zs6
                    @Override // X.InterfaceC2199931B8d
                    public final void LIZIZ() {
                        Stopwatch stopwatch = simpleStopwatchLIZ;
                        if (stopwatch != null) {
                            stopwatch.stop();
                        }
                    }

                    @Override // X.InterfaceC2199931B8d
                    public final void LIZJ() {
                        Stopwatch stopwatch = simpleStopwatchLIZ;
                        if (stopwatch != null) {
                            stopwatch.start();
                        }
                    }

                    @Override // X.InterfaceC2199931B8d
                    public final void LIZ(String str) {
                        Stopwatch stopwatch = simpleStopwatchLIZ;
                        if (stopwatch != null) {
                            stopwatch.stop();
                        }
                    }
                };
                if (c1366690lfXLIZIZ != null) {
                    c1366690lfXLIZIZ.LIZIZ(new C1501605uI(String.valueOf(resources.getId())), true);
                }
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(resources.getResourceUrl());
                abstractC2199801B7qWith.LJ = C1BA6.LIZIZ(resources.getType());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1BA6.LIZJ(resources.getId(), resources.getVersion()));
                sbLIZ.append(".zip");
                abstractC2199801B7qWith.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                abstractC2199801B7qWith.LJIIL = absDownloadListener;
                abstractC2199801B7qWith.LJIIJ = "emoji_resources_manager";
                String type = resources.getType();
                long id = resources.getId();
                String version = resources.getVersion();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C1BA6.LIZIZ(type));
                sbLIZ2.append(C1BA6.LIZJ(id, version));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                abstractC2199801B7qWith.LJIILLIIL = true;
                abstractC2199801B7qWith.LJIIZILJ = strLIZIZ;
                abstractC2199801B7qWith.LJIJ = interfaceC2199931B8d;
                abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.ZIP);
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C23250099c.LIZLLL(this.LL, null, null, new C452100Ho8(this, resources, null), 3);
        return false;
    }

    @Override // X.InterfaceC449620Hk8
    public final void LIZ(Resources resources, List<? extends Emoji> list) {
        Iterator<InterfaceC449620Hk8> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(resources, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager.LJ(com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources, boolean):void");
    }
}
