package com.ss.android.ugc.aweme.services.audio;

import X.C443120HZe;
import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes30.dex */
public interface IVopInstantCloneCameraService {
    void destroyAudioSDKHandler();

    C443120HZe<String, String, Boolean> getSpeakerInfo();

    void initAudioSDKHandler(String str);

    void initInstantVoiceCloneView(Context context, FrameLayout frameLayout, String str, String str2);

    boolean isPlayingAudition();

    void onDestroyInstantClone();

    void onStopInstantClone();

    void playAudition(String str, String str2, String str3, PlayAuditionCallback playAuditionCallback);

    void setForbidDestroy(boolean z);

    void setInstantClonePanelAbility(InstantClonePanelAbility instantClonePanelAbility);

    void showInstantClone(boolean z);

    void stopAudition();

    public static final class DefaultImpls {
        public static C443120HZe<String, String, Boolean> getSpeakerInfo(IVopInstantCloneCameraService iVopInstantCloneCameraService) {
            return null;
        }

        public static /* synthetic */ void showInstantClone$default(IVopInstantCloneCameraService iVopInstantCloneCameraService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                iVopInstantCloneCameraService.showInstantClone(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInstantClone");
        }
    }
}
