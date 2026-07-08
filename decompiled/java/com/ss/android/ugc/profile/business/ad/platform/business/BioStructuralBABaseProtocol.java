package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C01GW;
import X.C452501pT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BioStructuralBABaseProtocol<T extends BizBaseData> extends ProfilePlatformProtocol<T> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19((BioStructuralBABaseProtocol) this, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE));
    public final User LLJJJJ;

    public BioStructuralBABaseProtocol() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        this.LLJJJJ = iProfilePlatformVM != null ? iProfilePlatformVM.vQ2() : null;
    }
}
