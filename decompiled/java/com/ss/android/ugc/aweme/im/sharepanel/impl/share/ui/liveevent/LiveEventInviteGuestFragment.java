package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent;

import X.C01GW;
import X.C098200Yq;
import X.C0I0B;
import X.C0I7D;
import X.C1214160hhW;
import X.C1214170hhX;
import X.C1336205Ku;
import X.C1365120ld0;
import X.C1365460ldY;
import X.C1368580lia;
import X.C1368910lj7;
import X.C1368970ljD;
import X.C1369000ljG;
import X.C1369050ljL;
import X.C1369090ljP;
import X.C1370970lmR;
import X.C1379050lzT;
import X.C13BV;
import X.C13LP;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21673919s1;
import X.C2216408mI;
import X.C443120HZe;
import X.C452501pT;
import X.C786410Ut5;
import X.C866950Xzh;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1910450zoZ;
import X.InterfaceC1365250ldD;
import X.InterfaceC1368700lim;
import X.InterfaceC1369040ljK;
import X.InterfaceC897380ZIi;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS183S0200000_21;
import Y.AObserverS214S0100000_10;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS79S0200000_10;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.service.impl.IMContentService;
import com.ss.android.ugc.aweme.im.service.service.IIMContentService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventInviteGuestFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveEventInviteGuestFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGs/ISHELIOS4hLWs5IGE/ITMpLDk2JjFiBSYlLQA6LCEnASs6IDs2DzApOjsVOiQrJCo9PA==";
    public List<Long> LL;
    public Set<? extends IMContact> LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1365250ldD LLILZ;
    public boolean LLILZIL;
    public SharePackage LLILZLL;
    public BaseContent LLIZ;
    public Map<String, String> LLIZLLLIL;
    public Map<String, String> LLJ;
    public C1214170hhX LLJI;
    public C1365460ldY LLJIJIL;
    public boolean LLJILJILJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public RecyclerView LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public C1368970ljD LLJJJJLIIL;
    public C1749280vcc LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public View LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public final boolean LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C897520ZIw LLLFZ;
    public ARunnableS79S0200000_10 LLLI;
    public boolean LLJILJIL = true;
    public boolean LLJILLL = true;
    public boolean LLJJ = true;
    public InterfaceC1369040ljK LLJJIJIIJIL = C1369050ljL.LIZ;

    public final C1368580lia MR() {
        return (C1368580lia) this.LLLFFI.getValue();
    }

    public final ShareDialogViewModel NR() {
        return (ShareDialogViewModel) this.LLLF.getValue();
    }

    public final LifecycleOwner getLifecycleOwner() {
        return (LifecycleOwner) this.LLJLLL.getValue();
    }

    public LiveEventInviteGuestFragment() {
        FirstFramePerfMon.LIZ.LIZIZ("live_event_invite_guest_fragment");
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 599));
        this.LLJLL = true;
        this.LLJLLIL = this.LLJIJIL != null;
        this.LLJLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 600));
        this.LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 603));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 598));
        this.LLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 602));
        this.LLLF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 604));
        this.LLLFF = C452501pT.LIZIZ(new C1369000ljG(this));
        this.LLLFFI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 601));
        InterfaceC897380ZIi.LIZIZ.getClass();
        this.LLLFZ = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.SEE_MORE_PANEL, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.LIZIZ(this.LLJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0I7D searchEtFromXml;
        View viewFindViewById;
        View viewFindViewById2;
        List<? extends IMContact> listLLIIII;
        C1749280vcc c1749280vcc;
        boolean z;
        List<IMUser> batchContacts;
        C1214160hhW c1214160hhWLJIIIIZZ;
        String string;
        C1365120ld0 c1365120ld0;
        C1214160hhW c1214160hhWLJIIIIZZ2;
        TextView textView;
        String strLIZ;
        DialogFragment dialogFragment;
        Window window;
        Dialog dialog;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cov, viewGroup, false);
        this.LLJJJ = viewTd.findViewById(R.id.v1s);
        viewTd.findViewById(R.id.nur);
        this.LLJJJJ = (RecyclerView) viewTd.findViewById(R.id.eqp);
        this.LLJJJJJIL = (ViewGroup) viewTd.findViewById(R.id.eqq);
        this.LLJJJJLIIL = (C1368970ljD) viewTd.findViewById(R.id.uaf);
        this.LLJJL = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) viewTd.findViewById(R.id.xyl);
        RecyclerView recyclerView = this.LLJJJJ;
        C19GS c19gs = null;
        if (recyclerView != null) {
            FirstFramePerfMon.LIZ.LIZ(recyclerView, "live_event_invite_guest_fragment", null);
        }
        if (C1336205Ku.LIZJ().LIZJ()) {
            ViewGroup viewGroup2 = this.LLJJJJJIL;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
            C1749280vcc c1749280vcc2 = this.LLJJL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
            }
        } else {
            if (!this.LLJLLIL) {
                C1368970ljD c1368970ljD = this.LLJJJJLIIL;
                if (c1368970ljD != null) {
                    c1368970ljD.setListViewModel(NR());
                }
            } else {
                C1368970ljD c1368970ljD2 = this.LLJJJJLIIL;
                if (c1368970ljD2 != null) {
                    int visibility = c1368970ljD2.getVisibility();
                    c1368970ljD2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c1368970ljD2);
                }
            }
            C1368970ljD c1368970ljD3 = this.LLJJJJLIIL;
            if (c1368970ljD3 != null) {
                c1368970ljD3.setEditClickCallBack(new AwS565S0100000_21(this, 1598));
            }
            C1368970ljD c1368970ljD4 = this.LLJJJJLIIL;
            if (c1368970ljD4 != null) {
                searchEtFromXml = c1368970ljD4.getSearchEtFromXml();
            } else {
                searchEtFromXml = null;
            }
            if (searchEtFromXml != null) {
                final int i = 0;
                searchEtFromXml.setOnFocusChangeListener(new View.OnFocusChangeListener(this, i) { // from class: X.0maT
                    public final int $t;
                    public Object l0;

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        switch (this.$t) {
                            case 0:
                                onFocusChange$0(this, view, z2);
                                break;
                            case 1:
                                onFocusChange$1(this, view, z2);
                                break;
                        }
                    }

                    {
                        this.$t = i;
                        this.l0 = this;
                    }

                    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1401990maT viewOnFocusChangeListenerC1401990maT, View view, boolean z2) {
                        if (z2) {
                            ((LiveEventInviteGuestFragment) viewOnFocusChangeListenerC1401990maT.l0).LLJLIL = view;
                        } else {
                            KeyboardUtils.LIZIZ(view);
                        }
                    }

                    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1401990maT viewOnFocusChangeListenerC1401990maT, View view, boolean z2) {
                        if (z2) {
                            ((LiveEventInviteGuestFragment) viewOnFocusChangeListenerC1401990maT.l0).LLJLIL = view;
                        }
                    }
                });
            }
            RecyclerView recyclerView2 = this.LLJJJJ;
            if (recyclerView2 != null) {
                recyclerView2.setHasFixedSize(true);
                final Context context = recyclerView2.getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventInviteGuestFragment$setupContactListRecyclerView$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                        super.onLayoutCompleted(c21673919s1);
                        if (C866950Xzh.LIZIZ(this.LL.MR().LLLFZ())) {
                            LiveEventInviteGuestFragment liveEventInviteGuestFragment = this.LL;
                            if (liveEventInviteGuestFragment.LLJLL) {
                                liveEventInviteGuestFragment.LLJLL = false;
                                SharePackage sharePackage = liveEventInviteGuestFragment.LLILZLL;
                                SharePackage sharePackage2 = null;
                                if (sharePackage == null) {
                                    sharePackage = null;
                                }
                                String string2 = sharePackage.extras.getString("enter_from");
                                SharePackage sharePackage3 = this.LL.LLILZLL;
                                if (sharePackage3 != null) {
                                    sharePackage2 = sharePackage3;
                                }
                                String string3 = sharePackage2.extras.getString("enter_method", "");
                                long jLIZIZ = C2216408mI.LIZIZ(string3);
                                long jCurrentTimeMillis = System.currentTimeMillis() - jLIZIZ;
                                if (jLIZIZ > 0 && jCurrentTimeMillis > 0) {
                                    IInternalShareApi.LIZ.getClass();
                                    C1370970lmR.LIZ().LIZJ().LJIIZILJ(jCurrentTimeMillis, C0I0B.LJFF.LIZIZ(), string2, string3);
                                }
                            }
                        }
                    }
                });
                recyclerView2.setAdapter(MR());
                final Context context2 = recyclerView2.getContext();
                recyclerView2.addOnScrollListener(new C1379050lzT(context2) { // from class: X.0ljJ
                    @Override // X.C1379050lzT, X.AbstractC1585810rMx
                    public final void LJJIIJ(RecyclerView recyclerView3, int i2) {
                        super.LJJIIJ(recyclerView3, i2);
                        if (i2 == 1) {
                            KeyboardUtils.LIZIZ(this.LLILLJJLI.LLJLIL);
                        }
                    }
                });
            }
            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.cgk, this.LLJJJJJIL, false);
            if (viewTd2 != null && (textView = (TextView) viewTd2.findViewById(R.id.zs0)) != null && (strLIZ = C1368910lj7.LIZ(2131845822)) != null) {
                textView.setText(strLIZ);
            }
            if (viewTd2 != null) {
                viewFindViewById = viewTd2.findViewById(R.id.nu5);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJIL = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 267), viewFindViewById);
            }
            C1368580lia c1368580liaMR = MR();
            View view = c1368580liaMR.LLILZ;
            if (view == null) {
                c1368580liaMR.LLILZ = viewTd2;
                c1368580liaMR.LLILZIL = true;
                c1368580liaMR.notifyItemInserted(0);
            } else {
                Intrinsics.LJFF(view, viewTd2);
            }
            C1214170hhX c1214170hhX = this.LLJI;
            if (c1214170hhX != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    IInternalShareApi.LIZ.getClass();
                    c1214160hhWLJIIIIZZ2 = C1370970lmR.LIZ().LIZIZ().LJIIIIZZ(context3, null, null, c1214170hhX, false, false);
                } else {
                    c1214160hhWLJIIIIZZ2 = null;
                }
                ViewGroup viewGroup3 = this.LLJJLIIIJLLLLLLLZ;
                if (viewGroup3 != null) {
                    viewGroup3.addView(c1214160hhWLJIIIIZZ2);
                }
            }
            Context context4 = getContext();
            if (context4 != null && (string = context4.getString(2131852244)) != null && (c1365120ld0 = (C1365120ld0) this.LLLFF.getValue()) != null) {
                c1365120ld0.LIZ(string);
            }
            View view2 = this.LLJJJ;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.gqg);
            } else {
                viewFindViewById2 = null;
            }
            if (viewFindViewById2 != null) {
                final int i2 = 1;
                viewFindViewById2.setOnFocusChangeListener(new View.OnFocusChangeListener(this, i2) { // from class: X.0maT
                    public final int $t;
                    public Object l0;

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view3, boolean z2) {
                        switch (this.$t) {
                            case 0:
                                onFocusChange$0(this, view3, z2);
                                break;
                            case 1:
                                onFocusChange$1(this, view3, z2);
                                break;
                        }
                    }

                    {
                        this.$t = i2;
                        this.l0 = this;
                    }

                    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1401990maT viewOnFocusChangeListenerC1401990maT, View view3, boolean z2) {
                        if (z2) {
                            ((LiveEventInviteGuestFragment) viewOnFocusChangeListenerC1401990maT.l0).LLJLIL = view3;
                        } else {
                            KeyboardUtils.LIZIZ(view3);
                        }
                    }

                    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1401990maT viewOnFocusChangeListenerC1401990maT, View view3, boolean z2) {
                        if (z2) {
                            ((LiveEventInviteGuestFragment) viewOnFocusChangeListenerC1401990maT.l0).LLJLIL = view3;
                        }
                    }
                });
            }
            IIMContentService iIMContentServiceLIZLLL = IMContentService.LIZLLL();
            SharePackage sharePackage = this.LLILZLL;
            if (sharePackage == null) {
                sharePackage = null;
            }
            C443120HZe<Boolean, Integer, String> c443120HZeLIZJ = iIMContentServiceLIZLLL.LIZJ(sharePackage);
            boolean zBooleanValue = c443120HZeLIZJ.getFirst().booleanValue();
            int iIntValue = c443120HZeLIZJ.getSecond().intValue();
            String third = c443120HZeLIZJ.getThird();
            if (zBooleanValue) {
                Context context5 = getContext();
                if (context5 != null) {
                    IInternalShareApi.LIZ.getClass();
                    c1214160hhWLJIIIIZZ = C1370970lmR.LIZ().LIZIZ().LJIIIIZZ(context5, Integer.valueOf(iIntValue), third, null, false, false);
                } else {
                    c1214160hhWLJIIIIZZ = null;
                }
                ViewGroup viewGroup4 = this.LLJJLIIIJLLLLLLLZ;
                if (viewGroup4 != null) {
                    viewGroup4.addView(c1214160hhWLJIIIIZZ);
                }
            }
            ((InterfaceC1368700lim) this.LLL.getValue()).LJL();
            ShareDialogViewModel shareDialogViewModelNR = NR();
            shareDialogViewModelNR.LLIZ.observe(getLifecycleOwner(), new AObserverS224S0100000_21(this, 97));
            shareDialogViewModelNR.LLJ.observe(getLifecycleOwner(), new AObserverS224S0100000_21(this, 98));
            shareDialogViewModelNR.LLJI.observe(getLifecycleOwner(), new AObserverS214S0100000_10(this, 159));
            shareDialogViewModelNR.LLILZIL.observe(getLifecycleOwner(), new AObserverS224S0100000_21(this, 99));
            shareDialogViewModelNR.LLILZLL.observe(getLifecycleOwner(), new AObserverS224S0100000_21(this, 100));
            shareDialogViewModelNR.LLJILLL.observe(getLifecycleOwner(), new AObserverS224S0100000_21(this, 101));
            ShareDialogViewModel shareDialogViewModelNR2 = NR();
            Set<? extends IMContact> set = this.LLILLJJLI;
            if (set == null || (listLLIIII = C13LP.LLIIII(set)) == null) {
                listLLIIII = C13BV.INSTANCE;
            }
            shareDialogViewModelNR2.AQ2(listLLIIII);
            if (this.LLJLLIL) {
                ShareDialogViewModel shareDialogViewModelNR3 = NR();
                C1365460ldY c1365460ldY = this.LLJIJIL;
                if (c1365460ldY == null || (batchContacts = c1365460ldY.getBatchContacts()) == null) {
                    batchContacts = C13BV.INSTANCE;
                }
                shareDialogViewModelNR3.AQ2(batchContacts);
            }
            shareDialogViewModelNR.LLJJL.observe(getLifecycleOwner(), new AObserverS183S0200000_21(shareDialogViewModelNR, this, 11));
            shareDialogViewModelNR.LLJJI.setValue(0);
            shareDialogViewModelNR.refresh();
            C1368970ljD c1368970ljD5 = this.LLJJJJLIIL;
            if (c1368970ljD5 != null && (c1749280vcc = this.LLJJL) != null) {
                ShareDialogViewModel shareDialogViewModelNR4 = NR();
                if (this.LLJZ.getValue() != null) {
                    z = true;
                } else {
                    z = false;
                }
                new C1369090ljP(c1749280vcc, c1368970ljD5, shareDialogViewModelNR4, z, getLifecycleOwner());
            }
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue()) {
            if (window != null) {
                window.setSoftInputMode(36);
            }
        } else if (window != null) {
            window.setSoftInputMode(16);
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
