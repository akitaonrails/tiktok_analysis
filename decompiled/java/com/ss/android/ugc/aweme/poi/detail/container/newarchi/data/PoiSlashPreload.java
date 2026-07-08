package com.ss.android.ugc.aweme.poi.detail.container.newarchi.data;

import X.C0BMZ;
import X.C0X52;
import X.C1183580guC;
import X.C1183660guK;
import X.C1188850h2h;
import X.C1188860h2i;
import X.C11NZ;
import X.C1499810p8F;
import X.C1515820pY4;
import X.C280280Ayg;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.detail.container.slash.api.PoiDetailSlashApi;
import com.ss.android.ugc.aweme.slash.data.SlashPage;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSlashPreload implements InterfaceC727570SgN<PoiDetailSlashApi, C11NZ<C0X52<C1515820pY4<SlashPage>>>> {
    public static final C1183660guK Companion = new Object() { // from class: X.0guK
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("preload_flag")) != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1985406959) {
                if (iHashCode != -53302717) {
                    if (iHashCode == 810067679 && string.equals("comment_anchor_touch_preload")) {
                        return C1188850h2h.LIZ();
                    }
                } else if (string.equals("video_anchor_touch_preload")) {
                    return C1188860h2i.LIZ();
                }
            } else if (string.equals("anchor_show_preload")) {
                if (!C0BMZ.LIZ() && ((Number) C280280Ayg.LIZ.getValue()).intValue() != 1) {
                    return false;
                }
                return true;
            }
        }
        return C1183580guC.LIZ();
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        long j = 20000;
        if (bundle != null) {
            j = bundle.getLong("timeout", 20000L);
        }
        return new C1499810p8F(false, Api.LIZ, "/tiktok/poi/slash/v1", (int) j, true, 4);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200 A[PHI: r0
      0x0200: PHI (r0v5 X.0gx9) = (r0v3 X.0gx9), (r0v28 X.0gx9) binds: [B:104:0x01f8, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ea  */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C11NZ<X.C0X52<X.C1515820pY4<com.ss.android.ugc.aweme.slash.data.SlashPage>>> preload2(android.os.Bundle r36, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.slash.api.PoiDetailSlashApi>, ? extends com.ss.android.ugc.aweme.poi.detail.container.slash.api.PoiDetailSlashApi> r37) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiSlashPreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.11NZ");
    }
}
