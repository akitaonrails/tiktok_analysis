package com.ss.android.ugc.aweme.story.note.draft;

import X.C01GW;
import X.C098200Yq;
import X.C0DUR;
import X.C0DUV;
import X.C0DXR;
import X.C0OM1;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20581815gG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C339870DUb;
import X.C339940DUi;
import X.C339960DUk;
import X.C346240Dhm;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC339980DUm;
import X.EnumC638250P1r;
import X.InterfaceC21676519sR;
import X.InterfaceC340010DUp;
import Y.ACListenerS139S0100000_4;
import Y.AObserverS169S0200000_4;
import Y.AObserverS208S0100000_4;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryThoughtDraftFragment extends Fragment implements InterfaceC340010DUp {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSHELIOSp9LDctLzt9GzEjOzYHICo5LicnDDctLzsVOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 243));
    public C0DUR LLILLJJLI;
    public C339940DUi LLILLL;
    public ObjectAnimator LLILZ;
    public ObjectAnimator LLILZIL;

    public final StoryThoughtDraftViewModel MR() {
        return (StoryThoughtDraftViewModel) this.LL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.LLILZ;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLILZIL;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            objectAnimator2.cancel();
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC340010DUp
    public final boolean Mj(C339870DUb c339870DUb) {
        StoryThoughtDraftViewModel storyThoughtDraftViewModelMR = MR();
        storyThoughtDraftViewModelMR.LLILZ.setValue(Boolean.TRUE);
        ArrayList arrayList = new ArrayList(storyThoughtDraftViewModelMR.LLILZIL.getValue());
        if (arrayList.contains(c339870DUb.LIZ)) {
            arrayList.remove(c339870DUb.LIZ);
        } else {
            arrayList.add(c339870DUb.LIZ);
        }
        storyThoughtDraftViewModelMR.LLILZIL.setValue(arrayList);
        return true;
    }

    @Override // X.InterfaceC340010DUp
    public final void Vr(C339870DUb c339870DUb, C339960DUk c339960DUk) {
        int i;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        String str3;
        StoryThoughtDraftViewModel storyThoughtDraftViewModelMR = MR();
        if (storyThoughtDraftViewModelMR.LLILZ.getValue().booleanValue()) {
            ArrayList arrayList = new ArrayList(storyThoughtDraftViewModelMR.LLILZIL.getValue());
            if (arrayList.contains(c339870DUb.LIZ)) {
                arrayList.remove(c339870DUb.LIZ);
            } else {
                arrayList.add(c339870DUb.LIZ);
            }
            storyThoughtDraftViewModelMR.LLILZIL.setValue(arrayList);
            return;
        }
        int i2 = c339870DUb.LIZJ.taskStatus;
        if (i2 == EnumC339980DUm.IN_PROGRESS.getValue()) {
            i = 1;
        } else if (i2 == EnumC339980DUm.FINISHED.getValue()) {
            i = 2;
        } else {
            i = 0;
        }
        Map<String, String> map = storyThoughtDraftViewModelMR.LLIZ;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.remove("draft_status");
        C20581815gG.LIZ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("draft_item_status", String.valueOf(i));
        C20684815ws.LJIILLIIL("thought_draft_item_click", linkedHashMap2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c339960DUk.LL.getContext(), "//story_thought_creation_activity");
        smartRouteBuildRoute.withParam("draft", c339870DUb.LIZJ);
        smartRouteBuildRoute.withParam("publish_landing_page", storyThoughtDraftViewModelMR.LLILLL);
        Map<String, String> map2 = storyThoughtDraftViewModelMR.LLIZ;
        String str4 = null;
        if (map2 != null) {
            str = map2.get("has_avatar_prompt");
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("has_avatar_prompt", Intrinsics.LJFF(str, "1"));
        Map<String, String> map3 = storyThoughtDraftViewModelMR.LLIZ;
        if (map3 != null) {
            str2 = map3.get("shoot_enter_from");
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("enter_from", str2);
        Map<String, String> map4 = storyThoughtDraftViewModelMR.LLIZ;
        if (map4 != null) {
            str3 = map4.get("shoot_enter_method");
        } else {
            str3 = null;
        }
        smartRouteBuildRoute.withParam("enter_method", str3);
        Map<String, String> map5 = storyThoughtDraftViewModelMR.LLIZ;
        if (map5 != null) {
            str4 = map5.get("try_it_out_position");
        }
        smartRouteBuildRoute.withParam("try_it_out_position", str4);
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setNavigationBarColor(-16777216);
        }
        final C0DUR c0dur = this.LLILLJJLI;
        if (c0dur != null) {
            TuxNavBar tuxNavBar = c0dur.LLILZ;
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZIZ = "back";
            c1251150ifB.LIZJ(new AwS548S0100000_4(this, 557));
            c0om1.LJ(c1251150ifB);
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = getString(2131846782);
            EnumC638250P1r enumC638250P1r = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZLLL = enumC638250P1r;
            c1250300ido.LIZIZ = "select_all";
            c1250300ido.LJFF = false;
            c1250300ido.LIZ(new AwS548S0100000_4(this, 558));
            c0om1.LJ(c1250300ido);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZIZ = "title";
            c1250250idj.LIZJ = getString(2131832435);
            c0om1.LIZJ = c1250250idj;
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = getString(2131826970);
            c1250300ido2.LIZLLL = enumC638250P1r;
            c1250300ido2.LIZIZ = "select";
            c1250300ido2.LIZ(new AwS548S0100000_4(this, 559));
            c0om1.LIZIZ(c1250300ido2);
            C1250300ido c1250300ido3 = new C1250300ido();
            c1250300ido3.LIZJ = getString(2131826969);
            c1250300ido3.LIZLLL = enumC638250P1r;
            c1250300ido3.LIZIZ = "cancel";
            c1250300ido3.LJFF = false;
            c1250300ido3.LIZ(new AwS548S0100000_4(this, 560));
            c0om1.LIZIZ(c1250300ido3);
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
            c0dur.LLILLL.setLayoutManager(new GridLayoutManager(requireContext(), 3));
            RecyclerView recyclerView = c0dur.LLILLL;
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
            recyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DWg
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    GridLayoutManager gridLayoutManager;
                    C21681919tJ c21681919tJ;
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                            int i = gridLayoutManager.LLILLJJLI;
                            if (1 == c21681919tJ.LLILLJJLI) {
                                int i2 = c21681919tJ.LL;
                                int i3 = this.LL;
                                rect.left = (i2 * i3) / i;
                                rect.right = i3 - (((i2 + 1) * i3) / i);
                                rect.top = i3;
                            }
                        }
                    }
                }
            });
            c0dur.LLILLL.setItemAnimator(null);
            C339940DUi c339940DUi = new C339940DUi(this);
            this.LLILLL = c339940DUi;
            c0dur.LLILLL.setAdapter(c339940DUi);
            c0dur.LLILLL.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0DUQ
                @Override // X.InterfaceC21676519sR
                public final void m3(View view2) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view2) {
                    C339870DUb c339870DUb;
                    C817600W5m c817600W5m;
                    int i;
                    LinkedHashMap linkedHashMap;
                    int bindingAdapterPosition = c0dur.LLILLL.getChildViewHolder(view2).getBindingAdapterPosition();
                    List list = (List) this.MR().LLILZLL.getValue();
                    AbstractC339890DUd abstractC339890DUd = null;
                    if (list != null) {
                        abstractC339890DUd = (AbstractC339890DUd) C13LP.LJJJLZIJ(bindingAdapterPosition, list);
                    }
                    if ((abstractC339890DUd instanceof C339870DUb) && (c339870DUb = (C339870DUb) abstractC339890DUd) != null && (c817600W5m = c339870DUb.LIZJ) != null) {
                        StoryThoughtDraftViewModel storyThoughtDraftViewModelMR = this.MR();
                        storyThoughtDraftViewModelMR.getClass();
                        int i2 = c817600W5m.taskStatus;
                        if (i2 == EnumC339980DUm.IN_PROGRESS.getValue()) {
                            i = 1;
                        } else if (i2 == EnumC339980DUm.FINISHED.getValue()) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        Map<String, String> map = storyThoughtDraftViewModelMR.LLIZ;
                        if (map != null) {
                            linkedHashMap = new LinkedHashMap(map);
                        } else {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.remove("draft_status");
                        C20581815gG.LIZ.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                        linkedHashMap2.put("draft_item_status", String.valueOf(i));
                        C20684815ws.LJIILLIIL("thought_draft_item_show", linkedHashMap2);
                    }
                }
            });
            C786410Ut5.O7(c0dur.LLILLJJLI, new ACListenerS139S0100000_4(this, 112));
        }
        C0DUR c0dur2 = this.LLILLJJLI;
        if (c0dur2 != null) {
            MR().LLILZLL.observe(getViewLifecycleOwner(), new AObserverS208S0100000_4(this, 17));
            MR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS169S0200000_4(c0dur2, this, 4));
            MR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS169S0200000_4(c0dur2, this, 5));
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C0DUV(this, c0dur2, null), 3);
        }
        requireActivity().getOnBackPressedDispatcher().LIZ(getViewLifecycleOwner(), new C346240Dhm(this, 1));
        StoryThoughtDraftViewModel storyThoughtDraftViewModelMR = MR();
        storyThoughtDraftViewModelMR.getClass();
        C20581815gG c20581815gG = C20581815gG.LIZ;
        Map<String, String> mapLJ = storyThoughtDraftViewModelMR.LLIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c20581815gG.getClass();
        C20684815ws.LJIILLIIL("enter_thought_draft", mapLJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe_, viewGroup, false);
        int i = R.id.m_y;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.m_y, viewTd);
        if (frameLayout != null) {
            i = R.id.t0q;
            RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.t0q, viewTd);
            if (recyclerView != null) {
                i = R.id.y08;
                TuxNavBar tuxNavBar = (TuxNavBar) C1616006Uk.LIZ(R.id.y08, viewTd);
                if (tuxNavBar != null) {
                    i = R.id.zho;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.zho, viewTd);
                    if (tuxTextView != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewTd;
                        this.LLILLJJLI = new C0DUR(frameLayout2, frameLayout, recyclerView, tuxNavBar, tuxTextView);
                        C19GS c19gs = null;
                        if (!(frameLayout2 instanceof View)) {
                            frameLayout2 = null;
                        }
                        if (frameLayout2 != null) {
                            try {
                                ViewTreeLifecycleOwner.set(frameLayout2, getViewLifecycleOwner());
                                ViewTreeViewModelStoreOwner.set(frameLayout2, this);
                                frameLayout2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                                C19EG activity = getActivity();
                                if (activity instanceof C19GS) {
                                    c19gs = (C19GS) activity;
                                }
                                C1685300txQ.LIZ(c19gs);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                return frameLayout2;
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return frameLayout2;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
