package com.bytedance.globalpayment.service.manager;

import android.text.TextUtils;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class PaymentServiceManager {
    public static volatile AmazonIapExternalService mAmazonIapExternalService;
    public static volatile GoogleIapExternalService mGoogleIapExternalService;
    public static volatile IapExternalService mIapExternalService;
    public static volatile PaymentServiceManager mServiceManagerInstance;
    public Map<String, String> classNameMap;
    public Map<String, Object> instanceManager = new HashMap();

    public static PaymentServiceManager get() {
        if (mServiceManagerInstance == null) {
            synchronized (PaymentServiceManager.class) {
                try {
                    if (mServiceManagerInstance == null) {
                        mServiceManagerInstance = new PaymentServiceManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mServiceManagerInstance;
    }

    public AmazonIapExternalService getAmazonIapExternalService() {
        if (mAmazonIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mAmazonIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"));
                        if (objectInstance == null && (TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock") || (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock")) == null)) {
                            throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService");
                        }
                        mAmazonIapExternalService = (AmazonIapExternalService) objectInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mAmazonIapExternalService;
    }

    public GoogleIapExternalService getGoogleIapExternalService() {
        if (mGoogleIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mGoogleIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"));
                        if (objectInstance == null && (TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock") || (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock")) == null)) {
                            throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService");
                        }
                        mGoogleIapExternalService = (GoogleIapExternalService) objectInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mGoogleIapExternalService;
    }

    public IapExternalService getIapExternalService() {
        if (mIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"));
                        if (objectInstance == null && (TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"), "com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock") || (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock")) == null)) {
                            throw new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.IapExternalService");
                        }
                        mIapExternalService = (IapExternalService) objectInstance;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mIapExternalService;
    }

    public PaymentServiceManager() {
        HashMap map = new HashMap();
        this.classNameMap = map;
        map.put("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService", "com.bytedance.globalpayment.iap.amazon.service.provider.AmazonIapExternalServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService", "com.bytedance.globalpayment.iap.google.service.provider.GoogleIapExternalServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.IapExternalService", "com.bytedance.globalpayment.iap.service.provider.IapServiceProvider");
    }

    private Object getObjectInstance(String str) {
        if (this.instanceManager.containsKey(str)) {
            return this.instanceManager.get(str);
        }
        try {
            Object objNewInstance = Class.forName(str).newInstance();
            this.instanceManager.put(str, objNewInstance);
            return objNewInstance;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
