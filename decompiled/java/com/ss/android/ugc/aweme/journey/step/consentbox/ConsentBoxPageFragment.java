package com.ss.android.ugc.aweme.journey.step.consentbox;

import X.C098200Yq;
import X.C0HTI;
import X.C10NW;
import X.C1568170quV;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C189200o6;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19234110Mp;
import X.C19249910Sr;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C294580Bge;
import X.C418440Gaw;
import X.C426750GoL;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1740760vOs;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.DeviceConsentDisclaimerService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentDisclaimerServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ConsentBoxPageFragment extends NUJComponentFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2HELIOSOGsvJiEgLSs4KyArZgYjJzw2JjEOJjcDKSIpDz0yLygpJzs=";
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public ImageView LLJILJIL;
    public C197039127h LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public final String LLJJ = "consent_page";

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final String RR() {
        throw null;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b26316";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.epd) : null;
            this.LLJILJILJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.epm) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ImageView ZR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.k1e) : null;
            this.LLJILJIL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y3j) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public ConsentBoxPageFragment() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONSENT_BOX_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONSENT_BOX_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C1911410zq7.LIZ("ConsentBoxPageFragment", "onResume");
        C2211631BhB.LJIIL(this, getActivity());
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1911410zq7.LIZ("ConsentBoxPageFragment", "onStop");
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONSENT_BOX_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LIZLLL;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onCreate(bundle);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZLLL;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ConsentBoxConfig consentBoxConfigLJI;
        String str;
        Integer numValueOf;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONSENT_BOX_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        C1568170quV.LIZ(2380);
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", this.LLJJ);
        c19249910Sr.LIZIZ(c2344009Gk, "show_consent_box");
        C1848530yCh.LIZLLL(this, "page_consent_page", null);
        WR().setTuxFont(51);
        C786410Ut5.LLLLZLL(aS(), 0);
        C786410Ut5.LJZI(0, ZR());
        C19233810Mm c19233810Mm = C19233810Mm.LIZ;
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            TuxTextView tuxTextViewAS = aS();
            tuxTextViewAS.setTuxFont(123);
            tuxTextViewAS.LJJJJI(32.0f);
            tuxTextViewAS.setGravity(17);
            ViewGroup.LayoutParams layoutParams = tuxTextViewAS.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams3 = null;
            }
            if (marginLayoutParams3 != null) {
                C1911410zq7.LIZ("ConsentBoxPageFragment", "adjust margin");
                marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
                C786410Ut5.R6(aS(), marginLayoutParams3);
            }
            TuxTextView tuxTextViewWR = WR();
            if (tuxTextViewWR != null) {
                tuxTextViewWR.setGravity(17);
            }
            ImageView imageViewZR = ZR();
            if (imageViewZR != null) {
                C426750GoL.LJIIIZ(imageViewZR, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), null, null, false, 29);
                ViewGroup.LayoutParams layoutParams2 = imageViewZR.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(358));
                    marginLayoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
                    C786410Ut5.c6(ZR(), marginLayoutParams5);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = VR().getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                C1911410zq7.LIZ("ConsentBoxPageFragment", "adjust margin");
                marginLayoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                marginLayoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                C786410Ut5.J6(VR(), marginLayoutParams4);
            }
        } else {
            aS().LJJJJI(38.0f);
        }
        ImageView imageViewZR2 = ZR();
        if (imageViewZR2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.qh;
            imageViewZR2.setImageDrawable(c0hti.LIZ(imageViewZR2.getContext()));
        }
        DeviceConsentDisclaimerService deviceConsentDisclaimerServiceLIZJ = DeviceConsentDisclaimerServiceImpl.LIZJ();
        c19233810Mm.getClass();
        if (C19233810Mm.LIZ(C19234110Mp.class).LIZIZ("page_style", 0) == 1) {
            Context context = getContext();
            if (context != null) {
                numValueOf = Integer.valueOf(C960203pA.LIZ(R.attr.a1j, context));
            } else {
                numValueOf = null;
            }
            WR().setText(deviceConsentDisclaimerServiceLIZJ.LIZIZ(numValueOf, null, false));
        } else {
            WR().setText(deviceConsentDisclaimerServiceLIZJ.LIZIZ(null, null, false));
        }
        WR().setMovementMethod(LinkMovementMethod.getInstance());
        WR().setHighlightColor(0);
        VR().setText(deviceConsentDisclaimerServiceLIZJ.LIZ());
        if (C294580Bge.LIZ()) {
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                consentBoxConfigLJI = iPNSConsentConfigServiceLJIIIZ.LJI();
            } else {
                consentBoxConfigLJI = null;
            }
            if (consentBoxConfigLJI != null) {
                iPNSConsentConfigServiceLJIIIZ.LIZLLL("consent_page");
                String str2 = consentBoxConfigLJI.title;
                if (str2 != null && str2.length() > 0) {
                    TuxTextView tuxTextViewAS2 = aS();
                    tuxTextViewAS2.setText(str2);
                    C786410Ut5.LLLLZLL(tuxTextViewAS2, 0);
                }
                Map<String, String> map = consentBoxConfigLJI.buttons;
                if (map != null && (str = map.get("agree")) != null && str.length() > 0) {
                    VR().setText(str);
                }
            } else if (iPNSConsentConfigServiceLJIIIZ != null) {
                iPNSConsentConfigServiceLJIIIZ.LJIIIZ("consent_page");
            }
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LIZIZ().LIZLLL(WR());
        c19252910Tv.LIZLLL().LIZIZ().LIZLLL(VR());
        C786410Ut5.U8(VR(), new ACListenerS162S0100000_28(this, 196));
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            TuxTextView tuxTextViewWR2 = WR();
            if (tuxTextViewWR2 != null) {
                C426750GoL.LJIIIZ(tuxTextViewWR2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), null, null, false, 29);
            }
            C197039127h c197039127hVR = VR();
            if (c197039127hVR != null) {
                C426750GoL.LJIIIZ(c197039127hVR, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
            }
        }
        if (C1911400zq6.LIZ(getContext())) {
            c19233810Mm.getClass();
            if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
                View viewFindViewById = this.LLJILLL;
                if (viewFindViewById == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.xj3);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJILLL = (ConstraintLayout) viewFindViewById;
                }
                if (viewFindViewById != null) {
                    C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, false, 26);
                }
                TuxTextView tuxTextViewAS3 = aS();
                if (tuxTextViewAS3 != null) {
                    tuxTextViewAS3.setTuxFont(13);
                    tuxTextViewAS3.LJJJJI(24.0f);
                    C426750GoL.LJIIIZ(tuxTextViewAS3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))), null, null, false, 29);
                }
                TuxTextView tuxTextViewWR3 = WR();
                if (tuxTextViewWR3 != null) {
                    tuxTextViewWR3.LJJJJI(14.0f);
                    C426750GoL.LJIIIZ(tuxTextViewWR3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
                }
                ImageView imageViewZR3 = ZR();
                if (imageViewZR3 != null) {
                    C1911400zq6.LJ(imageViewZR3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(294))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(121))));
                    C426750GoL.LJIIIZ(imageViewZR3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, false, 24);
                }
                C197039127h c197039127hVR2 = VR();
                if (c197039127hVR2 != null) {
                    C426750GoL.LJIIIZ(c197039127hVR2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 18);
                    ViewGroup.LayoutParams layoutParams4 = c197039127hVR2.getLayoutParams();
                    if ((layoutParams4 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                        C786410Ut5.J6(c197039127hVR2, marginLayoutParams2);
                    }
                }
            } else {
                C1911400zq6.LIZIZ(VR(), Float.valueOf(0.05f), Float.valueOf(0.05f));
                TuxTextView tuxTextViewAS4 = aS();
                if (tuxTextViewAS4 != null) {
                    C426750GoL.LJIIIZ(tuxTextViewAS4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))), null, null, false, 29);
                }
                TuxTextView tuxTextViewWR4 = WR();
                if (tuxTextViewWR4 != null) {
                    C426750GoL.LJIIIZ(tuxTextViewWR4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
                }
                C197039127h c197039127hVR3 = VR();
                if (c197039127hVR3 != null) {
                    ViewGroup.LayoutParams layoutParams5 = c197039127hVR3.getLayoutParams();
                    if ((layoutParams5 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                        C786410Ut5.J6(c197039127hVR3, marginLayoutParams);
                    }
                }
            }
        }
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONSENT_BOX_PAGE;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cz9, viewGroup, false);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
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
