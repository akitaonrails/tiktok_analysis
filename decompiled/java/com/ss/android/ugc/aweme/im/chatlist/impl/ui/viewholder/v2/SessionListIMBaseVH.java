package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AbstractC1711506n3;
import X.AbstractC19486711Lt;
import X.AbstractC883730Ylf;
import X.AbstractC884010Ym7;
import X.C01GW;
import X.C06H2;
import X.C06LY;
import X.C0ALI;
import X.C0ALJ;
import X.C0H61;
import X.C0I0B;
import X.C0Z72;
import X.C0Z76;
import X.C0Z86;
import X.C0Z8A;
import X.C0Z8E;
import X.C0Z8L;
import X.C0Z8M;
import X.C0Z9A;
import X.C0Z9D;
import X.C11RO;
import X.C11S5;
import X.C123100dR;
import X.C1274004yg;
import X.C1308910kAL;
import X.C13LP;
import X.C1586906Jf;
import X.C1649006cy;
import X.C1697810uHb;
import X.C1710306mr;
import X.C1906580ziK;
import X.C1906880zio;
import X.C19724012Fa;
import X.C2152008bu;
import X.C339190DRl;
import X.C356901a3;
import X.C418430Gav;
import X.C418440Gaw;
import X.C426770GoN;
import X.C452501pT;
import X.C461720I8s;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C878950Ydx;
import X.C880330YgB;
import X.C880340YgC;
import X.C881500Yi4;
import X.C882120Yj4;
import X.C886440Yq2;
import X.C887540Yro;
import X.C888490YtL;
import X.C890610Ywl;
import X.C892460Yzk;
import X.C898670ZNh;
import X.EnumC1514605wO;
import X.EnumC880480YgQ;
import X.EnumC887810YsF;
import X.InterfaceC1493505sz;
import X.InterfaceC879010Ye3;
import X.InterfaceC883640YlW;
import X.InterfaceC887560Yrq;
import X.InterfaceC887660Ys0;
import X.InterfaceC888500YtM;
import X.InterfaceC899120ZPa;
import X.ViewOnLongClickListenerC913880ZtC;
import Y.ACListenerS149S0100000_14;
import Y.ACallableS410S0100000_2;
import Y.ARunnableS114S0100000_14;
import Y.ARunnableS20S0201000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SessionListIMBaseVH<VO extends C0Z86, AH extends InterfaceC883640YlW> extends SessionListBaseVH<VO, AH> {
    public static final /* synthetic */ int LLLILZ = 0;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final ARunnableS114S0100000_14 LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public boolean LLLIL;

    public boolean V6() {
        return false;
    }

    public abstract C0Z8E<VO> b7();

    public void f6(VO vo) {
    }

    public abstract boolean k7(VO vo);

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public void u6(VO vo) {
    }

    public boolean w6() {
        return false;
    }

    public final IDMAvatarLoader C6() {
        return (IDMAvatarLoader) this.LLLIIIL.getValue();
    }

    public final C418430Gav D6() {
        return (C418430Gav) this.LLJZIJLIL.getValue();
    }

    public final LinearLayout J6() {
        return (LinearLayout) this.LLLF.getValue();
    }

    public final FrameLayout K6() {
        return (FrameLayout) this.LLJLLL.getValue();
    }

    public final FrameLayout L6() {
        return (FrameLayout) this.LLJLLIL.getValue();
    }

    public List<View> LLLLJI() {
        return (List) this.LLLII.getValue();
    }

    public List<View> M() {
        return (List) this.LLLIIII.getValue();
    }

    public final LinearLayout S6() {
        return (LinearLayout) this.LLJLL.getValue();
    }

    public final LinearLayout U6() {
        return (LinearLayout) this.LLL.getValue();
    }

    public final C418430Gav a7() {
        return (C418430Gav) this.LLJZ.getValue();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLLI.getValue();
    }

    public final void l7() {
        ARunnableS20S0201000_14 aRunnableS20S0201000_14;
        C0Z86 c0z86 = (C0Z86) this.LLJJIJIIJIL;
        if (c0z86 != null) {
            C888490YtL c888490YtL = C888490YtL.LIZ;
            int i = this.LLILZIL;
            C11RO c11roLIZ = C11S5.LIZ();
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            c888490YtL.getClass();
            boolean z = c0z86 instanceof C0Z8L;
            if (z || (c0z86 instanceof C0Z8M)) {
                InterfaceC879010Ye3 pageKey = c0z86.getPageKey();
                if (pageKey == null) {
                    pageKey = new C878950Ydx(null, FilterTabType.OVERALL, Collections.singleton(EnumC880480YgQ.ALL), SystemClock.elapsedRealtime(), 19);
                }
                Map<EnumC887810YsF, Map<InterfaceC879010Ye3, Set<String>>> map = C888490YtL.LIZIZ;
                EnumC887810YsF enumC887810YsF = EnumC887810YsF.TTSOCIAL_CHAT_CELL_SHOW;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object linkedHashMap2 = linkedHashMap.get(enumC887810YsF);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(enumC887810YsF, linkedHashMap2);
                }
                Map map2 = (Map) linkedHashMap2;
                Object linkedHashSet = map2.get(pageKey);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map2.put(pageKey, linkedHashSet);
                }
                Set set = (Set) linkedHashSet;
                if (c0z86 instanceof C0Z8M) {
                    if (!set.add(c0z86.getSessionId())) {
                        return;
                    } else {
                        aRunnableS20S0201000_14 = new ARunnableS20S0201000_14(c0z86, i, interfaceC1493505szLIZIZ, 4);
                    }
                } else if (!z || !set.add(c0z86.getSessionId())) {
                    return;
                } else {
                    aRunnableS20S0201000_14 = new ARunnableS20S0201000_14(c0z86, i, interfaceC1493505szLIZIZ, 5);
                }
                AbstractC19486711Lt.LJIIL(new ACallableS410S0100000_2(aRunnableS20S0201000_14, 9)).LJIJJLI(c11roLIZ).LJIIZILJ();
            }
        }
    }

    public View T6() {
        return S6();
    }

    public void h7() {
        C786410Ut5.LJJJJIZL(L6());
        C786410Ut5.LJJJJIZL(K6());
        View view = (View) this.LLLFFI.getValue();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLLIIIIL);
        }
        View view2 = (View) this.LLLFFI.getValue();
        if (view2 != null) {
            view2.setTouchDelegate(null);
        }
        C786410Ut5.R7(S6(), new ACListenerS149S0100000_14(this, 18));
        S6().setClickable(false);
        S6().setOnLongClickListener(new ViewOnLongClickListenerC913880ZtC(this, 2));
    }

    public final boolean i7() {
        C2152008bu c2152008bu;
        Iterator<Object> it2 = C19724012Fa.LIZJ(S6()).iterator();
        do {
            c2152008bu = (C2152008bu) it2;
            if (!c2152008bu.hasNext()) {
                return false;
            }
        } while (!Intrinsics.LJFF(c2152008bu.next(), b7().LJFF.getValue()));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public void onAttach() {
        C878950Ydx c878950Ydx;
        super.onAttach();
        if (w6()) {
            C0Z86 c0z86 = (C0Z86) this.LLJJIJIIJIL;
            InterfaceC879010Ye3 pageKey = c0z86 != null ? c0z86.getPageKey() : null;
            if (!(pageKey instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) pageKey) == null) {
                return;
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (Intrinsics.LJFF(c878950Ydx.LLILLJJLI, "notification_page")) {
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                if (C881500Yi4.LJ() != null) {
                    AbstractC883730Ylf.LJJI(Collections.singletonList(this.LLLIILIL.getValue()));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public void onDetach() {
        super.onDetach();
        if (w6()) {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (C881500Yi4.LJ() != null) {
                AbstractC883730Ylf.LJJIFFI(Collections.singletonList(this.LLLIILIL.getValue()));
            }
        }
    }

    public SessionListIMBaseVH(View view) {
        super(view);
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 459));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 462));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 460));
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 446));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 451));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 455));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 454));
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 453));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 463));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 448));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 457));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 452));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 443));
        this.LLLFFI = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 456));
        this.LLLFZ = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 458));
        this.LLLI = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 449));
        this.LLLII = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 447));
        this.LLLIIII = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 450));
        this.LLLIIIIL = new ARunnableS114S0100000_14(this, 13);
        this.LLLIIIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 444));
        this.LLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 461));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS558S0100000_14((SessionListIMBaseVH) this, 445));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final void C1(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        boolean z;
        Integer numZ6;
        Integer numLIZJ;
        ColorDrawable colorDrawable;
        if (C0ALI.LIZ() && L6().getChildCount() != 0) {
            if (L6().getChildCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View view = this.itemView;
                while (true) {
                    if (view != null) {
                        Drawable background = view.getBackground();
                        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
                            numLIZJ = Integer.valueOf(colorDrawable.getColor());
                            break;
                        }
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                    } else {
                        numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.itemView.getContext());
                        break;
                    }
                }
                for (View view2 : C1697810uHb.LJIIJJI(T6(), U6(), J6())) {
                    if (view2 != null) {
                        view2.setOutlineProvider(null);
                        view2.setTranslationZ(0.1f);
                        if (numLIZJ != null) {
                            view2.setBackgroundColor(numLIZJ.intValue());
                        }
                    }
                }
            }
            if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isInMultiSelectMode()) {
                return;
            }
            for (LinearLayout linearLayout : C1697810uHb.LJIIJJI(U6(), J6())) {
                if (linearLayout != null && (numZ6 = z6(linearLayout)) != null) {
                    float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(numZ6.intValue()));
                    if (linearLayout.getLayoutDirection() == 1) {
                        fLIZIZ = -fLIZIZ;
                    }
                    C786410Ut5.Mc(linearLayout, fLIZIZ);
                }
            }
            C418430Gav c418430GavA7 = a7();
            if (c418430GavA7 != null && c418430GavA7.LL != 0) {
                c418430GavA7.LL = 0;
                c418430GavA7.requestLayout();
            }
            C418430Gav c418430GavD6 = D6();
            if (c418430GavD6 == null || c418430GavD6.LL == 0) {
                return;
            }
            c418430GavD6.LL = 0;
            c418430GavD6.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final List<Animator> D5(boolean z) {
        Integer numZ6;
        ObjectAnimator objectAnimatorCreateAnimator$awemenotice_api_release;
        if (C0ALI.LIZ() && L6().getChildCount() != 0) {
            List<View> listLJIIJJI = C1697810uHb.LJIIJJI(U6(), J6());
            ArrayList arrayList = new ArrayList();
            for (View view : listLJIIJJI) {
                if (view != null && (numZ6 = z6(view)) != null && (objectAnimatorCreateAnimator$awemenotice_api_release = C0H61.NORMAL_TRANSLATION.createAnimator$awemenotice_api_release(view, z, Integer.valueOf(numZ6.intValue()))) != null) {
                    arrayList.add(objectAnimatorCreateAnimator$awemenotice_api_release);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
        if (C0ALI.LIZ() && this.LLILLL == null && this.LLILZ == null) {
            C0Z9D c0z9dG3 = g3();
            if (c0z9dG3 != null && c0z9dG3.LLLIIL() && L6().getChildCount() != 0) {
                C418430Gav c418430GavA7 = a7();
                if (c418430GavA7 != null && c418430GavA7.LL <= 0) {
                    c418430GavA7.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    c418430GavA7.requestLayout();
                }
                C418430Gav c418430GavD6 = D6();
                if (c418430GavD6 != null && c418430GavD6.LL <= 0) {
                    c418430GavD6.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    c418430GavD6.requestLayout();
                    return;
                }
                return;
            }
            C418430Gav c418430GavA72 = a7();
            if (c418430GavA72 != null && c418430GavA72.LL != 0) {
                c418430GavA72.LL = 0;
                c418430GavA72.requestLayout();
            }
            C418430Gav c418430GavD62 = D6();
            if (c418430GavD62 == null || c418430GavD62.LL == 0) {
                return;
            }
            c418430GavD62.LL = 0;
            c418430GavD62.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final void LJLL(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        boolean z;
        if (C0ALI.LIZ()) {
            int i = 0;
            if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isInMultiSelectMode()) {
                z = true;
            } else {
                z = false;
            }
            if (z && L6().getChildCount() != 0) {
                LinearLayout linearLayoutU6 = U6();
                if (linearLayoutU6 != null) {
                    C786410Ut5.Mc(linearLayoutU6, 0.0f);
                }
                LinearLayout linearLayoutJ6 = J6();
                if (linearLayoutJ6 != null) {
                    C786410Ut5.Mc(linearLayoutJ6, 0.0f);
                }
                C418430Gav c418430GavA7 = a7();
                if (c418430GavA7 != null && c418430GavA7.LL <= 0) {
                    c418430GavA7.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    c418430GavA7.requestLayout();
                }
                C418430Gav c418430GavD6 = D6();
                if (c418430GavD6 != null && c418430GavD6.LL <= 0) {
                    c418430GavD6.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    c418430GavD6.requestLayout();
                }
            }
            View[] viewArr = {T6(), U6(), J6()};
            do {
                View view = viewArr[i];
                if (view != null) {
                    view.setTranslationZ(0.0f);
                    view.setBackground(null);
                }
                i++;
            } while (i < 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z34
    public void LLLLJ(C1906880zio c1906880zio) {
        super.LLLLJ(c1906880zio);
        if (c1906880zio.LJIIJ != -1 && (this.LLJJLIIIJLLLLLLLZ.getValue() instanceof TuxTextView)) {
            ((TuxTextView) ((AppCompatTextView) this.LLJJLIIIJLLLLLLLZ.getValue())).setTuxFont(c1906880zio.LJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final void LLLLZI(float f) {
        if (!C0ALI.LIZ() && C0ALJ.LIZ() && L6().getChildCount() != 0) {
            C418430Gav c418430GavA7 = a7();
            if (c418430GavA7 != null) {
                c418430GavA7.LIZIZ(f);
            }
            C418430Gav c418430GavD6 = D6();
            if (c418430GavD6 != null) {
                c418430GavD6.LIZIZ(f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final void N5(int i) {
        this.LLILZIL = i;
        b7().LIZJ = i;
    }

    public void i6(C0Z72 c0z72) {
        if (c0z72 != null && (c0z72.contentType instanceof C1274004yg)) {
            IMRecentActivityService.LIZ.getClass();
            C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LJII(c0z72.sessionId);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
        if (this.LLLIL) {
            this.LLLIL = false;
        } else {
            if (!C882120Yj4.LIZ().LIZ) {
                return;
            }
            l7();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        if (C1906580ziK.LJI()) {
            this.LLLIL = true;
        } else {
            C888490YtL.LIZ.getClass();
            C888490YtL.LIZJ(null);
        }
    }

    public void q6(C0Z72 c0z72) {
        String str;
        TuxTextView tuxTextViewA6 = a6();
        if (tuxTextViewA6 != null) {
            if (c0z72 == null || (str = c0z72.title) == null) {
                str = "";
            }
            C1710306mr.LIZJ(tuxTextViewA6, str);
        }
    }

    public void r6(VO vo) {
        String lastMessageScene;
        String lastMessageScene2;
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        C886440Yq2 c886440Yq2;
        int i4;
        C886440Yq2 c886440Yq22;
        int i5;
        C886440Yq2 c886440Yq23;
        q6(vo.getMiddleViewVO());
        C0Z72 middleViewVO = vo.getMiddleViewVO();
        View view = (View) this.LLJLIL.getValue();
        if (view != null) {
            if (middleViewVO != null && (c886440Yq23 = middleViewVO.chatStatus) != null && c886440Yq23.showBlock) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LJLLLLLL(i5, view);
        }
        View view2 = (View) this.LLJIJIL.getValue();
        if (view2 != null) {
            if (middleViewVO != null && (c886440Yq22 = middleViewVO.chatStatus) != null && c886440Yq22.showPin) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, view2);
        }
        View view3 = (View) this.LLJLILLLLZIIL.getValue();
        if (view3 != null) {
            if (middleViewVO != null && (c886440Yq2 = middleViewVO.chatStatus) != null && c886440Yq2.showMute) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view3);
        }
        i6(vo.getMiddleViewVO());
        C0Z72 middleViewVO2 = vo.getMiddleViewVO();
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
        C0Z8A c0z8a = null;
        if (appCompatTextView != null) {
            if (middleViewVO2 != null && (str2 = middleViewVO2.timestamp) != null && C123100dR.LIZ(str2)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, appCompatTextView);
            if (appCompatTextView.getVisibility() == 0) {
                if (middleViewVO2 != null) {
                    str = middleViewVO2.timestamp;
                } else {
                    str = null;
                }
                appCompatTextView.setText(str);
                C786410Ut5.LLILL(appCompatTextView, 0);
            } else {
                C786410Ut5.LLILL(appCompatTextView, 8);
            }
        }
        InterfaceC899120ZPa interfaceC899120ZPa = (InterfaceC899120ZPa) this.LLLIIL.getValue();
        if (interfaceC899120ZPa != null) {
            interfaceC899120ZPa.LIZLLL(1, vo.getSessionId(), new AwS593S0100000_14(this, (SessionListIMBaseVH<C0Z86, InterfaceC883640YlW>) 324), vo.getHasUnreadMsg());
        }
        C0Z72 middleViewVO3 = vo.getMiddleViewVO();
        if (middleViewVO3 != null) {
            c0z8a = middleViewVO3.contentType;
        }
        if (c0z8a instanceof C892460Yzk) {
            if (vo.getLastMessageMsgType() == 1 && (lastMessageScene2 = vo.getLastMessageScene()) != null) {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ = C06LY.LIZ();
                String sessionId = vo.getSessionId();
                if (vo instanceof C0Z8L) {
                    i = AbstractC1711506n3.LIZ;
                } else {
                    i = AbstractC1711506n3.LIZIZ;
                }
                String sessionId2 = vo.getSessionId();
                C06H2 c06h2 = C06H2.INBOX;
                iStreakServiceLIZ.n(sessionId, i, sessionId2, c06h2, lastMessageScene2, null);
                C869590Y9l lastMsg = vo.getLastMsg();
                if (lastMsg != null && C06LY.LIZ().R(lastMsg)) {
                    C06LY.LIZ().e(vo.getSessionId(), vo.getSessionId(), c06h2, lastMessageScene2);
                }
            }
            if (vo.getLastMessageMsgType() == 1 && (lastMessageScene = vo.getLastMessageScene()) != null) {
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJJIJ(vo.getSessionId(), vo.getSessionId(), EnumC1514605wO.INBOX, lastMessageScene);
            }
        }
    }

    public final void v6(AbstractC884010Ym7 abstractC884010Ym7) {
        if (abstractC884010Ym7 instanceof C880340YgC) {
            C426770GoN c426770GoN = (C426770GoN) b7().LIZLLL.getValue();
            c426770GoN.setVariant(1);
            C880340YgC c880340YgC = (C880340YgC) abstractC884010Ym7;
            c426770GoN.setCount(c880340YgC.getNum());
            Integer numLIZJ = C1308910kAL.LIZJ(c880340YgC.getBackground(), this.itemView.getContext());
            if (numLIZJ != null) {
                c426770GoN.setBadgeBackgroundColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(c880340YgC.getContentColor(), this.itemView.getContext());
            if (numLIZJ2 != null) {
                c426770GoN.setBadgeContentColor(numLIZJ2.intValue());
            }
            L6().addView(c426770GoN);
            return;
        }
        if (!(abstractC884010Ym7 instanceof C880330YgB)) {
            return;
        }
        C426770GoN c426770GoN2 = (C426770GoN) b7().LIZLLL.getValue();
        c426770GoN2.setVariant(0);
        Integer numLIZJ3 = C1308910kAL.LIZJ(abstractC884010Ym7.getBackground(), this.itemView.getContext());
        if (numLIZJ3 != null) {
            c426770GoN2.setBadgeBackgroundColor(numLIZJ3.intValue());
        }
        L6().addView(c426770GoN2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer z6(android.view.View r4) {
        /*
            r3 = this;
            android.widget.LinearLayout r0 = r3.U6()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r2 = 0
            if (r0 == 0) goto L2c
            X.0Gav r0 = r3.a7()
            if (r0 == 0) goto L45
            int r0 = r0.LIZ()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L19:
            if (r0 == 0) goto L45
            int r0 = r0.intValue()
            int r0 = r0 + (-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 >= 0) goto L45
            return r1
        L2c:
            android.widget.LinearLayout r0 = r3.J6()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L45
            X.0Gav r0 = r3.D6()
            if (r0 == 0) goto L45
            int r0 = r0.LIZ()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L19
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH.z6(android.view.View):java.lang.Integer");
    }

    public void e6(VO vo, boolean z) {
        if (z) {
            TuxTextView tuxTextViewX5 = X5();
            if (tuxTextViewX5 != null) {
                tuxTextViewX5.setTuxFont(52);
                tuxTextViewX5.setTextColorRes(R.attr.a1h);
                return;
            }
            return;
        }
        TuxTextView tuxTextViewX52 = X5();
        if (tuxTextViewX52 == null) {
            return;
        }
        tuxTextViewX52.setTuxFont(51);
        tuxTextViewX52.setTextColorRes(R.attr.a1k);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public void j7(VO vo, int i) {
        boolean z;
        C890610Ywl c890610Ywl;
        C890610Ywl c890610Ywl2;
        Object objLIZ;
        InterfaceC879010Ye3 pageKey;
        InterfaceC888500YtM interfaceC888500YtM;
        boolean z2;
        InterfaceC887660Ys0 interfaceC887660Ys0;
        int i2;
        b7().LIZ(vo);
        super.j7(vo, i);
        boolean zK7 = k7(vo);
        if (zK7) {
            TuxTextView tuxTextViewA6 = a6();
            if (tuxTextViewA6 != null) {
                tuxTextViewA6.setTuxFont(42);
            }
        } else {
            TuxTextView tuxTextViewA62 = a6();
            if (tuxTextViewA62 != null) {
                tuxTextViewA62.setTuxFont(41);
            }
        }
        e6(vo, zK7);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean showStarIcon = vo.getShowStarIcon();
        View view = (View) this.LLLFZ.getValue();
        if (view != null) {
            if (showStarIcon) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        f6(vo);
        C0Z76 c0z76 = (C0Z76) this.LL.getValue();
        if (c0z76 != null) {
            c0z76.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        r6(vo);
        C0Z76 c0z762 = (C0Z76) this.LL.getValue();
        if (c0z762 != null) {
            c0z762.LJ(System.currentTimeMillis() - jCurrentTimeMillis2);
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        if (L6().getChildCount() != 0) {
            z = true;
        } else {
            z = false;
        }
        h7();
        u6(vo);
        InterfaceC879010Ye3 pageKey2 = null;
        if (!C0ALI.LIZ()) {
            if (L6().getChildCount() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C0ALJ.LIZ() && z != z2) {
                InterfaceC887560Yrq interfaceC887560Yrq = this.LLJJJ;
                if ((interfaceC887560Yrq instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC887560Yrq) != null && interfaceC887660Ys0.isInMultiSelectMode()) {
                    if (z2) {
                        View view2 = (View) C13LP.LJJJLL(LLLLJI());
                        if (view2 != null) {
                            C418430Gav c418430GavA7 = a7();
                            if (c418430GavA7 != null) {
                                c418430GavA7.LIZIZ(view2.getTranslationX());
                            }
                            C418430Gav c418430GavD6 = D6();
                            if (c418430GavD6 != null) {
                                c418430GavD6.LIZIZ(view2.getTranslationX());
                            }
                        }
                    } else {
                        C418430Gav c418430GavA72 = a7();
                        if (c418430GavA72 != null) {
                            c418430GavA72.LIZIZ(0.0f);
                        }
                        C418430Gav c418430GavD62 = D6();
                        if (c418430GavD62 != null) {
                            c418430GavD62.LIZIZ(0.0f);
                        }
                    }
                }
            }
        }
        if (S6().getChildCount() == 0) {
            C786410Ut5.LJLLLLLL(4, S6());
        } else {
            C339190DRl.LIZLLL(S6());
        }
        C0Z76 c0z763 = (C0Z76) this.LL.getValue();
        if (c0z763 != null) {
            c0z763.LIZLLL(System.currentTimeMillis() - jCurrentTimeMillis3);
        }
        if (w6() && this.LLJJIII && (c890610Ywl = this.LLJJJ) != null && (c890610Ywl2 = this.LLJJIJIL) != null && c890610Ywl2.areItemTheSame(c890610Ywl)) {
            C890610Ywl c890610Ywl3 = this.LLJJIJIL;
            if (c890610Ywl3 != null) {
                objLIZ = c890610Ywl3.LIZ();
            } else {
                objLIZ = null;
            }
            if ((objLIZ instanceof InterfaceC888500YtM) && (interfaceC888500YtM = (InterfaceC888500YtM) objLIZ) != null) {
                pageKey = interfaceC888500YtM.getPageKey();
            } else {
                pageKey = null;
            }
            C0Z86 c0z86 = (C0Z86) this.LLJJIJIIJIL;
            if (c0z86 != null) {
                pageKey2 = c0z86.getPageKey();
            }
            if (!Intrinsics.LJFF(pageKey, pageKey2)) {
                l7();
            }
        }
    }

    public final void h6(C0Z8E c0z8e, C0Z86 c0z86, ViewGroup viewGroup) {
        C887540Yro chatListCameraStatus = c0z86.getChatListCameraStatus();
        if (chatListCameraStatus != null && chatListCameraStatus.LIZ) {
            IMCrossAppFeatureDiffApi.LIZ.getClass();
            C898670ZNh.LIZ();
            viewGroup.addView((View) c0z8e.LJFF.getValue());
            if (V6()) {
                View view = (View) this.LLLFFI.getValue();
                if ((view instanceof ViewGroup) && view != null) {
                    HandlerHook.viewPost(view, this.LLLIIIIL);
                }
            }
            C786410Ut5.R7(S6(), (View.OnClickListener) c0z8e.LJIIIIZZ.getValue());
        }
    }
}
