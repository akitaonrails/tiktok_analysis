package com.ss.android.ugc.tiktok.tools.performance.services;

import X.C0VSJ;
import X.C1156790gCz;
import X.C1383680m6w;
import X.C13LN;
import X.C1661300tKi;
import X.C1661520tL4;
import X.C1663090tNb;
import X.C20102213l6;
import X.C201955140j;
import X.C2188811AlT;
import X.C823050WQl;
import X.InterfaceC1663080tNa;
import Y.ARunnableS102S0100000_2;
import android.os.Looper;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService;
import com.ss.android.vesdk.VEFileDownloader;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes26.dex */
public final class VEVideoStreamDownloadServiceImpl implements IVEVideoStreamDownloadService {
    public final ConcurrentHashMap<String, VEFileDownloader> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<InterfaceC1663080tNa> LIZJ = new CopyOnWriteArraySet<>();

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService
    public final void LIZ(InterfaceC1663080tNa interfaceC1663080tNa) {
        this.LIZJ.remove(interfaceC1663080tNa);
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService
    public final void LIZIZ(String str) {
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopStreamDownload url=");
        sbLIZ.append(C13LN.LJZL(80, str));
        sbLIZ.append(" inMap=");
        sbLIZ.append(this.LIZ.containsKey(str));
        C201955140j.LJIJJ(c20102213l6, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        VEFileDownloader vEFileDownloaderRemove = this.LIZ.remove(str);
        if (vEFileDownloaderRemove != null) {
            vEFileDownloaderRemove.destroyFileDownload();
        }
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService
    public final void LIZJ(C1661520tL4 c1661520tL4) {
        for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (new C0VSJ(value).exists()) {
                c1661520tL4.LIZIZ(key, value);
            }
        }
        this.LIZJ.add(c1661520tL4);
    }

    @Override // com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService
    public final void LIZLLL(List list, String str, String str2, C1383680m6w c1383680m6w, C1156790gCz c1156790gCz, int i) {
        Object next;
        String strLIZIZ;
        StringBuilder sbLIZ;
        String str3;
        int effectiveConnectionType;
        if (!list.isEmpty() && !a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!a0.LJJJIL((String) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str4 = (String) next;
            if (str4 != null && !a0.LJJJIL(str4)) {
                C1661300tKi.LIZ.getClass();
                if (!C1661300tKi.LIZIZ()) {
                    C201955140j.LIZLLL(C20102213l6.LIZIZ, "VEVideoStream", "startStreamDownload onRetry: network not available");
                    c1383680m6w.LIZJ();
                    return;
                }
                if (i > 0 && (effectiveConnectionType = TTNetInit.getEffectiveConnectionType()) < i) {
                    C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startStreamDownload onRetry: netLevel=");
                    sbLIZ2.append(effectiveConnectionType);
                    sbLIZ2.append(" < threshold=");
                    sbLIZ2.append(i);
                    C201955140j.LIZLLL(c20102213l6, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ2));
                    c1383680m6w.LIZJ();
                    return;
                }
                if (!a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
                    if (u.LJIIZILJ(str, "/", false)) {
                        sbLIZ = C2188811AlT.LIZ();
                        str3 = str;
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        str3 = File.separator;
                    }
                    sbLIZ.append(str3);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "";
                }
                VEFileDownloader vEFileDownloader = this.LIZ.get(str4);
                if (vEFileDownloader != null) {
                    C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("startStreamDownload: destroy existing downloader for url=");
                    sbLIZ3.append(str4);
                    C201955140j.LIZLLL(c20102213l62, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                    vEFileDownloader.destroyFileDownload();
                    this.LIZ.remove(str4);
                }
                VEFileDownloader vEFileDownloader2 = new VEFileDownloader();
                this.LIZ.put(str4, vEFileDownloader2);
                C1663090tNb c1663090tNb = new C1663090tNb(this, str, str4, strLIZIZ, i, c1156790gCz, vEFileDownloader2, c1383680m6w);
                if (Looper.getMainLooper().isCurrentThread()) {
                    C823050WQl.LIZLLL().execute(new ARunnableS102S0100000_2(c1663090tNb, 40));
                    return;
                } else {
                    c1663090tNb.invoke();
                    return;
                }
            }
            C201955140j.LIZLLL(C20102213l6.LIZIZ, "VEVideoStream", "startStreamDownload onRetry: all urls blank");
            c1383680m6w.LIZJ();
            return;
        }
        C20102213l6 c20102213l63 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startStreamDownload onRetry: urlsEmpty=");
        sbLIZ4.append(list.isEmpty());
        sbLIZ4.append(" cacheDirBlank=");
        sbLIZ4.append(a0.LJJJIL(str));
        sbLIZ4.append(" fileNameBlank=");
        sbLIZ4.append(a0.LJJJIL(str2));
        C201955140j.LIZLLL(c20102213l63, "VEVideoStream", C2188811AlT.LIZIZ(sbLIZ4));
        c1383680m6w.LIZJ();
    }
}
