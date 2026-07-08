package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C0IJT;
import X.C0KAO;
import X.C0KCA;
import X.C0KCF;
import X.C0KDR;
import X.C0KHY;
import X.C0KIK;
import X.C0KIO;
import X.C0KJ7;
import X.C0KJX;
import X.C1390410mHn;
import X.C1826730xdX;
import X.C19EH;
import X.C474500IjA;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C513320KBe;
import X.C513380KBk;
import X.C513500KBw;
import X.C513550KCb;
import X.C513690KCp;
import X.C513970KDr;
import X.C514830KGz;
import X.C514900KHg;
import X.C515000KHq;
import X.C515460KJk;
import X.C517510KRh;
import X.C517520KRi;
import X.EnumC513390KBl;
import X.EnumC513410KBn;
import X.EnumC513810KDb;
import X.InterfaceC517590KRp;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.AppendPaymentStartLogParam;
import com.bytedance.android.livesdk.comp.impl.subscription.ClosePackagePage;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExHELIOSPTYlJyogO2sqJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhUtKiQyLyAcKCg2DCwtJSA0";
    public String LL;
    public PackagePageViewModel LLILLJJLI;
    public UpDowngradePackageViewModel LLILLL;
    public boolean LLIZLLLIL;
    public Boolean LLJ;
    public ViewGroup LLJI;
    public C1390410mHn LLJIJIL;
    public ViewStub LLJILJIL;
    public ViewGroup LLJILJILJ;
    public boolean LLJILLL;
    public Map<String, String> LLJJ;
    public EnumC513390KBl LLILZ = EnumC513390KBl.UNKNOWN;
    public final C513550KCb LLILZIL = new C513550KCb();
    public final Bundle LLILZLL = new Bundle();
    public C0KCF LLIZ = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);
    public long LLJJI = System.currentTimeMillis();
    public int LLJJIII = LSPassThroughRecordSizeConfig.DEFAULT;

    static {
        new C513690KCp();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    public final void OR() {
        C1390410mHn c1390410mHn = this.LLJIJIL;
        if (c1390410mHn != null) {
            C500260Jjc.LJIILIIL(c1390410mHn);
            c1390410mHn.LIZLLL();
        }
    }

    public final void UR() {
        String str = SubPackageMultiMonthFragment._pnsPageId;
        C0KCF c0kcf = this.LLIZ;
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        boolean z = this.LLIZLLLIL;
        Map<String, String> map = this.LLJJ;
        C0KIO c0kio = new C0KIO(this);
        SubPackageMultiMonthFragment subPackageMultiMonthFragment = new SubPackageMultiMonthFragment();
        subPackageMultiMonthFragment.LLILZ = c0kcf;
        subPackageMultiMonthFragment.LLILLJJLI = packagePageViewModel;
        subPackageMultiMonthFragment.LL = c0kio;
        subPackageMultiMonthFragment.LLILZLL = z;
        String str2 = c0kcf.LJIIIIZZ;
        if (str2 != null && map != null) {
            map.put("group_id", str2);
        }
        subPackageMultiMonthFragment.LLILZIL = map;
        subPackageMultiMonthFragment.setArguments(this.LLILZLL);
        RR(subPackageMultiMonthFragment);
        OR();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gbw);
        c500980Jkm.LIZJ = R.style.akj;
        c500980Jkm.LJII = 80;
        if (C513380KBk.LIZJ(this.LLILZIL.LIZJ)) {
            c500980Jkm.LJIIJ = -2;
        } else {
            EnumC513390KBl enumC513390KBl = this.LLILZ;
            if ((enumC513390KBl == EnumC513390KBl.PLAN_CHANGE_PAGE || C513380KBk.LIZLLL(enumC513390KBl)) && !C513380KBk.LIZIZ(this.LLILZIL.LIZJ)) {
                c500980Jkm.LJIIJJI = 73;
            } else {
                c500980Jkm.LJIIJJI = 60;
            }
        }
        Boolean bool = this.LLIZ.LJIIIZ;
        Boolean bool2 = Boolean.TRUE;
        c500980Jkm.LJI = (!Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.LLIZ.LJII, "others_homepage") || C513380KBk.LIZJ(this.LLILZIL.LIZJ) || Intrinsics.LJFF(this.LLJ, bool2)) ? 0.5f : 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        if (packagePageViewModel != null) {
            if (packagePageViewModel.LLILZ) {
                this.LLILZIL.LIZIZ = "iap_loading";
            } else if (packagePageViewModel.LLILLL) {
                this.LLILZIL.LIZIZ = "tpl_loading";
            }
        }
        C0KDR.LJIIIIZZ(System.currentTimeMillis() - this.LLJJI, this.LLIZ.LJII, this.LLJJ, this.LLILZIL.LIZIZ);
        if (Intrinsics.LJFF(this.LLIZ.LJIIIZ, Boolean.TRUE)) {
            C513500KBw.LJ();
        } else {
            ((LinkedHashMap) C513500KBw.LIZIZ).clear();
            C513500KBw.LIZJ = null;
        }
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(hashCode()));
        }
        C513970KDr.LIZ = "1";
        C513970KDr.LIZIZ = CardStruct.IStatusCode.DEFAULT;
    }

    public final void MR(boolean z) {
        String str;
        this.LLILZIL.LIZIZ = "tpl_loading";
        if (!C513380KBk.LIZLLL(this.LLILZ) && !C513380KBk.LIZIZ(this.LLILZIL.LIZJ)) {
            if (this.LLILZ == EnumC513390KBl.PLAN_CHANGE_PAGE) {
                C0KJX c0kjxLIZJ = C0KCA.LIZJ(this.LLIZ, null);
                UpDowngradePackageViewModel upDowngradePackageViewModel = this.LLILLL;
                if (upDowngradePackageViewModel != null) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_fetch");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJIIZI(this.LLJJ);
                    c474500IjALIZ.LJJII(this.LLIZ.LJII, "show_entrance");
                    c474500IjALIZ.LJJII("sub_package_page_dialog.fetch_plan_change", "trigger_component");
                    if (z) {
                        str = "retry";
                    } else {
                        str = "init";
                    }
                    c474500IjALIZ.LJJII(str, "fetch_phase");
                    c474500IjALIZ.LIZ();
                    if (c0kjxLIZJ != null) {
                        upDowngradePackageViewModel.LLILLJJLI.setValue(c0kjxLIZJ);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        NR(C0KCA.LIZJ(this.LLIZ, null), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(final X.C515430KJh r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog.PR(X.0KJh):void");
    }

    public final void RR(Fragment fragment) {
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.eqx, fragment, getTag());
            c19ehLJIIJ.LJIIIZ();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void SR(EnumC513410KBn enumC513410KBn) {
        C0KCF c0kcf = this.LLIZ;
        Map<String, String> map = this.LLJJ;
        C0KIK c0kik = new C0KIK(this);
        SubPackageMultiAccountGuideFragment subPackageMultiAccountGuideFragment = new SubPackageMultiAccountGuideFragment();
        subPackageMultiAccountGuideFragment.LLILLJJLI = c0kcf;
        subPackageMultiAccountGuideFragment.LLJI = c0kik;
        subPackageMultiAccountGuideFragment.LL = enumC513410KBn;
        subPackageMultiAccountGuideFragment.LLILLL = map;
        subPackageMultiAccountGuideFragment.setArguments(this.LLILZLL);
        RR(subPackageMultiAccountGuideFragment);
        OR();
    }

    public final void VR(EnumC513410KBn enumC513410KBn) {
        int i = C513320KBe.LIZ[enumC513410KBn.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4 || i == 5) {
                SR(enumC513410KBn);
            }
        } else {
            C0KCF c0kcf = this.LLIZ;
            Map<String, String> map = this.LLJJ;
            String str = this.LL;
            C515460KJk c515460KJk = new C515460KJk(this);
            C0KJ7 c0kj7 = new C0KJ7(this);
            SubPackageRenewalSpecialStatusFragment subPackageRenewalSpecialStatusFragment = new SubPackageRenewalSpecialStatusFragment();
            subPackageRenewalSpecialStatusFragment.LLILLL = c0kcf;
            subPackageRenewalSpecialStatusFragment.LLJIJIL = c0kj7;
            subPackageRenewalSpecialStatusFragment.LLILLJJLI = enumC513410KBn;
            subPackageRenewalSpecialStatusFragment.LLILZ = map;
            subPackageRenewalSpecialStatusFragment.LLJILJIL = c515460KJk;
            if (str == null) {
                str = "";
            }
            subPackageRenewalSpecialStatusFragment.LL = str;
            subPackageRenewalSpecialStatusFragment.setArguments(this.LLILZLL);
            RR(subPackageRenewalSpecialStatusFragment);
            OR();
        }
        OR();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            if (C513380KBk.LIZLLL(this.LLILZ)) {
                str = "Package";
            } else {
                str = "Upgrade";
            }
            interfaceC517590KRpLIZJ.LJIIIIZZ(str, new C517510KRh(hashCode(), this.LLIZ.LJII, this.LLJJIII));
        }
        View view = getView();
        if (view != null) {
            view.findViewById(R.id.bn7);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.findViewById(R.id.hoq);
        }
    }

    public final void NR(C0KJX c0kjx, boolean z) {
        String str;
        PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
        if (packagePageViewModel != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_fetch");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(this.LLJJ);
            c474500IjALIZ.LJJII(this.LLIZ.LJII, "show_entrance");
            c474500IjALIZ.LJJII("sub_package_page_dialog.fetch_package_page", "trigger_component");
            if (z) {
                str = "retry";
            } else {
                str = "init";
            }
            c474500IjALIZ.LJJII(str, "fetch_phase");
            c474500IjALIZ.LIZ();
            if (c0kjx != null) {
                packagePageViewModel.LLILLJJLI.setValue(c0kjx);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C514900KHg> liveData;
        LiveData<C514900KHg> liveData2;
        MediatorLiveData<C514830KGz> mediatorLiveData;
        MutableLiveData<EnumC513810KDb> mutableLiveData;
        MutableLiveData<EnumC513810KDb> mutableLiveData2;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (PackagePageViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory() { // from class: X.0KH6
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new PackagePageViewModel();
            }
        }).get(PackagePageViewModel.class);
        UpDowngradePackageViewModel upDowngradePackageViewModel = (UpDowngradePackageViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory() { // from class: X.0KH7
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new UpDowngradePackageViewModel();
            }
        }).get(UpDowngradePackageViewModel.class);
        this.LLILLL = upDowngradePackageViewModel;
        if (upDowngradePackageViewModel != null) {
            upDowngradePackageViewModel.LLILZIL = new C0KAO(this);
        }
        MR(false);
        C1390410mHn c1390410mHn = (C1390410mHn) view.findViewById(R.id.pxr);
        this.LLJIJIL = c1390410mHn;
        if (c1390410mHn != null) {
            C500260Jjc.LLFFF(c1390410mHn);
            c1390410mHn.LIZJ();
        }
        this.LLJILJIL = (ViewStub) view.findViewById(R.id.pxl);
        if (C513380KBk.LIZJ(this.LLILZIL.LIZJ)) {
            VR(this.LLILZIL.LIZJ);
        } else {
            EnumC513390KBl enumC513390KBl = this.LLILZ;
            if (enumC513390KBl == EnumC513390KBl.PLAN_CHANGE_PAGE) {
                UpDowngradePackageViewModel upDowngradePackageViewModel2 = this.LLILLL;
                if (upDowngradePackageViewModel2 != null && (mediatorLiveData = upDowngradePackageViewModel2.LLILZLL) != null) {
                    mediatorLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KG7
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            Integer numValueOf;
                            C514830KGz value;
                            String str;
                            LiveData<C514900KHg> liveData3;
                            C514900KHg value2;
                            C0KH1 c0kh1;
                            TemplateInfo templateInfo;
                            C514830KGz c514830KGz = (C514830KGz) obj;
                            SubPackagePageDialog subPackagePageDialog = this.LL;
                            if (subPackagePageDialog.isViewValid && c514830KGz.LJFF && c514830KGz.LJ) {
                                Map<String, String> map = subPackagePageDialog.LLJJ;
                                if (map != null) {
                                    map.put("show_entrance", subPackagePageDialog.LLIZ.LJII);
                                    map.put("package_quantity", String.valueOf(c514830KGz.LIZ.size()));
                                    map.put("anchor_id", subPackagePageDialog.LLIZ.LIZIZ);
                                }
                                C515430KJh c515430KJh = c514830KGz.LIZIZ;
                                if (c515430KJh != null) {
                                    numValueOf = Integer.valueOf(c515430KJh.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                C0KCA.LJFF(numValueOf, c514830KGz.LIZ.size(), this.LL.LLILZIL, c514830KGz.LIZJ);
                                if (C513380KBk.LIZIZ(this.LL.LLILZIL.LIZJ)) {
                                    SubPackagePageDialog subPackagePageDialog2 = this.LL;
                                    PackagePageViewModel packagePageViewModel = subPackagePageDialog2.LLILLJJLI;
                                    if (packagePageViewModel != null && (liveData3 = packagePageViewModel.LLILZIL) != null && (value2 = liveData3.getValue()) != null && (c0kh1 = value2.LIZJ) != null && (templateInfo = c0kh1.LIZLLL) != null) {
                                        str = templateInfo.iapId;
                                    } else {
                                        str = null;
                                    }
                                    subPackagePageDialog2.LL = str;
                                    SubPackagePageDialog subPackagePageDialog3 = this.LL;
                                    subPackagePageDialog3.NR(C0KCA.LIZJ(subPackagePageDialog3.LLIZ, null), false);
                                    return;
                                }
                                if (c514830KGz.LIZ.size() > 0) {
                                    SubPackagePageDialog subPackagePageDialog4 = this.LL;
                                    subPackagePageDialog4.getClass();
                                    C0KCF c0kcf = subPackagePageDialog4.LLIZ;
                                    UpDowngradePackageViewModel upDowngradePackageViewModel3 = subPackagePageDialog4.LLILLL;
                                    boolean z = subPackagePageDialog4.LLIZLLLIL;
                                    Map<String, String> map2 = subPackagePageDialog4.LLJJ;
                                    C0KJ8 c0kj8 = new C0KJ8(subPackagePageDialog4);
                                    SubUpdowngradePackageFragment subUpdowngradePackageFragment = new SubUpdowngradePackageFragment();
                                    subUpdowngradePackageFragment.LLILZ = c0kcf;
                                    subUpdowngradePackageFragment.LLILLJJLI = upDowngradePackageViewModel3;
                                    subUpdowngradePackageFragment.LL = c0kj8;
                                    subUpdowngradePackageFragment.LLILZLL = z;
                                    subUpdowngradePackageFragment.LLILZIL = map2;
                                    subPackagePageDialog4.RR(subUpdowngradePackageFragment);
                                    subPackagePageDialog4.OR();
                                    return;
                                }
                                this.LL.PR(c514830KGz.LIZIZ);
                                UpDowngradePackageViewModel upDowngradePackageViewModel4 = this.LL.LLILLL;
                                if (upDowngradePackageViewModel4 == null || (value = upDowngradePackageViewModel4.LLILZLL.getValue()) == null) {
                                    return;
                                }
                                value.LJFF = false;
                                value.LJ = false;
                            }
                        }
                    });
                }
                PackagePageViewModel packagePageViewModel = this.LLILLJJLI;
                if (packagePageViewModel != null && (liveData2 = packagePageViewModel.LLILZIL) != null) {
                    liveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KGK
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            Integer numValueOf;
                            Window window;
                            C514900KHg c514900KHg = (C514900KHg) obj;
                            if (this.LL.isViewValid) {
                                C515430KJh c515430KJh = c514900KHg.LIZIZ;
                                if (c515430KJh != null) {
                                    numValueOf = Integer.valueOf(c515430KJh.LIZIZ);
                                } else {
                                    numValueOf = null;
                                }
                                C0KCA.LJFF(numValueOf, c514900KHg.LIZ.size(), this.LL.LLILZIL, c514900KHg.LIZJ);
                                if (C513380KBk.LIZIZ(this.LL.LLILZIL.LIZJ)) {
                                    SubPackagePageDialog subPackagePageDialog = this.LL;
                                    subPackagePageDialog.VR(subPackagePageDialog.LLILZIL.LIZJ);
                                } else {
                                    if (!C513380KBk.LIZJ(this.LL.LLILZIL.LIZJ)) {
                                        return;
                                    }
                                    SubPackagePageDialog subPackagePageDialog2 = this.LL;
                                    subPackagePageDialog2.SR(subPackagePageDialog2.LLILZIL.LIZJ);
                                    Dialog dialog = this.LL.getDialog();
                                    if (dialog == null || (window = dialog.getWindow()) == null) {
                                        return;
                                    }
                                    window.setLayout(-2, -2);
                                }
                            }
                        }
                    });
                }
            } else if (C513380KBk.LIZLLL(enumC513390KBl)) {
                PackagePageViewModel packagePageViewModel2 = this.LLILLJJLI;
                if (packagePageViewModel2 != null && (liveData = packagePageViewModel2.LLILZIL) != null) {
                    liveData.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KG5
                        /* JADX WARN: Removed duplicated region for block: B:111:0x0239  */
                        @Override // androidx.lifecycle.Observer
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onChanged(java.lang.Object r13) {
                            /*
                                Method dump skipped, instruction units count: 574
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0KG5.onChanged(java.lang.Object):void");
                        }
                    });
                }
            } else {
                PR(null);
            }
        }
        PackagePageViewModel packagePageViewModel3 = this.LLILLJJLI;
        if (packagePageViewModel3 != null && (mutableLiveData2 = packagePageViewModel3.LLJIJIL) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KHO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean zLJIIJ = C513940KDo.LJIIJ((EnumC513810KDb) obj);
                    Dialog dialog = this.LL.getDialog();
                    if (dialog != null) {
                        dialog.setCanceledOnTouchOutside(!zLJIIJ);
                    }
                }
            });
        }
        UpDowngradePackageViewModel upDowngradePackageViewModel3 = this.LLILLL;
        if (upDowngradePackageViewModel3 != null && (mutableLiveData = upDowngradePackageViewModel3.LLJI) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0KHP
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean zLJIIJ = C513940KDo.LJIIJ((EnumC513810KDb) obj);
                    Dialog dialog = this.LL.getDialog();
                    if (dialog != null) {
                        dialog.setCanceledOnTouchOutside(!zLJIIJ);
                    }
                }
            });
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, AppendPaymentStartLogParam.class, new C515000KHq(this));
        DataChannelGlobal.LLILZ.BQ2(this, this, ClosePackagePage.class, new C0KHY(this));
    }
}
