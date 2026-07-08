package tikcast.api.anchor;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes13.dex */
public final class _AnchorColdBootReqMessage_ProtoEncoder implements InterfaceC1132110fZB<AnchorColdBootReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AnchorColdBootReqMessage anchorColdBootReqMessage) {
        AnchorColdBootReqMessage anchorColdBootReqMessage2 = anchorColdBootReqMessage;
        boolean z = anchorColdBootReqMessage2.useLivePodcastResponse;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = anchorColdBootReqMessage2.canBeLivePodcast;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = anchorColdBootReqMessage2.enableLiveVideo;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
    }
}
