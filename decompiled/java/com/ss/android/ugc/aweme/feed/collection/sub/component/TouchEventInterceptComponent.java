package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C0RH0;
import X.C0SUL;
import X.C1558520qew;
import X.C2188811AlT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.TouchEventInterceptAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TouchEventInterceptComponent extends BaseCellContentComponent<TouchEventInterceptComponent> implements TouchEventInterceptAbility {
    public C0RH0 LLJJJJLIIL;
    public C0RH0 LLJJL;
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 359));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 358));

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, TouchEventInterceptAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, TouchEventInterceptAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.TouchEventInterceptAbility
    public final void K8(View.OnTouchListener onTouchListener) {
        C0SUL c0sulOm;
        LongPressAbility longPressAbility;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindMultiTouchListener, longPressLayout = ");
        LongPressAbility longPressAbility2 = (LongPressAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        C0SUL c0sulOm2 = null;
        if (longPressAbility2 != null) {
            c0sulOm = longPressAbility2.om();
        } else {
            c0sulOm = null;
        }
        sbLIZ.append(c0sulOm);
        C2188811AlT.LIZIZ(sbLIZ);
        if (onTouchListener != null && (longPressAbility = (LongPressAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            c0sulOm2 = longPressAbility.om();
        }
        C0RH0 c0rh0 = this.LLJJJJLIIL;
        if (c0rh0 != null) {
            c0rh0.LL = onTouchListener;
            c0rh0.LLILLJJLI = c0sulOm2;
        }
        C0RH0 c0rh02 = this.LLJJL;
        if (c0rh02 != null) {
            c0rh02.LL = onTouchListener;
            c0rh02.LLILLJJLI = c0sulOm2;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = (C0RH0) view.findViewById(R.id.oqx);
        this.LLJJL = (C0RH0) view.findViewById(R.id.io9);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C0RH0 c0rh0 = this.LLJJL;
        if (c0rh0 != null) {
            Aweme aweme = videoItemParams2.getAweme();
            int i = 0;
            if (aweme == null || aweme.getStoryType() != 3) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c0rh0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.TouchEventInterceptAbility
    public final void t31(boolean z) {
        C0RH0 c0rh0 = this.LLJJJJLIIL;
        if (c0rh0 != null) {
            c0rh0.setCanTouch(z);
        }
        C0RH0 c0rh02 = this.LLJJL;
        if (c0rh02 != null) {
            c0rh02.setCanTouch(z);
        }
    }
}
