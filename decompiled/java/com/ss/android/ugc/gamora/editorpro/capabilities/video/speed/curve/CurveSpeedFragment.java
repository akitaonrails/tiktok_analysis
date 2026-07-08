package com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve;

import X.C01GW;
import X.C0E16;
import X.C0E17;
import X.C0E1T;
import X.C0E2B;
import X.C0E48;
import X.C0ED7;
import X.C0ED8;
import X.C0EDB;
import X.C0EDF;
import X.C0EDS;
import X.C0EDU;
import X.C0EE1;
import X.C0EJC;
import X.C0FU0;
import X.C1308910kAL;
import X.C1455910nzR;
import X.C19EG;
import X.C294080Bfq;
import X.C361120EDu;
import X.C361130EDv;
import X.C361140EDw;
import X.C361680EFy;
import X.C362580EJk;
import X.C419910GdJ;
import X.C423170GiZ;
import X.C452501pT;
import Y.ATListenerS439S0100000_5;
import Y.AsS32S0100000_5;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.bottom.panel.BasePanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class CurveSpeedFragment extends BasePanelFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCHELIOSw4ICogZjMlLSo8ZjY8LCo3ZiY5Ozk2ZgY5Ozk2GzUpLCsVOiQrJCo9PA==";
    public C0EDF LLIZ;
    public boolean LLJ;
    public C362580EJk LLJI;
    public List<? extends PointF> LLJIJIL;
    public boolean LLJILJIL;
    public final int LLIZLLLIL = C0FU0.LIZ(4.0f);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 745));

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int OR() {
        return R.layout.c2j;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.c11;
    }

    public final C0EDF VR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv9) : null;
            this.LLIZ = (C0EDF) viewFindViewById;
        }
        return (C0EDF) viewFindViewById;
    }

    public final SpeedViewModel WR() {
        return (SpeedViewModel) this.LLJILJILJ.getValue();
    }

    public final VideoPublishEditModel UR() {
        if (!isAdded()) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final boolean aS() {
        if (!C0E2B.LIZ()) {
            return false;
        }
        C1455910nzR.LIZ.getClass();
        return !C1455910nzR.LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WR().onCurveSpeedClose();
        this.LLIZ = null;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final ViewGroup PR(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.pp8);
        }
        return null;
    }

    public final void ZR(ResourceItem resourceItem) {
        VideoPublishEditModel videoPublishEditModelUR = UR();
        if (videoPublishEditModelUR != null) {
            C0E48 c0e48 = this.LL;
            String resourceEngName = WR().getResourceEngName(resourceItem);
            if (resourceEngName == null) {
                resourceEngName = "none";
            }
            C361680EFy.LJJZ(videoPublishEditModelUR, c0e48, resourceEngName, "curve_speed_panel_show", null, null);
        }
    }

    public final void bS(C0E48 c0e48) {
        ResourceItem resourceItemLJIIL;
        if (WR().editorContext == null && c0e48 != null) {
            WR().editorContext = c0e48;
        }
        String currentCurveSpeedResId = WR().getCurrentCurveSpeedResId();
        if (Intrinsics.LJFF(currentCurveSpeedResId, "None")) {
            currentCurveSpeedResId = "";
        }
        C0EDF c0edfVR = VR();
        if (c0edfVR != null && (resourceItemLJIIL = C0EDF.LJIIL(c0edfVR, currentCurveSpeedResId, C0E17.DIRECT_SCROLL, 8)) != null) {
            WR().updateCurvedSpeedResourceInfo(resourceItemLJIIL);
        }
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        int iIntValue2;
        float f;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(new ATListenerS439S0100000_5(this, 5));
        C362580EJk c362580EJk = new C362580EJk(Integer.valueOf(R.id.gcw));
        c362580EJk.LIZIZ = getActivity();
        this.LLJI = c362580EJk;
        final C0EDF c0edfVR = VR();
        if (c0edfVR != null) {
            C0ED7 c0ed7 = new C0ED7();
            c0ed7.LIZJ = "editor_pro_curve_speed";
            c0ed7.LIZ = new ScrollCenterLayoutManager(c0edfVR.getContext());
            c0ed7.LIZIZ = new C0EJC(11, true);
            String string = requireActivity().getString(2131850732);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_block;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C0FU0.LIZ(24.0f);
            c419910GdJ.LIZJ = C0FU0.LIZ(24.0f);
            c0ed7.LJIIJ = new C361140EDw(true, R.drawable.bon, true, (Drawable) c419910GdJ.LIZ(requireActivity()), string, false, R.drawable.boe);
            C0EE1 c0ee1 = C0EE1.DOWN;
            C19EG c19egRequireActivity = requireActivity();
            Integer numValueOf = Integer.valueOf(R.attr.eg);
            if (numValueOf != null && (numLIZJ2 = C1308910kAL.LIZJ(numValueOf.intValue(), c19egRequireActivity)) != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
            C19EG c19egRequireActivity2 = requireActivity();
            Integer numValueOf2 = Integer.valueOf(R.attr.ee);
            if (numValueOf2 != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf2.intValue(), c19egRequireActivity2)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = -1;
            }
            c0ed7.LJIIJJI = new C361120EDu(false, iIntValue, iIntValue2, c0ee1, 2, 0, 0, 0.34f, new AwS549S0100000_5(this, 1267), new AwS584S0100000_5(this, 984), new AwS584S0100000_5(this, 985), 867);
            c0ed7.LJII = false;
            c0ed7.LJIIIIZZ = true;
            c0ed7.LJIIIZ = false;
            c0ed7.LJIILIIL = new C0EDB(126);
            c0ed7.LJIILL = new C0EDU(true, 62, 62, R.drawable.bof, R.raw.icon_pen, 0, 224);
            if (C423170GiZ.LIZ(c0edfVR.getContext())) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            c0ed7.LJIIL = new C361130EDv(54, 54, 8, null, R.drawable.bon, R.drawable.bon, f, null, 2961);
            C0ED8 c0ed8 = new C0ED8(c0ed7);
            c0edfVR.setResourceListInitListener(new C0EDS() { // from class: X.0ECI
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0EDS
                public final List<ResourceItem> LIZJ(List<? extends ResourceItem> list) {
                    return list;
                }

                @Override // X.C0EDS
                public final List<ResourceItem> LIZ() {
                    return C13BV.INSTANCE;
                }

                @Override // X.C0EDS
                public final void LIZIZ(boolean z, boolean z2) {
                    final RecyclerView recyclerView;
                    C0EDF c0edfVR2;
                    final C361100EDs resourceListAdapter;
                    final LinearLayoutManager linearLayoutManager;
                    RecyclerView recyclerView2;
                    RecyclerView.LayoutManager layoutManager;
                    LinearLayoutManager linearLayoutManager2;
                    C361100EDs resourceListAdapter2;
                    RecyclerView recyclerView3;
                    if (!z) {
                        c0edfVR.LJII();
                        return;
                    }
                    C0EDF c0edfVR3 = this.VR();
                    if (c0edfVR3 != null && (recyclerView2 = c0edfVR3.getRecyclerView()) != null) {
                        CurveSpeedFragment curveSpeedFragment = this;
                        if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                            curveSpeedFragment.bS(curveSpeedFragment.LL);
                            C0EDF c0edfVR4 = curveSpeedFragment.VR();
                            if (c0edfVR4 != null && (recyclerView3 = c0edfVR4.getRecyclerView()) != null) {
                                layoutManager = recyclerView3.getLayoutManager();
                            } else {
                                layoutManager = null;
                            }
                            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                                IntRange intRange = new IntRange(linearLayoutManager2.findFirstVisibleItemPosition(), linearLayoutManager2.findLastVisibleItemPosition());
                                C0EDF c0edfVR5 = curveSpeedFragment.VR();
                                if (c0edfVR5 != null && (resourceListAdapter2 = c0edfVR5.getResourceListAdapter()) != null) {
                                    int i = 0;
                                    for (Object obj : (ArrayList) resourceListAdapter2.LLLFZ()) {
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            ResourceItem resourceItem = (ResourceItem) obj;
                                            int i3 = intRange.LL;
                                            if (i <= intRange.LLILLJJLI && i3 <= i) {
                                                curveSpeedFragment.ZR(resourceItem);
                                            }
                                            i = i2;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                            }
                        } else {
                            recyclerView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(curveSpeedFragment, 14));
                        }
                    }
                    final CurveSpeedFragment curveSpeedFragment2 = this;
                    C0EDF c0edfVR6 = curveSpeedFragment2.VR();
                    if (c0edfVR6 == null || (recyclerView = c0edfVR6.getRecyclerView()) == null || (c0edfVR2 = curveSpeedFragment2.VR()) == null || (resourceListAdapter = c0edfVR2.getResourceListAdapter()) == null) {
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) {
                        return;
                    }
                    recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0ECJ
                        @Override // X.InterfaceC21676519sR
                        public final void m3(View view2) {
                        }

                        @Override // X.InterfaceC21676519sR
                        public final void g5(View view2) {
                            IntRange intRangeLJIIIZ;
                            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                            if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
                                if (!curveSpeedFragment2.LLJ) {
                                    intRangeLJIIIZ = new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
                                } else {
                                    intRangeLJIIIZ = C1697810uHb.LJIIIZ(resourceListAdapter.LLLFZ());
                                }
                                Integer numValueOf3 = Integer.valueOf(recyclerView.getChildLayoutPosition(view2));
                                int iIntValue3 = numValueOf3.intValue();
                                int i4 = intRangeLJIIIZ.LL;
                                if (iIntValue3 <= intRangeLJIIIZ.LLILLJJLI && i4 <= iIntValue3 && iIntValue3 != 0) {
                                    C361100EDs c361100EDs = resourceListAdapter;
                                    CurveSpeedFragment curveSpeedFragment3 = curveSpeedFragment2;
                                    ResourceItem resourceItem2 = (ResourceItem) C13LP.LJJJLZIJ(numValueOf3.intValue(), c361100EDs.LLLFZ());
                                    if (resourceItem2 != null) {
                                        curveSpeedFragment3.ZR(resourceItem2);
                                    }
                                }
                            }
                        }
                    });
                    recyclerView.addOnScrollListener(new AsS32S0100000_5(curveSpeedFragment2, 6));
                }
            });
            C0EDF.LJFF(c0edfVR, c0ed8, null, null, 6);
            c0edfVR.LJIIZILJ();
            c0edfVR.setOnItemClickListener(new C0E16() { // from class: X.0ECH
                /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
                @Override // X.C0EDC
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(int r18, com.ss.ugc.android.editor.base.resource.ResourceItem r19, boolean r20) {
                    /*
                        Method dump skipped, instruction units count: 234
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0ECH.LIZIZ(int, com.ss.ugc.android.editor.base.resource.ResourceItem, boolean):void");
                }
            });
        }
        if (C294080Bfq.LIZ()) {
            WR().onCurveSpeedOpen(this);
        } else {
            WR().onCurveSpeedOpen(requireActivity());
        }
        this.LLJIJIL = WR().getCurrentCurveSpeedPoints();
    }
}
