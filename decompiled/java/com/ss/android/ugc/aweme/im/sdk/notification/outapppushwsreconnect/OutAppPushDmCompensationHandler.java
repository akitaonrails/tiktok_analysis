package com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect;

import X.C08I7;
import X.C0I0B;
import X.C0VI0;
import X.C0VI1;
import X.C0VI8;
import X.C0VIG;
import X.C0VIK;
import X.C0VIO;
import X.C0VIQ;
import X.C0VIR;
import X.C0VIT;
import X.C0XE1;
import X.C0Y8T;
import X.C0YI5;
import X.C0YOP;
import X.C0YSQ;
import X.C1954807lC;
import X.C1C7U;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C795410VId;
import X.C805780VjE;
import X.C805790VjF;
import X.C805810VjH;
import X.C805820VjI;
import X.C805920VjS;
import X.C869590Y9l;
import X.C875230YVd;
import X.C876340YZk;
import X.C882400YjW;
import X.C894660Z7w;
import X.EnumC794930VGh;
import X.EnumC805800VjG;
import X.InterfaceC805830VjJ;
import X.InterfaceC876950Yaj;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import androidx.work.ArrayCreatingInputMerger;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.bytedance.ies.im.core.opt.FetchMessagesWorker;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class OutAppPushDmCompensationHandler extends BPEAHandler {
    public final InterfaceC805830VjJ LL;
    public final C805920VjS LLILLJJLI;
    public final int LLILLL;
    public final C08I7<String, C805780VjE> LLILZ;
    public final C08I7<String, C805780VjE> LLILZIL;
    public final C08I7<String, Unit> LLILZLL;

    public static Pair LJ(String str) {
        try {
            String strOptString = new JSONObject(str).optString("open_url");
            if (strOptString == null) {
                return null;
            }
            Uri uri = UriProtector.parse(strOptString);
            return new Pair(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conv_id"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iIntValue;
        String str;
        String str2;
        long jLongValue;
        long j;
        Pair pairLJ;
        String str3;
        C1C7U.LIZ("OutAppPushDmCompensationHandler@a38a.handleMessage");
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        C805810VjH c805810VjH = EnumC805800VjG.Companion;
        int i = message.what;
        c805810VjH.getClass();
        EnumC805800VjG enumC805800VjGLIZ = C805810VjH.LIZ(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMessage : ");
        sbLIZ.append(enumC805800VjGLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = 0;
        switch (C805790VjF.LIZ[enumC805800VjGLIZ.ordinal()]) {
            case 1:
                if (!this.LL.LIZ() && (iIntValue = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue()) < 10) {
                    Message messageObtainMessage = obtainMessage(EnumC805800VjG.RECONNECT_WS.getWhat());
                    messageObtainMessage.obj = Integer.valueOf(iIntValue + 1);
                    sendMessageDelayed(messageObtainMessage, this.LLILLL * iIntValue);
                }
                break;
            case 2:
                if (messageObj instanceof String) {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final boolean z = C2214201BlK.LJIIJJI;
                    final C0XE1 c0xe1LIZIZ = this.LL.LIZIZ();
                    Object obj = new Object(jCurrentTimeMillis, c0xe1LIZIZ, z) { // from class: X.0VjE
                        public final long LIZ;
                        public final C0XE1 LIZIZ;
                        public final boolean LIZJ;

                        public final String toString() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("PendingMessageData(timestamp=");
                            sbLIZ2.append(this.LIZ);
                            sbLIZ2.append(", connectionState=");
                            sbLIZ2.append(this.LIZIZ);
                            sbLIZ2.append(", isBackground=");
                            sbLIZ2.append(this.LIZJ);
                            sbLIZ2.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        {
                            this.LIZ = jCurrentTimeMillis;
                            this.LIZIZ = c0xe1LIZIZ;
                            this.LIZJ = z;
                        }
                    };
                    Pair pairLJ2 = LJ((String) messageObj);
                    if (pairLJ2 != null && (str = (String) pairLJ2.getFirst()) != null && (str2 = (String) pairLJ2.getSecond()) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("msg id : ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", conv id: ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C805780VjE c805780VjELIZIZ = this.LLILZIL.LIZIZ(str2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("imsdkTime : ");
                        sbLIZ3.append(c805780VjELIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (c805780VjELIZIZ == null) {
                            this.LLILZ.LIZLLL(str2, (C805780VjE) obj);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("enqueuePullMsgWorkRequest convId: ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(", msgId: ");
                            sbLIZ4.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                            if (c0y8tLJIL != null) {
                                C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
                                C0I0B.LJFF.LIZJ();
                                Context contextLIZ = C894660Z7w.LIZ();
                                int inboxType = c0y8tLJIL.getInboxType();
                                Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                                if (lLJIILIIL != null) {
                                    jLongValue = lLJIILIIL.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                                c0yi5LIZ.getClass();
                                if (inboxType >= 0 && jLongValue >= 0) {
                                    C0VIQ c0viq = new C0VIQ();
                                    c0viq.LIZIZ = EnumC794930VGh.CONNECTED;
                                    C0VIK c0vik = new C0VIK(c0viq);
                                    C882400YjW.LIZ.getClass();
                                    C882400YjW.LJII();
                                    if (WsDependImpl.LL.LIZJ()) {
                                        j = 10;
                                    } else {
                                        j = 2;
                                    }
                                    C0VIO c0vio = new C0VIO(FetchMessagesWorker.class);
                                    Pair[] pairArr = {new Pair("key_inbox", Integer.valueOf(inboxType)), new Pair("key_msg_id", Long.valueOf(jLongValue))};
                                    C795410VId c795410VId = new C795410VId();
                                    do {
                                        Pair pair = pairArr[i2];
                                        i2++;
                                        c795410VId.LIZIZ(pair.getSecond(), (String) pair.getFirst());
                                    } while (i2 < 2);
                                    c0vio.LJ(c795410VId.LIZ());
                                    c0vio.LIZJ.LIZLLL = ArrayCreatingInputMerger.class.getName();
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    c0vio.LIZLLL(j, timeUnit);
                                    c0vio.LIZJ.LJIIIZ = c0vik;
                                    C0VIT c0vit = C0VIT.EXPONENTIAL;
                                    c0vio.LIZ = true;
                                    C0VIG c0vig = c0vio.LIZJ;
                                    c0vig.LJIIJJI = c0vit;
                                    long millis = timeUnit.toMillis(10L);
                                    if (millis > 18000000) {
                                        C0VI8.LIZ().getClass();
                                        millis = 18000000;
                                    } else if (millis < 10000) {
                                        C0VI8.LIZ().getClass();
                                        millis = 10000;
                                    }
                                    c0vig.LJIIL = millis;
                                    C0VIR c0virLIZ = c0vio.LIZ();
                                    C0VI1 c0vi1LJII = C0VI1.LJII(C786410Ut5.N3(contextLIZ));
                                    C0VI0 c0vi0 = C0VI0.KEEP;
                                    c0vi1LJII.getClass();
                                    c0vi1LJII.LIZLLL("FetchMessagesWorker", c0vi0, Collections.singletonList(c0virLIZ));
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("enqueue success: inbox type ");
                                    sbLIZ5.append(inboxType);
                                    sbLIZ5.append(" msg id ");
                                    sbLIZ5.append(jLongValue);
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                } else {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("enqueue failed: inbox type ");
                                    sbLIZ6.append(inboxType);
                                    sbLIZ6.append(" or msg id ");
                                    sbLIZ6.append(jLongValue);
                                    sbLIZ6.append(" is invalid");
                                    C2188811AlT.LIZIZ(sbLIZ6);
                                }
                            }
                        } else {
                            getClass();
                            this.LLILZIL.LJ(str2);
                        }
                    }
                }
                break;
            case 3:
                if (messageObj instanceof List) {
                    final long jCurrentTimeMillis2 = System.currentTimeMillis();
                    final boolean z2 = C2214201BlK.LJIIJJI;
                    final C0XE1 c0xe1LIZIZ2 = this.LL.LIZIZ();
                    Object obj2 = new Object(jCurrentTimeMillis2, c0xe1LIZIZ2, z2) { // from class: X.0VjE
                        public final long LIZ;
                        public final C0XE1 LIZIZ;
                        public final boolean LIZJ;

                        public final String toString() {
                            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                            sbLIZ22.append("PendingMessageData(timestamp=");
                            sbLIZ22.append(this.LIZ);
                            sbLIZ22.append(", connectionState=");
                            sbLIZ22.append(this.LIZIZ);
                            sbLIZ22.append(", isBackground=");
                            sbLIZ22.append(this.LIZJ);
                            sbLIZ22.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ22);
                        }

                        {
                            this.LIZ = jCurrentTimeMillis2;
                            this.LIZIZ = c0xe1LIZIZ2;
                            this.LIZJ = z2;
                        }
                    };
                    for (Object obj3 : (List) messageObj) {
                        if (obj3 instanceof C869590Y9l) {
                            C869590Y9l c869590Y9l = (C869590Y9l) obj3;
                            this.LLILZLL.LIZLLL(String.valueOf(c869590Y9l.getMsgId()), Unit.LIZ);
                            String strValueOf = String.valueOf(c869590Y9l.getMsgId());
                            if (this.LLILZ.LIZIZ(strValueOf) != null) {
                                getClass();
                                this.LLILZ.LJ(strValueOf);
                            } else {
                                this.LLILZIL.LIZLLL(strValueOf, (C805780VjE) obj2);
                            }
                        }
                    }
                }
                break;
            case 4:
                if ((messageObj instanceof String) && (pairLJ = LJ((String) messageObj)) != null && (str3 = (String) pairLJ.getSecond()) != null && this.LLILZLL.LIZIZ(str3) == null && C875230YVd.LIZIZ(str3) == null) {
                    C0YOP.LIZ("out_push_compensation", false, 0, null, 30);
                }
                break;
            case 5:
                this.LLILZ.LIZ();
                this.LLILZIL.LIZ();
                this.LLILZLL.LIZ();
                EnumC805800VjG[] enumC805800VjGArrValues = EnumC805800VjG.values();
                int length = enumC805800VjGArrValues.length;
                while (i2 < length) {
                    removeMessages(enumC805800VjGArrValues[i2].getWhat());
                    i2++;
                }
                break;
            case 6:
                break;
            default:
                throw new C1954807lC();
        }
        C1C7U.LIZIZ("OutAppPushDmCompensationHandler@a38a.handleMessage");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0VjS] */
    public OutAppPushDmCompensationHandler(Looper looper, InterfaceC805830VjJ interfaceC805830VjJ) {
        ?? r2 = new Object() { // from class: X.0VjS
            public final InterfaceC1493105sv LIZ = C0I0B.LJFF.LIZIZ();
        };
        int i = C805820VjI.LIZ().cache_size;
        int i2 = C805820VjI.LIZ().ws_reconnect_delay;
        super(looper);
        this.LL = interfaceC805830VjJ;
        this.LLILLJJLI = r2;
        this.LLILLL = i2;
        this.LLILZ = new C08I7<>(i);
        this.LLILZIL = new C08I7<>(i);
        this.LLILZLL = new C08I7<>(i);
    }
}
