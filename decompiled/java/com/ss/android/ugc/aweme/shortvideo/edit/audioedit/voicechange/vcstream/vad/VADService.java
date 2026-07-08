package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad;

import X.C13LE;
import X.C13Q5;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2218221Bro;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.ARunnableS134S0100000_34;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.structures.SAMICoreAudioBuffer;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class VADService implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static int LLJLLIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public SAMICoreBlock LLJ;
    public SAMICoreAudioBuffer LLJI;
    public byte[] LLJIJIL;
    public float[] LLJILJIL;
    public float[][] LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJI;
    public HandlerThread LLJJIII;
    public AnonymousClass1 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJLILLLLZIIL;
    public final C2218221Bro LLILLL = new C2218221Bro(this);
    public final int LLILZ = 44100;
    public final int LLILZIL = 2;
    public final int LLILZLL = 44100;
    public final String LLIZ = "sami_vad";
    public String LLIZLLLIL = "";
    public SAMICore LLJJ = new SAMICore();
    public Function1<? super Integer, Unit> LLJJIJIL = AFwS266S0000000_25.get$arr$(133);
    public final int LLJJJ = 100;
    public final int LLJJJIL = 1;
    public final long LLJJJJ = 1000;
    public final int LLJJJJJIL = 3;
    public final List<Integer> LLJJJJLIIL = new ArrayList();
    public int LLJJL = 0;
    public final BPEAHandler LLJL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS134S0100000_34 LLJLIL = new ARunnableS134S0100000_34(this, 35);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VADService.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LIZJ() {
        this.LLJL.removeCallbacks(this.LLJLIL);
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJLILLLLZIIL = false;
        LIZ(3, null);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService$init$1] */
    public final void init() {
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        this.LLJLILLLLZIIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vc_stream_vad_");
        int i = LLJLLIL;
        LLJLLIL = i + 1;
        sbLIZ.append(i);
        HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.LLJJIII;
        if (handlerThread2 == null) {
            handlerThread2 = null;
        }
        this.LLJJIJI = new BPEAHandler(C786410Ut5.W2(handlerThread2)) { // from class: com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService.init.1
            /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0176  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleMessage(android.os.Message r14) {
                /*
                    Method dump skipped, instruction units count: 785
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService.AnonymousClass1.handleMessage(android.os.Message):void");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    public final void LIZIZ() {
        System.currentTimeMillis();
        final AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(this, 37);
        final C259800zU c259800zU = new C259800zU();
        String strFindResourceUri = C13Q5.LIZ().LIZLLL().findResourceUri(this.LLIZ);
        ?? r0 = strFindResourceUri;
        if (strFindResourceUri == null) {
            r0 = "";
        }
        c259800zU.element = r0;
        if (r0.length() == 0) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{this.LLIZ}, new FetchResourcesListener() { // from class: X.13U1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    try {
                        C259800zU<String> c259800zU2 = c259800zU;
                        String strFindResourceUri2 = C13Q5.LIZ().LIZLLL().findResourceUri(this.LIZ.LLIZ);
                        T t = strFindResourceUri2;
                        if (strFindResourceUri2 == null) {
                            t = "";
                        }
                        c259800zU2.element = t;
                        VADService vADService = this.LIZ;
                        String path = URI.create(c259800zU.element).getPath();
                        if (path == null) {
                            path = "";
                        }
                        vADService.LLIZLLLIL = path;
                        awS613S0100000_34.invoke(c259800zU.element);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LLIZLLLIL = "";
                        awS613S0100000_34.invoke("");
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    this.LIZ.LLIZLLLIL = "";
                    awS613S0100000_34.invoke("");
                }
            });
            return;
        }
        try {
            String path = URI.create((String) c259800zU.element).getPath();
            if (path == null) {
                path = "";
            }
            this.LLIZLLLIL = path;
            awS613S0100000_34.invoke(c259800zU.element);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLIZLLLIL = "";
            awS613S0100000_34.invoke("");
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public VADService(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
    }

    public final void LIZ(int i, Object obj) {
        if (!this.LLJJIJIIJIL) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.LLJJIJI;
        if (anonymousClass1 == null) {
            anonymousClass1 = null;
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i;
        if (obj != null) {
            messageObtain.obj = obj;
        }
        C786410Ut5.LJLJJL(anonymousClass1, messageObtain);
    }
}
