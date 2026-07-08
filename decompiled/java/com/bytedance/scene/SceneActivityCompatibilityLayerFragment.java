package com.bytedance.scene;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119470fEn;
import X.C12WJ;
import X.C12WK;
import X.C12WN;
import X.C12WO;
import X.C12WP;
import X.C19BL;
import X.C2204961BRm;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes30.dex */
public final class SceneActivityCompatibilityLayerFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/Kio9LWsfKio9LQQvPSYlHELIOSITE1CiA+OCQ4IC06JCw4MAMyMSA+Dz0yLygpJzs=";
    public final C1119470fEn<C12WN> LL = new C1119470fEn<>();
    public final C1119470fEn<C12WO> LLILLJJLI = new C1119470fEn<>();
    public final List<C12WK> LLILLL = new ArrayList();
    public final Set<C12WJ> LLILZ = new HashSet();

    public final boolean LIZIZ(LifecycleOwner lifecycleOwner) {
        C12WP.LIZ();
        if (!C19BL.LJ(getActivity()) || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return false;
        }
        return true;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator it2 = new HashSet(this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((C12WJ) it2.next()).LIZ();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.LLILLL);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12WK c12wk = (C12WK) ListProtector.get(arrayList, size);
            if (c12wk != null) {
                c12wk.onConfigurationChanged(configuration);
            }
        }
    }

    public final void LIZ(final LifecycleOwner lifecycleOwner, final C12WK c12wk) {
        if (!LIZIZ(lifecycleOwner)) {
            return;
        }
        ((ArrayList) this.LLILLL).add(c12wk);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.SceneActivityCompatibilityLayerFragment.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                ((ArrayList) SceneActivityCompatibilityLayerFragment.this.LLILLL).remove(c12wk);
            }
        });
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C12WN c12wnLIZLLL = this.LL.LIZLLL(i);
        if (c12wnLIZLLL != null) {
            c12wnLIZLLL.onResult(i2, intent);
            this.LL.LJI(i);
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11052, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
        C12WO c12woLIZLLL = this.LLILLJJLI.LIZLLL(iIntValue);
        if (c12woLIZLLL != null) {
            c12woLIZLLL.LIZ(iArr2);
            this.LLILLJJLI.LJI(iIntValue);
        }
    }

    public final void LIZJ(final LifecycleOwner lifecycleOwner, String[] strArr, final int i, C12WO c12wo) throws Throwable {
        String[] strArr2;
        Fragment fragment;
        int iIntValue;
        if (!LIZIZ(lifecycleOwner)) {
            return;
        }
        this.LLILLJJLI.LJFF(i, c12wo);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {strArr, Integer.valueOf(i)};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102601, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "requestPermissions", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102601, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "requestPermissions", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    strArr2 = (String[]) obj2;
                } else {
                    strArr2 = strArr;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                }
                fragment.requestPermissions(strArr2, iIntValue);
                c0wst.LIZ(102601, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "requestPermissions", null, objArr, fragment, c0wzw, true);
            } else {
                strArr2 = strArr;
                fragment = this;
            }
            iIntValue = i;
            fragment.requestPermissions(strArr2, iIntValue);
            c0wst.LIZ(102601, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "requestPermissions", null, objArr, fragment, c0wzw, true);
        }
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.SceneActivityCompatibilityLayerFragment.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                SceneActivityCompatibilityLayerFragment.this.LLILLJJLI.LJI(i);
            }
        });
    }

    public final void LJ(final LifecycleOwner lifecycleOwner, Intent intent, final int i, C12WN c12wn) throws Throwable {
        Intent intent2;
        Fragment fragment;
        int iIntValue;
        if (!LIZIZ(lifecycleOwner)) {
            return;
        }
        if (i < 0) {
            C2204961BRm.LLLLIILL(this, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null));
            return;
        }
        this.LL.LJFF(i, c12wn);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(i)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                } else {
                    intent2 = intent;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                }
                fragment.startActivityForResult(intent2, iIntValue);
                c0wst.LIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
            } else {
                intent2 = intent;
                fragment = this;
            }
            iIntValue = i;
            fragment.startActivityForResult(intent2, iIntValue);
            c0wst.LIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
        }
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.SceneActivityCompatibilityLayerFragment.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                SceneActivityCompatibilityLayerFragment.this.LL.LJI(i);
            }
        });
    }

    public final void LIZLLL(final LifecycleOwner lifecycleOwner, Intent intent, final int i, Bundle bundle, C12WN c12wn) throws Throwable {
        Bundle bundle2;
        Intent intent2;
        Fragment fragment;
        int iIntValue;
        if (!LIZIZ(lifecycleOwner)) {
            return;
        }
        if (i < 0) {
            C2204961BRm.LLLLIILL(this, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null));
            return;
        }
        this.LL.LJFF(i, c12wn);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1osGTSAPuJI2YoCQdCJpIi+A/pfWQ1r7R3kmWd8nPa05a3Ez9wz3k=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(i), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    fragment = (Fragment) obj;
                } else {
                    fragment = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent2 = (Intent) obj2;
                } else {
                    intent2 = intent;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    iIntValue = ((Integer) obj3).intValue();
                } else {
                    iIntValue = i;
                }
                Object obj4 = c0wsuLIZIZ.LIZJ[3];
                if (obj4 != null) {
                    bundle2 = (Bundle) obj4;
                } else {
                    bundle2 = bundle;
                }
            } else {
                bundle2 = bundle;
                intent2 = intent;
                fragment = this;
                iIntValue = i;
            }
            fragment.startActivityForResult(intent2, iIntValue, bundle2);
            c0wst.LIZ(11085, "com/bytedance/scene/SceneActivityCompatibilityLayerFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
        }
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.SceneActivityCompatibilityLayerFragment.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                SceneActivityCompatibilityLayerFragment.this.LL.LJI(i);
            }
        });
    }
}
