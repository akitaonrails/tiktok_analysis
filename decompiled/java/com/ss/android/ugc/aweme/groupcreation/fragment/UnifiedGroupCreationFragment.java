package com.ss.android.ugc.aweme.groupcreation.fragment;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0I0B;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1228470i4b;
import X.C1228490i4d;
import X.C1228600i4o;
import X.C1228650i4t;
import X.C1228920i5K;
import X.C1228940i5M;
import X.C1228950i5N;
import X.C1229010i5T;
import X.C1233310iCP;
import X.C13LE;
import X.C1528205ya;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16G0;
import X.C16GW;
import X.C16GY;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C21578619ce;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1228990i5R;
import X.EnumC1229060i5Y;
import X.InterfaceC0148002o;
import X.InterfaceC1076400e7K;
import X.InterfaceC1146704e9;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224310hxt;
import X.InterfaceC1224320hxu;
import X.InterfaceC1224360hxy;
import X.InterfaceC1224370hxz;
import X.InterfaceC1224750hyb;
import X.InterfaceC1228980i5Q;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import X.ViewOnTouchListenerC1233300iCO;
import Y.ATListenerS452S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.groupcreation.vm.UnifiedGroupCreationVM;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class UnifiedGroupCreationFragment extends AbsContactSelectorFragment implements InterfaceC21503819Do, InterfaceC724530SbT, InterfaceC1228980i5Q, C0QSJ, InterfaceC1146704e9 {
    public static final C1228600i4o LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiI+JjojKzcpKDs6JytiHELIOSLz0yLygpJzt9HSslLyY2LAI+JjojCzcpKDs6JysKOy40JSAiPQ==";
    public final AssemVMLazy LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public C1228470i4b LLJJIII;
    public boolean LLJJIJI;
    public C1228950i5N LLJJIJIIJIL;
    public C1228940i5M LLJJIJIL;
    public C1233310iCP LLJJJ;
    public C1229010i5T LLJJJIL;
    public InterfaceC1224360hxy LLJJJJ;
    public InterfaceC1076400e7K LLJJJJJIL;
    public InterfaceC1224750hyb LLJJJJLIIL;
    public InterfaceC1224160hxe LLJJL;
    public InterfaceC1224370hxz LLJJLIIIJLLLLLLLZ;
    public InterfaceC1224310hxt LLJL;
    public InterfaceC1224320hxu LLJLIL;
    public InterfaceC1223330hwJ LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0i4o] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UnifiedGroupCreationFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/groupcreation/vm/UnifiedGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLL = new Object() { // from class: X.0i4o
        };
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1224360hxy.class) {
            this.LLJJJJ = (InterfaceC1224360hxy) obj;
        } else if (cls == InterfaceC1076400e7K.class) {
            this.LLJJJJJIL = (InterfaceC1076400e7K) obj;
        } else if (cls == InterfaceC1224750hyb.class) {
            this.LLJJJJLIIL = (InterfaceC1224750hyb) obj;
        } else if (cls == InterfaceC1224160hxe.class) {
            this.LLJJL = (InterfaceC1224160hxe) obj;
        } else if (cls == InterfaceC1224370hxz.class) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC1224370hxz) obj;
        } else if (cls == InterfaceC1224310hxt.class) {
            this.LLJL = (InterfaceC1224310hxt) obj;
        } else if (cls == InterfaceC1224320hxu.class) {
            this.LLJLIL = (InterfaceC1224320hxu) obj;
        } else if (cls == InterfaceC1223330hwJ.class) {
            this.LLJLILLLLZIIL = (InterfaceC1223330hwJ) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1224360hxy.class) {
            return this.LLJJJJ;
        }
        if (cls == InterfaceC1076400e7K.class) {
            return this.LLJJJJJIL;
        }
        if (cls == InterfaceC1224750hyb.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == InterfaceC1224160hxe.class) {
            return this.LLJJL;
        }
        if (cls == InterfaceC1224370hxz.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == InterfaceC1224310hxt.class) {
            return this.LLJL;
        }
        if (cls == InterfaceC1224320hxu.class) {
            return this.LLJLIL;
        }
        if (cls == InterfaceC1223330hwJ.class) {
            return this.LLJLILLLLZIIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1224360hxy.class) {
            this.LLJJJJ = null;
        } else if (cls == InterfaceC1076400e7K.class) {
            this.LLJJJJJIL = null;
        } else if (cls == InterfaceC1224750hyb.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == InterfaceC1224160hxe.class) {
            this.LLJJL = null;
        } else if (cls == InterfaceC1224370hxz.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == InterfaceC1224310hxt.class) {
            this.LLJL = null;
        } else if (cls == InterfaceC1224320hxu.class) {
            this.LLJLIL = null;
        } else if (cls == InterfaceC1223330hwJ.class) {
            this.LLJLILLLLZIIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public UnifiedGroupCreationFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnifiedGroupCreationVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1484);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(171);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1485), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1486), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1487), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
        this.LLJILLL = "";
        this.LLJJ = "";
        this.LLJJIJI = true;
    }

    @Override // X.InterfaceC1228980i5Q
    public final ViewOnTouchListenerC1233300iCO ox() {
        C1233310iCP c1233310iCP = this.LLJJJ;
        if (c1233310iCP != null) {
            return c1233310iCP.LJFF;
        }
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v;
        super.onDestroy();
        C1228940i5M c1228940i5M = this.LLJJIJIL;
        if (c1228940i5M != null && (viewOnLayoutChangeListenerC1265870j2v = c1228940i5M.LIZLLL) != null) {
            c1228940i5M.LIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265870j2v);
            c1228940i5M.LIZLLL = null;
        }
        if (this.LLJJIJI) {
            C1228490i4d c1228490i4d = C1228490i4d.LIZ;
            String str = this.LLJJI;
            c1228490i4d.getClass();
            if (str != null) {
                C1228490i4d.LIZJ.remove(str);
                C1228490i4d.LIZIZ.remove(str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C1228650i4t c1228650i4t;
        super.onActivityCreated(bundle);
        C1228470i4b c1228470i4b = this.LLJJIII;
        if (c1228470i4b != null && (c1228650i4t = c1228470i4b.LIZ) != null && c1228650i4t.LJIIJ) {
            activityConfiguration(AFwS283S0000000_35.get$arr$(45));
        }
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String str;
        C1228650i4t c1228650i4t;
        EnumC1228990i5R enumC1228990i5R;
        String mobValue;
        C1228650i4t c1228650i4t2;
        super.onCreate(bundle);
        NR(AFwS283S0000000_35.get$arr$(46));
        Bundle arguments = getArguments();
        String str2 = "";
        C1228470i4b c1228470i4b = null;
        if ((arguments == null || (string = arguments.getString("param_uuid")) == null) && (bundle == null || (string = bundle.getString("param_uuid")) == null)) {
            string = "";
        }
        this.LLJJI = string;
        Bundle arguments2 = getArguments();
        if ((arguments2 == null || (string2 = arguments2.getString("open_platform_biz_line")) == null) && (bundle == null || (string2 = bundle.getString("open_platform_biz_line")) == null)) {
            string2 = "";
        }
        this.LLJILLL = string2;
        Bundle arguments3 = getArguments();
        if ((arguments3 == null || (string3 = arguments3.getString("open_platform_biz_scene")) == null) && (bundle == null || (string3 = bundle.getString("open_platform_biz_scene")) == null)) {
            string3 = "";
        }
        this.LLJJ = string3;
        C1228490i4d c1228490i4d = C1228490i4d.LIZ;
        String str3 = this.LLJJI;
        c1228490i4d.getClass();
        if (str3 != null) {
            c1228470i4b = (C1228470i4b) ((LinkedHashMap) C1228490i4d.LIZIZ).get(str3);
        }
        this.LLJJIII = c1228470i4b;
        if (c1228470i4b == null || (c1228650i4t2 = c1228470i4b.LIZ) == null || (str = c1228650i4t2.LIZ) == null) {
            str = "";
        }
        if (c1228470i4b != null && (c1228650i4t = c1228470i4b.LIZ) != null && (enumC1228990i5R = c1228650i4t.LJJIJ) != null && (mobValue = enumC1228990i5R.getMobValue()) != null) {
            str2 = mobValue;
        }
        C1528205ya.LIZLLL(str, str2, C0I0B.LJFF.LIZIZ());
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        String value;
        C1228650i4t c1228650i4t;
        EnumC1228990i5R enumC1228990i5R;
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("open_platform_biz_line", this.LLJILLL, bundle);
        C786410Ut5.LJJJI("open_platform_biz_scene", this.LLJJ, bundle);
        C1228470i4b c1228470i4b = this.LLJJIII;
        if (c1228470i4b == null || (c1228650i4t = c1228470i4b.LIZ) == null || (enumC1228990i5R = c1228650i4t.LJJIJ) == null || (value = enumC1228990i5R.getValue()) == null) {
            value = "";
        }
        C786410Ut5.LJJJI("default_category", value, bundle);
        this.LLJJIJI = false;
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1228470i4b c1228470i4b;
        boolean z;
        C16GY c16gy;
        C1228650i4t c1228650i4t;
        super.onViewCreated(view, bundle);
        C16GW c16gw = (C16GW) view.findViewById(R.id.unified_app_bar_layout);
        if (c16gw != null) {
            this.LLJJIJIIJIL = new C1228950i5N(c16gw);
        }
        C16G0 c16g0 = (C16G0) view.findViewById(R.id.rve);
        C16GW c16gw2 = (C16GW) view.findViewById(R.id.unified_app_bar_layout);
        View viewFindViewById = view.findViewById(R.id.rv7);
        View viewFindViewById2 = view.findViewById(R.id.unified_private_search_bar);
        if (c16g0 != null && c16gw2 != null && viewFindViewById != null) {
            this.LLJJIJIL = new C1228940i5M(c16g0, c16gw2, viewFindViewById);
        }
        C21578619ce c21578619ce = (C21578619ce) view.findViewById(R.id.sfi);
        if (c21578619ce != null) {
            final C1233310iCP c1233310iCP = new C1233310iCP(this, c21578619ce);
            ViewOnTouchListenerC1233300iCO viewOnTouchListenerC1233300iCO = c1233310iCP.LJFF;
            ATListenerS452S0100000_19 aTListenerS452S0100000_19 = new ATListenerS452S0100000_19(c1233310iCP, 6);
            if (!((ArrayList) viewOnTouchListenerC1233300iCO.LL).contains(aTListenerS452S0100000_19)) {
                ((ArrayList) viewOnTouchListenerC1233300iCO.LL).add(aTListenerS452S0100000_19);
            }
            c21578619ce.setOnTouchListener(c1233310iCP.LJFF);
            c21578619ce.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0i5P
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                    if (i2 > 0) {
                        c1233310iCP.LIZ(false);
                    }
                }
            });
            this.LLJJJ = c1233310iCP;
        }
        C1229010i5T c1229010i5T = new C1229010i5T(view);
        C1228490i4d c1228490i4d = C1228490i4d.LIZ;
        String str = this.LLJJI;
        c1228490i4d.getClass();
        if (str != null) {
            c1228470i4b = (C1228470i4b) ((LinkedHashMap) C1228490i4d.LIZIZ).get(str);
        } else {
            c1228470i4b = null;
        }
        if (c1228470i4b != null && (c1228650i4t = c1228470i4b.LIZ) != null) {
            z = c1228650i4t.LJJIIZI;
        } else {
            z = false;
        }
        c1229010i5T.LJI = z;
        this.LLJJJIL = c1229010i5T;
        ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
        if ((layoutParams instanceof C16GY) && (c16gy = (C16GY) layoutParams) != null) {
            c16gy.LIZ = 0;
            C786410Ut5.W5(viewFindViewById2, c16gy);
        }
        C1228470i4b c1228470i4b2 = this.LLJJIII;
        if (c1228470i4b2 != null) {
            C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, c1228470i4b2, 82), 3);
        }
        String str2 = this.LLJJI;
        if (str2 != null) {
            C1228490i4d.LIZJ.put(str2, new AwS598S0100000_19(this, 564));
        }
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ie
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588006Jq) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 226), 6);
        C1228920i5K.LIZIZ(EnumC1229060i5Y.OPEN_CREATE_GROUP_PANEL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cie, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
