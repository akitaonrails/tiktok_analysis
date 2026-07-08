package com.ss.android.ugc.aweme.detail.ui;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C098200Yq;
import X.C0HSH;
import X.C0SU6;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11JF;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1606370ru7;
import X.C1685300txQ;
import X.C1840110xz7;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2189821An6;
import X.C299520Boc;
import X.C452501pT;
import X.C616540OGe;
import X.C622680Oba;
import X.C633020OsG;
import X.C688120Qyw;
import X.C724240Sb0;
import X.C739670Szt;
import X.C785420UrU;
import X.C786410Ut5;
import X.C913020Zro;
import X.C913060Zrs;
import X.InterfaceC1581960rGk;
import X.InterfaceC20660615sy;
import X.InterfaceC494301wD;
import X.InterfaceC743730TFj;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioShareService;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class DetailPageFragment extends DetailComponentFragment implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpHELIOSPS46JGs5IGEXLTEtICMDKSIpDz0yLygpJzs=";
    public DetailFragmentPanel LL;
    public DetailPageComponent LLILZIL;
    public C785420UrU LLIZ;
    public C2189821An6 LLILLJJLI = new C2189821An6();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 264));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 263));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 265));

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "detail_page";
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment
    public final DetailPageComponent MR() {
        return (DetailPageComponent) this.LLILZLL.getValue();
    }

    public DetailPageComponent NR() {
        return new DetailPageComponent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f4, code lost:
    
        if (r7.LJIJJ(r6 != null ? ((com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class)).LLILZ(r6) : null) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f6, code lost:
    
        if (r3 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0200, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4.getEventType(), "repost_feed") != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0206, code lost:
    
        if (X.C1360340lVI.LJ(r4) != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020c, code lost:
    
        if (X.C1357260lQK.LIZ(r4) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x020e, code lost:
    
        r3.putBoolean("from_profile_page_repost_tab", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0213, code lost:
    
        X.C786410Ut5.LJJJI("enter_from", r4.getEventType(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0221, code lost:
    
        return new com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x022a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4.getEventType(), "shared_feed") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0234, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4.getEventType(), "shared_feed_like_history") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0236, code lost:
    
        r3.putBoolean("is_encourage_muf_panel", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023c, code lost:
    
        r3.putBoolean("from_repost_feed", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0258, code lost:
    
        if (X.C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI() != 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0271, code lost:
    
        if (X.C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI() != 3) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel OR() {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment.OR():com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel");
    }

    public DetailFragmentPanel PR() {
        if (this.LL == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                C2189821An6 c2189821An6 = (C2189821An6) arguments.getSerializable("feed_param");
                if (c2189821An6 != null) {
                    this.LLILLJJLI = c2189821An6;
                }
            } else {
                this.LLILLJJLI.setEventType("");
            }
            this.LL = OR();
        }
        return this.LL;
    }

    public final DetailPageComponent RR() {
        if (this.LLILZIL == null) {
            if (C299520Boc.LIZ()) {
                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IFeedFragmentAbility.class, null);
                if (!(interfaceC494301wDLIZ instanceof IDetailPageAbility)) {
                    interfaceC494301wDLIZ = null;
                }
                IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wDLIZ;
                this.LLILZIL = iDetailPageAbility instanceof DetailPageComponent ? (DetailPageComponent) iDetailPageAbility : null;
            } else {
                this.LLILZIL = (DetailPageComponent) this.LLILZLL.getValue();
            }
        }
        return this.LLILZIL;
    }

    public final void UR() {
        if (this.LLIZ == null && (getActivity() instanceof DetailActivity)) {
            C785420UrU c785420UrU = new C785420UrU(getActivity());
            c785420UrU.LIZIZ(getActivity());
            this.LLIZ = c785420UrU;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void VR() {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment.VR():void");
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public boolean LLZLL() {
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            return detailPageComponentRR.Eb2(new AwS568S0100000_24(this, 266));
        }
        return false;
    }

    public final DetailPageComponent SR() {
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            return detailPageComponentRR;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public Analysis getAnalysis() {
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            return detailPageComponentRR.getAnalysis();
        }
        return null;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        C19EG activity = getActivity();
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(this);
        if (context != null) {
            if (fragmentLIZIZ != null) {
                return new C688120Qyw(context, fragmentLIZIZ, null);
            }
            if (activity != null) {
                return new C688120Qyw(context, activity, null);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C785420UrU c785420UrU = this.LLIZ;
        if (c785420UrU != null && C739670Szt.LIZ) {
            c785420UrU.LIZIZ.removeCallbacksAndMessages(null);
            c785420UrU.LIZ.clear();
        }
        C622680Oba.LIZLLL(this);
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onDestroy();
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService != null) {
            iCommercePromoteService.LJIIZILJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        super.onDestroyView();
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).dd();
            }
        }
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onDestroyView();
        }
        C1840110xz7.LIZJ.set(true);
        C11JF c11jf = C1840110xz7.LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1840110xz7.LJ = null;
        C1840110xz7.LIZ.set(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C785420UrU c785420UrU = this.LLIZ;
        if (c785420UrU != null && C739670Szt.LIZ && c785420UrU.LIZLLL) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = c785420UrU.LJIIJJI;
            if (aRunnableS112S0100000_12 != null) {
                c785420UrU.LIZIZ.removeCallbacks(aRunnableS112S0100000_12);
            }
            c785420UrU.LJIIJJI = null;
            c785420UrU.LIZJ = true;
        }
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onPause();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        boolean zLJI = MethodIDManager.LJI(71942);
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.onResume();
        C785420UrU c785420UrU = this.LLIZ;
        if (c785420UrU != null) {
            c785420UrU.LIZLLL();
        }
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onResume();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        C913020Zro c913020Zro = C913060Zrs.LIZ;
        if (c913020Zro != null) {
            c913020Zro.LJIIJJI = jUptimeMillis2;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C785420UrU c785420UrU = this.LLIZ;
        if (c785420UrU != null) {
            c785420UrU.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, PR());
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        VR();
        C1578630rBN.LJII(this);
        super.onAttach(activity);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.Bg(activity, this);
        }
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onAttach(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.P9(bundle);
        }
        C622680Oba.LIZJ(this);
        if (C739670Szt.LIZ) {
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(this, 44));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixStudioStoryPublishEvent(C0HSH c0hsh) {
        MixStudioShareService mixStudioShareService = (MixStudioShareService) PluggableExtentionKt.pluggableSpi$default(MixStudioShareService.class, false, false, false, 14, null);
        if (mixStudioShareService != null) {
            mixStudioShareService.LIZ(this);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        DetailPageComponent detailPageComponentRR;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0HxzkXZEXSFj9H/k9VtEjcdL2cRmFLU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        PR();
        super.setUserVisibleHint(z);
        if ((!C299520Boc.LIZ() || isAdded()) && (detailPageComponentRR = RR()) != null) {
            detailPageComponentRR.up(z, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.onViewCreated(view, bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.LLZLLLL(view, bundle);
        }
        DetailPageComponent detailPageComponentRR = RR();
        if (detailPageComponentRR != null) {
            detailPageComponentRR.onViewCreated(view, bundle);
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        C913020Zro c913020Zro = C913060Zrs.LIZ;
        if (c913020Zro != null) {
            c913020Zro.LJIIJ = jUptimeMillis2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C633020OsG.LIZIZ.LJII(getActivity(), this, i, i2, intent, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        long jUptimeMillis = SystemClock.uptimeMillis();
        DetailPageComponent detailPageComponentRR = RR();
        C19GS c19gs = null;
        if (detailPageComponentRR != null) {
            viewOnCreateView = detailPageComponentRR.onCreateView(layoutInflater, viewGroup, bundle);
        } else {
            viewOnCreateView = null;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        C913020Zro c913020Zro = C913060Zrs.LIZ;
        if (c913020Zro != null) {
            c913020Zro.LJIIIZ = jUptimeMillis2;
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
