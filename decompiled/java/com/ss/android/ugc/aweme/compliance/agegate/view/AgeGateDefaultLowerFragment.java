package com.ss.android.ugc.aweme.compliance.agegate.view;

import X.C01GW;
import X.C098200Yq;
import X.C0I7D;
import X.C10WW;
import X.C10WY;
import X.C1308910kAL;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C189200o6;
import X.C19298010eg;
import X.C19318110hv;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC19298210ei;
import Y.ACListenerS162S0100000_28;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateDefaultLowerFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateDefaultLowerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateDefaultLowerFragment extends AgeGateBaseLowerFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KSIpHELIOSLi4nLWs6ICokZgQrLAgyPCAILCkyPSk4BSAkLTcKOy40JSAiPQ==";
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public C197039127h LLILZ;
    public C19318110hv LLILZIL;
    public TuxTextView LLILZLL;
    public LinearLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public EditText LLJ;
    public C0I7D LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    public AgeGateDefaultLowerFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData MR() {
        return ((AgeGateDefaultLowerViewModel) this.LLJJ.getValue()).LL;
    }

    public final C19318110hv WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajs) : null;
            this.LLILZIL = (C19318110hv) viewFindViewById;
        }
        return (C19318110hv) viewFindViewById;
    }

    public final EditText ZR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajv) : null;
            this.LLJ = (EditText) viewFindViewById;
        }
        return (EditText) viewFindViewById;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajx) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData<Unit> bJ() {
        return ((AgeGateDefaultLowerViewModel) this.LLJJ.getValue()).LLILLL;
    }

    public final C197039127h bS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak1) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxIconView cS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak5) : null;
            this.LLIZLLLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final LinearLayout dS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak6) : null;
            this.LLIZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final LiveData iz() {
        return ((AgeGateDefaultLowerViewModel) this.LLJJ.getValue()).LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r6 = this;
            super.onDestroy()
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r0 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L28
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L28
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r3 = r1.LJIJJ(r0)
            if (r3 != 0) goto L30
        L28:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r3 = X.C786410Ut5.t2(r0)
        L30:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r0 = X.C2222691Bz1.LIZ()
            r1.<init>(r3, r0)
            java.lang.String r1 = X.C10WW.LIZJ(r1)
            java.lang.String r0 = "default_format"
            r2.put(r0, r1)
            int r0 = r6.LLJIJIL
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "day"
            r2.put(r0, r1)
            int r0 = r6.LLJILJIL
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "month"
            r2.put(r0, r1)
            int r0 = r6.LLJILJILJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "year"
            r2.put(r0, r1)
            int r3 = r6.LLJIJIL
            int r1 = r6.LLJILJIL
            int r0 = r6.LLJILJILJ
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "selected_cnt"
            r2.put(r0, r1)
            boolean r0 = r6.LLJILLL
            if (r0 == 0) goto Lb1
            java.lang.String r1 = "1"
        L85:
            java.lang.String r0 = "is_submit"
            r2.put(r0, r1)
            X.01GW r0 = r6.LLJJI
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "user_type"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "edit"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lae
            java.lang.String r1 = "age_edit_scroll_results"
        La2:
            X.01GW r0 = r6.LLJJI
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            X.C19298010eg.LJ(r1, r2, r0)
            return
        Lae:
            java.lang.String r1 = "age_scroll_result"
            goto La2
        Lb1:
            java.lang.String r1 = "0"
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateDefaultLowerFragment.onDestroy():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((AgeGateDefaultLowerViewModel) this.LLJJ.getValue()).LLILLJJLI.postValue(Boolean.FALSE);
    }

    public /* synthetic */ AgeGateDefaultLowerFragment(int i) {
        this("", true, -1);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void Kz(boolean z) {
        bS().setEnabled(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void NR(boolean z) {
        int i;
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ajz);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C0I7D) viewFindViewById;
        }
        C0I7D c0i7d = (C0I7D) viewFindViewById;
        if (c0i7d != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLZL(c0i7d, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void OR(Date date) {
        WR().LIZIZ(date);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void PR(String str) {
        EditText editTextZR = ZR();
        if (editTextZR != null) {
            editTextZR.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void RR(String str) {
        EditText editTextZR = ZR();
        if (editTextZR != null) {
            editTextZR.setHint(str);
            editTextZR.setInputType(0);
            editTextZR.setTypeface(Typeface.DEFAULT);
            editTextZR.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void SR(String str) {
        C197039127h c197039127hBS = bS();
        if (c197039127hBS != null) {
            c197039127hBS.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void UR(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        WR().setUpperBoundDate(calendar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void er(String str) {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ajz);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C0I7D) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void jF(boolean z) {
        bS().setLoading(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateBaseLowerFragment
    public final void VR(String str, boolean z) {
        cS().setColorFilter(-65536, PorterDuff.Mode.SRC_IN);
        C786410Ut5.LJZL(0, dS());
        aS().setText(str);
        if (z) {
            LinearLayout linearLayoutDS = dS();
            Context context = getContext();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.playSequentially(ObjectAnimator.ofFloat(linearLayoutDS, "translationX", 0.0f, -C10WW.LIZIZ(6.0d, context)).setDuration(80L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", -C10WW.LIZIZ(6.0d, context), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", 0.0f, -C10WW.LIZIZ(4.0d, context)).setDuration(60L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", -C10WW.LIZIZ(4.0d, context), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", 0.0f, -C10WW.LIZIZ(2.0d, context)).setDuration(40L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", -C10WW.LIZIZ(2.0d, context), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", 0.0f, -C10WW.LIZIZ(1.0d, context)).setDuration(20L), ObjectAnimator.ofFloat(linearLayoutDS, "translationX", -C10WW.LIZIZ(1.0d, context), 0.0f).setDuration(20L));
            animatorSet.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        C197039127h c197039127hBS = bS();
        if (c197039127hBS != null) {
            C786410Ut5.U8(c197039127hBS, new ACListenerS162S0100000_28(this, 36));
        }
        C19318110hv c19318110hvWR = WR();
        if (c19318110hvWR != null) {
            c19318110hvWR.LLIZ = new InterfaceC19298210ei() { // from class: X.10eh
                @Override // X.InterfaceC19298210ei
                public final void LIZ(Calendar calendar, int i) {
                    Date time;
                    MutableLiveData<Date> mutableLiveData = ((AgeGateDefaultLowerViewModel) this.LIZ.LLJJ.getValue()).LL;
                    if (calendar != null) {
                        time = calendar.getTime();
                    } else {
                        time = null;
                    }
                    mutableLiveData.postValue(time);
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                AgeGateDefaultLowerFragment ageGateDefaultLowerFragment = this.LIZ;
                                if (ageGateDefaultLowerFragment.LLJIJIL == 0) {
                                    ageGateDefaultLowerFragment.LLJIJIL = Math.max(ageGateDefaultLowerFragment.LLJILJIL, ageGateDefaultLowerFragment.LLJILJILJ) + 1;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        AgeGateDefaultLowerFragment ageGateDefaultLowerFragment2 = this.LIZ;
                        if (ageGateDefaultLowerFragment2.LLJILJIL != 0) {
                            return;
                        }
                        ageGateDefaultLowerFragment2.LLJILJIL = Math.max(ageGateDefaultLowerFragment2.LLJIJIL, ageGateDefaultLowerFragment2.LLJILJILJ) + 1;
                        return;
                    }
                    AgeGateDefaultLowerFragment ageGateDefaultLowerFragment3 = this.LIZ;
                    if (ageGateDefaultLowerFragment3.LLJILJILJ != 0) {
                        return;
                    }
                    ageGateDefaultLowerFragment3.LLJILJILJ = Math.max(ageGateDefaultLowerFragment3.LLJIJIL, ageGateDefaultLowerFragment3.LLJILJIL) + 1;
                }
            };
        }
        if ((!a0.LJJJIL(this.LL)) && this.LLILLJJLI != -1) {
            aS().setText(this.LL);
            C786410Ut5.LJZL(0, dS());
            C786410Ut5.LLLLLLZZ(cS(), 0);
            C786410Ut5.LLLLZLL(aS(), 0);
            int i = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error_type", String.valueOf(i));
            C19298010eg.LJ("age_edit_inegible_show", linkedHashMap, C2097608Jq.LJ());
            if (this.LLILLJJLI == C10WY.STATUS_TYPE_VERIFIED.getValue()) {
                cS().setIconRes(R.raw.icon_color_tick_circle_fill);
                TuxIconView tuxIconViewCS = cS();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nv, requireContext());
                if (numLIZJ != null) {
                    iIntValue3 = numLIZJ.intValue();
                } else {
                    iIntValue3 = 0;
                }
                tuxIconViewCS.setColorFilter(iIntValue3, PorterDuff.Mode.SRC_IN);
                aS().setTuxFont(51);
                TuxTextView tuxTextViewAS = aS();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nx, requireContext());
                if (numLIZJ2 != null) {
                    iIntValue4 = numLIZJ2.intValue();
                } else {
                    iIntValue4 = 0;
                }
                tuxTextViewAS.setTextColor(iIntValue4);
            } else {
                cS().setIconRes(R.raw.icon_exclamation_mark_circle);
                TuxIconView tuxIconViewCS2 = cS();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, requireContext());
                if (numLIZJ3 != null) {
                    iIntValue = numLIZJ3.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxIconViewCS2.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
                aS().setTuxFont(51);
                TuxTextView tuxTextViewAS2 = aS();
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1j, requireContext());
                if (numLIZJ4 != null) {
                    iIntValue2 = numLIZJ4.intValue();
                } else {
                    iIntValue2 = 0;
                }
                tuxTextViewAS2.setTextColor(iIntValue2);
            }
            C786410Ut5.N7(ZR(), new ACListenerS162S0100000_28(this, 193));
            if (this.LLILLJJLI == C10WY.STATUS_TYPE_UNKNOWN.getValue() && !this.LLILLL) {
                C19318110hv c19318110hvWR2 = WR();
                int visibility = c19318110hvWR2.getVisibility();
                c19318110hvWR2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c19318110hvWR2);
                return;
            }
            C19318110hv c19318110hvWR3 = WR();
            int visibility2 = c19318110hvWR3.getVisibility();
            c19318110hvWR3.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, c19318110hvWR3);
        }
    }

    public AgeGateDefaultLowerFragment(String str, boolean z, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1071));
        this.LLJJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(763));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxa, viewGroup, false);
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
