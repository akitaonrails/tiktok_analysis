package com.ss.android.ugc.aweme.cktemplate.download;

import X.C01GW;
import X.C07X0;
import X.C08SN;
import X.C08SO;
import X.C0C64;
import X.C0L6T;
import X.C0L6V;
import X.C0L9B;
import X.C0VSJ;
import X.C118300cf;
import X.C123100dR;
import X.C13LP;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C255810A0t;
import X.C291060Bay;
import X.C297501Dh;
import X.C452501pT;
import X.C533120KvW;
import X.C535880Kzy;
import X.InterfaceC531800KtO;
import X.InterfaceC533130KvX;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.ResourceUtil;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class WuZhuiDownloader implements IWuZhuiDownloader {
    public static final C0L6V Companion = new Object() { // from class: X.0L6V
    };
    public final List<String> LIZ = new ArrayList();
    public final C01GW LIZIZ;

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public boolean cancelFetch(String str) {
        return false;
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public void clearEpCache() {
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public boolean hasCache(String str) {
        return false;
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public boolean hasDavinciResourceCache(String str) {
        return false;
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public boolean isNeedFetch(String str) {
        return false;
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public void removeCachedFailedUrs(List<String> list) {
    }

    public WuZhuiDownloader() {
        new LinkedHashMap();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(74));
        this.LIZIZ = c01gwLIZIZ;
        c01gwLIZIZ.getValue();
    }

    public static String LIZ(String str) {
        String strLIZ;
        boolean z;
        C07X0 c07x0 = C533120KvW.LIZ;
        InterfaceC533130KvX interfaceC533130KvX = C533120KvW.LIZIZ.get(new C297501Dh(str).LIZ);
        if (interfaceC533130KvX != null) {
            strLIZ = interfaceC533130KvX.LIZJ(str);
        } else {
            strLIZ = null;
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z && a0.LJJIIZI(str, "app_name=", false)) {
            String str2 = (String) ((LinkedHashMap) new C297501Dh(str).LIZIZ).get("app_name");
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("&app_name=");
                sbLIZ.append(str2);
                strLIZ = LIZ(u.LJJIFFI(str, C2188811AlT.LIZIZ(sbLIZ), "", false));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchResourceFromCache: urs ");
        sbLIZ2.append(str);
        sbLIZ2.append(" -> ");
        sbLIZ2.append(strLIZ);
        C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ2));
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }

    public final void setMaterialDownloadConfig(C07X0 c07x0) {
        C07X0 c07x02 = C533120KvW.LIZ;
        C533120KvW.LIZ = c07x0;
        C533120KvW.LIZIZ();
    }

    public final void updateNLEModelResourceFile(NLEModel nLEModel) {
        int i = 0;
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            int i2 = i + 1;
            if (i >= 0) {
                NLEResourceNode nLEResourceNode2 = nLEResourceNode;
                if (nLEResourceNode2.hasResourceId()) {
                    String resourceId = nLEResourceNode2.getResourceId();
                    boolean z = true;
                    if (resourceId != null && resourceId.length() != 0) {
                        String resourceFile = nLEResourceNode2.getResourceFile();
                        if (resourceFile == null) {
                            resourceFile = "";
                        }
                        if (resourceFile.length() == 0 || !C2286708xd.LIZJ(resourceFile)) {
                            String strLIZ = LIZ(nLEResourceNode2.getResourceId());
                            if (strLIZ.length() != 0) {
                                z = false;
                            }
                            if (!z) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("updateNLEModelResourceFile cache patch resourceId=");
                                sbLIZ.append(nLEResourceNode2.getResourceId());
                                sbLIZ.append(" oldFile=");
                                sbLIZ.append(resourceFile);
                                sbLIZ.append(" newFile=");
                                sbLIZ.append(strLIZ);
                                C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ));
                                LIZIZ(nLEResourceNode2, strLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("updateNLEModelResourceFile >>>>>  resourceId=");
                                sbLIZ2.append(nLEResourceNode2.getResourceId());
                                sbLIZ2.append(" file = ");
                                sbLIZ2.append(strLIZ);
                                C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ResourceUtil.updateRichContentResourceForTextSticker(nLEModel);
    }

    public static void LIZIZ(NLEResourceNode nLEResourceNode, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateResourceFile resourceId=");
        sbLIZ.append(nLEResourceNode.getResourceId());
        sbLIZ.append(" finalPath=");
        sbLIZ.append(str);
        C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ));
        ResourceUtil.updateResourceFile(nLEResourceNode, str);
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public void fetch(String str, final IWuZhuiDownloaderListener iWuZhuiDownloaderListener) {
        if (C255810A0t.LIZ()) {
            if (iWuZhuiDownloaderListener == null) {
                iWuZhuiDownloaderListener = null;
            } else {
                iWuZhuiDownloaderListener = new WuZhuiDownloader$TerminalListenerGate$Companion$wrap$1(new C0L6T(iWuZhuiDownloaderListener));
            }
        }
        if (str != null && str.length() != 0) {
            C533120KvW.LIZ(str, new InterfaceC531800KtO() { // from class: X.0L6S
                @Override // X.InterfaceC531800KtO
                public final void LJJI(String str2, String str3) {
                    IWuZhuiDownloaderListener iWuZhuiDownloaderListener2 = iWuZhuiDownloaderListener;
                    if (iWuZhuiDownloaderListener2 != null) {
                        iWuZhuiDownloaderListener2.onSuccess(null);
                    }
                }

                @Override // X.InterfaceC531800KtO
                public final void onError(String str2, int i, String str3) {
                    IWuZhuiDownloaderListener iWuZhuiDownloaderListener2 = iWuZhuiDownloaderListener;
                    if (iWuZhuiDownloaderListener2 != null) {
                        iWuZhuiDownloaderListener2.onFailure(str2, i, str3);
                    }
                }
            });
        } else if (iWuZhuiDownloaderListener != null) {
            iWuZhuiDownloaderListener.onFailure(str, -1, "urs is empty");
        }
    }

    public final void fetchResourceWithPath(String str, InterfaceC531800KtO interfaceC531800KtO) {
        if (str != null && str.length() != 0) {
            C533120KvW.LIZ(str, interfaceC531800KtO);
        } else {
            interfaceC531800KtO.onError("", -1, "urs is empty");
        }
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public String fetch(List<String> list, int i, IWuZhuiDownloaderListener iWuZhuiDownloaderListener) {
        int size;
        if (!C291060Bay.LIZ()) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch(list): size=");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ));
        return fetchEffectList(list, i, iWuZhuiDownloaderListener);
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public String fetchEffectList(List<String> list, int i, final IWuZhuiDownloaderListener iWuZhuiDownloaderListener) {
        boolean z;
        if (C255810A0t.LIZ()) {
            if (iWuZhuiDownloaderListener == null) {
                iWuZhuiDownloaderListener = null;
            } else {
                iWuZhuiDownloaderListener = new WuZhuiDownloader$TerminalListenerGate$Companion$wrap$1(new C0L6T(iWuZhuiDownloaderListener));
            }
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (iWuZhuiDownloaderListener != null) {
                iWuZhuiDownloaderListener.onProgress(1.0f);
            }
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(C13LP.LLIIIZ(C13LP.LJJJJLI(list)));
        final AtomicLong atomicLong = new AtomicLong(arrayList.size());
        final ArrayList arrayList2 = new ArrayList();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_use_new_downloader", true, false)) {
            for (String str : arrayList) {
                if (str != null && str.length() != 0) {
                    String str2 = new C297501Dh(str).LIZ;
                    if (Intrinsics.LJFF(str2, "effect_platform") || Intrinsics.LJFF(str2, "material_resource")) {
                        arrayList2.add(str);
                    }
                }
            }
            if ((!arrayList2.isEmpty()) && !arrayList2.isEmpty()) {
                Map mapLIZ = C08SO.LIZ(new C08SN<String, String>() { // from class: X.07jq
                    @Override // X.C08SN
                    public final Iterator<String> LIZ() {
                        return arrayList2.iterator();
                    }

                    @Override // X.C08SN
                    public final String LIZIZ(String str3) {
                        return str3;
                    }
                });
                List listLLIIII = C13LP.LLIIII(mapLIZ.keySet());
                if (listLLIIII.isEmpty()) {
                    if (iWuZhuiDownloaderListener != null) {
                        iWuZhuiDownloaderListener.onProgress(1.0f);
                    }
                } else {
                    C07X0 c07x0 = C533120KvW.LIZ;
                    C535880Kzy c535880Kzy = new C535880Kzy(mapLIZ, iWuZhuiDownloaderListener, atomicLong);
                    if (listLLIIII.isEmpty()) {
                        c535880Kzy.LJJI("", "");
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : listLLIIII) {
                            String str3 = new C297501Dh((String) obj).LIZ;
                            Object arrayList3 = linkedHashMap.get(str3);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(str3, arrayList3);
                            }
                            ((List) arrayList3).add(obj);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str4 = (String) entry.getKey();
                            List<String> list2 = (List) entry.getValue();
                            InterfaceC533130KvX interfaceC533130KvX = C533120KvW.LIZIZ.get(str4);
                            if (interfaceC533130KvX != null) {
                                interfaceC533130KvX.LIZ(list2, c535880Kzy);
                            } else {
                                for (String str5 : list2) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("no resource handler for host=");
                                    sbLIZ.append(str4);
                                    c535880Kzy.onError(str5, -10004, C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                    }
                }
            }
        }
        for (String str6 : C13LP.LJLI(arrayList, C13LP.LLIIJI(arrayList2))) {
            if (str6 != null && str6.length() != 0) {
                fetch(str6, new IWuZhuiDownloaderListener() { // from class: com.ss.android.ugc.aweme.cktemplate.download.WuZhuiDownloader$fetchEffectOneByOne$1$1
                    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
                    public void onProgress(float f) {
                    }

                    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
                    public void onSuccess(NLEModel nLEModel) {
                        IWuZhuiDownloaderListener iWuZhuiDownloaderListener2;
                        if (atomicLong.decrementAndGet() <= 0 && (iWuZhuiDownloaderListener2 = iWuZhuiDownloaderListener) != null) {
                            iWuZhuiDownloaderListener2.onProgress(1.0f);
                        }
                    }

                    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
                    public void onFailure(String str7, int i2, String str8) {
                        IWuZhuiDownloaderListener iWuZhuiDownloaderListener2;
                        if (atomicLong.decrementAndGet() <= 0 && (iWuZhuiDownloaderListener2 = iWuZhuiDownloaderListener) != null) {
                            iWuZhuiDownloaderListener2.onProgress(1.0f);
                        }
                    }
                });
            }
        }
        return "";
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public String fetchResourceList(List<String> list, int i, IWuZhuiDownloaderListener iWuZhuiDownloaderListener) {
        int size;
        if (!C291060Bay.LIZ()) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchResourceList: size=");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ));
        return fetchEffectList(list, i, iWuZhuiDownloaderListener);
    }

    @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader
    public String fetch(final NLEModel nLEModel, int i, boolean z, boolean z2, int i2, IWuZhuiDownloaderListener iWuZhuiDownloaderListener) {
        String resourceId;
        String lowerCase;
        String resourceFile;
        NLETrack mainTrack;
        int value = i2;
        IWuZhuiDownloaderListener wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 = iWuZhuiDownloaderListener;
        if (C255810A0t.LIZ()) {
            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 == null) {
                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 = null;
            } else {
                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 = new WuZhuiDownloader$TerminalListenerGate$Companion$wrap$1(new C0L6T(wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1));
            }
        }
        if (nLEModel == null) {
            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onSuccess(nLEModel);
            }
            return "";
        }
        boolean z3 = false;
        if (value <= 0 && (mainTrack = nLEModel.getMainTrack()) != null && Intrinsics.LJFF("cutsame", mainTrack.getExtra("business"))) {
            value = C0L9B.CC.getValue();
        }
        VecNLEResourceNodeSPtr allResources = nLEModel.getAllResources();
        final int size = allResources.size();
        final C118300cf c118300cf = new C118300cf();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < size) {
            NLEResourceNode nLEResourceNode = allResources.get(i3);
            if (nLEResourceNode.getResourceId().length() != 0) {
                if (nLEResourceNode.hasResourceFile() && (resourceFile = nLEResourceNode.getResourceFile()) != null && resourceFile.length() != 0 && new C0VSJ(resourceFile).exists()) {
                    int i4 = c118300cf.element + 1;
                    c118300cf.element = i4;
                    if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                        wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onProgress((i4 * 1.0f) / size);
                    }
                } else {
                    String resourceId2 = nLEResourceNode.getResourceId();
                    if (!a0.LJJIIZI(resourceId2, "app_name", z3)) {
                        if (resourceId2.length() != 0 && !a0.LJJIIZI(resourceId2, "app_name", z3)) {
                            C0L9B c0l9b = C0L9B.TT;
                            if ((value == c0l9b.getValue() || value == C0L9B.CC.getValue()) && u.LJJIIJZLJL(resourceId2, "urs://effect_platform", z3)) {
                                if (value == C0L9B.CC.getValue()) {
                                    lowerCase = "CC".toLowerCase(Locale.ROOT);
                                } else if (value != c0l9b.getValue()) {
                                    lowerCase = "";
                                } else {
                                    lowerCase = "TT".toLowerCase(Locale.ROOT);
                                }
                                if (C123100dR.LIZ(lowerCase)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(resourceId2);
                                    sbLIZ.append("&app_name=");
                                    sbLIZ.append(lowerCase);
                                    resourceId2 = C2188811AlT.LIZIZ(sbLIZ);
                                }
                            }
                        }
                        nLEResourceNode.setResourceId(resourceId2);
                    }
                    if (nLEResourceNode.hasResourceId() && (resourceId = nLEResourceNode.getResourceId()) != null && resourceId.length() != 0) {
                        String strLIZ = LIZ(nLEResourceNode.getResourceId());
                        if (strLIZ.length() != 0 && new C0VSJ(strLIZ).exists()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetch cache hit resourceId=");
                            sbLIZ2.append(nLEResourceNode.getResourceId());
                            sbLIZ2.append(" cacheFile=");
                            sbLIZ2.append(strLIZ);
                            C201955140j.LIZIZ("WuZhuiDownloaderJava", C2188811AlT.LIZIZ(sbLIZ2));
                            LIZIZ(nLEResourceNode, strLIZ);
                            nLEResourceNode.setResourceFile(strLIZ);
                            int i5 = c118300cf.element + 1;
                            c118300cf.element = i5;
                            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onProgress((i5 * 1.0f) / size);
                            }
                        } else if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_template_aigt_fixed_asset", true, true) ? !(!z || nLEResourceNode.getNecessary() || C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_async_render_download_all", true, false)) : !(!z || nLEResourceNode.getNecessary() || C0C64.LJIILLIIL().LJIIIZ(31744, "enable_studio_template_async_render_download_all", true, false) || Intrinsics.LJFF(new C297501Dh(resourceId2).LIZ, "asset"))) {
                            int i6 = c118300cf.element + 1;
                            c118300cf.element = i6;
                            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onProgress((i6 * 1.0f) / size);
                            }
                        } else if (((ArrayList) this.LIZ).contains(nLEResourceNode.getResourceId())) {
                            c118300cf.element++;
                            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                                String resourceId3 = nLEResourceNode.getResourceId();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("resource download ");
                                sbLIZ3.append(nLEResourceNode.getResourceId());
                                sbLIZ3.append(" failed");
                                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onFailure(resourceId3, -1, C2188811AlT.LIZIZ(sbLIZ3));
                                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onProgress((c118300cf.element * 1.0f) / size);
                            }
                        } else if (!arrayList.contains(resourceId2)) {
                            arrayList.add(resourceId2);
                        }
                    } else {
                        int i7 = c118300cf.element + 1;
                        c118300cf.element = i7;
                        if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                            wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onProgress((i7 * 1.0f) / size);
                        }
                    }
                }
            }
            i3++;
            z3 = false;
        }
        if (arrayList.isEmpty()) {
            updateNLEModelResourceFile(nLEModel);
            if (wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1 != null) {
                wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1.onSuccess(nLEModel);
            }
            return "";
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final IWuZhuiDownloaderListener iWuZhuiDownloaderListener2 = wuZhuiDownloader$TerminalListenerGate$Companion$wrap$1;
        fetchEffectList(arrayList, i, new IWuZhuiDownloaderListener() { // from class: com.ss.android.ugc.aweme.cktemplate.download.WuZhuiDownloader.fetch.1
            public final void handleSuccess(NLEModel nLEModel2) {
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                if (nLEModel2 != null) {
                    this.updateNLEModelResourceFile(nLEModel2);
                }
                IWuZhuiDownloaderListener iWuZhuiDownloaderListener3 = iWuZhuiDownloaderListener2;
                if (iWuZhuiDownloaderListener3 != null) {
                    iWuZhuiDownloaderListener3.onSuccess(nLEModel2);
                }
            }

            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onProgress(float f) {
                if (C255810A0t.LIZ() && atomicBoolean.get()) {
                    return;
                }
                int i8 = c118300cf.element;
                int i9 = size;
                double d = ((((double) i8) * 1.0d) / ((double) i9)) + (((((double) (i9 - i8)) * 1.0d) / ((double) i9)) * ((double) f));
                IWuZhuiDownloaderListener iWuZhuiDownloaderListener3 = iWuZhuiDownloaderListener2;
                if (iWuZhuiDownloaderListener3 != null) {
                    iWuZhuiDownloaderListener3.onProgress((float) d);
                }
                if (f >= 1.0f) {
                    handleSuccess(nLEModel);
                }
            }

            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onSuccess(NLEModel nLEModel2) {
                handleSuccess(nLEModel2);
            }

            @Override // com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener
            public void onFailure(String str, int i8, String str2) {
                IWuZhuiDownloaderListener iWuZhuiDownloaderListener3 = iWuZhuiDownloaderListener2;
                if (iWuZhuiDownloaderListener3 != null) {
                    iWuZhuiDownloaderListener3.onFailure(str, i8, str2);
                }
            }
        });
        return "";
    }
}
