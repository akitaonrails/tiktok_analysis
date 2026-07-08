package com.ss.android.ugc.aweme.music.presenter;

import X.InterfaceC1371860lns;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0lq4
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                Music music;
                String string;
                Bundle bundle;
                ShareModel shareModel;
                Serializable serializable = null;
                if (baseSharePackage != null && (shareModel = baseSharePackage.shareModel) != null) {
                    serializable = shareModel.customModel;
                }
                if ((serializable instanceof Music) && (music = (Music) serializable) != null) {
                    if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (string = bundle.getString("process_id")) == null) {
                        string = "";
                    }
                    String mid = music.getMid();
                    String strKey = interfaceC1369790lkX.key();
                    if (!TextUtils.isEmpty(strKey) && !TextUtils.equals(strKey, "qr_code")) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("music_id", mid);
                        c2344009Gk.LJIIIIZZ("platform", strKey);
                        c2344009Gk.LJIIIIZZ("process_id", string);
                        c2344009Gk.LJIIIIZZ("share_mode", "normal_share");
                        C20684815ws.LJIILLIIL("share_music", c2344009Gk.LIZ);
                    }
                    String mid2 = music.getMid();
                    String strKey2 = interfaceC1369790lkX.key();
                    if (z) {
                        C1260870iur c1260870iur = new C1260870iur();
                        c1260870iur.LJIIJ(new C1373260lq8());
                        C1387280mCk c1387280mCk = new C1387280mCk();
                        c1387280mCk.LIZ = mid2;
                        c1387280mCk.LIZIZ = 1;
                        c1387280mCk.LJ = -1;
                        c1387280mCk.LJI = 2;
                        c1387280mCk.LJII = strKey2;
                        c1260870iur.LIZJ(c1387280mCk.LIZ());
                    }
                }
            }
        };
    }

    public MusicShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
