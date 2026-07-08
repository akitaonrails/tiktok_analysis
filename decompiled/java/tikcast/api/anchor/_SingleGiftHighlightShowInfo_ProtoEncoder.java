package tikcast.api.anchor;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _SingleGiftHighlightShowInfo_ProtoEncoder implements InterfaceC1132110fZB<SingleGiftHighlightShowInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SingleGiftHighlightShowInfo singleGiftHighlightShowInfo) {
        SingleGiftHighlightShowInfo singleGiftHighlightShowInfo2 = singleGiftHighlightShowInfo;
        boolean z = singleGiftHighlightShowInfo2.isHashtagChallenge;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = singleGiftHighlightShowInfo2.includeBeansGift;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }
}
