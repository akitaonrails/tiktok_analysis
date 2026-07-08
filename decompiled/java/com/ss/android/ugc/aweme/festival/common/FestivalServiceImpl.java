package com.ss.android.ugc.aweme.festival.common;

import X.AbstractC2199801B7q;
import X.C08HM;
import X.C0VSJ;
import X.C1618240sDG;
import X.C197011126f;
import X.C2137908Zd;
import X.C2188811AlT;
import X.C828040We2;
import X.InterfaceC197013126h;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.io.File;

/* JADX INFO: loaded from: classes30.dex */
public final class FestivalServiceImpl implements IFestivalService {
    @Override // com.ss.android.ugc.aweme.festival.common.IFestivalService
    public final void LIZ(C1618240sDG c1618240sDG) {
        File[] fileArrListFiles;
        C197011126f c197011126fLJIIIIZZ = C197011126f.LJIIIIZZ();
        c197011126fLJIIIIZZ.getClass();
        if (!C828040We2.LIZIZ()) {
            C197011126f.LJI(C197011126f.LLILZ);
            return;
        }
        c197011126fLJIIIIZZ.LLILLL = c1618240sDG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = C197011126f.LLILZ;
        sbLIZ.append(str);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(C08HM.LIZJ(C197011126f.LJII()));
        sbLIZ.append(".zip");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            sbLIZ2.append(C08HM.LIZJ(C197011126f.LJII()));
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (c0vsj2.exists() && c0vsj2.isDirectory() && (fileArrListFiles = c0vsj2.listFiles()) != null && fileArrListFiles.length != 0 && C828040We2.LIZ() != null && C828040We2.LIZ().resEntity != null) {
                String str3 = C828040We2.LIZ().resEntity.md5;
                if (c0vsj.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj), str3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(str2);
                    sbLIZ3.append(C08HM.LIZJ(C197011126f.LJII()));
                    c197011126fLJIIIIZZ.LL = C2188811AlT.LIZIZ(sbLIZ3);
                    InterfaceC197013126h interfaceC197013126h = c197011126fLJIIIIZZ.LLILLL;
                    if (interfaceC197013126h != null) {
                        interfaceC197013126h.LIZ();
                        return;
                    }
                }
            }
        }
        C197011126f.LJI(str);
        String strLJII = C197011126f.LJII();
        if (TextUtils.isEmpty(strLJII)) {
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append(str2);
        sbLIZ4.append(C08HM.LIZJ(strLJII));
        c197011126fLJIIIIZZ.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(c197011126fLJIIIIZZ.LLILLJJLI);
        sbLIZ5.append(".zip");
        C2188811AlT.LIZIZ(sbLIZ5);
        C2137908Zd.LIZJ.LIZIZ(str);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(strLJII);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(C08HM.LIZJ(strLJII));
        sbLIZ6.append(".zip");
        abstractC2199801B7qWith.LIZJ = C2188811AlT.LIZIZ(sbLIZ6);
        abstractC2199801B7qWith.LJIIJ = "legacy_festival_res";
        abstractC2199801B7qWith.LJII = downloadServiceManager.getRetryExpCount();
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJIIL = c197011126fLJIIIIZZ;
        abstractC2199801B7qWith.LIZJ();
    }
}
