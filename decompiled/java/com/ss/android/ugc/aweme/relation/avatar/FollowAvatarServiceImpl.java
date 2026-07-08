package com.ss.android.ugc.aweme.relation.avatar;

import X.AbstractC1608810ry3;
import X.C1608580rxg;
import X.EnumC1608550rxd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowAvatarServiceImpl implements IFollowAvatarService {
    @Override // com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService
    public final AbstractC1608810ry3<?, ?> LIZ() {
        return new AbstractC1608810ry3<EnumC1608550rxd, C1608580rxg>() { // from class: X.0rxb
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.FOLLOW;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new InterfaceC1608830ry5<EnumC1608550rxd, C1608580rxg>() { // from class: X.0rxc
                    @Override // X.InterfaceC1608830ry5
                    public final InterfaceC1606880ruw LIZLLL(Object obj) {
                        if (obj instanceof User) {
                            User user = (User) obj;
                            if (!C10EU.LJIILLIIL(user) && user.getFollowStatus() == 0) {
                                return EnumC1608550rxd.UNFOLLOW;
                            }
                            return null;
                        }
                        return null;
                    }
                };
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new AbstractC1608790ry1<EnumC1608550rxd, C1608580rxg>((C1608580rxg) interfaceC426680GoE) { // from class: X.0rxa
                    public final C1608580rxg LIZLLL;

                    @Override // X.AbstractC1608790ry1
                    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZLLL = c1608580rxg;
                    }

                    @Override // X.AbstractC1608790ry1
                    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
                        if (C1608560rxe.LIZ[((EnumC1608550rxd) interfaceC1606880ruw).ordinal()] != 1) {
                            return null;
                        }
                        return new C1606960rv4(new C1606970rv5(new C1609250ryl(C1606920rv0.LIZ, new C1608470rxV(null, null, 7), null, AFwS245S0000000_12.get$arr$(19), new AwS603S0100000_24(this, 20), AFwS236S0000000_6.get$arr$(27), false, false, null, null, 3980)));
                    }
                };
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof EnumC1608550rxd)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }
}
