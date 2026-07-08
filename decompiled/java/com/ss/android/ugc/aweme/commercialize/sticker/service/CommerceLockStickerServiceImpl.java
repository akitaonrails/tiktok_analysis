package com.ss.android.ugc.aweme.commercialize.sticker.service;

import X.C04PQ;
import X.C04TD;
import X.C0DHG;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19719212De;
import X.C20684815ws;
import X.C2344009Gk;
import X.C341400DZy;
import X.C341410DZz;
import X.C632670Orh;
import X.C985403tE;
import X.InterfaceC341420Da0;
import android.content.Context;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.CommerceStickerUnlockInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.AwS89S1200000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceLockStickerServiceImpl implements ICommerceLockStickerService {
    public static final /* synthetic */ int LIZ = 0;

    public static ICommerceLockStickerService LIZJ() {
        Object objLIZ = C04TD.LIZ(ICommerceLockStickerService.class, false);
        if (objLIZ != null) {
            return (ICommerceLockStickerService) objLIZ;
        }
        if (C04TD.LLLIZZ == null) {
            synchronized (ICommerceLockStickerService.class) {
                if (C04TD.LLLIZZ == null) {
                    C04TD.LLLIZZ = new CommerceLockStickerServiceImpl();
                }
            }
        }
        return C04TD.LLLIZZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService
    public final boolean LIZ(NewFaceStickerBean newFaceStickerBean) {
        return C341410DZz.LIZ(newFaceStickerBean);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService
    public final boolean LIZIZ(Context context, NewFaceStickerBean newFaceStickerBean, String str) {
        InterfaceC341420Da0 interfaceC341420Da0LIZ;
        CommerceStickerUnlockInfo commerceStickerUnlockInfo;
        String str2;
        if (newFaceStickerBean == null || newFaceStickerBean.id == null || !C341410DZz.LIZ(newFaceStickerBean) || ((interfaceC341420Da0LIZ = C04PQ.LIZ()) != null && interfaceC341420Da0LIZ.LIZJ(newFaceStickerBean.id))) {
            return false;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("prop_id", newFaceStickerBean.id);
        c2344009Gk.LJIIIIZZ("scene_id", "1001");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_toast", c2344009Gk.LIZ);
        CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
        if (commerceSticker != null) {
            commerceStickerUnlockInfo = commerceSticker.getCommerceStickerUnlockInfo();
        } else {
            commerceStickerUnlockInfo = null;
        }
        if (context != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                C632670Orh.LIZIZ(context, new C19719212De(1280471281, new C341400DZy(commerceStickerUnlockInfo, newFaceStickerBean, str, context), true));
                return true;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (commerceStickerUnlockInfo == null || (str2 = commerceStickerUnlockInfo.desc) == null) {
                str2 = "";
            }
            c1397580mTM.LIZIZ(str2);
            c1397580mTM.LJFF(2131850439);
            C985403tE.LIZ(c1397580mTM, new AwS89S1200000_4(context, newFaceStickerBean, str, 1));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return true;
        }
        return true;
    }
}
