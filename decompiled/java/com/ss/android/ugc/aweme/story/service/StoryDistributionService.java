package com.ss.android.ugc.aweme.story.service;

import X.AbstractC1606860ruu;
import X.AbstractC1607170rvP;
import X.AbstractC1608810ry3;
import X.AbstractC427610Gpj;
import X.AbstractC994080byY;
import X.C1601110rld;
import X.C1606270rtx;
import X.C1606300ru0;
import X.C1606330ru3;
import X.C1606750ruj;
import X.C281310B0v;
import X.C728320Sha;
import X.C735590StJ;
import X.C735620StM;
import X.InterfaceC1605730rt5;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService;
import com.ss.android.ugc.aweme.story.avatar.adaper.AvatarStoryDataAdapter;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryDistributionService implements IStoryDistributionService {
    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC994080byY, C1606330ru3> LJ() {
        return new AbstractC1608810ry3<AbstractC994080byY, C1606330ru3>() { // from class: X.0rvC
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.STORY_REVEAL;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new InterfaceC1608830ry5<AbstractC994080byY, C1606330ru3>() { // from class: X.0rv8
                    @Override // X.InterfaceC1608830ry5
                    public final InterfaceC1606880ruw LIZLLL(Object obj) {
                        User user;
                        if (!(obj instanceof User) || (user = (User) obj) == null || !C727450SgB.LIZ(user)) {
                            return null;
                        }
                        List<User> revealDisplayUsers = user.getRevealDisplayUsers();
                        if (revealDisplayUsers == null) {
                            revealDisplayUsers = C13BV.INSTANCE;
                        }
                        int size = revealDisplayUsers.size();
                        if (size != 0 && size != 1) {
                            if (size != 2) {
                                return new C994070byX(C13LP.LL(revealDisplayUsers, 3));
                            }
                            return new C994060byW(revealDisplayUsers);
                        }
                        return new AbstractC994080byY() { // from class: X.0byZ
                            @Override // X.InterfaceC1606880ruw
                            public final String getString() {
                                return "story_reveal_centralized_entry_basic";
                            }
                        };
                    }
                };
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1607030rvB((C1606330ru3) interfaceC426680GoE);
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof AbstractC994080byY)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final InterfaceC1605730rt5 LJI() {
        return (InterfaceC1605730rt5) C728320Sha.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final boolean LIZJ() {
        return C1601110rld.LIZ() && !C281310B0v.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC427610Gpj, C1606300ru0> LIZ() {
        return new AbstractC1608810ry3<AbstractC427610Gpj, C1606300ru0>() { // from class: X.0rvJ
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.STORY_CELEBRATION;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1607130rvL();
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                final C1606300ru0 c1606300ru0 = (C1606300ru0) interfaceC426680GoE;
                return new AbstractC1608790ry1<AbstractC427610Gpj, C1606300ru0>(c1606300ru0) { // from class: X.0rvK
                    public final C1606300ru0 LIZLLL;

                    @Override // X.AbstractC1608790ry1
                    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZLLL = c1606300ru0;
                    }

                    @Override // X.AbstractC1608790ry1
                    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
                        AbstractC427610Gpj abstractC427610Gpj = (AbstractC427610Gpj) interfaceC1606880ruw;
                        if (abstractC427610Gpj instanceof C427600Gpi) {
                            return new C1606960rv4(new C1606970rv5(new C1609250ryl(new C1607340rvg(AnonymousClass0207.get$arr$(137), 2), new C1608470rxV(AFwS231S0000000_3.get$arr$(226), AFwS231S0000000_3.get$arr$(227), 4), null, AFwS259S0000000_21.get$arr$(413), new AwS585S0100000_6(abstractC427610Gpj, 372), null, false, false, AnonymousClass0207.get$arr$(138), null, 3532)));
                        }
                        return null;
                    }
                };
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof AbstractC427610Gpj)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<C735590StJ, C735620StM> LIZIZ() {
        return new AbstractC1608810ry3<C735590StJ, C735620StM>() { // from class: X.0rvH
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.STORY_RELATION;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1607140rvM();
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1607100rvI((C735620StM) interfaceC426680GoE);
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof C735590StJ)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC1607170rvP, C1606270rtx> LIZLLL() {
        return new AbstractC1608810ry3<AbstractC1607170rvP, C1606270rtx>() { // from class: X.0rvD
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.SIMPLE_STORY;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1607060rvE();
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1606900ruy((C1606270rtx) interfaceC426680GoE);
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof AbstractC1607170rvP)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC1606860ruu, C1606750ruj> LJFF() {
        return new AbstractC1608810ry3<AbstractC1606860ruu, C1606750ruj>() { // from class: X.0rvG
            @Override // X.AbstractC1608810ry3, X.InterfaceC1608800ry2
            public final AbstractC1608840ry6<AbstractC1606860ruu, C1606750ruj> LIZLLL() {
                return new C1608920ryE();
            }

            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.STORY;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new AvatarStoryDataAdapter((C1606750ruj) interfaceC426680GoE);
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new C1606890rux((C1606750ruj) interfaceC426680GoE);
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof AbstractC1606860ruu)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }
}
