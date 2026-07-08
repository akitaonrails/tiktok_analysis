package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicLoggerReportConf_OptTypeAdapter extends TypeAdapter<LinkMicLoggerReportConf> {
    public final Gson LIZ;

    public LinkMicLoggerReportConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicLoggerReportConf read(C09CU c09cu) {
        LinkMicLoggerReportConf linkMicLoggerReportConf = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            linkMicLoggerReportConf = new LinkMicLoggerReportConf(true, "info");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "sladar_report_enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicLoggerReportConf.sladarReportEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "sladar_report_level")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicLoggerReportConf.sladarReportLevel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return linkMicLoggerReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicLoggerReportConf linkMicLoggerReportConf) throws IOException {
        LinkMicLoggerReportConf linkMicLoggerReportConf2 = linkMicLoggerReportConf;
        if (linkMicLoggerReportConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sladar_report_enabled");
        c09dl.LJJJJJL(linkMicLoggerReportConf2.sladarReportEnabled);
        c09dl.LJIILLIIL("sladar_report_level");
        c09dl.LJJJJJ(linkMicLoggerReportConf2.sladarReportLevel);
        c09dl.LJII();
    }
}
