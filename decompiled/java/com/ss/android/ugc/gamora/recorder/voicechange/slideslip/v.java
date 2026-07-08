package com.ss.android.ugc.gamora.recorder.voicechange.slideslip;

import X.AbstractC1663490tOF;
import X.AbstractC1663570tON;
import X.AbstractC1664130tPH;
import X.AbstractC1664490tPr;
import X.C0DXR;
import X.C11VU;
import X.C1415610mwR;
import X.C1663310tNx;
import X.C1663320tNy;
import X.C1663580tOO;
import X.C1663610tOR;
import X.C1663620tOS;
import X.C1663640tOU;
import X.C1663830tOn;
import X.C1663910tOv;
import X.C1663920tOw;
import X.C1663930tOx;
import X.C1663950tOz;
import X.C1663960tP0;
import X.C1664120tPG;
import X.C1664210tPP;
import X.C19670811xi;
import X.C20635915oz;
import X.C20636215p2;
import X.C2217381BqS;
import X.C2217391BqT;
import X.C297840Blu;
import X.C346260Dho;
import X.C385670FAf;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1664180tPM;
import Y.ACListenerS159S0100000_25;
import Y.AObjectS241S0100000_8;
import Y.ARunnableS36S0101000_25;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.rv.CenterLayoutManager;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class v extends AbstractC1663490tOF<C1663960tP0, C1663830tOn> {
    public final C385670FAf<Boolean> LLJJJJ;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public RecyclerView LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public TuxTextView LLJZIJLIL;
    public C19670811xi LLL;
    public TuxIconView LLLF;
    public View LLLFF;
    public View LLLFFI;
    public TuxTextView LLLFZ;
    public View LLLI;
    public RecyclerView LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public final C1663620tOS LLJJJJJIL = new C1663620tOS(new C1663920tOw(this), new C1663640tOU(this), new C2217391BqT(this) { // from class: X.0tP9
        @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
        public final Object get() {
            return ((v) this.receiver).LLLIIII;
        }

        @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
        public final void set(Object obj) {
            ((v) this.receiver).LLLIIII = (AbstractC1663570tON) obj;
        }
    });
    public final C20636215p2 LLJJJJLIIL = new C20635915oz() { // from class: X.15p2
        public C21679619sw LJFF;

        @Override // X.C20635915oz, X.AbstractC20634115oh
        public final View LJFF(RecyclerView.LayoutManager layoutManager) {
            int iAbs;
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager.canScrollHorizontally()) {
                int childCount = layoutManager.getChildCount();
                View view = null;
                if (childCount == 0) {
                    return null;
                }
                if (this.LJFF == null) {
                    this.LJFF = new C21679619sw(layoutManager);
                }
                C21679619sw c21679619sw = this.LJFF;
                if (c21679619sw == null) {
                    return null;
                }
                int iLJIIJ = c21679619sw.LJIIJ() + (c21679619sw.LJIIJJI() / 2);
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = layoutManager.getChildAt(i2);
                    if (childAt != null && (iAbs = Math.abs((childAt.getLeft() + ((childAt.getRight() - childAt.getLeft()) / 2)) - iLJIIJ)) < i) {
                        view = childAt;
                        i = iAbs;
                    }
                }
                return view;
            }
            return super.LJFF(layoutManager);
        }
    };
    public final C1663910tOv LLJJL = new C1663910tOv(this);
    public final C1663930tOx LLJJLIIIJLLLLLLLZ = new C1663930tOx(this);
    public final CopyOnWriteArrayList<AbstractC1663570tON> LLLII = new CopyOnWriteArrayList<>();
    public AbstractC1663570tON LLLIIII = C1663320tNy.LIZ;
    public String LLLIIIIL = "STATE_PREVIEW_EMPTY";
    public final boolean LLLIIIL = C297840Blu.LIZ();
    public final C1664120tPG LLLILZ = new C1664120tPG();
    public final C1664210tPP LLLILZJ = new AbstractC1664130tPH() { // from class: X.0tPP
        @Override // X.AbstractC1664130tPH
        public final void LLLFZ() {
        }

        @Override // X.AbstractC1664130tPH
        public final void LLLIIIIL() {
        }

        @Override // X.AbstractC1664130tPH
        public final RecyclerView.ViewHolder LLLIILIL(ViewGroup viewGroup, int i, C1664160tPK c1664160tPK) {
            int i2;
            FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uf, viewGroup, false);
            View viewFindViewById = frameLayout.findViewById(R.id.w4q);
            SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.lfj);
            TuxTextView tuxTextView = (TuxTextView) frameLayout.findViewById(R.id.zjr);
            int iMin = Math.min(C366700EZg.LIZ(60.0d), (int) (((double) C1415610mwR.LIZIZ()) * 0.14d));
            if (C297840Blu.LIZ()) {
                i2 = R.id.g4h;
            } else {
                i2 = R.id.g4i;
            }
            C19670811xi c19670811xi = (C19670811xi) frameLayout.findViewById(i2);
            smartImageView.getLayoutParams().width = iMin;
            smartImageView.getLayoutParams().height = iMin;
            c19670811xi.getLayoutParams().width = iMin;
            c19670811xi.getLayoutParams().height = iMin;
            if (C297840Blu.LIZ()) {
                c19670811xi.setCircleRadius((c19670811xi.getLayoutParams().width / 2) - C12ES.LIZJ(8.0f, c19670811xi.getContext()));
                c19670811xi.setMaxProgress(100);
                C786410Ut5.G1(c19670811xi, 8);
            }
            tuxTextView.setHorizontalFadingEdgeEnabled(true);
            tuxTextView.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, tuxTextView.getContext()));
            viewFindViewById.getLayoutParams().width = iMin + C366700EZg.LIZ(8.0d);
            viewFindViewById.getLayoutParams().height = viewFindViewById.getLayoutParams().width;
            C1664310tPZ c1664310tPZ = new C1664310tPZ(frameLayout, smartImageView, tuxTextView, viewFindViewById, c1664160tPK, c19670811xi);
            c1664310tPZ.LLJJ = new C1664260tPU(viewFindViewById, c19670811xi);
            return c1664310tPZ;
        }
    };
    public final C1663950tOz LLLILZLLLI = new InterfaceC1664180tPM() { // from class: X.0tOz
        @Override // X.InterfaceC1664180tPM
        public final void LIZ(int i, C1664150tPJ c1664150tPJ) {
            AbstractC1663570tON abstractC1663570tON;
            if (c1664150tPJ.LJ == 1) {
                return;
            }
            if (c1664150tPJ.LJFF == 1) {
                Activity activity = this.LIZ.mActivity;
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(activity.getResources().getString(2131822393));
                    C1390380mHk.LIZ(activity, 3066, creativeToastBuilder);
                    return;
                }
                return;
            }
            Effect effect = c1664150tPJ.LIZ;
            if (effect == null) {
                return;
            }
            v vVar = this.LIZ;
            AbstractC1663570tON abstractC1663570tON2 = vVar.LLLIIII;
            Iterator<AbstractC1663570tON> it2 = vVar.LLLII.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    AbstractC1663570tON next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        abstractC1663570tON = next;
                        if (Intrinsics.LJFF(C1663610tOR.LIZ(abstractC1663570tON).getEffect_id(), effect.getEffect_id())) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    abstractC1663570tON = C1663320tNy.LIZ;
                    break;
                }
            }
            this.LIZ.LLLILZ.LJIJ(C1663610tOR.LIZ(abstractC1663570tON));
            v vVar2 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPanelItemViewSelected: pos = ");
            sbLIZ.append(i);
            sbLIZ.append(", item = ");
            sbLIZ.append(C1663610tOR.LIZIZ(abstractC1663570tON));
            C2188811AlT.LIZIZ(sbLIZ);
            vVar2.getClass();
            if (!C1663610tOR.LIZJ(abstractC1663570tON, abstractC1663570tON2)) {
                this.LIZ.LLLLIL().LJI.invoke(Integer.valueOf(i), abstractC1663570tON);
            } else {
                this.LIZ.LLLLIL().LJFF.invoke(Integer.valueOf(i), abstractC1663570tON);
            }
        }
    };

    @Override // X.AbstractC1663490tOF
    public final void LLLLLJIL() {
    }

    @Override // X.AbstractC1663490tOF
    public final void LLLLLLJ() {
    }

    @Override // X.AbstractC1663490tOF
    public final void LLLLLJLJLL() {
        View view = this.LLJLLIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 49), view);
        View view2 = this.LLJLLL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 50), view2);
        View view3 = this.LLLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 51), view3);
        View view4 = this.LLLIILIL;
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 52), view4 != null ? view4 : null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r5.equals("STATE_PREVIEW_CANCEL") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r5.equals("STATE_PREVIEW_EMPTY") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r5.equals("STATE_PREVIEW_NONE") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r8.LLLILZ.LJIL(0);
        r8.LLLILZ.LJIJJ(false);
        r8.LLLILZ.LJIJJLI(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLL() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v.LLLLLLL():void");
    }

    public final void LLLLLLLLLL() {
        int iLLLFZ = this.LLJJJJJIL.LLLFZ(this.LLLIIII);
        int size = this.LLJJJJJIL.LLIZLLLIL.size();
        if (size > 0 && iLLLFZ >= 0 && size > iLLLFZ) {
            RecyclerView recyclerView = this.LLJLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            HandlerHook.viewPost(recyclerView, new ARunnableS36S0101000_25(iLLLFZ, this, 3));
        }
        LLLLLLL();
    }

    public final void LLLLLLLZIL() {
        AbstractC1663570tON abstractC1663570tON = this.LLLIIII;
        if (abstractC1663570tON instanceof C1663580tOO) {
            this.LLLILZ.LJ();
        } else if (abstractC1663570tON instanceof C1663310tNx) {
            this.LLLILZ.LJIJ(C1663610tOR.LIZ(abstractC1663570tON));
            this.LLLILZ.LJIIJ();
        }
        LLLLLLL();
    }

    @Override // X.AbstractC1663490tOF
    public final void LLLLLL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tPC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LJIIIIZZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 433));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 422));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tPA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LJIIJ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 424));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1663960tP0) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 425));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tP6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LJI;
            }
        }, new AwS604S0100000_25(this, 426));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tP7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LJII;
            }
        }, new AwS604S0100000_25(this, 427));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tPB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1663960tP0) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 428));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1663960tP0) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 429));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1663960tP0) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 430));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1663960tP0) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 431));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tP5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1663960tP0) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 432));
    }

    @Override // X.AbstractC1663490tOF
    public final void LLLLLLIL() {
        super.LLLLLLIL();
        this.LLJL = requireViewById(R.id.wry);
        this.LLJLIL = requireViewById(R.id.wrz);
        this.LLJJJJ.LIZ(this, new AObjectS241S0100000_8(this, 88));
        this.LLJLILLLLZIIL = requireViewById(R.id.ts9);
        RecyclerView recyclerView = (RecyclerView) requireViewById(R.id.tx4);
        this.LLJLL = recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        Activity activityRequireActivity = requireActivity();
        recyclerView.setAdapter(this.LLJJJJJIL);
        recyclerView.setLayoutManager(new CenterLayoutManager(activityRequireActivity));
        LIZIZ(recyclerView);
        recyclerView.addOnScrollListener(this.LLJJL);
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        final int iLIZIZ2 = (C1415610mwR.LIZIZ() / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        recyclerView.addItemDecoration(new C0DXR(iLIZIZ, iLIZIZ2) { // from class: X.03Ig
            public final int LL;
            public final int LLILLJJLI;

            {
                this.LL = iLIZIZ;
                this.LLILLJJLI = iLIZIZ2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                boolean zLIZLLL = C426750GoL.LIZLLL(view.getContext());
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                AbstractC21673619ry adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    int iIntValue = Integer.valueOf(adapter.getItemCount()).intValue();
                    if (childAdapterPosition == 0) {
                        if (zLIZLLL) {
                            rect.right = this.LLILLJJLI;
                            rect.left = this.LL;
                            return;
                        } else {
                            rect.left = this.LLILLJJLI;
                            rect.right = this.LL;
                            return;
                        }
                    }
                    if (childAdapterPosition == iIntValue - 1) {
                        if (zLIZLLL) {
                            rect.left = this.LLILLJJLI;
                            rect.right = this.LL;
                            return;
                        } else {
                            rect.right = this.LLILLJJLI;
                            rect.left = this.LL;
                            return;
                        }
                    }
                    int i = this.LL;
                    rect.right = i;
                    rect.left = i;
                }
            }
        });
        this.LLJLLIL = requireViewById(R.id.tra);
        this.LLJLLL = requireViewById(R.id.tri);
        this.LLJZ = requireViewById(R.id.g3y);
        this.LLJZIJLIL = (TuxTextView) requireViewById(R.id.umu);
        this.LLL = (C19670811xi) requireViewById(this.LLLIIIL ? R.id.g4h : R.id.g4i);
        this.LLLF = (TuxIconView) requireViewById(R.id.y4b);
        this.LLLFF = requireViewById(R.id.y46);
        this.LLLFFI = requireViewById(R.id.vad_tips_guide_container);
        this.LLLFZ = (TuxTextView) requireViewById(R.id.vad_tips_guide_text);
        this.LLLI = requireViewById(R.id.vad_tips_guide_wave);
        if (this.LLLIIIL) {
            C19670811xi c19670811xi = this.LLL;
            if (c19670811xi == null) {
                c19670811xi = null;
            }
            c19670811xi.setCircleRadius((c19670811xi.getLayoutParams().width / 2) - C11VU.LIZIZ(8.0f, c19670811xi.getContext()));
            c19670811xi.setMaxProgress(100);
            C786410Ut5.G1(c19670811xi, 8);
        }
        this.LLLIILIL = requireViewById(R.id.vc_touch_outside);
        this.LLLIL = requireViewById(R.id.e0o);
        requireViewById(R.id.y3m);
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.voice_filter_layout_vc);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        C786410Ut5.a6(frameLayout, marginLayoutParams);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireSceneContext(), 4);
        RecyclerView recyclerViewLIZLLL = this.LLLILZ.LIZLLL(this.mView.getContext(), gridLayoutManager, new C346260Dho(gridLayoutManager, 2));
        this.LLLIIL = recyclerViewLIZLLL;
        recyclerViewLIZLLL.getRecycledViewPool().setMaxRecycledViews(0, 16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(268)));
        layoutParams.setMarginStart((int) (((double) C1415610mwR.LIZIZ()) * 0.02d));
        layoutParams.setMarginEnd((int) (((double) C1415610mwR.LIZIZ()) * 0.02d));
        RecyclerView recyclerView2 = this.LLLIIL;
        frameLayout.addView(recyclerView2 != null ? recyclerView2 : null, layoutParams);
        this.LLLILZ.LJFF(this.LLLILZJ);
        this.LLLILZ.LJII(this.LLLILZLLLI);
    }

    @Override // X.AbstractC1663490tOF, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLILZ.onDestroy();
    }

    @Override // X.AbstractC1663490tOF, X.AbstractC1664490tPr
    public final void onHide() {
        super.onHide();
    }

    @Override // X.AbstractC1663490tOF, X.AbstractC1664490tPr
    public final void onShow() {
        super.onShow();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tP9] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.15p2] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0tOz] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0tPP] */
    public v(C385670FAf<Boolean> c385670FAf) {
        this.LLJJJJ = c385670FAf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0136, code lost:
    
        if (r0 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0138, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0139, code lost:
    
        X.C375780EoK.LIZIZ(r0, false);
        r0 = r4.LLLF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x013e, code lost:
    
        if (r0 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0140, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0141, code lost:
    
        X.C375780EoK.LIZIZ(r0, false);
        r0 = r4.LLLFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0146, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0148, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0149, code lost:
    
        X.C375780EoK.LIZIZ(r0, false);
        r0 = r4.LLJZIJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x014e, code lost:
    
        if (r0 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0150, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0151, code lost:
    
        X.C375780EoK.LIZIZ(r0, false);
        r0 = r4.LLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0156, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0158, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0159, code lost:
    
        X.C375780EoK.LIZIZ(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.equals("STATE_PREVIEW_CANCEL") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0126, code lost:
    
        if (r5.equals("STATE_PREVIEW_EMPTY") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0130, code lost:
    
        if (r5.equals("STATE_PREVIEW_NONE") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0134, code lost:
    
        r0 = r4.LLJZ;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v.LLLLLLLLL(java.lang.String):void");
    }
}
