package com.bytedance.platform.horae.java_impl.async;

import X.AnonymousClass0888;
import X.C088B;
import X.C088D;
import X.C088F;
import X.C088G;
import X.C088I;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AsyncScheduleCenter extends BPEAHandler {
    public final Map<String, List<Message>> LL;

    public AsyncScheduleCenter(Looper looper) {
        super(looper);
        this.LL = new HashMap();
    }

    public static void LJ(C088I c088i) {
        try {
            C088F c088f = C088F.LLILZ;
            ((ArrayList) c088f.LL).add(c088i);
            if (((ArrayList) c088f.LL).size() > 100) {
                ((ArrayList) c088f.LL).subList(0, 50).clear();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("AsyncScheduleCenter@b5e1.handleMessage");
        super.handleMessage(message);
        if (HandlerHook.getMessageObj(message.obj) instanceof Message) {
            Message message2 = (Message) HandlerHook.getMessageObj(message.obj);
            if (C088G.LIZIZ(message2)) {
                C088I c088iLIZ = C088I.LIZ(message2);
                if (TextUtils.isEmpty(c088iLIZ.LIZ)) {
                    List arrayList = (List) ((HashMap) this.LL).get(c088iLIZ.LIZLLL);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(message2);
                    ((HashMap) this.LL).put(c088iLIZ.LIZLLL, arrayList);
                    AnonymousClass0888.LIZ();
                } else {
                    System.currentTimeMillis();
                    C088D c088d = C088B.LIZIZ().LLILZIL;
                    C786410Ut5.a3(message2);
                    LJ(c088iLIZ);
                    if (c088d != null) {
                        System.currentTimeMillis();
                    }
                    List<Message> list = (List) ((HashMap) this.LL).get(c088iLIZ.LIZLLL);
                    if (list != null && message2.what == 114) {
                        for (Message message3 : list) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Hint reverse message's father = ");
                            sbLIZ.append(c088iLIZ);
                            sbLIZ.append("so fix it!");
                            C2188811AlT.LIZIZ(sbLIZ);
                            AnonymousClass0888.LIZ();
                            c088iLIZ = C088I.LIZ(message3);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("After father message now service follow bean is ");
                            sbLIZ2.append(c088iLIZ);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            AnonymousClass0888.LIZ();
                            System.currentTimeMillis();
                            C786410Ut5.a3(message3);
                            if (c088d != null) {
                                System.currentTimeMillis();
                            }
                            LJ(c088iLIZ);
                        }
                        list.clear();
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Handle message ");
                    sbLIZ3.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    AnonymousClass0888.LIZ();
                }
            } else {
                C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(message2, 23));
            }
        }
        C1C7U.LIZIZ("AsyncScheduleCenter@b5e1.handleMessage");
    }
}
