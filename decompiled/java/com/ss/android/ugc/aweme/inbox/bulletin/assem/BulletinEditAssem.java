package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09M6;
import X.C0ALE;
import X.C0HV5;
import X.C0I7D;
import X.C0OLV;
import X.C0OPQ;
import X.C0ORS;
import X.C0OSF;
import X.C0OSP;
import X.C0OWE;
import X.C0OWJ;
import X.C0OWL;
import X.C0OWM;
import X.C0P4G;
import X.C0P4P;
import X.C0P4X;
import X.C0WZX;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1342130l1v;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C2095008Iq;
import X.C21647019ng;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C23250099c;
import X.C296830BkH;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C619990OTl;
import X.C620650OVz;
import X.C621560OZm;
import X.C623320Occ;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19746112Nn;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinDraftAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinTextStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEditAssem extends UISlotAssem implements BulletinEditInputAbility, InterfaceC623330Ocd, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.EDIT_INPUT;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C736950SvV LLJJJ;
    public C0I7D LLJJJIL;
    public TuxTextView LLJJJJ;
    public CharSequence LLJJJJJIL;
    public C0P4G LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public final List<String> LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinEditAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a8l;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -594882052) {
            return null;
        }
        return this;
    }

    public BulletinEditAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 282);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(180);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 286);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJIIJIL = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ2, 285), AFwS240S0000000_9.get$arr$(179), null, true);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 284);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(181), new AwS553S0100000_9((AbstractC738140SxQ) this, 287), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 283));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final String IF() {
        Editable editableLLLLJI;
        String string;
        C0I7D c0i7d = this.LLJJJIL;
        return (c0i7d == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1lvKYawI06Q5BzgbIIEL5v5x2gsxGrDc", null))) == null || (string = editableLLLLJI.toString()) == null) ? "" : string;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void X60() {
        C0I7D c0i7d = this.LLJJJIL;
        if (c0i7d != null) {
            c0i7d.setText("");
        }
    }

    public final void hp() throws Throwable {
        C0I7D c0i7d;
        int width;
        CharSequence charSequence = this.LLJJJJJIL;
        if (charSequence == null || (c0i7d = this.LLJJJIL) == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        C619990OTl c619990OTl = (C619990OTl) assemVMLazy.getValue().getState();
        C0P4G c0p4g = this.LLJJJJLIIL;
        if (c0p4g != null) {
            c0i7d.removeOnLayoutChangeListener(c0p4g);
        }
        this.LLJJJJLIIL = null;
        if (c619990OTl.LL == C0OSF.FULL_SCREEN) {
            c0i7d.setHint(charSequence);
            this.LLJJL = 0;
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            c0i7d.setHint("");
            this.LLJJL = 0;
            return;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1lvKYawI06Q5BzgbIIEL5v5x2gsxGrDc", null));
        if (editableLLLLJI != null && editableLLLLJI.length() > 0) {
            c0i7d.setHint("");
            this.LLJJL = 0;
            C0P4G c0p4g2 = new C0P4G(this, c0i7d, 0);
            this.LLJJJJLIIL = c0p4g2;
            c0i7d.addOnLayoutChangeListener(c0p4g2);
            return;
        }
        TextPaint paint = c0i7d.getPaint();
        if (paint == null || (width = (c0i7d.getWidth() - c0i7d.getPaddingLeft()) - c0i7d.getPaddingRight()) <= 0 || paint == null) {
            c0i7d.setHint("");
            this.LLJJL = 0;
        } else {
            c0i7d.setHint(TextUtils.ellipsize(charSequence, paint, width, TextUtils.TruncateAt.END));
            this.LLJJL = width;
        }
        C0P4G c0p4g3 = new C0P4G(this, c0i7d, 0);
        this.LLJJJJLIIL = c0p4g3;
        c0i7d.addOnLayoutChangeListener(c0p4g3);
    }

    public final int ip() {
        C0I7D c0i7d = this.LLJJJIL;
        if (c0i7d == null) {
            return Integer.MAX_VALUE;
        }
        int lineHeight = c0i7d.getLineHeight();
        return (lineHeight * 5) + c0i7d.getPaddingTop() + c0i7d.getPaddingBottom();
    }

    public final long kp() {
        String str;
        Long lLJIILIIL;
        C0OLV c0olv = (C0OLV) this.LLJJIJI.getValue();
        if (c0olv != null && (str = c0olv.LL) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            return lLJIILIIL.longValue();
        }
        C0OWL c0owlMp = mp();
        if (c0owlMp != null) {
            return c0owlMp.LL;
        }
        return 0L;
    }

    public final C0OWL mp() {
        return (C0OWL) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void o91() {
        C0I7D c0i7d;
        if (Build.VERSION.SDK_INT < 29 || (c0i7d = this.LLJJJIL) == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1r, LJJIJL().getContext());
        c0i7d.setTextCursorDrawable(c384050F3z.LIZ(LJJIJL().getContext()));
    }

    public final BulletinEditViewModel op() {
        return (BulletinEditViewModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void O72() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, LJJIJL().getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C0I7D c0i7d = this.LLJJJIL;
            if (c0i7d != null) {
                c0i7d.setHintTextColor(iIntValue);
            }
        }
        C0I7D c0i7d2 = this.LLJJJIL;
        if (c0i7d2 != null) {
            c0i7d2.setTuxFont(41);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    public final BulletinDraftAbility lp() {
        return (BulletinDraftAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinDraftAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void nL() throws Throwable {
        String hintText;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, LJJIJL().getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C0I7D c0i7d = this.LLJJJIL;
            if (c0i7d != null) {
                c0i7d.setTextColor(iIntValue);
            }
        }
        C0I7D c0i7d2 = this.LLJJJIL;
        if (c0i7d2 != null) {
            c0i7d2.setTuxFont(41);
        }
        BulletinDraftAbility bulletinDraftAbilityLp = lp();
        if (bulletinDraftAbilityLp == null || !bulletinDraftAbilityLp.xD()) {
            if (!C296830BkH.LIZ()) {
                C0OWL c0owlMp = mp();
                if (c0owlMp == null) {
                    return;
                } else {
                    hintText = c0owlMp.LLILZIL;
                }
            } else if (op().LLIZLLLIL) {
                BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbility = (BulletinFullScreenGamePlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinFullScreenGamePlayAbility.class, null);
                if (bulletinFullScreenGamePlayAbility == null) {
                    return;
                } else {
                    hintText = bulletinFullScreenGamePlayAbility.zs0();
                }
            } else {
                BulletinDraftAbility bulletinDraftAbilityLp2 = lp();
                if (bulletinDraftAbilityLp2 == null) {
                    return;
                } else {
                    hintText = bulletinDraftAbilityLp2.getHintText();
                }
            }
            if (hintText == null || hintText.length() == 0) {
                return;
            }
            this.LLJJJJJIL = hintText;
            hp();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0I7D c0i7d;
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0P4G c0p4g = this.LLJJJJLIIL;
        if (c0p4g != null && (c0i7d = this.LLJJJIL) != null) {
            c0i7d.removeOnLayoutChangeListener(c0p4g);
        }
        this.LLJJJJLIIL = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void qC1() {
        Context context = LJJIJL().getContext();
        if (context == null) {
            return;
        }
        new C21647019ng(context, LJJIJL(), new C19746312Np(EnumC19746112Nn.POP, new C621560OZm(new C1342130l1v(8.0f), new C1342130l1v(10.0f)), Collections.singletonList(new C19746412Nq("translationY", new C0HV5(-28.0f, 0.0f)))), false).LJI(true);
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void RN2(BulletinTextStruct bulletinTextStruct) {
        Integer numLIZIZ;
        String str = bulletinTextStruct.color;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = bulletinTextStruct.font;
        if (str3 != null) {
            str2 = str3;
        }
        if (!a0.LJJJIL(str)) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(LJJIJL().getContext(), str);
            if (numLJ != null) {
                int iIntValue = numLJ.intValue();
                C0I7D c0i7d = this.LLJJJIL;
                if (c0i7d != null) {
                    c0i7d.setTextColor(iIntValue);
                }
            }
        }
        if ((!a0.LJJJIL(str2)) && (numLIZIZ = C2248361CzK.LIZIZ(str2)) != null) {
            int iIntValue2 = numLIZIZ.intValue();
            C0I7D c0i7d2 = this.LLJJJIL;
            if (c0i7d2 != null) {
                c0i7d2.setTuxFont(iIntValue2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void a10(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(LJJIJL().getContext(), str);
            if (numLJ != null) {
                int iIntValue = numLJ.intValue();
                C0I7D c0i7d = this.LLJJJIL;
                if (c0i7d != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c0i7d.setTextCursorDrawable(c384050F3z.LIZ(LJJIJL().getContext()));
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        this.LLJJJIL = (C0I7D) view.findViewById(R.id.d5a);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.d5g);
        if (C296830BkH.LIZ()) {
            TuxTextView tuxTextView = this.LLJJJJ;
            if (tuxTextView != null) {
                layoutParams = tuxTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = 0;
                }
            } else {
                marginLayoutParams = null;
            }
            TuxTextView tuxTextView2 = this.LLJJJJ;
            if (tuxTextView2 != null) {
                C786410Ut5.R6(tuxTextView2, marginLayoutParams);
            }
        }
        C0I7D c0i7d = this.LLJJJIL;
        if (c0i7d != null) {
            c0i7d.setFilters(new C09M6[]{new C09M6(LSPassThroughRecordSizeConfig.DEFAULT, C724240Sb0.LJI(this))});
            c0i7d.addTextChangedListener(new C0P4X(this, 2));
            c0i7d.setOnFocusChangeListener(new C0P4P(this, 0));
            c0i7d.setEnabled(false);
        }
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OWN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C620540OVo) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 43), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OWO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C620540OVo) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 54), 6);
        C1770850wBP c1770850wBP = null;
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OWP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C620540OVo) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 44), 6);
        if (C0OSP.LIZIZ()) {
            c1770850wBP = null;
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0OSN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLJJJJJIL;
                }
            }, null, new AwS623S0100000_9(this, 45), 6);
        }
        BulletinDraftAbility bulletinDraftAbilityLp = lp();
        if (bulletinDraftAbilityLp != null && C296830BkH.LIZ()) {
            bulletinDraftAbilityLp.lp0(this.LLJJJIL);
            C0I7D c0i7d2 = this.LLJJJIL;
            if (c0i7d2 != null) {
                HandlerHook.viewPost(c0i7d2, new ARunnableS109S0100000_9(this, 87));
            }
            C0I7D c0i7d3 = this.LLJJJIL;
            if (c0i7d3 != null) {
                c0i7d3.setEnabled(!bulletinDraftAbilityLp.xD());
            }
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0OWJ(this, null), 3);
        }
        if (C296830BkH.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
            C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OWQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C619990OTl) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0OWH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C619990OTl) obj).LLILLJJLI;
                }
            }, c1770850wBP, new AwS658S0100000_9(this, 1), 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void qv1(BulletinTextStruct bulletinTextStruct) throws Throwable {
        boolean z;
        Integer numLIZIZ;
        BulletinDraftAbility bulletinDraftAbilityLp = lp();
        if (bulletinDraftAbilityLp != null && bulletinDraftAbilityLp.xD()) {
            z = true;
        } else {
            z = false;
        }
        String str = bulletinTextStruct.text;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = bulletinTextStruct.color;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = bulletinTextStruct.font;
        if (str4 != null) {
            str2 = str4;
        }
        if ((!a0.LJJJIL(str)) && !z) {
            this.LLJJJJJIL = str;
            hp();
        }
        if (!a0.LJJJIL(str3)) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(LJJIJL().getContext(), str3);
            if (numLJ != null) {
                int iIntValue = numLJ.intValue();
                C0I7D c0i7d = this.LLJJJIL;
                if (c0i7d != null) {
                    c0i7d.setHintTextColor(iIntValue);
                }
            }
        }
        if ((!a0.LJJJIL(str2)) && (numLIZIZ = C2248361CzK.LIZIZ(str2)) != null) {
            int iIntValue2 = numLIZIZ.intValue();
            C0I7D c0i7d2 = this.LLJJJIL;
            if (c0i7d2 != null) {
                c0i7d2.setTuxFont(iIntValue2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility
    public final void setHintText(String str) throws Throwable {
        BulletinDraftAbility bulletinDraftAbilityLp = lp();
        if ((bulletinDraftAbilityLp == null || !bulletinDraftAbilityLp.xD()) && str != null && str.length() > 0) {
            this.LLJJJJJIL = str;
            hp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Integer r8) {
        /*
            r7 = this;
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r7.LLJJIJIL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem.LLJLL
            r4 = 0
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            X.002o r2 = r0.getState()
            X.0OTl r2 = (X.C619990OTl) r2
            X.0OSF r1 = r2.LL
            X.0OSF r0 = X.C0OSF.NORMAL
            r5 = 1
            if (r1 != r0) goto L24
            X.0OWM r1 = r2.LLILLJJLI
            X.0OWM r0 = X.C0OWM.HIDE
            if (r1 != r0) goto L24
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJJJJ
            if (r0 == 0) goto L23
            X.C0DTR.LIZIZ(r0)
        L23:
            return
        L24:
            if (r8 == 0) goto L5e
            int r6 = r8.intValue()
        L2a:
            r0 = 950(0x3b6, float:1.331E-42)
            if (r0 > r6) goto L75
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r6 >= r0) goto L75
            com.bytedance.tux.input.TuxTextView r3 = r7.LLJJJJ
            if (r3 == 0) goto L56
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L7d
            r0 = 2131828119(0x7f111d97, float:1.928917E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r4] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r0 = X.C786410Ut5.j4(r2, r0)
            r3.setText(r0)
        L56:
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJJJJ
            if (r0 == 0) goto L5d
            X.C12ES.LJIILL(r4, r0)
        L5d:
            return
        L5e:
            X.0I7D r3 = r7.LLJJJIL
            if (r3 == 0) goto L75
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1lvKYawI06Q5BzgbIIEL5v5x2gsxGrDc"
            r0 = 0
            r2.<init>(r1, r0)
            android.text.Editable r0 = X.C2204961BRm.LLLLJI(r3, r2)
            if (r0 == 0) goto L75
            int r6 = r0.length()
            goto L2a
        L75:
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJJJJ
            if (r0 == 0) goto L5d
            X.C0DTR.LIZIZ(r0)
            return
        L7d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem.up(java.lang.Integer):void");
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return sp(c0osf, c0owm);
    }

    public final List<C0OWE> sp(C0OSF c0osf, C0OWM c0owm) {
        View viewFindViewById = LJJIJL().findViewById(R.id.trr);
        if (viewFindViewById == null) {
            return C13BV.INSTANCE;
        }
        C0I7D c0i7d = this.LLJJJIL;
        if (c0i7d == null) {
            return C13BV.INSTANCE;
        }
        if (C0ORS.LIZ[c0osf.ordinal()] == 1) {
            return C1697810uHb.LJIIJJI(new C0OWE(viewFindViewById, new C623320Occ(0.0f, -1, 0, null, null, null, null, 124)), new C0OWE(c0i7d, new C623320Occ(1.0f, 0, 0, null, null, 0, null, 92)));
        }
        return C1697810uHb.LJIIJJI(new C0OWE(viewFindViewById, new C623320Occ(0.0f, -1, 0, null, null, null, null, 124)), new C0OWE(c0i7d, new C623320Occ(0.0f, -2, 0, Integer.valueOf((c0i7d.getLineHeight() * 5) + c0i7d.getPaddingTop() + c0i7d.getPaddingBottom()), null, 0, null, 84)));
    }

    public final void tp(C0OSF c0osf, C0OWM c0owm) {
        LinearLayout.LayoutParams layoutParams;
        int iMax;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        C0I7D c0i7d = this.LLJJJIL;
        if (c0i7d != null) {
            if (c0osf == C0OSF.FULL_SCREEN) {
                c0i7d.setMinLines(0);
                c0i7d.setMaxLines(Integer.MAX_VALUE);
                c0i7d.setEllipsize(null);
                c0i7d.setScrollBarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                c0i7d.setScrollBarStyle(0);
                c0i7d.setVerticalScrollBarEnabled(true);
                c0i7d.setHorizontallyScrolling(false);
                ViewGroup.LayoutParams layoutParams4 = c0i7d.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams3.height = 0;
                    layoutParams3.weight = 1.0f;
                    C786410Ut5.P6(c0i7d, layoutParams3);
                    return;
                }
                return;
            }
            if (c0owm != C0OWM.HIDE) {
                if (!C296830BkH.LIZ() || (iMax = Math.max(((Number) C0ALE.LIZ.getValue()).intValue(), 1)) < 1) {
                    iMax = 1;
                }
                c0i7d.setMinLines(iMax);
                c0i7d.setEllipsize(null);
                c0i7d.setScrollBarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                c0i7d.setScrollBarStyle(0);
                c0i7d.setVerticalScrollBarEnabled(true);
                c0i7d.setHorizontallyScrolling(false);
                ViewGroup.LayoutParams layoutParams5 = c0i7d.getLayoutParams();
                if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams5) != null) {
                    layoutParams2.height = -2;
                    layoutParams2.weight = 0.0f;
                    C786410Ut5.P6(c0i7d, layoutParams2);
                }
                c0i7d.setMaxHeight(ip());
                return;
            }
            c0i7d.setMinLines(1);
            c0i7d.setMaxLines(5);
            c0i7d.setEllipsize(TextUtils.TruncateAt.END);
            c0i7d.setVerticalScrollBarEnabled(false);
            c0i7d.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams6 = c0i7d.getLayoutParams();
            if ((layoutParams6 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams6) != null) {
                layoutParams.height = -2;
                layoutParams.weight = 0.0f;
                C786410Ut5.P6(c0i7d, layoutParams);
            }
            c0i7d.setMaxHeight(ip());
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) throws Throwable {
        boolean z;
        int iMax;
        C0I7D c0i7d;
        if (enumC617880OLi == EnumC617880OLi.PREPARE) {
            this.LLJJLIIIJLLLLLLLZ = false;
        }
        if (c620650OVz.LIZ()) {
            int i = C0ORS.LIZIZ[enumC617880OLi.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    up(null);
                    if (c620650OVz.LIZIZ != C0OWM.EMOJI && (c0i7d = this.LLJJJIL) != null) {
                        HandlerHook.viewPostDelay(c0i7d, new ARunnableS109S0100000_9(this, 86), 100L);
                        return;
                    }
                    return;
                }
                return;
            }
            C0OPQ c0opq = C0OPQ.LIZ;
            long jKp = kp();
            Map<String, String> map = op().LLILZIL;
            c0opq.getClass();
            C0OPQ.LJJIIZI(jKp, map);
            C0I7D c0i7d2 = this.LLJJJIL;
            if (c0i7d2 != null) {
                c0i7d2.setMinLines(0);
                c0i7d2.setMaxLines(Integer.MAX_VALUE);
                c0i7d2.setEllipsize(null);
                c0i7d2.setVerticalScrollBarEnabled(true);
                c0i7d2.setHorizontallyScrolling(false);
                c0i7d2.setGravity(8388659);
                return;
            }
            return;
        }
        if (c620650OVz.LIZJ()) {
            int i2 = C0ORS.LIZIZ[enumC617880OLi.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LLJJLIIIJLLLLLLLZ = false;
                    hp();
                    up(null);
                    return;
                }
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = true;
            C0I7D c0i7d3 = this.LLJJJIL;
            if (c0i7d3 != null) {
                C0P4G c0p4g = this.LLJJJJLIIL;
                if (c0p4g != null) {
                    c0i7d3.removeOnLayoutChangeListener(c0p4g);
                }
                this.LLJJJJLIIL = null;
                c0i7d3.setHint("");
                this.LLJJL = 0;
            }
            C0I7D c0i7d4 = this.LLJJJIL;
            if (c0i7d4 != null) {
                c0i7d4.setGravity(8388627);
                if (c620650OVz.LIZJ() && c620650OVz.LIZIZ != C0OWM.HIDE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!C296830BkH.LIZ() || (iMax = Math.max(((Number) C0ALE.LIZ.getValue()).intValue(), 1)) < 1) {
                        iMax = 1;
                    }
                    c0i7d4.setMinLines(iMax);
                    c0i7d4.setMaxLines(5);
                    c0i7d4.setEllipsize(null);
                    c0i7d4.setVerticalScrollBarEnabled(true);
                    c0i7d4.setHorizontallyScrolling(false);
                    c0i7d4.setMaxHeight(ip());
                    return;
                }
                c0i7d4.setMinLines(1);
                c0i7d4.setMaxLines(5);
                c0i7d4.setEllipsize(TextUtils.TruncateAt.END);
                c0i7d4.setVerticalScrollBarEnabled(false);
                c0i7d4.setHorizontallyScrolling(false);
                c0i7d4.setMaxHeight(ip());
                return;
            }
            return;
        }
        if (c620650OVz.LJ() && c620650OVz.LIZJ == c620650OVz.LIZLLL) {
            if (enumC617880OLi == EnumC617880OLi.COMPLETE) {
                tp(c620650OVz.LIZLLL, c620650OVz.LIZIZ);
                up(null);
                return;
            }
            return;
        }
        C0OWM c0owm = c620650OVz.LIZ;
        C0OWM c0owm2 = C0OWM.HIDE;
        if (c0owm != c0owm2 && c620650OVz.LIZIZ == c0owm2) {
            C0OSF c0osf = c620650OVz.LIZJ;
            C0OSF c0osf2 = c620650OVz.LIZLLL;
            if (c0osf == c0osf2 && c0osf2 == C0OSF.NORMAL && enumC617880OLi == EnumC617880OLi.COMPLETE) {
                tp(c620650OVz.LIZLLL, c620650OVz.LIZIZ);
                up(null);
            }
        }
    }
}
