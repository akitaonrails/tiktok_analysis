package com.ss.android.ugc.aweme.shortvideo.image.voiceinput.spi;

import X.AnonymousClass1978;
import X.C0ZI0;
import X.C1989407qm;
import X.InterfaceC1702650uPP;
import X.InterfaceC1710480uc2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.voiceinput.api.IVoiceInputController;

/* JADX INFO: loaded from: classes27.dex */
public interface IPublishVoiceInputService {
    IVoiceInputController LIZ(Scene scene, VideoPublishEditModel videoPublishEditModel, ViewGroup viewGroup, View view, C0ZI0 c0zi0, InterfaceC1710480uc2 interfaceC1710480uc2, C1989407qm c1989407qm, InterfaceC1702650uPP interfaceC1702650uPP, AnonymousClass1978 anonymousClass1978);

    boolean isAvailable();
}
