package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base;

import X.C019F;
import X.C01GW;
import X.C0QSJ;
import X.C1308910kAL;
import X.C13LE;
import X.C14J3;
import X.C1558520qew;
import X.C1637806bA;
import X.C1860130yVP;
import X.C19719912Dl;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C321590Cj7;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.vm.CommerceAgentFragmentViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommerceAgentSendBaseAssem<T extends C321590Cj7> extends CommerceAgentBaseAssem<T> implements CommerceAgentCardAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS548S0100000_4((CommerceAgentSendBaseAssem) this, 57));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS548S0100000_4((CommerceAgentSendBaseAssem) this, 56));
    public TuxTextView LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public C14J3 LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentSendBaseAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/vm/CommerceAgentFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommerceAgentSendBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommerceAgentFragmentViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 58), AFwS232S0000000_4.get$arr$(21), null, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void D71() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void EF0() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void Kk(View view, List<? extends CharSequence> list, String str, String str2) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommerceAgentSendCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentSendCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommerceAgentSendCardScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void jJ0() {
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

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final Message LI2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C321590Cj7) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LIZJ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), CommerceAgentCardAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, CommerceAgentCardAbility.class, null, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final ViewGroup Y4() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility
    public final void hw(C1860130yVP c1860130yVP) {
        ISearchMarkdownService iSearchMarkdownService;
        if (c1860130yVP != null && (iSearchMarkdownService = (ISearchMarkdownService) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownService.class, false, false, false, 14, null)) != null) {
            iSearchMarkdownService.LJFF(c1860130yVP.getContext(), c1860130yVP, 111, R.attr.ee);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.xlj);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.eth);
        this.LLJLL = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        int iIntValue = 0;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C14J3 c14j3 = (C14J3) view.findViewById(R.id.ety);
        this.LLJLLIL = c14j3;
        if (c14j3 != null) {
            c14j3.setHasRightTail(true);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, new ContextThemeWrapper(view.getContext(), R.style.y0));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        C14J3 c14j32 = this.LLJLLIL;
        if (c14j32 != null) {
            c14j32.setBackgroundDrawColor(iIntValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public void up(T t) {
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(t.getText());
        }
        C14J3 c14j3 = this.LLJLLIL;
        if (c14j3 != null) {
            c14j3.setFocusable(false);
            c14j3.setClickable(false);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c14j3);
            }
            c14j3.setOnClickListener(null);
        }
        C14J3 c14j32 = this.LLJLLIL;
        if (c14j32 != null) {
            c14j32.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0DJK
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return true;
                }
            });
        }
        C14J3 c14j33 = this.LLJLLIL;
        if (c14j33 != null) {
            c14j33.LIZ(t.LL.LJ, false, true, LJJIJL(), null, null, null, null, true);
        }
    }
}
