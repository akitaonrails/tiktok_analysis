package com.ss.android.ugc.aweme.tako.otherpage.entitysug;

import X.C04JC;
import X.C08A4;
import X.C098200Yq;
import X.C0HTI;
import X.C0Q4Y;
import X.C0QSF;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C13LC;
import X.C13LP;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1856220yP6;
import X.C1857680yRS;
import X.C1859900yV2;
import X.C1860130yVP;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20235014Fo;
import X.C20600815jK;
import X.C20627315nb;
import X.C2097608Jq;
import X.C21419418s4;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C597050NbL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEntityInfoSheetFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpHELIOSZyo9PCw4MDwmL2sYKCQ8DSs4IDsqASsqJhw7LSA4Dz0yLygpJzs=";
    public ConstraintLayout LLIZ;
    public TuxNavBar LLIZLLLIL;
    public View LLJ;
    public ConstraintLayout LLJI;
    public C1860130yVP LLJIJIL;
    public TuxSkeletonLayout LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public TuxTextView LLJJ;
    public C20627315nb LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public C21419418s4 LLJJIJIL = new C21419418s4(0, 0.0f, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, -1, 16777215);
    public Long LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public EntityIntro LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public Message LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (C08A4.LIZIZ(Long.valueOf(this.LLJL)) && (interfaceC665370Q7z = this.LLJJJJLIIL) != null) {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = c1863850ybP.LL;
                String str2 = c1863850ybP.LLILLJJLI;
                String str3 = c1863850ybP.LLILZIL;
                String str4 = this.LLJJLIIIJLLLLLLLZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJL;
                String str5 = this.LLJJJJ ? "highlighted_word" : "segmented_word";
                String str6 = this.LLJJJIL;
                EntityIntro entityIntro = this.LLJJJJJIL;
                String strValueOf = String.valueOf(entityIntro != null ? entityIntro.content : null);
                EntityIntro entityIntro2 = this.LLJJJJJIL;
                String str7 = entityIntro2 != null ? entityIntro2.msgUniqueKey : null;
                String str8 = c1863850ybP.LLILZLL;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = c1863850ybP.LLIZ;
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str4), new Pair("duration", String.valueOf(jCurrentTimeMillis)), new Pair("panel_source", str5), new Pair("word_content", str6), new Pair("word_detail_content", strValueOf));
                if (str7 != null && str7.length() > 0) {
                    mapLJIIJ.put("bot_message_id", str7);
                }
                if (str8.length() > 0) {
                    mapLJIIJ.put("tako_session_id", str8);
                }
                if (str9 != null && str9.length() > 0) {
                    mapLJIIJ.put("tako_chat_id", str9);
                }
                c20235014FoLIZ.LIZ("tikbot_panel_stay_duration", mapLJIIJ);
            }
        }
        super.onDestroy();
    }

    public final void SR(Integer num) {
        IMessageAbility iMessageAbility;
        C20600815jK<InterfaceC1891350zJl> state;
        int i = 0;
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            View view = this.LLJILJILJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            ConstraintLayout constraintLayout = this.LLJI;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
            TuxSkeletonLayout tuxSkeletonLayout = this.LLJILJIL;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setLoading(true);
            }
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJILJIL;
            if (tuxSkeletonLayout2 != null) {
                C786410Ut5.LLLZL(tuxSkeletonLayout2, 0);
            }
        }
        View view2 = this.LLJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TuxTextView tuxTextView = this.LLJJ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C20627315nb c20627315nb = this.LLJJI;
        if (c20627315nb != null) {
            C786410Ut5.LLLZLL(c20627315nb, 0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            ArrayList arrayList = new ArrayList(4);
            do {
                arrayList.add(new C1856220yP6(Integer.valueOf(i), 4, z, 743));
                i++;
            } while (i < 4);
            state.LJIILL(C13LP.LL(arrayList, 4), null);
        }
        View view3 = this.LLJJIJI;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJJJJLIIL;
        if (interfaceC665370Q7z != null && (iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)) != null) {
            iMessageAbility.nj1(this.LLJJJ, this.LLJJJIL, this.LLJJLIIIJLLLLLLLZ, new AwS393S0200000_27(this, num, 57), new AwS606S0100000_27(this, 259), num);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        int height;
        C419910GdJ c419910GdJ;
        int iIntValue;
        Integer numLIZJ;
        Window window;
        View decorView;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.x6i);
        this.LLIZ = constraintLayout;
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int iLJIIJJI = height - C12ES.LJIIJJI(getContext());
        int iLJIIIIZZ = C12ES.LJIIIIZZ(getContext());
        if (iLJIIIIZZ >= iLJIIJJI) {
            iLJIIJJI = iLJIIIIZZ;
        }
        if (getContext() != null) {
            if (layoutParams != null) {
                layoutParams.height = (int) (iLJIIJJI * 0.68f);
            }
            ConstraintLayout constraintLayout2 = this.LLIZ;
            if (constraintLayout2 != null) {
                C786410Ut5.m6(constraintLayout2, layoutParams);
            }
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.x6t);
        this.LLIZLLLIL = tuxNavBar;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
        }
        TuxNavBar tuxNavBar2 = this.LLIZLLLIL;
        if (tuxNavBar2 != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxNavBar2.setNavBackground(iIntValue);
        }
        TuxNavBar tuxNavBar3 = this.LLIZLLLIL;
        if (tuxNavBar3 != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 881));
            tuxNavBar3.LIZ(c1251150ifB);
        }
        this.LLJ = view.findViewById(R.id.vv6);
        this.LLJI = (ConstraintLayout) view.findViewById(R.id.x6j);
        TextView textView = (TextView) view.findViewById(R.id.x6z);
        if (textView != null) {
            textView.setText(this.LLJJJIL);
        }
        this.LLJIJIL = (C1860130yVP) view.findViewById(R.id.x6y);
        Context context2 = getContext();
        if (context2 != null) {
            this.LLJJIJIL = C1859900yV2.LIZIZ.LIZ(context2);
        }
        C1860130yVP c1860130yVP = this.LLJIJIL;
        if (c1860130yVP != null) {
            C1859900yV2.LIZIZ.LJFF(c1860130yVP.getContext(), c1860130yVP, 111, R.attr.a1h);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.x6k);
        if (tuxIconView != null) {
            if (C0QSF.LIZ()) {
                c419910GdJ = C1857680yRS.LIZ.LJI(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
            } else if (C960203pA.LIZIZ(view.getContext())) {
                c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bitmap_tako_new_dark;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bitmap_tako_new_light;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.x6m);
        if (textView2 != null) {
            textView2.setText(getString(2131849868));
        }
        this.LLJILJIL = (TuxSkeletonLayout) view.findViewById(R.id.x6u);
        this.LLJILJILJ = view.findViewById(R.id.x6n);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.x6o);
        if (tuxIconView2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            tuxIconView2.setImageDrawable(c0hti.LIZ(tuxIconView2.getContext()));
        }
        View viewFindViewById2 = view.findViewById(R.id.x6p);
        this.LLJILLL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 29), viewFindViewById2);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.x7a);
        this.LLJJ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(getString(2131849657));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.x79);
        this.LLJJIII = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoEntitySugItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C04JC(10));
        }
        this.LLJJI = (C20627315nb) view.findViewById(R.id.x7_);
        this.LLJJIJI = view.findViewById(R.id.x71);
        View viewFindViewById3 = view.findViewById(R.id.x72);
        this.LLJJIJIIJIL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 30), viewFindViewById3);
        }
        SR(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.foa, viewGroup, false);
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
