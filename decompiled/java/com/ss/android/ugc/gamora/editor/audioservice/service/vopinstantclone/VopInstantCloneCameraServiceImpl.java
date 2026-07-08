package com.ss.android.ugc.gamora.editor.audioservice.service.vopinstantclone;

import X.C01GW;
import X.C01TT;
import X.C04TD;
import X.C05HK;
import X.C05HM;
import X.C05WY;
import X.C098200Yq;
import X.C0PEM;
import X.C11VM;
import X.C123100dR;
import X.C1770006wU;
import X.C189200o6;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C443120HZe;
import X.C452501pT;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS145S0110000_29;
import kotlin.jvm.internal.AwS67S2100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class VopInstantCloneCameraServiceImpl implements IVopInstantCloneCameraService {
    public C11VM LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(719));

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void destroyAudioSDKHandler() {
        Unit unit;
        try {
            this.LIZIZ = false;
            ITTSService iTTSServiceLIZIZ = LIZIZ();
            if (iTTSServiceLIZIZ != null) {
                iTTSServiceLIZIZ.destroyAudioSDKHandler();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void stopAudition() {
        Unit unit;
        try {
            this.LIZIZ = false;
            ITTSService iTTSServiceLIZIZ = LIZIZ();
            if (iTTSServiceLIZIZ != null) {
                iTTSServiceLIZIZ.stopStreamReading();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static IVopInstantCloneCameraService LIZ() {
        Object objLIZ = C04TD.LIZ(IVopInstantCloneCameraService.class, false);
        if (objLIZ != null) {
            return (IVopInstantCloneCameraService) objLIZ;
        }
        if (C04TD.p6 == null) {
            synchronized (IVopInstantCloneCameraService.class) {
                if (C04TD.p6 == null) {
                    C04TD.p6 = new VopInstantCloneCameraServiceImpl();
                }
            }
        }
        return C04TD.p6;
    }

    public final ITTSService LIZIZ() {
        return (ITTSService) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final C443120HZe<String, String, Boolean> getSpeakerInfo() {
        C05HK speakerInfo = C05HM.LIZIZ.getSpeakerInfo();
        if (!C123100dR.LIZ(speakerInfo.LIZJ)) {
            return null;
        }
        String str = speakerInfo.LIZIZ;
        if (str == null) {
            str = "";
        }
        String str2 = speakerInfo.LIZJ;
        return new C443120HZe<>(str, str2 != null ? str2 : "", Boolean.valueOf(Intrinsics.LJFF(speakerInfo.LIZ, Boolean.TRUE)));
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final boolean isPlayingAudition() {
        ITTSService iTTSServiceLIZIZ;
        return this.LIZIZ || ((iTTSServiceLIZIZ = LIZIZ()) != null && iTTSServiceLIZIZ.isStreamReading());
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void onDestroyInstantClone() {
        C11VM c11vm = this.LIZ;
        if (c11vm != null) {
            c11vm.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void onStopInstantClone() {
        C11VM c11vm = this.LIZ;
        if (c11vm != null) {
            c11vm.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void initAudioSDKHandler(String str) {
        Unit unit;
        try {
            this.LIZIZ = false;
            ITTSService iTTSServiceLIZIZ = LIZIZ();
            if (iTTSServiceLIZIZ != null) {
                iTTSServiceLIZIZ.initAudioSDKHandler(str);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void setForbidDestroy(boolean z) {
        Unit unit;
        try {
            ITTSService iTTSServiceLIZIZ = LIZIZ();
            if (iTTSServiceLIZIZ != null) {
                iTTSServiceLIZIZ.setForbidDestroy(z);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void setInstantClonePanelAbility(InstantClonePanelAbility instantClonePanelAbility) {
        C11VM c11vm = this.LIZ;
        if (c11vm != null) {
            c11vm.setInstantClonePanelAbility(instantClonePanelAbility);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void showInstantClone(boolean z) {
        C11VM c11vm = this.LIZ;
        if (c11vm != null) {
            C01TT.LIZLLL(new AwS145S0110000_29(c11vm, z, 6));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void initInstantVoiceCloneView(Context context, FrameLayout frameLayout, String str, String str2) {
        C11VM c11vm = new C11VM(context, null);
        this.LIZ = c11vm;
        C01TT.LIZLLL(new AwS67S2100000_29(c11vm, str, str2, 1));
        C11VM c11vm2 = this.LIZ;
        if (c11vm2 != null) {
            frameLayout.addView(c11vm2, -1, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.concurrent.atomic.AtomicBoolean] */
    @Override // com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService
    public final void playAudition(String str, String str2, String str3, PlayAuditionCallback playAuditionCallback) {
        C1770006wU c1770006wU = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 6);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new AtomicBoolean(false);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), c1770006wU, null, new C05WY(this, str, str2, str3, playAuditionCallback, c259800zU, null), 2);
    }
}
