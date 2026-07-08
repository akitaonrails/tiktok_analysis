package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.C0HTI;
import X.C10SV;
import X.C1308910kAL;
import X.C14KQ;
import X.C19258510Vz;
import X.C19299010eq;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class NUJPreLoginAgeRangeFragment extends TTKRegistrationBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2LyQ4LGEwPTHELIOSY4JiI3KTEtLyAhOyEnZwEGAhU+LAM8LywiCCg2GiQiLioVOiQrJCo9PA==";
    public ImageView LLJLLIL;
    public LinearLayout LLJLLL;
    public TuxTextView LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public final Map<String, String> LLL = new LinkedHashMap(RegistrationAgeGateServiceImpl.LIZJ);

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void Kz(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void NS(String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void jF(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void qh() {
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void VS() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View view = getView();
        if (view != null && (viewFindViewById4 = view.findViewById(R.id.aka)) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 20), viewFindViewById4);
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.ak8)) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 21), viewFindViewById3);
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.ak9)) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 22), viewFindViewById2);
        }
        View view4 = getView();
        if (view4 == null || (viewFindViewById = view4.findViewById(R.id.ak_)) == null) {
            return;
        }
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 23), viewFindViewById);
    }

    public final void iT() {
        Context context;
        C19EG activity = getActivity();
        if (activity != null) {
            View view = getView();
            Integer numLIZJ = (view == null || (context = view.getContext()) == null) ? null : C1308910kAL.LIZJ(R.attr.zn, context);
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(activity);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LIZ(true);
            if (numLIZJ != null) {
                tuxImmersionBar.LJFF(numLIZJ.intValue());
            } else {
                tuxImmersionBar.LJ(R.attr.zn);
            }
            tuxImmersionBar.LIZLLL();
            if (Build.VERSION.SDK_INT >= 29) {
                activity.getWindow().setNavigationBarContrastEnforced(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        iT();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    public final void FS(String str) {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ak4);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLIL = (ImageView) viewFindViewById;
        }
        ImageView imageView = (ImageView) viewFindViewById;
        if (imageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.wj;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void US(X.C19299010eq r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L5
            java.lang.String r0 = r5.title
        L5:
            if (r0 == 0) goto L41
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L41
            r0 = 0
        Le:
            r1 = 8
            if (r0 == 0) goto L3b
            com.bytedance.tux.input.TuxTextView r0 = r4.WR()
            X.C786410Ut5.LLLLZLL(r0, r1)
            if (r5 == 0) goto L33
        L1b:
            java.lang.String r0 = r5.contentDesc
            if (r0 == 0) goto L33
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L33
            java.lang.String r1 = r5.contentDesc
            java.util.List<com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink> r0 = r5.hyperLinks
            r4.BS(r1, r0)
        L2c:
            X.19EG r3 = r4.getActivity()
            if (r3 != 0) goto L43
            return
        L33:
            com.bytedance.tux.input.TuxTextView r0 = r4.VR()
            X.C786410Ut5.LLLLZLL(r0, r1)
            goto L2c
        L3b:
            java.lang.String r0 = r5.title
            r4.PS(r0)
            goto L1b
        L41:
            r0 = 1
            goto Le
        L43:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131848254(0x7f116c3e, float:1.9330008E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131848252(0x7f116c3c, float:1.9330004E38)
            java.lang.String r0 = r1.getString(r0)
            r4.RS(r3, r0, r2)
            com.bytedance.tux.input.TuxTextView r2 = r4.nS()
            Y.ACListenerS162S0100000_28 r1 = new Y.ACListenerS162S0100000_28
            r0 = 19
            r1.<init>(r4, r0)
            X.C786410Ut5.h9(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.NUJPreLoginAgeRangeFragment.US(X.10eq):void");
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, X.C10WS
    public final void lu(C19299010eq c19299010eq) {
        if (c19299010eq == null) {
            return;
        }
        US(c19299010eq);
        FS(c19299010eq.imageUrl);
    }

    public final void jT(Integer num, Integer num2) {
        gT();
        sS().LLILZIL.postValue(new C19258510Vz(num, num2, "age_gate"));
        sS().LLILLJJLI.postValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C197039127h c197039127h;
        C197039127h c197039127h2;
        C197039127h c197039127h3;
        C197039127h c197039127h4;
        View view2 = getView();
        if (view2 != null && (c197039127h4 = (C197039127h) view2.findViewById(R.id.aka)) != null) {
            c197039127h4.setBackgroundRadius(8);
        }
        View view3 = getView();
        if (view3 != null && (c197039127h3 = (C197039127h) view3.findViewById(R.id.ak8)) != null) {
            c197039127h3.setBackgroundRadius(8);
        }
        View view4 = getView();
        if (view4 != null && (c197039127h2 = (C197039127h) view4.findViewById(R.id.ak9)) != null) {
            c197039127h2.setBackgroundRadius(8);
        }
        View view5 = getView();
        if (view5 != null && (c197039127h = (C197039127h) view5.findViewById(R.id.ak_)) != null) {
            c197039127h.setBackgroundRadius(8);
        }
        VS();
        View viewFindViewById = null;
        US(null);
        iT();
        Context context = getContext();
        if (context != null) {
            int iLJ = C14KQ.LJ(context);
            if (C14KQ.LJIIIIZZ(context) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) && iLJ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640))) {
                View viewFindViewById2 = this.LLJLLIL;
                if (viewFindViewById2 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById2 = view6.findViewById(R.id.ak4);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJLLIL = (ImageView) viewFindViewById2;
                }
                ImageView imageView = (ImageView) viewFindViewById2;
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                View viewFindViewById3 = this.LLJLLL;
                if (viewFindViewById3 == null) {
                    View view7 = getView();
                    if (view7 != null) {
                        viewFindViewById3 = view7.findViewById(R.id.ajy);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJLLL = (LinearLayout) viewFindViewById3;
                }
                if (viewFindViewById3 != null) {
                    C426750GoL.LJIIIZ(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
                }
                TuxTextView tuxTextViewWR = WR();
                if (tuxTextViewWR != null) {
                    tuxTextViewWR.setTuxFont(13);
                    tuxTextViewWR.LJJJJI(24.0f);
                    C426750GoL.LJIIIZ(tuxTextViewWR, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, false, 26);
                }
                View viewFindViewById4 = this.LLJZIJLIL;
                if (viewFindViewById4 == null) {
                    View view8 = getView();
                    if (view8 != null) {
                        viewFindViewById4 = view8.findViewById(R.id.akc);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLJZIJLIL = (ConstraintLayout) viewFindViewById4;
                }
                if (viewFindViewById4 != null) {
                    C426750GoL.LJIIIZ(viewFindViewById4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, false, 29);
                }
                TuxTextView tuxTextViewVR = VR();
                if (tuxTextViewVR != null) {
                    tuxTextViewVR.setTuxFont(51);
                    tuxTextViewVR.LJJJJI(14.0f);
                    C426750GoL.LJIIIZ(tuxTextViewVR, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 21);
                }
                View view9 = this.LLJZ;
                if (view9 == null) {
                    View view10 = getView();
                    if (view10 != null) {
                        viewFindViewById = view10.findViewById(R.id.npc);
                    }
                    this.LLJZ = (TuxTextView) viewFindViewById;
                    view9 = viewFindViewById;
                }
                if (view9 != null) {
                    C426750GoL.LJIIIZ(view9, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
                }
            }
        }
        this.LLL.put("age_select_option", "below 13, 13-15, 16-17, 18+");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LLL);
        C10SV.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("age_gate_registration_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L35
        Le:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r5.getContext()
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.setTheme(r0)
        L1a:
            r0 = 2131559052(0x7f0d028c, float:1.8743437E38)
            android.view.View r3 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L27
            r3 = r2
        L27:
            if (r3 == 0) goto L55
            goto L37
        L2a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886939(0x7f12035b, float:1.940847E38)
            r1.setTheme(r0)
            goto L1a
        L35:
            r0 = 0
            goto Le
        L37:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5b
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L52
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5b
        L52:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.NUJPreLoginAgeRangeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
