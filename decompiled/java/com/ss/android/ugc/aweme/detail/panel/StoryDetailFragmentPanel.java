package com.ss.android.ugc.aweme.detail.panel;

import X.C0SZ8;
import X.C1189504l3;
import X.C1209980ham;
import X.C128Y;
import X.C14EU;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1800490wxD;
import X.C2093608Ic;
import X.C2189821An6;
import X.C419910GdJ;
import X.C739870T0n;
import X.C745620TMq;
import X.C786410Ut5;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ARunnableS112S0100000_12;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedVHProxyAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public abstract class StoryDetailFragmentPanel extends DetailFragmentPanel {
    public boolean z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1349040lD4
    public final void LIZIZ() {
        this.z0 = true;
        O70();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1349040lD4
    public final void LJJIIJ() {
        this.z0 = false;
        M31();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onCommentListPageDialogEvent(C739870T0n c739870T0n) {
    }

    public final boolean F0() {
        return Intrinsics.LJFF(this.LLLLIIIILLL.getEventType(), "story_archive");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean i() {
        Bundle arguments;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        Fragment fragmentLIZLLL = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(getFragment()) : null;
        boolean z = false;
        if (fragmentLIZLLL != null && (arguments = fragmentLIZLLL.getArguments()) != null && arguments.getInt("use_saf") == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx
    public final void JK1() {
        DetailPageComponent detailPageComponentDn1;
        View view;
        if (!isViewValid() || getContext() == null) {
            return;
        }
        String string = getContext().getString(2131834341);
        String string2 = getContext().getString(2131834340);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_2pt_twinkle_star;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        C1749280vcc c1749280vccEf0 = this.LLIZLLLIL.ef0();
        if (c1749280vccEf0 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = string;
            c1722300uv6.LJIIIIZZ = string2;
            c1722300uv6.LJIIIZ = new AwS591S0100000_12(this, 604);
            c1749280vccEf0.setStatus(c1722300uv6);
            C786410Ut5.LLLZLZ(c1749280vccEf0, 0);
        }
        View view2 = this.G;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        Fragment fragment = getFragment();
        if (fragment != null) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IFeedFragmentAbility.class, null);
            IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) (interfaceC494301wDLIZ instanceof IDetailPageAbility ? interfaceC494301wDLIZ : null);
            if (iDetailPageAbility == null || (detailPageComponentDn1 = iDetailPageAbility.Dn1()) == null || (view = detailPageComponentDn1.LLJJIJIIJIL) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void Z() {
        super.Z();
        HandlerHook.viewPost(this.LLJJIJI, new ARunnableS112S0100000_12((Object) this, 162));
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Aweme o() {
        return LLLLLJLJLL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        C0SZ8 c0sz8LJLIL = LJLIL();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, UserFeedVHProxyAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = (!(c0sz8LJLIL instanceof C0SZ8) || c0sz8LJLIL == null) ? null : c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, UserFeedVHProxyAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        UserFeedVHProxyAbility userFeedVHProxyAbility = (UserFeedVHProxyAbility) interfaceC494301wDLIZ2;
        if (userFeedVHProxyAbility != null) {
            userFeedVHProxyAbility.W50();
        }
        super.onDestroyView();
    }

    public StoryDetailFragmentPanel(C2189821An6 c2189821An6) {
        super(c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void f(String str) {
        C0SZ8 c0sz8LJLIL;
        if (F0() && C1189504l3.LIZ()) {
            IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJJIJIIJIL;
            if (iViewPagerComponentAbility != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null) {
                c0sz8LJLIL.LLLLIILL(-1, str);
                return;
            }
            return;
        }
        super.f(str);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void l(Intent intent) {
        InterfaceC214902198i interfaceC214902198i;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        C128Y c128yLIZLLL = null;
        if (iDetailFeedSafService != null) {
            c128yLIZLLL = iDetailFeedSafService.LIZLLL(getFragment());
        }
        if ((c128yLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL) != null && !SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
            if (intent == null) {
                intent = new Intent();
            }
            C1800490wxD.LIZJ(interfaceC214902198i, -1, intent);
            interfaceC214902198i.finish();
            return;
        }
        super.l(intent);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void onCommentEvent(C1209980ham c1209980ham) {
        Integer numValueOf;
        String aid = null;
        if (c1209980ham != null && (numValueOf = Integer.valueOf(c1209980ham.LIZ)) != null) {
            if (numValueOf.intValue() == 3 || numValueOf.intValue() == 4 || numValueOf.intValue() == 8) {
                Object obj = c1209980ham.LIZIZ;
                if (!(obj instanceof Object[])) {
                    return;
                }
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 2) {
                    return;
                }
                Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
                if (awemeLLLLLJLJLL != null) {
                    aid = awemeLLLLLJLJLL.getAid();
                }
                C2093608Ic.LIZJ(aid, (String) objArr[0]);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onViewerListAuthPageEvent(C745620TMq c745620TMq) {
        if (c745620TMq == null) {
            return;
        }
        if (c745620TMq.LIZ == 1) {
            O70();
        } else {
            if (this.z0) {
                return;
            }
            M31();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
