package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C0SUL;
import X.C13LE;
import X.C1558520qew;
import X.C20092413jW;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295410Bhz;
import X.C343140Dcm;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C739060Syu;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.VideoAccessibilityAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoAccessibilityComponent extends BaseCellContentComponent<VideoAccessibilityComponent> implements VideoAccessibilityAbility {
    public boolean LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public C20092413jW LLJL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(171));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(105));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 362));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 361));
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 360));

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, VideoAccessibilityAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, VideoAccessibilityAbility.class, null, null);
        }
    }

    public final C20092413jW ep(int i) {
        String strHp = hp(i);
        if (strHp == null) {
            return null;
        }
        if (!((HashMap) this.LLJLIL.getValue()).containsKey(strHp)) {
            try {
                ((HashMap) this.LLJLIL.getValue()).put(strHp, new C20092413jW(16, strHp));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return (C20092413jW) ((HashMap) this.LLJLIL.getValue()).get(strHp);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.VideoAccessibilityAbility
    public final void fw2(boolean z) {
        this.LLJJL = z;
        LongPressAbility longPressAbility = (LongPressAbility) this.LLJLL.getValue();
        if (longPressAbility != null && longPressAbility.om() != null) {
            if (z) {
                this.LLJJLIIIJLLLLLLLZ = hp(2131823178);
                this.LLJL = ep(2131823179);
            } else {
                this.LLJJLIIIJLLLLLLLZ = null;
                this.LLJL = ep(2131823177);
            }
        }
    }

    public final String hp(int i) {
        if (C295410Bhz.LIZ()) {
            return C343140Dcm.LIZJ(i);
        }
        try {
            Context context = getContext();
            if (context != null) {
                return context.getString(i);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SUL c0sulOm;
        C0SUL c0sulOm2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated, longPressLayout = ");
        LongPressAbility longPressAbility = (LongPressAbility) this.LLJLL.getValue();
        if (longPressAbility != null) {
            c0sulOm = longPressAbility.om();
        } else {
            c0sulOm = null;
        }
        sbLIZ.append(c0sulOm);
        C2188811AlT.LIZIZ(sbLIZ);
        LongPressAbility longPressAbility2 = (LongPressAbility) this.LLJLL.getValue();
        if (longPressAbility2 != null && (c0sulOm2 = longPressAbility2.om()) != null) {
            q0.LJIJ(c0sulOm2, new C739060Syu(this, 0));
            fw2(false);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RBJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(71), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RBL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJILJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(72), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0RBK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(73), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
