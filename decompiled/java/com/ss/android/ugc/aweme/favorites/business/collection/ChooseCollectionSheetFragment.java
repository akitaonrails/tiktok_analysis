package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC1252750ihl;
import X.AbstractC1604130rqV;
import X.C004I;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0BKG;
import X.C1160250gIZ;
import X.C1170900gZk;
import X.C1171340gaS;
import X.C1171570gap;
import X.C1171740gb6;
import X.C1171750gb7;
import X.C1171870gbJ;
import X.C11DL;
import X.C11E5;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EE;
import X.C11EF;
import X.C11NJ;
import X.C11S5;
import X.C1206780hVc;
import X.C1209060hZI;
import X.C1336205Ku;
import X.C1378990lzN;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LE;
import X.C15438062q;
import X.C1622206Wu;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2217401BqU;
import X.C294850Bh5;
import X.C338490DOt;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1170260gYi;
import X.InterfaceC1170630gZJ;
import X.InterfaceC1171610gat;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewTreeObserverOnGlobalLayoutListenerC786100Usa;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS137S0100000_2;
import Y.AfS148S0200000_12;
import Y.AfS154S0200000_18;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS57S0210000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class ChooseCollectionSheetFragment extends Fragment implements InterfaceC1171660gay, InterfaceC1171610gat, InterfaceC1170260gYi {
    public static final C1171570gap LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogHELIOSO2svJiM/LSY4ICA9ZgYkJiAgLQYjJSM2KzElJiEAICApPQkhKSIhLCEn";
    public Fragment LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1170630gZJ LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(119));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(118));

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(ChooseCollectionSheetFragment.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LLILZLL = new C1171570gap();
        LLIZLLLIL = 8;
    }

    @Override // X.InterfaceC1171610gat, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public InterfaceC960503pD VR() {
        return this;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return NR(this, layoutInflater, viewGroup, bundle);
    }

    public final C11NJ PR() {
        return (C11NJ) this.LLILZ.getValue();
    }

    public final AbstractC1604130rqV SR() {
        return (AbstractC1604130rqV) this.LL.getValue();
    }

    @Override // X.InterfaceC1170260gYi
    public void Y0() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 188);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(86);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 263), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS562S0100000_18((Fragment) this, 264), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 265), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        VideoCollectionListViewModel videoCollectionListViewModelWR = WR(assemVMLazy);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("excludeId") : null;
        boolean zRR = RR();
        Bundle arguments2 = getArguments();
        videoCollectionListViewModelWR.vQ2(string, true, false, zRR, (arguments2 == null || arguments2.getString("awemeId") == null) ? false : true);
    }

    private final int UR() {
        Activity activityLIZ;
        Window window;
        View decorView;
        View viewFindViewById;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.navigationBarBackground)) == null) {
            return 0;
        }
        return viewFindViewById.getHeight();
    }

    public final boolean RR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isLSContent");
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PR().LJ();
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        VR();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C0OM1 OR(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L3c
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L5e
            r0 = 2131834482(0x7f113672, float:1.9302076E38)
            java.lang.String r1 = r1.getString(r0)
        Lf:
            X.0OM1 r4 = new X.0OM1
            r4.<init>()
            X.0idj r0 = new X.0idj
            r0.<init>()
            if (r1 != 0) goto L1d
            java.lang.String r1 = ""
        L1d:
            r0.LIZJ = r1
            r4.LIZJ = r0
            r0 = 1
            X.0idn[] r3 = new X.AbstractC1250290idn[r0]
            X.126o r2 = new X.126o
            r2.<init>()
            r2.LIZJ = r0
            kotlin.jvm.internal.AwS556S0100000_12 r1 = new kotlin.jvm.internal.AwS556S0100000_12
            r0 = 426(0x1aa, float:5.97E-43)
            r1.<init>(r5, r0)
            r2.LIZ(r1)
            r0 = 0
            r3[r0] = r2
            r4.LIZIZ(r3)
            return r4
        L3c:
            boolean r0 = X.C294850Bh5.LIZ()
            if (r0 == 0) goto L50
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L5e
            r0 = 2131825052(0x7f11119c, float:1.928295E38)
            java.lang.String r1 = r1.getString(r0)
            goto Lf
        L50:
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L5e
            r0 = 2131834460(0x7f11365c, float:1.930203E38)
            java.lang.String r1 = r1.getString(r0)
            goto Lf
        L5e:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment.OR(boolean):X.0OM1");
    }

    public static final VideoCollectionListViewModel WR(AssemVMLazy<C1160250gIZ, VideoCollectionListViewModel> assemVMLazy) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    public final void aS(InterfaceC1170630gZJ interfaceC1170630gZJ) {
        this.LLILZIL = interfaceC1170630gZJ;
    }

    @Override // X.InterfaceC1171610gat
    public void bs(CollectionDetail collectionDetail) {
        ArrayList arrayList;
        C1206780hVc.LIZ("click choose collection in collection list");
        this.LLILLL = true;
        InterfaceC1170630gZJ interfaceC1170630gZJ = this.LLILZIL;
        if (interfaceC1170630gZJ != null) {
            List<CollaborativeUser> list = collectionDetail.collaborativeUserList;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CollaborativeUser> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().uid;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            } else {
                arrayList = null;
            }
            interfaceC1170630gZJ.ef(false, collectionDetail, arrayList, false);
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1171610gat
    public void nh(CollectionDetail collectionDetail) {
        String string;
        String string2;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        String string3 = getString(2131834461);
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        Object[] objArr = new Object[1];
        String str = collectionDetail.name;
        Integer num = null;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        objArr[0] = string;
        c1389890mGx.LJIIJ(C786410Ut5.j4(string3, Arrays.copyOf(objArr, 1)));
        c1389890mGx.LJFF(com.zhiliaoapp.musically.R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(com.zhiliaoapp.musically.R.attr.a0i);
        c1389890mGx.LJIIJJI();
        String str2 = collectionDetail.name;
        Integer num2 = collectionDetail.type;
        Bundle arguments = getArguments();
        if (arguments == null || (string2 = arguments.getString("awemeId")) == null) {
            string2 = "";
        }
        List listSingletonList = Collections.singletonList(string2);
        CollectionDetail.Status status = collectionDetail.status;
        if (status != null) {
            num = status.state;
        }
        new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(1, null, str2, null, null, listSingletonList, null, null, num, null, num2, null), RR()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS154S0200000_18(collectionDetail, this, 2), new AfS148S0200000_12(activity, this, 40));
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1171610gat
    public void oN(boolean z) {
        String string;
        SR().LJ("ChooseCollectionSheetFragment onClickViewHolderToCreateCollection");
        C1206780hVc.LIZ("click create new collection in collection list");
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("enterMethod");
        } else {
            string = null;
        }
        C1170900gZk c1170900gZk = new C1170900gZk();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("enterFrom");
        }
        c1170900gZk.LIZLLL = string2;
        c1170900gZk.LJIIZILJ = "click_feed_favorite_panel";
        c1170900gZk.LJIJI = string;
        c1170900gZk.LJIJ = z ? 1 : 0;
        c1170900gZk.LJIILJJIL();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        new AwS419S0200000_18(this, new C1209060hZI(activity, this, 0), 21).invoke();
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R nS(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        int i2;
        C19ME c19me;
        boolean z2;
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ;
        View viewFindViewById;
        int i3;
        double d;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("moveToCollection");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("firstPageCount");
        } else {
            i = 0;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));
        if (C0BKG.LIZ()) {
            if (UR() <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) {
                i3 = 62;
            } else {
                i3 = 52;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            int iMax = Math.max(iLIZIZ2, ((i + (!z)) * iLIZIZ) + iLIZIZ3);
            if (z) {
                d = 4.4d;
            } else {
                d = 5.4d;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = Math.min(((int) (d * ((double) iLIZIZ))) + iLIZIZ3, iMax);
            C786410Ut5.W5(view, layoutParams);
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(com.zhiliaoapp.musically.R.id.p15);
            if (tuxNavBar != null) {
                tuxNavBar.setNavActions(OR(z));
            }
        } else {
            int iMax2 = Math.max(iLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) + (iLIZIZ * (i + (!z))));
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = Math.min((int) (C497820Jfg.LIZ(requireActivity()) * 0.5f), iMax2);
            C786410Ut5.W5(view, layoutParams2);
            TextView textView = (TextView) view.findViewById(com.zhiliaoapp.musically.R.id.title);
            if (z) {
                i2 = 2131834482;
            } else if (C294850Bh5.LIZ()) {
                i2 = 2131825052;
            } else {
                i2 = 2131834460;
            }
            textView.setText(i2);
            C786410Ut5.LJLLLLLL(8, view.findViewById(com.zhiliaoapp.musically.R.id.dat));
            C786410Ut5.LJLLLLLL(0, view.findViewById(com.zhiliaoapp.musically.R.id.jfv));
            View viewFindViewById2 = view.findViewById(com.zhiliaoapp.musically.R.id.title);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
            if (layoutParams3 instanceof C19ME) {
                c19me = (C19ME) layoutParams3;
                if (c19me != null) {
                    c19me.topToBottom = com.zhiliaoapp.musically.R.id.jfv;
                    if (c19me != null) {
                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                        c19me.topToTop = -1;
                    }
                }
            } else {
                c19me = null;
            }
            C786410Ut5.W5(viewFindViewById2, c19me);
        }
        if (!z) {
            C786410Ut5.LJLLLLLL(0, view.findViewById(com.zhiliaoapp.musically.R.id.fza));
            View viewFindViewById3 = view.findViewById(com.zhiliaoapp.musically.R.id.f6k);
            if (C0BKG.LIZ() && (viewFindViewById3 instanceof ViewStub) && (viewFindViewById = C786410Ut5.LJLLLL((ViewStub) viewFindViewById3).findViewById(com.zhiliaoapp.musically.R.id.cover)) != null) {
                C1378990lzN.LIZIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            C786410Ut5.I7(new ACListenerS121S0200000_18(this, view, 6), view.findViewById(com.zhiliaoapp.musically.R.id.f6k));
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(com.zhiliaoapp.musically.R.id.desc);
            C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC786100Usa(tuxTextView, 2));
            if (!C1336205Ku.LIZJ().LIZJ() && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (C1171750gb7.LIZIZ(z2) && (collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ()) != null && collaborativeCollectionConfigLIZJ.guideType == 1) {
                C1171870gbJ.LIZ.getClass();
                if (!C1171870gbJ.LIZ().getBoolean("collaborative_red_tag_", false)) {
                    ((TextView) view.findViewById(com.zhiliaoapp.musically.R.id.desc)).setText(2131847928);
                    View viewFindViewById4 = view.findViewById(com.zhiliaoapp.musically.R.id.x0r);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById4);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a04);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    viewFindViewById4.setBackground(c384050F3z.LIZ(viewFindViewById4.getContext()));
                    C1171870gbJ.LIZ().storeBoolean("collaborative_red_tag_", true);
                }
            }
        }
        if (!C0BKG.LIZ()) {
            C786410Ut5.I7(new ACListenerS137S0100000_2(this, 13), view.findViewById(com.zhiliaoapp.musically.R.id.dat));
        }
        C723850SaN.LIZ(this, false, null, new AwS57S0210000_2(this, z, view, 0), 3);
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public View MR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C0BKG.LIZ()) {
            i = com.zhiliaoapp.musically.R.layout.c68;
        } else {
            i = com.zhiliaoapp.musically.R.layout.c67;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R gS(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R mS(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public static View NR(ChooseCollectionSheetFragment chooseCollectionSheetFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMR = chooseCollectionSheetFragment.MR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewMR instanceof View)) {
            viewMR = null;
        }
        if (viewMR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewMR, chooseCollectionSheetFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewMR, chooseCollectionSheetFragment);
                viewMR.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, chooseCollectionSheetFragment);
                C19EG activity = chooseCollectionSheetFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewMR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewMR;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R dS(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R kS(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R cS(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R iS(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R bS(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R hS(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM ZR(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
