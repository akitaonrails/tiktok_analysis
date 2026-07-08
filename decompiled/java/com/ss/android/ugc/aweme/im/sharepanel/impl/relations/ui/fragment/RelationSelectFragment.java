package com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment;

import X.AbstractC1368060lhk;
import X.AbstractC1368180lhw;
import X.C06W7;
import X.C098200Yq;
import X.C09EF;
import X.C0IA9;
import X.C0IAD;
import X.C1214160hhW;
import X.C1214170hhX;
import X.C1367680lh8;
import X.C1367990lhd;
import X.C1370970lmR;
import X.C1381810m3v;
import X.C1383370m6R;
import X.C1402120mag;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C214824195i;
import X.C2187451AjH;
import X.C616540OGe;
import X.C786410Ut5;
import X.C838600Wv4;
import X.ViewOnTouchListenerC1367610lh1;
import Y.ACListenerS124S0200000_21;
import Y.AObserverS183S0200000_21;
import Y.AObserverS224S0100000_21;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.viewmodel.RelationViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class RelationSelectFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGs+HELIOSLCMyPCwjJzx9PSxiLz0yLygpJzt9GiAgKDs6JysfLCM2KzEKOy40JSAiPQ==";
    public View LL;
    public ViewOnTouchListenerC1367610lh1 LLILLJJLI;
    public SharePackage LLILLL;
    public boolean LLILZ;
    public LinkedHashSet<IMContact> LLILZIL;
    public boolean LLILZLL;
    public BaseContent LLIZ;
    public Map<String, String> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI = true;
    public String LLJIJIL = "";
    public int LLJILJIL = -1;
    public boolean LLJILJILJ;
    public RelationViewModel LLJILLL;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1402120mag c1402120mag;
        EditText editText;
        super.onDestroy();
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LLILLJJLI;
        if (viewOnTouchListenerC1367610lh1 != null && (c1402120mag = viewOnTouchListenerC1367610lh1.LLJILJIL) != null && (editText = viewOnTouchListenerC1367610lh1.LLIZ) != null) {
            editText.removeTextChangedListener(c1402120mag);
        }
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh12 = this.LLILLJJLI;
        if (viewOnTouchListenerC1367610lh12 != null) {
            viewOnTouchListenerC1367610lh12.LLJJIJI = null;
        }
        RelationViewModel relationViewModel = this.LLJILLL;
        if (relationViewModel != null) {
            AbstractC1368180lhw abstractC1368180lhw = relationViewModel.LL;
            abstractC1368180lhw.LLILLJJLI = null;
            abstractC1368180lhw.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC1368060lhk abstractC1368060lhk;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(RelationSelectFragment.class.getName());
        }
        super.onResume();
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LLILLJJLI;
        if (viewOnTouchListenerC1367610lh1 != null && (abstractC1368060lhk = viewOnTouchListenerC1367610lh1.LLJILJILJ) != null) {
            abstractC1368060lhk.notifyDataSetChanged();
        }
        RelationViewModel relationViewModel = this.LLJILLL;
        if (relationViewModel != null) {
            List<IMContact> listData = relationViewModel.LL.data();
            relationViewModel.LLILLJJLI.setValue(new C0IAD(listData));
            if (!((ArrayList) listData).isEmpty()) {
                relationViewModel.r61(C19719512Dh.LIZIZ(listData), relationViewModel.LL.LJIIJJI());
            } else {
                relationViewModel.LL.LIZLLL();
            }
        }
    }

    public final void LJJZZIII(String str) {
        RelationViewModel relationViewModel = this.LLJILLL;
        if (relationViewModel != null) {
            if (str.length() == 0) {
                relationViewModel.LLILLJJLI.setValue(new C0IA9(relationViewModel.LL.data()));
                return;
            }
            AbstractC1368180lhw abstractC1368180lhw = relationViewModel.LL;
            str.toString();
            abstractC1368180lhw.LJJZZIII(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SharePackage sharePackage = (SharePackage) arguments.getParcelable("share_package");
            this.LLILLL = sharePackage;
            if (sharePackage != null) {
                this.LLJIJIL = sharePackage.extras.getString("author_user_name", "");
                this.LLJILJIL = this.LLILLL.extras.getInt("share_im_limit_tip_type", -1);
            }
            this.LLIZ = (BaseContent) arguments.getSerializable("share_content");
            this.LLIZLLLIL = (Map) GsonProtectorUtils.fromJson(C09EF.LIZ, arguments.getString("share_ext_map"), new TypeToken<Map<String, ? extends String>>() { // from class: X.04Xw
            }.getType());
            this.LLILZ = arguments.getBoolean("key_relation_list_use_sort", false);
            this.LLILZLL = arguments.getBoolean("extra_no_title");
            this.LLILZIL = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
            this.LLJI = arguments.getBoolean("key_include_group_chat", true);
            this.LLJILJILJ = arguments.getBoolean("show_bulletin_board_entrance_in_inbox", false);
        }
        final boolean zLIZIZ = C838600Wv4.LIZIZ();
        this.LLJ = zLIZIZ;
        final SharePackage sharePackage2 = this.LLILLL;
        final boolean z = this.LLILZ;
        final boolean z2 = this.LLJI;
        RelationViewModel relationViewModel = (RelationViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory(sharePackage2, z, zLIZIZ, z2) { // from class: X.0lhG
            public final SharePackage LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                int i;
                AbstractC1368180lhw c1381910m45;
                SharePackage sharePackage3 = this.LIZ;
                boolean z3 = this.LIZIZ;
                boolean z4 = this.LIZJ;
                boolean zEquals = false;
                if (sharePackage3 != null) {
                    i = 2;
                } else {
                    i = 0;
                }
                if (sharePackage3 != null) {
                    zEquals = TextUtils.equals(sharePackage3.extras.getString("is_friend_private"), "true");
                }
                C1368260li4 c1368260li4 = new C1368260li4(i, zEquals);
                c1368260li4.LJIIJ = z4;
                c1368260li4.LJIIL = !z4;
                if (sharePackage3 != null) {
                    c1368260li4.LJI = true;
                }
                if (z3) {
                    c1381910m45 = new C1381810m3v(c1368260li4);
                } else {
                    c1381910m45 = new C1381910m45(c1368260li4);
                }
                return new RelationViewModel(c1381910m45);
            }

            {
                this.LIZ = sharePackage2;
                this.LIZIZ = zLIZIZ;
                this.LIZJ = z2;
            }
        }).get(RelationViewModel.class);
        this.LLJILLL = relationViewModel;
        if (relationViewModel != null) {
            AbstractC1368180lhw abstractC1368180lhw = relationViewModel.LL;
            abstractC1368180lhw.LLILLJJLI = relationViewModel;
            abstractC1368180lhw.LLJIJIL = relationViewModel;
            relationViewModel.LLILLJJLI.observe(this, new AObserverS183S0200000_21(this, relationViewModel, 7));
            relationViewModel.LLILLL.observe(this, new AObserverS224S0100000_21(this, 60));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        ViewGroup viewGroup;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        String string2;
        Bundle bundle5;
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1;
        List<Integer> listLJIIL;
        List<String> listLJIILIIL;
        super.onViewCreated(view, bundle);
        View view3 = this.LL;
        C1214160hhW c1214160hhWLJIIIIZZ = null;
        if (C06W7.LIZIZ(getActivity()) && view3 != null) {
            if (this.LLJ) {
                C19EG activity = getActivity();
                boolean z = this.LLILZLL;
                RelationViewModel relationViewModel = this.LLJILLL;
                if (relationViewModel != null) {
                    AbstractC1368180lhw abstractC1368180lhw = relationViewModel.LL;
                    if (abstractC1368180lhw instanceof C1381810m3v) {
                        listLJIIL = ((C1381810m3v) abstractC1368180lhw).LJIIL();
                    } else {
                        listLJIIL = null;
                    }
                } else {
                    listLJIIL = null;
                }
                RelationViewModel relationViewModel2 = this.LLJILLL;
                if (relationViewModel2 != null) {
                    AbstractC1368180lhw abstractC1368180lhw2 = relationViewModel2.LL;
                    if (abstractC1368180lhw2 instanceof C1381810m3v) {
                        listLJIILIIL = ((C1381810m3v) abstractC1368180lhw2).LJIILIIL();
                    } else {
                        listLJIILIIL = null;
                    }
                } else {
                    listLJIILIIL = null;
                }
                viewOnTouchListenerC1367610lh1 = new C1367680lh8(activity, view3, z, listLJIIL, listLJIILIIL);
            } else {
                viewOnTouchListenerC1367610lh1 = new ViewOnTouchListenerC1367610lh1(getActivity(), view3, this.LLILZLL);
            }
            this.LLILLJJLI = viewOnTouchListenerC1367610lh1;
        }
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh12 = this.LLILLJJLI;
        if (viewOnTouchListenerC1367610lh12 != null) {
            viewOnTouchListenerC1367610lh12.LLJJIJI = this;
        }
        if (viewOnTouchListenerC1367610lh12 != null) {
            SharePackage sharePackage = this.LLILLL;
            viewOnTouchListenerC1367610lh12.LLILLL = sharePackage;
            if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
                string = bundle5.getString("multi_share_msg");
            } else {
                string = null;
            }
            viewOnTouchListenerC1367610lh12.LLJJI = string;
            SharePackage sharePackage2 = viewOnTouchListenerC1367610lh12.LLILLL;
            String str = "";
            if (sharePackage2 != null && (bundle4 = sharePackage2.extras) != null && (string2 = bundle4.getString("aid", "")) != null) {
                str = string2;
            }
            viewOnTouchListenerC1367610lh12.LLJJIII = str;
            SharePackage sharePackage3 = viewOnTouchListenerC1367610lh12.LLILLL;
            if (sharePackage3 != null && (bundle3 = sharePackage3.extras) != null) {
                bundle3.remove("multi_share_msg");
            }
            SharePackage sharePackage4 = viewOnTouchListenerC1367610lh12.LLILLL;
            if (sharePackage4 != null && (bundle2 = sharePackage4.extras) != null) {
                bundle2.remove("aid");
            }
            if (viewOnTouchListenerC1367610lh12.LLILLL != null) {
                viewOnTouchListenerC1367610lh12.LIZIZ();
            }
            if (viewOnTouchListenerC1367610lh12.LLILLL == null) {
                C1367990lhd c1367990lhd = viewOnTouchListenerC1367610lh12.LLJIJIL;
                if (c1367990lhd != null) {
                    c1367990lhd.setTitle(2131835794);
                    View rightView = c1367990lhd.getRightView();
                    if (rightView != null) {
                        C786410Ut5.LJLLLLLL(8, rightView);
                    }
                    c1367990lhd.setLeftText(2131835677);
                }
            } else {
                C1367990lhd c1367990lhd2 = viewOnTouchListenerC1367610lh12.LLJIJIL;
                if (c1367990lhd2 != null) {
                    c1367990lhd2.setTitle(2131835795);
                    View rightView2 = c1367990lhd2.getRightView();
                    if (rightView2 != null) {
                        C786410Ut5.LJLLLLLL(0, rightView2);
                    }
                }
                viewOnTouchListenerC1367610lh12.LJIIIZ();
            }
        }
        ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh13 = this.LLILLJJLI;
        if (viewOnTouchListenerC1367610lh13 != null) {
            viewOnTouchListenerC1367610lh13.LLILZ = this.LLIZ;
            viewOnTouchListenerC1367610lh13.LLILZIL = this.LLIZLLLIL;
            LinkedHashSet<IMContact> linkedHashSet = this.LLILZIL;
            if (linkedHashSet != null) {
                AbstractC1368060lhk abstractC1368060lhk = viewOnTouchListenerC1367610lh13.LLJILJILJ;
                if (abstractC1368060lhk != null) {
                    abstractC1368060lhk.LLILZLL = linkedHashSet;
                }
                viewOnTouchListenerC1367610lh13.LJIIIIZZ();
                viewOnTouchListenerC1367610lh13.LJIIL();
                AbstractC1368060lhk abstractC1368060lhk2 = viewOnTouchListenerC1367610lh13.LLJILJILJ;
                if (abstractC1368060lhk2 != null) {
                    abstractC1368060lhk2.notifyDataSetChanged();
                }
            }
        }
        if (this.LLJILJIL > 0 && !TextUtils.isEmpty(this.LLJIJIL)) {
            C1214170hhX c1214170hhX = new C1214170hhX(this.LLJIJIL, this.LLJILJIL, 1);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                IInternalShareApi.LIZ.getClass();
                c1214160hhWLJIIIIZZ = C1370970lmR.LIZ().LIZIZ().LJIIIIZZ(activity2, null, null, c1214170hhX, false, false);
            }
            View view4 = this.LL;
            if (view4 != null && (viewGroup = (ViewGroup) view4.findViewById(R.id.uzt)) != null) {
                viewGroup.addView(c1214160hhWLJIIIIZZ);
            }
        }
        if (this.LLJILJILJ && (view2 = this.LL) != null) {
            View viewFindViewById = view2.findViewById(R.id.f6g);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.LJLLLLLL(0, view2.findViewById(R.id.fzj));
            C214824195i c214824195i = C214824195i.LIZIZ;
            boolean zLLILIL = true ^ c214824195i.LLILIL();
            if (zLLILIL) {
                ((TextView) view2.findViewById(R.id.f6e)).setTextColor(C1383370m6R.LJFF(R.attr.a1p));
                ((TuxIconView) view2.findViewById(R.id.f6d)).setTintColorRes(R.attr.a1p);
            }
            C786410Ut5.I7(new ACListenerS124S0200000_21(view2, this, 34), viewFindViewById);
            c214824195i.LLILII("top_entrance", zLLILIL);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (this.LLJ) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.chq, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.chp, viewGroup, false);
        }
        this.LL = viewTd;
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
