package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC21673719rz;
import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0PEM;
import X.C0ZT5;
import X.C127G;
import X.C13LE;
import X.C1518905x5;
import X.C1620970sHf;
import X.C194405113z;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C424910GlN;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS378S0100000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;
import com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes25.dex */
public final class GroupTypingIndicatorPowerCell extends PowerCell<C0ZT5> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public AnonymousClass0956 LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C1620970sHf LLILZLL;
    public C127G LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupTypingIndicatorPowerCell.class, "gcTypingBubbleIndicatorBubbleVM", "getGcTypingBubbleIndicatorBubbleVM()Lcom/ss/android/ugc/aweme/im/messagelist/impl/GroupChatTypingIndicatorBubbleVM;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cks;
    }

    public GroupTypingIndicatorPowerCell() {
        AssemVMLazy assemVMLazy;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 604));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 602));
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatTypingIndicatorBubbleVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 614);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(180);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 603), awS568S0100000_24, AFwS224S0000000_33.get$arr$(339), new AwS568S0100000_24((C03K6) this, 605), new AwS568S0100000_24((C03K6) this, 607), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 609), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 611), null, new AwS568S0100000_24((C03K6) this, 612));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((C03K6) this, 606);
            AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 608);
            AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ, 610);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS568S0100000_242, 92));
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c01gwLIZIZ, 2402);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c01gwLIZIZ, 2403);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c01gwLIZIZ, 2404);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 2405);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2406);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS568S0100000_244, awS568S0100000_24, new C452080Ho6(), awS577S0100000_33, awS577S0100000_332, awS568S0100000_243, aFwS264S0000000_24, awS577S0100000_333, awS577S0100000_334, awS577S0100000_335);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 613), awS568S0100000_24, AFwS224S0000000_33.get$arr$(340), new AwS568S0100000_24((C03K6) this, 615), new AwS568S0100000_24((C03K6) this, 616), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 617), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 618), null, new AwS568S0100000_24((C03K6) this, 619));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 620), awS568S0100000_24, AFwS224S0000000_33.get$arr$(341), new AwS568S0100000_24((C03K6) this, 621), new AwS568S0100000_24((C03K6) this, 622), new AwS568S0100000_24((C03K6) this, 623), aFwS264S0000000_24, null, null, new AwS568S0100000_24((C03K6) this, 601));
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = new C1620970sHf(CoroutineExceptionHandler.LJJLIL, 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GroupChatTypingIndicatorBubbleVM.class, new AObjectS378S0100000_2(this, 6)}, defaultViewModelProviderFactory);
                    this.LLIZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        this.LL = view instanceof ViewOnAttachStateChangeListenerC20604515jv ? (ViewOnAttachStateChangeListenerC20604515jv) view : null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(IMMessageBubbleLayoutSetting.LIZ().minHeightDp)));
            C786410Ut5.W5(viewOnAttachStateChangeListenerC20604515jv, marginLayoutParams);
            C426750GoL.LJ(this.itemView);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(new C194405113z());
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(C424910GlN.LIZ);
            final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context) { // from class: X.0rac
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollHorizontally() {
                    return false;
                }

                {
                    setOrientation(0);
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(AvatarPowerCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TypingBubblePowerCell.class);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        AbstractC21673719rz itemAnimator;
        super.unBind();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.clearAnimation();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (itemAnimator = viewOnAttachStateChangeListenerC20604515jv2.getItemAnimator()) != null) {
            itemAnimator.LJIIL();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLILZLL), null, new C1518905x5(this, null), 2);
        }
    }
}
