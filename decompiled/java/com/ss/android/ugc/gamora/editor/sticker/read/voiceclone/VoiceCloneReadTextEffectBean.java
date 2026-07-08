package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.C0CHQ;
import X.C19292410dm;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class VoiceCloneReadTextEffectBean extends ReadTextEffectBean {
    public boolean isPrivate;
    public boolean isRecordCompleted;
    public int requiredCount;
    public int succeedCount;
    public UrlModel userAvatar;

    @Override // com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceCloneReadTextEffectBean)) {
            return false;
        }
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = (VoiceCloneReadTextEffectBean) obj;
        if (Intrinsics.LJFF(voiceCloneReadTextEffectBean.effect.getEffectId(), this.effect.getEffectId()) && Intrinsics.LJFF(voiceCloneReadTextEffectBean.mSpeaker.speakreID, this.mSpeaker.speakreID) && Intrinsics.LJFF(voiceCloneReadTextEffectBean.mSpeaker.streamTTSSpkID, this.mSpeaker.streamTTSSpkID) && voiceCloneReadTextEffectBean.mSpeaker.isCreatorVoice == this.mSpeaker.isCreatorVoice && voiceCloneReadTextEffectBean.isRecordCompleted == this.isRecordCompleted && voiceCloneReadTextEffectBean.isPrivate == this.isPrivate) {
            return true;
        }
        return false;
    }

    public VoiceCloneReadTextEffectBean(Effect effect, ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra) {
        UrlModel avatarThumb;
        super(effect, readTextEffectSpeakerExtra);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            avatarThumb = currentUser.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        this.userAvatar = avatarThumb;
        this.isPrivate = true;
    }
}
