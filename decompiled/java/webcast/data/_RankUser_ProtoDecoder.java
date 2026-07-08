package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._RankUserEnigmaInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUser_ProtoDecoder implements C0IMD<RankUser> {
    public static RankUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankUser rankUser = new RankUser();
        rankUser.badgeList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 9) {
                            if (iLJI != 18) {
                                if (iLJI != 22) {
                                    if (iLJI != 25) {
                                        if (iLJI != 38) {
                                            if (iLJI != 64) {
                                                if (iLJI != 1024) {
                                                    if (iLJI != 1028) {
                                                        if (iLJI != 1029) {
                                                            C1516700pZU.LJ(c1516680pZS);
                                                        } else {
                                                            rankUser.enigmaInfo = _RankUserEnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                        }
                                                    } else {
                                                        rankUser.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                                                    }
                                                } else {
                                                    rankUser.followStatus = c1516680pZS.LJIIJJI();
                                                }
                                            } else {
                                                rankUser.badgeList.add(_BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                                            }
                                        } else {
                                            rankUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        rankUser.border = _RankUser_Border_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    rankUser.followInfo = _RankUser_FollowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                rankUser.secret = c1516680pZS.LJIIJ();
                            }
                        } else {
                            rankUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        rankUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    rankUser.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankUser;
            }
        }
    }

    public static void LJ(RankUser rankUser) {
        ImageModel imageModel = rankUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        RankUser.Border border = rankUser.border;
        if (border != null) {
            ImageModel imageModel2 = border.icon;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            ImageModel imageModel3 = border.profileDecorationRibbon;
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
        List<BadgeStruct> list = rankUser.badgeList;
        if (list == null) {
            rankUser.badgeList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BadgeStruct badgeStruct : rankUser.badgeList) {
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankUser rankUser) {
        LJ(rankUser);
    }

    @Override // X.C0IMD
    public final RankUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUser rankUser, List list) {
    }
}
