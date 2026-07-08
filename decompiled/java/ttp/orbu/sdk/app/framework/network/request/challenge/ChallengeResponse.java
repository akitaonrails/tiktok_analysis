package ttp.orbu.sdk.app.framework.network.request.challenge;

/* JADX INFO: loaded from: classes24.dex */
public final class ChallengeResponse {
    public final String challengeId;
    public final ChallengeMetadata challengeMetadata;

    public ChallengeResponse(String str, ChallengeMetadata challengeMetadata) {
        this.challengeId = str;
        this.challengeMetadata = challengeMetadata;
    }
}
