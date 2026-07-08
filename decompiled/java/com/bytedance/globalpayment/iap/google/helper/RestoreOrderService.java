package com.bytedance.globalpayment.iap.google.helper;

import X.AbstractC1794600wni;
import X.C00FM;
import X.C1794240wn8;
import X.C1794250wn9;
import X.C1794480wnW;
import X.C1795410wp1;
import X.InterfaceC1794840wo6;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes28.dex */
public class RestoreOrderService implements RestoreGoogleOrderService, WeakHandler.IHandler {
    public static volatile RestoreOrderService ins;
    public Context mContext;
    public boolean mEnableRestoreOrder;
    public Set<String> mHasCalledBackOrders;
    public long mMaxRestoreOrderTimeInMill;
    public Map<String, Long> mNeedRestoreOrderMap;
    public Set<String> mProcessingOrders;
    public long mRestoreOrderIntervalInMill;
    public long mTryToStartRestoreTaskDelayAfterGpDismissInMill;
    public WeakHandler mWeakHandler;
    public final String THREAD_NAME = "restore_order_thread";
    public final int MSG_WHAT_START_MONITOR_GP_CALLBACK = 101;
    public final int MSG_WHAT_RESTORE_ORDER_FOR_INIT = 1021;
    public final int MSG_WHAT_RESTORE_ORDER_FOR_UPLOAD_TOKEN_FAIL = 1022;
    public final int MSG_WHAT_RESTORE_ORDER_FOR_GP_CALLBACK = 1023;
    public final int MSG_WHAT_RESTORE_ORDER_FOR_INTERNAL_POLLING = 1024;
    public final int MSG_WHAT_ADD_NEW_ORDER = 103;
    public final int MSG_WHAT_REMOVE_ORDER = 104;
    public InterfaceC1794840wo6 mBillingQueryListener = new InterfaceC1794840wo6() { // from class: X.0wov
        @Override // X.InterfaceC1794840wo6
        public final void onQueryFinished(EnumC1791830wjF enumC1791830wjF, C1792220wjs c1792220wjs, List<AbstractC1794600wni> list, String str) {
            if (c1792220wjs.LIZ == 0 && list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list.toArray()) {
                    AbstractC1794600wni abstractC1794600wni = (AbstractC1794600wni) obj;
                    String strLJIIIZ = abstractC1794600wni.LJIIIZ();
                    if (!TextUtils.isEmpty(strLJIIIZ)) {
                        arrayList.add(strLJIIIZ);
                        if (!this.LIZ.mProcessingOrders.contains(strLJIIIZ) && abstractC1794600wni.LJ() != 2) {
                            this.LIZ.mProcessingOrders.add(strLJIIIZ);
                            PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(EnumC1791830wjF.GOOGLE, abstractC1794600wni, str);
                        } else if (!this.LIZ.mNeedRestoreOrderMap.containsKey(strLJIIIZ)) {
                            WeakHandler weakHandler = this.LIZ.mWeakHandler;
                            weakHandler.sendMessage(weakHandler.obtainMessage(103, strLJIIIZ));
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (String str2 : this.LIZ.mNeedRestoreOrderMap.keySet()) {
                    if (!arrayList.contains(str2)) {
                        hashSet.add(str2);
                    }
                }
                for (Object obj2 : hashSet) {
                    WeakHandler weakHandler2 = this.LIZ.mWeakHandler;
                    weakHandler2.sendMessage(weakHandler2.obtainMessage(104, obj2));
                }
            }
            if (!this.LIZ.isPartiallyRemoveRestoreQuery() && !this.LIZ.mWeakHandler.hasMessages(1024)) {
                RestoreOrderService restoreOrderService = this.LIZ;
                restoreOrderService.mWeakHandler.sendEmptyMessageDelayed(1024, restoreOrderService.mRestoreOrderIntervalInMill);
            }
        }
    };
    public AtomicBoolean mHasInitEd = new AtomicBoolean(false);

    private String getQueryEntrance(int i) {
        return i == 1021 ? "query_restore-settings_init" : i == 1022 ? "query_restore-upload_token_fail" : i == 1023 ? "query_restore-gp_panel_dismiss" : i == 1024 ? "query_restore-restore_service_polling" : "";
    }

    public void updateSettings() {
        initOnlineSettings(false);
    }

    public void init() {
        if (this.mHasInitEd.compareAndSet(false, true)) {
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII();
            String strLJIIJJI = C1794250wn9.LIZ().LJIIJJI();
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(strLJIIJJI)) {
                for (String str : strLJIIJJI.split(",")) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], CastLongProtector.valueOf(strArrSplit[1]));
                    }
                }
            }
            this.mNeedRestoreOrderMap = map;
            this.mHasCalledBackOrders = new HashSet();
            this.mProcessingOrders = new HashSet();
            Looper.prepare();
            this.mWeakHandler = new WeakHandler(Looper.myLooper(), this);
            initOnlineSettings(true);
            Looper.loop();
        }
    }

    private boolean isFullyRemoveRestoreQuery() {
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        return C1795410wp1.LIZJ("iap_exp_optimize_restore_2", 0) == 2;
    }

    public boolean isPartiallyRemoveRestoreQuery() {
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        return C1795410wp1.LIZJ("iap_exp_optimize_restore_2", 0) == 1;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public boolean isEnableRestoreOrder() {
        return this.mEnableRestoreOrder;
    }

    public RestoreOrderService(Context context) {
        this.mContext = context;
        new BPEAThread(new ARunnableS127S0100000_27(this, 13), "restore_order_thread").start();
    }

    private void addOrderInHandlerThread(String str) {
        this.mNeedRestoreOrderMap.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII();
        C1794250wn9.LIZ().LJIIL(C00FM.LIZ(this.mNeedRestoreOrderMap));
    }

    public static RestoreOrderService getIns(Context context) {
        if (ins == null) {
            synchronized (RestoreOrderService.class) {
                try {
                    if (ins == null) {
                        ins = new RestoreOrderService(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return ins;
    }

    private void initOnlineSettings(boolean z) {
        if (this.mHasInitEd.get() || z) {
            boolean z2 = this.mEnableRestoreOrder;
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
            this.mTryToStartRestoreTaskDelayAfterGpDismissInMill = 2000L;
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
            this.mRestoreOrderIntervalInMill = Mp4ScreenVideoLoadTimeout.CONTROL;
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
            this.mMaxRestoreOrderTimeInMill = 259200000L;
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
            this.mEnableRestoreOrder = true;
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
            if (!C1795410wp1.LIZLLL("live_iap_restore_refactor").equals("true") && !z2 && this.mEnableRestoreOrder && !isFullyRemoveRestoreQuery()) {
                ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
                if (C1795410wp1.LIZJ("iap_exp_optimize_billing_init", 1) != 1) {
                    WeakHandler weakHandler = this.mWeakHandler;
                    weakHandler.sendMessage(weakHandler.obtainMessage(1021, Boolean.TRUE));
                }
            }
        }
    }

    private void onFinishedTokenUploadInHandlerThread(String str) {
        removeOrderInHandlerThread(str);
    }

    private void onGpCallbackTimeOutInHandlerThread(String str) {
        if (!this.mNeedRestoreOrderMap.containsKey(str)) {
            addOrderInHandlerThread(str);
            this.mWeakHandler.sendEmptyMessage(1023);
        }
    }

    private void removeOrderInHandlerThread(String str) {
        if (this.mNeedRestoreOrderMap.remove(str) == null) {
            return;
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII();
        C1794250wn9.LIZ().LJIIL(C00FM.LIZ(this.mNeedRestoreOrderMap));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        boolean zBooleanValue;
        if (this.mEnableRestoreOrder && !isFullyRemoveRestoreQuery()) {
            int i = message.what;
            if (i == 101) {
                onGpCallbackTimeOutInHandlerThread((String) HandlerHook.getMessageObj(message.obj));
                return;
            }
            if (i != 1021 && i != 1022 && i != 1023 && i != 1024) {
                if (i == 103) {
                    addOrderInHandlerThread((String) HandlerHook.getMessageObj(message.obj));
                    return;
                } else {
                    if (i != 104) {
                        return;
                    }
                    removeOrderInHandlerThread((String) HandlerHook.getMessageObj(message.obj));
                    return;
                }
            }
            String queryEntrance = getQueryEntrance(i);
            if (HandlerHook.getMessageObj(message.obj) instanceof Boolean) {
                zBooleanValue = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
            } else {
                zBooleanValue = false;
            }
            doRestoreOrderInHandlerThread(zBooleanValue, queryEntrance);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onFailedFinishedTokenUpload(String str) {
        Set<String> set;
        if (!this.mEnableRestoreOrder || isFullyRemoveRestoreQuery() || (set = this.mProcessingOrders) == null) {
            return;
        }
        set.remove(str);
        WeakHandler weakHandler = this.mWeakHandler;
        weakHandler.sendMessageDelayed(weakHandler.obtainMessage(1022, Boolean.TRUE), this.mRestoreOrderIntervalInMill);
    }

    public void onGoogleCallback(AbstractC1794600wni abstractC1794600wni) {
        if (this.mEnableRestoreOrder && !isFullyRemoveRestoreQuery()) {
            String strLJIIIZ = abstractC1794600wni.LJIIIZ();
            if (abstractC1794600wni.LJ() != 2) {
                this.mHasCalledBackOrders.add(strLJIIIZ);
                this.mWeakHandler.removeMessages(101, strLJIIIZ);
            } else {
                this.mWeakHandler.removeMessages(103, strLJIIIZ);
            }
        }
    }

    public void onGooglePanelDismiss(C1794480wnW c1794480wnW) {
        if (!this.mEnableRestoreOrder || isFullyRemoveRestoreQuery() || this.mHasCalledBackOrders.contains(c1794480wnW.LJ())) {
            return;
        }
        this.mWeakHandler.sendMessageDelayed(this.mWeakHandler.obtainMessage(101, c1794480wnW.LJ()), this.mTryToStartRestoreTaskDelayAfterGpDismissInMill);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onSuccessFinishedTokenUpload(String str) {
        if (this.mEnableRestoreOrder && !isFullyRemoveRestoreQuery()) {
            WeakHandler weakHandler = this.mWeakHandler;
            weakHandler.sendMessage(weakHandler.obtainMessage(104, str));
        }
    }

    private void doRestoreOrderInHandlerThread(boolean z, String str) {
        if (!z && this.mNeedRestoreOrderMap.isEmpty()) {
            return;
        }
        PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(this.mBillingQueryListener, str);
    }
}
