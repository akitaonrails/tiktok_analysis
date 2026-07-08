package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AbstractC883730Ylf;
import X.C01GW;
import X.C07QP;
import X.C0C64;
import X.C0HZQ;
import X.C0I0B;
import X.C0Z32;
import X.C0Z3E;
import X.C0Z3V;
import X.C0Z71;
import X.C0Z72;
import X.C0Z73;
import X.C0Z74;
import X.C0Z76;
import X.C0Z78;
import X.C0Z79;
import X.C0Z7A;
import X.C0Z7B;
import X.C0Z8A;
import X.C0Z8J;
import X.C0Z8L;
import X.C0Z8M;
import X.C0Z8N;
import X.C0Z8O;
import X.C0Z8P;
import X.C0Z8R;
import X.C0Z93;
import X.C0Z9A;
import X.C0Z9B;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1388190mED;
import X.C1492305sn;
import X.C1906880zio;
import X.C19212010Ec;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2214201BlK;
import X.C2441009hQ;
import X.C356901a3;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C438710HIf;
import X.C451690HnT;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C878950Ydx;
import X.C881500Yi4;
import X.C884160YmM;
import X.C890610Ywl;
import X.C892460Yzk;
import X.C894750Z8f;
import X.C997540c48;
import X.EnumC714850S2h;
import X.InterfaceC1491305sd;
import X.InterfaceC1903450zdH;
import X.InterfaceC427850Gq7;
import X.InterfaceC879010Ye3;
import X.InterfaceC883640YlW;
import X.InterfaceC884020Ym8;
import X.InterfaceC884640Yn8;
import X.InterfaceC885810Yp1;
import X.InterfaceC887660Ys0;
import X.InterfaceC888500YtM;
import X.ViewOnLongClickListenerC913880ZtC;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS149S0100000_14;
import Y.ARunnableS83S0200000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SessionListBaseVH<VO extends InterfaceC888500YtM, AH extends InterfaceC883640YlW> extends C0Z3E implements DefaultLifecycleObserver, C0Z32<C890610Ywl>, C0Z9B, InterfaceC1903450zdH, GenericLifecycleObserver {
    public final C01GW LL;
    public final C0Z7A LLILLJJLI;
    public AnimatorSet LLILLL;
    public AnimatorSet LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final AFwS248S0000000_14 LLJILJILJ;
    public final AFwS248S0000000_14 LLJILLL;
    public C19EG LLJJ;
    public C1906880zio LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public VO LLJJIJIIJIL;
    public C890610Ywl LLJJIJIL;
    public C890610Ywl LLJJJ;
    public C0Z71 LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public WeakReference<LifecycleOwner> LLJJJJLIIL;

    @Override // X.C0Z9B
    public void C1(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public List<Animator> D5(boolean z) {
        return null;
    }

    @Override // X.C0Z9B
    public void LJLL(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public void LLLLZI(float f) {
    }

    @Override // X.C0Z9B
    public C0HZQ b() {
        return null;
    }

    public abstract String b6();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
      0x0025: PHI (r1v9 androidx.lifecycle.LifecycleOwner) = (r1v2 androidx.lifecycle.LifecycleOwner), (r1v11 androidx.lifecycle.LifecycleOwner) binds: [B:10:0x0023, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0Z32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach() {
        /*
            r10 = this;
            r5 = 1
            r10.LLJJIII = r5
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r10.LLJJJJLIIL
            r3 = 0
            if (r0 == 0) goto L10
            java.lang.Object r1 = r0.get()
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 != 0) goto L25
        L10:
            boolean r0 = X.C1591220rVg.LIZLLL()
            if (r0 == 0) goto L97
            android.view.View r0 = r10.itemView
            androidx.fragment.app.Fragment r1 = X.C946803n0.LIZ(r0)
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r10.LLJJJJLIIL = r0
            if (r1 == 0) goto L2e
        L25:
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            if (r0 == 0) goto L2e
            r0.addObserver(r10)
        L2e:
            X.0Yi4 r0 = X.AbstractC883730Ylf.LJIIIIZZ
            r0.getClass()
            X.0Ylf r4 = X.C881500Yi4.LJ()
            if (r4 == 0) goto L51
            VO extends X.0YtM r0 = r10.LLJJIJIIJIL
            X.05sd r2 = X.AbstractC883730Ylf.LJIJJ(r0)
            if (r2 == 0) goto L51
            X.0YmM r0 = com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine r1 = X.C884160YmM.LIZ()
            X.05wr r0 = r4.LJIILIIL()
            r1.LJIILIIL(r0, r2)
        L51:
            X.0Yp5 r0 = X.C885850Yp5.LIZ
            r0.getClass()
            X.C885850Yp5.LIZLLL = r5
            java.lang.Class<com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor> r4 = com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor r4 = (com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor) r4
            if (r4 == 0) goto L7b
            VO extends X.0YtM r0 = r10.LLJJIJIIJIL
            if (r0 == 0) goto L72
            java.lang.String r2 = r0.getSessionId()
            if (r2 != 0) goto L74
        L72:
            java.lang.String r2 = ""
        L74:
            long r0 = java.lang.System.currentTimeMillis()
            r4.LIZ(r0, r2)
        L7b:
            X.10Ec r2 = X.C19212010Ec.LIZJ
            VO extends X.0YtM r0 = r10.LLJJIJIIJIL
            if (r0 == 0) goto L95
            X.0Ye3 r1 = r0.getPageKey()
        L85:
            boolean r0 = r1 instanceof X.C878950Ydx
            if (r0 == 0) goto L8f
            X.0Ydx r1 = (X.C878950Ydx) r1
            if (r1 == 0) goto L8f
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r3 = r1.LLILLL
        L8f:
            java.lang.String r0 = "dm_cell_show"
            r2.LJJIJLIJ(r3, r0)
            return
        L95:
            r1 = r3
            goto L85
        L97:
            android.view.View r0 = r10.itemView
            androidx.fragment.app.Fragment r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LIZJ(r0)
            if (r1 != 0) goto L1c
            X.19EG r1 = r10.getActivity()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH.onAttach():void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // X.C0Z32
    public void onDetach() {
        InterfaceC1491305sd interfaceC1491305sdLJIJJ;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LLJJIII = false;
        WeakReference<LifecycleOwner> weakReference = this.LLJJJJLIIL;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ == null || (interfaceC1491305sdLJIJJ = AbstractC883730Ylf.LJIJJ(this.LLJJIJIIJIL)) == null) {
            return;
        }
        IChatListEngine.LIZ.getClass();
        C884160YmM.LIZ().LJIILIIL(abstractC883730YlfLJ.LJIILIIL(), interfaceC1491305sdLJIJJ);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final C19EG R5() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (((Boolean) C07QP.LIZIZ.getValue()).booleanValue()) {
            Activity activityLJFF = C2214201BlK.LJFF();
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("isNull", c19egLIZIZ == null ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[1] = new Pair("isDestroyed", (c19egLIZIZ == null || !c19egLIZIZ.isDestroyed()) ? CardStruct.IStatusCode.DEFAULT : "1");
            pairArr[2] = new Pair("isSameAsCurrent", Intrinsics.LJFF(c19egLIZIZ, activityLJFF) ? "1" : CardStruct.IStatusCode.DEFAULT);
            C20684815ws.LJIILLIIL("im_activity_ref_on_click", C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (((Number) C07QP.LIZ.getValue()).intValue() == 1 && (c19egLIZIZ == null || c19egLIZIZ.isDestroyed())) {
            Activity activityLJFF2 = C2214201BlK.LJFF();
            if (activityLJFF2 instanceof C19EG) {
                return (C19EG) activityLJFF2;
            }
        }
        return c19egLIZIZ;
    }

    public Map<String, String> S5() {
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        String mobValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C19212010Ec.LIZJ.LJJ()) {
            VO vo = this.LLJJIJIIJIL;
            InterfaceC879010Ye3 pageKey = vo != null ? vo.getPageKey() : null;
            if ((pageKey instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) pageKey) != null && (filterTabType = c878950Ydx.LLILLL) != null && (mobValue = filterTabType.getMobValue()) != null) {
                linkedHashMap.put("tab_name", mobValue);
            }
        }
        return linkedHashMap;
    }

    public final C1906880zio W5() {
        return (C1906880zio) this.LLILZLL.getValue();
    }

    public final TuxTextView X5() {
        return (TuxTextView) this.LLJI.getValue();
    }

    public final TuxTextView a6() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public C427660Gpo c6() {
        return (C427660Gpo) this.LLIZ.getValue();
    }

    public final C19EG getActivity() {
        C19EG c19eg = this.LLJJ;
        if (c19eg != null) {
            return c19eg;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        this.LLJJ = c19egLIZIZ;
        return c19egLIZIZ;
    }

    @Override // X.InterfaceC1903450zdH
    public final String uniqueItemIdForFirstScreen() {
        String strItemUniqueId;
        C890610Ywl c890610Ywl = this.LLJJJ;
        if (c890610Ywl == null || (strItemUniqueId = c890610Ywl.itemUniqueId()) == null || strItemUniqueId.length() <= 0) {
            return null;
        }
        return strItemUniqueId;
    }

    public Function1<VO, Unit> U5() {
        return this.LLJILLL;
    }

    public Function1<VO, Unit> V5() {
        return this.LLJILJILJ;
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLILLL;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLILZ;
    }

    public SessionListBaseVH(final View view) {
        new RecyclerView.ViewHolder(view) { // from class: X.0Z3E
        };
        this.LL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(119));
        this.LLILLJJLI = C0Z7A.LIZ.getValue();
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 420));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 418));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 417));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 424));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 423));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 422));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 419));
        this.LLJILJILJ = AFwS248S0000000_14.get$arr$(121);
        this.LLJILLL = AFwS248S0000000_14.get$arr$(120);
        this.LLJJI = W5();
        this.LLJJJIL = C0Z71.INIT;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 421));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(118));
        View view2 = this.itemView;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view2, new ARunnableS83S0200000_14(view2, this, 8));
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 17), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC913880ZtC(this, 0));
    }

    public void L5(VO vo) {
        Object avatar;
        C0Z71 c0z71;
        Object avatar2 = vo.getAvatar();
        VO vo2 = this.LLJJIJIIJIL;
        C427660Gpo c427660Gpo = null;
        if (vo2 != null) {
            avatar = vo2.getAvatar();
        } else {
            avatar = null;
        }
        if (Intrinsics.LJFF(avatar2, avatar) && ((c0z71 = this.LLJJJIL) == C0Z71.COMPLETE || c0z71 == C0Z71.LOADING)) {
            return;
        }
        this.LLJJJIL = C0Z71.INIT;
        Object avatar3 = vo.getAvatar();
        if (avatar3 instanceof UrlModel) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) avatar3));
            C427660Gpo c427660GpoC6 = c6();
            if (c427660GpoC6 == null) {
                return;
            }
            c1331670kl3LJIIIIZZ.LJJ(c427660GpoC6);
            C0Z73.LIZ.getClass();
            c1331670kl3LJIIIIZZ.LJIL(C894750Z8f.LIZIZ.getValue());
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "SessionRefactor-SessionListBaseVH:bindAvatar", (InterfaceC427850Gq7) this.LLJJJJ.getValue(), false, null, null, null, 60);
            return;
        }
        if (avatar3 instanceof C997540c48) {
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(avatar3);
            C427660Gpo c427660GpoC62 = c6();
            if (c427660GpoC62 == null) {
                return;
            }
            c1331670kl3LJIIIIZZ2.LJJ(c427660GpoC62);
            C0Z73.LIZ.getClass();
            c1331670kl3LJIIIIZZ2.LJIL(C894750Z8f.LIZIZ.getValue());
            c1331670kl3LJIIIIZZ2.LJJIIZ = EnumC714850S2h.SMALL;
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ2, "SessionRefactor-SessionListBaseVH:bindAvatar", (InterfaceC427850Gq7) this.LLJJJJ.getValue(), false, null, null, null, 60);
            return;
        }
        if (avatar3 instanceof String) {
            C427660Gpo c427660GpoC63 = c6();
            if (c427660GpoC63 == null) {
                return;
            }
            String str = (String) avatar3;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.LIZ)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJI.LIZ)));
            C0Z73.LIZ.getClass();
            Drawable value = C894750Z8f.LIZIZ.getValue();
            if (c427660GpoC63 instanceof SmartAvatarImageView) {
                c427660Gpo = c427660GpoC63;
            }
            C451690HnT.LIZ(str, c427660Gpo);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(c427660GpoC63);
            c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
            c1331670kl3LJIIIZ.LJIL(value);
            c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.SMALL;
            C1332130kln.LJFF(c1331670kl3LJIIIZ, "SessionRefactor-SessionListBaseVH:group", (InterfaceC427850Gq7) this.LLJJJJ.getValue(), false, null, null, null, 60);
            return;
        }
        C0Z73.LIZ.getClass();
        C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C894750Z8f.LIZIZ.getValue());
        C427660Gpo c427660GpoC64 = c6();
        if (c427660GpoC64 == null) {
            return;
        }
        c1331670kl3LJIIIIZZ3.LJJ(c427660GpoC64);
        c1331670kl3LJIIIIZZ3.LJJIIZ = EnumC714850S2h.SMALL;
        c1331670kl3LJIIIIZZ3.LJIIJ((InterfaceC427850Gq7) this.LLJJJJ.getValue());
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLILLL = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLILZ = animatorSet;
    }

    @Override // X.C0Z34
    public void LLLLJ(C1906880zio c1906880zio) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextViewX5;
        TuxTextView tuxTextViewX52;
        TuxTextView tuxTextViewA6;
        TuxTextView tuxTextViewA62;
        C427660Gpo c427660GpoC6;
        ViewGroup.LayoutParams layoutParams2;
        if (this.LLJJI == c1906880zio) {
            return;
        }
        this.LLJJI = c1906880zio;
        if (c1906880zio.LIZ != -1 && (c427660GpoC6 = c6()) != null && (layoutParams2 = c427660GpoC6.getLayoutParams()) != null) {
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(T5(c1906880zio))));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(T5(c1906880zio))));
        }
        if (c1906880zio.LIZLLL != -1 && (tuxTextViewA62 = a6()) != null) {
            tuxTextViewA62.setTuxFont(c1906880zio.LIZLLL);
        }
        if (c1906880zio.LJ != -1 && (tuxTextViewA6 = a6()) != null) {
            tuxTextViewA6.LJJJJI(c1906880zio.LJ);
        }
        if (c1906880zio.LJFF != -1 && (tuxTextViewX52 = X5()) != null) {
            tuxTextViewX52.setTuxFont(c1906880zio.LJFF);
        }
        if (c1906880zio.LJII != -1 && (tuxTextViewX5 = X5()) != null) {
            tuxTextViewX5.setTextColor(c1906880zio.LJII);
        }
        if (c1906880zio.LJIIIZ != -1 && this.LLJILJIL.getValue() != null) {
            View view = (View) this.LLJILJIL.getValue();
            ViewGroup.LayoutParams layoutParams3 = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                View view2 = (View) this.LLJILJIL.getValue();
                if (view2 != null) {
                    layoutParams3 = view2.getLayoutParams();
                }
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LJIIIZ)));
                }
            }
        }
    }

    public void N5(int i) {
        this.LLILZIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P5(VO r17) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH.P5(X.0YtM):boolean");
    }

    public int T5(C1906880zio c1906880zio) {
        return c1906880zio.LIZ;
    }

    public void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLJJIJI = false;
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLJJIJI = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        this.itemView.setLongClickable(true);
    }

    public final void I5(C890610Ywl c890610Ywl, int i) {
        VO vo;
        C0Z8R c0z8r;
        InterfaceC879010Ye3 key;
        C0Z72 c0z72Copy;
        C0Z74 rightViewVO;
        C0Z72 middleViewVO;
        InterfaceC884640Yn8 config;
        C0Z8O c0z8o;
        InterfaceC879010Ye3 key2;
        C0Z72 c0z72Copy2;
        C0Z74 rightViewVO2;
        C0Z72 middleViewVO2;
        InterfaceC884640Yn8 config2;
        C0Z8N c0z8n;
        InterfaceC879010Ye3 key3;
        C0Z72 c0z72Copy3;
        C0Z74 rightViewVO3;
        C0Z72 middleViewVO3;
        InterfaceC884640Yn8 config3;
        this.LLJJIJIL = this.LLJJJ;
        this.LLJJJ = c890610Ywl;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "share_im_inbox_session_list_bind_cell_order", true, true)) {
            N5(i);
        }
        Object objLIZ = c890610Ywl.LIZ();
        C0Z74 c0z74Copy = null;
        if ((objLIZ instanceof InterfaceC888500YtM) && (vo = (VO) objLIZ) != null) {
            ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_UID, true).LIZ("conversation_load", vo.getSessionId());
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0Z76 c0z76 = (C0Z76) this.LL.getValue();
            if (c0z76 != null) {
                c0z76.LIZIZ(b6());
            }
            L5(vo);
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null) {
                if (vo instanceof C0Z8L) {
                    InterfaceC885810Yp1<?> interfaceC885810Yp1LIZ = C0Z8J.LIZ(vo);
                    if ((interfaceC885810Yp1LIZ instanceof C0Z8N) && (c0z8n = (C0Z8N) interfaceC885810Yp1LIZ) != null) {
                        IChatListEngine.LIZ.getClass();
                        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
                        InterfaceC884020Ym8 interfaceC884020Ym8 = abstractC883730YlfLJ.LJ;
                        if (interfaceC884020Ym8 != null && (config3 = interfaceC884020Ym8.getConfig()) != null) {
                            key3 = config3.getKey();
                        } else {
                            key3 = null;
                        }
                        C0Z8L c0z8l = (C0Z8L) vo;
                        iChatListEngineLIZ.LJIIJJI(c0z8n, key3, c0z8l.isSnapshot());
                        c0z8l.setLightInteractionEntryConf(c0z8n.getLightInteractionEntryConf());
                        c0z8l.setHasStreakReminderInlineMsg(c0z8n.getHasStreakReminderInlineMsg());
                        C0Z72 middleViewVO4 = c0z8l.getMiddleViewVO();
                        if (middleViewVO4 != null) {
                            C0Z8A voContentType = c0z8n.getVoContentType();
                            if (voContentType == null && ((middleViewVO3 = c0z8l.getMiddleViewVO()) == null || (voContentType = middleViewVO3.contentType) == null)) {
                                voContentType = new C892460Yzk("", "no_content");
                            }
                            c0z72Copy3 = middleViewVO4.copy(middleViewVO4.sessionId, middleViewVO4.title, middleViewVO4.showVerifyIcon, middleViewVO4.chatStatus, voContentType, c0z8n.getTimestamp(), middleViewVO4.sessionUnreadViewState, middleViewVO4.chatHint);
                        } else {
                            c0z72Copy3 = null;
                        }
                        c0z8l.setMiddleViewVO(c0z72Copy3);
                        C0Z74 rightViewVO4 = c0z8l.getRightViewVO();
                        if (rightViewVO4 != null) {
                            VORightOperationType rightOperationType = c0z8n.getRightOperationType();
                            if (rightOperationType == null && ((rightViewVO3 = c0z8l.getRightViewVO()) == null || (rightOperationType = rightViewVO3.rightOperationType) == null)) {
                                rightOperationType = C0Z78.INSTANCE;
                            }
                            c0z74Copy = rightViewVO4.copy(rightOperationType);
                        }
                        c0z8l.setRightViewVO(c0z74Copy);
                    }
                } else if (vo instanceof C0Z8M) {
                    InterfaceC885810Yp1<?> interfaceC885810Yp1LIZ2 = C0Z8J.LIZ(vo);
                    if ((interfaceC885810Yp1LIZ2 instanceof C0Z8O) && (c0z8o = (C0Z8O) interfaceC885810Yp1LIZ2) != null) {
                        IChatListEngine.LIZ.getClass();
                        IChatListEngine iChatListEngineLIZ2 = C884160YmM.LIZ();
                        InterfaceC884020Ym8 interfaceC884020Ym82 = abstractC883730YlfLJ.LJ;
                        if (interfaceC884020Ym82 != null && (config2 = interfaceC884020Ym82.getConfig()) != null) {
                            key2 = config2.getKey();
                        } else {
                            key2 = null;
                        }
                        C0Z8M c0z8m = (C0Z8M) vo;
                        iChatListEngineLIZ2.LJIIJJI(c0z8o, key2, c0z8m.isSnapshot());
                        c0z8m.setLightInteractionEntryConf(c0z8o.getLightInteractionEntryConf());
                        C0Z72 middleViewVO5 = c0z8m.getMiddleViewVO();
                        if (middleViewVO5 != null) {
                            C0Z8A voContentType2 = c0z8o.getVoContentType();
                            if (voContentType2 == null && ((middleViewVO2 = c0z8m.getMiddleViewVO()) == null || (voContentType2 = middleViewVO2.contentType) == null)) {
                                voContentType2 = new C892460Yzk("", "no_content");
                            }
                            c0z72Copy2 = middleViewVO5.copy(middleViewVO5.sessionId, middleViewVO5.title, middleViewVO5.showVerifyIcon, middleViewVO5.chatStatus, voContentType2, c0z8o.getTimestamp(), middleViewVO5.sessionUnreadViewState, middleViewVO5.chatHint);
                        } else {
                            c0z72Copy2 = null;
                        }
                        c0z8m.setMiddleViewVO(c0z72Copy2);
                        C0Z74 rightViewVO5 = c0z8m.getRightViewVO();
                        if (rightViewVO5 != null) {
                            VORightOperationType rightOperationType2 = c0z8o.getRightOperationType();
                            if (rightOperationType2 == null && ((rightViewVO2 = c0z8m.getRightViewVO()) == null || (rightOperationType2 = rightViewVO2.rightOperationType) == null)) {
                                rightOperationType2 = C0Z78.INSTANCE;
                            }
                            c0z74Copy = rightViewVO5.copy(rightOperationType2);
                        }
                        c0z8m.setRightViewVO(c0z74Copy);
                    }
                } else if (vo instanceof C0Z8P) {
                    InterfaceC885810Yp1<?> interfaceC885810Yp1LIZ3 = C0Z8J.LIZ(vo);
                    if ((interfaceC885810Yp1LIZ3 instanceof C0Z8R) && (c0z8r = (C0Z8R) interfaceC885810Yp1LIZ3) != null) {
                        IChatListEngine.LIZ.getClass();
                        IChatListEngine iChatListEngineLIZ3 = C884160YmM.LIZ();
                        InterfaceC884020Ym8 interfaceC884020Ym83 = abstractC883730YlfLJ.LJ;
                        if (interfaceC884020Ym83 != null && (config = interfaceC884020Ym83.getConfig()) != null) {
                            key = config.getKey();
                        } else {
                            key = null;
                        }
                        C0Z8P c0z8p = (C0Z8P) vo;
                        iChatListEngineLIZ3.LJIIJJI(c0z8r, key, c0z8p.isSnapshot());
                        C0Z72 middleViewVO6 = c0z8p.getMiddleViewVO();
                        if (middleViewVO6 != null) {
                            C0Z8A voContentType3 = c0z8r.getVoContentType();
                            if (voContentType3 == null && ((middleViewVO = c0z8p.getMiddleViewVO()) == null || (voContentType3 = middleViewVO.contentType) == null)) {
                                voContentType3 = new C892460Yzk("", "no_content");
                            }
                            c0z72Copy = middleViewVO6.copy(middleViewVO6.sessionId, middleViewVO6.title, middleViewVO6.showVerifyIcon, middleViewVO6.chatStatus, voContentType3, c0z8r.getTimestamp(), middleViewVO6.sessionUnreadViewState, middleViewVO6.chatHint);
                        } else {
                            c0z72Copy = null;
                        }
                        c0z8p.setMiddleViewVO(c0z72Copy);
                        C0Z74 rightViewVO6 = c0z8p.getRightViewVO();
                        if (rightViewVO6 != null) {
                            VORightOperationType rightOperationType3 = c0z8r.getRightOperationType();
                            if (rightOperationType3 == null && ((rightViewVO = c0z8p.getRightViewVO()) == null || (rightOperationType3 = rightViewVO.rightOperationType) == null)) {
                                rightOperationType3 = C0Z78.INSTANCE;
                            }
                            c0z74Copy = rightViewVO6.copy(rightOperationType3);
                        }
                        c0z8p.setRightViewVO(c0z74Copy);
                    }
                }
            }
            if (!Intrinsics.LJFF(vo, this.LLJJIJIIJIL)) {
                this.LLJJIJIIJIL = vo;
                j7(vo, i);
                C0Z76 c0z762 = (C0Z76) this.LL.getValue();
                if (c0z762 != null) {
                    c0z762.LIZ(System.currentTimeMillis() - jCurrentTimeMillis);
                }
                C0Z7A c0z7a = this.LLILLJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c0z7a.getClass();
                C0Z79 c0z79LIZ = C1492305sn.LIZ();
                if (!c0z79LIZ.LJIILJJIL().get()) {
                    C0Z7B c0z7b = c0z79LIZ.LIZJ;
                    c0z7b.LJIILLIIL += jCurrentTimeMillis2;
                    c0z7b.LJIIZILJ++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void j7(VO vo, int i) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "share_im_inbox_session_list_bind_cell_order", true, true)) {
            N5(i);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.itemView.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (C0Z93.LIZJ()) {
                View view = this.itemView;
                StateListDrawable stateListDrawable = new StateListDrawable();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.o_, view.getContext());
                if (numLIZJ2 != null) {
                    stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(C2441009hQ.LJIIJ(numLIZJ2.intValue(), iIntValue)));
                    view.setBackground(stateListDrawable);
                    return;
                }
                return;
            }
            this.itemView.setBackground(null);
            C427690Gpr.LJ(this.itemView, 0.0f);
        }
    }
}
