package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0NKE;
import X.C0OB6;
import X.C0OCG;
import X.C0QSJ;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C15O7;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1720106oR;
import X.C189200o6;
import X.C1935007i0;
import X.C1935107i1;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616360OFm;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817250W4d;
import X.C987103tV;
import X.EnumC615090OAp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import Y.ACallableS58S1100000_3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.mob.detail.EnterAddYoursDetailAwemeProvider;
import com.ss.android.ugc.tiktok.addyours.mob.detail.EnterAddYoursDetailPageProvider;
import com.ss.android.ugc.tiktok.addyours.mob.detail.EnterAddYoursDetailTopicProvider;
import com.ss.android.ugc.tiktok.addyours.mob.detail.FavouriteAddYoursProvider;
import com.ss.android.ugc.tiktok.addyours.mob.detail.IEnterAddYoursDetailProvider;
import com.ss.android.ugc.tiktok.addyours.mob.detail.IFavouriteAddYoursProvider;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.AwS27S0000100_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursTopicDetailFragment extends BaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final C0OCG LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqJzA+OmEmIWHELIOSsqOy40JSAiPWESLCEVJjohOxEjOSYwDCA4KCY/DjctLiI2JjE=";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public long LLJJJ;
    public final AtomicBoolean LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OCG] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursTopicDetailFragment.class, "detailVM", "getDetailVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = new Object() { // from class: X.0OCG
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{AddYoursDetailScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursDetailScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursDetailScope.class);
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

    public AddYoursTopicDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1650);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(697);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1651), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1652), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1653), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C1935107i1.LIZ(AFwS195S0000000_9.get$arr$(364));
        this.LLJ = C1935107i1.LIZ(new AwS125S1200000_9(this, "add_yours_topic_id", (Object) null, 10));
        this.LLJI = C1935107i1.LIZ(new AwS125S1200000_9(this, "topic", (Object) null, 11));
        this.LLJIJIL = C1935107i1.LIZ(new AwS125S1200000_9(this, "add_yours_enter_from_before_detail_page", (Object) null, 12));
        this.LLJILJIL = C1935107i1.LIZ(new AwS125S1200000_9(this, "from_aweme", (Object) null, 13));
        this.LLJILJILJ = C1935107i1.LIZ(new AwS125S1200000_9(this, "enter_from", "H5", 6));
        this.LLJILLL = C1935107i1.LIZ(new AwS125S1200000_9(this, "follow_status", (Object) null, 14));
        this.LLJJ = C1935107i1.LIZ(new AwS125S1200000_9(this, "user_avatars", (Object) null, 15));
        this.LLJJI = C1935107i1.LIZ(new AwS125S1200000_9((Fragment) this, "entrance_category", (Object) 3, 7));
        this.LLJJIII = C1935107i1.LIZ(new AwS125S1200000_9(this, "category_name", "feed", 8));
        this.LLJJIJI = C1935107i1.LIZ(new AwS125S1200000_9(this, "is_from_qa_sticker", Boolean.FALSE, 9));
        this.LLJJIJIIJIL = C1935107i1.LIZ(new AwS125S1200000_9(this, "viewed_user_id", (Object) null, 16));
        this.LLJJIJIL = C1935107i1.LIZ(AFwS195S0000000_9.get$arr$(363));
        this.LLJJJ = -1L;
        this.LLJJJIL = new AtomicBoolean(false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() throws Throwable {
        Object c098200Yq;
        super.onPause();
        if (!Intrinsics.LJFF(this.LLJILJILJ.getValue(), "add_yours_detail_page") && this.LLJJJ >= 0) {
            AwS27S0000100_9 awS27S0000100_9 = new AwS27S0000100_9(System.currentTimeMillis() - this.LLJJJ, 2);
            C01GW c01gw = C1935007i0.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                awS27S0000100_9.invoke(jSONObject);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null && ((Boolean) C1935007i0.LIZ.getValue()).booleanValue()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("AYEventTracking", "error occurs when assembling mob params", thM5exceptionOrNullimpl);
                throw thM5exceptionOrNullimpl;
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C15O7.LIZJ(new ACallableS58S1100000_3(jSONObject, 4));
            }
            this.LLJJJ = -1L;
        }
        ((FypAutoScrollService) this.LLJJIJIL.getValue()).LJIIJ(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJJ <= 0) {
            this.LLJJJ = System.currentTimeMillis();
        }
        ((FypAutoScrollService) this.LLJJIJIL.getValue()).LJIIJ(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IEnterAddYoursDetailProvider.class, C1697810uHb.LJIILJJIL(new EnterAddYoursDetailTopicProvider(interfaceC665370Q7zLJFF)));
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IEnterAddYoursDetailProvider.class, C1697810uHb.LJIILJJIL(new EnterAddYoursDetailAwemeProvider(interfaceC665370Q7zLJFF)));
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IEnterAddYoursDetailProvider.class, C1697810uHb.LJIILJJIL(new EnterAddYoursDetailPageProvider(interfaceC665370Q7zLJFF)));
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, IFavouriteAddYoursProvider.class, C1697810uHb.LJIILJJIL(new FavouriteAddYoursProvider(interfaceC665370Q7zLJFF)));
    }

    @C14EU
    public final void onNewTopic(C0NKE c0nke) {
        AddYoursTopic addYoursTopic = c0nke.LIZ;
        EnumC615090OAp enumC615090OAp = c0nke.LIZIZ;
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), addYoursTopic, AddYoursTopic.class, "source_default_key");
        if (enumC615090OAp == EnumC615090OAp.NETWORK && !this.LLJJJIL.getAndSet(true)) {
            C817250W4d.LIZIZ(getContext(), "enter_add_yours_detail_page", new AwS410S0200000_9(this, addYoursTopic, 120), new AwS553S0100000_9(this, 1852));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AddYoursTopic addYoursTopic;
        Long lLJIILIIL;
        String aid;
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, view, 111), 3);
        if (this.LLJI.getValue() != null) {
            addYoursTopic = (AddYoursTopic) this.LLJI.getValue();
            if (addYoursTopic == null) {
                addYoursTopic = new AddYoursTopic(null, null, null, null, null, null, null, null, -1, null, Boolean.FALSE, null, 0);
            }
        } else {
            String str = (String) this.LLJ.getValue();
            if (str != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str);
            } else {
                lLJIILIIL = null;
            }
            addYoursTopic = new AddYoursTopic(lLJIILIIL, null, null, null, null, null, null, null, -1, null, Boolean.FALSE, null, 0);
        }
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        AddYoursDetailViewModel addYoursDetailViewModel = (AddYoursDetailViewModel) assemVMLazy.getValue();
        addYoursDetailViewModel.withState(new AwS375S0200000_9(addYoursDetailViewModel, addYoursTopic, 114));
        Aweme video = (Aweme) this.LLJILJIL.getValue();
        if (video == null) {
            video = addYoursTopic.getVideo();
        }
        if (video != null) {
            C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), video, Aweme.class, "source_default_key");
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0OB6((String) this.LLJILJILJ.getValue(), (String) this.LLJJIII.getValue(), null, 12), C0OB6.class, "source_default_key");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("detail_aweme_list_type", 42);
        C786410Ut5.LJJJI("event_label", "add_yours_detail_page", bundle2);
        C786410Ut5.LJJJI("detail_id", String.valueOf(addYoursTopic.getTopicId()), bundle2);
        C786410Ut5.LJJJI("detail_aweme_from", (String) this.LLJILJILJ.getValue(), bundle2);
        C786410Ut5.LJJJI("add_yours_enter_from_before_detail_page", (String) this.LLJIJIL.getValue(), bundle2);
        C786410Ut5.LJJIZ(bundle2, "topic", addYoursTopic);
        C786410Ut5.LJJJI("process_id", UUID.randomUUID().toString(), bundle2);
        if (video != null && (aid = video.getAid()) != null) {
            C786410Ut5.LJJJI("from_group_id", aid, bundle2);
        }
        C786410Ut5.LJJJI("qa_origin_detail_key", "DONT_KNOW", bundle2);
        C786410Ut5.LJJIZ(bundle2, "from_aweme", (Aweme) this.LLJILJIL.getValue());
        ((Fragment) this.LLIZLLLIL.getValue()).setArguments(bundle2);
        ((DetailAwemeListFragment) this.LLIZLLLIL.getValue()).LLLILZJ = new C616360OFm(addYoursTopic, (Aweme) this.LLJILJIL.getValue(), ((Number) this.LLJJI.getValue()).intValue(), (String) this.LLJJIJIIJIL.getValue());
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.ht2, (Fragment) this.LLIZLLLIL.getValue(), null);
        c19ehLJIIJ.LJIIL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.m6, viewGroup, false);
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
