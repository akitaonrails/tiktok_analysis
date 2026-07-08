package com.ss.android.ugc.aweme.prefab;

import X.AbstractC738140SxQ;
import X.C08CX;
import X.C0RUV;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1846060y8i;
import X.C19Y2;
import X.C19Y3;
import X.C21594419fC;
import X.C2255108sX;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC626900OiO;
import X.InterfaceC20516715Px;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.prefab.ViewPagerAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class ViewPagerAssem extends LinearLayoutAssem implements ViewPagerControlAbility {
    public HorizontalScrollView LLJJIII;
    public C21594419fC LLJJIJI;

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        ViewGroup viewGroup;
        HorizontalScrollView horizontalScrollView;
        Iterable iterableSingleton;
        Integer num;
        if (ip().LLJILJIL.size() <= 1) {
            super.hp();
            return;
        }
        View contentView = getContentView();
        if (!(contentView instanceof ViewGroup) || (viewGroup = (ViewGroup) contentView) == null) {
            return;
        }
        Context context = viewGroup.getContext();
        C21594419fC c21594419fC = new C21594419fC(context);
        c21594419fC.setAdapter(new PagerAdapter() { // from class: X.0I2h
            public final List<View> LLILLJJLI = new ArrayList();

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLILLL.ip().LLJILJIL.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i) {
                return String.valueOf(((C0RUV) ListProtector.get(C13LP.LLIIII(this.LLILLL.ip().LLJILJIL.values()), i)).LLILZ.get("page_title"));
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final Object LJJI(int i, ViewGroup viewGroup2) {
                ViewGroup viewGroup3;
                C628830OlV c628830OlV = (C628830OlV) ListProtector.get(C13LP.LLIIII(this.LLILLL.ip().LLJILJIL.values()), i);
                View relativeLayout = (View) C19719612Di.LJJIJIIJI(this.LLILLJJLI);
                if (relativeLayout == null) {
                    relativeLayout = new RelativeLayout(viewGroup2.getContext());
                    final ViewPagerAssem viewPagerAssem = this.LLILLL;
                    c628830OlV.LLIZLLLIL = R.id.eqx;
                    relativeLayout.setId(R.id.eqx);
                    relativeLayout.setTag(new LifecycleOwner() { // from class: X.0I2i
                        @Override // androidx.lifecycle.LifecycleOwner
                        public final Lifecycle getLifecycle() {
                            return viewPagerAssem.getLifecycle();
                        }
                    });
                }
                ViewPagerAssem viewPagerAssem2 = this.LLILLL;
                C723850SaN.LIZLLL(viewPagerAssem2, new AwS220S0300000_11(relativeLayout, viewPagerAssem2, c628830OlV, 9));
                ViewParent parent = relativeLayout.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(relativeLayout, viewGroup3);
                }
                viewGroup2.addView(relativeLayout);
                return relativeLayout;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final boolean LJJIFFI(View view, Object obj) {
                return Intrinsics.LJFF(view, obj);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIIZILJ(ViewGroup viewGroup2, int i, Object obj) {
                View view = (View) obj;
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
                ((ArrayList) this.LLILLJJLI).add(view);
            }
        });
        this.LLJJIJI = c21594419fC;
        Object obj = getConfig().LLILZ.get("viewpager_version");
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 == null || num2.intValue() != 1) {
            C19Y3 c19y3 = new C19Y3(context, null);
            c19y3.setTabMode(0);
            c19y3.setTabMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19y3);
            c19y3.setLayoutParams(layoutParams);
            c19y3.setCustomTabViewResId(R.layout.eaq);
            c19y3.setTabPaddingStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c19y3.setTabPaddingEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            C426750GoL.LJIIL(c19y3, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4))), 0, 0, 16);
            c19y3.LJIILLIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c19y3.LIZIZ(new InterfaceC20516715Px() { // from class: X.0P2q
                @Override // X.InterfaceC20516715Px
                public final void LIZ(C19Y5 c19y5) {
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZIZ(C19Y5 c19y5) {
                    TuxTextView tuxTextView;
                    View view = c19y5.LJFF;
                    if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
                        tuxTextView.setTuxFont(42);
                    }
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZJ(C19Y5 c19y5) {
                    TuxTextView tuxTextView;
                    View view = null;
                    if (c19y5 != null) {
                        view = c19y5.LJFF;
                    }
                    if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
                        tuxTextView.setTuxFont(43);
                    }
                }
            });
            c19y3.setupWithViewPager(this.LLJJIJI);
            mp(c19y3);
            horizontalScrollView = c19y3;
        } else {
            C1846060y8i c1846060y8i = new C1846060y8i(context, null, 6);
            c1846060y8i.LJIJJLI(true);
            c1846060y8i.setTabVariant(0);
            C1846060y8i.LJIJI(c1846060y8i, this.LLJJIJI);
            horizontalScrollView = c1846060y8i;
        }
        this.LLJJIII = horizontalScrollView;
        Object obj2 = getConfig().LLILZ.get("default_page");
        if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
            int iIntValue = num.intValue();
            C21594419fC c21594419fC2 = this.LLJJIJI;
            if (c21594419fC2 != null) {
                c21594419fC2.setCurrentItem(iIntValue);
            }
        }
        C21594419fC c21594419fC3 = this.LLJJIJI;
        if (c21594419fC3 != null) {
            int currentItem = c21594419fC3.getCurrentItem();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ViewPagerPageSelectedSubscriber.class, null);
                if (interfaceC494301wDLIZ == null) {
                    iterableSingleton = C08CX.INSTANCE;
                } else {
                    try {
                        InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                        if (!(invocationHandler instanceof C2255108sX)) {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                        iterableSingleton = ((C2255108sX) invocationHandler).LL;
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        iterableSingleton = Collections.singleton(interfaceC494301wDLIZ);
                    }
                }
                if (iterableSingleton != null) {
                    Iterator it2 = iterableSingleton.iterator();
                    while (it2.hasNext()) {
                        ((ViewPagerPageSelectedSubscriber) it2.next()).Pm0(currentItem, EnumC626900OiO.INITIAL);
                    }
                }
            }
        }
        C21594419fC c21594419fC4 = this.LLJJIJI;
        if (c21594419fC4 != null) {
            c21594419fC4.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0OiP
                public EnumC626900OiO LL = EnumC626900OiO.CLICK;

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i == 1) {
                            this.LL = EnumC626900OiO.SCROLL;
                            return;
                        }
                        return;
                    }
                    this.LL = EnumC626900OiO.CLICK;
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    Iterable iterableSingleton2;
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this.LLILLJJLI);
                    if (fragmentLJI2 != null) {
                        InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), ViewPagerPageSelectedSubscriber.class, null);
                        if (interfaceC494301wDLIZ2 == null) {
                            iterableSingleton2 = C08CX.INSTANCE;
                        } else {
                            try {
                                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                                if (invocationHandler2 instanceof C2255108sX) {
                                    iterableSingleton2 = ((C2255108sX) invocationHandler2).LL;
                                } else {
                                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                                }
                            } catch (IllegalArgumentException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                iterableSingleton2 = Collections.singleton(interfaceC494301wDLIZ2);
                            }
                        }
                        if (iterableSingleton2 != null) {
                            Iterator it3 = iterableSingleton2.iterator();
                            while (it3.hasNext()) {
                                ((ViewPagerPageSelectedSubscriber) it3.next()).Pm0(i, this.LL);
                            }
                        }
                    }
                }
            });
        }
        viewGroup.addView(this.LLJJIII);
        Object obj3 = getConfig().LLILZ.get("viewpager_version");
        Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num3 != null && num3.intValue() == 2) {
            View view = new View(context);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
            if (numLIZJ != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)))));
            viewGroup.addView(view);
        }
        viewGroup.addView(this.LLJJIJI, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility
    public final void AG1(int i) {
        C21594419fC c21594419fC = this.LLJJIJI;
        if (c21594419fC != null) {
            c21594419fC.setCurrentItem(i, true);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        Integer num;
        PagerAdapter adapter;
        if (ip().LLJILJIL.size() <= 1) {
            super.didUpdateConfig(c0ruv);
            return;
        }
        C21594419fC c21594419fC = this.LLJJIJI;
        if (c21594419fC != null && (adapter = c21594419fC.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        Object obj = getConfig().LLILZ.get("viewpager_version");
        if (!(obj instanceof Integer) || (num = (Integer) obj) == null || num.intValue() != 2) {
            return;
        }
        mp(this.LLJJIII);
    }

    public final void mp(HorizontalScrollView horizontalScrollView) {
        C19Y3 c19y3;
        TextView customTextView;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        C19Y2 c19y2;
        if ((horizontalScrollView instanceof C19Y3) && (c19y3 = (C19Y3) horizontalScrollView) != null) {
            int tabCount = c19y3.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                View childAt = c19y3.LLILLL.getChildAt(i);
                if ((childAt instanceof C19Y2) && (c19y2 = (C19Y2) childAt) != null) {
                    customTextView = c19y2.getCustomTextView();
                } else {
                    customTextView = null;
                }
                if ((customTextView instanceof TuxTextView) && customTextView != null) {
                    int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]};
                    int[] iArr2 = new int[3];
                    Context context = getContext();
                    if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                        iIntValue = numLIZJ3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iArr2[0] = iIntValue;
                    Context context2 = getContext();
                    if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bs, context2)) != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    iArr2[1] = iIntValue2;
                    Context context3 = getContext();
                    if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context3)) != null) {
                        iIntValue3 = numLIZJ.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    iArr2[2] = iIntValue3;
                    customTextView.setTextColor(new ColorStateList(iArr, iArr2));
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.prefab.ViewPagerAssem for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r8) {
        /*
            r7 = this;
            super.onViewCreated(r8)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            if (r0 == 0) goto L1b
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L1c
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility.class
            X.C1558520qew.LJII(r4, r7, r0, r5, r5)
        L1b:
            return
        L1c:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L34
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L34
            if (r0 == 0) goto L2c
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L34
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L34
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L34
            return
        L2c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L34
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L34
            throw r1     // Catch: java.lang.IllegalArgumentException -> L34
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L63
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            return
        L63:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prefab.ViewPagerAssem.onViewCreated(android.view.View):void");
    }
}
