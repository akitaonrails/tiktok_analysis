package com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0QSJ;
import X.C1224290hxr;
import X.C1224440hy6;
import X.C1224860hym;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1076400e7K;
import X.InterfaceC1146704e9;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224270hxp;
import X.InterfaceC1224310hxt;
import X.InterfaceC1224320hxu;
import X.InterfaceC1224360hxy;
import X.InterfaceC1224370hxz;
import X.InterfaceC1224410hy3;
import X.InterfaceC1224420hy4;
import X.InterfaceC1224750hyb;
import X.InterfaceC21503819Do;
import X.InterfaceC344240DeY;
import X.InterfaceC687730QyJ;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class ContactSelectorFragment extends AbsContactSelectorFragment implements InterfaceC21503819Do, InterfaceC344240DeY, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2slJGEwJys4KCwnZjYpJSowHELIOSPCo+ZyY+OCliLz0yLygpJzt9CyoiPS4wPBYpJSowPCo+Dz0yLygpJzs=";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2662));
    public InterfaceC1224360hxy LLJILLL;
    public InterfaceC1076400e7K LLJJ;
    public InterfaceC1224750hyb LLJJI;
    public InterfaceC1224160hxe LLJJIII;
    public InterfaceC1224370hxz LLJJIJI;
    public InterfaceC1224310hxt LLJJIJIIJIL;
    public InterfaceC1224320hxu LLJJIJIL;
    public InterfaceC1223330hwJ LLJJJ;

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
            this.LLJILLL = (InterfaceC1224360hxy) obj;
        } else if (cls == InterfaceC1076400e7K.class) {
            this.LLJJ = (InterfaceC1076400e7K) obj;
        } else if (cls == InterfaceC1224750hyb.class) {
            this.LLJJI = (InterfaceC1224750hyb) obj;
        } else if (cls == InterfaceC1224160hxe.class) {
            this.LLJJIII = (InterfaceC1224160hxe) obj;
        } else if (cls == InterfaceC1224370hxz.class) {
            this.LLJJIJI = (InterfaceC1224370hxz) obj;
        } else if (cls == InterfaceC1224310hxt.class) {
            this.LLJJIJIIJIL = (InterfaceC1224310hxt) obj;
        } else if (cls == InterfaceC1224320hxu.class) {
            this.LLJJIJIL = (InterfaceC1224320hxu) obj;
        } else if (cls == InterfaceC1223330hwJ.class) {
            this.LLJJJ = (InterfaceC1223330hwJ) obj;
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
            return this.LLJILLL;
        }
        if (cls == InterfaceC1076400e7K.class) {
            return this.LLJJ;
        }
        if (cls == InterfaceC1224750hyb.class) {
            return this.LLJJI;
        }
        if (cls == InterfaceC1224160hxe.class) {
            return this.LLJJIII;
        }
        if (cls == InterfaceC1224370hxz.class) {
            return this.LLJJIJI;
        }
        if (cls == InterfaceC1224310hxt.class) {
            return this.LLJJIJIIJIL;
        }
        if (cls == InterfaceC1224320hxu.class) {
            return this.LLJJIJIL;
        }
        if (cls == InterfaceC1223330hwJ.class) {
            return this.LLJJJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
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
            this.LLJILLL = null;
        } else if (cls == InterfaceC1076400e7K.class) {
            this.LLJJ = null;
        } else if (cls == InterfaceC1224750hyb.class) {
            this.LLJJI = null;
        } else if (cls == InterfaceC1224160hxe.class) {
            this.LLJJIII = null;
        } else if (cls == InterfaceC1224370hxz.class) {
            this.LLJJIJI = null;
        } else if (cls == InterfaceC1224310hxt.class) {
            this.LLJJIJIIJIL = null;
        } else if (cls == InterfaceC1224320hxu.class) {
            this.LLJJIJIL = null;
        } else if (cls == InterfaceC1223330hwJ.class) {
            this.LLJJJ = null;
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

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        InterfaceC1224270hxp protocol;
        InterfaceC1224410hy3 interfaceC1224410hy3LJJIII;
        C1224860hym c1224860hymLJJIIZI;
        InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
        if (interfaceC1224420hy4 == null || (protocol = interfaceC1224420hy4.getProtocol()) == null || (interfaceC1224410hy3LJJIII = protocol.LJJIII()) == null || (c1224860hymLJJIIZI = interfaceC1224410hy3LJJIII.LJJIIZI()) == null || !c1224860hymLJJIIZI.LJFF()) {
            return null;
        }
        return interfaceC1224410hy3LJJIII.LJJIIJZLJL();
    }

    public final C1224290hxr UR() {
        return (C1224290hxr) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment
    public final void SR() {
        super.SR();
        if (this.LLIZ != null) {
            C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 504), 3);
        }
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJJJIL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJJIJL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJJIJIIJIL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC1224270hxp protocol;
        C1224440hy6 c1224440hy6LJIILIIL;
        Window window;
        super.onActivityCreated(bundle);
        InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
        if (interfaceC1224420hy4 != null && (protocol = interfaceC1224420hy4.getProtocol()) != null && (c1224440hy6LJIILIIL = protocol.LJIILIIL()) != null && c1224440hy6LJIILIIL.LJIIIZ()) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(48);
            }
            if (c1224440hy6LJIILIIL.LIZIZ()) {
                activityConfiguration(AFwS283S0000000_35.get$arr$(116));
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        InterfaceC1224270hxp protocol;
        C1224440hy6 c1224440hy6LJIILIIL;
        Integer num;
        super.onCreate(bundle);
        InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
        if (interfaceC1224420hy4 != null && (protocol = interfaceC1224420hy4.getProtocol()) != null && (c1224440hy6LJIILIIL = protocol.LJIILIIL()) != null && (num = c1224440hy6LJIILIIL.LJIIJ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.zm;
        }
        NR(new AwS46S0001000_35(iIntValue, 10));
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJFF();
        }
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ;
        InterfaceC1224270hxp protocol;
        C1224440hy6 c1224440hy6LJIILIIL;
        Integer num;
        super.onViewCreated(view, bundle);
        InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
        if (interfaceC1224420hy4 != null && (protocol = interfaceC1224420hy4.getProtocol()) != null && (c1224440hy6LJIILIIL = protocol.LJIILIIL()) != null && (num = c1224440hy6LJIILIIL.LJIIJ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.zm;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        view.setBackgroundColor(iIntValue2);
        C1224290hxr c1224290hxrUR = UR();
        if (c1224290hxrUR != null) {
            c1224290hxrUR.LJJIJIIJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chb, viewGroup, false);
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
