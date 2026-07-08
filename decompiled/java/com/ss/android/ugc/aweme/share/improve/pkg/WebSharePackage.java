package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C0M7Y;
import X.C11S5;
import X.C1324840ka2;
import X.C1370940lmO;
import X.C1371430lnB;
import X.C1374720lsU;
import X.C1374960lss;
import X.C1376500lvM;
import X.C1377200lwU;
import X.C1377230lwX;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2354709Kn;
import X.C2427709fH;
import X.C621180OYa;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1254030ijp;
import X.InterfaceC1369790lkX;
import Y.AfS156S0200000_21;
import Y.AkS45S1000000_21;
import Y.AkS9S1210000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class WebSharePackage extends SharePackage {
    public static final C1377230lwX Companion = new C1377230lwX();
    public String imagePath;
    public String remoteImagePath;

    public final Bundle LJJ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.extras.getString("enter_from"), bundle);
        return bundle;
    }

    public WebSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) throws Throwable {
        String strLIZJ;
        String strLIZJ2 = C1377200lwU.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC1369790lkX, this.description);
        if (this.extras.getBoolean("user_origin_link")) {
            strLIZJ = this.url;
        } else {
            strLIZJ = C1374720lsU.LIZJ(this.url, this.itemType, interfaceC1369790lkX.key(), this.extras.getInt("web_biz_scene_num", 0), this);
        }
        if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "facebook") && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
            if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
                return new C1371430lnB(strLIZJ, this.title, strLIZJ2);
            }
            C1376500lvM c1376500lvM = new C1376500lvM(strLIZJ, strLIZJ2, LJJ());
            String str = this.remoteImagePath;
            if (str == null) {
                str = "";
            }
            String strLJIILL = C1324840ka2.LJIILL(str);
            if (strLJIILL.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C844470XAv.LIZ.getClass();
                sbLIZ.append(C2427709fH.LJIILLIIL(C844470XAv.LIZ()));
                sbLIZ.append("image_for_share.jpg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2354709Kn.LJIJJLI(strLIZIZ);
                C2354709Kn.LIZLLL(strLJIILL, strLIZIZ);
                c1376500lvM.LIZIZ("image", C1374720lsU.LJFF(C844470XAv.LIZ(), strLIZIZ).toString());
            }
            return c1376500lvM;
        }
        return new C1371430lnB(strLIZJ, strLIZJ2, 4);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC19483511Kn<AbstractC1375550ltp> LJIIZILJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        AbstractC19483511Kn abstractC19483511KnLIZ;
        String strLIZJ = C1377200lwU.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC1369790lkX, this.description);
        boolean z = this.extras.getBoolean("user_origin_link");
        if (z) {
            abstractC19483511KnLIZ = AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwO
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    String str = this.LIZ.url;
                    if (str == null) {
                        str = "";
                    }
                    c11ky.onSuccess(str);
                }
            });
        } else {
            String str = this.url;
            abstractC19483511KnLIZ = C1374960lss.LIZ(C1374960lss.LIZ, this.itemType, str, interfaceC1369790lkX.key(), this.extras.getInt("web_biz_scene_num", 0), this, 8);
        }
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "facebook")) {
            return abstractC19483511KnLIZ.LJIIJ(new AkS45S1000000_21(strLIZJ, 0)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ());
        }
        return abstractC19483511KnLIZ.LJIIJ(new AkS9S1210000_21(z, this, interfaceC1369790lkX, strLIZJ, 0)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        AbstractC19483511Kn abstractC19483511KnLIZ;
        String strLIZJ = C1377200lwU.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC1369790lkX, this.description);
        boolean z = this.extras.getBoolean("user_origin_link");
        if (z) {
            abstractC19483511KnLIZ = AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwP
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(C11KY c11ky) {
                    c11ky.onSuccess(this.LIZ.url);
                }
            });
        } else {
            String str = this.url;
            abstractC19483511KnLIZ = C1374960lss.LIZ(C1374960lss.LIZ, this.itemType, str, interfaceC1369790lkX.key(), this.extras.getInt("web_biz_scene_num", 0), this, 8);
        }
        if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "facebook") && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy")) {
            abstractC19483511KnLIZ.LJIIJ(new AkS9S1210000_21(z, this, interfaceC1369790lkX, strLIZJ, 1)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS156S0200000_21(this, function2, 11));
        } else {
            abstractC19483511KnLIZ.LJIIJ(new AkS45S1000000_21(strLIZJ, 1)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS156S0200000_21(this, function2, 10));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return false;
    }
}
