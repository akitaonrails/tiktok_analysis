package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class DraftVEAudioEffectParam {

    @C09CT("challenge")
    public AVChallenge challenge;

    @C09CT("challenges")
    public List<AVChallenge> challenges;

    @InterfaceC2270908v5
    @C09CT("effectPath")
    public String effectPath;

    @C09CT("effectTag")
    public String effectTag;

    @C09CT("seqIn")
    public int seqIn;

    @C09CT("seqOut")
    public int seqOut;

    @C09CT("trackIndex")
    public int trackIndex;

    @C09CT("trackType")
    public int trackType;

    @C09CT("uploadId")
    public final String uploadId;

    public DraftVEAudioEffectParam() {
        this("", 0, 0, "", "", 0, 0, null, new ArrayList());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftVEAudioEffectParam(uploadId=");
        sbLIZ.append(this.uploadId);
        sbLIZ.append(", trackType=");
        sbLIZ.append(this.trackType);
        sbLIZ.append(", trackIndex=");
        sbLIZ.append(this.trackIndex);
        sbLIZ.append(", effectPath=");
        sbLIZ.append(this.effectPath);
        sbLIZ.append(", effectTag=");
        sbLIZ.append(this.effectTag);
        sbLIZ.append(", seqIn=");
        sbLIZ.append(this.seqIn);
        sbLIZ.append(", seqOut=");
        sbLIZ.append(this.seqOut);
        sbLIZ.append(", challenge=");
        sbLIZ.append(this.challenge);
        sbLIZ.append(", challenges=");
        sbLIZ.append(this.challenges);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftVEAudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, AVChallenge aVChallenge, List<AVChallenge> list) {
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.challenge = aVChallenge;
        this.challenges = list;
    }
}
