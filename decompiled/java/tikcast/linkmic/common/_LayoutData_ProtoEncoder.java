package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _LayoutData_ProtoEncoder implements InterfaceC1132110fZB<LayoutData> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LayoutData layoutData) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int i;
        int iLIZ;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int i2;
        LayoutData layoutData2 = layoutData;
        LayoutState layoutState = layoutData2.layout;
        int iLIZ2 = C1142350fph.LIZ(1);
        int iLIZ3 = C1142350fph.LIZ(6);
        int iLIZ4 = C1142350fph.LIZ(5);
        int iLIZ5 = C1142350fph.LIZ(4);
        int iLIZ6 = C1142350fph.LIZ(3);
        int iLIZIZ10 = C1142350fph.LIZIZ(0);
        if (layoutState != null) {
            c1142350fph.LIZLLL(1, 2);
            int iLJIILL = C1142340fpg.LJIILL(1, layoutState.layoutId) + C1142340fpg.LJIILL(2, layoutState.layoutKey);
            MultiGuestLayoutExtra multiGuestLayoutExtra = layoutState.multiGuestLayoutExtra;
            if (multiGuestLayoutExtra == null) {
                iLIZIZ6 = 0;
            } else {
                int iLIZJ = _MultiGuestLayoutExtra_ProtoEncoder.LIZJ(multiGuestLayoutExtra);
                iLIZIZ6 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + iLIZ6;
            }
            int i3 = iLJIILL + iLIZIZ6;
            MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra = layoutState.multiGuestLayoutNonSeiExtra;
            if (multiGuestLayoutNonSeiExtra == null) {
                iLIZIZ8 = 0;
            } else {
                SocialGameLayoutNonSeiExtra socialGameLayoutNonSeiExtra = multiGuestLayoutNonSeiExtra.socialGame;
                if (socialGameLayoutNonSeiExtra == null) {
                    iLIZIZ7 = 0;
                } else {
                    int iLJIILL2 = C1142340fpg.LJIILL(1, socialGameLayoutNonSeiExtra.justDanceSongTitle);
                    iLIZIZ7 = iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2) + iLIZ2;
                }
                iLIZIZ8 = iLIZIZ7 + C1142350fph.LIZIZ(iLIZIZ7) + iLIZ5;
            }
            int i4 = i3 + iLIZIZ8;
            CohostTypeLayoutExtra cohostTypeLayoutExtra = layoutState.cohostLayoutExtra;
            if (cohostTypeLayoutExtra == null) {
                iLIZIZ9 = 0;
            } else {
                int iLIZJ2 = _CohostTypeLayoutExtra_ProtoEncoder.LIZJ(cohostTypeLayoutExtra);
                iLIZIZ9 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + iLIZ4;
            }
            int i5 = i4 + iLIZIZ9;
            if (layoutState.cohostLayoutNonSeiExtra == null) {
                i2 = 0;
            } else {
                i2 = iLIZIZ10 + iLIZ3;
            }
            c1142350fph.LJ(i5 + i2);
            _LayoutState_ProtoEncoder.LIZIZ(c1142350fph, layoutState);
        }
        List<SpotInfo> list = layoutData2.spotList;
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < layoutData2.spotList.size(); i6++) {
                SpotInfo spotInfo = (SpotInfo) ListProtector.get(layoutData2.spotList, i6);
                if (spotInfo != null) {
                    c1142350fph.LIZLLL(2, 2);
                    int iLJIIIZ = C1142340fpg.LJIIIZ(1, spotInfo.spotId);
                    PosIdentity posIdentity = spotInfo.posIdentity;
                    if (posIdentity == null) {
                        iLIZIZ = 0;
                    } else {
                        int iLJIIIZ2 = C1142340fpg.LJIIIZ(1, posIdentity.type) + C1142340fpg.LJIILL(2, posIdentity.value);
                        iLIZIZ = iLJIIIZ2 + C1142350fph.LIZIZ(iLJIIIZ2) + C1142350fph.LIZ(2);
                    }
                    int i7 = iLJIIIZ + iLIZIZ;
                    MultiGuestSpotExtra multiGuestSpotExtra = spotInfo.multiGuestSpotExtra;
                    if (multiGuestSpotExtra == null) {
                        iLIZIZ2 = 0;
                    } else {
                        int iLIZJ3 = _MultiGuestSpotExtra_ProtoEncoder.LIZJ(multiGuestSpotExtra);
                        iLIZIZ2 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + iLIZ6;
                    }
                    int i8 = i7 + iLIZIZ2;
                    MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra = spotInfo.multiGuestSpotNonSeiExtra;
                    if (multiGuestSpotNonSeiExtra == null) {
                        iLIZIZ4 = 0;
                    } else {
                        SocialGameUserSpotNonSeiExtra socialGameUserSpotNonSeiExtra = multiGuestSpotNonSeiExtra.socialGameUser;
                        if (socialGameUserSpotNonSeiExtra == null) {
                            iLIZIZ3 = 0;
                        } else {
                            int iLJIIIZ3 = C1142340fpg.LJIIIZ(1, socialGameUserSpotNonSeiExtra.gameScore);
                            iLIZIZ3 = iLJIIIZ3 + C1142350fph.LIZIZ(iLJIIIZ3) + iLIZ2;
                        }
                        iLIZIZ4 = iLIZIZ3 + C1142350fph.LIZIZ(iLIZIZ3) + iLIZ5;
                    }
                    int i9 = i8 + iLIZIZ4;
                    CohostTypeSpotExtra cohostTypeSpotExtra = spotInfo.cohostSpotExtra;
                    if (cohostTypeSpotExtra == null) {
                        iLIZIZ5 = 0;
                    } else {
                        int iLIZJ4 = _CohostTypeSpotExtra_ProtoEncoder.LIZJ(cohostTypeSpotExtra);
                        iLIZIZ5 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + iLIZ4;
                    }
                    int i10 = i9 + iLIZIZ5;
                    if (spotInfo.cohostSpotNonSeiExtra == null) {
                        i = 0;
                    } else {
                        i = iLIZIZ10 + iLIZ3;
                    }
                    int i11 = i10 + i;
                    PosIdentityExtra posIdentityExtra = spotInfo.posIdentityExtra;
                    if (posIdentityExtra == null) {
                        iLIZ = 0;
                    } else {
                        int iLJIILL3 = C1142340fpg.LJIILL(1, posIdentityExtra.contentLinkmicID);
                        iLIZ = C1142350fph.LIZ(7) + iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3);
                    }
                    c1142350fph.LJ(i11 + iLIZ);
                    _SpotInfo_ProtoEncoder.LIZIZ(c1142350fph, spotInfo);
                }
            }
        }
        long j = layoutData2.version;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
        long j2 = layoutData2.groupChannelId;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        List<PosIdentity> list2 = layoutData2.uiPos;
        if (list2 != null && !list2.isEmpty()) {
            for (int i12 = 0; i12 < layoutData2.uiPos.size(); i12++) {
                PosIdentity posIdentity2 = (PosIdentity) ListProtector.get(layoutData2.uiPos, i12);
                if (posIdentity2 != null) {
                    c1142350fph.LIZLLL(101, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIIZ(1, posIdentity2.type) + C1142340fpg.LJIILL(2, posIdentity2.value));
                    int i13 = posIdentity2.type;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LIZJ(i13);
                    C1142340fpg.LJFF(c1142350fph, 2, posIdentity2.value);
                }
            }
        }
    }
}
