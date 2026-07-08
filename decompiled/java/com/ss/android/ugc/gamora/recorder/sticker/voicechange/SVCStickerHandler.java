package com.ss.android.ugc.gamora.recorder.sticker.voicechange;

import X.AbstractC1622390sJx;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1623280sLO;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19EG;
import X.C19GS;
import X.C1DRG;
import X.C20012313Rx;
import X.C201955140j;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC1623110sL7;
import X.InterfaceC1648570t0B;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.ARunnableS125S0100000_25;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.gamora.recorder.sticker.voicechange.SVCStickerHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public final class SVCStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, InterfaceC379610EuV, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LLILLJJLI;
    public final C19EG LLILLL;
    public final Function1<String, Unit> LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 779));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SVCStickerHandler.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SVCStickerHandler.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLIZ = null;
        if (this.LLILZIL) {
            ToolSafeHandler toolSafeHandler = (ToolSafeHandler) this.LLJI.getValue();
            ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 60);
            if (toolSafeHandler.LLILLL) {
                return;
            }
            toolSafeHandler.post(aRunnableS125S0100000_25);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final ShortVideoContext LJJIIJ() {
        return (ShortVideoContext) this.LLIZLLLIL.getValue(this, LLJIJIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    @Override // X.AbstractC1622390sJx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI(X.C1627370sRz r8) {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r8.LIZ
            boolean r5 = X.C1624570sNT.LJJIIZ(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LJJIIJ()
            java.lang.String r2 = r0.shootWay
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LJJIIJ()
            int r6 = r0.shootMode
            X.13Rx r4 = X.C20012313Rx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shootWay = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", shootMode = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r3 = "SVCStickerHandler"
            X.C201955140j.LIZLLL(r4, r3, r0)
            r0 = 2
            r2 = 1
            if (r6 == r0) goto La8
            r0 = 12
            if (r6 == r0) goto La8
            r0 = 16
            if (r6 == r0) goto La8
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LJJIIJ()
            boolean r0 = X.C1443960ngA.LJII(r0)
            if (r0 != 0) goto L64
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r7.LJJIIJ()
            boolean r0 = r0.LJJJJLL()
            if (r0 != 0) goto L64
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L8e
            java.lang.String r0 = "disable by login"
            X.C201955140j.LIZLLL(r4, r3, r0)
        L64:
            r6 = 0
        L65:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isMicInputSticker = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " ,hasPassConditionCheck = "
            r1.append(r0)
            r1.append(r6)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r4, r3, r0)
            if (r5 != 0) goto L8c
            if (r6 == 0) goto L8c
        L89:
            r7.LLILZLL = r2
            return r2
        L8c:
            r2 = 0
            goto L89
        L8e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService> r0 = com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService r0 = (com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService) r0
            boolean r0 = r0.yi2()
            if (r0 == 0) goto La6
            java.lang.String r0 = "disable by user"
            X.C201955140j.LIZLLL(r4, r3, r0)
            goto L64
        La6:
            r6 = 1
            goto L65
        La8:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "disable by shoot mode, "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r4, r3, r0)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.voicechange.SVCStickerHandler.LJJI(X.0sRz):boolean");
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        if (Intrinsics.LJFF(this.LLIZ, c1627370sRz.LIZ.getEffectId())) {
            return;
        }
        this.LLIZ = c1627370sRz.LIZ.getEffectId();
        if (this.LLILZIL) {
            ToolSafeHandler toolSafeHandler = (ToolSafeHandler) this.LLJI.getValue();
            ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 61);
            if (!toolSafeHandler.LLILLL) {
                toolSafeHandler.post(aRunnableS125S0100000_25);
            }
        }
    }

    public SVCStickerHandler(C1DRG c1drg, C19GS c19gs, C1623280sLO c1623280sLO) {
        this.LLILLJJLI = c1drg;
        this.LLILLL = c19gs;
        this.LLILZ = c1623280sLO;
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        final String strOptString;
        JSONObject jSONObjectOptJSONObject;
        if (399729 == i) {
            if (!this.LLILZLL) {
                C201955140j.LIZLLL(C20012313Rx.LIZIZ, "SVCStickerHandler", "onMessageReceived, disable by canHandle check");
                return;
            }
            if (str != null && str.length() != 0) {
                try {
                    jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("voice_change");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJIIIZ(C20012313Rx.LIZIZ, "SVCStickerHandler", "onMessageReceived , arg3 json exception", e);
                }
                if (jSONObjectOptJSONObject != null) {
                    strOptString = jSONObjectOptJSONObject.optString("speaker_id");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                } else {
                    strOptString = "";
                }
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("speakerId = ");
                sbLIZ.append(strOptString);
                C201955140j.LIZLLL(c20012313Rx, "SVCStickerHandler", C2188811AlT.LIZIZ(sbLIZ));
                ToolSafeHandler toolSafeHandler = (ToolSafeHandler) this.LLJI.getValue();
                Runnable runnable = new Runnable() { // from class: X.0sLs
                    public final void LIZ() {
                        SVCStickerHandler sVCStickerHandler = this.LL;
                        if (((InterfaceC1648570t0B) sVCStickerHandler.LLJ.getValue(sVCStickerHandler, SVCStickerHandler.LLJIJIL[1])).isRecording().LIZJ().booleanValue()) {
                            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "SVCStickerHandler", "recording! msg is lost");
                            return;
                        }
                        C540180LGm c540180LGm = C540180LGm.LIZ;
                        c540180LGm.getClass();
                        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
                            SVCStickerHandler sVCStickerHandler2 = this.LL;
                            sVCStickerHandler2.LLILZIL = true;
                            sVCStickerHandler2.LLILZ.invoke(strOptString);
                            return;
                        }
                        SVCStickerHandler sVCStickerHandler3 = this.LL;
                        C19EG c19eg = sVCStickerHandler3.LLILLL;
                        C0LH5 c0lh5 = new C0LH5() { // from class: X.0sLt
                            @Override // X.C0LH5
                            public final void LIZ(int[] iArr, String[] strArr) {
                            }
                        };
                        AwS174S1100000_25 awS174S1100000_25 = new AwS174S1100000_25(sVCStickerHandler3, strOptString, 17);
                        TokenCert tokenCert = C1623600sLu.LIZ;
                        c540180LGm.getClass();
                        C540180LGm.LIZ(c19eg, c0lh5, awS174S1100000_25, tokenCert);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SVCStickerHandler@6ad2.onMessageReceived$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SVCStickerHandler@6ad2.onMessageReceived$1");
                    }
                };
                if (!toolSafeHandler.LLILLL) {
                    toolSafeHandler.post(runnable);
                    return;
                }
                return;
            }
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "SVCStickerHandler", "onMessageReceived, arg3 is null or empty");
        }
    }
}
