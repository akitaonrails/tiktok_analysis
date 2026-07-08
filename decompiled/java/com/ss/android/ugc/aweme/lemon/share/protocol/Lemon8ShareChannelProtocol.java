package com.ss.android.ugc.aweme.lemon.share.protocol;

import X.C1374810lsd;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.share.Lemon8SharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8ShareChannelProtocol extends TTShareChannelProtocol {
    public final List<InterfaceC1369790lkX> LLILLL;

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lOZ
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                Serializable serializable;
                Aweme aweme;
                Object obj;
                PostModeDetailParams postModeDetailParams;
                String str;
                Bundle bundle;
                ShareModel shareModel;
                String str2 = null;
                if (!(baseSharePackage instanceof Lemon8SharePackage)) {
                    baseSharePackage = null;
                }
                C1356160lOY c1356160lOY = C1356160lOY.LIZ;
                if (baseSharePackage != null && (shareModel = baseSharePackage.shareModel) != null) {
                    serializable = shareModel.customModel;
                } else {
                    serializable = null;
                }
                if (serializable instanceof Aweme) {
                    aweme = (Aweme) serializable;
                } else {
                    aweme = null;
                }
                if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                    try {
                        obj = bundle.get("post_mode_detail_params");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj instanceof PostModeDetailParams) {
                    postModeDetailParams = (PostModeDetailParams) obj;
                } else {
                    postModeDetailParams = null;
                }
                c1356160lOY.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
                if (postModeDetailParams != null) {
                    str = postModeDetailParams.enterMethod;
                } else {
                    str = null;
                }
                c2344009Gk.LJFF("enter_method", str);
                C1355960lOE.LIZLLL(c2344009Gk, aweme);
                C1355960lOE.LIZ(c2344009Gk, aweme);
                C1355960lOE.LIZIZ(c2344009Gk, aweme);
                C1ER1 c1er1 = C1ER1.LIZIZ;
                if (postModeDetailParams != null) {
                    str2 = postModeDetailParams.eventType;
                }
                C641850PFn.LIZ(c2344009Gk, c1er1.fetchSearchParams(str2, ""));
                c2344009Gk.LJFF("enter_method", "click_share_button");
                C20684815ws.LJIILLIIL("share_video", c2344009Gk.LIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final List<InterfaceC1369790lkX> KB0() {
        return this.LLILLL;
    }

    public Lemon8ShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CopyLinkChannel(false));
        InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
        if (interfaceC1369790lkXLIZ != null) {
            arrayList.add(interfaceC1369790lkXLIZ);
        }
        this.LLILLL = arrayList;
    }
}
