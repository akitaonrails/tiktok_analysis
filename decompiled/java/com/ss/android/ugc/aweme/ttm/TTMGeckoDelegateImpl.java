package com.ss.android.ugc.aweme.ttm;

import X.AbstractC1552040qUU;
import X.C013C;
import X.C0VSJ;
import X.C1537050q6J;
import X.C1551950qUL;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC613520O4o;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.tiktok.strategycenter.gecko.ITTMGeckoDelegate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TTMGeckoDelegateImpl implements ITTMGeckoDelegate {
    public final ConcurrentHashMap<String, EnumC613520O4o> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();

    @Override // com.tiktok.strategycenter.gecko.ITTMGeckoDelegate
    public final String LIZ(String str, String str2) {
        if (str != null && str2 != null) {
            String str3 = this.LIZJ.get(str);
            if (str3 != null) {
                return str3;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(str));
            sbLIZ.append('/');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (new C0VSJ(strLIZIZ).exists()) {
                return strLIZIZ;
            }
        }
        return null;
    }

    @Override // com.tiktok.strategycenter.gecko.ITTMGeckoDelegate
    public final int LIZIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return 4;
        }
        EnumC613520O4o enumC613520O4o = this.LIZIZ.get(str);
        if (enumC613520O4o != null) {
            return enumC613520O4o.LL;
        }
        if (this.LIZJ.get(str) != null) {
            return 0;
        }
        String anywhereChannelPath = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(str);
        if (anywhereChannelPath == null) {
            return 4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(anywhereChannelPath);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (new C0VSJ(strLIZIZ).exists()) {
            this.LIZJ.put(str, strLIZIZ);
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Override // com.tiktok.strategycenter.gecko.ITTMGeckoDelegate
    public final boolean LIZJ(final String str, final String str2, Map<String, Object> map) {
        Map<String, Map<String, Object>> mapLJIIJ;
        if (str == null || str2 == null) {
            return false;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new Object();
        final C013C c013c = new C013C();
        this.LIZIZ.put(str, EnumC613520O4o.LLILLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
        if (c1551950qULLIZ != null) {
            if (linkedHashMap.isEmpty()) {
                mapLJIIJ = null;
            } else {
                mapLJIIJ = C2097608Jq.LJIIJ(new Pair(accessKey, linkedHashMap));
            }
            c1551950qULLIZ.LIZIZ("default", mapLJIIJ, C2097608Jq.LJIIJ(new Pair(accessKey, C1697810uHb.LJIILJJIL(new CheckRequestBodyModel.TargetChannel(str)))), new AbstractC1552040qUU() { // from class: X.0O4p
                @Override // X.AbstractC1552040qUU
                public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLocalNewestVersion:channel:");
                    sbLIZ.append(localPackageModel.getChannel());
                    sbLIZ.append(" version:");
                    sbLIZ.append(Long.valueOf(localPackageModel.getLatestVersion()));
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(str));
                    sbLIZ2.append('/');
                    sbLIZ2.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    if (!new C0VSJ(strLIZIZ).exists()) {
                        this.LIZIZ.put(str, EnumC613520O4o.LLIZ);
                        C1550610qSB.LIZ(accessKey, str);
                    } else {
                        this.LIZJ.put(str, strLIZIZ);
                        this.LIZIZ.put(str, EnumC613520O4o.LLILLJJLI);
                    }
                    c013c.element = true;
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJII(Throwable th, Map map2) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCheckServerVersionFail: e.message:");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LIZIZ.put(str, EnumC613520O4o.LLILZLL);
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIIIIZZ(Map<String, ? extends List<? extends android.util.Pair<String, Long>>> map2, Map<String, ? extends List<? extends UpdatePackage>> map3) {
                    List<? extends UpdatePackage> list;
                    String channel;
                    List<? extends android.util.Pair<String, Long>> list2;
                    Object obj;
                    if (map2 != null && (list2 = map2.get(accessKey)) != null) {
                        String str3 = str;
                        Iterator<? extends android.util.Pair<String, Long>> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            android.util.Pair<String, Long> next = it2.next();
                            android.util.Pair<String, Long> pair = next;
                            if (pair != null) {
                                obj = pair.first;
                            } else {
                                obj = null;
                            }
                            if (Intrinsics.LJFF(obj, str3)) {
                                if (next != null) {
                                    return;
                                }
                            }
                        }
                    }
                    if (map3 != null && (list = map3.get(accessKey)) != null) {
                        String str4 = str;
                        Iterator<? extends UpdatePackage> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            UpdatePackage next2 = it3.next();
                            UpdatePackage updatePackage = next2;
                            if (updatePackage != null) {
                                channel = updatePackage.getChannel();
                            } else {
                                channel = null;
                            }
                            if (Intrinsics.LJFF(channel, str4)) {
                                if (next2 != null) {
                                    return;
                                }
                            }
                        }
                    }
                    this.LIZIZ.put(str, EnumC613520O4o.LLILZIL);
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateFailed: e.message:");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LIZIZ.put(str, EnumC613520O4o.LLILZ);
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIL(long j, UpdatePackage updatePackage) {
                    String channel;
                    Long lValueOf;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateSuccess:channel:");
                    String channel2 = null;
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    sbLIZ.append(channel);
                    sbLIZ.append(" version:");
                    if (updatePackage != null) {
                        lValueOf = Long.valueOf(updatePackage.getVersion());
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ.append(lValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (updatePackage != null) {
                        channel2 = updatePackage.getChannel();
                    }
                    if (Intrinsics.LJFF(channel2, str)) {
                        this.LIZIZ.put(str, EnumC613520O4o.LLILLJJLI);
                        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZJ;
                        String str3 = str;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(str));
                        sbLIZ2.append('/');
                        sbLIZ2.append(str2);
                        concurrentHashMap.put(str3, C2188811AlT.LIZIZ(sbLIZ2));
                        c013c.element = true;
                    }
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJI(int i, Throwable th, Map map2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCheckRequestIntercept: channel:");
                    sbLIZ.append(str);
                    sbLIZ.append(" error: ");
                    sbLIZ.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath(str));
                    sbLIZ2.append('/');
                    sbLIZ2.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    if (!new C0VSJ(strLIZIZ).exists()) {
                        this.LIZIZ.put(str, EnumC613520O4o.LLIZ);
                        C1550610qSB.LIZ(accessKey, str);
                    } else {
                        this.LIZJ.put(str, strLIZIZ);
                        this.LIZIZ.put(str, EnumC613520O4o.LLILLJJLI);
                    }
                    try {
                        c259800zU.element.notifyAll();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            });
        }
        synchronized (c259800zU.element) {
            try {
                c259800zU.element.wait(20000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c013c.element;
    }
}
