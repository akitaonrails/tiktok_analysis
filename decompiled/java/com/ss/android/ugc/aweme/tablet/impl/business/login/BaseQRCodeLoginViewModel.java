package com.ss.android.ugc.aweme.tablet.impl.business.login;

import X.C051F;
import X.C0XO2;
import X.C13LP;
import X.EnumC2199071B4v;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseQRCodeLoginViewModel extends AndroidViewModel {
    public static final String LLILZ = C051F.LIZIZ();
    public static final List<String> LLILZIL = C13LP.LLIIII(C051F.LJ().values());
    public C0XO2 LL;
    public final MutableLiveData<EnumC2199071B4v> LLILLJJLI;
    public String LLILLL;

    public abstract void vQ2();

    public abstract void wQ2();

    public abstract void xQ2(LifecycleOwner lifecycleOwner);

    public BaseQRCodeLoginViewModel(Application application) {
        super(application);
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = "";
    }
}
