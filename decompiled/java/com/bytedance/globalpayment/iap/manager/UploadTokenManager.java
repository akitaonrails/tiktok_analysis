package com.bytedance.globalpayment.iap.manager;

import X.AbstractC1794110wmv;
import X.C1792840wks;
import X.C1793070wlF;
import X.C1794060wmq;
import X.C1794180wn2;
import X.C1794210wn5;
import X.C1794240wn8;
import X.C1795210woh;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1794260wnA;
import X.InterfaceC1793900wma;
import X.InterfaceC1794150wmz;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class UploadTokenManager {
    public final String LIZ;
    public final TokenInfo LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;
    public int LJ;
    public final String LJII;
    public final String LJIIIIZZ;
    public final EnumC1794260wnA LJIIIZ;
    public final String LJIIJ;
    public InterfaceC1793900wma<ResponseEntity> LJIIJJI;
    public final C1794060wmq LJIIL = new C1794060wmq(this);
    public final WorkHandler LJI = new WorkHandler(this);
    public final int LJFF = 8;

    public final void LIZ() {
        JSONObject json;
        String strLIZIZ;
        this.LJI.removeMessages(1);
        try {
            json = this.LIZIZ.toJson();
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            json = null;
        }
        AbstractC1794110wmv abstractC1794110wmvLIZIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZIZ();
        String str = this.LIZ;
        String str2 = this.LJII;
        String orderId = this.LIZIZ.getOrderId();
        String productId = this.LIZIZ.getProductId();
        final C1794060wmq c1794060wmq = this.LJIIL;
        String str3 = this.LJIIIIZZ;
        EnumC1794260wnA enumC1794260wnA = this.LJIIIZ;
        String str4 = this.LJIIJ;
        Map<String, String> map = this.LIZJ;
        abstractC1794110wmvLIZIZ.getClass();
        if (json == null) {
            if (c1794060wmq != null) {
                c1794060wmq.LIZ(new C1792840wks(201, 2012, "tokenJson is error in uploadToken"));
                return;
            }
            return;
        }
        try {
            HashMap map2 = new HashMap();
            map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
            if (TextUtils.isEmpty(str)) {
                str = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZJ;
                if (TextUtils.isEmpty(str)) {
                    c1794060wmq.LIZ(new C1792840wks(205, 2012, "upload token failed because merchantId is null!"));
                    return;
                }
            }
            map2.put("merchant_id", str);
            map2.put("biz_content", C786410Ut5.J3(json));
            map2.putAll(map);
            for (Map.Entry entry : map2.entrySet()) {
            }
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1793070wlF.LIZ(str2));
                sbLIZ.append("/pipo/inner/receipt/v1");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("/pipo/inner/receipt/v1");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (str3 != null && !str3.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("?payment_scenario=");
                sbLIZ3.append(str3);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                map2.put("payment_scenario", str3);
            }
            if (enumC1794260wnA == EnumC1794260wnA.EXTRA_TOKEN) {
                map2.put("client_flow", "restore_order");
            } else {
                map2.put("client_flow", str4);
            }
            final C1794210wn5 c1794210wn5 = new C1794210wn5("upload_token", orderId, productId);
            c1794210wn5.LIZLLL();
            AbstractC1794110wmv.LIZ(strLIZIZ, map2, new InterfaceC1794150wmz() { // from class: X.0wmg
                @Override // X.InterfaceC1794150wmz
                public final void LIZ(C1792220wjs c1792220wjs) {
                    c1792220wjs.LIZ = 205;
                    C1792840wks c1792840wksLIZJ = C1792840wks.LIZJ(c1792220wjs);
                    c1794210wn5.LJ(false, c1792840wksLIZJ);
                    InterfaceC1793900wma interfaceC1793900wma = c1794060wmq;
                    if (interfaceC1793900wma != null) {
                        interfaceC1793900wma.LIZ(c1792840wksLIZJ);
                    }
                }

                @Override // X.InterfaceC1794150wmz
                public final void onResponse(String str5) {
                    String str6;
                    try {
                        OrderStateResponseEntity orderStateResponseEntity = (OrderStateResponseEntity) C1796800wrG.LIZ(OrderStateResponseEntity.class, str5);
                        if (orderStateResponseEntity != null) {
                            if (orderStateResponseEntity.isSuccess()) {
                                c1794210wn5.LJ(true, null);
                                if (c1794060wmq != null) {
                                    JSONObject jSONObjectOptJSONObject = new JSONObject(str5).optJSONObject("data");
                                    if (jSONObjectOptJSONObject != null) {
                                        orderStateResponseEntity.setOrderIdByUploadTokenResult(jSONObjectOptJSONObject.optString("orderId"));
                                    }
                                    c1794060wmq.onSuccess(orderStateResponseEntity);
                                    return;
                                }
                                return;
                            }
                            str6 = orderStateResponseEntity.message;
                        } else {
                            str6 = "";
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("UploadTokenApiImpl: upload token service response failed, message is: ");
                        sbLIZ4.append(str6);
                        C1792840wks c1792840wks = new C1792840wks(205, 2021, C2188811AlT.LIZIZ(sbLIZ4));
                        c1794210wn5.LJ(false, c1792840wks);
                        InterfaceC1793900wma interfaceC1793900wma = c1794060wmq;
                        if (interfaceC1793900wma != null) {
                            interfaceC1793900wma.LIZ(c1792840wks);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("UploadTokenApiImpl: upload token service response failed, message is: ");
                        sbLIZ5.append(th.getLocalizedMessage());
                        C1792840wks c1792840wks2 = new C1792840wks(205, 2021, C2188811AlT.LIZIZ(sbLIZ5));
                        c1794210wn5.LJ(false, c1792840wks2);
                        InterfaceC1793900wma interfaceC1793900wma2 = c1794060wmq;
                        if (interfaceC1793900wma2 != null) {
                            interfaceC1793900wma2.LIZ(c1792840wks2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static class WorkHandler extends BPEAHandler {
        public final UploadTokenManager LL;

        public WorkHandler(UploadTokenManager uploadTokenManager) {
            super(Looper.getMainLooper());
            this.LL = uploadTokenManager;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("UploadTokenManager$WorkHandler@93c9.handleMessage");
            super.handleMessage(message);
            if (message.what == 1) {
                this.LL.LIZ();
            }
            C1C7U.LIZIZ("UploadTokenManager$WorkHandler@93c9.handleMessage");
        }
    }

    public UploadTokenManager(String str, String str2, TokenInfo tokenInfo, String str3, EnumC1794260wnA enumC1794260wnA, String str4, Map<String, String> map) {
        this.LIZJ = map;
        this.LIZ = str;
        this.LIZIZ = tokenInfo;
        this.LJII = str2;
        this.LIZLLL = str3;
        this.LJIIIZ = enumC1794260wnA;
        this.LJIIJ = str4;
    }

    public UploadTokenManager(String str, String str2, TokenInfo tokenInfo, String str3, String str4, EnumC1794260wnA enumC1794260wnA, String str5, Map<String, String> map) {
        this.LJIIIIZZ = str4;
        this.LIZJ = map;
        this.LIZ = str;
        this.LIZIZ = tokenInfo;
        this.LJII = str2;
        this.LIZLLL = str3;
        this.LJIIIZ = enumC1794260wnA;
        this.LJIIJ = str5;
    }
}
