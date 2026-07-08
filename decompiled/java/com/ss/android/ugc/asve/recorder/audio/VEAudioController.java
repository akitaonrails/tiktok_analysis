package com.ss.android.ugc.asve.recorder.audio;

import X.C1621410sIN;
import X.C1621480sIU;
import X.C1AL1;
import X.C1DKV;
import X.C2188811AlT;
import X.C2216241Boc;
import X.C2240001Clq;
import X.C2484209oO;
import X.EnumC1778340wNU;
import X.EnumC2217951BrN;
import X.InterfaceC1660820tJw;
import X.InterfaceC1660900tK4;
import X.InterfaceC19771312Xf;
import X.InterfaceC2218081Bra;
import X.InterfaceC2240011Clr;
import X.InterfaceC2240031Clt;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;
import com.ss.android.vesdk.audio.VEAudioSample;
import com.ss.android.vesdk.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zmj.j;

/* JADX INFO: loaded from: classes35.dex */
public final class VEAudioController implements InterfaceC1660820tJw {
    public final VERecorder LIZ;
    public final C1DKV LIZIZ;
    public C2240001Clq LIZLLL;
    public InterfaceC2240011Clr LJ;
    public InterfaceC1660900tK4 LJFF;
    public String LJI;
    public boolean LJII;
    public final VEAudioCapture LIZJ = new VEAudioCapture();
    public final List<InterfaceC2240031Clt> LJIIIIZZ = new ArrayList();

    @Override // X.InterfaceC1660820tJw
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1660820tJw
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1660820tJw
    public final VEAudioCapture LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1660820tJw
    public final boolean LJFF() {
        return this.LJII;
    }

