package com.ss.android.ugc.aweme.relation.share;

import X.AbstractC1375550ltp;
import X.C1370940lmO;
import X.C1371390ln7;
import X.C1371420lnA;
import X.C1371430lnB;
import X.C1374720lsU;
import X.C20642515q3;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class InviteFriendsSheetPackage extends SharePackage {
    public final String shareTextTemplate;
    public static final C1371390ln7 Companion = new Object() { // from class: X.0ln7
    };
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsSheetPackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        String strLJI = C20642515q3.LJI(2131847899);
        this.shareTextTemplate = strLJI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) throws Throwable {
        String strLIZJ = C1374720lsU.LIZJ(this.url, this.itemType, interfaceC1369790lkX.key(), 0, this);
        String strLJJIFFI = u.LJJIFFI(this.shareTextTemplate, "%s", "", false);
        String strKey = interfaceC1369790lkX.key();
        int iHashCode = strKey.hashCode();
        if (iHashCode != 3059573) {
            if (iHashCode != 96619420) {
                if (iHashCode == 497130182 && strKey.equals("facebook")) {
                    return new C1371430lnB(strLIZJ, strLJJIFFI, 4);
                }
            } else if (strKey.equals("email")) {
                return new C1371430lnB(strLIZJ, this.title, strLJJIFFI);
            }
        } else if (strKey.equals("copy")) {
            return new C1371430lnB(strLIZJ, (String) null, 6);
        }
        return new C1371420lnA(strLIZJ, strLJJIFFI);
    }
}
