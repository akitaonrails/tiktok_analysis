package com.ss.android.ugc.aweme.service;

import X.AbstractC1608810ry3;
import X.C423900Gjk;
import X.C426690GoF;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes25.dex */
public final class SocInteractionAvatarServiceImpl implements ISocInteractionAvatarService {
    @Override // com.ss.android.ugc.aweme.service.ISocInteractionAvatarService
    public final AbstractC1608810ry3<?, ?> LIZ() {
        return new AbstractC1608810ry3<C423900Gjk, C426690GoF>() { // from class: X.0I0r
            @Override // X.InterfaceC1608800ry2
            public final EnumC1607270rvZ LIZ() {
                return EnumC1607270rvZ.INTERACTION;
            }

            @Override // X.InterfaceC1608800ry2
            public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
                return new InterfaceC1608830ry5<C423900Gjk, C426690GoF>() { // from class: X.0I0q
                    @Override // X.InterfaceC1608830ry5
                    public final InterfaceC1606880ruw LIZLLL(Object obj) {
                        List<String> midResolutionUrl;
                        EnumC428990Grx enumC428990Grx;
                        if (obj instanceof StoryInteraction) {
                            StoryInteraction storyInteraction = (StoryInteraction) obj;
                            int i = storyInteraction.type;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        enumC428990Grx = null;
                                    } else {
                                        enumC428990Grx = EnumC428990Grx.TEXT;
                                    }
                                } else {
                                    enumC428990Grx = EnumC428990Grx.LIKE;
                                }
                            } else {
                                enumC428990Grx = EnumC428990Grx.REPLY;
                            }
                            return new C423900Gjk(enumC428990Grx, storyInteraction.emojiContent, null, 4);
                        }
                        if (obj instanceof C737720Swk) {
                            C737720Swk c737720Swk = (C737720Swk) obj;
                            SocialAvatarStickerStruct socialAvatarStickerStruct = c737720Swk.LLILZ;
                            if (socialAvatarStickerStruct != null && C459610I0p.LIZ(socialAvatarStickerStruct)) {
                                EnumC428990Grx enumC428990Grx2 = EnumC428990Grx.SOCIAL_AVATAR;
                                SocialAvatarStickerStruct socialAvatarStickerStruct2 = c737720Swk.LLILZ;
                                if (socialAvatarStickerStruct2 == null || (midResolutionUrl = socialAvatarStickerStruct2.getLowResolutionUrl()) == null) {
                                    SocialAvatarStickerStruct socialAvatarStickerStruct3 = c737720Swk.LLILZ;
                                    if (socialAvatarStickerStruct3 != null) {
                                        midResolutionUrl = socialAvatarStickerStruct3.getMidResolutionUrl();
                                    } else {
                                        midResolutionUrl = null;
                                    }
                                }
                                return new C423900Gjk(enumC428990Grx2, null, midResolutionUrl, 2);
                            }
                            return new C423900Gjk(EnumC428990Grx.TEXT, c737720Swk.LLILLL, null, 4);
                        }
                        if (!(obj instanceof C459640I0s) || !((C459640I0s) obj).LIZ) {
                            return null;
                        }
                        return new C423900Gjk(EnumC428990Grx.REPOST_LOGO, null, null, 6);
                    }
                };
            }

            @Override // X.InterfaceC1608800ry2
            public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
                return new AbstractC1608790ry1<C423900Gjk, C426690GoF>((C426690GoF) interfaceC426680GoE) { // from class: X.0GoD
                    public final C426690GoF LIZLLL;

                    @Override // X.AbstractC1608790ry1
                    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZLLL = c426690GoF;
                    }

                    @Override // X.AbstractC1608790ry1
                    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
                        int i;
                        C423900Gjk c423900Gjk = (C423900Gjk) interfaceC1606880ruw;
                        EnumC428990Grx enumC428990Grx = c423900Gjk.LL;
                        if (enumC428990Grx == null) {
                            i = -1;
                        } else {
                            i = C426700GoG.LIZ[enumC428990Grx.ordinal()];
                            if (i == 1 || i == 2) {
                                return LJFF(c423900Gjk.LL);
                            }
                        }
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return LJFF(c423900Gjk.LL);
                            }
                            List<String> list = c423900Gjk.LLILLL;
                            if (list == null) {
                                return null;
                            }
                            return new C1606960rv4(new C1606970rv5(new C1609250ryl(C1606920rv0.LIZ, new C1608470rxV(null, null, 7), null, AFwS236S0000000_6.get$arr$(485), AFwS236S0000000_6.get$arr$(486), new AwS585S0100000_6(list, (List<? extends EnumC440890HQp>) 352), true, false, null, "social_avatar", 1548)));
                        }
                        return new C1606960rv4(new C1606970rv5(new C1609250ryl(C1606920rv0.LIZ, new C1608470rxV(null, null, 7), null, AFwS236S0000000_6.get$arr$(481), AFwS236S0000000_6.get$arr$(482), new AwS585S0100000_6(c423900Gjk, 351), true, true, AnonymousClass0207.get$arr$(123), "text", 1036)));
                    }

                    public final C1606960rv4 LJFF(EnumC428990Grx enumC428990Grx) {
                        C1608470rxV c1608470rxV;
                        C1606920rv0 c1606920rv0 = C1606920rv0.LIZ;
                        if (enumC428990Grx != null && C426700GoG.LIZ[enumC428990Grx.ordinal()] == 5) {
                            c1608470rxV = new C1608470rxV(AFwS236S0000000_6.get$arr$(483), AFwS236S0000000_6.get$arr$(484), 4);
                        } else {
                            c1608470rxV = new C1608470rxV(null, null, 7);
                        }
                        return new C1606960rv4(new C1606970rv5(new C1609250ryl(c1606920rv0, c1608470rxV, null, AFwS236S0000000_6.get$arr$(478), AFwS236S0000000_6.get$arr$(479), new AwS372S0200000_6(this, enumC428990Grx, 88), true, true, AFwS236S0000000_6.get$arr$(480), "icon", 1036)));
                    }
                };
            }

            @Override // X.AbstractC1608810ry3
            public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
                if (!(interfaceC1606880ruw instanceof C423900Gjk)) {
                    return null;
                }
                return interfaceC1606880ruw;
            }
        };
    }
}
