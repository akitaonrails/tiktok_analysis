package org.chromium;

import X.AbstractC1494840p0E;
import X.AbstractC1494870p0H;
import X.AbstractC1495350p13;
import X.C1493400oxu;
import X.C1493630oyH;
import X.C1494570ozn;
import X.C1494600ozq;
import X.C1494650ozv;
import X.C1494660ozw;
import X.C1494720p02;
import X.C1494750p05;
import X.C1494780p08;
import X.C1494790p09;
import X.C1494890p0J;
import X.C2188811AlT;
import X.C790110Uz3;
import X.EnumC1494250ozH;
import X.InterfaceC1493570oyB;
import X.InterfaceC1494730p03;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.ITrafficStatistics;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class TTCronetRequestFinishedInfoListener extends AbstractC1495350p13 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public C1494600ozq requestInfo;

    public static long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1L;
        }
        return j - j2;
    }

    @Override // X.AbstractC1495350p13
    public void onRequestFinished(AbstractC1494840p0E abstractC1494840p0E) {
        org_chromium_TTCronetRequestFinishedInfoListener_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_onRequestFinished(this, abstractC1494840p0E);
    }

    public TTCronetRequestFinishedInfoListener(C1494600ozq c1494600ozq) {
        super(new Executor() { // from class: org.chromium.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TTCronetRequestFinishedInfoListener.lambda$new$0(runnable);
            }
        });
        this.requestInfo = c1494600ozq;
    }

    public static void addABTestInfo(JSONObject jSONObject) {
        InterfaceC1493570oyB interfaceC1493570oyB;
        JSONObject jSONObject2;
        if (jSONObject != null && (interfaceC1493570oyB = C1493630oyH.LJIILIIL) != null && (jSONObject2 = ((C1493400oxu) interfaceC1493570oyB).LLJJJJ) != null) {
            try {
                jSONObject.put("ab_test", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static long getTime(Date date) {
        if (date == null) {
            return -1L;
        }
        return date.getTime();
    }

    public static long getValue(Long l) {
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static /* synthetic */ void lambda$new$0(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void org_chromium_TTCronetRequestFinishedInfoListener__onRequestFinished$___twin___(AbstractC1494840p0E abstractC1494840p0E) {
        AbstractC1494870p0H abstractC1494870p0H;
        if (this.requestInfo == null || abstractC1494840p0E == null || (abstractC1494870p0H = ((C1494790p09) abstractC1494840p0E).LIZIZ) == null) {
            return;
        }
        C1494660ozw c1494660ozw = (C1494660ozw) abstractC1494870p0H;
        getTime(C1494660ozw.LIZ(c1494660ozw.LIZ));
        this.requestInfo.LIZLLL.LJJIZ(getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LIZJ)), getTime(C1494660ozw.LIZ(c1494660ozw.LIZIZ))));
        this.requestInfo.LIZLLL.LJJJIL(getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LJ)), getTime(C1494660ozw.LIZ(c1494660ozw.LIZLLL))));
        this.requestInfo.LIZLLL.LJJJJI(getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LJI)), getTime(C1494660ozw.LIZ(c1494660ozw.LJFF))));
        this.requestInfo.LIZLLL.LJJJI(getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LJIIIIZZ)), getTime(C1494660ozw.LIZ(c1494660ozw.LJII))));
        C1494570ozn c1494570ozn = this.requestInfo.LIZLLL;
        long costTime = getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LJIIJ)), getTime(C1494660ozw.LIZ(c1494660ozw.LJIIIZ)));
        c1494570ozn.LJLJI.LIZLLL.getClass();
        WeakReference<InterfaceC1494730p03> weakReference = c1494570ozn.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJFF(costTime);
        }
        this.requestInfo.LIZLLL.LJJJJ(getValue(c1494660ozw.LJIILJJIL));
        this.requestInfo.LIZLLL.LJJJ(getCostTime(getTime(C1494660ozw.LIZ(c1494660ozw.LJIIL)), getTime(C1494660ozw.LIZ(c1494660ozw.LJIIJJI))));
        this.requestInfo.LIZLLL.LJJJJIZL(getValue(c1494660ozw.LJIILL));
        C1494570ozn c1494570ozn2 = this.requestInfo.LIZLLL;
        long value = getValue(c1494660ozw.LJJ);
        c1494570ozn2.LJLJI.LIZLLL.getClass();
        c1494570ozn2.LJJZ = value;
        C1494570ozn c1494570ozn3 = this.requestInfo.LIZLLL;
        long value2 = getValue(c1494660ozw.LJJI);
        c1494570ozn3.LJLJI.LIZLLL.getClass();
        c1494570ozn3.LJJZZI = value2;
        C1494570ozn c1494570ozn4 = this.requestInfo.LIZLLL;
        int value3 = getValue(c1494660ozw.LJJIFFI);
        c1494570ozn4.LJLJI.LJ.getClass();
        c1494570ozn4.LJJZZIII = value3;
        C1494570ozn c1494570ozn5 = this.requestInfo.LIZLLL;
        long j = c1494660ozw.LJJIIZ;
        long j2 = c1494660ozw.LJJIIZI;
        long j3 = c1494660ozw.LJJIJ;
        long j4 = c1494660ozw.LJJIJIIJI;
        long j5 = c1494660ozw.LJJIJIIJIL;
        C1494650ozv c1494650ozv = c1494570ozn5.LJLJI;
        C1494750p05 c1494750p05 = c1494650ozv.LIZ;
        c1494750p05.LJI = j2;
        c1494750p05.LJII = j3;
        C1494780p08 c1494780p08 = c1494650ozv.LJ;
        c1494780p08.LIZIZ = j;
        if (!c1494780p08.LIZJ) {
            C1494720p02 c1494720p02 = c1494650ozv.LIZIZ;
            if (c1494720p02.LJII == -1) {
                long j6 = c1494570ozn5.LJLILLLLZI.LIZ.LJIJI;
                if (j6 != -1 && j2 > j6) {
                    c1494720p02.LJII = j2 - j6;
                }
            }
            c1494720p02.LJIIIIZZ = j5;
            c1494650ozv.LIZJ.LJIIIZ = j4;
        }
        c1494570ozn5.LJJJJJ(c1494660ozw.LJJIIJZLJL);
        C1494890p0J c1494890p0J = new C1494890p0J();
        c1494890p0J.LIZ = c1494660ozw.LJJIIJ;
        C1494600ozq c1494600ozq = this.requestInfo;
        c1494600ozq.LIZLLL.LJLJI.LJ.LIZLLL = c1494890p0J;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1494660ozw.LJIJ);
        sbLIZ.append(":");
        sbLIZ.append(c1494660ozw.LJIJI);
        c1494600ozq.LJIJ = C2188811AlT.LIZIZ(sbLIZ);
        C1494600ozq c1494600ozq2 = this.requestInfo;
        c1494600ozq2.LJJI = c1494660ozw.LJIILIIL;
        c1494600ozq2.LJIJI = getValue(c1494660ozw.LJIILLIIL);
        this.requestInfo.LJIJJ = getValue(c1494660ozw.LJIIZILJ);
        C1494600ozq c1494600ozq3 = this.requestInfo;
        getValue(c1494660ozw.LJIJJ);
        c1494600ozq3.getClass();
        C1494600ozq c1494600ozq4 = this.requestInfo;
        c1494600ozq4.LJJIIZI = c1494660ozw.LJIJJLI;
        c1494600ozq4.LJJIJ = c1494660ozw.LJIL;
        c1494600ozq4.LJJJ = c1494660ozw.LJJIII;
        if (c1494600ozq4.LJJIJL.LIZJ == EnumC1494250ozH.ResultNone) {
            c1494600ozq4.LJJIJIL = c1494660ozw.LJJII;
        }
        if (TextUtils.isEmpty(c1494600ozq4.LJJIIJ)) {
            addABTestInfo(this.requestInfo.LJJIIJZLJL);
        }
        try {
            C1494600ozq c1494600ozq5 = this.requestInfo;
            c1494600ozq5.LIZLLL.LJJJLZIJ.put("sentByteCount", Long.valueOf(c1494600ozq5.LJIJI));
            C1494600ozq c1494600ozq6 = this.requestInfo;
            c1494600ozq6.LIZLLL.LJJJLZIJ.put("receivedByteCount", Long.valueOf(c1494600ozq6.LJIJJ));
            C1494600ozq c1494600ozq7 = this.requestInfo;
            c1494600ozq7.LJJIIJZLJL.put("retrofit", c1494600ozq7.LIZLLL.LJIJJ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.requestInfo.LIZLLL.LJIL();
    }

    public static int getValue(Integer num) {
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static void org_chromium_TTCronetRequestFinishedInfoListener_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_onRequestFinished(TTCronetRequestFinishedInfoListener tTCronetRequestFinishedInfoListener, AbstractC1494840p0E abstractC1494840p0E) {
        AbstractC1494870p0H abstractC1494870p0H;
        tTCronetRequestFinishedInfoListener.org_chromium_TTCronetRequestFinishedInfoListener__onRequestFinished$___twin___(abstractC1494840p0E);
        if (abstractC1494840p0E != null && (abstractC1494870p0H = ((C1494790p09) abstractC1494840p0E).LIZIZ) != null) {
            C1494660ozw c1494660ozw = (C1494660ozw) abstractC1494870p0H;
            if (c1494660ozw.LJIILLIIL != null) {
                ITrafficStatistics.LIZ.getClass();
                c1494660ozw.LJIILLIIL.longValue();
            }
            if (c1494660ozw.LJIIZILJ != null) {
                ITrafficStatistics.LIZ.getClass();
                C790110Uz3.LIZIZ += c1494660ozw.LJIILLIIL.longValue();
            }
        }
    }
}
