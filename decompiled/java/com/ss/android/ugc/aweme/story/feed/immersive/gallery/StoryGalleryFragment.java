package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01GW;
import X.C01T2;
import X.C01T3;
import X.C098200Yq;
import X.C0QSJ;
import X.C14K9;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C739010Syp;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import X.ViewTreeObserverOnGlobalLayoutListenerC738840SyY;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.IStoryGalleryProtocol;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.StoryGalleryActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGalleryFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZiMpLCt9ISHELIOSghLD0gITMpZygyJCkpOzZ9GzEjOzYUKSkgLD0qDjctLiI2JjE=";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 835));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StoryGalleryActivityScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryGalleryActivityScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryGalleryActivityScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C01T3.LIZ != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - C01T3.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report duration=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(", enterFrom:");
            sbLIZ.append(C01T3.LIZIZ);
            sbLIZ.append(", enterMethod: ");
            sbLIZ.append(C01T3.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C23250099c.LIZLLL(C01T3.LIZLLL, null, null, new C01T2(jCurrentTimeMillis, null), 3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS243S0000000_11.get$arr$(451));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY = new ViewTreeObserverOnGlobalLayoutListenerC738840SyY(this, view, 0);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC738840SyY);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC738840SyY, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C739010Syp(view, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, ((IStoryGalleryProtocol) this.LLIZ.getValue()).getLayoutId(), viewGroup, false);
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
