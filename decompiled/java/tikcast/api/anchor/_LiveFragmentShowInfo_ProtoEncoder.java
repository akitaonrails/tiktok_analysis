package tikcast.api.anchor;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes28.dex */
public final class _LiveFragmentShowInfo_ProtoEncoder implements InterfaceC1132110fZB<LiveFragmentShowInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, LiveFragmentShowInfo liveFragmentShowInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, liveFragmentShowInfo.icon);
        C1142340fpg.LJFF(c1142350fph, 2, liveFragmentShowInfo.desc);
        C1142340fpg.LJFF(c1142350fph, 3, liveFragmentShowInfo.subTitle);
        C1142340fpg.LJFF(c1142350fph, 4, liveFragmentShowInfo.popUpPageInfo);
        SingleGiftHighlightShowInfo singleGiftHighlightShowInfo = liveFragmentShowInfo.singleGiftHighlightShowInfo;
        if (singleGiftHighlightShowInfo != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(C1142340fpg.LJI(1) + C1142340fpg.LJI(2));
            boolean z = singleGiftHighlightShowInfo.isHashtagChallenge;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z ? 1 : 0);
            boolean z2 = singleGiftHighlightShowInfo.includeBeansGift;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJ(z2 ? 1 : 0);
        }
        C1142340fpg.LJFF(c1142350fph, 6, liveFragmentShowInfo.businessShowInfo);
        C1142340fpg.LJFF(c1142350fph, 7, liveFragmentShowInfo.name);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LiveFragmentShowInfo liveFragmentShowInfo) {
        LIZIZ(c1142350fph, liveFragmentShowInfo);
    }
}
