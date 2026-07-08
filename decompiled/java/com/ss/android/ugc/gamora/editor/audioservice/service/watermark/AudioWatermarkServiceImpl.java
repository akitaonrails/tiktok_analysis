package com.ss.android.ugc.gamora.editor.audioservice.service.watermark;

import X.C013C;
import X.C04TD;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHQ;
import X.C0PEM;
import X.C1633850scR;
import X.C1703010uPz;
import X.C189200o6;
import X.C2296808zG;
import X.C23250099c;
import X.C23260099m;
import X.C259800zU;
import X.C306360Bze;
import X.InterfaceC1364105Vn;
import X.InterfaceC1635410sex;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService;
import com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo;
import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class AudioWatermarkServiceImpl implements IAudioWatermarkService {
    public InterfaceC1635410sex LIZ;

    public static IAudioWatermarkService LJ() {
        Object objLIZ = C04TD.LIZ(IAudioWatermarkService.class, false);
        if (objLIZ != null) {
            return (IAudioWatermarkService) objLIZ;
        }
        if (C04TD.q6 == null) {
            synchronized (IAudioWatermarkService.class) {
                if (C04TD.q6 == null) {
                    C04TD.q6 = new AudioWatermarkServiceImpl();
                }
            }
        }
        return C04TD.q6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final boolean enbaleAudioWatermarkTTSVC() {
        return ((Boolean) C306360Bze.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final Object fetchTtsCreatorInfoByIdList(List<String> list, InterfaceC1364105Vn<? super TtsCreatorInfo> interfaceC1364105Vn) {
        if (this.LIZ == null) {
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C0CHQ.LIZ().initDownloadableModel();
            this.LIZ = interfaceC1635410sexLIZ;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (list != null && !list.isEmpty()) {
            InterfaceC1635410sex interfaceC1635410sex = this.LIZ;
            if (interfaceC1635410sex != null) {
                interfaceC1635410sex.LJFF(list, false, null, new IFetchEffectListListener() { // from class: X.0uS0
                    public boolean LIZ;
                    public final List<String> LIZIZ = new ArrayList();
                    public final List<String> LIZJ = new ArrayList();

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception exception;
                        if (exceptionResult != null) {
                            exception = exceptionResult.getException();
                        } else {
                            exception = null;
                        }
                        String.valueOf(exception);
                        InterfaceC1364105Vn<TtsCreatorInfo> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(null);
                        interfaceC1364105Vn2.resumeWith(null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        String str;
                        String str2;
                        List<Effect> list3 = list2;
                        if (list3 != null) {
                            Iterator<Effect> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                ReadTextEffectBean readTextEffectBeanLIZ = C2378709Tt.LIZ(it2.next());
                                String str3 = "";
                                if (readTextEffectBeanLIZ != null) {
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBeanLIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra == null || (str = readTextEffectSpeakerExtra.voiceCreatorUserId) == null) {
                                        str = "";
                                        if (readTextEffectBeanLIZ != null) {
                                        }
                                    }
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = readTextEffectBeanLIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra2 != null && (str2 = readTextEffectSpeakerExtra2.voiceCreatorUserName) != null) {
                                        str3 = str2;
                                    }
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra3 = readTextEffectBeanLIZ.mSpeaker;
                                    if (readTextEffectSpeakerExtra3 != null && readTextEffectSpeakerExtra3.isCreatorVoice) {
                                        this.LIZ = true;
                                        ((ArrayList) this.LIZJ).add(str3);
                                        ((ArrayList) this.LIZIZ).add(str);
                                    }
                                }
                            }
                        }
                        InterfaceC1364105Vn<TtsCreatorInfo> interfaceC1364105Vn2 = c23260099m;
                        TtsCreatorInfo ttsCreatorInfo = new TtsCreatorInfo(this.LIZ, this.LIZIZ, this.LIZJ);
                        C189200o6.m2constructorimpl(ttsCreatorInfo);
                        interfaceC1364105Vn2.resumeWith(ttsCreatorInfo);
                    }
                });
            }
        } else {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final Object fetchVcCreatorInfoByIdList(List<String> list, InterfaceC1364105Vn<? super VcCreatorInfo> interfaceC1364105Vn) {
        if (this.LIZ == null) {
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C0CHQ.LIZ().initDownloadableModel();
            this.LIZ = interfaceC1635410sexLIZ;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (list != null && !list.isEmpty()) {
            InterfaceC1635410sex interfaceC1635410sex = this.LIZ;
            if (interfaceC1635410sex != null) {
                interfaceC1635410sex.LJFF(list, false, null, new IFetchEffectListListener() { // from class: X.0uRz
                    public boolean LIZ;
                    public final List<String> LIZIZ = new ArrayList();
                    public final List<String> LIZJ = new ArrayList();

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception exception;
                        if (exceptionResult != null) {
                            exception = exceptionResult.getException();
                        } else {
                            exception = null;
                        }
                        String.valueOf(exception);
                        InterfaceC1364105Vn<VcCreatorInfo> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(null);
                        interfaceC1364105Vn2.resumeWith(null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        List<Effect> list3 = list2;
                        if (list3 != null) {
                            for (Effect effect : list3) {
                                C1446130njf c1446130njf = C1446130njf.LIZ;
                                c1446130njf.getClass();
                                String strLJFF = C1446130njf.LJFF(effect, "vc_creator_user_id");
                                String str = "";
                                if (strLJFF == null) {
                                    strLJFF = "";
                                }
                                c1446130njf.getClass();
                                String strLJFF2 = C1446130njf.LJFF(effect, "vc_creator_name");
                                if (strLJFF2 != null) {
                                    str = strLJFF2;
                                }
                                c1446130njf.getClass();
                                if (C1446130njf.LIZIZ(effect, "vc_is_creator", false)) {
                                    this.LIZ = true;
                                    ((ArrayList) this.LIZIZ).add(strLJFF);
                                    ((ArrayList) this.LIZJ).add(str);
                                }
                            }
                        }
                        InterfaceC1364105Vn<VcCreatorInfo> interfaceC1364105Vn2 = c23260099m;
                        VcCreatorInfo vcCreatorInfo = new VcCreatorInfo(this.LIZ, this.LIZIZ, this.LIZJ);
                        C189200o6.m2constructorimpl(vcCreatorInfo);
                        interfaceC1364105Vn2.resumeWith(vcCreatorInfo);
                    }
                });
            }
        } else {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService
    public final void fetchAudioWatermarkInfo(List<String> list, List<String> list2, Function1<? super AudioWatermarkInfo, Unit> function1) {
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new ArrayList();
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = new ArrayList();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1703010uPz(this, list, list2, c013c, c259800zU2, c259800zU3, c259800zU, function1, null), 3);
    }
}
