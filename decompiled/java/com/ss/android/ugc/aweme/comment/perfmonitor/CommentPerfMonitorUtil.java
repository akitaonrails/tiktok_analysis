package com.ss.android.ugc.aweme.comment.perfmonitor;

import X.AbstractC1345440l7G;
import X.AbstractC1345900l80;
import X.C1345380l7A;
import X.C1345390l7B;
import X.C1345400l7C;
import X.C1345410l7D;
import X.C1345420l7E;
import X.C1345430l7F;
import X.C1345910l81;
import X.C15O7;
import X.C1C7U;
import X.C20684815ws;
import X.C743720TFi;
import X.EnumC1342450l2R;
import Y.ACallableS426S0100000_21;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import defpackage.d1;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPerfMonitorUtil {
    public static final CommentPerfMonitorUtil LIZ = new CommentPerfMonitorUtil();
    public static final C743720TFi LIZIZ = new C743720TFi();
    public static final C1345430l7F LIZJ = new C1345430l7F();
    public static final C1345400l7C LIZLLL = new C1345400l7C(-1, -1, -1, -1, "comment_delete_time", false);
    public static final C1345410l7D LJ = new C1345410l7D();
    public static final C1345420l7E LJFF = new C1345420l7E();
    public static final C1345390l7B LJI = new C1345390l7B("comment_page_load_time_v2");
    public static final C1345380l7A LJII = new C1345380l7A();
    public static final MyHandler LJIIIIZZ = new MyHandler();
    public static boolean LJIIIZ;

    public static final class MyHandler extends BPEAHandler {
        public MyHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("CommentPerfMonitorUtil$MyHandler@5d63.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
                    C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
                    commentPerfMonitorUtil.getClass();
                    C15O7.LIZJ(new ACallableS426S0100000_21(c1345380l7A, 11));
                }
            } else {
                CommentPerfMonitorUtil commentPerfMonitorUtil2 = CommentPerfMonitorUtil.LIZ;
                C1345390l7B c1345390l7B = CommentPerfMonitorUtil.LJI;
                commentPerfMonitorUtil2.getClass();
                C15O7.LIZJ(new ACallableS426S0100000_21(c1345390l7B, 11));
            }
            C1C7U.LIZIZ("CommentPerfMonitorUtil$MyHandler@5d63.handleMessage");
        }
    }

    public static void LIZIZ() {
        LIZJ.LJ = System.currentTimeMillis();
    }

    public static void LJIIIIZZ() {
        LJII.LJJIFFI = false;
        LJIIIZ = false;
    }

    public static void LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LJI.LJIILL = jCurrentTimeMillis;
        MyHandler myHandler = LJIIIIZZ;
        myHandler.removeMessages(0);
        Message message = new Message();
        message.what = 0;
        myHandler.sendMessageDelayed(message, 200L);
        if (LJIIIZ) {
            return;
        }
        LJII.LJIILL = jCurrentTimeMillis;
        myHandler.removeMessages(1);
        Message message2 = new Message();
        message2.what = 1;
        myHandler.sendMessageDelayed(message2, 200L);
    }

    public static boolean LJI() {
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        return iNetworkStateService.isWeakNetwork() || iNetworkStateService.isFakeNetwork();
    }

    public static void LIZJ(Object... objArr) {
        int length = 0;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof C1345910l81) {
                C1345430l7F c1345430l7F = LIZJ;
                String str = ((AbstractC1345900l80) obj).LIZIZ;
                if (str != null) {
                    length = str.length();
                }
                c1345430l7F.LJI = length;
            }
        }
        C1345430l7F c1345430l7F2 = LIZJ;
        c1345430l7F2.LJFF = LJI();
        c1345430l7F2.LIZLLL = System.currentTimeMillis();
    }

    public static d1 LJFF(boolean z) {
        if (z) {
            return LJII.LJJIII;
        }
        return LIZIZ.LJIIIIZZ;
    }

    public static void LJII(AbstractC1345440l7G abstractC1345440l7G) {
        if (abstractC1345440l7G.LIZ() && CommentSampleRateSetting.LIZ(0.15f, "comment_pref_monitor")) {
            C20684815ws.LJIJ(abstractC1345440l7G.LIZ, abstractC1345440l7G.LIZJ());
            if (abstractC1345440l7G instanceof C1345380l7A) {
                LJIIIIZZ();
            }
            abstractC1345440l7G.LIZIZ();
            return;
        }
        if ((abstractC1345440l7G instanceof C1345380l7A) && ((C1345380l7A) abstractC1345440l7G).LJJIFFI) {
            return;
        }
        abstractC1345440l7G.LIZIZ();
    }

    public static void LIZ(String str, boolean z) {
        C1345390l7B c1345390l7B = LJI;
        c1345390l7B.LIZIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1345390l7B.LIZJ = jCurrentTimeMillis;
        c1345390l7B.LIZIZ = str;
        c1345390l7B.LJIJ = z;
        C1345380l7A c1345380l7A = LJII;
        c1345380l7A.LIZIZ();
        LJIIIZ = false;
        c1345380l7A.LIZJ = jCurrentTimeMillis;
        c1345380l7A.LIZIZ = str;
        c1345380l7A.LJIJJ = true;
        c1345380l7A.LJIJ = z;
    }

    public static void LIZLLL(boolean z, int i, EnumC1342450l2R enumC1342450l2R, int i2) {
        C1345380l7A c1345380l7A = LJII;
        c1345380l7A.LJJ = System.currentTimeMillis();
        c1345380l7A.LJIJJLI = Boolean.valueOf(z);
        c1345380l7A.LJIIZILJ = i;
        c1345380l7A.LJIJI = enumC1342450l2R;
        c1345380l7A.LJJIIJ = i2;
    }
}
