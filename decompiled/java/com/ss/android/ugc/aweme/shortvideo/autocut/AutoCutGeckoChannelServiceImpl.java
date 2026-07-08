package com.ss.android.ugc.aweme.shortvideo.autocut;

import X.C08LY;
import X.C09RB;
import X.C0VSJ;
import X.C1133920fc6;
import X.C13BV;
import X.C13LQ;
import X.C13WS;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C512401z8;
import X.C5180020c;
import com.ss.android.ugc.aweme.autocut.IAutoCutGeckoChannelService;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes31.dex */
public final class AutoCutGeckoChannelServiceImpl implements IAutoCutGeckoChannelService {
    @Override // com.ss.android.ugc.aweme.autocut.IAutoCutGeckoChannelService
    public final void LIZ(String str) {
        C13WS.LIZ.getClass();
        C13WS.LIZ(null, str);
    }

    @Override // com.ss.android.ugc.aweme.autocut.IAutoCutGeckoChannelService
    public final List LIZIZ(String str) {
        Sequence sequenceLJIIJJI;
        List listLJJII;
        String strLIZ = C1553670qX7.LIZ();
        if (strLIZ.length() == 0) {
            return C13BV.INSTANCE;
        }
        String strLJFF = C1552050qUV.LJFF("offlineX", strLIZ, str);
        if (strLJFF != null && strLJFF.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(strLJFF);
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null && (sequenceLJIIJJI = C13LQ.LJIIJJI(fileArrListFiles)) != null && (listLJJII = C09RB.LJJII(new C08LY(new C1133920fc6(C09RB.LJIIIZ(sequenceLJIIJJI, new C5180020c(0)), new C512401z8(13)), AFwS271S0000000_28.get$arr$(212)))) != null) {
                    return listLJJII;
                }
                return C13BV.INSTANCE;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
