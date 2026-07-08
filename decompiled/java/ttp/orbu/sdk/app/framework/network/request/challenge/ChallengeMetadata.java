package ttp.orbu.sdk.app.framework.network.request.challenge;

/* JADX INFO: loaded from: classes24.dex */
public final class ChallengeMetadata {
    public final int requestedLeadingZeros;
    public final int seedId;
    public final String serverTimestamp;
    public final String token;

    public ChallengeMetadata(int i, String str, String str2, int i2) {
        this.seedId = i;
        this.token = str;
        this.serverTimestamp = str2;
        this.requestedLeadingZeros = i2;
    }
}
