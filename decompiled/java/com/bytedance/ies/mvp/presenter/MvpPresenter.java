package com.bytedance.ies.mvp.presenter;

import X.C1119370fEd;
import X.InterfaceC1156004fe;
import Y.ACallableS255S0200000_30;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* JADX INFO: loaded from: classes31.dex */
public abstract class MvpPresenter<T, V extends InterfaceC1156004fe<T>> implements WeakHandler.IHandler {
    public boolean isLoading;
    public Handler mHandler = new WeakHandler(this);
    public V mMvpView;

    public void attachView(V v) {
    }

    public void detachView() {
    }

    public abstract T doWork(Object... objArr);

    public boolean execute(Object... objArr) {
        return executeWithForceTag(false, objArr);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1001) {
            this.isLoading = false;
        }
    }

    public boolean executeWithForceTag(boolean z, Object... objArr) {
        if (this.isLoading && !z) {
            return false;
        }
        this.isLoading = true;
        C1119370fEd.LIZIZ().LIZ(this.mHandler, new ACallableS255S0200000_30(objArr, this, 2), 1001);
        return true;
    }
}
