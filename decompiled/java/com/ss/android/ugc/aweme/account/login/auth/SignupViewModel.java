package com.ss.android.ugc.aweme.account.login.auth;

import X.AbstractC846040XGw;
import X.C01GW;
import X.C07HH;
import X.C095G;
import X.C09IC;
import X.C09JN;
import X.C0D5N;
import X.C0D5P;
import X.C0D8R;
import X.C0PEM;
import X.C0XGR;
import X.C0XH5;
import X.C0XR9;
import X.C0XUE;
import X.C0XZ4;
import X.C0XZJ;
import X.C0XZV;
import X.C123100dR;
import X.C1236990iIL;
import X.C1237220iIi;
import X.C1238900iLQ;
import X.C1238920iLS;
import X.C1266060j3E;
import X.C13BV;
import X.C13LQ;
import X.C1687890u1b;
import X.C1687900u1c;
import X.C1687910u1d;
import X.C19252910Tv;
import X.C19286010ck;
import X.C19311110gn;
import X.C19313010h6;
import X.C19313410hA;
import X.C19313610hC;
import X.C19314010hG;
import X.C19314410hK;
import X.C19314510hL;
import X.C19314610hM;
import X.C19314810hO;
import X.C19719512Dh;
import X.C19EG;
import X.C1DEK;
import X.C1DFH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C845820XGa;
import X.C848000XOk;
import X.C851370XaZ;
import X.C852170Xbr;
import X.C852190Xbt;
import X.DialogC1389620mGW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC19303310fX;
import X.InterfaceC19312510h1;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS169S0200000_4;
import Y.AObserverS230S0100000_28;
import Y.AfS112S0300000_19;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class SignupViewModel extends ViewModel {
    public final Intent LL;
    public WeakReference<C19EG> LLILLJJLI;
    public InterfaceC19312510h1 LLILLL;
    public final C1DEK LLILZ;
    public final InterfaceC346201Wa<C0D5P> LLILZIL;
    public List<? extends C1687890u1b> LLILZLL;
    public List<? extends C1687890u1b> LLIZ;
    public final MutableLiveData<List<C1687890u1b>> LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final MutableLiveData<List<C1687890u1b>> LLJI;
    public final MutableLiveData LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final String LLJLLIL;
    public final IPrevLoginPlatformService LLJLLL;
    public final IOneClickLoginService LLJZ;
    public final String LLJZIJLIL;
    public final int LLL;
    public List<? extends C1687890u1b> LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public Bundle LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public C19313410hA LLLJL;
    public final C01GW LLLL;

    public final long AQ2() {
        return ((Number) this.LLJJJIL.getValue()).longValue();
    }

    public final String BQ2() {
        return (String) this.LLJJ.getValue();
    }

    public final Bundle CQ2() {
        return (Bundle) this.LLJJJJ.getValue();
    }

    public final double EQ2() {
        return ((Number) this.LLJJL.getValue()).doubleValue();
    }

    public final boolean FQ2() {
        Intent intent = this.LL;
        if (intent != null) {
            return intent.getBooleanExtra("show_login_page_first", false);
        }
        return false;
    }

    public final Bundle GQ2() {
        return (Bundle) this.LLLFFI.getValue();
    }

    public final C19313410hA HQ2() {
        C19313410hA c19313410hA = this.LLLJL;
        if (c19313410hA != null) {
            return c19313410hA;
        }
        return null;
    }

    public final boolean IQ2() {
        return ((Boolean) this.LLLJIL.getValue()).booleanValue();
    }

    public final boolean JQ2() {
        return ((Boolean) this.LLLII.getValue()).booleanValue();
    }

    public final int KQ2() {
        return ((Number) this.LLJL.getValue()).intValue();
    }

    public final boolean MQ2() {
        return ((Boolean) this.LLLIILIL.getValue()).booleanValue();
    }

    public final boolean NQ2() {
        return ((Boolean) this.LLLIL.getValue()).booleanValue();
    }

    public final boolean OQ2() {
        return ((Boolean) this.LLLIIIIL.getValue()).booleanValue();
    }

    public final boolean QQ2() {
        return ((Boolean) this.LLLILZLLLI.getValue()).booleanValue();
    }

    public final void TQ2() {
        BaseActivity baseActivity;
        WeakReference<C19EG> weakReference = this.LLILLJJLI;
        C19EG c19eg = weakReference != null ? weakReference.get() : null;
        if (!(c19eg instanceof BaseActivity) || (baseActivity = (BaseActivity) c19eg) == null) {
            return;
        }
        List<C1687890u1b> listVQ2 = vQ2(baseActivity);
        this.LLILZLL = listVQ2;
        this.LLIZLLLIL.setValue(listVQ2);
    }

    public final void VQ2() {
        BaseActivity baseActivity;
        C19EG c19eg;
        C19EG c19eg2;
        WeakReference<C19EG> weakReference = this.LLILLJJLI;
        C19EG c19eg3 = weakReference != null ? weakReference.get() : null;
        if (!(c19eg3 instanceof BaseActivity) || (baseActivity = (BaseActivity) c19eg3) == null) {
            return;
        }
        C845820XGa.LIZ.getClass();
        if (C845820XGa.LIZ()) {
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ.LLIILII(), null, new C0D8R(this, baseActivity, null), 2);
            WeakReference<C19EG> weakReference2 = this.LLILLJJLI;
            if (weakReference2 == null || (c19eg2 = weakReference2.get()) == null) {
                return;
            }
            this.LLJZ.LJIIZILJ().observe(c19eg2, new AObserverS169S0200000_4(this, baseActivity, 0));
            return;
        }
        TQ2();
        WeakReference<C19EG> weakReference3 = this.LLILLJJLI;
        if (weakReference3 != null && (c19eg = weakReference3.get()) != null) {
            this.LLJZ.LJIIZILJ().observe(c19eg, new AObserverS230S0100000_28(this, 11));
        }
        List<C1687890u1b> listWQ2 = wQ2(baseActivity);
        this.LLIZ = listWQ2;
        this.LLJI.setValue(listWQ2);
    }

    public final String getEnterFrom() {
        return (String) this.LLJILLL.getValue();
    }

    public final boolean xQ2() {
        return ((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue();
    }

    public final String yQ2() {
        return (String) this.LLJJIII.getValue();
    }

    public final Bundle zQ2() {
        return (Bundle) this.LLLFF.getValue();
    }

    public final boolean PQ2() {
        INUJRevampService iNUJRevampService;
        Bundle bundleG3;
        if (C07HH.LIZ() || !OQ2() || !NQ2() || (iNUJRevampService = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        Intent intent = this.LL;
        return iNUJRevampService.LIZ(intent != null && (bundleG3 = C786410Ut5.g3(intent, "sign_up_data")) != null && bundleG3.getBoolean("is_skippable_dialog"));
    }

    public final String getEnterMethod() {
        String string = CQ2().getString("enter_method");
        return string == null ? "" : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignupViewModel(Intent intent) {
        String strName;
        this.LL = intent;
        C1DEK c1dekLIZ = C095G.LIZ(0, null, 7);
        this.LLILZ = c1dekLIZ;
        this.LLILZIL = C09IC.LJJIIJ(c1dekLIZ);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZLL = c13bv;
        this.LLIZ = c13bv;
        MutableLiveData<List<C1687890u1b>> mutableLiveData = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData;
        this.LLJ = mutableLiveData;
        MutableLiveData<List<C1687890u1b>> mutableLiveData2 = new MutableLiveData<>();
        this.LLJI = mutableLiveData2;
        this.LLJIJIL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(Boolean.FALSE);
        this.LLJILJIL = mutableLiveData3;
        this.LLJILJILJ = mutableLiveData3;
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 82));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 66));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 85));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 84));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 72));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 87));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 71));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 73));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 64));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 68));
        this.LLJJJJJIL = C452501pT.LIZIZ(new C19313010h6(this));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 74));
        this.LLJJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 70));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 67));
        this.LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 72));
        this.LLJLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 65));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 76));
        this.LLJLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 78));
        BaseLoginMethod baseLoginMethodLJFF = C0XUE.LIZ.LJFF();
        if (baseLoginMethodLJFF instanceof TPLoginMethod) {
            strName = ((TPLoginMethod) baseLoginMethodLJFF).getPlatform();
        } else {
            strName = baseLoginMethodLJFF.getLoginMethodName().name();
        }
        this.LLJLLIL = strName;
        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
        this.LLJLLL = iPrevLoginPlatformService;
        this.LLJZ = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        String str = (String) iPrevLoginPlatformService.getPlatform().getValue();
        this.LLJZIJLIL = str == null ? "" : str;
        this.LLL = iPrevLoginPlatformService.LIZIZ();
        this.LLLF = c13bv;
        this.LLLFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 63));
        this.LLLFFI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 77));
        this.LLLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 86));
        this.LLLII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 83));
        this.LLLIIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 89));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 91));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(78));
        this.LLLIIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 42));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 88));
        this.LLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 90));
        this.LLLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 75));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 80));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 92));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 81));
        this.LLLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 69));
        this.LLLJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 79));
        this.LLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(79));
    }

    public static void UQ2(List list) {
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (a0.LJJIIZI(((C1687890u1b) ListProtector.get(list, i)).LJ, "google", false)) {
                ListProtector.add(list, 0, ListProtector.remove(list, i));
                break;
            }
            i++;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (a0.LJJIIZI(((C1687890u1b) ListProtector.get(list, i2)).LJ, "facebook", false)) {
                list.add(ListProtector.remove(list, i2));
                return;
            }
        }
    }

    public final void RQ2(String str) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0D5N(this, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C1687890u1b> vQ2(final BaseActivity baseActivity) {
        final boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        if (xQ2()) {
            arrayList.add(C19314510hL.LJIIJ);
        } else if (((Boolean) this.LLJLIL.getValue()).booleanValue()) {
            arrayList.add(C19314410hK.LJIIJ);
        } else if (C19286010ck.LIZLLL()) {
            arrayList.add(C19314610hM.LJIIJ);
        } else {
            arrayList.add(C19314810hO.LJIIJ);
        }
        C19314010hG c19314010hG = C19314010hG.LIZ;
        InterfaceC19303310fX interfaceC19303310fX = new InterfaceC19303310fX() { // from class: X.10fW
            @Override // X.InterfaceC19303310fX
            public final String LJJJIL(C1239090iLj c1239090iLj) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C19303110fV(this.LL, c1239090iLj, null), 3);
                return "";
            }
        };
        c19314010hG.getClass();
        List listLIZ = C19314010hG.LIZ(false, interfaceC19303310fX);
        String str = (String) this.LLJLLL.getPlatform().getValue();
        Iterator it2 = ((ArrayList) listLIZ).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            C1687890u1b c1687890u1b = (C1687890u1b) it2.next();
            if (!C123100dR.LIZ(str) || !a0.LJJIIZI(c1687890u1b.LJ, str, false)) {
                z = false;
            }
            c1687890u1b.LJFF = z;
        }
        if (xQ2()) {
            i = 2131845260;
        } else {
            i = 2131829306;
        }
        if (PQ2()) {
            i2 = R.raw.icon_person_bold;
        } else {
            i2 = R.raw.icon_person_fill;
        }
        ACListenerS162S0100000_28 aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 29);
        if (C07HH.LIZ()) {
            final String enterFrom = getEnterFrom();
            final String enterMethod = getEnterMethod();
            final Bundle bundle = new Bundle(zQ2());
            final boolean zContains = C13LQ.LJLIIL(new String[]{"email", "mobile", "username"}).contains(this.LLJZIJLIL);
            final int i5 = 0;
            final Integer numValueOf = Integer.valueOf(i);
            arrayList.add(new C1687890u1b(enterFrom, enterMethod, bundle, baseActivity, i5, numValueOf, zContains, z) { // from class: X.10fj
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    int iIntValue;
                    int iIntValue2;
                    if (i5 != null) {
                        iIntValue = i5.intValue();
                    } else {
                        iIntValue = R.raw.icon_person;
                    }
                    if (numValueOf != null) {
                        iIntValue2 = numValueOf.intValue();
                    } else {
                        iIntValue2 = 2131829306;
                    }
                    super(iIntValue, 0, iIntValue2, z, "phone_email_show", zContains, 0, false, new View.OnClickListener() { // from class: X.10fh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String string;
                            C853660XeG c853660XeG = C853660XeG.LIZ;
                            String str2 = enterMethod;
                            String str3 = enterFrom;
                            Bundle bundle2 = bundle;
                            if (bundle2 == null || (string = bundle2.getString("login_panel_type")) == null) {
                                string = "login";
                            }
                            C853660XeG.LIZJ(c853660XeG, str2, str3, string);
                            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                            IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C0XPY.LIZIZ(IFeed0VVManagerService.class);
                            if (iFeed0VVManagerService != null) {
                                iFeed0VVManagerService.LIZIZ();
                                iFeed0VVManagerService.LIZJ("LOGIN");
                            }
                            SmartRoute smartRouteLIZ = C852680Xcg.LIZ(baseActivity);
                            Bundle bundle3 = bundle;
                            if (bundle3 != null) {
                                smartRouteLIZ.withParam(bundle3);
                            }
                            smartRouteLIZ.open(8193, new C19334010kU(baseActivity, 4));
                        }
                    }, 192);
                }
            });
            if (QQ2() && this.LLJZ.LJIIJ(null)) {
                i4 = 2;
                arrayList.add(new C1687890u1b(0, 0, 2131838754, false, null, false, 12, true, aCListenerS162S0100000_28, 59));
            } else {
                i4 = 2;
            }
            arrayList.add(new C1687910u1d(null, null));
            if (((Number) C07HH.LIZ.getValue()).intValue() == i4 && C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 0) {
                UQ2(C19719512Dh.LIZIZ(listLIZ));
            }
            arrayList.add(new C1687900u1c(listLIZ));
        } else {
            arrayList.addAll(listLIZ);
            if (arrayList.size() > 2 && (ListProtector.get(arrayList, 1) instanceof C19311110gn)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            final String enterFrom2 = getEnterFrom();
            final String enterMethod2 = getEnterMethod();
            final Bundle bundle2 = new Bundle(zQ2());
            final boolean zContains2 = C13LQ.LJLIIL(new String[]{"email", "mobile", "username"}).contains(this.LLJZIJLIL);
            final Integer numValueOf2 = Integer.valueOf(i2);
            final Integer numValueOf3 = Integer.valueOf(i);
            final boolean z2 = false;
            ListProtector.add(arrayList, i3, new C1687890u1b(enterFrom2, enterMethod2, bundle2, baseActivity, numValueOf2, numValueOf3, zContains2, z2) { // from class: X.10fj
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    int iIntValue;
                    int iIntValue2;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    } else {
                        iIntValue = R.raw.icon_person;
                    }
                    if (numValueOf3 != null) {
                        iIntValue2 = numValueOf3.intValue();
                    } else {
                        iIntValue2 = 2131829306;
                    }
                    super(iIntValue, 0, iIntValue2, z2, "phone_email_show", zContains2, 0, false, new View.OnClickListener() { // from class: X.10fh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String string;
                            C853660XeG c853660XeG = C853660XeG.LIZ;
                            String str2 = enterMethod2;
                            String str3 = enterFrom2;
                            Bundle bundle22 = bundle2;
                            if (bundle22 == null || (string = bundle22.getString("login_panel_type")) == null) {
                                string = "login";
                            }
                            C853660XeG.LIZJ(c853660XeG, str2, str3, string);
                            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                            IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C0XPY.LIZIZ(IFeed0VVManagerService.class);
                            if (iFeed0VVManagerService != null) {
                                iFeed0VVManagerService.LIZIZ();
                                iFeed0VVManagerService.LIZJ("LOGIN");
                            }
                            SmartRoute smartRouteLIZ = C852680Xcg.LIZ(baseActivity);
                            Bundle bundle3 = bundle2;
                            if (bundle3 != null) {
                                smartRouteLIZ.withParam(bundle3);
                            }
                            smartRouteLIZ.open(8193, new C19334010kU(baseActivity, 4));
                        }
                    }, 192);
                }
            });
            if (this.LLJLLL.LJFF() != C0XR9.NONE) {
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    C1687890u1b c1687890u1b2 = (C1687890u1b) ListProtector.get(arrayList, i6);
                    if (c1687890u1b2.LJFF) {
                        ListProtector.remove(arrayList, i6);
                        ListProtector.add(arrayList, 1, c1687890u1b2);
                        break;
                    }
                    i6++;
                }
            }
            if (QQ2() && this.LLJZ.LJIIJ(null)) {
                arrayList.add(new C1687910u1d(12, 24));
                arrayList.add(new C1687890u1b(0, 0, 2131838754, false, null, false, 0, false, aCListenerS162S0100000_28, 251));
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C1687890u1b> wQ2(final com.bytedance.ies.foundation.activity.BaseActivity r23) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.SignupViewModel.wQ2(com.bytedance.ies.foundation.activity.BaseActivity):java.util.List");
    }

    public final Bundle DQ2(String str, String str2) {
        LinkedHashMap linkedHashMap;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle, CQ2());
        C852170Xbr.LIZ.getClass();
        Map mapLJI = C852170Xbr.LJI(bundle);
        if (mapLJI != null) {
            linkedHashMap = new LinkedHashMap(mapLJI);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        String string = CQ2().getString("login_panel_type_m2");
        if (string != null) {
            str2 = string;
        }
        linkedHashMap.putAll(C2097608Jq.LJIIJ(new Pair("enter_type", str), new Pair("login_panel_type", str2), new Pair("ttspage_after_nuj", 0)));
        C786410Ut5.LJJIZ(bundle, "extra_param", linkedHashMap);
        C786410Ut5.LJJJI("enter_type", str, bundle);
        C786410Ut5.LJJJI("login_panel_type", str2, bundle);
        C786410Ut5.LJJJI("previous_login_method", this.LLJLLIL, bundle);
        C786410Ut5.LJJJI("prev_login_platform", this.LLJZIJLIL, bundle);
        bundle.putInt("encouraged_platform", this.LLL);
        bundle.putBoolean("is_from_new_user_journey", NQ2());
        bundle.putBoolean("enable_nuj_revamp_phone_email_page", ((Boolean) this.LLLILZJ.getValue()).booleanValue());
        return bundle;
    }

    public static void WQ2(final C19EG c19eg, final DialogC1389620mGW dialogC1389620mGW, final String str) {
        C19313610hC c19313610hCLIZLLL;
        C852190Xbt c852190Xbt = C852190Xbt.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c852190Xbt.getClass();
        C0XGR c0xgrLIZ = C852190Xbt.LIZ(0, jCurrentTimeMillis, c19eg);
        C852170Xbr.LIZ(c0xgrLIZ);
        C20684815ws.LJIILLIIL("login_submit", c0xgrLIZ.LIZ);
        C852190Xbt.LIZIZ = SystemClock.elapsedRealtime();
        ICoinService iCoinService = (ICoinService) ServiceManager.get().getService(ICoinService.class);
        if (iCoinService != null && (c19313610hCLIZLLL = iCoinService.LIZLLL()) != null) {
            String str2 = c19313610hCLIZLLL.LIZJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c19313610hCLIZLLL.LIZ;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c19313610hCLIZLLL.LJ;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c19313610hCLIZLLL.LJFF;
            if (str6 != null) {
                str3 = str6;
            }
            AbstractC846040XGw<C0XZV> abstractC846040XGw = new AbstractC846040XGw<C0XZV>() { // from class: X.0Xbs
                @Override // X.AbstractC846040XGw
                public final void LIZ(C0XGA c0xga) {
                    C0XZV c0xzv = (C0XZV) c0xga;
                    if (c0xzv.LIZIZ) {
                        C0XO3 c0xo3 = c0xzv.LJIIIZ;
                        C0XYO.LIZLLL(C0XYO.LIZ, c19eg, null, c0xo3, false, null, false, 112);
                        C852190Xbt c852190Xbt2 = C852190Xbt.LIZ;
                        Activity activity = c19eg;
                        String.valueOf(c0xo3.LIZ);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        c852190Xbt2.getClass();
                        C0XGR c0xgr = new C0XGR();
                        c0xgr.LIZIZ(SystemClock.elapsedRealtime() - jCurrentTimeMillis2, "stay_time");
                        c0xgr.LIZIZ(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "cold_start_to_express_login_success_duration");
                        c0xgr.LIZLLL("enter_method", "");
                        c0xgr.LIZIZ(SystemClock.elapsedRealtime() - C852190Xbt.LIZIZ, "duration");
                        C20684815ws.LJIILLIIL("express_login_success", c0xgr.LIZ);
                        C0XGR c0xgrLIZ2 = C852190Xbt.LIZ(0, jCurrentTimeMillis2, activity);
                        C852170Xbr.LIZ(c0xgrLIZ2);
                        C20684815ws.LJIILLIIL("login_success", c0xgrLIZ2.LIZ);
                        C2211631BhB.LJIILL("b9242", null);
                        C852210Xbv.LIZ();
                        ICoinService iCoinService2 = (ICoinService) ServiceManager.get().getService(ICoinService.class);
                        if (iCoinService2 != null) {
                            iCoinService2.LJIIZILJ();
                            return;
                        }
                        return;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                    C852190Xbt c852190Xbt3 = C852190Xbt.LIZ;
                    Activity activity2 = c19eg;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    int i = c0xzv.LIZLLL;
                    c852190Xbt3.getClass();
                    C0XGR c0xgr2 = new C0XGR();
                    c0xgr2.LIZ(i, "error_code");
                    c0xgr2.LIZLLL("enter_from", "");
                    c0xgr2.LIZIZ(SystemClock.elapsedRealtime() - C852190Xbt.LIZIZ, "duration");
                    C20684815ws.LJIILLIIL("express_login_failure", c0xgr2.LIZ);
                    C20684815ws.LJIILLIIL("login_failure", C852190Xbt.LIZ(i, jCurrentTimeMillis3, activity2).LIZ);
                    C2211631BhB.LJIILL("b1728", null);
                    if (C307150C2f.LIZ != 0) {
                        C1848530yCh.LIZIZ("nuj_login", AFwS248S0000000_14.get$arr$(525), 62);
                    }
                    Dialog dialog = dialogC1389620mGW;
                    if (dialog == null) {
                        return;
                    }
                    dialog.dismiss();
                    C785410UrT.LIZ(dialog);
                }
            };
            TTAccountInit.LIZ();
            C0XH5.LIZ(C848000XOk.LIZ(), str2, str4, str5, str3, null, abstractC846040XGw).LJIIIZ();
        }
    }

    public final void LQ2(boolean z, Boolean bool, String str, String str2, Boolean bool2, String str3) {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LLILLJJLI;
        if (weakReference != null && (c19eg = weakReference.get()) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//account/login/signup_or_login");
            smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
            smartRouteBuildRoute.withParam("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
            smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
            smartRouteBuildRoute.withParam("page", "signup_prioritize_panel");
            Bundle bundleGQ2 = GQ2();
            bundleGQ2.putBoolean("code_sent", z);
            C786410Ut5.LJJIZ(bundleGQ2, "args_phone_number", PhoneNumberUtil.LIZLLL(str2));
            bundleGQ2.putBoolean("user_cross_activity_timer", true);
            if (bool2 != null) {
                bundleGQ2.putBoolean("ocl_checkbox_checked", bool2.booleanValue());
            }
            smartRouteBuildRoute.withParam(bundleGQ2);
            smartRouteBuildRoute.withParam("channel_for_ocl", "phone");
            smartRouteBuildRoute.withParam("enter_from", getEnterFrom());
            smartRouteBuildRoute.withParam("enter_method", getEnterMethod());
            smartRouteBuildRoute.withParam("login_panel_type", "signup");
            smartRouteBuildRoute.withParam("check_kr_consent", true);
            Bundle bundle = this.LLLFZ;
            if (bundle != null) {
                smartRouteBuildRoute.withParam("et_params", bundle);
            }
            if (bool != null) {
                smartRouteBuildRoute.withParam("is_register", !bool.booleanValue());
            }
            if (!TextUtils.isEmpty(str)) {
                smartRouteBuildRoute.withParam("has_sms_permission", str);
            }
            if (str3 != null) {
                smartRouteBuildRoute.withParam("gsma_fail_reason", str3);
            }
            smartRouteBuildRoute.open();
        }
    }

    public final void SQ2(final String str, Function0<Unit> function0, Function0<Unit> function02, Function1<? super C0XZJ, Unit> function1, final Boolean bool, final String str2) {
        C1237220iIi c1237220iIi;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        C851370XaZ c851370XaZLIZ = C1236990iIL.LIZ(str, enumC852660Xce);
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            function0.invoke();
            int i = C1238900iLQ.LLJILJILJ;
            C1238920iLS.LIZ(0, getEnterFrom(), getEnterMethod(), yQ2(), null, 96);
            LQ2(false, null, "", str, bool, str2);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (SMSPermissionCheckboxExp.INSTANCE.showCheckbox()) {
            linkedHashMap.put("query_sms_permission", "1");
        }
        C0XZ4.LJIILLIIL(C0XZ4.LIZ, getEnterFrom(), getEnterMethod(), str, enumC852660Xce, EnumC852910Xd3.PHONE_SMS_SIGN_UP, "user_click", "signup", null, null, null, null, null, "signup_prioritize_panel", null, null, null, null, str2, null, linkedHashMap, 388992).LJIIIIZZ(new C09JN() { // from class: X.0iLR
            /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.String r4 = "SignupViewModel@1683.prioritize1PSMSInputSendMobileCode$1"
                    X.C1C7U.LIZ(r4)
                    X.0XT7 r13 = (X.C0XT7) r13
                    com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r2 = r12.LL
                    X.0Xbr r1 = X.C852170Xbr.LIZ
                    T extends X.0XTe r0 = r13.LJIIIZ
                    r1.getClass()
                    android.os.Bundle r0 = X.C852170Xbr.LJ(r0)
                    r2.LLLFZ = r0
                    int r0 = X.C1238900iLQ.LLJILJILJ
                    r0 = 0
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                    com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r12.LL
                    java.lang.String r6 = r0.getEnterFrom()
                    com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r12.LL
                    java.lang.String r7 = r0.getEnterMethod()
                    com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r12.LL
                    java.lang.String r8 = r0.yQ2()
                    T extends X.0XTe r0 = r13.LJIIIZ
                    java.lang.Boolean r9 = r0.LJFF
                    r10 = 64
                    X.C1238920iLS.LIZ(r5, r6, r7, r8, r9, r10)
                    com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
                    boolean r0 = r0.showCheckbox()
                    if (r0 == 0) goto L92
                    java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L8e
                    java.lang.String r0 = "SMSInputViewHolderV2.sendCode("
                    r3.append(r0)     // Catch: java.lang.Exception -> L8e
                    r3.append(r13)     // Catch: java.lang.Exception -> L8e
                    java.lang.String r0 = ")@@@["
                    r3.append(r0)     // Catch: java.lang.Exception -> L8e
                    T extends X.0XTe r0 = r13.LJIIIZ     // Catch: java.lang.Exception -> L8e
                    X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L8e
                    java.lang.String r2 = "has_sms_permission"
                    java.lang.String r1 = "data"
                    if (r0 == 0) goto L5c
                    goto L5e
                L5c:
                    r0 = 0
                    goto L6c
                L5e:
                    org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L5c
                    org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L5c
                    java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L8e
                L6c:
                    r3.append(r0)     // Catch: java.lang.Exception -> L8e
                    r0 = 93
                    r3.append(r0)     // Catch: java.lang.Exception -> L8e
                    X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L8e
                    T extends X.0XTe r0 = r13.LJIIIZ     // Catch: java.lang.Exception -> L8e
                    X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L92
                    org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L92
                    org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L92
                    java.lang.String r8 = r0.optString(r2)     // Catch: java.lang.Exception -> L8e
                    if (r8 != 0) goto L94
                    goto L92
                L8e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L92:
                    java.lang.String r8 = ""
                L94:
                    X.0XeG r0 = X.C853660XeG.LIZ
                    r0.getClass()
                    long r0 = java.lang.System.currentTimeMillis()
                    X.C853660XeG.LIZIZ = r0
                    com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r5 = r12.LL
                    r6 = 1
                    T extends X.0XTe r0 = r13.LJIIIZ
                    java.lang.Boolean r7 = r0.LJFF
                    java.lang.String r9 = r2
                    java.lang.Boolean r10 = r3
                    java.lang.String r11 = r4
                    r5.LQ2(r6, r7, r8, r9, r10, r11)
                    X.C1C7U.LIZIZ(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1238910iLR.accept(java.lang.Object):void");
            }
        }).LJII(new AfS112S0300000_19(this, function02, function1, 0)).LJFF(new C1266060j3E(function0, (Function0<Unit>) 0)).LJIILL();
    }
}
