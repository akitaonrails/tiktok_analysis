package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.AbstractC1777330wLr;
import X.AbstractC1777760wMY;
import X.AbstractC21342018fa;
import X.C01GW;
import X.C098200Yq;
import X.C0HTI;
import X.C0JDJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C14KS;
import X.C1685300txQ;
import X.C16FV;
import X.C1808480xA6;
import X.C1808830xAf;
import X.C1813220xHk;
import X.C1813280xHq;
import X.C1813440xI6;
import X.C1835760xs6;
import X.C1835840xsE;
import X.C1864580yca;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20632315oP;
import X.C21342318fd;
import X.C2188811AlT;
import X.C292401Bi;
import X.C418440Gaw;
import X.C465220IMe;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1813200xHi;
import X.InterfaceC1813270xHp;
import X.InterfaceC775640Ubi;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public abstract class BaseAutoPostLivingListFragment extends LiveThemeAwareFragment implements C0JDJ, InterfaceC1813270xHp<C1813440xI6, AbstractC1777330wLr, AbstractC1777760wMY, AutoPostLivingViewModel> {
    public final C1835760xs6 LL;
    public C20632315oP LLILLL;
    public RecyclerView LLILZ;
    public View LLILZIL;
    public C16FV LLILZLL;
    public C1808480xA6 LLIZ;
    public C197039127h LLIZLLLIL;
    public C1813220xHk LLJI;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS571S0100000_27(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public int LLJ = -1;

    public abstract EnumC1813200xHi MR();

    public abstract int OR();

    @Override // X.InterfaceC1813270xHp
    /* JADX INFO: renamed from: RR, reason: merged with bridge method [inline-methods] */
    public void gn(AbstractC1777760wMY abstractC1777760wMY) {
    }

    public abstract int getLayoutId();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    public final C1808830xAf NR() {
        C1808480xA6 c1808480xA6 = this.LLIZ;
        if (c1808480xA6 != null) {
            return c1808480xA6.LLLFZ(this.LLJ);
        }
        return null;
    }

    public final AutoPostLivingViewModel PR() {
        return (AutoPostLivingViewModel) this.LLILLJJLI.getValue();
    }

    public final void S6() {
        C16FV c16fv;
        Context context = getContext();
        if (context != null && (c16fv = this.LLILZLL) != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n0;
            c16fv.setImageDrawable(c0hti.LIZ(new ContextThemeWrapper(context, R.style.y0)));
        }
        C500260Jjc.LLFFF(this.LLILZIL);
        C500260Jjc.LJIILIIL(this.LLILLL);
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
    }

    public BaseAutoPostLivingListFragment(C1835760xs6 c1835760xs6) {
        this.LL = c1835760xs6;
    }

    public final void SR(final List<C1808830xAf> list) {
        if (list == null) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZIL);
        C500260Jjc.LLFFF(this.LLILLL);
        C500260Jjc.LLFFF(this.LLIZLLLIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderAutoPostList itemList.size = ");
        sbLIZ.append(list.size());
        C20441214yg.LIZIZ("BaseAutoPostLivingListFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1808480xA6 c1808480xA6 = this.LLIZ;
        if (c1808480xA6 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateData, itemList size: ");
            sbLIZ2.append(list.size());
            C20441214yg.LIZIZ("AutoPostLivingUI", C2188811AlT.LIZIZ(sbLIZ2));
            final List<C1808830xAf> list2 = c1808480xA6.LL;
            C21342318fd.LIZ(new AbstractC21342018fa(list2, list) { // from class: X.0xA7
                public final List<C1808830xAf> LIZ;
                public final List<C1808830xAf> LIZIZ;

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                {
                    this.LIZ = list2;
                    this.LIZIZ = list;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    return Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    return Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
                }
            }, false).LIZJ(c1808480xA6);
            ((ArrayList) c1808480xA6.LL).clear();
            ((ArrayList) c1808480xA6.LL).addAll(list);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1813280xHq.LIZ(this, PR(), this);
        C475510Ikn.LJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1835840xsE c1835840xsE;
        Object obj;
        C1808830xAf c1808830xAfLLLFZ = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/autopost/BaseAutoPostLivingListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHOplv3FwmF2S1ODP1knGwB1WurbE/AAqwwTrI+YlOojizy4hx6Auc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        C20441214yg.LIZIZ("BaseAutoPostLivingListFragment", "onHiddenChanged hidden = " + z);
        if (!z) {
            C1835760xs6 c1835760xs6 = this.LL;
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLJ);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C1835840xsE) {
                c1835840xsE = (C1835840xsE) viewHolderFindViewHolderForAdapterPosition;
            } else {
                c1835840xsE = null;
            }
            C1808480xA6 c1808480xA6 = this.LLIZ;
            if (c1808480xA6 != null) {
                c1808830xAfLLLFZ = c1808480xA6.LLLFZ(this.LLJ);
            }
            c1835760xs6.LIZLLL(c1835840xsE, c1808830xAfLLLFZ);
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final /* bridge */ /* synthetic */ void Xh(InterfaceC775640Ubi interfaceC775640Ubi) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.bg3);
        C20632315oP c20632315oP = null;
        RecyclerView recyclerView2 = null;
        if (c197039127h != null) {
            C500260Jjc.LJIILIIL(c197039127h);
        } else {
            c197039127h = null;
        }
        this.LLIZLLLIL = c197039127h;
        View viewFindViewById = view.findViewById(R.id.h3n);
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        } else {
            viewFindViewById = null;
        }
        this.LLILZIL = viewFindViewById;
        this.LLILZLL = (C16FV) view.findViewById(R.id.h2p);
        ((TextView) view.findViewById(R.id.h3h)).setText(getString(OR()));
        MR();
        PR();
        this.LLIZ = new C1808480xA6();
        C20632315oP c20632315oP2 = (C20632315oP) view.findViewById(R.id.view_pager);
        if (c20632315oP2 != null) {
            C500260Jjc.LJIILIIL(c20632315oP2);
            c20632315oP2.setAdapter(this.LLIZ);
            View childAt = c20632315oP2.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setClipToPadding(false);
                int iLJFF = (C14KS.LJFF() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))) / 2;
                recyclerView.setPadding(iLJFF, 0, iLJFF, 0);
                recyclerView2 = recyclerView;
            }
            this.LLILZ = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.setOverScrollMode(2);
            }
            c20632315oP2.setOffscreenPageLimit(2);
            c20632315oP2.setOrientation(0);
            c20632315oP2.setClipChildren(false);
            c20632315oP2.LIZIZ(new C1864580yca(this, 2));
            c20632315oP = c20632315oP2;
        }
        this.LLILLL = c20632315oP;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
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
