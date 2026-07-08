package com.ss.android.ugc.aweme.explore.topic;

import X.AbstractC1250290idn;
import X.AbstractC21673719rz;
import X.AbstractC21688119uJ;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C0OM1;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1841520y1O;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21688219uK;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC638250P1r;
import Y.ARunnableS4S1400000_11;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicManagementFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTopicManagementFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPSHELIOSAjISZiDDcjJCo+LBs8OCwvBC49KSIpJCo9PAM+KCg+LSs4";
    public boolean LLJILJIL;
    public Long LLJILJILJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 239));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 241));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 238));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 240));
    public final String LLJIJIL = "END_BUTTON_TAG";
    public int LLJILLL = -1;
    public int LLJJ = -1;

    public final C1841520y1O SR() {
        return (C1841520y1O) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1250300ido c1250300ido = new C1250300ido();
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131829891)) == null) {
            string = "";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS571S0100000_27(this, 1392));
        final int iIntValue = 0;
        abstractC1250290idnArr[0] = c1250300ido;
        c0om1.LJ(abstractC1250290idnArr);
        C1250250idj c1250250idj = new C1250250idj();
        Context context2 = getContext();
        if (context2 == null || (string2 = context2.getString(2131829915)) == null) {
            string2 = "";
        }
        c1250250idj.LIZJ = string2;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        C1250300ido c1250300ido2 = new C1250300ido();
        Context context3 = getContext();
        if (context3 != null && (string3 = context3.getString(2131829914)) != null) {
            str = string3;
        }
        c1250300ido2.LIZJ = str;
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZIZ = this.LLJIJIL;
        c1250300ido2.LJ = false;
        c1250300ido2.LIZ(new AwS571S0100000_27(this, 1393));
        abstractC1250290idnArr2[0] = c1250300ido2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJI.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        RecyclerView recyclerView = (RecyclerView) this.LLIZLLLIL.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(SR());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZ = 0;
            recyclerView.setBackground(c384050F3z.LIZ(recyclerView.getContext()));
            recyclerView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            new C21688219uK(new AbstractC21688119uJ() { // from class: X.0y1M
                @Override // X.AbstractC21688119uJ
                public final void LJIILL() {
                }

                @Override // X.AbstractC21688119uJ
                public final boolean LIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    if ((viewHolder instanceof C1841510y1N) && (viewHolder2 instanceof C1841510y1N)) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21688119uJ
                public final void LIZJ(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                    C1841510y1N c1841510y1N;
                    super.LIZJ(recyclerView2, viewHolder);
                    if ((viewHolder instanceof C1841510y1N) && (c1841510y1N = (C1841510y1N) viewHolder) != null) {
                        c1841510y1N.L5(true);
                        c1841510y1N.I5(false);
                    }
                }

                @Override // X.AbstractC21688119uJ
                public final int LJFF(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                    if (viewHolder.getBindingAdapterPosition() == 0 || !(viewHolder instanceof C1841510y1N)) {
                        return 0;
                    }
                    return AbstractC21688119uJ.LJIIIZ(3, 0);
                }

                @Override // X.AbstractC21688119uJ
                public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                    C1841510y1N c1841510y1N;
                    boolean z;
                    boolean z2;
                    if (viewHolder instanceof C1841510y1N) {
                        c1841510y1N = (C1841510y1N) viewHolder;
                    } else {
                        c1841510y1N = null;
                    }
                    if (c1841510y1N != null) {
                        ExploreTopicManagementFragment exploreTopicManagementFragment = this.LIZJ;
                        if (i == 2) {
                            z = true;
                        } else {
                            z = false;
                            if (viewHolder.getBindingAdapterPosition() < exploreTopicManagementFragment.SR().LL.size() - 1) {
                                z2 = true;
                            }
                            c1841510y1N.L5(z2);
                            c1841510y1N.I5(z);
                        }
                        z2 = false;
                        c1841510y1N.L5(z2);
                        c1841510y1N.I5(z);
                    }
                    if (i != 0) {
                        if (i == 2 && viewHolder != null) {
                            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                            ExploreTopicManagementFragment exploreTopicManagementFragment2 = this.LIZJ;
                            exploreTopicManagementFragment2.LLJILJILJ = ((ExploreCustomTopicResponse) ListProtector.get(exploreTopicManagementFragment2.SR().LL, bindingAdapterPosition)).topicId;
                            exploreTopicManagementFragment2.LLJILLL = bindingAdapterPosition;
                            exploreTopicManagementFragment2.LLJJ = -1;
                            return;
                        }
                        return;
                    }
                    ExploreTopicManagementFragment exploreTopicManagementFragment3 = this.LIZJ;
                    if (exploreTopicManagementFragment3.LLJILJILJ != null && exploreTopicManagementFragment3.LLJJ != -1) {
                        C15TA c15ta = C15TA.LIZ;
                        List<ExploreCustomTopicResponse> list = exploreTopicManagementFragment3.SR().LL;
                        ArrayList arrayList = new ArrayList();
                        for (ExploreCustomTopicResponse exploreCustomTopicResponse : list) {
                            Long l = exploreCustomTopicResponse.topicId;
                            if (l == null || l.longValue() != 0) {
                                arrayList.add(exploreCustomTopicResponse);
                            }
                        }
                        Integer numValueOf = Integer.valueOf(arrayList.size());
                        Long l2 = ((ExploreCustomTopicResponse) ListProtector.get(this.LIZJ.SR().LL, this.LIZJ.LLJJ)).topicId;
                        Integer numValueOf2 = Integer.valueOf(this.LIZJ.LLJILLL);
                        Integer numValueOf3 = Integer.valueOf(this.LIZJ.LLJJ);
                        c15ta.getClass();
                        C15TA.LJIILL(new ARunnableS4S1400000_11(numValueOf, l2, numValueOf2, numValueOf3, 3));
                    }
                    ExploreTopicManagementFragment exploreTopicManagementFragment4 = this.LIZJ;
                    exploreTopicManagementFragment4.LLJILJILJ = null;
                    exploreTopicManagementFragment4.LLJILLL = -1;
                    exploreTopicManagementFragment4.LLJJ = -1;
                }

                @Override // X.AbstractC21688119uJ
                public final boolean LJIIL(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    boolean z;
                    int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                    int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
                    if (bindingAdapterPosition2 == 0 || !(viewHolder2 instanceof C1841510y1N)) {
                        return false;
                    }
                    List<ExploreCustomTopicResponse> list = this.LIZJ.SR().LL;
                    ExploreCustomTopicResponse exploreCustomTopicResponse = (ExploreCustomTopicResponse) ListProtector.remove(list, bindingAdapterPosition);
                    ListProtector.add(list, bindingAdapterPosition2, exploreCustomTopicResponse);
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                    }
                    ExploreTopicManagementFragment exploreTopicManagementFragment = this.LIZJ;
                    exploreTopicManagementFragment.LLJILJIL = true;
                    TuxNavBar tuxNavBar2 = (TuxNavBar) exploreTopicManagementFragment.LLJI.getValue();
                    if (tuxNavBar2 != null) {
                        tuxNavBar2.LJJ(AFwS269S0000000_27.get$arr$(491), exploreTopicManagementFragment.LLJIJIL);
                    }
                    C1841510y1N c1841510y1N = (C1841510y1N) viewHolder2;
                    if (bindingAdapterPosition < this.LIZJ.SR().LL.size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1841510y1N.L5(z);
                    c1841510y1N.I5(false);
                    ExploreTopicManagementFragment exploreTopicManagementFragment2 = this.LIZJ;
                    exploreTopicManagementFragment2.LLJJ = bindingAdapterPosition2;
                    exploreTopicManagementFragment2.LLJILJILJ = exploreCustomTopicResponse.topicId;
                    return true;
                }
            }).LJ(recyclerView);
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.LJJ(0L);
            }
            final float fLIZIZ = C418440Gaw.LIZIZ(16);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, recyclerView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            recyclerView.addItemDecoration(new C0DXR(fLIZIZ, iIntValue) { // from class: X.0Eej
                public final float LL;
                public final Paint LLILLJJLI;

                {
                    this.LL = fLIZIZ;
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(iIntValue);
                    this.LLILLJJLI = paint;
                }

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount() - 1;
                        Float fValueOf = null;
                        if (itemCount > 0) {
                            int childCount = recyclerView2.getChildCount();
                            Float fValueOf2 = null;
                            for (int i = 0; i < childCount; i++) {
                                int childAdapterPosition = recyclerView2.getChildAdapterPosition(recyclerView2.getChildAt(i));
                                if (childAdapterPosition >= 0 && childAdapterPosition < itemCount) {
                                    if (fValueOf == null) {
                                        fValueOf = Float.valueOf(r1.getTop());
                                    }
                                    fValueOf2 = Float.valueOf(r1.getBottom());
                                }
                            }
                            if (fValueOf != null && fValueOf2 != null) {
                                RectF rectF = new RectF(recyclerView2.getPaddingLeft(), fValueOf.floatValue(), recyclerView2.getWidth() - recyclerView2.getPaddingRight(), fValueOf2.floatValue());
                                float f = this.LL;
                                canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c5s, viewGroup, false);
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
