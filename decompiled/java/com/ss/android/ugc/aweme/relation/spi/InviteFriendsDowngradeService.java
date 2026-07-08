package com.ss.android.ugc.aweme.relation.spi;

import X.C0T09;
import X.C1234360iE6;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.InterfaceC1234320iE2;
import X.InterfaceC1234330iE3;
import X.InterfaceC1234410iEB;
import X.InterfaceC1234700iEe;
import X.InterfaceC1362350lYX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteFriendsDowngradeService implements IInviteFriendsService {
    public final C1234360iE6 LIZ = new InterfaceC1234320iE2() { // from class: X.0iE6
        @Override // X.InterfaceC1234320iE2
        public final void LIZ(EnumC1373410lqN enumC1373410lqN, C0XI4 c0xi4) {
        }

        @Override // X.InterfaceC1234320iE2
        public final void deInit() {
        }
    };

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final C0T09 LIZIZ(C19EG c19eg, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234330iE3 LIZJ() {
        return new InterfaceC1234330iE3() { // from class: X.0iDp
            public final C2252321DDq LIZ = C1BNE.LIZ(new C612550O0v(0));

            @Override // X.InterfaceC1234330iE3
            public final void LIZ(User user) {
            }

            @Override // X.InterfaceC1234330iE3
            public final void LIZJ(Context context, Uri uri) {
            }

            @Override // X.InterfaceC1234330iE3
            public final void deInit() {
            }

            @Override // X.InterfaceC1234330iE3
            public final C05YD<C612550O0v> LIZIZ() {
                return this.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJI() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("[InviteFriendsDowngradeService]", "Used downgrade service - syncLegacyPopupStatus");
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234410iEB LJII() {
        return new InterfaceC1234410iEB() { // from class: X.0iE4
            @Override // X.InterfaceC1234410iEB
            public final void LIZ(C19EG c19eg, Bundle bundle) {
            }

            @Override // X.InterfaceC1234410iEB
            public final void LIZIZ(C19EG c19eg, C1233510iCj c1233510iCj, Aweme aweme, Bundle bundle) {
            }

            @Override // X.InterfaceC1234410iEB
            public final void LIZJ(AbstractC1234430iED abstractC1234430iED) {
            }

            @Override // X.InterfaceC1234410iEB
            public final void LIZLLL(InterfaceC1234720iEg interfaceC1234720iEg) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234320iE2 LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJFF(Activity activity) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("[InviteFriendsDowngradeService]", "Used downgrade service - tryShowDisplayProfileWhenSharingLinksFloatingNotice");
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1362350lYX LIZLLL(Context context, Bundle bundle) {
        return new InterfaceC1362350lYX() { // from class: X.0iE5
            @Override // X.InterfaceC1362350lYX
            public final void LJJ(boolean z) {
            }

            @Override // X.InterfaceC1362350lYX
            public final void show() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234700iEe LJ(Context context, Bundle bundle, String str, String str2, AwS422S0200000_21 awS422S0200000_21, AwS422S0200000_21 awS422S0200000_212) {
        return new InterfaceC1234700iEe() { // from class: X.0iE7
            @Override // X.InterfaceC1234700iEe
            public final void show() {
            }
        };
    }
}
