package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc;

import X.C09UZ;
import X.C0EZE;
import X.C0LAB;
import X.C123100dR;
import X.C1461250o83;
import X.C1462900oAi;
import X.C1663660tOW;
import X.C1663870tOr;
import X.C1C7U;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2218231Brp;
import X.C2218271Brt;
import X.C2218321Bry;
import X.C2286708xd;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2218151Brh;
import X.InterfaceC379610EuV;
import Y.ARunnableS134S0100000_34;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class SVCTask implements InterfaceC379610EuV {
    public static int LLJJIJIL;
    public final C1DRG LL;
    public boolean LLILLJJLI;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public volatile TimeSpeedModelExtension LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public HandlerThread LLJILJIL;
    public AnonymousClass1 LLJILJILJ;
    public boolean LLJILLL;
    public final C2218271Brt LLJJI;
    public Function1<? super C1663870tOr, Unit> LLJJIII;
    public final C2218231Brp LLJJIJI;
    public final C2218321Bry LLJJIJIIJIL;
    public boolean LLILLL = true;
    public long LLILZ = -1;
    public long LLILZIL = -1;
    public Effect LLJJ = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, false, false, -1, -1, 15, null);

    public final void LIZJ() {
        LJFF(777, null);
    }

    public final synchronized void LJ() {
        if (this.LLJILLL) {
            this.LLJILLL = false;
            HandlerThread handlerThread = this.LLJILJIL;
            if (handlerThread == null) {
                handlerThread = null;
            }
            handlerThread.quit();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask$init$1] */
    public final synchronized void init() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vc_stream_");
        int i = LLJJIJIL;
        LLJJIJIL = i + 1;
        sbLIZ.append(i);
        HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJIL = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.LLJILJIL;
        if (handlerThread2 == null) {
            handlerThread2 = null;
        }
        this.LLJILJILJ = new BPEAHandler(C786410Ut5.W2(handlerThread2)) { // from class: com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask.init.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("SVCTask@ca80.init$1");
                int i2 = message.arg1;
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                SVCTask sVCTask = SVCTask.this;
                if (i2 != 777) {
                    if (i2 != 10010) {
                        switch (i2) {
                            case 1:
                                sVCTask.LLJJI.LIZJ();
                                break;
                            case 2:
                                sVCTask.LLJJI.LJFF((Effect) messageObj);
                                break;
                            case 3:
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C2218271Brt.LLJJJJLIIL;
                                sVCTask.LLJJI.LIZLLL(true, (byte[]) messageObj);
                                break;
                            case 4:
                                sVCTask.LLJJI.LJII();
                                break;
                            case 5:
                                sVCTask.LLJJI.LJ();
                                break;
                            case 6:
                                sVCTask.LLJJI.LJI();
                                break;
                            case 7:
                                C2218271Brt c2218271Brt = sVCTask.LLJJI;
                                synchronized (c2218271Brt) {
                                    try {
                                        c2218271Brt.LLILLL.lock();
                                        if (!c2218271Brt.LLIZ) {
                                            c2218271Brt.LLILLL.unlock();
                                        } else {
                                            c2218271Brt.LLIZ = false;
                                            if (c2218271Brt.LLILZIL) {
                                                c2218271Brt.LLILLL.unlock();
                                            } else {
                                                c2218271Brt.LLILZIL = true;
                                                System.currentTimeMillis();
                                                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                                                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Close_Loudspeaker;
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("zxzzz_SamiSVC: Close_Loudspeaker START ... , isShootingScene = ");
                                                sbLIZ2.append(c2218271Brt.LLJJ);
                                                sbLIZ2.append(", isPreviewScene = ");
                                                sbLIZ2.append(c2218271Brt.LLJILLL);
                                                sbLIZ2.append(", thread_id = ");
                                                sbLIZ2.append(Process.myTid());
                                                sbLIZ2.append(", thread_name = ");
                                                sbLIZ2.append(C786410Ut5.u3().getName());
                                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                                                int iSAMICoreSetProperty = c2218271Brt.LLILZLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("zxzzz_SamiSVC: ... Close_Loudspeaker STOP , isShootingScene = ");
                                                sbLIZ3.append(c2218271Brt.LLJJ);
                                                sbLIZ3.append(", isPreviewScene = ");
                                                sbLIZ3.append(c2218271Brt.LLJILLL);
                                                sbLIZ3.append(", thread_id = ");
                                                sbLIZ3.append(Process.myTid());
                                                sbLIZ3.append(", thread_name = ");
                                                sbLIZ3.append(C786410Ut5.u3().getName());
                                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                                                if (iSAMICoreSetProperty != 0) {
                                                    c2218271Brt.LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
                                                }
                                                System.currentTimeMillis();
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("zxzzz_SamiSVC: SAMICoreDestroyHandle START ... , isShootingScene = ");
                                                sbLIZ4.append(c2218271Brt.LLJJ);
                                                sbLIZ4.append(", isPreviewScene = ");
                                                sbLIZ4.append(c2218271Brt.LLJILLL);
                                                sbLIZ4.append(", thread_id = ");
                                                sbLIZ4.append(Process.myTid());
                                                sbLIZ4.append(", thread_name = ");
                                                sbLIZ4.append(C786410Ut5.u3().getName());
                                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                                                int iSAMICoreDestroyHandle = c2218271Brt.LLILZLL.SAMICoreDestroyHandle();
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("zxzzz_SamiSVC: ... SAMICoreDestroyHandle STOP , isShootingScene = ");
                                                sbLIZ5.append(c2218271Brt.LLJJ);
                                                sbLIZ5.append(", isPreviewScene = ");
                                                sbLIZ5.append(c2218271Brt.LLJILLL);
                                                sbLIZ5.append(", thread_id = ");
                                                sbLIZ5.append(Process.myTid());
                                                sbLIZ5.append(", thread_name = ");
                                                sbLIZ5.append(C786410Ut5.u3().getName());
                                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ5));
                                                if (iSAMICoreDestroyHandle != 0) {
                                                    c2218271Brt.LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
                                                }
                                                c2218271Brt.LLILLL.unlock();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c2218271Brt.LLILLL.unlock();
                                        throw th;
                                    }
                                    break;
                                }
                                break;
                            default:
                                sVCTask.getClass();
                                break;
                        }
                    } else {
                        sVCTask.LJ();
                    }
                } else {
                    sVCTask.LLJJI.LIZIZ(AFwS281S0000000_34.get$arr$(65));
                }
                C1C7U.LIZIZ("SVCTask@ca80.init$1");
            }
        };
    }

    public final void LIZ() {
        if (this.LLJILLL) {
            this.LLJIJIL = true;
            C09UZ.LIZ(new ARunnableS134S0100000_34(this, 34));
        }
    }

    public final C1461250o83 LIZIZ() {
        Object[] objArr;
        C2218271Brt c2218271Brt = this.LLJJI;
        synchronized (c2218271Brt) {
            try {
                c2218271Brt.LLILLL.lock();
                if (!c2218271Brt.LLIZ) {
                    C1461250o83 c1461250o83 = new C1461250o83(null, null, null, null, 511);
                    c2218271Brt.LLILLL.unlock();
                    return c1461250o83;
                }
                System.currentTimeMillis();
                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zxzzz_SamiSVC: Get_Input_Data_Save_File START ... , isShootingScene = ");
                sbLIZ.append(c2218271Brt.LLJJ);
                sbLIZ.append(", isPreviewScene = ");
                sbLIZ.append(c2218271Brt.LLJILLL);
                sbLIZ.append(", thread_id = ");
                sbLIZ.append(Process.myTid());
                sbLIZ.append(", thread_name = ");
                sbLIZ.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                int iSAMICoreGetPropertyById = c2218271Brt.LLILZLL.SAMICoreGetPropertyById(SAMICorePropertyId.SAMICorePropertyId_VC_Online_Get_Input_Data_Save_File, sAMICoreProperty);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("zxzzz_SamiSVC: ... Get_Input_Data_Save_File STOP , isShootingScene = ");
                sbLIZ2.append(c2218271Brt.LLJJ);
                sbLIZ2.append(", isPreviewScene = ");
                sbLIZ2.append(c2218271Brt.LLJILLL);
                sbLIZ2.append(", thread_id = ");
                sbLIZ2.append(Process.myTid());
                sbLIZ2.append(", thread_name = ");
                sbLIZ2.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (iSAMICoreGetPropertyById == 0 && sAMICoreProperty.type == SAMICoreDataType.SAMICoreDataType_String && (objArr = sAMICoreProperty.dataObjectArray) != null) {
                    String str = (String) objArr[0];
                    if (C123100dR.LIZ(str)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        BPEAHandler bPEAHandler = C1462900oAi.LIZ;
                        sbLIZ3.append(C1462900oAi.LIZ(c2218271Brt.LIZ().creativeInfo));
                        sbLIZ3.append('/');
                        sbLIZ3.append(c2218271Brt.LLIZLLLIL);
                        sbLIZ3.append("_vc_input_audio.pcm");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        if (C2286708xd.LJFF(str, strLIZIZ)) {
                            Effect effect = c2218271Brt.LLJI;
                            C1461250o83 c1461250o832 = new C1461250o83("", strLIZIZ, effect, effect.getEffect_id(), 464);
                            c2218271Brt.LLILLL.unlock();
                            return c1461250o832;
                        }
                    }
                }
                C1461250o83 c1461250o833 = new C1461250o83(null, null, null, null, 511);
                c2218271Brt.LLILLL.unlock();
                return c1461250o833;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2218271Brt.LLILLL.unlock();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public SVCTask(C1DRG c1drg) {
        this.LL = c1drg;
        C2218271Brt c2218271Brt = new C2218271Brt(c1drg);
        c2218271Brt.LLJILJIL = new AwS604S0100000_25(this, 148);
        this.LLJJI = c2218271Brt;
        this.LLJJIII = AFwS266S0000000_25.get$arr$(132);
        this.LLJJIJI = new C2218231Brp(c1drg);
        this.LLJJIJIIJIL = new C2218321Bry();
    }

    public static void LJII(SVCTask sVCTask) {
        if (!sVCTask.LLJIJIL) {
            sVCTask.LLJIJIL = true;
            if (sVCTask.LLILLL) {
                C2218231Brp c2218231Brp = sVCTask.LLJJIJI;
                c2218231Brp.LLILZIL = AFwS281S0000000_34.get$arr$(66);
                c2218231Brp.LIZ();
            }
            sVCTask.LLJJIJIIJIL.LIZ = false;
            sVCTask.LJFF(4, null);
            sVCTask.LJFF(6, null);
            sVCTask.LJFF(7, null);
        }
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext) {
        if (!this.LLILLJJLI || this.LLJIJIL || this.LLJI) {
            return;
        }
        this.LLJI = true;
        this.LLILZIL = System.currentTimeMillis();
        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
        Effect effect = this.LLJJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        c1663660tOW.getClass();
        C0LAB c0labLJII = C1663660tOW.LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        c0labLJII.LIZIZ(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("voice_effect_preview_record_end", c0labLJII.LIZ);
        if (this.LLILLL) {
            C2218231Brp c2218231Brp = this.LLJJIJI;
            c2218231Brp.LLILZIL = AFwS266S0000000_25.get$arr$(131);
            c2218231Brp.LIZ();
        }
        LJFF(5, null);
        LJFF(4, null);
    }

    public final void LJFF(int i, Object obj) {
        if (!this.LLJILLL) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.LLJILJILJ;
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

    public final void LJI(Effect effect, boolean z) {
        if (!this.LLILLJJLI && !this.LLJIJIL) {
            this.LLILLJJLI = true;
            this.LLJJ = effect;
            this.LLILZ = System.currentTimeMillis();
            this.LLILLL = z;
            if (z) {
                C2218231Brp c2218231Brp = this.LLJJIJI;
                if (!c2218231Brp.LLILLL) {
                    c2218231Brp.LLILLL = true;
                    c2218231Brp.LLILZ = true;
                    C0EZE c0eze = (C0EZE) c2218231Brp.LLILZLL.getValue();
                    c0eze.LIZJ.setRecorderListener((InterfaceC2218151Brh) c2218231Brp.LLIZ.getValue());
                    ((C0EZE) c2218231Brp.LLILZLL.getValue()).LIZJ(0, 5000, C1462900oAi.LIZIZ);
                }
            }
            init();
            LJFF(1, null);
            LJFF(2, effect);
            if (this.LLILLL) {
                this.LLJJIJI.LLILZIL = new AwS613S0100000_34(this, 146);
            }
        }
    }
}
