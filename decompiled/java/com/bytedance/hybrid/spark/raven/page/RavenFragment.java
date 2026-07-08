package com.bytedance.hybrid.spark.raven.page;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.AbstractC21686119tz;
import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.AbstractC471570IeR;
import X.C01GW;
import X.C020Q;
import X.C086F;
import X.C098200Yq;
import X.C09JN;
import X.C09R7;
import X.C0QSJ;
import X.C0TIA;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XF0;
import X.C1043010dFT;
import X.C1160360gIk;
import X.C1160430gIr;
import X.C1160440gIs;
import X.C1160470gIv;
import X.C1160490gIx;
import X.C1160500gIy;
import X.C1160570gJ5;
import X.C1160780gJQ;
import X.C1160970gJj;
import X.C1160990gJl;
import X.C1161000gJm;
import X.C1161040gJq;
import X.C1161090gJv;
import X.C1161100gJw;
import X.C1161130gJz;
import X.C1161140gK0;
import X.C1161180gK4;
import X.C1161190gK5;
import X.C1161200gK6;
import X.C1161250gKB;
import X.C1161330gKJ;
import X.C1161340gKK;
import X.C1161350gKL;
import X.C1161390gKP;
import X.C1161410gKR;
import X.C1161420gKS;
import X.C1161440gKU;
import X.C1161704gZ;
import X.C1161740gKy;
import X.C1161820gL6;
import X.C1161870gLB;
import X.C1161970gLL;
import X.C1162720gMY;
import X.C1163160gNG;
import X.C1164804h4;
import X.C1166504hL;
import X.C118300cf;
import X.C11NJ;
import X.C11NZ;
import X.C1208880hZ0;
import X.C13BV;
import X.C13E8;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1537410q6t;
import X.C1540620qC4;
import X.C1540660qC8;
import X.C1546210qL5;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C18Z8;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2097608Jq;
import X.C21685719tv;
import X.C21685819tw;
import X.C21686019ty;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.C443120HZe;
import X.C452501pT;
import X.C587540N2q;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1160550gJ3;
import X.EnumC1160730gJL;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1160920gJe;
import X.InterfaceC1161120gJy;
import X.InterfaceC1161370gKN;
import X.InterfaceC1161460gKW;
import X.InterfaceC1161470gKX;
import X.InterfaceC1161480gKY;
import X.InterfaceC1161510gKb;
import X.InterfaceC1161520gKc;
import X.InterfaceC1161620gKm;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1540710qCD;
import X.InterfaceC1891350zJl;
import X.InterfaceC21503819Do;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import X.InterfaceC781210Ukh;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS222S0100000_18;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS23S1100000_18;
import Y.ARunnableS71S0200000_2;
import Y.ARunnableS8S1200000_2;
import Y.AfS154S0200000_18;
import Y.AfS58S0110000_18;
import Y.AfS84S0101000_18;
import Y.AkS200S0300000_18;
import Y.AkS480S0100000_18;
import Y.AsS45S0100000_18;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.SparkLoadingCell;
import com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.bytedance.hybrid.spark.raven.component.builtin.status.DefaultRavenStatusAssem;
import com.bytedance.hybrid.spark.raven.data.EventModel;
import com.bytedance.hybrid.spark.raven.data.RavenVm;
import com.bytedance.hybrid.spark.raven.debugtool.IRavenVitalStatsViewProvider;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS0S1104000_18;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS142S0101000_2;
import kotlin.jvm.internal.AwS142S0201000_18;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS158S0101000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS17S1201000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS46S0000100_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS5S1102000_18;
import kotlin.jvm.internal.AwS61S0010000_18;
import kotlin.jvm.internal.AwS83S1300000_18;
import kotlin.jvm.internal.AwS89S0201000_2;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes19.dex */
public abstract class RavenFragment<CONTEXT> extends Fragment implements InterfaceC21503819Do, InterfaceC1161620gKm, InterfaceC1161510gKb, InterfaceC1540710qCD, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLLLLJ = 0;
    public IRavenEventAbility LL;
    public IRavenDataAbility LLILLJJLI;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public LinearLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public C1161740gKy LLJIJIL;
    public C18Z8 LLJILJIL;
    public int LLJILJILJ;
    public C1160360gIk LLJJIJIL;
    public boolean LLJJJIL;
    public C1161040gJq LLJJJJJIL;
    public Integer LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> LLJLL;
    public int LLJLLIL;
    public Integer LLJLLL;
    public C1161000gJm LLJZ;
    public Integer LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLII;
    public int LLLIIII;
    public ARunnableS118S0100000_18 LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public long LLLJL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public long LLLLIILLL;
    public boolean LLLLIL;
    public long LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLLJIL;
    public IRavenDataAbility LLLLLL;
    public IRavenEventAbility LLLLLLIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(74));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(73));
    public final Map<String, Integer> LLJILLL = new LinkedHashMap();
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(68));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(75));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(70));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(72));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 69));
    public final String LLJJJ = UUID.randomUUID().toString();
    public final Map<Integer, C1161330gKJ> LLJJJJ = new LinkedHashMap();
    public EnumC1160730gJL LLJJJJLIIL = EnumC1160730gJL.LL;
    public EnumC1160550gJ3 LLLI = EnumC1160550gJ3.FRAGMENT;
    public final C13E8<C1161000gJm> LLLIILIL = new C13E8<>();
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 73));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 68));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 70));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 80));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 67));
    public final C01GW LLLJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(71));
    public final C01GW LLLJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(69));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 71));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 78));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 72));
    public final C01GW LLLLJI = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 76));
    public final AsS45S0100000_18 LLLLL = new AsS45S0100000_18(this, 3);
    public final AsS45S0100000_18 LLLLLIL = new AsS45S0100000_18(this, 2);
    public final C01GW LLLLLILLIL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 65));
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS562S0100000_18((RavenFragment) this, 75));

    public Integer BS() {
        return null;
    }

    public String ES() {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    public boolean GT(int i) {
        return false;
    }

    public boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public abstract void RR();

    public Float RS() {
        return null;
    }

    @Override // X.InterfaceC1161620gKm
    public final Fragment S8() {
        return this;
    }

    public View VR() {
        return null;
    }

    public abstract C1161040gJq VT(C1161040gJq c1161040gJq);

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    public abstract C1162720gMY<CONTEXT> WR();

    public abstract void ZR();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IRavenDataAbility.class) {
            this.LLLLLL = (IRavenDataAbility) obj;
        } else if (cls == IRavenEventAbility.class) {
            this.LLLLLLIL = (IRavenEventAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RavenDataScope.class, RavenEventScope.class});
    }

    public abstract C1540620qC4 gS(String str);

    public C1160990gJl gT(C1160990gJl c1160990gJl) {
        return c1160990gJl;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IRavenDataAbility.class) {
            return this.LLLLLL;
        }
        if (cls == IRavenEventAbility.class) {
            return this.LLLLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RavenDataScope.class);
        arrayList.add(RavenEventScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RavenDataScope.class);
        arrayList.add(RavenEventScope.class);
        return arrayList;
    }

    public void jT() {
    }

    public void lT(long j, String str, Map map) {
    }

    public void nT(int i) {
    }

    public final void oS() {
        this.LLLII = false;
        if (this.LLLI == EnumC1160550gJ3.BODY) {
            this.LLLI = EnumC1160550gJ3.FRAGMENT;
        }
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC1161620gKm
    public void refresh() {
        NT(true);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public View uS() {
        return null;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IRavenDataAbility.class) {
            this.LLLLLL = null;
        } else if (cls == IRavenEventAbility.class) {
            this.LLLLLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void vT() {
        this.LLLLIIL = false;
        this.LLLLIILL = false;
        this.LLLLIILLL = 0L;
        this.LLLLIL = false;
        this.LLLLILI = 0L;
        this.LLLLJ = false;
        ((C1161820gL6) this.LLLLIIIILLL.getValue()).LIZ();
    }

    public final void xT() {
        this.LLLFF = false;
        this.LLLFFI = false;
        this.LLLFZ = false;
    }

    public String zS() {
        return null;
    }

    @Override // X.InterfaceC1161620gKm
    public final C1161870gLB Br() {
        return (C1161870gLB) this.LLJJIII.getValue();
    }

    public final C1161340gKK FS() {
        return (C1161340gKK) this.LLJJ.getValue();
    }

    public final Handler GS() {
        return (Handler) this.LLLJIL.getValue();
    }

    public final String HS() {
        return (String) this.LLLIL.getValue();
    }

    public final AbstractC329610Cw3<Integer> JS() {
        return (AbstractC329610Cw3) this.LLLLLILLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C443120HZe<Integer, Integer, int[]>> LT() {
        C1160490gIx layoutHandlerRegistry;
        List<AbstractC21686119tz> list;
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 == null || (layoutHandlerRegistry = c18z8.getLayoutHandlerRegistry()) == null || (list = layoutHandlerRegistry.LIZJ) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList<C21685719tv> arrayList = new ArrayList();
        for (AbstractC21686119tz abstractC21686119tz : list) {
            if (abstractC21686119tz instanceof C21685719tv) {
                arrayList.add(abstractC21686119tz);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C21685719tv c21685719tv : arrayList) {
            int[] iArr = c21685719tv.LJIJJLI.LIZ;
            if (iArr != null && ((Number) c21685719tv.LIZ.LIZ).intValue() >= 0) {
                arrayList2.add(new C443120HZe(c21685719tv.LIZ.LIZ, Integer.valueOf(c21685719tv.LJIIJJI), Arrays.copyOf(iArr, iArr.length)));
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1161620gKm
    public final IRavenEventAbility Ld1() {
        IRavenEventAbility iRavenEventAbility = this.LL;
        return iRavenEventAbility == null ? (IRavenEventAbility) this.LLILLL.getValue() : iRavenEventAbility;
    }

    public final C1163160gNG NS() {
        return (C1163160gNG) this.LLLILZJ.getValue();
    }

    public final RavenVm PS() {
        return (RavenVm) this.LLLL.getValue();
    }

    public final C1540620qC4 QS() {
        return (C1540620qC4) this.LLLLII.getValue();
    }

    public final void ST() {
        C20600815jK<InterfaceC1891350zJl> state;
        List<AbstractC21686119tz> list;
        View view;
        View view2;
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 == null || (state = c18z8.getState()) == null) {
            return;
        }
        int iLJIIIIZZ = state.LJIIIIZZ();
        C1160490gIx layoutHandlerRegistry = c18z8.getLayoutHandlerRegistry();
        if (layoutHandlerRegistry == null || (list = layoutHandlerRegistry.LIZJ) == null) {
            return;
        }
        if (((ArrayList) list).size() > 1) {
            c18z8.requestLayout();
            Object parent = c18z8.getParent();
            if (!(parent instanceof View) || (view2 = (View) parent) == null) {
                return;
            }
            view2.requestLayout();
            return;
        }
        AbstractC21686119tz abstractC21686119tz = (AbstractC21686119tz) C13LP.LJJJLL(list);
        if (abstractC21686119tz != null) {
            abstractC21686119tz.LJI();
            C1160490gIx layoutHandlerRegistry2 = c18z8.getLayoutHandlerRegistry();
            if (layoutHandlerRegistry2 != null) {
                layoutHandlerRegistry2.LIZIZ(abstractC21686119tz, iLJIIIIZZ);
            }
        }
        c18z8.requestLayout();
        Object parent2 = c18z8.getParent();
        if (!(parent2 instanceof View) || (view = (View) parent2) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void XS() {
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null) {
            C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(HS());
            if (c1161200gK6LIZ != null) {
                Collection<InterfaceC1161120gJy> collectionValues = c1161200gK6LIZ.LIZIZ.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (obj instanceof InterfaceC1161480gKY) {
                        arrayList.add(obj);
                    }
                }
                List listLLIIII = C13LP.LLIIII(arrayList);
                if (listLLIIII != null) {
                    Iterator it2 = listLLIIII.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1161480gKY) it2.next()).LIZJ(c18z8);
                    }
                }
            }
            C1160360gIk c1160360gIk = new C1160360gIk(c18z8);
            c1160360gIk.LJ = new AwS562S0100000_18((RavenFragment) this, 2643);
            this.LLJJIJIL = c1160360gIk;
        }
    }

    public final void ZS() {
        C13IQ c13iq;
        FrameLayout frameLayout = this.LLIZLLLIL;
        Object tag = frameLayout != null ? frameLayout.getTag() : null;
        if ((tag instanceof C13IQ) && (c13iq = (C13IQ) tag) != null) {
            C723850SaN.LJIIIIZZ(this, c13iq);
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            frameLayout2.setTag(null);
        }
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 != null) {
            C786410Ut5.LJJJJIZL(frameLayout3);
        }
    }

    public final void ZT() {
        if (this.LLLLIIL) {
            return;
        }
        boolean z = this.LLLLIILL || QS() == null;
        boolean z2 = this.LLLLIL;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1160430gIr(z, this, z2));
        if (z && z2) {
            this.LLLLIIL = true;
            long jMax = Math.max(this.LLLLIILLL, this.LLLLILI);
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS46S0000100_2(jMax, 1));
            lT(System.currentTimeMillis(), "all_first_screen_rendered", C2097608Jq.LJIIIIZZ(new Pair("spark_draw_end", Long.valueOf(this.LLLLIILLL)), new Pair("myna_draw_end", Long.valueOf(this.LLLLILI)), new Pair("first_screen_max_draw_end", Long.valueOf(jMax))));
            kT(jMax);
        }
    }

    public C1161820gL6 bS() {
        return new C1161820gL6();
    }

    public C1160990gJl dS() {
        return new C1160990gJl("", C2097608Jq.LJ());
    }

    public final boolean eT() {
        return this.LLL;
    }

    public final void hS() {
        ARunnableS118S0100000_18 aRunnableS118S0100000_18 = this.LLLIIIIL;
        if (aRunnableS118S0100000_18 != null) {
            GS().removeCallbacks(aRunnableS118S0100000_18);
        }
        this.LLLIIIIL = null;
    }

    public final void mS() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DefaultRavenStatusAssem.class);
        FrameLayout frameLayout = this.LLIZLLLIL;
        Object tag = frameLayout != null ? frameLayout.getTag() : null;
        if (!(tag instanceof C13IQ)) {
            tag = null;
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        boolean z = false;
        boolean z2 = frameLayout2 != null && frameLayout2.getChildCount() > 0;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null) != null) {
            z = true;
        }
        if (Intrinsics.LJFF(tag, c19719912DlLIZ) && z2 && z) {
            return;
        }
        OR(c19719912DlLIZ);
    }

    public final IRavenDataAbility sT() {
        IRavenDataAbility iRavenDataAbility = this.LLILLJJLI;
        return iRavenDataAbility == null ? (IRavenDataAbility) this.LLILZ.getValue() : iRavenDataAbility;
    }

    public final C11NJ wS() {
        return (C11NJ) this.LLLJ.getValue();
    }

    public final C1160780gJQ yS() {
        return (C1160780gJQ) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC1161510gKb
    public final String Ay() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EK());
        sbLIZ.append('_');
        sbLIZ.append(this.LLJJJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void DT() {
        hS();
        ARunnableS118S0100000_18 aRunnableS118S0100000_18 = new ARunnableS118S0100000_18(this, 6);
        this.LLLIIIIL = aRunnableS118S0100000_18;
        C786410Ut5.LJLIIL(10000L, GS(), aRunnableS118S0100000_18);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS546S0100000_2((RavenFragment) this, 50));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", AFwS187S0000000_2.get$arr$(125));
        C1163160gNG c1163160gNGNS = NS();
        C786410Ut5.LJJZZIII(c1163160gNGNS.LIZJ, new ARunnableS118S0100000_18(c1163160gNGNS, 77));
        FS().onDestroy();
        C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(HS());
        if (c1161200gK6LIZ != null) {
            String str = c1161200gK6LIZ.LIZ;
            if (str != null) {
                Map<String, Integer> map = C1161200gK6.LJ;
                Integer num = (Integer) ((LinkedHashMap) map).get(str);
                map.put(str, Integer.valueOf((num != null ? num.intValue() : 1) - 1));
                Integer num2 = (Integer) ((LinkedHashMap) map).get(str);
                if (num2 != null && num2.intValue() == 0) {
                    C1161200gK6.LIZLLL.remove(str);
                }
            }
            c1161200gK6LIZ.LIZIZ = new HashMap<>();
        }
        C1540620qC4 c1540620qC4QS = QS();
        if (c1540620qC4QS != null) {
            c1540620qC4QS.LJII();
        }
        ((C1161820gL6) this.LLLLIIIILLL.getValue()).LIZ();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FS().onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FS().onDetach();
        Iterator it2 = ((List) this.LLLIZZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((C1161350gKL) this.LLLILZ.getValue()).LJJIL((InterfaceC1161460gKW) it2.next(), this);
        }
        Iterator it3 = ((List) this.LLLILZLLLI.getValue()).iterator();
        while (it3.hasNext()) {
            ((C1161350gKL) this.LLLILZ.getValue()).LJJIL((InterfaceC1161460gKW) it3.next(), this);
        }
        wS().dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FS().onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FS().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        FS().onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        FS().onStop();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC1161620gKm
    public final int Lg() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1161620gKm
    public final ViewOnAttachStateChangeListenerC20604515jv Lt() {
        return this.LLJILJIL;
    }

    public Class<? extends PowerLoadingCell> UR() {
        return SparkLoadingCell.class;
    }

    public InterfaceC1160920gJe aS() {
        return C1160970gJj.LIZ;
    }

    public InterfaceC1160920gJe cS() {
        return C1160970gJj.LIZ;
    }

    public List<InterfaceC1161460gKW> rT() {
        return C13BV.INSTANCE;
    }

    public static String PT(RavenFragment ravenFragment) {
        List list;
        String strLIZIZ;
        C1160490gIx layoutHandlerRegistry;
        C18Z8 c18z8 = ravenFragment.LLJILJIL;
        if (c18z8 == null || (layoutHandlerRegistry = c18z8.getLayoutHandlerRegistry()) == null || (list = layoutHandlerRegistry.LIZJ) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return "[]";
        }
        List listLL = C13LP.LL(list, 16);
        if (list.size() > 16) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", ... total=");
            sbLIZ.append(list.size());
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = e3.f;
        }
        return C13LP.LJJLIIIJ(listLL, null, e3.e, strLIZIZ, 0, null, AFwS256S0000000_18.get$arr$(972), 25);
    }

    public static int nS(RecyclerView recyclerView) {
        Integer numLJJJJJL;
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof PowerLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof GridLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (numLJJJJJL = C13LQ.LJJJJJL(((StaggeredGridLayoutManager) layoutManager).LJIJJ(null))) == null) {
            return -1;
        }
        return numLJJJJJL.intValue();
    }

    public final void FT(C1161040gJq c1161040gJq) {
        List<C1161140gK0> listLIZ;
        HashMap<C1161180gK4, InterfaceC1161120gJy> map;
        InterfaceC1161120gJy interfaceC1161120gJy;
        if (c1161040gJq != null && (listLIZ = c1161040gJq.LIZ()) != null) {
            ArrayList<C1161140gK0> arrayList = new ArrayList();
            for (C1161140gK0 c1161140gK0 : listLIZ) {
                C1161140gK0 c1161140gK02 = c1161140gK0;
                C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(HS());
                if (c1161200gK6LIZ != null && c1161200gK6LIZ.LIZ(c1161140gK02, c1161040gJq.LLILLJJLI)) {
                    arrayList.add(c1161140gK0);
                }
            }
            for (C1161140gK0 c1161140gK03 : arrayList) {
                if (((LinkedHashMap) ((C1161390gKP) this.LLJJIJIIJIL.getValue()).LIZ).get(c1161140gK03.LIZ) == null) {
                    C1161180gK4 c1161180gK4 = c1161140gK03.LIZIZ;
                    C1161200gK6 c1161200gK6LIZ2 = C1161190gK5.LIZ(HS());
                    if (c1161200gK6LIZ2 != null && (map = c1161200gK6LIZ2.LIZIZ) != null && (interfaceC1161120gJy = map.get(c1161180gK4)) != null) {
                        interfaceC1161120gJy.service();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1161620gKm
    public final Map<String, EventModel> Hm(String str) {
        C1161140gK0 value;
        MutableLiveData<C1161140gK0> mutableLiveData = PS().vQ2().LIZ.get(str);
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
            return value.LJ;
        }
        return null;
    }

    public final void IT(String str) {
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null) {
            int visibility = c18z8.getVisibility();
            c18z8.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c18z8);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c18z8);
            c18z8.setAlpha(1.0f);
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS167S1100000_18(this, str, 23));
    }

    @Override // X.InterfaceC1540710qCD
    public void Ka(C1540660qC8 c1540660qC8) {
        if (this instanceof RavenMusicCollectionFragment) {
            C086F c086f = C086F.LIZ;
            ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(this, 10);
            c086f.getClass();
            C086F.LJII(aRunnableS102S0100000_2);
        }
        if (!this.LLJJJIL) {
            C0XF0.LIZ(EK(), "first_component_load", CardStruct.IStatusCode.DEFAULT, 56);
            this.LLJJJIL = true;
        } else {
            C0XF0.LIZ(EK(), "loadmore_component_load", CardStruct.IStatusCode.DEFAULT, 56);
        }
    }

    public final void NT(final boolean z) {
        hS();
        this.LLL = false;
        this.LLLF = false;
        this.LLLIIIL = false;
        xT();
        if (!(!(this instanceof StoreMixTabFragment))) {
            this.LLLLLJIL = true;
            this.LLJJJIL = false;
            C1540620qC4 c1540620qC4QS = QS();
            if (c1540620qC4QS != null) {
                c1540620qC4QS.LJJIZ.clear();
            }
            vT();
            return;
        }
        this.LLLI = EnumC1160550gJ3.FRAGMENT;
        this.LLLII = false;
        C086F c086f = C086F.LIZ;
        ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(this, 82);
        c086f.getClass();
        C086F.LJII(aRunnableS102S0100000_2);
        C1160990gJl c1160990gJlDS = dS();
        InterfaceC1160920gJe interfaceC1160920gJeCS = cS();
        this.LLLLLJIL = true;
        this.LLJJJIL = false;
        C1540620qC4 c1540620qC4QS2 = QS();
        if (c1540620qC4QS2 != null) {
            c1540620qC4QS2.LJJIZ.clear();
        }
        vT();
        RavenVm ravenVmPS = PS();
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18((RavenFragment) this, 54);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((RavenFragment) this, 79);
        C1160780gJQ c1160780gJQYS = yS();
        ravenVmPS.getClass();
        wS().LIZ(C1161130gJz.LIZIZ(ravenVmPS.LL, c1160990gJlDS, interfaceC1160920gJeCS, c1160780gJQYS).LJJJJZI(new AkS480S0100000_18(awS597S0100000_18, 4)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS154S0200000_18(c1160990gJlDS, c1160780gJQYS, 19)).LJJJJZI(new AkS200S0300000_18(c1160780gJQYS, ravenVmPS, awS562S0100000_18, 1)).LJJL(new AkS200S0300000_18(c1160780gJQYS, ravenVmPS, awS562S0100000_18, 2)).LJJIIJZLJL(new C1208880hZ0(c1160780gJQYS, 7)).LJJZ(new AfS58S0110000_18(this, z, 0), new AfS58S0110000_18(this, z, 1), new InterfaceC781210Ukh(this) { // from class: X.0gJG
            public final /* synthetic */ RavenFragment<CONTEXT> LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC781210Ukh
            public final void run() {
                if (z) {
                    this.LIZIZ.LLJILJILJ++;
                }
                this.LIZIZ.JS().getOperator().refresh();
            }
        }));
    }

    public final void OR(C19719912Dl c19719912Dl) {
        ZS();
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            Integer numValueOf = Integer.valueOf(frameLayout.getId());
            if (numValueOf.intValue() != -1 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                FrameLayout frameLayout2 = this.LLIZLLLIL;
                if (frameLayout2 != null) {
                    frameLayout2.setTag(c19719912Dl);
                }
                if (!UISlotAssem.class.isAssignableFrom(C09R7.LIZ(c19719912Dl)) && !DynamicAssem.class.isAssignableFrom(C09R7.LIZ(c19719912Dl))) {
                    if (UIContentAssem.class.isAssignableFrom(C09R7.LIZ(c19719912Dl))) {
                        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2((RavenFragment) this, c19719912Dl, 134), 3);
                        return;
                    }
                    return;
                }
                C723850SaN.LIZ(this, false, null, new AwS89S0201000_2(this, c19719912Dl, iIntValue, 7), 3);
            }
        }
    }

    @Override // X.InterfaceC1540710qCD
    public void RJ(long j) {
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS46S0000100_2(j, 2));
        if (this instanceof RavenMusicCollectionFragment) {
            ZS();
            C086F c086f = C086F.LIZ;
            ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(this, 11);
            c086f.getClass();
            C086F.LJII(aRunnableS102S0100000_2);
        }
        NS().LIZ(j, "first_body_component_update_start");
        if (!this.LLJJJIL) {
            C0XF0.LIZ(EK(), "first_component_load", "1", 56);
            this.LLJJJIL = true;
        } else {
            C0XF0.LIZ(EK(), "loadmore_component_load", "1", 56);
        }
    }

    public final void SR(String str) {
        this.LLLIIL++;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS167S1100000_18(this, str, 6));
    }

    public final void VS(String str) {
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null) {
            int visibility = c18z8.getVisibility();
            c18z8.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c18z8);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c18z8);
            c18z8.setAlpha(0.0f);
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS167S1100000_18(this, str, 5));
    }

    public final void YS(ViewGroup viewGroup) {
        Object tag;
        C13IQ c13iq;
        if (viewGroup != null) {
            tag = viewGroup.getTag();
        } else {
            tag = null;
        }
        if ((tag instanceof C13IQ) && (c13iq = (C13IQ) tag) != null) {
            C723850SaN.LJIIIIZZ(this, c13iq);
        }
        if (viewGroup != null) {
            viewGroup.setTag(null);
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // X.InterfaceC1161620gKm
    public final void as(String str) {
        Object obj;
        Map<String, Integer> map = this.LLJILLL;
        Object obj2 = 0;
        if (map.containsKey(str) && (obj = ((LinkedHashMap) map).get(str)) != null) {
            obj2 = obj;
        }
        map.put(str, Integer.valueOf(((Number) obj2).intValue() + 1));
    }

    public final List<C1161140gK0> bU(C1161040gJq c1161040gJq) {
        List<C1161140gK0> listLIZIZ;
        C1161200gK6 c1161200gK6LIZ;
        if (c1161040gJq != null && (listLIZIZ = c1161040gJq.LIZIZ()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C1161140gK0 c1161140gK0 : listLIZIZ) {
                C1161140gK0 c1161140gK02 = c1161140gK0;
                C1161200gK6 c1161200gK6LIZ2 = C1161190gK5.LIZ(HS());
                if (c1161200gK6LIZ2 != null) {
                    if ((c1161200gK6LIZ2.LIZIZ.get(c1161140gK02.LIZIZ) instanceof InterfaceC1161480gKY) && (c1161200gK6LIZ = C1161190gK5.LIZ(HS())) != null && c1161200gK6LIZ.LIZ(c1161140gK02, c1161040gJq.LLILLJJLI) && c1161140gK02.LIZLLL != null) {
                        arrayList.add(c1161140gK0);
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RavenDataScope.class});
        Object value = this.LLILLJJLI;
        if (value == null) {
            value = this.LLILZ.getValue();
        }
        c0qsjLIZIZ.unbindAbility(value, IRavenDataAbility.class);
        C0QSJ c0qsjLIZIZ2 = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RavenEventScope.class});
        Object value2 = this.LL;
        if (value2 == null) {
            value2 = this.LLILLL.getValue();
        }
        c0qsjLIZIZ2.unbindAbility(value2, IRavenEventAbility.class);
    }

    public final String fT(Integer num) {
        int iIntValue;
        boolean z;
        int iIntValue2;
        Integer numValueOf;
        Integer numValueOf2;
        C20600815jK<InterfaceC1891350zJl> state;
        AbstractC21673619ry adapter;
        StringBuilder sb = new StringBuilder("phase=");
        sb.append(this.LLJJJJLIIL);
        sb.append(" sessionId=");
        int iIntValue3 = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        sb.append(iIntValue);
        sb.append(" preLoadExpectManualLoadMore=");
        sb.append(this.LLJLILLLLZIIL);
        sb.append(" pendingPreLoadContinuation=");
        boolean z2 = true;
        if (this.LLJLL != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" pendingPreLoadCursor=");
        sb.append(this.LLJLLIL);
        sb.append(" pendingPreLoadSessionId=");
        Integer num2 = this.LLJLLL;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = -1;
        }
        sb.append(iIntValue2);
        sb.append(" pendingManualLoadMoreRaw=");
        if (this.LLJZ == null) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(" pendingManualLoadMoreSessionId=");
        Integer num3 = this.LLJZIJLIL;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        }
        sb.append(iIntValue3);
        sb.append(" firstFetchSupplementInProgress=");
        sb.append(this.LLL);
        sb.append(" firstFetchSupplementTriggeredOnce=");
        sb.append(this.LLLF);
        sb.append(" bodyVisibilityRestorePending=");
        sb.append(this.LLLFF);
        sb.append(" bodyVisibilityDataCommitReady=");
        sb.append(this.LLLFFI);
        sb.append(" bodyVisibilityDeferredForSupplement=");
        sb.append(this.LLLFZ);
        sb.append(" bodyVisibilityWaitingForPostSupplementPreload=false preLoadMoreFired=");
        sb.append(this.LLJJLIIIJLLLLLLLZ);
        sb.append(" preLoadMoreRetryEligible=");
        sb.append(this.LLJL);
        sb.append(" preLoadMoreRetriedOnce=");
        sb.append(this.LLJLIL);
        sb.append(" adapterCount=");
        C18Z8 c18z8 = this.LLJILJIL;
        Integer numValueOf3 = null;
        if (c18z8 != null && (adapter = c18z8.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(" stateSize=");
        C18Z8 c18z82 = this.LLJILJIL;
        if (c18z82 != null && (state = c18z82.getState()) != null) {
            numValueOf2 = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf2 = null;
        }
        sb.append(numValueOf2);
        sb.append(" childCount=");
        C18Z8 c18z83 = this.LLJILJIL;
        if (c18z83 != null) {
            numValueOf3 = Integer.valueOf(c18z83.getChildCount());
        }
        sb.append(numValueOf3);
        sb.append(" supplementHold=false supplementIssuedLoadMorePending=");
        sb.append(this.LLLIIIL);
        sb.append(" loadMoreCommitInFlightCount=");
        sb.append(this.LLLIIL);
        sb.append(" deferredInsertQueueSize=");
        sb.append(this.LLLIILIL.size());
        return sb.toString();
    }

    public final void hT(String str) {
        if (!this.LLLFF) {
            return;
        }
        if (!this.LLLFFI) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 0));
            return;
        }
        if (this.LLLFZ) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 1));
            return;
        }
        this.LLLFF = false;
        this.LLLFFI = false;
        oS();
        ARunnableS23S1100000_18 aRunnableS23S1100000_18 = new ARunnableS23S1100000_18(this, str, null, 0);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS23S1100000_18.run();
            return;
        }
        C086F c086f = C086F.LIZ;
        ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(aRunnableS23S1100000_18, 8);
        c086f.getClass();
        C086F.LJII(aRunnableS102S0100000_2);
    }

    @Override // X.InterfaceC1161620gKm
    public final int hi(String str) {
        Object obj;
        if (str == null || str.length() == 0) {
            return 0;
        }
        Map<String, Integer> map = this.LLJILLL;
        Object obj2 = 0;
        if (map.containsKey(str) && (obj = ((LinkedHashMap) map).get(str)) != null) {
            obj2 = obj;
        }
        return ((Number) obj2).intValue();
    }

    public final void iT(int i) {
        int iNS;
        Integer num = this.LLJJL;
        if (num != null) {
            int iIntValue = num.intValue();
            if (eT()) {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS142S0101000_2(i, (int) this, 0));
                return;
            }
            if (!this.LLJL || this.LLJLIL || !LJIIJJI() || (iNS = nS(this.LLJILJIL)) < 0) {
                return;
            }
            int i2 = (i - 1) - iIntValue;
            if (i2 >= 0 && iNS < i2) {
                return;
            }
            if (eT()) {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS5S1102000_18(iIntValue, i, this, 1));
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = true;
            this.LLJL = false;
            this.LLJLIL = true;
            this.LLJLILLLLZIIL = true;
            EnumC1160730gJL enumC1160730gJL = EnumC1160730gJL.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerPreLoadMore ");
            sbLIZ.append("preload retry");
            YT(enumC1160730gJL, C2188811AlT.LIZIZ(sbLIZ));
            JS().getOperator().LIZ(Integer.valueOf(i));
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new C1160470gIv(i, iIntValue));
            nT(iIntValue);
        }
    }

    public final void kS(String str) {
        int i = this.LLLIIL;
        if (i <= 0) {
            return;
        }
        this.LLLIIL = i - 1;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS167S1100000_18(this, str, 7));
        if (this.LLLIIL == 0) {
            sS(str);
        }
    }

    public void kT(long j) {
        RJ(j);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC1294060jmO
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FS().LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        TraceEvent.LJIIJ(1L, "raven_start");
        this.LLLJL = System.currentTimeMillis();
        Iterator it2 = ((List) this.LLLIZZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((C1161350gKL) this.LLLILZ.getValue()).LJJIJIIJIL((InterfaceC1161460gKW) it2.next(), this);
        }
        Iterator it3 = ((List) this.LLLILZLLLI.getValue()).iterator();
        while (it3.hasNext()) {
            ((C1161350gKL) this.LLLILZ.getValue()).LJJIJIIJIL((InterfaceC1161460gKW) it3.next(), this);
        }
        FS().onAttach();
        NS().LIZ(this.LLLJL, "raven_start");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FS().onCreate();
        C687700QyG.LJI(this);
        C0XF0.LIZ(EK(), "enter", null, 60);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/hybrid/spark/raven/page/RavenFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNEW1HFx2TX1S3HMnfSdHlXqZAEN8QV44", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        FS().onHiddenChanged(z);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RavenDataScope.class});
        Object value = this.LLILLJJLI;
        if (value == null) {
            value = this.LLILZ.getValue();
        }
        c0qsjLIZIZ.bindAbility(value, IRavenDataAbility.class);
        C0QSJ c0qsjLIZIZ2 = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RavenEventScope.class});
        Object value2 = this.LL;
        if (value2 == null) {
            value2 = this.LLILLL.getValue();
        }
        c0qsjLIZIZ2.bindAbility(value2, IRavenEventAbility.class);
    }

    public void pT(C1161040gJq c1161040gJq) {
        boolean z;
        int iLJIIIIZZ;
        C20600815jK<InterfaceC1891350zJl> state;
        boolean z2 = this instanceof RavenMusicCollectionFragment;
        if (!z2) {
            if (c1161040gJq != null && c1161040gJq.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            C18Z8 c18z8 = this.LLJILJIL;
            if (c18z8 != null && (state = c18z8.getState()) != null) {
                iLJIIIIZZ = state.LJIIIIZZ();
            } else {
                iLJIIIIZZ = 0;
            }
            if (z && !this.LLLF && GT(iLJIIIIZZ)) {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS142S0101000_2(iLJIIIIZZ, (int) this, 1));
            }
        }
        oS();
        if (!z2) {
            C086F c086f = C086F.LIZ;
            ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(this, 80);
            c086f.getClass();
            C086F.LJII(aRunnableS102S0100000_2);
        }
        ZS();
    }

    public final void qT(C1161000gJm c1161000gJm) {
        List<String> list;
        if (this.LLLIIL > 0) {
            this.LLLIILIL.addLast(c1161000gJm);
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS562S0100000_18((RavenFragment) this, 77));
            return;
        }
        C1160990gJl c1160990gJlGT = gT(dS());
        final int size = 0;
        c1160990gJlGT.LIZJ = false;
        final int i = this.LLLIIII + 1;
        this.LLLIIII = i;
        Map<String, List<String>> layout = c1161000gJm.LIZ.getLayout();
        if (layout != null && (list = layout.get("body")) != null) {
            size = list.size();
        }
        wS().LIZ(PS().zQ2(c1160990gJlGT, C11NZ.LJJJJZ(c1161000gJm), new AwS597S0100000_18((RavenFragment) this, 53), yS()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.0gJ2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v3 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // X.C09JN
            public final void accept(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 1033
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1160540gJ2.accept(java.lang.Object):void");
            }
        }, new AfS84S0101000_18(i, this, 0), new InterfaceC781210Ukh() { // from class: X.0gJ9
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS142S0101000_2(i, (int) this, 2));
                this.yS().onSuccess();
            }
        }));
    }

    @Override // X.InterfaceC1161620gKm
    public final <T> T qw(String str) {
        C1161140gK0 value;
        T t;
        MutableLiveData<C1161140gK0> mutableLiveData = PS().vQ2().LIZ.get(str);
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null || (t = (T) value.LIZLLL) == null) {
            return null;
        }
        return t;
    }

    public final void sS(String str) {
        if (this.LLLIILIL.isEmpty()) {
            return;
        }
        List listLLIIII = C13LP.LLIIII(this.LLLIILIL);
        this.LLLIILIL.clear();
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS119S1200000_2(str, (String) listLLIIII, (List<C1161000gJm>) this, 0));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            qT((C1161000gJm) it2.next());
        }
    }

    public final boolean zT(String str) {
        int iLJIIIIZZ;
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn = this.LLJLL;
        if (interfaceC1364105Vn == null) {
            return false;
        }
        int i = this.LLJLLIL;
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            iLJIIIIZZ = state.LJIIIIZZ();
        } else {
            iLJIIIIZZ = i;
        }
        this.LLJLL = null;
        this.LLJLLL = null;
        this.LLJLLIL = 0;
        this.LLJLILLLLZIIL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = false;
        this.LLJLIL = false;
        YT(EnumC1160730gJL.LL, str);
        C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Integer.valueOf(iLJIIIIZZ), C13BV.INSTANCE, 1);
        C189200o6.m2constructorimpl(c323380Cm0LJ);
        interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS5S1102000_18(str, (String) i, iLJIIIIZZ, (int) this, 0));
        return true;
    }

    public static String OT(RavenFragment ravenFragment, List list) {
        String strLIZIZ;
        String str;
        ravenFragment.getClass();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BaseComponentData baseComponentData = (BaseComponentData) it2.next();
                if (baseComponentData != null && (str = baseComponentData.instanceId) != null) {
                    arrayList.add(str);
                }
            }
            List listLL = C13LP.LL(arrayList, 16);
            if (arrayList.size() > 16) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(", ... total=");
                sbLIZ.append(arrayList.size());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(']');
            sbLIZ2.append(strLIZIZ);
            return C13LP.LJJLIIIJ(listLL, null, e3.e, C2188811AlT.LIZIZ(sbLIZ2), 0, null, null, 57);
        }
        return "[]";
    }

    public static String RT(RavenFragment ravenFragment, List list) {
        String strLIZIZ;
        ravenFragment.getClass();
        if (list != null && !list.isEmpty()) {
            List listLL = C13LP.LL(list, 16);
            if (list.size() > 16) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(", ... total=");
                sbLIZ.append(list.size());
                sbLIZ.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = e3.f;
            }
            return C13LP.LJJLIIIJ(listLL, null, e3.e, strLIZIZ, 0, null, AFwS256S0000000_18.get$arr$(973), 25);
        }
        return "[]";
    }

    public final void AT(final String str, final Function0<Unit> function0) {
        List list;
        Integer numValueOf;
        int itemCount;
        int itemCount2;
        final C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 == null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 5));
            if (function0 != null) {
                function0.invoke();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" bodyList null");
            hT(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ViewTreeObserver viewTreeObserver = c18z8.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 4));
            HandlerHook.viewPost(c18z8, new ARunnableS8S1200000_2(str, function0, this, 0));
            return;
        }
        CT(c18z8, str, this, "before wait next preDraw");
        C1160490gIx layoutHandlerRegistry = c18z8.getLayoutHandlerRegistry();
        Integer numValueOf2 = null;
        if (layoutHandlerRegistry == null || (list = layoutHandlerRegistry.LIZJ) == null) {
            list = C13BV.INSTANCE;
        }
        final String strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, e3.e, e3.f, 0, null, AFwS256S0000000_18.get$arr$(36), 25);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C21685719tv) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((C21685719tv) it2.next()).LJIIJJI);
            while (it2.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((C21685719tv) it2.next()).LJIIJJI);
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C21685819tw) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            numValueOf2 = Integer.valueOf(((C21685819tw) it3.next()).LJIIJJI);
            while (it3.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((C21685819tw) it3.next()).LJIIJJI);
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        }
        int iMin = 1;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            AbstractC21673619ry adapter = c18z8.getAdapter();
            if (adapter != null && (itemCount2 = adapter.getItemCount()) >= 1) {
                iMin = itemCount2;
            }
            iMin = Math.min(iIntValue, iMin);
        } else if (numValueOf2 != null) {
            int iIntValue2 = numValueOf2.intValue();
            if (iIntValue2 < 1) {
                iIntValue2 = 1;
            }
            AbstractC21673619ry adapter2 = c18z8.getAdapter();
            if (adapter2 != null && (itemCount = adapter2.getItemCount()) >= 1) {
                iMin = itemCount;
            }
            iMin = Math.min(iIntValue2, iMin);
        }
        final C118300cf c118300cf = new C118300cf();
        final int i = iMin;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0gIu
            public final /* synthetic */ int LLILZ = 4;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                c118300cf.element++;
                int childCount = c18z8.getChildCount();
                boolean z = childCount >= i || c118300cf.element >= this.LLILZ;
                C18Z8 c18z82 = c18z8;
                try {
                    if (c18z82.getViewTreeObserver().isAlive() && z) {
                        C786410Ut5.D3(c18z82.getViewTreeObserver(), this);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new C1160450gIt(str, c18z8, c118300cf, this.LLILZ, i, z, childCount, strLJJLIIIJ, this));
                if (z) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    this.hT(str + " next preDraw");
                    return true;
                }
                RavenFragment.CT(c18z8, str, this, "preDraw attempt=" + c118300cf.element + " childCount=" + childCount);
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1164804h4(iMin, this, str, strLJJLIIIJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x023c A[PHI: r2
      0x023c: PHI (r2v9 boolean) = (r2v8 boolean), (r2v13 boolean) binds: [B:76:0x011c, B:83:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[EDGE_INSN: B:68:0x00f8->B:69:0x00f9 BREAK  A[LOOP:1: B:64:0x00e6->B:130:?], PHI: r2
      0x00f9: PHI (r2v13 boolean) = (r2v8 boolean), (r2v14 boolean) binds: [B:76:0x011c, B:68:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR(X.C1161040gJq r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.page.RavenFragment.MR(X.0gJq, boolean):void");
    }

    public final void PR(C18Z8 c18z8, boolean z) {
        c18z8.LJIIIZ();
        c18z8.setItemViewCacheSize(4);
        c18z8.addOnScrollListener((AbstractC1585810rMx) this.LLLILZ.getValue());
        c18z8.addOnScrollListener(this.LLLLLIL);
        c18z8.addOnScrollListener(this.LLLLL);
        if (z) {
            c18z8.LJIIL(JS());
            return;
        }
        boolean z2 = JS().LIZ.LIZJ;
        JS().LIZ.LIZJ = false;
        try {
            c18z8.LJIIL(JS());
            JS().LIZ.LIZJ = z2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            JS().LIZ.LIZJ = z2;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void US(X.C1161040gJq r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.page.RavenFragment.US(X.0gJq, boolean):void");
    }

    public final void YT(EnumC1160730gJL enumC1160730gJL, String str) {
        EnumC1160730gJL enumC1160730gJL2 = this.LLJJJJLIIL;
        this.LLJJJJLIIL = enumC1160730gJL;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS83S1300000_18(enumC1160730gJL2, enumC1160730gJL, (EnumC1160730gJL) str, (String) this, 1));
        ArrayList arrayList = new ArrayList();
        if (this.LLJLL != null && this.LLJJJJLIIL != EnumC1160730gJL.LLILLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pendingPreLoadContinuation!=null but phase=");
            sbLIZ.append(this.LLJJJJLIIL);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJJJJLIIL == EnumC1160730gJL.LLILLL && this.LLJLL == null) {
            arrayList.add("phase=CONTINUATION_PARKED but pendingPreLoadContinuation==null");
        }
        if (this.LLJL && !this.LLJJLIIIJLLLLLLLZ) {
            arrayList.add("preLoadMoreRetryEligible=true but preLoadMoreFired=false");
        }
        if (this.LLLFFI && !this.LLLFF) {
            arrayList.add("bodyVisibilityDataCommitReady=true but bodyVisibilityRestorePending=false");
        }
        if (this.LLLFZ && !this.LLLFF) {
            arrayList.add("bodyVisibilityDeferredForSupplement=true but bodyVisibilityRestorePending=false");
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadMore invariant violation [source=");
            sbLIZ2.append(str);
            sbLIZ2.append("]: ");
            sbLIZ2.append(C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, null, 62));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS102S1000000_18(strLIZIZ, 24));
        }
    }

    public final void oT(Throwable th, boolean z) {
        oS();
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS546S0100000_2(th, 51));
        if (z && !(this instanceof RavenMusicCollectionFragment)) {
            C086F c086f = C086F.LIZ;
            ARunnableS71S0200000_2 aRunnableS71S0200000_2 = new ARunnableS71S0200000_2(this, th, 2);
            c086f.getClass();
            C086F.LJII(aRunnableS71S0200000_2);
        }
        Iterator<InterfaceC1161520gKc> it2 = ((C1161440gKU) this.LLJJI.getValue()).LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C1161740gKy c1161740gKy;
        super.onViewCreated(view, bundle);
        WR();
        NS().LIZIZ("skeleton_start");
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.ssd);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.ssj);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.ssi);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.ssm);
        this.LLJ = (FrameLayout) view.findViewById(R.id.ssg);
        this.LLJI = (FrameLayout) view.findViewById(R.id.ssh);
        C18Z8 c18z8 = (C18Z8) view.findViewById(R.id.ssf);
        this.LLJILJIL = c18z8;
        if (c18z8 != null) {
            PR(c18z8, true);
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C587540N2q.LIZ.getClass();
            IRavenVitalStatsViewProvider iRavenVitalStatsViewProvider = (IRavenVitalStatsViewProvider) C587540N2q.LIZ(IRavenVitalStatsViewProvider.class);
            if (iRavenVitalStatsViewProvider != null) {
                iRavenVitalStatsViewProvider.provideRavenVitalStatsView(getContext());
            }
        }
        C1161740gKy c1161740gKy2 = (C1161740gKy) view.findViewById(R.id.sse);
        this.LLJIJIL = c1161740gKy2;
        if (c1161740gKy2 != null) {
            c1161740gKy2.setNameSpace(HS());
        }
        if (getContext() != null && (c1161740gKy = this.LLJIJIL) != null) {
            c1161740gKy.LIZ();
        }
        C1161740gKy c1161740gKy3 = this.LLJIJIL;
        if (c1161740gKy3 != null) {
            c1161740gKy3.setOnRefreshListener(new AwS562S0100000_18((RavenFragment) this, 2638));
        }
        XS();
        NS().LIZIZ("multi_card_manager_start");
        C1540620qC4 c1540620qC4QS = QS();
        if (c1540620qC4QS != null) {
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C1161420gKS(c1540620qC4QS), C1161420gKS.class, "source_default_key");
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C1161410gKR((C1161820gL6) this.LLLLIIIILLL.getValue()), C1161410gKR.class, "source_default_key");
        OR(C13LE.LIZ(DefaultRavenStatusAssem.class));
        FS().onViewCreated(view);
    }

    @Override // X.InterfaceC1161620gKm
    public final boolean sk2(View view, MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            zDispatchTouchEvent = linearLayout.dispatchTouchEvent(motionEvent);
        } else {
            zDispatchTouchEvent = false;
        }
        new C1043010dFT();
        C1043010dFT.LIZ("RavenFragment", new AwS61S0010000_18(zDispatchTouchEvent, 3));
        return zDispatchTouchEvent;
    }

    public final void uT(String str, boolean z) {
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [X.15jv, X.18Z8] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.19tv, X.19tx, X.19tz] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.19tx] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.19tw, X.19tx, X.19tz] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.19tx, X.19ty, X.19tz] */
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
    public final void ET(C1161040gJq c1161040gJq, List<? extends BaseComponentData> list, List<C443120HZe<Integer, Integer, int[]>> list2) {
        C1161090gJv c1161090gJv;
        List<C1161100gJw> listLIZIZ;
        int i;
        ?? c21685719tv;
        if (c1161040gJq != null && (c1161090gJv = c1161040gJq.LL) != null && (listLIZIZ = c1161090gJv.LIZIZ(list)) != null) {
            Map mapLJ = C2097608Jq.LJ();
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS246S0300000_2(this, list, listLIZIZ, (List<C1161100gJw>) 1));
            int i2 = 0;
            for (C1161100gJw c1161100gJw : listLIZIZ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C1161100gJw c1161100gJwLIZ = c1161100gJw;
                    new C1043010dFT();
                    C1043010dFT.LIZIZ("RavenFragment", new AwS158S0101000_18(i2, c1161100gJwLIZ, 0));
                    C1161330gKJ c1161330gKJ = (C1161330gKJ) ((LinkedHashMap) this.LLJJJJ).get(Integer.valueOf(i2));
                    if (c1161330gKJ != null || (c1161330gKJ = (C1161330gKJ) mapLJ.get(Integer.valueOf(i2))) != null) {
                        c1161100gJwLIZ = C1161100gJw.LIZ(c1161100gJwLIZ, 0, 0, c1161330gKJ.LIZ, null, c1161330gKJ.LIZIZ, c1161330gKJ.LIZJ, c1161330gKJ.LIZLLL, c1161330gKJ.LJ, c1161330gKJ.LJFF, c1161330gKJ.LJI, c1161330gKJ.LJII, c1161330gKJ.LJIIIIZZ, 11);
                    }
                    Context context = getContext();
                    if (context != null && C960203pA.LIZIZ(context)) {
                        i = c1161100gJwLIZ.LJIIJJI;
                    } else {
                        i = c1161100gJwLIZ.LJIIJ;
                    }
                    if (i != 0 && (i & (-16777216)) == 0) {
                        i |= -16777216;
                    }
                    int i4 = C1160570gJ5.LIZIZ[c1161100gJwLIZ.LIZJ.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                            Integer numValueOf = Integer.valueOf(c1161100gJwLIZ.LJFF);
                            c1546210qL5.getClass();
                            c21685719tv = new C21686019ty(C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf)), c1161100gJwLIZ.LIZIZ - c1161100gJwLIZ.LIZ);
                            c21685719tv.LIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJI)));
                            c21685719tv.LIZJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJII)));
                            c21685719tv.LIZLLL = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIIZZ)));
                            c21685719tv.LJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIZ)));
                            c21685719tv.LJIIIZ = i;
                        } else {
                            int i5 = c1161100gJwLIZ.LJ;
                            int i6 = c1161100gJwLIZ.LIZIZ - c1161100gJwLIZ.LIZ;
                            C1546210qL5 c1546210qL52 = C1546210qL5.LIZ;
                            Integer numValueOf2 = Integer.valueOf(c1161100gJwLIZ.LJFF);
                            c1546210qL52.getClass();
                            c21685719tv = new C21685819tw(i5, i6, C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf2)));
                            c21685719tv.LIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJI)));
                            c21685719tv.LIZJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJII)));
                            c21685719tv.LIZLLL = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIIZZ)));
                            c21685719tv.LJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIZ)));
                            c21685719tv.LJIIIZ = i;
                            c21685719tv.LJIIL = false;
                        }
                    } else {
                        int i7 = c1161100gJwLIZ.LJ;
                        C1546210qL5 c1546210qL53 = C1546210qL5.LIZ;
                        Integer numValueOf3 = Integer.valueOf(c1161100gJwLIZ.LJFF);
                        c1546210qL53.getClass();
                        c21685719tv = new C21685719tv(i7, C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf3)));
                        c21685719tv.LJI = c1161100gJwLIZ.LIZIZ - c1161100gJwLIZ.LIZ;
                        c21685719tv.LIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJI)));
                        c21685719tv.LIZJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJII)));
                        c21685719tv.LIZLLL = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIIZZ)));
                        c21685719tv.LJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf(c1161100gJwLIZ.LJIIIZ)));
                        c21685719tv.LJIIIZ = i;
                        int i8 = c1161100gJwLIZ.LIZ;
                        if (!list2.isEmpty()) {
                            Iterator<C443120HZe<Integer, Integer, int[]>> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C443120HZe<Integer, Integer, int[]> next = it2.next();
                                int iIntValue = next.getFirst().intValue();
                                int iIntValue2 = next.getSecond().intValue();
                                int[] third = next.getThird();
                                if (iIntValue2 == c21685719tv.LJIIJJI && iIntValue == i8) {
                                    c21685719tv.LJIJJLI.LIZ = third;
                                    new C1043010dFT();
                                    C1043010dFT.LIZIZ("RavenFragment", new AwS142S0201000_18(i8, (C21685719tv) c21685719tv, third, 4));
                                    break;
                                }
                            }
                        }
                    }
                    ?? r0 = this.LLJILJIL;
                    if (r0 != 0) {
                        r0.LJFF(c21685719tv);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS546S0100000_2((RavenFragment) this, 52));
        }
    }

    public final void NR(List<C1161140gK0> list, ViewGroup viewGroup, InterfaceC1161370gKN interfaceC1161370gKN) {
        InterfaceC1161470gKX interfaceC1161470gKX;
        C19719912Dl c19719912DlLIZLLL;
        int iLIZIZ;
        String string;
        List<C1161140gK0> listLIZ = interfaceC1161370gKN.LIZ(list);
        int i = 0;
        for (C1161140gK0 c1161140gK0 : listLIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                C1161140gK0 c1161140gK02 = c1161140gK0;
                C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(HS());
                if (c1161200gK6LIZ != null) {
                    InterfaceC1161120gJy interfaceC1161120gJy = c1161200gK6LIZ.LIZIZ.get(c1161140gK02.LIZIZ);
                    if ((interfaceC1161120gJy instanceof InterfaceC1161470gKX) && (interfaceC1161470gKX = (InterfaceC1161470gKX) interfaceC1161120gJy) != null && (c19719912DlLIZLLL = interfaceC1161470gKX.LIZLLL()) != null) {
                        String str = c1161140gK02.LIZ;
                        View childAt = viewGroup.getChildAt(i);
                        if ((childAt instanceof FrameLayout) && childAt != null) {
                            iLIZIZ = childAt.getId();
                        } else {
                            iLIZIZ = interfaceC1161370gKN.LIZIZ(viewGroup, c19719912DlLIZLLL);
                        }
                        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(iLIZIZ);
                        CharSequence contentDescription = frameLayout.getContentDescription();
                        if (contentDescription != null) {
                            string = contentDescription.toString();
                        } else {
                            string = null;
                        }
                        if (!Intrinsics.LJFF(frameLayout.getTag(), c19719912DlLIZLLL) || !Intrinsics.LJFF(string, str)) {
                            YS(frameLayout);
                            frameLayout.setTag(c19719912DlLIZLLL);
                            frameLayout.setContentDescription(str);
                            if (UISlotAssem.class.isAssignableFrom(C09R7.LIZ(c19719912DlLIZLLL))) {
                                C723850SaN.LIZ(this, false, null, new AwS17S1201000_2((RavenFragment) this, (RavenFragment<Object>) c19719912DlLIZLLL, (C13IQ<? extends UIAssem>) iLIZIZ, (int) str, (String) 0), 3);
                            } else if (UIContentAssem.class.isAssignableFrom(C09R7.LIZ(c19719912DlLIZLLL))) {
                                C723850SaN.LIZ(this, false, null, new C1161704gZ(this, c19719912DlLIZLLL, viewGroup, iLIZIZ, str), 3);
                            }
                        }
                        interfaceC1161370gKN.LIZJ(viewGroup, frameLayout, c1161140gK02);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        interfaceC1161370gKN.LIZLLL(listLIZ.size(), viewGroup);
    }

    @Override // X.InterfaceC1161620gKm
    public final <T> void Ts(String str, LifecycleOwner lifecycleOwner, Observer<T> observer) {
        C1161250gKB c1161250gKBVQ2 = PS().vQ2();
        c1161250gKBVQ2.LIZ(str);
        MutableLiveData<C1161140gK0> mutableLiveData = c1161250gKBVQ2.LIZ.get(str);
        if (mutableLiveData != null) {
            C0TIA.LIZ(mutableLiveData).observe(lifecycleOwner, new AObserverS222S0100000_18((AObserverS222S0100000_18) observer, 25));
        }
    }

    public final void iS(final int i, final int i2, final String str) {
        final AbstractC21673619ry adapter;
        if (!this.LLLFF) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 24));
            return;
        }
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null && (adapter = c18z8.getAdapter()) != null) {
            this.LLLFFI = false;
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0gJ0
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    LJII("onChanged");
                }

                public final void LJII(String str2) {
                    try {
                        adapter.unregisterAdapterDataObserver(this);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    RavenFragment<Object> ravenFragment = this;
                    ravenFragment.LLLFFI = true;
                    new C1043010dFT();
                    C1043010dFT.LIZIZ("RavenFragment", new C1160510gIz(i, i2, ravenFragment, str, str2));
                    this.AT(str + ' ' + str2, null);
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i3, int i4) {
                    new C1043010dFT();
                    C1043010dFT.LIZIZ("RavenFragment", new AwS0S1104000_18(str, i3, i4, i, i2, this, 0));
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i3, int i4) {
                    int i5;
                    if (i4 > 0 && i3 <= (i5 = i) && i3 + i4 >= i5 + i2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onItemRangeInserted(");
                        sbLIZ.append(i3);
                        sbLIZ.append(',');
                        sbLIZ.append(i4);
                        sbLIZ.append(')');
                        LJII(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    new C1043010dFT();
                    C1043010dFT.LIZIZ("RavenFragment", new AwS0S1104000_18(str, i3, i4, i, i2, this, 1));
                }
            });
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS5S1102000_18(str, (String) i, i2, (int) this, 2));
            return;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 25));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NT(false);
        FS().LIZIZ();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ekf, viewGroup, false);
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

    @Override // X.InterfaceC1161620gKm
    public final void qv(String str, LifecycleOwner lifecycleOwner, Observer<C1161140gK0> observer) {
        C1161250gKB c1161250gKBVQ2 = PS().vQ2();
        c1161250gKBVQ2.LIZ(str);
        MutableLiveData<C1161140gK0> mutableLiveData = c1161250gKBVQ2.LIZ.get(str);
        if (mutableLiveData != null) {
            C0TIA.LIZ(mutableLiveData).observe(lifecycleOwner, new AObserverS222S0100000_18((AObserverS222S0100000_18) observer, 24));
        }
    }

    public final void rS(String str, boolean z, boolean z2) {
        hS();
        this.LLL = false;
        this.LLLFZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" supplement");
        boolean zZT = zT(C2188811AlT.LIZIZ(sbLIZ));
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1166504hL(str, zZT, z, z2, this));
        if (!z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" insert supplement complete");
            uT(C2188811AlT.LIZIZ(sbLIZ2), true);
        } else {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2(this, str, 6));
        }
        if (!z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(" insert supplement complete");
            hT(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public static final <CONTEXT> void CT(C18Z8 c18z8, String str, RavenFragment<CONTEXT> ravenFragment, String str2) {
        View view;
        RecyclerView.LayoutManager layoutManager = c18z8.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).LJJIIZ();
        }
        c18z8.requestLayout();
        Object parent = c18z8.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.requestLayout();
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1160440gIs(str, str2, layoutManager, c18z8, ravenFragment));
    }

    public final void qS(int i, int i2, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<InterfaceC1891350zJl> listLJII;
        C20600815jK<InterfaceC1891350zJl> state;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1160500gIy(str, i, i2, list, this));
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            listLJII = state.LJII();
        } else {
            listLJII = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJL = false;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c317290CcB.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(c13bv);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn.resumeWith(c316640Cb8);
            hS();
            DT();
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new C020Q(str, (String) listLJII, (List<? extends InterfaceC1891350zJl>) 11));
            return;
        }
        hS();
        this.LLL = false;
        this.LLLFZ = false;
        if (LJIIJJI()) {
            if (this.LLJL) {
                this.LLJJLIIIJLLLLLLLZ = true;
            } else {
                this.LLJJLIIIJLLLLLLLZ = false;
            }
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Integer.valueOf(i2), list, 1);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS5S1102000_18(str, (String) i, i2, (int) list, (List<? extends InterfaceC1891350zJl>) 3));
        } else {
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJL = false;
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb82 = new C316640Cb8(list);
            C189200o6.m2constructorimpl(c316640Cb82);
            interfaceC1364105Vn.resumeWith(c316640Cb82);
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS5S1102000_18(str, (String) i, i2, (int) list, (List<? extends InterfaceC1891350zJl>) 4));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishFirstFetchSupplement ");
        sbLIZ.append(str);
        uT(C2188811AlT.LIZIZ(sbLIZ), true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finishFirstFetchSupplement ");
        sbLIZ2.append(str);
        hT(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
