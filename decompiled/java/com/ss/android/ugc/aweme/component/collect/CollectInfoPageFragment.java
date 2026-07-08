package com.ss.android.ugc.aweme.component.collect;

import X.AbstractC2350809Ja;
import X.AnonymousClass0207;
import X.C098200Yq;
import X.C0HTI;
import X.C0OM1;
import X.C1077100e8S;
import X.C1251150ifB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1548870qPN;
import X.C1685300txQ;
import X.C1716030ukz;
import X.C1716450ulf;
import X.C1716670um1;
import X.C189200o6;
import X.C1948507kB;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C344820DfU;
import X.C418440Gaw;
import X.C431360Gvm;
import X.C786410Ut5;
import X.C806203Cy;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1338240kve;
import X.EnumC1716810umF;
import X.InterfaceC1548890qPP;
import X.InterfaceC1716860umK;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import Y.ACListenerS160S0100000_26;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.biz.wallet.network.model.StepAttr;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class CollectInfoPageFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1548890qPP {
    public static final ConcurrentHashMap<String, InterfaceC1716860umK> LLJJ = new ConcurrentHashMap<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiHELIOSPWEwJykgLCwnZgYjJSM2KzEFJyk8GCQrLAkhKSIhLCEn";
    public StepAttr LLIZLLLIL;
    public InfoCollectGuideModel LLJILJIL;
    public String LLIZ = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJILJ = "";
    public final long LLJILLL = System.currentTimeMillis();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final String SR() {
        String str;
        StepAttr stepAttr = this.LLIZLLLIL;
        String strUR = UR(stepAttr != null ? stepAttr.collectInfo : null);
        if (strUR != null) {
            return strUR;
        }
        InfoCollectGuideModel infoCollectGuideModel = this.LLJILJIL;
        return (infoCollectGuideModel == null || (str = infoCollectGuideModel.scene) == null || !u.LJIJI(str, "SET_MOBILE", true)) ? "PIN" : "MOBILE";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        new C1548870qPN().LJI("close_info_collect_guide", this);
        super.onDestroy();
    }

    public final void VR() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click_close_");
        sbLIZ.append(C1716450ulf.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(C1716450ulf.LIZ());
        C1716030ukz.LIZJ(C2188811AlT.LIZIZ(sbLIZ), false);
        ConcurrentHashMap<String, InterfaceC1716860umK> concurrentHashMap = LLJJ;
        InterfaceC1716860umK interfaceC1716860umK = concurrentHashMap.get(this.LLIZ);
        if (interfaceC1716860umK != null) {
            interfaceC1716860umK.LIZ(EnumC1716810umF.CANCEL, getActivity());
        }
        concurrentHashMap.clear();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        VR();
    }

    public static String UR(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || !C1948507kB.LIZ(string)) {
            string = null;
        }
        String str2 = "MOBILE";
        if (!u.LJIJI(string, "MOBILE", true)) {
            str2 = "BIO";
            if (!u.LJIJI(string, "BIO", true)) {
                str2 = "PIN";
                if (!u.LJIJI(string, "PIN", true)) {
                    return null;
                }
            }
        }
        return str2;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map mapLJIIIIZZ;
        StepAttr stepAttr;
        NR(AFwS268S0000000_26.get$arr$(105));
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = null;
        if (arguments != null) {
            String string2 = arguments.getString("instance_id");
            String str = "";
            if (string2 == null) {
                string2 = "";
            }
            this.LLIZ = string2;
            Serializable serializable = arguments.getSerializable("step_attr");
            if (serializable instanceof StepAttr) {
                stepAttr = (StepAttr) serializable;
            } else {
                stepAttr = null;
            }
            this.LLIZLLLIL = stepAttr;
            String string3 = arguments.getString(Scene.SCENE_SERVICE);
            if (string3 == null) {
                string3 = "";
            }
            this.LLJ = string3;
            String string4 = arguments.getString("source");
            if (string4 == null) {
                string4 = "";
            }
            this.LLJI = string4;
            String string5 = arguments.getString("real_enter_from");
            if (string5 == null) {
                string5 = "";
            }
            this.LLJIJIL = string5;
            arguments.getString("session_id");
            this.LLJILJIL = (InfoCollectGuideModel) arguments.getParcelable("guide_info");
            String string6 = arguments.getString("combo_collect_info_list");
            if (string6 != null) {
                str = string6;
            }
            this.LLJILJILJ = str;
        }
        InfoCollectGuideModel infoCollectGuideModel = this.LLJILJIL;
        if (infoCollectGuideModel != null) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("source_id", this.LLJIJIL));
            List<String> listSplit = new Regex("[-—]").split(this.LLJILJILJ, 0);
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = listSplit.iterator();
            while (it2.hasNext()) {
                String strUR = UR(it2.next());
                if (strUR != null) {
                    arrayList.add(strUR);
                }
            }
            if (arrayList.isEmpty()) {
                mapLJIIIIZZ = C2097608Jq.LJ();
            } else {
                Iterator it3 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (u.LJIJI((String) it3.next(), SR(), true)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i2 = i + 1;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("collection_list", C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, AnonymousClass0207.get$arr$(111), 24));
                Integer numValueOf = Integer.valueOf(i2);
                if (numValueOf.intValue() > 0) {
                    string = numValueOf.toString();
                }
                pairArr[1] = new Pair("combo_collect_order", string);
                mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            }
            mapLJIIJ.putAll(mapLJIIIIZZ);
            C1716670um1.LIZ.getClass();
            C1716670um1.LIZ(infoCollectGuideModel, mapLJIIJ);
        }
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        C19EG activity;
        if (Intrinsics.LJFF(str, "close_info_collect_guide") && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        LinearLayout.LayoutParams layoutParams;
        String str4;
        String str5;
        C19EG activity;
        super.onViewCreated(view, bundle);
        new C1548870qPN().LJFF("close_info_collect_guide", this);
        View viewFindViewById = view.findViewById(R.id.e6i);
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById.findViewById(R.id.p15);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.cover);
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.title);
        LinearLayout linearLayout = (LinearLayout) viewFindViewById.findViewById(R.id.ktx);
        C197039127h c197039127h = (C197039127h) viewFindViewById.findViewById(R.id.eoq);
        C197039127h c197039127h2 = (C197039127h) viewFindViewById.findViewById(R.id.vfx);
        TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById.findViewById(R.id.jdw);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZIZ = "skip";
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1413));
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        boolean z = true;
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        Context context = getContext();
        if (context == null || !C960203pA.LIZIZ(context)) {
            z = false;
        }
        String str6 = null;
        if (z) {
            StepAttr stepAttr = this.LLIZLLLIL;
            if (stepAttr != null) {
                str = stepAttr.imageDark;
                if (str == null && C1948507kB.LIZ(str)) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LJIIIZ.LJJI(imageView);
                    c1331670kl3LJIIIZ.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0umJ
                        @Override // X.InterfaceC605070NoH
                        public final void LIZ(File file) {
                        }

                        @Override // X.InterfaceC605070NoH
                        public final void onFailed(Throwable th) {
                        }
                    });
                    c1331670kl3LJIIIZ.LJIIJ(new C1077100e8S(3));
                }
            }
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.tn;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        } else {
            StepAttr stepAttr2 = this.LLIZLLLIL;
            if (stepAttr2 != null) {
                str = stepAttr2.imageLight;
                if (str == null) {
                }
            }
            C0HTI c0hti2 = new C0HTI();
            c0hti2.LIZ = R.drawable.tn;
            imageView.setImageDrawable(c0hti2.LIZ(imageView.getContext()));
        }
        tuxTextView.LJJJJI(28.0f);
        StepAttr stepAttr3 = this.LLIZLLLIL;
        if (stepAttr3 != null) {
            str2 = stepAttr3.title;
        } else {
            str2 = null;
        }
        String str7 = "";
        if (str2 == null) {
            str2 = "";
        }
        tuxTextView.setText(str2);
        C806203Cy c806203Cy = C806203Cy.LIZ;
        StepAttr stepAttr4 = this.LLIZLLLIL;
        if (stepAttr4 != null) {
            str6 = stepAttr4.instruction;
        }
        c806203Cy.getClass();
        C806203Cy.LIZ(linearLayout, str6);
        StepAttr stepAttr5 = this.LLIZLLLIL;
        if (stepAttr5 != null && (str5 = stepAttr5.agreement) != null && C1948507kB.LIZ(str5) && (activity = getActivity()) != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            tuxTextView2.setMovementMethod(C431360Gvm.LIZ());
            tuxTextView2.setText(C344820DfU.LIZ(activity, str5, new AwS461S0200000_26(this, activity, 12)));
        }
        StepAttr stepAttr6 = this.LLIZLLLIL;
        if (stepAttr6 != null && (str4 = stepAttr6.enableBtn) != null) {
            str7 = str4;
        }
        c197039127h.setText(str7);
        C786410Ut5.U8(c197039127h, new ACListenerS160S0100000_26(this, 16));
        StepAttr stepAttr7 = this.LLIZLLLIL;
        if (stepAttr7 != null && (str3 = stepAttr7.skipBtn) != null && C1948507kB.LIZ(str3)) {
            ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                C786410Ut5.J6(c197039127h, layoutParams);
            }
            c197039127h2.setText(str3);
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
            c197039127h2.LJJJJL(AFwS268S0000000_26.get$arr$(630));
            C786410Ut5.U8(c197039127h2, new ACListenerS160S0100000_26(this, 60));
        } else {
            C786410Ut5.LLLLLLJ(c197039127h2, 8);
        }
        C1716670um1 c1716670um1 = C1716670um1.LIZ;
        String strSR = SR();
        c1716670um1.getClass();
        C1716670um1.LIZJ(strSR);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c7j, viewGroup, false);
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
