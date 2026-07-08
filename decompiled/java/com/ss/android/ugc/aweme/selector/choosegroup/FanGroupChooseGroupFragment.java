package com.ss.android.ugc.aweme.selector.choosegroup;

import X.C098200Yq;
import X.C0OM1;
import X.C1218950hpF;
import X.C1218960hpG;
import X.C1218970hpH;
import X.C1228410i4V;
import X.C1228420i4W;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1390130mHL;
import X.C1616906Ut;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C23250099c;
import X.C423520Gj8;
import X.C786410Ut5;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class FanGroupChooseGroupFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final Map<String, FanGroupChooseGroupFragmentParam> LLJJI = new ConcurrentHashMap();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpJSowPCo+Zyw7JyHELIOSo/LCghJzA8ZwkyJgI+JjojCy0jJjw2DzcjPD8VOiQrJCo9PA==";
    public FanGroupChooseGroupFragmentParam LLIZ;
    public FanGroupChooseGroupViewModel LLIZLLLIL;
    public TuxNavBar LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public C1390130mHL LLJIJIL;
    public C1749280vcc LLJILJIL;
    public C197039127h LLJILJILJ;
    public C1228420i4W LLJILLL;
    public String LLJJ;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String str = this.LLJJ;
        if (str != null) {
            ((ConcurrentHashMap) LLJJI).remove(str);
        }
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLIZLLLIL = null;
    }

    public static Map SR(FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam) {
        String str;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, fanGroupChooseGroupFragmentParam.scene);
        pairArr[1] = new Pair("creator_uid", fanGroupChooseGroupFragmentParam.creatorUid);
        if (fanGroupChooseGroupFragmentParam.hideTitleText) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("hide_title_text", str);
        pairArr[3] = new Pair("tracing_uuid", fanGroupChooseGroupFragmentParam.tracingUuid);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = this.LLIZ;
        if (fanGroupChooseGroupFragmentParam != null && fanGroupChooseGroupFragmentParam.isFullScreen) {
            activityConfiguration(AFwS283S0000000_35.get$arr$(82));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam2 = null;
        if (arguments != null) {
            string = arguments.getString("fan_group_choose_group_param_uuid");
        } else {
            string = null;
        }
        this.LLJJ = string;
        if (string != null && (fanGroupChooseGroupFragmentParam = (FanGroupChooseGroupFragmentParam) ((ConcurrentHashMap) LLJJI).get(string)) != null) {
            fanGroupChooseGroupFragmentParam2 = fanGroupChooseGroupFragmentParam;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                fanGroupChooseGroupFragmentParam2 = (FanGroupChooseGroupFragmentParam) arguments2.getParcelable("fan_group_choose_group_param");
            }
        }
        this.LLIZ = fanGroupChooseGroupFragmentParam2;
        NR(AFwS283S0000000_35.get$arr$(83));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        long jLongValue;
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel;
        int iIntValue2;
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = this.LLIZ;
        if (fanGroupChooseGroupFragmentParam == null) {
            C1616906Ut.LIZ(false, this, getActivity());
            return;
        }
        this.LLJ = (TuxNavBar) view.findViewById(R.id.hmk);
        this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.hmi);
        this.LLJIJIL = (C1390130mHL) view.findViewById(R.id.hmj);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.hmu);
        this.LLJILJILJ = (C197039127h) view.findViewById(R.id.hmg);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, view.getContext());
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        view.setBackgroundColor(iIntValue);
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel2 = (FanGroupChooseGroupViewModel) new ViewModelProvider(this).get(FanGroupChooseGroupViewModel.class);
        this.LLIZLLLIL = fanGroupChooseGroupViewModel2;
        Context contextN3 = C786410Ut5.N3(requireContext());
        long jLIZ = fanGroupChooseGroupFragmentParam.LIZ();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(fanGroupChooseGroupFragmentParam.targetUserId);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        fanGroupChooseGroupViewModel2.LLIZ = new C1228410i4V(contextN3, jLIZ, jLongValue);
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(new C0OM1());
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS420S0200000_19(this, fanGroupChooseGroupFragmentParam, 184));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_two_person_plus;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS420S0200000_19(this, fanGroupChooseGroupFragmentParam, 185));
            tuxNavBar.LIZ(c1251150ifB2);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131850367);
            tuxNavBar.LJIJJ(c1250250idj);
            View view2 = getView();
            if (view2 != null && (context = view2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            tuxNavBar.setNavBackground(iIntValue2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (fanGroupChooseGroupViewModel = this.LLIZLLLIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(new C423520Gj8());
            C1228420i4W c1228420i4W = new C1228420i4W(new AwS228S0300000_19(fanGroupChooseGroupViewModel, this, fanGroupChooseGroupFragmentParam, 32), new AwS228S0300000_19(fanGroupChooseGroupViewModel, this, fanGroupChooseGroupFragmentParam, 33));
            this.LLJILLL = c1228420i4W;
            viewOnAttachStateChangeListenerC20604515jv.LIZJ(c1228420i4W);
        }
        C197039127h c197039127h = this.LLJILJILJ;
        if (c197039127h != null) {
            String string = fanGroupChooseGroupFragmentParam.ctaText;
            if (string == null) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(fanGroupChooseGroupFragmentParam.targetUserId);
                if (lLJIILIIL2 != null && lLJIILIIL2.longValue() > 0) {
                    string = getString(2131830167);
                } else {
                    string = fanGroupChooseGroupFragmentParam.nextButtonContent;
                }
            }
            c197039127h.setText(string);
            c197039127h.setEnabled(false);
            C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(this, fanGroupChooseGroupFragmentParam, 66));
        }
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel3 = this.LLIZLLLIL;
        if (fanGroupChooseGroupViewModel3 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1218970hpH(fanGroupChooseGroupViewModel3, this, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1218950hpF(fanGroupChooseGroupViewModel3, this, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1218960hpG(fanGroupChooseGroupViewModel3, this, null), 3);
            fanGroupChooseGroupViewModel3.refresh();
        }
    }

    public static void UR(Context context, FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam, String str) {
        EnterChatParams enterChatParams = new EnterChatParams(context, 3, str);
        enterChatParams.setEnterFromForMob(fanGroupChooseGroupFragmentParam.enterFrom);
        enterChatParams.setEnterMethodForMob(fanGroupChooseGroupFragmentParam.enterMethod);
        enterChatParams.setQuickChatViewType(fanGroupChooseGroupFragmentParam.quickChatViewType);
        enterChatParams.setQuickChat(!fanGroupChooseGroupFragmentParam.isFullScreen);
        enterChatParams.setDisableBackGroundMaskForQuickChat(fanGroupChooseGroupFragmentParam.disableBackgroundMask ? 1 : 0);
        String str2 = fanGroupChooseGroupFragmentParam.trafficType;
        if (str2.length() == 0) {
            str2 = fanGroupChooseGroupFragmentParam.enterFrom;
        }
        enterChatParams.setTrafficType(str2);
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd1, viewGroup, false);
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
