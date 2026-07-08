package com.ss.android.ugc.aweme.relation.consent;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0XQ7;
import X.C1072510e13;
import X.C1072630e1F;
import X.C1072640e1G;
import X.C11NZ;
import X.C11S5;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13IQ;
import X.C13LE;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1072920e1i;
import X.EnumC1074240e3q;
import X.InterfaceC1740760vOs;
import Y.AfS185S0100000_16;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialConsentFragment extends JediBaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISHELIOSoiZyw8JjYpJzt9GyovIC4/CyoiOio9PAM+KCg+LSs4";
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public C197039127h LLILZ;
    public C1749280vcc LLILZIL;
    public TuxIconView LLILZLL;
    public final lifecycleAwareLazy LLIZ;
    public SocialConsentConfig LLIZLLLIL;
    public final C01GW LLJ;

    public SocialConsentFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialRecRequestViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 491);
        this.LLIZ = new lifecycleAwareLazy(this, awS560S0100000_16, new AwS145S0400000_16(this, awS560S0100000_16, c19719912DlLIZ, AFwS300S0000000_16.get$arr$(64), 6));
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 490));
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2140";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eph) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.epj) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.epk) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SocialRecRequestViewModel SR() {
        return (SocialRecRequestViewModel) this.LLIZ.getValue();
    }

    public final SocialRecFlowModel UR() {
        return (SocialRecFlowModel) this.LLJ.getValue();
    }

    public final void VR() {
        MediatorLiveData<Bundle> mediatorLiveData;
        SocialRecFlowModel socialRecFlowModelUR = UR();
        if (socialRecFlowModelUR == null || (mediatorLiveData = socialRecFlowModelUR.LLILLJJLI) == null) {
            return;
        }
        mediatorLiveData.postValue(new Bundle());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SocialConsentFragment.class.getName());
        }
        super.onResume();
        C2211631BhB.LJIIL(this, getActivity());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        SocialConsentConfig socialConsentConfig = this.LLIZLLLIL;
        if ((socialConsentConfig == null ? null : socialConsentConfig).socialRecType == 3) {
            C1072510e13 c1072510e13 = C1072510e13.LIZ;
            if (socialConsentConfig == null) {
                socialConsentConfig = null;
            }
            String str = socialConsentConfig.step == EnumC1072920e1i.NEW_VERSION_FACEBOOK.getValue() ? "facebook" : "contact";
            c1072510e13.getClass();
            C1072510e13.LIZJ(str, "background");
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(int r5) {
        /*
            r4 = this;
            X.0e13 r0 = X.C1072510e13.LIZ
            r0.getClass()
            java.lang.String r0 = "skip"
            X.C1072510e13.LIZ(r5, r0)
            boolean r3 = X.C1072930e1j.LIZLLL()
            com.bytedance.keva.Keva r2 = X.C1072930e1j.LIZIZ
            java.lang.String r1 = "key_check_status"
            java.lang.String r0 = "value_check_start"
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = "value_check_hasdata"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L2b
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r4.UR()
            r1 = 0
            if (r0 == 0) goto L2c
            boolean r0 = r0.LLILZ
            if (r0 == 0) goto L2c
        L2b:
            r1 = 1
        L2c:
            X.0e1i r0 = X.EnumC1072920e1i.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r5 != r0) goto L60
            if (r3 == 0) goto L57
            X.0e1i r0 = X.EnumC1072920e1i.NEW_VERSION_CONTACT
            int r0 = r0.getValue()
        L3c:
            if (r0 <= 0) goto L69
            X.0e3i r1 = new X.0e3i
            r4.UR()
            r4.UR()
            r1.<init>()
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r4.UR()
            if (r0 == 0) goto L56
            androidx.lifecycle.MediatorLiveData<X.0e3i> r0 = r0.LL
            if (r0 == 0) goto L56
            r0.postValue(r1)
        L56:
            return
        L57:
            if (r1 == 0) goto L69
            X.0e1i r0 = X.EnumC1072920e1i.NEW_VERSION_RECOMMEND
            int r0 = r0.getValue()
            goto L3c
        L60:
            if (r1 == 0) goto L69
            X.0e1i r0 = X.EnumC1072920e1i.NEW_VERSION_RECOMMEND
            int r0 = r0.getValue()
            goto L3c
        L69:
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r4.UR()
            if (r0 == 0) goto L56
            androidx.lifecycle.MediatorLiveData<android.os.Bundle> r1 = r0.LLILLJJLI
            if (r1 == 0) goto L56
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment.MR(int):void");
    }

    public final void NR(boolean z) {
        SocialConsentConfig socialConsentConfig;
        int i;
        int i2;
        String str;
        SocialConsentConfig socialConsentConfig2 = this.LLIZLLLIL;
        SocialConsentConfig socialConsentConfig3 = null;
        if (socialConsentConfig2 == null) {
            socialConsentConfig = null;
        } else {
            socialConsentConfig = socialConsentConfig2;
        }
        if (socialConsentConfig.socialRecType == 3) {
            if (z) {
                if (socialConsentConfig2 == null) {
                    socialConsentConfig2 = null;
                }
                if (socialConsentConfig2.step == EnumC1072920e1i.NEW_VERSION_FACEBOOK.getValue()) {
                    SocialRecFlowModel socialRecFlowModelUR = UR();
                    if (socialRecFlowModelUR != null) {
                        socialRecFlowModelUR.LLILZLL = "2";
                    }
                } else {
                    SocialRecFlowModel socialRecFlowModelUR2 = UR();
                    if (socialRecFlowModelUR2 == null || (str = socialRecFlowModelUR2.LLILZLL) == null) {
                        str = "";
                    }
                    SocialRecFlowModel socialRecFlowModelUR3 = UR();
                    if (socialRecFlowModelUR3 != null) {
                        if (TextUtils.isEmpty(str)) {
                            str = "1";
                        } else if (TextUtils.equals("2", str)) {
                            str = "1,2";
                        }
                        socialRecFlowModelUR3.LLILZLL = str;
                    }
                }
            }
            SocialConsentConfig socialConsentConfig4 = this.LLIZLLLIL;
            if (socialConsentConfig4 != null) {
                socialConsentConfig3 = socialConsentConfig4;
            }
            int i3 = socialConsentConfig3.step;
            C19EG activity = getActivity();
            if (activity != null) {
                SocialRecFlowModel socialRecFlowModelUR4 = UR();
                if (socialRecFlowModelUR4 != null && !socialRecFlowModelUR4.LLILLL) {
                    SocialRecFlowModel socialRecFlowModelUR5 = UR();
                    if (socialRecFlowModelUR5 != null) {
                        socialRecFlowModelUR5.LLILLL = true;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    EnumC1072920e1i enumC1072920e1i = EnumC1072920e1i.NEW_VERSION_FACEBOOK;
                    if (i3 == enumC1072920e1i.getValue()) {
                        i = 2131834452;
                    } else {
                        i = 2131829477;
                    }
                    c1397580mTM.LJFF(i);
                    if (i3 == enumC1072920e1i.getValue()) {
                        i2 = 2131834451;
                    } else {
                        i2 = 2131829476;
                    }
                    c1397580mTM.LIZ(i2);
                    C985403tE.LIZ(c1397580mTM, new AwS124S0101000_16(i3, this, 5));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                MR(i3);
                return;
            }
            return;
        }
        VR();
    }

    public final void WR(int i, int i2) {
        if (TextUtils.isEmpty(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            VR();
            return;
        }
        SocialRecRequestViewModel socialRecRequestViewModelSR = SR();
        socialRecRequestViewModelSR.getClass();
        if (i == 3) {
            if (i2 == EnumC1072920e1i.NEW_VERSION_CONTACT.getValue()) {
                C1072630e1F c1072630e1F = C1072630e1F.LIZ;
                if (c1072630e1F.LJ()) {
                    if (c1072630e1F.LIZIZ()) {
                        socialRecRequestViewModelSR.setState(AFwS252S0000000_16.get$arr$(420));
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        socialRecRequestViewModelSR.disposeOnClear(C11NZ.LJLJJLL(2L, timeUnit).LJJLJLI(new AfS185S0100000_16(socialRecRequestViewModelSR, 23)));
                        EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.NEW_VERSION;
                        C1072640e1G.LIZ.getClass();
                        socialRecRequestViewModelSR.disposeOnClear(C1072640e1G.LIZJ(enumC1074240e3q).LJLJI(5L, timeUnit).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(socialRecRequestViewModelSR, 21), new AfS185S0100000_16(socialRecRequestViewModelSR, 22)));
                        return;
                    }
                    socialRecRequestViewModelSR.hR2(i2);
                    return;
                }
                socialRecRequestViewModelSR.setState(AFwS252S0000000_16.get$arr$(421));
                return;
            }
            socialRecRequestViewModelSR.hR2(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0278  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_o, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
