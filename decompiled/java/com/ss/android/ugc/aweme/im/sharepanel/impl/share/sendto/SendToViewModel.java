package com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto;

import X.C1061730djf;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C397901gf;
import X.C905710Zg1;
import X.EnumC328300Ctw;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.common.util.NetworkUtils;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SendToViewModel extends ViewModel {
    public C905710Zg1 LL;
    public final MutableLiveData<EnumC328300Ctw> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public String LLILZ;
    public final List<Integer> LLILZIL;

    public SendToViewModel() {
        MutableLiveData<EnumC328300Ctw> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        this.LLILZIL = C1697810uHb.LJIIJJI(1801, 1802, 1804, 1803, 1805);
    }

    public static void vQ2(int i, int i2, String str) {
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(serverTimeMills, C1061730djf.LIZLLL(new SendResultEvent(i, i2, str).toMap()), "SendResultEvent"));
    }
}
