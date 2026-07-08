package com.ss.android.ugc.aweme.ecommerce.mix.view;

import X.C098200Yq;
import X.C0QSJ;
import X.C1076680e7m;
import X.C1161750gKz;
import X.C1162700gMW;
import X.C1163360gNa;
import X.C1164510gPR;
import X.C1164520gPS;
import X.C1165500gR2;
import X.C1166240gSE;
import X.C1166550gSj;
import X.C1182640gsg;
import X.C1308910kAL;
import X.C1540540qBw;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GU;
import X.C16GX;
import X.C1739050vM7;
import X.C1741890vQh;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20746416Gg;
import X.C21146717pB;
import X.C2188811AlT;
import X.C23250099c;
import X.C673150Qan;
import X.C687700QyG;
import X.C703302op;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1164530gPT;
import X.InterfaceC1165510gR3;
import X.InterfaceC1166540gSi;
import X.InterfaceC1166580gSm;
import X.InterfaceC1324370kZH;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS51S0300000_18;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenDataCenter;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEventCenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.mix.api.BaseMixContainerAbility;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixContainerScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ECBaseMixContainerFragment<T extends C1161750gKz> extends ECBaseSheetFragment implements BaseMixContainerAbility, InterfaceC1324370kZH, InterfaceC1164530gPT, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public C20746416Gg LLIZ;
    public int LLJ;
    public boolean LLJI;
    public C1166550gSj LLJILJIL;
    public final RavenEventCenter LLJILLL;
    public final InterfaceC1165510gR3 LLJJ;
    public IRavenEventAbility LLJJI;
    public IRavenDataAbility LLJJIII;
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final List<InterfaceC1166540gSi> LLJIJIL = new ArrayList();
    public final RavenDataCenter LLJILJILJ = new RavenDataCenter();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void bS(C16G0 c16g0) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IRavenEventAbility.class) {
            this.LLJJI = (IRavenEventAbility) obj;
        } else if (cls == IRavenDataAbility.class) {
            this.LLJJIII = (IRavenDataAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public void cS(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixContainerScope.class, MixDataCenterScope.class, MixEventCenterScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public void dS(int i, int i2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void gS() {
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IRavenEventAbility.class) {
            return this.LLJJI;
        }
        if (cls == IRavenDataAbility.class) {
            return this.LLJJIII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixContainerScope.class);
        arrayList.add(MixDataCenterScope.class);
        arrayList.add(MixEventCenterScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixContainerScope.class);
        arrayList.add(MixDataCenterScope.class);
        arrayList.add(MixEventCenterScope.class);
        return arrayList;
    }

    public abstract C19719912Dl mS();

    public abstract C1166240gSE nS();

    public abstract C19719912Dl oS();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    public abstract C19719912Dl qS();

    public Map<String, Class<?>> rS() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public abstract C19719912Dl sS();

    public abstract C19719912Dl uS();

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IRavenEventAbility.class) {
            this.LLJJI = null;
        } else if (cls == IRavenDataAbility.class) {
            this.LLJJIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.api.BaseMixContainerAbility
    public final void W72() {
        C16GU c16gu;
        int totalScrollRange;
        AppBarLayout$Behavior appBarLayout$Behavior;
        C20746416Gg c20746416Gg = this.LLIZ;
        if (c20746416Gg != null) {
            C16BC c16bc = ((C16G1) c20746416Gg.getLayoutParams()).LIZ;
            if (!(c16bc instanceof AppBarLayout$Behavior) || (c16gu = (C16GU) c16bc) == null || Math.abs(c16gu.getTopAndBottomOffset()) >= (totalScrollRange = c20746416Gg.getTotalScrollRange()) || totalScrollRange <= 0) {
                return;
            }
            C16BC c16bc2 = ((C16G1) c20746416Gg.getLayoutParams()).LIZ;
            if (!(c16bc2 instanceof AppBarLayout$Behavior) || (appBarLayout$Behavior = (AppBarLayout$Behavior) c16bc2) == null) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1182640gsg(appBarLayout$Behavior, totalScrollRange, 200L, this, null), 3);
        }
    }

    public ECBaseMixContainerFragment() {
        RavenEventCenter ravenEventCenter = new RavenEventCenter();
        this.LLJILLL = ravenEventCenter;
        this.LLJJ = C1165500gR2.LIZ.ravenEnable ? new C1164510gPR(ravenEventCenter, new C1162700gMW(this) { // from class: X.0gSh
            public final /* synthetic */ ECBaseMixContainerFragment<T> LIZLLL;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("MixUIContentAssem", 0L, 6);
                this.LIZLLL = this;
            }

            @Override // X.C1162700gMW
            public final void LIZ(RavenEvent ravenEvent) {
                Class<?> cls;
                Map<String, Class<?>> mapRS = this.LIZLLL.rS();
                Object objLJII = null;
                if (mapRS != null && (cls = mapRS.get(ravenEvent.eventName)) != null) {
                    Object obj = ravenEvent.data;
                    if (obj != null) {
                        objLJII = C1741890vQh.LJII(cls, obj);
                    }
                    ECBaseMixContainerFragment<T> eCBaseMixContainerFragment = this.LIZLLL;
                    C786410Ut5.LJJZZIII(eCBaseMixContainerFragment.LLIZLLLIL, new ARunnableS51S0300000_18(eCBaseMixContainerFragment, ravenEvent, objLJII, 0));
                }
            }
        }, this) : new C1164520gPS(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean isHalfScreen() {
        return nS().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        C1540540qBw c1540540qBw;
        super.onDestroy();
        InterfaceC1166580gSm interfaceC1166580gSmRemove = C1076680e7m.LIZ.remove(nS().LIZ);
        if (interfaceC1166580gSmRemove != null) {
            interfaceC1166580gSmRemove.release();
        }
        C1166550gSj c1166550gSj = this.LLJILJIL;
        if (c1166550gSj != null && (c1540540qBw = c1166550gSj.LIZ) != null) {
            c1540540qBw.LIZIZ();
        }
        Map<String, Class<?>> mapRS = rS();
        if (mapRS != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapRS.entrySet().iterator();
            while (it2.hasNext()) {
                this.LLJJ.LIZIZ(it2.next().getKey());
            }
        }
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
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
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((ArrayList) this.LLJIJIL).clear();
        C20746416Gg c20746416Gg = this.LLIZ;
        if (c20746416Gg != null) {
            c20746416Gg.LIZLLL(this);
            c20746416Gg.LIZLLL(c20746416Gg);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), ECBaseMixContainerFragment.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void iS() {
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mix.api.BaseMixContainerAbility
    public final void aK(InterfaceC1166540gSi interfaceC1166540gSi) {
        if (!((ArrayList) this.LLJIJIL).contains(interfaceC1166540gSi)) {
            ((ArrayList) this.LLJIJIL).add(interfaceC1166540gSi);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixEventCenterScope.class}).unbindAbility(this.LLJILLL, IRavenEventAbility.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixDataCenterScope.class}).unbindAbility(this.LLJILJILJ, IRavenDataAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        Map<String, Class<?>> mapRS = rS();
        if (mapRS != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapRS.entrySet().iterator();
            while (it2.hasNext()) {
                this.LLJJ.LIZ(it2.next().getKey());
            }
        }
        super.onCreate(bundle);
        C1076680e7m.LIZ.put(nS().LIZ, new InterfaceC1166580gSm() { // from class: X.04zP
            public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC1166580gSm
            public final void release() {
                this.LIZ.clear();
                this.LIZIZ.clear();
            }

            @Override // X.InterfaceC1166580gSm
            public final Map<String, Object> LIZLLL(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return C2097608Jq.LJ();
                    }
                    return this.LIZIZ;
                }
                return this.LIZ;
            }

            @Override // X.InterfaceC1166580gSm
            public final Map<String, Object> LIZ(int i, List<String> list) {
                if (list == null) {
                    return C2097608Jq.LJ();
                }
                if (i != 0) {
                    if (i != 1) {
                        return C2097608Jq.LJ();
                    }
                    ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                        if (list.contains(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return linkedHashMap;
                }
                ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : concurrentHashMap2.entrySet()) {
                    if (list.contains(entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return linkedHashMap2;
            }

            @Override // X.InterfaceC1166580gSm
            public final void LIZIZ(int i, String str) {
                if (i != 0) {
                    if (i == 1) {
                        this.LIZIZ.remove(str);
                        return;
                    }
                    return;
                }
                this.LIZ.remove(str);
            }

            @Override // X.InterfaceC1166580gSm
            public final void LIZJ(int i, Map<String, ? extends Object> map) {
                if (map == null) {
                    return;
                }
                if (i != 0) {
                    if (i == 1) {
                        this.LIZIZ.putAll(map);
                        return;
                    }
                    return;
                }
                this.LIZ.putAll(map);
            }
        });
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixEventCenterScope.class}).bindAbility(this.LLJILLL, IRavenEventAbility.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MixDataCenterScope.class}).bindAbility(this.LLJILJILJ, IRavenDataAbility.class);
    }

    @Override // X.InterfaceC1324380kZI
    public final void LLZZJLIL(C16GX c16gx, int i) {
        if (this.LLJ == i) {
            return;
        }
        this.LLJ = i;
        Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1166540gSi) it2.next()).LLZZJLIL(c16gx, i);
        }
        if (!this.LLJI) {
            this.LLJI = true;
            Iterator it3 = ((ArrayList) this.LLJIJIL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC1166540gSi) it3.next()).LJFF();
            }
        }
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(50L, this.LLIZLLLIL, new ARunnableS118S0100000_18(this, 8));
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Class<?> cls;
        Map<String, Class<?>> mapRS = rS();
        Object objFromJson = null;
        if (mapRS != null && (cls = mapRS.get(str)) != null) {
            try {
                objFromJson = GsonProtectorUtils.fromJson(C1741890vQh.LJFF(), str2, (Class<Object>) cls);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (objFromJson instanceof BaseMixEvent) {
                BaseMixEvent baseMixEvent = (BaseMixEvent) objFromJson;
                String str3 = nS().LIZ;
                if (C703302op.LIZ(baseMixEvent.pageId) && Intrinsics.LJFF(baseMixEvent.pageId, str3)) {
                    wS(objFromJson, str);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Context context;
        Integer numLIZJ;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, BaseMixContainerAbility.class, null, null);
        super.onViewCreated(view, bundle);
        if (C1739050vM7.LIZIZ && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            view.findViewById(R.id.ets).setBackgroundColor(numLIZJ.intValue());
        }
        C20746416Gg c20746416Gg = (C20746416Gg) view.findViewById(R.id.b6s);
        c20746416Gg.LIZ(this);
        this.LLIZ = c20746416Gg;
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18((ECBaseMixContainerFragment) this, 70), 3);
    }

    public void wS(Object obj, String str) {
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRealEvent: ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C1739050vM7.LIZIZ) {
            viewTd = C21146717pB.LIZIZ(requireContext(), R.layout.bqb, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bqb, viewGroup, false);
        }
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