    @Override // X.InterfaceC1660820tJw
    public final String LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1660820tJw
    public final void LIZJ(Cert cert) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioController startRecord() called, isInited=");
        sbLIZ.append(this.LJII);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("policyPlaceholder: ");
        sbLIZ2.append(cert);
        C1AL1.LIZ("ACTION_NAME_START_AUDIO_CAPTURE", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC2240011Clr interfaceC2240011Clr2 = this.LJ;
        if (interfaceC2240011Clr2 != null) {
            interfaceC2240011Clr2.LIZIZ();
        }
        InterfaceC1660900tK4 interfaceC1660900tK4 = this.LJFF;
        if (interfaceC1660900tK4 != null) {
            ((j) interfaceC1660900tK4).LIZJ(EnumC1778340wNU.OPEN_MIC, cert);
        }
        int iStart = this.LIZJ.start(cert);
        if (iStart != 0 && (interfaceC2240011Clr = this.LJ) != null) {
            interfaceC2240011Clr.LIZ(iStart, "Mic open failed in earlier stage");
        }
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2240031Clt) it2.next()).LIZIZ();
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final int LJI(VEAudioAlgorithmParam vEAudioAlgorithmParam) {
        return this.LIZ.LIZIZ.LJJIZ.addTrackAlgorithm(1, 0, vEAudioAlgorithmParam, 0, Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC1660820tJw
    public final void LJII(C1621410sIN c1621410sIN) {
        if (!((ArrayList) this.LJIIIIZZ).contains(c1621410sIN)) {
            ((ArrayList) this.LJIIIIZZ).add(c1621410sIN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Bra, X.1Clq] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1660820tJw
    public final void init(String str) {
        VEAudioCaptureSettings.Builder builder;
        InterfaceC2240011Clr interfaceC2240011Clr;
        VEAudioCaptureSettings vEAudioCaptureSettingsBuild;
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioController init() called, mode=");
        sbLIZ.append(str);
        sbLIZ.append(", isInited=");
        sbLIZ.append(this.LJII);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ?? r1 = new InterfaceC2218081Bra() { // from class: X.1Clq
            @Override // X.InterfaceC2218071BrZ
            public final void onError(int i, int i2, String str2) {
            }

            @Override // X.InterfaceC2218081Bra
            public final void onReceive(VEAudioSample vEAudioSample) {
            }

            @Override // X.InterfaceC2218071BrZ
            public final void onInfo(int i, int i2, double d, Object obj) {
                InterfaceC2240011Clr interfaceC2240011Clr2;
                if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
                    InterfaceC2240011Clr interfaceC2240011Clr3 = this.LIZ.LJ;
                    if (interfaceC2240011Clr3 != null) {
                        interfaceC2240011Clr3.LJIILLIIL();
                        return;
                    }
                    return;
                }
                if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
                    InterfaceC2240011Clr interfaceC2240011Clr4 = this.LIZ.LJ;
                    if (interfaceC2240011Clr4 == null) {
                        return;
                    }
                    interfaceC2240011Clr4.LJIILIIL();
                    return;
                }
                if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP || (interfaceC2240011Clr2 = this.LIZ.LJ) == null) {
                    return;
                }
                interfaceC2240011Clr2.LJIILJJIL();
            }
        };
        this.LIZLLL = r1;
        this.LJI = str;
        this.LIZJ.addCaptureListener(r1);
        if (Intrinsics.LJFF(str, "ktv")) {
            k kVar = this.LIZ.LIZIZ;
            kVar.getClass();
            C2484209oO.LJI("TERecorder", "getSuggestionSettingsForKaraoke");
            if (kVar.LJJIJIL) {
                C2484209oO.LJI("TERecorder", "get suggestion settings for karaoke");
                VEAudioCaptureSettings.Builder builder2 = new VEAudioCaptureSettings.Builder();
                builder2.setAudioDataStore(1);
                builder2.setAudioCaptureLowLatency(true);
                builder2.enableSysKaraoke(false);
                vEAudioCaptureSettingsBuild = builder2.build();
                kVar.LJLIIL = vEAudioCaptureSettingsBuild;
            } else {
                C2484209oO.LIZJ("TERecorder", "get suggestion settings for karaoke error, current is old audio capture");
                vEAudioCaptureSettingsBuild = null;
            }
            builder = new VEAudioCaptureSettings.Builder(vEAudioCaptureSettingsBuild);
            builder.setAudioCaptureLowLatency(true);
        } else if (Intrinsics.LJFF(str, "record")) {
            TEAudioDataInterface tEAudioDataInterfaceLJII = this.LIZ.LJII();
            if (tEAudioDataInterfaceLJII != null) {
                this.LIZJ.addCaptureListener(tEAudioDataInterfaceLJII);
            }
            builder = new VEAudioCaptureSettings.Builder();
            builder.setAudioDataStore(1);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("not a supported mode ");
            sbLIZ2.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        HashMap<EnumC2217951BrN, Cert> map = new HashMap<>();
        map.put(EnumC2217951BrN.EXCEPTION_CLOSE_MIC, CertProviderManagerKt.findCert("bpea-exception_close_mic", 1476788485));
        builder.setAudioPrivacyCertMap(map);
        InterfaceC2240011Clr interfaceC2240011Clr2 = this.LJ;
        if (interfaceC2240011Clr2 != null) {
            interfaceC2240011Clr2.LJIJ();
        }
        int iInit = this.LIZJ.init(builder.build());
        c2216241Boc.LIZ("VEAudioController init() completed, ret=" + iInit + ", mode=" + str);
        if (iInit != 0 && (interfaceC2240011Clr = this.LJ) != null) {
            interfaceC2240011Clr.LJIIIIZZ();
        }
        this.LJII = true;
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2240031Clt) it2.next()).onInit();
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final void release(Cert cert) {
        C2216241Boc.LIZ.LIZ("VEAudioController release()");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_RELEASE_AUDIO_CAPTURE", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.release(cert);
        this.LIZJ.removeCaptureListener(this.LIZLLL);
        if (TextUtils.equals(this.LJI, "record")) {
            this.LJI = null;
            this.LIZJ.removeCaptureListener(this.LIZ.LJII());
        }
        this.LJII = false;
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2240031Clt) it2.next()).onRelease();
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final int removeTrackAlgorithm(int i) {
        return this.LIZ.LIZIZ.LJJIZ.removeTrackAlgorithm(i);
    }

    @Override // X.InterfaceC1660820tJw
    public final void setAudioDevice(C1621480sIU c1621480sIU) {
        VEAudioCapture vEAudioCapture = this.LIZ.LIZIZ.LIZ;
        if (vEAudioCapture != null) {
            vEAudioCapture.setAudioDevice(c1621480sIU);
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr) {
        this.LJ = interfaceC2240011Clr;
        if (interfaceC2240011Clr != null) {
            interfaceC2240011Clr.LJIIJ(new InterfaceC19771312Xf() { // from class: X.1Cls
                @Override // X.InterfaceC19771312Xf
                public final void onAppBackground() {
                    this.LIZ.LIZJ.onBackGround();
                }

                @Override // X.InterfaceC19771312Xf
                public final void onAppForeground() {
                    this.LIZ.LIZJ.onForeGround();
                }
            });
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4) {
        this.LJFF = interfaceC1660900tK4;
    }

    public VEAudioController(VERecorder vERecorder, C1DKV c1dkv) {
        this.LIZ = vERecorder;
        this.LIZIZ = c1dkv;
    }

    @Override // X.InterfaceC1660820tJw
    public final void LJIIIZ(Cert cert, boolean z) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        C2216241Boc.LIZ.LIZ("VEAudioController stopRecord()");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_STOP_AUDIO_CAPTURE", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2240011Clr interfaceC2240011Clr2 = this.LJ;
        if (interfaceC2240011Clr2 != null) {
            interfaceC2240011Clr2.LIZJ();
        }
        if (this.LIZJ.stop(cert) != 0 && (interfaceC2240011Clr = this.LJ) != null) {
            interfaceC2240011Clr.LJIIZILJ();
        }
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2240031Clt) it2.next()).LIZ();
        }
    }

    @Override // X.InterfaceC1660820tJw
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("useAudioGraphOutput useOutPut=");
        sbLIZ.append(z);
        sbLIZ.append(", useGraph=");
        sbLIZ.append(z2);
        sbLIZ.append(", useMicIn=");
        sbLIZ.append(z3);
        sbLIZ.append(", useBgm=");
        sbLIZ.append(z4);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJJJJL(z, z2, z3, z4);
    }
}
