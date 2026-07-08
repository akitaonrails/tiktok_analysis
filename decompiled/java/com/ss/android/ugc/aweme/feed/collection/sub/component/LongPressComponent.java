package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C0R61;
import X.C0R67;
import X.C0R8Z;
import X.C0RF0;
import X.C0RJN;
import X.C0SUL;
import X.C1558520qew;
import X.C1618440sDa;
import X.C19EG;
import X.C281310B0v;
import X.C305280Bxu;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.InterfaceC665370Q7z;
import X.InterfaceC690460R6m;
import X.InterfaceC706770Rnv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LongPressComponent extends BaseCellContentComponent<LongPressComponent> implements LongPressAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 337));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 338));

    @Override // X.C0R8Z
    public final boolean Kh() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        C0R8Z c0r8z = (C0R8Z) this.LLJJL.getValue();
        if (c0r8z != null && c0r8z.Kh()) {
            return true;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (AwemeBizExtKt.isFriendsTabV2FakeAweme(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return true;
        }
        return C305280Bxu.LIZ() && (edgeSpeedupAbility = (EdgeSpeedupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EdgeSpeedupAbility.class, null)) != null && edgeSpeedupAbility.aW1();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, LongPressAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility
    public final C0SUL om() {
        if (!this.LLJJIII) {
            return null;
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof C0SUL) {
            return (C0SUL) viewLJJIJL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, LongPressAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC690460R6m c0r61;
        View.OnTouchListener onTouchListener;
        LongPressMonitorComponent longPressMonitorComponentWA1;
        if (!(view instanceof C0SUL)) {
            return;
        }
        C0SUL c0sul = (C0SUL) view;
        C0RF0 c0rf0 = jm().LIZLLL;
        Fragment fragment = null;
        if (c0rf0 == null || (c0r61 = c0rf0.LJIIIIZZ) == null) {
            Context context = getContext();
            BaseFeedPageParams baseFeedPageParams = jm().LJ;
            if (baseFeedPageParams == null) {
                c0r61 = null;
            } else {
                c0r61 = new C0R61(context, baseFeedPageParams);
            }
        }
        c0sul.setListener(c0r61);
        C0RF0 c0rf02 = jm().LIZLLL;
        if (c0rf02 != null) {
            onTouchListener = c0rf02.LIZLLL;
        } else {
            onTouchListener = null;
        }
        c0sul.setTapListener(onTouchListener);
        if (C305280Bxu.LIZ() || C281310B0v.LIZ()) {
            c0sul.setLongPressInterceptor(this);
        }
        LongPressMonitorAbility longPressMonitorAbility = (LongPressMonitorAbility) this.LLJJL.getValue();
        if (longPressMonitorAbility != null) {
            longPressMonitorComponentWA1 = longPressMonitorAbility.WA1();
        } else {
            longPressMonitorComponentWA1 = null;
        }
        c0sul.setLongPressMonitor(longPressMonitorComponentWA1);
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (c0rjnLIZIZ != null) {
            fragment = c0rjnLIZIZ.LJ;
        }
        if (interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment)) {
            c0sul.setEnableSimulateClick(false);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC690460R6m c0r61;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0SUL c0sulOm = om();
        if (c0sulOm != null) {
            Aweme aweme = videoItemParams2.getAweme();
            C0RF0 c0rf0 = jm().LIZLLL;
            Fragment fragment = null;
            if (c0rf0 == null || (c0r61 = c0rf0.LJIIIIZZ) == null) {
                Context context = getContext();
                BaseFeedPageParams baseFeedPageParams = jm().LJ;
                if (baseFeedPageParams == null) {
                    c0r61 = null;
                } else {
                    c0r61 = new C0R61(context, baseFeedPageParams);
                }
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            C0RF0 c0rf02 = jm().LIZLLL;
            if (c0rf02 != null) {
                str = c0rf02.LJIIIZ;
            } else {
                str = null;
            }
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                fragment = c0rjnLIZIZ.LJ;
            }
            C0R67.LIZ(c0sulOm, aweme, c0r61, c19egLIZ, str, false, interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment));
        }
    }
}
