package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0IB0;
import X.C0QSJ;
import X.C0ZDX;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C20742916Ex;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C446980Hfs;
import X.C452080Ho6;
import X.C452501pT;
import X.C461180I6q;
import X.C461190I6r;
import X.C487370J9j;
import X.C687700QyG;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C788950UxB;
import X.C869590Y9l;
import X.C879400Yeg;
import X.C901060ZWm;
import X.EnumC432220GxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2187708hf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC911210Zot;
import Y.AAListenerS325S0100000_14;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.lightinteraction.IMessageListLightInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.tracker.MessageListTracker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifReceivePowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IMSkeletonLayoutPowerCell<ASSEM extends AbsSkeletonLayoutReusedUISlotAssem<? extends C03H5>, T extends InterfaceC461380I7k> extends AbsSkeletonLayoutPowerCell<ASSEM, T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutPowerCell) this, 631));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutPowerCell) this, 630));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutPowerCell) this, 629));
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public final List<View> LLJJIII;
    public volatile InterfaceC911210Zot LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMSkeletonLayoutPowerCell.class, "scrollToMessageViewModel", "getScrollToMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/ability/ScrollToMessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMSkeletonLayoutPowerCell.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC2187708hf T5() {
        return null;
    }

    public boolean V5() {
        return this instanceof GifReceivePowerCell;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutPowerCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutPowerCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public IMSkeletonLayoutPowerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ScrollToMessageViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 228);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(166);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 632), awS550S0100000_6, AFwS201S0000000_14.get$arr$(199), new AwS558S0100000_14((C03K6) this, 634), new AwS550S0100000_6((C03K6) this, 225), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 637), aFwS248S0000000_14, new AwS550S0100000_6((C03K6) this, 226), null, new AwS550S0100000_6((C03K6) this, 227));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((C03K6) this, 635);
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 636);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14(c19719912DlLIZ, 638);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_14, 40));
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c01gwLIZIZ, 639);
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 640);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 641);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 642);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 643);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_143, awS550S0100000_6, new C452080Ho6(), awS558S0100000_144, awS558S0100000_145, awS558S0100000_142, aFwS248S0000000_14, awS558S0100000_146, awS558S0100000_147, awS558S0100000_148);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 644), awS550S0100000_6, AFwS201S0000000_14.get$arr$(200), new AwS558S0100000_14((C03K6) this, 645), new AwS550S0100000_6((C03K6) this, 229), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 646), aFwS248S0000000_14, new AwS550S0100000_6((C03K6) this, 230), null, new AwS550S0100000_6((C03K6) this, 231));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 647), awS550S0100000_6, AFwS201S0000000_14.get$arr$(201), new AwS558S0100000_14((C03K6) this, 648), new AwS550S0100000_6((C03K6) this, 232), new AwS550S0100000_6((C03K6) this, 222), aFwS248S0000000_14, null, null, new AwS550S0100000_6((C03K6) this, 223));
        }
        this.LLJJ = assemVMLazy;
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6((IMSkeletonLayoutPowerCell) this, 224));
        this.LLJJIII = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC911210Zot U5() {
        /*
            r4 = this;
            X.0Zot r0 = r4.LLJJIJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0Zot r0 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r1 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0Zot> r0 = X.InterfaceC911210Zot.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0Zot r0 = (X.InterfaceC911210Zot) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell.U5():X.0Zot");
    }

    public final void X5() {
        C869590Y9l c869590Y9l;
        IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics;
        T item = getItem();
        if (item == null || (c869590Y9l = item.LLILII().LIZ.LIZ) == null || (iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class)) == null) {
            return;
        }
        iIMSendMsgUxAnalytics.LIZJ(SystemClock.uptimeMillis(), c869590Y9l.getMsgStatus(), C901060ZWm.LIZ(c869590Y9l));
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        ((C461190I6r) this.LLJJI.getValue()).LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TextView textView;
        if (C879400Yeg.LIZ()) {
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) LJJIJL().findViewById(R.id.k9p));
            if (!(viewLJLLLL instanceof TextView) || (textView = (TextView) viewLJLLLL) == null) {
                return;
            }
            textView.setText(String.valueOf(C13LE.LIZ(getClass()).LJI()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item == null) {
            return;
        }
        MessageListTracker messageListTracker = (MessageListTracker) this.LLJILJIL.getValue();
        if (messageListTracker != null) {
            messageListTracker.nc0(new C788950UxB(item.LLILII().LIZ.LIZ, getLayoutPosition()));
        }
        X5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        MessageListTracker messageListTracker;
        super.onViewDetachedFromWindow();
        T item = getItem();
        if (item == null || (messageListTracker = (MessageListTracker) this.LLJILJIL.getValue()) == null) {
            return;
        }
        messageListTracker.nc0(new C788950UxB(item.LLILII().LIZ.LIZ, getLayoutPosition()));
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C0IB0 c0ib0LLILII;
        C869590Y9l c869590Y9l;
        String uuid;
        InterfaceC911210Zot interfaceC911210ZotU5;
        super.unBind();
        T item = getItem();
        if (item != null && (c869590Y9l = item.LLILII().LIZ.LIZ) != null && (uuid = c869590Y9l.getUuid()) != null && (interfaceC911210ZotU5 = U5()) != null) {
            interfaceC911210ZotU5.LJFF(uuid);
        }
        ((C461190I6r) this.LLJJI.getValue()).LIZ();
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJILLL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            View viewFindViewById = LJJIJL().findViewById(R.id.eu1);
            T item2 = getItem();
            easterEggShareMessageAnimatorAbility.LIZLLL(viewFindViewById, (item2 == null || (c0ib0LLILII = item2.LLILII()) == null || !C0ZDX.LJJJJIZL(c0ib0LLILII.LIZ.LIZ)) ? EnumC432220GxA.PAIR : EnumC432220GxA.SELF);
        }
    }

    public final void R5(View view) {
        ((ArrayList) this.LLJJIII).add(view);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: W5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        String uuid;
        String scene;
        Integer numValueOf;
        EnumC432220GxA enumC432220GxA;
        IMessageListLightInteractionAbility iMessageListLightInteractionAbility;
        InterfaceC911210Zot interfaceC911210ZotU5;
        InterfaceC2187708hf interfaceC2187708hfT5 = T5();
        if (interfaceC2187708hfT5 != null && (interfaceC911210ZotU5 = U5()) != null) {
            interfaceC911210ZotU5.LIZJ(t.LLILII().LIZ.LIZ.getUuid(), interfaceC2187708hfT5);
        }
        C869590Y9l c869590Y9l = t.LLILII().LIZ.LIZ;
        View view = this.itemView;
        if (c869590Y9l != null) {
            uuid = c869590Y9l.getUuid();
        } else {
            uuid = null;
        }
        view.setTag(R.id.k_v, uuid);
        if (c869590Y9l != null) {
            scene = c869590Y9l.getScene();
        } else {
            scene = null;
        }
        view.setTag(R.id.k_u, scene);
        if (c869590Y9l != null) {
            numValueOf = Integer.valueOf(c869590Y9l.getMsgType());
        } else {
            numValueOf = null;
        }
        view.setTag(R.id.k_t, numValueOf);
        if (V5() && (iMessageListLightInteractionAbility = (IMessageListLightInteractionAbility) this.LLJILJILJ.getValue()) != null) {
            iMessageListLightInteractionAbility.YW0(t.LLILII().LIZ.LIZ);
        }
        C461190I6r c461190I6r = (C461190I6r) this.LLJJI.getValue();
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        ScrollToMessageViewModel scrollToMessageViewModel = (ScrollToMessageViewModel) assemVMLazy.getValue();
        List listLJLILLLLZI = C13LP.LJLILLLLZI(LJJIJL().findViewById(R.id.eu1), this.LLJJIII);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((IMSkeletonLayoutPowerCell) this, 633);
        c461190I6r.LIZ();
        c461190I6r.LIZIZ = C23250099c.LIZLLL(c461190I6r.LIZ, null, null, new C461180I6q(scrollToMessageViewModel, awS558S0100000_14, c461190I6r, listLJLILLLLZI, null), 3);
        super.onBindItemView(t);
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJILLL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            View viewLJJIJL = LJJIJL();
            if (C0ZDX.LJJJJIZL(t.LLILII().LIZ.LIZ)) {
                enumC432220GxA = EnumC432220GxA.SELF;
            } else {
                enumC432220GxA = EnumC432220GxA.PAIR;
            }
            easterEggShareMessageAnimatorAbility.LIZ(viewLJJIJL, enumC432220GxA);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C20742916Ex.LIZIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, viewGroup.getId(), false);
        S5(this, LJJIJL());
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }

    public static final <ASSEM extends AbsSkeletonLayoutReusedUISlotAssem<? extends C03H5>, T extends InterfaceC461380I7k> void S5(IMSkeletonLayoutPowerCell<ASSEM, T> iMSkeletonLayoutPowerCell, View view) {
        if (view instanceof ViewStub) {
            ((ViewStub) view).setLayoutInflater(new C487370J9j(iMSkeletonLayoutPowerCell.LJJIJL().getContext()));
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            S5(iMSkeletonLayoutPowerCell, viewGroup.getChildAt(i));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
        if (C879400Yeg.LIZ()) {
            View viewLJJIJL = LJJIJL();
            viewLJJIJL.setForeground(new ColorDrawable(C446980Hfs.LIZ(viewLJJIJL.getContext(), android.R.color.holo_red_light)));
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(viewLJJIJL.getForeground(), "alpha", 0, 255);
            objectAnimatorOfInt.setDuration(20L);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            objectAnimatorOfInt.setRepeatCount(10);
            objectAnimatorOfInt.setRepeatMode(2);
            objectAnimatorOfInt.addListener(new AAListenerS325S0100000_14(viewLJJIJL, 36));
            C786410Ut5.Pd(objectAnimatorOfInt);
        }
        X5();
    }
}
