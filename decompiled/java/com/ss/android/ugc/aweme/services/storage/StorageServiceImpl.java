package com.ss.android.ugc.aweme.services.storage;

import X.C08OW;
import X.C098200Yq;
import X.C0BNA;
import X.C0CHQ;
import X.C1697810uHb;
import X.C1866300yfM;
import X.C189200o6;
import X.C20020913Vf;
import X.C201955140j;
import X.C2260008tK;
import X.C2285608xS;
import X.C262520AQo;
import X.C267980Aeq;
import X.C280470Ayz;
import X.C287590BOz;
import X.C844470XAv;
import X.InterfaceC345370DgN;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatformCaching;
import com.ss.android.ugc.aweme.setting.CutCameStorageOpt;
import com.ss.android.ugc.aweme.storage.impl.AVCreativeDraftStorage;
import com.ss.android.ugc.aweme.storage.impl.AVCreativePersistentStorage;
import com.ss.android.ugc.aweme.storage.impl.AVCreativePublicLiveRecordingsStorage;
import com.ss.android.ugc.aweme.storage.impl.AVCreativePublicStorage;
import com.ss.android.ugc.aweme.storage.impl.AVCutSameStorage;
import com.ss.android.ugc.aweme.storage.impl.AVDraftStorage;
import com.ss.android.ugc.aweme.storage.impl.AVEffectModelStorage;
import com.ss.android.ugc.aweme.storage.impl.AVEffectStorage;
import com.ss.android.ugc.aweme.storage.impl.AVEndingWatermarkResStorage;
import com.ss.android.ugc.aweme.storage.impl.AVFilterStorage;
import com.ss.android.ugc.aweme.storage.impl.AVFontStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMVThemeStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicResStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicResStorageOpt;
import com.ss.android.ugc.aweme.storage.impl.AVNewCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVOldCreativeCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVPersonalMojiStorage;
import com.ss.android.ugc.aweme.storage.impl.AVSavePhotoEffectStorage;
import com.ss.android.ugc.aweme.storage.impl.AVTextReadResStorage;
import com.ss.android.ugc.aweme.storage.impl.AVToolsCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVVEGetImagesCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVVESdkStorage;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class StorageServiceImpl implements IAVStorageService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public AVStorageInfo getAVStorageInfo() {
        String strLJIILJJIL;
        String strLJJLIIIIJ;
        String strLJJIJIL;
        String strGenMusicPath;
        String strLJJLI;
        String strLJJIJIIJIL;
        String strLIZ;
        String creativeRoot;
        String strLJFF;
        String persistentRoot;
        String cacheRoot;
        AVStorageInfo aVStorageInfo = new AVStorageInfo(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
        try {
            strLJIILJJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL("");
            strLJJLIIIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ("");
            strLJJIJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIL("");
            strGenMusicPath = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().genMusicPath("");
            strLJJLI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI("");
            strLJJIJIIJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJIL("");
            C844470XAv.LIZ.getClass();
            strLIZ = C08OW.LIZ(C844470XAv.LIZ());
            creativeRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot();
            strLJFF = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF();
            persistentRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot();
            cacheRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot();
        } catch (Throwable th) {
            th = th;
        }
        try {
            aVStorageInfo.setEffectSize(C2260008tK.LJII(strLJIILJJIL));
            aVStorageInfo.setFilterSize(C2260008tK.LJII(strLJJLIIIIJ));
            aVStorageInfo.setMvSize(C2260008tK.LJII(strLJJIJIL));
            aVStorageInfo.setMusicSize(C2260008tK.LJII(strGenMusicPath));
            aVStorageInfo.setEffectModelSize(C2260008tK.LJII(strLJJLI));
            aVStorageInfo.setFontSize(C2260008tK.LJII(strLJJIJIIJIL));
            aVStorageInfo.setCutSameSize(C2260008tK.LJII(strLIZ));
            aVStorageInfo.setCreativeDraftSize(C2260008tK.LJII(creativeRoot));
            aVStorageInfo.setCreativePublicSize(C2260008tK.LJII(strLJFF));
            aVStorageInfo.setCreativePersistentSize(C2260008tK.LJII(persistentRoot));
            aVStorageInfo.setCreativeCacheSize(C2260008tK.LJII(cacheRoot));
            C189200o6.m2constructorimpl(aVStorageInfo);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C201955140j.LIZLLL(C20020913Vf.LIZIZ, "AVStorageInfo", aVStorageInfo.toString());
        return aVStorageInfo;
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public List<InterfaceC345370DgN> getStorageList() {
        List<InterfaceC345370DgN> listLJIILJJIL = C1697810uHb.LJIILJJIL(new AVDraftStorage(), new AVFilterStorage(), new AVMusicCacheStorage(), new AVPersonalMojiStorage(), new AVSavePhotoEffectStorage(), new AVTextReadResStorage(), new AVNewCacheStorage(), new AVEndingWatermarkResStorage(), new AVCreativePublicStorage(), new AVCreativeDraftStorage(), new AVCreativePersistentStorage(), new AVVEGetImagesCacheStorage(), EffectPlatformCaching.LJIIZILJ());
        if (((Boolean) C262520AQo.LIZ.getValue()).booleanValue()) {
            listLJIILJJIL.add(new AVCreativePublicLiveRecordingsStorage());
        }
        if (C1866300yfM.LIZ() || C287590BOz.LIZ()) {
            listLJIILJJIL.add(new AVToolsCacheStorage());
        } else {
            listLJIILJJIL.add(new AVEffectStorage());
            listLJIILJJIL.add(new AVEffectModelStorage());
            listLJIILJJIL.add(((Boolean) C0BNA.LIZ.getValue()).booleanValue() ? new AVMusicResStorageOpt() : new AVMusicResStorage());
            listLJIILJJIL.add(new AVMVThemeStorage());
            listLJIILJJIL.add(new AVFontStorage());
        }
        if (((CutCameStorageOpt.CutCameStorageConfig) CutCameStorageOpt.LIZIZ.getValue()).isOpen) {
            listLJIILJJIL.add(new AVCutSameStorage());
        }
        if (((Number) C280470Ayz.LIZ.getValue()).intValue() == 2) {
            listLJIILJJIL.add(new AVOldCreativeCacheStorage());
        }
        if (C2285608xS.LIZ().exists() && ((Boolean) C267980Aeq.LIZ.getValue()).booleanValue()) {
            listLJIILJJIL.add(new AVVESdkStorage());
        }
        return listLJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public Set<String> getPrefixAllowList() {
        return C0CHQ.LIZ().LJJIIJZLJL().getAllowListService().getPrefixAllowList();
    }
}
