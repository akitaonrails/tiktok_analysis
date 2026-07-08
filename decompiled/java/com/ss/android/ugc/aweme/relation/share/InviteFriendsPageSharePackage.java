package com.ss.android.ugc.aweme.relation.share;

import X.C11NJ;
import X.C11S5;
import X.C1234230iDt;
import X.C1239300iM4;
import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1701940uOG;
import X.C19EG;
import X.C621180OYa;
import X.InterfaceC1234240iDu;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class InviteFriendsPageSharePackage extends LinkDefaultSharePackage {
    public static final int $stable = 8;
    public final C11NJ compositeDisposable;
    public final String enterFrom;
    public final InterfaceC1234240iDu inviteApi;
    public final String inviteMode;
    public SmgSettingsModel smgSettingsModel;

    public final void LJJ() {
        this.compositeDisposable.LJ();
    }

    public final void LJJIFFI() {
        this.compositeDisposable.LIZ(C1239300iM4.LIZLLL(this.inviteApi.LIZLLL().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, new AwS595S0100000_16(this, 140)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsPageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        C1234230iDt c1234230iDt = C1234230iDt.LIZIZ;
        this.inviteMode = "invitevia";
        this.enterFrom = "invite_friends";
        this.inviteApi = c1234230iDt;
        this.compositeDisposable = new C11NJ();
    }

    public final List<InterfaceC1369790lkX> LJJI(C19EG c19eg) {
        C1371600lnS c1371600lnS = new C1371600lnS();
        C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, c19eg, true);
        c1371600lnS.LJJIIJ = this;
        c1371600lnS.LIZIZ(new CopyLinkChannel(false));
        return new C1371590lnR(c1371600lnS).LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[PHI: r0
      0x00ef: PHI (r0v34 java.lang.String) = (r0v24 java.lang.String), (r0v36 java.lang.String) binds: [B:34:0x00ec, B:29:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(android.content.Context r16, X.InterfaceC1369790lkX r17) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage.LJI(android.content.Context, X.0lkX):boolean");
    }
}
