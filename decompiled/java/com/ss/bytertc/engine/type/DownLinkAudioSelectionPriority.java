package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum DownLinkAudioSelectionPriority {
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_NORMAL(0),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_MEDIUM(1),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_HIGH(2),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_CRITICAL(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static DownLinkAudioSelectionPriority fromId(int i) {
        for (DownLinkAudioSelectionPriority downLinkAudioSelectionPriority : values()) {
            if (downLinkAudioSelectionPriority.value() == i) {
                return downLinkAudioSelectionPriority;
            }
        }
        return DOWN_LINK_AUDIO_SELECTION_PRIORITY_NORMAL;
    }

    public static DownLinkAudioSelectionPriority valueOf(String str) {
        return (DownLinkAudioSelectionPriority) C08FF.LIZ(DownLinkAudioSelectionPriority.class, str);
    }

    DownLinkAudioSelectionPriority(int i) {
        this.value = i;
    }
}
