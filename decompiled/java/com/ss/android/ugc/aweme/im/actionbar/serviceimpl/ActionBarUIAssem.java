package com.ss.android.ugc.aweme.im.actionbar.serviceimpl;

import X.AbstractC2211791BhR;
import X.C019F;
import X.C09R3;
import X.C0DXR;
import X.C0I0B;
import X.C0QSJ;
import X.C0ZLX;
import X.C127G;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AF0;
import X.C20684815ws;
import X.C21673919s1;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C23250099c;
import X.C418440Gaw;
import X.C426750GoL;
import X.C494501wF;
import X.C5182020e;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C738130SxP;
import X.C814420VxA;
import X.C830490Whz;
import X.C910060Zn2;
import X.C910070Zn3;
import X.C910080Zn4;
import X.C910100Zn6;
import X.C910120Zn8;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC901690ZYx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS67S0000000_14;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarViewInfoAbility;
import com.ss.android.ugc.aweme.im.actionbar.api.protocol.ActionBarButtonProtocol;
import com.ss.android.ugc.aweme.im.actionbar.api.scope.ActionBarScope;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarUIAssem extends UISlotAssem implements ActionBarViewInfoAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public final AssemVMLazy LLJJIII;
    public final long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public List<? extends InterfaceC901690ZYx> LLJJIJIL;
    public boolean LLJJJ;
    public volatile C910120Zn8 LLJJJIL;
    public C127G LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ActionBarUIAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ActionBarUIAssem.class, "animationManager", "getAnimationManager()Lcom/ss/android/ugc/aweme/im/actionbar/api/ability/ActionBarRevampAnimationManager;", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(ActionBarUIAssem.class, "lightInteractionActionBarVM", "<v#0>", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217401BqU};
    }

    public ActionBarUIAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActionBarViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 202), AFwS248S0000000_14.get$arr$(56), null, true);
        this.LLJJIJIL = C13BV.INSTANCE;
        this.LLJJJ = true;
        this.LLJJIJI = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cea;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ActionBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ActionBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ActionBarScope.class);
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

    public final ActionBarViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (ActionBarViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ActionBarViewModel.class, new AObjectS67S0000000_14(this, 6)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarViewInfoAbility
    public final int vR0() {
        return LJJIJL().getHeight();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws IllegalAccessException {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
        List listLIZIZ;
        boolean z = view instanceof ViewOnAttachStateChangeListenerC20604515jv;
        if (z && (viewOnAttachStateChangeListenerC20604515jv3 = (ViewOnAttachStateChangeListenerC20604515jv) view) != null && (listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ActionBarButtonProtocol.class, false)) != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(((ActionBarButtonProtocol) it2.next()).Ih0());
            }
        }
        C2211631BhB.LIZJ(view, new AbstractC2211791BhR(this) { // from class: X.0Zn5
            public final C914000ZtO LJ;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJ;
            }

            {
                this.LJ = new C914000ZtO(this, 0);
            }
        });
        super.onViewCreated(view);
        C1558520qew.LIZLLL(this);
        if (z && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
            this.LLJJI = viewOnAttachStateChangeListenerC20604515jv;
            C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJI) != null) {
                viewOnAttachStateChangeListenerC20604515jv2.setLifecycleOwner(fragmentLJI);
            }
            final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem$configurePowerList$1$2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                    Fragment fragmentLJI2;
                    super.onLayoutCompleted(c21673919s1);
                    ActionBarUIAssem actionBarUIAssem = this.LL;
                    if (Intrinsics.LJFF(((C0ZLX) actionBarUIAssem.hp().wQ2().getValue()).LIZ, Boolean.FALSE) && (fragmentLJI2 = C724240Sb0.LJI(actionBarUIAssem)) != null && C494501wF.LIZ(fragmentLJI2)) {
                        try {
                            C019F c019f = C019F.LIZ;
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialActionBarLightInteractionViewModel.class);
                            AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(actionBarUIAssem, C724750Sbp.LJIIJ(actionBarUIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 183), AFwS248S0000000_14.get$arr$(354), null, true);
                            if (actionBarUIAssem.LLJJIJIIJIL) {
                                actionBarUIAssem.LLJJIJIIJIL = false;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ActionBarUIAssem.LLJJJJJIL;
                                if (((SocialActionBarLightInteractionViewModel) assemVMLazyLIZ.getValue()).LLJJI && ((SocialActionBarLightInteractionViewModel) assemVMLazyLIZ.getValue()).LLJJ && ((SocialActionBarLightInteractionViewModel) assemVMLazyLIZ.getValue()).LLJJIII) {
                                    return;
                                }
                                ActionBarUIAssem.ip(actionBarUIAssem, jCurrentTimeMillis - actionBarUIAssem.LLJJIJI, actionBarUIAssem.LLJJJ, actionBarUIAssem.LLJJIJIL);
                                actionBarUIAssem.LLJJJ = false;
                            }
                        } catch (C738130SxP e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i = C2187451AjH.LIZ;
                            C1AF0.LJFF(e, "ActionBarUIAssem onLayoutCompletedActions AssemIllegalStateException");
                        }
                    }
                }
            });
            final Context context2 = viewOnAttachStateChangeListenerC20604515jv.getContext();
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(context2) { // from class: X.0DWe
                public final Context LL;

                {
                    this.LL = context2;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int dimensionPixelSize;
                    int itemCount;
                    int i;
                    super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                    if (view2.getVisibility() == 8) {
                        return;
                    }
                    int i2 = 0;
                    try {
                        dimensionPixelSize = this.LL.getResources().getDimensionPixelSize(R.dimen.z_);
                    } catch (Resources.NotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        dimensionPixelSize = 0;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition == 0) {
                        i = 0;
                    } else {
                        i = dimensionPixelSize / 2;
                    }
                    rect.left = i;
                    if (childAdapterPosition != itemCount - 1) {
                        i2 = dimensionPixelSize / 2;
                    }
                    rect.right = i2;
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910060Zn2(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910070Zn3(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910080Zn4(this, null), 3);
        ActionBarCommonDisplayManagerAssem.LLJI.getClass();
        C723850SaN.LIZJ(this, new C910100Zn6(this, true, true, true, true));
    }

    public static void ip(ActionBarUIAssem actionBarUIAssem, long j, boolean z, List list) {
        String str;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("duration", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_first_show", str);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC901690ZYx) it2.next()).LLILLIZIL());
        }
        c830490Whz.put("item_list", C13LP.LJJLIIIJ(arrayList, ",", ",", ",", 0, null, null, 56));
        C20684815ws.LJIILLIIL("aweme_im_action_bar_show", c830490Whz);
    }
}
