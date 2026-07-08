package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C1383370m6R;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C300860Bqm;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C866950Xzh;
import X.C880690Ygl;
import X.C885630Yoj;
import X.C887750Ys9;
import X.C888110Ysj;
import X.C888120Ysk;
import X.C888220Ysu;
import X.EnumC871430YGn;
import X.EnumC880520YgU;
import X.EnumC880570YgZ;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC854580Xfk;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.AObjectS389S0100000_14;
import Y.ARunnableS114S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.zhiliaoapp.musically.R;
import irm.AkS85S0100000_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestTopBarAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 326));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 325));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 318));
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1559260qg8 LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestTopBarAssem.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestTopBarAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MessageRequestTopBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 323), AFwS248S0000000_14.get$arr$(101), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 324), AFwS248S0000000_14.get$arr$(102), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 322));
        this.LLJJJIL = new C1559260qg8(new C723580SZw(this, C887750Ys9.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LLJJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 317));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 319));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 320));
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 321));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(106));
        this.LLJL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(103));
        this.LLJLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(105));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(104));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.csb;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MessageRequestPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessageRequestPageScope.class);
        return arrayList;
    }

    public final void hp() {
        int width = ((View) this.LLJJJJ.getValue()).getWidth() - mp().getWidth();
        if (width < 0) {
            C337180DJs.LIZ((View) this.LLJJIII.getValue());
            return;
        }
        if (C426750GoL.LIZLLL(LJJIJL().getContext())) {
            width = 0;
        }
        if (mp().getScrollX() == width) {
            C337180DJs.LIZ((View) this.LLJJIII.getValue());
        } else {
            C337180DJs.LIZJ((View) this.LLJJIII.getValue());
        }
    }

    public final C0QSJ ip() {
        C0QSJ c0qsj = this.LLJLLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MessageRequestPageScope.class});
        this.LLJLLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final List<C888110Ysj> lp() {
        return (List) this.LLJJL.getValue();
    }

    public final HorizontalScrollView mp() {
        return (HorizontalScrollView) this.LLJJI.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageRequestListVMV2.class, new AObjectS389S0100000_14(this, 47), MessageRequestListVM.class, new AObjectS389S0100000_14(this, 46)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final BaseMessageRequestListVM op() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJZ;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    public static C888220Ysu kp(EnumC880520YgU enumC880520YgU) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C1697810uHb.LJIIJJI(new C888120Ysk(C1383370m6R.LJIIJ(2131846467), EnumC880570YgZ.ALL_OTHER, "other_preference_all"), new C888120Ysk(C1383370m6R.LJIIJ(2131846485), EnumC880570YgZ.OTHER_VERIFIED_ACCOUNT, "verified_accounts")));
        if (C885630Yoj.LIZ(true)) {
            if (enumC880520YgU == C880690Ygl.LIZ() || enumC880520YgU == EnumC880520YgU.BUSINESS) {
                arrayList.add(new C888120Ysk(C1383370m6R.LIZ.getResources().getQuantityString(2131755675, 2), EnumC880570YgZ.OTHER_POTENTIAL_PAID_OFFERS, "potential_paid_offers"));
            }
            if (enumC880520YgU == C880690Ygl.LIZ() || enumC880520YgU == EnumC880520YgU.CREATOR) {
                arrayList.add(new C888120Ysk(C1383370m6R.LIZ.getResources().getQuantityString(2131755673, 2), EnumC880570YgZ.OTHER_COLLABORATION_INVITES, "collaboration_invites"));
            }
        }
        if (enumC880520YgU == C880690Ygl.LIZ()) {
            arrayList.add(new C888120Ysk(C1383370m6R.LJIIJ(2131846474), EnumC880570YgZ.OTHER_SERVICE_PLUS, "service+"));
        }
        return new C888220Ysu(C1383370m6R.LJIIJ(2131846479), true, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0Ysd] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        List<C888110Ysj> listLp = lp();
        if (listLp == null) {
            listLp = C13BV.INSTANCE;
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJJJJ.getValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
        viewGroup.setLayoutParams(layoutParams);
        int i2 = 0;
        viewGroup.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
        Iterator<C888110Ysj> it2 = listLp.iterator();
        int i3 = 0;
        while (true) {
            EnumC871430YGn enumC871430YGn = null;
            if (it2.hasNext()) {
                C888110Ysj next = it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    final C888110Ysj c888110Ysj = next;
                    if (i3 < listLp.size() - 1) {
                        C1383370m6R.LIZIZ(c888110Ysj, AFwS229S0000000_2.get$arr$(934));
                    }
                    viewGroup.addView(c888110Ysj);
                    c888110Ysj.getClass();
                    c888110Ysj.LLILZIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0Ysd
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            if (C0Z8D.LIZ(c888110Ysj) >= c888110Ysj.getExposureRatioThreshold()) {
                                C888110Ysj c888110Ysj2 = c888110Ysj;
                                if (c888110Ysj2.LLILZIL == null) {
                                    return;
                                }
                                C786410Ut5.E3(c888110Ysj2.getViewTreeObserver(), c888110Ysj.LLILZIL);
                                C888110Ysj c888110Ysj3 = c888110Ysj;
                                c888110Ysj3.LLILZIL = null;
                                C885310YoD.LIZ.LJIIJ("non_filtered_message_request", c888110Ysj3.getTabType().getMobValue());
                            }
                        }
                    };
                    c888110Ysj.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(c888110Ysj, 0));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                HorizontalScrollView horizontalScrollViewMp = mp();
                if (C866950Xzh.LIZIZ(lp())) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, horizontalScrollViewMp);
                horizontalScrollViewMp.setHorizontalScrollBarEnabled(false);
                horizontalScrollViewMp.addView((View) this.LLJJJJ.getValue());
                HandlerHook.viewPost(horizontalScrollViewMp, new ARunnableS114S0100000_14(this, 59));
                if (C885630Yoj.LIZIZ()) {
                    mp().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC854580Xfk(this, 1));
                    if (((View) this.LLJJJJ.getValue()).getWidth() > mp().getWidth()) {
                        C337180DJs.LIZJ((View) this.LLJJIII.getValue());
                    }
                    View view2 = (View) this.LLJJIJI.getValue();
                    if (mp().getVisibility() != 0) {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, view2);
                    C786410Ut5.I7(new AkS85S0100000_14(this, 10), view2);
                }
                C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0YsD
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C885430YoP) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 116), 4);
                C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Yse
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C885430YoP) obj).LLILLL;
                    }
                }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 117), 4);
                C887750Ys9 c887750Ys9 = (C887750Ys9) this.LLJJJIL.getValue();
                if (c887750Ys9 != null) {
                    enumC871430YGn = c887750Ys9.LLILLJJLI;
                }
                if (enumC871430YGn != EnumC871430YGn.ALL_RISKY && !C300860Bqm.LIZ()) {
                    C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0Ysf
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C887820YsG) obj).LLIZ;
                        }
                    }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 118), 4);
                    return;
                }
                return;
            }
        }
    }
}
