package com.ss.android.ugc.aweme.tako.detail.keyframe.ui;

import X.AbstractC1585810rMx;
import X.AnonymousClass0957;
import X.C01GW;
import X.C090F;
import X.C0DXA;
import X.C0DXR;
import X.C0H8B;
import X.C0HHT;
import X.C0PEM;
import X.C0Q4Y;
import X.C0QSJ;
import X.C13DA;
import X.C13IQ;
import X.C13LE;
import X.C144I;
import X.C14FS;
import X.C14J9;
import X.C14JB;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1770850wBP;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C1ELP;
import X.C20235014Fo;
import X.C20634615om;
import X.C21674119s3;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C468301s1;
import X.C470301sL;
import X.C470901sR;
import X.C5182020e;
import X.C581630MrZ;
import X.C597050NbL;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC20234914Fn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.common.utils.LifecycleUtils$doOnDestroy$2;
import com.ss.android.ugc.aweme.tako.detail.keyframe.viewmodel.TakoDetailKeyframeVM;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomAssemAbility;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomAssemVScope;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.aweme.tako.signal.ITakoSignalService;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS609S0100000_30;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDetailKeyFrameBottomAssemAssem extends BaseCellSlotComponent<TakoDetailKeyFrameBottomAssemAssem> implements TakoDetailKeyFrameBottomAssemAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLLIL;
    public final TakoDetailKeyFrameBottomAssemAssem LLJLLL = this;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 894));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS274S0000000_30.get$arr$(158));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS574S0100000_30(this, 252));
    public final InterfaceC1731706qJ LLLF;
    public final C0DXA LLLFF;
    public C20634615om LLLFFI;
    public String LLLFZ;
    public C1863850ybP LLLI;
    public C14FS LLLII;
    public TakoDetailKeyFrameBottomAssemAbility LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoDetailKeyFrameBottomAssemAssem.class, "keyframeVM", "getKeyframeVM()Lcom/ss/android/ugc/aweme/tako/detail/keyframe/viewmodel/TakoDetailKeyframeVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0DXA] */
    public TakoDetailKeyFrameBottomAssemAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoDetailKeyframeVM.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 895), null, AFwS274S0000000_30.get$arr$(157));
        this.LLLFF = new C0DXR() { // from class: X.0DXA
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                Pair pair;
                Object first;
                Object second;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLIZIZ = c21673919s1.LIZIZ();
                int measuredWidth = recyclerView.getMeasuredWidth();
                if (childAdapterPosition == 0) {
                    pair = new Pair(0, Integer.valueOf(this.LL));
                } else if (childAdapterPosition == iLIZIZ - 1) {
                    pair = new Pair(Integer.valueOf(this.LL), Integer.valueOf(measuredWidth - this.LLILLJJLI));
                } else {
                    pair = new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LL));
                }
                if (C426750GoL.LJFF()) {
                    first = pair.getSecond();
                } else {
                    first = pair.getFirst();
                }
                rect.left = ((Number) first).intValue();
                if (C426750GoL.LJFF()) {
                    second = pair.getFirst();
                } else {
                    second = pair.getSecond();
                }
                rect.right = ((Number) second).intValue();
            }
        };
        this.LLLFZ = "";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fny;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == TakoDetailKeyFrameBottomAssemAbility.class) {
            this.LLLIIII = (TakoDetailKeyFrameBottomAssemAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoDetailKeyFrameBottomTriggerVScope.class, TakoDetailKeyFrameBottomAssemVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == TakoDetailKeyFrameBottomAssemAbility.class) {
            return this.LLLIIII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoDetailKeyFrameBottomTriggerVScope.class);
        arrayList.add(TakoDetailKeyFrameBottomAssemVScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoDetailKeyFrameBottomAssemVScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, TakoDetailKeyFrameBottomAssemVScope.class, this, TakoDetailKeyFrameBottomAssemAbility.class, null, null);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == TakoDetailKeyFrameBottomAssemAbility.class) {
            this.LLLIIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final TakoDetailKeyframeVM Bp() {
        return (TakoDetailKeyframeVM) this.LLLF.getValue(this, LLLIIIIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C2211631BhB.LJ(view, new AwS609S0100000_30(this, 107));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoDetailKeyFrameBottomAssemVScope.class}).unbindAbility(this.LLJLLL, TakoDetailKeyFrameBottomAssemAbility.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.15om] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0rMx, X.14J9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.x5t);
        this.LLJLLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContentView().getContext());
            linearLayoutManager.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(linearLayoutManager);
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(KeyframeBottomCellImageStyle.class);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(this.LLLFF);
        }
        ?? r3 = new AbstractC1585810rMx() { // from class: X.14J9
            public boolean LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    if (i == 1) {
                        this.LL = true;
                        this.LLILLJJLI.Bp().LLILLL = true;
                        return;
                    }
                    return;
                }
                if (!this.LL) {
                    return;
                }
                this.LLILLJJLI.Bp().LLILLL = false;
                this.LL = false;
            }
        };
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != 0) {
            viewOnAttachStateChangeListenerC20604515jv3.addOnScrollListener(r3);
        }
        LifecycleOwner lifecycleOwnerM128do = m128do();
        if (lifecycleOwnerM128do != null) {
            lifecycleOwnerM128do.getLifecycle().addObserver(new LifecycleUtils$doOnDestroy$2(new AwS431S0200000_30(this, (C14J9) r3, 50)));
        }
        if (this.LLLFFI == null) {
            final Context context = getContext();
            this.LLLFFI = new C21674119s3(context) { // from class: X.15om
                public final int LJIILL = 0;

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIILJJIL() {
                    return C426750GoL.LJFF() ? 1 : -1;
                }

                @Override // X.AbstractC21674019s2
                public final PointF LIZ(int i) {
                    LinearLayoutManager linearLayoutManager2;
                    RecyclerView.LayoutManager layoutManager = this.LIZJ;
                    if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager2 = (LinearLayoutManager) layoutManager) == null) {
                        return null;
                    }
                    return linearLayoutManager2.computeScrollVectorForPosition(i);
                }

                @Override // X.C21674119s3, X.AbstractC21674019s2
                public final void LJI(View view2, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
                    int iLJIIIZ = LJIIIZ(LJIILJJIL(), view2) + this.LJIILL;
                    int iLJIIJ = LJIIJ(-1, view2);
                    int iLJIIL = LJIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
                    if (iLJIIL > 0) {
                        c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, this.LJIIIIZZ, iLJIIL);
                    }
                }
            };
        }
        Bp().LL = (IPlayerComponentAbility) this.LLL.getValue();
        TakoDetailKeyframeVM takoDetailKeyframeVMBp = Bp();
        C14JB c14jb = new C2217381BqS() { // from class: X.14JB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155520gAw) obj).LLILLJJLI;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS318S0000000_30.get$arr$(16);
        C736680Sv4.LJIIIIZZ(this, takoDetailKeyframeVMBp, c14jb, c1770850wBP, AFwS318S0000000_30.get$arr$(17), 4);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.14JA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1155520gAw) obj).LL);
            }
        }, null, AFwS318S0000000_30.get$arr$(18), 6);
        this.LLLI = (C1863850ybP) ((ITakoSignalService) ServiceManager.get().getService(ITakoSignalService.class)).LIZIZ().T71().LIZIZ();
        this.LLLII = (C14FS) ((TakoContextAbilityImpl) C144I.LIZ()).uk0().LIZIZ();
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoDetailKeyFrameBottomAssemVScope.class}).bindAbility(this.LLJLLL, TakoDetailKeyFrameBottomAssemAbility.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        List<TakoKeyFramePoint> listLLLLLZ;
        Map<TakoKeyFramePoint, AnonymousClass0957<Bitmap>> mapBuild;
        AnonymousClass0957<Bitmap> anonymousClass0957;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        this.LLLFZ = aid;
        TakoDetailKeyframeVM takoDetailKeyframeVMBp = Bp();
        Aweme aweme2 = videoItemParams2.getAweme();
        InterfaceC20234914Fn interfaceC20234914Fn = (InterfaceC20234914Fn) this.LLJZ.getValue();
        if (interfaceC20234914Fn != null) {
            listLLLLLZ = interfaceC20234914Fn.LLLLLZ(this.LLLFZ);
        } else {
            listLLLLLZ = null;
        }
        takoDetailKeyframeVMBp.getClass();
        if (aweme2 != null && listLLLLLZ != null) {
            takoDetailKeyframeVMBp.LLILLJJLI = listLLLLLZ;
            IPlayerComponentAbility iPlayerComponentAbility = takoDetailKeyframeVMBp.LL;
            if (iPlayerComponentAbility != null) {
                iPlayerComponentAbility.getCurrentPosition();
            }
            String aid2 = aweme2.getAid();
            if (aid2 == null) {
                mapBuild = null;
            } else {
                mapBuild = C470301sL.LIZJ.get(aid2);
                if (mapBuild == null) {
                    C13DA c13da = new C13DA();
                    Iterator<TakoKeyFramePoint> it2 = listLLLLLZ.iterator();
                    while (it2.hasNext()) {
                        c13da.put(it2.next(), C090F.LIZIZ());
                    }
                    mapBuild = c13da.build();
                    C470301sL.LIZJ.put(aid2, mapBuild);
                    takoDetailKeyframeVMBp.getLifecycle().addObserver(new LifecycleUtils$doOnDestroy$2(new C470901sR(aid2)));
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(takoDetailKeyframeVMBp), C0PEM.LIZJ, null, new C468301s1(listLLLLLZ, takoDetailKeyframeVMBp, aid2, mapBuild, null), 2);
                    HashSet<LifecycleOwner> hashSet = C470301sL.LIZLLL;
                    if (!hashSet.contains(takoDetailKeyframeVMBp)) {
                        hashSet.add(takoDetailKeyframeVMBp);
                        takoDetailKeyframeVMBp.getLifecycle().addObserver(new LifecycleUtils$doOnDestroy$2(new C5182020e(takoDetailKeyframeVMBp, 537)));
                    }
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLLLZ, 10));
            for (TakoKeyFramePoint takoKeyFramePoint : listLLLLLZ) {
                if (mapBuild != null) {
                    anonymousClass0957 = mapBuild.get(takoKeyFramePoint);
                } else {
                    anonymousClass0957 = null;
                }
                arrayList.add(new C0H8B(anonymousClass0957, takoKeyFramePoint));
            }
            takoDetailKeyframeVMBp.setStateImmediate(new AwS597S0100000_18(arrayList, (List<String>) 1013));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS130S0100000_30(this, 48));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomAssemAbility
    public final void kB0(int i, C0H8B c0h8b) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        IPlayerComponentAbility iPlayerComponentAbility;
        TakoDetailKeyframeVM takoDetailKeyframeVMBp = Bp();
        takoDetailKeyframeVMBp.getClass();
        double d = c0h8b.LLILLJJLI.timestamp * 1000;
        IPlayerComponentAbility iPlayerComponentAbility2 = takoDetailKeyframeVMBp.LL;
        String str6 = null;
        if (iPlayerComponentAbility2 != null) {
            if (Long.valueOf(iPlayerComponentAbility2.te()).longValue() != 0) {
                iPlayerComponentAbility2.dO0(Math.min(100.0f, (float) Math.max(0.0d, (d / r1.longValue()) * ((double) 100))));
            }
        }
        takoDetailKeyframeVMBp.setState(new AwS32S0001000_18(i, 11));
        C581630MrZ c581630MrZ = ((C1ELP) ((AssemViewModel) this.LLJZIJLIL.getValue()).getState()).LLJ;
        if (c581630MrZ != null && c581630MrZ.LIZ == 4 && (iPlayerComponentAbility = Bp().LL) != null) {
            iPlayerComponentAbility.tryResumePlay();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1863850ybP c1863850ybP = this.LLLI;
        if (c1863850ybP != null) {
            str = c1863850ybP.LL;
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        if (c1863850ybP == null || (str2 = c1863850ybP.LLILLJJLI) == null) {
            str2 = "";
        }
        if (c1863850ybP == null || (str3 = c1863850ybP.LLILZIL) == null) {
            str3 = "";
        }
        if (c1863850ybP == null || (str4 = c1863850ybP.LLILZLL) == null) {
            str4 = "";
        }
        C14FS c14fs = this.LLLII;
        if (c14fs == null || (str5 = c14fs.LLIZLLLIL) == null) {
            str5 = "";
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String aid = ((VideoItemParams) obj).getAweme().getAid();
        if (aid != null) {
            str7 = aid;
        }
        C1863850ybP c1863850ybP2 = this.LLLI;
        if (c1863850ybP2 != null) {
            str6 = c1863850ybP2.LLIZ;
        }
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        C1862330yYx.LJJIIZI("tikbot_keyframe_card_click", str, str2, str3, str5, str7, str4, str6, c20235014FoLIZ);
    }
}
