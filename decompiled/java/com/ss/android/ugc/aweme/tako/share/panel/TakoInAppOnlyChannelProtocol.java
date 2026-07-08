package com.ss.android.ugc.aweme.tako.share.panel;

import X.InterfaceC1371860lns;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.tako.share.panel.TakoSharePackage;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoInAppOnlyChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0m5c
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                TakoSharePackage takoSharePackage;
                String str;
                if ((baseSharePackage instanceof TakoSharePackage) && (takoSharePackage = (TakoSharePackage) baseSharePackage) != null && z) {
                    if (takoSharePackage.isVideoMedia) {
                        str = "share_video";
                    } else {
                        str = "share_picture";
                    }
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str2 = takoSharePackage.commonParams.get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = takoSharePackage.commonParams.get("enter_method");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = takoSharePackage.commonParams.get("process_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = takoSharePackage.commonParams.get("tako_session_id");
                    if (str5 == null) {
                        str5 = "";
                    }
                    C1862330yYx.LJJ(c1862330yYx, str2, str3, str4, str5, takoSharePackage.commonParams.get("tako_chat_id"), str, "click_send", null, null, null, null, null, null, null, C2097908Jt.LIZJ(new Pair("message_id", takoSharePackage.mobMessageId)), 49024);
                }
            }
        };
    }

    public TakoInAppOnlyChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
