package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.AbstractC456130Hud;
import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0HK7;
import X.C0I0B;
import X.C0PEM;
import X.C0ZH1;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1630306Zx;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C1BNE;
import X.C2172661A1g;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C444920HcY;
import X.C452501pT;
import X.C455190Ht7;
import X.C455940HuK;
import X.C456040HuU;
import X.C456050HuV;
import X.C456080HuY;
import X.C456210Hul;
import X.C456260Huq;
import X.C456300Huu;
import X.C456970Hvz;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC2172611A1b;
import X.EnumC455960HuM;
import X.EnumC456270Hur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC455210Ht9;
import X.InterfaceC456070HuX;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.ViewFlipper;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class QuickEmojiPanelAssem extends IMUISlotViewAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C456260Huq.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 171));
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public ViewFlipper LLJJJ;
    public C456050HuV LLJJJIL;
    public final C2252321DDq LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public volatile Long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickEmojiPanelAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuickEmojiPanelAssem.class, "imQuickMessageInputVM", "getImQuickMessageInputVM()Lcom/ss/android/ugc/aweme/im/quickchat/ui/assem/IMQuickMessageInputVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(QuickEmojiPanelAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(QuickEmojiPanelAssem.class, "recommendCacheVM", "getRecommendCacheVM()Lcom/ss/android/ugc/aweme/im/quickchat/ui/assem/StoryReplySARecommendCacheVM;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public QuickEmojiPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 176), AFwS236S0000000_6.get$arr$(102), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IMQuickMessageInputVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 177), AFwS236S0000000_6.get$arr$(103), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 178), AFwS236S0000000_6.get$arr$(104), null, true);
        this.LLJJJJ = C1BNE.LIZ(Boolean.FALSE);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(StoryReplySARecommendCacheVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c01d1, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ4, 179), AFwS236S0000000_6.get$arr$(105), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 173));
        this.LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 175));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 174));
        this.LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(68));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(69));
        this.LLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 172));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0HuM] */
    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Integer numValueOf;
        ViewFlipper viewFlipper;
        C456970Hvz c456970Hvz;
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1, 81));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        Space space = new Space(linearLayout.getContext());
        C786410Ut5.f6(space, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(space);
        final C259800zU c259800zU = new C259800zU();
        ?? r5 = EnumC455960HuM.LEFT;
        c259800zU.element = r5;
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            C456260Huq c456260HuqLp = lp();
            T t = (((c456260HuqLp == null || (c456970Hvz = c456260HuqLp.LLILLJJLI) == null) ? null : c456970Hvz.LLJ) != EnumC2172611A1b.SOCIAL_AVATAR_STICKER && kp().LJJLIIIIJ() == 0) ? r5 : EnumC455960HuM.RIGHT;
            c259800zU.element = t;
            final C456050HuV c456050HuV = new C456050HuV(linearLayout.getContext(), null, 6);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c456050HuV);
            c456050HuV.setLayoutParams(layoutParams);
            if (!c456050HuV.isLaidOut() || c456050HuV.isLayoutRequested()) {
                c456050HuV.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0HuS
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        view.removeOnLayoutChangeListener(this);
                        C456050HuV c456050HuV2 = c456050HuV;
                        c456050HuV2.LIZ(this.hp(c456050HuV2.getContext(), (EnumC455960HuM) c259800zU.element));
                    }
                });
            } else {
                c456050HuV.LIZ(hp(c456050HuV.getContext(), (EnumC455960HuM) c259800zU.element));
            }
            this.LLJJJIL = c456050HuV;
            linearLayout.addView(c456050HuV);
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(linearLayout.getContext()), R.layout.csi, linearLayout, false);
        this.LLJJJ = viewTd instanceof ViewFlipper ? (ViewFlipper) viewTd : null;
        C455190Ht7 c455190Ht7Op = op();
        if (c455190Ht7Op != null && (numValueOf = Integer.valueOf((c455190Ht7Op.getDefaultStickerSize() * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)))) != null && (viewFlipper = this.LLJJJ) != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, numValueOf.intValue());
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFlipper);
            viewFlipper.setLayoutParams(layoutParams2);
        }
        ViewFlipper viewFlipper2 = this.LLJJJ;
        if (viewFlipper2 != null) {
            viewFlipper2.setDisplayedChild(c259800zU.element == r5 ? 0 : 2);
        }
        ViewFlipper viewFlipper3 = this.LLJJJ;
        if (viewFlipper3 != null) {
            viewFlipper3.setAnimateFirstView(false);
        }
        linearLayout.addView(this.LLJJJ);
        if (!((Boolean) this.LLL.getValue()).booleanValue()) {
            tp(EnumC456270Hur.EMOJI);
        }
        return linearLayout;
    }

    public final void ip() {
        if (this.LLJZ) {
            this.LLJZ = false;
            up(EnumC456270Hur.AVATAR);
        }
        if (this.LLJLLL) {
            this.LLJLLL = false;
            tp(EnumC456270Hur.AVATAR);
        }
    }

    public final IIMSocialAvatarService kp() {
        return (IIMSocialAvatarService) this.LLJL.getValue();
    }

    public final C456260Huq lp() {
        return (C456260Huq) this.LLJJI.getValue();
    }

    public final C455190Ht7 op() {
        return (C455190Ht7) this.LLJJL.getValue();
    }

    public final void yp() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLIL = null;
        AnonymousClass0956 anonymousClass09562 = this.LLJLILLLLZIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        C455190Ht7 c455190Ht7Op = op();
        if (c455190Ht7Op != null) {
            c455190Ht7Op.e0();
        }
    }

    public final String mp() {
        C456970Hvz c456970Hvz;
        C456260Huq c456260HuqLp = lp();
        return ((c456260HuqLp == null || (c456970Hvz = c456260HuqLp.LLILLJJLI) == null) ? null : c456970Hvz.LLJIJIL) == C0ZH1.STORY ? "story_reaction" : "half_screen_input_panel";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        yp();
    }

    public static boolean sp(StickerItem stickerItem) {
        Integer num = stickerItem.createSource;
        int source = C0HK7.MIX_STUDIO.getSource();
        if (num == null || num.intValue() != source) {
            SocialAvatarStickerItem socialAvatarStickerItem = stickerItem.socialAvatarInfo;
            if (socialAvatarStickerItem != null && socialAvatarStickerItem.elementType != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C456970Hvz c456970Hvz;
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 34), LJJIJL());
        C456210Hul c456210Hul = (C456210Hul) this.LLJJJJLIIL.getValue();
        boolean z = false;
        if (c456210Hul != null) {
            c456210Hul.setNeedPlayAnimation(false);
            c456210Hul.setEmojiViewSize(40.0f);
            c456210Hul.setIncludePadding(false);
            c456210Hul.setEmojiDataList(C1697810uHb.LJIIJJI("😍", "😂", "😳", "🤩", "❤️", "👏🏼", "🔥", "🎉"));
            c456210Hul.setOnEmojiSelected(new AbstractC456130Hud() { // from class: X.0Hub
                @Override // X.AbstractC456130Hud
                public final void LIZIZ() {
                }

                @Override // X.AbstractC456130Hud
                public final void LIZ(int i, View view2, String str) {
                    C456970Hvz c456970Hvz2;
                    C0I0H c0i0h;
                    C456970Hvz c456970Hvz3;
                    super.LIZ(i, view2, str);
                    InterfaceC457250HwR interfaceC457250HwR = (InterfaceC457250HwR) this.LIZ.LLJJIII.getValue();
                    if (interfaceC457250HwR != null) {
                        interfaceC457250HwR.LJFF(str, true);
                    }
                    C456260Huq c456260HuqLp = this.LIZ.lp();
                    if (c456260HuqLp != null && (c456970Hvz3 = c456260HuqLp.LLILLJJLI) != null) {
                        EnumC2172611A1b enumC2172611A1b = c456970Hvz3.LLJ;
                        EnumC913000Zrm enumC913000Zrm = c456970Hvz3.LLJI;
                        C0ZH1 c0zh1 = c456970Hvz3.LLJIJIL;
                        C0S2U c0s2u = c456970Hvz3.LLJILJIL;
                        EnumC913010Zrn enumC913010Zrn = c456970Hvz3.LLJILJILJ;
                        C0S2R c0s2r = c456970Hvz3.LLJILLL;
                        String str2 = c456970Hvz3.LLJJ;
                        EnumC456270Hur enumC456270Hur = EnumC456270Hur.EMOJI;
                        C456300Huu.LIZIZ(enumC2172611A1b, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, Integer.valueOf(i), enumC456270Hur, null, enumC456270Hur, str2, false, 6144);
                    }
                    C128Y c128yLJI = C724240Sb0.LJI(this.LIZ);
                    Integer num = null;
                    if ((c128yLJI instanceof C0I0H) && (c0i0h = (C0I0H) c128yLJI) != null) {
                        c0i0h.Gk(C0I0E.ACTION_SEND_QUICK_EMOJI);
                    }
                    IQuickDmService quickDmService = C1336205Ku.LIZ(false).getQuickDmService();
                    C456260Huq c456260HuqLp2 = this.LIZ.lp();
                    if (c456260HuqLp2 != null && (c456970Hvz2 = c456260HuqLp2.LLILLJJLI) != null) {
                        num = c456970Hvz2.LLJJIII;
                    }
                    quickDmService.onQuickReplyEmojiSendAnimations(view2, str, num, new AwS550S0100000_6(this.LIZ, 181));
                }
            });
        }
        C455190Ht7 c455190Ht7Op = op();
        if (c455190Ht7Op != null) {
            C456260Huq c456260HuqLp = lp();
            if (c456260HuqLp != null && (c456970Hvz = c456260HuqLp.LLILLJJLI) != null && !c456970Hvz.LLILZLL) {
                z = true;
            }
            c455190Ht7Op.setNeedPlayAnimation(!z);
            c455190Ht7Op.setOnEmojiSelected(new InterfaceC455210Ht9() { // from class: X.0Hua
                @Override // X.InterfaceC455210Ht9
                public final void LIZ() {
                    InterfaceC456150Huf interfaceC456150Huf;
                    AssemVMLazy assemVMLazy = this.LIZ.LLJJIJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = QuickEmojiPanelAssem.LLLF;
                    PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
                    panelStateViewModel.jt(C458750Hyr.LL, panelStateViewModel.Ke().getValue().intValue());
                    C128Y c128yLJI = C724240Sb0.LJI(this.LIZ);
                    if (!(c128yLJI instanceof InterfaceC456150Huf) || (interfaceC456150Huf = (InterfaceC456150Huf) c128yLJI) == null) {
                        return;
                    }
                    interfaceC456150Huf.js();
                }

                @Override // X.InterfaceC455210Ht9
                public final void LIZJ() {
                    C456050HuV c456050HuV = this.LIZ.LLJJJIL;
                    if (c456050HuV != null) {
                        C337180DJs.LIZIZ(c456050HuV);
                    }
                }

                @Override // X.InterfaceC455210Ht9
                public final void LIZIZ(int i, StickerItem stickerItem) {
                    C0I0H c0i0h;
                    C456970Hvz c456970Hvz2;
                    InterfaceC457250HwR interfaceC457250HwR = (InterfaceC457250HwR) this.LIZ.LLJJIII.getValue();
                    if (interfaceC457250HwR != null) {
                        interfaceC457250HwR.LIZLLL(stickerItem, true);
                    }
                    C456260Huq c456260HuqLp2 = this.LIZ.lp();
                    if (c456260HuqLp2 != null && (c456970Hvz2 = c456260HuqLp2.LLILLJJLI) != null) {
                        EnumC2172611A1b enumC2172611A1b = c456970Hvz2.LLJ;
                        EnumC913000Zrm enumC913000Zrm = c456970Hvz2.LLJI;
                        C0ZH1 c0zh1 = c456970Hvz2.LLJIJIL;
                        C0S2U c0s2u = c456970Hvz2.LLJILJIL;
                        EnumC913010Zrn enumC913010Zrn = c456970Hvz2.LLJILJILJ;
                        C0S2R c0s2r = c456970Hvz2.LLJILLL;
                        String str = c456970Hvz2.LLJJ;
                        EnumC456270Hur enumC456270Hur = EnumC456270Hur.AVATAR;
                        C456300Huu.LIZIZ(enumC2172611A1b, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, Integer.valueOf(i), enumC456270Hur, null, enumC456270Hur, str, false, 6144);
                    }
                    C128Y c128yLJI = C724240Sb0.LJI(this.LIZ);
                    if ((c128yLJI instanceof C0I0H) && (c0i0h = (C0I0H) c128yLJI) != null) {
                        c0i0h.Gk(C0I0E.ACTION_SEND_QUICK_EMOJI);
                    }
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1630306Zx(this, null), 3);
    }

    public final void tp(EnumC456270Hur enumC456270Hur) {
        C456970Hvz c456970Hvz;
        C456260Huq c456260HuqLp = lp();
        if (c456260HuqLp != null && (c456970Hvz = c456260HuqLp.LLILLJJLI) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172661A1g(C0I0B.LJFF.LIZIZ(), c456970Hvz.LLJ, c456970Hvz.LLJI, c456970Hvz.LLJIJIL, enumC456270Hur, 8, 0, c456970Hvz.LLJILJIL, c456970Hvz.LLJILJILJ, c456970Hvz.LLJILLL, c456970Hvz.LLJJ, this.LLJLLIL, null), 3);
        }
    }

    public final void up(EnumC456270Hur enumC456270Hur) {
        C456970Hvz c456970Hvz;
        C456260Huq c456260HuqLp = lp();
        if (c456260HuqLp != null && (c456970Hvz = c456260HuqLp.LLILLJJLI) != null) {
            C456300Huu.LIZIZ(c456970Hvz.LLJ, c456970Hvz.LLJI, c456970Hvz.LLJIJIL, c456970Hvz.LLJILJIL, c456970Hvz.LLJILJILJ, c456970Hvz.LLJILLL, null, enumC456270Hur, enumC456270Hur, null, c456970Hvz.LLJJ, this.LLJLLIL, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        }
    }

    public final void zp(int i) {
        int displayedChild;
        EnumC455960HuM currentState;
        ViewFlipper viewFlipper;
        ViewFlipper viewFlipper2 = this.LLJJJ;
        if (viewFlipper2 != null) {
            displayedChild = viewFlipper2.getDisplayedChild();
        } else {
            displayedChild = 0;
        }
        if (displayedChild != i) {
            C456050HuV c456050HuV = this.LLJJJIL;
            if (c456050HuV != null) {
                currentState = c456050HuV.getCurrentState();
            } else {
                currentState = null;
            }
            if (currentState == EnumC455960HuM.RIGHT && (viewFlipper = this.LLJJJ) != null) {
                viewFlipper.setDisplayedChild(i);
            }
        }
    }

    public final C456040HuU hp(final Context context, EnumC455960HuM enumC455960HuM) {
        int iIntValue;
        SpannableString spannableString;
        SpannableString spannableString2 = new SpannableString("😍");
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(30));
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.cbx);
        InterfaceC456070HuX interfaceC456070HuX = new InterfaceC456070HuX() { // from class: X.0HuQ
            @Override // X.InterfaceC456070HuX
            public final void LIZ(EnumC455960HuM enumC455960HuM2) {
                LIZJ(enumC455960HuM2);
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC456070HuX
            public final void LIZIZ(EnumC455960HuM enumC455960HuM2) {
                this.LIZ.kp().LJJJLZIJ();
                LIZJ(enumC455960HuM2);
                int i = C456010HuR.LIZ[enumC455960HuM2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.LIZ.LLJZ = true;
                        return;
                    }
                    throw new C1954807lC();
                }
                this.LIZ.up(EnumC456270Hur.EMOJI);
            }

            public final void LIZJ(EnumC455960HuM enumC455960HuM2) {
                C456970Hvz c456970Hvz;
                String str;
                int i = C456010HuR.LIZ[enumC455960HuM2.ordinal()];
                Long lLJIILIIL = null;
                if (i != 1) {
                    if (i == 2) {
                        QuickEmojiPanelAssem quickEmojiPanelAssem = this.LIZ;
                        AnonymousClass0956 anonymousClass0956 = quickEmojiPanelAssem.LLJLIL;
                        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                            quickEmojiPanelAssem.LLJLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(quickEmojiPanelAssem), null, null, new C455240HtC(quickEmojiPanelAssem, null), 3);
                        }
                        this.LIZ.kp().LJJIFFI(1);
                        this.LIZ.kp().LJJIIJ();
                        this.LIZ.LLJLLL = true;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    this.LIZ.yp();
                    this.LIZ.kp().LJJIFFI(0);
                    ViewFlipper viewFlipper = this.LIZ.LLJJJ;
                    if (viewFlipper != null) {
                        viewFlipper.setDisplayedChild(0);
                    }
                    this.LIZ.tp(EnumC456270Hur.EMOJI);
                }
                IIMSocialAvatarService iIMSocialAvatarServiceKp = this.LIZ.kp();
                Context context2 = context;
                C456260Huq c456260HuqLp = this.LIZ.lp();
                if (c456260HuqLp != null && (c456970Hvz = c456260HuqLp.LLILLJJLI) != null && (str = c456970Hvz.LLIZLLLIL) != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(str);
                }
                iIMSocialAvatarServiceKp.LJJIJIL(context2, lLJIILIIL, "story_reaction");
            }
        };
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.hn, context);
        int iIntValue2 = 16777215;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 16777215;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.hp, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        C456080HuY c456080HuY = new C456080HuY(iIntValue, iIntValue2);
        String string = context.getString(2131827091);
        if (kp().LJIJJLI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append("new");
            spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, new C444920HcY(62, false), 0, string.length(), 33);
            SuperscriptSpan superscriptSpan = new SuperscriptSpan() { // from class: com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$buildSaSwitchConfig$rightText$1$superscriptSpan$1
                @Override // android.text.style.SuperscriptSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    int iIntValue3;
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ny, context);
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    textPaint.setColor(iIntValue3);
                    super.updateDrawState(textPaint);
                }
            };
            C786410Ut5.p2(spannableString, new C444920HcY(93, false), spannableString.length() - 3, spannableString.length(), 33);
            C786410Ut5.p2(spannableString, superscriptSpan, spannableString.length() - 3, spannableString.length(), 33);
            C786410Ut5.p2(spannableString, new RelativeSizeSpan(0.7f), spannableString.length() - 3, spannableString.length(), 33);
        } else {
            spannableString = new SpannableString(string);
            C786410Ut5.p2(spannableString, new C444920HcY(62, false), 0, string.length(), 33);
        }
        new C455940HuK();
        return new C456040HuU(enumC455960HuM, spannableString2, spannableString, drawableLIZ, drawableLIZIZ, interfaceC456070HuX, c456080HuY);
    }
}
