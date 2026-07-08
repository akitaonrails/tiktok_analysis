package com.ss.android.ugc.aweme.cktemplate.download;

import X.C098200Yq;
import X.C0C64;
import X.C0L6U;
import X.C0L9B;
import X.C123100dR;
import X.C1398350mUb;
import X.C189200o6;
import X.C201955140j;
import X.C2188811AlT;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader;
import com.bytedance.ies.smartmovie.jni.ISmartMovieDownloaderListener;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class SmartMovieDownloaderImpl extends ISmartMovieDownloader {
    public static final C0L6U Companion = new Object() { // from class: X.0L6U
    };
    public final Set<ISmartMovieDownloaderListener> retainedCallbacks = Collections.newSetFromMap(new ConcurrentHashMap());
    public final WuZhuiDownloader wuZhuiDownloader;

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public void clearEpCache() {
        this.wuZhuiDownloader.clearEpCache();
    }

    public final WuZhuiDownloader getWuZhuiDownloader() {
        return this.wuZhuiDownloader;
    }

    public SmartMovieDownloaderImpl(WuZhuiDownloader wuZhuiDownloader) {
        this.wuZhuiDownloader = wuZhuiDownloader;
    }

    private final String appAppNameIfNeed(String str) {
        if (str != null && str.length() != 0) {
            if (!a0.LJJIIZI(str, "app_name", false) && u.LJJIIJZLJL(str, "urs://effect_platform?", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&app_name=");
                sbLIZ.append("CC".toLowerCase(Locale.ROOT));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return "";
    }

    private final List<String> toNewList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(appAppNameIfNeed(it2.next()));
        }
        return arrayList;
    }

    private final IWuZhuiDownloaderListener wrapWuZhuiListener(final ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        if (iSmartMovieDownloaderListener == null) {
            return null;
        }
        final boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_smartmovie_downloader_listener_retain", true, true);
        if (zLJIIIZ) {
            this.retainedCallbacks.add(iSmartMovieDownloaderListener);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new IWuZhuiDownloaderListener() { // from class: com.ss.android.ugc.aweme.cktemplate.download.SmartMovieDownloaderImpl.wrapWuZhuiListener.1
            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onProgress(float f) {
                Object c098200Yq;
                try {
                    iSmartMovieDownloaderListener.onProgress(f);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WuZhui_SmartMovieDownloaderImpl onProgress failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                }
                if (f >= 1.0f) {
                    SmartMovieDownloaderImpl.wrapWuZhuiListener$releaseOnce(zLJIIIZ, atomicBoolean, this, iSmartMovieDownloaderListener);
                }
            }

            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onSuccess(NLEModel nLEModel) {
                Object c098200Yq;
                try {
                    iSmartMovieDownloaderListener.onSuccess(nLEModel);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WuZhui_SmartMovieDownloaderImpl onSuccess failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                }
                SmartMovieDownloaderImpl.wrapWuZhuiListener$releaseOnce(zLJIIIZ, atomicBoolean, this, iSmartMovieDownloaderListener);
            }

            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onFailure(String str, int i, String str2) {
                Object c098200Yq;
                try {
                    iSmartMovieDownloaderListener.onFailure(str, i, str2);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WuZhui_SmartMovieDownloaderImpl onFailure failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                }
                SmartMovieDownloaderImpl.wrapWuZhuiListener$releaseOnce(zLJIIIZ, atomicBoolean, this, iSmartMovieDownloaderListener);
            }
        };
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public boolean cancelFetch(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_smartmovie_downloader_listener_retain", true, true)) {
            this.retainedCallbacks.clear();
        }
        return this.wuZhuiDownloader.cancelFetch(str);
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public boolean hasCache(String str) {
        return this.wuZhuiDownloader.hasCache(str);
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public boolean hasDavinciResourceCache(String str) {
        return this.wuZhuiDownloader.hasDavinciResourceCache(str);
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public boolean isNeedFetch(String str) {
        return this.wuZhuiDownloader.isNeedFetch(str);
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public void removeCachedFailedUrs(VecStr vecStr) {
        ArrayList arrayList;
        WuZhuiDownloader wuZhuiDownloader = this.wuZhuiDownloader;
        if (vecStr != null) {
            arrayList = new ArrayList(vecStr);
        } else {
            arrayList = null;
        }
        wuZhuiDownloader.removeCachedFailedUrs(arrayList);
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public void fetch(String str, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        this.wuZhuiDownloader.fetch(appAppNameIfNeed(str), wrapWuZhuiListener(iSmartMovieDownloaderListener));
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public String fetch(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        ArrayList arrayList;
        if (vecStr != null) {
            arrayList = new ArrayList(vecStr);
        } else {
            arrayList = new ArrayList();
        }
        return this.wuZhuiDownloader.fetch(toNewList(arrayList), i, wrapWuZhuiListener(iSmartMovieDownloaderListener));
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public String fetchEffectList(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        ArrayList arrayList;
        if (vecStr != null) {
            arrayList = new ArrayList(vecStr);
        } else {
            arrayList = new ArrayList();
        }
        return this.wuZhuiDownloader.fetchEffectList(toNewList(arrayList), i, wrapWuZhuiListener(iSmartMovieDownloaderListener));
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public String fetchResourceList(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        ArrayList arrayList;
        if (vecStr != null) {
            arrayList = new ArrayList(vecStr);
        } else {
            arrayList = new ArrayList();
        }
        return this.wuZhuiDownloader.fetchResourceList(toNewList(arrayList), i, wrapWuZhuiListener(iSmartMovieDownloaderListener));
    }

    public static final void wrapWuZhuiListener$releaseOnce(boolean z, AtomicBoolean atomicBoolean, SmartMovieDownloaderImpl smartMovieDownloaderImpl, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        if (z && atomicBoolean.compareAndSet(false, true)) {
            smartMovieDownloaderImpl.retainedCallbacks.remove(iSmartMovieDownloaderListener);
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.ISmartMovieDownloader
    public String fetch(NLEModel nLEModel, int i, boolean z, boolean z2, int i2, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        VecNLEResourceNodeSPtr allResources;
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "WuZhui_SmartMovieDownloaderImpl fetch model ");
        int value = C0L9B.CC.getValue();
        if (nLEModel != null && (allResources = nLEModel.getAllResources()) != null) {
            for (NLEResourceNode nLEResourceNode : allResources) {
                if (C123100dR.LIZ(nLEResourceNode.getResourceId()) && u.LJJIIJZLJL(nLEResourceNode.getResourceId(), "urs://effect_platform?", false)) {
                    nLEResourceNode.setResourceId(appAppNameIfNeed(nLEResourceNode.getResourceId()));
                }
            }
        }
        return this.wuZhuiDownloader.fetch(nLEModel, i, z, z2, value, wrapWuZhuiListener(iSmartMovieDownloaderListener));
    }
}
