package com.bytedance.globalpayment.iap.manager;

import X.AbstractC1794110wmv;
import X.C1792840wks;
import X.C1793070wlF;
import X.C1794070wmr;
import X.C1794080wms;
import X.C1794140wmy;
import X.C1794180wn2;
import X.C1794210wn5;
import X.C1794240wn8;
import X.C1794310wnF;
import X.C1794480wnW;
import X.C1794580wng;
import X.C1794830wo5;
import X.C1795210woh;
import X.C1795410wp1;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1791830wjF;
import X.EnumC1794260wnA;
import X.EnumC1794330wnH;
import X.InterfaceC1793900wma;
import X.InterfaceC1794150wmz;
import X.InterfaceC1794350wnJ;
import Y.ARunnableS31S1100000_27;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.manager.QueryOrderStateManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class QueryOrderStateManager {
    public InterfaceC1793900wma<C1794140wmy> LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final String LJIIJ;
    public final EnumC1791830wjF LJIIJJI;
    public final C1794480wnW LJIIL;
    public final C1794070wmr LJIILIIL = new InterfaceC1793900wma<ResponseEntity>() { // from class: X.0wmr
        @Override // X.InterfaceC1793900wma
        public final void LIZ(C1792220wjs c1792220wjs) {
            QueryOrderStateManager queryOrderStateManager = this.LIZ;
            int i = queryOrderStateManager.LIZIZ;
            if (i < queryOrderStateManager.LIZJ) {
                int i2 = i + 1;
                queryOrderStateManager.LIZIZ = i2;
                this.LIZ.LJIIIZ.sendEmptyMessageDelayed(1, queryOrderStateManager.LIZ(i2));
                QueryOrderStateManager queryOrderStateManager2 = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed due to API failed. Detail :");
                sbLIZ.append(c1792220wjs.LJ);
                queryOrderStateManager2.LIZIZ("livesdk_iap_check_receipt_fail_original", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            InterfaceC1793900wma<C1794140wmy> interfaceC1793900wma = queryOrderStateManager.LIZ;
            if (interfaceC1793900wma == null) {
                return;
            }
            interfaceC1793900wma.LIZ(c1792220wjs);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        @Override // X.InterfaceC1793900wma
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onSuccess(com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity r7) {
            /*
                r6 = this;
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity r7 = (com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity) r7
                com.bytedance.globalpayment.iap.manager.QueryOrderStateManager r2 = r6.LIZ
                X.0wma<X.0wmy> r4 = r2.LIZ
                if (r4 == 0) goto L56
                boolean r0 = r7 instanceof com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity
                if (r0 == 0) goto L57
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity r7 = (com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity) r7
                if (r7 == 0) goto L58
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity$Data r0 = r7.data
                if (r0 == 0) goto L58
                java.lang.String r0 = r0.status
                X.0wmw r5 = X.EnumC1794120wmw.from(r0)
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity$Data r0 = r7.data
                java.lang.String r0 = r0.orderId
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L2a
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity$Data r0 = r7.data
                java.lang.String r0 = r0.orderId
                r2.LJ = r0
            L2a:
                int[] r1 = X.C1794130wmx.LIZ
                int r0 = r5.ordinal()
                r3 = r1[r0]
                r1 = 1
                if (r3 == r1) goto L7e
                r0 = 2
                if (r3 == r0) goto L5b
                r0 = 3
                if (r3 == r0) goto L5b
                r0 = 4
                if (r3 == r0) goto L5b
                int r0 = r2.LIZIZ
                int r0 = r0 + 1
                r2.LIZIZ = r0
                long r3 = r2.LIZ(r0)
                com.bytedance.globalpayment.iap.manager.QueryOrderStateManager$WorkHandler r0 = r2.LJIIIZ
                r0.sendEmptyMessageDelayed(r1, r3)
                com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity$Data r0 = r7.data
                java.lang.String r1 = r0.status
                java.lang.String r0 = "livesdk_iap_check_receipt_fail_original"
                r2.LIZIZ(r0, r1)
            L56:
                return
            L57:
                r7 = 0
            L58:
                X.0wmw r5 = X.EnumC1794120wmw.Failed
                goto L2a
            L5b:
                X.0wks r3 = new X.0wks
                int r2 = r5.ordinal()
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "query order error because of the entity state, the state is "
                r1.append(r0)
                java.lang.String r0 = r5.name()
                r1.append(r0)
                java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                r0 = 204(0xcc, float:2.86E-43)
                r3.<init>(r0, r2, r1)
                r4.LIZ(r3)
                return
            L7e:
                X.0wmy r1 = new X.0wmy
                r1.<init>()
                java.lang.String r0 = r2.LJ
                r1.LIZ = r0
                r1.LIZIZ = r5
                int r0 = r2.LIZIZ
                r1.LIZJ = r0
                r4.onSuccess(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1794070wmr.onSuccess(java.lang.Object):void");
        }
    };
    public final WorkHandler LJIIIZ = new WorkHandler(this);

    public static class WorkHandler extends BPEAHandler {
        public final QueryOrderStateManager LL;

        public WorkHandler(QueryOrderStateManager queryOrderStateManager) {
            super(Looper.getMainLooper());
            this.LL = queryOrderStateManager;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String strLIZIZ;
            C1C7U.LIZ("QueryOrderStateManager$WorkHandler@1cd6.handleMessage");
            super.handleMessage(message);
            if (message.what == 1) {
                QueryOrderStateManager queryOrderStateManager = this.LL;
                if (queryOrderStateManager.LIZIZ >= queryOrderStateManager.LIZJ) {
                    InterfaceC1793900wma<C1794140wmy> interfaceC1793900wma = queryOrderStateManager.LIZ;
                    if (interfaceC1793900wma != null) {
                        interfaceC1793900wma.LIZ(new C1792840wks(204, 2041, "channel pay success, but query order state timeout because query order state retry count is to maxRetryCount."));
                    }
                } else {
                    queryOrderStateManager.LJIIIZ.removeMessages(1);
                    AbstractC1794110wmv abstractC1794110wmvLIZIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZIZ();
                    String str = queryOrderStateManager.LJ;
                    String str2 = queryOrderStateManager.LJFF;
                    String str3 = queryOrderStateManager.LJI;
                    String str4 = queryOrderStateManager.LIZLLL;
                    EnumC1791830wjF enumC1791830wjF = queryOrderStateManager.LJIIJJI;
                    String str5 = queryOrderStateManager.LJIIJ;
                    final C1794070wmr c1794070wmr = queryOrderStateManager.LJIILIIL;
                    abstractC1794110wmvLIZIZ.getClass();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZJ;
                    }
                    final C1794210wn5 c1794210wn5 = new C1794210wn5("query_order_state", str, str4);
                    c1794210wn5.LIZLLL();
                    StringBuilder sb = new StringBuilder(200);
                    if (!TextUtils.isEmpty(str5)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str5);
                        sbLIZ.append("/pipo/inner/order/query/v1");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(C1793070wlF.LIZ(str5));
                        sbLIZ2.append("/pipo/inner/order/query/v1");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    sb.append(strLIZIZ);
                    sb.append("?merchant_id=");
                    sb.append(str3);
                    sb.append("&request_id=");
                    sb.append(str);
                    if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
                        sb.append("&payment_method=GP&channel_order_id=");
                        sb.append(str2);
                    }
                    String string = sb.toString();
                    InterfaceC1794150wmz interfaceC1794150wmz = new InterfaceC1794150wmz() { // from class: X.0wmh
                        @Override // X.InterfaceC1794150wmz
                        public final void LIZ(C1792220wjs c1792220wjs) {
                            c1792220wjs.LIZ = 204;
                            C1792840wks c1792840wksLIZJ = C1792840wks.LIZJ(c1792220wjs);
                            c1794210wn5.LJ(false, c1792840wksLIZJ);
                            InterfaceC1793900wma interfaceC1793900wma2 = c1794070wmr;
                            if (interfaceC1793900wma2 != null) {
                                interfaceC1793900wma2.LIZ(c1792840wksLIZJ);
                            }
                        }

                        @Override // X.InterfaceC1794150wmz
                        public final void onResponse(String str6) {
                            String str7;
                            try {
                                OrderStateResponseEntity orderStateResponseEntity = (OrderStateResponseEntity) C1796800wrG.LIZ(OrderStateResponseEntity.class, str6);
                                if (orderStateResponseEntity != null) {
                                    if (orderStateResponseEntity.isSuccess()) {
                                        c1794210wn5.LJ(true, null);
                                        InterfaceC1793900wma interfaceC1793900wma2 = c1794070wmr;
                                        if (interfaceC1793900wma2 != null) {
                                            interfaceC1793900wma2.onSuccess(orderStateResponseEntity);
                                            return;
                                        }
                                        return;
                                    }
                                    str7 = orderStateResponseEntity.message;
                                } else {
                                    str7 = "";
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("OrderStateApiImpl: query order state service response failed:");
                                sbLIZ3.append(str7);
                                C1792840wks c1792840wks = new C1792840wks(204, 2021, C2188811AlT.LIZIZ(sbLIZ3));
                                c1794210wn5.LJ(false, c1792840wks);
                                InterfaceC1793900wma interfaceC1793900wma3 = c1794070wmr;
                                if (interfaceC1793900wma3 != null) {
                                    interfaceC1793900wma3.LIZ(c1792840wks);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("OrderStateApiImpl: query order state service response failed:");
                                sbLIZ4.append(th.getLocalizedMessage());
                                C1792840wks c1792840wks2 = new C1792840wks(204, 2021, C2188811AlT.LIZIZ(sbLIZ4));
                                c1794210wn5.LJ(false, c1792840wks2);
                                InterfaceC1793900wma interfaceC1793900wma4 = c1794070wmr;
                                if (interfaceC1793900wma4 != null) {
                                    interfaceC1793900wma4.LIZ(c1792840wks2);
                                }
                            }
                        }
                    };
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(string);
                    sbLIZ3.append("&pipo_sdk_version=");
                    sbLIZ3.append("1.0");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    String str6 = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZLLL;
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ2);
                        sbLIZ4.append("&device_id=");
                        sbLIZ4.append(str6);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJI().getClass();
                    ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZ.execute(new ARunnableS31S1100000_27(interfaceC1794150wmz, strLIZIZ2, 6));
                    queryOrderStateManager.LIZIZ("livesdk_iap_check_order_receipt", null);
                }
            }
            C1C7U.LIZIZ("QueryOrderStateManager$WorkHandler@1cd6.handleMessage");
        }
    }

    public final long LIZ(int i) {
        if (this.LJIIJJI == EnumC1791830wjF.AMAZON) {
            Math.min(Math.max(i * 2, 2), 32);
        }
        return ((long) (Math.min(Math.max(i, 1), 5) * LSPassThroughRecordSizeConfig.DEFAULT)) / 2;
    }

    public final void LIZJ(C1794080wms c1794080wms) {
        this.LIZ = c1794080wms;
        WorkHandler workHandler = this.LJIIIZ;
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        workHandler.sendEmptyMessageDelayed(1, C1795410wp1.LIZJ("iap_exp_2_optimize_query_order_delay_time", 0));
    }

    public final void LIZIZ(String str, String str2) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_id", this.LJ);
            jSONObject.put("merchant_id", this.LJI);
            jSONObject.put("product_id", this.LIZLLL);
            if (this.LJII) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_subscription", i);
            jSONObject.put("pay_type", this.LJIIIIZZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("retry_count", this.LIZIZ);
            EnumC1791830wjF enumC1791830wjF = this.LJIIJJI;
            if (enumC1791830wjF != null) {
                jSONObject2.put("payment_method", enumC1791830wjF.channelName);
            }
            if (str2 != null) {
                jSONObject2.put("result_message", str2);
            }
            jSONObject2.put("billing_country_code", C1794580wng.LIZ(this.LJIIL));
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject2, null, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wmr] */
    public QueryOrderStateManager(EnumC1791830wjF enumC1791830wjF, String str, String str2, String str3, String str4, int i, boolean z, EnumC1794260wnA enumC1794260wnA, String str5, C1794480wnW c1794480wnW) {
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LIZJ = i;
        this.LJII = z;
        this.LJIIIIZZ = enumC1794260wnA.getValue();
        this.LJIIJ = str5;
        this.LJIIJJI = enumC1791830wjF;
        this.LJIIL = c1794480wnW;
    }
}
