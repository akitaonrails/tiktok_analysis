package com.ss.android.ugc.aweme.homepage.api.data;

import X.C01GW;
import X.C0TLD;
import X.C1568820qvY;
import X.C1570330qxz;
import X.C452501pT;
import X.C683320QrC;
import X.C686050Qvb;
import X.C686840Qws;
import X.C795720VJi;
import android.os.Message;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes25.dex */
public final class HomePageDataViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJJJ = 0;
    public String LLILZ;
    public Aweme LLILZIL;
    public String LLJ;
    public Aweme LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C1570330qxz LL = new C1570330qxz();
    public final C795720VJi LLILLJJLI = new ReentrantLock() { // from class: X.0VJi
        public volatile boolean LL;

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            if (this.LL) {
                return true;
            }
            return super.tryLock();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            super.unlock();
            this.LL = true;
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) {
            if (!this.LL) {
                return super.tryLock(j, timeUnit);
            }
            return true;
        }
    };
    public final Message LLILLL = new Message();
    public final MutableLiveData<String> LLILZLL = new MutableLiveData<>();
    public String LLIZ = "";
    public final MutableLiveData<String> LLIZLLLIL = new MutableLiveData<>();
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public int LLJJI = 1;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C686840Qws());
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C0TLD());
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C683320QrC());
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(129));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C686050Qvb());
    public final MutableLiveData<C1568820qvY> LLJJJIL = new MutableLiveData<>();

    public final String getEventType() {
        return this.LLILZLL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((LiveData) this.LLJJIJI.getValue()).setValue(null);
    }

    public final String wQ2() {
        if (this.LLIZ.length() == 0) {
            this.LLIZ = "slide_left";
        }
        return this.LLIZ;
    }

    public final MutableLiveData<Integer> xQ2() {
        return (MutableLiveData) this.LLJJIJIIJIL.getValue();
    }

    public final void setEventType(String str) {
        this.LLILZLL.setValue(str);
    }
}
