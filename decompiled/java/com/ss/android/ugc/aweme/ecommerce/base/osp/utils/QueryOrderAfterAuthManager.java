package com.ss.android.ugc.aweme.ecommerce.base.osp.utils;

import X.C03N6;
import X.C03N8;
import X.C03N9;
import X.C03NA;
import X.C03NC;
import X.C03WX;
import X.C0PEM;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C7727030b;
import X.C817503Hh;
import X.EnumC828303Ll;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusResponseData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PollOrderRetryConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryOrderAfterAuthManager {
    public WorkHandler LIZ;
    public C03WX LIZIZ;
    public final List<Integer> LIZJ;
    public final int LIZLLL;
    public int LJ;
    public long LJFF;
    public PollOrderStatusRequest LJI;
    public PollOrderStatusResponseData LJII;
    public C03N9 LJIIIIZZ;
    public Integer LJIIIZ;
    public final C03N8 LJIIJ;
    public boolean LJIIJJI;
    public Integer LJIIL;

    public final void LIZ() {
        this.LJ = 0;
        WorkHandler workHandler = this.LIZ;
        if (workHandler != null) {
            workHandler.removeMessages(100);
        }
        WorkHandler workHandler2 = this.LIZ;
        if (workHandler2 != null) {
            workHandler2.removeMessages(200);
        }
    }

    public QueryOrderAfterAuthManager() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PollOrderRetryConfig pollOrderRetryConfig = C03NC.LIZ;
        PollOrderRetryConfig pollOrderRetryConfig2 = (PollOrderRetryConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_order_status_retry_delay_time", PollOrderRetryConfig.class, pollOrderRetryConfig);
        List<Integer> list = (pollOrderRetryConfig2 == null ? pollOrderRetryConfig : pollOrderRetryConfig2).retryMaxDelayTimes;
        this.LIZJ = list == null ? new ArrayList<>() : list;
        PollOrderRetryConfig pollOrderRetryConfig3 = (PollOrderRetryConfig) SettingsManager.LIZLLL().LJIIIIZZ("ecom_order_status_retry_delay_time", PollOrderRetryConfig.class, pollOrderRetryConfig);
        List<Integer> list2 = (pollOrderRetryConfig3 != null ? pollOrderRetryConfig3 : pollOrderRetryConfig).retryMaxDelayTimes;
        this.LIZLLL = list2 != null ? list2.size() : 5;
        this.LJIIJ = new C03N8(Integer.valueOf(this.LJ), 0, Long.valueOf(this.LJFF), Long.valueOf(this.LJFF));
    }

    public static final class WorkHandler extends BPEAHandler {
        public final QueryOrderAfterAuthManager LL;

        public WorkHandler(QueryOrderAfterAuthManager queryOrderAfterAuthManager) {
            super(Looper.getMainLooper());
            this.LL = queryOrderAfterAuthManager;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int iIntValue;
            C1C7U.LIZ("QueryOrderAfterAuthManager$WorkHandler@3266.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            PollOrderDisplayInfo pollOrderDisplayInfo = null;
            if (i == 100) {
                QueryOrderAfterAuthManager queryOrderAfterAuthManager = this.LL;
                queryOrderAfterAuthManager.LJ++;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start the ");
                sbLIZ.append(queryOrderAfterAuthManager.LJ);
                sbLIZ.append(" time query");
                C2188811AlT.LIZIZ(sbLIZ);
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C03N6(queryOrderAfterAuthManager, null), 2);
            } else if (i == 200) {
                QueryOrderAfterAuthManager queryOrderAfterAuthManager2 = this.LL;
                if (queryOrderAfterAuthManager2.LJ <= queryOrderAfterAuthManager2.LIZLLL) {
                    WorkHandler workHandler = queryOrderAfterAuthManager2.LIZ;
                    if (workHandler != null) {
                        workHandler.sendEmptyMessage(100);
                    }
                    WorkHandler workHandler2 = queryOrderAfterAuthManager2.LIZ;
                    if (workHandler2 != null) {
                        Integer num = (Integer) C7727030b.LIZ(queryOrderAfterAuthManager2.LJ, queryOrderAfterAuthManager2.LIZJ);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 3500;
                        }
                        workHandler2.sendEmptyMessageDelayed(200, iIntValue);
                    }
                } else {
                    queryOrderAfterAuthManager2.LJIIJ.LIZJ = Long.valueOf(System.currentTimeMillis() - queryOrderAfterAuthManager2.LJFF);
                    queryOrderAfterAuthManager2.LIZ();
                    C03N9 c03n9 = queryOrderAfterAuthManager2.LJIIIIZZ;
                    if (c03n9 != null) {
                        EnumC828303Ll enumC828303Ll = EnumC828303Ll.POLL_TIMEOUT;
                        C03N8 c03n8 = queryOrderAfterAuthManager2.LJIIJ;
                        PollOrderStatusResponseData pollOrderStatusResponseData = queryOrderAfterAuthManager2.LJII;
                        if (pollOrderStatusResponseData != null) {
                            pollOrderDisplayInfo = pollOrderStatusResponseData.pollOrderDisplayInfo;
                        }
                        c03n9.LIZ(enumC828303Ll, null, null, c03n8, pollOrderDisplayInfo);
                    }
                }
            }
            C1C7U.LIZIZ("QueryOrderAfterAuthManager$WorkHandler@3266.handleMessage");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(C03NA c03na) {
        String str;
        PollOrderStatusRequest pollOrderStatusRequestLIZ;
        int iIntValue;
        String str2;
        this.LJIIJ.LIZJ = Long.valueOf(System.currentTimeMillis() - this.LJFF);
        this.LJIIJ.LIZ = Integer.valueOf(this.LJ);
        if (c03na == null) {
            LIZ();
            C03N9 c03n9 = this.LJIIIIZZ;
            if (c03n9 != null) {
                c03n9.LIZ(EnumC828303Ll.POLL_FAIL, null, null, this.LJIIJ, null);
                return;
            }
            return;
        }
        PollOrderStatusResponseData pollOrderStatusResponseData = (PollOrderStatusResponseData) c03na.data;
        String strValueOf = String.valueOf(c03na.code);
        if (pollOrderStatusResponseData == null || (str = pollOrderStatusResponseData.logId) == null) {
            PollOrderStatusRequest pollOrderStatusRequest = this.LJI;
            if (pollOrderStatusRequest != null) {
                str = pollOrderStatusRequest.lastLogId;
            } else {
                str = null;
            }
        }
        this.LJII = pollOrderStatusResponseData;
        PollOrderStatusRequest pollOrderStatusRequest2 = this.LJI;
        if (pollOrderStatusRequest2 != null) {
            int i = this.LJ;
            Integer num = this.LJIIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            pollOrderStatusRequestLIZ = PollOrderStatusRequest.LIZ(pollOrderStatusRequest2, i, str, Integer.valueOf(iIntValue), 371);
            PollOrderStatusRequest pollOrderStatusRequest3 = this.LJI;
            if (pollOrderStatusRequest3 != null) {
                str2 = pollOrderStatusRequest3.LIZ;
            } else {
                str2 = null;
            }
            pollOrderStatusRequestLIZ.LIZ = str2;
        } else {
            pollOrderStatusRequestLIZ = null;
        }
        this.LJI = pollOrderStatusRequestLIZ;
        if (pollOrderStatusResponseData != null) {
            C03N8 c03n8 = this.LJIIJ;
            Integer num2 = pollOrderStatusResponseData.status;
            c03n8.LIZLLL = num2;
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    LIZ();
                    C03N9 c03n92 = this.LJIIIIZZ;
                    if (c03n92 != null) {
                        c03n92.LIZ(EnumC828303Ll.POLL_SUCCESS, null, null, this.LJIIJ, null);
                        return;
                    }
                    return;
                }
                if (num2.intValue() == 5) {
                    LIZ();
                    C03N9 c03n93 = this.LJIIIIZZ;
                    if (c03n93 == null) {
                        return;
                    }
                    c03n93.LIZ(EnumC828303Ll.POLL_CANCEL_SUCCESS, null, null, this.LJIIJ, null);
                    return;
                }
                if (num2.intValue() == 0 || num2.intValue() == 2) {
                    return;
                }
            }
            LIZ();
            C03N9 c03n94 = this.LJIIIIZZ;
            if (c03n94 == null) {
                return;
            }
            c03n94.LIZ(EnumC828303Ll.POLL_FAIL, strValueOf, pollOrderStatusResponseData.exceptionUX, this.LJIIJ, null);
            return;
        }
        LIZ();
        C03N9 c03n95 = this.LJIIIIZZ;
        if (c03n95 == null) {
            return;
        }
        c03n95.LIZ(EnumC828303Ll.POLL_FAIL, strValueOf, null, this.LJIIJ, null);
    }

    public final void LIZJ(C03WX c03wx) {
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        this.LIZIZ = c03wx;
        this.LIZ = new WorkHandler(this);
    }

    public final void LIZLLL(PollOrderStatusRequest pollOrderStatusRequest, Integer num, C03N9 c03n9, Boolean bool) {
        int iIntValue;
        this.LJI = pollOrderStatusRequest;
        this.LJIIIIZZ = c03n9;
        this.LJIIIZ = num;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            this.LJIIJ.LIZLLL = 1;
            C03N9 c03n92 = this.LJIIIIZZ;
            if (c03n92 != null) {
                c03n92.LIZ(EnumC828303Ll.POLL_SUCCESS, null, null, this.LJIIJ, null);
                return;
            }
            return;
        }
        LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJFF = jCurrentTimeMillis;
        this.LJIIJ.LIZIZ = Long.valueOf(jCurrentTimeMillis);
        this.LJIIJ.LIZ = Integer.valueOf(this.LJ);
        WorkHandler workHandler = this.LIZ;
        if (workHandler != null) {
            workHandler.sendEmptyMessage(100);
        }
        WorkHandler workHandler2 = this.LIZ;
        if (workHandler2 != null) {
            Integer num2 = (Integer) C7727030b.LIZ(this.LJ, this.LIZJ);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 3500;
            }
            workHandler2.sendEmptyMessageDelayed(200, iIntValue);
        }
    }
}
