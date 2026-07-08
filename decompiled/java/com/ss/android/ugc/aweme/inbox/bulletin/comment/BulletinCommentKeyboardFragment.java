package com.ss.android.ugc.aweme.inbox.bulletin.comment;

import X.C098200Yq;
import X.C0OJU;
import X.C0OTL;
import X.C0OZB;
import X.C0QSJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import X.InterfaceC622800Obm;
import X.InterfaceC687730QyJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentKeyboardFragment extends AbsFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSM2PCwiZyHELIOSw8JSgpJzt9CjAgJSonISsPJiI+LSs4AioqKiotOysVOiQrJCo9PA==";
    public C0OTL LL;
    public InterfaceC622800Obm LLILLJJLI;
    public InterfaceC617290OJb LLILLL;
    public C0OJU LLILZ;
    public C0OZB LLILZIL;
    public InterfaceC617160OIo LLILZLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LL = (C0OTL) obj;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLILLJJLI = (InterfaceC622800Obm) obj;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLILLL = (InterfaceC617290OJb) obj;
        } else if (cls == C0OJU.class) {
            this.LLILZ = (C0OJU) obj;
        } else if (cls == C0OZB.class) {
            this.LLILZIL = (C0OZB) obj;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLILZLL = (InterfaceC617160OIo) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C0OTL.class) {
            return this.LL;
        }
        if (cls == InterfaceC622800Obm.class) {
            return this.LLILLJJLI;
        }
        if (cls == InterfaceC617290OJb.class) {
            return this.LLILLL;
        }
        if (cls == C0OJU.class) {
            return this.LLILZ;
        }
        if (cls == C0OZB.class) {
            return this.LLILZIL;
        }
        if (cls == InterfaceC617160OIo.class) {
            return this.LLILZLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LL = null;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLILLJJLI = null;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLILLL = null;
        } else if (cls == C0OJU.class) {
            this.LLILZ = null;
        } else if (cls == C0OZB.class) {
            this.LLILZIL = null;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLILZLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 164), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a6g, viewGroup, false);
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
