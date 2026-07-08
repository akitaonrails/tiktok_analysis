package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes3.dex */
public interface InstantClonePanelAbility {

    /* JADX INFO: loaded from: classes30.dex */
    public static final class DefaultImpls {
        public static void voiceDeleted(InstantClonePanelAbility instantClonePanelAbility) {
        }

        public static void voiceSaved(InstantClonePanelAbility instantClonePanelAbility, VoiceCloneSpeakerInfo voiceCloneSpeakerInfo) {
        }
    }

    void closePanel();

    void jumpToEditPage();

    void pauseVideo();

    void updateInstantCloneTTSPanel();

    boolean useVoiceClick(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo);

    void voiceDeleted();

    void voiceSaved(VoiceCloneSpeakerInfo voiceCloneSpeakerInfo);
}
