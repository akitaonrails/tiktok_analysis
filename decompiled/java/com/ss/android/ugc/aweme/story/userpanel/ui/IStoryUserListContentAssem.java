package com.ss.android.ugc.aweme.story.userpanel.ui;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1618440sDa;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C814420VxA;
import X.InterfaceC734870Ss9;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes32.dex */
public abstract class IStoryUserListContentAssem extends UIListContentAssem<StoryUserListViewModel> {
    public final C736950SvV LLIZLLLIL;
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final InterfaceC734870Ss9 LLJIJIL;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 10;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LJIIIZ = "story_user_list";
        return c20603715jn;
    }

    public final StoryUserListContainerViewModel Lo() {
        return (StoryUserListContainerViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public StoryUserListViewModel ip() {
        return (StoryUserListViewModel) this.LLJ.getValue();
    }

    public IStoryUserListContentAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(258);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryUserListContainerViewModel.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(202);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31((AbstractC738140SxQ) this, 1061);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new C736950SvV(c19719912DlLIZ, aFwS221S0000000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, awS575S0100000_31, c451610HnL, c723700Sa8);
        AFwS221S0000000_31 aFwS221S0000000_312 = AFwS221S0000000_31.get$arr$(259);
        this.LLJ = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS221S0000000_312, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(203), new AwS575S0100000_31((AbstractC738140SxQ) this, 1062), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1060));
        this.LLJIJIL = C1618440sDa.LIZIZ.LJIIJJI();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int iLIZIZ;
        super.onViewCreated(view);
        ip().manualListRefresh();
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.15Wd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20614415lW) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 75), 4);
        InterfaceC734870Ss9 interfaceC734870Ss9 = this.LLJIJIL;
        if (interfaceC734870Ss9 != null) {
            iLIZIZ = interfaceC734870Ss9.LJ(LJJIJL().getContext());
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(660));
        }
        LJJIJL().getLayoutParams().height = iLIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        Go().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.15PS
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                if (Math.abs(i2 - i4) > 0) {
                    KeyboardUtils.LIZIZ(this.LIZ.Go());
                }
            }
        });
    }
}
