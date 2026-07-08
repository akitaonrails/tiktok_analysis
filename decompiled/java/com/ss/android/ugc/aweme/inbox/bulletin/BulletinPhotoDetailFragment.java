package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C098200Yq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1360720lVu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2471909mP;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import Y.ACListenerS155S0100000_21;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC836760Ws6
public final class BulletinPhotoDetailFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSHELIOSM2PCwiZw0mJCkpPSY9GC0jPSAXLTEtICMVOiQrJCo9PA==";
    public LinearLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public SmartImageView LLJ;
    public LinearLayout LLJI;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        activityConfiguration(AFwS259S0000000_21.get$arr$(166));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1360720lVu.LIZ(activity);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        Serializable serializable;
        UrlModel urlModel;
        C1331670kl3 c1331670kl3LJIIIIZZ;
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_local");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("is_creator");
        } else {
            z2 = false;
        }
        View viewFindViewById = null;
        if (z2) {
            View viewFindViewById2 = this.LLIZ;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.d5q);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZ = (LinearLayout) viewFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById2);
            View viewFindViewById3 = this.LLIZLLLIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.d1d);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLIZLLLIL = (TuxTextView) viewFindViewById3;
            }
            TextView textView = (TextView) viewFindViewById3;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string2 = arguments3.getString("view_count");
            } else {
                string2 = null;
            }
            textView.setText(string2);
        } else {
            View viewFindViewById4 = this.LLIZ;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.d5q);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLIZ = (LinearLayout) viewFindViewById4;
            }
            C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById4);
        }
        if (z) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string = arguments4.getString("image_path");
            } else {
                string = null;
            }
            c1331670kl3LJIIIIZZ = C1331660kl2.LJI(C2471909mP.LJIILIIL(string));
        } else {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                serializable = arguments5.getSerializable("image_url");
            } else {
                serializable = null;
            }
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        }
        View viewFindViewById5 = this.LLJ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.d2i);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJ = (SmartImageView) viewFindViewById5;
        }
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) viewFindViewById5);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        View viewFindViewById6 = this.LLJI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.tsc);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJI = (LinearLayout) viewFindViewById6;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById6, new ACListenerS155S0100000_21(this, 76));
        View view7 = this.LLJ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.d2i);
            }
            this.LLJ = (SmartImageView) viewFindViewById;
            view7 = viewFindViewById;
        }
        C786410Ut5.Q8((SmartImageView) view7, new ACListenerS155S0100000_21(this, 77));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a7o, viewGroup, false);
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
