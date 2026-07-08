package com.ss.android.ugc.profile.business.profile.tab;

import X.AbstractC1255880imo;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XIR;
import X.C1255920ims;
import X.C1258020iqG;
import X.C1258400iqs;
import X.C1258410iqt;
import X.C1259360isQ;
import X.C1259780it6;
import X.C1260190itl;
import X.C1260200itm;
import X.C1265790j2n;
import X.C14EU;
import X.C1601110rld;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1720106oR;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C23112093u;
import X.C2344009Gk;
import X.C616540OGe;
import X.C729510SjV;
import X.C737030Svd;
import X.C746350TPl;
import X.C786410Ut5;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS195S1100000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLikesAwemeListFragment extends ProfileBaseAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjHELIOSLyY/LWs4KC19GDcjLyY/LQklIiogCTIpJCofITY4Dz0yLygpJzs=";
    public C1258020iqG LLLF;
    public View LLLFF;
    public boolean LLLFFI;

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment
    public final void HS() {
        View view;
        super.HS();
        if (C1258400iqs.LIZ()) {
            return;
        }
        C1259360isQ c1259360isQ = this.LLJJL;
        if (c1259360isQ == null || c1259360isQ.getBasicItemCount() != 0) {
            if (!C1258410iqt.LIZLLL(this.LLJILLL, this.LLJJI) || (view = this.LLLFF) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, X.InterfaceC1212360hec
    public final void Ng1() {
        super.Ng1();
        C1260190itl.LIZ.getClass();
        C1260190itl.LIZ(null, true);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLLFFI = false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Aweme aweme;
        AbstractC1255880imo abstractC1255880imo;
        List items;
        C1259360isQ c1259360isQ;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ProfileLikesAwemeListFragment.class.getName());
        }
        super.onResume();
        if (this.LLLFFI) {
            int iLLLJL = (!C1258400iqs.LIZ() || (c1259360isQ = this.LLJJL) == null) ? 0 : c1259360isQ.LLLJL();
            C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
            Iterator it2 = null;
            if (c1255920ims != null && (abstractC1255880imo = (AbstractC1255880imo) c1255920ims.LL) != null && (items = abstractC1255880imo.getItems()) != null) {
                it2 = items.iterator();
            }
            while (it2 != null && it2.hasNext()) {
                Object next = it2.next();
                if ((next instanceof Aweme) && (aweme = (Aweme) next) != null && aweme.isLike()) {
                    iLLLJL++;
                } else {
                    it2.remove();
                    C1259360isQ c1259360isQ2 = this.LLJJL;
                    if (c1259360isQ2 != null) {
                        c1259360isQ2.notifyItemRemoved(iLLLJL);
                    }
                }
            }
            C1259360isQ c1259360isQ3 = this.LLJJL;
            if (c1259360isQ3 != null && c1259360isQ3.getBasicItemCount() == 0) {
                RS(false);
            }
            this.LLLFFI = false;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment
    public final void RS(boolean z) {
        View view;
        super.RS(z);
        if (!C1258400iqs.LIZ() && (view = this.LLLFF) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C1258020iqG c1258020iqG;
        super.Uq2(exc);
        if (getContext() == null) {
            return;
        }
        C1260190itl.LIZ.getClass();
        C1260190itl.LIZ(null, false);
        if (!this.LLJJI && (exc instanceof C0XIR) && ((C23112093u) exc).getErrorCode() == 7) {
            C1259360isQ c1259360isQ = this.LLJJL;
            if (c1259360isQ != null) {
                c1259360isQ.clearData();
            }
            RS(true);
            if (!this.LLJJI && (c1258020iqG = this.LLLF) != null) {
                c1258020iqG.LIZ(true);
            }
            this.LLJJIJI = false;
            return;
        }
        if (!NS()) {
            HS();
        } else {
            US();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment
    public final boolean XS(String str) {
        boolean zXS = super.XS(str);
        C1260190itl.LIZ.getClass();
        C1260200itm c1260200itm = C1260190itl.LIZIZ;
        if (c1260200itm != null) {
            C1260190itl.LIZIZ = C1260200itm.LIZ(c1260200itm, System.currentTimeMillis(), 0L, false, null, 61);
        }
        return zXS;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C1259360isQ c1259360isQ;
        super.onConfigurationChanged(configuration);
        if (C1258400iqs.LIZ() && (c1259360isQ = this.LLJJL) != null) {
            c1259360isQ.spanSizeLookup = new C1265790j2n(this, 1);
        }
    }

    @C14EU(sticky = true)
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        C1259360isQ c1259360isQ;
        boolean z;
        List list;
        int i;
        List<T> list2;
        C1259360isQ c1259360isQ2;
        List items;
        Object obj;
        List items2;
        C1259780it6 c1259780it6;
        String aid;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoEvent: type=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" isMyProfile=");
        sbLIZ.append(this.LLJJI);
        C1720106oR.LJI("ProfileLikeTab", C2188811AlT.LIZIZ(sbLIZ));
        if (!isViewValid()) {
            return;
        }
        int i3 = c737030Svd.LIZ;
        List list3 = null;
        int iLLLJL = 0;
        if (i3 != 2) {
            if (i3 == 13 && this.LLJJI) {
                String str2 = (String) c737030Svd.LIZIZ;
                Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str2);
                if ((awemeLLILZ != null || (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).tr(this.LLJILLL, str2)) != null) && awemeLLILZ.getAwemeType() != 13) {
                    if (C729510SjV.LJJ(awemeLLILZ)) {
                        if (!C1601110rld.LIZ()) {
                            awemeLLILZ = C729510SjV.LIZIZ(awemeLLILZ);
                        } else {
                            return;
                        }
                    }
                    C1255920ims<AbstractC1255880imo<?, ?>> c1255920ims = this.LLJLIL;
                    if (c1255920ims != null) {
                        if (awemeLLILZ.getUserDigg() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String aid2 = awemeLLILZ.getAid();
                        C1259360isQ c1259360isQ3 = this.LLJJL;
                        if (c1259360isQ3 != null) {
                            list = c1259360isQ3.mmItems;
                        } else {
                            list = null;
                        }
                        if (aid2 != null && list != null) {
                            i = 0;
                            for (Object obj2 : list) {
                                int i4 = i + 1;
                                if (i >= 0) {
                                    Aweme aweme = (Aweme) obj2;
                                    if (aweme != null) {
                                        aid = aweme.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (TextUtils.equals(aid2, aid)) {
                                        break;
                                    } else {
                                        i = i4;
                                    }
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            i = -1;
                        } else {
                            i = -1;
                        }
                        if (z) {
                            if (i < 0) {
                                int i5 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleVideoEventDigg: insert: ");
                                sbLIZ2.append(str2);
                                C1720106oR.LJI("ProfileLikeTab", C2188811AlT.LIZIZ(sbLIZ2));
                                c1255920ims.LJIJ(awemeLLILZ, 0);
                                AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) c1255920ims.LL;
                                if (abstractC1255880imo != null) {
                                    items = abstractC1255880imo.getItems();
                                } else {
                                    items = null;
                                }
                                C1259360isQ c1259360isQ4 = this.LLJJL;
                                if (c1259360isQ4 != null) {
                                    obj = c1259360isQ4.mmItems;
                                } else {
                                    obj = null;
                                }
                                if (Intrinsics.LJFF(items, obj)) {
                                    C1259360isQ c1259360isQ5 = this.LLJJL;
                                    if (c1259360isQ5 != null) {
                                        c1259360isQ5.notifyItemInserted(0);
                                    }
                                } else {
                                    C1259360isQ c1259360isQ6 = this.LLJJL;
                                    if (c1259360isQ6 != null) {
                                        AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) c1255920ims.LL;
                                        if (abstractC1255880imo2 != null) {
                                            items2 = abstractC1255880imo2.getItems();
                                        } else {
                                            items2 = null;
                                        }
                                        if (!C19719512Dh.LJI(items2)) {
                                            items2 = null;
                                        }
                                        c1259360isQ6.setData(items2);
                                    }
                                }
                                HS();
                                RecyclerView recyclerView = this.LLJJJIL;
                                if (recyclerView != null) {
                                    recyclerView.scrollToPosition(0);
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
                                    if ((viewHolderFindViewHolderForAdapterPosition instanceof C1259780it6) && (c1259780it6 = (C1259780it6) viewHolderFindViewHolderForAdapterPosition) != null) {
                                        c1259780it6.a6();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C1259360isQ c1259360isQ7 = this.LLJJL;
                            if (c1259360isQ7 != null && (list2 = c1259360isQ7.mmItems) != 0 && i < list2.size()) {
                                ListProtector.add(list2, 0, ListProtector.remove(list2, i));
                                if (C1258400iqs.LIZ() && (c1259360isQ2 = this.LLJJL) != null) {
                                    iLLLJL = c1259360isQ2.LLLJL();
                                }
                                C1259360isQ c1259360isQ8 = this.LLJJL;
                                if (c1259360isQ8 != null) {
                                    c1259360isQ8.notifyItemMoved(i + iLLLJL, iLLLJL);
                                }
                                RecyclerView recyclerView2 = this.LLJJJIL;
                                if (recyclerView2 != null) {
                                    recyclerView2.scrollToPosition(iLLLJL);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("item changed, scroll to top, awemeIndex=");
                                sbLIZ3.append(i);
                                sbLIZ3.append(" firstIndex=");
                                sbLIZ3.append(iLLLJL);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                return;
                            }
                            return;
                        }
                        if (i >= 0) {
                            if (!isResumed()) {
                                this.LLLFFI = true;
                                return;
                            }
                            int i6 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("handleVideoEventDigg: removed aid: ");
                            sbLIZ4.append(str2);
                            C1720106oR.LJI("ProfileLikeTab", C2188811AlT.LIZIZ(sbLIZ4));
                            String aid3 = awemeLLILZ.getAid();
                            C1259360isQ c1259360isQ9 = this.LLJJL;
                            if (c1259360isQ9 != null) {
                                list3 = c1259360isQ9.mmItems;
                            }
                            C1258410iqt.LIZ(aid3, list3, new AwS455S0200000_19((C1255920ims) c1255920ims, (C1255920ims<AbstractC1255880imo<?, ?>>) this, (ProfileLikesAwemeListFragment) 51));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJJI) {
            Object obj3 = c737030Svd.LIZIZ;
            if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                C1259360isQ c1259360isQ10 = this.LLJJL;
                if (c1259360isQ10 != null) {
                    list3 = c1259360isQ10.mmItems;
                }
                if (!C1258410iqt.LIZ(str, list3, new AwS195S1100000_19(str, this, 6)) && (c1259360isQ = this.LLJJL) != null) {
                    c1259360isQ.notifyDataSetChanged();
                }
                if (NS()) {
                    RS(false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        boolean zLIZLLL;
        C1259360isQ c1259360isQ;
        Integer numLIZ;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/profile/tab/ProfileLikesAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkXRrvOc0FoKqi4uiUXX+8jkir2J5dJ9hwHgaZ4Ah9FVCo=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LLJ) {
                RS(false);
            } else {
                if (C1258400iqs.LIZ()) {
                    zLIZLLL = C1258410iqt.LIZLLL(this.LLJILLL, this.LLJJI);
                } else {
                    View view = this.LLLFF;
                    if (view != null && view.getVisibility() == 0) {
                        zLIZLLL = true;
                    } else {
                        zLIZLLL = false;
                    }
                }
                if (this.LLJJI && (zLIZLLL || ((c1259360isQ = this.LLJJL) != null && c1259360isQ.getBasicItemCount() == 0 && ((numLIZ = C746350TPl.LIZ.LJIIJJI().LIZ()) == null || numLIZ.intValue() != 0)))) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "personal_favourite_page");
                    C20684815ws.LJIILLIIL("show_privacy_setting_entrance_button", c2344009Gk.LIZ);
                }
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(ProfileLikesAwemeListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        long size;
        C1258020iqG c1258020iqG;
        super.LLJJJIL(list, z);
        if (!JS()) {
            boolean z2 = this.LLILZLL;
            if (!this.LLJJI && (c1258020iqG = this.LLLF) != null) {
                c1258020iqG.LIZ(z2);
            }
        }
        C1260190itl c1260190itl = C1260190itl.LIZ;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        Long lValueOf = Long.valueOf(size);
        c1260190itl.getClass();
        C1260190itl.LIZ(lValueOf, true);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1259360isQ c1259360isQ;
        super.onViewCreated(view, bundle);
        if (C1258400iqs.LIZ() && (c1259360isQ = this.LLJJL) != null) {
            c1259360isQ.spanSizeLookup = new C1265790j2n(this, 1);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.LLLFF = C1258410iqt.LIZJ(this.LLJILLL, viewOnCreateView, this.LLJJI);
        try {
            ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
            viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewOnCreateView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewOnCreateView;
        }
    }
}
