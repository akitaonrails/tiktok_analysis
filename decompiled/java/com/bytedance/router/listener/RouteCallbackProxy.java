package com.bytedance.router.listener;

import android.content.Intent;
import com.bytedance.router.OpenResultCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class RouteCallbackProxy implements OpenResultCallback {
    public List<OpenResultCallback> mCallbackList = new ArrayList();
    public WeakReference<OpenResultCallback> mTempCallback = null;
    public boolean mIsMulti = false;

    public void onSuccess() {
        onSuccess(null);
    }

    private OpenResultCallback getTempCallback() {
        WeakReference<OpenResultCallback> weakReference = this.mTempCallback;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onEmpty();
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onEmpty();
        }
        this.mTempCallback = null;
        this.mIsMulti = false;
    }

    public void addCallback(OpenResultCallback openResultCallback) {
        if (openResultCallback == null) {
            return;
        }
        this.mCallbackList.add(openResultCallback);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onActionResult(obj);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onActionResult(obj);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onIntercept(str);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onIntercept(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onMatched(str);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onMatched(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onMissed(str);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onMissed(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onOpen(Intent intent) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onOpen(intent);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onOpen(intent);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onSuccess(intent);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onSuccess(intent);
        }
        this.mTempCallback = null;
    }

    public void removeCallback(OpenResultCallback openResultCallback) {
        if (openResultCallback == null) {
            return;
        }
        this.mCallbackList.remove(openResultCallback);
    }

    public void setMultiTempCallback(OpenResultCallback openResultCallback) {
        setTempCallback(openResultCallback, true);
    }

    public void setTempCallback(OpenResultCallback openResultCallback) {
        setTempCallback(openResultCallback, false);
    }

    private void setTempCallback(OpenResultCallback openResultCallback, boolean z) {
        if (openResultCallback != null) {
            this.mTempCallback = new WeakReference<>(openResultCallback);
        }
        this.mIsMulti = z;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            if (openResultCallback != null) {
                openResultCallback.onFail(str, str2);
            }
        }
        if (getTempCallback() != null) {
            getTempCallback().onFail(str, str2);
        }
        if (!this.mIsMulti) {
            this.mTempCallback = null;
            this.mIsMulti = false;
        }
    }
}
