package com.bytedance.globalpayment.iap.service.provider;

import X.AbstractC1791620wiu;
import X.AbstractC1792180wjo;
import X.AbstractC1794360wnK;
import X.AbstractC1794510wnZ;
import X.AbstractC1794600wni;
import X.C11NZ;
import X.C1787430wc9;
import X.C1791850wjH;
import X.C1792050wjb;
import X.C1792170wjn;
import X.C1792220wjs;
import X.C1792230wjt;
import X.C1792240wju;
import X.C1792320wk2;
import X.C1792470wkH;
import X.C1792550wkP;
import X.C1792840wks;
import X.C1793950wmf;
import X.C1794020wmm;
import X.C1794180wn2;
import X.C1794240wn8;
import X.C1794310wnF;
import X.C1794370wnL;
import X.C1794420wnQ;
import X.C1794470wnV;
import X.C1794480wnW;
import X.C1794520wna;
import X.C1794580wng;
import X.C1794610wnj;
import X.C1794630wnl;
import X.C1794640wnm;
import X.C1794650wnn;
import X.C1794830wo5;
import X.C1794920woE;
import X.C1794930woF;
import X.C1794950woH;
import X.C1794960woI;
import X.C1795000woM;
import X.C1795210woh;
import X.C1795410wp1;
import X.C1796060wq4;
import X.C1864900yd6;
import X.EnumC1791830wjF;
import X.EnumC1792040wja;
import X.EnumC1794260wnA;
import X.EnumC1794330wnH;
import X.EnumC1794620wnk;
import X.InterfaceC1487280oo2;
import X.InterfaceC1787390wc5;
import X.InterfaceC1791550win;
import X.InterfaceC1791680wj0;
import X.InterfaceC1792440wkE;
import X.InterfaceC1792450wkF;
import X.InterfaceC1792890wkx;
import X.InterfaceC1794350wnJ;
import X.InterfaceC1794400wnO;
import X.InterfaceC1794440wnS;
import X.InterfaceC1794730wnv;
import X.InterfaceC1794840wo6;
import X.InterfaceC1795130woZ;
import X.InterfaceC1795140woa;
import X.InterfaceC1795150wob;
import X.InterfaceC1795160woc;
import X.InterfaceC1796280wqQ;
import Y.ARunnableS96S0200000_27;
import Y.AfS196S0100000_27;
import Y.AkS488S0100000_27;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.manager.QueryOrderStateManager;
import com.bytedance.globalpayment.iap.manager.UploadTokenManager;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import com.bytedance.globalpayment.iap.state.BaseQueryOrderState;
import com.bytedance.globalpayment.iap.state.extra.ExtraConsumeState;
import com.bytedance.globalpayment.iap.state.nomal.ConsumeProductState;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class IapServiceProvider extends AbstractC1794510wnZ implements IapExternalService, InterfaceC1794840wo6, InterfaceC1794400wnO {
    public final InterfaceC1794840wo6 mOnResumeQueryUnAckEdOrderListener = new InterfaceC1794840wo6() { // from class: X.0woD
        @Override // X.InterfaceC1794840wo6
        public final void onQueryFinished(EnumC1791830wjF enumC1791830wjF, C1792220wjs c1792220wjs, List list, String str) {
            IapServiceProvider.lambda$new$0(enumC1791830wjF, c1792220wjs, list, str);
        }
    };
    public InterfaceC1794840wo6 mQueryUnAckEdOrderListener = new InterfaceC1794840wo6() { // from class: X.0wnd
        @Override // X.InterfaceC1794840wo6
        public final void onQueryFinished(EnumC1791830wjF enumC1791830wjF, C1792220wjs c1792220wjs, List<AbstractC1794600wni> list, String str) {
            if (c1792220wjs == null || list == null || c1792220wjs.LIZ != 0 || list.isEmpty()) {
                return;
            }
            if (enumC1791830wjF == EnumC1791830wjF.GOOGLE && PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().isEnableRestoreOrder()) {
                return;
            }
            for (AbstractC1794600wni abstractC1794600wni : list) {
                if (abstractC1794600wni.LJIIJJI()) {
                    String str2 = abstractC1794600wni.LJFF;
                    String strLIZJ = abstractC1794600wni.LIZJ();
                    if ((enumC1791830wjF == EnumC1791830wjF.GOOGLE && (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(strLIZJ))) || enumC1791830wjF == EnumC1791830wjF.AMAZON) {
                        this.LIZ.executeUnUploadTokenOrder(enumC1791830wjF, abstractC1794600wni, str);
                    }
                }
            }
        }
    };

    @Override // X.AbstractC1794510wnZ
    public InterfaceC1794400wnO getIapInternalService() {
        return this;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public String getBillingCountryCode() {
        return (this.mInitEd.get() && ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJ) ? PaymentServiceManager.get().getGoogleIapExternalService().getBillingCountryCode() : "";
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return this.mInitEd.get();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
        if (this.mInitEd.getAndSet(true)) {
            ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIZ(EnumC1791830wjF.GOOGLE, new C1792840wks(401, 4011, "init failed because repeated init"));
            ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIZ(EnumC1791830wjF.AMAZON, new C1792840wks(401, 4011, "init failed because repeated init"));
            return;
        }
        if (((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJ) {
            PaymentServiceManager.get().getGoogleIapExternalService().setGpListener(this);
            PaymentServiceManager.get().getGoogleIapExternalService().init(new InterfaceC1796280wqQ() { // from class: X.0wnb
                @Override // X.InterfaceC1796280wqQ
                public final void LIZ(String str) {
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIIZZ(EnumC1791830wjF.GOOGLE, str);
                }

                @Override // X.InterfaceC1796280wqQ
                public final void LIZIZ(C1792840wks c1792840wks) {
                    if (c1792840wks.LIZ == 0) {
                        InterfaceC1794460wnU interfaceC1794460wnULIZJ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ();
                        EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
                        ((C1794640wnm) interfaceC1794460wnULIZJ).LJIIIZ(enumC1791830wjF, new C1792840wks(0, 0, "init success"));
                        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
                        if (C1795410wp1.LIZJ("iap_exp_optimize_billing_init", 1) != 1) {
                            this.LIZ.tryRestoreUnAckOrder(enumC1791830wjF, "query_restore-iap_sdk_init_google");
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("google response code is: ");
                    sbLIZ.append(c1792840wks.LIZ);
                    sbLIZ.append(" message is : ");
                    sbLIZ.append(c1792840wks.LJ);
                    C1792840wks c1792840wks2 = new C1792840wks(401, 4012, C2188811AlT.LIZIZ(sbLIZ));
                    C1792900wky.LIZ(c1792840wks2);
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIZ(EnumC1791830wjF.GOOGLE, c1792840wks2);
                }
            });
        }
        if (((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJFF) {
            PaymentServiceManager.get().getAmazonIapExternalService().init(new InterfaceC1796280wqQ() { // from class: X.0wnf
                @Override // X.InterfaceC1796280wqQ
                public final void LIZ(String str) {
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIIZZ(EnumC1791830wjF.AMAZON, str);
                }

                @Override // X.InterfaceC1796280wqQ
                public final void LIZIZ(C1792840wks c1792840wks) {
                    if (c1792840wks.LIZ == 0) {
                        InterfaceC1794460wnU interfaceC1794460wnULIZJ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ();
                        EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.AMAZON;
                        ((C1794640wnm) interfaceC1794460wnULIZJ).LJIIIZ(enumC1791830wjF, new C1792840wks(0, 0, "init success"));
                        this.LIZ.tryRestoreUnAckOrder(enumC1791830wjF, "query_restore-iap_sdk_init_amazon");
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("amazon response code is: ");
                    sbLIZ.append(c1792840wks.LIZ);
                    sbLIZ.append(" message is : ");
                    sbLIZ.append(c1792840wks.LJ);
                    C1792840wks c1792840wks2 = new C1792840wks(401, 4012, C2188811AlT.LIZIZ(sbLIZ));
                    C1792900wky.LIZ(c1792840wks2);
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIIZ(EnumC1791830wjF.AMAZON, c1792840wks2);
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
        if (this.mInitEd.get()) {
            if (((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJ) {
                ((C1794180wn2) C1794180wn2.LIZJ()).LIZ().getClass();
                PaymentServiceManager.get().getGoogleIapExternalService().loadBillingConfig();
            }
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
            if (C1795410wp1.LIZJ("iap_exp_optimize_restore_2", 0) == 1) {
                return;
            }
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
            if (C1795410wp1.LIZJ("iap_exp_optimize_billing_init", 1) == 1 || !((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJ) {
                return;
            }
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LJ(EnumC1791830wjF.GOOGLE, this.mOnResumeQueryUnAckEdOrderListener, "query_restore-on_resume");
        }
    }

    private String getBillingCountryCode(EnumC1791830wjF enumC1791830wjF) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().getBillingCountryCode();
        }
        return "";
    }

    private void monitorInitFailure(C1792840wks c1792840wks) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result_code", c1792840wks.LIZ);
            jSONObject.put("result_detail_code", c1792840wks.LIZIZ);
            jSONObject.put("result_message", c1792840wks.LJ);
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_finish_order_failed", jSONObject, null, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(InterfaceC1794730wnv interfaceC1794730wnv) {
        C1794640wnm c1794640wnm = (C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ();
        InterfaceC1794730wnv interfaceC1794730wnv2 = c1794640wnm.LIZ;
        if (interfaceC1794730wnv != interfaceC1794730wnv2) {
            if (interfaceC1794730wnv2 == null) {
                c1794640wnm.LIZ = interfaceC1794730wnv;
                return;
            }
            if (c1794640wnm.LIZIZ == null) {
                Set<InterfaceC1794730wnv> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                c1794640wnm.LIZIZ = setNewSetFromMap;
                setNewSetFromMap.add(c1794640wnm.LIZ);
            }
            c1794640wnm.LIZIZ.add(interfaceC1794730wnv);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC1794360wnK getNextState(AbstractC1794360wnK abstractC1794360wnK) {
        EnumC1794620wnk enumC1794620wnkLIZJ = abstractC1794360wnK.LIZJ();
        InterfaceC1794730wnv interfaceC1794730wnv = abstractC1794360wnK.LIZJ;
        switch (C1794610wnj.LIZ[enumC1794620wnkLIZJ.ordinal()]) {
            case 1:
                C1794480wnW c1794480wnW = abstractC1794360wnK.LIZ;
                ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
                EnumC1791830wjF enumC1791830wjF = c1794480wnW.LJJ;
                getIapInternalService();
                AbstractC1794360wnK abstractC1794360wnKLIZIZ = C1794520wna.LIZIZ(enumC1791830wjF, this, this.mActivity.get());
                abstractC1794360wnKLIZIZ.LIZJ = interfaceC1794730wnv;
                return abstractC1794360wnKLIZIZ;
            case 2:
            case 3:
                interfaceC1794730wnv.LIZLLL(abstractC1794360wnK.LIZ.LJIJJ);
                getIapInternalService();
                AbstractC1794360wnK abstractC1794360wnK2 = new AbstractC1794360wnK(this) { // from class: X.0wnX
                    @Override // X.AbstractC1794360wnK
                    public final EnumC1794620wnk LIZJ() {
                        return EnumC1794620wnk.UploadToken;
                    }

                    @Override // X.AbstractC1794360wnK
                    public final void LIZ(C1794480wnW c1794480wnW2) {
                        this.LIZ = c1794480wnW2;
                        c1794480wnW2.getClass();
                        if (c1794480wnW2.LJIJJ) {
                            if (!c1794480wnW2.LJIL || !c1794480wnW2.LJIJJLI) {
                                PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(c1794480wnW2.LJJ, c1794480wnW2.LJIIJ, "no_query_restore-gp_cb_late_after_order_is_finished");
                                return;
                            }
                            return;
                        }
                        C1792170wjn c1792170wjn = c1794480wnW2.LIZ;
                        TokenInfo tokenInfo = new TokenInfo();
                        tokenInfo.setOrderId(c1794480wnW2.LIZLLL());
                        tokenInfo.setProductId(c1794480wnW2.LIZJ);
                        tokenInfo.setUserId(c1794480wnW2.LIZLLL);
                        tokenInfo.setChannelUserId(c1794480wnW2.LJJI);
                        tokenInfo.setPaymentMethod(c1794480wnW2.LJJ.channelName);
                        tokenInfo.setSubscription(c1792170wjn.LJII);
                        AbstractC1794600wni abstractC1794600wni = c1794480wnW2.LJIIJ;
                        if (abstractC1794600wni != null) {
                            tokenInfo.setToken(abstractC1794600wni.LJII());
                            tokenInfo.setChannelOrderId(abstractC1794600wni.LJFF);
                        }
                        AbstractC1791620wiu abstractC1791620wiu = c1794480wnW2.LJIIJJI;
                        if (abstractC1791620wiu != null) {
                            tokenInfo.setAmountValue(String.valueOf(abstractC1791620wiu.LIZIZ() / 1000000.0d));
                            tokenInfo.setCurrency(abstractC1791620wiu.LIZJ());
                        }
                        C1794010wml c1794010wml = new C1794010wml(c1794480wnW2, c1794480wnW2.LJIILIIL, c1794480wnW2.LIZJ, c1794480wnW2.LIZLLL(), tokenInfo.isSubscription());
                        c1794010wml.LIZLLL();
                        UploadTokenManager uploadTokenManager = new UploadTokenManager(c1792170wjn.LIZIZ, c1794480wnW2.LJFF, tokenInfo, c1794480wnW2.LJ(), c1794480wnW2.LJII, c1794480wnW2.LJIILIIL, c1792170wjn.LJIILIIL, C1794580wng.LIZIZ(c1794480wnW2));
                        uploadTokenManager.LJIIJJI = new InterfaceC1793900wma<ResponseEntity>(c1794010wml) { // from class: X.0wmp
                            public final C1794010wml LIZ;

                            @Override // X.InterfaceC1793900wma
                            public final void LIZ(C1792220wjs c1792220wjs) {
                                if (c1792220wjs instanceof C1792840wks) {
                                    C1792840wks c1792840wks = (C1792840wks) c1792220wjs;
                                    this.LIZ.LJ(false, c1792840wks, false, null, -1);
                                    LIZIZ(c1792840wks);
                                }
                            }

                            @Override // X.InterfaceC1793900wma
                            public final void onSuccess(ResponseEntity responseEntity) {
                                String string;
                                OrderStateResponseEntity.Data data;
                                String str;
                                boolean z;
                                ResponseEntity responseEntity2 = responseEntity;
                                int retryCount = 0;
                                if ((responseEntity2 instanceof OrderStateResponseEntity) && (data = ((OrderStateResponseEntity) responseEntity2).data) != null && (str = data.status) != null) {
                                    EnumC1794120wmw enumC1794120wmwFrom = EnumC1794120wmw.from(str);
                                    string = enumC1794120wmwFrom.toString();
                                    C1794480wnW c1794480wnW3 = this.LIZIZ.LIZ;
                                    if (enumC1794120wmwFrom == EnumC1794120wmw.Success) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c1794480wnW3.LJIL = z;
                                } else {
                                    string = null;
                                }
                                if (responseEntity2 != null) {
                                    retryCount = responseEntity2.getRetryCount();
                                }
                                this.LIZ.LJ(true, null, false, string, retryCount);
                                C1794490wnX c1794490wnX = this.LIZIZ;
                                c1794490wnX.getClass();
                                AbstractC1794360wnK nextState = PaymentServiceManager.get().getIapExternalService().getNextState(c1794490wnX);
                                if (nextState != null) {
                                    nextState.LIZ(c1794490wnX.LIZ);
                                }
                            }

                            {
                                this.LIZ = c1794010wml;
                            }
                        };
                        uploadTokenManager.LIZ();
                    }
                };
                abstractC1794360wnK2.LIZJ = interfaceC1794730wnv;
                return abstractC1794360wnK2;
            case 4:
                getIapInternalService();
                BaseQueryOrderState baseQueryOrderState = new BaseQueryOrderState(this) { // from class: X.0wmu
                    @Override // X.AbstractC1794360wnK
                    public final EnumC1794620wnk LIZJ() {
                        return EnumC1794620wnk.QueryOrder;
                    }

                    @Override // X.AbstractC1794360wnK
                    public final void LIZ(C1794480wnW c1794480wnW2) {
                        this.LIZ = c1794480wnW2;
                        c1794480wnW2.getClass();
                        if (c1794480wnW2.LJIJJ) {
                            return;
                        }
                        if (c1794480wnW2.LJIL) {
                            LIZLLL();
                            LIZIZ(new C1792840wks(0, 0, "pay success in QueryOrderState.execute"));
                            return;
                        }
                        String strLIZLLL = c1794480wnW2.LIZLLL();
                        C1792170wjn c1792170wjn = c1794480wnW2.LIZ;
                        String str = c1794480wnW2.LIZJ;
                        String str2 = c1792170wjn.LIZIZ;
                        EnumC1791830wjF enumC1791830wjF2 = c1794480wnW2.LJJ;
                        AbstractC1794600wni abstractC1794600wni = c1794480wnW2.LJIIJ;
                        this.LJ = new QueryOrderStateManager(enumC1791830wjF2, str, strLIZLLL, abstractC1794600wni.LJFF, str2, 8, abstractC1794600wni.LJ, EnumC1794260wnA.NOMAL, c1794480wnW2.LJFF, c1794480wnW2);
                        C1794000wmk c1794000wmk = new C1794000wmk(c1794480wnW2, c1794480wnW2.LJIILIIL, str, strLIZLLL, c1794480wnW2.LIZ.LJII);
                        c1794000wmk.LIZLLL();
                        this.LJ.LIZJ(new C1794080wms(this, c1794000wmk, this.LJFF));
                    }
                };
                baseQueryOrderState.LIZJ = interfaceC1794730wnv;
                return baseQueryOrderState;
            case 5:
                getIapInternalService();
                ConsumeProductState consumeProductState = new ConsumeProductState(this);
                consumeProductState.LIZJ = interfaceC1794730wnv;
                return consumeProductState;
            case 6:
                getIapInternalService();
                BaseQueryOrderState baseQueryOrderState2 = new BaseQueryOrderState(this) { // from class: X.0wmt
                    @Override // X.AbstractC1794360wnK
                    public final EnumC1794620wnk LIZJ() {
                        return EnumC1794620wnk.ExtraQueryOrder;
                    }

                    {
                        this.LIZLLL = 8;
                    }

                    @Override // X.AbstractC1794360wnK
                    public final void LIZ(C1794480wnW c1794480wnW2) {
                        this.LIZ = c1794480wnW2;
                        c1794480wnW2.getClass();
                        if (c1794480wnW2.LJIJJ) {
                            return;
                        }
                        if (c1794480wnW2.LJIL) {
                            LIZLLL();
                            LIZIZ(new C1792840wks(0, 0, "pay success in QueryOrderState.execute"));
                            return;
                        }
                        String str = c1794480wnW2.LJFF;
                        if (TextUtils.isEmpty(str)) {
                            str = "https://webcast.tiktokv.com";
                        }
                        String strLIZLLL = c1794480wnW2.LIZLLL();
                        String str2 = c1794480wnW2.LJIIJ.LJFF;
                        C1792170wjn c1792170wjn = c1794480wnW2.LIZ;
                        String str3 = c1794480wnW2.LIZJ;
                        String str4 = c1792170wjn.LIZIZ;
                        EnumC1791830wjF enumC1791830wjF2 = c1794480wnW2.LJJ;
                        int i = this.LIZLLL;
                        boolean z = c1792170wjn.LJII;
                        C1794480wnW c1794480wnW3 = this.LIZ;
                        this.LJ = new QueryOrderStateManager(enumC1791830wjF2, str3, strLIZLLL, str2, str4, i, z, c1794480wnW3.LJIILIIL, str, c1794480wnW3);
                        C1794000wmk c1794000wmk = new C1794000wmk(c1794480wnW2, c1794480wnW2.LJIILIIL, str3, strLIZLLL, c1794480wnW2.LIZ.LJII);
                        c1794000wmk.LIZLLL();
                        this.LJ.LIZJ(new C1794080wms(this, c1794000wmk, this.LJFF));
                    }
                };
                baseQueryOrderState2.LIZJ = interfaceC1794730wnv;
                return baseQueryOrderState2;
            case 7:
                getIapInternalService();
                ExtraConsumeState extraConsumeState = new ExtraConsumeState(this);
                extraConsumeState.LIZJ = interfaceC1794730wnv;
                return extraConsumeState;
            default:
                return null;
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(EnumC1791830wjF enumC1791830wjF) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().isSupportGooglePay();
        }
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().isSupportAmazonPay();
        }
        return false;
    }

    @Override // X.InterfaceC1794400wnO
    public void onIapOrderFinished(C1794480wnW c1794480wnW) {
        if (c1794480wnW.LJIJJ) {
            this.mPayingRequests.remove(c1794480wnW);
            String str = c1794480wnW.LJJIII;
            if (str != null && !str.isEmpty()) {
                InterfaceC1787390wc5 interfaceC1787390wc5 = C1787430wc9.LIZ;
                C1787430wc9.LIZJ.remove(str);
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(C1793950wmf c1793950wmf) {
        C1794640wnm c1794640wnm = (C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ();
        c1794640wnm.getClass();
        if (C1794640wnm.LJII()) {
            c1794640wnm.LIZLLL(c1793950wmf);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS96S0200000_27(c1794640wnm, c1793950wmf, 26));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(InterfaceC1794730wnv interfaceC1794730wnv) {
        C1794640wnm c1794640wnm = (C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ();
        Set<InterfaceC1794730wnv> set = c1794640wnm.LIZIZ;
        if (set != null) {
            set.remove(interfaceC1794730wnv);
            if (c1794640wnm.LIZIZ.size() == 0) {
                c1794640wnm.LIZIZ = null;
            }
        }
        if (interfaceC1794730wnv == c1794640wnm.LIZ) {
            c1794640wnm.LIZ = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0wof] */
    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
        InterfaceC1794440wnS interfaceC1794440wnSLIZLLL = C1794630wnl.LIZLLL();
        if (C1794630wnl.LJFF == null) {
            synchronized (interfaceC1794440wnSLIZLLL) {
                try {
                    if (C1794630wnl.LJFF == null) {
                        C1794630wnl.LJFF = new Object() { // from class: X.0wof
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            interfaceC1794440wnSLIZLLL.getClass();
        }
        C1794630wnl.LJFF.getClass();
        ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJI = str;
    }

    public void addExternalGetProductErrorCodes(C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        int size;
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
        if (C1795410wp1.LJFF()) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (c1792840wks.LIZIZ == 0 && size == 0) {
                c1792840wks.LJIIIIZZ = new C1791850wjH(EnumC1792040wja.PRODUCT_NOT_AVAILABLE);
            } else {
                C1792050wjb.LIZ(c1792840wks);
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void checkExternalLinkEligibility(EnumC1791830wjF enumC1791830wjF, final InterfaceC1795130woZ interfaceC1795130woZ) throws JSONException {
        if (!this.mInitEd.get()) {
            interfaceC1795130woZ.LIZ(new C1792840wks(401, -1, "failure due to not billing sdk not init"));
            return;
        }
        final C1794950woH c1794950woH = new C1794950woH(getBillingCountryCode(enumC1791830wjF));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794950woH.LIZLLL);
        c1794950woH.LIZLLL(jSONObject);
        InterfaceC1792450wkF interfaceC1792450wkFLIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        InterfaceC1795130woZ interfaceC1795130woZ2 = new InterfaceC1795130woZ() { // from class: X.0wo9
            @Override // X.InterfaceC1795130woZ
            public final void LIZ(C1792840wks c1792840wks) {
                IapServiceProvider.lambda$checkExternalLinkEligibility$1(c1794950woH, interfaceC1795130woZ, c1792840wks);
            }
        };
        interfaceC1792450wkFLIZ.getClass();
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().checkExternalLinkEligibility(interfaceC1795130woZ2);
        } else {
            interfaceC1795130woZ2.LIZ(new C1792840wks(401, -1, "check external link eligible not support amazon!"));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getExternalLinkToken(EnumC1791830wjF enumC1791830wjF, final InterfaceC1795140woa interfaceC1795140woa) throws JSONException {
        if (!this.mInitEd.get()) {
            interfaceC1795140woa.LIZ(new C1794920woE(402, "failure due to not billing sdk not init", null, -1));
            return;
        }
        final C1794960woI c1794960woI = new C1794960woI(getBillingCountryCode(enumC1791830wjF));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794960woI.LIZLLL);
        c1794960woI.LIZLLL(jSONObject);
        InterfaceC1792450wkF interfaceC1792450wkFLIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        InterfaceC1795140woa interfaceC1795140woa2 = new InterfaceC1795140woa() { // from class: X.0woB
            @Override // X.InterfaceC1795140woa
            public final void LIZ(C1794920woE c1794920woE) {
                IapServiceProvider.lambda$getExternalLinkToken$2(c1794960woI, interfaceC1795140woa, c1794920woE);
            }
        };
        interfaceC1792450wkFLIZ.getClass();
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().getExternalLinkToken(interfaceC1795140woa2);
        } else {
            interfaceC1795140woa2.LIZ(new C1794920woE(402, "get external link token not support amazon!"));
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(EnumC1791830wjF enumC1791830wjF, InterfaceC1794730wnv interfaceC1794730wnv) {
        if (this.mInitEd.get()) {
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LIZJ(enumC1791830wjF, interfaceC1794730wnv);
        } else {
            ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJFF(new C1792840wks(301, -1, "failure due to not billing sdk not init"), interfaceC1794730wnv, enumC1791830wjF, null);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void subscriptionPreCheck(C1792240wju c1792240wju, InterfaceC1791550win interfaceC1791550win) throws JSONException {
        getIapInternalService();
        C1792320wk2 c1792320wk2 = new C1792320wk2(c1792240wju, interfaceC1791550win, this);
        C1792230wjt c1792230wjt = c1792320wk2.LJII;
        c1792230wjt.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("merchant_id", c1792230wjt.LIZLLL.LIZIZ);
        jSONObject.put("sub_merchant_id", c1792230wjt.LIZLLL.LIZJ);
        c1792230wjt.LIZLLL(jSONObject);
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        C1794520wna.LIZJ(EnumC1791830wjF.GOOGLE, c1792320wk2.LJIIIIZZ);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void triggerInAppMessages(Activity activity, String str) {
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ().getClass();
        PaymentServiceManager.get().getGoogleIapExternalService().triggerInAppMessages(activity, str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(EnumC1791830wjF enumC1791830wjF, String str) {
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
        }
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LJ(enumC1791830wjF, this.mQueryUnAckEdOrderListener, str);
        }
    }

    public static void lambda$checkExternalLinkEligibility$1(C1794950woH c1794950woH, InterfaceC1795130woZ interfaceC1795130woZ, C1792840wks c1792840wks) throws JSONException {
        c1794950woH.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794950woH.LIZLLL);
        if (c1792840wks.LIZIZ()) {
            c1794950woH.LJ(jSONObject);
        } else {
            c1794950woH.LIZJ(c1792840wks, jSONObject);
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        if (C1795410wp1.LIZJ("iap_force_check_external_link_eligibility_success", 0) == 1) {
            interfaceC1795130woZ.LIZ(new C1792840wks(0, -1, "Mock success"));
        } else {
            interfaceC1795130woZ.LIZ(c1792840wks);
        }
    }

    public static void lambda$getExternalLinkToken$2(C1794960woI c1794960woI, InterfaceC1795140woa interfaceC1795140woa, C1794920woE c1794920woE) throws JSONException {
        c1794960woI.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794960woI.LIZLLL);
        jSONObject.put("transaction_token", c1794920woE.LJIILIIL);
        if (c1794920woE.LIZIZ()) {
            c1794960woI.LJ(jSONObject);
        } else {
            c1794960woI.LIZJ(c1794920woE, jSONObject);
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        if (C1795410wp1.LIZJ("iap_force_get_external_link_token_success", 0) == 1) {
            interfaceC1795140woa.LIZ(new C1794920woE(0, "Mock success", ""));
        } else {
            interfaceC1795140woa.LIZ(c1794920woE);
        }
    }

    public static void lambda$launchExternalLink$3(C1794930woF c1794930woF, InterfaceC1795150wob interfaceC1795150wob, C1794920woE c1794920woE) throws JSONException {
        c1794930woF.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794930woF.LIZLLL);
        jSONObject.put("launch_uri", c1794930woF.LJ.LIZ);
        jSONObject.put("transaction_token", c1794930woF.LJ.LIZIZ);
        if (c1794920woE.LIZIZ()) {
            c1794930woF.LJ(jSONObject);
        } else {
            c1794930woF.LIZJ(c1794920woE, jSONObject);
        }
        interfaceC1795150wob.LIZ(c1794920woE);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void checkPaymentEnvironment(EnumC1791830wjF enumC1791830wjF, InterfaceC1795160woc interfaceC1795160woc, Context context) {
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ().getClass();
        if (enumC1791830wjF == EnumC1791830wjF.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().checkPaymentEnvironment(interfaceC1795160woc);
        } else {
            PaymentServiceManager.get().getGoogleIapExternalService().checkPaymentEnvironment(interfaceC1795160woc, context);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(final EnumC1791830wjF enumC1791830wjF, final AbstractC1794600wni abstractC1794600wni, final String str) {
        if (!this.mInitEd.get()) {
            return;
        }
        final String str2 = abstractC1794600wni.LIZJ;
        String strLJIIIZ = abstractC1794600wni.LJIIIZ();
        for (Object obj : this.mPayingRequests.toArray()) {
            if (TextUtils.equals(((C1794480wnW) obj).LJ(), strLJIIIZ)) {
                return;
            }
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        C1794520wna.LIZLLL(enumC1791830wjF, arrayList, abstractC1794600wni.LJ, new InterfaceC1792890wkx<AbstractC1791620wiu>() { // from class: X.0wnh
            @Override // X.InterfaceC1792890wkx
            public final void LIZ(C1792840wks c1792840wks, List list) {
                if (c1792840wks.LIZ != 0) {
                    IapServiceProvider iapServiceProvider = this.LJFF;
                    EnumC1791830wjF enumC1791830wjF2 = enumC1791830wjF;
                    AbstractC1794600wni abstractC1794600wni2 = abstractC1794600wni;
                    iapServiceProvider.restoreOrderByUploadToken(enumC1791830wjF2, abstractC1794600wni2, null, abstractC1794600wni2.LJ, str);
                    C1792900wky.LIZIZ(false, arrayList, enumC1791830wjF, c1792840wks, list);
                    return;
                }
                ArrayList<AbstractC1791620wiu> arrayList2 = (ArrayList) list;
                for (AbstractC1791620wiu abstractC1791620wiu : arrayList2) {
                    if (abstractC1791620wiu.LIZ.equals(str2)) {
                        IapServiceProvider iapServiceProvider2 = this.LJFF;
                        EnumC1791830wjF enumC1791830wjF3 = enumC1791830wjF;
                        AbstractC1794600wni abstractC1794600wni3 = abstractC1794600wni;
                        iapServiceProvider2.restoreOrderByUploadToken(enumC1791830wjF3, abstractC1794600wni3, abstractC1791620wiu, abstractC1794600wni3.LJ, str);
                    }
                }
                C1792900wky.LIZIZ(true, arrayList, enumC1791830wjF, c1792840wks, arrayList2);
            }
        });
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C1792170wjn c1792170wjn, InterfaceC1794730wnv interfaceC1794730wnv) {
        if (this.mInitEd.get()) {
            this.mActivity = new WeakReference<>(activity);
            if (c1792170wjn == null) {
                C1792840wks c1792840wks = new C1792840wks(201, 2011, "PipoPayManger.executeNewPay:pipoRequest is null.");
                c1792840wks.LJIIJJI = c1792170wjn;
                c1792840wks.LJIIL = EnumC1794260wnA.NOMAL;
                ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJ(c1792840wks, interfaceC1794730wnv, null);
                ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJ(c1792840wks, null);
                return;
            }
            EnumC1794260wnA enumC1794260wnA = EnumC1794260wnA.NOMAL;
            C1794480wnW c1794480wnW = new C1794480wnW(c1792170wjn, enumC1794260wnA);
            C1794370wnL c1794370wnL = new C1794370wnL(c1794480wnW.LIZJ, c1794480wnW.LIZLLL(), c1792170wjn.LJII, enumC1794260wnA, c1794480wnW, C1794580wng.LIZ(c1794480wnW));
            c1794480wnW.LJIIL = c1794370wnL;
            c1794370wnL.LJ();
            String strLIZLLL = c1794480wnW.LIZLLL();
            if (strLIZLLL != null) {
                C1794020wmm.LIZ = strLIZLLL;
                C1794020wmm.LIZLLL = 0L;
                C1794020wmm.LJ = 0L;
                C1794020wmm.LJFF = 0L;
            }
            InterfaceC1792440wkE interfaceC1792440wkELIZJ = C1794180wn2.LIZJ();
            if (C1794180wn2.LIZIZ == null) {
                synchronized (interfaceC1792440wkELIZJ) {
                    try {
                        if (C1794180wn2.LIZIZ == null) {
                            C1794180wn2.LIZIZ = new C1794420wnQ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                interfaceC1792440wkELIZJ.getClass();
            }
            C1794180wn2.LIZIZ.getClass();
            ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3("pipo_pay_start", C1794470wnV.LIZLLL(c1794480wnW));
            EnumC1791830wjF enumC1791830wjF = c1794480wnW.LJJ;
            executeNewPayInternal(c1794480wnW, interfaceC1794730wnv);
            tryRestoreUnAckOrder(enumC1791830wjF, "query_restore-new_pay");
            return;
        }
        C1792840wks c1792840wks2 = new C1792840wks(301, 203, "failure due to not billing sdk not init");
        c1792840wks2.LJIIL = EnumC1794260wnA.NOMAL;
        ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJ(c1792840wks2, interfaceC1794730wnv, null);
        monitorInitFailure(c1792840wks2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0wjo, X.0wkM] */
    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryCommonProductDetails(List<String> list, String str, InterfaceC1791680wj0 interfaceC1791680wj0) throws JSONException {
        ?? r3 = new AbstractC1792180wjo() { // from class: X.0wkM
            public final String LIZLLL = "livesdk_iap_get_common_sku";

            @Override // X.AbstractC1792180wjo
            public final String LIZ() {
                return this.LIZLLL;
            }
        };
        C1792470wkH c1792470wkH = new C1792470wkH(list, str, interfaceC1791680wj0, r3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("merchant_id", str);
        jSONObject.put("sku_id", list.toString());
        r3.LIZLLL(jSONObject);
        C11NZ.LJIJJLI(new C1864900yd6(new C1792550wkP(), 1)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0TJr
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((AbstractC1794600wni) it2.next()).LIZJ);
                }
                return arrayList;
            }
        }).LJJJ(new AkS488S0100000_27(c1792470wkH, 0), false).LJJJ(new InterfaceC1487280oo2() { // from class: X.0wkD
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C11NZ.LJIJJLI(new C1864900yd6(new C1792400wkA((Map) obj), 0));
            }
        }, false).LJLIIL(1L).LJJLL(new AfS196S0100000_27(c1792470wkH, 31), new AfS196S0100000_27(c1792470wkH, 32));
    }

    public static /* synthetic */ void lambda$new$0(EnumC1791830wjF enumC1791830wjF, C1792220wjs c1792220wjs, List list, String str) {
        if (c1792220wjs != null && c1792220wjs.LIZ == 0 && list != null) {
            for (Object obj : list.toArray()) {
                if (obj != null) {
                    AbstractC1794600wni abstractC1794600wni = (AbstractC1794600wni) obj;
                    if (!TextUtils.isEmpty(abstractC1794600wni.LJI()) && abstractC1794600wni.LJ() != 2) {
                        PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(EnumC1791830wjF.GOOGLE, abstractC1794600wni, str);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void launchExternalLink(final EnumC1791830wjF enumC1791830wjF, final Activity activity, final String str, final InterfaceC1795150wob interfaceC1795150wob) throws JSONException {
        if (!this.mInitEd.get()) {
            interfaceC1795150wob.LIZ(new C1794920woE(403, "failure due to not billing sdk not init", null, -1));
        } else {
            getExternalLinkToken(enumC1791830wjF, new InterfaceC1795140woa() { // from class: X.0wo7
                @Override // X.InterfaceC1795140woa
                public final void LIZ(C1794920woE c1794920woE) throws JSONException {
                    this.LIZ.lambda$launchExternalLink$4(interfaceC1795150wob, str, enumC1791830wjF, activity, c1794920woE);
                }
            });
        }
    }

    @Override // X.InterfaceC1794840wo6
    public void onQueryFinished(EnumC1791830wjF enumC1791830wjF, C1792220wjs c1792220wjs, List<AbstractC1794600wni> list, String str) {
        if (c1792220wjs == null || list == null || c1792220wjs.LIZ != 0 || list.isEmpty()) {
            return;
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(final EnumC1791830wjF enumC1791830wjF, final List<String> list, final String str, final InterfaceC1794730wnv interfaceC1794730wnv) {
        if (this.mInitEd.get()) {
            ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
            C1794520wna.LIZLLL(enumC1791830wjF, list, false, new InterfaceC1792890wkx<AbstractC1791620wiu>() { // from class: X.0wnc
                @Override // X.InterfaceC1792890wkx
                public final void LIZ(C1792840wks c1792840wks, List list2) {
                    int i = c1792840wks.LIZ;
                    if (i == 0) {
                        C1792840wks c1792840wks2 = new C1792840wks(0, 0, "query success in queryProductDetails.");
                        c1792840wks2.LJIIJ = str;
                        this.LJ.addExternalGetProductErrorCodes(c1792840wks2, list2);
                        InterfaceC1794450wnT interfaceC1794450wnTLIZIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
                        C1794650wnn c1794650wnn = (C1794650wnn) interfaceC1794450wnTLIZIZ;
                        c1794650wnn.LJI(c1792840wks2, interfaceC1794730wnv, enumC1791830wjF, list2);
                        ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIL(enumC1791830wjF, c1792840wks2, list2);
                        C1792900wky.LIZIZ(true, list, enumC1791830wjF, c1792840wks, list2);
                        return;
                    }
                    int iLIZLLL = C1792840wks.LIZLLL(i, c1792840wks.LJ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("query product list details from chanel service has error, result: ");
                    sbLIZ.append(c1792840wks.LJ);
                    C1792840wks c1792840wks3 = new C1792840wks(301, i, iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
                    c1792840wks3.LJIIJ = str;
                    this.LJ.addExternalGetProductErrorCodes(c1792840wks3, list2);
                    InterfaceC1794450wnT interfaceC1794450wnTLIZIZ2 = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
                    C1794650wnn c1794650wnn2 = (C1794650wnn) interfaceC1794450wnTLIZIZ2;
                    c1794650wnn2.LJI(c1792840wks3, interfaceC1794730wnv, enumC1791830wjF, list2);
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIL(enumC1791830wjF, c1792840wks3, list2);
                    C1792900wky.LIZIZ(false, list, enumC1791830wjF, c1792840wks, list2);
                }
            });
        } else {
            C1792840wks c1792840wks = new C1792840wks(301, 301, "failure due to not billing sdk not init");
            c1792840wks.LJIIJ = str;
            ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJI(c1792840wks, interfaceC1794730wnv, enumC1791830wjF, null);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(EnumC1791830wjF enumC1791830wjF, List<String> list, final String str, final InterfaceC1794730wnv interfaceC1794730wnv) {
        if (this.mInitEd.get()) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, true, new InterfaceC1792890wkx<AbstractC1791620wiu>() { // from class: X.0wne
                @Override // X.InterfaceC1792890wkx
                public final void LIZ(C1792840wks c1792840wks, List list2) {
                    int i = c1792840wks.LIZ;
                    if (i == 0) {
                        C1792840wks c1792840wks2 = new C1792840wks(0, 0, "query success in querySubscriptionDetails.");
                        c1792840wks2.LJIIJ = str;
                        this.LIZJ.addExternalGetProductErrorCodes(c1792840wks2, list2);
                        ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJII(c1792840wks2, interfaceC1794730wnv, list2);
                        ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIILIIL(c1792840wks2, list2);
                        return;
                    }
                    int iLIZLLL = C1792840wks.LIZLLL(i, c1792840wks.LJ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("query product list details from google service has error, result: ");
                    sbLIZ.append(c1792840wks.LJ);
                    C1792840wks c1792840wks3 = new C1792840wks(301, i, iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
                    c1792840wks3.LJIIJ = str;
                    this.LIZJ.addExternalGetProductErrorCodes(c1792840wks3, list2);
                    ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJII(c1792840wks3, interfaceC1794730wnv, list2);
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIILIIL(c1792840wks3, list2);
                }
            });
            return;
        }
        C1792840wks c1792840wks = new C1792840wks(301, 301, "failure due to not billing sdk not init");
        c1792840wks.LJIIJ = str;
        ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJI(c1792840wks, interfaceC1794730wnv, enumC1791830wjF, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$launchExternalLink$4(final InterfaceC1795150wob interfaceC1795150wob, String str, EnumC1791830wjF enumC1791830wjF, Activity activity, C1794920woE c1794920woE) throws JSONException {
        if (!c1794920woE.LIZIZ()) {
            interfaceC1795150wob.LIZ(c1794920woE);
            return;
        }
        C1795000woM c1795000woM = new C1795000woM(str, c1794920woE.LJIILIIL);
        final C1794930woF c1794930woF = new C1794930woF(getBillingCountryCode(enumC1791830wjF), c1795000woM);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("billing_country_code", c1794930woF.LIZLLL);
        jSONObject.put("launch_uri", c1794930woF.LJ.LIZ);
        jSONObject.put("transaction_token", c1794930woF.LJ.LIZIZ);
        c1794930woF.LIZLLL(jSONObject);
        InterfaceC1792450wkF interfaceC1792450wkFLIZ = ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        InterfaceC1795150wob interfaceC1795150wob2 = new InterfaceC1795150wob() { // from class: X.0woA
            @Override // X.InterfaceC1795150wob
            public final void LIZ(C1794920woE c1794920woE2) {
                IapServiceProvider.lambda$launchExternalLink$3(c1794930woF, interfaceC1795150wob, c1794920woE2);
            }
        };
        interfaceC1792450wkFLIZ.getClass();
        if (enumC1791830wjF == EnumC1791830wjF.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().launchExternalLink(activity, c1795000woM, interfaceC1795150wob2);
        } else {
            interfaceC1795150wob2.LIZ(new C1794920woE(403, "launch external link not support amazon!"));
        }
    }
}
